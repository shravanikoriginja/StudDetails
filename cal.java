public class Cal
{
int first;
int second;
int sumResult;
int subResult;
 int Calulator(int a,int b)
{
first=a;
second=b;
}
public void add()
{
 sumResult=first+second;
}
public void sub()
{
subResult=first-second;
}
public void display()
{
System.out.println(sumResult);
System.out.println(subResult(subResult));
}
}
class CalManager{
public static void main(String args[])
{
Cal c= new Cal(10,5);
c.add();
c.sub();
c.display();
}
}

