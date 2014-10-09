import java.util.List;


public class Analyzer
	{
	static int totalQ = 0; 
	static int totalG = 0; 
	static double percentOfG;
	static int numberOfSixes, numberOfSevens, numberOfOnes, numberOfLinesWithMoreSevens;
	
	public static void main(String[] args)
		{
		Data.addData();
		findLength();
		findQQQ();
		findGWords();
		findSixLetterWords();
		findSevensAndOnes();
		}
	
	public static void findLength()
		{
		System.out.println("There are " + Data.data.size() + " records in the database.");
		}
	
	public static void findQQQ()
		{
		for(Record r : Data.data)
			{
			if(r.getLetterCode().contains("qqq"))
				{
				totalQ++;	
				}	
			}
		System.out.println("There are " + totalQ + " occurrences of \"qqq\" in the data.");
		}
	
	public static void findGWords()
		{
		for(Record r : Data.data)
			{
			if(r.getLetterCode().substring(0,1).equals("g"))
				{
				totalG++;
				}			
			}
		percentOfG = ((double)totalG / (double)Data.data.size()) * 100;
		System.out.println("There are " + totalG + " records beginning with the letter \"g\"." );
		System.out.println("That is " + percentOfG + "% of the records.");
		}
	
	public static void findSixLetterWords()
		{
		for(Record r : Data.data)
			{
			if(r.getLetterCode().length() == 6)
				{
				numberOfSixes++;
				}			
			}
		System.out.println("There are " + numberOfSixes + " lettercodes of length 6.");
		}
	
	public static void findSevensAndOnes()
		{	
		for(Record t : Data.data)
			{
			String aString = Integer.toString(t.getNumberCode());
			for(int i = 0; i < 9; i++)
				{				
				if(aString.substring(i,i + 1).equals("7"))
					{
					numberOfSevens++;
					}			
				else if(aString.substring(i,i + 1).equals("1"))
					{
					numberOfOnes++;
					}								
				}
			if(numberOfSevens > numberOfOnes)
				{
				numberOfLinesWithMoreSevens++;
				}
			numberOfSevens = 0;
			numberOfOnes = 0;
			}
		System.out.println("There are " + numberOfLinesWithMoreSevens + " lines that have more sevens than ones.");			
		}
	}

