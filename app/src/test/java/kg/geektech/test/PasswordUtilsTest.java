package kg.geektech.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PasswordUtilsTest {

    private PasswordUtils passwordUtils;

    @Before
    public void setup(){
        passwordUtils = new PasswordUtils();
    }

    @Test
    public void moreSixSymbols(){
        assertFalse(passwordUtils.isStrongPassword("A1"));
        assertTrue(passwordUtils.isStrongPassword("A1Pcsdvd"));
    }
}
