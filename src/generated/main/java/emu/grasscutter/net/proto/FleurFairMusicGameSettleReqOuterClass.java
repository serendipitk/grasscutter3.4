// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairMusicGameSettleReq.proto

package emu.grasscutter.net.proto;

public final class FleurFairMusicGameSettleReqOuterClass {
  private FleurFairMusicGameSettleReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairMusicGameSettleReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairMusicGameSettleReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 music_basic_id = 8;</code>
     * @return The musicBasicId.
     */
    int getMusicBasicId();

    /**
     * <code>uint32 correct_hit = 1;</code>
     * @return The correctHit.
     */
    int getCorrectHit();

    /**
     * <code>uint32 combo = 6;</code>
     * @return The combo.
     */
    int getCombo();

    /**
     * <code>uint32 score = 2;</code>
     * @return The score.
     */
    int getScore();
  }
  /**
   * <pre>
   * CmdId: 2055
   * Name: FLKCCEBGKDA
   * </pre>
   *
   * Protobuf type {@code FleurFairMusicGameSettleReq}
   */
  public static final class FleurFairMusicGameSettleReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FleurFairMusicGameSettleReq)
      FleurFairMusicGameSettleReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairMusicGameSettleReq.newBuilder() to construct.
    private FleurFairMusicGameSettleReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FleurFairMusicGameSettleReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairMusicGameSettleReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FleurFairMusicGameSettleReq(
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

              correctHit_ = input.readUInt32();
              break;
            }
            case 16: {

              score_ = input.readUInt32();
              break;
            }
            case 48: {

              combo_ = input.readUInt32();
              break;
            }
            case 64: {

              musicBasicId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.internal_static_FleurFairMusicGameSettleReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.internal_static_FleurFairMusicGameSettleReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq.class, emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq.Builder.class);
    }

    public static final int MUSIC_BASIC_ID_FIELD_NUMBER = 8;
    private int musicBasicId_;
    /**
     * <code>uint32 music_basic_id = 8;</code>
     * @return The musicBasicId.
     */
    @java.lang.Override
    public int getMusicBasicId() {
      return musicBasicId_;
    }

    public static final int CORRECT_HIT_FIELD_NUMBER = 1;
    private int correctHit_;
    /**
     * <code>uint32 correct_hit = 1;</code>
     * @return The correctHit.
     */
    @java.lang.Override
    public int getCorrectHit() {
      return correctHit_;
    }

    public static final int COMBO_FIELD_NUMBER = 6;
    private int combo_;
    /**
     * <code>uint32 combo = 6;</code>
     * @return The combo.
     */
    @java.lang.Override
    public int getCombo() {
      return combo_;
    }

    public static final int SCORE_FIELD_NUMBER = 2;
    private int score_;
    /**
     * <code>uint32 score = 2;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
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
      if (correctHit_ != 0) {
        output.writeUInt32(1, correctHit_);
      }
      if (score_ != 0) {
        output.writeUInt32(2, score_);
      }
      if (combo_ != 0) {
        output.writeUInt32(6, combo_);
      }
      if (musicBasicId_ != 0) {
        output.writeUInt32(8, musicBasicId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (correctHit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, correctHit_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, score_);
      }
      if (combo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, combo_);
      }
      if (musicBasicId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, musicBasicId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq other = (emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq) obj;

      if (getMusicBasicId()
          != other.getMusicBasicId()) return false;
      if (getCorrectHit()
          != other.getCorrectHit()) return false;
      if (getCombo()
          != other.getCombo()) return false;
      if (getScore()
          != other.getScore()) return false;
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
      hash = (37 * hash) + MUSIC_BASIC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMusicBasicId();
      hash = (37 * hash) + CORRECT_HIT_FIELD_NUMBER;
      hash = (53 * hash) + getCorrectHit();
      hash = (37 * hash) + COMBO_FIELD_NUMBER;
      hash = (53 * hash) + getCombo();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq prototype) {
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
     * CmdId: 2055
     * Name: FLKCCEBGKDA
     * </pre>
     *
     * Protobuf type {@code FleurFairMusicGameSettleReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FleurFairMusicGameSettleReq)
        emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.internal_static_FleurFairMusicGameSettleReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.internal_static_FleurFairMusicGameSettleReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq.class, emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq.newBuilder()
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
        musicBasicId_ = 0;

        correctHit_ = 0;

        combo_ = 0;

        score_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.internal_static_FleurFairMusicGameSettleReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq build() {
        emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq buildPartial() {
        emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq result = new emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq(this);
        result.musicBasicId_ = musicBasicId_;
        result.correctHit_ = correctHit_;
        result.combo_ = combo_;
        result.score_ = score_;
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
        if (other instanceof emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq) {
          return mergeFrom((emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq other) {
        if (other == emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq.getDefaultInstance()) return this;
        if (other.getMusicBasicId() != 0) {
          setMusicBasicId(other.getMusicBasicId());
        }
        if (other.getCorrectHit() != 0) {
          setCorrectHit(other.getCorrectHit());
        }
        if (other.getCombo() != 0) {
          setCombo(other.getCombo());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
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
        emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int musicBasicId_ ;
      /**
       * <code>uint32 music_basic_id = 8;</code>
       * @return The musicBasicId.
       */
      @java.lang.Override
      public int getMusicBasicId() {
        return musicBasicId_;
      }
      /**
       * <code>uint32 music_basic_id = 8;</code>
       * @param value The musicBasicId to set.
       * @return This builder for chaining.
       */
      public Builder setMusicBasicId(int value) {
        
        musicBasicId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 music_basic_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearMusicBasicId() {
        
        musicBasicId_ = 0;
        onChanged();
        return this;
      }

      private int correctHit_ ;
      /**
       * <code>uint32 correct_hit = 1;</code>
       * @return The correctHit.
       */
      @java.lang.Override
      public int getCorrectHit() {
        return correctHit_;
      }
      /**
       * <code>uint32 correct_hit = 1;</code>
       * @param value The correctHit to set.
       * @return This builder for chaining.
       */
      public Builder setCorrectHit(int value) {
        
        correctHit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 correct_hit = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCorrectHit() {
        
        correctHit_ = 0;
        onChanged();
        return this;
      }

      private int combo_ ;
      /**
       * <code>uint32 combo = 6;</code>
       * @return The combo.
       */
      @java.lang.Override
      public int getCombo() {
        return combo_;
      }
      /**
       * <code>uint32 combo = 6;</code>
       * @param value The combo to set.
       * @return This builder for chaining.
       */
      public Builder setCombo(int value) {
        
        combo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 combo = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCombo() {
        
        combo_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 2;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 2;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FleurFairMusicGameSettleReq)
    }

    // @@protoc_insertion_point(class_scope:FleurFairMusicGameSettleReq)
    private static final emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq();
    }

    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FleurFairMusicGameSettleReq>
        PARSER = new com.google.protobuf.AbstractParser<FleurFairMusicGameSettleReq>() {
      @java.lang.Override
      public FleurFairMusicGameSettleReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FleurFairMusicGameSettleReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FleurFairMusicGameSettleReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairMusicGameSettleReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FleurFairMusicGameSettleReqOuterClass.FleurFairMusicGameSettleReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairMusicGameSettleReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairMusicGameSettleReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!FleurFairMusicGameSettleReq.proto\"h\n\033F" +
      "leurFairMusicGameSettleReq\022\026\n\016music_basi" +
      "c_id\030\010 \001(\r\022\023\n\013correct_hit\030\001 \001(\r\022\r\n\005combo" +
      "\030\006 \001(\r\022\r\n\005score\030\002 \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FleurFairMusicGameSettleReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FleurFairMusicGameSettleReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairMusicGameSettleReq_descriptor,
        new java.lang.String[] { "MusicBasicId", "CorrectHit", "Combo", "Score", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
