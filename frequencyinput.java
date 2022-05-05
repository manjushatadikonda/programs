package programs;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class frequencyinput {
	public int frequency(int[] arr,int num)
	 
	 { 
		int value=-1;
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
	 if(hMap.containsKey(num))
	 {
	 for (Map.Entry<Integer, Integer> check : hMap.entrySet())
     {
	if(check.getKey()==num)
		value= check.getValue();
     }
	 }
	
	 return value;
	 }
	 @Test
	 public void test1()
	 {
		 int[] arr= {1,2,1,2,3};
		Assert.assertEquals(frequency(arr, 3),1) ;
	 }
	 @Test
	 public void test2()
	 {
		 int[] arr= {6,3,3};
		Assert.assertEquals(frequency(arr, 1),-1) ;
	 }
	 @Test
	 public void test3()
	 {
		 int[] arr= {1,2,3,4,3,2,2};
		Assert.assertEquals(frequency(arr, 2),3); 
	 }
}
