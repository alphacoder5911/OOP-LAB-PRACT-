import java.util.Scanner;

class multiplication  extends Thread{
    Scanner sc=new Scanner(System.in);
    int m;
    int n;
    multiplication(int m,int n){
        this.m=m;
        this.n=n;
    }

    public void run()
    {
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        int c[][]=new int[m][n];
        System.out.println("ELEMENTS OF FIRST MATRIX");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("ENTER ELEMENTS OF SECOND MATRIX");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("PERF MUL  ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=0;
                for(int k=0;k<n;k++)
                {
                    c[i][j]= c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("MULTIPLICATION OF THE MATRIX IS");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(c[i][j]);
            }
        }
    }
}

public class threadMultiMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF M AND N ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        multiplication mul= new multiplication(m,n);
        mul.run();
    }
}
