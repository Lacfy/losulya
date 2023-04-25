import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import controllers.MainController;


public class TestMethods {
    ArrayList<String> methodNames;
    @BeforeEach
    public void initList(){
        this.methodNames = new ArrayList<>();
        Method[] methods = MainController.class.getMethods();
        //forEach 
        for(Method method: methods){
            this.methodNames.add(
                method.getName()
            );

        }

    }
    @Test
    public void testCalckWeightExits() {
       boolean actual = this.methodNames.contains("calcWeight");
        assertTrue(actual);
    }
}
