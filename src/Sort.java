import java.util.ArrayList;

public class Sort {

    public static int[] bubbleSort(int[] arr) {
        boolean hasSwapped = true;
        int m = -1;

        while (hasSwapped) {
            hasSwapped = false;
            m += 1;
            for (int i = 0; i < arr.length - 1 - m; ++i) {
                if (arr[i] > arr[i+1]) {
                    hasSwapped = true;
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static String[] bubbleSort(String[] arr) {
//        for (int i = 0; i < arr.length; ++i) {
//            arr[i] = arr[i].toLowerCase();
//        }
        boolean hasSwapped = true;
        int m = -1;

        while (hasSwapped) {
            hasSwapped = false;
            m += 1;
            for (int i = 0; i < arr.length - 1 - m; ++i) {
                if (arr[i].compareTo(arr[i+1]) > 0) {
                    String tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    hasSwapped = true;
                }
            }
        }

        return arr;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        boolean hasSwapped = true;
        int m = -1;

        while (hasSwapped) {
            hasSwapped = false;
            m += 1;
            for (int i = 0; i < list.size() - 1 - m; ++i) {
                if (list.get(i) > list.get(i+1)) {
                    hasSwapped = true;
                    int tmp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, tmp);
                }
            }
        }
        return list;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int minL = i;
            for (int j = i+1; j < arr.length; ++j) {
                if (arr[minL] > arr[j]) minL = j;
            }
            int temp = arr[i];
            arr[i] = arr[minL];
            arr[minL] = temp;
        }
        return arr;
    }

    public static String[] selectionSort(String[] arr) {
//        for (int i = 0; i < arr.length; ++i) {
//            arr[i] = arr[i].toLowerCase();
//        }
        for (int i = 0; i < arr.length; ++i) {
            int minL = i;
            for (int j = i+1; j < arr.length; ++j) {
                if (arr[minL].compareTo(arr[j]) > 0) minL = j;
            }
            String temp = arr[i];
            arr[i] = arr[minL];
            arr[minL] = temp;
        }
        return arr;
    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {
//        for (int i = 0; i < list.size(); ++i) {
//            list.set(i, list.get(i).toLowerCase());
//        }
        for (int i = 0; i < list.size(); ++i) {
            int minL = i;
            for (int j = i+1; j < list.size(); ++j) {
                if (list.get(minL).compareTo(list.get(j)) > 0) minL = j;
            }
            String tmp = list.get(i);
            list.set(i, list.get(minL));
            list.set(minL, tmp);
        }
        return list;
    }

}
