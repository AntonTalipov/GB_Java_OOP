package Practise2;

import Practise2.Actor;

import java.util.Queue;

public interface QueueBehaviour {
    public void takeQueue(Actor actor);
    public void takeOrders();
    public void giveOrders();
    public void releaseFromQueue();
}
