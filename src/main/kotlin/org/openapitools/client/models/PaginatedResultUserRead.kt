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

import org.openapitools.client.models.UserRead

import com.squareup.moshi.Json

/**
 * 
 *
 * @param `data` 
 * @param totalCount 
 * @param pageCount 
 */


data class PaginatedResultUserRead (

    @Json(name = "data")
    val `data`: kotlin.collections.List<UserRead>,

    @Json(name = "total_count")
    val totalCount: kotlin.Int,

    @Json(name = "page_count")
    val pageCount: kotlin.Int? = 0

)

