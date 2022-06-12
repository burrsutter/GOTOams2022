# Localhost

```
node -v
v16.15.0

npm -v
8.5.5
```

```

```

# For Kubernetes

```
docker build -f Dockerfile -t docker.io/burrsutter/myapplication-nodejs:1.0.0 .

docker login

docker push docker.io/burrsutter/myapplication-nodejs:1.0.0
```