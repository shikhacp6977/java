import java.util.*;
interface Bill
{
void calculate();
}
class Product implements Bill
{
int productId;
String name;
int quantity;
float unitPrice;
float total;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.print("enter product id:");
productId=sc.nextInt();
sc.nextLine();
System.out.print("enter product name:");
name=sc.nextLine();
System.out.print("enter quantity:");
quantity=sc.nextInt();
System.out.print("enter unit price:");
unitPrice=sc.nextFloat();
}
public void calculate()
{
total=quantity*unitPrice;
}
void display()
{
System.out.println(productId + "\t\t" + name + "\t" + quantity + "\t\t" + unitPrice + "\t" + total);
}
float getTotal()
{
return total;
}
}
public class co3_7
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter order number:");
int orderNo=sc.nextInt();
System.out.print("enter number of products:");
int n=sc.nextInt();
Product[] products=new Product[n];
float netAmount=0;
System.out.println("\nENTER PRODUCT DETAILS\n");
for(int i=0;i<n;i++)
{
products[i]=new Product();
products[i].getData();
products[i].calculate();
netAmount += products[i].getTotal();
System.out.println();
}
System.out.println("\norder no:"+orderNo);
System.out.println("date:"+java.time.LocalDate.now());
System.out.println("-----------------------------------------------------------");
System.out.println("productId\tname\tquantity\tunit\tprice total");
System.out.println("-----------------------------------------------------------");
for(Product p : products)
{
p.display();
}
System.out.println("-----------------------------------------------------------");
System.out.printf("%30s %10.2f\n", "Net Amount:", netAmount);
}
}
