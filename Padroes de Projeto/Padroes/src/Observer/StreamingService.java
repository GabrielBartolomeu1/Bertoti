package Observer;

public class StreamingService {
    public EventManager events;
    private String service;

    public StreamingService(String service) {
        this.service = service;
        this.events = new EventManager("newRelease", "discount", "featureUpdate");
    }

    public void addNewRelease(String title) {
        System.out.println(service + " lançou um novo título: " + title);
        events.notify("newRelease", "Novo lançamento disponível: " + title);
    }

    public void addDiscount(String discountInfo) {
        System.out.println(service + " tem uma nova promoção: " + discountInfo);
        events.notify("discount", "Aproveite a promoção: " + discountInfo);
    }

    public void addFeatureUpdate(String featureInfo) {
        System.out.println(service + " tem uma nova funcionalidade: " + featureInfo);
        events.notify("featureUpdate", "Nova funcionalidade disponível: " + featureInfo);
    }
}
