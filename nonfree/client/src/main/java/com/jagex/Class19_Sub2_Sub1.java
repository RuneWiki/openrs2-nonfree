package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akf")
public abstract class Class19_Sub2_Sub1 extends Class19_Sub2 {

	@OriginalMember(owner = "client!akf", name = "p", descriptor = "Lclient!abv;")
	Class21_Sub3 aClass21_Sub3_34;

	@OriginalMember(owner = "client!akf", name = "<init>", descriptor = "(Lclient!abv;)V", line = 9)
	Class19_Sub2_Sub1(@OriginalArg(0) Class21_Sub3 arg0) {
		this.aClass21_Sub3_34 = arg0;
	}

	@OriginalMember(owner = "client!akf", name = "l", descriptor = "()Z", line = 14)
	@Override
	boolean method21393() {
		this.aClass21_Sub3_34.method17454();
		return true;
	}

	@OriginalMember(owner = "client!akf", name = "y", descriptor = "()Z", line = 14)
	@Override
	boolean method21397() {
		this.aClass21_Sub3_34.method17454();
		return true;
	}

	@OriginalMember(owner = "client!akf", name = "u", descriptor = "()Z", line = 14)
	@Override
	boolean method21396() {
		this.aClass21_Sub3_34.method17454();
		return true;
	}

	@OriginalMember(owner = "client!akf", name = "f", descriptor = "(II)V", line = 19)
	@Override
	void method21415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass21_Sub3_34.method17037() == this) {
			this.aClass21_Sub3_34.method17455();
		}
	}

	@OriginalMember(owner = "client!akf", name = "i", descriptor = "(II)V", line = 19)
	@Override
	void method21414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass21_Sub3_34.method17037() == this) {
			this.aClass21_Sub3_34.method17455();
		}
	}

	@OriginalMember(owner = "client!akf", name = "at", descriptor = "(II)V", line = 19)
	@Override
	void method21411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass21_Sub3_34.method17037() == this) {
			this.aClass21_Sub3_34.method17455();
		}
	}

	@OriginalMember(owner = "client!akf", name = "k", descriptor = "(II)V", line = 19)
	@Override
	void method21417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass21_Sub3_34.method17037() == this) {
			this.aClass21_Sub3_34.method17455();
		}
	}
}
