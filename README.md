# URL Shortener Microservice 🚀

A simple Java Spring Boot project that lets users shorten long URLs like Bitly.  
When you visit the short link, it redirects to the original URL.

## 🔧 Technologies Used
- Java 17
- Spring Boot 3.5.3
- H2 Database (in-memory)
- Maven
- REST API (POST, GET)
- Docker & GitHub Actions

## ▶️ How It Works

1. **POST /shorten** with the long URL (plain text)
2. Returns a short code URL
3. **GET /{code}** redirects to the original long URL

## 📦 Run It Locally

```bash
./mvnw spring-boot:run
