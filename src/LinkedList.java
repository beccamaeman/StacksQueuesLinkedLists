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
        private Node curr;
        private int index;
 	
    //**********constructors***********
    
        public LinkedList(){
            System.out.println("New linked list being created");
            
            head = null;
            curr = null;
            index = 0;
        }//end constructor
 	
    //**********observers**********
        
        public Object isEmpty(){
            if(index == 0)
                return "null";
            
            return curr.getLink();
        }//end is empty
 	
        public void traverse(){
            while(curr.getData() != null){
                curr = curr.link;
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
            
            if(index == 0){
                head.setLink(pointer);
            }//end if
            else{
                Node pointTo = head.link;
                head.setLink(pointer);
                pointer.setLink(pointTo);
            }//end else
            
            index++;
        }//end insert first
        /*
        public void insertLast(Object addMe){
            Node pointer = new Node(addMe, null);
            
            if(index == 0)
                nodes.add(pointer);
            
            else{
                nodes.add(pointer);
                nodes.get(index).setLink(pointer);
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
           return head.link;
        }//for testing only
        
        public Object printSecond(){
            return head.link.link;
        }//for testing only
        
        public Object printThird(){
            return head.link.link.link;
        }//for testing only
        
        public Object printFourth(){
            return head.link.link.link.link;
        }//for testing only
 
}//end class