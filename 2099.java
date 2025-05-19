class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        // Store elements and all their indices to handle duplicates
        for (int i = 0; i < nums.length; i++) {
            maxHeap.offer(nums[i]);
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        List<Integer> selectedIndices = new ArrayList<>();

        // Select top k elements and collect their original indices
        for (int i = 0; i < k; i++) {
            int num = maxHeap.poll();
            int index = map.get(num).remove(0);
            selectedIndices.add(index);
        }

        // Sort indices to maintain original order
        Collections.sort(selectedIndices);

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = nums[selectedIndices.get(i)];
        }

        return ans;
    }
}
