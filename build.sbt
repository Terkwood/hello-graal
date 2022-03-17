val scala3Version = "3.1.1"


enablePlugins(GraalVMNativeImagePlugin)

graalVMNativeImageOptions ++= Seq(
  "-H:ReflectionConfigurationFiles=" + baseDirectory.value / "graal" / "reflect-config.json",
  "-H:ResourceConfigurationFiles=" + baseDirectory.value / "graal" / "resource-config.json",
  "--initialize-at-build-time",
  "--initialize-at-run-time=" +
    "com.typesafe.config.impl.ConfigImpl$EnvVariablesHolder," +
    "com.typesafe.config.impl.ConfigImpl$SystemPropertiesHolder",
  "--no-fallback",
  "--static",
  "--allow-incomplete-classpath",
  "--report-unsupported-elements-at-runtime"
)

lazy val root = project
  .in(file("."))
  .settings(
    name := "hello-graal",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
