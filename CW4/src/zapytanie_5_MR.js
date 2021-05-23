// 5.	Średnia i łączna ilość środków na kartach kredytowych kobiet narodowości polskiej w podziale na waluty. 
db = db.getSiblingDB("nbd");
printjson(db.people.mapReduce(
	function(){
             for(var i = 0; i < this.credit.length; i++){
                  emit(this.credit[i].currency, parseFloat(this.credit[i].balance));
             }	
	},
	
	function(key, value){
              return {avgBalance: Array.avg(value), sumBalance: Array.sum(value)};
	},
        
	{out:{inline:1},
         query: { nationality: "Poland", sex: "Female" }
	}
))
