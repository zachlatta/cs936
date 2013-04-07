import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        StockMap stockMap = new StockMap();

        stockMap.add(new Stock("GOOG", 783.05));
        stockMap.add(new Stock("APPL", 423.20));
        stockMap.add(new Stock("YHOO", 23.30));
        stockMap.add(new Stock("FB", 27.39));

        while(true)
        {
            try
            {
                System.out.print("Enter the symbol of the stock: ");
                String sym = scanner.next();

                Stock stock = stockMap.lookUp(sym);

                if(stock == null)
                {
                    throw new Exception();
                }

                System.out.println("$" + stock.getSharePrice() + " is the stock\'s value.");
            }
            catch(Exception e)
            {
                System.out.println("Please enter a valid stock symbol!");
            }
        }
    }
}
