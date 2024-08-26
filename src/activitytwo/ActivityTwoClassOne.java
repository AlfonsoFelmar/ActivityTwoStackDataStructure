package activitytwo;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
/**
 *
 * @author felmaralfonso
 */
public class ActivityTwoClassOne {
    
    
     int Size;
     double[] StackArray;
     int top;
    

    Stack<Double> newStack = new Stack<>();
    
    
    public ActivityTwoClassOne(int Size){
        this.Size = Size;
        StackArray = new double[this.Size];
        top = -1;
    }
    
    
    public void push(double number){
        if (!isFull()) {
           StackArray[++top] = number;
        } 
        
        else {
            System.out.println("\nYou're stack is full");
        }
        
    }
        
    
    public void loopNewStack(){
        if(isEmpty()){
            System.out.println("Stack is empty! ");
        } 
        
        else {
            System.out.println("\nNew Stack Elements: ");
            for (int i = 0; i <= top; i++) {               
                System.out.println(newStack.get(i));
            }
      
        } 
        
    }
    
    
    public void loopStack(){
        if (isEmpty()) {
            System.out.println("Stack is empty! ");
        }
        
        else {
            System.out.println("\nStack:");        
            for (int i = top; i >= 0; i-- ) {
            System.out.println(StackArray[i]);           
            }
            
        }

    }
        
    
    public double pop(){
        if (!isEmpty()) {
            return StackArray[top--];
        }
        
        else {
            System.out.println("\nStack is Empty"
                    + ", input values first.");
            return -1;          
        }
    
    }
    

    public double  bottomElement(){
        if (!isEmpty()) {
            return StackArray[0];
            
        }
        else {
            System.out.println("\nStack is Empty"
            + ", so you can't see the bottom.");
            return -1;
         
        }
        
    }
    
    
    public boolean isEmpty(){
         return (top == -1);
    }
    
    
    public boolean isFull(){
        return (top == Size -1);
    }
        
    
}
