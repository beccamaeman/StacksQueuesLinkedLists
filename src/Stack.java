
import java.util.ArrayList;

/* **********************************************************
 * Programmer:	Becca Man
 * Class:	CS40S
 * 
 * Assignment:	stack data structure
 *
 * Description:	describe the class you are creating
 *
 *************************************************************/
 
 
//import files here as needed
 
 
public class Stack{//begin class
 	
    //***********class constants**********
 	
    //**********instance variable**********
    
        public ArrayList stack;
    
    //**********constructors***********
        
        public Stack(){
            System.out.println("New stack being created");
            stack = new ArrayList();
        }//end constructor
 	
    //**********observers**********
        
        public int peek(){
            return (int) stack.get(0);
        }//end get top value
        
        public int look(){
            return (int) stack.size();
        }//for testing only
 	
    //**********transformers**********
        
        public int pop(){
            int temp = (int) stack.get(0);
            stack.remove(0);
            return temp;
        }//end remove top value
        
        public void push(int n){
            stack.add(0, n);
        }//end push value on top of stack
 
}//end class