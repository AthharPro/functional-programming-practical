file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_3/2.scala
### dotty.tools.dotc.ast.Trees$UnAssignedTypeException: type of Ident(listString) is not assigned

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 124
uri: file:///D:/Colombo%20Uni/2%20yr%201%20sem/2204%20-%20FP/Practical/functional-programming-practical/Practical_3/2.scala
text:
```scala
import scala.io.StdIn.readLine

object prac3_2 {

   
   def main(args: Array[String]): Unit = {
      var listString[@@]
      print("No of Strings: ")
      val n = readLine().toInt
      for(i <- 1 to n){
         print(s"Enter a String $i: ")
         val inputStr = readLine()
      }
      
      
   }
}
```



#### Error stacktrace:

```
dotty.tools.dotc.ast.Trees$Tree.tpe(Trees.scala:74)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:207)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:104)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:88)
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:53)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:409)
```
#### Short summary: 

dotty.tools.dotc.ast.Trees$UnAssignedTypeException: type of Ident(listString) is not assigned