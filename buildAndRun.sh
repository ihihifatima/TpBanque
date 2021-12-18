#!/bin/sh
mvn clean package && docker build -t ma.emsi/TpBanque .
docker rm -f TpBanque || true && docker run -d -p 9080:9080 -p 9443:9443 --name TpBanque ma.emsi/TpBanque