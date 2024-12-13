public class Getter_Setter{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.SetColor("blue");
        System.out.println(p1.getColor());
        p1.SetTip(5);
        System.out.println(p1.getTip());

    }
}
class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void SetColor(String newcolor){
        this.color=newcolor;
    }
    void SetTip(int tip){
        this.tip=tip;            
    }
}
//Remember, this is essential for distinguishing between class fields and method parameters with the same name.
//It clarifies the context and ensures proper scoping within the class1