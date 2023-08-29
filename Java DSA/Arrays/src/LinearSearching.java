public class LinearSearching {
    public static int LinearSearch(int numbers[], int key){
        for (int i=0; i<numbers.length;i++){
            if(numbers[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers [] = {65,10,56,20,45,89,99,30,58};
        int key = 4;
        int index = LinearSearch(numbers, key);
        System.out.println("Index is: " + index);
    }
}
