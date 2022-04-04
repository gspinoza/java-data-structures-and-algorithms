package gspinoza.data_structures;

import org.junit.Test;

public class ArrayBagTest {

    @Test
    public void testArrayBag() {
        ArrayBag < Integer > numBag = new ArrayBag < > ();
        numBag.add(2);
        numBag.add(5);
        numBag.add(5);
        numBag.add(5);

        System.out.println(numBag);

        Object[] array = numBag.toArray();

        for (Object a: array)
            System.out.println((Integer) a);

        System.out.println(numBag.isEmpty());
        System.out.println(numBag.getCurrentSize());

        System.out.println(numBag.getCurrentSize());

        if (numBag.contains(5))
            System.out.println("there is a 5");
        else
            System.out.println("there is no 5");

        System.out.println(numBag.getFrequencyOf(5));

        numBag.remove();
        System.out.println(numBag);

        numBag.clear();
        System.out.println(numBag);

    }
}