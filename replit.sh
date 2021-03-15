#!/bin/bash

out () {
  echo "[init] ===================="
  echo "[init] $1"
  echo "[init] ===================="
}

out "Pulling Latest Code"
git pull
chmod +x ./gradlew
out "Building"
./gradlew build
out "Done. Running."
./gradlew --console=plain -q run
