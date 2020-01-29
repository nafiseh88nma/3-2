/**
 * Created by admin on 10/11/2019.
 */
public class Stu {
    public String password;
    public String name;
    public String user;
    public Stu(String name,String password,String user){
        this.name=name;
        this.password=password;
        this.user=user;
    }
    public  void check (String str1,String str2,String str3) throws CheckExp{
        if ( str1.equals(this name)){

        }else{
            throw  new CheckExp("incorrect name");
        }
         if ( str2.equals(this user)){

        }else{
            throw  new CheckExp("incorrect user");
        }
         if ( str3.equals(this password)){

        }else{
            throw  new CheckExp("incorrect password");
        }

    }

}
