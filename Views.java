package Project;
import Project.*;
import com.mongodb.MongoClient;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

import java.net.UnknownHostException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.Cursor;
import com.mongodb.DB;

public class Views 
{
	public void view1_1()
	{	
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("user");
		DBCursor cursor=coll.find();
		while(cursor.hasNext())
		{
			int i=1;
			System.out.println(cursor.next());
			//System.out.println(cursor.next().get("name"));
			i++;
		}

	}
	
	public void view1_2()
	{	
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("roles");
		DBCursor cursor=coll.find();
		while(cursor.hasNext())
		{
			int i=1;
			System.out.println(cursor.next());
			//System.out.println(cursor.next().get("name"));
			i++;
		}

	}
	
	public void view2()
	{	
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("cargo");
		DBCursor cursor=coll.find();
		while(cursor.hasNext())
		{
			int i=1;
			System.out.println(cursor.next());
			//System.out.println(cursor.next().get("name"));
			i++;
		}

	}
	
	public void view3()
	{	
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("customer");
		DBCursor cursor=coll.find();
		while(cursor.hasNext())
		{
			int i=1;
			System.out.println(cursor.next());
			//System.out.println(cursor.next().get("name"));
			i++;
		}

	}
	
	public void view4()
	{	
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("shipment");
		DBCursor cursor=coll.find();
		while(cursor.hasNext())
		{
			int i=1;
			System.out.println(cursor.next());
			//System.out.println(cursor.next().get("name"));
			i++;
		}

	}
	
	public void view5()
	{	
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("billing");
		DBCursor cursor=coll.find();
		while(cursor.hasNext())
		{
			int i=1;
			System.out.println(cursor.next());
			//System.out.println(cursor.next().get("name"));
			i++;
		}

	}
	
	public void view6()
	{	
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("payment");
		DBCursor cursor=coll.find();
		while(cursor.hasNext())
		{
			int i=1;
			System.out.println(cursor.next());
			//System.out.println(cursor.next().get("name"));
			i++;
		}

	}

}
