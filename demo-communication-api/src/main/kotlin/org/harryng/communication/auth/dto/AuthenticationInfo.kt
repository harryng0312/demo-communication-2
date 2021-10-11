package org.harryng.communication.auth.dto

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.io.Serializable
import java.util.*


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(value = [
    "id",
    "username",
    "password",
    "requestTime",
    "result"
])
data class AuthenticationInfo (@JsonProperty("id") var id:String,
                               @JsonProperty("username") var username:String,
                               @JsonProperty("password") var password:String,
                               @JsonProperty("requestTime") var requestTime: Date,
                               @JsonProperty("result") var result:String) : Serializable {
}