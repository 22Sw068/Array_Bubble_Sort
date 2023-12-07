import java.util.Scanner;

class ArraySorting1 {
    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int var = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = var;
                }
            }
        }
    }

}

    public class ArraySorting{
    public static void displayArray(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArraySorting1 obj = new ArraySorting1();

        System.out.print(" Enter Array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println(" Enter array Elements");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("---------------Bubble Sort------------");
        obj.BubbleSort(arr);
        System.out.println("Array Elements After Sorting:");
        displayArray(arr);
        System.out.println("--------------------------------------");
    }
}