/*DESCRIPTION: Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
*/ 


//ANSWER:
class Solution {
    public int romanToInt(String s) {
        char[] symbols = s.toCharArray();
        
        //Array to track previous number
        int[] resultArr = new int[s.length()];
        int index = 0;
        int result = 0;
        
        for(char roman : symbols){
            int num = 0;
            switch(roman){
                case 'I':
                    num =  1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
                default: 
                    break;
            }//end switch
            
            //Handle possible subtraction
            if(index > 0 && num > resultArr[index - 1]){
                result = result - resultArr[index - 1];
                num = num - resultArr[index - 1];
                result = result + num;
            }else{
                result = result + num;
            }
            resultArr[index] = num;
            index++;
                
        }//end loop
        return result;
        
    }//end method
}

//ANALYSIS:  runtime-3ms, memory usage-41.4mb