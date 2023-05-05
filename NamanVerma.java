public class NamanVerma
{
public static void main(String[] args)
{
for(int i=1;i<=6;i++)
{
for (int j=1;j<=6;j++)
{
if(j==1||j==6||j==i)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}  
int row;
row=5;
char s='*';
int c, r;
int x = 1;
int y = row * 2 - 1;
for (r = 1; r <= row; r++)
{
for (c = 1; c <= row * 2; c++)
{
if (c == x || c == y)
{
System.out.print(s);
}
else
{
System.out.print(" ");
}
}
x++;
y--;
System.out.println("");
}
}
}