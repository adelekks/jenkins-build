#!/bin/bash

# if condition is Maven
if [ "maven" == "$1" ];
then
    echo "Maven equals $1"
    mvn --version
fi

# if condition is Nodejs
if [ "nodejs" == "$1" ];
then
    echo "Nodejs equals $1"
    npm -v
fi

# if condition is Any
if [ "any" == "$1" ];
then
    echo "Please pick from one of the parameter app"
    exit 1
fi
