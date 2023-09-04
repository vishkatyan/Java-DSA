public class ReverseOfAnArray {
    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,50,69,70};
        reverseArray(arr);
    }

}
