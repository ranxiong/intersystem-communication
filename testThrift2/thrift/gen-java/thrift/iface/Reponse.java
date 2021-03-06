/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift.iface;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-11-22")
public class Reponse implements org.apache.thrift.TBase<Reponse, Reponse._Fields>, java.io.Serializable, Cloneable, Comparable<Reponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Reponse");

  private static final org.apache.thrift.protocol.TField RESPONE_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("responeCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RESPONSE_JSON_FIELD_DESC = new org.apache.thrift.protocol.TField("responseJSON", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReponseTupleSchemeFactory());
  }

  public RESCODE responeCode; // required
  public ByteBuffer responseJSON; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESPONE_CODE((short)1, "responeCode"),
    RESPONSE_JSON((short)2, "responseJSON");

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
        case 1: // RESPONE_CODE
          return RESPONE_CODE;
        case 2: // RESPONSE_JSON
          return RESPONSE_JSON;
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
    tmpMap.put(_Fields.RESPONE_CODE, new org.apache.thrift.meta_data.FieldMetaData("responeCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.ENUM        , "RESCODE")));
    tmpMap.put(_Fields.RESPONSE_JSON, new org.apache.thrift.meta_data.FieldMetaData("responseJSON", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Reponse.class, metaDataMap);
  }

  public Reponse() {
  }

  public Reponse(
    RESCODE responeCode,
    ByteBuffer responseJSON)
  {
    this();
    this.responeCode = responeCode;
    this.responseJSON = org.apache.thrift.TBaseHelper.copyBinary(responseJSON);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Reponse(Reponse other) {
    if (other.isSetResponeCode()) {
      this.responeCode = other.responeCode;
    }
    if (other.isSetResponseJSON()) {
      this.responseJSON = org.apache.thrift.TBaseHelper.copyBinary(other.responseJSON);
    }
  }

  public Reponse deepCopy() {
    return new Reponse(this);
  }

  @Override
  public void clear() {
    this.responeCode = null;
    this.responseJSON = null;
  }

  public RESCODE getResponeCode() {
    return this.responeCode;
  }

  public Reponse setResponeCode(RESCODE responeCode) {
    this.responeCode = responeCode;
    return this;
  }

  public void unsetResponeCode() {
    this.responeCode = null;
  }

  /** Returns true if field responeCode is set (has been assigned a value) and false otherwise */
  public boolean isSetResponeCode() {
    return this.responeCode != null;
  }

  public void setResponeCodeIsSet(boolean value) {
    if (!value) {
      this.responeCode = null;
    }
  }

  public byte[] getResponseJSON() {
    setResponseJSON(org.apache.thrift.TBaseHelper.rightSize(responseJSON));
    return responseJSON == null ? null : responseJSON.array();
  }

  public ByteBuffer bufferForResponseJSON() {
    return org.apache.thrift.TBaseHelper.copyBinary(responseJSON);
  }

  public Reponse setResponseJSON(byte[] responseJSON) {
    this.responseJSON = responseJSON == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(responseJSON, responseJSON.length));
    return this;
  }

  public Reponse setResponseJSON(ByteBuffer responseJSON) {
    this.responseJSON = org.apache.thrift.TBaseHelper.copyBinary(responseJSON);
    return this;
  }

  public void unsetResponseJSON() {
    this.responseJSON = null;
  }

  /** Returns true if field responseJSON is set (has been assigned a value) and false otherwise */
  public boolean isSetResponseJSON() {
    return this.responseJSON != null;
  }

  public void setResponseJSONIsSet(boolean value) {
    if (!value) {
      this.responseJSON = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESPONE_CODE:
      if (value == null) {
        unsetResponeCode();
      } else {
        setResponeCode((RESCODE)value);
      }
      break;

    case RESPONSE_JSON:
      if (value == null) {
        unsetResponseJSON();
      } else {
        setResponseJSON((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESPONE_CODE:
      return getResponeCode();

    case RESPONSE_JSON:
      return getResponseJSON();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESPONE_CODE:
      return isSetResponeCode();
    case RESPONSE_JSON:
      return isSetResponseJSON();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Reponse)
      return this.equals((Reponse)that);
    return false;
  }

  public boolean equals(Reponse that) {
    if (that == null)
      return false;

    boolean this_present_responeCode = true && this.isSetResponeCode();
    boolean that_present_responeCode = true && that.isSetResponeCode();
    if (this_present_responeCode || that_present_responeCode) {
      if (!(this_present_responeCode && that_present_responeCode))
        return false;
      if (!this.responeCode.equals(that.responeCode))
        return false;
    }

    boolean this_present_responseJSON = true && this.isSetResponseJSON();
    boolean that_present_responseJSON = true && that.isSetResponseJSON();
    if (this_present_responseJSON || that_present_responseJSON) {
      if (!(this_present_responseJSON && that_present_responseJSON))
        return false;
      if (!this.responseJSON.equals(that.responseJSON))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_responeCode = true && (isSetResponeCode());
    list.add(present_responeCode);
    if (present_responeCode)
      list.add(responeCode.getValue());

    boolean present_responseJSON = true && (isSetResponseJSON());
    list.add(present_responseJSON);
    if (present_responseJSON)
      list.add(responseJSON);

    return list.hashCode();
  }

  @Override
  public int compareTo(Reponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResponeCode()).compareTo(other.isSetResponeCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResponeCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.responeCode, other.responeCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResponseJSON()).compareTo(other.isSetResponseJSON());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResponseJSON()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.responseJSON, other.responseJSON);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Reponse(");
    boolean first = true;

    sb.append("responeCode:");
    if (this.responeCode == null) {
      sb.append("null");
    } else {
      sb.append(this.responeCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("responseJSON:");
    if (this.responseJSON == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.responseJSON, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (responeCode == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'responeCode' was not present! Struct: " + toString());
    }
    if (responseJSON == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'responseJSON' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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

  private static class ReponseStandardSchemeFactory implements SchemeFactory {
    public ReponseStandardScheme getScheme() {
      return new ReponseStandardScheme();
    }
  }

  private static class ReponseStandardScheme extends StandardScheme<Reponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Reponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESPONE_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.responeCode = thrift.iface.RESCODE.findByValue(iprot.readI32());
              struct.setResponeCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESPONSE_JSON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.responseJSON = iprot.readBinary();
              struct.setResponseJSONIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Reponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.responeCode != null) {
        oprot.writeFieldBegin(RESPONE_CODE_FIELD_DESC);
        oprot.writeI32(struct.responeCode.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.responseJSON != null) {
        oprot.writeFieldBegin(RESPONSE_JSON_FIELD_DESC);
        oprot.writeBinary(struct.responseJSON);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReponseTupleSchemeFactory implements SchemeFactory {
    public ReponseTupleScheme getScheme() {
      return new ReponseTupleScheme();
    }
  }

  private static class ReponseTupleScheme extends TupleScheme<Reponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Reponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.responeCode.getValue());
      oprot.writeBinary(struct.responseJSON);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Reponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.responeCode = thrift.iface.RESCODE.findByValue(iprot.readI32());
      struct.setResponeCodeIsSet(true);
      struct.responseJSON = iprot.readBinary();
      struct.setResponseJSONIsSet(true);
    }
  }

}

