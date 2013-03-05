public class Main
{
    public static void main(String[] args)
    {
        String[] strings = {"unusual", "alphabet", "lesson", "additional", "initials"};

        System.out.println("Starting Strings:\n" +
                           "-----------------");
        printStrings(strings);

        System.out.println("\nNow sorting strings!\n");
        ObjectInsertionSorter.sort(strings);

        System.out.println("Resulting Strings:\n" +
                           "------------------");
        printStrings(strings);
    }

    public static void printStrings(String[] strings)
    {
        for(String string : strings)
        {
            System.out.println(string);
        }
    }
}