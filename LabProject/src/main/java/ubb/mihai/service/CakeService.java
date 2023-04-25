package ubb.mihai.service;

import ubb.mihai.entities.Cake;
import ubb.mihai.repository.Repository;
import ubb.mihai.utils.CakeBuilder;

import java.util.List;

public class CakeService {
    Repository<Cake> repository;

    CakeBuilder cakeBuilder = new CakeBuilder();

    public void add(List<String> layers) {
        cakeBuilder.createCake();
        for(String layer: layers) {
            cakeBuilder.addLayer(layer);
        }
        repository.add(cakeBuilder.buildCake());
    }

    public void save() {
        repository.save();
    }
}
