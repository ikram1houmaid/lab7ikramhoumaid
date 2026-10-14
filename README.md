# Lab 7 — Traitement du Langage Naturel (NLP)

## Description
Ce laboratoire porte sur le traitement automatique du langage naturel (NLP) en Python. Il permet de découvrir les techniques de prétraitement et de représentation numérique des textes.

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

