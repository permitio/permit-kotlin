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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param url The url to POST the webhook to
 * @param bearerToken An optional bearer token to use to authenticate the request
 */


data class WebhookCreate (

    /* The url to POST the webhook to */
    @Json(name = "url")
    val url: kotlin.String,

    /* An optional bearer token to use to authenticate the request */
    @Json(name = "bearer_token")
    val bearerToken: kotlin.String? = null

)

