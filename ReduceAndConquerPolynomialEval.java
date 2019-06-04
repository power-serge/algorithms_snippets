public int rAcPolyEval(int[] a, int begin, int end, int x) {
  if(begin == end)
    return a[begin];
  
  return rAcPolyEval(a, begin+1, end, x)*x+a[begin];
  
}