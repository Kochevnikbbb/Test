package kg.geektech.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReversWordTest {
    ReversWords reversWords;
    @Before
    public void setup(){
        reversWords = new ReversWords();
    }

    @Test
    public void reversTwoWords(){
        assertEquals("Two One",reversWords.reversString("One Two"));
    }

    @Test
    public void reversManyWords(){
        assertEquals("Two One Three Four Five",
                reversWords.reversString("One Two Three Four Five"));
    }

    @Test
    public void reversSpacedWords(){
        assertEquals("Two One Three Four Five",
                reversWords.reversString("  One Two Three Four Five  "));
    }
}
