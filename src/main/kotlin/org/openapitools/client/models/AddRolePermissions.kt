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
 * @param permissions List of permissions to assign to the role. If a permission is already granted to the role it is skipped. Each permission can be either a resource action id, or `{resource_key}:{action_key}`, i.e: the \"permission name\".
 */


data class AddRolePermissions (

    /* List of permissions to assign to the role. If a permission is already granted to the role it is skipped. Each permission can be either a resource action id, or `{resource_key}:{action_key}`, i.e: the \"permission name\". */
    @Json(name = "permissions")
    val permissions: kotlin.collections.List<kotlin.String>

)

