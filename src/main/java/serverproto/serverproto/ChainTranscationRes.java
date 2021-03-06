// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: eventServer.proto

package serverproto.serverproto;

/**
 * <pre>
 *服务端对链请求交易返回值
 * </pre>
 *
 * Protobuf type {@code server.ChainTranscationRes}
 */
public  final class ChainTranscationRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:server.ChainTranscationRes)
    ChainTranscationResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChainTranscationRes.newBuilder() to construct.
  private ChainTranscationRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChainTranscationRes() {
    batchidReq_ = "";
    isSuccess_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChainTranscationRes(
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

            batchidReq_ = s;
            break;
          }
          case 16: {

            isSuccess_ = input.readBool();
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
    return JavaTranscationServerProto.internal_static_server_ChainTranscationRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return JavaTranscationServerProto.internal_static_server_ChainTranscationRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ChainTranscationRes.class, ChainTranscationRes.Builder.class);
  }

  public static final int BATCHIDREQ_FIELD_NUMBER = 1;
  private volatile java.lang.Object batchidReq_;
  /**
   * <code>string BatchidReq = 1;</code>
   */
  public java.lang.String getBatchidReq() {
    java.lang.Object ref = batchidReq_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      batchidReq_ = s;
      return s;
    }
  }
  /**
   * <code>string BatchidReq = 1;</code>
   */
  public com.google.protobuf.ByteString
      getBatchidReqBytes() {
    java.lang.Object ref = batchidReq_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      batchidReq_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISSUCCESS_FIELD_NUMBER = 2;
  private boolean isSuccess_;
  /**
   * <code>bool IsSuccess = 2;</code>
   */
  public boolean getIsSuccess() {
    return isSuccess_;
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
    if (!getBatchidReqBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, batchidReq_);
    }
    if (isSuccess_ != false) {
      output.writeBool(2, isSuccess_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBatchidReqBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, batchidReq_);
    }
    if (isSuccess_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isSuccess_);
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
    if (!(obj instanceof ChainTranscationRes)) {
      return super.equals(obj);
    }
    ChainTranscationRes other = (ChainTranscationRes) obj;

    boolean result = true;
    result = result && getBatchidReq()
        .equals(other.getBatchidReq());
    result = result && (getIsSuccess()
        == other.getIsSuccess());
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
    hash = (37 * hash) + BATCHIDREQ_FIELD_NUMBER;
    hash = (53 * hash) + getBatchidReq().hashCode();
    hash = (37 * hash) + ISSUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsSuccess());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ChainTranscationRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ChainTranscationRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ChainTranscationRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ChainTranscationRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ChainTranscationRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ChainTranscationRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ChainTranscationRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ChainTranscationRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ChainTranscationRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ChainTranscationRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ChainTranscationRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ChainTranscationRes parseFrom(
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
  public static Builder newBuilder(ChainTranscationRes prototype) {
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
   *服务端对链请求交易返回值
   * </pre>
   *
   * Protobuf type {@code server.ChainTranscationRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:server.ChainTranscationRes)
          ChainTranscationResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return JavaTranscationServerProto.internal_static_server_ChainTranscationRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return JavaTranscationServerProto.internal_static_server_ChainTranscationRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ChainTranscationRes.class, ChainTranscationRes.Builder.class);
    }

    // Construct using serverproto.ChainTranscationRes.newBuilder()
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
      batchidReq_ = "";

      isSuccess_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return JavaTranscationServerProto.internal_static_server_ChainTranscationRes_descriptor;
    }

    @java.lang.Override
    public ChainTranscationRes getDefaultInstanceForType() {
      return ChainTranscationRes.getDefaultInstance();
    }

    @java.lang.Override
    public ChainTranscationRes build() {
      ChainTranscationRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ChainTranscationRes buildPartial() {
      ChainTranscationRes result = new ChainTranscationRes(this);
      result.batchidReq_ = batchidReq_;
      result.isSuccess_ = isSuccess_;
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
      if (other instanceof ChainTranscationRes) {
        return mergeFrom((ChainTranscationRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ChainTranscationRes other) {
      if (other == ChainTranscationRes.getDefaultInstance()) return this;
      if (!other.getBatchidReq().isEmpty()) {
        batchidReq_ = other.batchidReq_;
        onChanged();
      }
      if (other.getIsSuccess() != false) {
        setIsSuccess(other.getIsSuccess());
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
      ChainTranscationRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ChainTranscationRes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object batchidReq_ = "";
    /**
     * <code>string BatchidReq = 1;</code>
     */
    public java.lang.String getBatchidReq() {
      java.lang.Object ref = batchidReq_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        batchidReq_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string BatchidReq = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBatchidReqBytes() {
      java.lang.Object ref = batchidReq_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        batchidReq_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string BatchidReq = 1;</code>
     */
    public Builder setBatchidReq(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      batchidReq_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string BatchidReq = 1;</code>
     */
    public Builder clearBatchidReq() {
      
      batchidReq_ = getDefaultInstance().getBatchidReq();
      onChanged();
      return this;
    }
    /**
     * <code>string BatchidReq = 1;</code>
     */
    public Builder setBatchidReqBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      batchidReq_ = value;
      onChanged();
      return this;
    }

    private boolean isSuccess_ ;
    /**
     * <code>bool IsSuccess = 2;</code>
     */
    public boolean getIsSuccess() {
      return isSuccess_;
    }
    /**
     * <code>bool IsSuccess = 2;</code>
     */
    public Builder setIsSuccess(boolean value) {
      
      isSuccess_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool IsSuccess = 2;</code>
     */
    public Builder clearIsSuccess() {
      
      isSuccess_ = false;
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


    // @@protoc_insertion_point(builder_scope:server.ChainTranscationRes)
  }

  // @@protoc_insertion_point(class_scope:server.ChainTranscationRes)
  private static final ChainTranscationRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ChainTranscationRes();
  }

  public static ChainTranscationRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChainTranscationRes>
      PARSER = new com.google.protobuf.AbstractParser<ChainTranscationRes>() {
    @java.lang.Override
    public ChainTranscationRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChainTranscationRes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChainTranscationRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChainTranscationRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ChainTranscationRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

