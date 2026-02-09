# Sports News Editorial System

Educational Java project to practice:

- **Inheritance** and **polymorphism**
- **static** and **final** attributes
- Abstract classes and method overriding
- Object relationships and data structures
- Console-based interactive menu application
- Business logic for calculating news price and score

## Objective

Build a small system for managing sports journalists (redactors) and sports news articles. Each type of news (football, basketball, tennis, F1, motorcycling) has specific fields and different rules to calculate its **price** and **score**.

## Project Structure (suggested)

```text
src/
├── Redactor.java
├── Noticia.java                 # Abstract class
├── NoticiaFutbol.java
├── NoticiaBasquet.java
├── NoticiaTenis.java
├── NoticiaF1.java
├── NoticiaMotociclisme.java
└── RedaccioNoticiesApp.java     # Main class with interactive menu
```

## Main Classes

| Class                     | Type       | Main Responsibility                                                                 |
|---------------------------|------------|-------------------------------------------------------------------------------------|
| `Redactor`                | Class      | Name, immutable DNI, static salary. List of news written by this redactor.          |
| `Noticia`                 | Abstract   | Title, text (initially empty), score, price. Abstract methods: `calcularPreuNoticia()`, `calcularPuntuacio()` |
| `NoticiaFutbol`           | Concrete   | competition, club, player                                                           |
| `NoticiaBasquet`          | Concrete   | competition, club                                                                   |
| `NoticiaTenis`            | Concrete   | competition, tennis players                                                         |
| `NoticiaF1`               | Concrete   | team (escuderia)                                                                    |
| `NoticiaMotociclisme`     | Concrete   | team (equip)                                                                        |
| `RedaccioNoticiesApp`     | Main       | Console menu with 7 options                                                         |

## Menu Options (console application)

1. Introduce a new redactor
2. Remove a redactor
3. Add a news article to a redactor
4. Remove a news article (ask for redactor + title)
5. Show all news articles by a redactor
6. Calculate score of a news article
7. Calculate price of a news article

## Business Rules – Price Calculation

- **Football**: base 300 €  
  +100 € Champions League  
  +100 € Barça or Madrid  
  +50 € Ferran Torres or Benzema

- **Basketball**: base 250 €  
  +75 € Euroleague  
  +75 € Barça or Madrid

- **Tennis**: base 150 €  
  +100 € Federer, Nadal or Djokovic

- **F1**: base 100 €  
  +50 € Ferrari or Mercedes

- **Motorcycling**: base 100 €  
  +50 € Honda or Yamaha

## Business Rules – Score Calculation

- **Football**: base 5  
  +3 Champions League  
  +2 League  
  +1 Barça or Madrid  
  +1 Ferran Torres or Benzema

- **Basketball**: base 4  
  +3 Euroleague  
  +2 ACB  
  +1 Barça or Madrid

- **Tennis**: base 4  
  +3 Federer, Nadal or Djokovic

- **F1**: base 4  
  +2 Ferrari or Mercedes

- **Motorcycling**: base 3  
  +3 Honda or Yamaha

## How to Run

```bash
javac src/*.java
java -cp src RedaccioNoticiesApp
```
