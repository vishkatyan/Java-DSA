public class BasicsOfArrays {

    // Example of Passing arrays as argument --> arrays always pass as references...
    // Whatever changes has been done, reflected in the original or calling function...
    public static void update(int arr[]){
        for (int i=0; i<arr.length;i++){
            arr[i] = arr[i] +1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        update(arr);
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
