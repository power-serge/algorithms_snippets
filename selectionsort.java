public int[] selectionSort(int[] nums) {
  for (int i=0; i< nums.length-1; i++){
    int j = findMin(nums, i,nums.length-1);
    int temp = nums[i]; 
    nums[i] = nums[j]; 
    nums[j] = temp; 
    }
  
  return nums;
}

int findMin(int[] nums, int start, int end){
  int index = start;
  for (int i  = start+1; i <= end; i++){
    if (nums[i]<nums[index])
      index = i;
  }
  
  return index;
}