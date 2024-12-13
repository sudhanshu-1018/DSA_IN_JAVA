public class Recursion_power{
    public static int power(int base,int pow){
        if(pow==0){
            return 1;
        }
        return base * power(base,pow-1);
    }
    public static int shortpower(int base,int pow){
        if(pow==0){
            return 1;
        }
        int half=shortpower(base,pow/2);
        int halfpow=half*half;
        if(pow%2!=0){
            halfpow=base*halfpow;
        }
        return halfpow;
    }
    public static void main(String args[]){
        // System.out.println(power(2,10));
        System.out.println(shortpower(2,10));
    }
}