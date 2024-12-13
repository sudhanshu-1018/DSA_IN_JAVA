public class abstract_classes{
    public static void main(String args[]){
        Horse h=new Horse();
        h.eat();
        h.walk();

        // Animal a=new Animal();        //cannot access Animal class constructor and objects due to abstract class
        // a.eat();

        Mustang myHorse=new Mustang();
    }
}
abstract class Animal{                               //cannot access Animal class directly .Access only through child class
    String color;
    Animal(){
        System.out.println("animal constructor");
    }
    void eat(){
        System.out.println("animal eat");
    }
    abstract void walk();
}
class Horse extends Animal{
    void changecolor(){
        color="brown";
    }
    Horse(){
        System.out.println("Horse constructor");
    }
    void walk(){                                         //it is compulsary to create walk function() for child class(Horse) of parent Animal class 
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("chicken constructor");
    }
    void walk(){                                         //it is compulsary to create walk function() for all child class of Animal class 
        System.out.println("walk on 2 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor");
    }
}