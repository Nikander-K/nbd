// 3.	Listę unikalnych zawodów; 
db = db.getSiblingDB("nbd");
printjson(db.people.mapReduce(
	function(){
                emit(this.job, null);	
	},	
	function(key, value){
                    return key;
	},
	{
            out:{inline:1}
	}
));
