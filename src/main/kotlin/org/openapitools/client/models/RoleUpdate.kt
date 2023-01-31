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
 * @param name The name of the role
 * @param description optional description string explaining what this role represents, or what permissions are granted to it.
 * @param permissions list of action keys that define what actions this resource role is permitted to do
 * @param extends list of role keys that define what roles this role extends. In other words: this role will automatically inherit all the permissions of the given roles in this list.
 */


data class RoleUpdate (

    /* The name of the role */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* optional description string explaining what this role represents, or what permissions are granted to it. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* list of action keys that define what actions this resource role is permitted to do */
    @Json(name = "permissions")
    val permissions: kotlin.collections.List<kotlin.String>? = null,

    /* list of role keys that define what roles this role extends. In other words: this role will automatically inherit all the permissions of the given roles in this list. */
    @Json(name = "extends")
    val extends: kotlin.collections.List<kotlin.String>? = null

)

