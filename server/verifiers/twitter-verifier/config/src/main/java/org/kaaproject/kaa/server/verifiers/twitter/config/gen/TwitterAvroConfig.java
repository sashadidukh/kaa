/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.verifiers.twitter.config.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TwitterAvroConfig extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TwitterAvroConfig\",\"namespace\":\"org.kaaproject.kaa.server.verifiers.twitter.config.gen\",\"fields\":[{\"name\":\"consumer_key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Consumer key\"},{\"name\":\"consumer_secret\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Consumer Secret\"},{\"name\":\"max_parallel_connections\",\"type\":\"int\",\"displayName\":\"Maximal number of allowed connections per verifier\",\"by_default\":\"5\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.String consumer_key;
   private java.lang.String consumer_secret;
   private int max_parallel_connections;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public TwitterAvroConfig() {}

  /**
   * All-args constructor.
   */
  public TwitterAvroConfig(java.lang.String consumer_key, java.lang.String consumer_secret, java.lang.Integer max_parallel_connections) {
    this.consumer_key = consumer_key;
    this.consumer_secret = consumer_secret;
    this.max_parallel_connections = max_parallel_connections;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return consumer_key;
    case 1: return consumer_secret;
    case 2: return max_parallel_connections;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: consumer_key = (java.lang.String)value$; break;
    case 1: consumer_secret = (java.lang.String)value$; break;
    case 2: max_parallel_connections = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'consumer_key' field.
   */
  public java.lang.String getConsumerKey() {
    return consumer_key;
  }

  /**
   * Sets the value of the 'consumer_key' field.
   * @param value the value to set.
   */
  public void setConsumerKey(java.lang.String value) {
    this.consumer_key = value;
  }

  /**
   * Gets the value of the 'consumer_secret' field.
   */
  public java.lang.String getConsumerSecret() {
    return consumer_secret;
  }

  /**
   * Sets the value of the 'consumer_secret' field.
   * @param value the value to set.
   */
  public void setConsumerSecret(java.lang.String value) {
    this.consumer_secret = value;
  }

  /**
   * Gets the value of the 'max_parallel_connections' field.
   */
  public java.lang.Integer getMaxParallelConnections() {
    return max_parallel_connections;
  }

  /**
   * Sets the value of the 'max_parallel_connections' field.
   * @param value the value to set.
   */
  public void setMaxParallelConnections(java.lang.Integer value) {
    this.max_parallel_connections = value;
  }

  /** Creates a new TwitterAvroConfig RecordBuilder */
  public static org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.Builder newBuilder() {
    return new org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.Builder();
  }
  
  /** Creates a new TwitterAvroConfig RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.Builder newBuilder(org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.Builder other) {
    return new org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.Builder(other);
  }
  
  /** Creates a new TwitterAvroConfig RecordBuilder by copying an existing TwitterAvroConfig instance */
  public static org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.Builder newBuilder(org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig other) {
    return new org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.Builder(other);
  }
  
  /**
   * RecordBuilder for TwitterAvroConfig instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TwitterAvroConfig>
    implements org.apache.avro.data.RecordBuilder<TwitterAvroConfig> {

    private java.lang.String consumer_key;
    private java.lang.String consumer_secret;
    private int max_parallel_connections;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.consumer_key)) {
        this.consumer_key = data().deepCopy(fields()[0].schema(), other.consumer_key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.consumer_secret)) {
        this.consumer_secret = data().deepCopy(fields()[1].schema(), other.consumer_secret);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.max_parallel_connections)) {
        this.max_parallel_connections = data().deepCopy(fields()[2].schema(), other.max_parallel_connections);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing TwitterAvroConfig instance */
    private Builder(org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig other) {
            super(org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.SCHEMA$);
      if (isValidValue(fields()[0], other.consumer_key)) {
        this.consumer_key = data().deepCopy(fields()[0].schema(), other.consumer_key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.consumer_secret)) {
        this.consumer_secret = data().deepCopy(fields()[1].schema(), other.consumer_secret);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.max_parallel_connections)) {
        this.max_parallel_connections = data().deepCopy(fields()[2].schema(), other.max_parallel_connections);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'consumer_key' field */
    public java.lang.String getConsumerKey() {
      return consumer_key;
    }
    
    /** Sets the value of the 'consumer_key' field */
    public org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.Builder setConsumerKey(java.lang.String value) {
      validate(fields()[0], value);
      this.consumer_key = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'consumer_key' field has been set */
    public boolean hasConsumerKey() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'consumer_key' field */
    public org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.Builder clearConsumerKey() {
      consumer_key = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'consumer_secret' field */
    public java.lang.String getConsumerSecret() {
      return consumer_secret;
    }
    
    /** Sets the value of the 'consumer_secret' field */
    public org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.Builder setConsumerSecret(java.lang.String value) {
      validate(fields()[1], value);
      this.consumer_secret = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'consumer_secret' field has been set */
    public boolean hasConsumerSecret() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'consumer_secret' field */
    public org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.Builder clearConsumerSecret() {
      consumer_secret = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'max_parallel_connections' field */
    public java.lang.Integer getMaxParallelConnections() {
      return max_parallel_connections;
    }
    
    /** Sets the value of the 'max_parallel_connections' field */
    public org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.Builder setMaxParallelConnections(int value) {
      validate(fields()[2], value);
      this.max_parallel_connections = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'max_parallel_connections' field has been set */
    public boolean hasMaxParallelConnections() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'max_parallel_connections' field */
    public org.kaaproject.kaa.server.verifiers.twitter.config.gen.TwitterAvroConfig.Builder clearMaxParallelConnections() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public TwitterAvroConfig build() {
      try {
        TwitterAvroConfig record = new TwitterAvroConfig();
        record.consumer_key = fieldSetFlags()[0] ? this.consumer_key : (java.lang.String) defaultValue(fields()[0]);
        record.consumer_secret = fieldSetFlags()[1] ? this.consumer_secret : (java.lang.String) defaultValue(fields()[1]);
        record.max_parallel_connections = fieldSetFlags()[2] ? this.max_parallel_connections : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
