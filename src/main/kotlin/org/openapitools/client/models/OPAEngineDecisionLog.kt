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

import org.openapitools.client.models.OPALabels
import org.openapitools.client.models.OPAMetrics

import com.squareup.moshi.Json

/**
 * 
 *
 * @param decisionId 
 * @param labels 
 * @param timestamp 
 * @param path 
 * @param metrics 
 * @param engine 
 * @param input 
 * @param result 
 */


data class OPAEngineDecisionLog (

    @Json(name = "decision_id")
    val decisionId: java.util.UUID,

    @Json(name = "labels")
    val labels: OPALabels,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime,

    @Json(name = "path")
    val path: kotlin.String,

    @Json(name = "metrics")
    val metrics: OPAMetrics,

    @Json(name = "engine")
    val engine: OPAEngineDecisionLog.Engine? = Engine.oPA,

    @Json(name = "input")
    val input: kotlin.Any? = null,

    @Json(name = "result")
    val result: kotlin.Any? = null

) {

    /**
     * 
     *
     * Values: oPA
     */
    enum class Engine(val value: kotlin.String) {
        @Json(name = "OPA") oPA("OPA");
    }
}

