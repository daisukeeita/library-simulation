# LIBRARY API

A professional-grade RESTful API for a book exchange.

- **The Goal:** Show the I can handle complex relationships and security.
- **Tech Stack:** Java 21+, Spring-Boot 3.x, Spring Data JPA, PostgresSQL, Spring Security(JWT).
- **Key Features:**
    - *Role-Based Access* - Different permissions for "Admin" and "User".
    - *Advance Filtering* - Search by author, genre, or availability using *Criteria API*.
    - *Unit Testing* - 80% test coverage using JUnit5 and Mockito.

## API LINKS 

- https://openlibrary.org/developers/api
- https://developers.google.com/books/docs/overview
- https://gutenbergapi.com/

## JUST HOW I UNDERSTAND WHAT I'M TRYING TO DO

Okay, here's how I understand it. 
The Open Library API is the "source" of my books, like I'm buying from them. 
And my database is the library itself that simulates the physical books that I have which I "bought" from the Open Library. 
From there, I can simulate who borrows the book, lost it, returned, etc. 
With stocks that I have, or if there's someone who requests a certain book, 
the "Admin" can search from the "source" if there's available, else we can tell the customer that it's not available from the "source".
