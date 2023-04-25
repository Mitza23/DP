package ubb.mihai.service;

import ubb.mihai.entities.Cake;
import ubb.mihai.utils.Logger;

import java.util.List;

public class CakeServiceProxy extends CakeService{
    Logger logger;

    @Override
    public void add(List<String> layers) {
        logger.log("Adding cake with " + layers.size() + " layers");
        super.add(layers);
    }

    @Override
    public void save() {
        logger.log("Saving repository");
        super.save();
    }

    public CakeServiceProxy() {
        this.logger = Logger.getInstance();
    }
}
