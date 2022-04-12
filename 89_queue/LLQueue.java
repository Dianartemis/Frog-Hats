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

import java.util.LinkedList;

public class LLQueue<QUASAR> implements Queue<QUASAR>{

    private LinkedList<QUASAR> arr;

    public LLQueue (){
        arr = new LinkedList<QUASAR>();

    }

//~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue(){
      if (!arr.isEmpty()){
          return arr.remove();
      } else {
          return null;
      }
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ){
      arr.addLast(x);
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty(){
      return arr.isEmpty();
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront(){
        return arr.peekFirst();
  }
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~
  
}
