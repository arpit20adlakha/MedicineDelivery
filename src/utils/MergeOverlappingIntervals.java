package utils;
import models.Slot;
import java.util.*;

public class MergeOverlappingIntervals {

    public static List<Slot> mergeIntervals(Slot arr[])
    {
        List<Slot> arrayList = new ArrayList<>();

        if (arr.length <= 0)
            return arrayList;

        Stack<Slot> stack = new Stack<>();
        Arrays.sort(arr,new Comparator<Slot>(){
            public int compare(Slot i1,Slot i2)
            {
                return i1.getStartTime().compareTo(i2.getStartTime());
            }
        });

        stack.push(arr[0]);

        // Start from the next interval and merge if necessary
        for (int i = 1 ; i < arr.length; i++)
        {
            // get interval from stack top
            Slot top = stack.peek();

            // if current interval is not overlapping with stack top,
            // push it to the stack
            if ((top.getEndTime().compareTo(arr[i].getStartTime())) < 0)
                stack.push(arr[i]);

                // Otherwise update the ending time of top if ending of current
                // interval is more
            else if ((top.getEndTime().compareTo(arr[i].getEndTime()))< 0)
            {
                top.setEndTime(arr[i].getEndTime());
                stack.pop();
                stack.push(top);
            }
        }

        while (!stack.isEmpty())
        {
            Slot t = stack.pop();
            arrayList.add(t);

        }
        return arrayList;
    }
}
