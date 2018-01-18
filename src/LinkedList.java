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
            
            head = pointer;         //set head to new value pointer at beginning
            tail = head;            //set tail to head
            
        }//end insert first
        
        public Node printFirst(){
            return head;
        }//for testing only
 
}//end class