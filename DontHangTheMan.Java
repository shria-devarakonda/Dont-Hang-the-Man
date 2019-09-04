
package donthangtheman;

import java.util.Scanner;
public class DontHangTheMan
{
	
	public static String[] w = {"laptop", "chair", "cat", "toy", "blood", "pool", "snow", "happy" };
	public static String word = w[(int) (Math.random() * w.length)];
	public static String b = new String(new char[word.length()]).replace("\0", "_");
	public static int c = 0;

	public static void main(String args[]) 
	{
            try (Scanner sc = new Scanner(System.in)) {
                while (c < 7 && b.contains("_"))
                {
                    System.out.println("Guess any letter in the word");
                    System.out.println(b);
                    String guess = sc.next();
                    hang(guess);
                }
            }
	}
	public static void hang(String guess) 
	{
		String newb = "";
		for (int i = 0; i < word.length(); i++)
		{
			if (word.charAt(i) == guess.charAt(0)) 
			{
				newb += guess.charAt(0);
			} 
			else if (b.charAt(i) != '_') 
			{
				newb += word.charAt(i);
			} 
			else 
			{
				newb += "_";
			}
		}
		if (b.equals(newb)) 
		{
			c++;
			hangmanImage();
		}
		else 
		{
			b = newb;
		}
		if (b.equals(word)) 
		{
			System.out.println("Correct! You win! The word was " + word);
		}
	}
	public static void hangmanImage() 
	{
		if (c == 1) 
		{
			System.out.println("Incorrect, you are at error "+c);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
		}
		if (c == 2) 
		{
			System.out.println("Incorrect, you are at error "+c);
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (c == 3) 
		{
			System.out.println("Incorrect, you are at error "+c);
			System.out.println("   ____________");
			System.out.println("   |    | ");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}
		if (c == 4) 
		{
			System.out.println("Incorrect, you are at error "+c);
			System.out.println("   ____________");
			System.out.println("   |   _|_ ");
			System.out.println("   |  |. .| ");
			System.out.println("   |  | ^ | ");
			System.out.println("   |  |_ _| ");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (c == 5) 
		{
			System.out.println("Incorrect, you are at error "+c);
			System.out.println("   ____________");
			System.out.println("   |   _|_ ");
			System.out.println("   |  |; ;| ");
			System.out.println("   |  | ^ | ");
			System.out.println("   |  |_ _| ");
			System.out.println("   |   || ");
			System.out.println("   |    ");
			System.out.println("   |     ");
			System.out.println("___|___");
		}
		if (c == 6) 
		{
			System.out.println("Incorrect, you are at error "+c);
			System.out.println("   ____________");
			System.out.println("   |   _|_ ");
			System.out.println("   |  |o o| ");
			System.out.println("   |  | O | ");
			System.out.println("   |  |_ _| ");
			System.out.println("   |  _||_ ");
			System.out.println("   |  |_|  ");
			System.out.println("   |      ");
			System.out.println("___|___");
		}
		if (c == 7) 
		{
			System.out.println("Incorrect, you are at error "+c);
			System.out.println("   ____________");
			System.out.println("   |   _|_ ");
			System.out.println("   |  |x x| ");
			System.out.println("   |  | - | ");
			System.out.println("   |  |_ _| ");
			System.out.println("   |  _||_ ");
			System.out.println("   |  |_|  ");
			System.out.println("   |   \\");
			System.out.println("___|___  ");
			System.out.println("GAME OVER! The word was " + word);
		}
	}
}
