public class pattern9 {
    public static void main(String[] args) {
        int space=2*(5-1);
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            space-=2;
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
