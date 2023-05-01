public class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d) {
        System.out.println("Constructor of the Object run");
        width = w;
        height = h;
        depth = d;
    }
    //method for the volume:
    double volume() {
        return width * height * depth;
    }
}
