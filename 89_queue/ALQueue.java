// Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
// APCS pd08
// HW89 -- Queue Two Ways
// 2022-04-12t
// time spent : 0.5 hrs

/**
DISCO:
- We have to import LinkedList or ArrayList.
- We don't need to keep track of list size.
QCC:
- Why are we creating wrapper classes to Queue?
**/

import java.util.ArrayList;

public class ALQueue<QUASAR> implements Queue<QUASAR>{

    private ArrayList<QUASAR> arr;

    public ALQueue (){
        arr = new ArrayList<QUASAR>();

    }

//~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue(){
      if (!arr.isEmpty()){
          return arr.remove(0);
      } else {
          return null;
      }
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ){
      arr.add(x);
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty(){
      return arr.isEmpty();
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront(){
        if (!arr.isEmpty()){
          return arr.get(0);
      } else {
          return null;
      }
  }
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

}
