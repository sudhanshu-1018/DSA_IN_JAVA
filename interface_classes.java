public class interface_classes{
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();

        // ChessPlayer c=new ChessPlayer();          //cannot access it because it is abstract type
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Down,Right,Left,Diagonal(In al 4 direc.)");
    }
}
class Kook implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Down,Right,Left");
    }
}