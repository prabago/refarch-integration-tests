#!/bin/bash
#wsimport -s src/main/java -d build/classes http://localhost:9080/inventory/ws?wsdl -keep
wsimport -s src/main/java -d build/classes http://172.16.254.44:9080/inventory/ws?wsdl -keep 
