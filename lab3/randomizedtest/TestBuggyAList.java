package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE

  @Test
  public void testThreeAddThreeRemove(){
    AListNoResizing<Integer> a = new AListNoResizing<Integer>();
    BuggyAList<Integer> b = new BuggyAList<Integer>();
  
    for (int i = 0; i <= 2; i++ )
    {
      a.addLast(i);
      b.addLast(i);
    }

    for (int i = 0; i<= 2; i++)
    {
      assertEquals(a.removeLast(), b.removeLast());
    }

  }

  @Test
  public void randomizedTest()
  {
    AListNoResizing<Integer> a = new AListNoResizing<Integer>();
    BuggyAList<Integer> b = new BuggyAList<Integer>();
  
    int N = 5000;
    for (int i = 0; i<= N; i++)
    {
      int operationNumber = StdRandom.union(0,4);
      if (operationNumber == 0)
      {
          int randVal = StdRandom.uniform(0, 100);
          a.addLast(randVal);
          b.addLast(randVal);
      }
      else if (operationNumber == 1)
      {
        int size_a = a.size();
        int size_b = b.size();
        assertEquals(size_a, size_b);
      }
      else if (a.size() > 0)
      {
        if(operationNumber == 2)
        {
          int a_last = a.getLast();
          int b_last = b.getLast();
          assertEquals(size_last, size_last);    
        } 
        else if (operationNumber == 3)
        {
          int a_removelast = a.removeLast();
          int b_removelast = b.removeLast();
          assertEquals(a_removelast, b_removelast);      
        }
      }
    
    }
  }
}
