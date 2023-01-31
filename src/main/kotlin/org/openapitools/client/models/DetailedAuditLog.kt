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

import org.openapitools.client.models.AuditLogObjects
import org.openapitools.client.models.RawData

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param rawData 
 * @param action 
 * @param timestamp 
 * @param query 
 * @param pdpConfigId 
 * @param envId 
 * @param projectId 
 * @param orgId 
 * @param objects 
 * @param input 
 * @param result 
 * @param context 
 * @param userKey 
 * @param userEmail 
 * @param userName 
 * @param resourceType 
 * @param tenant 
 * @param decision 
 * @param reason 
 */


data class DetailedAuditLog (

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "raw_data")
    val rawData: RawData,

    @Json(name = "action")
    val action: kotlin.String,

    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime,

    @Json(name = "query")
    val query: kotlin.String,

    @Json(name = "pdp_config_id")
    val pdpConfigId: java.util.UUID,

    @Json(name = "env_id")
    val envId: java.util.UUID,

    @Json(name = "project_id")
    val projectId: java.util.UUID,

    @Json(name = "org_id")
    val orgId: java.util.UUID,

    @Json(name = "objects")
    val objects: AuditLogObjects,

    @Json(name = "input")
    val input: kotlin.Any? = null,

    @Json(name = "result")
    val result: kotlin.Any? = null,

    @Json(name = "context")
    val context: kotlin.Any? = null,

    @Json(name = "user_key")
    val userKey: kotlin.String? = null,

    @Json(name = "user_email")
    val userEmail: kotlin.String? = null,

    @Json(name = "user_name")
    val userName: kotlin.String? = null,

    @Json(name = "resource_type")
    val resourceType: kotlin.String? = null,

    @Json(name = "tenant")
    val tenant: kotlin.String? = null,

    @Json(name = "decision")
    val decision: kotlin.Boolean? = null,

    @Json(name = "reason")
    val reason: kotlin.String? = null

)

