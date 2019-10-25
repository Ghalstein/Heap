import java.util.*;

public class SmallestTerms {

  // finds the k smallest terms
  // easiest appraoch is to use a prority queue

  public static int[] find(int n, int[] arr) {
    if (n >= arr.length) return arr;
    int[] nTerms = new int[n];
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for (int value : arr) {
      minHeap.add(value);
    }

    for (int i = 0; i < nTerms.length; ++i) {
      nTerms[i] = minHeap.remove(); 
    }

    return nTerms;
  }

  public static void main(String[] args) {
  }
}