# Scala FoldLeft Type Mismatch Bug

This repository demonstrates a common error when using the `foldLeft` method in Scala:  a type mismatch leading to unexpected results.

The `bug.scala` file shows the incorrect code, which attempts to sum a list of integers using `foldLeft` with a string as the initial value. This causes the operation to concatenate the numbers as strings instead of adding them arithmetically.

The `bugSolution.scala` file provides the corrected code with the proper initial value and type handling.