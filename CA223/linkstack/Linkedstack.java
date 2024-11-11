package CA223.linkstack;
import java.util.EmptyStackException;

import java.util.Scanner;

public class Linkedstack <T> {
    public int count;
    public NODE<T> top; // head

    // Constructors
    public Linkedstack() {

        count = 0;
        top = null;


    }

    public void push(T element) {
        NODE<T> temp = new NODE<>(element);
        temp.setNext(top);
        top = temp;
        count++;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public T pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }


    public T peek() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        return top.getElement();
    }
    public  void  display(){
        if (isEmpty())
            System.out.println("Stack is empty");
        else {
            NODE<T> currentAddress = top;
            while (currentAddress != null){
                System.out.println(currentAddress.getElement());
                currentAddress = currentAddress.getNext();
            }
        }
    }

    public int size() {
        return count;
    }

    public void printStack() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        NODE<T> current = top;
        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();

        }
    }

    boolean searchElements(T searchdate) {
        NODE<T> current = top;
        boolean found = false;
        while (current != null) {
            if(searchdate.equals(current.getElement()))
                found = true;
            current = current.getNext();
        }
        return found;

    }

    public int counter(T element) {
        NODE<T> current = top;
        int number = 0;
        while (current != null) {
            if (element.equals(current.getElement()))
                number++;
        }
        return number;
    }

    // RemovedElement
    public void deleteElement() {
        if (count <= 2){
            System.out.println("stackan laba waa ka yaryahay");
            return;
        }
        int meddleElement = count/2;
        NODE <T> current = top;

        while (current.getNext() != null){
            current= current.getNext();
        }
        top.setNext(current);
        count=2;
    }
    // method displayRemovedElement
    public void displayRemovedElement(){
        NODE<T> current = top;
        while (current != null){
            System.out.println(current.element);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Linkedstack<String> stack = new Linkedstack<>();
        stack.push("nuurto");
        stack.push("maxamad");
        stack.push("Asiyo");
        stack.push("cabdillaahi");
        stack.push("nuur");
        stack.push("aLI");
        stack.push("maymuun");
        stack.push("asiyo ali macaac");
        System.out.println("before removed element");


        stack.display();
        stack.displayRemovedElement();
        stack.deleteElement();
        System.out.println("After Removed element");
        stack.displayRemovedElement();


    }
}


