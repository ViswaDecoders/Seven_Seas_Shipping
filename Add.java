package Project;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Add {

	public void add1_1()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("user");
		Scanner sc= new Scanner(System.in); 
		Scanner sc1= new Scanner(System.in);
		int userid;
		String username,phone,email,add;
		System.out.print("Enter a user ID: ");
		userid=sc.nextInt();
		System.out.print("Enter a username: ");
		username=sc1.nextLine();
		System.out.print("Enter a user Mobile number: ");
		phone=sc1.nextLine();
		System.out.print("Enter a user email: ");
		email=sc1.nextLine();
		System.out.print("Enter a user address: ");
		add=sc1.nextLine();
		BasicDBObject doc1=new BasicDBObject("userid",userid).
				append("username",username).
				append("mobile",phone).
				append("email",email).
				append("address",add);
		coll.insert(doc1);
		System.out.println("Document Inserted...");
	}
	
	public void add1_2()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("roles");
		Scanner sc= new Scanner(System.in);
		Scanner sc1= new Scanner(System.in);
		int roleid,userid,year,count,year_of_tenure,promotion;
		String rolename;
		System.out.print("Enter a role ID: ");
		roleid=sc.nextInt();
		System.out.print("Enter a user ID: ");
		userid=sc.nextInt();
		System.out.print("Enter a role name: ");
		rolename=sc1.nextLine();
		System.out.print("Enter the service year: ");
		year=sc.nextInt();
		System.out.print("Enter the no. of employess working under: ");
		count=sc.nextInt();
		System.out.print("Enter the year of tenure: ");
		year_of_tenure=sc.nextInt();
		System.out.print("Enter the promotion year: ");
		promotion=sc.nextInt();
		BasicDBObject doc1=new BasicDBObject("role_id",roleid).	
				append("user_id",userid).
				append("rolename",rolename).
				append("roledesc",Arrays.asList(new BasicDBObject("service_years",year).
				append("employees",count).
				append("yearof_tenure",year_of_tenure).
				append("promotion",promotion)));
		coll.insert(doc1);
		System.out.println("Document Inserted...");
	}

	public void add2()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("cargo");
		Scanner sc= new Scanner(System.in); 
		Scanner sc1= new Scanner(System.in);
		int car_cus_id,cargoid,count;
		String type,dimension,weight;
		System.out.print("Enter a cargo customer ID: ");
		car_cus_id=sc.nextInt();
		System.out.print("Enter a cargo ID: ");
		cargoid=sc.nextInt();
		System.out.print("Enter a type of cargo: ");
		type=sc1.nextLine();
		System.out.print("Enter a cargo dimention: ");
		dimension=sc1.nextLine();
		System.out.print("Enter a cargo per weight: ");
		weight=sc1.nextLine();
		System.out.print("Enter a cargo count ");
		count=sc.nextInt();
		BasicDBObject doc1=new BasicDBObject("cargo_customer_id",car_cus_id).
				append("cargo_id",cargoid).
				append("type",type).
				append("desc",Arrays.asList(new BasicDBObject("dimension",dimension).
				append("weight",weight).
				append("count",count)));
		coll.insert(doc1);
		System.out.println("Document Inserted...");
	}
	
	public void add3()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("customer");
		Scanner sc= new Scanner(System.in); 
		Scanner sc1= new Scanner(System.in);
		int cusid;
		String name,phone,email,add;
		System.out.print("Enter a customer ID: ");
		cusid=sc.nextInt();
		System.out.print("Enter a customer name: ");
		name=sc1.nextLine();
		System.out.print("Enter a custoomer Mobile number: ");
		phone=sc1.nextLine();
		System.out.print("Enter a customer email: ");
		email=sc1.nextLine();
		System.out.print("Enter a customer address: ");
		add=sc1.nextLine();
		BasicDBObject doc1=new BasicDBObject("customer_id",cusid).
				append("name",name).
				append("mobile",phone).
				append("address",add).
				append("email",email);
		coll.insert(doc1);
		System.out.println("Document Inserted...");
	}
	
	public void add4()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("shipment");
		Scanner sc= new Scanner(System.in); 
		Scanner sc1= new Scanner(System.in);
		int ship_id,cargoid;
		String mode,ori_date,ori_place,dep_time,des_date,des_place,arr_time;;
		System.out.print("Enter a shipment ID: ");
		ship_id=sc.nextInt();
		System.out.print("Enter a cargo ID: ");
		cargoid=sc.nextInt();
		System.out.print("Enter a mode: ");
		mode=sc1.nextLine();
		System.out.print("Enter a origin date: ");
		ori_date=sc1.nextLine();
		System.out.print("Enter a origin place: ");
		ori_place=sc1.nextLine();
		System.out.print("Enter a departure time ");
		dep_time=sc1.nextLine();
		System.out.print("Enter a destination date: ");
		des_date=sc1.nextLine();
		System.out.print("Enter a destination place: ");
		des_place=sc1.nextLine();
		System.out.print("Enter a arrival time ");
		arr_time=sc1.nextLine();
		BasicDBObject doc1=new BasicDBObject("shipment_id",ship_id).
				append("cargo_id",cargoid).
				append("mode",mode).
				append("origin",Arrays.asList(new BasicDBObject("date",ori_date).
				append("place",ori_place).
				append("dep_time",dep_time))).
				append("destinatin",Arrays.asList(new BasicDBObject("date",des_date).
				append("place",des_place).
				append("arr_time",arr_time)));
		coll.insert(doc1);
		System.out.println("Document Inserted...");
	}
	
	public void add5()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("billing");
		Scanner sc= new Scanner(System.in); 
		Scanner sc1= new Scanner(System.in);
		int cusid,billid,payid;
		String trans;
		System.out.print("Enter a customer ID: ");
		cusid=sc.nextInt();
		System.out.print("Enter a customer bill ID: ");
		billid=sc.nextInt();
		System.out.print("Enter a custoomer Pay ID: ");
		payid=sc.nextInt();
		System.out.print("Enter a customer Transactin no.: ");
		trans=sc1.nextLine();
		BasicDBObject doc1=new BasicDBObject("customer_id",cusid).
				append("bill_id",billid).
				append("pay_id",payid).
				append("transaction_no",trans);
		coll.insert(doc1);
		System.out.println("Document Inserted...");
	}
	
	public void add6()
	{
		Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
		mongoLogger.setLevel(Level.SEVERE); 
		MongoClient mongoClient=new MongoClient("localhost",27017);
		DB db = mongoClient.getDB("cargodb");
		DBCollection coll=db.getCollection("payment");
		Scanner sc= new Scanner(System.in);
		Scanner sc1= new Scanner(System.in);
		int cusid,payid;
		float amount;
		String type;
		System.out.print("Enter a customer ID: ");
		cusid=sc.nextInt();
		System.out.print("Enter a custoomer Pay ID: ");
		payid=sc.nextInt();
		System.out.print("Enter a customer payment type: ");
		type=sc1.nextLine();
		System.out.print("Enter a bill amount: ");
		amount=sc.nextInt();
		BasicDBObject doc1=new BasicDBObject("customer_id",cusid).
				append("pay_id",payid).
				append("type",type).
				append("bill",amount);
		coll.insert(doc1);
		System.out.println("Document Inserted...");
	}
	
	
}
