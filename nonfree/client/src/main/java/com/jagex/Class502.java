package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public class Class502 {

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!qc;")
	public static final Class502 aClass502_1 = new Class502(0);

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Lclient!qc;")
	static final Class502 aClass502_2 = new Class502(1);

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	final int anInt5200;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V", line = 9)
	Class502(@OriginalArg(0) int arg0) {
		this.anInt5200 = arg0 * -1364150943;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V", line = 152)
	public static void method30175(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28006(15, (long) arg0);
		local4.method21865();
	}

	@OriginalMember(owner = "client!qc", name = "bct", descriptor = "(Lclient!yf;S)V", line = 14679)
	static final void method30174(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= 1189701933;
	}
}
