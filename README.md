# exercices-java

TP n°1 Le langage Java

Pour chacun des exercices, nous allons créer une méthode déclarée comme dans l’exemple. Cette méthode est appelée dans la méthode main afin d’en exécuter les instructions.

public class HelloWorld {

private static Scanner scanner; public static void main(String[] args) { scanner = new Scanner(System.in); // Exercice n°x methode(); scanner.close();

} // Exercice n°x public static void methode() { ...

}

}

Dans cette méthode main on retrouve un objet de type scanner qui va nous permettre de récupérer les valeurs entrées au clavier.

1° - Manipulation de variables

Exercice 1.1 : Un programme qui nous salue

Ecrire un programme qui demande à l’utilisateur de rentrer trois valeurs (prénom, nom, âge) et qui affiche une phrase de bonjour.

Exemple :

Prénom : Micheal Nom : Jordan Age : 55 Bonjour Micheal Jordan (55 ans).

Exercice 1.2 : Permutation

Ecrire un programme qui demande à l’utilisateur de rentrer des valeurs x et y dans deux variables entières et qui permute les deux valeurs.

Exemple :

Saisir valeur de x : 3 Saisir valeur de y : 7 Les valeurs sont permutées, x vaut 7 et y vaut 3.

Ne pas faire la ligne suivante ça serait trop facile ;)

"Les valeurs sont permutées, x vaut " + y + " et y vaut " + x

Mais bien :

"Les valeurs sont permutées, x vaut " + x + " et y vaut " + y

2° - Les instructions

Exercice 2.1 : Longueur d’une chaîne

Ecrire un programme qui demande à l’utilisateur d’entrer deux chaînes de caractères et qui affiche la chaîne la plus longue.

Exemple :

Saisir une première chaîne de caractère : Bonjour Saisir une seconde chaîne de caractère : Hello Bonjour est la chaîne la plus longue.

Améliorez votre programme afin de tester si les deux chaînes ont la même longueur.

Exemple :

Saisir une première chaîne de caractère : Bonjour Saisir une seconde chaîne de caractère : Helloho Les deux chaînes sont de la même longueur.

Exercice 2.2 : Bissextile

Une année bissextile est une année comptant 366 jours au lieu de 365. L'objectif est d'aligner au mieux les indications du calendrier avec la durée que met la terre à faire le tour du soleil (365,2422 jours). Règle : sont bissextiles les années:

● soit divisibles par 4 mais non divisibles par 100,

● soit divisibles par 400.

Ecrire un programme qui demande à l’utilisateur d’entrer une année et qui affiche :

● L’année X est bissextile

● L’année X n’est pas bissextile

Exemple :

Saisir une année : 2019 L’année 2019 n’est pas bissextile

Saisir une année : 2020 L’année 2020 est bissextile

3° - Les boucles de type “Pour”

On connaît le nombre de répétitions que l’on souhaite exécuter.

Exercice 3.1 : Min/Max

Ecrire un programme qui affiche dans la console 10 nombres choisis aléatoirement entre 0 et 100.

Pour cela utilisez une méthode Math.random() qui retourne une valeur décimale comprise entre 0 inclu et 1 exclu.

Multipliez cette valeur par 101 et séparez vous de la partie décimale en transformant le nombre en un entier.

double valueDecimal = Math.random(); valueDecimal = valueDecimal * 101; int rand = (int) valueDecimal;

Ou

int rand = (int)(Math.random() * 101);

Ajoutez à votre programme le code permettant de connaître le min ou la max des 10 nombres. Attention : il n’est pas utile d’utiliser un tableau.

Exemple :

le nombre 1 vaut 43 le nombre 2 vaut 93 le nombre 3 vaut 30 le nombre 4 vaut 38 le nombre 5 vaut 67 le nombre 6 vaut 73 le nombre 7 vaut 66 le nombre 8 vaut 34 le nombre 9 vaut 9 le nombre 10 vaut 21 le maximum vaut 93 (numéro 2) le minimum vaut 9 (numéro 9).

4° - Les boucles de type “tant que”

On ne connaît pas le nombre de répétitions. On boucle tant que la condition est vrai.

Exercice 4.1 : Devinette avec un while

Écrire un programme où l’ordinateur tire aléatoirement un nombre entier en 0 et 100 et où l’utilisateur cherche à le deviner. Si la différence entre le nombre proposé et le nombre à trouver est :

● Supérieur à 20, l’ordinateur affichera « froid »

● Entre 6 et 20, l’ordinateur affichera « tiède »

● Entre 1 et 5, l’ordinateur affichera « chaud »

● Nul, l’ordinateur affichera « gagné » et le nombres de tentatives

Exercice 4.2 : Devinette 2 avec un do/while

Cette fois ci, c’est l’ordinateur qui va tenter de trouver votre nombre. Écrire un programme où vous saisissez un nombre entre 0 et 100 et où l’ordinateur tente de trouver ce nombre en un minimum de tentative. Orientez l’ordinateur avec les messages suivants :

● C’est trop grand ! Si sa tentative est supérieure à votre nombre.

● C’est trop petit ! Si sa tentative est inférieure à votre nombre.
