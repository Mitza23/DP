package ubb.mihai.utils;

import java.util.ArrayList;
import java.util.List;

import ubb.mihai.entities.Cake;

public class CakeBuilder {
	private Cake cake;

	private List<String> layers;

	public CakeBuilder createCake() {
		cake = new Cake();
		layers = new ArrayList<>();
		return this;
	}

	public CakeBuilder addLayer(String layer) {
		layers.add(layer);
		return this;
	}

	public Cake buildCake() {
		cake.setLayers(layers);
		return cake;
	}
}
