
public class Record
	{
	private String letterCode;
	private int numberCode;
	
	public Record (String l, int n)
		{
		letterCode = l;
		numberCode = n;
		}
	
	public String getLetterCode()
		{
		return letterCode;
		}
	
	public int getNumberCode()
		{
		return numberCode;
		}
	
	public void setLetterCode(String letterCode)
		{
		this.letterCode = letterCode;
		}
	
	public void setNumberCode(int numberCode)
		{
		this.numberCode = numberCode;
		}

	}
