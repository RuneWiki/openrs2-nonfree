package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public class Class238 {

	@OriginalMember(owner = "client!il", name = "u", descriptor = "Lclient!ny;")
	static Class359 aClass359_49;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "B")
	public byte aByte129;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "I")
	public int anInt3750;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "Ljava/lang/String;")
	public String aString192;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 8)
	Class238() {
	}

	@OriginalMember(owner = "client!il", name = "bd", descriptor = "(III)V", line = 287)
	static void method24617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(13, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!il", name = "ho", descriptor = "(Lclient!vs;I)V", line = 5388)
	static final void method24616(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class174.method23395(local11, local14, true, 2, arg0);
	}
}
