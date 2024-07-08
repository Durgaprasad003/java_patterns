public class pattern5imp {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");//for space formula n-i-1 
            }  
            for(int k=0;k<2*i+1;k++)
            {
                System.out.print("P"); //for star formula 2*i+1
            }
         
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");//for space formula n-i-1 
            }  
            System.out.println();

                   }
    }
}
