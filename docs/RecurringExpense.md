
# RecurringExpense

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The hashed id of the recurring expense |  [optional]
**userId** | **kotlin.String** | The hashed id of the user who created the recurring expense |  [optional]
**assignedUserId** | **kotlin.String** | The hashed id of the user assigned to this recurring expense |  [optional]
**companyId** | **kotlin.String** | The hashed id of the company |  [optional]
**clientId** | **kotlin.String** | The hashed id of the client |  [optional]
**invoiceId** | **kotlin.String** | The hashed id of the invoice |  [optional]
**bankId** | **kotlin.String** | The id of the bank associated with this recurring expense |  [optional]
**invoiceCurrencyId** | **kotlin.String** | The currency id of the invoice associated with this recurring expense |  [optional]
**expenseCurrencyId** | **kotlin.String** | The currency id of the expense associated with this recurring expense |  [optional]
**invoiceCategoryId** | **kotlin.String** | The category id of the invoice |  [optional]
**paymentTypeId** | **kotlin.String** | The payment type id |  [optional]
**privateNotes** | **kotlin.String** | The recurring expense private notes |  [optional]
**publicNotes** | **kotlin.String** | The recurring expense public notes |  [optional]
**transactionReference** | **kotlin.String** | The recurring expense transaction reference |  [optional]
**transcationId** | **kotlin.String** | The transaction id of the recurring expense |  [optional]
**customValue1** | **kotlin.String** | Custom value field |  [optional]
**customValue2** | **kotlin.String** | Custom value field |  [optional]
**customValue3** | **kotlin.String** | Custom value field |  [optional]
**customValue4** | **kotlin.String** | Custom value field |  [optional]
**taxName1** | **kotlin.String** | The tax name |  [optional]
**taxName2** | **kotlin.String** | The tax name |  [optional]
**taxRate1** | **kotlin.Float** | The tax rate |  [optional]
**taxRate2** | **kotlin.Float** | The tax rate |  [optional]
**taxName3** | **kotlin.String** | The tax name |  [optional]
**taxRate3** | **kotlin.Float** | The tax rate |  [optional]
**amount** | **kotlin.Float** | The total amount of the recurring expense |  [optional]
**frequencyId** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The frequency this recurring expense fires |  [optional]
**remainingCycles** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The number of remaining cycles for this recurring expense |  [optional]
**foreignAmount** | **kotlin.Float** | The foreign currency amount of the recurring expense |  [optional]
**exchangeRate** | **kotlin.Float** | The exchange rate for the expernse |  [optional]
**date** | **kotlin.String** | The date of the expense |  [optional]
**paymentDate** | **kotlin.String** | The date the expense was paid |  [optional]
**shouldBeInvoiced** | **kotlin.Boolean** | Boolean flag determining if the expense should be invoiced |  [optional]
**isDeleted** | **kotlin.Boolean** | Boolean flag determining if the recurring expense is deleted |  [optional]
**lastSentDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The Date it was sent last |  [optional]
**nextSendDate** | [**java.time.LocalDate**](java.time.LocalDate.md) | The next send date |  [optional]
**invoiceDocuments** | **kotlin.Boolean** | Boolean flag determining if the documents associated with this expense should be passed onto the invoice if it is converted to an invoice |  [optional]
**updatedAt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Timestamp |  [optional]
**archivedAt** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Timestamp |  [optional]



