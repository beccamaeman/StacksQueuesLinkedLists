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
    
        private Object data;
        protected Node link;
 	
    //**********constructors***********
    
        public Node(){
            System.out.println("New default node created");
            data = 0;
            link = null;
        }//end default constructor
        
        public Node(Object d, Node l){
            System.out.println("New constructed node created");
            data = d;
            link = l;
        }//end initialized constructor
 	
    //**********observers**********
        
        public Object getData(){
            return data;
        }//end get data
        
        public Node getLink(){
            return link;
        }//end get link
 	
    //**********transformers**********
        
        public void setData(Object d){
            data = d;
        }//end set data
        
        public void setLink(Node l){
            link = l;
        }//end set link
 
}//end class