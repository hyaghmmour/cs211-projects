// we usually provide abstract methods (by default they are abstract) and static fields in interfaces.
// interfaces usually define "behavior" of something.

public interface DynamicArrayBehavior{
  public void append(int item);
  public int getFirstItem();
  public int getLastItem();
}