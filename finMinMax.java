public int[] minMax(int[] nums, int begin, int end) {
  int [] result = new int[2];
  int max = nums[0];
  int min = nums[nums.length-1];
  
  for (int i: nums){
    if (max < i)
      max = i;
    if (min > i)
      min = i;
  }
  
  result[0] = min;
  result[1] = max;
  
  return result;
    
}

public int[] minMax(int[] a, int i, int j) {
		int[] result = new int[2];

		if (i == j) {
			result[0] = result[1] = a[i];
		} else if (i == j - 1) {
			if (a[i] < a[j]) {
				result[0] = a[i];
				result[1] = a[j];
			} else {
				result[0] = a[j];
				result[1] = a[i];
			}
		} else {
			int middle = (i + j) / 2;
			int[] leftSide = minMax(a, i, middle);
			int[] rightSide = minMax(a, middle + 1, j);

			if (leftSide[0] < rightSide[0]) {
				result[0] = leftSide[0];
			} else {
				result[0] = rightSide[0];
			}

			if (leftSide[1] > rightSide[1]) {
				result[1] = leftSide[1];
			} else {
				result[1] = rightSide[1];
			}
		}

		return result;
}
    

