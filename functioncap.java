package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class functioncap {
	
	public long cap(double n1,double n2)
	{
		return (long) Math.pow(n1, n2);
	}
public List<Integer> check(int[] num)
{
	double max=0;
	List<Integer> resultset=new ArrayList<Integer>();
		List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 
		result.add(new ArrayList<Integer>());
	 
		for (int i = 0; i < num.length; i++) {
		
			ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();
	 
			for (ArrayList<Integer> l : result) {
				
				for (int j = 0; j < l.size()+1; j++) {
					
					l.add(j, num[i]);
	 
					ArrayList<Integer> temp = new ArrayList<Integer>(l);
					current.add(temp);
					l.remove(j);
				}
			}
	 
			result = new ArrayList<ArrayList<Integer>>(current);
		}
		for(int k=0;k<result.size();k++)
		{long temp=1;;
		System.out.println(result.get(k));
			for(int l=result.get(k).size()-1;l>=0;l--)
			{
				if(l==result.get(k).size()-1)
				{
					temp=result.get(k).get(l);
				}
				else
				{
				temp=cap(temp,result.get(k).get(l));
				System.out.println("cap:"+temp);
				if(temp>max)
				{
					max=temp;
					
					resultset=result.get(k);
					
				}
			}
			}
		}
	 System.out.println(resultset);
	return resultset;
	}

@Test
public void test1()
{
	int[] num= {5,4,6};
	check(num);
}
}

