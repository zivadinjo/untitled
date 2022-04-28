package practice.inheritance.day51;

public class Season {
    String name;
    double highestAverage;
    double lowestAverage;

    public Season(String name, double highestAverage, double lowestAverage) {

        this.name = name;
        this.highestAverage = highestAverage;
        this.lowestAverage = lowestAverage;
    }
        public void activity(){

        }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAverage=" + highestAverage +
                ", lowestAverage=" + lowestAverage +
                '}';
    }
}
