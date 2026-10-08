import java.util.*;
public class leetcode4 {
    static void main() {
        int nums1[] = {2,4};
        int nums2[] = {1,2,3,4};
        int dummy [] = new int [nums2.length];
        Arrays.fill(dummy,-1);
        Stack<Integer> stack = new Stack<>();
        for(int i = nums2.length-1 ; i >= 0; i--){
            int val = nums2[i];
            while(!stack.isEmpty()&&stack.peek()<val){
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek()>val){
                dummy[i] = stack.peek();
            }

                stack.push(val);

        }
        System.out.println(Arrays.toString(dummy));

        for(int i = 0 ; i < nums1.length ; i++){
            for (int j = 0 ; j < nums2.length ; j++){
                if(nums1[i]==nums2[j]){
                    nums1[i]=dummy[j];
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(nums1));
    }
}
