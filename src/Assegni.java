import java.util.*;
public class Assegni {
    /*Esercizio 1: Si supponga di dover definire un programma per determinare i costi di servizio legati alla riscossione di assegni.
    Il costo del servizio dipende dall’ammontare dell’assegno.
    Se è minore o uguale a 10 Euro, il costo di servizio è di 1 Euro.
    Se è maggiore di 10 ma minore o uguale a 100 Euro il costo del servizio è pari al 10% dell’importo.
    Se l’importo è maggiore di 100 Euro ma minore o uguale a 1000 Euro, il costo del servizio è pari a 5 Euro più il 5% dell’importo.
    Se il valore dell’importo è superiore a 1000 Euro, il costo del servizio è pari a 40 Euro più l’1% dell’importo.
    Scrivere un codice che permetta di computare questa cifra tramite un’istruzione if-else multi-ramo./*
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Costo del servizio per Riscossione di assegni");
        float costoServizio = 0;
        float assegno;
        System.out.print("Inserisca l'importo dell'assegno: ");
        assegno = sc.nextFloat();
        System.out.println();
        if (assegno > 0) {
            if (assegno > 0 && assegno <= 10) {
                costoServizio = 1;
            } else if (assegno>10 && assegno <=100) {
                costoServizio = (assegno * 10) / 100;
            } else if (assegno>100 && assegno <=1000) {
                costoServizio = 5 + (5 * assegno) / 100;
            } else if (assegno>1000) {
                costoServizio = 40 + (assegno / 100);
            } else {
            }
            System.out.println("Il monto dell'assegno è: " + assegno + "\nDunque il costo del servizio è: " + costoServizio);
        } else {
            System.out.println("Ha inserito: "+assegno +"\nDeve inserire un monto maggiore di 0.");
        }
    }
}
