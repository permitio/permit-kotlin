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
 * @param name The name of the action
 * @param description An optional longer description of what this action respresents in your system
 */


data class ResourceActionUpdate (

    /* The name of the action */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* An optional longer description of what this action respresents in your system */
    @Json(name = "description")
    val description: kotlin.String? = null

)

