package example.estructuras;

abstract class AbstractCustomLinkedList {

    private int value;
    private AbstractCustomLinkedList nextElement;

    public AbstractCustomLinkedList(int value, AbstractCustomLinkedList nextElement) {
        this.value = value;
        this.nextElement = nextElement;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNextElement(AbstractCustomLinkedList nextElement) {
        this.nextElement = nextElement;
    }

    public AbstractCustomLinkedList getNextElement() {
        return nextElement;
    }

    public void addLastElement(int value) {}

    public void addFirstElement(int value) {}

    public void modifyElementByValue(int newValue, int currentValue){}

    public int getValueLastElement() {
        return this.value;
    }

}
