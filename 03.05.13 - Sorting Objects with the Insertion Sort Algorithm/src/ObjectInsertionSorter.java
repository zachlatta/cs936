public class ObjectInsertionSorter
{
    public static <T extends Comparable<T>> void sort(T[] array)
    {
        quicksort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> void quicksort(T[] array, int start, int end)
    {
        int pivotPoint;

        if (start < end)
        {
            pivotPoint = partition(array, start, end);

            quicksort(array, start, pivotPoint - 1);
            quicksort(array, pivotPoint + 1, end); }
    }

    private static <T extends Comparable<T>> int partition(T[] array, int start, int end)
    {
        T pivotValue;
        int endOfLeftList;
        int mid;

        mid = (start + end) / 2;
        swap(array, start, mid);

        pivotValue = array[start];
        endOfLeftList = start;

        for (int scan = start + 1; scan <= end; scan++)
        {
            if (array[scan].compareTo(pivotValue) < 0)
            {
                endOfLeftList++;
                swap(array, endOfLeftList, scan);
            }
        }

        swap(array, start, endOfLeftList);

        return endOfLeftList;
    }

    private static <T extends Comparable<T>> void swap(T[] array, int a, int b)
    {
        T temp = array[a];

        array[a] = array[b];
        array[b] = temp;
    }
}
