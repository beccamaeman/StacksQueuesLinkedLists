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
        }//end insert random
        
        public void insertAfter(Object addme, Object key){
            
        }
        
        public void deleteFirst(){
            head.link = null;
            head.setLink(head.link.link);
            index--;
        }//end delete first
        /*
        public void deleteLast(){
            int newEnd = index-2;
            index--;
            
            nodes.remove(index);
            nodes.get(newEnd).setLink(null);
            
        }//end delete last
        
        public void deleteRandom(int deleteIndex){
            int first = deleteIndex+1;
            int last = deleteIndex-1;
            
            nodes.remove(deleteIndex);
            nodes.get(first).setLink(nodes.get(last));
            
            index--;
        }//end delete random
        
        */
        
        public Object printFirst(){
           return head.getData();
        }//for testing only
        
        public Object printSecond(){
            return head.link.getData();
        }//for testing only
        
        public Object printThird(){
            return head.link.link.getData();
        }//for testing only
        
        public Object printFourth(){
            return head.link.link.link.getData();
        }//for testing only
        
        public Object printFifth(){
            return head.link.link.link.link.getData();
        }//for testing only
 
}//end class