import java.util.Stack;
public class StackB_Duplicate_parenthesis{
    public static boolean checkduplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
                if(ch==')'){
                    int count=0;
                    while(s.pop()!='('){
                        count++;
                    }
                    if(count<1){
                        return true;
                    }
                }
                else{
                    s.push(ch);
                }
                
        }
        return false;
       
    }
    public static void main (String args[]){
        String p="(((a+b)))";
        String c="((a+b)+(c+d))";

        System.out.println(checkduplicate(p));
        System.out.println(checkduplicate(c));
    }
}