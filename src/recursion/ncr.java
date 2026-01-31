package recursion;

public class ncr {

    public static void main(String[] args)
    {
        //0<=r<=n
        System.out.println(calculateNcr(10,8));
    }

    static int calculateNcr(int n, int r)
    {
        if ((n==r) || (r == 0)) return 1;
        return calculateNcr(n-1,r-1) + calculateNcr(n-1,r);
    }
}
