/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.cloumon.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SystemFileSystemInfo implements org.apache.thrift.TBase<SystemFileSystemInfo, SystemFileSystemInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SystemFileSystemInfo");

  private static final org.apache.thrift.protocol.TField FILE_SYSTEMS_FIELD_DESC = new org.apache.thrift.protocol.TField("fileSystems", org.apache.thrift.protocol.TType.LIST, (short)1);

  public List<String> fileSystems;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FILE_SYSTEMS((short)1, "fileSystems");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FILE_SYSTEMS
          return FILE_SYSTEMS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILE_SYSTEMS, new org.apache.thrift.meta_data.FieldMetaData("fileSystems", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SystemFileSystemInfo.class, metaDataMap);
  }

  public SystemFileSystemInfo() {
  }

  public SystemFileSystemInfo(
    List<String> fileSystems)
  {
    this();
    this.fileSystems = fileSystems;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SystemFileSystemInfo(SystemFileSystemInfo other) {
    if (other.isSetFileSystems()) {
      List<String> __this__fileSystems = new ArrayList<String>();
      for (String other_element : other.fileSystems) {
        __this__fileSystems.add(other_element);
      }
      this.fileSystems = __this__fileSystems;
    }
  }

  public SystemFileSystemInfo deepCopy() {
    return new SystemFileSystemInfo(this);
  }

  @Override
  public void clear() {
    this.fileSystems = null;
  }

  public int getFileSystemsSize() {
    return (this.fileSystems == null) ? 0 : this.fileSystems.size();
  }

  public java.util.Iterator<String> getFileSystemsIterator() {
    return (this.fileSystems == null) ? null : this.fileSystems.iterator();
  }

  public void addToFileSystems(String elem) {
    if (this.fileSystems == null) {
      this.fileSystems = new ArrayList<String>();
    }
    this.fileSystems.add(elem);
  }

  public List<String> getFileSystems() {
    return this.fileSystems;
  }

  public SystemFileSystemInfo setFileSystems(List<String> fileSystems) {
    this.fileSystems = fileSystems;
    return this;
  }

  public void unsetFileSystems() {
    this.fileSystems = null;
  }

  /** Returns true if field fileSystems is set (has been assigned a value) and false otherwise */
  public boolean isSetFileSystems() {
    return this.fileSystems != null;
  }

  public void setFileSystemsIsSet(boolean value) {
    if (!value) {
      this.fileSystems = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FILE_SYSTEMS:
      if (value == null) {
        unsetFileSystems();
      } else {
        setFileSystems((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FILE_SYSTEMS:
      return getFileSystems();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FILE_SYSTEMS:
      return isSetFileSystems();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SystemFileSystemInfo)
      return this.equals((SystemFileSystemInfo)that);
    return false;
  }

  public boolean equals(SystemFileSystemInfo that) {
    if (that == null)
      return false;

    boolean this_present_fileSystems = true && this.isSetFileSystems();
    boolean that_present_fileSystems = true && that.isSetFileSystems();
    if (this_present_fileSystems || that_present_fileSystems) {
      if (!(this_present_fileSystems && that_present_fileSystems))
        return false;
      if (!this.fileSystems.equals(that.fileSystems))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SystemFileSystemInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SystemFileSystemInfo typedOther = (SystemFileSystemInfo)other;

    lastComparison = Boolean.valueOf(isSetFileSystems()).compareTo(typedOther.isSetFileSystems());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileSystems()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fileSystems, typedOther.fileSystems);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // FILE_SYSTEMS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list4 = iprot.readListBegin();
              this.fileSystems = new ArrayList<String>(_list4.size);
              for (int _i5 = 0; _i5 < _list4.size; ++_i5)
              {
                String _elem6;
                _elem6 = iprot.readString();
                this.fileSystems.add(_elem6);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.fileSystems != null) {
      oprot.writeFieldBegin(FILE_SYSTEMS_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, this.fileSystems.size()));
        for (String _iter7 : this.fileSystems)
        {
          oprot.writeString(_iter7);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SystemFileSystemInfo(");
    boolean first = true;

    sb.append("fileSystems:");
    if (this.fileSystems == null) {
      sb.append("null");
    } else {
      sb.append(this.fileSystems);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
