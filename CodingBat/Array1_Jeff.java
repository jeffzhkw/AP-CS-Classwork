//Q1
public boolean firstLast6(int[] nums) {
  
  if (nums[0] == 6 || nums[nums.length-1]==6)
  {
    return true;
  }
  else 
  return false;
}

//Q2
public boolean sameFirstLast(int[] nums) {
  if (nums.length >= 1 && nums[0]==nums[nums.length-1])
  return true;
  else
  return false;
}

//Q3
public int[] makePi() {
  
  int [] makePi = {3,1,4};
  
  return makePi;
}

//Q4
public boolean commonEnd(int[] a, int[] b) {
  if (a[0] == b[0] || a[a.length-1] == b[b.length-1])
  return true;
  else 
  return false;
}

//Q5
public int sum3(int[] nums) {
  
  return nums[0]+ nums[1] + nums[2];
}

//Q6
public int[] rotateLeft3(int[] nums) {
  int temp = nums[0];
  
  for (int i = 0; i < nums.length-1; i++){
    
    nums[i] = nums[i+1];
    
  }
  nums[nums.length-1]=temp;
  
  return nums;
}

//Q7
public int[] reverse3(int[] nums) {
  int temp = nums[0];
  nums[0] = nums [2];
  nums[2] = temp;
  return nums;
}

//Q8
public int[] maxEnd3(int[] nums) {
  
  if(nums[0] > nums [2])
  
  for(int i = 0; i <= 2; i ++){
    
    nums[i] = nums[0];
    
  }
  
  if (nums[0] < nums[2] )
  
  
  for(int i = 0; i <= 2; i ++){
    
    nums[i] = nums[2];
    
  }
  else
   for(int i = 0; i <= 2; i ++){
    
    nums[i] = nums[2];
    
  }
 
  return nums;
}

//Q9
public int sum2(int[] nums) {
  int sum = 0;

  if (nums.length >=2)
  sum = nums[0]+ nums[1];
  
  else if (nums.length < 2 && 0<nums.length)
  sum = nums[0];
  
  
  return sum;
}

//Q10
public int[] middleWay(int[] a, int[] b) {
  int[] result = {a[1],b[1]};
  return result;
}

//Q11
public int[] makeEnds(int[] nums) {
  int [] result = {nums[0],nums[nums.length-1]};
  return result;
}

//Q12
public boolean has23(int[] nums) {
  if(nums[0] == 2 || nums[1] ==2 || nums[1]==3||nums[0]==3)
  return true;
  
  else
  return false;
}

//Q13
public boolean no23(int[] nums) {
  
  if(nums[0] == 2 || nums[1] ==2 || nums[1]==3||nums[0]==3)
  return false;
  
  else
  return true;
}

//Q14
public int[] makeLast(int[] nums) {
  int [] result = new int[nums.length*2];
  result[result.length-1] = nums[nums.length-1];
  return result; 
}

//Q15
public boolean double23(int[] nums) {
  
  if(nums.length < 2)
  return false;

    
  if((nums[0] == nums[1] && nums[1]==2) ||(nums[0] == nums[1] && nums[1]==3))
  return true;
  
  
  else 
  return false;
  
}
//Q16
public int[] fix23(int[] nums) {
  for (int i = 0; i <= 2; i++){
    
    if(nums[i]==2 && nums[i+1] ==3)
    nums[i+1] =0; 
 
    
  }
 
    return nums;
}
//Q17
public int start1(int[] a, int[] b) {
  int count = 0;
  if(a.length !=0){
  if (a[0] ==1) 
  count = count +1;
  }
  if (b.length !=0){
  if(b[0] == 1)
  count = count +1;
  }
  return count;
}

//Q18
public int[] biggerTwo(int[] a, int[] b) {
  if (a[0] + a[1] < b[0] + b[1])
  return b;
  
  else 
  return a; 
}
//Q19
public int[] makeMiddle(int[] nums) {
  int[] result = {nums[(nums.length-1)/2],nums[(nums.length-1)/2+1]};
  return result;
}

//Q20
public int[] plusTwo(int[] a, int[] b) {
  int[] result = {a[0], a[1], b[0],b[1]};
  return result;
}

//Q21
public int[] swapEnds(int[] nums) {

    int temp = nums[0];
    
    nums[0] = nums[nums.length-1];
    nums[nums.length-1] = temp;

  
  return nums;
}
//Q22
public int[] midThree(int[] nums) {
  int [] result = {nums[(nums.length/2-1)],nums[(nums.length/2)],nums[(nums.length/2+1)]};
  
  return result; 
}

//Q23
public int maxTriple(int[] nums) {
  if (nums[0]>nums[nums.length/2]&& nums[0]>nums[nums.length-1]){
    return nums [0];
  }
  else if(nums[nums.length/2]>nums[0]&& nums[nums.length/2]>nums[nums.length-1])
  return nums [nums.length/2];
  
  else if (nums[nums.length-1]>nums[nums.length/2]&& nums[nums.length-1]>nums[0])
  return nums [nums.length-1];
  
  else 
  return 0; 
}

//Q24
public int[] frontPiece(int[] nums) {
  
  while (nums.length >= 2){
    int [] result = {nums[0],nums[1]};
    return result;
  }
  return nums;
}

//Q25
public boolean unlucky1(int[] nums) {
  for (int i = 0 ; i <nums.length-1; i++){
    
  if (nums[0]==1 && nums[1] ==3){
    return true;
  }

  else if (nums[1]==1 && nums[2] ==3){
      return true;
    }
  else if (nums[nums.length-2] ==1 && nums[nums.length-1] ==3){
    return true;
  }
  
  
  }
  return false;
}

//Q26
public int[] make2(int[] a, int[] b) {
  
 int [] result = new int[2];
  
  if (a.length>=2){
  
   result[0] = a[0];
   result[1] = a[1];
  
  }
  else if (a.length ==1 ){
    

   result[0] = a[0];
   result[1] = b[0];
  }
  else if (a.length==0)
{
     result[0] = b[0];
   result[1] = b[1];
}
    return result;
}

//Q27
public int[] front11(int[] a, int[] b) {
  int [] result = new int[2];
  int [] result1 = new int [1];
  int [] result2 = new int[0];
  if (a.length != 0 && b.length != 0){
  
  result[0] = a[0];
  result[1] = b[0];
  return result;
  }
  
  else if (a.length == 0 && b.length != 0){
  
  result1[0] = b[0];
  return result1;
  }
  
  else if (a.length != 0 && b.length == 0){
  
  result1[0] = a[0];
  return result1;
  }
  else 
  return result2;
}






































