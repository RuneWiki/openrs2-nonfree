package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
class Class252 implements Interface41 {

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "Lclient!aar;")
	static Class17 aClass17_9;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "Z")
	static boolean aBoolean655;

	@OriginalMember(owner = "client!fm", name = "hh", descriptor = "Lclient!aoi;")
	public static Class42_Sub2 aClass42_Sub2_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fm", name = "this$0", descriptor = "Lclient!fw;")
	final Class261 this$0;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "(Lclient!yf;I)V", line = 88)
	static void method26180(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class309.method27274() ? 1 : 0;
	}

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "(B)Lclient!zl;", line = 137)
	public static Class694 method26181() {
		return Class298.aClass694_1 == null ? Class694.aClass694_6 : Class298.aClass694_1;
	}

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!fw;)V", line = 490)
	Class252(@OriginalArg(0) Class261 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "(S)F", line = 492)
	@Override
	public float method26249() {
		return (float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_3.method15901() / 255.0F;
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "()F", line = 492)
	@Override
	public float method26250() {
		return (float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_3.method15901() / 255.0F;
	}

	@OriginalMember(owner = "client!fm", name = "ip", descriptor = "(IB)V", line = 4637)
	static final void method26182(@OriginalArg(0) int arg0) {
		client.anIntArray329 = new int[arg0];
		client.anIntArray324 = new int[arg0];
		client.anIntArray330 = new int[arg0];
		client.anIntArray325 = new int[arg0];
		client.anIntArray331 = new int[arg0];
	}

	@OriginalMember(owner = "client!fm", name = "ft", descriptor = "(Lclient!yf;I)V", line = 5422)
	static final void method26183(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class134.method13702(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!fm", name = "ih", descriptor = "(IIIIB)V", line = 5578)
	static final void method26184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class149_Sub5.method23180(Class284.aClass86_9);
		Class546.method30970(arg0, arg1, arg2, arg3);
		Class115.method21204(arg0, arg1, arg2, arg3, 256, 256);
		Class46.method738(arg0, arg1, arg2, arg3);
		Class587.method31739(arg0, arg1, arg2, arg3);
	}
}
