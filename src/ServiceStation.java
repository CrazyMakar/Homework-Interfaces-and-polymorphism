public class ServiceStation {

    public void check(Transport... transport) {
        for (Transport t : transport) {
            t.service();
        }
    }
}