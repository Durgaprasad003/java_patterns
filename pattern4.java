public class pattern4 {
    public static void main(String[] args) {
        // for(int i=0;i<5;i++)
        // {
        //     for(int j=i;j<5;j++)
        //     {
        //         System.out.print("*");  explored by me
        //     }
        //     System.out.println();
        // }
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++) 
            { 
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
