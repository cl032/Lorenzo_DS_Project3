/**
******************************************************
***  Class Name: Queue.java
***  Class Author:  Chris Lorenzo
******************************************************
*** This class serves as a FIFO data structure for the
*   application GUI.  It uses a linked list to hold the
*   data and uses to methods to add and remove data from
*   the list.
* 
*   Class Inputs:
*   — single int value for the add method
*   Return Value:
*   — None
*
******************************************************
*** Date: 24 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/
package lorenzo_ds_project3;

/**
 *
 * @author Chris
 */
public class Queue {
    
    LinkList myList = new LinkList();
    
    public void add(int val)
    {
        myList.add(val);
    }
    
    public void remove()
    {
        myList.remove();
    }
        
}
