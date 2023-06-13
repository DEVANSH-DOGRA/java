import java.util.*;
class queue1{
    public static void main(String args[])
{
    Queue<Integer>q=new LinkedList<Integer>();
    Queue<Integer>pq=new PriorityQueue<Integer>();
    Deque<Integer>dq=new ArrayDeque<Integer>();
    dq.addFirst(3);
    dq.addFirst(2);
    dq.addFirst(1);
    dq.addLast(4);
    dq.addLast(5);
    while(dq.isEmpty()==false){
    //     try{
    //              System.out.print(dq.getFirst()+" ");
    //     }
    //    catch(Exception e){

    //    }
       System.out.print(dq.peekFirst());
       dq.pollFirst();
    }
}
}