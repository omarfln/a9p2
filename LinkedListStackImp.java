public class LinkedListStackImp {

    private class Node {

        Object data;
        Node ptr;
    }

    Node top;
    int size=0;
    LinkedListStackImp() { this.top = null; }

    public void push(Object x)
    {
        Node temp = new Node();

        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
        temp.data = x;
        temp.ptr = top;
        top = temp;
        ++size;
    }

    public boolean isEmpty() { return top == null; }

    public Object peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Your stack is empty!!");
            return -1;
        }
    }

    public Object pop()
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return null;
        }
        Node tmp = top;
        top = (top).ptr;
        --size;
        return tmp.data;
    }

    public int getSize(){
        return size;
    }

    public void display()
    {
        if (isEmpty()) {
            System.out.print("\nStack is empty");
            return ;
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data);
                temp = temp.ptr;
                if(temp != null)
                    System.out.print(" -> ");
            }
        }
    }


    public static void main (String [] args){
        LinkedListStackImp s= new LinkedListStackImp();
        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");
        System.out.println("Size is: "+ s.getSize());
        System.out.println("Pop Item: "+s.pop());
        s.push("d");
        s.push("e");
        System.out.println("Peak val is: "+s.peek());
        s.display();

    }

}
