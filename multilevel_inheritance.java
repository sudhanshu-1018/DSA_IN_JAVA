public class multilevel_inheritance{
    public static void main(String args[]){
        Dog d=new Dog();
        d.eat();
        d.birth();
        
        d.legs=4;
        System.out.println(d.legs);
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("breath");
    }
}
class Mammal extends Animal{
    int legs;
    void birth(){
        System.out.println("birth young one");
    }
}
class Dog extends Mammal{
    String breed;
}