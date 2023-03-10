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
 * An enumeration.
 *
 * Values: userManagement,auditLog,approvalFlow
 */

enum class ElementsType(val value: kotlin.String) {

    @Json(name = "user_management")
    userManagement("user_management"),

    @Json(name = "audit_log")
    auditLog("audit_log"),

    @Json(name = "approval_flow")
    approvalFlow("approval_flow");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ElementsType) "$data" else null

        /**
         * Returns a valid [ElementsType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ElementsType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

