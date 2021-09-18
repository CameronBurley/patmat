import patmat.*
import patmat.Huffman.{decode, encode}

object untitled {
  Huffman.decodedSecret
  Huffman.decode(Huffman.frenchCode, Huffman.secret)

  trait TestTrees {
    val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
    val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)
  }

  val n =
    new TestTrees:
      val nx = decode(t1, encode(t1)("ab".toList))
  println("")

  Huffman.encode(n.t1)("ab".toList)
  Huffman.encodeMine(n.t1)("ab".toList)
}