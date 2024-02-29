package com.jagex;

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class Class74 {

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_8;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "Lclient!jaclib/memory/Buffer;")
	Buffer aBuffer3;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!aeq;[BI)V", line = 12)
	Class74(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass86_Sub3_8 = arg0;
		this.aBuffer3 = this.aClass86_Sub3_8.aNativeHeap2.c(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.v(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!aeq;Lclient!jaclib/memory/Buffer;)V", line = 18)
	Class74(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass86_Sub3_8 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "([BI)V", line = 24)
	void method1389(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.p() < arg1) {
			this.aBuffer3 = this.aClass86_Sub3_8.aNativeHeap2.c(arg1, false);
		}
		this.aBuffer3.v(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "([BI)V", line = 24)
	void method1390(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.p() < arg1) {
			this.aBuffer3 = this.aClass86_Sub3_8.aNativeHeap2.c(arg1, false);
		}
		this.aBuffer3.v(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "([BI)V", line = 24)
	void method1391(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.p() < arg1) {
			this.aBuffer3 = this.aClass86_Sub3_8.aNativeHeap2.c(arg1, false);
		}
		this.aBuffer3.v(arg0, 0, 0, arg1);
	}
}
