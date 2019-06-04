public int powerN(int base, int n) {
  int result = base;
  for(int i = 1; i < n; ++i)
  {
    result = result * base;
  }
  return result;
}

public int powerN(int base, int n) {
 if(n==0)
  return base;
 return base * powerN(base, n-1);
}

public int powerN(int base, int n) {
	int result = 1;
	if (n==0)
		return result;
	else if (n % 2 == 0)
	{
		result = powerN(base, n/2);
		return result * result;
	}
	else 
		return base * powerN(base, n -1);
}
