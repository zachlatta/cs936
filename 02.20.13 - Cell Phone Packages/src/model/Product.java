package model;

/**
 * Something sold by Cell Solutions.
 *
 * Consists of a name and a price.
 */
public class Product
{
    public final String NAME;
    public final double PRICE;

    public Product(String name, double price)
    {
        NAME = name;
        PRICE = price;
    }
}
