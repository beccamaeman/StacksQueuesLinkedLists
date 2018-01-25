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
        private int index;
 	
    //**********constructors***********
    
        public LinkedList(){
            System.out.println("New linked list being created");
            
            head = new Node();
            tail = new Node();
            curr = new Node();
            index = 0;
        }//end constructor
 	
    //**********observers**********
        
        public Object isEmpty(){
            if(index == 0)
                return "null";
            
            return curr.getLink();
        }//end is empty
 	
        public void traverse(){
            curr = head.link;
            
            while(curr != null){
                System.out.println(curr.getData());
                curr = curr.getLink();
            }//end while
        }//end traverse
        
        public void findKey(Object key){
            while(curr.getData() != key){
                curr = curr.link;
            }//end while
        }//end find key
        
    //**********transformers**********
        
        public void insertFirst(Object addMe){
            Node pointer = new Node(addMe, null);
            
            if(head.link == null){
                head.setLink(pointer);
            }//end if
            else{
                Node pointTo = head.link;
                head.setLink(pointer);
                pointer.setLink(pointTo);
            }//end else
            
            index++;
        }//end insert first
        
        public void insertLast(Object addMe){
            Node pointer = new Node(addMe, null);
            
            if(head.link == null){
                head.setLink(pointer);
            }//end if
            else{
                while(curr != null){
                    curr = curr.getLink();
                }//end while
                
                curr.setLink(pointer);
            }//end else
            
            index++;
        }//end insert last
        
        public void insertRandom(Object addme, int indexAdd){
            Node pointer = new Node(addme, null);
            
            
               
            index++;
        }//end insert random
        
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
           return head.link.getData();
        }//for testing only
        
        public Object printSecond(){
            return head.link.link.getData();
        }//for testing only
        
        public Object printThird(){
            return head.link.link.link.getData();
        }//for testing only
        
        public Object printFourth(){
            return head.link.link.link.link.getData();
        }//for testing only
 
}//end class