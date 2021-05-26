package Project;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Remove {

	public void remove1()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE);
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("user");
		DBCollection coll1=db.getCollection("roles");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a User ID: ");  
		int s= sc.nextInt();
		BasicDBObject del=new BasicDBObject("userid",s);
		BasicDBObject del1=new BasicDBObject("user_id",s);
		coll.remove(del);
		coll1.remove(del1);
		System.out.print("Deleted Successfully .....");
	}

	public void remove2()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE);
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("cargo");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a Cargo customer ID: ");  
		int s= sc.nextInt();
		BasicDBObject del=new BasicDBObject("cargo_customer_id",s);
		coll.remove(del);
		System.out.print("Deleted Successfully .....");
	}
	
	public void remove3()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE);
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("customer");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a Customer ID: ");  
		int s= sc.nextInt();
		BasicDBObject del=new BasicDBObject("customer_id",s);
		coll.remove(del);
		System.out.print("Deleted Successfully .....");
	}
	
	public void remove4()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE);
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("shipment");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a Shipment ID: ");  
		int s= sc.nextInt();
		BasicDBObject del=new BasicDBObject("shipment_id",s);
		coll.remove(del);
		System.out.print("Deleted Successfully .....");
	}
	
	public void remove5()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE);
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("billing");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a Customer ID: ");  
		int s= sc.nextInt();
		BasicDBObject del=new BasicDBObject("customer_id",s);
		coll.remove(del);
		System.out.print("Deleted Successfully .....");
	}
	
	public void remove6()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE);
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("payment");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a cargo customer ID: ");  
		int s= sc.nextInt();
		BasicDBObject del=new BasicDBObject("customer_id",s);
		coll.remove(del);
		System.out.print("Deleted Successfully .....");
	}
}
