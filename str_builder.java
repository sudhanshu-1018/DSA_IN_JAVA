public class str_builder{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.print(sb.length());
    }
}