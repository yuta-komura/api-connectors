=begin
#Bybit API

### REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  

OpenAPI spec version: 0.2.10
Contact: support@bybit.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.8

=end

require 'uri'

module SwaggerClient
  class PositionsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Update margin.
    # @param symbol Contract type which you want update its margin
    # @param margin New margin you want set
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def positions_change_margin(symbol, margin, opts = {})
      data, _status_code, _headers = positions_change_margin_with_http_info(symbol, margin, opts)
      data
    end

    # Update margin.
    # @param symbol Contract type which you want update its margin
    # @param margin New margin you want set
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def positions_change_margin_with_http_info(symbol, margin, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PositionsApi.positions_change_margin ...'
      end
      # verify the required parameter 'symbol' is set
      if @api_client.config.client_side_validation && symbol.nil?
        fail ArgumentError, "Missing the required parameter 'symbol' when calling PositionsApi.positions_change_margin"
      end
      # verify the required parameter 'margin' is set
      if @api_client.config.client_side_validation && margin.nil?
        fail ArgumentError, "Missing the required parameter 'margin' when calling PositionsApi.positions_change_margin"
      end
      # resource path
      local_var_path = '/position/change-position-margin'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}
      form_params['symbol'] = symbol
      form_params['margin'] = margin

      # http body (model)
      post_body = nil
      auth_names = ['apiKey', 'apiSignature', 'timestamp']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PositionsApi#positions_change_margin\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get user's closed profit and loss records
    # @param symbol Contract type
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :start_time Start timestamp point for result, in second
    # @option opts [Integer] :end_time End timestamp point for result, in second
    # @option opts [String] :exec_type Execution type
    # @option opts [Integer] :page Page. By default, gets first page of data. Maximum of 50 pages
    # @option opts [Integer] :limit Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page.
    # @return [Object]
    def positions_close_pnl_records(symbol, opts = {})
      data, _status_code, _headers = positions_close_pnl_records_with_http_info(symbol, opts)
      data
    end

    # Get user&#39;s closed profit and loss records
    # @param symbol Contract type
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :start_time Start timestamp point for result, in second
    # @option opts [Integer] :end_time End timestamp point for result, in second
    # @option opts [String] :exec_type Execution type
    # @option opts [Integer] :page Page. By default, gets first page of data. Maximum of 50 pages
    # @option opts [Integer] :limit Limit for data size per page, max size is 50. Default as showing 20 pieces of data per page.
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def positions_close_pnl_records_with_http_info(symbol, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PositionsApi.positions_close_pnl_records ...'
      end
      # verify the required parameter 'symbol' is set
      if @api_client.config.client_side_validation && symbol.nil?
        fail ArgumentError, "Missing the required parameter 'symbol' when calling PositionsApi.positions_close_pnl_records"
      end
      # resource path
      local_var_path = '/v2/private/trade/closed-pnl/list'

      # query parameters
      query_params = {}
      query_params[:'symbol'] = symbol
      query_params[:'start_time'] = opts[:'start_time'] if !opts[:'start_time'].nil?
      query_params[:'end_time'] = opts[:'end_time'] if !opts[:'end_time'].nil?
      query_params[:'exec_type'] = opts[:'exec_type'] if !opts[:'exec_type'].nil?
      query_params[:'page'] = opts[:'page'] if !opts[:'page'].nil?
      query_params[:'limit'] = opts[:'limit'] if !opts[:'limit'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['apiKey', 'apiSignature', 'timestamp']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PositionsApi#positions_close_pnl_records\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Get my position list.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :symbol Contract type which you want update its margin
    # @return [Object]
    def positions_my_position(opts = {})
      data, _status_code, _headers = positions_my_position_with_http_info(opts)
      data
    end

    # Get my position list.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :symbol Contract type which you want update its margin
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def positions_my_position_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PositionsApi.positions_my_position ...'
      end
      # resource path
      local_var_path = '/v2/private/position/list'

      # query parameters
      query_params = {}
      query_params[:'symbol'] = opts[:'symbol'] if !opts[:'symbol'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = ['apiKey', 'apiSignature', 'timestamp']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PositionsApi#positions_my_position\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Change user leverage.
    # @param symbol A symbol which you want change its leverage
    # @param leverage New leverage you want set
    # @param [Hash] opts the optional parameters
    # @return [Object]
    def positions_save_leverage(symbol, leverage, opts = {})
      data, _status_code, _headers = positions_save_leverage_with_http_info(symbol, leverage, opts)
      data
    end

    # Change user leverage.
    # @param symbol A symbol which you want change its leverage
    # @param leverage New leverage you want set
    # @param [Hash] opts the optional parameters
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def positions_save_leverage_with_http_info(symbol, leverage, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PositionsApi.positions_save_leverage ...'
      end
      # verify the required parameter 'symbol' is set
      if @api_client.config.client_side_validation && symbol.nil?
        fail ArgumentError, "Missing the required parameter 'symbol' when calling PositionsApi.positions_save_leverage"
      end
      # verify the required parameter 'leverage' is set
      if @api_client.config.client_side_validation && leverage.nil?
        fail ArgumentError, "Missing the required parameter 'leverage' when calling PositionsApi.positions_save_leverage"
      end
      # resource path
      local_var_path = '/user/leverage/save'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}
      form_params['symbol'] = symbol
      form_params['leverage'] = leverage

      # http body (model)
      post_body = nil
      auth_names = ['apiKey', 'apiSignature', 'timestamp']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PositionsApi#positions_save_leverage\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Set Trading-Stop Condition.
    # @param symbol Contract type
    # @param [Hash] opts the optional parameters
    # @option opts [String] :take_profit Not less than 0, 0 means cancel TP
    # @option opts [String] :stop_loss Not less than 0, 0 means cancel SL
    # @option opts [String] :trailing_stop Not less than 0, 0 means cancel TS
    # @option opts [String] :new_trailing_active Trailing stop trigger price. Trailing stops are triggered only when the price reaches the specified price. Trailing stops are triggered immediately by default.
    # @return [Object]
    def positions_trading_stop(symbol, opts = {})
      data, _status_code, _headers = positions_trading_stop_with_http_info(symbol, opts)
      data
    end

    # Set Trading-Stop Condition.
    # @param symbol Contract type
    # @param [Hash] opts the optional parameters
    # @option opts [String] :take_profit Not less than 0, 0 means cancel TP
    # @option opts [String] :stop_loss Not less than 0, 0 means cancel SL
    # @option opts [String] :trailing_stop Not less than 0, 0 means cancel TS
    # @option opts [String] :new_trailing_active Trailing stop trigger price. Trailing stops are triggered only when the price reaches the specified price. Trailing stops are triggered immediately by default.
    # @return [Array<(Object, Fixnum, Hash)>] Object data, response status code and response headers
    def positions_trading_stop_with_http_info(symbol, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: PositionsApi.positions_trading_stop ...'
      end
      # verify the required parameter 'symbol' is set
      if @api_client.config.client_side_validation && symbol.nil?
        fail ArgumentError, "Missing the required parameter 'symbol' when calling PositionsApi.positions_trading_stop"
      end
      # resource path
      local_var_path = '/open-api/position/trading-stop'

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = {}
      form_params['symbol'] = symbol
      form_params['take_profit'] = opts[:'take_profit'] if !opts[:'take_profit'].nil?
      form_params['stop_loss'] = opts[:'stop_loss'] if !opts[:'stop_loss'].nil?
      form_params['trailing_stop'] = opts[:'trailing_stop'] if !opts[:'trailing_stop'].nil?
      form_params['new_trailing_active'] = opts[:'new_trailing_active'] if !opts[:'new_trailing_active'].nil?

      # http body (model)
      post_body = nil
      auth_names = ['apiKey', 'apiSignature', 'timestamp']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Object')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: PositionsApi#positions_trading_stop\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
