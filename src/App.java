import java.util.Set;
import java.util.TreeSet;
import models.Contacto;

public class App {
    public static void main(String[] args) throws Exception {
        runHasSet();
        runLinkedHasSet();
        runTreeSet();
        runTreeComparador();
    }

    private static void runHasSet(){

        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("----- HashSet -----");
        System.out.println("Elemento del HashSet (no se garantiza orden)" );
        for (String elemento : ejemploHashSet) {
            System.out.println( elemento );
        }
    }
    private static void runLinkedHasSet(){
        Sets linkedset = new Sets();
        Set<String> ejemplolinked = linkedset.construirLinkedHashSet();
        System.out.println("----- LinkedHashSet -----");
        System.out.println("Elemento del LinkedHashSet" );
        for (String elemento : ejemplolinked) {
            System.out.println( elemento );
        }
    }

    private static void runTreeSet(){
        Sets miTreeSet = new Sets();
        Set<String> ejemploHasSet = miTreeSet.construirTreeSet();
        System.out.println("----- TreeSet -----");
        System.out.println("Elemento del TreeSet" );
        for (String elemento : ejemploHasSet) {
            System.out.println( elemento );
        }
    } 
    private static void runTreeComparador(){
        Sets miTreeCom = new Sets();
        Set<String> ejemploCom = miTreeCom.contruirTreeSetConComparador();
        System.out.println("----- TreeSetComparador -----");
        System.out.println("Elemento del Comparador" );
        for (String elemento : ejemploCom) {
            System.out.println( elemento );
        }
    } 

    private static void runEjercicio(){
        Set<Contacto> agenda = new TreeSet<>(new ContactCompare);

    }

}
