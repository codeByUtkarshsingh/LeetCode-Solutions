class Solution {
    public double angleClock(int hour, int minutes) {
       double h = hour==12? 0:hour*30; 
       double hm=(double)minutes*0.5 + h;
       double m = minutes*6;
       double ang = Math.abs(hm-m);
       return Math.min(ang,(360-ang)); 
    }
}