kubectl -n vote-ci delete pods --field-selector=status.phase=Succeeded
kubectl -n vote-ci delete pods --field-selector=status.phase=Failed