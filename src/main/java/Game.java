public class Game implements Product, RestrictedProduct {

    private int age;


    public String getType() {
        return "game";
    }


    public int getAge() {
        return age;
    }

    // get and set..

}
