// 4.	Średnie, minimalne i maksymalne BMI (waga/wzrost^2) dla osób w bazie, w podziale na narodowości; 
db = db.getSiblingDB("nbd");
printjson(db.people.mapReduce(
	function(){
		var bmi = this.weight/Math.pow(this.height/100,2);
		emit(this.nationality, {minBmi: bmi, avgBmi: bmi, maxBmi: bmi, count: 1});	
	},	
        
	function(key, value){
        var x = value[0];
		for (var i=1; i < value.length; i++){
			var y = value[i];

			x.avgBmi += y.avgBmi;
			x.count += y.count;
			x.minBmi = Math.min(x.minBmi, y.minBmi);
			x.maxBmi = Math.max(x.maxBmi, y.maxBmi);
		}
		
		return x;
	},
	
    {out:{inline:1},
	finalize: function (key, value) {
		value.avgBmi = value.avgBmi / value.count;
		return value;
	}
	}
));
