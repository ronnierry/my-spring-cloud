package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/8/29$ 9:45$
 * @Remark:
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("F:\\employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Object o = in.readObject();

            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }

    public static class Employee implements Serializable {
        public String name;
        public String address;
        public transient int SSN;
        public int number;
        public void mailCheck()
        {
            System.out.println("Mailing a check to " + name
                    + " " + address);
        }
    }

}
