// queue 2018.06.14 base
public class Queue{

    private int[] mData;

    private int mHead;
    private int mTail;

    private int mCount;

    public Queue(){
        mData = new int[20];
    }

    void enqueue(int element){
        mData[mCount++] = element;
        mTail++;
    }

    int dequeue(){
        mHead++;
        return mData[--mCount];
    }

    public void dump(){
        for(int i = mHead; i < mTail;i++){
            System.out.println(mData[i]);
        }
    }
}