
# Localhost

```
pip3 install -r requirements.txt
python3 app.py
```

```
curl localhost:8080
Jambo from Python Flask on unknown:1
```

# For Kubernetes

```
docker build -f Dockerfile -t docker.io/burrsutter/myapplication-python:1.0.0 .

docker login

docker push docker.io/burrsutter/myapplication-python:1.0.0
```