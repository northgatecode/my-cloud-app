#!/bin/sh
echo "build.sh The time is $(date)."
cd /workspace/myweb
./mvnw clean package