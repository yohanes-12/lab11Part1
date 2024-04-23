import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ArrayFlutternNullTest {

    @Test
    void flattenArray() {
        ArrayFlattener arrayFlattener = new ArrayFlattener();
        int[] actual = arrayFlattener.flatterArray(null);
        assertNull( actual);
    }


}
