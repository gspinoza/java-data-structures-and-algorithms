package gspinoza.data_structures;
// import gspinoza.data_structures.ArrayList;
// import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ArrayListTest {

  @Test
  public void testArrayList() {
    ArrayList <Integer> list = new ArrayList <> (100);
    list.add(5);
    list.add(10);
    list.add(3);
    list.add(34);

    System.out.println(list.isEmpty());
    System.out.println(list.get(3));
    System.out.println(list);

    list.remove(0);
    System.out.println(list);

    System.out.println(list.contains(1));
  }
		// assertEquals(9, ob.sum(3,6));
    // assertTrue( true );

}
