public class ObjectInsertionSorter
{
    public static <T extends Comparable<T>> void sort(T[] objects)
    {
        quicksort(objects, 0, objects.length);
    }

    private static <T extends Comparable<T>> void quicksort(T[] objects, int start, int end)
    {
        int pivotPoint;

        if (start < end)
        {
            pivotPoint = partition(objects, start, end);

            quicksort(objects, start, pivotPoint - 1);
            quicksort(objects, pivotPoint + 1, end);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] objects, int start, int end)
    {
        T pivotValue;
        int endOfLeftList;
        int mid;

        mid = (start + end) / 2;
        swap(objects, start, mid);

        pivotValue = objects[start];
        endOfLeftList = start;

        for (int scan = start; scan < end; scan++)
        {
            if (objects[scan].compareTo(pivotValue) < 0)
            {
                endOfLeftList++;
                swap(objects, endOfLeftList, scan);
            }
        }

        swap(objects, start, endOfLeftList);

        return endOfLeftList;
    }

    private static void swap(Comparable<?>[] objects, int a, int b)
    {
        Comparable<?> temp = objects[a];
        objects[a] = objects[b];
        objects[b] = temp;
    }
}
