package com.corgihat.iot.test01.models;

/**
 * Created by Marshall on 7/19/2017.
 */

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

// [START user_class]
@IgnoreExtraProperties
public class User {

    private String username;
    private String fullname;
    private String email;
    private String phone;
    private boolean validated;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email, String fullname, String phone, boolean validated) {
        this.username = username;
        this.email = email;
        this.fullname = fullname;
        this.phone = phone;
        this.validated = validated;
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.fullname = "";
        this.phone = "";
        this.validated = false;
    }

    // [START user_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("username", username);
        result.put("email", email);
        result.put("fullname", fullname);
        result.put("phone", phone);
        result.put("validated", validated);

        return result;
    }
    // [END user_to_map]

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return getClass().getName() + '@' + username;
        //return super.toString();
    }
}
// [END user_class]
