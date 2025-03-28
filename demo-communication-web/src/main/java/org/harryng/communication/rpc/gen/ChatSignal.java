// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package org.harryng.communication.rpc.gen;

/**
 * Protobuf type {@code org.harryng.communication.grpc.ChatSignal}
 */
public final class ChatSignal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.harryng.communication.grpc.ChatSignal)
    ChatSignalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChatSignal.newBuilder() to construct.
  private ChatSignal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChatSignal() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChatSignal();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChatSignal(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            state_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.harryng.communication.rpc.gen.ChatServiceProto.internal_static_org_harryng_communication_grpc_ChatSignal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.harryng.communication.rpc.gen.ChatServiceProto.internal_static_org_harryng_communication_grpc_ChatSignal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.harryng.communication.rpc.gen.ChatSignal.class, org.harryng.communication.rpc.gen.ChatSignal.Builder.class);
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_;
  /**
   * <code>.org.harryng.communication.grpc.MessageState state = 1;</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <code>.org.harryng.communication.grpc.MessageState state = 1;</code>
   * @return The state.
   */
  @java.lang.Override public org.harryng.communication.rpc.gen.MessageState getState() {
    @SuppressWarnings("deprecation")
    org.harryng.communication.rpc.gen.MessageState result = org.harryng.communication.rpc.gen.MessageState.valueOf(state_);
    return result == null ? org.harryng.communication.rpc.gen.MessageState.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (state_ != org.harryng.communication.rpc.gen.MessageState.NOT_SEND.getNumber()) {
      output.writeEnum(1, state_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_ != org.harryng.communication.rpc.gen.MessageState.NOT_SEND.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, state_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.harryng.communication.rpc.gen.ChatSignal)) {
      return super.equals(obj);
    }
    org.harryng.communication.rpc.gen.ChatSignal other = (org.harryng.communication.rpc.gen.ChatSignal) obj;

    if (state_ != other.state_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.harryng.communication.rpc.gen.ChatSignal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.harryng.communication.rpc.gen.ChatSignal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.harryng.communication.rpc.gen.ChatSignal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.harryng.communication.rpc.gen.ChatSignal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.harryng.communication.rpc.gen.ChatSignal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.harryng.communication.rpc.gen.ChatSignal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.harryng.communication.rpc.gen.ChatSignal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.harryng.communication.rpc.gen.ChatSignal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.harryng.communication.rpc.gen.ChatSignal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.harryng.communication.rpc.gen.ChatSignal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.harryng.communication.rpc.gen.ChatSignal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.harryng.communication.rpc.gen.ChatSignal parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.harryng.communication.rpc.gen.ChatSignal prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.harryng.communication.grpc.ChatSignal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.harryng.communication.grpc.ChatSignal)
      org.harryng.communication.rpc.gen.ChatSignalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.harryng.communication.rpc.gen.ChatServiceProto.internal_static_org_harryng_communication_grpc_ChatSignal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.harryng.communication.rpc.gen.ChatServiceProto.internal_static_org_harryng_communication_grpc_ChatSignal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.harryng.communication.rpc.gen.ChatSignal.class, org.harryng.communication.rpc.gen.ChatSignal.Builder.class);
    }

    // Construct using org.harryng.communication.rpc.gen.ChatSignal.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      state_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.harryng.communication.rpc.gen.ChatServiceProto.internal_static_org_harryng_communication_grpc_ChatSignal_descriptor;
    }

    @java.lang.Override
    public org.harryng.communication.rpc.gen.ChatSignal getDefaultInstanceForType() {
      return org.harryng.communication.rpc.gen.ChatSignal.getDefaultInstance();
    }

    @java.lang.Override
    public org.harryng.communication.rpc.gen.ChatSignal build() {
      org.harryng.communication.rpc.gen.ChatSignal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.harryng.communication.rpc.gen.ChatSignal buildPartial() {
      org.harryng.communication.rpc.gen.ChatSignal result = new org.harryng.communication.rpc.gen.ChatSignal(this);
      result.state_ = state_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.harryng.communication.rpc.gen.ChatSignal) {
        return mergeFrom((org.harryng.communication.rpc.gen.ChatSignal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.harryng.communication.rpc.gen.ChatSignal other) {
      if (other == org.harryng.communication.rpc.gen.ChatSignal.getDefaultInstance()) return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.harryng.communication.rpc.gen.ChatSignal parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.harryng.communication.rpc.gen.ChatSignal) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int state_ = 0;
    /**
     * <code>.org.harryng.communication.grpc.MessageState state = 1;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.org.harryng.communication.grpc.MessageState state = 1;</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.org.harryng.communication.grpc.MessageState state = 1;</code>
     * @return The state.
     */
    @java.lang.Override
    public org.harryng.communication.rpc.gen.MessageState getState() {
      @SuppressWarnings("deprecation")
      org.harryng.communication.rpc.gen.MessageState result = org.harryng.communication.rpc.gen.MessageState.valueOf(state_);
      return result == null ? org.harryng.communication.rpc.gen.MessageState.UNRECOGNIZED : result;
    }
    /**
     * <code>.org.harryng.communication.grpc.MessageState state = 1;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(org.harryng.communication.rpc.gen.MessageState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.org.harryng.communication.grpc.MessageState state = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      
      state_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.harryng.communication.grpc.ChatSignal)
  }

  // @@protoc_insertion_point(class_scope:org.harryng.communication.grpc.ChatSignal)
  private static final org.harryng.communication.rpc.gen.ChatSignal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.harryng.communication.rpc.gen.ChatSignal();
  }

  public static org.harryng.communication.rpc.gen.ChatSignal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChatSignal>
      PARSER = new com.google.protobuf.AbstractParser<ChatSignal>() {
    @java.lang.Override
    public ChatSignal parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChatSignal(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChatSignal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChatSignal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.harryng.communication.rpc.gen.ChatSignal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

