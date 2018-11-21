import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Repository {
	private ArrayList<Element> elements;

	public Repository(ArrayList<Element> elements) {
		super();
		this.elements = elements;
	}
	
	public Repository(){
		this.elements = new ArrayList<Element>();
	}

	public ArrayList<Element> getElements() {
		return elements;
	}

	public void setElements(ArrayList<Element> elements) {
		this.elements = elements;
	}

	@Override
	public String toString() {
		return "Repository [elements=" + elements + "]";
	}
	
	public void serialize() {
		String filename = "database.txt";
		
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object
            out.writeObject(this.elements);
            
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
        }           
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
	}
	
	public void deserialize(){
		String filename = "database.txt";
		
		try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            this.elements = (ArrayList<Element>)in.readObject(); 
              
            in.close(); 
            file.close(); 
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
	}
}
