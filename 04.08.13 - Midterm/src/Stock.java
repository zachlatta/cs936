/**
 * Holds data about a stock.
 *
 * @author Zachary Latta
 */
public class Stock
{
    private String symbol;
    private double sharePrice;

    /**
     * Constructor
     *
     * @param sym The stock's trading symbol.
     * @param price The stock's share price.
     */
    public Stock(String sym, double price)
    {
        symbol = sym;
        sharePrice = price;
    }

    /**
     * getSymbol method
     *
     * @return The stock's trading symbol.
     */
    public String getSymbol()
    {
        return symbol;
    }

    /**
     * getSharePrice method
     *
     * @return The stock's share price
     */
    public double getSharePrice()
    {
        return sharePrice;
    }

    /**
     * toString method
     *
     * @return A string indicating the object's trading symbol and share price.
     */
    public String toString()
    {
        return "Trading symbol: " + symbol +
             "\nShare price: " + sharePrice;
    }
}
