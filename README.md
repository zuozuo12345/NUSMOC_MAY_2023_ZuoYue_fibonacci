# NUSMOC_MAY_2023_ZuoYue_fibonacci

## Docker
I use docker-compose.yml to build the environment and run the
application.

### Preparetion for environment
I use Centos7(linux) to install docker. After installing docker, we need to install docker-compose

$ sudo curl -L https://github.com/docker/compose/releases/download/1.25.5/docker-compose-`uname -s`-`uname -m` > /usr/local/bin/docker-compose

$ sudo chmod +x /usr/local/bin/docker-compose

$ curl -L https://raw.githubusercontent.com/docker/compose/1.25.5/contrib/completion/bash/docker-compose > /etc/bash_completion.d/docker-compose

$ docker-compose --version
docker-compose version 1.25.5, build 4667896b

### start docker-compose and establish environment and run the
application.
after finishing writing docker-compose.yml, put it to /usr/data 

$ cd /usr/data

$ docker-compose up -d