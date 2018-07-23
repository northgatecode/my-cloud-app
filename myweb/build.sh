#!/bin/sh
echo "build.sh The time is $(date)."
cd /workspace/myweb
chmod +x mvnw
./mvnw clean package