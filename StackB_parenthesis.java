import java.util.*;
public class StackB_parenthesis {
    public static boolean checkstr(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='[' ||ch== '{'){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')')
                ||(s.peek()=='{' && ch=='}')
                ||(s.peek()=='[' && ch==']') ){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        String p="{[()]}";
        String e="{[()]";
        String r="{[(])}";

        System.out.println(checkstr(p));
        System.out.println(checkstr(e));
        System.out.println(checkstr(r));

        
    }
}
