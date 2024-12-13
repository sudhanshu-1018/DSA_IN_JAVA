public class OOPs{
    public static void main(String args[]){
        Pen p1=new Pen();               //Created a pen object called p1.
        p1.SetColor("Blue");
        System.out.println(p1.color);
        p1.SetTip(5);
        System.out.println(p1.tip);

        p1.color="Yellow";
        System.out.println(p1.color);
    }
}
    
class Pen{                                 //Default class Pen
    String color;
    int tip;

    void SetColor(String newcolor){
        color=newcolor;
    }
    void SetTip(int newtip){
        tip=newtip;
    }
}


