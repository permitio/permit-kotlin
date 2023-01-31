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

import org.openapitools.client.models.PDPState

import com.squareup.moshi.Json

/**
 * 
 *
 * @param pdpInstanceId 
 * @param state 
 */


data class PDPStateUpdate (

    @Json(name = "pdp_instance_id")
    val pdpInstanceId: java.util.UUID,

    @Json(name = "state")
    val state: PDPState

)
