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

import org.openapitools.client.models.AttributeType

import com.squareup.moshi.Json

/**
 * 
 *
 * @param type The type of the attribute, we currently support: `bool`, `number` (ints, floats), `time` (a timestamp), `string`, and `json`.
 * @param key A URL-friendly name of the attribute (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the attribute.
 * @param id Unique id of the attribute
 * @param resourceId Unique id of the resource that the attribute belongs to.
 * @param resourceKey A URL-friendly name of the resource (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the resource.
 * @param organizationId Unique id of the organization that the attribute belongs to.
 * @param projectId Unique id of the project that the attribute belongs to.
 * @param environmentId Unique id of the environment that the attribute belongs to.
 * @param createdAt Date and time when the attribute was created (ISO_8601 format).
 * @param updatedAt Date and time when the attribute was last updated/modified (ISO_8601 format).
 * @param description An optional longer description of what this attribute respresents in your system
 */


data class ResourceAttributeRead (

    /* The type of the attribute, we currently support: `bool`, `number` (ints, floats), `time` (a timestamp), `string`, and `json`. */
    @Json(name = "type")
    val type: AttributeType,

    /* A URL-friendly name of the attribute (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the attribute. */
    @Json(name = "key")
    val key: kotlin.String,

    /* Unique id of the attribute */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Unique id of the resource that the attribute belongs to. */
    @Json(name = "resource_id")
    val resourceId: java.util.UUID,

    /* A URL-friendly name of the resource (i.e: slug). You will be able to query later using this key instead of the id (UUID) of the resource. */
    @Json(name = "resource_key")
    val resourceKey: kotlin.String,

    /* Unique id of the organization that the attribute belongs to. */
    @Json(name = "organization_id")
    val organizationId: java.util.UUID,

    /* Unique id of the project that the attribute belongs to. */
    @Json(name = "project_id")
    val projectId: java.util.UUID,

    /* Unique id of the environment that the attribute belongs to. */
    @Json(name = "environment_id")
    val environmentId: java.util.UUID,

    /* Date and time when the attribute was created (ISO_8601 format). */
    @Json(name = "created_at")
    val createdAt: java.time.OffsetDateTime,

    /* Date and time when the attribute was last updated/modified (ISO_8601 format). */
    @Json(name = "updated_at")
    val updatedAt: java.time.OffsetDateTime,

    /* An optional longer description of what this attribute respresents in your system */
    @Json(name = "description")
    val description: kotlin.String? = null

)

