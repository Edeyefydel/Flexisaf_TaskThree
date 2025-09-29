📚 Library Management System – Task 3

This is a simple Spring Boot application built as part of my Flexisaf internship deliverables. It demonstrates basic CRUD operations for managing books in a library using Java, Spring Boot, JPA, and PostgreSQL.

⸻

🚀 Features
	•	Add a new book
	•	Get all books
	•	Get a book by ID
	•	Delete a book

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

POST /books
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "published_year": 2008
}

2. Get all books

GET /books

⸻

3. Delete a book

DELETE /books/{id}

⸻

📝 Author

Edeye Emmanuel