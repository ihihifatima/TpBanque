@echo off
call mvn clean package
call docker build -t ma.emsi/TpBanque .
call docker rm -f TpBanque
call docker run -d -p 9080:9080 -p 9443:9443 --name TpBanque ma.emsi/TpBanque