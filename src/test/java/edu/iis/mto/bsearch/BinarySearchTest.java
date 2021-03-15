package edu.iis.mto.bsearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

  @BeforeEach
  void setUp() throws Exception {}

  @Test
  void should_return_true_seq_Size_1_and_Element_Is_In_Seq() {
    int key = 87;
    int[] seq = {key};
    SearchResult searchResult = BinarySearch.search(key, seq);
    Assertions.assertTrue(searchResult.isFound() && seq[searchResult.getPosition()] == key);
  }
}
