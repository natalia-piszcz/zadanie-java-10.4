public class Ram extends OverrideableComponent implements CapacityComponent{


    private String capacity;

    public Ram(String name, String producer, int number, double recommendedTemp, double maxTemp, double timing, String capacity) {
        super(name, producer, number, recommendedTemp, maxTemp, timing, 15);
        this.capacity = capacity;
    }

    @Override
    public String getCapacity() {
        return capacity;
    }

}
