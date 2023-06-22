import java.util.Arrays;
public class Bubble {
    public static void main(String[]args){
        int[] arr = {2,1,4,7,3,6};
        Sort.bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    

    public class Sort{
        public static void bubblesort(int[] arr){
            for(int i=1;i<arr.length;i++){
                boolean swapped=false;
                for(int j=0;j<arr.length-i;j++){
                    if(arr[j]>arr[j+1]){
                        swapped=true;
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
        
        
                    }
                }
                if(!swapped){
                    break;
                }
            }
        }

    }
   
    
}
