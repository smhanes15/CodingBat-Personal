/*
 *  String-1 --> makeTags
 *
 *    The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this
 *    example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings,
 *    create the HTML string with tags around the word, e.g. "<i>Yay</i>".
 *
 *  Tests:
 *    makeTags("i", "Yay") ? "<i>Yay</i>"
 *    makeTags("i", "Hello") ? "<i>Hello</i>"
 *    makeTags("cite", "Yay") ? "<cite>Yay</cite>"
 *    makeTags("address", "here") ? "<address>here</address>"
 *    makeTags("body", "Heart") ? "<body>Heart</body>"
 *    makeTags("i", "i") ? "<i>i</i>"
 *    makeTags("i", "") ? "<i></i>"
 *    other tests
 */
public class MakeTags {
  public String makeTags(String tag, String word) {
    return "<" + tag + ">" + word + "</" + tag + ">";
  }
} // Delete the line below to have this file overwritten with current CodingBat content. //
  // %FINISHED% //
