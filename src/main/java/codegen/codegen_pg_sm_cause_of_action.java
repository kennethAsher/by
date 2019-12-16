// ORM class for table 'pg_sm_cause_of_action'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Apr 23 22:27:32 CST 2019
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

public class codegen_pg_sm_cause_of_action extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_sm_cause_of_action.this.id = (Integer)value;
      }
    });
    setters.put("case_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_sm_cause_of_action.this.case_type = (String)value;
      }
    });
    setters.put("cause_of_action_1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_sm_cause_of_action.this.cause_of_action_1 = (String)value;
      }
    });
    setters.put("cause_of_action_2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_sm_cause_of_action.this.cause_of_action_2 = (String)value;
      }
    });
    setters.put("cause_of_action_3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_sm_cause_of_action.this.cause_of_action_3 = (String)value;
      }
    });
    setters.put("cause_of_action_4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_sm_cause_of_action.this.cause_of_action_4 = (String)value;
      }
    });
    setters.put("create_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_sm_cause_of_action.this.create_date = (java.sql.Timestamp)value;
      }
    });
    setters.put("update_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_sm_cause_of_action.this.update_date = (java.sql.Timestamp)value;
      }
    });
    setters.put("note", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_sm_cause_of_action.this.note = (String)value;
      }
    });
  }
  public codegen_pg_sm_cause_of_action() {
    init0();
  }
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public codegen_pg_sm_cause_of_action with_id(Integer id) {
    this.id = id;
    return this;
  }
  private String case_type;
  public String get_case_type() {
    return case_type;
  }
  public void set_case_type(String case_type) {
    this.case_type = case_type;
  }
  public codegen_pg_sm_cause_of_action with_case_type(String case_type) {
    this.case_type = case_type;
    return this;
  }
  private String cause_of_action_1;
  public String get_cause_of_action_1() {
    return cause_of_action_1;
  }
  public void set_cause_of_action_1(String cause_of_action_1) {
    this.cause_of_action_1 = cause_of_action_1;
  }
  public codegen_pg_sm_cause_of_action with_cause_of_action_1(String cause_of_action_1) {
    this.cause_of_action_1 = cause_of_action_1;
    return this;
  }
  private String cause_of_action_2;
  public String get_cause_of_action_2() {
    return cause_of_action_2;
  }
  public void set_cause_of_action_2(String cause_of_action_2) {
    this.cause_of_action_2 = cause_of_action_2;
  }
  public codegen_pg_sm_cause_of_action with_cause_of_action_2(String cause_of_action_2) {
    this.cause_of_action_2 = cause_of_action_2;
    return this;
  }
  private String cause_of_action_3;
  public String get_cause_of_action_3() {
    return cause_of_action_3;
  }
  public void set_cause_of_action_3(String cause_of_action_3) {
    this.cause_of_action_3 = cause_of_action_3;
  }
  public codegen_pg_sm_cause_of_action with_cause_of_action_3(String cause_of_action_3) {
    this.cause_of_action_3 = cause_of_action_3;
    return this;
  }
  private String cause_of_action_4;
  public String get_cause_of_action_4() {
    return cause_of_action_4;
  }
  public void set_cause_of_action_4(String cause_of_action_4) {
    this.cause_of_action_4 = cause_of_action_4;
  }
  public codegen_pg_sm_cause_of_action with_cause_of_action_4(String cause_of_action_4) {
    this.cause_of_action_4 = cause_of_action_4;
    return this;
  }
  private java.sql.Timestamp create_date;
  public java.sql.Timestamp get_create_date() {
    return create_date;
  }
  public void set_create_date(java.sql.Timestamp create_date) {
    this.create_date = create_date;
  }
  public codegen_pg_sm_cause_of_action with_create_date(java.sql.Timestamp create_date) {
    this.create_date = create_date;
    return this;
  }
  private java.sql.Timestamp update_date;
  public java.sql.Timestamp get_update_date() {
    return update_date;
  }
  public void set_update_date(java.sql.Timestamp update_date) {
    this.update_date = update_date;
  }
  public codegen_pg_sm_cause_of_action with_update_date(java.sql.Timestamp update_date) {
    this.update_date = update_date;
    return this;
  }
  private String note;
  public String get_note() {
    return note;
  }
  public void set_note(String note) {
    this.note = note;
  }
  public codegen_pg_sm_cause_of_action with_note(String note) {
    this.note = note;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_pg_sm_cause_of_action)) {
      return false;
    }
    codegen_pg_sm_cause_of_action that = (codegen_pg_sm_cause_of_action) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.case_type == null ? that.case_type == null : this.case_type.equals(that.case_type));
    equal = equal && (this.cause_of_action_1 == null ? that.cause_of_action_1 == null : this.cause_of_action_1.equals(that.cause_of_action_1));
    equal = equal && (this.cause_of_action_2 == null ? that.cause_of_action_2 == null : this.cause_of_action_2.equals(that.cause_of_action_2));
    equal = equal && (this.cause_of_action_3 == null ? that.cause_of_action_3 == null : this.cause_of_action_3.equals(that.cause_of_action_3));
    equal = equal && (this.cause_of_action_4 == null ? that.cause_of_action_4 == null : this.cause_of_action_4.equals(that.cause_of_action_4));
    equal = equal && (this.create_date == null ? that.create_date == null : this.create_date.equals(that.create_date));
    equal = equal && (this.update_date == null ? that.update_date == null : this.update_date.equals(that.update_date));
    equal = equal && (this.note == null ? that.note == null : this.note.equals(that.note));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_pg_sm_cause_of_action)) {
      return false;
    }
    codegen_pg_sm_cause_of_action that = (codegen_pg_sm_cause_of_action) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.case_type == null ? that.case_type == null : this.case_type.equals(that.case_type));
    equal = equal && (this.cause_of_action_1 == null ? that.cause_of_action_1 == null : this.cause_of_action_1.equals(that.cause_of_action_1));
    equal = equal && (this.cause_of_action_2 == null ? that.cause_of_action_2 == null : this.cause_of_action_2.equals(that.cause_of_action_2));
    equal = equal && (this.cause_of_action_3 == null ? that.cause_of_action_3 == null : this.cause_of_action_3.equals(that.cause_of_action_3));
    equal = equal && (this.cause_of_action_4 == null ? that.cause_of_action_4 == null : this.cause_of_action_4.equals(that.cause_of_action_4));
    equal = equal && (this.create_date == null ? that.create_date == null : this.create_date.equals(that.create_date));
    equal = equal && (this.update_date == null ? that.update_date == null : this.update_date.equals(that.update_date));
    equal = equal && (this.note == null ? that.note == null : this.note.equals(that.note));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.case_type = JdbcWritableBridge.readString(2, __dbResults);
    this.cause_of_action_1 = JdbcWritableBridge.readString(3, __dbResults);
    this.cause_of_action_2 = JdbcWritableBridge.readString(4, __dbResults);
    this.cause_of_action_3 = JdbcWritableBridge.readString(5, __dbResults);
    this.cause_of_action_4 = JdbcWritableBridge.readString(6, __dbResults);
    this.create_date = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.update_date = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.note = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.case_type = JdbcWritableBridge.readString(2, __dbResults);
    this.cause_of_action_1 = JdbcWritableBridge.readString(3, __dbResults);
    this.cause_of_action_2 = JdbcWritableBridge.readString(4, __dbResults);
    this.cause_of_action_3 = JdbcWritableBridge.readString(5, __dbResults);
    this.cause_of_action_4 = JdbcWritableBridge.readString(6, __dbResults);
    this.create_date = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.update_date = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.note = JdbcWritableBridge.readString(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(case_type, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cause_of_action_1, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cause_of_action_2, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cause_of_action_3, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cause_of_action_4, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_date, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_date, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(note, 9 + __off, 12, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(case_type, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cause_of_action_1, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cause_of_action_2, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cause_of_action_3, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cause_of_action_4, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(create_date, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_date, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(note, 9 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.case_type = null;
    } else {
    this.case_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cause_of_action_1 = null;
    } else {
    this.cause_of_action_1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cause_of_action_2 = null;
    } else {
    this.cause_of_action_2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cause_of_action_3 = null;
    } else {
    this.cause_of_action_3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cause_of_action_4 = null;
    } else {
    this.cause_of_action_4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.create_date = null;
    } else {
    this.create_date = new Timestamp(__dataIn.readLong());
    this.create_date.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.update_date = null;
    } else {
    this.update_date = new Timestamp(__dataIn.readLong());
    this.update_date.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.note = null;
    } else {
    this.note = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.case_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, case_type);
    }
    if (null == this.cause_of_action_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cause_of_action_1);
    }
    if (null == this.cause_of_action_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cause_of_action_2);
    }
    if (null == this.cause_of_action_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cause_of_action_3);
    }
    if (null == this.cause_of_action_4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cause_of_action_4);
    }
    if (null == this.create_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_date.getTime());
    __dataOut.writeInt(this.create_date.getNanos());
    }
    if (null == this.update_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_date.getTime());
    __dataOut.writeInt(this.update_date.getNanos());
    }
    if (null == this.note) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, note);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.case_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, case_type);
    }
    if (null == this.cause_of_action_1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cause_of_action_1);
    }
    if (null == this.cause_of_action_2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cause_of_action_2);
    }
    if (null == this.cause_of_action_3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cause_of_action_3);
    }
    if (null == this.cause_of_action_4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cause_of_action_4);
    }
    if (null == this.create_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.create_date.getTime());
    __dataOut.writeInt(this.create_date.getNanos());
    }
    if (null == this.update_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_date.getTime());
    __dataOut.writeInt(this.update_date.getNanos());
    }
    if (null == this.note) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, note);
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
    __sb.append(FieldFormatter.escapeAndEnclose(case_type==null?"null":case_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cause_of_action_1==null?"null":cause_of_action_1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cause_of_action_2==null?"null":cause_of_action_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cause_of_action_3==null?"null":cause_of_action_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cause_of_action_4==null?"null":cause_of_action_4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_date==null?"null":"" + create_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_date==null?"null":"" + update_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(note==null?"null":note, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(case_type==null?"null":case_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cause_of_action_1==null?"null":cause_of_action_1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cause_of_action_2==null?"null":cause_of_action_2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cause_of_action_3==null?"null":cause_of_action_3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cause_of_action_4==null?"null":cause_of_action_4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(create_date==null?"null":"" + create_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_date==null?"null":"" + update_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(note==null?"null":note, delimiters));
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
      this.id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.case_type = null; } else {
      this.case_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cause_of_action_1 = null; } else {
      this.cause_of_action_1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cause_of_action_2 = null; } else {
      this.cause_of_action_2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cause_of_action_3 = null; } else {
      this.cause_of_action_3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cause_of_action_4 = null; } else {
      this.cause_of_action_4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_date = null; } else {
      this.create_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_date = null; } else {
      this.update_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.note = null; } else {
      this.note = __cur_str;
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
      this.id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.case_type = null; } else {
      this.case_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cause_of_action_1 = null; } else {
      this.cause_of_action_1 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cause_of_action_2 = null; } else {
      this.cause_of_action_2 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cause_of_action_3 = null; } else {
      this.cause_of_action_3 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cause_of_action_4 = null; } else {
      this.cause_of_action_4 = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_date = null; } else {
      this.create_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_date = null; } else {
      this.update_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.note = null; } else {
      this.note = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_pg_sm_cause_of_action o = (codegen_pg_sm_cause_of_action) super.clone();
    o.create_date = (o.create_date != null) ? (java.sql.Timestamp) o.create_date.clone() : null;
    o.update_date = (o.update_date != null) ? (java.sql.Timestamp) o.update_date.clone() : null;
    return o;
  }

  public void clone0(codegen_pg_sm_cause_of_action o) throws CloneNotSupportedException {
    o.create_date = (o.create_date != null) ? (java.sql.Timestamp) o.create_date.clone() : null;
    o.update_date = (o.update_date != null) ? (java.sql.Timestamp) o.update_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("case_type", this.case_type);
    __sqoop$field_map.put("cause_of_action_1", this.cause_of_action_1);
    __sqoop$field_map.put("cause_of_action_2", this.cause_of_action_2);
    __sqoop$field_map.put("cause_of_action_3", this.cause_of_action_3);
    __sqoop$field_map.put("cause_of_action_4", this.cause_of_action_4);
    __sqoop$field_map.put("create_date", this.create_date);
    __sqoop$field_map.put("update_date", this.update_date);
    __sqoop$field_map.put("note", this.note);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("case_type", this.case_type);
    __sqoop$field_map.put("cause_of_action_1", this.cause_of_action_1);
    __sqoop$field_map.put("cause_of_action_2", this.cause_of_action_2);
    __sqoop$field_map.put("cause_of_action_3", this.cause_of_action_3);
    __sqoop$field_map.put("cause_of_action_4", this.cause_of_action_4);
    __sqoop$field_map.put("create_date", this.create_date);
    __sqoop$field_map.put("update_date", this.update_date);
    __sqoop$field_map.put("note", this.note);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
