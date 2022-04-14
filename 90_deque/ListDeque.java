// Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
// APCS pd08
// HW90 -- Swabbing the Deque
// 2022-04-12
// time spent : 0.5 hrs

/**
DISCO:
- offer() - inserts the element in the first position unless it violates capacity restrictions
- poll() - retrives and removes the first element at the first position; returns null if deck is empty
- these two methods basically do the same thing as add() and remove(), just with more safety checks
- addLast() == add()

QCC:
- Why can't AL be converted to QQKachoo? We keep getting this error even though we
initialized the AL the same way in our previous homework.
- How do we throw other exceptions?
**/

import java.util.*;
import java.lang.*;

public class ListDeque<Card> implements Deque<Card> {

  private LinkedList<Card> _arr;

  // constructor that initalizes a new AL
  public ListDeque(){
      _arr = new ArrayList<Card>();
  }

  // inserts the specified element
  // at the front of this deque if it is possible to do so
  public void addFirst(Card e){
      if (e == null){
          throw new NullPointerException();
      }
      _arr.add(0, e);
  }

  // inserts the specified element
  // at the end of this deque if it is possible to do so
  public void addLast(Card e){
      if (e == null){
          throw new NullPointerException();
      }
      _arr.add(e);
  }

  // removes the specified element
  // at the front of this deque if it is possible to do so
  public Card removeFirst(){
      if (_arr.size() < 1){
          throw new NoSuchElementException();
      }
      return _arr.remove(0);
  }

  // removes the specified element
  // at the end of this deque if it is possible to do so
  public Card removeLast(){
      if (_arr.size() < 1){
          throw new NoSuchElementException();
      }
      return _arr.remove(_arr.size()-1);
  }

  // returns the first element of the deque
  public Card peekFirst(){
      if (_arr.size() < 1){
          return null;
      }
      return _arr.get(0);
  }

  // returns the last element of the deque
  public Card peekLast() {
      if (_arr.size() < 1){
          return null;
      }
      return _arr.get(_arr.size()-1);
  }

  // toString() method
  public String toString(){
      return _arr.toString();
  }

}
