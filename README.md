# my-cloud-app

# sudo docker run -it --mount type=bind,source="$(pwd)"/my-cloud-app,target=/workspace openjdk:8-jdk-alpine

#!/bin/bash
# Delete all containers
docker rm $(docker ps -a -q)
# Delete all images
docker rmi $(docker images -q)