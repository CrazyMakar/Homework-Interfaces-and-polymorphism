public abstract class MotorTransport extends WheeledTransport {

    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public abstract void checkEngine();
}

