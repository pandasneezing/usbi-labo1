import java.util.Scanner;
public class youngphysicist
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i=0;i<n;i++)
        {
            a += teclado.nextInt();
            b += teclado.nextInt();
            c += teclado.nextInt();
        }
        if(a==0&&b==0&&c==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
