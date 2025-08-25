public class PlaceTiles {

    public static int place(int n,int m)
    {
    if(n == m)
    {
        return 2;
    }
    if(n < m)
    {
        return 1; 
    }

    //vertically
    int vertically=place(n-m, m);

    //horizantally
    int horizantally=place(n-1, m);

    return vertically+horizantally;
    }

public static void main(String args[])
{
 int n=4,m=2;
 System.out.println(place(n, m));
 
}
    
}

/*
 * place Tiles of size 1xm in a floor of size n*m
 * n=4,m=2
 * Ans=>5
 */
