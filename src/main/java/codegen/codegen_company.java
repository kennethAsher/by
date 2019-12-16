// ORM class for table 'company'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue May 21 21:24:33 CST 2019
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

public class codegen_company extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }
  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.id = (Long)value;
      }
    });
    setters.put("base", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.base = (String)value;
      }
    });
    setters.put("name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.name = (String)value;
      }
    });
    setters.put("legal_person_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.legal_person_id = (Long)value;
      }
    });
    setters.put("legal_person_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.legal_person_name = (String)value;
      }
    });
    setters.put("legal_person_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.legal_person_type = (Integer)value;
      }
    });
    setters.put("reg_number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.reg_number = (String)value;
      }
    });
    setters.put("company_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.company_type = (Integer)value;
      }
    });
    setters.put("company_org_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.company_org_type = (String)value;
      }
    });
    setters.put("reg_location", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.reg_location = (String)value;
      }
    });
    setters.put("estiblish_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.estiblish_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("from_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.from_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("to_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.to_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("business_scope", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.business_scope = (String)value;
      }
    });
    setters.put("reg_institute", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.reg_institute = (String)value;
      }
    });
    setters.put("approved_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.approved_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("reg_status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.reg_status = (String)value;
      }
    });
    setters.put("reg_capital", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.reg_capital = (String)value;
      }
    });
    setters.put("actual_capital", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.actual_capital = (String)value;
      }
    });
    setters.put("org_number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.org_number = (String)value;
      }
    });
    setters.put("org_approved_institute", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.org_approved_institute = (String)value;
      }
    });
    setters.put("flag", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.flag = (Integer)value;
      }
    });
    setters.put("parent_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.parent_id = (Long)value;
      }
    });
    setters.put("updatetime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.updatetime = (java.sql.Timestamp)value;
      }
    });
    setters.put("list_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.list_code = (String)value;
      }
    });
    setters.put("ownership_stake", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.ownership_stake = (String)value;
      }
    });
    setters.put("source_flag", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.source_flag = (String)value;
      }
    });
    setters.put("name_suffix", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.name_suffix = (String)value;
      }
    });
    setters.put("property1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.property1 = (String)value;
      }
    });
    setters.put("property2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.property2 = (String)value;
      }
    });
    setters.put("property3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.property3 = (String)value;
      }
    });
    setters.put("property4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.property4 = (String)value;
      }
    });
    setters.put("property5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.property5 = (String)value;
      }
    });
    setters.put("crawledtime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company.this.crawledtime = (java.sql.Timestamp)value;
      }
    });
  }
  public codegen_company() {
    init0();
  }
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public codegen_company with_id(Long id) {
    this.id = id;
    return this;
  }
  private String base;
  public String get_base() {
    return base;
  }
  public void set_base(String base) {
    this.base = base;
  }
  public codegen_company with_base(String base) {
    this.base = base;
    return this;
  }
  private String name;
  public String get_name() {
    return name;
  }
  public void set_name(String name) {
    this.name = name;
  }
  public codegen_company with_name(String name) {
    this.name = name;
    return this;
  }
  private Long legal_person_id;
  public Long get_legal_person_id() {
    return legal_person_id;
  }
  public void set_legal_person_id(Long legal_person_id) {
    this.legal_person_id = legal_person_id;
  }
  public codegen_company with_legal_person_id(Long legal_person_id) {
    this.legal_person_id = legal_person_id;
    return this;
  }
  private String legal_person_name;
  public String get_legal_person_name() {
    return legal_person_name;
  }
  public void set_legal_person_name(String legal_person_name) {
    this.legal_person_name = legal_person_name;
  }
  public codegen_company with_legal_person_name(String legal_person_name) {
    this.legal_person_name = legal_person_name;
    return this;
  }
  private Integer legal_person_type;
  public Integer get_legal_person_type() {
    return legal_person_type;
  }
  public void set_legal_person_type(Integer legal_person_type) {
    this.legal_person_type = legal_person_type;
  }
  public codegen_company with_legal_person_type(Integer legal_person_type) {
    this.legal_person_type = legal_person_type;
    return this;
  }
  private String reg_number;
  public String get_reg_number() {
    return reg_number;
  }
  public void set_reg_number(String reg_number) {
    this.reg_number = reg_number;
  }
  public codegen_company with_reg_number(String reg_number) {
    this.reg_number = reg_number;
    return this;
  }
  private Integer company_type;
  public Integer get_company_type() {
    return company_type;
  }
  public void set_company_type(Integer company_type) {
    this.company_type = company_type;
  }
  public codegen_company with_company_type(Integer company_type) {
    this.company_type = company_type;
    return this;
  }
  private String company_org_type;
  public String get_company_org_type() {
    return company_org_type;
  }
  public void set_company_org_type(String company_org_type) {
    this.company_org_type = company_org_type;
  }
  public codegen_company with_company_org_type(String company_org_type) {
    this.company_org_type = company_org_type;
    return this;
  }
  private String reg_location;
  public String get_reg_location() {
    return reg_location;
  }
  public void set_reg_location(String reg_location) {
    this.reg_location = reg_location;
  }
  public codegen_company with_reg_location(String reg_location) {
    this.reg_location = reg_location;
    return this;
  }
  private java.sql.Timestamp estiblish_time;
  public java.sql.Timestamp get_estiblish_time() {
    return estiblish_time;
  }
  public void set_estiblish_time(java.sql.Timestamp estiblish_time) {
    this.estiblish_time = estiblish_time;
  }
  public codegen_company with_estiblish_time(java.sql.Timestamp estiblish_time) {
    this.estiblish_time = estiblish_time;
    return this;
  }
  private java.sql.Timestamp from_time;
  public java.sql.Timestamp get_from_time() {
    return from_time;
  }
  public void set_from_time(java.sql.Timestamp from_time) {
    this.from_time = from_time;
  }
  public codegen_company with_from_time(java.sql.Timestamp from_time) {
    this.from_time = from_time;
    return this;
  }
  private java.sql.Timestamp to_time;
  public java.sql.Timestamp get_to_time() {
    return to_time;
  }
  public void set_to_time(java.sql.Timestamp to_time) {
    this.to_time = to_time;
  }
  public codegen_company with_to_time(java.sql.Timestamp to_time) {
    this.to_time = to_time;
    return this;
  }
  private String business_scope;
  public String get_business_scope() {
    return business_scope;
  }
  public void set_business_scope(String business_scope) {
    this.business_scope = business_scope;
  }
  public codegen_company with_business_scope(String business_scope) {
    this.business_scope = business_scope;
    return this;
  }
  private String reg_institute;
  public String get_reg_institute() {
    return reg_institute;
  }
  public void set_reg_institute(String reg_institute) {
    this.reg_institute = reg_institute;
  }
  public codegen_company with_reg_institute(String reg_institute) {
    this.reg_institute = reg_institute;
    return this;
  }
  private java.sql.Timestamp approved_time;
  public java.sql.Timestamp get_approved_time() {
    return approved_time;
  }
  public void set_approved_time(java.sql.Timestamp approved_time) {
    this.approved_time = approved_time;
  }
  public codegen_company with_approved_time(java.sql.Timestamp approved_time) {
    this.approved_time = approved_time;
    return this;
  }
  private String reg_status;
  public String get_reg_status() {
    return reg_status;
  }
  public void set_reg_status(String reg_status) {
    this.reg_status = reg_status;
  }
  public codegen_company with_reg_status(String reg_status) {
    this.reg_status = reg_status;
    return this;
  }
  private String reg_capital;
  public String get_reg_capital() {
    return reg_capital;
  }
  public void set_reg_capital(String reg_capital) {
    this.reg_capital = reg_capital;
  }
  public codegen_company with_reg_capital(String reg_capital) {
    this.reg_capital = reg_capital;
    return this;
  }
  private String actual_capital;
  public String get_actual_capital() {
    return actual_capital;
  }
  public void set_actual_capital(String actual_capital) {
    this.actual_capital = actual_capital;
  }
  public codegen_company with_actual_capital(String actual_capital) {
    this.actual_capital = actual_capital;
    return this;
  }
  private String org_number;
  public String get_org_number() {
    return org_number;
  }
  public void set_org_number(String org_number) {
    this.org_number = org_number;
  }
  public codegen_company with_org_number(String org_number) {
    this.org_number = org_number;
    return this;
  }
  private String org_approved_institute;
  public String get_org_approved_institute() {
    return org_approved_institute;
  }
  public void set_org_approved_institute(String org_approved_institute) {
    this.org_approved_institute = org_approved_institute;
  }
  public codegen_company with_org_approved_institute(String org_approved_institute) {
    this.org_approved_institute = org_approved_institute;
    return this;
  }
  private Integer flag;
  public Integer get_flag() {
    return flag;
  }
  public void set_flag(Integer flag) {
    this.flag = flag;
  }
  public codegen_company with_flag(Integer flag) {
    this.flag = flag;
    return this;
  }
  private Long parent_id;
  public Long get_parent_id() {
    return parent_id;
  }
  public void set_parent_id(Long parent_id) {
    this.parent_id = parent_id;
  }
  public codegen_company with_parent_id(Long parent_id) {
    this.parent_id = parent_id;
    return this;
  }
  private java.sql.Timestamp updatetime;
  public java.sql.Timestamp get_updatetime() {
    return updatetime;
  }
  public void set_updatetime(java.sql.Timestamp updatetime) {
    this.updatetime = updatetime;
  }
  public codegen_company with_updatetime(java.sql.Timestamp updatetime) {
    this.updatetime = updatetime;
    return this;
  }
  private String list_code;
  public String get_list_code() {
    return list_code;
  }
  public void set_list_code(String list_code) {
    this.list_code = list_code;
  }
  public codegen_company with_list_code(String list_code) {
    this.list_code = list_code;
    return this;
  }
  private String ownership_stake;
  public String get_ownership_stake() {
    return ownership_stake;
  }
  public void set_ownership_stake(String ownership_stake) {
    this.ownership_stake = ownership_stake;
  }
  public codegen_company with_ownership_stake(String ownership_stake) {
    this.ownership_stake = ownership_stake;
    return this;
  }
  private String source_flag;
  public String get_source_flag() {
    return source_flag;
  }
  public void set_source_flag(String source_flag) {
    this.source_flag = source_flag;
  }
  public codegen_company with_source_flag(String source_flag) {
    this.source_flag = source_flag;
    return this;
  }
  private String name_suffix;
  public String get_name_suffix() {
    return name_suffix;
  }
  public void set_name_suffix(String name_suffix) {
    this.name_suffix = name_suffix;
  }
  public codegen_company with_name_suffix(String name_suffix) {
    this.name_suffix = name_suffix;
    return this;
  }
  private String property1;
  public String get_property1() {
    return property1;
  }
  public void set_property1(String property1) {
    this.property1 = property1;
  }
  public codegen_company with_property1(String property1) {
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
  public codegen_company with_property2(String property2) {
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
  public codegen_company with_property3(String property3) {
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
  public codegen_company with_property4(String property4) {
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
  public codegen_company with_property5(String property5) {
    this.property5 = property5;
    return this;
  }
  private java.sql.Timestamp crawledtime;
  public java.sql.Timestamp get_crawledtime() {
    return crawledtime;
  }
  public void set_crawledtime(java.sql.Timestamp crawledtime) {
    this.crawledtime = crawledtime;
  }
  public codegen_company with_crawledtime(java.sql.Timestamp crawledtime) {
    this.crawledtime = crawledtime;
    return this;
  }
//  赋值并且能够判断是否成功复制，有没有错误
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_company)) {
      return false;
    }
    codegen_company that = (codegen_company) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.base == null ? that.base == null : this.base.equals(that.base));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.legal_person_id == null ? that.legal_person_id == null : this.legal_person_id.equals(that.legal_person_id));
    equal = equal && (this.legal_person_name == null ? that.legal_person_name == null : this.legal_person_name.equals(that.legal_person_name));
    equal = equal && (this.legal_person_type == null ? that.legal_person_type == null : this.legal_person_type.equals(that.legal_person_type));
    equal = equal && (this.reg_number == null ? that.reg_number == null : this.reg_number.equals(that.reg_number));
    equal = equal && (this.company_type == null ? that.company_type == null : this.company_type.equals(that.company_type));
    equal = equal && (this.company_org_type == null ? that.company_org_type == null : this.company_org_type.equals(that.company_org_type));
    equal = equal && (this.reg_location == null ? that.reg_location == null : this.reg_location.equals(that.reg_location));
    equal = equal && (this.estiblish_time == null ? that.estiblish_time == null : this.estiblish_time.equals(that.estiblish_time));
    equal = equal && (this.from_time == null ? that.from_time == null : this.from_time.equals(that.from_time));
    equal = equal && (this.to_time == null ? that.to_time == null : this.to_time.equals(that.to_time));
    equal = equal && (this.business_scope == null ? that.business_scope == null : this.business_scope.equals(that.business_scope));
    equal = equal && (this.reg_institute == null ? that.reg_institute == null : this.reg_institute.equals(that.reg_institute));
    equal = equal && (this.approved_time == null ? that.approved_time == null : this.approved_time.equals(that.approved_time));
    equal = equal && (this.reg_status == null ? that.reg_status == null : this.reg_status.equals(that.reg_status));
    equal = equal && (this.reg_capital == null ? that.reg_capital == null : this.reg_capital.equals(that.reg_capital));
    equal = equal && (this.actual_capital == null ? that.actual_capital == null : this.actual_capital.equals(that.actual_capital));
    equal = equal && (this.org_number == null ? that.org_number == null : this.org_number.equals(that.org_number));
    equal = equal && (this.org_approved_institute == null ? that.org_approved_institute == null : this.org_approved_institute.equals(that.org_approved_institute));
    equal = equal && (this.flag == null ? that.flag == null : this.flag.equals(that.flag));
    equal = equal && (this.parent_id == null ? that.parent_id == null : this.parent_id.equals(that.parent_id));
    equal = equal && (this.updatetime == null ? that.updatetime == null : this.updatetime.equals(that.updatetime));
    equal = equal && (this.list_code == null ? that.list_code == null : this.list_code.equals(that.list_code));
    equal = equal && (this.ownership_stake == null ? that.ownership_stake == null : this.ownership_stake.equals(that.ownership_stake));
    equal = equal && (this.source_flag == null ? that.source_flag == null : this.source_flag.equals(that.source_flag));
    equal = equal && (this.name_suffix == null ? that.name_suffix == null : this.name_suffix.equals(that.name_suffix));
    equal = equal && (this.property1 == null ? that.property1 == null : this.property1.equals(that.property1));
    equal = equal && (this.property2 == null ? that.property2 == null : this.property2.equals(that.property2));
    equal = equal && (this.property3 == null ? that.property3 == null : this.property3.equals(that.property3));
    equal = equal && (this.property4 == null ? that.property4 == null : this.property4.equals(that.property4));
    equal = equal && (this.property5 == null ? that.property5 == null : this.property5.equals(that.property5));
    equal = equal && (this.crawledtime == null ? that.crawledtime == null : this.crawledtime.equals(that.crawledtime));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_company)) {
      return false;
    }
    codegen_company that = (codegen_company) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.base == null ? that.base == null : this.base.equals(that.base));
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.legal_person_id == null ? that.legal_person_id == null : this.legal_person_id.equals(that.legal_person_id));
    equal = equal && (this.legal_person_name == null ? that.legal_person_name == null : this.legal_person_name.equals(that.legal_person_name));
    equal = equal && (this.legal_person_type == null ? that.legal_person_type == null : this.legal_person_type.equals(that.legal_person_type));
    equal = equal && (this.reg_number == null ? that.reg_number == null : this.reg_number.equals(that.reg_number));
    equal = equal && (this.company_type == null ? that.company_type == null : this.company_type.equals(that.company_type));
    equal = equal && (this.company_org_type == null ? that.company_org_type == null : this.company_org_type.equals(that.company_org_type));
    equal = equal && (this.reg_location == null ? that.reg_location == null : this.reg_location.equals(that.reg_location));
    equal = equal && (this.estiblish_time == null ? that.estiblish_time == null : this.estiblish_time.equals(that.estiblish_time));
    equal = equal && (this.from_time == null ? that.from_time == null : this.from_time.equals(that.from_time));
    equal = equal && (this.to_time == null ? that.to_time == null : this.to_time.equals(that.to_time));
    equal = equal && (this.business_scope == null ? that.business_scope == null : this.business_scope.equals(that.business_scope));
    equal = equal && (this.reg_institute == null ? that.reg_institute == null : this.reg_institute.equals(that.reg_institute));
    equal = equal && (this.approved_time == null ? that.approved_time == null : this.approved_time.equals(that.approved_time));
    equal = equal && (this.reg_status == null ? that.reg_status == null : this.reg_status.equals(that.reg_status));
    equal = equal && (this.reg_capital == null ? that.reg_capital == null : this.reg_capital.equals(that.reg_capital));
    equal = equal && (this.actual_capital == null ? that.actual_capital == null : this.actual_capital.equals(that.actual_capital));
    equal = equal && (this.org_number == null ? that.org_number == null : this.org_number.equals(that.org_number));
    equal = equal && (this.org_approved_institute == null ? that.org_approved_institute == null : this.org_approved_institute.equals(that.org_approved_institute));
    equal = equal && (this.flag == null ? that.flag == null : this.flag.equals(that.flag));
    equal = equal && (this.parent_id == null ? that.parent_id == null : this.parent_id.equals(that.parent_id));
    equal = equal && (this.updatetime == null ? that.updatetime == null : this.updatetime.equals(that.updatetime));
    equal = equal && (this.list_code == null ? that.list_code == null : this.list_code.equals(that.list_code));
    equal = equal && (this.ownership_stake == null ? that.ownership_stake == null : this.ownership_stake.equals(that.ownership_stake));
    equal = equal && (this.source_flag == null ? that.source_flag == null : this.source_flag.equals(that.source_flag));
    equal = equal && (this.name_suffix == null ? that.name_suffix == null : this.name_suffix.equals(that.name_suffix));
    equal = equal && (this.property1 == null ? that.property1 == null : this.property1.equals(that.property1));
    equal = equal && (this.property2 == null ? that.property2 == null : this.property2.equals(that.property2));
    equal = equal && (this.property3 == null ? that.property3 == null : this.property3.equals(that.property3));
    equal = equal && (this.property4 == null ? that.property4 == null : this.property4.equals(that.property4));
    equal = equal && (this.property5 == null ? that.property5 == null : this.property5.equals(that.property5));
    equal = equal && (this.crawledtime == null ? that.crawledtime == null : this.crawledtime.equals(that.crawledtime));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.base = JdbcWritableBridge.readString(2, __dbResults);
    this.name = JdbcWritableBridge.readString(3, __dbResults);
    this.legal_person_id = JdbcWritableBridge.readLong(4, __dbResults);
    this.legal_person_name = JdbcWritableBridge.readString(5, __dbResults);
    this.legal_person_type = JdbcWritableBridge.readInteger(6, __dbResults);
    this.reg_number = JdbcWritableBridge.readString(7, __dbResults);
    this.company_type = JdbcWritableBridge.readInteger(8, __dbResults);
    this.company_org_type = JdbcWritableBridge.readString(9, __dbResults);
    this.reg_location = JdbcWritableBridge.readString(10, __dbResults);
    this.estiblish_time = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.from_time = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.to_time = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.business_scope = JdbcWritableBridge.readString(14, __dbResults);
    this.reg_institute = JdbcWritableBridge.readString(15, __dbResults);
    this.approved_time = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.reg_status = JdbcWritableBridge.readString(17, __dbResults);
    this.reg_capital = JdbcWritableBridge.readString(18, __dbResults);
    this.actual_capital = JdbcWritableBridge.readString(19, __dbResults);
    this.org_number = JdbcWritableBridge.readString(20, __dbResults);
    this.org_approved_institute = JdbcWritableBridge.readString(21, __dbResults);
    this.flag = JdbcWritableBridge.readInteger(22, __dbResults);
    this.parent_id = JdbcWritableBridge.readLong(23, __dbResults);
    this.updatetime = JdbcWritableBridge.readTimestamp(24, __dbResults);
    this.list_code = JdbcWritableBridge.readString(25, __dbResults);
    this.ownership_stake = JdbcWritableBridge.readString(26, __dbResults);
    this.source_flag = JdbcWritableBridge.readString(27, __dbResults);
    this.name_suffix = JdbcWritableBridge.readString(28, __dbResults);
    this.property1 = JdbcWritableBridge.readString(29, __dbResults);
    this.property2 = JdbcWritableBridge.readString(30, __dbResults);
    this.property3 = JdbcWritableBridge.readString(31, __dbResults);
    this.property4 = JdbcWritableBridge.readString(32, __dbResults);
    this.property5 = JdbcWritableBridge.readString(33, __dbResults);
    this.crawledtime = JdbcWritableBridge.readTimestamp(34, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.base = JdbcWritableBridge.readString(2, __dbResults);
    this.name = JdbcWritableBridge.readString(3, __dbResults);
    this.legal_person_id = JdbcWritableBridge.readLong(4, __dbResults);
    this.legal_person_name = JdbcWritableBridge.readString(5, __dbResults);
    this.legal_person_type = JdbcWritableBridge.readInteger(6, __dbResults);
    this.reg_number = JdbcWritableBridge.readString(7, __dbResults);
    this.company_type = JdbcWritableBridge.readInteger(8, __dbResults);
    this.company_org_type = JdbcWritableBridge.readString(9, __dbResults);
    this.reg_location = JdbcWritableBridge.readString(10, __dbResults);
    this.estiblish_time = JdbcWritableBridge.readTimestamp(11, __dbResults);
    this.from_time = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.to_time = JdbcWritableBridge.readTimestamp(13, __dbResults);
    this.business_scope = JdbcWritableBridge.readString(14, __dbResults);
    this.reg_institute = JdbcWritableBridge.readString(15, __dbResults);
    this.approved_time = JdbcWritableBridge.readTimestamp(16, __dbResults);
    this.reg_status = JdbcWritableBridge.readString(17, __dbResults);
    this.reg_capital = JdbcWritableBridge.readString(18, __dbResults);
    this.actual_capital = JdbcWritableBridge.readString(19, __dbResults);
    this.org_number = JdbcWritableBridge.readString(20, __dbResults);
    this.org_approved_institute = JdbcWritableBridge.readString(21, __dbResults);
    this.flag = JdbcWritableBridge.readInteger(22, __dbResults);
    this.parent_id = JdbcWritableBridge.readLong(23, __dbResults);
    this.updatetime = JdbcWritableBridge.readTimestamp(24, __dbResults);
    this.list_code = JdbcWritableBridge.readString(25, __dbResults);
    this.ownership_stake = JdbcWritableBridge.readString(26, __dbResults);
    this.source_flag = JdbcWritableBridge.readString(27, __dbResults);
    this.name_suffix = JdbcWritableBridge.readString(28, __dbResults);
    this.property1 = JdbcWritableBridge.readString(29, __dbResults);
    this.property2 = JdbcWritableBridge.readString(30, __dbResults);
    this.property3 = JdbcWritableBridge.readString(31, __dbResults);
    this.property4 = JdbcWritableBridge.readString(32, __dbResults);
    this.property5 = JdbcWritableBridge.readString(33, __dbResults);
    this.crawledtime = JdbcWritableBridge.readTimestamp(34, __dbResults);
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
    JdbcWritableBridge.writeString(base, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(legal_person_id, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(legal_person_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(legal_person_type, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(reg_number, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(company_type, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(company_org_type, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(reg_location, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(estiblish_time, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(from_time, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(to_time, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(business_scope, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(reg_institute, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(approved_time, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(reg_status, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(reg_capital, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(actual_capital, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(org_number, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(org_approved_institute, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(flag, 22 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(parent_id, 23 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updatetime, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(list_code, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ownership_stake, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(source_flag, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name_suffix, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property1, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property2, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property3, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property4, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property5, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(crawledtime, 34 + __off, 93, __dbStmt);
    return 34;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(base, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(legal_person_id, 4 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(legal_person_name, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(legal_person_type, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(reg_number, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(company_type, 8 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeString(company_org_type, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(reg_location, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(estiblish_time, 11 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(from_time, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(to_time, 13 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(business_scope, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(reg_institute, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(approved_time, 16 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(reg_status, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(reg_capital, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(actual_capital, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(org_number, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(org_approved_institute, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(flag, 22 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeLong(parent_id, 23 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updatetime, 24 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(list_code, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ownership_stake, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(source_flag, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(name_suffix, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property1, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property2, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property3, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property4, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(property5, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(crawledtime, 34 + __off, 93, __dbStmt);
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
        this.base = null;
    } else {
    this.base = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.name = null;
    } else {
    this.name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.legal_person_id = null;
    } else {
    this.legal_person_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.legal_person_name = null;
    } else {
    this.legal_person_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.legal_person_type = null;
    } else {
    this.legal_person_type = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.reg_number = null;
    } else {
    this.reg_number = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.company_type = null;
    } else {
    this.company_type = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.company_org_type = null;
    } else {
    this.company_org_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.reg_location = null;
    } else {
    this.reg_location = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.estiblish_time = null;
    } else {
    this.estiblish_time = new Timestamp(__dataIn.readLong());
    this.estiblish_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.from_time = null;
    } else {
    this.from_time = new Timestamp(__dataIn.readLong());
    this.from_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.to_time = null;
    } else {
    this.to_time = new Timestamp(__dataIn.readLong());
    this.to_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.business_scope = null;
    } else {
    this.business_scope = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.reg_institute = null;
    } else {
    this.reg_institute = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.approved_time = null;
    } else {
    this.approved_time = new Timestamp(__dataIn.readLong());
    this.approved_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.reg_status = null;
    } else {
    this.reg_status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.reg_capital = null;
    } else {
    this.reg_capital = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.actual_capital = null;
    } else {
    this.actual_capital = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.org_number = null;
    } else {
    this.org_number = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.org_approved_institute = null;
    } else {
    this.org_approved_institute = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.flag = null;
    } else {
    this.flag = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.parent_id = null;
    } else {
    this.parent_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.updatetime = null;
    } else {
    this.updatetime = new Timestamp(__dataIn.readLong());
    this.updatetime.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.list_code = null;
    } else {
    this.list_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ownership_stake = null;
    } else {
    this.ownership_stake = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.source_flag = null;
    } else {
    this.source_flag = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.name_suffix = null;
    } else {
    this.name_suffix = Text.readString(__dataIn);
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
        this.crawledtime = null;
    } else {
    this.crawledtime = new Timestamp(__dataIn.readLong());
    this.crawledtime.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.base) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, base);
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.legal_person_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.legal_person_id);
    }
    if (null == this.legal_person_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, legal_person_name);
    }
    if (null == this.legal_person_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.legal_person_type);
    }
    if (null == this.reg_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reg_number);
    }
    if (null == this.company_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.company_type);
    }
    if (null == this.company_org_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, company_org_type);
    }
    if (null == this.reg_location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reg_location);
    }
    if (null == this.estiblish_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.estiblish_time.getTime());
    __dataOut.writeInt(this.estiblish_time.getNanos());
    }
    if (null == this.from_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.from_time.getTime());
    __dataOut.writeInt(this.from_time.getNanos());
    }
    if (null == this.to_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.to_time.getTime());
    __dataOut.writeInt(this.to_time.getNanos());
    }
    if (null == this.business_scope) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, business_scope);
    }
    if (null == this.reg_institute) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reg_institute);
    }
    if (null == this.approved_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.approved_time.getTime());
    __dataOut.writeInt(this.approved_time.getNanos());
    }
    if (null == this.reg_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reg_status);
    }
    if (null == this.reg_capital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reg_capital);
    }
    if (null == this.actual_capital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, actual_capital);
    }
    if (null == this.org_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, org_number);
    }
    if (null == this.org_approved_institute) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, org_approved_institute);
    }
    if (null == this.flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag);
    }
    if (null == this.parent_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.parent_id);
    }
    if (null == this.updatetime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.updatetime.getTime());
    __dataOut.writeInt(this.updatetime.getNanos());
    }
    if (null == this.list_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, list_code);
    }
    if (null == this.ownership_stake) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ownership_stake);
    }
    if (null == this.source_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, source_flag);
    }
    if (null == this.name_suffix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_suffix);
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
    if (null == this.crawledtime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.crawledtime.getTime());
    __dataOut.writeInt(this.crawledtime.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.base) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, base);
    }
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.legal_person_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.legal_person_id);
    }
    if (null == this.legal_person_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, legal_person_name);
    }
    if (null == this.legal_person_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.legal_person_type);
    }
    if (null == this.reg_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reg_number);
    }
    if (null == this.company_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.company_type);
    }
    if (null == this.company_org_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, company_org_type);
    }
    if (null == this.reg_location) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reg_location);
    }
    if (null == this.estiblish_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.estiblish_time.getTime());
    __dataOut.writeInt(this.estiblish_time.getNanos());
    }
    if (null == this.from_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.from_time.getTime());
    __dataOut.writeInt(this.from_time.getNanos());
    }
    if (null == this.to_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.to_time.getTime());
    __dataOut.writeInt(this.to_time.getNanos());
    }
    if (null == this.business_scope) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, business_scope);
    }
    if (null == this.reg_institute) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reg_institute);
    }
    if (null == this.approved_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.approved_time.getTime());
    __dataOut.writeInt(this.approved_time.getNanos());
    }
    if (null == this.reg_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reg_status);
    }
    if (null == this.reg_capital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reg_capital);
    }
    if (null == this.actual_capital) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, actual_capital);
    }
    if (null == this.org_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, org_number);
    }
    if (null == this.org_approved_institute) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, org_approved_institute);
    }
    if (null == this.flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.flag);
    }
    if (null == this.parent_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.parent_id);
    }
    if (null == this.updatetime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.updatetime.getTime());
    __dataOut.writeInt(this.updatetime.getNanos());
    }
    if (null == this.list_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, list_code);
    }
    if (null == this.ownership_stake) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ownership_stake);
    }
    if (null == this.source_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, source_flag);
    }
    if (null == this.name_suffix) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name_suffix);
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
    if (null == this.crawledtime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.crawledtime.getTime());
    __dataOut.writeInt(this.crawledtime.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(base==null?"null":base, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(legal_person_id==null?"null":"" + legal_person_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(legal_person_name==null?"null":legal_person_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(legal_person_type==null?"null":"" + legal_person_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_number==null?"null":reg_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(company_type==null?"null":"" + company_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(company_org_type==null?"null":company_org_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_location==null?"null":reg_location, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estiblish_time==null?"null":"" + estiblish_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(from_time==null?"null":"" + from_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(to_time==null?"null":"" + to_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(business_scope==null?"null":business_scope, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_institute==null?"null":reg_institute, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(approved_time==null?"null":"" + approved_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_status==null?"null":reg_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_capital==null?"null":reg_capital, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(actual_capital==null?"null":actual_capital, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(org_number==null?"null":org_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(org_approved_institute==null?"null":org_approved_institute, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag==null?"null":"" + flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(parent_id==null?"null":"" + parent_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updatetime==null?"null":"" + updatetime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(list_code==null?"null":list_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ownership_stake==null?"null":ownership_stake, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(source_flag==null?"null":source_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_suffix==null?"null":name_suffix, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(crawledtime==null?"null":"" + crawledtime, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(base==null?"null":base, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(legal_person_id==null?"null":"" + legal_person_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(legal_person_name==null?"null":legal_person_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(legal_person_type==null?"null":"" + legal_person_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_number==null?"null":reg_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(company_type==null?"null":"" + company_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(company_org_type==null?"null":company_org_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_location==null?"null":reg_location, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(estiblish_time==null?"null":"" + estiblish_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(from_time==null?"null":"" + from_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(to_time==null?"null":"" + to_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(business_scope==null?"null":business_scope, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_institute==null?"null":reg_institute, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(approved_time==null?"null":"" + approved_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_status==null?"null":reg_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reg_capital==null?"null":reg_capital, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(actual_capital==null?"null":actual_capital, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(org_number==null?"null":org_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(org_approved_institute==null?"null":org_approved_institute, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(flag==null?"null":"" + flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(parent_id==null?"null":"" + parent_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updatetime==null?"null":"" + updatetime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(list_code==null?"null":list_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ownership_stake==null?"null":ownership_stake, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(source_flag==null?"null":source_flag, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(name_suffix==null?"null":name_suffix, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(crawledtime==null?"null":"" + crawledtime, delimiters));
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
    if (__cur_str.equals("null")) { this.base = null; } else {
      this.base = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.legal_person_id = null; } else {
      this.legal_person_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.legal_person_name = null; } else {
      this.legal_person_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.legal_person_type = null; } else {
      this.legal_person_type = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.reg_number = null; } else {
      this.reg_number = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.company_type = null; } else {
      this.company_type = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.company_org_type = null; } else {
      this.company_org_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.reg_location = null; } else {
      this.reg_location = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.estiblish_time = null; } else {
      this.estiblish_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.from_time = null; } else {
      this.from_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.to_time = null; } else {
      this.to_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.business_scope = null; } else {
      this.business_scope = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.reg_institute = null; } else {
      this.reg_institute = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.approved_time = null; } else {
      this.approved_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.reg_status = null; } else {
      this.reg_status = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.reg_capital = null; } else {
      this.reg_capital = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.actual_capital = null; } else {
      this.actual_capital = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.org_number = null; } else {
      this.org_number = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.org_approved_institute = null; } else {
      this.org_approved_institute = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag = null; } else {
      this.flag = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.parent_id = null; } else {
      this.parent_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.updatetime = null; } else {
      this.updatetime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.list_code = null; } else {
      this.list_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ownership_stake = null; } else {
      this.ownership_stake = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.source_flag = null; } else {
      this.source_flag = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.name_suffix = null; } else {
      this.name_suffix = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.crawledtime = null; } else {
      this.crawledtime = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.base = null; } else {
      this.base = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.legal_person_id = null; } else {
      this.legal_person_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.legal_person_name = null; } else {
      this.legal_person_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.legal_person_type = null; } else {
      this.legal_person_type = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.reg_number = null; } else {
      this.reg_number = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.company_type = null; } else {
      this.company_type = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.company_org_type = null; } else {
      this.company_org_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.reg_location = null; } else {
      this.reg_location = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.estiblish_time = null; } else {
      this.estiblish_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.from_time = null; } else {
      this.from_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.to_time = null; } else {
      this.to_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.business_scope = null; } else {
      this.business_scope = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.reg_institute = null; } else {
      this.reg_institute = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.approved_time = null; } else {
      this.approved_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.reg_status = null; } else {
      this.reg_status = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.reg_capital = null; } else {
      this.reg_capital = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.actual_capital = null; } else {
      this.actual_capital = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.org_number = null; } else {
      this.org_number = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.org_approved_institute = null; } else {
      this.org_approved_institute = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.flag = null; } else {
      this.flag = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.parent_id = null; } else {
      this.parent_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.updatetime = null; } else {
      this.updatetime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.list_code = null; } else {
      this.list_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.ownership_stake = null; } else {
      this.ownership_stake = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.source_flag = null; } else {
      this.source_flag = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.name_suffix = null; } else {
      this.name_suffix = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.crawledtime = null; } else {
      this.crawledtime = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_company o = (codegen_company) super.clone();
    o.estiblish_time = (o.estiblish_time != null) ? (java.sql.Timestamp) o.estiblish_time.clone() : null;
    o.from_time = (o.from_time != null) ? (java.sql.Timestamp) o.from_time.clone() : null;
    o.to_time = (o.to_time != null) ? (java.sql.Timestamp) o.to_time.clone() : null;
    o.approved_time = (o.approved_time != null) ? (java.sql.Timestamp) o.approved_time.clone() : null;
    o.updatetime = (o.updatetime != null) ? (java.sql.Timestamp) o.updatetime.clone() : null;
    o.crawledtime = (o.crawledtime != null) ? (java.sql.Timestamp) o.crawledtime.clone() : null;
    return o;
  }

  public void clone0(codegen_company o) throws CloneNotSupportedException {
    o.estiblish_time = (o.estiblish_time != null) ? (java.sql.Timestamp) o.estiblish_time.clone() : null;
    o.from_time = (o.from_time != null) ? (java.sql.Timestamp) o.from_time.clone() : null;
    o.to_time = (o.to_time != null) ? (java.sql.Timestamp) o.to_time.clone() : null;
    o.approved_time = (o.approved_time != null) ? (java.sql.Timestamp) o.approved_time.clone() : null;
    o.updatetime = (o.updatetime != null) ? (java.sql.Timestamp) o.updatetime.clone() : null;
    o.crawledtime = (o.crawledtime != null) ? (java.sql.Timestamp) o.crawledtime.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("base", this.base);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("legal_person_id", this.legal_person_id);
    __sqoop$field_map.put("legal_person_name", this.legal_person_name);
    __sqoop$field_map.put("legal_person_type", this.legal_person_type);
    __sqoop$field_map.put("reg_number", this.reg_number);
    __sqoop$field_map.put("company_type", this.company_type);
    __sqoop$field_map.put("company_org_type", this.company_org_type);
    __sqoop$field_map.put("reg_location", this.reg_location);
    __sqoop$field_map.put("estiblish_time", this.estiblish_time);
    __sqoop$field_map.put("from_time", this.from_time);
    __sqoop$field_map.put("to_time", this.to_time);
    __sqoop$field_map.put("business_scope", this.business_scope);
    __sqoop$field_map.put("reg_institute", this.reg_institute);
    __sqoop$field_map.put("approved_time", this.approved_time);
    __sqoop$field_map.put("reg_status", this.reg_status);
    __sqoop$field_map.put("reg_capital", this.reg_capital);
    __sqoop$field_map.put("actual_capital", this.actual_capital);
    __sqoop$field_map.put("org_number", this.org_number);
    __sqoop$field_map.put("org_approved_institute", this.org_approved_institute);
    __sqoop$field_map.put("flag", this.flag);
    __sqoop$field_map.put("parent_id", this.parent_id);
    __sqoop$field_map.put("updatetime", this.updatetime);
    __sqoop$field_map.put("list_code", this.list_code);
    __sqoop$field_map.put("ownership_stake", this.ownership_stake);
    __sqoop$field_map.put("source_flag", this.source_flag);
    __sqoop$field_map.put("name_suffix", this.name_suffix);
    __sqoop$field_map.put("property1", this.property1);
    __sqoop$field_map.put("property2", this.property2);
    __sqoop$field_map.put("property3", this.property3);
    __sqoop$field_map.put("property4", this.property4);
    __sqoop$field_map.put("property5", this.property5);
    __sqoop$field_map.put("crawledtime", this.crawledtime);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("base", this.base);
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("legal_person_id", this.legal_person_id);
    __sqoop$field_map.put("legal_person_name", this.legal_person_name);
    __sqoop$field_map.put("legal_person_type", this.legal_person_type);
    __sqoop$field_map.put("reg_number", this.reg_number);
    __sqoop$field_map.put("company_type", this.company_type);
    __sqoop$field_map.put("company_org_type", this.company_org_type);
    __sqoop$field_map.put("reg_location", this.reg_location);
    __sqoop$field_map.put("estiblish_time", this.estiblish_time);
    __sqoop$field_map.put("from_time", this.from_time);
    __sqoop$field_map.put("to_time", this.to_time);
    __sqoop$field_map.put("business_scope", this.business_scope);
    __sqoop$field_map.put("reg_institute", this.reg_institute);
    __sqoop$field_map.put("approved_time", this.approved_time);
    __sqoop$field_map.put("reg_status", this.reg_status);
    __sqoop$field_map.put("reg_capital", this.reg_capital);
    __sqoop$field_map.put("actual_capital", this.actual_capital);
    __sqoop$field_map.put("org_number", this.org_number);
    __sqoop$field_map.put("org_approved_institute", this.org_approved_institute);
    __sqoop$field_map.put("flag", this.flag);
    __sqoop$field_map.put("parent_id", this.parent_id);
    __sqoop$field_map.put("updatetime", this.updatetime);
    __sqoop$field_map.put("list_code", this.list_code);
    __sqoop$field_map.put("ownership_stake", this.ownership_stake);
    __sqoop$field_map.put("source_flag", this.source_flag);
    __sqoop$field_map.put("name_suffix", this.name_suffix);
    __sqoop$field_map.put("property1", this.property1);
    __sqoop$field_map.put("property2", this.property2);
    __sqoop$field_map.put("property3", this.property3);
    __sqoop$field_map.put("property4", this.property4);
    __sqoop$field_map.put("property5", this.property5);
    __sqoop$field_map.put("crawledtime", this.crawledtime);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
