| **No.** | **Method**                                                     | **Definition / Description**                             | **Example**                                                   |
| ------- | -------------------------------------------------------------- | -------------------------------------------------------- | ------------------------------------------------------------- |
| 1       | `length()`                                                     | Returns the number of characters in the string.          | `"Hello".length()` → `5`                                      |
| 2       | `charAt(int index)`                                            | Returns the character at the specified index.            | `"Java".charAt(2)` → `'v'`                                    |
| 3       | `substring(int beginIndex)`                                    | Returns substring from given index to end.               | `"Programming".substring(3)` → `"gramming"`                   |
| 4       | `substring(int beginIndex, int endIndex)`                      | Returns substring between given indexes.                 | `"Programming".substring(0, 6)` → `"Progra"`                  |
| 5       | `equals(Object another)`                                       | Compares two strings (case-sensitive).                   | `"Java".equals("java")` → `false`                             |
| 6       | `equalsIgnoreCase(String another)`                             | Compares two strings ignoring case.                      | `"Java".equalsIgnoreCase("java")` → `true`                    |
| 7       | `compareTo(String another)`                                    | Compares two strings lexicographically.                  | `"abc".compareTo("abd")` → `-1`                               |
| 8       | `compareToIgnoreCase(String another)`                          | Compares strings lexicographically ignoring case.        | `"Apple".compareToIgnoreCase("apple")` → `0`                  |
| 9       | `toLowerCase()`                                                | Converts all characters to lowercase.                    | `"JAVA".toLowerCase()` → `"java"`                             |
| 10      | `toUpperCase()`                                                | Converts all characters to uppercase.                    | `"java".toUpperCase()` → `"JAVA"`                             |
| 11      | `trim()`                                                       | Removes leading and trailing spaces.                     | `"  Hello  ".trim()` → `"Hello"`                              |
| 12      | `replace(char oldChar, char newChar)`                          | Replaces all occurrences of old character with new one.  | `"banana".replace('a', 'o')` → `"bonono"`                     |
| 13      | `replace(CharSequence target, CharSequence replacement)`       | Replaces a target substring with a new substring.        | `"I like Java".replace("Java", "Python")` → `"I like Python"` |
| 14      | `contains(CharSequence sequence)`                              | Checks if string contains a particular sequence.         | `"HelloWorld".contains("World")` → `true`                     |
| 15      | `startsWith(String prefix)`                                    | Checks if string starts with the given prefix.           | `"Hello".startsWith("He")` → `true`                           |
| 16      | `endsWith(String suffix)`                                      | Checks if string ends with the given suffix.             | `"Hello".endsWith("lo")` → `true`                             |
| 17      | `indexOf(int ch)`                                              | Returns index of first occurrence of character.          | `"banana".indexOf('a')` → `1`                                 |
| 18      | `indexOf(String str)`                                          | Returns index of first occurrence of substring.          | `"banana".indexOf("na")` → `2`                                |
| 19      | `indexOf(String str, int fromIndex)`                           | Returns index after given index.                         | `"banana".indexOf("na", 3)` → `4`                             |
| 20      | `lastIndexOf(int ch)`                                          | Returns index of last occurrence of character.           | `"banana".lastIndexOf('a')` → `5`                             |
| 21      | `lastIndexOf(String str)`                                      | Returns index of last occurrence of substring.           | `"banana".lastIndexOf("na")` → `4`                            |
| 22      | `isEmpty()`                                                    | Checks if string is empty (`length() == 0`).             | `"".isEmpty()` → `true`                                       |
| 23      | `isBlank()` *(Java 11+)*                                       | Checks if string is empty or contains only whitespace.   | `"   ".isBlank()` → `true`                                    |
| 24      | `concat(String str)`                                           | Joins two strings.                                       | `"Hello".concat("World")` → `"HelloWorld"`                    |
| 25      | `split(String regex)`                                          | Splits string into array based on given regex.           | `"a,b,c".split(",")` → `["a", "b", "c"]`                      |
| 26      | `join(CharSequence delimiter, CharSequence... elements)`       | Joins multiple strings with a delimiter.                 | `String.join("-", "2025", "11", "05")` → `"2025-11-05"`       |
| 27      | `valueOf(int value)`                                           | Converts primitive type to string.                       | `String.valueOf(100)` → `"100"`                               |
| 28      | `toCharArray()`                                                | Converts string to character array.                      | `"Java".toCharArray()` → `['J','a','v','a']`                  |
| 29      | `matches(String regex)`                                        | Checks if string matches a regular expression.           | `"abc123".matches("[a-z]+[0-9]+")` → `true`                   |
| 30      | `format(String format, Object... args)`                        | Returns formatted string like `printf()`.                | `String.format("Hi %s", "Dhoni")` → `"Hi Dhoni"`              |
| 31      | `intern()`                                                     | Returns the canonical (pooled) representation of string. | `"hello".intern()`                                            |
| 32      | `repeat(int count)` *(Java 11+)*                               | Repeats string multiple times.                           | `"Hi ".repeat(3)` → `"Hi Hi Hi "`                             |
| 33      | `strip()` *(Java 11+)*                                         | Removes leading and trailing whitespace (Unicode aware). | `"  test ".strip()` → `"test"`                                |
| 34      | `stripLeading()` *(Java 11+)*                                  | Removes only leading whitespace.                         | `"  Hello".stripLeading()` → `"Hello"`                        |
| 35      | `stripTrailing()` *(Java 11+)*                                 | Removes only trailing whitespace.                        | `"Hello  ".stripTrailing()` → `"Hello"`                       |
| 36      | `subSequence(int start, int end)`                              | Returns a CharSequence between indexes.                  | `"abcdef".subSequence(2,5)` → `"cde"`                         |
| 37      | `getBytes()`                                                   | Converts string into byte array.                         | `"ABC".getBytes()` → `[65, 66, 67]`                           |
| 38      | `getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)` | Copies characters into destination char array.           | `"hello".getChars(0,5,dst,0)`                                 |
| 39      | `compareToIgnoreCase(String anotherString)`                    | Compares two strings ignoring case differences.          | `"Java".compareToIgnoreCase("java")` → `0`                    |
| 40      | `hashCode()`                                                   | Returns the hash code for the string.                    | `"Java".hashCode()` → e.g., `2301506`                         |
