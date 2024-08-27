public class Bicycle extends WheeledTransport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateType() {
        for (int i = 1; i <= getWheelsCount(); i++) {
            System.out.println("Меняем " + i + " покрышку у " + getModelName());
        }
    }

    @Override
    public void service() {
        updateType();
    }
}