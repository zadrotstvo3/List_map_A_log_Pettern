package home_colection;

import java.util.Comparator;

public class ComperatorDep implements Comparator<Deputat>{
    @Override
    public int compare(Deputat o1, Deputat o2) {
        return o1.age - o2.age;
    }
}
