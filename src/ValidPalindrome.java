/**
 * 
 * @author Floyd
 * Created on 2016年5月23日 下午3:44:36
 */
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        char[] arrs = s.toLowerCase().toCharArray();
        int l = 0,  r = arrs.length-1;
        while(l<r){
        	if( !(arrs[l]>='0'&&arrs[l]<='9') && !(arrs[l]>='a'&& arrs[l]<='z') ){
        		l++; continue;
        	}
        	if( !(arrs[l]>='0'&&arrs[l]<='9') && !(arrs[l]>='a'&& arrs[l]<='z') ){
        		r--; continue;
        	}
        	if(arrs[l]!=arrs[r])
        		return false;
        	l++; r--;
        }
		return true;
    }
}
