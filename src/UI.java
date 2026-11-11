public class UI {
    /**
     * UI method for center grafic object in 1 axis
     *
     * @param objectSize (width or height)
     * @param screenSize (width or height)
     * @return
     */
    public static int toCenter(int objectSize, int screenSize) {
        //  System.out.println(screenSize);
        double one = screenSize / 100.0;
        //  System.out.println(one * 50 - objectSize * one / 2);
        return(int)( one * 50 - objectSize * one / 2) ;
    }

    /**
     * UI method for setting ofset or size of grafic object in 1 axis
     *
     * @param percent What size you want (width or height)
     * @param size (screen size)(width or height)
     * @return
     */
    public static int toPercent(double percent,double size) {
        return (int)(size/100*percent);
    }
}
