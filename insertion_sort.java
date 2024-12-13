public class insertion_sort{
    public static void insertion(int numbers[]){
        for(int i=1;i<numbers.length;i++){
            int curr=numbers[i];
            int prev=i-1;
            while(prev>=0 && numbers[prev]>curr){
                numbers[prev+1]=numbers[prev];
                prev--;
            }
            numbers[prev+1]=curr;
        } 
    }
    public static void printinsertion(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int numbers[]={5,4,1,3,2};
        insertion(numbers);
        printinsertion(numbers);
    }
}