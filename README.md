# scala 3 + graalvm

based on a helpful example: https://github.com/olofwalker/ting

## prereqs

install graalvm use it. install graal native-image.

```sh
sdk install java  22.0.0.2.r17-grl
sdk use java  22.0.0.2.r17-grl

gu install native-image
```

## create executables

with graal

`sbt graalvm-native-image:packageBin`

with sbt assembly

`sbt assembly`

## look at memory usage across the two impls

```sh
/usr/bin/time -v target/graalvm-native-image/hello-graal
/usr/bin/time -v java -jar target/scala-3.1.1/hello-graal-assembly-0.1.0-SNAPSHOT.jar
```
