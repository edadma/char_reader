package io.github.edadma.char_reader

@main def runMain(): Unit =
  val testing = new Testing {}
  val s       = " a\n"

  println(testing.noindent(s))
