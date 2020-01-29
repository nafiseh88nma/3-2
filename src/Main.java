import java.util.Scanner;

/**
 * Created by admin on 10/11/2019.
 */
public class Main {
    Scanner Input = new Scanner(System.in);
    String password="m12tt";
    String name ="nafise";
    String user= "971113053";
    Stu n1 = new Stu(name,password,user);
    System.out.println("enter your name");
    String str1= Input.next();
    System.out.println("enter your user");
    String str2= Input.next();
    System.out.println("enter your password");
    String str3= Input.next();
     try {
        n1.check(str1,str2,str3);
    } catch (CheckExp e) {
        e.printStackTrace();
    }

}

