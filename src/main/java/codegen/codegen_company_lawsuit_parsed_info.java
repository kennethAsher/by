// ORM class for table 'company_lawsuit_parsed_info'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Apr 23 21:30:33 CST 2019
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

public class codegen_company_lawsuit_parsed_info extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit_parsed_info.this.id = (Long)value;
      }
    });
    setters.put("lawsuit_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit_parsed_info.this.lawsuit_id = (Integer)value;
      }
    });
    setters.put("lawsuit_uuid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit_parsed_info.this.lawsuit_uuid = (String)value;
      }
    });
    setters.put("openlaw_case_reason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit_parsed_info.this.openlaw_case_reason = (String)value;
      }
    });
    setters.put("jd_case_reason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit_parsed_info.this.jd_case_reason = (String)value;
      }
    });
    setters.put("plaintiffs", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit_parsed_info.this.plaintiffs = (String)value;
      }
    });
    setters.put("defendants", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit_parsed_info.this.defendants = (String)value;
      }
    });
    setters.put("thirdParties", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit_parsed_info.this.thirdParties = (String)value;
      }
    });
    setters.put("update_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit_parsed_info.this.update_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("create_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit_parsed_info.this.create_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("deleted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit_parsed_info.this.deleted = (Integer)value;
      }
    });
    setters.put("for_search", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit_parsed_info.this.for_search = (String)value;
      }
    });
  }
  public codegen_company_lawsuit_parsed_info() {
    init0();
  }
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public codegen_company_lawsuit_parsed_info with_id(Long id) {
    this.id = id;
    return this;
  }
  private Integer lawsuit_id;
  public Integer get_lawsuit_id() {
    return lawsuit_id;
  }
  public void set_lawsuit_id(Integer lawsuit_id) {
    this.lawsuit_id = lawsuit_id;
  }
  public codegen_company_lawsuit_parsed_info with_lawsuit_id(Integer lawsuit_id) {
    this.lawsuit_id = lawsuit_id;
    return this;
  }
  private String lawsuit_uuid;
  public String get_lawsuit_uuid() {
    return lawsuit_uuid;
  }
  public void set_lawsuit_uuid(String lawsuit_uuid) {
    this.lawsuit_uuid = lawsuit_uuid;
  }
  public codegen_company_lawsuit_parsed_info with_lawsuit_uuid(String lawsuit_uuid) {
    this.lawsuit_uuid = lawsuit_uuid;
    return this;
  }
  private String openlaw_case_reason;
  public String get_openlaw_case_reason() {
    return openlaw_case_reason;
  }
  public void set_openlaw_case_reason(String openlaw_case_reason) {
    this.openlaw_case_reason = openlaw_case_reason;
  }
  public codegen_company_lawsuit_parsed_info with_openlaw_case_reason(String openlaw_case_reason) {
    this.openlaw_case_reason = openlaw_case_reason;
    return this;
  }
  private String jd_case_reason;
  public String get_jd_case_reason() {
    return jd_case_reason;
  }
  public void set_jd_case_reason(String jd_case_reason) {
    this.jd_case_reason = jd_case_reason;
  }
  public codegen_company_lawsuit_parsed_info with_jd_case_reason(String jd_case_reason) {
    this.jd_case_reason = jd_case_reason;
    return this;
  }
  private String plaintiffs;
  public String get_plaintiffs() {
    return plaintiffs;
  }
  public void set_plaintiffs(String plaintiffs) {
    this.plaintiffs = plaintiffs;
  }
  public codegen_company_lawsuit_parsed_info with_plaintiffs(String plaintiffs) {
    this.plaintiffs = plaintiffs;
    return this;
  }
  private String defendants;
  public String get_defendants() {
    return defendants;
  }
  public void set_defendants(String defendants) {
    this.defendants = defendants;
  }
  public codegen_company_lawsuit_parsed_info with_defendants(String defendants) {
    this.defendants = defendants;
    return this;
  }
  private String thirdParties;
  public String get_thirdParties() {
    return thirdParties;
  }
  public void set_thirdParties(String thirdParties) {
    this.thirdParties = thirdParties;
  }
  public codegen_company_lawsuit_parsed_info with_thirdParties(String thirdParties) {
    this.thirdParties = thirdParties;
    return this;
  }
  private java.sql.Timestamp update_time;
  public java.sql.Timestamp get_update_time() {
    return update_time;
  }
  public void set_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
  }
  public codegen_company_lawsuit_parsed_info with_update_time(java.sql.Timestamp update_time) {
    this.update_time = update_time;
    return this;
  }
  private java.sql.Timestamp create_time;
  public java.sql.Timestamp get_create_time() {
    return create_time;
  }
  public void set_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }
  public codegen_company_lawsuit_parsed_info with_create_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
    return this;
  }
  private Integer deleted;
  public Integer get_deleted() {
    return deleted;
  }
  public void set_deleted(Integer deleted) {
    this.deleted = deleted;
  }
  public codegen_company_lawsuit_parsed_info with_deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }
  private String for_search;
  public String get_for_search() {
    return for_search;
  }
  public void set_for_search(String for_search) {
    this.for_search = for_search;
  }
  public codegen_company_lawsuit_parsed_info with_for_search(String for_search) {
    this.for_search = for_search;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_company_lawsuit_parsed_info)) {
      return false;
    }
    codegen_company_lawsuit_parsed_info that = (codegen_company_lawsuit_parsed_info) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.lawsuit_id == null ? that.lawsuit_id == null : this.lawsuit_id.equals(that.lawsuit_id));
    equal = equal && (this.lawsuit_uuid == null ? that.lawsuit_uuid == null : this.lawsuit_uuid.equals(that.lawsuit_uuid));
    equal = equal && (this.openlaw_case_reason == null ? that.openlaw_case_reason == null : this.openlaw_case_reason.equals(that.openlaw_case_reason));
    equal = equal && (this.jd_case_reason == null ? that.jd_case_reason == null : this.jd_case_reason.equals(that.jd_case_reason));
    equal = equal && (this.plaintiffs == null ? that.plaintiffs == null : this.plaintiffs.equals(that.plaintiffs));
    equal = equal && (this.defendants == null ? that.defendants == null : this.defendants.equals(that.defendants));
    equal = equal && (this.thirdParties == null ? that.thirdParties == null : this.thirdParties.equals(that.thirdParties));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.deleted == null ? that.deleted == null : this.deleted.equals(that.deleted));
    equal = equal && (this.for_search == null ? that.for_search == null : this.for_search.equals(that.for_search));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_company_lawsuit_parsed_info)) {
      return false;
    }
    codegen_company_lawsuit_parsed_info that = (codegen_company_lawsuit_parsed_info) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.lawsuit_id == null ? that.lawsuit_id == null : this.lawsuit_id.equals(that.lawsuit_id));
    equal = equal && (this.lawsuit_uuid == null ? that.lawsuit_uuid == null : this.lawsuit_uuid.equals(that.lawsuit_uuid));
    equal = equal && (this.openlaw_case_reason == null ? that.openlaw_case_reason == null : this.openlaw_case_reason.equals(that.openlaw_case_reason));
    equal = equal && (this.jd_case_reason == null ? that.jd_case_reason == null : this.jd_case_reason.equals(that.jd_case_reason));
    equal = equal && (this.plaintiffs == null ? that.plaintiffs == null : this.plaintiffs.equals(that.plaintiffs));
    equal = equal && (this.defendants == null ? that.defendants == null : this.defendants.equals(that.defendants));
    equal = equal && (this.thirdParties == null ? that.thirdParties == null : this.thirdParties.equals(that.thirdParties));
    equal = equal && (this.update_time == null ? that.update_time == null : this.update_time.equals(that.update_time));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.deleted == null ? that.deleted == null : this.deleted.equals(that.deleted));
    equal = equal && (this.for_search == null ? that.for_search == null : this.for_search.equals(that.for_search));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.lawsuit_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.lawsuit_uuid = JdbcWritableBridge.readString(3, __dbResults);
    this.openlaw_case_reason = JdbcWritableBridge.readString(4, __dbResults);
    this.jd_case_reason = JdbcWritableBridge.readString(5, __dbResults);
    this.plaintiffs = JdbcWritableBridge.readString(6, __dbResults);
    this.defendants = JdbcWritableBridge.readString(7, __dbResults);
    this.thirdParties = JdbcWritableBridge.readString(8, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.deleted = JdbcWritableBridge.readInteger(11, __dbResults);
    this.for_search = JdbcWritableBridge.readString(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.lawsuit_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.lawsuit_uuid = JdbcWritableBridge.readString(3, __dbResults);
    this.openlaw_case_reason = JdbcWritableBridge.readString(4, __dbResults);
    this.jd_case_reason = JdbcWritableBridge.readString(5, __dbResults);
    this.plaintiffs = JdbcWritableBridge.readString(6, __dbResults);
    this.defendants = JdbcWritableBridge.readString(7, __dbResults);
    this.thirdParties = JdbcWritableBridge.readString(8, __dbResults);
    this.update_time = JdbcWritableBridge.readTimestamp(9, __dbResults);
    this.create_time = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.deleted = JdbcWritableBridge.readInteger(11, __dbResults);
    this.for_search = JdbcWritableBridge.readString(12, __dbResults);
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
    JdbcWritableBridge.writeInteger(lawsuit_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(lawsuit_uuid, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(openlaw_case_reason, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(jd_case_reason, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(plaintiffs, 6 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(defendants, 7 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(thirdParties, 8 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(deleted, 11 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(for_search, 12 + __off, 12, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(lawsuit_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(lawsuit_uuid, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(openlaw_case_reason, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(jd_case_reason, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(plaintiffs, 6 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(defendants, 7 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(thirdParties, 8 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_time, 9 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_time, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(deleted, 11 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(for_search, 12 + __off, 12, __dbStmt);
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
        this.lawsuit_id = null;
    } else {
    this.lawsuit_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.lawsuit_uuid = null;
    } else {
    this.lawsuit_uuid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.openlaw_case_reason = null;
    } else {
    this.openlaw_case_reason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.jd_case_reason = null;
    } else {
    this.jd_case_reason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.plaintiffs = null;
    } else {
    this.plaintiffs = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.defendants = null;
    } else {
    this.defendants = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.thirdParties = null;
    } else {
    this.thirdParties = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.update_time = null;
    } else {
    this.update_time = new Timestamp(__dataIn.readLong());
    this.update_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.create_time = null;
    } else {
    this.create_time = new Timestamp(__dataIn.readLong());
    this.create_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.deleted = null;
    } else {
    this.deleted = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.for_search = null;
    } else {
    this.for_search = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.lawsuit_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.lawsuit_id);
    }
    if (null == this.lawsuit_uuid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lawsuit_uuid);
    }
    if (null == this.openlaw_case_reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, openlaw_case_reason);
    }
    if (null == this.jd_case_reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, jd_case_reason);
    }
    if (null == this.plaintiffs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, plaintiffs);
    }
    if (null == this.defendants) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, defendants);
    }
    if (null == this.thirdParties) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, thirdParties);
    }
    if (null == this.update_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_time.getTime());
    __dataOut.writeInt(this.update_time.getNanos());
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time.getTime());
    __dataOut.writeInt(this.create_time.getNanos());
    }
    if (null == this.deleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.deleted);
    }
    if (null == this.for_search) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, for_search);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.lawsuit_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.lawsuit_id);
    }
    if (null == this.lawsuit_uuid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lawsuit_uuid);
    }
    if (null == this.openlaw_case_reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, openlaw_case_reason);
    }
    if (null == this.jd_case_reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, jd_case_reason);
    }
    if (null == this.plaintiffs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, plaintiffs);
    }
    if (null == this.defendants) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, defendants);
    }
    if (null == this.thirdParties) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, thirdParties);
    }
    if (null == this.update_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_time.getTime());
    __dataOut.writeInt(this.update_time.getNanos());
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_time.getTime());
    __dataOut.writeInt(this.create_time.getNanos());
    }
    if (null == this.deleted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.deleted);
    }
    if (null == this.for_search) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, for_search);
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
    __sb.append(FieldFormatter.escapeAndEnclose(lawsuit_id==null?"null":"" + lawsuit_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawsuit_uuid==null?"null":lawsuit_uuid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(openlaw_case_reason==null?"null":openlaw_case_reason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(jd_case_reason==null?"null":jd_case_reason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(plaintiffs==null?"null":plaintiffs, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(defendants==null?"null":defendants, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(thirdParties==null?"null":thirdParties, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"null":"" + update_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(deleted==null?"null":"" + deleted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(for_search==null?"null":for_search, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawsuit_id==null?"null":"" + lawsuit_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawsuit_uuid==null?"null":lawsuit_uuid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(openlaw_case_reason==null?"null":openlaw_case_reason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(jd_case_reason==null?"null":jd_case_reason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(plaintiffs==null?"null":plaintiffs, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(defendants==null?"null":defendants, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(thirdParties==null?"null":thirdParties, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_time==null?"null":"" + update_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(deleted==null?"null":"" + deleted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(for_search==null?"null":for_search, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lawsuit_id = null; } else {
      this.lawsuit_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.lawsuit_uuid = null; } else {
      this.lawsuit_uuid = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.openlaw_case_reason = null; } else {
      this.openlaw_case_reason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.jd_case_reason = null; } else {
      this.jd_case_reason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.plaintiffs = null; } else {
      this.plaintiffs = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.defendants = null; } else {
      this.defendants = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.thirdParties = null; } else {
      this.thirdParties = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_time = null; } else {
      this.update_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.deleted = null; } else {
      this.deleted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.for_search = null; } else {
      this.for_search = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lawsuit_id = null; } else {
      this.lawsuit_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.lawsuit_uuid = null; } else {
      this.lawsuit_uuid = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.openlaw_case_reason = null; } else {
      this.openlaw_case_reason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.jd_case_reason = null; } else {
      this.jd_case_reason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.plaintiffs = null; } else {
      this.plaintiffs = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.defendants = null; } else {
      this.defendants = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.thirdParties = null; } else {
      this.thirdParties = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_time = null; } else {
      this.update_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.deleted = null; } else {
      this.deleted = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.for_search = null; } else {
      this.for_search = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_company_lawsuit_parsed_info o = (codegen_company_lawsuit_parsed_info) super.clone();
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
    return o;
  }

  public void clone0(codegen_company_lawsuit_parsed_info o) throws CloneNotSupportedException {
    o.update_time = (o.update_time != null) ? (java.sql.Timestamp) o.update_time.clone() : null;
    o.create_time = (o.create_time != null) ? (java.sql.Timestamp) o.create_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("lawsuit_id", this.lawsuit_id);
    __sqoop$field_map.put("lawsuit_uuid", this.lawsuit_uuid);
    __sqoop$field_map.put("openlaw_case_reason", this.openlaw_case_reason);
    __sqoop$field_map.put("jd_case_reason", this.jd_case_reason);
    __sqoop$field_map.put("plaintiffs", this.plaintiffs);
    __sqoop$field_map.put("defendants", this.defendants);
    __sqoop$field_map.put("thirdParties", this.thirdParties);
    __sqoop$field_map.put("update_time", this.update_time);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("deleted", this.deleted);
    __sqoop$field_map.put("for_search", this.for_search);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("lawsuit_id", this.lawsuit_id);
    __sqoop$field_map.put("lawsuit_uuid", this.lawsuit_uuid);
    __sqoop$field_map.put("openlaw_case_reason", this.openlaw_case_reason);
    __sqoop$field_map.put("jd_case_reason", this.jd_case_reason);
    __sqoop$field_map.put("plaintiffs", this.plaintiffs);
    __sqoop$field_map.put("defendants", this.defendants);
    __sqoop$field_map.put("thirdParties", this.thirdParties);
    __sqoop$field_map.put("update_time", this.update_time);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("deleted", this.deleted);
    __sqoop$field_map.put("for_search", this.for_search);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
