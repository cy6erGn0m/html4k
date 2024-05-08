package kotlinx.html

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract
import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

@Suppress("unused")
open class A(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("a", consumer, initialAttributes, null, true, false), CommonAttributeGroupFacadeFlowInteractivePhrasingContent {
    var href : String
        get()  = attributeStringString.get(this, "href")
        set(newValue) {attributeStringString.set(this, "href", newValue)}

    var target : String
        get()  = attributeStringString.get(this, "target")
        set(newValue) {attributeStringString.set(this, "target", newValue)}

    var ping : String
        get()  = attributeStringString.get(this, "ping")
        set(newValue) {attributeStringString.set(this, "ping", newValue)}

    var rel : String
        get()  = attributeStringString.get(this, "rel")
        set(newValue) {attributeStringString.set(this, "rel", newValue)}

    var hrefLang : String
        get()  = attributeStringString.get(this, "hreflang")
        set(newValue) {attributeStringString.set(this, "hreflang", newValue)}

    var type : String
        get()  = attributeStringString.get(this, "type")
        set(newValue) {attributeStringString.set(this, "type", newValue)}

    var referrerPolicy : AReferrerPolicy
        get()  = attributeAReferrerPolicyEnumAReferrerPolicyValues.get(this, "referrerpolicy")
        set(newValue) {attributeAReferrerPolicyEnumAReferrerPolicyValues.set(this, "referrerpolicy", newValue)}

    var media : String
        get()  = attributeStringString.get(this, "media")
        set(newValue) {attributeStringString.set(this, "media", newValue)}

    var downLoad : String
        get()  = attributeStringString.get(this, "download")
        set(newValue) {attributeStringString.set(this, "download", newValue)}


}
val A.asFlowContent : FlowContent
    get()  = this

val A.asInteractiveContent : InteractiveContent
    get()  = this

val A.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class ABBR(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("abbr", consumer, initialAttributes, null, true, false), HtmlBlockInlineTag {

}
val ABBR.asFlowContent : FlowContent
    get()  = this

val ABBR.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class ADDRESS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("address", consumer, initialAttributes, null, false, false), HtmlBlockTag {

}

@Suppress("unused")
open class AREA(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("area", consumer, initialAttributes, null, true, true), HtmlBlockInlineTag {
    var coords : String
        get()  = attributeStringString.get(this, "coords")
        set(newValue) {attributeStringString.set(this, "coords", newValue)}

    var href : String
        get()  = attributeStringString.get(this, "href")
        set(newValue) {attributeStringString.set(this, "href", newValue)}

    var hrefLang : String
        get()  = attributeStringString.get(this, "hreflang")
        set(newValue) {attributeStringString.set(this, "hreflang", newValue)}

    var alt : String
        get()  = attributeStringString.get(this, "alt")
        set(newValue) {attributeStringString.set(this, "alt", newValue)}

    var target : String
        get()  = attributeStringString.get(this, "target")
        set(newValue) {attributeStringString.set(this, "target", newValue)}

    var media : String
        get()  = attributeStringString.get(this, "media")
        set(newValue) {attributeStringString.set(this, "media", newValue)}

    var rel : String
        get()  = attributeStringString.get(this, "rel")
        set(newValue) {attributeStringString.set(this, "rel", newValue)}

    var ping : String
        get()  = attributeStringString.get(this, "ping")
        set(newValue) {attributeStringString.set(this, "ping", newValue)}

    var type : String
        get()  = attributeStringString.get(this, "type")
        set(newValue) {attributeStringString.set(this, "type", newValue)}


}
val AREA.asFlowContent : FlowContent
    get()  = this

val AREA.asPhrasingContent : PhrasingContent
    get()  = this


@Suppress("unused")
open class ARTICLE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("article", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacadeFlowSectioningContent {

}
val ARTICLE.asFlowContent : FlowContent
    get()  = this

val ARTICLE.asSectioningContent : SectioningContent
    get()  = this


@Suppress("unused")
open class ASIDE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("aside", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacadeFlowSectioningContent {

}
val ASIDE.asFlowContent : FlowContent
    get()  = this

val ASIDE.asSectioningContent : SectioningContent
    get()  = this


@Suppress("unused")
open class AUDIO(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("audio", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacadeFlowInteractivePhrasingContent {
    var src : String
        get()  = attributeStringString.get(this, "src")
        set(newValue) {attributeStringString.set(this, "src", newValue)}

    var autoBuffer : Boolean
        get()  = attributeBooleanTicker.get(this, "autobuffer")
        set(newValue) {attributeBooleanTicker.set(this, "autobuffer", newValue)}

    var autoPlay : Boolean
        get()  = attributeBooleanTicker.get(this, "autoplay")
        set(newValue) {attributeBooleanTicker.set(this, "autoplay", newValue)}

    var loop : Boolean
        get()  = attributeBooleanTicker.get(this, "loop")
        set(newValue) {attributeBooleanTicker.set(this, "loop", newValue)}

    var controls : Boolean
        get()  = attributeBooleanTicker.get(this, "controls")
        set(newValue) {attributeBooleanTicker.set(this, "controls", newValue)}


}
/**
 * Media source for 
 */
@HtmlTagMarker
@OptIn(ExperimentalContracts::class)
inline fun AUDIO.source(classes : String? = null, crossinline block : SOURCE.() -> Unit = {}) : Unit {
    contract { callsInPlace(block, InvocationKind.EXACTLY_ONCE) }
    SOURCE(attributesMapOf("class", classes), consumer).visit(block)
}

val AUDIO.asFlowContent : FlowContent
    get()  = this

val AUDIO.asInteractiveContent : InteractiveContent
    get()  = this

val AUDIO.asPhrasingContent : PhrasingContent
    get()  = this


