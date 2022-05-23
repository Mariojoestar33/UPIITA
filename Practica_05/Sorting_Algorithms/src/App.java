public class App {
    public static void main(String[] args) throws Exception {
        
        int N = 100000;
        int [] vector = new int[N];
        Sorting sort = new Sorting();

        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * N);
        }

        long start = System.currentTimeMillis();
        sort.bubbleSort(vector);
        long end = System.currentTimeMillis();
        System.out.println("Bubble sort: " + (end - start) + " ms");

        sort.mezclarVector(vector);
        start = System.currentTimeMillis();
        sort.selectionSort(vector);
        end = System.currentTimeMillis();
        System.out.println("Selection sort: " + (end - start) + " ms");

        sort.mezclarVector(vector);
        start = System.currentTimeMillis();
        sort.insertionSort(vector);
        end = System.currentTimeMillis();
        System.out.println("Insertion sort: " + (end - start) + " ms");

        sort.mezclarVector(vector);
        start = System.currentTimeMillis();
        sort.mergeSort(vector, 1, N - 1);
        end = System.currentTimeMillis();
        System.out.println("Merge sort: " + (end - start) + " ms");

        sort.mezclarVector(vector);
        start = System.currentTimeMillis();
        sort.quickSort(vector, 0, N - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick sort: " + (end - start) + " ms");

        sort.mezclarVector(vector);
        start = System.currentTimeMillis();
        sort.countSort(vector, N);
        end = System.currentTimeMillis();
        System.out.println("Counting sort: " + (end - start) + " ms");

        sort.mezclarVector(vector);
        start = System.currentTimeMillis();
        sort.heapSort(vector);  
        end = System.currentTimeMillis();
        System.out.println("Heap sort: " + (end - start) + " ms");

    }
}
