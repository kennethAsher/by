// ORM class for table 'company_investor'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue May 21 21:26:21 CST 2019
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

public class codegen_company_investor extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_investor.this.id = (Long)value;
      }
    });
    setters.put("company_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_investor.this.company_id = (Long)value;
      }
    });
    setters.put("investor_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_investor.this.investor_type = (Integer)value;
      }
    });
    setters.put("investor_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_investor.this.investor_id = (Long)value;
      }
    });
    setters.put("capital", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_investor.this.capital = (String)value;
      }
    });
    setters.put("capitalActl", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_investor.this.capitalActl = (String)value;
      }
    });
    setters.put("amount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_investor.this.amount = (Double)value;
      }
    });
    setters.put("certName", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_investor.this.certName = (String)value;
      }
    });
    setters.put("certNo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_investor.this.certNo = (String)value;
      }
    });
    setters.put("createTime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_investor.this.createTime = (java.sql.Timestamp)value;
      }
    });
    setters.put("ownership_stake", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_investor.this.ownership_stake = (String)value;
      }
    });
  }
  public codegen_company_investor() {
    init0();
  }
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public codegen_company_investor with_id(Long id) {
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
  public codegen_company_investor with_company_id(Long company_id) {
    this.company_id = company_id;
    return this;
  }
  private Integer investor_type;
  public Integer get_investor_type() {
    return investor_type;
  }
  public void set_investor_type(Integer investor_type) {
    this.investor_type = investor_type;
  }
  public codegen_company_investor with_investor_type(Integer investor_type) {
    this.investor_type = investor_type;
    return this;
  }
  private Long investor_id;
  public Long get_investor_id() {
    return investor_id;
  }
  public void set_investor_id(Long investor_id) {
    this.investor_id = investor_id;
  }
  public codegen_company_investor with_investor_id(Long investor_id) {
    this.investor_id = investor_id;
    return this;
  }
  private String capital;
  public String get_capital() {
    return capital;
  }
  public void set_capital(String capital) {
    this.capital = capital;
  }
  public codegen_company_investor with_capital(String capital) {
    this.capital = capital;
    return this;
  }
  private String capitalActl;
  public String get_capitalActl() {
    return capitalActl;
  }
  public void set_capitalActl(String capitalActl) {
    this.capitalActl = capitalActl;
  }
  public codegen_company_investor with_capitalActl(String capitalActl) {
    this.capitalActl = capitalActl;
    return this;
  }
  private Double amount;
  public Double get_amount() {
    return amount;
  }
  public void set_amount(Double amount) {
    this.amount = amount;
  }
  public codegen_company_investor with_amount(Double amount) {
    this.amount = amount;
    return this;
  }
  private String certName;
  public String get_certName() {
    return certName;
  }
  public void set_certName(String certName) {
    this.certName = certName;
  }
  public codegen_company_investor with_certName(String certName) {
    this.certName = certName;
    return this;
  }
  private String certNo;
  public String get_certNo() {
    return certNo;
  }
  public void set_certNo(String certNo) {
    this.certNo = certNo;
  }
  public codegen_company_investor with_certNo(String certNo) {
    this.certNo = certNo;
    return this;
  }
  private java.sql.Timestamp createTime;
  public java.sql.Timestamp get_createTime() {
    return createTime;
  }
  public void set_createTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }
  public codegen_company_investor with_createTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }
  private String ownership_stake;
  public String get_ownership_stake() {
    return ownership_stake;
  }
  public void set_ownership_stake(String ownership_stake) {
    this.ownership_stake = ownership_stake;
  }
  public codegen_company_investor with_ownership_stake(String ownership_stake) {
    this.ownership_stake = ownership_stake;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_company_investor)) {
      return false;
    }
    codegen_company_investor that = (codegen_company_investor) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.company_id == null ? that.company_id == null : this.company_id.equals(that.company_id));
    equal = equal && (this.investor_type == null ? that.investor_type == null : this.investor_type.equals(that.investor_type));
    equal = equal && (this.investor_id == null ? that.investor_id == null : this.investor_id.equals(that.investor_id));
    equal = equal && (this.capital == null ? that.capital == null : this.capital.equals(that.capital));
    equal = equal && (this.capitalActl == null ? that.capitalActl == null : this.capitalActl.equals(that.capitalActl));
    equal = equal && (this.amount == null ? that.amount == null : this.amount.equals(that.amount));
    equal = equal && (this.certName == null ? that.certName == null : this.certName.equals(that.certName));
    equal = equal && (this.certNo == null ? that.certNo == null : this.certNo.equals(that.certNo));
    equal = equal && (this.createTime == null ? that.createTime == null : this.createTime.equals(that.createTime));
    equal = equal && (this.ownership_stake == null ? that.ownership_stake == null : this.ownership_stake.equals(that.ownership_stake));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_company_investor)) {
      return false;
    }
    codegen_company_investor that = (codegen_company_investor) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.company_id == null ? that.company_id == null : this.company_id.equals(that.company_id));
    equal = equal && (this.investor_type == null ? that.investor_type == null : this.investor_type.equals(that.investor_type));
    equal = equal && (this.investor_id == null ? that.investor_id == null : this.investor_id.equals(that.investor_id));
    equal = equal && (this.capital == null ? that.capital == null : this.capital.equals(that.capital));
    equal = equal && (this.capitalActl == null ? that.capitalActl == null : this.capitalActl.equals(that.capitalActl));
    equal = equal && (this.amount == null ? that.amount == null : this.amount.equals(that.amount));
    equal = equal && (this.certName == null ? that.certName == null : this.certName.equals(that.certName));
    equal = equal && (this.certNo == null ? that.certNo == null : this.certNo.equals(that.certNo));
    equal = equal && (this.createTime == null ? that.createTime == null : this.createTime.equals(that.createTime));
    equal = equal && (this.ownership_stake == null ? that.ownership_stake == null : this.ownership_stake.equals(that.ownership_stake));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.company_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.investor_type = JdbcWritableBridge.readInteger(3, __dbResults);
    this.investor_id = JdbcWritableBridge.readLong(4, __dbResults);
    this.capital = JdbcWritableBridge.readString(5, __dbResults);
    this.capitalActl = JdbcWritableBridge.readString(6, __dbResults);
    this.amount = JdbcWritableBridge.readDouble(7, __dbResults);
    this.certName = JdbcWritableBridge.readString(8, __dbResults);
    this.certNo = JdbcWritableBridge.readString(9, __dbResults);
    this.createTime = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.ownership_stake = JdbcWritableBridge.readString(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.company_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.investor_type = JdbcWritableBridge.readInteger(3, __dbResults);
    this.investor_id = JdbcWritableBridge.readLong(4, __dbResults);
    this.capital = JdbcWritableBridge.readString(5, __dbResults);
    this.capitalActl = JdbcWritableBridge.readString(6, __dbResults);
    this.amount = JdbcWritableBridge.readDouble(7, __dbResults);
    this.certName = JdbcWritableBridge.readString(8, __dbResults);
    this.certNo = JdbcWritableBridge.readString(9, __dbResults);
    this.createTime = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.ownership_stake = JdbcWritableBridge.readString(11, __dbResults);
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
    JdbcWritableBridge.writeInteger(investor_type, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(investor_id, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(capital, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(capitalActl, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(amount, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(certName, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(certNo, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(createTime, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(ownership_stake, 11 + __off, 12, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(company_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(investor_type, 3 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(investor_id, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(capital, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(capitalActl, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(amount, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(certName, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(certNo, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(createTime, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(ownership_stake, 11 + __off, 12, __dbStmt);
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
        this.investor_type = null;
    } else {
    this.investor_type = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.investor_id = null;
    } else {
    this.investor_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.capital = null;
    } else {
    this.capital = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.capitalActl = null;
    } else {
    this.capitalActl = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.amount = null;
    } else {
    this.amount = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.certName = null;
    } else {
    this.certName = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.certNo = null;
    } else {
    this.certNo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.createTime = null;
    } else {
    this.createTime = new Timestamp(__dataIn.readLong());
    this.createTime.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ownership_stake = null;
    } else {
    this.ownership_stake = Text.readString(__dataIn);
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
    if (null == this.investor_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.investor_type);
    }
    if (null == this.investor_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.investor_id);
    }
    if (null == this.capital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, capital);
    }
    if (null == this.capitalActl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, capitalActl);
    }
    if (null == this.amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amount);
    }
    if (null == this.certName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, certName);
    }
    if (null == this.certNo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, certNo);
    }
    if (null == this.createTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.createTime.getTime());
    __dataOut.writeInt(this.createTime.getNanos());
    }
    if (null == this.ownership_stake) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ownership_stake);
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
    if (null == this.investor_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.investor_type);
    }
    if (null == this.investor_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.investor_id);
    }
    if (null == this.capital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, capital);
    }
    if (null == this.capitalActl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, capitalActl);
    }
    if (null == this.amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.amount);
    }
    if (null == this.certName) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, certName);
    }
    if (null == this.certNo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, certNo);
    }
    if (null == this.createTime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.createTime.getTime());
    __dataOut.writeInt(this.createTime.getNanos());
    }
    if (null == this.ownership_stake) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ownership_stake);
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
    __sb.append(FieldFormatter.escapeAndEnclose(investor_type==null?"null":"" + investor_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(investor_id==null?"null":"" + investor_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(capital==null?"null":capital, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(capitalActl==null?"null":capitalActl, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amount==null?"null":"" + amount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(certName==null?"null":certName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(certNo==null?"null":certNo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(createTime==null?"null":"" + createTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ownership_stake==null?"null":ownership_stake, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(investor_type==null?"null":"" + investor_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(investor_id==null?"null":"" + investor_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(capital==null?"null":capital, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(capitalActl==null?"null":capitalActl, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amount==null?"null":"" + amount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(certName==null?"null":certName, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(certNo==null?"null":certNo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(createTime==null?"null":"" + createTime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ownership_stake==null?"null":ownership_stake, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.investor_type = null; } else {
      this.investor_type = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.investor_id = null; } else {
      this.investor_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.capital = null; } else {
      this.capital = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.capitalActl = null; } else {
      this.capitalActl = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amount = null; } else {
      this.amount = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.certName = null; } else {
      this.certName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.certNo = null; } else {
      this.certNo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.createTime = null; } else {
      this.createTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ownership_stake = null; } else {
      this.ownership_stake = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.investor_type = null; } else {
      this.investor_type = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.investor_id = null; } else {
      this.investor_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.capital = null; } else {
      this.capital = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.capitalActl = null; } else {
      this.capitalActl = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amount = null; } else {
      this.amount = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.certName = null; } else {
      this.certName = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.certNo = null; } else {
      this.certNo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.createTime = null; } else {
      this.createTime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ownership_stake = null; } else {
      this.ownership_stake = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_company_investor o = (codegen_company_investor) super.clone();
    o.createTime = (o.createTime != null) ? (java.sql.Timestamp) o.createTime.clone() : null;
    return o;
  }

  public void clone0(codegen_company_investor o) throws CloneNotSupportedException {
    o.createTime = (o.createTime != null) ? (java.sql.Timestamp) o.createTime.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("company_id", this.company_id);
    __sqoop$field_map.put("investor_type", this.investor_type);
    __sqoop$field_map.put("investor_id", this.investor_id);
    __sqoop$field_map.put("capital", this.capital);
    __sqoop$field_map.put("capitalActl", this.capitalActl);
    __sqoop$field_map.put("amount", this.amount);
    __sqoop$field_map.put("certName", this.certName);
    __sqoop$field_map.put("certNo", this.certNo);
    __sqoop$field_map.put("createTime", this.createTime);
    __sqoop$field_map.put("ownership_stake", this.ownership_stake);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("company_id", this.company_id);
    __sqoop$field_map.put("investor_type", this.investor_type);
    __sqoop$field_map.put("investor_id", this.investor_id);
    __sqoop$field_map.put("capital", this.capital);
    __sqoop$field_map.put("capitalActl", this.capitalActl);
    __sqoop$field_map.put("amount", this.amount);
    __sqoop$field_map.put("certName", this.certName);
    __sqoop$field_map.put("certNo", this.certNo);
    __sqoop$field_map.put("createTime", this.createTime);
    __sqoop$field_map.put("ownership_stake", this.ownership_stake);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
