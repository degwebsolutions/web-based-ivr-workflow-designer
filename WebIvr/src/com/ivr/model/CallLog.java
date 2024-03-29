package com.ivr.model;
// Generated Jan 16, 2011 2:04:21 PM by Hibernate Tools 3.2.1.GA



/**
 * Calllog generated by hbm2java
 */
public class CallLog  implements java.io.Serializable {

     private CallLogId id;
     private CallDetails callDetails;
     private byte[] log;
     private String comment;

    public CallLog() {
    }

	
    public CallLog(CallLogId id, CallDetails calldetails, byte[] log) {
        this.id = id;
        this.callDetails = calldetails;
        this.log = log;
    }
    public CallLog(CallLogId id, CallDetails calldetails, byte[] log, String comment) {
       this.id = id;
       this.callDetails = calldetails;
       this.log = log;
       this.comment = comment;
    }
   
    public CallLogId getId() {
        return this.id;
    }
    
    public void setId(CallLogId id) {
        this.id = id;
    }
    public CallDetails getCallDetails() {
        return this.callDetails;
    }
    
    public void setCallDetails(CallDetails callDetails) {
        this.callDetails = callDetails;
    }
    public byte[] getLog() {
        return this.log;
    }
    
    public void setLog(byte[] log) {
        this.log = log;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

}


