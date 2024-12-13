public class Recursion_friend_pairing{
    public static int pair(int fri){
        if(fri==1||fri==2){
            return fri;
        }
        return pair(fri-1)+ fri-1*pair(fri-2);
    }
    public static void main(String args[]){
        System.out.println(pair(3));
    }
}