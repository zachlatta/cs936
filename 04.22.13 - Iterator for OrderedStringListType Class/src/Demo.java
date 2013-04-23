public class Demo
{
    public static void main(String[] args)
    {
        String[] strings = {"pineapple", "chair", "television", "life", "coffee", "blanket", "skyscraper", "door",
                "game", "floor", "chair2", "Mirror", "light", "dishw@sher"};

        OrderedStringListType list = new OrderedStringListType();

        for(String current : strings)
        {
            list.add(current);
        }

        for(String current : list)
        {
            System.out.println(current);
        }
    }
}
