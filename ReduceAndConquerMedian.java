public int rAcMedian(int[] nums, int begin, int end) {
  int median = partition(nums, begin, end);
  
  if (median == nums.length/2)
    return nums[median];
  else if (median > nums.length/2)
     return rAcMedian(nums, begin, median-1);
  else 
     return rAcMedian(nums, median+1, end);
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