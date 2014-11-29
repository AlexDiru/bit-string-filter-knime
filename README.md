bit-string-filter-knime
=======================

Filter columns by bitstring- 1 is include - 0 is exclude

String parameter in node should consist of only 1s and 0s and be the length of the input data, 1 includes the column and 0 excludes it

Col1, Col2, Col3, Col4, Col5, Out
...

=> Bit String Filter (0,1,1,0,1,1) =>

Col2, Col3, Col5, Out
