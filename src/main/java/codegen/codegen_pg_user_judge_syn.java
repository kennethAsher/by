// ORM class for table 'pg_user_judge_syn'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat May 11 12:29:01 CST 2019
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

public class codegen_pg_user_judge_syn extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_user_judge_syn.this.id = (Integer)value;
      }
    });
    setters.put("name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_user_judge_syn.this.name = (String)value;
      }
    });
    setters.put("create_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_user_judge_syn.this.create_time = (Integer)value;
      }
    });
    setters.put("court", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_user_judge_syn.this.court = (String)value;
      }
    });
    setters.put("court_level", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_user_judge_syn.this.court_level = (String)value;
      }
    });
    setters.put("earliest_year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_user_judge_syn.this.earliest_year = (String)value;
      }
    });
    setters.put("judicial_doc_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_user_judge_syn.this.judicial_doc_cnt = (Integer)value;
      }
    });
    setters.put("last_year_judicial_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_user_judge_syn.this.last_year_judicial_cnt = (Integer)value;
      }
    });
  }
  public codegen_pg_user_judge_syn() {
    init0();
  }
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public codegen_pg_user_judge_syn with_id(Integer id) {
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
  public codegen_pg_user_judge_syn with_name(String name) {
    this.name = name;
    return this;
  }
  private Integer create_time;
  public Integer get_create_time() {
    return create_time;
  }
  public void set_create_time(Integer create_time) {
    this.create_time = create_time;
  }
  public codegen_pg_user_judge_syn with_create_time(Integer create_time) {
    this.create_time = create_time;
    return this;
  }
  private String court;
  public String get_court() {
    return court;
  }
  public void set_court(String court) {
    this.court = court;
  }
  public codegen_pg_user_judge_syn with_court(String court) {
    this.court = court;
    return this;
  }
  private String court_level;
  public String get_court_level() {
    return court_level;
  }
  public void set_court_level(String court_level) {
    this.court_level = court_level;
  }
  public codegen_pg_user_judge_syn with_court_level(String court_level) {
    this.court_level = court_level;
    return this;
  }
  private String earliest_year;
  public String get_earliest_year() {
    return earliest_year;
  }
  public void set_earliest_year(String earliest_year) {
    this.earliest_year = earliest_year;
  }
  public codegen_pg_user_judge_syn with_earliest_year(String earliest_year) {
    this.earliest_year = earliest_year;
    return this;
  }
  private Integer judicial_doc_cnt;
  public Integer get_judicial_doc_cnt() {
    return judicial_doc_cnt;
  }
  public void set_judicial_doc_cnt(Integer judicial_doc_cnt) {
    this.judicial_doc_cnt = judicial_doc_cnt;
  }
  public codegen_pg_user_judge_syn with_judicial_doc_cnt(Integer judicial_doc_cnt) {
    this.judicial_doc_cnt = judicial_doc_cnt;
    return this;
  }
  private Integer last_year_judicial_cnt;
  public Integer get_last_year_judicial_cnt() {
    return last_year_judicial_cnt;
  }
  public void set_last_year_judicial_cnt(Integer last_year_judicial_cnt) {
    this.last_year_judicial_cnt = last_year_judicial_cnt;
  }
  public codegen_pg_user_judge_syn with_last_year_judicial_cnt(Integer last_year_judicial_cnt) {
    this.last_year_judicial_cnt = last_year_judicial_cnt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_pg_user_judge_syn)) {
      return false;
    }
    codegen_pg_user_judge_syn that = (codegen_pg_user_judge_syn) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.court == null ? that.court == null : this.court.equals(that.court));
    equal = equal && (this.court_level == null ? that.court_level == null : this.court_level.equals(that.court_level));
    equal = equal && (this.earliest_year == null ? that.earliest_year == null : this.earliest_year.equals(that.earliest_year));
    equal = equal && (this.judicial_doc_cnt == null ? that.judicial_doc_cnt == null : this.judicial_doc_cnt.equals(that.judicial_doc_cnt));
    equal = equal && (this.last_year_judicial_cnt == null ? that.last_year_judicial_cnt == null : this.last_year_judicial_cnt.equals(that.last_year_judicial_cnt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_pg_user_judge_syn)) {
      return false;
    }
    codegen_pg_user_judge_syn that = (codegen_pg_user_judge_syn) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.create_time == null ? that.create_time == null : this.create_time.equals(that.create_time));
    equal = equal && (this.court == null ? that.court == null : this.court.equals(that.court));
    equal = equal && (this.court_level == null ? that.court_level == null : this.court_level.equals(that.court_level));
    equal = equal && (this.earliest_year == null ? that.earliest_year == null : this.earliest_year.equals(that.earliest_year));
    equal = equal && (this.judicial_doc_cnt == null ? that.judicial_doc_cnt == null : this.judicial_doc_cnt.equals(that.judicial_doc_cnt));
    equal = equal && (this.last_year_judicial_cnt == null ? that.last_year_judicial_cnt == null : this.last_year_judicial_cnt.equals(that.last_year_judicial_cnt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.name = JdbcWritableBridge.readString(2, __dbResults);
    this.create_time = JdbcWritableBridge.readInteger(3, __dbResults);
    this.court = JdbcWritableBridge.readString(4, __dbResults);
    this.court_level = JdbcWritableBridge.readString(5, __dbResults);
    this.earliest_year = JdbcWritableBridge.readString(6, __dbResults);
    this.judicial_doc_cnt = JdbcWritableBridge.readInteger(7, __dbResults);
    this.last_year_judicial_cnt = JdbcWritableBridge.readInteger(8, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.name = JdbcWritableBridge.readString(2, __dbResults);
    this.create_time = JdbcWritableBridge.readInteger(3, __dbResults);
    this.court = JdbcWritableBridge.readString(4, __dbResults);
    this.court_level = JdbcWritableBridge.readString(5, __dbResults);
    this.earliest_year = JdbcWritableBridge.readString(6, __dbResults);
    this.judicial_doc_cnt = JdbcWritableBridge.readInteger(7, __dbResults);
    this.last_year_judicial_cnt = JdbcWritableBridge.readInteger(8, __dbResults);
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
    JdbcWritableBridge.writeString(name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(create_time, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(court, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(court_level, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(earliest_year, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(judicial_doc_cnt, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(last_year_judicial_cnt, 8 + __off, 4, __dbStmt);
    return 8;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(create_time, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(court, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(court_level, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(earliest_year, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(judicial_doc_cnt, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(last_year_judicial_cnt, 8 + __off, 4, __dbStmt);
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
        this.name = null;
    } else {
    this.name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.create_time = null;
    } else {
    this.create_time = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.court = null;
    } else {
    this.court = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.court_level = null;
    } else {
    this.court_level = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.earliest_year = null;
    } else {
    this.earliest_year = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.judicial_doc_cnt = null;
    } else {
    this.judicial_doc_cnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.last_year_judicial_cnt = null;
    } else {
    this.last_year_judicial_cnt = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.create_time);
    }
    if (null == this.court) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, court);
    }
    if (null == this.court_level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, court_level);
    }
    if (null == this.earliest_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, earliest_year);
    }
    if (null == this.judicial_doc_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.judicial_doc_cnt);
    }
    if (null == this.last_year_judicial_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.last_year_judicial_cnt);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.create_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.create_time);
    }
    if (null == this.court) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, court);
    }
    if (null == this.court_level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, court_level);
    }
    if (null == this.earliest_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, earliest_year);
    }
    if (null == this.judicial_doc_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.judicial_doc_cnt);
    }
    if (null == this.last_year_judicial_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.last_year_judicial_cnt);
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
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(court==null?"null":court, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(court_level==null?"null":court_level, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(earliest_year==null?"null":earliest_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(judicial_doc_cnt==null?"null":"" + judicial_doc_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_year_judicial_cnt==null?"null":"" + last_year_judicial_cnt, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(create_time==null?"null":"" + create_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(court==null?"null":court, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(court_level==null?"null":court_level, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(earliest_year==null?"null":earliest_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(judicial_doc_cnt==null?"null":"" + judicial_doc_cnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_year_judicial_cnt==null?"null":"" + last_year_judicial_cnt, delimiters));
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
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.court = null; } else {
      this.court = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.court_level = null; } else {
      this.court_level = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.earliest_year = null; } else {
      this.earliest_year = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.judicial_doc_cnt = null; } else {
      this.judicial_doc_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_year_judicial_cnt = null; } else {
      this.last_year_judicial_cnt = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.create_time = null; } else {
      this.create_time = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.court = null; } else {
      this.court = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.court_level = null; } else {
      this.court_level = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.earliest_year = null; } else {
      this.earliest_year = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.judicial_doc_cnt = null; } else {
      this.judicial_doc_cnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_year_judicial_cnt = null; } else {
      this.last_year_judicial_cnt = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_pg_user_judge_syn o = (codegen_pg_user_judge_syn) super.clone();
    return o;
  }

  public void clone0(codegen_pg_user_judge_syn o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("court", this.court);
    __sqoop$field_map.put("court_level", this.court_level);
    __sqoop$field_map.put("earliest_year", this.earliest_year);
    __sqoop$field_map.put("judicial_doc_cnt", this.judicial_doc_cnt);
    __sqoop$field_map.put("last_year_judicial_cnt", this.last_year_judicial_cnt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("create_time", this.create_time);
    __sqoop$field_map.put("court", this.court);
    __sqoop$field_map.put("court_level", this.court_level);
    __sqoop$field_map.put("earliest_year", this.earliest_year);
    __sqoop$field_map.put("judicial_doc_cnt", this.judicial_doc_cnt);
    __sqoop$field_map.put("last_year_judicial_cnt", this.last_year_judicial_cnt);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
