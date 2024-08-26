package activitytwo;

import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author felmar
 */
public class ActivityTwoClassThree extends ActivityTwoClassTwo{
    
    public ActivityTwoClassThree(int Size) {
        super(Size);
    }
    
    public void removeDuplicates(){
        
        Set<Double> uniques = new HashSet<>();
        int newTop = -1;
        boolean hasDuplicate = false;
        
        for (int i = 0; i <= top; i++) {
            if (uniques.contains(StackArray[i])){
                System.out.println("\nDuplicate Detected! " + StackArray[i]);
                StackArray[++newTop] = StackArray[i];
                top = newTop;        
                hasDuplicate = true;
            }
            uniques.add(StackArray[i]);
        }
        
        if(hasDuplicate == false){
            System.out.println("\nNo Duplicate Detected!");
        }
        
    }
    
}
