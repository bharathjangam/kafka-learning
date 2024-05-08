# kafka commands :

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

.\bin\windows\kafka-server-start.bat .\config\server.properties


.\bin\windows\kafka-topics.bat --create --topic updateLocationOfCab --bootstrap-server localhost:9092

.\bin\windows\kafka-topics.bat --describe --topic quickstart-events --bootstrap-server localhost:9092

.\bin\windows\kafka-console-producer.bat --topic quickstart-events --bootstrap-server localhost:9092

.\bin\windows\kafka-console-consumer.bat --topic updateLocationOfCab --from-beginning --bootstrap-server localhost:9092

.\bin\windows\connect-standalone.bat config\connect-standalone.properties config\connect-file-source.properties config\connect-file-sink.properties
