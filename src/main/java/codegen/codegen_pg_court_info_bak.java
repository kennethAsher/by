// ORM class for table 'pg_court_info_bak'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu May 02 13:55:28 CST 2019
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

public class codegen_pg_court_info_bak extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_court_info_bak.this.id = (Long)value;
      }
    });
    setters.put("province", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_court_info_bak.this.province = (String)value;
      }
    });
    setters.put("courtname", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_court_info_bak.this.courtname = (String)value;
      }
    });
    setters.put("courtlevel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_court_info_bak.this.courtlevel = (String)value;
      }
    });
    setters.put("address", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_court_info_bak.this.address = (String)value;
      }
    });
    setters.put("cityname", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_court_info_bak.this.cityname = (String)value;
      }
    });
    setters.put("countyname", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_court_info_bak.this.countyname = (String)value;
      }
    });
    setters.put("latitude", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_court_info_bak.this.latitude = (String)value;
      }
    });
    setters.put("longitude", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_court_info_bak.this.longitude = (String)value;
      }
    });
    setters.put("tel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_court_info_bak.this.tel = (String)value;
      }
    });
  }
  public codegen_pg_court_info_bak() {
    init0();
  }
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public codegen_pg_court_info_bak with_id(Long id) {
    this.id = id;
    return this;
  }
  private String province;
  public String get_province() {
    return province;
  }
  public void set_province(String province) {
    this.province = province;
  }
  public codegen_pg_court_info_bak with_province(String province) {
    this.province = province;
    return this;
  }
  private String courtname;
  public String get_courtname() {
    return courtname;
  }
  public void set_courtname(String courtname) {
    this.courtname = courtname;
  }
  public codegen_pg_court_info_bak with_courtname(String courtname) {
    this.courtname = courtname;
    return this;
  }
  private String courtlevel;
  public String get_courtlevel() {
    return courtlevel;
  }
  public void set_courtlevel(String courtlevel) {
    this.courtlevel = courtlevel;
  }
  public codegen_pg_court_info_bak with_courtlevel(String courtlevel) {
    this.courtlevel = courtlevel;
    return this;
  }
  private String address;
  public String get_address() {
    return address;
  }
  public void set_address(String address) {
    this.address = address;
  }
  public codegen_pg_court_info_bak with_address(String address) {
    this.address = address;
    return this;
  }
  private String cityname;
  public String get_cityname() {
    return cityname;
  }
  public void set_cityname(String cityname) {
    this.cityname = cityname;
  }
  public codegen_pg_court_info_bak with_cityname(String cityname) {
    this.cityname = cityname;
    return this;
  }
  private String countyname;
  public String get_countyname() {
    return countyname;
  }
  public void set_countyname(String countyname) {
    this.countyname = countyname;
  }
  public codegen_pg_court_info_bak with_countyname(String countyname) {
    this.countyname = countyname;
    return this;
  }
  private String latitude;
  public String get_latitude() {
    return latitude;
  }
  public void set_latitude(String latitude) {
    this.latitude = latitude;
  }
  public codegen_pg_court_info_bak with_latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }
  private String longitude;
  public String get_longitude() {
    return longitude;
  }
  public void set_longitude(String longitude) {
    this.longitude = longitude;
  }
  public codegen_pg_court_info_bak with_longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }
  private String tel;
  public String get_tel() {
    return tel;
  }
  public void set_tel(String tel) {
    this.tel = tel;
  }
  public codegen_pg_court_info_bak with_tel(String tel) {
    this.tel = tel;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_pg_court_info_bak)) {
      return false;
    }
    codegen_pg_court_info_bak that = (codegen_pg_court_info_bak) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.province == null ? that.province == null : this.province.equals(that.province));
    equal = equal && (this.courtname == null ? that.courtname == null : this.courtname.equals(that.courtname));
    equal = equal && (this.courtlevel == null ? that.courtlevel == null : this.courtlevel.equals(that.courtlevel));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.cityname == null ? that.cityname == null : this.cityname.equals(that.cityname));
    equal = equal && (this.countyname == null ? that.countyname == null : this.countyname.equals(that.countyname));
    equal = equal && (this.latitude == null ? that.latitude == null : this.latitude.equals(that.latitude));
    equal = equal && (this.longitude == null ? that.longitude == null : this.longitude.equals(that.longitude));
    equal = equal && (this.tel == null ? that.tel == null : this.tel.equals(that.tel));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_pg_court_info_bak)) {
      return false;
    }
    codegen_pg_court_info_bak that = (codegen_pg_court_info_bak) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.province == null ? that.province == null : this.province.equals(that.province));
    equal = equal && (this.courtname == null ? that.courtname == null : this.courtname.equals(that.courtname));
    equal = equal && (this.courtlevel == null ? that.courtlevel == null : this.courtlevel.equals(that.courtlevel));
    equal = equal && (this.address == null ? that.address == null : this.address.equals(that.address));
    equal = equal && (this.cityname == null ? that.cityname == null : this.cityname.equals(that.cityname));
    equal = equal && (this.countyname == null ? that.countyname == null : this.countyname.equals(that.countyname));
    equal = equal && (this.latitude == null ? that.latitude == null : this.latitude.equals(that.latitude));
    equal = equal && (this.longitude == null ? that.longitude == null : this.longitude.equals(that.longitude));
    equal = equal && (this.tel == null ? that.tel == null : this.tel.equals(that.tel));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.province = JdbcWritableBridge.readString(2, __dbResults);
    this.courtname = JdbcWritableBridge.readString(3, __dbResults);
    this.courtlevel = JdbcWritableBridge.readString(4, __dbResults);
    this.address = JdbcWritableBridge.readString(5, __dbResults);
    this.cityname = JdbcWritableBridge.readString(6, __dbResults);
    this.countyname = JdbcWritableBridge.readString(7, __dbResults);
    this.latitude = JdbcWritableBridge.readString(8, __dbResults);
    this.longitude = JdbcWritableBridge.readString(9, __dbResults);
    this.tel = JdbcWritableBridge.readString(10, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.province = JdbcWritableBridge.readString(2, __dbResults);
    this.courtname = JdbcWritableBridge.readString(3, __dbResults);
    this.courtlevel = JdbcWritableBridge.readString(4, __dbResults);
    this.address = JdbcWritableBridge.readString(5, __dbResults);
    this.cityname = JdbcWritableBridge.readString(6, __dbResults);
    this.countyname = JdbcWritableBridge.readString(7, __dbResults);
    this.latitude = JdbcWritableBridge.readString(8, __dbResults);
    this.longitude = JdbcWritableBridge.readString(9, __dbResults);
    this.tel = JdbcWritableBridge.readString(10, __dbResults);
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
    JdbcWritableBridge.writeString(province, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(courtname, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(courtlevel, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cityname, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(countyname, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(latitude, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(longitude, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tel, 10 + __off, 12, __dbStmt);
    return 10;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(province, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(courtname, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(courtlevel, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(address, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cityname, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(countyname, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(latitude, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(longitude, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(tel, 10 + __off, 12, __dbStmt);
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
        this.province = null;
    } else {
    this.province = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.courtname = null;
    } else {
    this.courtname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.courtlevel = null;
    } else {
    this.courtlevel = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.address = null;
    } else {
    this.address = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cityname = null;
    } else {
    this.cityname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.countyname = null;
    } else {
    this.countyname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.latitude = null;
    } else {
    this.latitude = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.longitude = null;
    } else {
    this.longitude = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tel = null;
    } else {
    this.tel = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.province) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province);
    }
    if (null == this.courtname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, courtname);
    }
    if (null == this.courtlevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, courtlevel);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.cityname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cityname);
    }
    if (null == this.countyname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, countyname);
    }
    if (null == this.latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, latitude);
    }
    if (null == this.longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, longitude);
    }
    if (null == this.tel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tel);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.province) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province);
    }
    if (null == this.courtname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, courtname);
    }
    if (null == this.courtlevel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, courtlevel);
    }
    if (null == this.address) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, address);
    }
    if (null == this.cityname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cityname);
    }
    if (null == this.countyname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, countyname);
    }
    if (null == this.latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, latitude);
    }
    if (null == this.longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, longitude);
    }
    if (null == this.tel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tel);
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
    __sb.append(FieldFormatter.escapeAndEnclose(province==null?"null":province, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(courtname==null?"null":courtname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(courtlevel==null?"null":courtlevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address==null?"null":address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cityname==null?"null":cityname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(countyname==null?"null":countyname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(latitude==null?"null":latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(longitude==null?"null":longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tel==null?"null":tel, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province==null?"null":province, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(courtname==null?"null":courtname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(courtlevel==null?"null":courtlevel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address==null?"null":address, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cityname==null?"null":cityname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(countyname==null?"null":countyname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(latitude==null?"null":latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(longitude==null?"null":longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tel==null?"null":tel, delimiters));
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
    if (__cur_str.equals("null")) { this.province = null; } else {
      this.province = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.courtname = null; } else {
      this.courtname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.courtlevel = null; } else {
      this.courtlevel = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cityname = null; } else {
      this.cityname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.countyname = null; } else {
      this.countyname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.latitude = null; } else {
      this.latitude = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.longitude = null; } else {
      this.longitude = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.tel = null; } else {
      this.tel = __cur_str;
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
    if (__cur_str.equals("null")) { this.province = null; } else {
      this.province = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.courtname = null; } else {
      this.courtname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.courtlevel = null; } else {
      this.courtlevel = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.address = null; } else {
      this.address = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cityname = null; } else {
      this.cityname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.countyname = null; } else {
      this.countyname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.latitude = null; } else {
      this.latitude = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.longitude = null; } else {
      this.longitude = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.tel = null; } else {
      this.tel = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_pg_court_info_bak o = (codegen_pg_court_info_bak) super.clone();
    return o;
  }

  public void clone0(codegen_pg_court_info_bak o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("province", this.province);
    __sqoop$field_map.put("courtname", this.courtname);
    __sqoop$field_map.put("courtlevel", this.courtlevel);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("cityname", this.cityname);
    __sqoop$field_map.put("countyname", this.countyname);
    __sqoop$field_map.put("latitude", this.latitude);
    __sqoop$field_map.put("longitude", this.longitude);
    __sqoop$field_map.put("tel", this.tel);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("province", this.province);
    __sqoop$field_map.put("courtname", this.courtname);
    __sqoop$field_map.put("courtlevel", this.courtlevel);
    __sqoop$field_map.put("address", this.address);
    __sqoop$field_map.put("cityname", this.cityname);
    __sqoop$field_map.put("countyname", this.countyname);
    __sqoop$field_map.put("latitude", this.latitude);
    __sqoop$field_map.put("longitude", this.longitude);
    __sqoop$field_map.put("tel", this.tel);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
