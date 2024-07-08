public class pattern14 {
    public static void main(String[] args) {
        int n=5;
        int init=0;
        for(int i=0;i<=n;i++)
        {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print("*");
                }
              for(int j=0;j<init;j++)
              {
                System.out.print(" ");
              }
              for(int j=1;j<=n-i;j++)
              {
                  System.out.print("*");
              }
              init+=2;
              System.out.println();


        }

        init=8;
        for(int i=0;i<=n;i++)
        {

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
          for(int j=0;j<init;j++)
          {
            System.out.print(" ");
          }
          for(int j=1;j<=i;j++)
          {
              System.out.print("*");
          }
          init-=2;
          System.out.println();


        }
    }
}
