class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for (int i=0; i<s.length(); i++) {
            int pos=('z'-s.charAt(i)+1);
            sum+=pos*(i+1);
        }
        return sum;
    }
}
