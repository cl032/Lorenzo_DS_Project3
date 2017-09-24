/**
******************************************************
***  Class Name: LinkList.java
***  Class Author:  Chris Lorenzo
******************************************************
*** This class implements a linked list data structure
*   to be used in the GUI but managed through the Queue
*   class.
* 
*   Class Inputs:
*   — single int value for the add method
*   Return Value:
*   — Link value from add();
*   - String value from printList()
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
public class LinkList {
    
    Link first;                 //First link property
  
/**
******************************************************
***  Method Name: LinkList()
***  Method Author:  Chris Lorenzo
******************************************************
***  Class constructor
* 
*   Method Inputs:
*   — None
*   Return Value:
*   — None
*
******************************************************
*** Date: 24 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/    
    public LinkList()
    { 
        first = null;
    }

/**
******************************************************
***  Method Name: add()
***  Method Author:  Chris Lorenzo
******************************************************
***  This method adds a new link to the link list.  If
*    the first link is null, it's assigned the input value,
*    if not, a while loop traverses the list and finds the
*    last link and assigns the next value of the last link
*    to point to the new link.
* 
*   Method Inputs:
*   — int value from user
*   Return Value:
*   — None
*
******************************************************
*** Date: 24 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/    
    public void add(int val)
    {
        Link newLink = new Link(val);
        
        if(first==null)
        {
            first = newLink;
            return;
        }
        
        Link temp = first;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newLink;        
    }

/**
******************************************************
***  Method Name: remove()
***  Method Author:  Chris Lorenzo
******************************************************
*   This method assigns the first link to a temp var,
*   then assigns the first.next value as the list's first
*   link value.  This essentially removes it from the list.
*   Then the temp value, which was the first link value is
*   returned to the calling statement.
* 
*   Method Inputs:
*   — None
*   Return Value:
*   — Link value of the first link
*
******************************************************
*** Date: 24 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/     
    public Link remove()
    {
        Link temp = first;
        first = first.next;
        return temp;
    }

/**
******************************************************
***  Method Name: printList()
***  Method Author:  Chris Lorenzo
******************************************************
*   This method creates a string var to hold a printout
*   of the list link values.  It then creates a Link var
*   temp and assigns it the value of the first link.  That
*   var is then used to traverse the list and print out all
*   links with a value and append it to the list String var,
*   and then return that String var to the calling statement.
* 
*   Method Inputs:
*   — None
*   Return Value:
*   — String value of all the links in the list
*
******************************************************
*** Date: 24 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/   
    public String printList()
    {
        String list = "";
        Link temp = first;


        while(temp != null)
        {
            list += String.valueOf(temp.value) + " < ";
            temp = temp.next;
        }

        return list;
    }

    
}
