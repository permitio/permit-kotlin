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
 * @param name The name of the project
 * @param description a longer description outlining the project objectives
 * @param settings the settings for this project
 * @param activePolicyRepoId the id of the policy repo to use for this project
 */


data class ProjectUpdate (

    /* The name of the project */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* a longer description outlining the project objectives */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* the settings for this project */
    @Json(name = "settings")
    val settings: kotlin.Any? = null,

    /* the id of the policy repo to use for this project */
    @Json(name = "active_policy_repo_id")
    val activePolicyRepoId: java.util.UUID? = null

)
