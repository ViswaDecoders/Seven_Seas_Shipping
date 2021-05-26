package Project;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Updates {

	public void update1()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE);
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("user");
		DBCollection coll1=db.getCollection("roles");
		Scanner sc= new Scanner(System.in); 
		Scanner sc1= new Scanner(System.in); 
		System.out.print("Enter a User ID: ");  
		int userid= sc.nextInt();
		System.out.println("\nEnter the choice to update:"
				+ "\n1. Username"
				+ "\n2. mobile"
				+ "\n3. email"
				+ "\n4. Address"
				+ "\n5. RoleID"
				+ "\n6. Rolename"
				+ "\n7. Service year"
				+ "\n8. Employees working under"
				+ "\n9. Year of tenure"
				+ "\n10. Promotiion");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:	System.out.println("Enter the new username: ");
				String s=sc1.nextLine();
				BasicDBObject updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("username",s));
				BasicDBObject oldobj=new BasicDBObject().append("userid",userid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 2: System.out.println("Enter the new mobile number : ");
				s=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("mobile",s));
				oldobj=new BasicDBObject().append("userid",userid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 3: System.out.println("Enter the new email : ");
				s=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("email",s));
				oldobj=new BasicDBObject().append("userid",userid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 4: System.out.println("Enter the new address : ");
				s=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("address",s));
				oldobj=new BasicDBObject().append("userid",userid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 5: System.out.println("Enter the new roleid : ");
				int s2=sc.nextInt();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("role_id",s2));
				oldobj=new BasicDBObject().append("user_id",userid);
				coll1.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 6: System.out.println("Enter the new rolename : ");
				s=sc.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("rolename",s));
				oldobj=new BasicDBObject().append("user_id",userid);
				coll1.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 7: System.out.println("Enter the new service year: ");
				s2=sc.nextInt();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("roledesc.0.service_years",s2));
				oldobj=new BasicDBObject().append("user_id",userid);
				coll1.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 8: System.out.println("Enter the new employees working under : ");
				s2=sc.nextInt();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("roledesc.0.employees",s2));
				oldobj=new BasicDBObject().append("user_id",userid);
				coll1.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 9: System.out.println("Enter the new year of tenure: ");
				s2=sc.nextInt();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("roledesc.0.yearof_tenure",s2));
				oldobj=new BasicDBObject().append("user_id",userid);
				coll1.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 10:System.out.println("Enter the new promotion : ");
				s2=sc.nextInt();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("roledesc.0.promotion",s2));
				oldobj=new BasicDBObject().append("user_id",userid);
				coll1.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		default: System.out.println("Error !!! Choose given option...");
		}
	}
	
	public void update2()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE);
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("cargo");
		Scanner sc= new Scanner(System.in); 
		Scanner sc1= new Scanner(System.in);
		System.out.print("Enter a Cargo ID: ");  
		int cargoid= sc.nextInt();
		System.out.println("\nEnter the choice to update:"
				+ "\n1. Cargo customer ID"
				+ "\n2. type of cargo"
				+ "\n3. dimentions"
				+ "\n4. weight"
				+ "\n5. Cargo count");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:	System.out.println("Enter the new customer ID: ");
				int s=sc1.nextInt();
				BasicDBObject updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("cargo_customer_id",s));
				BasicDBObject oldobj=new BasicDBObject().append("cargo_id",cargoid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 2: System.out.println("Enter the new type of cargo : ");
				String s1=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("type",s1));
				oldobj=new BasicDBObject().append("cargo_id",cargoid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 3: System.out.println("Enter the new dimentions : ");
				s1=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("desc.0.dimentions",s1));
				oldobj=new BasicDBObject().append("cargo_id",cargoid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 4: System.out.println("Enter the new weight of each cargo: ");
				s1=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("desc.0.weight",s1));
				oldobj=new BasicDBObject().append("cargo_id",cargoid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 5: System.out.println("Enter the new count of cargo: ");
				s=sc1.nextInt();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("desc.0.count",s));
				oldobj=new BasicDBObject().append("cargo_id",cargoid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		default: System.out.println("Error !!! Choose given option...");
		}
	}
	
	public void update3()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE);
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("customer");
		Scanner sc= new Scanner(System.in);
		Scanner sc1= new Scanner(System.in); 
		System.out.print("Enter a Customer ID: ");  
		int customerid= sc.nextInt();
		System.out.println("\nEnter the choice to update:"
				+ "\n1. Customername"
				+ "\n2. mobile"
				+ "\n3. email"
				+ "\n4. Address");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:	System.out.println("Enter the new username: ");
				String s=sc1.nextLine();
				BasicDBObject updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("name",s));
				BasicDBObject oldobj=new BasicDBObject().append("customer_id",customerid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 2: System.out.println("Enter the new mobile number : ");
				s=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("mobile",s));
				oldobj=new BasicDBObject().append("customer_id",customerid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 3: System.out.println("Enter the new email : ");
				s=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("email",s));
				oldobj=new BasicDBObject().append("customer_id",customerid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 4: System.out.println("Enter the new address : ");
				s=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("address",s));
				oldobj=new BasicDBObject().append("customer_id",customerid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		default: System.out.println("Error !!! Choose given option...");
		}
	}
	
	public void update4()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE);
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("shipment");
		Scanner sc= new Scanner(System.in); 
		Scanner sc1= new Scanner(System.in); 
		System.out.print("Enter a Shipment ID: ");  
		int shipmentid= sc.nextInt();
		System.out.println("\nEnter the choice to update:"
				+ "\n1. cargo ID"
				+ "\n2. mode"
				+ "\n3. origin date"
				+ "\n4. origin place"
				+ "\n5. departure time"
				+ "\n6. destination date"
				+ "\n7. destination place"
				+ "\n8. arrival time");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:	System.out.println("Enter the new cargi Id : ");
				int s=sc.nextInt();
				BasicDBObject updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("cargo_id",s));
				BasicDBObject oldobj=new BasicDBObject().append("shipment_id",shipmentid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 2: System.out.println("Enter the new mode of transport: ");
				String s1=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("mode",s1));
				oldobj=new BasicDBObject().append("shipment_id",shipmentid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 3: System.out.println("Enter the new origin date : ");
				s1=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("origin.0.date",s1));
				oldobj=new BasicDBObject().append("shipment_id",shipmentid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 4: System.out.println("Enter the new origin place: ");
				s1=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("origin.0.place",s1));
				oldobj=new BasicDBObject().append("shipment_id",shipmentid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 5: System.out.println("Enter the new departure time : ");
				s1=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("origin.0.dep_time",s1));
				oldobj=new BasicDBObject().append("shipment_id",shipmentid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 6: System.out.println("Enter the new destination date: ");
				s1=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("destination.0.date",s1));
				oldobj=new BasicDBObject().append("shipment_id",shipmentid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 7: System.out.println("Enter the new destination place: ");
				s1=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("destination.0.place",s1));
				oldobj=new BasicDBObject().append("shipment_id",shipmentid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 8: System.out.println("Enter the new departure time : ");
				s1=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("destination.0.arr_time",s1));
				oldobj=new BasicDBObject().append("shipment_id",shipmentid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		default: System.out.println("Error !!! Choose given option...");
		}
	}
	
	public void update5()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE);
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("billing");
		Scanner sc= new Scanner(System.in);
		Scanner sc1= new Scanner(System.in); 
		System.out.print("Enter a Customer ID: ");  
		int customerid= sc.nextInt();
		System.out.println("\nEnter the choice to update:"
				+ "\n1. bill id"
				+ "\n2. pay id"
				+ "\n3. transaction number");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:	System.out.println("Enter the new Bill id: ");
				int s=sc.nextInt();
				BasicDBObject updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("bill_id",s));
				BasicDBObject oldobj=new BasicDBObject().append("customer_id",customerid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 2: System.out.println("Enter the new pay id : ");
				s=sc.nextInt();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("pay_id",s));
				oldobj=new BasicDBObject().append("customer_id",customerid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 3: System.out.println("Enter the new transaction number : ");
				String s1=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("transaction_no",s1));
				oldobj=new BasicDBObject().append("customer_id",customerid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		default: System.out.println("Error !!! Choose given option...");
		}
	}
	
	public void update6()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE);
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("payment");
		Scanner sc= new Scanner(System.in);
		Scanner sc1= new Scanner(System.in); 
		System.out.print("Enter a Customer ID: ");  
		int customerid= sc.nextInt();
		System.out.println("\nEnter the choice to update:"
				+ "\n1. pay id"
				+ "\n2. type of payment"
				+ "\n3. bill amount");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:	System.out.println("Enter the new pay id: ");
				int s=sc.nextInt();
				BasicDBObject updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("pay_id",s));
				BasicDBObject oldobj=new BasicDBObject().append("customer_id",customerid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 2: System.out.println("Enter the new type of payment : ");
				String s1=sc1.nextLine();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("type",s1));
				oldobj=new BasicDBObject().append("customer_id",customerid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		case 3: System.out.println("Enter the new bill amount: ");
				s=sc.nextInt();
				updobj= new BasicDBObject();
				updobj.append("$set", new BasicDBObject().append("bill",s));
				oldobj=new BasicDBObject().append("customer_id",customerid);
				coll.update(oldobj,updobj);
				System.out.println("Updated...");
				break;
		default: System.out.println("Error !!! Choose given option...");
		}
	}
	
}