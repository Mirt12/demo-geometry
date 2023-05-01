public class BoxDemo {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        //to set values for both objects:
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        //Volume of parallelepiped:"
        vol = mybox1.volume();
        System.out.println("Volume is: "+ vol);
        vol = mybox2.volume();
        System.out.println("Volume is: "+ vol);
    }
}
