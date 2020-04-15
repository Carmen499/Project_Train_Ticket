import com.mysql.cj.xdevapi.SessionFactory;
import entity.Customer;
import javassist.compiler.SymbolTable;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        LocalTime lt= LocalTime.now();
      String fName=in.next();
      String lName=in.next();
      String email=in.next();
      String phoneNumber=in.next();
      int age =in.nextInt();
       String Gender = in.next();

        Customer a = new Customer(fName,lName,email,phoneNumber,age,Gender);
        a.toString();
    }
}