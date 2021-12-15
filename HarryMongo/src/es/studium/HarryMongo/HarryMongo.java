package es.studium.HarryMongo;

import org.bson.Document;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;


public class HarryMongo {
	public static void main(String[] args) {
		
		
	
		//humanos();
		//A1979();
		//holly();
		vivos();
	}
	
	
	public static void humanos(){
	MongoClient conexion=MongoClients.create("mongodb://localhost:27017");
	MongoDatabase database=conexion.getDatabase("harry");
	MongoCollection<Document>personajes=database.getCollection("characters");
	FindIterable<Document> humanos = personajes.find(eq("species", "human"));
	for(Document persona:humanos)
	{System.out.println((persona).toJson());
	}
	}
	
	public static void A1979() {MongoClient conexion=MongoClients.create("mongodb://localhost:27017");
	MongoDatabase database=conexion.getDatabase("harry");
	MongoCollection<Document>personajes=database.getCollection("characters");
	FindIterable<Document> nacimiento = personajes.find(lte("yearOfBirth", 1979));
	for(Document persona:nacimiento)
	{System.out.println((persona).toJson());
	}}
	public static void holly(){MongoClient conexion=MongoClients.create("mongodb://localhost:27017");
	MongoDatabase database=conexion.getDatabase("harry");
	MongoCollection<Document>personajes=database.getCollection("characters");
	FindIterable<Document> holly = personajes.find(eq("wand.wood", "holly"));
	for(Document persona:holly)
	{System.out.println((persona).toJson());
	}}
	public static void vivos() {MongoClient conexion=MongoClients.create("mongodb://localhost:27017");
	MongoDatabase database=conexion.getDatabase("harry");
	MongoCollection<Document>personajes=database.getCollection("characters");
	FindIterable<Document> estudianteVivo = personajes.find(and(eq("alive", true),eq("hogwartsStudent",true)));
	for(Document persona:estudianteVivo)
	{System.out.println((persona).toJson());
	}}
	

}
