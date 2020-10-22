package deqo.dcha.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    Item item = new Item();
    int i=6;

    @Test
    public void getItem() {
        assertEquals(item,item);
    }

    @Test
    public void setItem() {
        assertEquals(item.number=i,i);
    }
}