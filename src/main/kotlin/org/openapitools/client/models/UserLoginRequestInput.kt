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
 * @param userId ID or key of the user for whom to generate a token
 * @param tenantId ID or key of the tenant to which access is requested
 */


data class UserLoginRequestInput (

    /* ID or key of the user for whom to generate a token */
    @Json(name = "user_id")
    val userId: kotlin.String,

    /* ID or key of the tenant to which access is requested */
    @Json(name = "tenant_id")
    val tenantId: kotlin.String

)

