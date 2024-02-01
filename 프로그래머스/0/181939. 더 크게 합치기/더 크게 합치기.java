class Solution {
    public int solution(int a, int b) {
        int n1 = Integer.parseInt("" + a + b);
        int n2 = Integer.parseInt("" + b + a);
        return n1 >= n2 ? n1 : n2;
    }
}