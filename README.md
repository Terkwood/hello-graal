#  scala 3 + graalvm

based on a helpful example: https://github.com/olofwalker/ting

## prereqs

install graalvm use it.  install graal native-image.

```sh
sdk install java  22.0.0.2.r17-grl
sdk use java  22.0.0.2.r17-grl

gu install native-image
```

## create executable with graal

sbt graalvm-native-image:packageBin

## create jar with sbt assembly

sbt assembly

