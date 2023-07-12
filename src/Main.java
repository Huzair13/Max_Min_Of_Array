import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the Array !!");
        int size=scanner.nextInt();

        System.out.println("Enter the Array Elements");
        int array[]=new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }

        //Calling FindMaxAndMinSum to find the sum of max and min of the given array
        int sum=FindMaxAndMinSum(array,size);
        System.out.println("Sum of the maximum and minimu in the given Array is : "+sum);

    }

    private static int FindMaxAndMinSum(int[] array, int size) {
        int sum=0;
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;

        for(int iterator=0;iterator<size;iterator++){
            if(max<array[iterator]){
                max=array[iterator];
            }
            if (min>array[iterator]){
                min=array[iterator];
            }
        }
        sum=min+max;
        return sum;
    }
}