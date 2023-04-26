package ubb.mihai.service;

import ubb.mihai.entities.Cake;
import ubb.mihai.repository.Repository;
import ubb.mihai.utils.CakeBuilder;

public class CakeService {
    Repository<Cake> repository;
    CakeBuilder cakeBuilder;

    public CakeService(CakeBuilder cakeBuilder) {
        this.cakeBuilder = cakeBuilder;
    }

    public CakeService(Repository<Cake> repository, CakeBuilder cakeBuilder) {
        this.repository = repository;
        this.cakeBuilder = cakeBuilder;
    }

    public void add(String layers) {
        String[] layerList = layers.split(" ");
        cakeBuilder.createCake();
        for (String layer : layerList) {
            cakeBuilder.addLayer(layer);
        }
        repository.add(cakeBuilder.buildCake());
    }

    public void save() {
        repository.save();
    }

    public void setRepository(Repository<Cake> repository) {
        this.repository = repository;
    }
}
