import by.gsu.epamlab.Material;
import by.gsu.epamlab.Subject;

public class Runner {
    public static void main(String[] args) {
        // 1. Create the object which represents a steel wire having the volume 0.03 cubic meters.
        Subject wire = new Subject("wire", Material.STEEL, 0.03);

        // 2. Output the object content to the console, using toString( ) method.
        System.out.println(wire);

        // 3. Update the wire material to the copper (density = 8500.0) and output its mass.
        wire.setMaterial(Material.COPPER);

        System.out.println("\nThe wire mass is " + wire.getMass() + " kg.");
    }
}
