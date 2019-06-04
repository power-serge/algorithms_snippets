public boolean allDistinct(int[] nums) {
  if(quickSort(nums,0,nums.length-1) == null)
    return false;
  return true;
}
int[] quickSort(int[] nums, int begin, int end) {
  //if (partition(nums,begin,end) == -1) return null;
  
  if(begin < end) {
    int splitPos = partition(nums, begin, end);
    if (splitPos == -1) return null;
    if (quickSort(nums, begin, splitPos-1) == null) return null;
    return quickSort(nums, splitPos+1, end);
  }
  return nums;
}

int partition(int[] nums, int begin, int end) {
  int splitPos = begin;
  int pivotValue = nums[begin];
  for(int i=begin+1; i<=end; i++) {
    if(nums[i] == pivotValue) return -1;
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