import java.util.Arrays;
public class Bubble {
    public static void main(String[]args){
        int[] arr = {2,1,4,7,3,6};
        Sort.bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public class Sort{
        public static void bubblesort(int[] arr){
         // The purpose of this loop is to control the number of iterations.
         // In each iteration, the largest element is bubbled to the end of the array.
            for(int i=1;i<arr.length;i++){
                boolean swapped=false;
                // Iterate through the array up to arr.length - i
                // (since the largest element will be bubbled to the end in each iteration)
                for (int j = 0; j < arr.length - i; j++) {
                    // Compare adjacent elements and swap them if they are in the wrong order
                    if (arr[j] > arr[j + 1]) {
                        swapped = true;
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                
                // If no elements were swapped in this iteration, the array is already sorted
                // and we can break out of the outer loop
                if(!swapped){
                    break;
                }
            }
        }

    }
   
    
}
