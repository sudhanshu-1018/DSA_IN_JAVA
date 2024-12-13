public class inheritance{
    public static void main(String args[]){
        Fish shark=new Fish();
        shark.fins=2;
        System.out.println(shark.fins);

        shark.eat();
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
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swim in water");
    }
}