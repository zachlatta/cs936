import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Keeps stock objects in a Map.
 *
 * @author Zachary Latta
 */
public class StockMap
{
    private SortedMap<String, Stock> map = new TreeMap<String, Stock>();

    /**
     * Adds a stock to the map.
     *
     * @param stock Stock to add.
     */
    public void add(Stock stock)
    {
        map.put(stock.getSymbol(), stock);
    }

    /**
     * Look up an stock in the map.
     *
     * @param sym Stock symbol to look up.
     * @return Matching stock's name.
     */
    public Stock lookUp(String sym)
    {
        return map.get(sym);
    }
}
