public class Main {
    public static void main(String[] args) {
        //Instantiation of Reference Class objects
        //declaration  = initialization
        Song oldTownRoad = new Song("Old Town Road", "Lil Nas X", true, 136, 1.53);
        Song shutUp = new Song("Shut Up My Mom is Calling", "Hotel Ugly", true, 139, 2.45);
        Song goneAway = new Song("Gone Away", "The Offspring", true, 111, 4.30);
        Song blank = new Song();
        Song babyHotline = new Song("Baby Hotline", true, "Jack Stauber", 120, 4.51);
        System.out.println(oldTownRoad.playTimeSeconds());
       // System.out.println(blank.toString());
        //System.out.println(babyHotline.toString());
        /*
        System.out.println("First, Shut Up has a tempo of " + shutUp.getTempo());
        shutUp.setTempo(200);
        System.out.println("After update, Shut Up has a tempo of " + shutUp.getTempo());
        */
        //System.out.print("The first title is " + oldTownRoad.getTitle() + ",");
        //System.out.println(" and it is performed by " + oldTownRoad.getArtist() + ".");
        System.out.println("I have " + Song.getNumSongs() + " songs in my playlist.");
        System.out.println(oldTownRoad.toString()); //Use Java 7 version - toString()
        System.out.println("\n" + shutUp.toString());
        System.out.println("\n" + goneAway.toString());
    }
}