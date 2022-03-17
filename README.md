#  scala 3 + graalvm


## create executable with graal

sbt graalvm-native-image:packageBin

## create jar with sbt assembly

sbt assembly

