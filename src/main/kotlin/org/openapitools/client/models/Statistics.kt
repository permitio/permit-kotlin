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
 * @param roles 
 * @param users 
 * @param policies 
 * @param resources 
 * @param tenants 
 * @param hasDecisionLogs 
 */


data class Statistics (

    @Json(name = "roles")
    val roles: kotlin.Int,

    @Json(name = "users")
    val users: kotlin.Int,

    @Json(name = "policies")
    val policies: kotlin.Int,

    @Json(name = "resources")
    val resources: kotlin.Int,

    @Json(name = "tenants")
    val tenants: kotlin.Int,

    @Json(name = "has_decision_logs")
    val hasDecisionLogs: kotlin.Boolean

)

