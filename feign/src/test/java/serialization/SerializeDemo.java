package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/8/29$ 9:39$
 * @Remark:
 */
public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("F:\\employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
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
