public class pattern1 {
    public static void show()
    {
             for(int i=0;i<5;i++)
             {
                for(int j=0;j<i+1;j++)
                {
                    System.out.print("*"); //own prepared by me
                }
                System.out.println();
             }
            // for(int i=0;i<5;i++)
            // {
            //    for(int j=0;j<=i;j++)
            //    {
            //        System.out.print("*");
            //    }
            //    System.out.println();
            // }
           
    }
    public static void main(String[] args) {
        show();
    }
}
