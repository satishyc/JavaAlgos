public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 1, 6, 7, 0, -1, 0, 2, 3, 2};
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void selectionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int loc=min(array,i);
            int temp=array[loc];
            array[loc]=array[i];
            array[i]=temp;
        }

    }
    public static int min(int[] array, int pos){
        int min=pos;
        for(int i=pos+1;i<array.length;i++ ){
            if(!(array[min]<array[i])){
                min=i;
            }
        }
        return min;
    }
}
