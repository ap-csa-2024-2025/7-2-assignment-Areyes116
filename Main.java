import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Please enter words, enter STOP to stop the loop.");
        
        while (true)
        {
            String input = sc.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            words.add(input);
        }
        
        // Print ArrayList
        System.out.println(words);
        
        // Print words in the required pattern
        for (int i = words.size() - 1; i >= 0; i--)
        {
            System.out.println(words.get(i) + words.get(words.size() - 1 - i));
        }
    }
    
    // Problem 2 - HighestNum
    public static Integer highestNum(ArrayList<Integer> arr)
    {
        if (arr.isEmpty())
        {
            return null; // Return null if the list is empty
        }
        
        int max = arr.get(0);
        for (int num : arr)
        {
            if (num > max)
            {
                max = num;
            }
        }
        return max;
    }
    
    // Problem 3 - getEvens
    public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
    {
        ArrayList<Integer> evens = new ArrayList<>();
        for (Integer num : arr)
        {
            if (num % 2 == 0)
            {
                evens.add(num);
            }
        }
        return evens;
    }
}
