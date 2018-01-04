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
public boolean scoresClump(int[] scores) {
  for (int i =0; i< scores.length-2; i++){
    if (scores[i+2]-scores[i]<= 2){
      return true;
    }
    
  }
  return false;
}

//Q4
public int scoresAverage(int[] scores) {
  
  if (average(scores, 0, scores.length/2)>average(scores,scores.length/2+1, scores.length)){
    return average(scores, 0, scores.length/2);
    
  }
  
  else return average(scores,scores.length/2+1, scores.length);
}

public int average(int[] scores, int start, int end){
  
  if(scores.length ==2){
    if(scores[0]>scores[1])
    return scores[0];
    
    else 
    return scores[1];
  }
  
  else{
  int temp =0;
  
  for (int i = start; i <end; i++){
    
     temp = temp + scores[i];
    
  }
  return temp/(end-start);
  }
}

//Q5
public int wordsCount(String[] words, int len) {
  int count =0; 
  
  for (int i =0; i< words.length; i++){
    
    if (words[i].length() == len){
      
      count = count +1;
    }
    
  }
  
  
  return count; 
}

//Q6
public String[] wordsFront(String[] words, int n) {
  
  String [] result = new String [n];
  
  for (int i =0; i<n; i++){
    
    result[i] = words[i];
    
  }
  
  return result; 
}

//Q7
public List wordsWithoutList(String[] words, int len) {
  
  List result = new ArrayList();
  
  for (int i =0; i< words.length; i++){
    
    if(words[i].length()!=len){
      
      result.add(words[i]);
      
    }
    
  }
  return result; 
}

//Q8
public boolean hasOne(int n) {
    while (n > 0) {
        if (n % 10 == 1) return true;
        n = n / 10;
    }
    return false;
}

//Q9
