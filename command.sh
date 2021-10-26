#!/bin/bash

# if condition is true
if [ "maven" == "$1" ];
then
    echo "Maven equals $1"
    mvn --version
fi

# if condition is false
if [ "nodejs" == "$1" ];
then
    echo "Nodejs equals $1"
    npm -v
fi
