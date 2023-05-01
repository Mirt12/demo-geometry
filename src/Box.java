public class Box {
    double width;
    double height;
    double depth;
    Box() {
        System.out.println("Constructor of the Object run");
        width = 10;
        height = 10;
        depth = 10;
    }
    //method for the volume:
    double volume() {
        return width * height * depth;
    }
}
