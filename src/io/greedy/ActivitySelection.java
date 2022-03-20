package io.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ActivitySelection {
    class Activity {
        int start;
        int end;

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
    public int solve(int[] A, int[] B) {
        int result = 1;
        int x = 0;

        List<Activity> activityList = new ArrayList<>();
        for(int i=0;i<A.length;i++) {
            Activity activity = new Activity();
            activity.start = A[i];
            activity.end = B[i];
            activityList.add(activity);
        }

        List<Activity> sortedList = activityList.stream().sorted(Comparator.comparing(Activity::getEnd))
                .collect(Collectors.toList());

        for(int i=1;i<sortedList.size();i++) {
            if(sortedList.get(i).getStart() >= sortedList.get(x).getEnd()) {
                x=i;
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = new int[]{3, 13, 7, 7, 10, 3};
        int[] B = new int[]{6, 15, 9, 8, 16, 11};
        ActivitySelection obj = new ActivitySelection();
        System.out.println(obj.solve(A,B));
    }
}
