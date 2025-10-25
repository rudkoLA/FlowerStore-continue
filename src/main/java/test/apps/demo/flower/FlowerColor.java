package test.apps.demo.flower;

/**
 * Color enum of a flower, represented by hex colors.
 */
public enum FlowerColor {

    /**
     * Red color (#FF0000).
     */
    RED("#FF0000"),

    /**
     * Blue color (#0000FF).
     */
    BLUE("#0000FF"),

    /**
     * Green color (#008000).
     */
    GREEN("#008000"),

    /**
     * White color (#FFFFFF).
     */
    WHITE("#FFFFFF");

    /** The hexadecimal string representation of the color. */
    private final String hexColor;

    /**
     * Creates FlowerColor with the specified hexadecimal color code.
     *
     * @param hexColor hex code of the color
     */
    FlowerColor(String hexColor) {
        this.hexColor = hexColor;
    }

    /**
     * Returns the hex color code of this.
     *
     * @return the hex color code as a string
     */
    @Override
    public String toString() {
        return hexColor;
    }
}