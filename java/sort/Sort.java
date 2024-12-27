package data_structures_and_algorithms.java.sort;

class SortingAlgorithms {

    public static void main(String[] args) {
        int list[] = {77, 8, 9, 3, 0, 3, 1};
        mergeSort(list, 0, list.length - 1);
        quickSort(list, 0, list.length - 1);
        bubbleSort(list);
        insertionSort(list);
        selectionSort(list);
        System.out.println(java.util.Arrays.toString(list));
    }

    private static void swap(int i, int j, int[] list){
        var temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static int[] quickSort(int[] list, int low, int high) {
        if (low < high) {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }
    }

    private static int partition(int[] list, int low, int high) {
        int pivot = list[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (list[j] <= pivot) {
                i++;
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        int temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;
        return i + 1;
    }

    public static int[] selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] <= list[minIndex]) {
                    minIndex = j;
                }
            }
            swap(minIndex, i, list);
        }
        return list;
    }

    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int current = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > current) {
                // shifting algorithm
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = current;
        }
    }

    public int[] bubbleSort(int[] list) {
        boolean isSorted;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i; j++){
                if (list[j] > list[j + 1]){
                    swap(j, j+1, list);
                    isSorted = false;
                }
                if (isSorted)
                    return list;
            }
        }
        return list;
    }

    public static int[] mergeSort(int[] list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    private static int[] merge(int[] list, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = list[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = list[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                list[k] = L[i];
                i++;
            } else {
                list[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            list[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            list[k] = R[j];
            j++;
            k++;
        }
    }
}
