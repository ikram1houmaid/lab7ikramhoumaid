# TP Java – Classes abstraites et polymorphisme

## Description
Ce TP contient deux exercices réalisés en Java pour pratiquer les classes abstraites, l'héritage, le polymorphisme et la gestion des tableaux dynamiques.

## Exercice 1 : Gestion de la paie des employés

### Objectif
Développer un système de gestion de la paie permettant de calculer le salaire de différents types d'employés.

### Classes utilisées
- `Employe` : classe abstraite qui définit les informations communes aux employés.
- `EmployeHoraire` : calcule le salaire selon le taux horaire et les heures travaillées.
- `EmployeSalarie` : représente un employé avec un salaire mensuel fixe.
- `Vendeur` : représente un employé salarié avec une commission supplémentaire.
- `Entreprise` : gère les employés dans un tableau dynamique, affiche les salaires et calcule la masse salariale totale.
- `Main` : contient le programme principal de test.

### Notions étudiées
- Classes abstraites et méthodes abstraites.
- Héritage et redéfinition des méthodes.
- Polymorphisme.
- Tableaux dynamiques.
- Calcul des salaires et de la masse salariale.

## Exercice 2 : Modélisation d'un système de fichiers

### Objectif
Créer un mini-système de fichiers capable de représenter des fichiers et des répertoires et de calculer leur taille totale.

### Classes utilisées
- `FsItem` : classe abstraite représentant un élément du système de fichiers.
- `FileItem` : représente un fichier avec un nom et une taille.
- `Directory` : représente un répertoire contenant des fichiers ou d'autres répertoires.
- `FileSystem` : gère les éléments racine, affiche l'arborescence et calcule la taille totale.
- `Main` : crée des fichiers et des répertoires et teste le système.

### Notions étudiées
- Classes abstraites et héritage.
- Polymorphisme.
- Tableaux dynamiques.
- Parcours récursif d'une arborescence.
- Calcul de la taille totale des fichiers et des répertoires.

## Technologies utilisées
- Langage : Java
- JDK : 8 ou version ultérieure
- IDE : Eclipse ou IntelliJ IDEA

## Organisation du projet

Les classes Java sont organisées dans le package `com.example.tp`.

```text
src/
└── com/
    └── example/
        └── tp/
            ├── Employe.java
            ├── EmployeHoraire.java
            ├── EmployeSalarie.java
            ├── Vendeur.java
            ├── Entreprise.java
            ├── FsItem.java
            ├── FileItem.java
            ├── Directory.java
            ├── FileSystem.java
            └── Main.java
```

**Remarque :** les deux exercices possèdent chacun leur propre classe `Main`. Pour les exécuter dans le même package, il faut utiliser deux classes principales portant des noms différents, par exemple `MainPaie` et `MainFileSystem`, ou placer les exercices dans des packages séparés.

## Exécution
1. Ouvrir le projet dans Eclipse ou IntelliJ IDEA.
2. Vérifier que toutes les classes sont dans le package `com.example.tp`.
3. Exécuter la classe principale correspondant à l'exercice souhaité.

## Conclusion
Ce TP permet de comprendre l'utilisation des classes abstraites et du polymorphisme en Java, tout en mettant en pratique l'héritage, les tableaux dynamiques et la récursivité.


## Objectifs
- Comprendre les bases du NLP.
- Nettoyer et prétraiter des textes.
- Effectuer la tokenisation des phrases.
- Supprimer les mots vides (stopwords).
- Appliquer la lemmatisation.
- Transformer les textes en représentations numériques.


2. Prérequis
JDK 8+
IDE/editor et terminal Java
Connaissances : classes, héritage, méthodes, tableaux
3. Plan de modélisation
Classes
FsItem (abstraite)
FileItem extends FsItem
Directory extends FsItem
FileSystem (gestion d’un tableau dynamique de FsItem)
Main (programme de test)
Attributs & méthodes
FsItem (abstraite)
protected String name;
public FsItem(String name)
public abstract long getSize()
public String getName()
public String toString() (affiche name (taille))
FileItem
private long size;
public FileItem(String name, long size)
@Override getSize() => size
Directory
private FsItem[] children;
private int count;
public Directory(String name) (tableau initial taille 4)
public void add(FsItem item) (double tableau si plein)
@Override getSize() additionne récursivement getSize() de tous les enfants
public void list(int indent) (affiche récursivement arbre)
FileSystem
private FsItem[] items; private int count;
public FileSystem()
public void addRoot(FsItem item)
public void listAll() affiche chaque root avec son list(0)
public long totalSize() somme de getSize() de tous les roots
Main
construit plusieurs FileItem et Directory imbriqués, les ajoute au FileSystem, puis affiche l’arborescence et la taille totale.
UML simplifié
+--------------------+
        |      FsItem        | «abstract»
        +--------------------+
        | - name : String    |
        +--------------------+
        | + getSize(): long  | «abstract»  
        | + getName():String |
        | + toString():String|
        +---------▲----------+
                  |
    +-------------+--------------+
    |                            |
+-----------+              +---------------+
| FileItem  |              |  Directory    |
+-----------+              +---------------+
| - size    |              | - children[]  |
+-----------+              | - count : int |
| +getSize()|              | + add(item)   |
+-----------+              | + getSize()   |
                           | + list(indent)|
                           +---------------+

+-----------------+
|  FileSystem     |
+-----------------+
| - items[]       |
| - count : int   |
+-----------------+
| + addRoot(...)  |
| + listAll()     |
| + totalSize()   |
+-----------------+
## Auteur
Ikram Houmaid
<img width="309" height="124" alt="image" src="https://github.com/user-attachments/assets/8c11672f-eeb2-4fda-9c0c-0a55b05ed0ba" />
<img width="290" height="111" alt="image" src="https://github.com/user-attachments/assets/7ab51705-831f-4faf-879a-d993bc65ae85" />

