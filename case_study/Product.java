package case_study;

//product details

public abstract class Product
{
    protected String id;
    protected String name;
    protected double price;
    protected int stock;

    public Product(String id, String name, double price, int stock)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public abstract void displayDetails();

    public boolean reduceStock()
    {
        if (stock > 0)
        {
            stock--;
            return true;
        }
        else
        {
            System.out.println("Out of stock: " + name);
            return false;
        }
    }

    public double getPrice()
    {
        return price;
    }

    public int getStock()
    {
        return stock;
    }
}
