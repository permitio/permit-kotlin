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

import org.openapitools.client.models.APIKeyOwnerType
import org.openapitools.client.models.MemberAccessLevel
import org.openapitools.client.models.MemberAccessObj

import com.squareup.moshi.Json

/**
 * 
 *
 * @param organizationId 
 * @param projectId 
 * @param environmentId 
 * @param objectType 
 * @param accessLevel 
 * @param ownerType 
 */


data class APIKeyCreate (

    @Json(name = "organization_id")
    val organizationId: java.util.UUID,

    @Json(name = "project_id")
    val projectId: java.util.UUID? = null,

    @Json(name = "environment_id")
    val environmentId: java.util.UUID? = null,

    @Json(name = "object_type")
    val objectType: MemberAccessObj? = null,

    @Json(name = "access_level")
    val accessLevel: MemberAccessLevel? = null,

    @Json(name = "owner_type")
    val ownerType: APIKeyOwnerType? = null

)

