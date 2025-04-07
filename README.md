# 📅 Aditu

**Aditu** es una aplicación web construida con Spring Boot y Vaadin, diseñada para ayudar a tutores a registrar clases, reuniones y fechas importantes, con notificaciones y alertas integradas.

---

## 🚀 Tecnologías

- ☕ Java 21
- 🌱 Spring Boot 3.4.4
- 📦 Maven Wrapper (`mvnw`)
- 🖼️ Vaadin 24.7
- 🐘 PostgreSQL
- 🐳 Docker + Docker Compose

---

## 🐳 Dockerización

Este proyecto está completamente dockerizado para facilitar su despliegue en cualquier entorno.

### 🔧 Estructura de contenedores

- `aditu_app`: Backend Spring Boot con Vaadin
- `postgres_aditu`: Base de datos PostgreSQL

---

## ▶️ Cómo ejecutar con Docker Compose

### 🛠️ Comando único para levantar todo:

docker-compose up --build
