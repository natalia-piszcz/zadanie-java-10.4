public abstract class Component {
    private String name;
    private String producer;
    private int number;

    public Component(String name, String producer, int number) {
        this.name = name;
        this.producer = producer;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", number=" + number +
                '}';
    }
}
