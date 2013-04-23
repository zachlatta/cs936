/**
 * Tests out {@link OrderedStringListType}.
 */
public class Demo
{

    public static void main(String[] args)
    {
        String[] strings = {"pineapple", "chair", "television", "life", "coffee", "blanket", "skyscraper", "door",
                            "game", "floor", "chair2", "Mirror", "light", "dishw@sher"};

        OrderedStringListType list = new OrderedStringListType();

        for(String string : strings)
        {
            System.out.println("Begin add: " + string);
            System.out.println("-----------------");
            list.add(string);

            System.out.println("Current Elements:");
            System.out.println("-----------------");

            for(int i = 0; i < list.size(); i++)
            {
                System.out.println(list.get(i));
            }

            System.out.println();
        }

        System.out.println("Final elements:");
        System.out.println("---------------");

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }

    private static void add(String string)
    {
    }
}
