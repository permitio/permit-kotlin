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

import com.squareup.moshi.Json

/**
 * 
 *
 * @param key A unique id by which Permit will identify the condition set. The key will be used as the generated rego rule name.
 * @param name A descriptive name for the set, i.e: 'US based employees' or 'Users behind VPN'
 * @param type the type of the set: UserSet or ResourceSet
 * @param autogenerated whether the set was autogenerated by the system.
 * @param resourceId 
 * @param description an optional longer description of the set
 * @param conditions a boolean expression that consists of multiple conditions, with and/or logic.
 */


data class ConditionSetCreate (

    /* A unique id by which Permit will identify the condition set. The key will be used as the generated rego rule name. */
    @Json(name = "key")
    val key: kotlin.String,

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

    /* an optional longer description of the set */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* a boolean expression that consists of multiple conditions, with and/or logic. */
    @Json(name = "conditions")
    val conditions: kotlin.Any? = null

)

