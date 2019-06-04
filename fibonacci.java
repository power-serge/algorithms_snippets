public long fibonacci(int n) {
  if(n<2) return n;
  return fibonacci(n-1) + fibonacci(n-2); 
}


public long fibonacci(int n) {
  if(n<2) return n;
 // long [] fib = new long[n+1];
  fib[0] = 0;
  fib[1] = 1;
  
  for (int i = 2; i <=n; i++)
    fib[i] = fib[i-1]+fib[i-2];
  
  return fib[n]; 
}

/* improved for space efficiency */
public long fibonacci(int n) {
  if(n<2) return n;
  
  long fib0 = 0;
  long fib1 = 1;
  
  for (int i = 2; i <=n; i++)
  {
    long fib = fib0 + fib1;
    fib0 = fib1;
    fib1 = fib;
  }
  
  return fib1; 
}