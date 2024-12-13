public class array{
    public static void update(int marks[],int notchangable){
        notchangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int notchangable=5;
        int marks[]={97,98,99};

        update(marks,notchangable);

        System.out.println(notchangable);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}