#!/bin/zsh

docker compose  -f ./spring-api/docker-compose.yml build api --no-cache
docker push omidmohebbi/simple-spring-api:latest

