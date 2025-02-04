public class Knoten<ContentType>{

    private ContentType zeigeAuf;                             //Speichert das Objekt auf welches der Knoten zeigt
    private Knoten nachfolger;                      //Speichert den nachfolgenden Knoten

    public Knoten(ContentType pZeigeAuf) {
        zeigeAuf = pZeigeAuf;
    }
    public Knoten getNachfolger() {
        return nachfolger;
    }
    public void setNachfolger(Knoten pNachfolger) {
        this.nachfolger = pNachfolger;
    }
    public ContentType getZeigeAuf() {
        return zeigeAuf;
    }
}