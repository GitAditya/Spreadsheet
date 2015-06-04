package scells

/**
 * Created by shiladir on 6/3/2015.
 */

import swing._

object Main extends SimpleSwingApplication {

  def top = new MainFrame {
    title = "ScalaSheet"
    contents = new Spreadsheet(100, 26)
  }
}
