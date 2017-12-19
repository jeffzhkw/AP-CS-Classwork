//Q1
public int countEvens(int[] nums) {
  int count = 0;
  for (int i = 0; i <= nums.length-1; i++){
    
    if(nums[i]%2==0){
      count++;
    }
    
  }
  return count;
}

//Q2
public int bigDiff(int[] nums) {
  int max = nums[0];
  
  int min = nums[0];
  for (int i = 0 ;i <nums.length; i++){
    if (max < nums[i]){
      max = nums[i];
    }
    if (min > nums[i]){
      min = nums[i];
    }  
  }
  return max- min;
}

//Q3
public int centeredAverage(int[] nums) {
	int max = nums[0];
	int min = nums[0];
	int sum = 0;

	for (int i = 0; i < nums.length; i++) {
		sum += nums[i];
		if (nums[i] > max) max = nums[i];
		if (nums[i] < min) min = nums[i];
	}
	return (sum - (max + min)) / (nums.length - 2);
}



//Q4
public int sum13(int[] nums) {
  int result = 0;
  for (int i =0 ; i <nums.length; i++){
    
    if (nums[i]==13){
      i = i+1;
    }
    else 
    result = result + nums[i];
    
  }
  
  return result; 
}

//Q5
public int sum67(int[] nums) {
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] != 6) sum += nums[i];
		else
			while (nums[i] != 7) i++;
	}
	return sum;
}


//Q6
public boolean has22(int[] nums) {
  boolean result = false;
  for (int i = 0; i < nums.length-1; i++){
    if(nums[i]==2&&nums[i+1]==2){
      result = true;
    }
  }
  
  return result; 
}

//Q7
public boolean lucky13(int[] nums) {
  boolean result = true; 
  
  for (int i = 0; i < nums.length ; i++){
    if (nums[i] == 1 || nums[i]==3){
      result = false; 
    }
  }
  
  return result;
  
}

//Q8
public boolean sum28(int[] nums) {
  boolean result = false;
  int sum = 0;
  for (int i = 0 ; i< nums.length; i ++){
    if (nums[i] ==2){
      sum = sum + nums[i];
    }
  }
  if (sum ==8){
    result = true;
  }
  
  return result;
  
}

//Q9
public boolean more14(int[] nums) {
  int count1 =0;
  int count4 =0;
  for (int i = 0; i < nums.length ; i++){
    
    if(nums[i]==1){
      count1++;
    }
    else if (nums[i]==4){
      count4++;
    }
    
  }
  if (count4>= count1)
  return false;
  else 
  return true;
}

//Q10
public int[] fizzArray(int n) {
  int [] result = new int[n];
  for(int i =0; i <n; i++){
    
    result[i]=i;
    
  }
  return result;
}

//Q11
public boolean only14(int[] nums) {
  
  boolean result = true;
  
  for (int i =0 ; i < nums.length; i++){
    if(nums[i]!=1){
      if(nums[i]!=4){
        result = false;
      }
    }
    
  }
  return result;
}

//Q12
public String[] fizzArray2(int n) {
  if(n == 0){
    String [] result = new String[n];
  }
  
  String [] result = new String[n];
  
  for(int i = 0; i < n; i++){
    result[i]= String.valueOf(i);
    
  }
  return result;
}

//Q13
public boolean no14(int[] nums) {
	int ones = 0;
	int fours = 0;
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == 1) ones++;
		if (nums[i] == 4) fours++;
	}
	return ones == 0 || fours == 0;
}



//Q14
public boolean isEverywhere(int[] nums, int val) {
  int count = 0;
  for (int i = 0; i < nums.length-1; i++){
    
    if (nums[i]!=val){
      if(nums[i+1]!=val){
      return false;
      }
    }
   
  
  }
    return true;
   
}

//Q15
public boolean either24(int[] nums) {
	Boolean twos = false;
	Boolean fours = false;

	for (int i = 0; i < nums.length - 1; i++) {
		if (nums[i] == 2 && nums[i + 1] == 2) twos = true;
		if (nums[i] == 4 && nums[i + 1] == 4) fours = true;
	}
	return twos ^ fours;
}

//Q16
public int matchUp(int[] nums1, int[] nums2) {
  int count =0;
  
  for (int i = 0; i <nums1.length; i++){
    
    if(Math.abs(nums1[i]-nums2[i])<=2&&Math.abs(nums1[i]-nums2[i])!=0){
      count++;
    }
    
  }
  return count;
}

//Q17
public boolean has77(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++)
        if (nums[i] == 7 && nums[i + 1] == 7) return true;
 
    for (int i = 0; i < nums.length - 2; i++)
        if (nums[i] == 7 && nums[i + 2] == 7) return true;
 
    return false;
}

//Q18
public boolean has12(int[] nums) {
  for (int i = 0; i < nums.length; i++){
    
    if(nums[i]==1){
      
      for (int j = i; j < nums.length ; j++){
        
        
        if (nums[j]==2){
          return true;
          
        }
      }
      
    }
    
  }
  
    return false;
}

//Q19
public boolean modThree(int[] nums) {
  for (int i =0; i < nums.length-2; i++){
    
    if (nums[i]%2 == 0 ){
      if (nums[i+1]%2 == 0 ){
        if (nums[i+2]%2 == 0 ){
          
      
      return true;
    }}}
    
   if (nums[i]%2 == 1 ){
      if (nums[i+1]%2 == 1 ){
        if (nums[i+2]%2 == 1 ){
      
      return true;
      
      
    }
      }
   }
   
    
    
  }
  return false;
}

//Q20
public boolean haveThree(int[] nums) {
    int count = 0;
    int pos = -2; // in case nums[0] == 3
 
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 3) {
            count++;
            if (i - pos == 1) return false;
            pos = i;
        }
    }
 
    return count == 3;

//Q21
ublic boolean twoTwo(int[] nums) {
    for (int i = 0; i < nums.length; i++)
        if (nums[i] == 2) {
            int count = 0;
            for (int j = i; j < nums.length; j++)
                if (nums[j] == 2) count++;
                else break;
            i += count;
            if (count < 2) return false;
        }
    return true;
}

//Q22
public boolean sameEnds(int[] nums, int len) {
    for (int i = 0, j = nums.length - len; i < len; i++, j++)
        if (nums[i] != nums[j]) return false;
    return true;
}

//Q23
public boolean tripleUp(int[] nums) {
    for (int i = 0; i <= nums.length - 3; i++)
        if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2)
            return true;
    return false;
}

//Q24
public int[] shiftLeft(int[] nums) {
    if (nums.length > 0) {
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++)
            nums[i] = nums[i + 1];
        nums[nums.length - 1] = first;
    }
    return nums;
}

//Q25
public int[] tenRun(int[] nums) {
    boolean replace = false;
    int multiple = 0;
 
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 10 == 0) {
            if (!replace) {
                replace = true;
                multiple = nums[i];
            } else
                multiple = nums[i];
        }
        if (nums[i] % 10 != 0 && replace) nums[i] = multiple;
    }
    return nums;
}

//Q26
public int[] pre4(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4) count++;
            else break;
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++)
            result[i] = nums[i];
        return result;
}

//Q27
public int[] notAlone(int[] nums, int val) {
    for (int i = 1; i < nums.length - 1; i++)
        if (nums[i] == val && nums[i - 1] != val
            && nums[i + 1] != val)
            nums[i] = Math.max(nums[i - 1], nums[i + 1]);
    return nums;
}

//Q28
public int[] zeroFront(int[] nums) {
    int[] res      = new int[nums.length];
    int zeroPos    = 0;
    int nonZeroPos = res.length - 1;
 
    for (int i = 0; i < nums.length; i++)
        if (nums[i] == 0)
            res[zeroPos++]    = 0;
        else
            res[nonZeroPos--] = nums[i];
 
    return res;
}

//Q29
public int[] withoutTen(int[] nums) {
    int[] copy = new int[nums.length];
    int index = 0;
 
    for (int i = 0; i < nums.length; i++)
        if (nums[i] != 10) {
            copy[index] = nums[i];
            index++;
        }
    return copy;
}

//Q30
public int[] zeroMax(int[] nums) {
    int largestOdd = 0;
    for (int i = nums.length - 1; i >= 0; i--) {
        if (nums[i] % 2 == 1 && nums[i] > largestOdd)
            largestOdd = nums[i];
        if (nums[i] == 0)
            nums[i] = largestOdd;
    }
    return nums;
}

//Q31

