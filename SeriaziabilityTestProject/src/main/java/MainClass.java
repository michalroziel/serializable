import java.io.*;

public class MainClass {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        System.out.println(" Hello World ! ");

        Employee myEmp = new Employee();
        myEmp.age = 20;
        myEmp.empId = 101;
        myEmp.name = "Michal Roziel ";


        File myFile = new File("/Users/michalroziel/Documents/htwprog/serializable/SeriaziabilityTestProject/src/main/java/testFile.txt");


        
        //connection stream  File->FIS        FOS -> file 
        FileOutputStream fos = new FileOutputStream(myFile);
        
        
        
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        
        oos.writeObject(myEmp);
        
        oos.close();
        fos.close();
        
        // Reading out serialized Object from File  
        
        // create another file to write read-out object from first file 
        File destinationFile = new File("/Users/michalroziel/Documents/htwprog/serializable/SeriaziabilityTestProject/src/main/java/destFile.txt");
        // create new file input stream
        FileInputStream fis = new FileInputStream(myFile);
        
        // create new ObjectInputStream and give FileInputStream as a reference
        ObjectInputStream ois = new ObjectInputStream(fis);
        // create new Employee reference and assign the read-out Object to it 
        Employee empFromFile = (Employee) ois.readObject();

        // Writing the read-out Object to another File 

        // creating new FileOutputStream
        FileOutputStream fos2 = new FileOutputStream(destinationFile);
        // creating new ObjectOutputStream
        ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
        // writing the emoFromFile Object
        oos2.writeObject(empFromFile);

        // closing FileInputStream and ObjectInputStream
        fis.close();
        ois.close();





            

    }

}
