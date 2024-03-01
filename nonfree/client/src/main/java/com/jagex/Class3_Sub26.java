package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agk")
public class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!agk", name = "x", descriptor = "I")
	public int anInt1303;

	@OriginalMember(owner = "client!agk", name = "u", descriptor = "I")
	public int anInt1305;

	@OriginalMember(owner = "client!agk", name = "s", descriptor = "I")
	public int anInt1306;

	@OriginalMember(owner = "client!agk", name = "h", descriptor = "I")
	public int anInt1307;

	@OriginalMember(owner = "client!agk", name = "y", descriptor = "I")
	public int anInt1308;

	@OriginalMember(owner = "client!agk", name = "l", descriptor = "I")
	public int anInt1304 = 1446397523;

	@OriginalMember(owner = "client!agk", name = "b", descriptor = "Z")
	public boolean aBoolean300 = false;

	@OriginalMember(owner = "client!agk", name = "<init>", descriptor = "(I)V", line = 14)
	Class3_Sub26(@OriginalArg(0) int arg0) {
		this.anInt1304 = arg0 * -1446397523;
	}

	@OriginalMember(owner = "client!agk", name = "p", descriptor = "(I)[Lclient!si;", line = 35)
	public static Class456[] method11536() {
		return new Class456[] { Class456.aClass456_24, Class456.aClass456_12, Class456.aClass456_23, Class456.aClass456_18, Class456.aClass456_5, Class456.aClass456_11, Class456.aClass456_4, Class456.aClass456_7, Class456.aClass456_9, Class456.aClass456_2, Class456.aClass456_10, Class456.aClass456_21, Class456.aClass456_20, Class456.aClass456_17, Class456.aClass456_15, Class456.aClass456_19, Class456.aClass456_16, Class456.aClass456_3, Class456.aClass456_22, Class456.aClass456_13, Class456.aClass456_14, Class456.aClass456_6, Class456.aClass456_8 };
	}

	@OriginalMember(owner = "client!agk", name = "s", descriptor = "(II)V", line = 98)
	public static void method11537(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(23, (long) arg0);
		local4.method19145();
	}
}
