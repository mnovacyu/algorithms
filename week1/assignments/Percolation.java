public class Percolation 
{
  public Percolation(int n)                  // create n-by-n grid, with all sites blocked
  {
    for (int y = 0; y < n; y++)
    {
      for (int x = 0; x < n; x++)
      {
        System.out.printf("X ");
      }
      System.out.println("");      
    }
  }
  public void open(int row, int col)         // open site (row, col) if it is not open already
  {

  }
  public boolean isOpen(int row, int col)    // is site (row, col) open?
  {
    return true;
  }
  public boolean isFull(int row, int col)    // is site (row, col) full?
  {
    return true;
  }
  public int numberOfOpenSites()             // number of open sites
  {
    return 0;
  }
  public boolean percolates()                // test client (optional)
  {
    return true;
  }


  // main method
  public static void main(String[] args)
  {
    Percolation x = new Percolation(10);
  }

}