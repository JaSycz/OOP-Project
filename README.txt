Dokumentacja Projektu
1. Opis Ogólny
Projekt jest aplikacją do przeglądania i analizy danych dotyczących stacji paliw w Krakowie. 
Aplikacja umożliwia użytkownikowi wprowadzenie adresu, a następnie prezentuje dostępne stacje paliw w danej lokalizacji wraz z cenami paliw. 
Dane są pobierane ze strony internetowej Autocentrum.pl przy użyciu web scrapingu.

2. Struktura Projektu
2.1. Pakiety
Projekt składa się z trzech pakietów:

projectTesting: Główny pakiet zawierający klasy główne projektu.
projectTesting.GUIForms: Pakiet zawierający klasy związane z interfejsem użytkownika.
projectTesting.scrapers: Pakiet zawierający klasy odpowiedzialne za web scraping danych.

2.2. Klasy
2.2.1 PoProject
Klasa PoProject jest główną klasą projektu zawierajacą metodę main która uruchamia aplikację oraz ustawia wygląd graficzny przy 
użyciu biblioteki FlatLaf. W przypadku nieudanej zmiany wyglądu, loguje błąd na poziomie FATAL.

2.2.2. MainUI
Klasa MainUI jest głównym interfejsem użytkownika. Zawiera pola i metody związane z prezentacją danych oraz obsługą interakcji użytkownika.

Metody:

updateFontBasedOnWidth: Dostosowuje rozmiar czcionki w zależności od szerokości okna.
updateAddressInputButtonWidth: Dostosowuje szerokość pola do wprowadzania adresu.
AddressInputButtonActionPerformed: Obsługuje zdarzenie naciśnięcia przycisku szukania adresu.
Loading i notLoading: Metody obsługujące widoczność informacji o ładowaniu.
Pola:

inputText: Przechowuje wprowadzony przez użytkownika adres.
2.2.3. WebScraping
Klasa WebScraping odpowiada za pobieranie danych ze strony Autocentrum.pl. Wykorzystuje bibliotekę Jsoup do analizy HTML.

Metody:
getAddress: Przetwarza podany adres na formę zgodną z wymaganiami URL.
numberOfPages: Określa liczbę stron z wynikami wyszukiwania stacji paliw.
listToAvailableAddress: Pobiera informacje o stacjach paliw z kolejnych stron i zapisuje je do list.
2.2.4. ScrapingStation
Klasa ScrapingStation odpowiada za web scraping danych o cenach paliw na konkretnej stacji.

Metody:
petrolPriceOnStation: Pobiera dane o cenach paliw na konkretnej stacji.
2.2.5. ScrapingClass
Klasa ScrapingClass pośredniczy w procesie web scrapingu danych, korzystając z klas WebScraping i ScrapingStation.

3. Wykorzystane Technologie
Jsoup: Biblioteka do parsowania i analizy dokumentów HTML.
log4j: Biblioteka do logowania zdarzeń w trakcie działania programu.
Swing: Biblioteka do tworzenia interfejsu graficznego użytkownika (GUI).
FlatLaf: Biblioteka do dostosowywania wyglądu aplikacji Java Swing.

4. Wnioski
Projekt umożliwia szybkie przeglądanie danych o stacjach paliw w Krakowie poprzez prosty interfejs graficzny. 
Może być rozwijany o dodatkowe funkcje, takie jak filtrowanie wyników czy wybór konkretnych paliw lub wygenerowanie wykresów i 
ogólne usprawnienie UI