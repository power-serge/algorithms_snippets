public int max(int[] nums, int begin, int end) {
  if (begin == end)
    return nums[begin];
  int mid = begin + (end-begin)/2;
  int max1 = max(nums, begin, mid);
  int max2 = max(nums, mid+1, end);
  
  if (max1 > max2)
    return max1;
  return max2;
}