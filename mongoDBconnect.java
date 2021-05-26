package Project;
import com.mongodb.MongoClient;

public class mongoDBconnect {

	mongoDBconnect() 
	{
		MongoClient mongoClient=new MongoClient("localhost",27017);
	}
	
}
