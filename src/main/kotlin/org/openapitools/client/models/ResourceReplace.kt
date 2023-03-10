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

import org.openapitools.client.models.ActionBlockEditable
import org.openapitools.client.models.AttributeBlockEditable

import com.squareup.moshi.Json

/**
 * 
 *
 * @param name The name of the resource
 * @param actions          A actions definition block, typically contained within a resource type definition block.         The actions represents the ways you can interact with a protected resource.         
 * @param urn The [URN](https://en.wikipedia.org/wiki/Uniform_Resource_Name) (Uniform Resource Name) of the resource
 * @param description An optional longer description of what this resource respresents in your system
 * @param attributes Attributes that each resource of this type defines, and can be used in your ABAC policies.
 */


data class ResourceReplace (

    /* The name of the resource */
    @Json(name = "name")
    val name: kotlin.String,

    /*          A actions definition block, typically contained within a resource type definition block.         The actions represents the ways you can interact with a protected resource.          */
    @Json(name = "actions")
    val actions: kotlin.collections.Map<kotlin.String, ActionBlockEditable>,

    /* The [URN](https://en.wikipedia.org/wiki/Uniform_Resource_Name) (Uniform Resource Name) of the resource */
    @Json(name = "urn")
    val urn: kotlin.String? = null,

    /* An optional longer description of what this resource respresents in your system */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Attributes that each resource of this type defines, and can be used in your ABAC policies. */
    @Json(name = "attributes")
    val attributes: kotlin.collections.Map<kotlin.String, AttributeBlockEditable>? = null

)

