/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.nivalit.invoiceninja.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param action The action to be performed, options include:   - `start`     Starts (or restarts) the recurring invoice. **note** if the recurring invoice has been stopped for a long time, it will attempt to catch back up firing a new Invoice every hour per interval that has been missed.     If you do not wish to have the recurring invoice catch up, you should set the next_send_date to the correct date you wish the recurring invoice to commence from. - `stop`     Stops the recurring invoice.  - `send_now`     Force sends the recurring invoice - this option is only available when the recurring invoice is in a draft state.   - `restore`     Restores the recurring invoice from an archived or deleted state. - `archive`     Archives the recurring invoice. The recurring invoice will not fire in this state. - `delete`     Deletes a recurring invoice. 
 * @param ids 
 */


data class BulkRecurringInvoicesRequest (

    /* The action to be performed, options include:   - `start`     Starts (or restarts) the recurring invoice. **note** if the recurring invoice has been stopped for a long time, it will attempt to catch back up firing a new Invoice every hour per interval that has been missed.     If you do not wish to have the recurring invoice catch up, you should set the next_send_date to the correct date you wish the recurring invoice to commence from. - `stop`     Stops the recurring invoice.  - `send_now`     Force sends the recurring invoice - this option is only available when the recurring invoice is in a draft state.   - `restore`     Restores the recurring invoice from an archived or deleted state. - `archive`     Archives the recurring invoice. The recurring invoice will not fire in this state. - `delete`     Deletes a recurring invoice.  */
    @Json(name = "action")
    val action: kotlin.String,

    @Json(name = "ids")
    val ids: kotlin.collections.List<kotlin.String>

)
