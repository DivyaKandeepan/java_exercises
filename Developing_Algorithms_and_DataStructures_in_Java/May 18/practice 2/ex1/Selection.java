import java.util.Arrays;
public class Selection {
    public static void main(String[]args){
        int[] arr = {2,1,4,7,3,6};
        Sort.selection(arr);
        System.out.println(Arrays.toString(arr));
    }
public class Sort{
        public static void selection(int[] arr) {
            // The purpose of this loop is to select the minimum element and place it at the correct position.
            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;
                
                // Find the minimum element in the unsorted part of the array
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                
                // Swap the minimum element with the current element
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        
            }
    
}
