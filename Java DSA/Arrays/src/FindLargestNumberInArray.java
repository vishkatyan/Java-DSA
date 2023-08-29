import java.util.*;
public class FindLargestNumberInArray {
    public static int LargestValue(int arr[] , int largest){
        for (int i=0; i<arr.length;i++){
            if(arr[i]> largest)
                largest = arr[i];

        }
        return largest;
    }
    public static int SmallestValue(int arr[] , int smallest){
        for (int i=0; i<arr.length;i++){
            if(arr[i]< smallest)
                smallest = arr[i];

        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[] = {20,99,67,89,100,101,67};
        int largest = Integer.MIN_VALUE; // signifies minus infinity
        int smallest = Integer.MAX_VALUE; // signifies plus infinity
        int lValue = LargestValue(arr, largest);
        int sValue = SmallestValue(arr, smallest);
        System.out.println("Largest Value in Array is: "+lValue);
        System.out.println("Smallest Value in Array is: "+sValue);
    }
}
