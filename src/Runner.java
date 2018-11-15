import java.util.Arrays;

public class Runner {
    public static void main(String[] args)
    {
        int[] Bubbles = BubbleSort.createArray(10);
        System.out.println(Arrays.toString(Bubbles));
        BubbleSort.bubbleSort(Bubbles);
        System.out.println(Arrays.toString(Bubbles));
    }
}
