public class Hdd extends Component implements CapacityComponent {
    private String capacity;

    public Hdd(String name, String producer, int id, String capacity) {
        super(name, producer, id);
        this.capacity = capacity;
    }

    @Override
    public String getCapacity() {
        return capacity;
    }
}
