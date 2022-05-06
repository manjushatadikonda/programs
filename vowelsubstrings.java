package programs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class vowelsubstrings {
public int check(String str)
{
	int count=0;
	for(int i=0;i<=str.length()-1;i++)
	{
		for(int j=i;j<=str.length()-1;j++)
		{
			String str1=str.substring(i,j+1);
			boolean result=true;
			for(int k=0;k<str1.length();k++)
			{
				if(!(str1.charAt(k)=='i'||str1.charAt(k)=='a'||str1.charAt(k)=='e'||str1.charAt(k)=='o'||str1.charAt(k)=='u'))
					result=false;
					
			}
			if(result)
				count++;
		}
	}
	return count;
}
@Test
public void test1()
{
	String s="codestudio";
	Assert.assertEquals(check(s), 6);
}
@Test
public void test2()
{
	String s="wxyz";
	Assert.assertEquals(check(s), 0);
}
}
