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
 * @param organizationId Unique id of the organization that the api_key belongs to.
 * @param projectId Unique id of the project that the api_key belongs to.
 * @param environmentId Unique id of the environment that the api_key belongs to.
 */


data class APIKeyScopeRead (

    /* Unique id of the organization that the api_key belongs to. */
    @Json(name = "organization_id")
    val organizationId: java.util.UUID,

    /* Unique id of the project that the api_key belongs to. */
    @Json(name = "project_id")
    val projectId: java.util.UUID? = null,

    /* Unique id of the environment that the api_key belongs to. */
    @Json(name = "environment_id")
    val environmentId: java.util.UUID? = null

)

