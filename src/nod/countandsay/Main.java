package nod.countandsay;

public class Main {

}
class Solution {
    public String countAndSay(int n) {
        if(n == 1)
        {
            return "1";
        }
        else{
            String str = countAndSay(n-1)+"*";
            int count = 1;
            String result = "";
            for(int i=0;i<str.length();i++)
            {
                if(str[i] == str[i=1])
                {
                    
                }
            }
        }
    }
}