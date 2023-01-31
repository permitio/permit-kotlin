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

import org.openapitools.client.models.UserRole

import com.squareup.moshi.Json

/**
 * 
 *
 * @param key A unique id by which Permit will identify the user for permission checks.
 * @param id Unique id of the user
 * @param organizationId Unique id of the organization that the user belongs to.
 * @param projectId Unique id of the project that the user belongs to.
 * @param environmentId Unique id of the environment that the user belongs to.
 * @param roles 
 * @param email The email of the user. If synced, will be unique inside the environment.
 * @param firstName First name of the user.
 * @param lastName Last name of the user.
 * @param attributes Arbitraty user attributes that will be used to enforce attribute-based access control policies.
 */


data class UserRead (

    /* A unique id by which Permit will identify the user for permission checks. */
    @Json(name = "key")
    val key: kotlin.String,

    /* Unique id of the user */
    @Json(name = "id")
    val id: java.util.UUID,

    /* Unique id of the organization that the user belongs to. */
    @Json(name = "organization_id")
    val organizationId: java.util.UUID,

    /* Unique id of the project that the user belongs to. */
    @Json(name = "project_id")
    val projectId: java.util.UUID,

    /* Unique id of the environment that the user belongs to. */
    @Json(name = "environment_id")
    val environmentId: java.util.UUID,

    @Json(name = "roles")
    val roles: kotlin.collections.List<UserRole>? = arrayListOf(),

    /* The email of the user. If synced, will be unique inside the environment. */
    @Json(name = "email")
    val email: kotlin.String? = null,

    /* First name of the user. */
    @Json(name = "first_name")
    val firstName: kotlin.String? = null,

    /* Last name of the user. */
    @Json(name = "last_name")
    val lastName: kotlin.String? = null,

    /* Arbitraty user attributes that will be used to enforce attribute-based access control policies. */
    @Json(name = "attributes")
    val attributes: kotlin.Any? = null

)

