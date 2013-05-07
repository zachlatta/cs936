public class Customer extends Person
{
    private String number;
    private boolean onMailingList = false;

    public Customer(String name, String address, String telephone, String number)
    {
        super(name, address, telephone);

        this.number = number;
    }

    public Customer(String name, String address, String telephone, String number, boolean onMailingList)
    {
        super(name, address, telephone);

        this.number = number;
        this.onMailingList = onMailingList;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public boolean isOnMailingList()
    {
        return onMailingList;
    }

    public void setOnMailingList(boolean onMailingList)
    {
        this.onMailingList = onMailingList;
    }
}
