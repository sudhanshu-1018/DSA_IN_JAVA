public class BackTracking_Subset{
    public static void FindSubstring(String str,String ans,int i){
        //base
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        //yes Choice 
        FindSubstring(str,ans+str.charAt(i),i+1);
        //no choice
        FindSubstring(str,ans,i+1);
    }
    public static void main(String args[]){
        String str="abc";
        FindSubstring(str,"",0);
    }
}