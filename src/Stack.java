/* **********************************************************
 * Programmer:	Becca Man
 * Class:	CS40S
 * 
 * Assignment:	stack data structure
 *
 * Description:	This class is my implementation of a stack 
 *              data structure. I used an arraylist to constsruct
 *              my stack. It has the methods peek, pop, push and isemtpy.
 *
 *************************************************************/
 
//import files here as needed
 
    import java.util.ArrayList; 

public class Stack{//begin class
 	
    //***********class constants**********
 	
    //**********instance variable**********
    
        private ArrayList stack;
        private int index = 0;
    
    //**********constructors***********
        
        public Stack(){
            System.out.println("New stack being created");
            stack = new ArrayList();
        }//end constructor
 	
    //**********observers**********
        
        /****************************************
        * retrieve top value of stack
        * IN: none
        * OUT: top value of stack
        ****************************************/
        public int peek(){
            return (int) stack.get(0);
        }//end get top value
        
        /****************************************
        * check if stack is empty
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
        * remove and get top value of stack
        * IN: none
        * OUT: top value of stack
        ****************************************/
        public int pop(){
            int temp = (int) stack.get(0);
            stack.remove(0);
            return temp;
        }//end remove top value
        
        /****************************************
        * push new value onto top of stack
        * IN: none
        * OUT: none
        ****************************************/
        public void push(int n){
            stack.add(0, n);
            index++;
        }//end push value on top of stack
 
}//end class