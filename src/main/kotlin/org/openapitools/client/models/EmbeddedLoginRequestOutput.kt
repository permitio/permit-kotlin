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
 * @param redirectUrl The full URL to which the user should be redirected in order to complete the login process
 * @param error If the login request failed, this field will contain the error message
 * @param errorCode If the login request failed, this field will contain the error code
 * @param token The auth token that lets your users login into permit elements
 * @param extra Extra data that you can pass to the login request
 */


data class EmbeddedLoginRequestOutput (

    /* The full URL to which the user should be redirected in order to complete the login process */
    @Json(name = "redirect_url")
    val redirectUrl: kotlin.String,

    /* If the login request failed, this field will contain the error message */
    @Json(name = "error")
    val error: kotlin.String? = null,

    /* If the login request failed, this field will contain the error code */
    @Json(name = "error_code")
    val errorCode: kotlin.Int? = null,

    /* The auth token that lets your users login into permit elements */
    @Json(name = "token")
    val token: kotlin.String? = null,

    /* Extra data that you can pass to the login request */
    @Json(name = "extra")
    val extra: kotlin.String? = null

)

