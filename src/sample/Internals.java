package sample;

import java.util.List;

public class Internals {
    public static double getAverageOfPoints(List<Internal> internals){
        double sum = 0;
        for (int i = 0; i < internals.size(); i++) {
            sum += internals.get(i).getPoints();
        }
        if(internals.size() != 0){
            return sum/internals.size();
        }
        else {
            return 0;
        }
    }
    public static double getAverageOfGrade(List<Internal> internals){
        double sum = 0;
        for (int i = 0; i < internals.size(); i++) {
            sum += internals.get(i).getGrade();
        }
        if(internals.size() != 0){
            return sum/internals.size();
        }
        else {
            return 0;
        }

    }

    public static Internal getMaxPointInternal(List<Internal> internals){
        Internal max = internals.get(0);
        for (int i = 0; i < internals.size() ; i++) {
            if (internals.get(i).getPoints()> max.getPoints()) {
                max = internals.get(i);
            }
        }
        return max;
    }

    public static double getPercentOfSeven (List<Internal> internals){
        double maxGrade = 0;
        for (int i = 0; i <internals.size() ; i++) {
            if (internals.get(i).getGrade() == 7) {
                maxGrade++;
            }
        }
        return maxGrade/internals.size();
    }


}
