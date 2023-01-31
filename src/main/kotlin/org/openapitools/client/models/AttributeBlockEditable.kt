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

import org.openapitools.client.models.AttributeType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param type The type of the attribute, we currently support: `bool`, `number` (ints, floats), `time` (a timestamp), `string`, and `json`.
 * @param description optional description string explaining what data this attribute will store
 */


data class AttributeBlockEditable (

    /* The type of the attribute, we currently support: `bool`, `number` (ints, floats), `time` (a timestamp), `string`, and `json`. */
    @Json(name = "type")
    val type: AttributeType,

    /* optional description string explaining what data this attribute will store */
    @Json(name = "description")
    val description: kotlin.String? = null

)

