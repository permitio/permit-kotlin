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

import org.openapitools.client.models.ResourceAttributes

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param key 
 * @param createdAt 
 * @param updatedAt 
 * @param name 
 * @param attributes 
 */


data class ResourceTypeObject (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "key")
    val key: kotlin.String,

    @Json(name = "created_at")
    val createdAt: java.time.OffsetDateTime,

    @Json(name = "updated_at")
    val updatedAt: java.time.OffsetDateTime,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "attributes")
    val attributes: kotlin.collections.List<ResourceAttributes>? = null

)

