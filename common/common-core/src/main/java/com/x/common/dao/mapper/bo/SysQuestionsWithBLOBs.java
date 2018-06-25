package com.x.common.dao.mapper.bo;

public class SysQuestionsWithBLOBs extends SysQuestions {
    private String original;

    private String translation;

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original == null ? null : original.trim();
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation == null ? null : translation.trim();
    }
}