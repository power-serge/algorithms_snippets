public boolean allDistinct(int[] nums) 
{
  int[] bucket = new int[500000];
  
  for (int i=0; i<nums.length; ++i)
  {
    if(bucket[nums[i]+10000] == 1)
      return false;
    else
      bucket[nums[i]+10000] = 1;
  }
  return true;
}


/* using HashMap */
public boolean allDistinct(int[] nums) 
{
  //int[] bucket = new int[500000];
  Map<Integer, Integer> map = new HashMap<Integer, Integer>();
  
  for (int i=0; i<nums.length; ++i)
  {    
    if(map.containsKey(nums[i]))
      return false;
    else
      map.put(nums[i], 1);
  }
  
  return true;
  
}