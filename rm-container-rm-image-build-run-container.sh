#!/bin/bash

name="cursoms-clientes"
network="cursoms-network"
eureka_server="cursoms-eureka"

docker stop "${name}" ;\
docker rm -f "${name}" ;\
docker image rm -f "${name}" ;\
docker build --tag "${name}" . ;\
docker run --name "${name}" --network "${network}" -e EUREKA_SERVER="${eureka_server}" "${name}"
