public class Eye extends Organ {
    private String color;

    public Eye(String name, String medicalCondition, String color) {
        super(name, medicalCondition);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   @Override
    public void printOrgan() {
        super.printOrgan();
        System.out.println("Color : " + this.color);
    }

    public void closeEye() {
        System.out.println(getName() + " closed");
    }

    public void openEye() {
        System.out.println(getName() + " opened");
    }
}
