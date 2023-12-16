class Solution {
    public double angleClock(int hour, int minutes) {
        hour=hour%12;
        double anglePerMinute= minutes/12.00;
        double a = (hour*5) + anglePerMinute;
        double b = minutes;
        double diff=Math.abs(b-a);
        double ans= diff*6.0;
        return (ans > 180) ? 360-ans : ans;
    }
}