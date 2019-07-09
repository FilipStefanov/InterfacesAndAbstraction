package CarShop;

public class Audi extends CarImpl implements Rentable{
    private Integer minRentday;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String country, Integer minRentday, Double pricePerDay) {
        super(model, color, horsePower, country);
        this.minRentday = minRentday;
        this.pricePerDay = pricePerDay;
    }


    @Override
    public Integer getMinRentDay() {
        return minRentday;
    }

    @Override
    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        String format = "Minimum rental period of %d days. Price per day %f";

        return super.toString()
                + System.lineSeparator()
                + String.format(format, this.getMinRentDay(), this.getPricePerDay());
    }

}
