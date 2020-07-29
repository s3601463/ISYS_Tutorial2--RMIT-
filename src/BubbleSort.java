public class BubbleSort {

    public int[] bubblesort(int[] sortableArrayOfIntegers){
        int s = sortableArrayOfIntegers.length;
        for(int x = 0; x < s-1; x++){
            for(int i = 0; i < s-x-1; i++){
                if (sortableArrayOfIntegers[i] > sortableArrayOfIntegers[i+1]){
                    int a = sortableArrayOfIntegers[i];
                    sortableArrayOfIntegers[i] = sortableArrayOfIntegers[i+1];
                    sortableArrayOfIntegers[i+1] = a;
                }
            }
        }

        return sortableArrayOfIntegers;
    }

}
