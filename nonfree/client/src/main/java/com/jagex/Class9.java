package com.jagex;

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bx")
public class Class9 {

	@OriginalMember(owner = "client!bx", name = "p", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_18;

	@OriginalMember(owner = "client!bx", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	Buffer aBuffer3;

	@OriginalMember(owner = "client!bx", name = "<init>", descriptor = "(Lclient!abt;[BI)V", line = 12)
	Class9(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass21_Sub2_18 = arg0;
		this.aBuffer3 = this.aClass21_Sub2_18.aNativeHeap1.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.g(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!bx", name = "<init>", descriptor = "(Lclient!abt;Lclient!jaclib/memory/Buffer;)V", line = 18)
	Class9(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass21_Sub2_18 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!bx", name = "b", descriptor = "([BI)V", line = 24)
	void method1118(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.p() < arg1) {
			this.aBuffer3 = this.aClass21_Sub2_18.aNativeHeap1.a(arg1, false);
		}
		this.aBuffer3.g(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!bx", name = "y", descriptor = "([BI)V", line = 24)
	void method1119(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.p() < arg1) {
			this.aBuffer3 = this.aClass21_Sub2_18.aNativeHeap1.a(arg1, false);
		}
		this.aBuffer3.g(arg0, 0, 0, arg1);
	}
}
