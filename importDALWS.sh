#!/bin/bash
wsimport -s src/main/java -d build/classes http://localhost:9080/inventory/ws?wsdl -keep
