# minimal-java-v1

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

## Note

- sample
