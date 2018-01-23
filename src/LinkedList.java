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
            
            nodes.add(pointer);
            index++;
        }//end insert last
        
        public void insertRandom(Object addme, int index){
            Node pointer = new Node(addme, null);
            
            nodes.add(index, pointer);
            index++;
        }//end insert random
        
        
        
        
        public Object printFirst(){
           return nodes.get(0).getData();
        }//for testing only
        
        public Object printSecond(){
            return nodes.get(1).getData();
        }//for testing only
        
        public Object printThird(){
            return nodes.get(2).getData();
        }//for testing only
 
}//end class