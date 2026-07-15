public class CallStack {

    static class Frame {

        String functionName;
        Frame next;

        Frame(String functionName) {

            this.functionName = functionName;
            this.next = null;
        }
    }

    Frame top = null;

    public void push(String functionName) {
        Frame newFrame = new Frame(functionName);
        newFrame.next = top;
        top = newFrame;
    }

    public String pop() {

        if (isEmpty()) {
            return "No Active Function";
        }
        String name = top.functionName;
        top = top.next;
        return name;
    }

    public String peek() {
        if (isEmpty()) {
            return "Stack is Empty";
        }
        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Call Stack is Empty");
            return;
        }

        Frame temp = top;
        while (temp != null) {

            System.out.println(temp.functionName);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        CallStack cs = new CallStack();

        cs.push("main()");
        cs.push("login()");
        cs.push("validateUser()");
        cs.push("checkPassword()");

        System.out.println("Current Call Stack:");
        cs.display();
        System.out.println("\nCurrent Function : " + cs.peek());
        System.out.println("Function Returned : " + cs.pop());
        System.out.println("\nCall Stack After Pop:");

        cs.display();
    }
}