package losulya.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.security.auth.kerberos.DelegationPermission;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllers.MainController;

//megjegyzés1
public class TestWeight {
    MainController mc;
    @BeforeEach
    public void initEach(){
        mc = new MainController();
    }
    //Első teszt
    @Test
    public void testCalckWeight01 () {
        double actual = mc.calcWeight(30, 35);
        double excpected = 2.6521848951755493;
        assertEquals(excpected, actual, 0.01);
    }
    @Test
    public void testCalckWeight02 () {
        double actual = mc.calcWeight(130, 135);
        double excpected = 192.0939631220005;
        assertEquals(excpected, actual);
    }
    @Test
    public void testCalckWeight03 () {
        double actual = mc.calcWeight(150, 160);
        double excpected = 303.1068451629199;
        assertEquals(excpected, actual);
    

    }
}  

    

