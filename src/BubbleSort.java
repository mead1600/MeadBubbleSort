public class BubbleSort {

    public static void swap(int[] arr,int i,int j){
        int content = arr[i];
        arr[i] = arr[j];
        arr[j] = content;
    }

    public static void bubbleSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    swap(arr,i,j);
                }
            }
        }
    }

    public static int[] createArray(int length)
    {
        int[] arr = new int[length];
        for(int i = 0; i < arr.length;i++)
        {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }
}
