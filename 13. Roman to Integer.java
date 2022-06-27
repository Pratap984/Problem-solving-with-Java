class Solution {
    public int romanToInt(String s) {
        int n= s.length();
         Map<Character, Integer> numbers = new HashMap<>();
        numbers.put('I',1);
        numbers.put('V',5);
        numbers.put('X',10);
        numbers.put('L',50);
        numbers.put('C',100);
        numbers.put('D',500);
        numbers.put('M',1000);
        int[] a=new int[n+1];
        for(int i=0;i<n;i++)
        {
            a[i]=numbers.get(s.charAt(i));
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i+1]>a[i])
            {
                sum=sum+(a[i+1]-a[i]);
                i++;
            }
            else
            {sum=sum+a[i];}
        }
        return sum;



    }
}
