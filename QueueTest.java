public class QueueTest{
    public static void main(String[] args){
        Queue queue = new Queue();

        for(int i = 4; i < 10; i ++){
            queue.enqueue(i);
        }

        for(int i = 0; i < 3; i ++){
            queue.dequeue();
        }

        queue.dump();
    }
}