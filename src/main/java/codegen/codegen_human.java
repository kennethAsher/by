// ORM class for table 'human'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat May 25 17:24:15 CST 2019
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class codegen_human extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_human.this.id = (Long)value;
      }
    });
    setters.put("name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_human.this.name = (String)value;
      }
    });
    setters.put("type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_human.this.type = (Integer)value;
      }
    });
    setters.put("gender", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_human.this.gender = (Integer)value;
      }
    });
    setters.put("description", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_human.this.description = (String)value;
      }
    });
    setters.put("sourceflag", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_human.this.sourceflag = (String)value;
      }
    });
    setters.put("education", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_human.this.education = (String)value;
      }
    });
    setters.put("age", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_human.this.age = (Integer)value;
      }
    });
    setters.put("property1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_human.this.property1 = (String)value;
      }
    });
    setters.put("property2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_human.this.property2 = (String)value;
      }
    });
    setters.put("property3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_human.this.property3 = (String)value;
      }
    });
    setters.put("property4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_human.this.property4 = (String)value;
      }
    });
    setters.put("property5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_human.this.property5 = (String)value;
      }
    });
    setters.put("updatetime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_human.this.updatetime = (java.sql.Timestamp)value;
      }
    });
  }
  public codegen_human() {
    init0();
  }
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public codegen_human with_id(Long id) {
    this.id = id;
    return this;
  }
  private String name;
  public String get_name() {
    return name;
  }
  public void set_name(String name) {
    this.name = name;
  }
  public codegen_human with_name(String name) {
    this.name = name;
    return this;
  }
  private Integer type;
  public Integer get_type() {
    return type;
  }
  public void set_type(Integer type) {
    this.type = type;
  }
  public codegen_human with_type(Integer type) {
    this.type = type;
    return this;
  }
  private Integer gender;
  public Integer get_gender() {
    return gender;
  }
  public void set_gender(Integer gender) {
    this.gender = gender;
  }
  public codegen_human with_gender(Integer gender) {
    this.gender = gender;
    return this;
  }
  private String description;
  public String get_description() {
    return description;
  }
  public void set_description(String description) {
    this.description = description;
  }
  public codegen_human with_description(String description) {
    this.description = description;
    return this;
  }
  private String sourceflag;
  public String get_sourceflag() {
    return sourceflag;
  }
  public void set_sourceflag(String sourceflag) {
    this.sourceflag = sourceflag;
  }
  public codegen_human with_sourceflag(String sourceflag) {
    this.sourceflag = sourceflag;
    return this;
  }
  private String education;
  public String get_education() {
    return education;
  }
  public void set_education(String education) {
    this.education = education;
  }
  public codegen_human with_education(String education) {
    this.education = education;
    return this;
  }
  private Integer age;
  public Integer get_age() {
    return age;
  }
  public void set_age(Integer age) {
    this.age = age;
  }
  public codegen_human with_age(Integer age) {
    this.age = age;
    return this;
  }
  private String property1;
  public String get_property1() {
    return property1;
  }
  public void set_property1(String property1) {
    this.property1 = property1;
  }
  public codegen_human with_property1(String property1) {
    this.property1 = property1;
    return this;
  }
  private String property2;
  public String get_property2() {
    return property2;
  }
  public void set_property2(String property2) {
    this.property2 = property2;
  }
  public codegen_human with_property2(String property2) {
    this.property2 = property2;
    return this;
  }
  private String property3;
  public String get_property3() {
    return property3;
  }
  public void set_property3(String property3) {
    this.property3 = property3;
  }
  public codegen_human with_property3(String property3) {
    this.property3 = property3;
    return this;
  }
  private String property4;
  public String get_property4() {
    return property4;
  }
  public void set_property4(String property4) {
    this.property4 = property4;
  }
  public codegen_human with_property4(String property4) {
    this.property4 = property4;
    return this;
  }
  private String property5;
  public String get_property5() {
    return property5;
  }
  public void set_property5(String property5) {
    this.property5 = property5;
  }
  public codegen_human with_property5(String property5) {
    this.property5 = property5;
    return this;
  }
  private java.sql.Timestamp updatetime;
  public java.sql.Timestamp get_updatetime() {
    return updatetime;
  }
  public void set_updatetime(java.sql.Timestamp updatetime) {
    this.updatetime = updatetime;
  }
  public codegen_human with_updatetime(java.sql.Timestamp updatetime) {
    this.updatetime = updatetime;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_human)) {
      return false;
    }
    codegen_human that = (codegen_human) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.type == null ? that.type == null : this.type.equals(that.type));
    equal = equal && (this.gender == null ? that.gender == null : this.gender.equals(that.gender));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.sourceflag == null ? that.sourceflag == null : this.sourceflag.equals(that.sourceflag));
    equal = equal && (this.education == null ? that.education == null : this.education.equals(that.education));
    equal = equal && (this.age == null ? that.age == null : this.age.equals(that.age));
    equal = equal && (this.property1 == null ? that.property1 == null : this.property1.equals(that.property1));
    equal = equal && (this.property2 == null ? that.property2 == null : this.property2.equals(that.property2));
    equal = equal && (this.property3 == null ? that.property3 == null : this.property3.equals(that.property3));
    equal = equal && (this.property4 == null ? that.property4 == null : this.property4.equals(that.property4));
    equal = equal && (this.property5 == null ? that.property5 == null : this.property5.equals(that.property5));
    equal = equal && (this.updatetime == null ? that.updatetime == null : this.updatetime.equals(that.updatetime));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_human)) {
      return false;
    }
    codegen_human that = (codegen_human) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.type == null ? that.type == null : this.type.equals(that.type));
    equal = equal && (this.gender == null ? that.gender == null : this.gender.equals(that.gender));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.sourceflag == null ? that.sourceflag == null : this.sourceflag.equals(that.sourceflag));
    equal = equal && (this.education == null ? that.education == null : this.education.equals(that.education));
    equal = equal && (this.age == null ? that.age == null : this.age.equals(that.age));
    equal = equal && (this.property1 == null ? that.property1 == null : this.property1.equals(that.property1));
    equal = equal && (this.property2 == null ? that.property2 == null : this.property2.equals(that.property2));
    equal = equal && (this.property3 == null ? that.property3 == null : this.property3.equals(that.property3));
    equal = equal && (this.property4 == null ? that.property4 == null : this.property4.equals(that.property4));
    equal = equal && (this.property5 == null ? that.property5 == null : this.property5.equals(that.property5));
    equal = equal && (this.updatetime == null ? that.updatetime == null : this.updatetime.equals(that.updatetime));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.name = JdbcWritableBridge.readString(2, __dbResults);
    this.type = JdbcWritableBridge.readInteger(3, __dbResults);
    this.gender = JdbcWritableBridge.readInteger(4, __dbResults);
    this.description = JdbcWritableBridge.readString(5, __dbResults);
    this.sourceflag = JdbcWritableBridge.readString(6, __dbResults);
    this.education = JdbcWritableBridge.readString(7, __dbResults);
    this.age = JdbcWritableBridge.readInteger(8, __dbResults);
    this.property1 = JdbcWritableBridge.readString(9, __dbResults);
    this.property2 = JdbcWritableBridge.readString(10, __dbResults);
    this.property3 = JdbcWritableBridge.readString(11, __dbResults);
    this.property4 = JdbcWritableBridge.readString(12, __dbResults);
    this.property5 = JdbcWritableBridge.readString(13, __dbResults);
    this.updatetime = JdbcWritableBridge.readTimestamp(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.name = JdbcWritableBridge.readString(2, __dbResults);
    this.type = JdbcWritableBridge.readInteger(3, __dbResults);
    this.gender = JdbcWritableBridge.readInteger(4, __dbResults);
    this.description = JdbcWritableBridge.readString(5, __dbResults);
    this.sourceflag = JdbcWritableBridge.readString(6, __dbResults);
    this.education = JdbcWritableBridge.readString(7, __dbResults);
    this.age = JdbcWritableBridge.readInteger(8, __dbResults);
    this.property1 = JdbcWritableBridge.readString(9, __dbResults);
    this.property2 = JdbcWritableBridge.readString(10, __dbResults);
    this.property3 = JdbcWritableBridge.readString(11, __dbResults);
    this.property4 = JdbcWritableBridge.readString(12, __dbResults);
    this.property5 = JdbcWritableBridge.readString(13, __dbResults);
    this.updatetime = JdbcWritableBridge.readTimestamp(14, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(type, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(gender, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(description, 5 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(sourceflag, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(education, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(age, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(property1, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property2, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property3, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property4, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property5, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updatetime, 14 + __off, 93, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(type, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeInteger(gender, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(description, 5 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(sourceflag, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(education, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(age, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(property1, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property2, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property3, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property4, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property5, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updatetime, 14 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.name = null;
    } else {
    this.name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.type = null;
    } else {
    this.type = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.gender = null;
    } else {
    this.gender = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.description = null;
    } else {
    this.description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sourceflag = null;
    } else {
    this.sourceflag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.education = null;
    } else {
    this.education = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.age = null;
    } else {
    this.age = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.property1 = null;
    } else {
    this.property1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.property2 = null;
    } else {
    this.property2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.property3 = null;
    } else {
    this.property3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.property4 = null;
    } else {
    this.property4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.property5 = null;
    } else {
    this.property5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.updatetime = null;
    } else {
    this.updatetime = new Timestamp(__dataIn.readLong());
    this.updatetime.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.type);
    }
    if (null == this.gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.gender);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.sourceflag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sourceflag);
    }
    if (null == this.education) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, education);
    }
    if (null == this.age) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.age);
    }
    if (null == this.property1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property1);
    }
    if (null == this.property2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property2);
    }
    if (null == this.property3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property3);
    }
    if (null == this.property4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property4);
    }
    if (null == this.property5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property5);
    }
    if (null == this.updatetime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.updatetime.getTime());
    __dataOut.writeInt(this.updatetime.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.type);
    }
    if (null == this.gender) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.gender);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.sourceflag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sourceflag);
    }
    if (null == this.education) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, education);
    }
    if (null == this.age) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.age);
    }
    if (null == this.property1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property1);
    }
    if (null == this.property2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property2);
    }
    if (null == this.property3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property3);
    }
    if (null == this.property4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property4);
    }
    if (null == this.property5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property5);
    }
    if (null == this.updatetime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.updatetime.getTime());
    __dataOut.writeInt(this.updatetime.getNanos());
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(type==null?"null":"" + type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gender==null?"null":"" + gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sourceflag==null?"null":sourceflag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(education==null?"null":education, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(age==null?"null":"" + age, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property1==null?"null":property1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property2==null?"null":property2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property3==null?"null":property3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property4==null?"null":property4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property5==null?"null":property5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updatetime==null?"null":"" + updatetime, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(type==null?"null":"" + type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gender==null?"null":"" + gender, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sourceflag==null?"null":sourceflag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(education==null?"null":education, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(age==null?"null":"" + age, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property1==null?"null":property1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property2==null?"null":property2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property3==null?"null":property3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property4==null?"null":property4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property5==null?"null":property5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updatetime==null?"null":"" + updatetime, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.type = null; } else {
      this.type = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gender = null; } else {
      this.gender = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.sourceflag = null; } else {
      this.sourceflag = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.education = null; } else {
      this.education = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.age = null; } else {
      this.age = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property1 = null; } else {
      this.property1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property2 = null; } else {
      this.property2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property3 = null; } else {
      this.property3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property4 = null; } else {
      this.property4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property5 = null; } else {
      this.property5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.updatetime = null; } else {
      this.updatetime = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.type = null; } else {
      this.type = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gender = null; } else {
      this.gender = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.sourceflag = null; } else {
      this.sourceflag = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.education = null; } else {
      this.education = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.age = null; } else {
      this.age = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property1 = null; } else {
      this.property1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property2 = null; } else {
      this.property2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property3 = null; } else {
      this.property3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property4 = null; } else {
      this.property4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property5 = null; } else {
      this.property5 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.updatetime = null; } else {
      this.updatetime = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_human o = (codegen_human) super.clone();
    o.updatetime = (o.updatetime != null) ? (java.sql.Timestamp) o.updatetime.clone() : null;
    return o;
  }

  public void clone0(codegen_human o) throws CloneNotSupportedException {
    o.updatetime = (o.updatetime != null) ? (java.sql.Timestamp) o.updatetime.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("type", this.type);
    __sqoop$field_map.put("gender", this.gender);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("sourceflag", this.sourceflag);
    __sqoop$field_map.put("education", this.education);
    __sqoop$field_map.put("age", this.age);
    __sqoop$field_map.put("property1", this.property1);
    __sqoop$field_map.put("property2", this.property2);
    __sqoop$field_map.put("property3", this.property3);
    __sqoop$field_map.put("property4", this.property4);
    __sqoop$field_map.put("property5", this.property5);
    __sqoop$field_map.put("updatetime", this.updatetime);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("type", this.type);
    __sqoop$field_map.put("gender", this.gender);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("sourceflag", this.sourceflag);
    __sqoop$field_map.put("education", this.education);
    __sqoop$field_map.put("age", this.age);
    __sqoop$field_map.put("property1", this.property1);
    __sqoop$field_map.put("property2", this.property2);
    __sqoop$field_map.put("property3", this.property3);
    __sqoop$field_map.put("property4", this.property4);
    __sqoop$field_map.put("property5", this.property5);
    __sqoop$field_map.put("updatetime", this.updatetime);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
