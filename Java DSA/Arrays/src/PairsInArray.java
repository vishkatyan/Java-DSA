public class PairsInArray {
    public static void pairsArray(int arr[]){
        for(int i=0 ;i<arr.length;i++){
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + curr + "," +arr[j]+ ")");

            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {2,4,6,8,10};
        pairsArray(arr);
    }
}
