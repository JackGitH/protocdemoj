// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: eventServer.proto

package serverproto.serverproto;

public interface ChainTranscationReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:server.ChainTranscationReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 批id
   * </pre>
   *
   * <code>string BatchidReq = 1;</code>
   */
  java.lang.String getBatchidReq();
  /**
   * <pre>
   * 批id
   * </pre>
   *
   * <code>string BatchidReq = 1;</code>
   */
  com.google.protobuf.ByteString
      getBatchidReqBytes();

  /**
   * <pre>
   * 批交易集合
   * </pre>
   *
   * <code>map&lt;string, string&gt; TxsReq = 2;</code>
   */
  int getTxsReqCount();
  /**
   * <pre>
   * 批交易集合
   * </pre>
   *
   * <code>map&lt;string, string&gt; TxsReq = 2;</code>
   */
  boolean containsTxsReq(
      java.lang.String key);
  /**
   * Use {@link #getTxsReqMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTxsReq();
  /**
   * <pre>
   * 批交易集合
   * </pre>
   *
   * <code>map&lt;string, string&gt; TxsReq = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTxsReqMap();
  /**
   * <pre>
   * 批交易集合
   * </pre>
   *
   * <code>map&lt;string, string&gt; TxsReq = 2;</code>
   */

  java.lang.String getTxsReqOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * 批交易集合
   * </pre>
   *
   * <code>map&lt;string, string&gt; TxsReq = 2;</code>
   */

  java.lang.String getTxsReqOrThrow(
      java.lang.String key);
}
