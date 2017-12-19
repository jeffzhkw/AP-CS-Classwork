//Q1
public boolean makeBricks(int small, int big, int goal) {
  if ((small+ 5*big ) < goal)
    return false;
  else if (small < (goal%5))
    return false;
  else 
    return true; 
}

//Q2
public int loneSum(int a, int b, int c) {
  
  if (a == b){
    return c;
  }
  
  else if (a == c)
    return b;
    
  else if (b==c){
    
    return a; 
  }
  
  else if (a==b && b == c)
  
   return 0;
  
  else 
    return a + b + c; 
}

//Q3
public int luckySum(int a, int b, int c) {
  if (a == 13){
    return 0;
    
  }
  else if (b ==13)
  return a;
  
  else if (c == 13){
    
    return a+b;
  }
  else 
  return a + b + c;
  
}