// https://leetcode.com/problems/kth-largest-element-in-an-array/description/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        int alen = nums.length;
        for(int i=0; i<alen; i++)
        {
            maxpq.add(nums[i]);
        }
        while(k>1)
        {
            maxpq.remove();
            k--;
        }
        return (maxpq.peek());
    }
}
