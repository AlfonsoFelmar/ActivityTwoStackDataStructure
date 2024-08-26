package activitytwo;
/**
 *
 * @author felmar
 */
public class ActivityTwoClassFive extends ActivityTwoClassFour {
    
    public ActivityTwoClassFive(int Size) {
        super(Size);
    }
    
    public void stackStack(){ 
        for (int i = 0; i <= top; i++) {
            if (!isFull()) {
                System.out.println("\nAdded stack to newstack: "
                + StackArray[i]);
                newStack.push(StackArray[i]);
            } 
            
            else {
                System.out.println("\nYou're stack is full");
            }
            
        }

    }
    
}
