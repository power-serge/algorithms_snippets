public boolean splitArray(int[] nums) {
  
  return groupSum(0, nums, 0, 0);
  
}

public boolean groupSum(int start, int[] nums, int sum0, int sum1) {
  if (start >= nums.length) return (sum0 == sum1);
  
  if (groupSum(start + 1, nums, sum0 + nums[start], sum1))
       return true;
  
  // Recursive call trying the case that nums[start] is not chosen.
  if (groupSum(start + 1, nums, sum0, sum1+nums[start]))
      return true;
  
  // If neither of the above worked, it's not possible.
  return false;
}