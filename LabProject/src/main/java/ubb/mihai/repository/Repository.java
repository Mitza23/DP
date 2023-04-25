package ubb.mihai.repository;

public interface Repository<T> {
	public void add(T entity);

	public void save();
}
