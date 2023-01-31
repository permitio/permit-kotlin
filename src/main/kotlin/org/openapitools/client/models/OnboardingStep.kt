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
 * Values: createOrganization,createProject,createResource,createActions,assignPermissions,assignUserRoles,connectSdk,done
 */

enum class OnboardingStep(val value: kotlin.String) {

    @Json(name = "create_organization")
    createOrganization("create_organization"),

    @Json(name = "create_project")
    createProject("create_project"),

    @Json(name = "create_resource")
    createResource("create_resource"),

    @Json(name = "create_actions")
    createActions("create_actions"),

    @Json(name = "assign_permissions")
    assignPermissions("assign_permissions"),

    @Json(name = "assign_user_roles")
    assignUserRoles("assign_user_roles"),

    @Json(name = "connect_sdk")
    connectSdk("connect_sdk"),

    @Json(name = "done")
    done("done");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is OnboardingStep) "$data" else null

        /**
         * Returns a valid [OnboardingStep] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): OnboardingStep? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

