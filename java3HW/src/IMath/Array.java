package IMath;
import java.util.Arrays;
import java.util.Collections;

public class Array implements IMath {

    private Integer[] array;

    public Array(Integer[] array) {
        this.array = array;
    }

    @Override
    public int Max() {
        int max = Collections.max(Arrays.asList(array));
        return max;
    }

    @Override
    public int Min() {
        int min = Collections.min(Arrays.asList(array));
        return min;
    }

    @Override
    public float Avg() {
        float total = 0.0f;
        for (Integer integer : array) {
            total = total + (float) integer;
        }
        return total / array.length;
    }

}

