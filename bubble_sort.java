public class bubble_sort{
    public static void bubble(int numbers[]){
        for(int turn=0;turn<numbers.length-1;turn++){
            for(int j=0;j<numbers.length-1-turn;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
    }
    public static void printbubble(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int numbers[]={5,4,1,3,2};
        bubble(numbers);
        printbubble(numbers);
    }
}