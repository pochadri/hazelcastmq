package org.mpilone.hazelcastmq.stomp;

/**
 * Possible STOMP commands, both server and client.
 * 
 * @author mpilone
 */
public enum Command {
  SEND, SUBSCRIBE, UNSUBSCRIBE, BEGIN, COMMIT, ABORT, ACK, NACK, DISCONNECT, CONNECT, STOMP, CONNECTED, MESSAGE, RECEIPT, ERROR

}
