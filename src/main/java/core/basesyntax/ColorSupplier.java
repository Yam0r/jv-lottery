package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] colors = Color.values();
        int randomIndex = new Random().nextInt(colors.length);
        return colors[randomIndex].toString();
    }

    enum Color {
        RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE;
    }
}
