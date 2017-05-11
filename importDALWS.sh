#!/bin/bash
wsimport -d src/main/java http://localhost:9080/inventory/ws?wsdl -keep
