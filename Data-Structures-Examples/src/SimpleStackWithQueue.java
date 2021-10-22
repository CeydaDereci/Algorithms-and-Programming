public class SimpleStackWithQueue {

    private SimpleQueue queue;

    public SimpleStackWithQueue(SimpleQueue queue){
        this.queue = queue;
    }
    public void push(String data) {
        SimpleQueue q2 = new SimpleQueue();
        Node node = new Node(data);
        q2.enqueue(data);
        while (queue.linkedList.getHead().getNext() != null) {
            String str = queue.dequeue();
            q2.enqueue(str);
        }
        q2.enqueue(queue.linkedList.getHead().getData());
        queue = q2;

    }

    public String pop(){
        return queue.dequeue();
    }

    public String toString(){
        return queue.linkedList.toString();
    }
    public  boolean isEmpty(){
        return queue.isEmpty();
    }


}
