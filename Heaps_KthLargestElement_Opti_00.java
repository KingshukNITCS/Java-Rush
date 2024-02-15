class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minpq = new PriorityQueue<>();
        int alen = nums.length;
        for(int i=0; i<alen; i++)
        {
            minpq.add(nums[i]);
            if(minpq.size()>k) minpq.remove();
        }
        return (minpq.peek());
    }
}
