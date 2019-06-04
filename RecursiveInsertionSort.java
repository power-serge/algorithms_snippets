public int[] insertionSort(int[] nums, int begin, int end) {
  
  if (begin == end) //base case
    return nums;
    
  insertionSort(nums, begin, end-1); // reducing step
  
  insert(nums, begin, end-1, nums[end]); // adjustment
  
  return nums;
  
  /*Iterative solution*/
  for(int i = begin+1; i <= end; i++)
	  insert(nums, begin, i-1, nums[i];
  
  return nums;
  

}
void insert(int[] nums, int begin, int end, int element) {
  
  int index=end;
  
  while(index>=begin && nums[index]<element) {
    index--;
  }
  
  for(int i=end; i>index; i--) {
    nums[i+1] = nums[i];
  }
  
  nums[index+1] = element;
}