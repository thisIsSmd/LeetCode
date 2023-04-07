class Solution {
    public int myAtoi(String str) {
        int neg = 0;
        double num = 0;
      
        str = str.trim();
        if(str.length() == 0)
            return 0;
        
        int s = 0 ; 
        int e = str.length()-1;
        if(str.charAt(0) == '-' || str.charAt(0) == '+')
        {
            s++;
            if(str.charAt(0) == '-')
                neg = 1;
        }

        for(int i = s;i<=e;i++){
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                e = i-1;
            }
        }
        
        for(int i = s;i<=e;i++){
      System.out.println((int)(str.charAt(i)-'0') + " "+num);   
         num = (num * 10) + (int)(str.charAt(i) - '0'); 
        }
        
        if(neg == 1)
             num = -1L * num;
      
        System.out.println(num+" "+neg);
        if(num >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        
        if(num <= Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int)num;
    }
}
