public abstract class ArrayBlueprint{
 protected int numElements = 0;
 protected int numAllocations = 0;
 
 public abstract void storeAt(int item, int index);
 public abstract int getFrom(int index);
 public abstract int len(); /// same as "numElements", we are trying to get Python-like behavior
 public abstract void remove(); // removes the last item if any
 public abstract void removeAt(int index); // removes the item at index, if any
 
 /// The following methods are already implemented as they are straight forward (simple getters and setters)
 // the subclass will not need to implement the following two methods
 
 // getters 
 public int getNumElements(){
   return this.numElements;
 }
 public int getNumAllocations(){
   return this.numAllocations;
 }
 
 // setters 
 public void setNumElements(int n){
  this.numElements = n; 
 }
 public void setNumAllocations(int n){
  this.numAllocations = n; 
 }

// modifiers
 public void increaseNumElement(){
  this.numElements++; 
 }
 public void decreaseNumElement(){
  this.numElements--; 
 }
 
}