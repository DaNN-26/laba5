import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число x: ");
        int x = input.nextInt();
        Math_Expression exp1 = new Math_Expression(0, 0, x);
        int result = exp1.FirstExpression();
        System.out.printf("y = 3 * %d + 5 = %d", x, result);
        System.out.println();

        System.out.println("Введите число a: ");
        int a = input.nextInt();
        System.out.println("Введите число b: ");
        int b = input.nextInt();
        Math_Expression exp2 = new Math_Expression(a, b, 0);
        int y = 0;
        exp2.SecondExpression();
        System.out.println();

        System.out.println("Введите число a: ");
        a = input.nextInt();
        System.out.println("Введите число x: ");
        x = input.nextInt();
        System.out.println("Введите число b: ");
        b = input.nextInt();
        Math_Expression exp3 = new Math_Expression(a, b, x);
        exp3.ThirstExpression();
        System.out.println();
    }
}
class Math_Expression
{
    public int x;
    public int a;
    public int b;
    Math_Expression(int a, int b, int x)
    {
        this.a = a;
        this.b = b;
        this.x = x;
    }
    public int FirstExpression()
    {
        int y = 3 * x + 5;
        return y;
    }
    public void SecondExpression()
    {
        if (a - b != 0)
        {
            int y = (a + b) / (a - b);
            System.out.printf("y = (%d + %d) / (%d - %d) = %d", a, b, a, b, y);
        }
        else
        {
            System.out.println("Ошибка! Деление на ноль невозможно!");
        }
    }
    public void ThirstExpression()
    {
        if (b != 0) {
            int y = a * x / b;
            long n = 1;
            for (int i = 1; i <= y; i++)
            {
                n = n * i;
            }
            System.out.printf("y = (%d * %d / %d )! = %d", a, x, b, n);
        }
        else {
            System.out.println("Ошибка! Деление на ноль невозможно!");
        }
    }
}