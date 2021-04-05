import java.util.Arrays;
import java.util.Scanner;

/**
 * This program demonstrates the merge sort algorithm by sorting an array that
 * is filled with random numbers.
 */
public class Main {
  public static void main(String[] args) {
    Scanner userInput=new Scanner(System.in);
    System.out.println("enter array length: ");
    int arrayLength=userInput.nextInt();
    int[] a = ArrayUtil.randomIntArray(arrayLength, 100);
    System.out.println(Arrays.toString(a));

    MergeSorter sorter = new MergeSorter(a);
    sorter.sort();
    System.out.println(Arrays.toString(a));
  }
}
