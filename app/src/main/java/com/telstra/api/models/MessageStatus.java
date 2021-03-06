/*
 * TelstraSMSAUSLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 05/16/2016
 */
package com.telstra.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MessageStatus 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5065513975572045043L;
    private String receivedTimestamp;
    private String sentTimestamp;
    private ResponseStatusEnum status;
    private String to;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("receivedTimestamp")
    public String getReceivedTimestamp ( ) {
        return this.receivedTimestamp;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("receivedTimestamp")
    public void setReceivedTimestamp (String value) {
        this.receivedTimestamp = value;
        notifyObservers(this.receivedTimestamp);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("sentTimestamp")
    public String getSentTimestamp ( ) {
        return this.sentTimestamp;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("sentTimestamp")
    public void setSentTimestamp (String value) {
        this.sentTimestamp = value;
        notifyObservers(this.sentTimestamp);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status")
    public ResponseStatusEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status")
    public void setStatus (ResponseStatusEnum value) { 
        this.status = value;
        notifyObservers(this.status);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("to")
    public String getTo ( ) {
        return this.to;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("to")
    public void setTo (String value) {
        this.to = value;
        notifyObservers(this.to);
    }
 
}
 