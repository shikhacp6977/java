class Product
{
    String name;
    double price;
  Product(String n,double p)
{
    name = n;
    price = p;
}
  public static void main(String[] args)
{
    Product p1 = new Product("book",45);
    Product p2 = new Product("pen",10);
    Product p3 = new Product("pencil",5);
    Product lowest = p1;
    if(p2.price < lowest.price)
    {
    lowest = p2;
    }
    if(p3.price < lowest.price)
    {
    lowest = p3;
    }
    System.out.println("Lowest price product is "+lowest.name+" with cost "+lowest.price);
}
}

