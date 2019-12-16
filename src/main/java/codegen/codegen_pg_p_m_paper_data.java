// ORM class for table 'pg_p_m_paper_data'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Jun 22 15:25:06 CST 2019
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

public class codegen_pg_p_m_paper_data extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.id = (Integer)value;
      }
    });
    setters.put("title", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.title = (String)value;
      }
    });
    setters.put("content", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.content = (String)value;
      }
    });
    setters.put("keywords", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.keywords = (String)value;
      }
    });
    setters.put("authors", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.authors = (String)value;
      }
    });
    setters.put("unit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.unit = (String)value;
      }
    });
    setters.put("literature", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.literature = (String)value;
      }
    });
    setters.put("meeting_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.meeting_name = (String)value;
      }
    });
    setters.put("meeting_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.meeting_time = (String)value;
      }
    });
    setters.put("meeting_adress", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.meeting_adress = (String)value;
      }
    });
    setters.put("organizer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.organizer = (String)value;
      }
    });
    setters.put("languages", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.languages = (String)value;
      }
    });
    setters.put("class_number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.class_number = (String)value;
      }
    });
    setters.put("publish_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.publish_time = (String)value;
      }
    });
    setters.put("page_number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.page_number = (String)value;
      }
    });
    setters.put("search_key", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.search_key = (String)value;
      }
    });
    setters.put("search_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.search_type = (String)value;
      }
    });
    setters.put("url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.url = (String)value;
      }
    });
    setters.put("degree_unit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.degree_unit = (String)value;
      }
    });
    setters.put("awarded_the_degree", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.awarded_the_degree = (String)value;
      }
    });
    setters.put("professional", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.professional = (String)value;
      }
    });
    setters.put("mentor_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.mentor_name = (String)value;
      }
    });
    setters.put("degree_in_annual", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.degree_in_annual = (String)value;
      }
    });
    setters.put("english_title", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.english_title = (String)value;
      }
    });
    setters.put("doi", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.doi = (String)value;
      }
    });
    setters.put("english_key_words", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.english_key_words = (String)value;
      }
    });
    setters.put("english_authors", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.english_authors = (String)value;
      }
    });
    setters.put("journal_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.journal_name = (String)value;
      }
    });
    setters.put("journal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.journal = (String)value;
      }
    });
    setters.put("yearsInfo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.yearsInfo = (String)value;
      }
    });
    setters.put("journal_section", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.journal_section = (String)value;
      }
    });
    setters.put("fund_program", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.fund_program = (String)value;
      }
    });
    setters.put("pages", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.pages = (String)value;
      }
    });
    setters.put("report_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.report_type = (String)value;
      }
    });
    setters.put("open_range", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.open_range = (String)value;
      }
    });
    setters.put("project_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.project_name = (String)value;
      }
    });
    setters.put("plan_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.plan_name = (String)value;
      }
    });
    setters.put("compile_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.compile_time = (String)value;
      }
    });
    setters.put("approval_year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.approval_year = (String)value;
      }
    });
    setters.put("collection", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_pg_p_m_paper_data.this.collection = (String)value;
      }
    });
  }
  public codegen_pg_p_m_paper_data() {
    init0();
  }
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public codegen_pg_p_m_paper_data with_id(Integer id) {
    this.id = id;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public codegen_pg_p_m_paper_data with_title(String title) {
    this.title = title;
    return this;
  }
  private String content;
  public String get_content() {
    return content;
  }
  public void set_content(String content) {
    this.content = content;
  }
  public codegen_pg_p_m_paper_data with_content(String content) {
    this.content = content;
    return this;
  }
  private String keywords;
  public String get_keywords() {
    return keywords;
  }
  public void set_keywords(String keywords) {
    this.keywords = keywords;
  }
  public codegen_pg_p_m_paper_data with_keywords(String keywords) {
    this.keywords = keywords;
    return this;
  }
  private String authors;
  public String get_authors() {
    return authors;
  }
  public void set_authors(String authors) {
    this.authors = authors;
  }
  public codegen_pg_p_m_paper_data with_authors(String authors) {
    this.authors = authors;
    return this;
  }
  private String unit;
  public String get_unit() {
    return unit;
  }
  public void set_unit(String unit) {
    this.unit = unit;
  }
  public codegen_pg_p_m_paper_data with_unit(String unit) {
    this.unit = unit;
    return this;
  }
  private String literature;
  public String get_literature() {
    return literature;
  }
  public void set_literature(String literature) {
    this.literature = literature;
  }
  public codegen_pg_p_m_paper_data with_literature(String literature) {
    this.literature = literature;
    return this;
  }
  private String meeting_name;
  public String get_meeting_name() {
    return meeting_name;
  }
  public void set_meeting_name(String meeting_name) {
    this.meeting_name = meeting_name;
  }
  public codegen_pg_p_m_paper_data with_meeting_name(String meeting_name) {
    this.meeting_name = meeting_name;
    return this;
  }
  private String meeting_time;
  public String get_meeting_time() {
    return meeting_time;
  }
  public void set_meeting_time(String meeting_time) {
    this.meeting_time = meeting_time;
  }
  public codegen_pg_p_m_paper_data with_meeting_time(String meeting_time) {
    this.meeting_time = meeting_time;
    return this;
  }
  private String meeting_adress;
  public String get_meeting_adress() {
    return meeting_adress;
  }
  public void set_meeting_adress(String meeting_adress) {
    this.meeting_adress = meeting_adress;
  }
  public codegen_pg_p_m_paper_data with_meeting_adress(String meeting_adress) {
    this.meeting_adress = meeting_adress;
    return this;
  }
  private String organizer;
  public String get_organizer() {
    return organizer;
  }
  public void set_organizer(String organizer) {
    this.organizer = organizer;
  }
  public codegen_pg_p_m_paper_data with_organizer(String organizer) {
    this.organizer = organizer;
    return this;
  }
  private String languages;
  public String get_languages() {
    return languages;
  }
  public void set_languages(String languages) {
    this.languages = languages;
  }
  public codegen_pg_p_m_paper_data with_languages(String languages) {
    this.languages = languages;
    return this;
  }
  private String class_number;
  public String get_class_number() {
    return class_number;
  }
  public void set_class_number(String class_number) {
    this.class_number = class_number;
  }
  public codegen_pg_p_m_paper_data with_class_number(String class_number) {
    this.class_number = class_number;
    return this;
  }
  private String publish_time;
  public String get_publish_time() {
    return publish_time;
  }
  public void set_publish_time(String publish_time) {
    this.publish_time = publish_time;
  }
  public codegen_pg_p_m_paper_data with_publish_time(String publish_time) {
    this.publish_time = publish_time;
    return this;
  }
  private String page_number;
  public String get_page_number() {
    return page_number;
  }
  public void set_page_number(String page_number) {
    this.page_number = page_number;
  }
  public codegen_pg_p_m_paper_data with_page_number(String page_number) {
    this.page_number = page_number;
    return this;
  }
  private String search_key;
  public String get_search_key() {
    return search_key;
  }
  public void set_search_key(String search_key) {
    this.search_key = search_key;
  }
  public codegen_pg_p_m_paper_data with_search_key(String search_key) {
    this.search_key = search_key;
    return this;
  }
  private String search_type;
  public String get_search_type() {
    return search_type;
  }
  public void set_search_type(String search_type) {
    this.search_type = search_type;
  }
  public codegen_pg_p_m_paper_data with_search_type(String search_type) {
    this.search_type = search_type;
    return this;
  }
  private String url;
  public String get_url() {
    return url;
  }
  public void set_url(String url) {
    this.url = url;
  }
  public codegen_pg_p_m_paper_data with_url(String url) {
    this.url = url;
    return this;
  }
  private String degree_unit;
  public String get_degree_unit() {
    return degree_unit;
  }
  public void set_degree_unit(String degree_unit) {
    this.degree_unit = degree_unit;
  }
  public codegen_pg_p_m_paper_data with_degree_unit(String degree_unit) {
    this.degree_unit = degree_unit;
    return this;
  }
  private String awarded_the_degree;
  public String get_awarded_the_degree() {
    return awarded_the_degree;
  }
  public void set_awarded_the_degree(String awarded_the_degree) {
    this.awarded_the_degree = awarded_the_degree;
  }
  public codegen_pg_p_m_paper_data with_awarded_the_degree(String awarded_the_degree) {
    this.awarded_the_degree = awarded_the_degree;
    return this;
  }
  private String professional;
  public String get_professional() {
    return professional;
  }
  public void set_professional(String professional) {
    this.professional = professional;
  }
  public codegen_pg_p_m_paper_data with_professional(String professional) {
    this.professional = professional;
    return this;
  }
  private String mentor_name;
  public String get_mentor_name() {
    return mentor_name;
  }
  public void set_mentor_name(String mentor_name) {
    this.mentor_name = mentor_name;
  }
  public codegen_pg_p_m_paper_data with_mentor_name(String mentor_name) {
    this.mentor_name = mentor_name;
    return this;
  }
  private String degree_in_annual;
  public String get_degree_in_annual() {
    return degree_in_annual;
  }
  public void set_degree_in_annual(String degree_in_annual) {
    this.degree_in_annual = degree_in_annual;
  }
  public codegen_pg_p_m_paper_data with_degree_in_annual(String degree_in_annual) {
    this.degree_in_annual = degree_in_annual;
    return this;
  }
  private String english_title;
  public String get_english_title() {
    return english_title;
  }
  public void set_english_title(String english_title) {
    this.english_title = english_title;
  }
  public codegen_pg_p_m_paper_data with_english_title(String english_title) {
    this.english_title = english_title;
    return this;
  }
  private String doi;
  public String get_doi() {
    return doi;
  }
  public void set_doi(String doi) {
    this.doi = doi;
  }
  public codegen_pg_p_m_paper_data with_doi(String doi) {
    this.doi = doi;
    return this;
  }
  private String english_key_words;
  public String get_english_key_words() {
    return english_key_words;
  }
  public void set_english_key_words(String english_key_words) {
    this.english_key_words = english_key_words;
  }
  public codegen_pg_p_m_paper_data with_english_key_words(String english_key_words) {
    this.english_key_words = english_key_words;
    return this;
  }
  private String english_authors;
  public String get_english_authors() {
    return english_authors;
  }
  public void set_english_authors(String english_authors) {
    this.english_authors = english_authors;
  }
  public codegen_pg_p_m_paper_data with_english_authors(String english_authors) {
    this.english_authors = english_authors;
    return this;
  }
  private String journal_name;
  public String get_journal_name() {
    return journal_name;
  }
  public void set_journal_name(String journal_name) {
    this.journal_name = journal_name;
  }
  public codegen_pg_p_m_paper_data with_journal_name(String journal_name) {
    this.journal_name = journal_name;
    return this;
  }
  private String journal;
  public String get_journal() {
    return journal;
  }
  public void set_journal(String journal) {
    this.journal = journal;
  }
  public codegen_pg_p_m_paper_data with_journal(String journal) {
    this.journal = journal;
    return this;
  }
  private String yearsInfo;
  public String get_yearsInfo() {
    return yearsInfo;
  }
  public void set_yearsInfo(String yearsInfo) {
    this.yearsInfo = yearsInfo;
  }
  public codegen_pg_p_m_paper_data with_yearsInfo(String yearsInfo) {
    this.yearsInfo = yearsInfo;
    return this;
  }
  private String journal_section;
  public String get_journal_section() {
    return journal_section;
  }
  public void set_journal_section(String journal_section) {
    this.journal_section = journal_section;
  }
  public codegen_pg_p_m_paper_data with_journal_section(String journal_section) {
    this.journal_section = journal_section;
    return this;
  }
  private String fund_program;
  public String get_fund_program() {
    return fund_program;
  }
  public void set_fund_program(String fund_program) {
    this.fund_program = fund_program;
  }
  public codegen_pg_p_m_paper_data with_fund_program(String fund_program) {
    this.fund_program = fund_program;
    return this;
  }
  private String pages;
  public String get_pages() {
    return pages;
  }
  public void set_pages(String pages) {
    this.pages = pages;
  }
  public codegen_pg_p_m_paper_data with_pages(String pages) {
    this.pages = pages;
    return this;
  }
  private String report_type;
  public String get_report_type() {
    return report_type;
  }
  public void set_report_type(String report_type) {
    this.report_type = report_type;
  }
  public codegen_pg_p_m_paper_data with_report_type(String report_type) {
    this.report_type = report_type;
    return this;
  }
  private String open_range;
  public String get_open_range() {
    return open_range;
  }
  public void set_open_range(String open_range) {
    this.open_range = open_range;
  }
  public codegen_pg_p_m_paper_data with_open_range(String open_range) {
    this.open_range = open_range;
    return this;
  }
  private String project_name;
  public String get_project_name() {
    return project_name;
  }
  public void set_project_name(String project_name) {
    this.project_name = project_name;
  }
  public codegen_pg_p_m_paper_data with_project_name(String project_name) {
    this.project_name = project_name;
    return this;
  }
  private String plan_name;
  public String get_plan_name() {
    return plan_name;
  }
  public void set_plan_name(String plan_name) {
    this.plan_name = plan_name;
  }
  public codegen_pg_p_m_paper_data with_plan_name(String plan_name) {
    this.plan_name = plan_name;
    return this;
  }
  private String compile_time;
  public String get_compile_time() {
    return compile_time;
  }
  public void set_compile_time(String compile_time) {
    this.compile_time = compile_time;
  }
  public codegen_pg_p_m_paper_data with_compile_time(String compile_time) {
    this.compile_time = compile_time;
    return this;
  }
  private String approval_year;
  public String get_approval_year() {
    return approval_year;
  }
  public void set_approval_year(String approval_year) {
    this.approval_year = approval_year;
  }
  public codegen_pg_p_m_paper_data with_approval_year(String approval_year) {
    this.approval_year = approval_year;
    return this;
  }
  private String collection;
  public String get_collection() {
    return collection;
  }
  public void set_collection(String collection) {
    this.collection = collection;
  }
  public codegen_pg_p_m_paper_data with_collection(String collection) {
    this.collection = collection;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_pg_p_m_paper_data)) {
      return false;
    }
    codegen_pg_p_m_paper_data that = (codegen_pg_p_m_paper_data) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.content == null ? that.content == null : this.content.equals(that.content));
    equal = equal && (this.keywords == null ? that.keywords == null : this.keywords.equals(that.keywords));
    equal = equal && (this.authors == null ? that.authors == null : this.authors.equals(that.authors));
    equal = equal && (this.unit == null ? that.unit == null : this.unit.equals(that.unit));
    equal = equal && (this.literature == null ? that.literature == null : this.literature.equals(that.literature));
    equal = equal && (this.meeting_name == null ? that.meeting_name == null : this.meeting_name.equals(that.meeting_name));
    equal = equal && (this.meeting_time == null ? that.meeting_time == null : this.meeting_time.equals(that.meeting_time));
    equal = equal && (this.meeting_adress == null ? that.meeting_adress == null : this.meeting_adress.equals(that.meeting_adress));
    equal = equal && (this.organizer == null ? that.organizer == null : this.organizer.equals(that.organizer));
    equal = equal && (this.languages == null ? that.languages == null : this.languages.equals(that.languages));
    equal = equal && (this.class_number == null ? that.class_number == null : this.class_number.equals(that.class_number));
    equal = equal && (this.publish_time == null ? that.publish_time == null : this.publish_time.equals(that.publish_time));
    equal = equal && (this.page_number == null ? that.page_number == null : this.page_number.equals(that.page_number));
    equal = equal && (this.search_key == null ? that.search_key == null : this.search_key.equals(that.search_key));
    equal = equal && (this.search_type == null ? that.search_type == null : this.search_type.equals(that.search_type));
    equal = equal && (this.url == null ? that.url == null : this.url.equals(that.url));
    equal = equal && (this.degree_unit == null ? that.degree_unit == null : this.degree_unit.equals(that.degree_unit));
    equal = equal && (this.awarded_the_degree == null ? that.awarded_the_degree == null : this.awarded_the_degree.equals(that.awarded_the_degree));
    equal = equal && (this.professional == null ? that.professional == null : this.professional.equals(that.professional));
    equal = equal && (this.mentor_name == null ? that.mentor_name == null : this.mentor_name.equals(that.mentor_name));
    equal = equal && (this.degree_in_annual == null ? that.degree_in_annual == null : this.degree_in_annual.equals(that.degree_in_annual));
    equal = equal && (this.english_title == null ? that.english_title == null : this.english_title.equals(that.english_title));
    equal = equal && (this.doi == null ? that.doi == null : this.doi.equals(that.doi));
    equal = equal && (this.english_key_words == null ? that.english_key_words == null : this.english_key_words.equals(that.english_key_words));
    equal = equal && (this.english_authors == null ? that.english_authors == null : this.english_authors.equals(that.english_authors));
    equal = equal && (this.journal_name == null ? that.journal_name == null : this.journal_name.equals(that.journal_name));
    equal = equal && (this.journal == null ? that.journal == null : this.journal.equals(that.journal));
    equal = equal && (this.yearsInfo == null ? that.yearsInfo == null : this.yearsInfo.equals(that.yearsInfo));
    equal = equal && (this.journal_section == null ? that.journal_section == null : this.journal_section.equals(that.journal_section));
    equal = equal && (this.fund_program == null ? that.fund_program == null : this.fund_program.equals(that.fund_program));
    equal = equal && (this.pages == null ? that.pages == null : this.pages.equals(that.pages));
    equal = equal && (this.report_type == null ? that.report_type == null : this.report_type.equals(that.report_type));
    equal = equal && (this.open_range == null ? that.open_range == null : this.open_range.equals(that.open_range));
    equal = equal && (this.project_name == null ? that.project_name == null : this.project_name.equals(that.project_name));
    equal = equal && (this.plan_name == null ? that.plan_name == null : this.plan_name.equals(that.plan_name));
    equal = equal && (this.compile_time == null ? that.compile_time == null : this.compile_time.equals(that.compile_time));
    equal = equal && (this.approval_year == null ? that.approval_year == null : this.approval_year.equals(that.approval_year));
    equal = equal && (this.collection == null ? that.collection == null : this.collection.equals(that.collection));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_pg_p_m_paper_data)) {
      return false;
    }
    codegen_pg_p_m_paper_data that = (codegen_pg_p_m_paper_data) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.content == null ? that.content == null : this.content.equals(that.content));
    equal = equal && (this.keywords == null ? that.keywords == null : this.keywords.equals(that.keywords));
    equal = equal && (this.authors == null ? that.authors == null : this.authors.equals(that.authors));
    equal = equal && (this.unit == null ? that.unit == null : this.unit.equals(that.unit));
    equal = equal && (this.literature == null ? that.literature == null : this.literature.equals(that.literature));
    equal = equal && (this.meeting_name == null ? that.meeting_name == null : this.meeting_name.equals(that.meeting_name));
    equal = equal && (this.meeting_time == null ? that.meeting_time == null : this.meeting_time.equals(that.meeting_time));
    equal = equal && (this.meeting_adress == null ? that.meeting_adress == null : this.meeting_adress.equals(that.meeting_adress));
    equal = equal && (this.organizer == null ? that.organizer == null : this.organizer.equals(that.organizer));
    equal = equal && (this.languages == null ? that.languages == null : this.languages.equals(that.languages));
    equal = equal && (this.class_number == null ? that.class_number == null : this.class_number.equals(that.class_number));
    equal = equal && (this.publish_time == null ? that.publish_time == null : this.publish_time.equals(that.publish_time));
    equal = equal && (this.page_number == null ? that.page_number == null : this.page_number.equals(that.page_number));
    equal = equal && (this.search_key == null ? that.search_key == null : this.search_key.equals(that.search_key));
    equal = equal && (this.search_type == null ? that.search_type == null : this.search_type.equals(that.search_type));
    equal = equal && (this.url == null ? that.url == null : this.url.equals(that.url));
    equal = equal && (this.degree_unit == null ? that.degree_unit == null : this.degree_unit.equals(that.degree_unit));
    equal = equal && (this.awarded_the_degree == null ? that.awarded_the_degree == null : this.awarded_the_degree.equals(that.awarded_the_degree));
    equal = equal && (this.professional == null ? that.professional == null : this.professional.equals(that.professional));
    equal = equal && (this.mentor_name == null ? that.mentor_name == null : this.mentor_name.equals(that.mentor_name));
    equal = equal && (this.degree_in_annual == null ? that.degree_in_annual == null : this.degree_in_annual.equals(that.degree_in_annual));
    equal = equal && (this.english_title == null ? that.english_title == null : this.english_title.equals(that.english_title));
    equal = equal && (this.doi == null ? that.doi == null : this.doi.equals(that.doi));
    equal = equal && (this.english_key_words == null ? that.english_key_words == null : this.english_key_words.equals(that.english_key_words));
    equal = equal && (this.english_authors == null ? that.english_authors == null : this.english_authors.equals(that.english_authors));
    equal = equal && (this.journal_name == null ? that.journal_name == null : this.journal_name.equals(that.journal_name));
    equal = equal && (this.journal == null ? that.journal == null : this.journal.equals(that.journal));
    equal = equal && (this.yearsInfo == null ? that.yearsInfo == null : this.yearsInfo.equals(that.yearsInfo));
    equal = equal && (this.journal_section == null ? that.journal_section == null : this.journal_section.equals(that.journal_section));
    equal = equal && (this.fund_program == null ? that.fund_program == null : this.fund_program.equals(that.fund_program));
    equal = equal && (this.pages == null ? that.pages == null : this.pages.equals(that.pages));
    equal = equal && (this.report_type == null ? that.report_type == null : this.report_type.equals(that.report_type));
    equal = equal && (this.open_range == null ? that.open_range == null : this.open_range.equals(that.open_range));
    equal = equal && (this.project_name == null ? that.project_name == null : this.project_name.equals(that.project_name));
    equal = equal && (this.plan_name == null ? that.plan_name == null : this.plan_name.equals(that.plan_name));
    equal = equal && (this.compile_time == null ? that.compile_time == null : this.compile_time.equals(that.compile_time));
    equal = equal && (this.approval_year == null ? that.approval_year == null : this.approval_year.equals(that.approval_year));
    equal = equal && (this.collection == null ? that.collection == null : this.collection.equals(that.collection));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.title = JdbcWritableBridge.readString(2, __dbResults);
    this.content = JdbcWritableBridge.readString(3, __dbResults);
    this.keywords = JdbcWritableBridge.readString(4, __dbResults);
    this.authors = JdbcWritableBridge.readString(5, __dbResults);
    this.unit = JdbcWritableBridge.readString(6, __dbResults);
    this.literature = JdbcWritableBridge.readString(7, __dbResults);
    this.meeting_name = JdbcWritableBridge.readString(8, __dbResults);
    this.meeting_time = JdbcWritableBridge.readString(9, __dbResults);
    this.meeting_adress = JdbcWritableBridge.readString(10, __dbResults);
    this.organizer = JdbcWritableBridge.readString(11, __dbResults);
    this.languages = JdbcWritableBridge.readString(12, __dbResults);
    this.class_number = JdbcWritableBridge.readString(13, __dbResults);
    this.publish_time = JdbcWritableBridge.readString(14, __dbResults);
    this.page_number = JdbcWritableBridge.readString(15, __dbResults);
    this.search_key = JdbcWritableBridge.readString(16, __dbResults);
    this.search_type = JdbcWritableBridge.readString(17, __dbResults);
    this.url = JdbcWritableBridge.readString(18, __dbResults);
    this.degree_unit = JdbcWritableBridge.readString(19, __dbResults);
    this.awarded_the_degree = JdbcWritableBridge.readString(20, __dbResults);
    this.professional = JdbcWritableBridge.readString(21, __dbResults);
    this.mentor_name = JdbcWritableBridge.readString(22, __dbResults);
    this.degree_in_annual = JdbcWritableBridge.readString(23, __dbResults);
    this.english_title = JdbcWritableBridge.readString(24, __dbResults);
    this.doi = JdbcWritableBridge.readString(25, __dbResults);
    this.english_key_words = JdbcWritableBridge.readString(26, __dbResults);
    this.english_authors = JdbcWritableBridge.readString(27, __dbResults);
    this.journal_name = JdbcWritableBridge.readString(28, __dbResults);
    this.journal = JdbcWritableBridge.readString(29, __dbResults);
    this.yearsInfo = JdbcWritableBridge.readString(30, __dbResults);
    this.journal_section = JdbcWritableBridge.readString(31, __dbResults);
    this.fund_program = JdbcWritableBridge.readString(32, __dbResults);
    this.pages = JdbcWritableBridge.readString(33, __dbResults);
    this.report_type = JdbcWritableBridge.readString(34, __dbResults);
    this.open_range = JdbcWritableBridge.readString(35, __dbResults);
    this.project_name = JdbcWritableBridge.readString(36, __dbResults);
    this.plan_name = JdbcWritableBridge.readString(37, __dbResults);
    this.compile_time = JdbcWritableBridge.readString(38, __dbResults);
    this.approval_year = JdbcWritableBridge.readString(39, __dbResults);
    this.collection = JdbcWritableBridge.readString(40, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.title = JdbcWritableBridge.readString(2, __dbResults);
    this.content = JdbcWritableBridge.readString(3, __dbResults);
    this.keywords = JdbcWritableBridge.readString(4, __dbResults);
    this.authors = JdbcWritableBridge.readString(5, __dbResults);
    this.unit = JdbcWritableBridge.readString(6, __dbResults);
    this.literature = JdbcWritableBridge.readString(7, __dbResults);
    this.meeting_name = JdbcWritableBridge.readString(8, __dbResults);
    this.meeting_time = JdbcWritableBridge.readString(9, __dbResults);
    this.meeting_adress = JdbcWritableBridge.readString(10, __dbResults);
    this.organizer = JdbcWritableBridge.readString(11, __dbResults);
    this.languages = JdbcWritableBridge.readString(12, __dbResults);
    this.class_number = JdbcWritableBridge.readString(13, __dbResults);
    this.publish_time = JdbcWritableBridge.readString(14, __dbResults);
    this.page_number = JdbcWritableBridge.readString(15, __dbResults);
    this.search_key = JdbcWritableBridge.readString(16, __dbResults);
    this.search_type = JdbcWritableBridge.readString(17, __dbResults);
    this.url = JdbcWritableBridge.readString(18, __dbResults);
    this.degree_unit = JdbcWritableBridge.readString(19, __dbResults);
    this.awarded_the_degree = JdbcWritableBridge.readString(20, __dbResults);
    this.professional = JdbcWritableBridge.readString(21, __dbResults);
    this.mentor_name = JdbcWritableBridge.readString(22, __dbResults);
    this.degree_in_annual = JdbcWritableBridge.readString(23, __dbResults);
    this.english_title = JdbcWritableBridge.readString(24, __dbResults);
    this.doi = JdbcWritableBridge.readString(25, __dbResults);
    this.english_key_words = JdbcWritableBridge.readString(26, __dbResults);
    this.english_authors = JdbcWritableBridge.readString(27, __dbResults);
    this.journal_name = JdbcWritableBridge.readString(28, __dbResults);
    this.journal = JdbcWritableBridge.readString(29, __dbResults);
    this.yearsInfo = JdbcWritableBridge.readString(30, __dbResults);
    this.journal_section = JdbcWritableBridge.readString(31, __dbResults);
    this.fund_program = JdbcWritableBridge.readString(32, __dbResults);
    this.pages = JdbcWritableBridge.readString(33, __dbResults);
    this.report_type = JdbcWritableBridge.readString(34, __dbResults);
    this.open_range = JdbcWritableBridge.readString(35, __dbResults);
    this.project_name = JdbcWritableBridge.readString(36, __dbResults);
    this.plan_name = JdbcWritableBridge.readString(37, __dbResults);
    this.compile_time = JdbcWritableBridge.readString(38, __dbResults);
    this.approval_year = JdbcWritableBridge.readString(39, __dbResults);
    this.collection = JdbcWritableBridge.readString(40, __dbResults);
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
    JdbcWritableBridge.writeString(title, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(content, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(keywords, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(authors, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(unit, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(literature, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(meeting_name, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(meeting_time, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(meeting_adress, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(organizer, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(languages, 12 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(class_number, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(publish_time, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(page_number, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(search_key, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(search_type, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(url, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(degree_unit, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(awarded_the_degree, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(professional, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mentor_name, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(degree_in_annual, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(english_title, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(doi, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(english_key_words, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(english_authors, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(journal_name, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(journal, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(yearsInfo, 30 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(journal_section, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(fund_program, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pages, 33 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(report_type, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(open_range, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(project_name, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(plan_name, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(compile_time, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(approval_year, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(collection, 40 + __off, 12, __dbStmt);
    return 40;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(title, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(content, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(keywords, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(authors, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(unit, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(literature, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(meeting_name, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(meeting_time, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(meeting_adress, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(organizer, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(languages, 12 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(class_number, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(publish_time, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(page_number, 15 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(search_key, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(search_type, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(url, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(degree_unit, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(awarded_the_degree, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(professional, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(mentor_name, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(degree_in_annual, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(english_title, 24 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(doi, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(english_key_words, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(english_authors, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(journal_name, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(journal, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(yearsInfo, 30 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(journal_section, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(fund_program, 32 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(pages, 33 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(report_type, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(open_range, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(project_name, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(plan_name, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(compile_time, 38 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(approval_year, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(collection, 40 + __off, 12, __dbStmt);
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
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.content = null;
    } else {
    this.content = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.keywords = null;
    } else {
    this.keywords = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.authors = null;
    } else {
    this.authors = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.unit = null;
    } else {
    this.unit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.literature = null;
    } else {
    this.literature = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.meeting_name = null;
    } else {
    this.meeting_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.meeting_time = null;
    } else {
    this.meeting_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.meeting_adress = null;
    } else {
    this.meeting_adress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.organizer = null;
    } else {
    this.organizer = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.languages = null;
    } else {
    this.languages = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.class_number = null;
    } else {
    this.class_number = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.publish_time = null;
    } else {
    this.publish_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.page_number = null;
    } else {
    this.page_number = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.search_key = null;
    } else {
    this.search_key = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.search_type = null;
    } else {
    this.search_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.url = null;
    } else {
    this.url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.degree_unit = null;
    } else {
    this.degree_unit = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.awarded_the_degree = null;
    } else {
    this.awarded_the_degree = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.professional = null;
    } else {
    this.professional = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.mentor_name = null;
    } else {
    this.mentor_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.degree_in_annual = null;
    } else {
    this.degree_in_annual = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.english_title = null;
    } else {
    this.english_title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.doi = null;
    } else {
    this.doi = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.english_key_words = null;
    } else {
    this.english_key_words = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.english_authors = null;
    } else {
    this.english_authors = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.journal_name = null;
    } else {
    this.journal_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.journal = null;
    } else {
    this.journal = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.yearsInfo = null;
    } else {
    this.yearsInfo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.journal_section = null;
    } else {
    this.journal_section = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fund_program = null;
    } else {
    this.fund_program = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pages = null;
    } else {
    this.pages = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.report_type = null;
    } else {
    this.report_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.open_range = null;
    } else {
    this.open_range = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.project_name = null;
    } else {
    this.project_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.plan_name = null;
    } else {
    this.plan_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.compile_time = null;
    } else {
    this.compile_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.approval_year = null;
    } else {
    this.approval_year = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.collection = null;
    } else {
    this.collection = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.content) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, content);
    }
    if (null == this.keywords) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, keywords);
    }
    if (null == this.authors) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, authors);
    }
    if (null == this.unit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, unit);
    }
    if (null == this.literature) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, literature);
    }
    if (null == this.meeting_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, meeting_name);
    }
    if (null == this.meeting_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, meeting_time);
    }
    if (null == this.meeting_adress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, meeting_adress);
    }
    if (null == this.organizer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, organizer);
    }
    if (null == this.languages) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, languages);
    }
    if (null == this.class_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, class_number);
    }
    if (null == this.publish_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, publish_time);
    }
    if (null == this.page_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, page_number);
    }
    if (null == this.search_key) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, search_key);
    }
    if (null == this.search_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, search_type);
    }
    if (null == this.url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, url);
    }
    if (null == this.degree_unit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, degree_unit);
    }
    if (null == this.awarded_the_degree) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, awarded_the_degree);
    }
    if (null == this.professional) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, professional);
    }
    if (null == this.mentor_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mentor_name);
    }
    if (null == this.degree_in_annual) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, degree_in_annual);
    }
    if (null == this.english_title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, english_title);
    }
    if (null == this.doi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, doi);
    }
    if (null == this.english_key_words) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, english_key_words);
    }
    if (null == this.english_authors) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, english_authors);
    }
    if (null == this.journal_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, journal_name);
    }
    if (null == this.journal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, journal);
    }
    if (null == this.yearsInfo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, yearsInfo);
    }
    if (null == this.journal_section) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, journal_section);
    }
    if (null == this.fund_program) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fund_program);
    }
    if (null == this.pages) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pages);
    }
    if (null == this.report_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, report_type);
    }
    if (null == this.open_range) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, open_range);
    }
    if (null == this.project_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, project_name);
    }
    if (null == this.plan_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, plan_name);
    }
    if (null == this.compile_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, compile_time);
    }
    if (null == this.approval_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, approval_year);
    }
    if (null == this.collection) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, collection);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.content) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, content);
    }
    if (null == this.keywords) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, keywords);
    }
    if (null == this.authors) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, authors);
    }
    if (null == this.unit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, unit);
    }
    if (null == this.literature) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, literature);
    }
    if (null == this.meeting_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, meeting_name);
    }
    if (null == this.meeting_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, meeting_time);
    }
    if (null == this.meeting_adress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, meeting_adress);
    }
    if (null == this.organizer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, organizer);
    }
    if (null == this.languages) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, languages);
    }
    if (null == this.class_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, class_number);
    }
    if (null == this.publish_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, publish_time);
    }
    if (null == this.page_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, page_number);
    }
    if (null == this.search_key) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, search_key);
    }
    if (null == this.search_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, search_type);
    }
    if (null == this.url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, url);
    }
    if (null == this.degree_unit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, degree_unit);
    }
    if (null == this.awarded_the_degree) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, awarded_the_degree);
    }
    if (null == this.professional) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, professional);
    }
    if (null == this.mentor_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, mentor_name);
    }
    if (null == this.degree_in_annual) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, degree_in_annual);
    }
    if (null == this.english_title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, english_title);
    }
    if (null == this.doi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, doi);
    }
    if (null == this.english_key_words) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, english_key_words);
    }
    if (null == this.english_authors) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, english_authors);
    }
    if (null == this.journal_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, journal_name);
    }
    if (null == this.journal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, journal);
    }
    if (null == this.yearsInfo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, yearsInfo);
    }
    if (null == this.journal_section) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, journal_section);
    }
    if (null == this.fund_program) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fund_program);
    }
    if (null == this.pages) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, pages);
    }
    if (null == this.report_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, report_type);
    }
    if (null == this.open_range) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, open_range);
    }
    if (null == this.project_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, project_name);
    }
    if (null == this.plan_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, plan_name);
    }
    if (null == this.compile_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, compile_time);
    }
    if (null == this.approval_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, approval_year);
    }
    if (null == this.collection) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, collection);
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
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(content==null?"null":content, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(keywords==null?"null":keywords, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(authors==null?"null":authors, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(unit==null?"null":unit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(literature==null?"null":literature, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(meeting_name==null?"null":meeting_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(meeting_time==null?"null":meeting_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(meeting_adress==null?"null":meeting_adress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(organizer==null?"null":organizer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(languages==null?"null":languages, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(class_number==null?"null":class_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(publish_time==null?"null":publish_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(page_number==null?"null":page_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(search_key==null?"null":search_key, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(search_type==null?"null":search_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(url==null?"null":url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(degree_unit==null?"null":degree_unit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(awarded_the_degree==null?"null":awarded_the_degree, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(professional==null?"null":professional, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mentor_name==null?"null":mentor_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(degree_in_annual==null?"null":degree_in_annual, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(english_title==null?"null":english_title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(doi==null?"null":doi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(english_key_words==null?"null":english_key_words, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(english_authors==null?"null":english_authors, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(journal_name==null?"null":journal_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(journal==null?"null":journal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(yearsInfo==null?"null":yearsInfo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(journal_section==null?"null":journal_section, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fund_program==null?"null":fund_program, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pages==null?"null":pages, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(report_type==null?"null":report_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(open_range==null?"null":open_range, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(project_name==null?"null":project_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(plan_name==null?"null":plan_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(compile_time==null?"null":compile_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(approval_year==null?"null":approval_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(collection==null?"null":collection, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(content==null?"null":content, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(keywords==null?"null":keywords, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(authors==null?"null":authors, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(unit==null?"null":unit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(literature==null?"null":literature, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(meeting_name==null?"null":meeting_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(meeting_time==null?"null":meeting_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(meeting_adress==null?"null":meeting_adress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(organizer==null?"null":organizer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(languages==null?"null":languages, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(class_number==null?"null":class_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(publish_time==null?"null":publish_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(page_number==null?"null":page_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(search_key==null?"null":search_key, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(search_type==null?"null":search_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(url==null?"null":url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(degree_unit==null?"null":degree_unit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(awarded_the_degree==null?"null":awarded_the_degree, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(professional==null?"null":professional, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mentor_name==null?"null":mentor_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(degree_in_annual==null?"null":degree_in_annual, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(english_title==null?"null":english_title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(doi==null?"null":doi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(english_key_words==null?"null":english_key_words, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(english_authors==null?"null":english_authors, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(journal_name==null?"null":journal_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(journal==null?"null":journal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(yearsInfo==null?"null":yearsInfo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(journal_section==null?"null":journal_section, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fund_program==null?"null":fund_program, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pages==null?"null":pages, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(report_type==null?"null":report_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(open_range==null?"null":open_range, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(project_name==null?"null":project_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(plan_name==null?"null":plan_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(compile_time==null?"null":compile_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(approval_year==null?"null":approval_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(collection==null?"null":collection, delimiters));
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
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.content = null; } else {
      this.content = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.keywords = null; } else {
      this.keywords = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.authors = null; } else {
      this.authors = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.unit = null; } else {
      this.unit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.literature = null; } else {
      this.literature = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.meeting_name = null; } else {
      this.meeting_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.meeting_time = null; } else {
      this.meeting_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.meeting_adress = null; } else {
      this.meeting_adress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.organizer = null; } else {
      this.organizer = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.languages = null; } else {
      this.languages = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.class_number = null; } else {
      this.class_number = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.publish_time = null; } else {
      this.publish_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.page_number = null; } else {
      this.page_number = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.search_key = null; } else {
      this.search_key = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.search_type = null; } else {
      this.search_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.url = null; } else {
      this.url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.degree_unit = null; } else {
      this.degree_unit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.awarded_the_degree = null; } else {
      this.awarded_the_degree = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.professional = null; } else {
      this.professional = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.mentor_name = null; } else {
      this.mentor_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.degree_in_annual = null; } else {
      this.degree_in_annual = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.english_title = null; } else {
      this.english_title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.doi = null; } else {
      this.doi = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.english_key_words = null; } else {
      this.english_key_words = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.english_authors = null; } else {
      this.english_authors = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.journal_name = null; } else {
      this.journal_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.journal = null; } else {
      this.journal = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.yearsInfo = null; } else {
      this.yearsInfo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.journal_section = null; } else {
      this.journal_section = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fund_program = null; } else {
      this.fund_program = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.pages = null; } else {
      this.pages = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.report_type = null; } else {
      this.report_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.open_range = null; } else {
      this.open_range = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.project_name = null; } else {
      this.project_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.plan_name = null; } else {
      this.plan_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.compile_time = null; } else {
      this.compile_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.approval_year = null; } else {
      this.approval_year = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.collection = null; } else {
      this.collection = __cur_str;
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
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.content = null; } else {
      this.content = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.keywords = null; } else {
      this.keywords = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.authors = null; } else {
      this.authors = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.unit = null; } else {
      this.unit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.literature = null; } else {
      this.literature = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.meeting_name = null; } else {
      this.meeting_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.meeting_time = null; } else {
      this.meeting_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.meeting_adress = null; } else {
      this.meeting_adress = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.organizer = null; } else {
      this.organizer = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.languages = null; } else {
      this.languages = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.class_number = null; } else {
      this.class_number = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.publish_time = null; } else {
      this.publish_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.page_number = null; } else {
      this.page_number = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.search_key = null; } else {
      this.search_key = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.search_type = null; } else {
      this.search_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.url = null; } else {
      this.url = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.degree_unit = null; } else {
      this.degree_unit = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.awarded_the_degree = null; } else {
      this.awarded_the_degree = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.professional = null; } else {
      this.professional = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.mentor_name = null; } else {
      this.mentor_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.degree_in_annual = null; } else {
      this.degree_in_annual = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.english_title = null; } else {
      this.english_title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.doi = null; } else {
      this.doi = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.english_key_words = null; } else {
      this.english_key_words = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.english_authors = null; } else {
      this.english_authors = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.journal_name = null; } else {
      this.journal_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.journal = null; } else {
      this.journal = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.yearsInfo = null; } else {
      this.yearsInfo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.journal_section = null; } else {
      this.journal_section = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fund_program = null; } else {
      this.fund_program = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.pages = null; } else {
      this.pages = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.report_type = null; } else {
      this.report_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.open_range = null; } else {
      this.open_range = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.project_name = null; } else {
      this.project_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.plan_name = null; } else {
      this.plan_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.compile_time = null; } else {
      this.compile_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.approval_year = null; } else {
      this.approval_year = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.collection = null; } else {
      this.collection = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_pg_p_m_paper_data o = (codegen_pg_p_m_paper_data) super.clone();
    return o;
  }

  public void clone0(codegen_pg_p_m_paper_data o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("content", this.content);
    __sqoop$field_map.put("keywords", this.keywords);
    __sqoop$field_map.put("authors", this.authors);
    __sqoop$field_map.put("unit", this.unit);
    __sqoop$field_map.put("literature", this.literature);
    __sqoop$field_map.put("meeting_name", this.meeting_name);
    __sqoop$field_map.put("meeting_time", this.meeting_time);
    __sqoop$field_map.put("meeting_adress", this.meeting_adress);
    __sqoop$field_map.put("organizer", this.organizer);
    __sqoop$field_map.put("languages", this.languages);
    __sqoop$field_map.put("class_number", this.class_number);
    __sqoop$field_map.put("publish_time", this.publish_time);
    __sqoop$field_map.put("page_number", this.page_number);
    __sqoop$field_map.put("search_key", this.search_key);
    __sqoop$field_map.put("search_type", this.search_type);
    __sqoop$field_map.put("url", this.url);
    __sqoop$field_map.put("degree_unit", this.degree_unit);
    __sqoop$field_map.put("awarded_the_degree", this.awarded_the_degree);
    __sqoop$field_map.put("professional", this.professional);
    __sqoop$field_map.put("mentor_name", this.mentor_name);
    __sqoop$field_map.put("degree_in_annual", this.degree_in_annual);
    __sqoop$field_map.put("english_title", this.english_title);
    __sqoop$field_map.put("doi", this.doi);
    __sqoop$field_map.put("english_key_words", this.english_key_words);
    __sqoop$field_map.put("english_authors", this.english_authors);
    __sqoop$field_map.put("journal_name", this.journal_name);
    __sqoop$field_map.put("journal", this.journal);
    __sqoop$field_map.put("yearsInfo", this.yearsInfo);
    __sqoop$field_map.put("journal_section", this.journal_section);
    __sqoop$field_map.put("fund_program", this.fund_program);
    __sqoop$field_map.put("pages", this.pages);
    __sqoop$field_map.put("report_type", this.report_type);
    __sqoop$field_map.put("open_range", this.open_range);
    __sqoop$field_map.put("project_name", this.project_name);
    __sqoop$field_map.put("plan_name", this.plan_name);
    __sqoop$field_map.put("compile_time", this.compile_time);
    __sqoop$field_map.put("approval_year", this.approval_year);
    __sqoop$field_map.put("collection", this.collection);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("content", this.content);
    __sqoop$field_map.put("keywords", this.keywords);
    __sqoop$field_map.put("authors", this.authors);
    __sqoop$field_map.put("unit", this.unit);
    __sqoop$field_map.put("literature", this.literature);
    __sqoop$field_map.put("meeting_name", this.meeting_name);
    __sqoop$field_map.put("meeting_time", this.meeting_time);
    __sqoop$field_map.put("meeting_adress", this.meeting_adress);
    __sqoop$field_map.put("organizer", this.organizer);
    __sqoop$field_map.put("languages", this.languages);
    __sqoop$field_map.put("class_number", this.class_number);
    __sqoop$field_map.put("publish_time", this.publish_time);
    __sqoop$field_map.put("page_number", this.page_number);
    __sqoop$field_map.put("search_key", this.search_key);
    __sqoop$field_map.put("search_type", this.search_type);
    __sqoop$field_map.put("url", this.url);
    __sqoop$field_map.put("degree_unit", this.degree_unit);
    __sqoop$field_map.put("awarded_the_degree", this.awarded_the_degree);
    __sqoop$field_map.put("professional", this.professional);
    __sqoop$field_map.put("mentor_name", this.mentor_name);
    __sqoop$field_map.put("degree_in_annual", this.degree_in_annual);
    __sqoop$field_map.put("english_title", this.english_title);
    __sqoop$field_map.put("doi", this.doi);
    __sqoop$field_map.put("english_key_words", this.english_key_words);
    __sqoop$field_map.put("english_authors", this.english_authors);
    __sqoop$field_map.put("journal_name", this.journal_name);
    __sqoop$field_map.put("journal", this.journal);
    __sqoop$field_map.put("yearsInfo", this.yearsInfo);
    __sqoop$field_map.put("journal_section", this.journal_section);
    __sqoop$field_map.put("fund_program", this.fund_program);
    __sqoop$field_map.put("pages", this.pages);
    __sqoop$field_map.put("report_type", this.report_type);
    __sqoop$field_map.put("open_range", this.open_range);
    __sqoop$field_map.put("project_name", this.project_name);
    __sqoop$field_map.put("plan_name", this.plan_name);
    __sqoop$field_map.put("compile_time", this.compile_time);
    __sqoop$field_map.put("approval_year", this.approval_year);
    __sqoop$field_map.put("collection", this.collection);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
