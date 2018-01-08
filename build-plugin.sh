#!/bin/sh

cd simple-maven-plugin
rm -rf ~/.m2/repository/kou/top/plugins/simple-maven-plugin
mvn clean install
