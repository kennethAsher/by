// ORM class for table 'pg_lawyer'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu May 02 12:42:24 CST 2019
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

public class codegen_pg_lawyer extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.id = (Integer)value;
      }
    });
    setters.put("lawyer_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.lawyer_name = (String)value;
      }
    });
    setters.put("lawyer_sex", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.lawyer_sex = (String)value;
      }
    });
    setters.put("id_card_no", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.id_card_no = (String)value;
      }
    });
    setters.put("political_status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.political_status = (String)value;
      }
    });
    setters.put("birthday", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.birthday = (java.sql.Date)value;
      }
    });
    setters.put("nation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.nation = (String)value;
      }
    });
    setters.put("education", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.education = (String)value;
      }
    });
    setters.put("lawyer_license_no", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.lawyer_license_no = (String)value;
      }
    });
    setters.put("lawyer_license_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.lawyer_license_date = (java.sql.Date)value;
      }
    });
    setters.put("lawyer_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.lawyer_type = (String)value;
      }
    });
    setters.put("lawyer_state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.lawyer_state = (String)value;
      }
    });
    setters.put("cert_no", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.cert_no = (String)value;
      }
    });
    setters.put("cert_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.cert_type = (String)value;
      }
    });
    setters.put("cellphone", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.cellphone = (String)value;
      }
    });
    setters.put("telephone", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.telephone = (String)value;
      }
    });
    setters.put("email", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.email = (String)value;
      }
    });
    setters.put("addr", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.addr = (String)value;
      }
    });
    setters.put("organ_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.organ_name = (String)value;
      }
    });
    setters.put("organ_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.organ_type = (String)value;
      }
    });
    setters.put("unified_social_credit_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.unified_social_credit_code = (String)value;
      }
    });
    setters.put("person_in_charge", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.person_in_charge = (String)value;
      }
    });
    setters.put("organ_state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.organ_state = (String)value;
      }
    });
    setters.put("organ_phone", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.organ_phone = (String)value;
      }
    });
    setters.put("organ_addr", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.organ_addr = (String)value;
      }
    });
    setters.put("agency_in_charge", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.agency_in_charge = (String)value;
      }
    });
    setters.put("professional_field", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.professional_field = (String)value;
      }
    });
    setters.put("personal_profile", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.personal_profile = (String)value;
      }
    });
    setters.put("teacher", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.teacher = (String)value;
      }
    });
    setters.put("school", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.school = (String)value;
      }
    });
    setters.put("graduation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.graduation = (java.sql.Date)value;
      }
    });
    setters.put("province", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.province = (String)value;
      }
    });
    setters.put("city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.city = (String)value;
      }
    });
    setters.put("county", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.county = (String)value;
      }
    });
    setters.put("litigation_start_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.litigation_start_date = (java.sql.Date)value;
      }
    });
    setters.put("user_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.user_id = (Integer)value;
      }
    });
    setters.put("main_client", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.main_client = (String)value;
      }
    });
    setters.put("classic_case", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.classic_case = (String)value;
      }
    });
    setters.put("social_duties", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.social_duties = (String)value;
      }
    });
    setters.put("publication", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.publication = (String)value;
      }
    });
    setters.put("honor", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.honor = (String)value;
      }
    });
    setters.put("other_follow_info", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.other_follow_info = (String)value;
      }
    });
    setters.put("role_ids", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.role_ids = (String)value;
      }
    });
    setters.put("field_ids", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.field_ids = (String)value;
      }
    });
    setters.put("position", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.position = (String)value;
      }
    });
    setters.put("appellation", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.appellation = (String)value;
      }
    });
    setters.put("area", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.area = (String)value;
      }
    });
    setters.put("head_img_url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.head_img_url = (String)value;
      }
    });
    setters.put("agent_year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.agent_year = (Integer)value;
      }
    });
    setters.put("all_cnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_lawyer.this.all_cnt = (Integer)value;
      }
    });
  }
  public codegen_pg_lawyer() {
    init0();
  }
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public codegen_pg_lawyer with_id(Integer id) {
    this.id = id;
    return this;
  }
  private String lawyer_name;
  public String get_lawyer_name() {
    return lawyer_name;
  }
  public void set_lawyer_name(String lawyer_name) {
    this.lawyer_name = lawyer_name;
  }
  public codegen_pg_lawyer with_lawyer_name(String lawyer_name) {
    this.lawyer_name = lawyer_name;
    return this;
  }
  private String lawyer_sex;
  public String get_lawyer_sex() {
    return lawyer_sex;
  }
  public void set_lawyer_sex(String lawyer_sex) {
    this.lawyer_sex = lawyer_sex;
  }
  public codegen_pg_lawyer with_lawyer_sex(String lawyer_sex) {
    this.lawyer_sex = lawyer_sex;
    return this;
  }
  private String id_card_no;
  public String get_id_card_no() {
    return id_card_no;
  }
  public void set_id_card_no(String id_card_no) {
    this.id_card_no = id_card_no;
  }
  public codegen_pg_lawyer with_id_card_no(String id_card_no) {
    this.id_card_no = id_card_no;
    return this;
  }
  private String political_status;
  public String get_political_status() {
    return political_status;
  }
  public void set_political_status(String political_status) {
    this.political_status = political_status;
  }
  public codegen_pg_lawyer with_political_status(String political_status) {
    this.political_status = political_status;
    return this;
  }
  private java.sql.Date birthday;
  public java.sql.Date get_birthday() {
    return birthday;
  }
  public void set_birthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }
  public codegen_pg_lawyer with_birthday(java.sql.Date birthday) {
    this.birthday = birthday;
    return this;
  }
  private String nation;
  public String get_nation() {
    return nation;
  }
  public void set_nation(String nation) {
    this.nation = nation;
  }
  public codegen_pg_lawyer with_nation(String nation) {
    this.nation = nation;
    return this;
  }
  private String education;
  public String get_education() {
    return education;
  }
  public void set_education(String education) {
    this.education = education;
  }
  public codegen_pg_lawyer with_education(String education) {
    this.education = education;
    return this;
  }
  private String lawyer_license_no;
  public String get_lawyer_license_no() {
    return lawyer_license_no;
  }
  public void set_lawyer_license_no(String lawyer_license_no) {
    this.lawyer_license_no = lawyer_license_no;
  }
  public codegen_pg_lawyer with_lawyer_license_no(String lawyer_license_no) {
    this.lawyer_license_no = lawyer_license_no;
    return this;
  }
  private java.sql.Date lawyer_license_date;
  public java.sql.Date get_lawyer_license_date() {
    return lawyer_license_date;
  }
  public void set_lawyer_license_date(java.sql.Date lawyer_license_date) {
    this.lawyer_license_date = lawyer_license_date;
  }
  public codegen_pg_lawyer with_lawyer_license_date(java.sql.Date lawyer_license_date) {
    this.lawyer_license_date = lawyer_license_date;
    return this;
  }
  private String lawyer_type;
  public String get_lawyer_type() {
    return lawyer_type;
  }
  public void set_lawyer_type(String lawyer_type) {
    this.lawyer_type = lawyer_type;
  }
  public codegen_pg_lawyer with_lawyer_type(String lawyer_type) {
    this.lawyer_type = lawyer_type;
    return this;
  }
  private String lawyer_state;
  public String get_lawyer_state() {
    return lawyer_state;
  }
  public void set_lawyer_state(String lawyer_state) {
    this.lawyer_state = lawyer_state;
  }
  public codegen_pg_lawyer with_lawyer_state(String lawyer_state) {
    this.lawyer_state = lawyer_state;
    return this;
  }
  private String cert_no;
  public String get_cert_no() {
    return cert_no;
  }
  public void set_cert_no(String cert_no) {
    this.cert_no = cert_no;
  }
  public codegen_pg_lawyer with_cert_no(String cert_no) {
    this.cert_no = cert_no;
    return this;
  }
  private String cert_type;
  public String get_cert_type() {
    return cert_type;
  }
  public void set_cert_type(String cert_type) {
    this.cert_type = cert_type;
  }
  public codegen_pg_lawyer with_cert_type(String cert_type) {
    this.cert_type = cert_type;
    return this;
  }
  private String cellphone;
  public String get_cellphone() {
    return cellphone;
  }
  public void set_cellphone(String cellphone) {
    this.cellphone = cellphone;
  }
  public codegen_pg_lawyer with_cellphone(String cellphone) {
    this.cellphone = cellphone;
    return this;
  }
  private String telephone;
  public String get_telephone() {
    return telephone;
  }
  public void set_telephone(String telephone) {
    this.telephone = telephone;
  }
  public codegen_pg_lawyer with_telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }
  private String email;
  public String get_email() {
    return email;
  }
  public void set_email(String email) {
    this.email = email;
  }
  public codegen_pg_lawyer with_email(String email) {
    this.email = email;
    return this;
  }
  private String addr;
  public String get_addr() {
    return addr;
  }
  public void set_addr(String addr) {
    this.addr = addr;
  }
  public codegen_pg_lawyer with_addr(String addr) {
    this.addr = addr;
    return this;
  }
  private String organ_name;
  public String get_organ_name() {
    return organ_name;
  }
  public void set_organ_name(String organ_name) {
    this.organ_name = organ_name;
  }
  public codegen_pg_lawyer with_organ_name(String organ_name) {
    this.organ_name = organ_name;
    return this;
  }
  private String organ_type;
  public String get_organ_type() {
    return organ_type;
  }
  public void set_organ_type(String organ_type) {
    this.organ_type = organ_type;
  }
  public codegen_pg_lawyer with_organ_type(String organ_type) {
    this.organ_type = organ_type;
    return this;
  }
  private String unified_social_credit_code;
  public String get_unified_social_credit_code() {
    return unified_social_credit_code;
  }
  public void set_unified_social_credit_code(String unified_social_credit_code) {
    this.unified_social_credit_code = unified_social_credit_code;
  }
  public codegen_pg_lawyer with_unified_social_credit_code(String unified_social_credit_code) {
    this.unified_social_credit_code = unified_social_credit_code;
    return this;
  }
  private String person_in_charge;
  public String get_person_in_charge() {
    return person_in_charge;
  }
  public void set_person_in_charge(String person_in_charge) {
    this.person_in_charge = person_in_charge;
  }
  public codegen_pg_lawyer with_person_in_charge(String person_in_charge) {
    this.person_in_charge = person_in_charge;
    return this;
  }
  private String organ_state;
  public String get_organ_state() {
    return organ_state;
  }
  public void set_organ_state(String organ_state) {
    this.organ_state = organ_state;
  }
  public codegen_pg_lawyer with_organ_state(String organ_state) {
    this.organ_state = organ_state;
    return this;
  }
  private String organ_phone;
  public String get_organ_phone() {
    return organ_phone;
  }
  public void set_organ_phone(String organ_phone) {
    this.organ_phone = organ_phone;
  }
  public codegen_pg_lawyer with_organ_phone(String organ_phone) {
    this.organ_phone = organ_phone;
    return this;
  }
  private String organ_addr;
  public String get_organ_addr() {
    return organ_addr;
  }
  public void set_organ_addr(String organ_addr) {
    this.organ_addr = organ_addr;
  }
  public codegen_pg_lawyer with_organ_addr(String organ_addr) {
    this.organ_addr = organ_addr;
    return this;
  }
  private String agency_in_charge;
  public String get_agency_in_charge() {
    return agency_in_charge;
  }
  public void set_agency_in_charge(String agency_in_charge) {
    this.agency_in_charge = agency_in_charge;
  }
  public codegen_pg_lawyer with_agency_in_charge(String agency_in_charge) {
    this.agency_in_charge = agency_in_charge;
    return this;
  }
  private String professional_field;
  public String get_professional_field() {
    return professional_field;
  }
  public void set_professional_field(String professional_field) {
    this.professional_field = professional_field;
  }
  public codegen_pg_lawyer with_professional_field(String professional_field) {
    this.professional_field = professional_field;
    return this;
  }
  private String personal_profile;
  public String get_personal_profile() {
    return personal_profile;
  }
  public void set_personal_profile(String personal_profile) {
    this.personal_profile = personal_profile;
  }
  public codegen_pg_lawyer with_personal_profile(String personal_profile) {
    this.personal_profile = personal_profile;
    return this;
  }
  private String teacher;
  public String get_teacher() {
    return teacher;
  }
  public void set_teacher(String teacher) {
    this.teacher = teacher;
  }
  public codegen_pg_lawyer with_teacher(String teacher) {
    this.teacher = teacher;
    return this;
  }
  private String school;
  public String get_school() {
    return school;
  }
  public void set_school(String school) {
    this.school = school;
  }
  public codegen_pg_lawyer with_school(String school) {
    this.school = school;
    return this;
  }
  private java.sql.Date graduation;
  public java.sql.Date get_graduation() {
    return graduation;
  }
  public void set_graduation(java.sql.Date graduation) {
    this.graduation = graduation;
  }
  public codegen_pg_lawyer with_graduation(java.sql.Date graduation) {
    this.graduation = graduation;
    return this;
  }
  private String province;
  public String get_province() {
    return province;
  }
  public void set_province(String province) {
    this.province = province;
  }
  public codegen_pg_lawyer with_province(String province) {
    this.province = province;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public codegen_pg_lawyer with_city(String city) {
    this.city = city;
    return this;
  }
  private String county;
  public String get_county() {
    return county;
  }
  public void set_county(String county) {
    this.county = county;
  }
  public codegen_pg_lawyer with_county(String county) {
    this.county = county;
    return this;
  }
  private java.sql.Date litigation_start_date;
  public java.sql.Date get_litigation_start_date() {
    return litigation_start_date;
  }
  public void set_litigation_start_date(java.sql.Date litigation_start_date) {
    this.litigation_start_date = litigation_start_date;
  }
  public codegen_pg_lawyer with_litigation_start_date(java.sql.Date litigation_start_date) {
    this.litigation_start_date = litigation_start_date;
    return this;
  }
  private Integer user_id;
  public Integer get_user_id() {
    return user_id;
  }
  public void set_user_id(Integer user_id) {
    this.user_id = user_id;
  }
  public codegen_pg_lawyer with_user_id(Integer user_id) {
    this.user_id = user_id;
    return this;
  }
  private String main_client;
  public String get_main_client() {
    return main_client;
  }
  public void set_main_client(String main_client) {
    this.main_client = main_client;
  }
  public codegen_pg_lawyer with_main_client(String main_client) {
    this.main_client = main_client;
    return this;
  }
  private String classic_case;
  public String get_classic_case() {
    return classic_case;
  }
  public void set_classic_case(String classic_case) {
    this.classic_case = classic_case;
  }
  public codegen_pg_lawyer with_classic_case(String classic_case) {
    this.classic_case = classic_case;
    return this;
  }
  private String social_duties;
  public String get_social_duties() {
    return social_duties;
  }
  public void set_social_duties(String social_duties) {
    this.social_duties = social_duties;
  }
  public codegen_pg_lawyer with_social_duties(String social_duties) {
    this.social_duties = social_duties;
    return this;
  }
  private String publication;
  public String get_publication() {
    return publication;
  }
  public void set_publication(String publication) {
    this.publication = publication;
  }
  public codegen_pg_lawyer with_publication(String publication) {
    this.publication = publication;
    return this;
  }
  private String honor;
  public String get_honor() {
    return honor;
  }
  public void set_honor(String honor) {
    this.honor = honor;
  }
  public codegen_pg_lawyer with_honor(String honor) {
    this.honor = honor;
    return this;
  }
  private String other_follow_info;
  public String get_other_follow_info() {
    return other_follow_info;
  }
  public void set_other_follow_info(String other_follow_info) {
    this.other_follow_info = other_follow_info;
  }
  public codegen_pg_lawyer with_other_follow_info(String other_follow_info) {
    this.other_follow_info = other_follow_info;
    return this;
  }
  private String role_ids;
  public String get_role_ids() {
    return role_ids;
  }
  public void set_role_ids(String role_ids) {
    this.role_ids = role_ids;
  }
  public codegen_pg_lawyer with_role_ids(String role_ids) {
    this.role_ids = role_ids;
    return this;
  }
  private String field_ids;
  public String get_field_ids() {
    return field_ids;
  }
  public void set_field_ids(String field_ids) {
    this.field_ids = field_ids;
  }
  public codegen_pg_lawyer with_field_ids(String field_ids) {
    this.field_ids = field_ids;
    return this;
  }
  private String position;
  public String get_position() {
    return position;
  }
  public void set_position(String position) {
    this.position = position;
  }
  public codegen_pg_lawyer with_position(String position) {
    this.position = position;
    return this;
  }
  private String appellation;
  public String get_appellation() {
    return appellation;
  }
  public void set_appellation(String appellation) {
    this.appellation = appellation;
  }
  public codegen_pg_lawyer with_appellation(String appellation) {
    this.appellation = appellation;
    return this;
  }
  private String area;
  public String get_area() {
    return area;
  }
  public void set_area(String area) {
    this.area = area;
  }
  public codegen_pg_lawyer with_area(String area) {
    this.area = area;
    return this;
  }
  private String head_img_url;
  public String get_head_img_url() {
    return head_img_url;
  }
  public void set_head_img_url(String head_img_url) {
    this.head_img_url = head_img_url;
  }
  public codegen_pg_lawyer with_head_img_url(String head_img_url) {
    this.head_img_url = head_img_url;
    return this;
  }
  private Integer agent_year;
  public Integer get_agent_year() {
    return agent_year;
  }
  public void set_agent_year(Integer agent_year) {
    this.agent_year = agent_year;
  }
  public codegen_pg_lawyer with_agent_year(Integer agent_year) {
    this.agent_year = agent_year;
    return this;
  }
  private Integer all_cnt;
  public Integer get_all_cnt() {
    return all_cnt;
  }
  public void set_all_cnt(Integer all_cnt) {
    this.all_cnt = all_cnt;
  }
  public codegen_pg_lawyer with_all_cnt(Integer all_cnt) {
    this.all_cnt = all_cnt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_pg_lawyer)) {
      return false;
    }
    codegen_pg_lawyer that = (codegen_pg_lawyer) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.lawyer_name == null ? that.lawyer_name == null : this.lawyer_name.equals(that.lawyer_name));
    equal = equal && (this.lawyer_sex == null ? that.lawyer_sex == null : this.lawyer_sex.equals(that.lawyer_sex));
    equal = equal && (this.id_card_no == null ? that.id_card_no == null : this.id_card_no.equals(that.id_card_no));
    equal = equal && (this.political_status == null ? that.political_status == null : this.political_status.equals(that.political_status));
    equal = equal && (this.birthday == null ? that.birthday == null : this.birthday.equals(that.birthday));
    equal = equal && (this.nation == null ? that.nation == null : this.nation.equals(that.nation));
    equal = equal && (this.education == null ? that.education == null : this.education.equals(that.education));
    equal = equal && (this.lawyer_license_no == null ? that.lawyer_license_no == null : this.lawyer_license_no.equals(that.lawyer_license_no));
    equal = equal && (this.lawyer_license_date == null ? that.lawyer_license_date == null : this.lawyer_license_date.equals(that.lawyer_license_date));
    equal = equal && (this.lawyer_type == null ? that.lawyer_type == null : this.lawyer_type.equals(that.lawyer_type));
    equal = equal && (this.lawyer_state == null ? that.lawyer_state == null : this.lawyer_state.equals(that.lawyer_state));
    equal = equal && (this.cert_no == null ? that.cert_no == null : this.cert_no.equals(that.cert_no));
    equal = equal && (this.cert_type == null ? that.cert_type == null : this.cert_type.equals(that.cert_type));
    equal = equal && (this.cellphone == null ? that.cellphone == null : this.cellphone.equals(that.cellphone));
    equal = equal && (this.telephone == null ? that.telephone == null : this.telephone.equals(that.telephone));
    equal = equal && (this.email == null ? that.email == null : this.email.equals(that.email));
    equal = equal && (this.addr == null ? that.addr == null : this.addr.equals(that.addr));
    equal = equal && (this.organ_name == null ? that.organ_name == null : this.organ_name.equals(that.organ_name));
    equal = equal && (this.organ_type == null ? that.organ_type == null : this.organ_type.equals(that.organ_type));
    equal = equal && (this.unified_social_credit_code == null ? that.unified_social_credit_code == null : this.unified_social_credit_code.equals(that.unified_social_credit_code));
    equal = equal && (this.person_in_charge == null ? that.person_in_charge == null : this.person_in_charge.equals(that.person_in_charge));
    equal = equal && (this.organ_state == null ? that.organ_state == null : this.organ_state.equals(that.organ_state));
    equal = equal && (this.organ_phone == null ? that.organ_phone == null : this.organ_phone.equals(that.organ_phone));
    equal = equal && (this.organ_addr == null ? that.organ_addr == null : this.organ_addr.equals(that.organ_addr));
    equal = equal && (this.agency_in_charge == null ? that.agency_in_charge == null : this.agency_in_charge.equals(that.agency_in_charge));
    equal = equal && (this.professional_field == null ? that.professional_field == null : this.professional_field.equals(that.professional_field));
    equal = equal && (this.personal_profile == null ? that.personal_profile == null : this.personal_profile.equals(that.personal_profile));
    equal = equal && (this.teacher == null ? that.teacher == null : this.teacher.equals(that.teacher));
    equal = equal && (this.school == null ? that.school == null : this.school.equals(that.school));
    equal = equal && (this.graduation == null ? that.graduation == null : this.graduation.equals(that.graduation));
    equal = equal && (this.province == null ? that.province == null : this.province.equals(that.province));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.county == null ? that.county == null : this.county.equals(that.county));
    equal = equal && (this.litigation_start_date == null ? that.litigation_start_date == null : this.litigation_start_date.equals(that.litigation_start_date));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.main_client == null ? that.main_client == null : this.main_client.equals(that.main_client));
    equal = equal && (this.classic_case == null ? that.classic_case == null : this.classic_case.equals(that.classic_case));
    equal = equal && (this.social_duties == null ? that.social_duties == null : this.social_duties.equals(that.social_duties));
    equal = equal && (this.publication == null ? that.publication == null : this.publication.equals(that.publication));
    equal = equal && (this.honor == null ? that.honor == null : this.honor.equals(that.honor));
    equal = equal && (this.other_follow_info == null ? that.other_follow_info == null : this.other_follow_info.equals(that.other_follow_info));
    equal = equal && (this.role_ids == null ? that.role_ids == null : this.role_ids.equals(that.role_ids));
    equal = equal && (this.field_ids == null ? that.field_ids == null : this.field_ids.equals(that.field_ids));
    equal = equal && (this.position == null ? that.position == null : this.position.equals(that.position));
    equal = equal && (this.appellation == null ? that.appellation == null : this.appellation.equals(that.appellation));
    equal = equal && (this.area == null ? that.area == null : this.area.equals(that.area));
    equal = equal && (this.head_img_url == null ? that.head_img_url == null : this.head_img_url.equals(that.head_img_url));
    equal = equal && (this.agent_year == null ? that.agent_year == null : this.agent_year.equals(that.agent_year));
    equal = equal && (this.all_cnt == null ? that.all_cnt == null : this.all_cnt.equals(that.all_cnt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_pg_lawyer)) {
      return false;
    }
    codegen_pg_lawyer that = (codegen_pg_lawyer) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.lawyer_name == null ? that.lawyer_name == null : this.lawyer_name.equals(that.lawyer_name));
    equal = equal && (this.lawyer_sex == null ? that.lawyer_sex == null : this.lawyer_sex.equals(that.lawyer_sex));
    equal = equal && (this.id_card_no == null ? that.id_card_no == null : this.id_card_no.equals(that.id_card_no));
    equal = equal && (this.political_status == null ? that.political_status == null : this.political_status.equals(that.political_status));
    equal = equal && (this.birthday == null ? that.birthday == null : this.birthday.equals(that.birthday));
    equal = equal && (this.nation == null ? that.nation == null : this.nation.equals(that.nation));
    equal = equal && (this.education == null ? that.education == null : this.education.equals(that.education));
    equal = equal && (this.lawyer_license_no == null ? that.lawyer_license_no == null : this.lawyer_license_no.equals(that.lawyer_license_no));
    equal = equal && (this.lawyer_license_date == null ? that.lawyer_license_date == null : this.lawyer_license_date.equals(that.lawyer_license_date));
    equal = equal && (this.lawyer_type == null ? that.lawyer_type == null : this.lawyer_type.equals(that.lawyer_type));
    equal = equal && (this.lawyer_state == null ? that.lawyer_state == null : this.lawyer_state.equals(that.lawyer_state));
    equal = equal && (this.cert_no == null ? that.cert_no == null : this.cert_no.equals(that.cert_no));
    equal = equal && (this.cert_type == null ? that.cert_type == null : this.cert_type.equals(that.cert_type));
    equal = equal && (this.cellphone == null ? that.cellphone == null : this.cellphone.equals(that.cellphone));
    equal = equal && (this.telephone == null ? that.telephone == null : this.telephone.equals(that.telephone));
    equal = equal && (this.email == null ? that.email == null : this.email.equals(that.email));
    equal = equal && (this.addr == null ? that.addr == null : this.addr.equals(that.addr));
    equal = equal && (this.organ_name == null ? that.organ_name == null : this.organ_name.equals(that.organ_name));
    equal = equal && (this.organ_type == null ? that.organ_type == null : this.organ_type.equals(that.organ_type));
    equal = equal && (this.unified_social_credit_code == null ? that.unified_social_credit_code == null : this.unified_social_credit_code.equals(that.unified_social_credit_code));
    equal = equal && (this.person_in_charge == null ? that.person_in_charge == null : this.person_in_charge.equals(that.person_in_charge));
    equal = equal && (this.organ_state == null ? that.organ_state == null : this.organ_state.equals(that.organ_state));
    equal = equal && (this.organ_phone == null ? that.organ_phone == null : this.organ_phone.equals(that.organ_phone));
    equal = equal && (this.organ_addr == null ? that.organ_addr == null : this.organ_addr.equals(that.organ_addr));
    equal = equal && (this.agency_in_charge == null ? that.agency_in_charge == null : this.agency_in_charge.equals(that.agency_in_charge));
    equal = equal && (this.professional_field == null ? that.professional_field == null : this.professional_field.equals(that.professional_field));
    equal = equal && (this.personal_profile == null ? that.personal_profile == null : this.personal_profile.equals(that.personal_profile));
    equal = equal && (this.teacher == null ? that.teacher == null : this.teacher.equals(that.teacher));
    equal = equal && (this.school == null ? that.school == null : this.school.equals(that.school));
    equal = equal && (this.graduation == null ? that.graduation == null : this.graduation.equals(that.graduation));
    equal = equal && (this.province == null ? that.province == null : this.province.equals(that.province));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.county == null ? that.county == null : this.county.equals(that.county));
    equal = equal && (this.litigation_start_date == null ? that.litigation_start_date == null : this.litigation_start_date.equals(that.litigation_start_date));
    equal = equal && (this.user_id == null ? that.user_id == null : this.user_id.equals(that.user_id));
    equal = equal && (this.main_client == null ? that.main_client == null : this.main_client.equals(that.main_client));
    equal = equal && (this.classic_case == null ? that.classic_case == null : this.classic_case.equals(that.classic_case));
    equal = equal && (this.social_duties == null ? that.social_duties == null : this.social_duties.equals(that.social_duties));
    equal = equal && (this.publication == null ? that.publication == null : this.publication.equals(that.publication));
    equal = equal && (this.honor == null ? that.honor == null : this.honor.equals(that.honor));
    equal = equal && (this.other_follow_info == null ? that.other_follow_info == null : this.other_follow_info.equals(that.other_follow_info));
    equal = equal && (this.role_ids == null ? that.role_ids == null : this.role_ids.equals(that.role_ids));
    equal = equal && (this.field_ids == null ? that.field_ids == null : this.field_ids.equals(that.field_ids));
    equal = equal && (this.position == null ? that.position == null : this.position.equals(that.position));
    equal = equal && (this.appellation == null ? that.appellation == null : this.appellation.equals(that.appellation));
    equal = equal && (this.area == null ? that.area == null : this.area.equals(that.area));
    equal = equal && (this.head_img_url == null ? that.head_img_url == null : this.head_img_url.equals(that.head_img_url));
    equal = equal && (this.agent_year == null ? that.agent_year == null : this.agent_year.equals(that.agent_year));
    equal = equal && (this.all_cnt == null ? that.all_cnt == null : this.all_cnt.equals(that.all_cnt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.lawyer_name = JdbcWritableBridge.readString(2, __dbResults);
    this.lawyer_sex = JdbcWritableBridge.readString(3, __dbResults);
    this.id_card_no = JdbcWritableBridge.readString(4, __dbResults);
    this.political_status = JdbcWritableBridge.readString(5, __dbResults);
    this.birthday = JdbcWritableBridge.readDate(6, __dbResults);
    this.nation = JdbcWritableBridge.readString(7, __dbResults);
    this.education = JdbcWritableBridge.readString(8, __dbResults);
    this.lawyer_license_no = JdbcWritableBridge.readString(9, __dbResults);
    this.lawyer_license_date = JdbcWritableBridge.readDate(10, __dbResults);
    this.lawyer_type = JdbcWritableBridge.readString(11, __dbResults);
    this.lawyer_state = JdbcWritableBridge.readString(12, __dbResults);
    this.cert_no = JdbcWritableBridge.readString(13, __dbResults);
    this.cert_type = JdbcWritableBridge.readString(14, __dbResults);
    this.cellphone = JdbcWritableBridge.readString(15, __dbResults);
    this.telephone = JdbcWritableBridge.readString(16, __dbResults);
    this.email = JdbcWritableBridge.readString(17, __dbResults);
    this.addr = JdbcWritableBridge.readString(18, __dbResults);
    this.organ_name = JdbcWritableBridge.readString(19, __dbResults);
    this.organ_type = JdbcWritableBridge.readString(20, __dbResults);
    this.unified_social_credit_code = JdbcWritableBridge.readString(21, __dbResults);
    this.person_in_charge = JdbcWritableBridge.readString(22, __dbResults);
    this.organ_state = JdbcWritableBridge.readString(23, __dbResults);
    this.organ_phone = JdbcWritableBridge.readString(24, __dbResults);
    this.organ_addr = JdbcWritableBridge.readString(25, __dbResults);
    this.agency_in_charge = JdbcWritableBridge.readString(26, __dbResults);
    this.professional_field = JdbcWritableBridge.readString(27, __dbResults);
    this.personal_profile = JdbcWritableBridge.readString(28, __dbResults);
    this.teacher = JdbcWritableBridge.readString(29, __dbResults);
    this.school = JdbcWritableBridge.readString(30, __dbResults);
    this.graduation = JdbcWritableBridge.readDate(31, __dbResults);
    this.province = JdbcWritableBridge.readString(32, __dbResults);
    this.city = JdbcWritableBridge.readString(33, __dbResults);
    this.county = JdbcWritableBridge.readString(34, __dbResults);
    this.litigation_start_date = JdbcWritableBridge.readDate(35, __dbResults);
    this.user_id = JdbcWritableBridge.readInteger(36, __dbResults);
    this.main_client = JdbcWritableBridge.readString(37, __dbResults);
    this.classic_case = JdbcWritableBridge.readString(38, __dbResults);
    this.social_duties = JdbcWritableBridge.readString(39, __dbResults);
    this.publication = JdbcWritableBridge.readString(40, __dbResults);
    this.honor = JdbcWritableBridge.readString(41, __dbResults);
    this.other_follow_info = JdbcWritableBridge.readString(42, __dbResults);
    this.role_ids = JdbcWritableBridge.readString(43, __dbResults);
    this.field_ids = JdbcWritableBridge.readString(44, __dbResults);
    this.position = JdbcWritableBridge.readString(45, __dbResults);
    this.appellation = JdbcWritableBridge.readString(46, __dbResults);
    this.area = JdbcWritableBridge.readString(47, __dbResults);
    this.head_img_url = JdbcWritableBridge.readString(48, __dbResults);
    this.agent_year = JdbcWritableBridge.readInteger(49, __dbResults);
    this.all_cnt = JdbcWritableBridge.readInteger(50, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.lawyer_name = JdbcWritableBridge.readString(2, __dbResults);
    this.lawyer_sex = JdbcWritableBridge.readString(3, __dbResults);
    this.id_card_no = JdbcWritableBridge.readString(4, __dbResults);
    this.political_status = JdbcWritableBridge.readString(5, __dbResults);
    this.birthday = JdbcWritableBridge.readDate(6, __dbResults);
    this.nation = JdbcWritableBridge.readString(7, __dbResults);
    this.education = JdbcWritableBridge.readString(8, __dbResults);
    this.lawyer_license_no = JdbcWritableBridge.readString(9, __dbResults);
    this.lawyer_license_date = JdbcWritableBridge.readDate(10, __dbResults);
    this.lawyer_type = JdbcWritableBridge.readString(11, __dbResults);
    this.lawyer_state = JdbcWritableBridge.readString(12, __dbResults);
    this.cert_no = JdbcWritableBridge.readString(13, __dbResults);
    this.cert_type = JdbcWritableBridge.readString(14, __dbResults);
    this.cellphone = JdbcWritableBridge.readString(15, __dbResults);
    this.telephone = JdbcWritableBridge.readString(16, __dbResults);
    this.email = JdbcWritableBridge.readString(17, __dbResults);
    this.addr = JdbcWritableBridge.readString(18, __dbResults);
    this.organ_name = JdbcWritableBridge.readString(19, __dbResults);
    this.organ_type = JdbcWritableBridge.readString(20, __dbResults);
    this.unified_social_credit_code = JdbcWritableBridge.readString(21, __dbResults);
    this.person_in_charge = JdbcWritableBridge.readString(22, __dbResults);
    this.organ_state = JdbcWritableBridge.readString(23, __dbResults);
    this.organ_phone = JdbcWritableBridge.readString(24, __dbResults);
    this.organ_addr = JdbcWritableBridge.readString(25, __dbResults);
    this.agency_in_charge = JdbcWritableBridge.readString(26, __dbResults);
    this.professional_field = JdbcWritableBridge.readString(27, __dbResults);
    this.personal_profile = JdbcWritableBridge.readString(28, __dbResults);
    this.teacher = JdbcWritableBridge.readString(29, __dbResults);
    this.school = JdbcWritableBridge.readString(30, __dbResults);
    this.graduation = JdbcWritableBridge.readDate(31, __dbResults);
    this.province = JdbcWritableBridge.readString(32, __dbResults);
    this.city = JdbcWritableBridge.readString(33, __dbResults);
    this.county = JdbcWritableBridge.readString(34, __dbResults);
    this.litigation_start_date = JdbcWritableBridge.readDate(35, __dbResults);
    this.user_id = JdbcWritableBridge.readInteger(36, __dbResults);
    this.main_client = JdbcWritableBridge.readString(37, __dbResults);
    this.classic_case = JdbcWritableBridge.readString(38, __dbResults);
    this.social_duties = JdbcWritableBridge.readString(39, __dbResults);
    this.publication = JdbcWritableBridge.readString(40, __dbResults);
    this.honor = JdbcWritableBridge.readString(41, __dbResults);
    this.other_follow_info = JdbcWritableBridge.readString(42, __dbResults);
    this.role_ids = JdbcWritableBridge.readString(43, __dbResults);
    this.field_ids = JdbcWritableBridge.readString(44, __dbResults);
    this.position = JdbcWritableBridge.readString(45, __dbResults);
    this.appellation = JdbcWritableBridge.readString(46, __dbResults);
    this.area = JdbcWritableBridge.readString(47, __dbResults);
    this.head_img_url = JdbcWritableBridge.readString(48, __dbResults);
    this.agent_year = JdbcWritableBridge.readInteger(49, __dbResults);
    this.all_cnt = JdbcWritableBridge.readInteger(50, __dbResults);
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
    JdbcWritableBridge.writeString(lawyer_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(lawyer_sex, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(id_card_no, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(political_status, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(birthday, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(nation, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(education, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(lawyer_license_no, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(lawyer_license_date, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(lawyer_type, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(lawyer_state, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cert_no, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cert_type, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cellphone, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(telephone, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(email, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(addr, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(organ_name, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(organ_type, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(unified_social_credit_code, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(person_in_charge, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(organ_state, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(organ_phone, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(organ_addr, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(agency_in_charge, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(professional_field, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(personal_profile, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(teacher, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(school, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(graduation, 31 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(province, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(county, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(litigation_start_date, 35 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(user_id, 36 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(main_client, 37 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(classic_case, 38 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(social_duties, 39 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(publication, 40 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(honor, 41 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(other_follow_info, 42 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(role_ids, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(field_ids, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(position, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(appellation, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(area, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(head_img_url, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(agent_year, 49 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(all_cnt, 50 + __off, 4, __dbStmt);
    return 50;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(lawyer_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(lawyer_sex, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(id_card_no, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(political_status, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(birthday, 6 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(nation, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(education, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(lawyer_license_no, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(lawyer_license_date, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(lawyer_type, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(lawyer_state, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cert_no, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cert_type, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cellphone, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(telephone, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(email, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(addr, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(organ_name, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(organ_type, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(unified_social_credit_code, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(person_in_charge, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(organ_state, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(organ_phone, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(organ_addr, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(agency_in_charge, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(professional_field, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(personal_profile, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(teacher, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(school, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(graduation, 31 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(province, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 33 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(county, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(litigation_start_date, 35 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeInteger(user_id, 36 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(main_client, 37 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(classic_case, 38 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(social_duties, 39 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(publication, 40 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(honor, 41 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(other_follow_info, 42 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(role_ids, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(field_ids, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(position, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(appellation, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(area, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(head_img_url, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(agent_year, 49 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(all_cnt, 50 + __off, 4, __dbStmt);
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
        this.lawyer_name = null;
    } else {
    this.lawyer_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lawyer_sex = null;
    } else {
    this.lawyer_sex = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.id_card_no = null;
    } else {
    this.id_card_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.political_status = null;
    } else {
    this.political_status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.birthday = null;
    } else {
    this.birthday = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.nation = null;
    } else {
    this.nation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.education = null;
    } else {
    this.education = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lawyer_license_no = null;
    } else {
    this.lawyer_license_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lawyer_license_date = null;
    } else {
    this.lawyer_license_date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.lawyer_type = null;
    } else {
    this.lawyer_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lawyer_state = null;
    } else {
    this.lawyer_state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cert_no = null;
    } else {
    this.cert_no = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cert_type = null;
    } else {
    this.cert_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cellphone = null;
    } else {
    this.cellphone = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.telephone = null;
    } else {
    this.telephone = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.email = null;
    } else {
    this.email = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.addr = null;
    } else {
    this.addr = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.organ_name = null;
    } else {
    this.organ_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.organ_type = null;
    } else {
    this.organ_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.unified_social_credit_code = null;
    } else {
    this.unified_social_credit_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.person_in_charge = null;
    } else {
    this.person_in_charge = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.organ_state = null;
    } else {
    this.organ_state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.organ_phone = null;
    } else {
    this.organ_phone = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.organ_addr = null;
    } else {
    this.organ_addr = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.agency_in_charge = null;
    } else {
    this.agency_in_charge = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.professional_field = null;
    } else {
    this.professional_field = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.personal_profile = null;
    } else {
    this.personal_profile = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.teacher = null;
    } else {
    this.teacher = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.school = null;
    } else {
    this.school = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.graduation = null;
    } else {
    this.graduation = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.province = null;
    } else {
    this.province = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city = null;
    } else {
    this.city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.county = null;
    } else {
    this.county = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.litigation_start_date = null;
    } else {
    this.litigation_start_date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.user_id = null;
    } else {
    this.user_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.main_client = null;
    } else {
    this.main_client = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.classic_case = null;
    } else {
    this.classic_case = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.social_duties = null;
    } else {
    this.social_duties = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.publication = null;
    } else {
    this.publication = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.honor = null;
    } else {
    this.honor = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.other_follow_info = null;
    } else {
    this.other_follow_info = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.role_ids = null;
    } else {
    this.role_ids = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.field_ids = null;
    } else {
    this.field_ids = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.position = null;
    } else {
    this.position = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.appellation = null;
    } else {
    this.appellation = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.area = null;
    } else {
    this.area = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.head_img_url = null;
    } else {
    this.head_img_url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.agent_year = null;
    } else {
    this.agent_year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.all_cnt = null;
    } else {
    this.all_cnt = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.lawyer_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lawyer_name);
    }
    if (null == this.lawyer_sex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lawyer_sex);
    }
    if (null == this.id_card_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_card_no);
    }
    if (null == this.political_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, political_status);
    }
    if (null == this.birthday) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.birthday.getTime());
    }
    if (null == this.nation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nation);
    }
    if (null == this.education) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, education);
    }
    if (null == this.lawyer_license_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lawyer_license_no);
    }
    if (null == this.lawyer_license_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.lawyer_license_date.getTime());
    }
    if (null == this.lawyer_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lawyer_type);
    }
    if (null == this.lawyer_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lawyer_state);
    }
    if (null == this.cert_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cert_no);
    }
    if (null == this.cert_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cert_type);
    }
    if (null == this.cellphone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cellphone);
    }
    if (null == this.telephone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, telephone);
    }
    if (null == this.email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, email);
    }
    if (null == this.addr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, addr);
    }
    if (null == this.organ_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, organ_name);
    }
    if (null == this.organ_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, organ_type);
    }
    if (null == this.unified_social_credit_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, unified_social_credit_code);
    }
    if (null == this.person_in_charge) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, person_in_charge);
    }
    if (null == this.organ_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, organ_state);
    }
    if (null == this.organ_phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, organ_phone);
    }
    if (null == this.organ_addr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, organ_addr);
    }
    if (null == this.agency_in_charge) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, agency_in_charge);
    }
    if (null == this.professional_field) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, professional_field);
    }
    if (null == this.personal_profile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, personal_profile);
    }
    if (null == this.teacher) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, teacher);
    }
    if (null == this.school) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, school);
    }
    if (null == this.graduation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.graduation.getTime());
    }
    if (null == this.province) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.county) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, county);
    }
    if (null == this.litigation_start_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.litigation_start_date.getTime());
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.main_client) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, main_client);
    }
    if (null == this.classic_case) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, classic_case);
    }
    if (null == this.social_duties) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, social_duties);
    }
    if (null == this.publication) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, publication);
    }
    if (null == this.honor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, honor);
    }
    if (null == this.other_follow_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_follow_info);
    }
    if (null == this.role_ids) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, role_ids);
    }
    if (null == this.field_ids) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, field_ids);
    }
    if (null == this.position) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, position);
    }
    if (null == this.appellation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, appellation);
    }
    if (null == this.area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, area);
    }
    if (null == this.head_img_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, head_img_url);
    }
    if (null == this.agent_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.agent_year);
    }
    if (null == this.all_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.all_cnt);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.lawyer_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lawyer_name);
    }
    if (null == this.lawyer_sex) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lawyer_sex);
    }
    if (null == this.id_card_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_card_no);
    }
    if (null == this.political_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, political_status);
    }
    if (null == this.birthday) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.birthday.getTime());
    }
    if (null == this.nation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, nation);
    }
    if (null == this.education) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, education);
    }
    if (null == this.lawyer_license_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lawyer_license_no);
    }
    if (null == this.lawyer_license_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.lawyer_license_date.getTime());
    }
    if (null == this.lawyer_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lawyer_type);
    }
    if (null == this.lawyer_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lawyer_state);
    }
    if (null == this.cert_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cert_no);
    }
    if (null == this.cert_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cert_type);
    }
    if (null == this.cellphone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cellphone);
    }
    if (null == this.telephone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, telephone);
    }
    if (null == this.email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, email);
    }
    if (null == this.addr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, addr);
    }
    if (null == this.organ_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, organ_name);
    }
    if (null == this.organ_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, organ_type);
    }
    if (null == this.unified_social_credit_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, unified_social_credit_code);
    }
    if (null == this.person_in_charge) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, person_in_charge);
    }
    if (null == this.organ_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, organ_state);
    }
    if (null == this.organ_phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, organ_phone);
    }
    if (null == this.organ_addr) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, organ_addr);
    }
    if (null == this.agency_in_charge) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, agency_in_charge);
    }
    if (null == this.professional_field) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, professional_field);
    }
    if (null == this.personal_profile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, personal_profile);
    }
    if (null == this.teacher) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, teacher);
    }
    if (null == this.school) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, school);
    }
    if (null == this.graduation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.graduation.getTime());
    }
    if (null == this.province) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, province);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.county) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, county);
    }
    if (null == this.litigation_start_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.litigation_start_date.getTime());
    }
    if (null == this.user_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.user_id);
    }
    if (null == this.main_client) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, main_client);
    }
    if (null == this.classic_case) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, classic_case);
    }
    if (null == this.social_duties) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, social_duties);
    }
    if (null == this.publication) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, publication);
    }
    if (null == this.honor) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, honor);
    }
    if (null == this.other_follow_info) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, other_follow_info);
    }
    if (null == this.role_ids) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, role_ids);
    }
    if (null == this.field_ids) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, field_ids);
    }
    if (null == this.position) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, position);
    }
    if (null == this.appellation) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, appellation);
    }
    if (null == this.area) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, area);
    }
    if (null == this.head_img_url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, head_img_url);
    }
    if (null == this.agent_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.agent_year);
    }
    if (null == this.all_cnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.all_cnt);
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
    __sb.append(FieldFormatter.escapeAndEnclose(lawyer_name==null?"null":lawyer_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawyer_sex==null?"null":lawyer_sex, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_card_no==null?"null":id_card_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(political_status==null?"null":political_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(birthday==null?"null":"" + birthday, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nation==null?"null":nation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(education==null?"null":education, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawyer_license_no==null?"null":lawyer_license_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawyer_license_date==null?"null":"" + lawyer_license_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawyer_type==null?"null":lawyer_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawyer_state==null?"null":lawyer_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cert_no==null?"null":cert_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cert_type==null?"null":cert_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cellphone==null?"null":cellphone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(telephone==null?"null":telephone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(email==null?"null":email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(addr==null?"null":addr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(organ_name==null?"null":organ_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(organ_type==null?"null":organ_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(unified_social_credit_code==null?"null":unified_social_credit_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(person_in_charge==null?"null":person_in_charge, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(organ_state==null?"null":organ_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(organ_phone==null?"null":organ_phone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(organ_addr==null?"null":organ_addr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(agency_in_charge==null?"null":agency_in_charge, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(professional_field==null?"null":professional_field, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(personal_profile==null?"null":personal_profile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(teacher==null?"null":teacher, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(school==null?"null":school, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(graduation==null?"null":"" + graduation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province==null?"null":province, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(county==null?"null":county, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(litigation_start_date==null?"null":"" + litigation_start_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(main_client==null?"null":main_client, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(classic_case==null?"null":classic_case, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(social_duties==null?"null":social_duties, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(publication==null?"null":publication, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(honor==null?"null":honor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other_follow_info==null?"null":other_follow_info, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(role_ids==null?"null":role_ids, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(field_ids==null?"null":field_ids, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(position==null?"null":position, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(appellation==null?"null":appellation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(area==null?"null":area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(head_img_url==null?"null":head_img_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(agent_year==null?"null":"" + agent_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(all_cnt==null?"null":"" + all_cnt, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawyer_name==null?"null":lawyer_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawyer_sex==null?"null":lawyer_sex, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_card_no==null?"null":id_card_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(political_status==null?"null":political_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(birthday==null?"null":"" + birthday, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(nation==null?"null":nation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(education==null?"null":education, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawyer_license_no==null?"null":lawyer_license_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawyer_license_date==null?"null":"" + lawyer_license_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawyer_type==null?"null":lawyer_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawyer_state==null?"null":lawyer_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cert_no==null?"null":cert_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cert_type==null?"null":cert_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cellphone==null?"null":cellphone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(telephone==null?"null":telephone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(email==null?"null":email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(addr==null?"null":addr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(organ_name==null?"null":organ_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(organ_type==null?"null":organ_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(unified_social_credit_code==null?"null":unified_social_credit_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(person_in_charge==null?"null":person_in_charge, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(organ_state==null?"null":organ_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(organ_phone==null?"null":organ_phone, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(organ_addr==null?"null":organ_addr, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(agency_in_charge==null?"null":agency_in_charge, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(professional_field==null?"null":professional_field, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(personal_profile==null?"null":personal_profile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(teacher==null?"null":teacher, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(school==null?"null":school, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(graduation==null?"null":"" + graduation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(province==null?"null":province, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(county==null?"null":county, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(litigation_start_date==null?"null":"" + litigation_start_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(user_id==null?"null":"" + user_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(main_client==null?"null":main_client, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(classic_case==null?"null":classic_case, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(social_duties==null?"null":social_duties, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(publication==null?"null":publication, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(honor==null?"null":honor, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(other_follow_info==null?"null":other_follow_info, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(role_ids==null?"null":role_ids, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(field_ids==null?"null":field_ids, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(position==null?"null":position, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(appellation==null?"null":appellation, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(area==null?"null":area, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(head_img_url==null?"null":head_img_url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(agent_year==null?"null":"" + agent_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(all_cnt==null?"null":"" + all_cnt, delimiters));
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
    if (__cur_str.equals("null")) { this.lawyer_name = null; } else {
      this.lawyer_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.lawyer_sex = null; } else {
      this.lawyer_sex = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.id_card_no = null; } else {
      this.id_card_no = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.political_status = null; } else {
      this.political_status = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.birthday = null; } else {
      this.birthday = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.nation = null; } else {
      this.nation = __cur_str;
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
    if (__cur_str.equals("null")) { this.lawyer_license_no = null; } else {
      this.lawyer_license_no = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lawyer_license_date = null; } else {
      this.lawyer_license_date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.lawyer_type = null; } else {
      this.lawyer_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.lawyer_state = null; } else {
      this.lawyer_state = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cert_no = null; } else {
      this.cert_no = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cert_type = null; } else {
      this.cert_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cellphone = null; } else {
      this.cellphone = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.telephone = null; } else {
      this.telephone = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.email = null; } else {
      this.email = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.addr = null; } else {
      this.addr = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.organ_name = null; } else {
      this.organ_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.organ_type = null; } else {
      this.organ_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.unified_social_credit_code = null; } else {
      this.unified_social_credit_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.person_in_charge = null; } else {
      this.person_in_charge = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.organ_state = null; } else {
      this.organ_state = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.organ_phone = null; } else {
      this.organ_phone = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.organ_addr = null; } else {
      this.organ_addr = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.agency_in_charge = null; } else {
      this.agency_in_charge = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.professional_field = null; } else {
      this.professional_field = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.personal_profile = null; } else {
      this.personal_profile = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.teacher = null; } else {
      this.teacher = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.school = null; } else {
      this.school = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.graduation = null; } else {
      this.graduation = java.sql.Date.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.county = null; } else {
      this.county = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.litigation_start_date = null; } else {
      this.litigation_start_date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.main_client = null; } else {
      this.main_client = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.classic_case = null; } else {
      this.classic_case = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.social_duties = null; } else {
      this.social_duties = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.publication = null; } else {
      this.publication = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.honor = null; } else {
      this.honor = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.other_follow_info = null; } else {
      this.other_follow_info = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.role_ids = null; } else {
      this.role_ids = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.field_ids = null; } else {
      this.field_ids = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.position = null; } else {
      this.position = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.appellation = null; } else {
      this.appellation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.area = null; } else {
      this.area = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.head_img_url = null; } else {
      this.head_img_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.agent_year = null; } else {
      this.agent_year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.all_cnt = null; } else {
      this.all_cnt = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.lawyer_name = null; } else {
      this.lawyer_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.lawyer_sex = null; } else {
      this.lawyer_sex = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.id_card_no = null; } else {
      this.id_card_no = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.political_status = null; } else {
      this.political_status = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.birthday = null; } else {
      this.birthday = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.nation = null; } else {
      this.nation = __cur_str;
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
    if (__cur_str.equals("null")) { this.lawyer_license_no = null; } else {
      this.lawyer_license_no = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lawyer_license_date = null; } else {
      this.lawyer_license_date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.lawyer_type = null; } else {
      this.lawyer_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.lawyer_state = null; } else {
      this.lawyer_state = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cert_no = null; } else {
      this.cert_no = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cert_type = null; } else {
      this.cert_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cellphone = null; } else {
      this.cellphone = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.telephone = null; } else {
      this.telephone = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.email = null; } else {
      this.email = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.addr = null; } else {
      this.addr = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.organ_name = null; } else {
      this.organ_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.organ_type = null; } else {
      this.organ_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.unified_social_credit_code = null; } else {
      this.unified_social_credit_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.person_in_charge = null; } else {
      this.person_in_charge = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.organ_state = null; } else {
      this.organ_state = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.organ_phone = null; } else {
      this.organ_phone = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.organ_addr = null; } else {
      this.organ_addr = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.agency_in_charge = null; } else {
      this.agency_in_charge = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.professional_field = null; } else {
      this.professional_field = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.personal_profile = null; } else {
      this.personal_profile = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.teacher = null; } else {
      this.teacher = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.school = null; } else {
      this.school = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.graduation = null; } else {
      this.graduation = java.sql.Date.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.county = null; } else {
      this.county = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.litigation_start_date = null; } else {
      this.litigation_start_date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.user_id = null; } else {
      this.user_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.main_client = null; } else {
      this.main_client = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.classic_case = null; } else {
      this.classic_case = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.social_duties = null; } else {
      this.social_duties = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.publication = null; } else {
      this.publication = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.honor = null; } else {
      this.honor = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.other_follow_info = null; } else {
      this.other_follow_info = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.role_ids = null; } else {
      this.role_ids = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.field_ids = null; } else {
      this.field_ids = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.position = null; } else {
      this.position = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.appellation = null; } else {
      this.appellation = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.area = null; } else {
      this.area = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.head_img_url = null; } else {
      this.head_img_url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.agent_year = null; } else {
      this.agent_year = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.all_cnt = null; } else {
      this.all_cnt = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_pg_lawyer o = (codegen_pg_lawyer) super.clone();
    o.birthday = (o.birthday != null) ? (java.sql.Date) o.birthday.clone() : null;
    o.lawyer_license_date = (o.lawyer_license_date != null) ? (java.sql.Date) o.lawyer_license_date.clone() : null;
    o.graduation = (o.graduation != null) ? (java.sql.Date) o.graduation.clone() : null;
    o.litigation_start_date = (o.litigation_start_date != null) ? (java.sql.Date) o.litigation_start_date.clone() : null;
    return o;
  }

  public void clone0(codegen_pg_lawyer o) throws CloneNotSupportedException {
    o.birthday = (o.birthday != null) ? (java.sql.Date) o.birthday.clone() : null;
    o.lawyer_license_date = (o.lawyer_license_date != null) ? (java.sql.Date) o.lawyer_license_date.clone() : null;
    o.graduation = (o.graduation != null) ? (java.sql.Date) o.graduation.clone() : null;
    o.litigation_start_date = (o.litigation_start_date != null) ? (java.sql.Date) o.litigation_start_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("lawyer_name", this.lawyer_name);
    __sqoop$field_map.put("lawyer_sex", this.lawyer_sex);
    __sqoop$field_map.put("id_card_no", this.id_card_no);
    __sqoop$field_map.put("political_status", this.political_status);
    __sqoop$field_map.put("birthday", this.birthday);
    __sqoop$field_map.put("nation", this.nation);
    __sqoop$field_map.put("education", this.education);
    __sqoop$field_map.put("lawyer_license_no", this.lawyer_license_no);
    __sqoop$field_map.put("lawyer_license_date", this.lawyer_license_date);
    __sqoop$field_map.put("lawyer_type", this.lawyer_type);
    __sqoop$field_map.put("lawyer_state", this.lawyer_state);
    __sqoop$field_map.put("cert_no", this.cert_no);
    __sqoop$field_map.put("cert_type", this.cert_type);
    __sqoop$field_map.put("cellphone", this.cellphone);
    __sqoop$field_map.put("telephone", this.telephone);
    __sqoop$field_map.put("email", this.email);
    __sqoop$field_map.put("addr", this.addr);
    __sqoop$field_map.put("organ_name", this.organ_name);
    __sqoop$field_map.put("organ_type", this.organ_type);
    __sqoop$field_map.put("unified_social_credit_code", this.unified_social_credit_code);
    __sqoop$field_map.put("person_in_charge", this.person_in_charge);
    __sqoop$field_map.put("organ_state", this.organ_state);
    __sqoop$field_map.put("organ_phone", this.organ_phone);
    __sqoop$field_map.put("organ_addr", this.organ_addr);
    __sqoop$field_map.put("agency_in_charge", this.agency_in_charge);
    __sqoop$field_map.put("professional_field", this.professional_field);
    __sqoop$field_map.put("personal_profile", this.personal_profile);
    __sqoop$field_map.put("teacher", this.teacher);
    __sqoop$field_map.put("school", this.school);
    __sqoop$field_map.put("graduation", this.graduation);
    __sqoop$field_map.put("province", this.province);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("county", this.county);
    __sqoop$field_map.put("litigation_start_date", this.litigation_start_date);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("main_client", this.main_client);
    __sqoop$field_map.put("classic_case", this.classic_case);
    __sqoop$field_map.put("social_duties", this.social_duties);
    __sqoop$field_map.put("publication", this.publication);
    __sqoop$field_map.put("honor", this.honor);
    __sqoop$field_map.put("other_follow_info", this.other_follow_info);
    __sqoop$field_map.put("role_ids", this.role_ids);
    __sqoop$field_map.put("field_ids", this.field_ids);
    __sqoop$field_map.put("position", this.position);
    __sqoop$field_map.put("appellation", this.appellation);
    __sqoop$field_map.put("area", this.area);
    __sqoop$field_map.put("head_img_url", this.head_img_url);
    __sqoop$field_map.put("agent_year", this.agent_year);
    __sqoop$field_map.put("all_cnt", this.all_cnt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("lawyer_name", this.lawyer_name);
    __sqoop$field_map.put("lawyer_sex", this.lawyer_sex);
    __sqoop$field_map.put("id_card_no", this.id_card_no);
    __sqoop$field_map.put("political_status", this.political_status);
    __sqoop$field_map.put("birthday", this.birthday);
    __sqoop$field_map.put("nation", this.nation);
    __sqoop$field_map.put("education", this.education);
    __sqoop$field_map.put("lawyer_license_no", this.lawyer_license_no);
    __sqoop$field_map.put("lawyer_license_date", this.lawyer_license_date);
    __sqoop$field_map.put("lawyer_type", this.lawyer_type);
    __sqoop$field_map.put("lawyer_state", this.lawyer_state);
    __sqoop$field_map.put("cert_no", this.cert_no);
    __sqoop$field_map.put("cert_type", this.cert_type);
    __sqoop$field_map.put("cellphone", this.cellphone);
    __sqoop$field_map.put("telephone", this.telephone);
    __sqoop$field_map.put("email", this.email);
    __sqoop$field_map.put("addr", this.addr);
    __sqoop$field_map.put("organ_name", this.organ_name);
    __sqoop$field_map.put("organ_type", this.organ_type);
    __sqoop$field_map.put("unified_social_credit_code", this.unified_social_credit_code);
    __sqoop$field_map.put("person_in_charge", this.person_in_charge);
    __sqoop$field_map.put("organ_state", this.organ_state);
    __sqoop$field_map.put("organ_phone", this.organ_phone);
    __sqoop$field_map.put("organ_addr", this.organ_addr);
    __sqoop$field_map.put("agency_in_charge", this.agency_in_charge);
    __sqoop$field_map.put("professional_field", this.professional_field);
    __sqoop$field_map.put("personal_profile", this.personal_profile);
    __sqoop$field_map.put("teacher", this.teacher);
    __sqoop$field_map.put("school", this.school);
    __sqoop$field_map.put("graduation", this.graduation);
    __sqoop$field_map.put("province", this.province);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("county", this.county);
    __sqoop$field_map.put("litigation_start_date", this.litigation_start_date);
    __sqoop$field_map.put("user_id", this.user_id);
    __sqoop$field_map.put("main_client", this.main_client);
    __sqoop$field_map.put("classic_case", this.classic_case);
    __sqoop$field_map.put("social_duties", this.social_duties);
    __sqoop$field_map.put("publication", this.publication);
    __sqoop$field_map.put("honor", this.honor);
    __sqoop$field_map.put("other_follow_info", this.other_follow_info);
    __sqoop$field_map.put("role_ids", this.role_ids);
    __sqoop$field_map.put("field_ids", this.field_ids);
    __sqoop$field_map.put("position", this.position);
    __sqoop$field_map.put("appellation", this.appellation);
    __sqoop$field_map.put("area", this.area);
    __sqoop$field_map.put("head_img_url", this.head_img_url);
    __sqoop$field_map.put("agent_year", this.agent_year);
    __sqoop$field_map.put("all_cnt", this.all_cnt);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
