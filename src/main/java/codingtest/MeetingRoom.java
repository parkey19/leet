package codingtest;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {
    public static void main(String[] args) {

        Interval interval1 = new Interval(15, 20);
        Interval interval2 = new Interval(5, 10);
        Interval interval3 = new Interval(0, 30);

        Interval[] intervals = {interval1, interval2, interval3};

        System.out.println(solve(intervals));

        Interval interval4 = new Interval(0, 10);
        Interval interval5 = new Interval(15, 20);

        Interval[] intervals2 = {interval4, interval5};
        System.out.println(solve(intervals2));
    }

    public static boolean solve(Interval[] intervals) {
        if(intervals == null)
            return false;
        print(intervals);
        Arrays.sort(intervals, comparator);
        print(intervals);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i-1].end > intervals[i].start) return false;
        }
        return true;
    }

    static Comparator<Interval> comparator = (Interval i1, Interval i2) -> i1.start - i2.start;

    public static void print(Interval[] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            Interval in = intervals[i];
            System.out.println(in.start + " " + in.end);
        }
    }

    private static class Interval {
        int start;
        int end;

        public Interval() {
            this.start = 0;
            this.end = 0;
        }

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
