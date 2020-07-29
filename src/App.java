public class App {
    private BubbleSort sort;

    public App(){
        BubbleSort sort = new BubbleSort();
        int[] array = {12,612,7444,03,-5558};
        int[] sortedArray = sort.bubblesort(array);
        for(int i = 0; i < 5; i++)
            System.out.print(sortedArray[i] + ", ");
    }

    public static void main(String[] args){
        App myApp = new App();
    }
}
