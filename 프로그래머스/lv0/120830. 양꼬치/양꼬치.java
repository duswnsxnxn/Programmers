class Solution {
    public int solution(int n, int k) {
        int service = (n >= 10) ? (n / 10) * 2000 : 0;

        return (n * 12000) + (k * 2000) - service;
    }
}