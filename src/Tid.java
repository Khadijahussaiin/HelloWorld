public class Tid {
    public static void main(String[] args) {
        int sekund = 35;
        int minut = 10;
        int timer = 11;
        int sekunderSidenMidnat = (timer * 60 * 60) + (minut * 60) + sekund;
        int sekunderPaaEtDoegn = 24 * 60 * 60;
        int sekunderTilbagePaaEtDagen = sekunderPaaEtDoegn - sekunderSidenMidnat;
        int opgaveSlut= (11 * 60 * 60) + (25 * 60) + 20;
        int totalTidBrugtPaaUdregningen = opgaveSlut - sekunderSidenMidnat;

        System.out.println(" Siden midnat er der gået " + sekunderSidenMidnat + " sekunder ");
        System.out.println(" Sekunder tilbage af døgnet " + sekunderTilbagePaaEtDagen + " sekunder ");
        System.out.println(" Tid brugt på opgaven " + totalTidBrugtPaaUdregningen + " sekunder ");
    }
}
