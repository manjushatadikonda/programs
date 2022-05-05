package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class frequencyinput {
	public List<Integer> frequency(int[] arr)
	 
	 { 
		
		int max=0;
		 HashMap<Integer, Integer> hMap= new HashMap<Integer, Integer>();

	 for (int i = arr.length-1; i>= 0; i--)

	 {

	    if (hMap.containsKey(arr[i]))

	           {

	       int count = hMap.get(arr[i]);

	       hMap.put(arr[i], ++count);

	    } else {

	       hMap.put(arr[i],1);

	    }

	 }
	List<Integer> list=new ArrayList<Integer>();
	 for (Map.Entry<Integer, Integer> check : hMap.entrySet())
     {
	if(check.getValue()>=max)
	{
		max=check.getValue();
     }
	 }
	 for (Map.Entry<Integer, Integer> check : hMap.entrySet())
     {
		 if(check.getValue()==max)
		 {
			 list.add(check.getKey());
		 }
     }
	 return list;
	 }
	 @Test
	 public void test1()
	 {
		 int[] arr= {1,2,1,2,3};
		Assert.assertTrue(frequency(arr).contains(1)) ;
		Assert.assertTrue(frequency(arr).contains(2)) ;
		Assert.assertFalse(frequency(arr).contains(3));
	 }
	 @Test
	 public void test2()
	 {
		 int[] arr= {6,3,3};
		Assert.assertTrue(frequency(arr).contains(3)) ;
		Assert.assertFalse(frequency(arr).contains(6));
	 }
	 
}
