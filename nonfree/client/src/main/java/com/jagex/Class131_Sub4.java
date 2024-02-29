package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiw")
public class Class131_Sub4 extends Class131 {

	@OriginalMember(owner = "client!aiw", name = "v", descriptor = "Lclient!zv;")
	static Class703 aClass703_2 = new Class703();

	@OriginalMember(owner = "client!aiw", name = "l", descriptor = "I")
	static int anInt1438 = 0;

	@OriginalMember(owner = "client!aiw", name = "q", descriptor = "I")
	int anInt1437;

	@OriginalMember(owner = "client!aiw", name = "y", descriptor = "Lclient!agh;")
	Class104_Sub1_Sub1_Sub1 aClass104_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!aiw", name = "w", descriptor = "I")
	int anInt1439;

	@OriginalMember(owner = "client!aiw", name = "t", descriptor = "I")
	int anInt1440;

	@OriginalMember(owner = "client!aiw", name = "x", descriptor = "I")
	int anInt1441;

	@OriginalMember(owner = "client!aiw", name = "<init>", descriptor = "()V", line = 16)
	Class131_Sub4() {
	}

	@OriginalMember(owner = "client!aiw", name = "t", descriptor = "()Lclient!aiw;", line = 19)
	static Class131_Sub4 method13106() {
		@Pc(4) Class131_Sub4 local4 = (Class131_Sub4) aClass703_2.method36532();
		if (local4 == null) {
			return new Class131_Sub4();
		} else {
			anInt1438 -= 816205627;
			return local4;
		}
	}

	@OriginalMember(owner = "client!aiw", name = "d", descriptor = "(Lclient!aiw;)V", line = 28)
	static void method13107(@OriginalArg(0) Class131_Sub4 arg0) {
		arg0.aClass104_Sub1_Sub1_Sub1_1 = null;
		if (anInt1438 * 1885450739 < 20) {
			aClass703_2.method36525(arg0);
			anInt1438 += 816205627;
		}
	}

	@OriginalMember(owner = "client!aiw", name = "q", descriptor = "(Lclient!aiw;)V", line = 28)
	static void method13108(@OriginalArg(0) Class131_Sub4 arg0) {
		arg0.aClass104_Sub1_Sub1_Sub1_1 = null;
		if (anInt1438 * 1885450739 < 20) {
			aClass703_2.method36525(arg0);
			anInt1438 += 816205627;
		}
	}

	@OriginalMember(owner = "client!aiw", name = "x", descriptor = "(Lclient!aiw;)V", line = 28)
	static void method13109(@OriginalArg(0) Class131_Sub4 arg0) {
		arg0.aClass104_Sub1_Sub1_Sub1_1 = null;
		if (anInt1438 * 1885450739 < 20) {
			aClass703_2.method36525(arg0);
			anInt1438 += 816205627;
		}
	}

	@OriginalMember(owner = "client!aiw", name = "y", descriptor = "(Lclient!ako;B)V", line = 185)
	static void method13110(@OriginalArg(0) Class39_Sub1 arg0) {
		arg0.method14300(0);
		@Pc(18) byte local18;
		if (Class504.anInt3376 * 721369631 >= 96) {
			@Pc(11) int local11 = Class634.method32664();
			if (local11 <= 101) {
				Class368.method28211();
				local18 = 4;
			} else if (local11 <= 501) {
				Class471.method29623();
				local18 = 3;
			} else if (local11 <= 1004) {
				Class660.method33074();
				local18 = 2;
			} else {
				Class261.method26280();
				local18 = 1;
			}
			arg0.method14303(0, local11);
		} else {
			Class261.method26280();
			local18 = 1;
			arg0.method14297(64);
		}
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == 0) {
			Class35_Sub6.aClass77_Sub35_45.method14383(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1, true);
		} else {
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, 0);
			Class533.method30776(0, false);
		}
		Class667.method33150();
		arg0.method14293(local18);
	}
}
