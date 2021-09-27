package scala.cli.integration

// format: off
class ExportSbtTests213 extends ExportSbtTestDefinitions(
  scalaVersionOpt = Some(Constants.scala213)
) {
  // format: on

  test("scalac options") {
    simpleTest(ExportTestProjects.scalacOptionsScala2Test(actualScalaVersion))
  }

  test("pure java") {
    simpleTest(
      ExportTestProjects.pureJavaTest,
      extraExportArgs = Seq("--sbt-setting=fork := true")
    )
  }

  test("custom JAR") {
    simpleTest(ExportTestProjects.customJarTest(actualScalaVersion))
  }

}
