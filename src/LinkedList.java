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
    
        private Node head;
        private Node tail;
        private Node curr;
        private Node prev;
        private int index;
 	
    //**********constructors***********
    
        public LinkedList(){
            System.out.println("New linked list being created");
            
            
        }//end constructor
 	
    //**********observers**********
        
        public Object isEmpty(){
            if(head == null)
                return "null";
            
            return curr.getLink();
        }//end is empty
 	
        public void traverse(){
            curr = head;
            
            while(curr != null){
                System.out.println(curr.getData());
                curr = curr.link;
            }//end while
        }//end traverse
        
        public Node findKey(Object key){
            while(curr.getData() != key){
                curr = curr.link;
            }//end while
            return curr;
        }//end find key
        
    //**********transformers**********
        
        public void insertFirst(Object addme){
            Node newN = new Node(addme, null);
            
            if(head == null)
                head = newN;
            else{
                newN.link = head;
                head = newN;
            }//end else
        }//add for testing
        
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
        
        public void insertAfter(Object addme, Object key){
            Node newN = new Node(addme, null);
            curr = head;
            
            while(curr.getData() != key){
                curr = curr.link;
            }//end while
            newN.link = curr.link;
            curr.link = newN;
        }//end insert after
        
        public void deleteFirst(){
            if(head == null)
               System.out.println("Nothing to delete");
            else{
                head = head.link;
            }//end else
        }//end delete first
        
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