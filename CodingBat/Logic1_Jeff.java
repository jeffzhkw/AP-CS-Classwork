//Q1
public boolean cigarParty(int cigars, boolean isWeekend) {
  if (isWeekend)
  return 40<=cigars;
  else
  return  (40<=cigars&&cigars<=60);
}

//Q2
public int dateFashion(int you, int date) {
    if (you <=2||date<=2){
    return 0;
  }
  
  else if(you>=8||date>=8){
    return 2;
  }

  return 1;
}

//Q3
public boolean squirrelPlay(int temp, boolean isSummer) {
  if(isSummer)
  return 60<=temp && temp<=100;
  else 
  return 60<=temp && temp<=90;
}

//Q4
public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday){
    if(speed<=65)
      return 0;
    else if (66 <=speed && speed<=85)
    return 1;
    
    else 
    return 2;
  }
  
  else {
      if(speed<=60)
      return 0;
    else if (61 <=speed && speed<=80)
    return 1;
    
    else 
    return 2;
  }
}

//Q5
public int sortaSum(int a, int b) {
  if(10<=a+b&&a+b<=19){
    return 20;
  }
  else
  return a+b;
}

//Q6
public String alarmClock(int day, boolean vacation) {
  if (day == 6 || day ==0 ){
    if(vacation){
      
      return "off";
      
    }
    else 
    return "10:00";
  }
  else{
    if (vacation){
      return "10:00";
    }
    else
    return "7:00";
    
  }
}

//Q7
public boolean love6(int a, int b) {
  
  if (a==6 ||b == 6||a==6^b==6 || Math.abs(a-b)==6 ||a+b ==6 )
    return true;
  
  else
  return false;
}

//Q8
public boolean in1To10(int n, boolean outsideMode) {
  if(outsideMode){
    
    if(n<=1||n>=10)
    return true;
    else 
    return false;
    
  }
  else {
  
  if(n>=1&&n<=10)
  return  true;
  else 
  return false;
  }
}

//Q9
public boolean specialEleven(int n) {
  if (n%11==0){
    
    return true;
  }
  
  
  else{
  if ((n-1)%11==0){
    return true;
    
  }
  
  
  else
  return false;
  
  }
}

//Q10
public boolean more20(int n) {
  if ((n-1)%20==0||(n-2)%20==0){
    return true;
    
  }
  else
  return false;
  
  
}

//Q11
public boolean old35(int n) {
  if ((n%3)==0^(n%5==0)){
    
    return true;
    
  }
  else
  return false;
}

//Q12
public boolean less20(int n) {
  if((n+1)%20==0 ||(n+2)%20 ==0){
    return true;
  }
  else 
  return false;
}

//Q13
public boolean nearTen(int n) {
  if((n+1)%10==0||(n+2)%10==0||(n-1)%10==0||(n-2)%10==0||n%10==0)
  return true;
  else
  return false;
}

//Q14
