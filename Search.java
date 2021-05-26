package Project;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Search {

	public void search1() 
	{	
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("user");
		DBCollection coll1=db.getCollection("roles");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a userID: ");  
		int s= sc.nextInt();              //reads int 
		BasicDBObject obj=new BasicDBObject("userid",s);
		BasicDBObject obj1=new BasicDBObject("user_id",s);
		DBCursor cursor=coll.find(obj);
		DBCursor cursor1=coll1.find(obj1);
		System.out.println("User Details:");
		while(cursor.hasNext())
		{
			System.out.println(cursor.next());
		}
		System.out.println("\nUser Roles:");
		while(cursor1.hasNext())
		{
			System.out.println(cursor1.next());
		}
	}

	public void search2() 
	{	
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("cargo");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a cargocustomer ID: ");  
		int s= sc.nextInt();              //reads int
		BasicDBObject obj=new BasicDBObject("cargo_customer_id",s);
		DBCursor cursor=coll.find(obj);
		System.out.println("Cargo Details:");
		while(cursor.hasNext())
		{
			System.out.println(cursor.next());
		}	
	}
	
	public void search3() 
	{	
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("customer");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a customer ID: ");  
		int s= sc.nextInt();              //reads int
		BasicDBObject obj=new BasicDBObject("customer_id",s);
		//obj.put("customer_id",s);
		DBCursor cursor=coll.find(obj);
		System.out.println("customer Detail:");
		while(cursor.hasNext())
		{
			System.out.println(cursor.next());
		}	
	}
	
	public void search4() 
	{	
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("shipment");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a shipment ID: ");  
		int s= sc.nextInt();              //reads int  
		BasicDBObject obj=new BasicDBObject("shipment_id",s);
		DBCursor cursor=coll.find(obj);
		System.out.println("Shipment Details:");
		while(cursor.hasNext())
		{
			System.out.println(cursor.next());
		}	
	}
	
	public void search5() 
	{	
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("billing");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a customer ID: ");  
		int s= sc.nextInt();              //reads int
		BasicDBObject obj=new BasicDBObject("customer_id",s);
		DBCursor cursor=coll.find(obj);
		System.out.println("Billing Details of the customer :");
		while(cursor.hasNext())
		{
			System.out.println(cursor.next());
		}	
	}
	
	public void search6() 
	{	
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("payment");
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a customer ID: ");  
		int s= sc.nextInt();              //reads int  
		BasicDBObject obj=new BasicDBObject("customer_id",s);
		DBCursor cursor=coll.find(obj);
		System.out.println("Payment Details of the customer :");
		while(cursor.hasNext())
		{
			System.out.println(cursor.next());
		}	
	}
}
