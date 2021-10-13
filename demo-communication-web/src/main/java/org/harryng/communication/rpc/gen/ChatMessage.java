// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package org.harryng.communication.rpc.gen;

/**
 * Protobuf type {@code org.harryng.communication.grpc.ChatMessage}
 */
public final class ChatMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.harryng.communication.grpc.ChatMessage)
    ChatMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChatMessage.newBuilder() to construct.
  private ChatMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChatMessage() {
    id_ = "";
    senderId_ = "";
    receiverId_ = "";
    type_ = 0;
    message_ = com.google.protobuf.ByteString.EMPTY;
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChatMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChatMessage(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            senderId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            receiverId_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 42: {

            message_ = input.readBytes();
            break;
          }
          case 48: {
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
    return org.harryng.communication.rpc.gen.ChatServiceProto.internal_static_org_harryng_communication_grpc_ChatMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.harryng.communication.rpc.gen.ChatServiceProto.internal_static_org_harryng_communication_grpc_ChatMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.harryng.communication.rpc.gen.ChatMessage.class, org.harryng.communication.rpc.gen.ChatMessage.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENDERID_FIELD_NUMBER = 2;
  private volatile java.lang.Object senderId_;
  /**
   * <code>string senderId = 2;</code>
   * @return The senderId.
   */
  @java.lang.Override
  public java.lang.String getSenderId() {
    java.lang.Object ref = senderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      senderId_ = s;
      return s;
    }
  }
  /**
   * <code>string senderId = 2;</code>
   * @return The bytes for senderId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSenderIdBytes() {
    java.lang.Object ref = senderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      senderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECEIVERID_FIELD_NUMBER = 3;
  private volatile java.lang.Object receiverId_;
  /**
   * <code>string receiverId = 3;</code>
   * @return The receiverId.
   */
  @java.lang.Override
  public java.lang.String getReceiverId() {
    java.lang.Object ref = receiverId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      receiverId_ = s;
      return s;
    }
  }
  /**
   * <code>string receiverId = 3;</code>
   * @return The bytes for receiverId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReceiverIdBytes() {
    java.lang.Object ref = receiverId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      receiverId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 4;
  private int type_;
  /**
   * <code>.org.harryng.communication.grpc.MessageType type = 4;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.org.harryng.communication.grpc.MessageType type = 4;</code>
   * @return The type.
   */
  @java.lang.Override public org.harryng.communication.rpc.gen.MessageType getType() {
    @SuppressWarnings("deprecation")
    org.harryng.communication.rpc.gen.MessageType result = org.harryng.communication.rpc.gen.MessageType.valueOf(type_);
    return result == null ? org.harryng.communication.rpc.gen.MessageType.UNRECOGNIZED : result;
  }

  public static final int MESSAGE_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString message_;
  /**
   * <code>bytes message = 5;</code>
   * @return The message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMessage() {
    return message_;
  }

  public static final int STATE_FIELD_NUMBER = 6;
  private int state_;
  /**
   * <code>.org.harryng.communication.grpc.MessageState state = 6;</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <code>.org.harryng.communication.grpc.MessageState state = 6;</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(senderId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, senderId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiverId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, receiverId_);
    }
    if (type_ != org.harryng.communication.rpc.gen.MessageType.PING.getNumber()) {
      output.writeEnum(4, type_);
    }
    if (!message_.isEmpty()) {
      output.writeBytes(5, message_);
    }
    if (state_ != org.harryng.communication.rpc.gen.MessageState.NOT_SEND.getNumber()) {
      output.writeEnum(6, state_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(senderId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, senderId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiverId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, receiverId_);
    }
    if (type_ != org.harryng.communication.rpc.gen.MessageType.PING.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, type_);
    }
    if (!message_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, message_);
    }
    if (state_ != org.harryng.communication.rpc.gen.MessageState.NOT_SEND.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, state_);
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
    if (!(obj instanceof org.harryng.communication.rpc.gen.ChatMessage)) {
      return super.equals(obj);
    }
    org.harryng.communication.rpc.gen.ChatMessage other = (org.harryng.communication.rpc.gen.ChatMessage) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getSenderId()
        .equals(other.getSenderId())) return false;
    if (!getReceiverId()
        .equals(other.getReceiverId())) return false;
    if (type_ != other.type_) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + SENDERID_FIELD_NUMBER;
    hash = (53 * hash) + getSenderId().hashCode();
    hash = (37 * hash) + RECEIVERID_FIELD_NUMBER;
    hash = (53 * hash) + getReceiverId().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.harryng.communication.rpc.gen.ChatMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.harryng.communication.rpc.gen.ChatMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.harryng.communication.rpc.gen.ChatMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.harryng.communication.rpc.gen.ChatMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.harryng.communication.rpc.gen.ChatMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.harryng.communication.rpc.gen.ChatMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.harryng.communication.rpc.gen.ChatMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.harryng.communication.rpc.gen.ChatMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.harryng.communication.rpc.gen.ChatMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.harryng.communication.rpc.gen.ChatMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.harryng.communication.rpc.gen.ChatMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.harryng.communication.rpc.gen.ChatMessage parseFrom(
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
  public static Builder newBuilder(org.harryng.communication.rpc.gen.ChatMessage prototype) {
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
   * Protobuf type {@code org.harryng.communication.grpc.ChatMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.harryng.communication.grpc.ChatMessage)
      org.harryng.communication.rpc.gen.ChatMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.harryng.communication.rpc.gen.ChatServiceProto.internal_static_org_harryng_communication_grpc_ChatMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.harryng.communication.rpc.gen.ChatServiceProto.internal_static_org_harryng_communication_grpc_ChatMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.harryng.communication.rpc.gen.ChatMessage.class, org.harryng.communication.rpc.gen.ChatMessage.Builder.class);
    }

    // Construct using org.harryng.communication.rpc.gen.ChatMessage.newBuilder()
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
      id_ = "";

      senderId_ = "";

      receiverId_ = "";

      type_ = 0;

      message_ = com.google.protobuf.ByteString.EMPTY;

      state_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.harryng.communication.rpc.gen.ChatServiceProto.internal_static_org_harryng_communication_grpc_ChatMessage_descriptor;
    }

    @java.lang.Override
    public org.harryng.communication.rpc.gen.ChatMessage getDefaultInstanceForType() {
      return org.harryng.communication.rpc.gen.ChatMessage.getDefaultInstance();
    }

    @java.lang.Override
    public org.harryng.communication.rpc.gen.ChatMessage build() {
      org.harryng.communication.rpc.gen.ChatMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.harryng.communication.rpc.gen.ChatMessage buildPartial() {
      org.harryng.communication.rpc.gen.ChatMessage result = new org.harryng.communication.rpc.gen.ChatMessage(this);
      result.id_ = id_;
      result.senderId_ = senderId_;
      result.receiverId_ = receiverId_;
      result.type_ = type_;
      result.message_ = message_;
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
      if (other instanceof org.harryng.communication.rpc.gen.ChatMessage) {
        return mergeFrom((org.harryng.communication.rpc.gen.ChatMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.harryng.communication.rpc.gen.ChatMessage other) {
      if (other == org.harryng.communication.rpc.gen.ChatMessage.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getSenderId().isEmpty()) {
        senderId_ = other.senderId_;
        onChanged();
      }
      if (!other.getReceiverId().isEmpty()) {
        receiverId_ = other.receiverId_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getMessage() != com.google.protobuf.ByteString.EMPTY) {
        setMessage(other.getMessage());
      }
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
      org.harryng.communication.rpc.gen.ChatMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.harryng.communication.rpc.gen.ChatMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object senderId_ = "";
    /**
     * <code>string senderId = 2;</code>
     * @return The senderId.
     */
    public java.lang.String getSenderId() {
      java.lang.Object ref = senderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        senderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string senderId = 2;</code>
     * @return The bytes for senderId.
     */
    public com.google.protobuf.ByteString
        getSenderIdBytes() {
      java.lang.Object ref = senderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        senderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string senderId = 2;</code>
     * @param value The senderId to set.
     * @return This builder for chaining.
     */
    public Builder setSenderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      senderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string senderId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSenderId() {
      
      senderId_ = getDefaultInstance().getSenderId();
      onChanged();
      return this;
    }
    /**
     * <code>string senderId = 2;</code>
     * @param value The bytes for senderId to set.
     * @return This builder for chaining.
     */
    public Builder setSenderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      senderId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object receiverId_ = "";
    /**
     * <code>string receiverId = 3;</code>
     * @return The receiverId.
     */
    public java.lang.String getReceiverId() {
      java.lang.Object ref = receiverId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receiverId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string receiverId = 3;</code>
     * @return The bytes for receiverId.
     */
    public com.google.protobuf.ByteString
        getReceiverIdBytes() {
      java.lang.Object ref = receiverId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receiverId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string receiverId = 3;</code>
     * @param value The receiverId to set.
     * @return This builder for chaining.
     */
    public Builder setReceiverId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      receiverId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string receiverId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReceiverId() {
      
      receiverId_ = getDefaultInstance().getReceiverId();
      onChanged();
      return this;
    }
    /**
     * <code>string receiverId = 3;</code>
     * @param value The bytes for receiverId to set.
     * @return This builder for chaining.
     */
    public Builder setReceiverIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      receiverId_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.org.harryng.communication.grpc.MessageType type = 4;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.org.harryng.communication.grpc.MessageType type = 4;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.org.harryng.communication.grpc.MessageType type = 4;</code>
     * @return The type.
     */
    @java.lang.Override
    public org.harryng.communication.rpc.gen.MessageType getType() {
      @SuppressWarnings("deprecation")
      org.harryng.communication.rpc.gen.MessageType result = org.harryng.communication.rpc.gen.MessageType.valueOf(type_);
      return result == null ? org.harryng.communication.rpc.gen.MessageType.UNRECOGNIZED : result;
    }
    /**
     * <code>.org.harryng.communication.grpc.MessageType type = 4;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(org.harryng.communication.rpc.gen.MessageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.org.harryng.communication.grpc.MessageType type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString message_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes message = 5;</code>
     * @return The message.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMessage() {
      return message_;
    }
    /**
     * <code>bytes message = 5;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes message = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     * <code>.org.harryng.communication.grpc.MessageState state = 6;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.org.harryng.communication.grpc.MessageState state = 6;</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.org.harryng.communication.grpc.MessageState state = 6;</code>
     * @return The state.
     */
    @java.lang.Override
    public org.harryng.communication.rpc.gen.MessageState getState() {
      @SuppressWarnings("deprecation")
      org.harryng.communication.rpc.gen.MessageState result = org.harryng.communication.rpc.gen.MessageState.valueOf(state_);
      return result == null ? org.harryng.communication.rpc.gen.MessageState.UNRECOGNIZED : result;
    }
    /**
     * <code>.org.harryng.communication.grpc.MessageState state = 6;</code>
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
     * <code>.org.harryng.communication.grpc.MessageState state = 6;</code>
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


    // @@protoc_insertion_point(builder_scope:org.harryng.communication.grpc.ChatMessage)
  }

  // @@protoc_insertion_point(class_scope:org.harryng.communication.grpc.ChatMessage)
  private static final org.harryng.communication.rpc.gen.ChatMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.harryng.communication.rpc.gen.ChatMessage();
  }

  public static org.harryng.communication.rpc.gen.ChatMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChatMessage>
      PARSER = new com.google.protobuf.AbstractParser<ChatMessage>() {
    @java.lang.Override
    public ChatMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChatMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChatMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChatMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.harryng.communication.rpc.gen.ChatMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

