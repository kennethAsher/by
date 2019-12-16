// ORM class for table 'company_staff'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue May 21 21:28:01 CST 2019
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

public class codegen_company_staff extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_staff.this.id = (Long)value;
      }
    });
    setters.put("company_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_staff.this.company_id = (Long)value;
      }
    });
    setters.put("staff_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_staff.this.staff_id = (Long)value;
      }
    });
    setters.put("staff_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_staff.this.staff_type = (Integer)value;
      }
    });
    setters.put("staff_type_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_staff.this.staff_type_name = (String)value;
      }
    });
    setters.put("staff_salary", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_staff.this.staff_salary = (String)value;
      }
    });
    setters.put("staff_stake_num", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_staff.this.staff_stake_num = (String)value;
      }
    });
    setters.put("staff_other_info", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_staff.this.staff_other_info = (String)value;
      }
    });
  }
  public codegen_company_staff() {
    init0();
  }
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public codegen_company_staff with_id(Long id) {
    this.id = id;
    return this;
  }
  private Long company_id;
  public Long get_company_id() {
    return company_id;
  }
  public void set_company_id(Long company_id) {
    this.company_id = company_id;
  }
  public codegen_company_staff with_company_id(Long company_id) {
    this.company_id = company_id;
    return this;
  }
  private Long staff_id;
  public Long get_staff_id() {
    return staff_id;
  }
  public void set_staff_id(Long staff_id) {
    this.staff_id = staff_id;
  }
  public codegen_company_staff with_staff_id(Long staff_id) {
    this.staff_id = staff_id;
    return this;
  }
  private Integer staff_type;
  public Integer get_staff_type() {
    return staff_type;
  }
  public void set_staff_type(Integer staff_type) {
    this.staff_type = staff_type;
  }
  public codegen_company_staff with_staff_type(Integer staff_type) {
    this.staff_type = staff_type;
    return this;
  }
  private String staff_type_name;
  public String get_staff_type_name() {
    return staff_type_name;
  }
  public void set_staff_type_name(String staff_type_name) {
    this.staff_type_name = staff_type_name;
  }
  public codegen_company_staff with_staff_type_name(String staff_type_name) {
    this.staff_type_name = staff_type_name;
    return this;
  }
  private String staff_salary;
  public String get_staff_salary() {
    return staff_salary;
  }
  public void set_staff_salary(String staff_salary) {
    this.staff_salary = staff_salary;
  }
  public codegen_company_staff with_staff_salary(String staff_salary) {
    this.staff_salary = staff_salary;
    return this;
  }
  private String staff_stake_num;
  public String get_staff_stake_num() {
    return staff_stake_num;
  }
  public void set_staff_stake_num(String staff_stake_num) {
    this.staff_stake_num = staff_stake_num;
  }
  public codegen_company_staff with_staff_stake_num(String staff_stake_num) {
    this.staff_stake_num = staff_stake_num;
    return this;
  }
  private String staff_other_info;
  public String get_staff_other_info() {
    return staff_other_info;
  }
  public void set_staff_other_info(String staff_other_info) {
    this.staff_other_info = staff_other_info;
  }
  public codegen_company_staff with_staff_other_info(String staff_other_info) {
    this.staff_other_info = staff_other_info;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_company_staff)) {
      return false;
    }
    codegen_company_staff that = (codegen_company_staff) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.company_id == null ? that.company_id == null : this.company_id.equals(that.company_id));
    equal = equal && (this.staff_id == null ? that.staff_id == null : this.staff_id.equals(that.staff_id));
    equal = equal && (this.staff_type == null ? that.staff_type == null : this.staff_type.equals(that.staff_type));
    equal = equal && (this.staff_type_name == null ? that.staff_type_name == null : this.staff_type_name.equals(that.staff_type_name));
    equal = equal && (this.staff_salary == null ? that.staff_salary == null : this.staff_salary.equals(that.staff_salary));
    equal = equal && (this.staff_stake_num == null ? that.staff_stake_num == null : this.staff_stake_num.equals(that.staff_stake_num));
    equal = equal && (this.staff_other_info == null ? that.staff_other_info == null : this.staff_other_info.equals(that.staff_other_info));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_company_staff)) {
      return false;
    }
    codegen_company_staff that = (codegen_company_staff) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.company_id == null ? that.company_id == null : this.company_id.equals(that.company_id));
    equal = equal && (this.staff_id == null ? that.staff_id == null : this.staff_id.equals(that.staff_id));
    equal = equal && (this.staff_type == null ? that.staff_type == null : this.staff_type.equals(that.staff_type));
    equal = equal && (this.staff_type_name == null ? that.staff_type_name == null : this.staff_type_name.equals(that.staff_type_name));
    equal = equal && (this.staff_salary == null ? that.staff_salary == null : this.staff_salary.equals(that.staff_salary));
    equal = equal && (this.staff_stake_num == null ? that.staff_stake_num == null : this.staff_stake_num.equals(that.staff_stake_num));
    equal = equal && (this.staff_other_info == null ? that.staff_other_info == null : this.staff_other_info.equals(that.staff_other_info));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.company_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.staff_id = JdbcWritableBridge.readLong(3, __dbResults);
    this.staff_type = JdbcWritableBridge.readInteger(4, __dbResults);
    this.staff_type_name = JdbcWritableBridge.readString(5, __dbResults);
    this.staff_salary = JdbcWritableBridge.readString(6, __dbResults);
    this.staff_stake_num = JdbcWritableBridge.readString(7, __dbResults);
    this.staff_other_info = JdbcWritableBridge.readString(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.company_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.staff_id = JdbcWritableBridge.readLong(3, __dbResults);
    this.staff_type = JdbcWritableBridge.readInteger(4, __dbResults);
    this.staff_type_name = JdbcWritableBridge.readString(5, __dbResults);
    this.staff_salary = JdbcWritableBridge.readString(6, __dbResults);
    this.staff_stake_num = JdbcWritableBridge.readString(7, __dbResults);
    this.staff_other_info = JdbcWritableBridge.readString(8, __dbResults);
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
    JdbcWritableBridge.writeLong(company_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(staff_id, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(staff_type, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(staff_type_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(staff_salary, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(staff_stake_num, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(staff_other_info, 8 + __off, 12, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(company_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(staff_id, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(staff_type, 4 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(staff_type_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(staff_salary, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(staff_stake_num, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(staff_other_info, 8 + __off, 12, __dbStmt);
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
        this.company_id = null;
    } else {
    this.company_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.staff_id = null;
    } else {
    this.staff_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.staff_type = null;
    } else {
    this.staff_type = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.staff_type_name = null;
    } else {
    this.staff_type_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.staff_salary = null;
    } else {
    this.staff_salary = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.staff_stake_num = null;
    } else {
    this.staff_stake_num = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.staff_other_info = null;
    } else {
    this.staff_other_info = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.company_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.company_id);
    }
    if (null == this.staff_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.staff_id);
    }
    if (null == this.staff_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.staff_type);
    }
    if (null == this.staff_type_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, staff_type_name);
    }
    if (null == this.staff_salary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, staff_salary);
    }
    if (null == this.staff_stake_num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, staff_stake_num);
    }
    if (null == this.staff_other_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, staff_other_info);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.company_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.company_id);
    }
    if (null == this.staff_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.staff_id);
    }
    if (null == this.staff_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.staff_type);
    }
    if (null == this.staff_type_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, staff_type_name);
    }
    if (null == this.staff_salary) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, staff_salary);
    }
    if (null == this.staff_stake_num) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, staff_stake_num);
    }
    if (null == this.staff_other_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, staff_other_info);
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
    __sb.append(FieldFormatter.escapeAndEnclose(company_id==null?"null":"" + company_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(staff_id==null?"null":"" + staff_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(staff_type==null?"null":"" + staff_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(staff_type_name==null?"null":staff_type_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(staff_salary==null?"null":staff_salary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(staff_stake_num==null?"null":staff_stake_num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(staff_other_info==null?"null":staff_other_info, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(company_id==null?"null":"" + company_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(staff_id==null?"null":"" + staff_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(staff_type==null?"null":"" + staff_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(staff_type_name==null?"null":staff_type_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(staff_salary==null?"null":staff_salary, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(staff_stake_num==null?"null":staff_stake_num, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(staff_other_info==null?"null":staff_other_info, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.company_id = null; } else {
      this.company_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.staff_id = null; } else {
      this.staff_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.staff_type = null; } else {
      this.staff_type = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.staff_type_name = null; } else {
      this.staff_type_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.staff_salary = null; } else {
      this.staff_salary = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.staff_stake_num = null; } else {
      this.staff_stake_num = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.staff_other_info = null; } else {
      this.staff_other_info = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.company_id = null; } else {
      this.company_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.staff_id = null; } else {
      this.staff_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.staff_type = null; } else {
      this.staff_type = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.staff_type_name = null; } else {
      this.staff_type_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.staff_salary = null; } else {
      this.staff_salary = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.staff_stake_num = null; } else {
      this.staff_stake_num = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.staff_other_info = null; } else {
      this.staff_other_info = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_company_staff o = (codegen_company_staff) super.clone();
    return o;
  }

  public void clone0(codegen_company_staff o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("company_id", this.company_id);
    __sqoop$field_map.put("staff_id", this.staff_id);
    __sqoop$field_map.put("staff_type", this.staff_type);
    __sqoop$field_map.put("staff_type_name", this.staff_type_name);
    __sqoop$field_map.put("staff_salary", this.staff_salary);
    __sqoop$field_map.put("staff_stake_num", this.staff_stake_num);
    __sqoop$field_map.put("staff_other_info", this.staff_other_info);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("company_id", this.company_id);
    __sqoop$field_map.put("staff_id", this.staff_id);
    __sqoop$field_map.put("staff_type", this.staff_type);
    __sqoop$field_map.put("staff_type_name", this.staff_type_name);
    __sqoop$field_map.put("staff_salary", this.staff_salary);
    __sqoop$field_map.put("staff_stake_num", this.staff_stake_num);
    __sqoop$field_map.put("staff_other_info", this.staff_other_info);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
