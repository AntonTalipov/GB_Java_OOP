package Practise2;

import Practise2.Actor;

import java.util.List;
import java.util.Queue;

public interface MarketBehaviour {
    public void acceptToMarket(Actor actor);
    public void releaseFromMarket(Actor actor);
    public void update();
}
