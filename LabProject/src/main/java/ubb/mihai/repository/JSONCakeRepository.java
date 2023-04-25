package ubb.mihai.repository;



public class JSONCakeRepository extends CakeRepository {
    @Override
    public void save() {
        // create JAXB context and marshaller
        JAXBContext context = JAXBContext.newInstance(Cake.class);
        Marshaller marshaller = context.createMarshaller();

        // set marshaller properties
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // marshal the list of cakes to XML and save it to file
        marshaller.marshal(cakes, new FileWriter(fileName));
    }
}
