public int binarySearch(int[] nums, int begin, int end, int element) {
  if(begin>end)
    return -1;
  else{
    int middle = (begin+end)/2;
    if (nums[middle] == element)
      return middle;
    else if (nums[middle] < element)
      return binarySearch(nums, middle+1, end, element);
    else
      return binarySearch(nums, begin, middle-1, element);
  }
}
