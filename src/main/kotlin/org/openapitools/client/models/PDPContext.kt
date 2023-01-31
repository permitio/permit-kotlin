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
 * @param customerId 
 * @param clientId 
 * @param backendTier 
 * @param component 
 */


data class PDPContext (

    @Json(name = "customer_id")
    val customerId: java.util.UUID,

    @Json(name = "client_id")
    val clientId: kotlin.String,

    @Json(name = "backend_tier")
    val backendTier: java.net.URI,

    @Json(name = "component")
    val component: kotlin.String? = "sidecar"

)
