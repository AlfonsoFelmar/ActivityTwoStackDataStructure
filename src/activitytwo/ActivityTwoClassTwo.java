package activitytwo;
/**
 *
 * @author felmar
 */
public class ActivityTwoClassTwo extends ActivityTwoClassOne{

    public ActivityTwoClassTwo(int Size) {
        super(Size);
    }
    
    public void countElements(){
  
        if (!isEmpty()) {
            int sum = top + 1;
            System.out.println("\nElements in stack: " + sum);
        }
        
        else {
            System.out.println("\nStack is empty!");  
        }
    }
        
}
