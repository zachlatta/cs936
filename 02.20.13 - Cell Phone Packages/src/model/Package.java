package model;

/**
 * Represents a package offered by Cell Solutions.
 *
 * A package consists of its name and the cost per month.
 */
public class Package extends Product
{
    public Package(String name, double price)
    {
        super(name, price);
    }

    @Override
    public String toString()
    {
        return NAME;
    }
}
