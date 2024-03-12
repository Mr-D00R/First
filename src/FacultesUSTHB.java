import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class FacultesUSTHB {
    public static void main(String[] args) {
        // 1. Création de la collection ArrayList
        ArrayList<String> facultes = new ArrayList<>();
        facultes.add("Informatique");
        facultes.add("Mathématiques");
        facultes.add("Génie Civil");
        facultes.add("Physique");
        facultes.add("Chimie");
        facultes.add("Biologie");
        facultes.add("Géologie");
        facultes.add("Génie Mécanique");

        // 2. Affichage des éléments de la collection
        // Avec itérateur
        Iterator<String> iterateur = facultes.iterator();
        System.out.println("Affichage avec itérateur:");
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

        // Sans itérateur (boucle for-each)
        System.out.println("\nAffichage sans itérateur (for-each):");
        for (String faculte : facultes) {
            System.out.println(faculte);
        }

        // 3. Affichage de la taille de la collection
        System.out.println("\nTaille de la collection: " + facultes.size());

        // 4. Modification du nom de la faculté 'Géologie'
        int indexGeologie = facultes.indexOf("Géologie");
        if (indexGeologie != -1) {
            facultes.set(indexGeologie, "Sciences de la Terre");
        }

        // 5. Affichage du nouveau nom
        System.out.println("\nNouveau nom de la faculté: " + facultes.get(indexGeologie));

        // 6. Tri de la collection et affichage
        Collections.sort(facultes);
        System.out.println("\nCollection triée:");
        iterateur = facultes.iterator(); // Réutilisation de l'itérateur
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

        // 7. Transformation de la collection en LinkedList
        LinkedList<String> facultesLinkedList = new LinkedList<>(facultes);
        System.out.println("\nCollection transformée en LinkedList:");
        for (String faculte : facultesLinkedList) {
            System.out.println(faculte);
        }
    }
}

