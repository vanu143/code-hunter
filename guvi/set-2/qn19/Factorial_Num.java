import java.io*;
import java.util.scanner;
public class Factorial_Num
{
public static void main(String[] args) 
{
int num = 10;
long factorial = 1;
for(int i = 1; i <= num; ++i)
{
factorial *= i;
}
System.out.printf("Factorial of %d = %d", num, factorial);
}
}
