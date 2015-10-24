
package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Praveen
 */
public class IntervalMerger {
    
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> tmpIntervals = new ArrayList<Interval>();
        ArrayList<Interval> newIntervals = new ArrayList<Interval>();
        if(newInterval.start > newInterval.end){
            int temp = newInterval.start;
            newInterval.start = newInterval.end;
            newInterval.end = temp;
        }
        for(Interval interval:intervals){
            //when the current interval is preceeding the new interval
            if(interval.start > interval.end){
            int temp = interval.start;
            interval.start = interval.end;
            interval.end = temp;
                
            }
            if(interval.start <= newInterval.start && interval.end >= newInterval.start ){
                tmpIntervals.add(interval);
            }
            // when the current interavl is within the new interval
            else if(interval.start >= newInterval.start && interval.end <= newInterval.end){
                tmpIntervals.add(interval);
            }
            // when the current interval is exceeding the new interval
            else if(interval.start <= newInterval.end && interval.end >= newInterval.end){
                tmpIntervals.add(interval);
            }
            // in disjoint case
            else{
                newIntervals.add(interval);
            }
            
            
        }
        if(tmpIntervals.size() >0){
            Interval mInterval = new Interval();
            mInterval.start = Math.min(newInterval.start, tmpIntervals.get(0).start);
            mInterval.end = Math.max(newInterval.end, tmpIntervals.get(tmpIntervals.size()-1).end);
            newIntervals.add(mInterval);
            
        }
        else{
            newIntervals.add(newInterval);
        }
        Collections.sort(newIntervals,new Comparator<Interval>(){    @Override
            public int compare(Interval o1, Interval o2) {
              
                return Integer.valueOf(o1.start).compareTo(Integer.valueOf(o2.start));
            }});
        return newIntervals;
    }
    
    public static void main(String args[]){
        ArrayList<Interval> testIntervals = new ArrayList<Interval>();
        testIntervals.add(new Interval(1,2));
        testIntervals.add(new Interval(3,5));
        testIntervals.add(new Interval(6,7));
        testIntervals.add(new Interval(8,10));
        testIntervals.add(new Interval(12,16));
       ArrayList<Interval> nIntervals = insert(testIntervals,new Interval(4,9));
       for(Interval interval:nIntervals){
           System.out.println("["+interval.start+","+interval.end+"] ");
       }
        
        
    }
}
