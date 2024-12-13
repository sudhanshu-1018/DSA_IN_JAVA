public class Access_modifiers{
    public static void main(String args[]){
        BankAccount myAcc=new BankAccount();
        myAcc.Username="Sudhanshu 123";                
        myAcc.Setpassword("abcde123");
        System.out.println(myAcc.Username);
        // System.out.println(myAcc.password);          //it is private so you can't print it;
    }
}
class BankAccount{
    public String Username;
    private String password;
    public void Setpassword(String pwd){                //change password but not access it;
        password=pwd;
    }
}