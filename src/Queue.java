/* **********************************************************
 * Programmer:	Becca Man
 * Class:	CS40S
 * 
 * Assignment:	queue data structure
 *
 * Description:	This class is my implementation of a queue 
 *              data structure. I used an arraylist to constsruct
 *              my queue. It has the methods peek, pop, push and isemtpy.
 *
 *************************************************************/
 
//import files here as needed
 
    import java.util.ArrayList; 

public class Queue{//begin class
 	
    //***********class constants**********
 	
    //**********instance variable**********
    
        private ArrayList queue;
        private int index = 0;
    
    //**********constructors***********
        
        public Queue(){
            System.out.println("New queue being created");
            queue = new ArrayList();
        }//end constructor
 	
    //**********observers**********
        
        /****************************************
        * retrieve head value of queue
        * IN: none
        * OUT: head value of queue
        ****************************************/
        public int check(){
            return (int) queue.get(index);
        }//end get top value
        
        /****************************************
        * check if queue is empty
        * IN: none
        * OUT: true or false
        ****************************************/
        public boolean isEmpty(){
            if(index == 0)
                return true;
            
            return false;
        }//end is emtpy
        
    //**********transformers**********
        
        /****************************************
        * remove and get head value of queue
        * IN: none
        * OUT: head value of queue
        ****************************************/
        public int next(){
            int temp = (int) queue.get(index);
            queue.remove(index);
            return temp;
        }//end remove top value
        
        /****************************************
        * push new value onto back of queue
        * IN: none
        * OUT: none
        ****************************************/
        public void lineUp(int n){
            queue.add(index, n);
            index++;
        }//end push value on top of stack
 
}//end class