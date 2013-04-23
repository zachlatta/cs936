public class OrderedStringSetType extends OrderedStringListType
{
    @Override
    public void add(String str)
    {
        if(elements == 0)
        {
            addAtEnd(str);
        }
        else if(!contains(str))
        {
            boolean added = false;

            for(int i = 0; i < elements; i++)
            {
                if(str.compareTo(list[i]) < 0)
                {
                    add(i, str);

                    added = true;
                    break;
                }
            }

            if(!added)
            {
                addAtEnd(str);
            }
        }
    }
}
