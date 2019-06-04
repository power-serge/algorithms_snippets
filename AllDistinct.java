public boolean allDistinct(int[] nums) {
  quickSort(nums,0,nums.length-1);
  for (int i=0; i <nums.length-1; ++i)
    if (nums[i]==nums[i+1])
      return false;
  return true;
  
}
int[] quickSort(int[] nums, int begin, int end) {
  if(begin < end) {
    int splitPos = partition(nums, begin, end);
    quickSort(nums, begin, splitPos-1);
    quickSort(nums, splitPos+1, end);
  }
  return nums;
}

int partition(int[] nums, int begin, int end) {
  int splitPos = begin;
  int pivotValue = nums[begin];
  for(int i=begin+1; i<=end; i++) {
    if(nums[i] > pivotValue) {
      splitPos++;
      swap(nums, i, splitPos);
    }
  }
  swap(nums, begin, splitPos);
  return splitPos;
}

void swap(int[] nums, int pos1, int pos2) {
  int temp = nums[pos1];
  nums[pos1] = nums[pos2];
  nums[pos2] = temp;
}