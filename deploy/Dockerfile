FROM isuper/java-oracle:jdk_8

MAINTAINER Eugene Tsypkin <evts85@gmail.com>

ENV BOT_HOME_FOLDER /opt/how_are_you_bot

RUN mkdir -p $BOT_HOME_FOLDER

COPY how-are-you-bot.jar $BOT_HOME_FOLDER/how-are-you-bot.jar
COPY run-how-are-you-bot.sh /usr/local/bin/run-how-are-you-bot.sh

EXPOSE 8080