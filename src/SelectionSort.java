import java.util.Scanner;

public class SelectionSort{
    public static void main(String[] args){
        System.out.println("Write the count of numbers to sort");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Write the numbers: ");
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        array = sortArray(array,n);
        System.out.println("The sorted numbers: ");
        for (int i = 0; i < n; i++){
            System.out.print(array[i]);
        }
    }

    public static int[] sortArray(int[] array, int n){
        for (int i = 0; i < n; i++){
            int min = i;
            for (int j = i+1; j < n; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            int k = array[i];
            array[i] = array[min];
            array[min] = k;
        }
        return array;
    }
}