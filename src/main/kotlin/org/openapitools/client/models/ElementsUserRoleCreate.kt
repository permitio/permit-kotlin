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
 * @param role the role that will be assigned (accepts either the role id or the role key)
 */


data class ElementsUserRoleCreate (

    /* the role that will be assigned (accepts either the role id or the role key) */
    @Json(name = "role")
    val role: kotlin.String

)

