package com.example.library.util;

public enum OpenSourceLicense {
    APACHE_2, MIT, GNU_GPL_3;

    public int getResourceId() {
        switch (this) {
            case APACHE_2:
                return com.example.library.R.string.license_apache2;
            case MIT:
                return com.example.library.R.string.license_mit;
            case GNU_GPL_3:
                return com.example.library.R.string.license_gpl;
            default:
                return -1;
        }
    }
}
