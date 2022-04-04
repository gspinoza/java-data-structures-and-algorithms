package gspinoza.data_structures;

/* Java API has a class ArrayList<E>, where
E is the type variable that denotes the element type
Same variable name used in method declarations, e.g.
public void add(E element)
public E get(int index)

Try to define your own version of generic ArrayList, which has an array of elements. The methods include add, get, remove, contains, isEmpty and toString.
 */

public class ArrayList < E > {
  private E[] array;
  private int MAX_SIZE = 100;
  private int numOfItems;

  // contructor
  @SuppressWarnings("unchecked")
  public ArrayList(E value) {
    //not allow to directly create array of generic type
    //array = new E[MAX_SIZE]

    //alternative
    Object[] temp = new Object[MAX_SIZE];
    array = (E[]) temp;
    numOfItems = 0;
  }
  // methods

  //add
  public void add(E item) {
    array[numOfItems] = item;
    // increase index
    numOfItems++;
  }

  //get
  public E get(int index) {
    //if(index >= numOfItems){throw new RuntimeException("Invalid index");}
    E element = (E) array[index];
    return element;
  }
  //remove
  public E remove(int index) {
    //if(index>=numOfItems || index < 0 ){throw new RuntimeException("Invalid index");}
    E element = (E) array[index];
    --numOfItems;
    System.arraycopy(array, index + 1, array, index, numOfItems - index);
    array[numOfItems] = null;
    return element;
  }

  //contains
  public boolean contains(Object item) {
    boolean contain = false;

    for (int i = 0; i < numOfItems; i++) {
      if (array[i] == item) {
        contain = true;
      }
    }
    return contain;
  }
  //isEmpty
  public boolean isEmpty() {
    boolean empty = false;
    if (numOfItems == 0) {
      empty = true;
    }
    return empty;
  }
  //toString
  public String toString() {
    String str = "[";

    for (int i = 0; i < numOfItems; i++) {
      str += array[i] + ",";
    }
    return str + "]";
  }

} // end class