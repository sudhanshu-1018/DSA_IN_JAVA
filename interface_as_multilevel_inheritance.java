public class interface_as_multilevel_inheritance{
    public static void main(String args[]){
        Bear b=new Bear();
        b.Harbi();
        b.Carni();
    }
}
interface Harbivore{
    // Harbivore(){                                  //can not create constructor in interface like abstract
    //     System.out.println("Harbivore");          
    // }
    // interface void eat();                          //can not create interface method like abstract
   void Harbi();
}
interface Carnivore{
   void Carni();
}
class Bear implements Harbivore,Carnivore{
   public void Harbi(){
    System.out.println("grass");
   }
   public void Carni(){
    System.out.println("Animal");
   }
}