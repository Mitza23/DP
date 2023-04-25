package ubb.mihai.entities;

import java.util.ArrayList;
import java.util.List;

public class Cake {
	List<String> layers;

	public Cake() {
		this.layers = new ArrayList<>();
	}

	public void setLayers(List<String> layers) {
		this.layers = layers;
	}
}
