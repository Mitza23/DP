package ubb.mihai.service;

import ubb.mihai.entities.Cake;
import ubb.mihai.repository.Repository;
import ubb.mihai.utils.CakeBuilder;
import ubb.mihai.utils.Logger;

public class CakeServiceProxy extends CakeService {
	Logger logger;

	public CakeServiceProxy(CakeBuilder cakeBuilder) {
		super(cakeBuilder);
		this.logger = Logger.getInstance();
	}

	public CakeServiceProxy(Repository<Cake> repository, CakeBuilder cakeBuilder) {
		super(repository, cakeBuilder);
		this.logger = Logger.getInstance();
	}

	@Override
	public void add(String layers) {
		logger.log("Adding cake with " + layers.split(" ").length + " layers");
		super.add(layers);
	}

	@Override
	public void save() {
		logger.log("Saving repository");
		super.save();
	}
}
