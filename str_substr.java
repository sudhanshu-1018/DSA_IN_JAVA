public class str_substr{
    // public static String substr(String str,int sp,int ep){
    //     String substri="";
    //     for(int i=sp;i<ep;i++){
    //         substri=substri + str.charAt(i);        //joining string
    //     }
    //     return substri;
    // }
    public static void main(String args[]){
        String str="Hello world";
        // System.out.print(substr(str,0,8));          //substring through function

        System.out.println(str.substring(0,5));     //formula for substring
    }
}