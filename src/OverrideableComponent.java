public abstract class OverrideableComponent extends Component {

    private double recommendedTemp;
    private double maxTemp;
    private double timing;
    private double temperatureIncreasePer100Mhz;
    private double currentTemp;

    public OverrideableComponent(String name, String producer, int number, double recommendedTemp, double maxTemp, double timing, double temperatureIncreasePer100Mhz) {
        super(name, producer, number);
        this.recommendedTemp = recommendedTemp;
        this.maxTemp = maxTemp;
        this.timing = timing;
        this.temperatureIncreasePer100Mhz = temperatureIncreasePer100Mhz;
        this.currentTemp = recommendedTemp;
    }

    void override() {
        if (currentTemp + temperatureIncreasePer100Mhz > maxTemp) {
            throw new TemperatureHighException();
        }
        timing += 100;
        currentTemp +=temperatureIncreasePer100Mhz;
    }


    @Override
    public String toString() {
        return "OverrideableComponent{" +
                "recommendedTemp=" + recommendedTemp +
                ", maxTemp=" + maxTemp +
                ", timing=" + timing +
                ", temperatureIncreasePer100Mhz=" + temperatureIncreasePer100Mhz +
                ", currentTemp=" + currentTemp +
                super.toString() +
                '}';
    }
}

