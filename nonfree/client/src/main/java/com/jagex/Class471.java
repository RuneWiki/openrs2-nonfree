package com.jagex;

import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sz")
public class Class471 {

	@OriginalMember(owner = "client!sz", name = "b", descriptor = "Lclient!ahb;")
	static Class3_Sub41 aClass3_Sub41_19;

	@OriginalMember(owner = "client!sz", name = "sn", descriptor = "Lclient!iu;")
	public static Class245 aClass245_2;

	@OriginalMember(owner = "client!sz", name = "<init>", descriptor = "()V", line = 7)
	Class471() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!sz", name = "a", descriptor = "(Lclient!ahb;)Lclient!sk;", line = 12)
	public static Interface50 method28767(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(5) Class451 local5 = Class196.method24108(arg0.method20269());
		if (local5 == Class451.aClass451_1) {
			return Class339.method26433(arg0);
		} else if (Class451.aClass451_2 == local5) {
			return Class489.method29234(arg0);
		} else if (local5 == Class451.aClass451_3) {
			return Class377.method27241(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sz", name = "g", descriptor = "(Lclient!ahb;)Lclient!sk;", line = 12)
	public static Interface50 method28768(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(5) Class451 local5 = Class196.method24108(arg0.method20269());
		if (local5 == Class451.aClass451_1) {
			return Class339.method26433(arg0);
		} else if (Class451.aClass451_2 == local5) {
			return Class489.method29234(arg0);
		} else if (local5 == Class451.aClass451_3) {
			return Class377.method27241(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sz", name = "p", descriptor = "(Ljava/io/File;I)V", line = 16)
	static void method28769(@OriginalArg(0) File arg0) {
		Class392.aFile3 = arg0;
		if (!Class392.aFile3.exists()) {
			throw new RuntimeException("");
		}
		Class392.aBoolean750 = true;
	}

	@OriginalMember(owner = "client!sz", name = "g", descriptor = "(I)V", line = 51)
	static void method28771() {
		Class68.aClass161_10.method23224();
	}

	@OriginalMember(owner = "client!sz", name = "bp", descriptor = "(IIB)V", line = 281)
	static void method28772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(12, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!sz", name = "hr", descriptor = "(Lclient!vs;I)V", line = 5444)
	static final void method28773(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class408.method27666(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!sz", name = "afm", descriptor = "(Lclient!vs;B)V", line = 9816)
	static final void method28770(@OriginalArg(0) Class536 arg0) {
		@Pc(2) Class82 local2 = Class406.method27657();
		@Pc(8) Class3_Sub23 local8 = Class269.method25284(Class311.aClass311_21, local2.aClass577_2);
		local8.aClass3_Sub41_Sub1_1.method20250(0);
		@Pc(19) int local19 = local8.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local8.aClass3_Sub41_Sub1_1.method20250(2);
		local8.aClass3_Sub41_Sub1_1.method20251(arg0.aClass283_1.anInt4351 * 189047461);
		arg0.aClass283_1.aClass3_Sub1_Sub13_1.method19276(local8.aClass3_Sub41_Sub1_1, arg0.aClass283_1.anIntArray410);
		local8.aClass3_Sub41_Sub1_1.method20266(local8.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local19);
		local2.method21601(local8);
	}
}
