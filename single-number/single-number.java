class Solution {
    public int singleNumber(int[] nums) {
        
        HashSet<Integer> check_set = new HashSet<Integer>();

        for (int item : nums) {
            if (check_set.contains(item)) {
                check_set.remove(item);
            } else {
                check_set.add(item);
            }
        }

        // At this point, check_set should contain only one element, the single number
        for (int single : check_set) {
            return single;
        }

        // This line should never be reached given the problem constraints
        return -1;
    }
}