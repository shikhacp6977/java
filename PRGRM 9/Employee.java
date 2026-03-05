import java.util.*;
class Employee
{
int eno;
String ename;
int salary;
public void read() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the id:");
this.eno=sc.nextInt();
sc.nextLine();
System.out.println("Enter the employee name:");
this.ename=sc.nextLine();
System.out.println("Enter the salary:");
this.salary=sc.nextInt();
}
public void display() {
System.out.println("Employee id:"+this.eno);
System.out.println("Employee name:"+this.ename);
System.out.println("Employee salary:"+this.salary);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i,n;
System.out.println("Enter no of employees:");
n=sc.nextInt();
Employee emp[]=new Employee[n];
for(i=0;i<n;i++) {
emp[i]=new Employee();
emp[i].read();
}
System.out.println("Search");
while(true) {
System.out.println("Enter ID to search(or -1 to exit):");
int no=sc.nextInt();
if(no == -1) break;
boolean found=false;
for(i=0;i<n;i++)
{
if(emp[i].eno==no)
{
emp[i].display();
found=true;
break;
} }
if(!found) {
System.out.println("Employee not found");
break;
} }
} }
