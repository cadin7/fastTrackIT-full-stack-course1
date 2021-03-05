package ro.fasttrackit.course1;

import java.util.Objects;

public class Table {
    private final int height;
    private final String colour;

    public Table(int height, String colour) {
        this.height = height;
        this.colour = colour;
    }

    public int getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return height == table.height && Objects.equals(colour, table.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, colour);
    }

    @Override
    public String toString() {
        return "Table{" +
                "height=" + height +
                ", colour='" + colour + '\'' +
                '}';
    }
}
