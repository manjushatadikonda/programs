package programs;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class homogenoussubstrings {
	public int check(String str)
	{
		int count=0;
		List<String> list=new ArrayList<String>();
	for(int i=0;i<=str.length()-1;i++)
	{
		for(int j=i;j<=str.length()-1;j++)
		{
			String str1=str.substring(i,j+1);
			boolean homo=true;
			for(int k=1;k<str1.length();k++)
			{
				if(!(str1.charAt(k)==str1.charAt(0)))
				{
					homo=false;
				}
			}
			if(homo)
			{
				list.add(str1);
				count++;
			}
		}
	}
	return count;
	}
	@Test
	public void test1()
	{
		String s="bcbc";
		Assert.assertEquals(check(s), 4);
	}
	@Test
	public void test2()
	{
		String s="ccddd";
		Assert.assertEquals(check(s), 9);
	}
}
