package gspinoza.data_structures;
import gspinoza.data_structures.interfaces.BagInterface;

/**
 * @author class
 *
 */
public class ArrayBag < T > implements BagInterface < T > {

  //fields
  private T[] bag;
  private int numOfEntries;
  private final static int DEFAULT_SIZE = 10;
  private final int MAX_SIZE = 100;

  public ArrayBag() {
    this(DEFAULT_SIZE);
  }


  public ArrayBag(int desiredSize) {

    checkCapacity(desiredSize);
    // an array null values
    @SuppressWarnings("unchecked")
    T[] temp = (T[]) new Object[desiredSize];
    bag = temp;
    numOfEntries = 0;
  }


  @Override
  public int getCurrentSize() {
    // TODO Auto-generated method stub
    return numOfEntries;
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    if (numOfEntries == 0)
      return true;

    return false;
  }

  @Override
  public boolean add(T newEntry) {
    // TODO Auto-generated method stub
    if (!isArrayFull()) {
      bag[numOfEntries] = newEntry;
      numOfEntries++;
    }
    return false;
  }

  @Override
  public T remove() {
    T itemRemove = null;

    if (!isEmpty()) {
      itemRemove = bag[numOfEntries - 1];
      bag[numOfEntries - 1] = null;
      numOfEntries--;
    }
    return itemRemove;
  }

  @Override
  public boolean remove(T anEntry) {
    if (!isEmpty()) {
      for (int i = 0; i < numOfEntries; i++) {
        if (bag[i].equals(anEntry)) {
          bag[i] = bag[numOfEntries - 1]; // replace element, move last element to anEntry place
          numOfEntries--; // remove last index
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public void clear() {

    while (!isEmpty())
      remove();
  }

  @Override
  public int getFrequencyOf(T anEntry) {
    int freq = 0;
    for (int i = 0; i < numOfEntries; i++) {
      if (bag[i].equals(anEntry))
        freq++;
    }
    return freq;
  }

  @Override
  public boolean contains(T anEntry) {
    // TODO Auto-generated method stub
    for (int i = 0; i < numOfEntries; i++) {
      if (bag[i].equals(anEntry))
        return true;
    }
    return false;
  }

  @Override
  public T[] toArray() {

    @SuppressWarnings("unchecked")
    //allocate memory 
    T[] temp = (T[]) new Object[numOfEntries];

    // copy elements
    for (int i = 0; i < numOfEntries; i++)
      temp[i] = bag[i];

    return temp;
  }

  private void checkCapacity(int size) {
    if (size > MAX_SIZE)
      throw new IllegalStateException("Exceed the maxiumum size");

  }

  private boolean isArrayFull() {
    if (numOfEntries >= bag.length)
      return true;
    else
      return false;
  }

  public String toString() {
    String tmp = "[";

    for (int i = 0; i < numOfEntries; i++) {
      tmp += bag[i] + ", ";
    }

    tmp += "]";

    return tmp;
  }


}