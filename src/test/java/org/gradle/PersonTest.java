package org.gradle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person();
        assertEquals("Larry", person.getName());
    }
}
