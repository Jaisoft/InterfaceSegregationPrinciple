public class ShoesMistake implements ProductMistake {

    public String getType() {
        return "shoes";
    }

    public int getAge() {
        throw new UnsupportedOperationException();
    }
}

