public class Main
{
    public static void main(String[] args)
    {
        MyList<String> strings = new MyList<String>();
            strings.add("apples");
            strings.add("bananas");
            strings.add("oranges");

        MyList<Integer> integers = new MyList<Integer>();
            integers.add(2);
            integers.add(42);
            integers.add(3);
            integers.add(1);

        System.out.println("Largest string: " + strings.largest());
        System.out.println("Smallest string: " + strings.smallest());

        System.out.println("Largest integer: " + integers.largest());
        System.out.println("Smallest integer: " + integers.smallest());
    }
}
