import java.util.Random;

public class Array {
    private final Integer[] elements;
    private final Integer size = 100;
    private Integer found = 7;
    Random random = new Random();

    public Array() {
        elements = new Integer[size];

        for(int i = 0; i < size; i++) {
            elements[i] = random.nextInt(101);
        }
    }

    public void sequentialSearch() {
        Integer occurrences = 0;
        Integer comparison = 0;

        for (int i = 0; i < elements.length; i++) {
            comparison++;
            if (elements[i] != null && elements[i].equals(found)) {
                occurrences++;
                System.out.println("Found " + found + " at index " + i);
            }
        }
        System.out.println("Total occurrences: " + occurrences);
        System.out.println("Total comparisons: " + comparison);
    }
}