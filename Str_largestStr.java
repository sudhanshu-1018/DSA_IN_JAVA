public class Str_largestStr{                               //'A'=='a'
    public static void get_largest(String fruits[]){
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String args[]){
        String fruits[]={"apple","Banana","mango"};
        get_largest(fruits);
    }
}