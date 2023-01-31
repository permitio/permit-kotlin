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
 * @param timerRegoInputParseNs 
 * @param timerRegoQueryParseNs 
 * @param timerRegoQueryCompileNs 
 * @param timerRegoQueryEvalNs 
 * @param timerRegoModuleParseNs 
 * @param timerRegoModuleCompileNs 
 * @param timerServerHandlerNs 
 */


data class OPAMetrics (

    @Json(name = "timer_rego_input_parse_ns")
    val timerRegoInputParseNs: kotlin.Int? = null,

    @Json(name = "timer_rego_query_parse_ns")
    val timerRegoQueryParseNs: kotlin.Int? = null,

    @Json(name = "timer_rego_query_compile_ns")
    val timerRegoQueryCompileNs: kotlin.Int? = null,

    @Json(name = "timer_rego_query_eval_ns")
    val timerRegoQueryEvalNs: kotlin.Int? = null,

    @Json(name = "timer_rego_module_parse_ns")
    val timerRegoModuleParseNs: kotlin.Int? = null,

    @Json(name = "timer_rego_module_compile_ns")
    val timerRegoModuleCompileNs: kotlin.Int? = null,

    @Json(name = "timer_server_handler_ns")
    val timerServerHandlerNs: kotlin.Int? = null

)
