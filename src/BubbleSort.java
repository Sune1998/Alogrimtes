public class BubbleSort {
    void bubbleSort(int array[]){
        int a = array.length;
        for (int i = 0; i < a-1; i++){
            for (int j = 0; j < a-i-1; j++){
                if (array[j] > array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
    }

    void printArray(int array[]){
        int b = array.length;
        for(int i=0; i<b; ++i){
            System.out.println(array[i] + "");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int array[] = {64, 42, 24, 11, 34, 21, 90};
        bubbleSort.bubbleSort(array);
        System.out.println("Sorteret Array");
        bubbleSort.printArray(array);
    }
}
