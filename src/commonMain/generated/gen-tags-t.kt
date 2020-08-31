package kotlinx.html

import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

@Suppress("unused")
open class TABLE<E>(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*, E>) : HTMLTag<E>("table", consumer, initialAttributes, null, false, false), HtmlBlockTag<E> {
    var summary : String
        get()  = attributeStringString.get(this, "summary")
        set(newValue) {attributeStringString.set(this, "summary", newValue)}


}
/**
 * Table caption
 */
@HtmlTagMarker
inline fun <E> TABLE<E>.caption(classes : String? = null, crossinline block : CAPTION<E>.() -> Unit = {}) : Unit = CAPTION(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Table column group
 */
@HtmlTagMarker
inline fun <E> TABLE<E>.colGroup(classes : String? = null, crossinline block : COLGROUP<E>.() -> Unit = {}) : Unit = COLGROUP(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Table header
 */
@HtmlTagMarker
inline fun <E> TABLE<E>.thead(classes : String? = null, crossinline block : THEAD<E>.() -> Unit = {}) : Unit = THEAD(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Table footer
 */
@HtmlTagMarker
inline fun <E> TABLE<E>.tfoot(classes : String? = null, crossinline block : TFOOT<E>.() -> Unit = {}) : Unit = TFOOT(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Table body
 */
@HtmlTagMarker
inline fun <E> TABLE<E>.tbody(classes : String? = null, crossinline block : TBODY<E>.() -> Unit = {}) : Unit = TBODY(attributesMapOf("class", classes), consumer).visit(block)

/**
 * Table row
 */
@HtmlTagMarker
inline fun <E> TABLE<E>.tr(classes : String? = null, crossinline block : TR<E>.() -> Unit = {}) : Unit = TR(attributesMapOf("class", classes), consumer).visit(block)


@Suppress("unused")
open class TBODY<E>(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*, E>) : HTMLTag<E>("tbody", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacade<E> {

}
/**
 * Table row
 */
@HtmlTagMarker
inline fun <E> TBODY<E>.tr(classes : String? = null, crossinline block : TR<E>.() -> Unit = {}) : Unit = TR(attributesMapOf("class", classes), consumer).visit(block)


@Suppress("unused")
open class TD<E>(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*, E>) : HTMLTag<E>("td", consumer, initialAttributes, null, false, false), HtmlBlockTag<E> {
    var headers : String
        get()  = attributeStringString.get(this, "headers")
        set(newValue) {attributeStringString.set(this, "headers", newValue)}

    var rowSpan : String
        get()  = attributeStringString.get(this, "rowspan")
        set(newValue) {attributeStringString.set(this, "rowspan", newValue)}

    var colSpan : String
        get()  = attributeStringString.get(this, "colspan")
        set(newValue) {attributeStringString.set(this, "colspan", newValue)}


}

@Suppress("unused")
open class TEXTAREA<E>(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*, E>) : HTMLTag<E>("textarea", consumer, initialAttributes, null, true, false), CommonAttributeGroupFacadeFlowInteractivePhrasingContent<E> {
    var autoFocus : Boolean
        get()  = attributeBooleanTicker.get(this, "autofocus")
        set(newValue) {attributeBooleanTicker.set(this, "autofocus", newValue)}

    var disabled : Boolean
        get()  = attributeBooleanTicker.get(this, "disabled")
        set(newValue) {attributeBooleanTicker.set(this, "disabled", newValue)}

    var form : String
        get()  = attributeStringString.get(this, "form")
        set(newValue) {attributeStringString.set(this, "form", newValue)}

    var maxLength : String
        get()  = attributeStringString.get(this, "maxlength")
        set(newValue) {attributeStringString.set(this, "maxlength", newValue)}

    var minLength : String
        get()  = attributeStringString.get(this, "minlength")
        set(newValue) {attributeStringString.set(this, "minlength", newValue)}

    var name : String
        get()  = attributeStringString.get(this, "name")
        set(newValue) {attributeStringString.set(this, "name", newValue)}

    var placeholder : String
        get()  = attributeStringString.get(this, "placeholder")
        set(newValue) {attributeStringString.set(this, "placeholder", newValue)}

    var readonly : Boolean
        get()  = attributeBooleanTicker.get(this, "readonly")
        set(newValue) {attributeBooleanTicker.set(this, "readonly", newValue)}

    var required : Boolean
        get()  = attributeBooleanTicker.get(this, "required")
        set(newValue) {attributeBooleanTicker.set(this, "required", newValue)}

    var rows : String
        get()  = attributeStringString.get(this, "rows")
        set(newValue) {attributeStringString.set(this, "rows", newValue)}

    var cols : String
        get()  = attributeStringString.get(this, "cols")
        set(newValue) {attributeStringString.set(this, "cols", newValue)}

    var wrap : TextAreaWrap
        get()  = attributeTextAreaWrapEnumTextAreaWrapValues.get(this, "wrap")
        set(newValue) {attributeTextAreaWrapEnumTextAreaWrapValues.set(this, "wrap", newValue)}


}
val <E> TEXTAREA<E>.asFlowContent : FlowContent<E>
    get()  = this

val <E> TEXTAREA<E>.asInteractiveContent : InteractiveContent<E>
    get()  = this

val <E> TEXTAREA<E>.asPhrasingContent : PhrasingContent<E>
    get()  = this


@Suppress("unused")
open class TFOOT<E>(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*, E>) : HTMLTag<E>("tfoot", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacade<E> {

}
/**
 * Table row
 */
@HtmlTagMarker
inline fun <E> TFOOT<E>.tr(classes : String? = null, crossinline block : TR<E>.() -> Unit = {}) : Unit = TR(attributesMapOf("class", classes), consumer).visit(block)


@Suppress("unused")
open class TH<E>(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*, E>) : HTMLTag<E>("th", consumer, initialAttributes, null, false, false), HtmlInlineTag<E> {
    var headers : String
        get()  = attributeStringString.get(this, "headers")
        set(newValue) {attributeStringString.set(this, "headers", newValue)}

    var rowSpan : String
        get()  = attributeStringString.get(this, "rowspan")
        set(newValue) {attributeStringString.set(this, "rowspan", newValue)}

    var colSpan : String
        get()  = attributeStringString.get(this, "colspan")
        set(newValue) {attributeStringString.set(this, "colspan", newValue)}

    var scope : ThScope
        get()  = attributeThScopeEnumThScopeValues.get(this, "scope")
        set(newValue) {attributeThScopeEnumThScopeValues.set(this, "scope", newValue)}


}

@Suppress("unused")
open class THEAD<E>(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*, E>) : HTMLTag<E>("thead", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacade<E> {

}
/**
 * Table row
 */
@HtmlTagMarker
inline fun <E> THEAD<E>.tr(classes : String? = null, crossinline block : TR<E>.() -> Unit = {}) : Unit = TR(attributesMapOf("class", classes), consumer).visit(block)


@Suppress("unused")
open class TIME<E>(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*, E>) : HTMLTag<E>("time", consumer, initialAttributes, null, true, false), HtmlBlockInlineTag<E> {
    var dateTime : String
        get()  = attributeStringString.get(this, "datetime")
        set(newValue) {attributeStringString.set(this, "datetime", newValue)}


}
val <E> TIME<E>.asFlowContent : FlowContent<E>
    get()  = this

val <E> TIME<E>.asPhrasingContent : PhrasingContent<E>
    get()  = this


@Suppress("unused")
open class TITLE<E>(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*, E>) : HTMLTag<E>("title", consumer, initialAttributes, null, false, false), HtmlHeadTag<E> {

}

@Suppress("unused")
open class TR<E>(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*, E>) : HTMLTag<E>("tr", consumer, initialAttributes, null, false, false), CommonAttributeGroupFacade<E> {

}
/**
 * Table header cell
 */
@HtmlTagMarker
inline fun <E> TR<E>.th(scope : ThScope? = null, classes : String? = null, crossinline block : TH<E>.() -> Unit = {}) : Unit = TH(attributesMapOf("scope", scope?.enumEncode(),"class", classes), consumer).visit(block)
@HtmlTagMarker
inline fun <E> TR<E>.colTh(classes : String? = null, crossinline block : TH<E>.() -> Unit = {}) : Unit = TH(attributesMapOf("scope", ThScope.col.realValue,"class", classes), consumer).visit(block)
@HtmlTagMarker
inline fun <E> TR<E>.colGroupTh(classes : String? = null, crossinline block : TH<E>.() -> Unit = {}) : Unit = TH(attributesMapOf("scope", ThScope.colGroup.realValue,"class", classes), consumer).visit(block)
@HtmlTagMarker
inline fun <E> TR<E>.rowTh(classes : String? = null, crossinline block : TH<E>.() -> Unit = {}) : Unit = TH(attributesMapOf("scope", ThScope.row.realValue,"class", classes), consumer).visit(block)
@HtmlTagMarker
inline fun <E> TR<E>.rowGroupTh(classes : String? = null, crossinline block : TH<E>.() -> Unit = {}) : Unit = TH(attributesMapOf("scope", ThScope.rowGroup.realValue,"class", classes), consumer).visit(block)

/**
 * Table data cell
 */
@HtmlTagMarker
inline fun <E> TR<E>.td(classes : String? = null, crossinline block : TD<E>.() -> Unit = {}) : Unit = TD(attributesMapOf("class", classes), consumer).visit(block)


