package dragons;

public enum BoatSize {
    SMALL(10), LARGE(20);

    private int numberOfPerson;

    BoatSize(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }
}
