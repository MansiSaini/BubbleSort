package bubblesort;


public class BubbleSort {
    
    public static void BubbleSort (int array[])
    {
        int length = array.length;
        int k;
        for(int i=length; i >=0; i--)
        {
            for(int j=0; j< length-1; j++)
            {
                k=j+1;
                if(array[j] > array[k])
                {
                    swapNumbers(j, k, array);
                }
            }
        }
    }
    
    public static void swapNumbers (int i, int j, int[]array)
    {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
