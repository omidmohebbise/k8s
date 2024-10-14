#!/bin/zsh

kubectl delete ingress http-redirect-ingress
kubectl delete service app-stack-service
kubectl delete deployment app-stack
kubectl delete secret postgres-secret


kubectl apply -f ./k8s/db-secret.yaml
kubectl apply -f ./k8s/deployment.yaml
kubectl apply -f ./k8s/service.yaml
kubectl apply -f ./k8s/ingress.yaml


curl http://localhost
