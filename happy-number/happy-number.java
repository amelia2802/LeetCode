class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> checkedSet = new HashSet<>();

        while (n != 1 && !checkedSet.contains(n)) {
            checkedSet.add(n);
            n = squareSum(n);
        }

        return n == 1;
    }

    private int squareSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}