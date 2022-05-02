public class Heart extends Organ{
    private int heartRate;

    public Heart(String name, String medicalCondition, int heartRate) {
        super(name, medicalCondition);
        this.heartRate = heartRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    @Override
    public void printOrgan() {
        super.printOrgan();
        System.out.println("Heart rate : " + this.heartRate);
    }
}
