package Uebung5;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StackTest<T>{


    ConcreteStapel<Integer> s;
    @BeforeEach
    public void init() {
        ConcreteStapel<Integer> s = new ConcreteStapel<>();
    }
    @Test
    public void popTest(){
        s.push(1);
        s.push(2);
        s.pop();
        assertEquals(1,s.top());
    }

    @Test
    public void isEmptyPush(){
        // isEmpty(push(s e))
        ConcreteStapel<Integer> s = new ConcreteStapel<>();
        s.push(1);
        assertFalse(s.isEmpty());
    }

    @Test
    public void topPush(){
        //top(push(s e))
        s = new ConcreteStapel<Integer>();
        s.push(1);
        assertEquals(1,s.top());
    }

    @Test
    public void topPopPush(){
    //top(pop(push(s e)))
        s = new ConcreteStapel<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        assertEquals(2,s.top());
    }
}
