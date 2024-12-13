public class buy_sell_Stock{
    public static int stock(int numbers[]){
    int buy=Integer.MAX_VALUE;
    int maxprofit=0;
    for(int i=0;i<numbers.length;i++){
        if(buy<numbers[i]){
            int profit=numbers[i]-buy;
            maxprofit=Math.max(maxprofit,profit);            //4,4,5,5,5
               }
        else{
            buy=numbers[i];                                  //7,1
        }
    }
    return maxprofit;
    }
    public static void main(String args[]){
        int numbers[]={7,1,5,3,6,4};
        System.out.print(stock(numbers));
    }
}