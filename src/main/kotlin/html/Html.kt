package html

import kotlinx.html.a
import kotlinx.html.body
import kotlinx.html.button
import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.dom.document
import kotlinx.html.dom.serialize
import kotlinx.html.h1
import kotlinx.html.head
import kotlinx.html.html
import kotlinx.html.onClick


fun main() {
    println(FrontPage().get())
}

class FrontPage {

    fun get() =
            document {
                append.html {
                    head { +"This is header" }
                    body {
                        div {
                            h1(classes = "color:red") { +"Hello world!" }
                        }
                        div {
                            a(href = "http://www.tufin.com") { +"TUFIN" }
                        }
                        div {
                            button {
                                onClick = "window.alert('Hello button!')"
                            }
                        }
                    }
                }
            }.serialize()
}
