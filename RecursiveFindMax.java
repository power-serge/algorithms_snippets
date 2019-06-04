public int max(int[] nums, int begin, int end) {
  
  if (begin==end) //base case
    return nums[begin];
  
  int maxRest = max(nums, begin, end-1); //reduce and conquer
    
  if (maxRest > nums[end]) //adjustment 
    return maxRest;
  else
    return nums[end];

}
