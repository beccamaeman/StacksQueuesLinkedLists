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
        
        public Object isEmpty(){
            if(index == 0)
                return "null";
            
            return nodes.get(0).getData();
        }//end is empty
 	
        public void traverse(){
            for(int x = 0; x < index; x++)
                System.out.println(nodes.get(x).getData());
        }//end traverse
        
        public void findKey(Object key){
            
        }
        
    //**********transformers**********
        
        public void insertFirst(Object addMe){
            Node pointer = new Node(addMe, null);
            
            if(index == 0)
                nodes.add(0, pointer);
            
            else{
                pointer.setLink(nodes.get(0));
                nodes.add(0, pointer);
            }//end else
            
            index++;
        }//end insert first
        
        public void insertLast(Object addMe){
            Node pointer = new Node(addMe, null);
            
            if(index == 0)
                nodes.add(pointer);
            
            else{
                nodes.get(index).setLink(pointer);
                nodes.add(pointer);
            }//end else
            
            index++;
        }//end insert last
        
        public void insertRandom(Object addme, int indexAdd){
            Node pointer = new Node(addme, null);
            
            nodes.add(indexAdd, pointer);
            nodes.get(indexAdd).setLink(nodes.get(indexAdd+1));
               
            index++;
        }//end insert random
        
        public void deleteFirst(){
            nodes.remove(0);
            index--;
        }//end delete first
        
        public void deleteLast(){
            nodes.remove(index);
            index--;
        }//end delete last
        
        public void deleteRandom(int deleteIndex){
            nodes.remove(deleteIndex);
            index--;
        }//end delete random
        
        
        
        
        
        
        
        
        public Object printFirst(){
           return nodes.get(0).getData();
        }//for testing only
        
        public Object printSecond(){
            return nodes.get(1).getData();
        }//for testing only
        
        public Object printThird(){
            return nodes.get(2).getData();
        }//for testing only
        
        public Object printFourth(){
            return nodes.get(3).getData();
        }//for testing only
 
}//end class