import java.util.ArrayList;

public class Intersection {
	public int[] intersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i : nums1){
			if(temp.contains(i))
				continue;
			for(int j : nums2){
				if(i==j){
					temp.add(i);
					break;
				}
			}
		}
		int[] result = new int[temp.size()];
		for(int i=0; i<temp.size(); i++)
			result[i] = temp.get(i);
		return result;
	}
}
