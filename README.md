# 🚀 Spring Boot REST API with CI/CD Pipeline

This repository contains a simple Spring Boot REST API and a complete CI/CD pipeline using **GitHub Actions** and **Docker**. The pipeline automates the build, packaging, and deployment of the application image to Docker Hub or Azure Container Registry (ACR).

---

## 📦 Tech Stack

- Java 17
- Spring Boot
- Maven
- Docker
- GitHub Actions

---

## 🛠️ Features

- RESTful API using Spring Boot
- CI/CD with GitHub Actions
- Docker containerization
- Optional support for pushing images to:
  - Docker Hub
  - Azure Container Registry (ACR)

---

## 🔧 GitHub Actions CI/CD Pipeline

The pipeline performs the following steps:

1. ✅ **Checkout the code**
2. ☕ **Set up Java (Temurin 17)**
3. 📦 **Build the JAR using Maven**
4. 🐳 **Build Docker image**
5. 🔐 **Login to Docker Hub or Azure ACR**
6. 🚀 **Push the image to the container registry**

> The pipeline is triggered on each push to the `main` branch.

---

## 🚀 How to Use

### 1. Clone the repository

```bash
git clone https://github.com/<your-username>/<your-repo>.git
cd <your-repo>

