public class largest_number{
    public static int largest(int numbers[]){
        int largest=Integer.MIN_VALUE;      
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];            //update largest number by greator number   (0<5)  then greatest become number[i] which is =5
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];            //update smallest number by smaller number (100>20)  then smallest become number[i] which is =20
            }
        }
    System.out.println("smallest number is:"+smallest);
    return largest;
        // int greatest=numbers[0];
        // for(int i=1;i<numbers.length;i++){
        //     if(numbers[i]>greatest){
        //     greatest=numbers[i];
        //     }
        // }
        // System.out.print("The greatest number is:"+greatest);
    }
    public static void main(String args[]){
        int numbers[]={1,5,8,10,9,15,6};
        System.out.print(largest(numbers));
    }
}