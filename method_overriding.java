public class method_overriding{
    public static void main(String args[]){
        Deer d=new Deer();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Animal eats everything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("dear eats grass");
    }
}