package activitytwo;
/**
 *
 * @author felmar
 */
public class ActivityTwoClassFour extends ActivityTwoClassThree{
    
    public ActivityTwoClassFour(int Size) {
        super(Size);
    }
    
    public double peek(){
        
        if (!isEmpty()) {
            return StackArray[top];
        }
        
        else {
            System.out.println("\nStack is Empty"
                    + ", so you can't peek anything.");
            return -1;
        }
        
    }
    
}
