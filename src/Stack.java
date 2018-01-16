
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
    
        ArrayList stack = new ArrayList();
 	
    //**********constructors***********
        
        public Stack(){
            System.out.println("New stack being created");
        }//end constructor
 	
    //**********observers**********
        
        public static Object peek(ArrayList s){
            return s.get(0);
        }//end get top value
 	
    //**********transformers**********
        
        public static Object pop(ArrayList s){
            Object temp = s.get(0);
            s.remove(0);
            return temp;
        }//end remove top value
        
        public static void push(ArrayList s, int n){
            s.add(0, n);
        }//end push value on top of stack
 
}//end class