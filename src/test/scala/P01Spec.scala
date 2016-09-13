class P01Spec extends UnitSpec {

  "last" should "return the last element in a list" in {
    val list = List(1, 1, 2, 3, 5, 8)

    P01.last(list) should be (Some(8))
  }

  "last" should "return the element in a singleton list" in {
    val list = List(1)

    P01.last(list) should be (Some(1))
  }

  "last" should "throw a NoSuchElementException if the list is empty" in {
    val list = List.empty

    P01.last(list) should be (None)
  }

}
