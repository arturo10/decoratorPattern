package mx.iteso.decorator;

/**
 * Created by Arturo Hernandez on 29/9/2016.
 */
public class Utils {

    public enum Size {
        Mini("Mini"),
        Regular("Regular"),
        Mega("Mega");

        private final String name;

        private Size(String s) {
            name = s;
        }

        public String toString() {
            return this.name;
        }
    }
}
