public class pattern6imp {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            };//for space formula 
            for(int k=0;k<2*n-(2*i+1);k++)
            {
                System.out.print("P"); //for star formula
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");//for space formula 
            }  
            System.out.println();

                   }
    }
}
