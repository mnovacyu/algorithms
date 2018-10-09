import org.graalvm.compiler.core.common.util.IntList;

// Social network connectivity. Given a social network containing N members and
// a log file containing M timestamps at which times pairs of members formed
// friendships, design an algorithm to determine the earliest time at which all
// members are connected (i.e., every member is a friend of a friend of a friend
// ... of a friend). Assume that the log file is sorted by timestamp and that
// friendship is an equivalence relation. The running time of your algorithm
// should be M * log(N) or better and use extra space proportional to n.

public class SocialNetworkConnect
{
  // create empty 'id' array
  private int[] id;

  // constructor for populating array with default values
  public SocialNetworkConnect(int N)
  {
    id = new int[N];
    for (int i; i < N; i++)
      id[i] = i;
  }

  // connect two nodes
  public void union(int p, int q)
  {
    int pid = id[p]
    int qid = id[q]
    
    for (int i; i )
  }
}