public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        int count = 0;
        for(int i = nums.length; i < ans.length; i++) {
            ans[i] = nums[count];
            count++;
        }
        return ans;
    }
}