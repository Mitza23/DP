package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Publisher publisher = new Publisher();
		for(int i = 0 ; i < 15 ; i++) {
			Subscriber s = new SubscriberImpl(i);
			Event e;
			int r = i % 4;
			switch (r){
				case 0:
					e = Event.SALE;
					break;
				case 1:
					e = Event.RESTOCK;
					break;
				case 2:
					e = Event.LOW_STOCK;
					break;
				case 3:
					e = Event.NEW_ENTRY;
					break;
				default:
					e = Event.SALE;
			}
			publisher.subscribe(s, e);
		}
		publisher.changeState(Event.NEW_ENTRY);
		System.out.println("\n\n");
		publisher.changeState(Event.RESTOCK);
	}
}