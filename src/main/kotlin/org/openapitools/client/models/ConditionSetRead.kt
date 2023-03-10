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

import org.openapitools.client.models.ConditionSetType
import org.openapitools.client.models.ResourceId
import org.openapitools.client.models.ResourceRead

import com.squareup.moshi.Json

/**
 * 
 *
 * @param key A unique id by which Permit will identify the condition set. The key will be used as the generated rego rule name.
 * @param id Unique id of the condition set
 * @param organizationId Unique id of the organization that the condition set belongs to.
 * @param projectId Unique id of the project that the condition set belongs to.
 * @param environmentId Unique id of the environment that the condition set belongs to.
 * @param createdAt Date and time when the condition set was created (ISO_8601 format).
 * @param updatedAt Date and time when the condition set was last updated/modified (ISO_8601 format).
 * @param name A descriptive name for the set, i.e: 'US based employees' or 'Users behind VPN'
 * @param type the type of the set: UserSet or ResourceSet
 * @param autogenerated whether the set was autogenerated by the system.
 * @param resourceId 
 * @param resource 
 * @param description an optional longer description of the set
 * @param conditions a boolean expression that consists of multiple conditions, with and/or logic.
 */


data class ConditionSetRead (

    /* A unique id by which Permit will identify the condition set. The key will be used as the generated rego rule name. */
    @Json(name = "key")
    val key: kotlin.String,

    /* Unique id of the condition set */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Unique id of the organization that the condition set belongs to. */
    @Json(name = "organization_id")
    val organizationId: java.util.UUID,

    /* Unique id of the project that the condition set belongs to. */
    @Json(name = "project_id")
    val projectId: java.util.UUID,

    /* Unique id of the environment that the condition set belongs to. */
    @Json(name = "environment_id")
    val environmentId: java.util.UUID,

    /* Date and time when the condition set was created (ISO_8601 format). */
    @Json(name = "created_at")
    val createdAt: java.time.OffsetDateTime,

    /* Date and time when the condition set was last updated/modified (ISO_8601 format). */
    @Json(name = "updated_at")
    val updatedAt: java.time.OffsetDateTime,

    /* A descriptive name for the set, i.e: 'US based employees' or 'Users behind VPN' */
    @Json(name = "name")
    val name: kotlin.String,

    /* the type of the set: UserSet or ResourceSet */
    @Json(name = "type")
    val type: ConditionSetType? = null,

    /* whether the set was autogenerated by the system. */
    @Json(name = "autogenerated")
    val autogenerated: kotlin.Boolean? = false,

    @Json(name = "resource_id")
    val resourceId: ResourceId? = null,

    @Json(name = "resource")
    val resource: ResourceRead? = null,

    /* an optional longer description of the set */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* a boolean expression that consists of multiple conditions, with and/or logic. */
    @Json(name = "conditions")
    val conditions: kotlin.Any? = null

)

