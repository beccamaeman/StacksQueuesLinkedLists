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
    
        //next class make an array list of nodes.
    
        private Node head;
        private Node tail;
        private int index;
 	
    //**********constructors***********
    
        public LinkedList(){
            System.out.println("New linked list being created");
            head = null;
            tail = null;
            index = 0;
        }//end constructor
 	
    //**********observers**********
        
        public boolean isEmpty(){
            if(index == 0)
                return true;
            
            return false;
        }//end is empty
 	
    //**********transformers**********
        
        public void insertFirst(Object addMe){
            
            Node pointer = new Node(addMe, null);
            index++;
            
            tail = head;            //set tail to head    
            head = pointer;         //set head to new value pointer at beginning
                
        }//end insert first
        
        public void insertLast(Object addMe){
            
            Node pointer = new Node(addMe, null);
            index++;
            
        }
        
        public Object printFirst(){
            return head.getData();
        }//for testing only
        
        public Object printSecond(){
            return tail.getData();
        }//for testing only
 
}//end class