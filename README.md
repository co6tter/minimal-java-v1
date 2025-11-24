# minimal-java-v1

## Overview

This is a minimal Java project for learning basic Java concepts including:
- Classes and objects
- Interfaces and abstract classes
- Inheritance and polymorphism
- Generics
- Static members and methods
- Access modifiers

The project demonstrates core object-oriented programming principles through simple examples with User and Score management systems.

## Tech Stack

- **Java**: 21 (Eclipse Temurin)
- **Build Tool**: Maven 3.9.9
- **Container**: Docker with Alpine Linux
- **Orchestration**: Docker Compose with hot-reload support

## Setup

### Prerequisites

- Docker and Docker Compose installed
- (Optional) Maven 3.9+ and Java 21 for local development

### Installation

1. Clone the repository
2. Build and run with Docker Compose:

```bash
docker compose up --build
```

For local development without Docker:

```bash
mvn clean package
java -jar target/my-java-app-1.0.0-jar-with-dependencies.jar
```

## Usage

```bash
docker compose up --build -d

docker compose up --watch
docker compose watch

docker compose logs -f

# Compose自体がstdin/TTYを掴んでしまうので一時的に無効
docker compose up --menu=false
COMPOSE_MENU=false docker compose up -d

# exec -it は新しい TTY を作る
# Jarが使っている最初のTTYに入るには attach
docker compose attach app
```

The application runs various demonstrations of Java features:
- Basic data types and operations
- Control flow (loops, conditionals)
- Object creation and manipulation
- Interface implementation
- Abstract class inheritance
- Method overriding

Run the application to see console output demonstrating each concept.

## Directory Structure

```
.
├── Dockerfile              # Multi-stage Docker build
├── docker-compose.yml      # Docker Compose configuration with watch mode
├── pom.xml                 # Maven project configuration
└── src/
    └── main/
        └── java/
            └── Main.java   # Main application with example classes
```

### Key Classes

- `Main`: Entry point with demonstration code
- `User`: Basic user class with score management
- `Loggable`: Interface for logging functionality
- `Score`: Abstract base class for subject scores
- `MathScore`, `EnglishScore`: Concrete implementations with different passing criteria
- `User2`: User class with Score composition

## License

This repository is for personal/private use only.
