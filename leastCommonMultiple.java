public int leastCommonMultiple(int low , int high) {
  if (low>high)
	  return leastCommonMultiple(high, low);
  for(int i =1; i <=low; i++){
    if ((i*high)%low==0)
      return i * high;
  }

  return -1;
}

/* Problem Transformation */
public int leastCommonMultiple(int low , int high) {
  return (low * high)/ gcdEuclid(low, high);
  
}

int gcdEuclid(int m, int n) {
  if(n == 0)
    return m;
  else
    return gcdEuclid(n, m%n);
}



