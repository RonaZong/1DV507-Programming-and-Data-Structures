//package xz222bb_assign1.Queue;
//
//import java.util.Iterator;
//
//public class LinkedQueue implements IntQueue {
//    private int[] queue;
//    private int size = 0;
//
//    public LinkedQueue() {
//        queue = new int[8];
//    }
//
//    @Override
//    public int size() {
//        return queue.length;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return queue.length == 0;
//    }
//
//    @Override
//    public void enqueue(int element) {
//        queue[size++] = element;
//    }
//
//    @Override
//    public int dequeue() {
//        checkIndex(index,size);
//        for (int i=index;i<size;i++)
//            values[i] = values[i+1];
//        size--;
//        queue[];
//        return 0;
//    }
//
//    @Override
//    public int first() {
//        return queue[0];
//    }
//
//    @Override
//    public int last() {
//        return queue[size];
//    }
//
//    @Override
//    public Iterator<Integer> iterator() {
//        return null;
//    }
//
//    protected boolean checkIndex(int index, int upper){
//        if (index < 0 || index >= upper) {
//            String msg = "Index = "+index+", Upper boundary = "+upper;
//            System.err.println(msg);
//            return false;
//        }
//        return true;
//    }
//}
