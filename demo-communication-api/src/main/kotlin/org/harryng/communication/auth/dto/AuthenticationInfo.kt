package org.harryng.communication.auth.dto

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.io.Serializable
import java.util.*


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    value = [
        "id",
        "username",
        "password",
        "requestTime",
        "result"
    ]
)
open class AuthenticationInfo(
    @JsonProperty("id") open var id: String? = "",
    @JsonProperty("username") open var username: String? = "",
    @JsonProperty("password") open var password: String? = "",
    @JsonProperty("requestTime") open var requestTime: Date? = Calendar.getInstance().time,
    @JsonProperty("result") open var result: String? = ""
) : Serializable {
//    constructor() : this(
//        id="",
//        username = "",
//        password = "",
//        requestTime = Calendar.getInstance().time,
//        result = ""
//    )
}