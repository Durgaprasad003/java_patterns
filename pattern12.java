public class pattern12 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<5;i++)
        {
            for(char ch='A';ch<='A'+(n-i-1);ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
