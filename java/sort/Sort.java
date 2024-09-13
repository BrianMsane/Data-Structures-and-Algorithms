package data_structures_and_algorithms.java.sort;

class Sort {

    public static void main(String[] args) {
        int list[] = {77, 8, 9, 3, 0, 3, 1};
        mergeSort(list, 0, list.length - 1);
        quickSort(list, 0, list.length - 1);
        bubbleSort(list);
        insertionSort(list);
        selectionSort(list);
        System.out.println(java.util.Arrays.toString(list));
    }

    public static void quickSort(int[] list, int low, int high) {
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

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = list[minIndex];
            list[minIndex] = list[i];
            list[i] = temp;
        }
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    private static void merge(int[] list, int left, int mid, int right) {
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
