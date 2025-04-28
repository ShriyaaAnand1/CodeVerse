public class CircularQueue {
    private int[] queue; 
    private int front;    
    private int rear;   
    private int size;     
    private int capacity; 
    public MyCircularQueue(int k) {
        queue = new int[k];
        capacity = k;
        front = 0;
        rear = 0;
        size = 0;
    }
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        queue[rear] = value;
        rear = (rear + 1) % capacity; 
        size++;
        return true;
    }
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity; 
        size--;
        return true;
    }
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[(rear - 1 + capacity) % capacity];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
}
