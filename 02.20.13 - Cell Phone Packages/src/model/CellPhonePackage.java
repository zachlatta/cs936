package model;

/**
 * Represents a cell phone package offered by Cell Solutions.
 *
 * A cell phone package consists of the following:
 *     * Number of minutes
 *     * Cost per month.
 */
public class CellPhonePackage extends Package
{
    public final int MINUTES_COUNT;

    public CellPhonePackage(String name, int minutesCount, double costPerMonth)
    {
        super(name, costPerMonth);

        MINUTES_COUNT = minutesCount;
    }

    @Override
    public String toString()
    {
        return NAME + " - " + MINUTES_COUNT + " minutes, $" + PRICE + " per month.";
    }
}
