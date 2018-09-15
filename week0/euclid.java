public class euclid
{
    public static int gcd(int q, int p)
    {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}