lazy val root = project in file(".") dependsOn(subproject) enablePlugins(PlayScala)

lazy val subproject = project
