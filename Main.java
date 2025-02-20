import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Integer X = new Integer(5);
    Integer X = new Integer(10);
    int z = X.intValue() + Y.intValue();

    ArrayList<Integers> foobar = new ArrayList<Integer>();
    foobar.add(new Integer(1));
    foobar.add(new Integer(2));
    foobar.add(new Integer(3));
    foobar.add(new Integer(4));
    foobar.add(new Integer(5));
    foobar.add(new Integer(6));

    for (int i = 0; i < foobar.size(); i++)
    {
      System.out.println(foobar.get(i));
    }

    int i = 0;
    while (i < foobar.size())
    {
      System.out.println(foobar.get(i));\
      i++
    }

    for (Integer N : foobar)
    {
      System.out.println(N);
      System.out.println(N.intValue());
    }

    /**make an array for ints, fill it with some values, loop through it
     * print everyelement
     */
    int[] foo = {8,6,7,5,3,0,9};
    int[] bar = new int[5];
    bar[2] = 8; //etc

    for (int i = 0; i < foo.lenght; i++)
    {
      System.out.println(foo[i]);
    }

    


    Scanner sc = new Scanner(System.in);
    String input = "";

    while (!input.equals("STOP"))
    {
      System.out.println("infinite loop! replace with your code");
    }
  }

  // Problem 2 - HighestNum
  public static Integer highestNum(ArrayList<Integer> arr)
  {
    return null;
  }

  // Problem 3 - getEvens
  public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
  {
    return null;
  }
}
