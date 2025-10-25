package test.apps.demo.flower;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#008000"), WHITE("#FFFFFF");

    private final String hexColor;

    FlowerColor(String hexColor) {
        this.hexColor = hexColor;
    }

    @Override
    public String toString() {
        return hexColor;
    }
}