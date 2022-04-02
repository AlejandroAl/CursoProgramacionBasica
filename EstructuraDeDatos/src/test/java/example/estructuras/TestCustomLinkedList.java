package example.estructuras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCustomLinkedList {

    @Test
    void createCustomLinkedList() {
        CustomLinkedList linkedList = new CustomLinkedList(1, null);
        assertTrue(1 == linkedList.getValue());
    }

    @Test
    void checkFirstValueAddedCustomLinkedList() {
        CustomLinkedList linkedList = new CustomLinkedList(1, null);
        linkedList.addFirstElement(2);
        assertTrue(2 == linkedList.getValue());
    }

    @Test
    void checkLastValueAddedCustomLinkedList() {
        CustomLinkedList linkedList = new CustomLinkedList(1, null);
        linkedList.addLastElement(10);
        assertTrue(10 == linkedList.getValueLastElement());
    }

    @Test
    void checkValueModified() {
        CustomLinkedList linkedList = new CustomLinkedList(1, null);
        linkedList.addLastElement(12);
        linkedList.modifyElementByValue(11, 12);
        assertTrue(11 == linkedList.getNextElement().getValue());
    }

    

}
