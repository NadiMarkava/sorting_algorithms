import java.util.Arrays;
import java.util.List;

public class Algorithms {

    public void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void checkNumberIsEvenOrOdd(int arr[]) {
        int oddNum[] = new int[6];
        int evenNum[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                oddNum[i] = arr[i];
            } else if (arr[i] % 2 == 1) {
                evenNum[i] = arr[i];
            }
        }
        System.out.println("Odd numbers " + Arrays.toString(oddNum));
        System.out.println("Even numbers " + Arrays.toString(evenNum));
    }

    public void findAverage(int sortArr[]) {
        double average;
        int summ = 0;
        int length = sortArr.length;
        for (int j = 0; j < length; j++) {
            summ += sortArr[j];
        }
        average = summ / length;
        System.out.println(average);
    }

    public void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            int sorted = i - 1;
            while (sorted > -1 && arr[sorted] > arr[sorted + 1]) {
                int temp = arr[sorted];
                arr[sorted] = arr[sorted + 1];
                arr[sorted + 1] = temp;
                sorted--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int newNumber = number % 10;
            reverse = reverse * 10 + newNumber;
            number = number / 10;
        }
        System.out.println("Reverse of number is " + reverse);
    }
}



