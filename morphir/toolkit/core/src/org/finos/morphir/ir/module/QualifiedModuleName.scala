package org.finos.morphir.ir.module
import org.finos.morphir.ir.Path

final case class QualifiedModuleName(packageName: Path, module: Path) {
  lazy val toPath: Path     = packageName / module
  def toTuple: (Path, Path) = (packageName, module)
}

object QualifiedModuleName {
  object AsTuple {
    def unapply(name: QualifiedModuleName): Option[(Path, Path)] =
      Some(name.toTuple)
  }
}
