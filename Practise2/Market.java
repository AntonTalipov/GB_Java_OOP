package Practise2;

import Practise2.Actor;
import Practise2.MarketBehaviour;
import Practise2.QueueBehaviour;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    List<Actor> actors= new ArrayList<>();
    Queue<Actor> actorsQueue = new LinkedList<>();


    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);


    }
    @Override
    public void takeQueue(Actor actor) {
        actorsQueue.add(actor);

    }

    @Override
    public void takeOrders() {
        Actor actor = actorsQueue.peek();
        actor.setMakeOrder();
//        Actor actor = actorsQueue.peek();
//        if(actor instanceof Human){
//            ((Human)actor).setMakeOrder();
    }

    @Override
    public void giveOrders() {
        Actor actor = actorsQueue.peek();
        actor.setTakeOrder();
//        Actor actor = actorsQueue.peek();
//        if(actor instanceof Human){
//            ((Human)actor).setTakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        actorsQueue.remove();

    }


    @Override
    public void releaseFromMarket(Actor actor) {
            actors.remove(actor);

    }

    @Override
    public void update() {

    }
}
