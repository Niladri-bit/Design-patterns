package AmazonNotification.observable;

import java.util.ArrayList;
import java.util.List;

import AmazonNotification.observer.NotificationObserver;

public class IphoneStockObservable implements StocksObservable{
	
	public List<NotificationObserver> observerList = new ArrayList<>();
	public int StockCount = 0;

	@Override
	public void add(NotificationObserver obs) {
		observerList.add(obs);
		
	}

	@Override
	public void remove(NotificationObserver obs) {
		observerList.remove(obs);
		
	}

	@Override
	public void notifySubscriber() {
		for(NotificationObserver obs: observerList) {
			obs.update();
		}
	}

	@Override
	public void setStock(int NewStockCount) {
		if(StockCount == 0) {
			StockCount = StockCount + NewStockCount;
			notifySubscriber();
		}
		
	}

	@Override
	public int getStock() {
		System.out.println("Stock count is "+ StockCount);
		return StockCount;
	}

}
