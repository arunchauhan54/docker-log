# docker-log

#### Log file name is passsed during runtime argument while running Boot applicatation.
 --temp=app.log

## To Pass property argument while running docker

### Steps

#### Build Image 
docker build . -t dockerfile 

#### Run Image with argument and map a volume
docker run --name="dockerfile" --publish 8080:8080 -v /tmp:/tmp -e temp=/tmp/app.log dockerfile


## Other commands

docker rmi -f dockerfile  // remove image

docker run --name="dockerfile" --publish 8081:8443 --detach dockerfile  // run container in detach mode

docker rm -f dockerfile   // remove container

docker images                      - to see all docker images

docker run dockerfile              - run a docker image

docker ps                          - to see all process

docker kill psId                   - to kill a process
