public int[] middleWay(int[] a, int[] b) {
  int[] c = new int[2];
  c[0] = a[1];
  c[1] = b[1];
  return c;
}

public int[] makeEnds(int[] nums) {
  int[] a = new int[2];
  a[0] = nums[0];
  a[1] = nums[nums.length-1];
  return a;
}


public int[] fizzArray(int n) {
  int[] a = new int[n];
  for(int i = 0; i<n;i++){
  a[i] = i;
  }
  return a;
}


public boolean only14(int[] nums) {
  for(int i = 0; i<nums.length; i++){
  if (nums[i] ==1 || nums[i] ==4){
  ;} else {
  return false;}
  }
  return true;
}
