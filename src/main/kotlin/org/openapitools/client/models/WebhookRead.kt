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
 * @param id Unique id of the webhook
 * @param organizationId Unique id of the organization that the webhook belongs to.
 * @param projectId Unique id of the project that the webhook belongs to.
 * @param environmentId Unique id of the environment that the webhook belongs to.
 * @param createdAt Date and time when the webhook was created (ISO_8601 format).
 * @param updatedAt Date and time when the webhook was last updated/modified (ISO_8601 format).
 * @param url The url to POST the webhook to
 */


data class WebhookRead (

    /* Unique id of the webhook */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Unique id of the organization that the webhook belongs to. */
    @Json(name = "organization_id")
    val organizationId: java.util.UUID,

    /* Unique id of the project that the webhook belongs to. */
    @Json(name = "project_id")
    val projectId: java.util.UUID,

    /* Unique id of the environment that the webhook belongs to. */
    @Json(name = "environment_id")
    val environmentId: java.util.UUID,

    /* Date and time when the webhook was created (ISO_8601 format). */
    @Json(name = "created_at")
    val createdAt: java.time.OffsetDateTime,

    /* Date and time when the webhook was last updated/modified (ISO_8601 format). */
    @Json(name = "updated_at")
    val updatedAt: java.time.OffsetDateTime,

    /* The url to POST the webhook to */
    @Json(name = "url")
    val url: kotlin.String

)

