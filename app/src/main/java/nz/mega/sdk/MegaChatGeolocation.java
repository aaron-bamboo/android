/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nz.mega.sdk;

public class MegaChatGeolocation {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MegaChatGeolocation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MegaChatGeolocation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  protected synchronized void delete() {   
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        megachatJNI.delete_MegaChatGeolocation(swigCPtr);
      }
      swigCPtr = 0;
    }
}

   MegaChatGeolocation copy() {
    long cPtr = megachatJNI.MegaChatGeolocation_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new MegaChatGeolocation(cPtr, false);
  }

  public float getLongitude() {
    return megachatJNI.MegaChatGeolocation_getLongitude(swigCPtr, this);
  }

  public float getLatitude() {
    return megachatJNI.MegaChatGeolocation_getLatitude(swigCPtr, this);
  }

  public String getImage() {
    return megachatJNI.MegaChatGeolocation_getImage(swigCPtr, this);
  }

  public MegaChatGeolocation() {
    this(megachatJNI.new_MegaChatGeolocation(), true);
  }

}
