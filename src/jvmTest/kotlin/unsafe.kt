import kotlinx.html.Entities
import kotlinx.html.body
import kotlinx.html.dom.createHTMLDocument
import kotlinx.html.dom.serialize
import kotlinx.html.head
import kotlinx.html.html
import kotlinx.html.meta
import kotlinx.html.stream.appendHTML
import kotlinx.html.title
import kotlinx.html.unsafe
import org.junit.Test
import kotlin.test.assertEquals

class UnsafeContentTest {
    @Test
    fun testStream() {
        val text = StringBuilder().apply {
            appendHTML(false).html {
                unsafe {
                    +"<p>para</p>"
                }
            }
        }.toString()

        assertEquals("<html><p>para</p></html>", text)
    }

    @Test
    fun testStreamPlusAny() {
        val i = 2

        val text = StringBuilder().apply {
            appendHTML(false).html {
                unsafe {
                    +"1"
                    raw(i)
                    raw(3)
                    raw(Entities.nbsp)
                }
            }
        }.toString()

        assertEquals("<html>123&nbsp;</html>", text)
    }

    @Test
    fun testSafeMeta() {
        val text = StringBuilder().apply {
            appendHTML(false).head {
                meta { charset = "UTF-8" }
                title("Admin")
            }
        }.toString()

        assertEquals("<head><meta charset=\"UTF-8\"><title>Admin</title></head>", text)
    }

    @Test
    fun testUnsafeMeta() {
        val text = StringBuilder().apply {
            appendHTML(false).head {
                unsafe {
                    raw("<meta charset=\"UTF-8\" />")
                }
                title("Admin")
            }
        }.toString()

        assertEquals("<head><meta charset=\"UTF-8\" /><title>Admin</title></head>", text)
    }

    @Test
    fun testDOM() {
        val tree = createHTMLDocument().html {
            body {
                unsafe {
                    +"<p>para</p>"
                }
            }
        }

        assertEquals("<html><body><p>para</p></body></html>", tree.documentElement.serialize(false))
    }
}
