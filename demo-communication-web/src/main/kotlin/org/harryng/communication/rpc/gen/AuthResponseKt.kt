//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: user.proto

package org.harryng.communication.rpc.gen;

@kotlin.jvm.JvmSynthetic
inline fun authResponse(block: org.harryng.communication.rpc.gen.AuthResponseKt.Dsl.() -> kotlin.Unit): org.harryng.communication.rpc.gen.AuthResponse =
  org.harryng.communication.rpc.gen.AuthResponseKt.Dsl._create(org.harryng.communication.rpc.gen.AuthResponse.newBuilder()).apply { block() }._build()
object AuthResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: org.harryng.communication.rpc.gen.AuthResponse.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.harryng.communication.rpc.gen.AuthResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.harryng.communication.rpc.gen.AuthResponse = _builder.build()

    /**
     * <code>int32 result = 1;</code>
     */
    var result: kotlin.Int
      @JvmName("getResult")
      get() = _builder.getResult()
      @JvmName("setResult")
      set(value) {
        _builder.setResult(value)
      }
    /**
     * <code>int32 result = 1;</code>
     */
    fun clearResult() {
      _builder.clearResult()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun org.harryng.communication.rpc.gen.AuthResponse.copy(block: org.harryng.communication.rpc.gen.AuthResponseKt.Dsl.() -> kotlin.Unit): org.harryng.communication.rpc.gen.AuthResponse =
  org.harryng.communication.rpc.gen.AuthResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
