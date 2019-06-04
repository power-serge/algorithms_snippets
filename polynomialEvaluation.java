public int polyEval(int[] a, int x) {
  int px = a[0];
  int xpower = x;
  for (int i = 1; i < a.length; ++i)
    //px += a[i]*(int)Math.pow(x, i);
    //px += a[i]*power(x, i);
    px += a[i]*xpower;
    xpower = xpower*x;
    
  return px;
  
}

int power(int x, int m){
  int power = x;
  for (int i = 1; i < m; ++i)
    power = power * x;
  return power;
  
}
