package homework4.task_2;



public class MainTask_2 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("apple");
        myStack.push("banana");
        myStack.push("pear");
        myStack.push("grape");
        System.out.println(myStack.getElements());
        System.out.println(myStack.pop());
        System.out.println(myStack.getElements());
        System.out.println(myStack.peek());

    }
}
