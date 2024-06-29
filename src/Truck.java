public class Truck extends MotorTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateType() {
        for (int i = 1; i <= getWheelsCount(); i++) {
            System.out.println("Меняем " + i + " покрышку у " + getModelName());
        }
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у " + getModelName());
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп у " + getModelName());
    }

    @Override
    public void service() {
        updateType();
        checkEngine();
        checkTrailer();
    }
}