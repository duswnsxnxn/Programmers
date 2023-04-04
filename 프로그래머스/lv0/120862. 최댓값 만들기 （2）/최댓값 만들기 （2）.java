import java.util.*;
class Solution {
    
    public int solution(int[] numbers) {

        Arrays.sort(numbers);
        int length = numbers.length;
        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[length - 1] * numbers[length - 2];
        return (num1 > num2) ? num1 : num2;  
        
    }
}