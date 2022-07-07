/**
 * 
 */
package com.gardenApps.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author anili
 *
 */
@ResponseStatus
public class ResourceNotFoundException extends RuntimeException{
    private String  resourceName;
    private String fieldName;
    
    private Object fieldValue;
    
    public  ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with%s: '%s'", resourceName, fieldName, fieldName) );
        this.resourceName = resourceName;
        this.setFieldName(fieldName);
        this.setFieldValue(fieldValue);
        }
    public String getResourceName() {
      return resourceName;
        }
    /**
     * @return the fieldName
     */
    public String getFieldName() {
      return fieldName;
    }
    /**
     * @param fieldName the fieldName to set
     */
    public void setFieldName(String fieldName) {
      this.fieldName = fieldName;
    }
    /**
     * @return the fieldValue
     */
    public Object getFieldValue() {
      return fieldValue;
    }
    /**
     * @param fieldValue the fieldValue to set
     */
    public void setFieldValue(Object fieldValue) {
      this.fieldValue = fieldValue;
    }
    
}
