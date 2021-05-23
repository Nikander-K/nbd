// 1.	Średnią wagę i wzrost osób w bazie z podziałem na płeć (tzn. osobno mężczyzn, osobno kobiet); 
db = db.getSiblingDB("nbd");
printjson(db.people.mapReduce(
	function(){
		emit(this.sex, {count:1, weight:Number(this.weight), height:Number(this.height)});
	},
	
	function(key, value){
			rValue = { count: 0, weight: 0, height:0 };
			for (var i = 0; i < value.length; i++) {
				rValue.count += value[i].count;
				rValue.weight += value[i].weight;
				rValue.height += value[i].height;
			}
			return rValue;
	},

	{out:{inline:1},
	finalize: function (key, value) {
		
		value.weight = value.weight/value.count;
		value.height = value.height/value.count;
		return value;
	}
	}
));
