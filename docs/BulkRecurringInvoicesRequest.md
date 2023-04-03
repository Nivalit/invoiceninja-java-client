
# BulkRecurringInvoicesRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **kotlin.String** | The action to be performed, options include:   - &#x60;start&#x60;     Starts (or restarts) the recurring invoice. **note** if the recurring invoice has been stopped for a long time, it will attempt to catch back up firing a new Invoice every hour per interval that has been missed.     If you do not wish to have the recurring invoice catch up, you should set the next_send_date to the correct date you wish the recurring invoice to commence from. - &#x60;stop&#x60;     Stops the recurring invoice.  - &#x60;send_now&#x60;     Force sends the recurring invoice - this option is only available when the recurring invoice is in a draft state.   - &#x60;restore&#x60;     Restores the recurring invoice from an archived or deleted state. - &#x60;archive&#x60;     Archives the recurring invoice. The recurring invoice will not fire in this state. - &#x60;delete&#x60;     Deletes a recurring invoice.  | 
**ids** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 



