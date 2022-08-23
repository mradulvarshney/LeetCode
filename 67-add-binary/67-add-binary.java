class Solution 
{
    public String addBinary(String a, String b) 
    {   
        int len1 = a.length();
        int len2 = b.length();
        String str="";
        if(len1<len2)
        {
            for(int i=0; i<len2-len1; i++)
                str+="0";
            a=str+a;
        }
        else
        {
            for(int i=0; i<len1-len2; i++)
                str+="0";
            b=str+b;
        }
        int carry=0;
        String res="";
        for(int i=a.length()-1;i>=0;i--)
        {
            int sum = Integer.parseInt(String.valueOf(a.charAt(i)))+Integer.parseInt(String.valueOf(b.charAt(i)))+carry;
            if(sum==2)
            {
                carry=1;
                res="0"+res;
            }
            else if(sum>2)
            {
                carry=1;
                res="1"+res;
            }
            else if(sum==1)
            {
                carry=0;
                res="1"+res;
            }
            else
            {
                carry=0;
                res="0"+res;
            }
        }
        if(carry==1)
        {
            res="1"+res;
        }
        return res;
    }
}