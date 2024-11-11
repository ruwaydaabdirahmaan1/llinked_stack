package CA223.linkstack;

public class NODE <T>{

    public T element; // have Value
    public NODE<T> next; // have Address
    // Construct
    public NODE(){
        element =null;
        next =null;
    }
    public NODE(T element){
        this.element = element;
        next = null;

    }
    // Methods / property
    // get / set
    public NODE<T> getNext() {
        return next;
    }
    public void setNext(NODE<T> next){
        this.next = next;
    }
    public T getElement() {
        return element;

    }
    public void setElement(T element)
    {
        this.element = element;
    }
}
