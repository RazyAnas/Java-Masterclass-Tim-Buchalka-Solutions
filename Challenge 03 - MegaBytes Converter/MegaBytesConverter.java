public class MegaBytesConverter {
    // printMegaBytesAndKiloBytes(2500); → should print the following text: "2500 KB = 2 MB and 452 KB"
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(11551151);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        /*
            "XX KB = YY MB and ZZ KB"
            XX represents the original value kiloBytes.
            YY represents the calculated megabytes.
            ZZ represents the calculated remaining kilobytes.
        */
        long megaBytes = kiloBytes/1024;
        long kiloBytesLeft = kiloBytes % 1024;
        System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+kiloBytesLeft + " KB");
    }
}
