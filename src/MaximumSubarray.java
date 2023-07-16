import java.util.Scanner;

public class MaximumSubarray {
    public static int Subarray(int array[],int A,int B)
    {
        int max = 0;
        for(int i=0;i<A;i++)
        {
            int sum = 0;
            for(int j=i;j<A;j++)
            {
                sum+=array[j];
                if(sum>max && sum<=B)
                {
                    max = sum;
                }

            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int array[] = new int[A];
        for(int i=0;i<A;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Subarray(array,A,B));
    }

    }
