 class palindrome {
 public static void main(String args[]){
  int n=1221;
  int i=n;
  int rev=0;
  int number=0;
  while(n!=0){
  number=n%10;
  rev=(rev*10)+number;
  n=n/10;
  }
  if(i==rev){
  System.out.print("Number is palindrome");
  }
  else{
  System.out.print("Not a palindrome");
}
}
}
