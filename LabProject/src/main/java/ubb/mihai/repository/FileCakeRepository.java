package ubb.mihai.repository;

import ubb.mihai.entities.Cake;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileCakeRepository extends CakeRepository {
	@Override
	public void save() {
		 try (BufferedWriter bw = new BufferedWriter(new FileWriter("cakes.txt", false))) {
			 for(Cake cake: list) {
				 bw.write("cake of " + cake.getSize() + " layers:\n" );
				 for (int i = cake.getLayers().size() - 1; i >=0 ; i --) {
					 bw.write("\t" + cake.getLayers().get(i) + "\n");
				 }
 			 }
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
	}
}
