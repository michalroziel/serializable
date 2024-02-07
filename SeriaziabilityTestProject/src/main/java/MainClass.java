import java.io.*;

public class MainClass {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println(" Hello World ! ");

        Employee myEmp = new Employee();
        myEmp.age = 20;
        myEmp.empId = 101;
        myEmp.name = "Michal";


        File myFile = new File("/Users/michalroziel/Documents/htwprog/serializable/SeriaziabilityTestProject/src/main/java/testFile.txt");

        FileOutputStream fos = new FileOutputStream(myFile);

        ObjectOutput ois = new ObjectOutputStream(fos);

        
        ois.writeObject(myEmp);


        ois.close();
        fos.close();

            // plan is to write an employee object into txt file then read it !

    }

}
