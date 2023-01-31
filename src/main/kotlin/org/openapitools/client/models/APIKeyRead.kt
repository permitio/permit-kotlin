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
import org.openapitools.client.models.OrgMemberRead

import com.squareup.moshi.Json

/**
 * 
 *
 * @param organizationId 
 * @param ownerType 
 * @param id 
 * @param createdAt 
 * @param projectId 
 * @param environmentId 
 * @param objectType 
 * @param accessLevel 
 * @param secret 
 * @param createdByMember 
 * @param lastUsedAt 
 */


data class APIKeyRead (

    @Json(name = "organization_id")
    val organizationId: java.util.UUID,

    @Json(name = "owner_type")
    val ownerType: APIKeyOwnerType,

    @Json(name = "id")
    val id: java.util.UUID,

    @Json(name = "created_at")
    val createdAt: java.time.OffsetDateTime,

    @Json(name = "project_id")
    val projectId: java.util.UUID? = null,

    @Json(name = "environment_id")
    val environmentId: java.util.UUID? = null,

    @Json(name = "object_type")
    val objectType: MemberAccessObj? = null,

    @Json(name = "access_level")
    val accessLevel: MemberAccessLevel? = null,

    @Json(name = "secret")
    val secret: kotlin.String? = null,

    @Json(name = "created_by_member")
    val createdByMember: OrgMemberRead? = null,

    @Json(name = "last_used_at")
    val lastUsedAt: java.time.OffsetDateTime? = null

)
