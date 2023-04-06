
# FillableInvoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignedUserId** | **kotlin.String** | The assigned user&#39;s hashed ID |  [optional]
**clientId** | **kotlin.String** | The client&#39;s hashed ID |  [optional]
**number** | **kotlin.String** | The unique alphanumeric invoice number for each invoice per company |  [optional]
**poNumber** | **kotlin.String** | The purchase order number associated with the invoice |  [optional]
**terms** | **kotlin.String** | The terms and conditions for the invoice |  [optional]
**publicNotes** | **kotlin.String** | Public notes visible to the client on the invoice |  [optional]
**privateNotes** | **kotlin.String** | Private notes for internal use only |  [optional]
**footer** | **kotlin.String** | The footer text displayed on the invoice |  [optional]
**customValue1** | **kotlin.String** | First custom value for additional information |  [optional]
**customValue2** | **kotlin.String** | Second custom value for additional information |  [optional]
**customValue3** | **kotlin.String** | Third custom value for additional information |  [optional]
**customValue4** | **kotlin.String** | Fourth custom value for additional information |  [optional]
**taxName1** | **kotlin.String** | Name of the first tax applied to the invoice |  [optional]
**taxName2** | **kotlin.String** | Name of the second tax applied to the invoice |  [optional]
**taxRate1** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Rate of the first tax applied to the invoice |  [optional]
**taxRate2** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Rate of the second tax applied to the invoice |  [optional]
**taxName3** | **kotlin.String** | Name of the third tax applied to the invoice |  [optional]
**taxRate3** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Rate of the third tax applied to the invoice |  [optional]
**lineItems** | [**kotlin.collections.List&lt;InvoiceItem&gt;**](InvoiceItem.md) | An array of objects which define the line items of the invoice |  [optional]
**discount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The discount applied to the invoice |  [optional]
**partial** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The partial amount applied to the invoice |  [optional]
**isAmountDiscount** | **kotlin.Boolean** | Indicates whether the discount applied is a fixed amount or a percentage |  [optional]
**usesInclusiveTaxes** | **kotlin.Boolean** | Indicates whether the tax rates applied to the invoice are inclusive or exclusive |  [optional]
**date** | **kotlin.String** | The date the invoice was issued |  [optional]
**partialDueDate** | **kotlin.String** | The due date for the partial payment |  [optional]
**dueDate** | **kotlin.String** | The due date for the invoice |  [optional]
**customSurcharge1** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | First custom surcharge applied to the invoice |  [optional]
**customSurcharge2** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Second custom surcharge applied to the invoice |  [optional]
**customSurcharge3** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Third custom surcharge applied to the invoice |  [optional]
**customSurcharge4** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Fourth custom surcharge applied to the invoice |  [optional]



