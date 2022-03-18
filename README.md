# scala 3 + graalvm

This work is based on a helpful example: https://github.com/olofwalker/ting

We didn't configure any reflection, so you won't get very far with this setup until you figure that out.

See also:

- https://www.vandebron.tech/blog/building-native-images-and-compiling-with-graalvm-and-sbt
- https://www.inner-product.com/posts/serverless-scala-services-with-graalvm/

## prereqs

Install graalvm JDK and graal's native-image.

```sh
sdk install java  22.0.0.2.r17-grl
sdk use java  22.0.0.2.r17-grl

gu install native-image
```

## create executables

With graal:

`sbt graalvm-native-image:packageBin`

With sbt assembly:

`sbt assembly`

## look at memory usage across the two impls

See "Maximum resident set size".

I got 6500 KB for graal vs 97348 KB for the assembly jar.

```sh
/usr/bin/time -v target/graalvm-native-image/hello-graal
/usr/bin/time -v java -jar target/scala-3.1.1/hello-graal-assembly-0.1.0-SNAPSHOT.jar
```
