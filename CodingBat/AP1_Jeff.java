//Q1
public boolean scoresIncreasing(int[] scores) {
  
  for (int i = 0;  i < scores.length-1; i++){
     
    if (scores[i] > scores[i + 1]){
    
    return false;
   
    }
  }
  return true; 
  
}

//Q2
public boolean scores100(int[] scores) {
  for (int i = 0;  i < scores.length-1; i++){
     
    if (scores[i] == scores[i + 1] && scores[i + 1]==100){
    
    return true;
   
    }
    
  }
  
  return false;
}

//Q3
