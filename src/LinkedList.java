/* **********************************************************
 * Programmer:	Becca Man
 * Class:	CS40S
 * 
 * Assignment:	Linked List exercise
 *
 * Description:	describe the class you are creating
 *
 *************************************************************/
 
//import files here as needed

public class LinkedList{//begin class
 	
    //***********class constants**********
 	
    //**********instance variable**********
    
        private Node head;      //pointer to first element
        private Node curr;      //pointer to move through linked list
        private Node prev;      //pointer to element previous to current
        
    //**********constructors***********
        
        /****************************************
        * linked list constructor
        * IN: none
        * OUT: message it's created
        ****************************************/
        public LinkedList(){
            System.out.println("New linked list being created");
        }//end constructor
 	
    //**********observers**********
        
        /****************************************
        * check if linked list is empty
        * IN: none
        * OUT: either null or pointer to head
        ****************************************/
        public Object isEmpty(){
            if(head == null)
                return "null";
            
            return head;
        }//end is empty
 	
        /****************************************
        * method to traverse the array
        * IN: none
        * OUT: data in linked list
        ****************************************/
        public void traverse(){
            curr = head;
            
            while(curr != null){
                System.out.println(curr.getData());
                curr = curr.link;
            }//end while
        }//end traverse
        
        /****************************************
        * will find a key in the linked list
        * IN: the key
        * OUT: address of key
        ****************************************/
        public Object findKey(Object key){
            curr = head;
            
            if(head == null)
                return "null";
            else{
                while(curr.getData() != key){
                    curr = curr.link;
                }//end while
            
                return curr;
            }//end else
        }//end find key
        
    //**********transformers**********
        
        /****************************************
        * method to insert at start
        * IN: data to add
        * OUT: none
        ****************************************/
        public void insertFirst(Object addme){
            Node newN = new Node(addme, null);
            
            if(head == null)
                head = newN;
            else{
                newN.link = head;
                head = newN;
            }//end else
        }//add for testing
        
        /****************************************
        * method to insert before a key
        * IN: data to add and the key to add before
        * OUT: none
        ****************************************/
        public void insertBefore(Object addme, Object key){
            Node newN = new Node(addme, null);
            curr = head;
            
            while(curr.getData() != key){
                prev = curr;
                curr = curr.link;
            }//end while
            newN.link = curr;
            prev.link = newN;
        }//end insert before
        
        /****************************************
        * method to insert after a key
        * IN: data to add and the key to add after
        * OUT: none
        ****************************************/
        public void insertAfter(Object addme, Object key){
            Node newN = new Node(addme, null);
            curr = head;
            
            while(curr.getData() != key){
                curr = curr.link;
            }//end while
            newN.link = curr.link;
            curr.link = newN;
        }//end insert after
        
        /****************************************
        * method to delete first element
        * IN: none
        * OUT: none
        ****************************************/
        public void deleteFirst(){
            if(head == null)
               System.out.println("Nothing to delete");
            else{
                head = head.link;
            }//end else
        }//end delete first
        
        /****************************************
        * method to delete an element
        * IN: key to delete
        * OUT: none
        ****************************************/
        public void delete(Object delme){
            curr = head;
            
            if(head == null)
               System.out.println("Nothing to delete");
            else{
                while(curr.getData() != delme){
                    prev = curr;
                    curr = curr.link;
                }//end while
                prev.link = curr.link;
            }//end else
        }//end delete
        
        /****************************************
        * method to delete last element
        * IN: none
        * OUT: none
        ****************************************/
        public void deleteLast(){
            Node prevprev = new Node();
            curr = head;
            
            if(head == null)
               System.out.println("Nothing to delete");
            else{
                while(curr != null){
                    prevprev = prev;
                    prev = curr;
                    curr = curr.link;
                }//end while
                prevprev.link = null;
            }//end else
        }//end delete last
        
}//end class