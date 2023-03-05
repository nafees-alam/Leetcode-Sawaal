class Solution {
    public double angleClock(int hour, int minutes) {
        double hr = (hour%12 + minutes/60.0)*30;
        double min = (6*minutes);
        double diff = Math.abs(min - hr);
        return Math.min(diff, 360-diff);
    }
}
