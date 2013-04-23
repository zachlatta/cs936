public class Demo
{
    public static void main(String[] args)
    {
        String[] strings = {"pineapple", "chair", "television", "life", "coffee", "blanket", "skyscraper", "door",
                "game", "floor", "chair2", "Mirror", "light", "dishw@sher", "pineapple", "coffee1", "door"};

        OrderedStringSetType set = new OrderedStringSetType();

        for(String current : strings)
        {
            set.add(current);
        }

        for(String current : set)
        {
            System.out.println(current);
        }
    }
}
