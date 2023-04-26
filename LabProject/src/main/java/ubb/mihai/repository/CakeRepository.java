package ubb.mihai.repository;

import java.util.ArrayList;
import java.util.List;

import ubb.mihai.entities.Cake;

public abstract class
CakeRepository implements Repository<Cake> {
	protected List<Cake> list;

	public CakeRepository() {
		this.list = new ArrayList<>();
	}

	@Override
	public void add(Cake entity) {
		list.add(entity);
	}
}
