public class subarrays{
    public static void sub(int numbers[]){
        int p=0;
        int m=0;
        for(int i=0;i<numbers.length;i++){         
            for(int j=i;j<numbers.length;j++){                  //This loop starts from the current position of the outer loop (i) and iterates to the end of the array.
                m=0;                                           //again declare m=0 because if we don,t do this value of m become change because of multiple time running of loop.
                p=0;
                for(int k=i;k<=j;k++){                          //This loop prints the subarray starting from index i to index j.
                    System.out.print(numbers[k]+" ");           //This prints each element of the current subarray
                    m=m+numbers[k];
                    p=p+m;
                }
            System.out.print("="+m+" ");
            System.out.println();
            }
            System.out.println("="+p+" ");
        System.out.println();
        }
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print(numbers[j]+" ");
        //     }
        // System.out.println();
        // }
    }
    public static void main(String args[]){
        int numbers[]={5,6,7,3,5,7,6,3,4};
        sub(numbers);
    }
}

// when i=5

// j=i=5             (--6--7--3--5--7--6--3--4) 
// i=j=k=5           (k=j)

// j=6               (j++)
// k=i=5             (i=5)                                          in k -->i is constant(until j reaches to its last value),
// k=(i-->j)         (k++) (k<j)                                                         j is moving beyond(after) i value,
// k=5,6                                                                 k run from index i to index j

// j=7
// k=i=5
// k=(i-->j)
// k=5,6,7

// j=3
// k=i=5
// k=(i-->j)
// k=5,6,7,3


// when i=6

// j=i=6
// i=j=k=6

// j=7
// k=i=6
// k=(i-->j)
// k=6,7

// j=8
// k=i=6
// k=(i-->j)
// k=6,7,8