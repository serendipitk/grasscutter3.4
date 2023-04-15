// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetFriendShowNameCardInfoRsp.proto

package emu.grasscutter.net.proto;

public final class GetFriendShowNameCardInfoRspOuterClass {
  private GetFriendShowNameCardInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetFriendShowNameCardInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetFriendShowNameCardInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 show_name_card_id_list = 15;</code>
     * @return A list containing the showNameCardIdList.
     */
    java.util.List<java.lang.Integer> getShowNameCardIdListList();
    /**
     * <code>repeated uint32 show_name_card_id_list = 15;</code>
     * @return The count of showNameCardIdList.
     */
    int getShowNameCardIdListCount();
    /**
     * <code>repeated uint32 show_name_card_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The showNameCardIdList at the given index.
     */
    int getShowNameCardIdList(int index);

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 uid = 2;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * CmdId: 4064
   * Name: PPLMPOEMAAO
   * </pre>
   *
   * Protobuf type {@code GetFriendShowNameCardInfoRsp}
   */
  public static final class GetFriendShowNameCardInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetFriendShowNameCardInfoRsp)
      GetFriendShowNameCardInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetFriendShowNameCardInfoRsp.newBuilder() to construct.
    private GetFriendShowNameCardInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetFriendShowNameCardInfoRsp() {
      showNameCardIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetFriendShowNameCardInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetFriendShowNameCardInfoRsp(
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
            case 16: {

              uid_ = input.readUInt32();
              break;
            }
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 120: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                showNameCardIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              showNameCardIdList_.addInt(input.readUInt32());
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                showNameCardIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                showNameCardIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          showNameCardIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.internal_static_GetFriendShowNameCardInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.internal_static_GetFriendShowNameCardInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.class, emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.Builder.class);
    }

    public static final int SHOW_NAME_CARD_ID_LIST_FIELD_NUMBER = 15;
    private com.google.protobuf.Internal.IntList showNameCardIdList_;
    /**
     * <code>repeated uint32 show_name_card_id_list = 15;</code>
     * @return A list containing the showNameCardIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getShowNameCardIdListList() {
      return showNameCardIdList_;
    }
    /**
     * <code>repeated uint32 show_name_card_id_list = 15;</code>
     * @return The count of showNameCardIdList.
     */
    public int getShowNameCardIdListCount() {
      return showNameCardIdList_.size();
    }
    /**
     * <code>repeated uint32 show_name_card_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The showNameCardIdList at the given index.
     */
    public int getShowNameCardIdList(int index) {
      return showNameCardIdList_.getInt(index);
    }
    private int showNameCardIdListMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UID_FIELD_NUMBER = 2;
    private int uid_;
    /**
     * <code>uint32 uid = 2;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      getSerializedSize();
      if (uid_ != 0) {
        output.writeUInt32(2, uid_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (getShowNameCardIdListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(showNameCardIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < showNameCardIdList_.size(); i++) {
        output.writeUInt32NoTag(showNameCardIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, uid_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < showNameCardIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(showNameCardIdList_.getInt(i));
        }
        size += dataSize;
        if (!getShowNameCardIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        showNameCardIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp other = (emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp) obj;

      if (!getShowNameCardIdListList()
          .equals(other.getShowNameCardIdListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getUid()
          != other.getUid()) return false;
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
      if (getShowNameCardIdListCount() > 0) {
        hash = (37 * hash) + SHOW_NAME_CARD_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getShowNameCardIdListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp prototype) {
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
     * CmdId: 4064
     * Name: PPLMPOEMAAO
     * </pre>
     *
     * Protobuf type {@code GetFriendShowNameCardInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetFriendShowNameCardInfoRsp)
        emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.internal_static_GetFriendShowNameCardInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.internal_static_GetFriendShowNameCardInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.class, emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.newBuilder()
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
        showNameCardIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        uid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.internal_static_GetFriendShowNameCardInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp build() {
        emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp buildPartial() {
        emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp result = new emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          showNameCardIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.showNameCardIdList_ = showNameCardIdList_;
        result.retcode_ = retcode_;
        result.uid_ = uid_;
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
        if (other instanceof emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp other) {
        if (other == emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp.getDefaultInstance()) return this;
        if (!other.showNameCardIdList_.isEmpty()) {
          if (showNameCardIdList_.isEmpty()) {
            showNameCardIdList_ = other.showNameCardIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureShowNameCardIdListIsMutable();
            showNameCardIdList_.addAll(other.showNameCardIdList_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
        emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList showNameCardIdList_ = emptyIntList();
      private void ensureShowNameCardIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          showNameCardIdList_ = mutableCopy(showNameCardIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 15;</code>
       * @return A list containing the showNameCardIdList.
       */
      public java.util.List<java.lang.Integer>
          getShowNameCardIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(showNameCardIdList_) : showNameCardIdList_;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 15;</code>
       * @return The count of showNameCardIdList.
       */
      public int getShowNameCardIdListCount() {
        return showNameCardIdList_.size();
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 15;</code>
       * @param index The index of the element to return.
       * @return The showNameCardIdList at the given index.
       */
      public int getShowNameCardIdList(int index) {
        return showNameCardIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The showNameCardIdList to set.
       * @return This builder for chaining.
       */
      public Builder setShowNameCardIdList(
          int index, int value) {
        ensureShowNameCardIdListIsMutable();
        showNameCardIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 15;</code>
       * @param value The showNameCardIdList to add.
       * @return This builder for chaining.
       */
      public Builder addShowNameCardIdList(int value) {
        ensureShowNameCardIdListIsMutable();
        showNameCardIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 15;</code>
       * @param values The showNameCardIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllShowNameCardIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureShowNameCardIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, showNameCardIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 show_name_card_id_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearShowNameCardIdList() {
        showNameCardIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 2;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 2;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetFriendShowNameCardInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetFriendShowNameCardInfoRsp)
    private static final emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp();
    }

    public static emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetFriendShowNameCardInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetFriendShowNameCardInfoRsp>() {
      @java.lang.Override
      public GetFriendShowNameCardInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetFriendShowNameCardInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetFriendShowNameCardInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetFriendShowNameCardInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetFriendShowNameCardInfoRspOuterClass.GetFriendShowNameCardInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetFriendShowNameCardInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetFriendShowNameCardInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"GetFriendShowNameCardInfoRsp.proto\"\\\n\034" +
      "GetFriendShowNameCardInfoRsp\022\036\n\026show_nam" +
      "e_card_id_list\030\017 \003(\r\022\017\n\007retcode\030\t \001(\005\022\013\n" +
      "\003uid\030\002 \001(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetFriendShowNameCardInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetFriendShowNameCardInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetFriendShowNameCardInfoRsp_descriptor,
        new java.lang.String[] { "ShowNameCardIdList", "Retcode", "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
