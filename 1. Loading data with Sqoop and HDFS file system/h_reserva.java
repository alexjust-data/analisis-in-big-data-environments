// ORM class for table 'h_reserva'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Mar 23 10:05:31 CET 2023
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
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

public class h_reserva extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id_reserva", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.id_reserva = (Integer)value;
      }
    });
    setters.put("id_hotel", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.id_hotel = (Integer)value;
      }
    });
    setters.put("id_tipo_habitacion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.id_tipo_habitacion = (String)value;
      }
    });
    setters.put("id_regimen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.id_regimen = (String)value;
      }
    });
    setters.put("id_pais", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.id_pais = (String)value;
      }
    });
    setters.put("desc_tipo_cliente", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.desc_tipo_cliente = (String)value;
      }
    });
    setters.put("desc_canal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.desc_canal = (String)value;
      }
    });
    setters.put("fecha_venta", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.fecha_venta = (java.sql.Date)value;
      }
    });
    setters.put("fecha_entrada", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.fecha_entrada = (java.sql.Date)value;
      }
    });
    setters.put("fecha_salida", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.fecha_salida = (java.sql.Date)value;
      }
    });
    setters.put("fecha_cancelacion", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.fecha_cancelacion = (java.sql.Date)value;
      }
    });
    setters.put("importe", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.importe = (Double)value;
      }
    });
    setters.put("habitaciones", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.habitaciones = (Integer)value;
      }
    });
    setters.put("adultos", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.adultos = (Integer)value;
      }
    });
    setters.put("menores", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.menores = (Integer)value;
      }
    });
    setters.put("cunas", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        h_reserva.this.cunas = (Integer)value;
      }
    });
  }
  public h_reserva() {
    init0();
  }
  private Integer id_reserva;
  public Integer get_id_reserva() {
    return id_reserva;
  }
  public void set_id_reserva(Integer id_reserva) {
    this.id_reserva = id_reserva;
  }
  public h_reserva with_id_reserva(Integer id_reserva) {
    this.id_reserva = id_reserva;
    return this;
  }
  private Integer id_hotel;
  public Integer get_id_hotel() {
    return id_hotel;
  }
  public void set_id_hotel(Integer id_hotel) {
    this.id_hotel = id_hotel;
  }
  public h_reserva with_id_hotel(Integer id_hotel) {
    this.id_hotel = id_hotel;
    return this;
  }
  private String id_tipo_habitacion;
  public String get_id_tipo_habitacion() {
    return id_tipo_habitacion;
  }
  public void set_id_tipo_habitacion(String id_tipo_habitacion) {
    this.id_tipo_habitacion = id_tipo_habitacion;
  }
  public h_reserva with_id_tipo_habitacion(String id_tipo_habitacion) {
    this.id_tipo_habitacion = id_tipo_habitacion;
    return this;
  }
  private String id_regimen;
  public String get_id_regimen() {
    return id_regimen;
  }
  public void set_id_regimen(String id_regimen) {
    this.id_regimen = id_regimen;
  }
  public h_reserva with_id_regimen(String id_regimen) {
    this.id_regimen = id_regimen;
    return this;
  }
  private String id_pais;
  public String get_id_pais() {
    return id_pais;
  }
  public void set_id_pais(String id_pais) {
    this.id_pais = id_pais;
  }
  public h_reserva with_id_pais(String id_pais) {
    this.id_pais = id_pais;
    return this;
  }
  private String desc_tipo_cliente;
  public String get_desc_tipo_cliente() {
    return desc_tipo_cliente;
  }
  public void set_desc_tipo_cliente(String desc_tipo_cliente) {
    this.desc_tipo_cliente = desc_tipo_cliente;
  }
  public h_reserva with_desc_tipo_cliente(String desc_tipo_cliente) {
    this.desc_tipo_cliente = desc_tipo_cliente;
    return this;
  }
  private String desc_canal;
  public String get_desc_canal() {
    return desc_canal;
  }
  public void set_desc_canal(String desc_canal) {
    this.desc_canal = desc_canal;
  }
  public h_reserva with_desc_canal(String desc_canal) {
    this.desc_canal = desc_canal;
    return this;
  }
  private java.sql.Date fecha_venta;
  public java.sql.Date get_fecha_venta() {
    return fecha_venta;
  }
  public void set_fecha_venta(java.sql.Date fecha_venta) {
    this.fecha_venta = fecha_venta;
  }
  public h_reserva with_fecha_venta(java.sql.Date fecha_venta) {
    this.fecha_venta = fecha_venta;
    return this;
  }
  private java.sql.Date fecha_entrada;
  public java.sql.Date get_fecha_entrada() {
    return fecha_entrada;
  }
  public void set_fecha_entrada(java.sql.Date fecha_entrada) {
    this.fecha_entrada = fecha_entrada;
  }
  public h_reserva with_fecha_entrada(java.sql.Date fecha_entrada) {
    this.fecha_entrada = fecha_entrada;
    return this;
  }
  private java.sql.Date fecha_salida;
  public java.sql.Date get_fecha_salida() {
    return fecha_salida;
  }
  public void set_fecha_salida(java.sql.Date fecha_salida) {
    this.fecha_salida = fecha_salida;
  }
  public h_reserva with_fecha_salida(java.sql.Date fecha_salida) {
    this.fecha_salida = fecha_salida;
    return this;
  }
  private java.sql.Date fecha_cancelacion;
  public java.sql.Date get_fecha_cancelacion() {
    return fecha_cancelacion;
  }
  public void set_fecha_cancelacion(java.sql.Date fecha_cancelacion) {
    this.fecha_cancelacion = fecha_cancelacion;
  }
  public h_reserva with_fecha_cancelacion(java.sql.Date fecha_cancelacion) {
    this.fecha_cancelacion = fecha_cancelacion;
    return this;
  }
  private Double importe;
  public Double get_importe() {
    return importe;
  }
  public void set_importe(Double importe) {
    this.importe = importe;
  }
  public h_reserva with_importe(Double importe) {
    this.importe = importe;
    return this;
  }
  private Integer habitaciones;
  public Integer get_habitaciones() {
    return habitaciones;
  }
  public void set_habitaciones(Integer habitaciones) {
    this.habitaciones = habitaciones;
  }
  public h_reserva with_habitaciones(Integer habitaciones) {
    this.habitaciones = habitaciones;
    return this;
  }
  private Integer adultos;
  public Integer get_adultos() {
    return adultos;
  }
  public void set_adultos(Integer adultos) {
    this.adultos = adultos;
  }
  public h_reserva with_adultos(Integer adultos) {
    this.adultos = adultos;
    return this;
  }
  private Integer menores;
  public Integer get_menores() {
    return menores;
  }
  public void set_menores(Integer menores) {
    this.menores = menores;
  }
  public h_reserva with_menores(Integer menores) {
    this.menores = menores;
    return this;
  }
  private Integer cunas;
  public Integer get_cunas() {
    return cunas;
  }
  public void set_cunas(Integer cunas) {
    this.cunas = cunas;
  }
  public h_reserva with_cunas(Integer cunas) {
    this.cunas = cunas;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof h_reserva)) {
      return false;
    }
    h_reserva that = (h_reserva) o;
    boolean equal = true;
    equal = equal && (this.id_reserva == null ? that.id_reserva == null : this.id_reserva.equals(that.id_reserva));
    equal = equal && (this.id_hotel == null ? that.id_hotel == null : this.id_hotel.equals(that.id_hotel));
    equal = equal && (this.id_tipo_habitacion == null ? that.id_tipo_habitacion == null : this.id_tipo_habitacion.equals(that.id_tipo_habitacion));
    equal = equal && (this.id_regimen == null ? that.id_regimen == null : this.id_regimen.equals(that.id_regimen));
    equal = equal && (this.id_pais == null ? that.id_pais == null : this.id_pais.equals(that.id_pais));
    equal = equal && (this.desc_tipo_cliente == null ? that.desc_tipo_cliente == null : this.desc_tipo_cliente.equals(that.desc_tipo_cliente));
    equal = equal && (this.desc_canal == null ? that.desc_canal == null : this.desc_canal.equals(that.desc_canal));
    equal = equal && (this.fecha_venta == null ? that.fecha_venta == null : this.fecha_venta.equals(that.fecha_venta));
    equal = equal && (this.fecha_entrada == null ? that.fecha_entrada == null : this.fecha_entrada.equals(that.fecha_entrada));
    equal = equal && (this.fecha_salida == null ? that.fecha_salida == null : this.fecha_salida.equals(that.fecha_salida));
    equal = equal && (this.fecha_cancelacion == null ? that.fecha_cancelacion == null : this.fecha_cancelacion.equals(that.fecha_cancelacion));
    equal = equal && (this.importe == null ? that.importe == null : this.importe.equals(that.importe));
    equal = equal && (this.habitaciones == null ? that.habitaciones == null : this.habitaciones.equals(that.habitaciones));
    equal = equal && (this.adultos == null ? that.adultos == null : this.adultos.equals(that.adultos));
    equal = equal && (this.menores == null ? that.menores == null : this.menores.equals(that.menores));
    equal = equal && (this.cunas == null ? that.cunas == null : this.cunas.equals(that.cunas));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof h_reserva)) {
      return false;
    }
    h_reserva that = (h_reserva) o;
    boolean equal = true;
    equal = equal && (this.id_reserva == null ? that.id_reserva == null : this.id_reserva.equals(that.id_reserva));
    equal = equal && (this.id_hotel == null ? that.id_hotel == null : this.id_hotel.equals(that.id_hotel));
    equal = equal && (this.id_tipo_habitacion == null ? that.id_tipo_habitacion == null : this.id_tipo_habitacion.equals(that.id_tipo_habitacion));
    equal = equal && (this.id_regimen == null ? that.id_regimen == null : this.id_regimen.equals(that.id_regimen));
    equal = equal && (this.id_pais == null ? that.id_pais == null : this.id_pais.equals(that.id_pais));
    equal = equal && (this.desc_tipo_cliente == null ? that.desc_tipo_cliente == null : this.desc_tipo_cliente.equals(that.desc_tipo_cliente));
    equal = equal && (this.desc_canal == null ? that.desc_canal == null : this.desc_canal.equals(that.desc_canal));
    equal = equal && (this.fecha_venta == null ? that.fecha_venta == null : this.fecha_venta.equals(that.fecha_venta));
    equal = equal && (this.fecha_entrada == null ? that.fecha_entrada == null : this.fecha_entrada.equals(that.fecha_entrada));
    equal = equal && (this.fecha_salida == null ? that.fecha_salida == null : this.fecha_salida.equals(that.fecha_salida));
    equal = equal && (this.fecha_cancelacion == null ? that.fecha_cancelacion == null : this.fecha_cancelacion.equals(that.fecha_cancelacion));
    equal = equal && (this.importe == null ? that.importe == null : this.importe.equals(that.importe));
    equal = equal && (this.habitaciones == null ? that.habitaciones == null : this.habitaciones.equals(that.habitaciones));
    equal = equal && (this.adultos == null ? that.adultos == null : this.adultos.equals(that.adultos));
    equal = equal && (this.menores == null ? that.menores == null : this.menores.equals(that.menores));
    equal = equal && (this.cunas == null ? that.cunas == null : this.cunas.equals(that.cunas));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id_reserva = JdbcWritableBridge.readInteger(1, __dbResults);
    this.id_hotel = JdbcWritableBridge.readInteger(2, __dbResults);
    this.id_tipo_habitacion = JdbcWritableBridge.readString(3, __dbResults);
    this.id_regimen = JdbcWritableBridge.readString(4, __dbResults);
    this.id_pais = JdbcWritableBridge.readString(5, __dbResults);
    this.desc_tipo_cliente = JdbcWritableBridge.readString(6, __dbResults);
    this.desc_canal = JdbcWritableBridge.readString(7, __dbResults);
    this.fecha_venta = JdbcWritableBridge.readDate(8, __dbResults);
    this.fecha_entrada = JdbcWritableBridge.readDate(9, __dbResults);
    this.fecha_salida = JdbcWritableBridge.readDate(10, __dbResults);
    this.fecha_cancelacion = JdbcWritableBridge.readDate(11, __dbResults);
    this.importe = JdbcWritableBridge.readDouble(12, __dbResults);
    this.habitaciones = JdbcWritableBridge.readInteger(13, __dbResults);
    this.adultos = JdbcWritableBridge.readInteger(14, __dbResults);
    this.menores = JdbcWritableBridge.readInteger(15, __dbResults);
    this.cunas = JdbcWritableBridge.readInteger(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id_reserva = JdbcWritableBridge.readInteger(1, __dbResults);
    this.id_hotel = JdbcWritableBridge.readInteger(2, __dbResults);
    this.id_tipo_habitacion = JdbcWritableBridge.readString(3, __dbResults);
    this.id_regimen = JdbcWritableBridge.readString(4, __dbResults);
    this.id_pais = JdbcWritableBridge.readString(5, __dbResults);
    this.desc_tipo_cliente = JdbcWritableBridge.readString(6, __dbResults);
    this.desc_canal = JdbcWritableBridge.readString(7, __dbResults);
    this.fecha_venta = JdbcWritableBridge.readDate(8, __dbResults);
    this.fecha_entrada = JdbcWritableBridge.readDate(9, __dbResults);
    this.fecha_salida = JdbcWritableBridge.readDate(10, __dbResults);
    this.fecha_cancelacion = JdbcWritableBridge.readDate(11, __dbResults);
    this.importe = JdbcWritableBridge.readDouble(12, __dbResults);
    this.habitaciones = JdbcWritableBridge.readInteger(13, __dbResults);
    this.adultos = JdbcWritableBridge.readInteger(14, __dbResults);
    this.menores = JdbcWritableBridge.readInteger(15, __dbResults);
    this.cunas = JdbcWritableBridge.readInteger(16, __dbResults);
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
    JdbcWritableBridge.writeInteger(id_reserva, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_hotel, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(id_tipo_habitacion, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(id_regimen, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(id_pais, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(desc_tipo_cliente, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(desc_canal, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(fecha_venta, 8 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(fecha_entrada, 9 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(fecha_salida, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(fecha_cancelacion, 11 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDouble(importe, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(habitaciones, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(adultos, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(menores, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cunas, 16 + __off, 4, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id_reserva, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(id_hotel, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(id_tipo_habitacion, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(id_regimen, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(id_pais, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(desc_tipo_cliente, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(desc_canal, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDate(fecha_venta, 8 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(fecha_entrada, 9 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(fecha_salida, 10 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDate(fecha_cancelacion, 11 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeDouble(importe, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(habitaciones, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(adultos, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(menores, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cunas, 16 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id_reserva = null;
    } else {
    this.id_reserva = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_hotel = null;
    } else {
    this.id_hotel = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.id_tipo_habitacion = null;
    } else {
    this.id_tipo_habitacion = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.id_regimen = null;
    } else {
    this.id_regimen = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.id_pais = null;
    } else {
    this.id_pais = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.desc_tipo_cliente = null;
    } else {
    this.desc_tipo_cliente = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.desc_canal = null;
    } else {
    this.desc_canal = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.fecha_venta = null;
    } else {
    this.fecha_venta = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fecha_entrada = null;
    } else {
    this.fecha_entrada = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fecha_salida = null;
    } else {
    this.fecha_salida = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.fecha_cancelacion = null;
    } else {
    this.fecha_cancelacion = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.importe = null;
    } else {
    this.importe = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.habitaciones = null;
    } else {
    this.habitaciones = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.adultos = null;
    } else {
    this.adultos = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.menores = null;
    } else {
    this.menores = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cunas = null;
    } else {
    this.cunas = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id_reserva) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_reserva);
    }
    if (null == this.id_hotel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_hotel);
    }
    if (null == this.id_tipo_habitacion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_tipo_habitacion);
    }
    if (null == this.id_regimen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_regimen);
    }
    if (null == this.id_pais) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_pais);
    }
    if (null == this.desc_tipo_cliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, desc_tipo_cliente);
    }
    if (null == this.desc_canal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, desc_canal);
    }
    if (null == this.fecha_venta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha_venta.getTime());
    }
    if (null == this.fecha_entrada) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha_entrada.getTime());
    }
    if (null == this.fecha_salida) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha_salida.getTime());
    }
    if (null == this.fecha_cancelacion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha_cancelacion.getTime());
    }
    if (null == this.importe) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.importe);
    }
    if (null == this.habitaciones) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.habitaciones);
    }
    if (null == this.adultos) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.adultos);
    }
    if (null == this.menores) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.menores);
    }
    if (null == this.cunas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cunas);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id_reserva) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_reserva);
    }
    if (null == this.id_hotel) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id_hotel);
    }
    if (null == this.id_tipo_habitacion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_tipo_habitacion);
    }
    if (null == this.id_regimen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_regimen);
    }
    if (null == this.id_pais) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id_pais);
    }
    if (null == this.desc_tipo_cliente) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, desc_tipo_cliente);
    }
    if (null == this.desc_canal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, desc_canal);
    }
    if (null == this.fecha_venta) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha_venta.getTime());
    }
    if (null == this.fecha_entrada) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha_entrada.getTime());
    }
    if (null == this.fecha_salida) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha_salida.getTime());
    }
    if (null == this.fecha_cancelacion) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fecha_cancelacion.getTime());
    }
    if (null == this.importe) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.importe);
    }
    if (null == this.habitaciones) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.habitaciones);
    }
    if (null == this.adultos) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.adultos);
    }
    if (null == this.menores) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.menores);
    }
    if (null == this.cunas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cunas);
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
    __sb.append(FieldFormatter.escapeAndEnclose(id_reserva==null?"null":"" + id_reserva, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_hotel==null?"null":"" + id_hotel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_tipo_habitacion==null?"null":id_tipo_habitacion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_regimen==null?"null":id_regimen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_pais==null?"null":id_pais, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(desc_tipo_cliente==null?"null":desc_tipo_cliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(desc_canal==null?"null":desc_canal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha_venta==null?"null":"" + fecha_venta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha_entrada==null?"null":"" + fecha_entrada, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha_salida==null?"null":"" + fecha_salida, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha_cancelacion==null?"null":"" + fecha_cancelacion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(importe==null?"null":"" + importe, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(habitaciones==null?"null":"" + habitaciones, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(adultos==null?"null":"" + adultos, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(menores==null?"null":"" + menores, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cunas==null?"null":"" + cunas, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id_reserva==null?"null":"" + id_reserva, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_hotel==null?"null":"" + id_hotel, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_tipo_habitacion==null?"null":id_tipo_habitacion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_regimen==null?"null":id_regimen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(id_pais==null?"null":id_pais, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(desc_tipo_cliente==null?"null":desc_tipo_cliente, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(desc_canal==null?"null":desc_canal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha_venta==null?"null":"" + fecha_venta, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha_entrada==null?"null":"" + fecha_entrada, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha_salida==null?"null":"" + fecha_salida, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fecha_cancelacion==null?"null":"" + fecha_cancelacion, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(importe==null?"null":"" + importe, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(habitaciones==null?"null":"" + habitaciones, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(adultos==null?"null":"" + adultos, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(menores==null?"null":"" + menores, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cunas==null?"null":"" + cunas, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_reserva = null; } else {
      this.id_reserva = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_hotel = null; } else {
      this.id_hotel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.id_tipo_habitacion = null; } else {
      this.id_tipo_habitacion = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.id_regimen = null; } else {
      this.id_regimen = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.id_pais = null; } else {
      this.id_pais = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.desc_tipo_cliente = null; } else {
      this.desc_tipo_cliente = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.desc_canal = null; } else {
      this.desc_canal = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha_venta = null; } else {
      this.fecha_venta = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha_entrada = null; } else {
      this.fecha_entrada = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha_salida = null; } else {
      this.fecha_salida = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha_cancelacion = null; } else {
      this.fecha_cancelacion = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.importe = null; } else {
      this.importe = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.habitaciones = null; } else {
      this.habitaciones = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.adultos = null; } else {
      this.adultos = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.menores = null; } else {
      this.menores = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cunas = null; } else {
      this.cunas = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_reserva = null; } else {
      this.id_reserva = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id_hotel = null; } else {
      this.id_hotel = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.id_tipo_habitacion = null; } else {
      this.id_tipo_habitacion = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.id_regimen = null; } else {
      this.id_regimen = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.id_pais = null; } else {
      this.id_pais = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.desc_tipo_cliente = null; } else {
      this.desc_tipo_cliente = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.desc_canal = null; } else {
      this.desc_canal = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha_venta = null; } else {
      this.fecha_venta = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha_entrada = null; } else {
      this.fecha_entrada = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha_salida = null; } else {
      this.fecha_salida = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fecha_cancelacion = null; } else {
      this.fecha_cancelacion = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.importe = null; } else {
      this.importe = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.habitaciones = null; } else {
      this.habitaciones = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.adultos = null; } else {
      this.adultos = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.menores = null; } else {
      this.menores = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cunas = null; } else {
      this.cunas = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    h_reserva o = (h_reserva) super.clone();
    o.fecha_venta = (o.fecha_venta != null) ? (java.sql.Date) o.fecha_venta.clone() : null;
    o.fecha_entrada = (o.fecha_entrada != null) ? (java.sql.Date) o.fecha_entrada.clone() : null;
    o.fecha_salida = (o.fecha_salida != null) ? (java.sql.Date) o.fecha_salida.clone() : null;
    o.fecha_cancelacion = (o.fecha_cancelacion != null) ? (java.sql.Date) o.fecha_cancelacion.clone() : null;
    return o;
  }

  public void clone0(h_reserva o) throws CloneNotSupportedException {
    o.fecha_venta = (o.fecha_venta != null) ? (java.sql.Date) o.fecha_venta.clone() : null;
    o.fecha_entrada = (o.fecha_entrada != null) ? (java.sql.Date) o.fecha_entrada.clone() : null;
    o.fecha_salida = (o.fecha_salida != null) ? (java.sql.Date) o.fecha_salida.clone() : null;
    o.fecha_cancelacion = (o.fecha_cancelacion != null) ? (java.sql.Date) o.fecha_cancelacion.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id_reserva", this.id_reserva);
    __sqoop$field_map.put("id_hotel", this.id_hotel);
    __sqoop$field_map.put("id_tipo_habitacion", this.id_tipo_habitacion);
    __sqoop$field_map.put("id_regimen", this.id_regimen);
    __sqoop$field_map.put("id_pais", this.id_pais);
    __sqoop$field_map.put("desc_tipo_cliente", this.desc_tipo_cliente);
    __sqoop$field_map.put("desc_canal", this.desc_canal);
    __sqoop$field_map.put("fecha_venta", this.fecha_venta);
    __sqoop$field_map.put("fecha_entrada", this.fecha_entrada);
    __sqoop$field_map.put("fecha_salida", this.fecha_salida);
    __sqoop$field_map.put("fecha_cancelacion", this.fecha_cancelacion);
    __sqoop$field_map.put("importe", this.importe);
    __sqoop$field_map.put("habitaciones", this.habitaciones);
    __sqoop$field_map.put("adultos", this.adultos);
    __sqoop$field_map.put("menores", this.menores);
    __sqoop$field_map.put("cunas", this.cunas);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id_reserva", this.id_reserva);
    __sqoop$field_map.put("id_hotel", this.id_hotel);
    __sqoop$field_map.put("id_tipo_habitacion", this.id_tipo_habitacion);
    __sqoop$field_map.put("id_regimen", this.id_regimen);
    __sqoop$field_map.put("id_pais", this.id_pais);
    __sqoop$field_map.put("desc_tipo_cliente", this.desc_tipo_cliente);
    __sqoop$field_map.put("desc_canal", this.desc_canal);
    __sqoop$field_map.put("fecha_venta", this.fecha_venta);
    __sqoop$field_map.put("fecha_entrada", this.fecha_entrada);
    __sqoop$field_map.put("fecha_salida", this.fecha_salida);
    __sqoop$field_map.put("fecha_cancelacion", this.fecha_cancelacion);
    __sqoop$field_map.put("importe", this.importe);
    __sqoop$field_map.put("habitaciones", this.habitaciones);
    __sqoop$field_map.put("adultos", this.adultos);
    __sqoop$field_map.put("menores", this.menores);
    __sqoop$field_map.put("cunas", this.cunas);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
