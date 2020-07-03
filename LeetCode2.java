import java.util.HashSet;
import java.util.Set;

public class LeetCode2 {
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>(nums.length);
	    for (int x: nums) {
	        if (set.contains(x)) return true;
	        set.add(x);
	    }
	    return false;
	}
	
public static void main(String args[]) {
	int nums[]={1,2,3,4,4,5,3};
    System.out.print(containsDuplicate(nums));
	} }

