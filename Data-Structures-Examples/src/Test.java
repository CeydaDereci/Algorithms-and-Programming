public class Test {
    public static void main(String[] args) {
        SimpleLinkedList linkedList;
        linkedList = new SimpleLinkedList();

        SimpleQueue queue;
        queue = new SimpleQueue();

        SimpleStackWithQueue stack;
        stack = new SimpleStackWithQueue(queue);

        System.out.println("---------------------");
        System.out.println("Simple Link List");
        System.out.println("---------------------");
        System.out.println(linkedList.isEmpty());
        linkedList.addToTail("a");
        linkedList.addToTail("b");
        linkedList.addToTail("c");
        System.out.println(linkedList.isEmpty());
        System.out.println("Add to tail");
        System.out.println(linkedList);
        System.out.println("Get index");
        System.out.println(linkedList.getIndex(1).getData());
        System.out.println("Remove from head");
        linkedList.removeFromHead();
        System.out.println(linkedList);
        System.out.println("---------------------");
        System.out.println("Simple Queue");
        System.out.println("---------------------");
        System.out.println(queue.isEmpty());
        queue.enqueue("x");
        queue.enqueue("y");
        queue.enqueue("z");
        System.out.println(queue.isEmpty());
        System.out.println("Enqueue");
        System.out.println(queue.linkedList.toString());
        System.out.println("Dequeue");
        queue.dequeue();
        System.out.println(queue.linkedList.toString());
        System.out.println("---------------------");
        System.out.println("Simple Stack With Queue");
        System.out.println("---------------------");
        stack.push("a");
        System.out.println("Push");
        System.out.println(stack.toString());
        while(!stack.isEmpty()) {
            stack.pop();
            System.out.println(stack.toString());
        }
        System.out.println("Pop");

        System.out.println(stack.toString());
        System.out.println("---------------------");

    }
}