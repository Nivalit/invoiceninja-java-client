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


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param job Set action name, action names can be found in Scheduler Model
 */


data class UpdateJobForASchedulerSchema (

    /* Set action name, action names can be found in Scheduler Model */
    @field:JsonProperty("job")
    val job: kotlin.String? = null

)

