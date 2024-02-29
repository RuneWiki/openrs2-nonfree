package com.jagex;

import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public class Class397 {

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Lclient!mf;")
	public static final Class397 aClass397_3 = new Class397();

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!mf;")
	public static final Class397 aClass397_2 = new Class397();

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "(II)I", line = 35)
	static final int method28436(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 52)
	Class397() {
	}

	@OriginalMember(owner = "client!mf", name = "t", descriptor = "(J)V", line = 96)
	static void method28437(@OriginalArg(0) long arg0) {
		Class61.aCalendar1.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!mf", name = "qt", descriptor = "(Lclient!yf;I)V", line = 7573)
	static final void method28438(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3936 * 403396513;
	}

	@OriginalMember(owner = "client!mf", name = "rc", descriptor = "(Lclient!gm;Lclient!yf;I)V", line = 7614)
	static final void method28439(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class665 arg1) {
		if (arg1.anInt5780 * 768284605 >= 10) {
			throw new RuntimeException();
		} else if (arg0.anObjectArray9 != null) {
			@Pc(18) Class77_Sub41 local18 = new Class77_Sub41();
			local18.aClass277_2 = arg0;
			local18.anObjectArray4 = arg0.anObjectArray9;
			local18.anInt2006 = arg1.anInt5780 * 1447923541 + 1478140793;
			client.aClass695_48.method36383(local18);
		}
	}

	@OriginalMember(owner = "client!mf", name = "nn", descriptor = "(IIIIIILjava/lang/String;I)V", line = 12405)
	public static void method28440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		@Pc(3) Class131_Sub5 local3 = new Class131_Sub5();
		local3.anInt1443 = arg0 * -1138244179;
		local3.anInt1442 = arg1 * -1571693737;
		local3.anInt1446 = arg2 * 1927397951;
		local3.anInt1444 = (client.anInt3414 + arg4) * 462225497;
		local3.anInt1445 = arg3 * -459030883;
		local3.aString46 = arg6;
		local3.anInt1447 = arg5 * 86082617;
		client.aClass703_7.method36525(local3);
	}

	@OriginalMember(owner = "client!mf", name = "aua", descriptor = "(Lclient!yf;I)V", line = 13026)
	static final void method28441(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class107_Sub1.aBoolean193 ? 1 : 0;
	}

	@OriginalMember(owner = "client!mf", name = "avg", descriptor = "(Lclient!yf;S)V", line = 13212)
	static final void method28442(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15107() ? 1 : 0;
	}
}
