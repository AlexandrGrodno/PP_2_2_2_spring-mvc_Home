package web.model;

public class Car {
    private String model;
    private String series;
    private int age;

    public Car(){}

    public Car(String model, String series, int age) {
        this.model = model;
        this.series = series;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", age=" + age +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
