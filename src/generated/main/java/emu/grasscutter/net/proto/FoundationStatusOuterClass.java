// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoundationStatus.proto

package emu.grasscutter.net.proto;

public final class FoundationStatusOuterClass {
  private FoundationStatusOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Name: BBEMLEOGGGN
   * </pre>
   *
   * Protobuf enum {@code FoundationStatus}
   */
  public enum FoundationStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FOUNDATION_STATUS_NONE = 0;</code>
     */
    FOUNDATION_STATUS_NONE(0),
    /**
     * <code>FOUNDATION_STATUS_INIT = 1;</code>
     */
    FOUNDATION_STATUS_INIT(1),
    /**
     * <code>FOUNDATION_STATUS_BUILDING = 2;</code>
     */
    FOUNDATION_STATUS_BUILDING(2),
    /**
     * <code>FOUNDATION_STATUS_BUILT = 3;</code>
     */
    FOUNDATION_STATUS_BUILT(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FOUNDATION_STATUS_NONE = 0;</code>
     */
    public static final int FOUNDATION_STATUS_NONE_VALUE = 0;
    /**
     * <code>FOUNDATION_STATUS_INIT = 1;</code>
     */
    public static final int FOUNDATION_STATUS_INIT_VALUE = 1;
    /**
     * <code>FOUNDATION_STATUS_BUILDING = 2;</code>
     */
    public static final int FOUNDATION_STATUS_BUILDING_VALUE = 2;
    /**
     * <code>FOUNDATION_STATUS_BUILT = 3;</code>
     */
    public static final int FOUNDATION_STATUS_BUILT_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FoundationStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FoundationStatus forNumber(int value) {
      switch (value) {
        case 0: return FOUNDATION_STATUS_NONE;
        case 1: return FOUNDATION_STATUS_INIT;
        case 2: return FOUNDATION_STATUS_BUILDING;
        case 3: return FOUNDATION_STATUS_BUILT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FoundationStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FoundationStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FoundationStatus>() {
            public FoundationStatus findValueByNumber(int number) {
              return FoundationStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FoundationStatusOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final FoundationStatus[] VALUES = values();

    public static FoundationStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private FoundationStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:FoundationStatus)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026FoundationStatus.proto*\207\001\n\020FoundationS" +
      "tatus\022\032\n\026FOUNDATION_STATUS_NONE\020\000\022\032\n\026FOU" +
      "NDATION_STATUS_INIT\020\001\022\036\n\032FOUNDATION_STAT" +
      "US_BUILDING\020\002\022\033\n\027FOUNDATION_STATUS_BUILT" +
      "\020\003B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
