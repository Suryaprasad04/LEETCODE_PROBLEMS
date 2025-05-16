class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            if (!isPalindrome(n, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome(int n, int base) {
        StringBuilder sb = new StringBuilder();
        int temp = n;

        while (temp != 0) {
            sb.append(temp % base);
            temp /= base;
        }

        String baseStr = sb.toString();
        String reversed = sb.reverse().toString();

        return baseStr.equals(reversed);
    }
}
