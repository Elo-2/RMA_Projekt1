# Mini IMDB - Movie Catalog App

## Razvoj mobilnih aplikacija - Projekat 1

Mini IMDB je Android aplikacija koja omogućava pregled kataloga filmova, pregled detalja filmova i glumaca, pretraživanje filmova, ocjenjivanje filmova i upravljanje favoritima.

## Funkcionalnosti

### Movie List

* Prikaz najmanje 20 filmova
* Poster svakog filma
* Naslov filma
* Žanr
* Ocjena filma
* Prikaz pomoću RecyclerView-a

### Movie Details

Klikom na film otvara se poseban ekran sa:

* većim posterom filma
* naslovom
* žanrom
* ocjenom
* kratkim opisom
* listom glumaca

### Actors

Za svaki film dostupno je najmanje 5 glumaca.
Glumci su prikazani u horizontalnom RecyclerView-u i sadrže:

* sliku glumca
* ime glumca

### Rating System

Korisnik može ocijeniti film pomoću RatingBar-a.
Ocjena korisnika se prikazuje na ekranu i čuva lokalno.

### Search

Na glavnom ekranu postoji search bar koji omogućava pretraživanje filmova po nazivu.

### Favorites

Korisnik može:

* dodati film u favorite
* ukloniti film iz favorita
* otvoriti poseban Favorites ekran
* pregledati sve označene favorite

Favoriti i korisničke ocjene ostaju sačuvani nakon zatvaranja aplikacije.

## Struktura aplikacije

Aplikacija je napravljena u Android Studiju koristeći Kotlin i Android XML layouts.

Glavne aktivnosti:

* `MainActivity`
* `MovieDetailsActivity`
* `FavoritesActivity`

Glavne klase:

* `Movie`
* `Actor`
* `MovieData`
* `MovieStorage`
* `MovieAdapter`
* `ActorAdapter`

## Korištene tehnologije

* Android Studio
* Kotlin
* XML
* RecyclerView
* AppCompat
* Material Toolbar
* RatingBar
* SharedPreferences / lokalno čuvanje podataka
* Android Activities

## Lokalni podaci

Podaci o filmovima i glumcima nalaze se lokalno u aplikaciji. Za rad aplikacije nije potrebna internet konekcija niti vanjska baza podataka.

## Cilj projekta

Cilj projekta je demonstrirati osnovne principe razvoja Android aplikacija, uključujući Activities, RecyclerView, layouts, data modeling, slike i osnovnu logiku aplikacije.

Projekat također uključuje proširene funkcionalnosti:

* sistem ocjenjivanja
* pretraživanje
* favorite
* poboljšan korisnički interfejs
* Toolbar/AppBar

## Autor

Ime i prezime: Elmir Hanić

Predmet: **Razvoj mobilnih aplikacija**

Projekat: **Projekat 1 - Mini IMDB**
