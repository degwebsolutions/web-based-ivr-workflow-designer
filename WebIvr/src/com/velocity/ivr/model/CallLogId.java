package com.velocity.ivr.model;
// Generated Jan 16, 2011 2:04:21 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * CalllogId generated by hbm2java
 */
public class CallLogId  implements java.io.Serializable {


     private int callId;
     private Date callTime;

    public CallLogId() {
    }

    public CallLogId(int callid, Date calltime) {
       this.callId = callid;
       this.callTime = calltime;
    }
   
    public int getCallId() {
        return this.callId;
    }
    
    public void setCallId(int callid) {
        this.callId = callid;
    }
    public Date getCallTime() {
        return this.callTime;
    }
    
    public void setCallTime(Date callTime) {
        this.callTime = callTime;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CallLogId) ) return false;
		 CallLogId castOther = ( CallLogId ) other;
         
		 return (this.getCallId()==castOther.getCallId())
 && ( (this.getCallTime()==castOther.getCallTime()) || ( this.getCallTime()!=null && castOther.getCallTime()!=null && this.getCallTime().equals(castOther.getCallTime()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCallId();
         result = 37 * result + ( getCallTime() == null ? 0 : this.getCallTime().hashCode() );
         return result;
   }   


}

