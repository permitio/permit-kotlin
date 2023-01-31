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

package org.openapitools.client.models

import org.openapitools.client.models.FailedInvite
import org.openapitools.client.models.InviteRead

import com.squareup.moshi.Json

/**
 * 
 *
 * @param success 
 * @param failed invites that were not even attempted, and the reason why
 */


data class MultiInviteResult (

    @Json(name = "success")
    val success: kotlin.collections.List<InviteRead>,

    /* invites that were not even attempted, and the reason why */
    @Json(name = "failed")
    val failed: kotlin.collections.List<FailedInvite>? = arrayListOf()

)
