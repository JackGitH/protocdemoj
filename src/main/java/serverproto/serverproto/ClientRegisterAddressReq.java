// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: eventServer.proto

package serverproto.serverproto;

/**
 * <pre>
 *客户端注册地址
 * </pre>
 *
 * Protobuf type {@code server.ClientRegisterAddressReq}
 */
public  final class ClientRegisterAddressReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:server.ClientRegisterAddressReq)
    ClientRegisterAddressReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientRegisterAddressReq.newBuilder() to construct.
  private ClientRegisterAddressReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientRegisterAddressReq() {
    addRessIpReq_ = "";
    addRessPortReq_ = "";
    remarkReq_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientRegisterAddressReq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            addRessIpReq_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            addRessPortReq_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            remarkReq_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return JavaTranscationServerProto.internal_static_server_ClientRegisterAddressReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return JavaTranscationServerProto.internal_static_server_ClientRegisterAddressReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ClientRegisterAddressReq.class, ClientRegisterAddressReq.Builder.class);
  }

  public static final int ADDRESSIPREQ_FIELD_NUMBER = 1;
  private volatile java.lang.Object addRessIpReq_;
  /**
   * <pre>
   *ip
   * </pre>
   *
   * <code>string AddRessIpReq = 1;</code>
   */
  public java.lang.String getAddRessIpReq() {
    java.lang.Object ref = addRessIpReq_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      addRessIpReq_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *ip
   * </pre>
   *
   * <code>string AddRessIpReq = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAddRessIpReqBytes() {
    java.lang.Object ref = addRessIpReq_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      addRessIpReq_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDRESSPORTREQ_FIELD_NUMBER = 2;
  private volatile java.lang.Object addRessPortReq_;
  /**
   * <pre>
   *端口
   * </pre>
   *
   * <code>string AddRessPortReq = 2;</code>
   */
  public java.lang.String getAddRessPortReq() {
    java.lang.Object ref = addRessPortReq_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      addRessPortReq_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *端口
   * </pre>
   *
   * <code>string AddRessPortReq = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAddRessPortReqBytes() {
    java.lang.Object ref = addRessPortReq_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      addRessPortReq_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REMARKREQ_FIELD_NUMBER = 3;
  private volatile java.lang.Object remarkReq_;
  /**
   * <pre>
   * 备注
   * </pre>
   *
   * <code>string RemarkReq = 3;</code>
   */
  public java.lang.String getRemarkReq() {
    java.lang.Object ref = remarkReq_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      remarkReq_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 备注
   * </pre>
   *
   * <code>string RemarkReq = 3;</code>
   */
  public com.google.protobuf.ByteString
      getRemarkReqBytes() {
    java.lang.Object ref = remarkReq_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      remarkReq_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getAddRessIpReqBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, addRessIpReq_);
    }
    if (!getAddRessPortReqBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, addRessPortReq_);
    }
    if (!getRemarkReqBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, remarkReq_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAddRessIpReqBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, addRessIpReq_);
    }
    if (!getAddRessPortReqBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, addRessPortReq_);
    }
    if (!getRemarkReqBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, remarkReq_);
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
    if (!(obj instanceof ClientRegisterAddressReq)) {
      return super.equals(obj);
    }
    ClientRegisterAddressReq other = (ClientRegisterAddressReq) obj;

    boolean result = true;
    result = result && getAddRessIpReq()
        .equals(other.getAddRessIpReq());
    result = result && getAddRessPortReq()
        .equals(other.getAddRessPortReq());
    result = result && getRemarkReq()
        .equals(other.getRemarkReq());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ADDRESSIPREQ_FIELD_NUMBER;
    hash = (53 * hash) + getAddRessIpReq().hashCode();
    hash = (37 * hash) + ADDRESSPORTREQ_FIELD_NUMBER;
    hash = (53 * hash) + getAddRessPortReq().hashCode();
    hash = (37 * hash) + REMARKREQ_FIELD_NUMBER;
    hash = (53 * hash) + getRemarkReq().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ClientRegisterAddressReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ClientRegisterAddressReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ClientRegisterAddressReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ClientRegisterAddressReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ClientRegisterAddressReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ClientRegisterAddressReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ClientRegisterAddressReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ClientRegisterAddressReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ClientRegisterAddressReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ClientRegisterAddressReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ClientRegisterAddressReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ClientRegisterAddressReq parseFrom(
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
  public static Builder newBuilder(ClientRegisterAddressReq prototype) {
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
   * <pre>
   *客户端注册地址
   * </pre>
   *
   * Protobuf type {@code server.ClientRegisterAddressReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:server.ClientRegisterAddressReq)
          ClientRegisterAddressReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return JavaTranscationServerProto.internal_static_server_ClientRegisterAddressReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return JavaTranscationServerProto.internal_static_server_ClientRegisterAddressReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ClientRegisterAddressReq.class, ClientRegisterAddressReq.Builder.class);
    }

    // Construct using serverproto.ClientRegisterAddressReq.newBuilder()
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
      addRessIpReq_ = "";

      addRessPortReq_ = "";

      remarkReq_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return JavaTranscationServerProto.internal_static_server_ClientRegisterAddressReq_descriptor;
    }

    @java.lang.Override
    public ClientRegisterAddressReq getDefaultInstanceForType() {
      return ClientRegisterAddressReq.getDefaultInstance();
    }

    @java.lang.Override
    public ClientRegisterAddressReq build() {
      ClientRegisterAddressReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ClientRegisterAddressReq buildPartial() {
      ClientRegisterAddressReq result = new ClientRegisterAddressReq(this);
      result.addRessIpReq_ = addRessIpReq_;
      result.addRessPortReq_ = addRessPortReq_;
      result.remarkReq_ = remarkReq_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ClientRegisterAddressReq) {
        return mergeFrom((ClientRegisterAddressReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ClientRegisterAddressReq other) {
      if (other == ClientRegisterAddressReq.getDefaultInstance()) return this;
      if (!other.getAddRessIpReq().isEmpty()) {
        addRessIpReq_ = other.addRessIpReq_;
        onChanged();
      }
      if (!other.getAddRessPortReq().isEmpty()) {
        addRessPortReq_ = other.addRessPortReq_;
        onChanged();
      }
      if (!other.getRemarkReq().isEmpty()) {
        remarkReq_ = other.remarkReq_;
        onChanged();
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
      ClientRegisterAddressReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ClientRegisterAddressReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object addRessIpReq_ = "";
    /**
     * <pre>
     *ip
     * </pre>
     *
     * <code>string AddRessIpReq = 1;</code>
     */
    public java.lang.String getAddRessIpReq() {
      java.lang.Object ref = addRessIpReq_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        addRessIpReq_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *ip
     * </pre>
     *
     * <code>string AddRessIpReq = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAddRessIpReqBytes() {
      java.lang.Object ref = addRessIpReq_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        addRessIpReq_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *ip
     * </pre>
     *
     * <code>string AddRessIpReq = 1;</code>
     */
    public Builder setAddRessIpReq(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      addRessIpReq_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *ip
     * </pre>
     *
     * <code>string AddRessIpReq = 1;</code>
     */
    public Builder clearAddRessIpReq() {
      
      addRessIpReq_ = getDefaultInstance().getAddRessIpReq();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *ip
     * </pre>
     *
     * <code>string AddRessIpReq = 1;</code>
     */
    public Builder setAddRessIpReqBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      addRessIpReq_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object addRessPortReq_ = "";
    /**
     * <pre>
     *端口
     * </pre>
     *
     * <code>string AddRessPortReq = 2;</code>
     */
    public java.lang.String getAddRessPortReq() {
      java.lang.Object ref = addRessPortReq_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        addRessPortReq_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *端口
     * </pre>
     *
     * <code>string AddRessPortReq = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAddRessPortReqBytes() {
      java.lang.Object ref = addRessPortReq_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        addRessPortReq_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *端口
     * </pre>
     *
     * <code>string AddRessPortReq = 2;</code>
     */
    public Builder setAddRessPortReq(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      addRessPortReq_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *端口
     * </pre>
     *
     * <code>string AddRessPortReq = 2;</code>
     */
    public Builder clearAddRessPortReq() {
      
      addRessPortReq_ = getDefaultInstance().getAddRessPortReq();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *端口
     * </pre>
     *
     * <code>string AddRessPortReq = 2;</code>
     */
    public Builder setAddRessPortReqBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      addRessPortReq_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object remarkReq_ = "";
    /**
     * <pre>
     * 备注
     * </pre>
     *
     * <code>string RemarkReq = 3;</code>
     */
    public java.lang.String getRemarkReq() {
      java.lang.Object ref = remarkReq_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remarkReq_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 备注
     * </pre>
     *
     * <code>string RemarkReq = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRemarkReqBytes() {
      java.lang.Object ref = remarkReq_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        remarkReq_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 备注
     * </pre>
     *
     * <code>string RemarkReq = 3;</code>
     */
    public Builder setRemarkReq(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      remarkReq_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 备注
     * </pre>
     *
     * <code>string RemarkReq = 3;</code>
     */
    public Builder clearRemarkReq() {
      
      remarkReq_ = getDefaultInstance().getRemarkReq();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 备注
     * </pre>
     *
     * <code>string RemarkReq = 3;</code>
     */
    public Builder setRemarkReqBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      remarkReq_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:server.ClientRegisterAddressReq)
  }

  // @@protoc_insertion_point(class_scope:server.ClientRegisterAddressReq)
  private static final ClientRegisterAddressReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ClientRegisterAddressReq();
  }

  public static ClientRegisterAddressReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientRegisterAddressReq>
      PARSER = new com.google.protobuf.AbstractParser<ClientRegisterAddressReq>() {
    @java.lang.Override
    public ClientRegisterAddressReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientRegisterAddressReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientRegisterAddressReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientRegisterAddressReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ClientRegisterAddressReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
