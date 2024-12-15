import java.util.Scanner;

public class Calculatrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenue dans la calculatrice Java!");
        System.out.println("Veuillez choisir une opération:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Soustraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.println("5: Quitter");
        
        boolean continuer = true;
        while (continuer) {
            System.out.print("\nEntrez votre choix (1-5): ");
            int choix = scanner.nextInt();

            if (choix == 5) {
                System.out.println("Merci d'avoir utilisé la calculatrice. Au revoir!");
                continuer = false;
                break;
            }

            System.out.print("Entrez le premier nombre: ");
            double nombre1 = scanner.nextDouble();

            System.out.print("Entrez le deuxième nombre: ");
            double nombre2 = scanner.nextDouble();

            double resultat;
            switch (choix) {
                case 1:
                    resultat = nombre1 + nombre2;
                    System.out.println("Résultat: " + nombre1 + " + " + nombre2 + " = " + resultat);
                    break;
                case 2:
                    resultat = nombre1 - nombre2;
                    System.out.println("Résultat: " + nombre1 + " - " + nombre2 + " = " + resultat);
                    break;
                case 3:
                    resultat = nombre1 * nombre2;
                    System.out.println("Résultat: " + nombre1 + " * " + nombre2 + " = " + resultat);
                    break;
                case 4:
                    if (nombre2 != 0) {
                        resultat = nombre1 / nombre2;
                        System.out.println("Résultat: " + nombre1 + " / " + nombre2 + " = " + resultat);
                    } else {
                        System.out.println("Erreur: Division par zéro!");
                    }
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un numéro entre 1 et 5.");
            }
        }

        scanner.close();
    }
}
