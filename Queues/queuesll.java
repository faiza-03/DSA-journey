// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node f; 
    Node r;
    int count;

    public myQueue() {
        // Initialize your data members
        f = null;
        r = null;
        count = 0;
        
    }

    public boolean isEmpty() {
        // check if the queue is empty
        if(f==null)
            return true;
        return false;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node temp = new Node(x);
        if(isEmpty())
            f = r = temp;
        else
        {
            r.next = temp;
            r = temp;
        }
        count++;
        
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(isEmpty())
            return;
        f = f.next;
        count--;
        
        if(f==null)
            r = null;
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(!isEmpty())
            return f.data;
        return -1;
    }

    public int size() {
        // Returns the current size of the queue.
        return count;
    }
}
