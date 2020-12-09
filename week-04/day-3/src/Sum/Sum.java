package Sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {

    public int sum(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return 0;
        } else {
            int result = 0;
            for (Integer list : arrayList) {
                result += list;

            }
            return result;
        }


    }
}

