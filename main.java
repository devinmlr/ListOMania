public class main
{
    
    public main () {
        Affe affe1 = new Affe("Gerhard");
        Affe affe2 = new Affe("Uwe");
        Affe affe3 = new Affe("Torben");
        Liste list1 = new Liste(affe1);
        list1.append((Object)affe2);
        list1.printNode(1); //Uwe a2
        list1.insert(1,affe3);
        list1.printNode(1); //Torben a3
        list1.printNode(2); //Uwe a2
        System.out.println("Anzahl der Objekte: " + list1.getLength());
        list1.delete(1); //Torben wird gelöscht
        System.out.println("Torben wird gelöscht");
        list1.printNode(1); //An der Stelle 1 sollte nun wieder Uwe stehen
        System.out.println("Anzahl der Objekte: " + list1.getLength());
    }
    
    public static void main(String[] a) {
        new main();
    }
}
