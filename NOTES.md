NOTES.md (Open Lobby)
Project goal

A “Twitter/Instagram for video games” web app.

Core features planned:

Users can track what game they’re playing

Multi-platform support (PC / PS5 / Xbox / Switch, etc.)

Social feed with comments

Goals + achievements

(Later) authentication, profiles, follows, likes

Current progress (what works right now)
Server

Spring Boot backend runs on:

http://localhost:8080

Database

Postgres is running in Docker:

container name: open_lobby_db

port: 5432

Currently not using Postgres for comments yet (comments are in-memory)

Endpoints working
Health

GET /health

returns "ok"

Comments

POST /api/comments

GET /api/comments

GET /api/comments/{id}

Comments are stored in-memory using a CopyOnWriteArrayList.

How to run the project
1) Start Postgres container

From the folder with docker-compose.yml:

docker compose up -d


Check it is running:

docker ps

2) Start Spring Boot

Run in IntelliJ:

Run OpenLobbyApplication

OR in terminal (if needed later):

mvnw spring-boot:run

How to test endpoints
POST a comment
curl -X POST http://localhost:8080/api/comments -H "Content-Type: application/json" -d "{\"text\":\"Hello\",\"platform\":\"PC\"}"

GET all comments
curl http://localhost:8080/api/comments

GET by id
curl -i http://localhost:8080/api/comments/PASTE_ID_HERE

Current code structure
Controllers

HealthController

CommentController

DTOs

MeResponse

CreateCommentRequest

CommentResponse

Key concepts learned

Endpoint = HTTP method + URL path (example: POST /api/comments)

Controller = Java class that handles requests

DTO = Java object used for request/response JSON

@RequestBody = JSON request body → Java object

@PathVariable = value in URL path → Java variable

@RestController = return values automatically become JSON

Next step (DO NOT START YET)

Move comments from in-memory list → Postgres using:

@Entity

JpaRepository

service layer (optional but recommended)