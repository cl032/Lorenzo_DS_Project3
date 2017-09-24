/**
******************************************************
***  Class Name: Link.java
***  Class Author:  Chris Lorenzo
******************************************************
*** This class creates a data container that holds
*   an int value in property, and a pointer to the next
*   link in a Link property. It's used an element in
*   the linked list.
* 
*   Class Inputs:
*   — int Value for the constructor
*   Return Value:
*   — None
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
public class Link {
    
    int value;
    Link next;
    
    public Link(int num)
    {
        value = num;
        next = null;
    }
    
}
