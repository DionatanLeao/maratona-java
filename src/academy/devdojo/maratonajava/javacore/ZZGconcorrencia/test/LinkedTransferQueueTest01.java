package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Name One"));
        System.out.println(tq.offer("Name Two", 10, TimeUnit.SECONDS));
        tq.put("Name Three");
        if (tq.hasWaitingConsumer()) {
            tq.transfer("Name Four");
        }
        System.out.println(tq.tryTransfer("Name Five"));
        System.out.println(tq.tryTransfer("Name Six", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.remainingCapacity());
    }
}
