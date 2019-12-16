// ORM class for table 'company_lawsuit'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Apr 23 00:01:37 CST 2019
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

public class codegen_company_lawsuit extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.id = (Long)value;
      }
    });
    setters.put("uuid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.uuid = (String)value;
      }
    });
    setters.put("docid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.docid = (String)value;
      }
    });
    setters.put("url", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.url = (String)value;
      }
    });
    setters.put("openlaw_seq", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.openlaw_seq = (Integer)value;
      }
    });
    setters.put("caseno", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.caseno = (String)value;
      }
    });
    setters.put("casetype", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.casetype = (String)value;
      }
    });
    setters.put("doctype", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.doctype = (String)value;
      }
    });
    setters.put("base", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.base = (String)value;
      }
    });
    setters.put("court", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.court = (String)value;
      }
    });
    setters.put("judgetime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.judgetime = (String)value;
      }
    });
    setters.put("submittime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.submittime = (java.sql.Timestamp)value;
      }
    });
    setters.put("title", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.title = (String)value;
      }
    });
    setters.put("plaintext", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.plaintext = (String)value;
      }
    });
    setters.put("head", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.head = (String)value;
      }
    });
    setters.put("partyInfo", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.partyInfo = (String)value;
      }
    });
    setters.put("lawsuit_record", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.lawsuit_record = (String)value;
      }
    });
    setters.put("fact", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.fact = (String)value;
      }
    });
    setters.put("reason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.reason = (String)value;
      }
    });
    setters.put("result", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.result = (String)value;
      }
    });
    setters.put("tail", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.tail = (String)value;
      }
    });
    setters.put("casereason", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.casereason = (String)value;
      }
    });
    setters.put("trialprocedure", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.trialprocedure = (String)value;
      }
    });
    setters.put("party", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.party = (String)value;
      }
    });
    setters.put("legalbasis", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.legalbasis = (String)value;
      }
    });
    setters.put("isdelete", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.isdelete = (Integer)value;
      }
    });
    setters.put("updatetime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.updatetime = (java.sql.Timestamp)value;
      }
    });
    setters.put("crawledtime", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.crawledtime = (java.sql.Timestamp)value;
      }
    });
    setters.put("crawle_source", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_company_lawsuit.this.crawle_source = (String)value;
      }
    });
  }
  public codegen_company_lawsuit() {
    init0();
  }
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public codegen_company_lawsuit with_id(Long id) {
    this.id = id;
    return this;
  }
  private String uuid;
  public String get_uuid() {
    return uuid;
  }
  public void set_uuid(String uuid) {
    this.uuid = uuid;
  }
  public codegen_company_lawsuit with_uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }
  private String docid;
  public String get_docid() {
    return docid;
  }
  public void set_docid(String docid) {
    this.docid = docid;
  }
  public codegen_company_lawsuit with_docid(String docid) {
    this.docid = docid;
    return this;
  }
  private String url;
  public String get_url() {
    return url;
  }
  public void set_url(String url) {
    this.url = url;
  }
  public codegen_company_lawsuit with_url(String url) {
    this.url = url;
    return this;
  }
  private Integer openlaw_seq;
  public Integer get_openlaw_seq() {
    return openlaw_seq;
  }
  public void set_openlaw_seq(Integer openlaw_seq) {
    this.openlaw_seq = openlaw_seq;
  }
  public codegen_company_lawsuit with_openlaw_seq(Integer openlaw_seq) {
    this.openlaw_seq = openlaw_seq;
    return this;
  }
  private String caseno;
  public String get_caseno() {
    return caseno;
  }
  public void set_caseno(String caseno) {
    this.caseno = caseno;
  }
  public codegen_company_lawsuit with_caseno(String caseno) {
    this.caseno = caseno;
    return this;
  }
  private String casetype;
  public String get_casetype() {
    return casetype;
  }
  public void set_casetype(String casetype) {
    this.casetype = casetype;
  }
  public codegen_company_lawsuit with_casetype(String casetype) {
    this.casetype = casetype;
    return this;
  }
  private String doctype;
  public String get_doctype() {
    return doctype;
  }
  public void set_doctype(String doctype) {
    this.doctype = doctype;
  }
  public codegen_company_lawsuit with_doctype(String doctype) {
    this.doctype = doctype;
    return this;
  }
  private String base;
  public String get_base() {
    return base;
  }
  public void set_base(String base) {
    this.base = base;
  }
  public codegen_company_lawsuit with_base(String base) {
    this.base = base;
    return this;
  }
  private String court;
  public String get_court() {
    return court;
  }
  public void set_court(String court) {
    this.court = court;
  }
  public codegen_company_lawsuit with_court(String court) {
    this.court = court;
    return this;
  }
  private String judgetime;
  public String get_judgetime() {
    return judgetime;
  }
  public void set_judgetime(String judgetime) {
    this.judgetime = judgetime;
  }
  public codegen_company_lawsuit with_judgetime(String judgetime) {
    this.judgetime = judgetime;
    return this;
  }
  private java.sql.Timestamp submittime;
  public java.sql.Timestamp get_submittime() {
    return submittime;
  }
  public void set_submittime(java.sql.Timestamp submittime) {
    this.submittime = submittime;
  }
  public codegen_company_lawsuit with_submittime(java.sql.Timestamp submittime) {
    this.submittime = submittime;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public codegen_company_lawsuit with_title(String title) {
    this.title = title;
    return this;
  }
  private String plaintext;
  public String get_plaintext() {
    return plaintext;
  }
  public void set_plaintext(String plaintext) {
    this.plaintext = plaintext;
  }
  public codegen_company_lawsuit with_plaintext(String plaintext) {
    this.plaintext = plaintext;
    return this;
  }
  private String head;
  public String get_head() {
    return head;
  }
  public void set_head(String head) {
    this.head = head;
  }
  public codegen_company_lawsuit with_head(String head) {
    this.head = head;
    return this;
  }
  private String partyInfo;
  public String get_partyInfo() {
    return partyInfo;
  }
  public void set_partyInfo(String partyInfo) {
    this.partyInfo = partyInfo;
  }
  public codegen_company_lawsuit with_partyInfo(String partyInfo) {
    this.partyInfo = partyInfo;
    return this;
  }
  private String lawsuit_record;
  public String get_lawsuit_record() {
    return lawsuit_record;
  }
  public void set_lawsuit_record(String lawsuit_record) {
    this.lawsuit_record = lawsuit_record;
  }
  public codegen_company_lawsuit with_lawsuit_record(String lawsuit_record) {
    this.lawsuit_record = lawsuit_record;
    return this;
  }
  private String fact;
  public String get_fact() {
    return fact;
  }
  public void set_fact(String fact) {
    this.fact = fact;
  }
  public codegen_company_lawsuit with_fact(String fact) {
    this.fact = fact;
    return this;
  }
  private String reason;
  public String get_reason() {
    return reason;
  }
  public void set_reason(String reason) {
    this.reason = reason;
  }
  public codegen_company_lawsuit with_reason(String reason) {
    this.reason = reason;
    return this;
  }
  private String result;
  public String get_result() {
    return result;
  }
  public void set_result(String result) {
    this.result = result;
  }
  public codegen_company_lawsuit with_result(String result) {
    this.result = result;
    return this;
  }
  private String tail;
  public String get_tail() {
    return tail;
  }
  public void set_tail(String tail) {
    this.tail = tail;
  }
  public codegen_company_lawsuit with_tail(String tail) {
    this.tail = tail;
    return this;
  }
  private String casereason;
  public String get_casereason() {
    return casereason;
  }
  public void set_casereason(String casereason) {
    this.casereason = casereason;
  }
  public codegen_company_lawsuit with_casereason(String casereason) {
    this.casereason = casereason;
    return this;
  }
  private String trialprocedure;
  public String get_trialprocedure() {
    return trialprocedure;
  }
  public void set_trialprocedure(String trialprocedure) {
    this.trialprocedure = trialprocedure;
  }
  public codegen_company_lawsuit with_trialprocedure(String trialprocedure) {
    this.trialprocedure = trialprocedure;
    return this;
  }
  private String party;
  public String get_party() {
    return party;
  }
  public void set_party(String party) {
    this.party = party;
  }
  public codegen_company_lawsuit with_party(String party) {
    this.party = party;
    return this;
  }
  private String legalbasis;
  public String get_legalbasis() {
    return legalbasis;
  }
  public void set_legalbasis(String legalbasis) {
    this.legalbasis = legalbasis;
  }
  public codegen_company_lawsuit with_legalbasis(String legalbasis) {
    this.legalbasis = legalbasis;
    return this;
  }
  private Integer isdelete;
  public Integer get_isdelete() {
    return isdelete;
  }
  public void set_isdelete(Integer isdelete) {
    this.isdelete = isdelete;
  }
  public codegen_company_lawsuit with_isdelete(Integer isdelete) {
    this.isdelete = isdelete;
    return this;
  }
  private java.sql.Timestamp updatetime;
  public java.sql.Timestamp get_updatetime() {
    return updatetime;
  }
  public void set_updatetime(java.sql.Timestamp updatetime) {
    this.updatetime = updatetime;
  }
  public codegen_company_lawsuit with_updatetime(java.sql.Timestamp updatetime) {
    this.updatetime = updatetime;
    return this;
  }
  private java.sql.Timestamp crawledtime;
  public java.sql.Timestamp get_crawledtime() {
    return crawledtime;
  }
  public void set_crawledtime(java.sql.Timestamp crawledtime) {
    this.crawledtime = crawledtime;
  }
  public codegen_company_lawsuit with_crawledtime(java.sql.Timestamp crawledtime) {
    this.crawledtime = crawledtime;
    return this;
  }
  private String crawle_source;
  public String get_crawle_source() {
    return crawle_source;
  }
  public void set_crawle_source(String crawle_source) {
    this.crawle_source = crawle_source;
  }
  public codegen_company_lawsuit with_crawle_source(String crawle_source) {
    this.crawle_source = crawle_source;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_company_lawsuit)) {
      return false;
    }
    codegen_company_lawsuit that = (codegen_company_lawsuit) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.uuid == null ? that.uuid == null : this.uuid.equals(that.uuid));
    equal = equal && (this.docid == null ? that.docid == null : this.docid.equals(that.docid));
    equal = equal && (this.url == null ? that.url == null : this.url.equals(that.url));
    equal = equal && (this.openlaw_seq == null ? that.openlaw_seq == null : this.openlaw_seq.equals(that.openlaw_seq));
    equal = equal && (this.caseno == null ? that.caseno == null : this.caseno.equals(that.caseno));
    equal = equal && (this.casetype == null ? that.casetype == null : this.casetype.equals(that.casetype));
    equal = equal && (this.doctype == null ? that.doctype == null : this.doctype.equals(that.doctype));
    equal = equal && (this.base == null ? that.base == null : this.base.equals(that.base));
    equal = equal && (this.court == null ? that.court == null : this.court.equals(that.court));
    equal = equal && (this.judgetime == null ? that.judgetime == null : this.judgetime.equals(that.judgetime));
    equal = equal && (this.submittime == null ? that.submittime == null : this.submittime.equals(that.submittime));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.plaintext == null ? that.plaintext == null : this.plaintext.equals(that.plaintext));
    equal = equal && (this.head == null ? that.head == null : this.head.equals(that.head));
    equal = equal && (this.partyInfo == null ? that.partyInfo == null : this.partyInfo.equals(that.partyInfo));
    equal = equal && (this.lawsuit_record == null ? that.lawsuit_record == null : this.lawsuit_record.equals(that.lawsuit_record));
    equal = equal && (this.fact == null ? that.fact == null : this.fact.equals(that.fact));
    equal = equal && (this.reason == null ? that.reason == null : this.reason.equals(that.reason));
    equal = equal && (this.result == null ? that.result == null : this.result.equals(that.result));
    equal = equal && (this.tail == null ? that.tail == null : this.tail.equals(that.tail));
    equal = equal && (this.casereason == null ? that.casereason == null : this.casereason.equals(that.casereason));
    equal = equal && (this.trialprocedure == null ? that.trialprocedure == null : this.trialprocedure.equals(that.trialprocedure));
    equal = equal && (this.party == null ? that.party == null : this.party.equals(that.party));
    equal = equal && (this.legalbasis == null ? that.legalbasis == null : this.legalbasis.equals(that.legalbasis));
    equal = equal && (this.isdelete == null ? that.isdelete == null : this.isdelete.equals(that.isdelete));
    equal = equal && (this.updatetime == null ? that.updatetime == null : this.updatetime.equals(that.updatetime));
    equal = equal && (this.crawledtime == null ? that.crawledtime == null : this.crawledtime.equals(that.crawledtime));
    equal = equal && (this.crawle_source == null ? that.crawle_source == null : this.crawle_source.equals(that.crawle_source));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_company_lawsuit)) {
      return false;
    }
    codegen_company_lawsuit that = (codegen_company_lawsuit) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.uuid == null ? that.uuid == null : this.uuid.equals(that.uuid));
    equal = equal && (this.docid == null ? that.docid == null : this.docid.equals(that.docid));
    equal = equal && (this.url == null ? that.url == null : this.url.equals(that.url));
    equal = equal && (this.openlaw_seq == null ? that.openlaw_seq == null : this.openlaw_seq.equals(that.openlaw_seq));
    equal = equal && (this.caseno == null ? that.caseno == null : this.caseno.equals(that.caseno));
    equal = equal && (this.casetype == null ? that.casetype == null : this.casetype.equals(that.casetype));
    equal = equal && (this.doctype == null ? that.doctype == null : this.doctype.equals(that.doctype));
    equal = equal && (this.base == null ? that.base == null : this.base.equals(that.base));
    equal = equal && (this.court == null ? that.court == null : this.court.equals(that.court));
    equal = equal && (this.judgetime == null ? that.judgetime == null : this.judgetime.equals(that.judgetime));
    equal = equal && (this.submittime == null ? that.submittime == null : this.submittime.equals(that.submittime));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.plaintext == null ? that.plaintext == null : this.plaintext.equals(that.plaintext));
    equal = equal && (this.head == null ? that.head == null : this.head.equals(that.head));
    equal = equal && (this.partyInfo == null ? that.partyInfo == null : this.partyInfo.equals(that.partyInfo));
    equal = equal && (this.lawsuit_record == null ? that.lawsuit_record == null : this.lawsuit_record.equals(that.lawsuit_record));
    equal = equal && (this.fact == null ? that.fact == null : this.fact.equals(that.fact));
    equal = equal && (this.reason == null ? that.reason == null : this.reason.equals(that.reason));
    equal = equal && (this.result == null ? that.result == null : this.result.equals(that.result));
    equal = equal && (this.tail == null ? that.tail == null : this.tail.equals(that.tail));
    equal = equal && (this.casereason == null ? that.casereason == null : this.casereason.equals(that.casereason));
    equal = equal && (this.trialprocedure == null ? that.trialprocedure == null : this.trialprocedure.equals(that.trialprocedure));
    equal = equal && (this.party == null ? that.party == null : this.party.equals(that.party));
    equal = equal && (this.legalbasis == null ? that.legalbasis == null : this.legalbasis.equals(that.legalbasis));
    equal = equal && (this.isdelete == null ? that.isdelete == null : this.isdelete.equals(that.isdelete));
    equal = equal && (this.updatetime == null ? that.updatetime == null : this.updatetime.equals(that.updatetime));
    equal = equal && (this.crawledtime == null ? that.crawledtime == null : this.crawledtime.equals(that.crawledtime));
    equal = equal && (this.crawle_source == null ? that.crawle_source == null : this.crawle_source.equals(that.crawle_source));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.uuid = JdbcWritableBridge.readString(2, __dbResults);
    this.docid = JdbcWritableBridge.readString(3, __dbResults);
    this.url = JdbcWritableBridge.readString(4, __dbResults);
    this.openlaw_seq = JdbcWritableBridge.readInteger(5, __dbResults);
    this.caseno = JdbcWritableBridge.readString(6, __dbResults);
    this.casetype = JdbcWritableBridge.readString(7, __dbResults);
    this.doctype = JdbcWritableBridge.readString(8, __dbResults);
    this.base = JdbcWritableBridge.readString(9, __dbResults);
    this.court = JdbcWritableBridge.readString(10, __dbResults);
    this.judgetime = JdbcWritableBridge.readString(11, __dbResults);
    this.submittime = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.title = JdbcWritableBridge.readString(13, __dbResults);
    this.plaintext = JdbcWritableBridge.readString(14, __dbResults);
    this.head = JdbcWritableBridge.readString(15, __dbResults);
    this.partyInfo = JdbcWritableBridge.readString(16, __dbResults);
    this.lawsuit_record = JdbcWritableBridge.readString(17, __dbResults);
    this.fact = JdbcWritableBridge.readString(18, __dbResults);
    this.reason = JdbcWritableBridge.readString(19, __dbResults);
    this.result = JdbcWritableBridge.readString(20, __dbResults);
    this.tail = JdbcWritableBridge.readString(21, __dbResults);
    this.casereason = JdbcWritableBridge.readString(22, __dbResults);
    this.trialprocedure = JdbcWritableBridge.readString(23, __dbResults);
    this.party = JdbcWritableBridge.readString(24, __dbResults);
    this.legalbasis = JdbcWritableBridge.readString(25, __dbResults);
    this.isdelete = JdbcWritableBridge.readInteger(26, __dbResults);
    this.updatetime = JdbcWritableBridge.readTimestamp(27, __dbResults);
    this.crawledtime = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.crawle_source = JdbcWritableBridge.readString(29, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.uuid = JdbcWritableBridge.readString(2, __dbResults);
    this.docid = JdbcWritableBridge.readString(3, __dbResults);
    this.url = JdbcWritableBridge.readString(4, __dbResults);
    this.openlaw_seq = JdbcWritableBridge.readInteger(5, __dbResults);
    this.caseno = JdbcWritableBridge.readString(6, __dbResults);
    this.casetype = JdbcWritableBridge.readString(7, __dbResults);
    this.doctype = JdbcWritableBridge.readString(8, __dbResults);
    this.base = JdbcWritableBridge.readString(9, __dbResults);
    this.court = JdbcWritableBridge.readString(10, __dbResults);
    this.judgetime = JdbcWritableBridge.readString(11, __dbResults);
    this.submittime = JdbcWritableBridge.readTimestamp(12, __dbResults);
    this.title = JdbcWritableBridge.readString(13, __dbResults);
    this.plaintext = JdbcWritableBridge.readString(14, __dbResults);
    this.head = JdbcWritableBridge.readString(15, __dbResults);
    this.partyInfo = JdbcWritableBridge.readString(16, __dbResults);
    this.lawsuit_record = JdbcWritableBridge.readString(17, __dbResults);
    this.fact = JdbcWritableBridge.readString(18, __dbResults);
    this.reason = JdbcWritableBridge.readString(19, __dbResults);
    this.result = JdbcWritableBridge.readString(20, __dbResults);
    this.tail = JdbcWritableBridge.readString(21, __dbResults);
    this.casereason = JdbcWritableBridge.readString(22, __dbResults);
    this.trialprocedure = JdbcWritableBridge.readString(23, __dbResults);
    this.party = JdbcWritableBridge.readString(24, __dbResults);
    this.legalbasis = JdbcWritableBridge.readString(25, __dbResults);
    this.isdelete = JdbcWritableBridge.readInteger(26, __dbResults);
    this.updatetime = JdbcWritableBridge.readTimestamp(27, __dbResults);
    this.crawledtime = JdbcWritableBridge.readTimestamp(28, __dbResults);
    this.crawle_source = JdbcWritableBridge.readString(29, __dbResults);
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
    JdbcWritableBridge.writeString(uuid, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(docid, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(url, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(openlaw_seq, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(caseno, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(casetype, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(doctype, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(base, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(court, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(judgetime, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(submittime, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(title, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(plaintext, 14 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(head, 15 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(partyInfo, 16 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(lawsuit_record, 17 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(fact, 18 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(reason, 19 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(result, 20 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(tail, 21 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(casereason, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(trialprocedure, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(party, 24 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(legalbasis, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(isdelete, 26 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updatetime, 27 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(crawledtime, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(crawle_source, 29 + __off, 12, __dbStmt);
    return 29;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(uuid, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(docid, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(url, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(openlaw_seq, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(caseno, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(casetype, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(doctype, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(base, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(court, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(judgetime, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(submittime, 12 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(title, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(plaintext, 14 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(head, 15 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(partyInfo, 16 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(lawsuit_record, 17 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(fact, 18 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(reason, 19 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(result, 20 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(tail, 21 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(casereason, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(trialprocedure, 23 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(party, 24 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(legalbasis, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(isdelete, 26 + __off, 5, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updatetime, 27 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(crawledtime, 28 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(crawle_source, 29 + __off, 12, __dbStmt);
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
        this.uuid = null;
    } else {
    this.uuid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.docid = null;
    } else {
    this.docid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.url = null;
    } else {
    this.url = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.openlaw_seq = null;
    } else {
    this.openlaw_seq = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.caseno = null;
    } else {
    this.caseno = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.casetype = null;
    } else {
    this.casetype = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.doctype = null;
    } else {
    this.doctype = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.base = null;
    } else {
    this.base = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.court = null;
    } else {
    this.court = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.judgetime = null;
    } else {
    this.judgetime = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.submittime = null;
    } else {
    this.submittime = new Timestamp(__dataIn.readLong());
    this.submittime.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.plaintext = null;
    } else {
    this.plaintext = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.head = null;
    } else {
    this.head = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.partyInfo = null;
    } else {
    this.partyInfo = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lawsuit_record = null;
    } else {
    this.lawsuit_record = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fact = null;
    } else {
    this.fact = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.reason = null;
    } else {
    this.reason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.result = null;
    } else {
    this.result = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tail = null;
    } else {
    this.tail = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.casereason = null;
    } else {
    this.casereason = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.trialprocedure = null;
    } else {
    this.trialprocedure = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.party = null;
    } else {
    this.party = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.legalbasis = null;
    } else {
    this.legalbasis = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.isdelete = null;
    } else {
    this.isdelete = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.updatetime = null;
    } else {
    this.updatetime = new Timestamp(__dataIn.readLong());
    this.updatetime.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.crawledtime = null;
    } else {
    this.crawledtime = new Timestamp(__dataIn.readLong());
    this.crawledtime.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.crawle_source = null;
    } else {
    this.crawle_source = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.uuid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, uuid);
    }
    if (null == this.docid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, docid);
    }
    if (null == this.url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, url);
    }
    if (null == this.openlaw_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.openlaw_seq);
    }
    if (null == this.caseno) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, caseno);
    }
    if (null == this.casetype) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, casetype);
    }
    if (null == this.doctype) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, doctype);
    }
    if (null == this.base) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, base);
    }
    if (null == this.court) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, court);
    }
    if (null == this.judgetime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, judgetime);
    }
    if (null == this.submittime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.submittime.getTime());
    __dataOut.writeInt(this.submittime.getNanos());
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.plaintext) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, plaintext);
    }
    if (null == this.head) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, head);
    }
    if (null == this.partyInfo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, partyInfo);
    }
    if (null == this.lawsuit_record) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lawsuit_record);
    }
    if (null == this.fact) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fact);
    }
    if (null == this.reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reason);
    }
    if (null == this.result) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, result);
    }
    if (null == this.tail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tail);
    }
    if (null == this.casereason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, casereason);
    }
    if (null == this.trialprocedure) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, trialprocedure);
    }
    if (null == this.party) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, party);
    }
    if (null == this.legalbasis) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, legalbasis);
    }
    if (null == this.isdelete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.isdelete);
    }
    if (null == this.updatetime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.updatetime.getTime());
    __dataOut.writeInt(this.updatetime.getNanos());
    }
    if (null == this.crawledtime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.crawledtime.getTime());
    __dataOut.writeInt(this.crawledtime.getNanos());
    }
    if (null == this.crawle_source) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, crawle_source);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.uuid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, uuid);
    }
    if (null == this.docid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, docid);
    }
    if (null == this.url) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, url);
    }
    if (null == this.openlaw_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.openlaw_seq);
    }
    if (null == this.caseno) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, caseno);
    }
    if (null == this.casetype) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, casetype);
    }
    if (null == this.doctype) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, doctype);
    }
    if (null == this.base) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, base);
    }
    if (null == this.court) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, court);
    }
    if (null == this.judgetime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, judgetime);
    }
    if (null == this.submittime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.submittime.getTime());
    __dataOut.writeInt(this.submittime.getNanos());
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.plaintext) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, plaintext);
    }
    if (null == this.head) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, head);
    }
    if (null == this.partyInfo) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, partyInfo);
    }
    if (null == this.lawsuit_record) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lawsuit_record);
    }
    if (null == this.fact) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, fact);
    }
    if (null == this.reason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, reason);
    }
    if (null == this.result) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, result);
    }
    if (null == this.tail) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tail);
    }
    if (null == this.casereason) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, casereason);
    }
    if (null == this.trialprocedure) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, trialprocedure);
    }
    if (null == this.party) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, party);
    }
    if (null == this.legalbasis) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, legalbasis);
    }
    if (null == this.isdelete) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.isdelete);
    }
    if (null == this.updatetime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.updatetime.getTime());
    __dataOut.writeInt(this.updatetime.getNanos());
    }
    if (null == this.crawledtime) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.crawledtime.getTime());
    __dataOut.writeInt(this.crawledtime.getNanos());
    }
    if (null == this.crawle_source) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, crawle_source);
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
    __sb.append(FieldFormatter.escapeAndEnclose(uuid==null?"null":uuid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(docid==null?"null":docid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(url==null?"null":url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(openlaw_seq==null?"null":"" + openlaw_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(caseno==null?"null":caseno, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(casetype==null?"null":casetype, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(doctype==null?"null":doctype, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(base==null?"null":base, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(court==null?"null":court, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(judgetime==null?"null":judgetime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(submittime==null?"null":"" + submittime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(plaintext==null?"null":plaintext, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(head==null?"null":head, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partyInfo==null?"null":partyInfo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawsuit_record==null?"null":lawsuit_record, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fact==null?"null":fact, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reason==null?"null":reason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(result==null?"null":result, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tail==null?"null":tail, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(casereason==null?"null":casereason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(trialprocedure==null?"null":trialprocedure, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(party==null?"null":party, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(legalbasis==null?"null":legalbasis, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(isdelete==null?"null":"" + isdelete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updatetime==null?"null":"" + updatetime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(crawledtime==null?"null":"" + crawledtime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(crawle_source==null?"null":crawle_source, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(uuid==null?"null":uuid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(docid==null?"null":docid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(url==null?"null":url, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(openlaw_seq==null?"null":"" + openlaw_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(caseno==null?"null":caseno, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(casetype==null?"null":casetype, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(doctype==null?"null":doctype, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(base==null?"null":base, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(court==null?"null":court, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(judgetime==null?"null":judgetime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(submittime==null?"null":"" + submittime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(plaintext==null?"null":plaintext, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(head==null?"null":head, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(partyInfo==null?"null":partyInfo, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lawsuit_record==null?"null":lawsuit_record, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fact==null?"null":fact, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reason==null?"null":reason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(result==null?"null":result, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tail==null?"null":tail, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(casereason==null?"null":casereason, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(trialprocedure==null?"null":trialprocedure, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(party==null?"null":party, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(legalbasis==null?"null":legalbasis, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(isdelete==null?"null":"" + isdelete, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updatetime==null?"null":"" + updatetime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(crawledtime==null?"null":"" + crawledtime, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(crawle_source==null?"null":crawle_source, delimiters));
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
    if (__cur_str.equals("null")) { this.uuid = null; } else {
      this.uuid = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.docid = null; } else {
      this.docid = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.openlaw_seq = null; } else {
      this.openlaw_seq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.caseno = null; } else {
      this.caseno = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.casetype = null; } else {
      this.casetype = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.doctype = null; } else {
      this.doctype = __cur_str;
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
    if (__cur_str.equals("null")) { this.court = null; } else {
      this.court = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.judgetime = null; } else {
      this.judgetime = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.submittime = null; } else {
      this.submittime = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.plaintext = null; } else {
      this.plaintext = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.head = null; } else {
      this.head = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.partyInfo = null; } else {
      this.partyInfo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.lawsuit_record = null; } else {
      this.lawsuit_record = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fact = null; } else {
      this.fact = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.reason = null; } else {
      this.reason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.result = null; } else {
      this.result = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.tail = null; } else {
      this.tail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.casereason = null; } else {
      this.casereason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.trialprocedure = null; } else {
      this.trialprocedure = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.party = null; } else {
      this.party = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.legalbasis = null; } else {
      this.legalbasis = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.isdelete = null; } else {
      this.isdelete = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.crawledtime = null; } else {
      this.crawledtime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.crawle_source = null; } else {
      this.crawle_source = __cur_str;
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
    if (__cur_str.equals("null")) { this.uuid = null; } else {
      this.uuid = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.docid = null; } else {
      this.docid = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.openlaw_seq = null; } else {
      this.openlaw_seq = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.caseno = null; } else {
      this.caseno = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.casetype = null; } else {
      this.casetype = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.doctype = null; } else {
      this.doctype = __cur_str;
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
    if (__cur_str.equals("null")) { this.court = null; } else {
      this.court = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.judgetime = null; } else {
      this.judgetime = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.submittime = null; } else {
      this.submittime = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.plaintext = null; } else {
      this.plaintext = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.head = null; } else {
      this.head = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.partyInfo = null; } else {
      this.partyInfo = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.lawsuit_record = null; } else {
      this.lawsuit_record = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.fact = null; } else {
      this.fact = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.reason = null; } else {
      this.reason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.result = null; } else {
      this.result = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.tail = null; } else {
      this.tail = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.casereason = null; } else {
      this.casereason = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.trialprocedure = null; } else {
      this.trialprocedure = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.party = null; } else {
      this.party = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.legalbasis = null; } else {
      this.legalbasis = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.isdelete = null; } else {
      this.isdelete = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.crawledtime = null; } else {
      this.crawledtime = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.crawle_source = null; } else {
      this.crawle_source = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_company_lawsuit o = (codegen_company_lawsuit) super.clone();
    o.submittime = (o.submittime != null) ? (java.sql.Timestamp) o.submittime.clone() : null;
    o.updatetime = (o.updatetime != null) ? (java.sql.Timestamp) o.updatetime.clone() : null;
    o.crawledtime = (o.crawledtime != null) ? (java.sql.Timestamp) o.crawledtime.clone() : null;
    return o;
  }

  public void clone0(codegen_company_lawsuit o) throws CloneNotSupportedException {
    o.submittime = (o.submittime != null) ? (java.sql.Timestamp) o.submittime.clone() : null;
    o.updatetime = (o.updatetime != null) ? (java.sql.Timestamp) o.updatetime.clone() : null;
    o.crawledtime = (o.crawledtime != null) ? (java.sql.Timestamp) o.crawledtime.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("uuid", this.uuid);
    __sqoop$field_map.put("docid", this.docid);
    __sqoop$field_map.put("url", this.url);
    __sqoop$field_map.put("openlaw_seq", this.openlaw_seq);
    __sqoop$field_map.put("caseno", this.caseno);
    __sqoop$field_map.put("casetype", this.casetype);
    __sqoop$field_map.put("doctype", this.doctype);
    __sqoop$field_map.put("base", this.base);
    __sqoop$field_map.put("court", this.court);
    __sqoop$field_map.put("judgetime", this.judgetime);
    __sqoop$field_map.put("submittime", this.submittime);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("plaintext", this.plaintext);
    __sqoop$field_map.put("head", this.head);
    __sqoop$field_map.put("partyInfo", this.partyInfo);
    __sqoop$field_map.put("lawsuit_record", this.lawsuit_record);
    __sqoop$field_map.put("fact", this.fact);
    __sqoop$field_map.put("reason", this.reason);
    __sqoop$field_map.put("result", this.result);
    __sqoop$field_map.put("tail", this.tail);
    __sqoop$field_map.put("casereason", this.casereason);
    __sqoop$field_map.put("trialprocedure", this.trialprocedure);
    __sqoop$field_map.put("party", this.party);
    __sqoop$field_map.put("legalbasis", this.legalbasis);
    __sqoop$field_map.put("isdelete", this.isdelete);
    __sqoop$field_map.put("updatetime", this.updatetime);
    __sqoop$field_map.put("crawledtime", this.crawledtime);
    __sqoop$field_map.put("crawle_source", this.crawle_source);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("uuid", this.uuid);
    __sqoop$field_map.put("docid", this.docid);
    __sqoop$field_map.put("url", this.url);
    __sqoop$field_map.put("openlaw_seq", this.openlaw_seq);
    __sqoop$field_map.put("caseno", this.caseno);
    __sqoop$field_map.put("casetype", this.casetype);
    __sqoop$field_map.put("doctype", this.doctype);
    __sqoop$field_map.put("base", this.base);
    __sqoop$field_map.put("court", this.court);
    __sqoop$field_map.put("judgetime", this.judgetime);
    __sqoop$field_map.put("submittime", this.submittime);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("plaintext", this.plaintext);
    __sqoop$field_map.put("head", this.head);
    __sqoop$field_map.put("partyInfo", this.partyInfo);
    __sqoop$field_map.put("lawsuit_record", this.lawsuit_record);
    __sqoop$field_map.put("fact", this.fact);
    __sqoop$field_map.put("reason", this.reason);
    __sqoop$field_map.put("result", this.result);
    __sqoop$field_map.put("tail", this.tail);
    __sqoop$field_map.put("casereason", this.casereason);
    __sqoop$field_map.put("trialprocedure", this.trialprocedure);
    __sqoop$field_map.put("party", this.party);
    __sqoop$field_map.put("legalbasis", this.legalbasis);
    __sqoop$field_map.put("isdelete", this.isdelete);
    __sqoop$field_map.put("updatetime", this.updatetime);
    __sqoop$field_map.put("crawledtime", this.crawledtime);
    __sqoop$field_map.put("crawle_source", this.crawle_source);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
