=begin
#Bybit API

### REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  

OpenAPI spec version: 0.2.10
Contact: support@bybit.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.8

=end

require 'date'

module SwaggerClient
  # Cancel all active orders response
  class OrderCancelAllRes
    attr_accessor :cl_ord_id

    attr_accessor :user_id

    attr_accessor :side

    attr_accessor :order_type

    attr_accessor :price

    attr_accessor :qty

    attr_accessor :time_in_force

    attr_accessor :create_type

    attr_accessor :order_status

    attr_accessor :leaves_qty

    attr_accessor :leaves_value

    attr_accessor :created_at

    attr_accessor :updated_at

    attr_accessor :cross_status

    attr_accessor :cross_seq

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'cl_ord_id' => :'clOrdID',
        :'user_id' => :'user_id',
        :'side' => :'side',
        :'order_type' => :'order_type',
        :'price' => :'price',
        :'qty' => :'qty',
        :'time_in_force' => :'time_in_force',
        :'create_type' => :'create_type',
        :'order_status' => :'order_status',
        :'leaves_qty' => :'leaves_qty',
        :'leaves_value' => :'leaves_value',
        :'created_at' => :'created_at',
        :'updated_at' => :'updated_at',
        :'cross_status' => :'cross_status',
        :'cross_seq' => :'cross_seq'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'cl_ord_id' => :'String',
        :'user_id' => :'Float',
        :'side' => :'String',
        :'order_type' => :'String',
        :'price' => :'String',
        :'qty' => :'String',
        :'time_in_force' => :'String',
        :'create_type' => :'String',
        :'order_status' => :'String',
        :'leaves_qty' => :'Float',
        :'leaves_value' => :'Float',
        :'created_at' => :'String',
        :'updated_at' => :'String',
        :'cross_status' => :'String',
        :'cross_seq' => :'Float'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'clOrdID')
        self.cl_ord_id = attributes[:'clOrdID']
      end

      if attributes.has_key?(:'user_id')
        self.user_id = attributes[:'user_id']
      end

      if attributes.has_key?(:'side')
        self.side = attributes[:'side']
      end

      if attributes.has_key?(:'order_type')
        self.order_type = attributes[:'order_type']
      end

      if attributes.has_key?(:'price')
        self.price = attributes[:'price']
      end

      if attributes.has_key?(:'qty')
        self.qty = attributes[:'qty']
      end

      if attributes.has_key?(:'time_in_force')
        self.time_in_force = attributes[:'time_in_force']
      end

      if attributes.has_key?(:'create_type')
        self.create_type = attributes[:'create_type']
      end

      if attributes.has_key?(:'order_status')
        self.order_status = attributes[:'order_status']
      end

      if attributes.has_key?(:'leaves_qty')
        self.leaves_qty = attributes[:'leaves_qty']
      end

      if attributes.has_key?(:'leaves_value')
        self.leaves_value = attributes[:'leaves_value']
      end

      if attributes.has_key?(:'created_at')
        self.created_at = attributes[:'created_at']
      end

      if attributes.has_key?(:'updated_at')
        self.updated_at = attributes[:'updated_at']
      end

      if attributes.has_key?(:'cross_status')
        self.cross_status = attributes[:'cross_status']
      end

      if attributes.has_key?(:'cross_seq')
        self.cross_seq = attributes[:'cross_seq']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          cl_ord_id == o.cl_ord_id &&
          user_id == o.user_id &&
          side == o.side &&
          order_type == o.order_type &&
          price == o.price &&
          qty == o.qty &&
          time_in_force == o.time_in_force &&
          create_type == o.create_type &&
          order_status == o.order_status &&
          leaves_qty == o.leaves_qty &&
          leaves_value == o.leaves_value &&
          created_at == o.created_at &&
          updated_at == o.updated_at &&
          cross_status == o.cross_status &&
          cross_seq == o.cross_seq
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [cl_ord_id, user_id, side, order_type, price, qty, time_in_force, create_type, order_status, leaves_qty, leaves_value, created_at, updated_at, cross_status, cross_seq].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        temp_model = SwaggerClient.const_get(type).new
        temp_model.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        next if value.nil?
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end
  end
end
