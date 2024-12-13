public class str_func_compare{
    public static void main(String args[]){
        String S1="Tony";
        String S2="Tony";
        String S3=new String("Tony");

        // S1==S2            .....check on object level "if string value is same then pointing on same variable do not create new one -(S2 point S1)"
        // (S1 or S2) != S3      .....create new value "not pointing on same variable S3 is newly created " 


        //To make it same((S1 or S2) == S3)
        if(S1.equals(S3)){                             //Use (.equals)
            System.out.println("Equal");
        }
        else{
            System.out .println("not Equal");
        }
    }
}