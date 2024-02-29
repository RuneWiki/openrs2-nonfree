package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ez")
public class Class239 {

	@OriginalMember(owner = "client!ez", name = "vx", descriptor = "[I")
	public static int[] anIntArray383;

	@OriginalMember(owner = "client!ez", name = "p", descriptor = "Lclient!ez;")
	static final Class239 aClass239_8 = new Class239();

	@OriginalMember(owner = "client!ez", name = "c", descriptor = "Lclient!ez;")
	static final Class239 aClass239_2 = new Class239();

	@OriginalMember(owner = "client!ez", name = "v", descriptor = "Lclient!ez;")
	static final Class239 aClass239_3 = new Class239();

	@OriginalMember(owner = "client!ez", name = "l", descriptor = "Lclient!ez;")
	static final Class239 aClass239_5 = new Class239();

	@OriginalMember(owner = "client!ez", name = "y", descriptor = "Lclient!ez;")
	static final Class239 aClass239_6 = new Class239();

	@OriginalMember(owner = "client!ez", name = "w", descriptor = "Lclient!ez;")
	static final Class239 aClass239_4 = new Class239();

	@OriginalMember(owner = "client!ez", name = "t", descriptor = "Lclient!ez;")
	static final Class239 aClass239_7 = new Class239();

	@OriginalMember(owner = "client!ez", name = "q", descriptor = "Lclient!ez;")
	static final Class239 aClass239_13 = new Class239();

	@OriginalMember(owner = "client!ez", name = "x", descriptor = "Lclient!ez;")
	public static final Class239 aClass239_9 = new Class239();

	@OriginalMember(owner = "client!ez", name = "d", descriptor = "Lclient!ez;")
	public static final Class239 aClass239_10 = new Class239();

	@OriginalMember(owner = "client!ez", name = "s", descriptor = "Lclient!ez;")
	static final Class239 aClass239_11 = new Class239();

	@OriginalMember(owner = "client!ez", name = "r", descriptor = "Lclient!ez;")
	static final Class239 aClass239_1 = new Class239();

	@OriginalMember(owner = "client!ez", name = "g", descriptor = "Lclient!ez;")
	static final Class239 aClass239_12 = new Class239();

	@OriginalMember(owner = "client!ez", name = "<init>", descriptor = "()V", line = 18)
	Class239() {
	}

	@OriginalMember(owner = "client!ez", name = "p", descriptor = "(IB)I", line = 24)
	public static int method25926(@OriginalArg(0) int arg0) {
		return Class71.anIntArray15[arg0];
	}

	@OriginalMember(owner = "client!ez", name = "sa", descriptor = "(Lclient!yf;I)V", line = 7870)
	static final void method25927(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3882 * -166726847;
	}

	@OriginalMember(owner = "client!ez", name = "anz", descriptor = "(Lclient!yf;I)V", line = 11977)
	static final void method25928(@OriginalArg(0) Class665 arg0) {
		Class619.method32395(false);
	}
}
