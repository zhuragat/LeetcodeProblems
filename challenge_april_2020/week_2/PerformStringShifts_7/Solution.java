package challenge_april_2020.week_2.PerformStringShifts_7;

class Solution {
    public String stringShift(String s, int[][] shift) {
        int position = 0;
        int length = s.length();

        for (int[] arr : shift) {
            int num = arr[1];
            position += arr[0] == 0 ? -num : num;
        }

        position = (position % length + length) % length;
        int index = length - position;

        return s.substring(index) + s.substring(0, index);
    }
}
