package org.example;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Publisher {
	private Map<Event, List<Subscriber>> subscribers;
	private String state;

	public Publisher() {
		subscribers = new EnumMap<>(Event.class);
		state = "inital state";
	}

	public void subscribe(Subscriber s, Event e) {
		if (subscribers.containsKey(e)) {
			subscribers.get(e).add(s);
		}
		else {
			List<Subscriber> list = new ArrayList<>();
			list.add(s);
			subscribers.put(e, list);
		}
	}

	public void unsubscribe(Subscriber s, Event e) {
		subscribers.get(e).remove(s);
	}

	public void notifySubscribers(Event e) {
		for (Subscriber s : subscribers.get(e)) {
			s.update(state);
		}
	}

	public void changeState(Event e) {
		state = "updated state for event:" + e;
		notifySubscribers(e);
	}
}
