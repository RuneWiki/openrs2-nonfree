package com.jagex;

import java.lang.management.GarbageCollectorMXBean;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
class Class250 implements Interface41 {

	@OriginalMember(owner = "client!fk", name = "oi", descriptor = "I")
	public static int anInt3804;

	@OriginalMember(owner = "client!fk", name = "up", descriptor = "I")
	static int anInt3805;

	@OriginalMember(owner = "client!fk", name = "vv", descriptor = "Ljava/lang/management/GarbageCollectorMXBean;")
	static GarbageCollectorMXBean aGarbageCollectorMXBean1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fk", name = "this$0", descriptor = "Lclient!fw;")
	final Class261 this$0;

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "(Lclient!yf;I)V", line = 114)
	static void method26168(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1] = ((Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1])).method27168(Class55.aClass124_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!yf;I)V", line = 118)
	static void method26169(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1] = ((Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1])).method27169(Class55.aClass124_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!fw;)V", line = 485)
	Class250(@OriginalArg(0) Class261 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "()F", line = 487)
	@Override
	public float method26250() {
		return (float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_1.method15901() / 255.0F;
	}

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "(S)F", line = 487)
	@Override
	public float method26249() {
		return (float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_1.method15901() / 255.0F;
	}
}
