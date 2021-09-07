package GeneralTopics;

public class compareTo {

}
/*
 * Comparable interface provides compareTo() method in which fields are compared
 * for order rather than equality. To compare object reference fields, invoke
 * the compareTo method recursively. If a field does not implement Comparable or
 * you need a nonstandard ordering, use a Comparator instead. Use of the
 * relational operators < and > in compareTo methods is verbose and error-prone
 * and no longer recommended. In Java 7, static compare methods were added to
 * all of Java’s boxed primitive classes Please use them. // Multiple-field
 * Comparable with primitive fields public int compareTo(PhoneNumber pn) { int
 * result = Short.compare(areaCode, pn.areaCode); if (result == 0) { result =
 * Short.compare(prefix, pn.prefix); if (result == 0) result =
 * Short.compare(lineNum, pn.lineNum); } return result; } More precise code for
 * the same // Comparable with comparator construction methods private static
 * final Comparator<PhoneNumber> COMPARATOR = comparingInt((PhoneNumber pn) ->
 * pn.areaCode) .thenComparingInt(pn -> pn.prefix) .thenComparingInt(pn ->
 * pn.lineNum); public int compareTo(PhoneNumber pn) { return
 * COMPARATOR.compare(this, pn); } Although this approach is approx 10% slower
 * than the previous one.
 */