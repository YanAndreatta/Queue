package main;

import dataStructure.Queue;

public class App 
{
    public static void main( String[] args )
    {
       Queue myQueue = new Queue(1);

    //    myQueue.getFirst();
    //    myQueue.getLast();
    //    myQueue.getLength();

    //    myQueue.print();

       myQueue.enqueue(2);
       myQueue.enqueue(3);
    //    myQueue.getFirst();
    //    myQueue.getLast();
    //    myQueue.getLength();

    //    myQueue.print();

    System.out.println(myQueue.dequeue().getValue());
    System.out.println(myQueue.dequeue().getValue());
    System.out.println(myQueue.dequeue().getValue());

    }
}
