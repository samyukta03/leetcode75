import java.util.Arrays;

public class Waveform {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        if(arr.length%2!=0){
            System.out.println("Array should be of even length");
            return;
        }
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println("Waveform of the array: " + Arrays.toString(arr));
    }
}
/*
 *  the condition in the for loop to stop the iteration at the second last element of the array. 
 * This way, the last element will not be accessed, avoiding the "ArrayIndexOutOfBounds" exception when the array has an odd number of elements.
 * check the length of the array is even or not, before proceeding with the swapping.
 *  If it's not even, you can return a message that the array should be of even length.
 */