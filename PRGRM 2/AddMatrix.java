import java.util.Scanner;
class AddMatrix{
int r,c;
int[][] arr=new int[10][10];
public void get(){
Scanner sc= new Scanner(System.in);
System.out.println("enter the number of rows");
this.r = sc.nextInt();
System.out.println("enter the number of columns");this.c = sc.nextInt();
System.out.println("enter the matrix");
for(int i=0;i<this.r;++i){
for(int j=0;j<this.c;++j){
this.arr[i][j]=sc.nextInt();
}
}
}
public static AddMatrix sum(AddMatrix c1, AddMatrix c2) {
AddMatrix temp = new AddMatrix();
if (c1.r == c2.r && c1.c == c2.c) {
temp.r =c1.r;
temp.c= c1.c;
for (int i = 0; i < c1.r; i++) {
for (int j = 0; j < c1.c; j++) {
temp.arr[i][j] = c1.arr[i][j]+c2.arr[i][j];
}
}
}
else {
System.out.println("Addition not possible ");
}
return temp;
}
public void display(){
for(int i=0;i< this.r;++i){
for(int j=0;j<this.c;++j){
System.out.print(this.arr[i][j]+" ");
}
System.out.println();
}
}
public static void main(String[] args){
AddMatrix m1=new AddMatrix();
AddMatrix m2 = new AddMatrix();
AddMatrix result = sum(m1,m2);
m1.get();
m2.get();
result=sum(m1,m2);
System.out.println("addition of matrix");
result.display();
}
}
