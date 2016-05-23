
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp = x , digit=1;
        while(temp/10!=0){
        	temp /= 10;
        	digit++;
        }
        for(int i=0; i<digit/2 ; i++){
        	if(getDigit(i, x)!=getDigit(digit-i-1, x))
        		return false;
        }
		return true;
    }
	private int getDigit(int index, int x){
		if(index==0)	return x%10;
		else return (int) ((x/Math.pow(10, index))%10);
	}
}
