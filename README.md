
# Angular + Spring Boot Platform

A runnable full-stack learning prototype using Angular 20, Spring Boot 3, PostgreSQL, Redis, Docker Compose, and Nginx.

## Implemented

- Standalone Angular dashboard with an authenticated-request interceptor
- Spring endpoint at `GET /api/kpi` with sample KPI data
- Spring Security rules and local PostgreSQL/Redis connectivity
- Docker images for the frontend and backend

## Demo limitations

Authentication is not implemented: `/auth/login` returns a placeholder token, and the KPI data is static. PostgreSQL and Redis are infrastructure examples only; there is no user persistence or production RBAC flow. Do not use this demo with real accounts or sensitive data.

## Run

Requires Docker Compose, Java 17, and Node 20.19+ or 22.12+ for local frontend development.

```bash
docker compose up --build -d
```

- Frontend: http://localhost:4200
- KPI API: http://localhost:4200/api/kpi

Stop the stack with `docker compose down`.

## Verify

```bash
cd backend && mvn test
cd ../frontend && npm ci && npm run build && npm audit
```
