#!/bin/sh
echo "build.sh The time is $(date)."
cd /workspace/myweb
ls -lh
chmod +x mvnw
./mvnw clean package
ls -lh