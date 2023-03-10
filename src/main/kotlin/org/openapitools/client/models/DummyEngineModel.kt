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

import org.openapitools.client.models.Engine

import com.squareup.moshi.Json

/**
 * dummy engine class in case we couldn't parse the log but we didn't want to drop it
 *
 * @param engine 
 * @param timestamp 
 */


data class DummyEngineModel (

    @Json(name = "engine")
    val engine: Engine? = null,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null

)

