public class Recursion_Remove_duplicate{
    public static String remove(String a,int i){
        if(i==a.length()-1){
            return Character.toString(a.charAt(i));
        }
        if(a.charAt(i)==a.charAt(i+1)){
          return remove(a,i+1);
        }
        return a.charAt(i) +remove(a,i+1);
    }
    public static void anothermethod(String str,int indx,StringBuilder newstr,boolean[] map){
        if(indx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currentchar=str.charAt(indx);
        if(map[currentchar-'a']==true){
            anothermethod(str,indx+1,newstr,map);
        }else{
            map[currentchar-'a']=true;
            anothermethod(str,indx+1,newstr.append(currentchar),map);
        }
    }
    public static void main(String args[]){
        String a="ssudhhaanns";
        // System.out.println(remove(a,0));
        anothermethod(a,0,new StringBuilder(""),new boolean[26]);
    }
}