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
 * @param id Unique id of the attribute
 * @param description optional description string explaining what data this attribute will store
 * @param key action key
 */


data class AttributeBlockRead (

    /* The type of the attribute, we currently support: `bool`, `number` (ints, floats), `time` (a timestamp), `string`, and `json`. */
    @Json(name = "type")
    val type: AttributeType,

    /* Unique id of the attribute */
    @Json(name = "id")
    val id: java.util.UUID,

    /* optional description string explaining what data this attribute will store */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* action key */
    @Json(name = "key")
    val key: kotlin.String? = null

)

