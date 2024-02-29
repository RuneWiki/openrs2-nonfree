package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anx")
public class Class35_Sub15 extends Class35 {

	@OriginalMember(owner = "client!anx", name = "w", descriptor = "Lclient!ua;")
	public static Class570 aClass570_1 = new Class570(-1);

	@OriginalMember(owner = "client!anx", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;Lclient!pw;)V", line = 14)
	public Class35_Sub15(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class478 arg2) {
		super(arg0, arg1, arg2, Class647.aClass647_63, 64, new Class46(Class570.class));
	}

	@OriginalMember(owner = "client!anx", name = "abp", descriptor = "(Lclient!yf;I)V", line = 9365)
	static final void method17364(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass77_Sub25_3.aClass358Array1[local12].anInt4499 * -1326711921;
	}
}
