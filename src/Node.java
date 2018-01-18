/* **********************************************************
 * Programmer:	Becca Man
 * Class:	CS40S
 * 
 * Assignment:	Node for linked list
 *
 * Description:	describe the class you are creating
 *
 *************************************************************/
 
 
//import files here as needed
 
 
public class Node{//begin class
 	
    //***********class constants**********
 	
    //**********instance variable**********
    
        protected Object data;
        protected Node link;
 	
    //**********constructors***********
    
        public Node(){
            data = 0;
            link = null;
        }//end default constructor
        
        public Node(Object d, Node n){
            data = d;
            link = n;
        }//end initialized constructor
 	
    //**********observers**********
 	
    //**********transformers**********
 
}//end class