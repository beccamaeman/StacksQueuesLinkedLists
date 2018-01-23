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

    import java.util.ArrayList;   
 
public class LinkedList{//begin class
 	
    //***********class constants**********
 	
    //**********instance variable**********
    
        //next class make an array list of nodes.
    
        private ArrayList<Node> nodes;
        private int index;
 	
    //**********constructors***********
    
        public LinkedList(){
            System.out.println("New linked list being created");
            
            nodes = new ArrayList<Node>();
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
            
            nodes.add(0, pointer);
            index++;
        }//end insert first
        
        public void insertLast(Object addMe){
            
            Node pointer = new Node(addMe, null);
            index++;
            
        }
        
        public Object printFirst(){
            return nodes.get(0);
        }//for testing only
        
        public Object printSecond(){
            return nodes.get(1);
        }//for testing only
 
}//end class