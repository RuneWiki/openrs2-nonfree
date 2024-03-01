package com.jagex;

import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public class Class313 {

	@OriginalMember(owner = "client!m", name = "l", descriptor = "Ljava/lang/String;")
	public String aString199;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Ljava/lang/String;")
	public String aString200;

	@OriginalMember(owner = "client!m", name = "y", descriptor = "Ljava/lang/String;")
	public String aString201;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	public int anInt4530;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "I")
	public int anInt4531;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "Ljava/lang/String;")
	public String aString202;

	@OriginalMember(owner = "client!m", name = "s", descriptor = "Z")
	public boolean aBoolean713;

	@OriginalMember(owner = "client!m", name = "u", descriptor = "Z")
	public boolean aBoolean714;

	@OriginalMember(owner = "client!m", name = "x", descriptor = "I")
	public int anInt4532;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	public int anInt4533;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "(I)[Lclient!sy;", line = 17)
	public static Class470[] method25821() {
		return new Class470[] { Class470.aClass470_1, Class470.aClass470_3, Class470.aClass470_5, Class470.aClass470_2, Class470.aClass470_4, Class470.aClass470_6 };
	}

	@OriginalMember(owner = "client!m", name = "s", descriptor = "(J)V", line = 92)
	static void method25819(@OriginalArg(0) long arg0) {
		Class599.aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!m", name = "oo", descriptor = "(Lclient!vs;B)V", line = 6644)
	static final void method25822(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class279.method25421(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!m", name = "wb", descriptor = "(Lclient!vs;I)V", line = 8015)
	static final void method25820(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 11833)
	Class313() {
	}
}
