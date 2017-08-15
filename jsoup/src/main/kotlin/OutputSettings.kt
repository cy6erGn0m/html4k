package kotlinx.html.jsoup

import org.jsoup.nodes.Document.OutputSettings
import org.jsoup.nodes.Document.OutputSettings.Syntax
import org.jsoup.nodes.Entities.EscapeMode
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets

//region Mutable Properties
var OutputSettings.escapeMode: EscapeMode
    get() = escapeMode()
    set(value) {
        escapeMode(value)
    }

var OutputSettings.charset: Charset
    get() = charset()
    set(value) {
        charset(value)
    }

var OutputSettings.syntax: Syntax
    get() = syntax()
    set(value) {
        syntax(value)
    }

var OutputSettings.prettyPrint: Boolean
    get() = prettyPrint()
    set(value) {
        prettyPrint(value)
    }

var OutputSettings.outline: Boolean
    get() = outline()
    set(value) {
        outline(value)
    }

var OutputSettings.indentAmount: Int
    get() = indentAmount()
    set(value) {
        indentAmount(value)
    }
//endregion

//region Methods
fun outputSettings(outline: Boolean = false,
                   prettyPrint: Boolean = true,
                   indentAmount: Int = 1,
                   charset: Charset = StandardCharsets.UTF_8,
                   escapeMode: EscapeMode = EscapeMode.base,
                   syntax: Syntax = Syntax.html)
    : OutputSettings {
    return OutputSettings()
        .outline(outline)
        .prettyPrint(prettyPrint)
        .indentAmount(indentAmount)
        .charset(charset)
        .escapeMode(escapeMode)
        .syntax(syntax)
}
//endregion