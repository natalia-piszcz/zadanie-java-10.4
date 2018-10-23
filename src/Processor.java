public class Processor extends OverrideableComponent {
    private double memory;

    public Processor(String name, String producer, int number, double recommendedTemp, double maxTemp, double timing, double memory) {
        super(name, producer, number, recommendedTemp, maxTemp, timing, 10);
        this.memory = memory;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "memory=" + memory +
                super.toString() +
                '}';
    }
}
