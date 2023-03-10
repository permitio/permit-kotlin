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
 * @param key A unique id by which Permit will identify the user for permission checks.
 * @param email The email of the user. If synced, will be unique inside the environment.
 * @param firstName First name of the user.
 * @param lastName Last name of the user.
 * @param attributes Arbitraty user attributes that will be used to enforce attribute-based access control policies.
 * @param role 
 */


data class ElementsUserCreate (

    /* A unique id by which Permit will identify the user for permission checks. */
    @Json(name = "key")
    val key: kotlin.String,

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
    val attributes: kotlin.Any? = null,

    @Json(name = "role")
    val role: kotlin.String? = null

)

