📚 Library Management System – Task 3

This is a simple Spring Boot application built as part of my Flexisaf internship deliverables. It demonstrates basic CRUD operations for managing books in a library using Java, Spring Boot, JPA, and PostgreSQL.

⸻

🚀 Features
	•	Add a new book
	•	Get all books
	•	Delete a book
	•   Add  a new Author
	• 	Get all Authors

⸻

⚡ Tech Stack
	•	Java
	•	Spring Boot
	•	Spring Data JPA
	•	PostgreSQL
	•	Maven

⸻

🔗 Endpoints

1. Add a new book

POST /api/books
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "published_year": 2008
}

2. Get all books

GET /api/books

⸻

3. Delete a book

DELETE/api/books/{id}

⸻

4. Add a new author
{
  "fitst_name": "Robert",
  "last_name": "Martin",
}

5. Get all Authors
GET/api/authors
   

📝 Author

Edeye Emmanuel
