import java.util.Random;

public class Array {
    private final Integer[] elements;
    private final Integer size = 100;
    private Integer found = 7;
    Random random = new Random();

    public Array() {
        elements = new Integer[size];

        for (int i = 0; i < size; i++) {
            elements[i] = random.nextInt(101);
        }
    }

    public static void merge(Integer[] elements, Integer start, Integer mid, Integer end) {
        Integer[] left = new Integer[mid - start + 1];
        Integer[] right = new Integer[end - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = elements[start + i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = elements[mid + i + 1];
        }

        int i = 0, j = 0, k = start;

        while ((i < left.length) && (j < right.length)) {
            if (left[i] < right[j]) {
                elements[k] = left[i];
                i++;
            } else {
                elements[k] = right[j];
                j++;
            }
            k++;
        }

        while (j < right.length) {
            elements[k] = right[j];
            j++;
            k++;
        }

        while(i < left.length) {
            elements[k] = left[i];
            i++;
            k++;
        }
    }

    public static void mergeSort(Integer[] elements, Integer start, Integer end) {
        if (start >= end) {
            return;
        }

        Integer mid = start + (end - start) / 2;

        mergeSort(elements, start, mid);
        mergeSort(elements, mid + 1, end);
        merge(elements, start, mid, end);
    }

    public void binarySearch() {
        mergeSort(elements, 0, elements.length - 1);

        Integer comparisons = 0;
        Integer low = 0;
        Integer high = elements.length - 1;
        Integer foundIndex = -1;

        while (low <= high) {
            comparisons++;

            Integer mid = (low + high) / 2;

            if (elements[mid].equals(found)) {
                foundIndex = mid;
                break;
            } else if (elements[mid] < found) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (foundIndex.equals(-1)) {
            System.out.println("Value " + found + " not found.");
            System.out.println("Total comparisons: " + comparisons);
            return;
        }

        Integer occurrences = 1;
        System.out.println("Found " + found + " at index " + foundIndex);

        Integer left = foundIndex - 1;

        while (left < elements.length && elements[left].equals(found)) {
            System.out.println("Found " + found + " at index " + left);
            occurrences++;
            left--;
            comparisons++;
        }

        Integer right = foundIndex + 1;

        while (right < elements.length && elements[right].equals(found)) {
            System.out.println("Found " + found + " at index " + right);
            occurrences++;
            right++;
            comparisons++;
        }
        System.out.println("Total occurrences: " + occurrences);
        System.out.println("Total comparisons: " + comparisons);
    }
}