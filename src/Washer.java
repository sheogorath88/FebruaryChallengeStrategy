public class Washer {
    private WashDishes washDishes;

    public Washer(WashDishes washDishes) {
        this.washDishes = washDishes;
    }

    public void wash(){
        washDishes.washDishes();
    }
}
