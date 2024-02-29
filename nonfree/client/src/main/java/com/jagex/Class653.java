package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xt")
public class Class653 {

	@OriginalMember(owner = "client!xt", name = "p", descriptor = "I")
	public static final int anInt5755 = 16777215;

	@OriginalMember(owner = "client!xt", name = "c", descriptor = "I")
	public static final int anInt5756 = 13156520;

	@OriginalMember(owner = "client!xt", name = "v", descriptor = "F")
	public static final float aFloat337 = 1.1523438F;

	@OriginalMember(owner = "client!xt", name = "d", descriptor = "I")
	static final int anInt5757 = 5000;

	@OriginalMember(owner = "client!xt", name = "y", descriptor = "F")
	public static final float aFloat338 = 1.2F;

	@OriginalMember(owner = "client!xt", name = "w", descriptor = "I")
	public static final int anInt5758 = -50;

	@OriginalMember(owner = "client!xt", name = "t", descriptor = "I")
	public static final int anInt5759 = -60;

	@OriginalMember(owner = "client!xt", name = "q", descriptor = "I")
	public static final int anInt5760 = -50;

	@OriginalMember(owner = "client!xt", name = "x", descriptor = "I")
	public static final int anInt5761 = 0;

	@OriginalMember(owner = "client!xt", name = "r", descriptor = "I")
	public static final int anInt5762 = 2816;

	@OriginalMember(owner = "client!xt", name = "s", descriptor = "I")
	public static final int anInt5763 = 2816;

	@OriginalMember(owner = "client!xt", name = "l", descriptor = "F")
	public static final float aFloat339 = 0.69921875F;

	@OriginalMember(owner = "client!xt", name = "g", descriptor = "I")
	public static final int anInt5764 = 2816;

	@OriginalMember(owner = "client!xt", name = "ag", descriptor = "Lclient!cy;")
	static Class83 aClass83_39;

	static {
		new Class447(0.6F, 0.6F, 0.6F);
		new Class447(0.3F, 0.3F, 0.3F);
		new Class447(0.3F, 0.3F, 0.5F);
	}

	@OriginalMember(owner = "client!xt", name = "<init>", descriptor = "()V", line = 33)
	Class653() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!xt", name = "t", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;I)V", line = 94)
	public static void method32976(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4) {
		if (client.anInt3390 * -1850530127 != 18) {
			return;
		}
		@Pc(11) Class77_Sub20 local11 = Class365.method28132(Class414.aClass414_49, client.aClass82_1.aClass16_1);
		local11.aClass77_Sub39_Sub1_2.method22408(0);
		@Pc(22) int local22 = local11.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
		local11.aClass77_Sub39_Sub1_2.method22440(arg0);
		local11.aClass77_Sub39_Sub1_2.method22440(arg1);
		local11.aClass77_Sub39_Sub1_2.method22403(arg2);
		local11.aClass77_Sub39_Sub1_2.method22403(arg3 ? 1 : 0);
		local11.aClass77_Sub39_Sub1_2.method22440(arg4);
		local11.aClass77_Sub39_Sub1_2.anInt3089 += -1122347939;
		local11.aClass77_Sub39_Sub1_2.method22567(Class314.anIntArray432, local22, local11.aClass77_Sub39_Sub1_2.anInt3089 * 31645619);
		local11.aClass77_Sub39_Sub1_2.method22462(local11.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local22);
		client.aClass82_1.method2004(local11);
		if (arg2 < 13) {
			client.aBoolean587 = true;
			Class332.method27612();
		}
		Class35_Sub20.aClass699_1 = Class699.aClass699_2;
	}

	@OriginalMember(owner = "client!xt", name = "ml", descriptor = "(Lclient!yf;I)V", line = 6817)
	static final void method32977(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class223.method25771(local11, local14, arg0);
	}
}
