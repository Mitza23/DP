package ubb.mihai.repository;

import java.util.List;

import ubb.mihai.entities.Cake;

public abstract class CakeRepository implements Repository<Cake> {
	protected List<Cake> list;

	@Override
	public void add(Cake entity) {
		list.add(entity);
	}
}
