import java.io.*;

public class MainClass {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println(" Hello World ! ");

        Employee myEmp = new Employee();
        myEmp.age = 20;
        myEmp.empId = 101;
        myEmp.name = "Michal";

        File myFile = (src/main/java/testFile.txt);

        FileOutputStream fos = new FileOutputStream(myFile);

        ObjectOutput ois = new ObjectInputStream(fos);

            // plan is to write an employee object into txt file then read it !

    }

}
