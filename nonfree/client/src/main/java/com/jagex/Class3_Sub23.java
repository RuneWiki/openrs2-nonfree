package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agh")
public class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!agh", name = "ag", descriptor = "I")
	public static int anInt1294;

	@OriginalMember(owner = "client!agh", name = "u", descriptor = "[Lclient!agh;")
	static Class3_Sub23[] aClass3_Sub23Array1 = new Class3_Sub23[300];

	@OriginalMember(owner = "client!agh", name = "y", descriptor = "I")
	static int anInt1297 = 0;

	@OriginalMember(owner = "client!agh", name = "l", descriptor = "Lclient!lx;")
	Class311 aClass311_1;

	@OriginalMember(owner = "client!agh", name = "x", descriptor = "Lclient!and;")
	public Class3_Sub41_Sub1 aClass3_Sub41_Sub1_1;

	@OriginalMember(owner = "client!agh", name = "s", descriptor = "I")
	public int anInt1295;

	@OriginalMember(owner = "client!agh", name = "h", descriptor = "I")
	int anInt1296;

	@OriginalMember(owner = "client!agh", name = "<init>", descriptor = "()V", line = 16)
	Class3_Sub23() {
	}

	@OriginalMember(owner = "client!agh", name = "h", descriptor = "(Lclient!lx;Lclient!xj;)Lclient!agh;", line = 24)
	public static Class3_Sub23 method11472(@OriginalArg(0) Class311 arg0, @OriginalArg(1) Class577 arg1) {
		@Pc(2) Class3_Sub23 local2 = Class378.method27248();
		local2.aClass311_1 = arg0;
		local2.anInt1296 = arg0.anInt4529 * 361714675;
		if (local2.anInt1296 * 1177540123 == -1) {
			local2.aClass3_Sub41_Sub1_1 = new Class3_Sub41_Sub1(260);
		} else if (local2.anInt1296 * 1177540123 == -2) {
			local2.aClass3_Sub41_Sub1_1 = new Class3_Sub41_Sub1(10000);
		} else if (local2.anInt1296 * 1177540123 <= 18) {
			local2.aClass3_Sub41_Sub1_1 = new Class3_Sub41_Sub1(20);
		} else if (local2.anInt1296 * 1177540123 <= 98) {
			local2.aClass3_Sub41_Sub1_1 = new Class3_Sub41_Sub1(100);
		} else {
			local2.aClass3_Sub41_Sub1_1 = new Class3_Sub41_Sub1(260);
		}
		local2.aClass3_Sub41_Sub1_1.method19823(arg1);
		local2.aClass3_Sub41_Sub1_1.method19821(local2.aClass311_1.anInt4528 * -1934986723);
		local2.anInt1295 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!agh", name = "x", descriptor = "()Lclient!agh;", line = 39)
	public static Class3_Sub23 method11470() {
		@Pc(2) Class3_Sub23 local2 = Class378.method27248();
		local2.aClass311_1 = null;
		local2.anInt1296 = 0;
		local2.aClass3_Sub41_Sub1_1 = new Class3_Sub41_Sub1(5000);
		return local2;
	}

	@OriginalMember(owner = "client!agh", name = "l", descriptor = "(B)V", line = 47)
	public void method11471() {
		if (anInt1297 * 731741969 < aClass3_Sub23Array1.length) {
			aClass3_Sub23Array1[(anInt1297 += -1592307215) * 731741969 - 1] = this;
		}
	}

	@OriginalMember(owner = "client!agh", name = "s", descriptor = "()V", line = 47)
	public void method11473() {
		if (anInt1297 * 731741969 < aClass3_Sub23Array1.length) {
			aClass3_Sub23Array1[(anInt1297 += -1592307215) * 731741969 - 1] = this;
		}
	}

	@OriginalMember(owner = "client!agh", name = "u", descriptor = "()V", line = 47)
	public void method11474() {
		if (anInt1297 * 731741969 < aClass3_Sub23Array1.length) {
			aClass3_Sub23Array1[(anInt1297 += -1592307215) * 731741969 - 1] = this;
		}
	}
}
