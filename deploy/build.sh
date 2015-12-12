#!/usr/bin/env bash

VERSION="0.1"

cd ..
sbt assembly

cp target/scala-2.11/howareyoubot-assembly-$VERSION.jar ./deploy/how-are-you-bot.jar

cd deploy

docker-compose up -d
