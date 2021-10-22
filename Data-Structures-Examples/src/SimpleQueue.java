public class SimpleQueue {

    SimpleLinkedList linkedList;

    public SimpleQueue(){
        this.linkedList = new SimpleLinkedList();
    }


    public void enqueue(String data){
        Node newNode = new Node(data);
        Node temp = linkedList.getHead();
        linkedList.setHead(newNode);
        newNode.setNext(temp);
    }

    public String dequeue() {
        Node temp = linkedList.getHead();
        Node prev = null;
        String data = "";

        while(temp.getNext() != null){
            prev = temp;
            temp = temp.getNext();
        }
        data = temp.getData();
        if(prev != null){
            prev.setNext(null);
        } else {
            linkedList.setHead(null);
        }
        return data;

        /*while(temp.getNext().getNext() != null){
            temp = temp.getNext();
        }
        data = temp.getNext().getData();
        temp.setNext(null);

        return data;*/
    }


    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

}
