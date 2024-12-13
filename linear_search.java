public class linear_search{
    public static int search(int numbers[],int key){
        for(int i=0;i<=numbers.length;i++){
            if(key==numbers[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={1,2,5,8,9,10,8};
        int key=8;
        System.out.print(search(numbers,key));
    }
}