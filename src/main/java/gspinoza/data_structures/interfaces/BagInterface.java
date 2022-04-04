package gspinoza.data_structures.interfaces;

/**
 * @author Gabriel.Espinoza
 *
 */
public interface BagInterface < T > {

  /**
   * Get the number of entries in the bag
   * @return the number of entries
   */
  public int getCurrentSize();

  /**
   * Check if the bag is empty
   * @return True if the bag is empty
   */
  public boolean isEmpty();

  /**
   * Add an item to the bag
   * @param newEntry
   * @return True if the item is added successfully
   */
  public boolean add(T newEntry);

  /**
   * Remove a unspecified item from the bag
   * @return the item removed
   */
  public T remove();

  /**
   * Remove a specified item from the bag
   * @param anEntry
   * @return True if the item is removed successfully
   */
  public boolean remove(T anEntry);

  /**
   * Remove all items from the bag
   */
  public void clear();

  /**
   * Get the number of times a specified item occurs in the bag
   * @param anEntry
   * @return number of times a specified item occurs in the bag
   */
  public int getFrequencyOf(T anEntry);

  /**
   * Check if the bag contains a specified item
   * @param anEntry
   * @return
   */
  public boolean contains(T anEntry);

  /**
   * get an array representation of the bag
   * @return all item in the bag as an array
   */
  public T[] toArray();
}