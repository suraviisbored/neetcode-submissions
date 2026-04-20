class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()==t.length())
        {
            int[] count=new int[26];

            for(int i=0;i<s.length();i++)
            {
               char f= s.charAt(i);
               char g=t.charAt(i);

               count[f-'a']++;
               count[g-'a']--;
            }
            for(int i=0;i<26;i++)
            {
                if(count[i]!=0)
                {
                    return false;
                }

            }
            return true;
        }
        return false;
    }
}
