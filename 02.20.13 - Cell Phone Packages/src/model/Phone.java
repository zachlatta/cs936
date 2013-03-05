package model;

/**
 * Represents a phone sold by Cell Solutions.
 *
 * A phone consists of a name and a price.
 */
public class Phone extends Product
{
    public Phone(String name, double price)
    {
        super(name, price);
    }

    @Override
    public String toString()
    {
        return NAME;
    }
}
