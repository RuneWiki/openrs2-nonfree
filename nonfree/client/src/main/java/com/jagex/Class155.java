package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public class Class155 {

	@OriginalMember(owner = "client!at", name = "c", descriptor = "I")
	static final int anInt3182 = 100000;

	@OriginalMember(owner = "client!at", name = "y", descriptor = "I")
	static final int anInt3183 = 101;

	@OriginalMember(owner = "client!at", name = "g", descriptor = "I")
	public static int anInt3184;

	@OriginalMember(owner = "client!at", name = "l", descriptor = "I")
	static final int anInt3185 = 10000;

	@OriginalMember(owner = "client!at", name = "w", descriptor = "I")
	static final int anInt3186 = 501;

	@OriginalMember(owner = "client!at", name = "t", descriptor = "I")
	static final int anInt3187 = 1004;

	@OriginalMember(owner = "client!at", name = "p", descriptor = "F")
	static final float aFloat230 = 1.3F;

	@OriginalMember(owner = "client!at", name = "x", descriptor = "J")
	static final long aLong217 = 60129613779L;

	@OriginalMember(owner = "client!at", name = "v", descriptor = "I")
	static final int anInt3188 = 50000;

	@OriginalMember(owner = "client!at", name = "q", descriptor = "J")
	static final long aLong218 = 64425238954L;

	@OriginalMember(owner = "client!at", name = "al", descriptor = "I")
	static int anInt3189;

	@OriginalMember(owner = "client!at", name = "d", descriptor = "Z")
	public static boolean aBoolean513 = false;

	@OriginalMember(owner = "client!at", name = "s", descriptor = "Z")
	public static boolean aBoolean514 = false;

	@OriginalMember(owner = "client!at", name = "r", descriptor = "Z")
	static boolean aBoolean515 = false;

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(I)Lclient!rp;", line = 21)
	public static Interface59 method23614() {
		if (Class515.anInterface59_1 == null) {
			throw new IllegalStateException("");
		}
		return Class515.anInterface59_1;
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V", line = 33)
	Class155() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!at", name = "r", descriptor = "()Lclient!akq;", line = 38)
	static Class77_Sub35 method23615() {
		@Pc(1) Class28 local1 = null;
		@Pc(7) Class77_Sub35 local7 = new Class77_Sub35(client.aClass670_4, 0);
		try {
			local1 = Class145.method15079("", client.aClass670_4.aString245, false);
			@Pc(20) byte[] local20 = new byte[(int) local1.method478()];
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22 += local36) {
				local36 = local1.method486(local20, local22, local20.length - local22);
				if (local36 == -1) {
					throw new IOException();
				}
			}
			local7 = new Class77_Sub35(new Class77_Sub39(local20), client.aClass670_4, 0);
		} catch (@Pc(60) Exception local60) {
		}
		try {
			if (local1 != null) {
				local1.method476();
			}
		} catch (@Pc(67) Exception local67) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!at", name = "j", descriptor = "()V", line = 60)
	public static void method23616() {
		@Pc(1) Class28 local1 = null;
		try {
			local1 = Class145.method15079("", client.aClass670_4.aString245, true);
			@Pc(12) Class77_Sub39 local12 = Class35_Sub6.aClass77_Sub35_45.method14377();
			local1.method475(local12.aByteArray53, 0, local12.anInt3089 * 31645619);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method476();
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!at", name = "z", descriptor = "()V", line = 60)
	public static void method23617() {
		@Pc(1) Class28 local1 = null;
		try {
			local1 = Class145.method15079("", client.aClass670_4.aString245, true);
			@Pc(12) Class77_Sub39 local12 = Class35_Sub6.aClass77_Sub35_45.method14377();
			local1.method475(local12.aByteArray53, 0, local12.anInt3089 * 31645619);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method476();
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!at", name = "g", descriptor = "()V", line = 60)
	public static void method23618() {
		@Pc(1) Class28 local1 = null;
		try {
			local1 = Class145.method15079("", client.aClass670_4.aString245, true);
			@Pc(12) Class77_Sub39 local12 = Class35_Sub6.aClass77_Sub35_45.method14377();
			local1.method475(local12.aByteArray53, 0, local12.anInt3089 * 31645619);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method476();
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!at", name = "k", descriptor = "()I", line = 74)
	public static int method23619() {
		@Pc(2) Class39_Sub1 local2 = Class605.method32076();
		Class547.method30971(local2);
		return local2.method14282();
	}

	@OriginalMember(owner = "client!at", name = "i", descriptor = "()I", line = 74)
	public static int method23620() {
		@Pc(2) Class39_Sub1 local2 = Class605.method32076();
		Class547.method30971(local2);
		return local2.method14282();
	}

	@OriginalMember(owner = "client!at", name = "u", descriptor = "()I", line = 74)
	public static int method23621() {
		@Pc(2) Class39_Sub1 local2 = Class605.method32076();
		Class547.method30971(local2);
		return local2.method14282();
	}

	@OriginalMember(owner = "client!at", name = "e", descriptor = "()I", line = 74)
	public static int method23622() {
		@Pc(2) Class39_Sub1 local2 = Class605.method32076();
		Class547.method30971(local2);
		return local2.method14282();
	}

	@OriginalMember(owner = "client!at", name = "f", descriptor = "(Lclient!ako;)V", line = 185)
	static void method23623(@OriginalArg(0) Class39_Sub1 arg0) {
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

	@OriginalMember(owner = "client!at", name = "o", descriptor = "(Lclient!ako;)V", line = 185)
	static void method23624(@OriginalArg(0) Class39_Sub1 arg0) {
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

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(Lclient!ako;II)V", line = 224)
	static void method23625(@OriginalArg(0) Class39_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.method14300(arg1);
		@Pc(10) byte local10;
		if (arg2 > 100000) {
			Class368.method28211();
			local10 = 4;
		} else if (arg2 > 50000) {
			Class471.method29623();
			local10 = 3;
		} else if (arg2 > 10000) {
			Class660.method33074();
			local10 = 2;
		} else {
			Class261.method26280();
			local10 = 1;
		}
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == arg1) {
			Class35_Sub6.aClass77_Sub35_45.method14383(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1, true);
		} else {
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, arg1);
			Class533.method30776(arg1, false);
		}
		Class667.method33150();
		arg0.method14293(local10);
	}

	@OriginalMember(owner = "client!at", name = "n", descriptor = "()V", line = 254)
	public static void method23626() {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub24_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub8_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub5_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1, Class329.aClass329_6.anInt4094 * 1453209707);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1, 0);
		if (Class284.aClass86_9 != null && Class284.aClass86_9.method20296() && Class284.aClass86_9.method20183()) {
			Class284.aClass86_9.method20141();
		}
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1, 1);
		Class486.method29979();
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub38_1, 4);
		Class632.method32649();
		client.aClass517_1.method30443().method32293();
		client.aBoolean598 = true;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "()V", line = 254)
	public static void method23627() {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub24_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub8_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub5_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1, Class329.aClass329_6.anInt4094 * 1453209707);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1, 0);
		if (Class284.aClass86_9 != null && Class284.aClass86_9.method20296() && Class284.aClass86_9.method20183()) {
			Class284.aClass86_9.method20141();
		}
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1, 1);
		Class486.method29979();
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub38_1, 4);
		Class632.method32649();
		client.aClass517_1.method30443().method32293();
		client.aBoolean598 = true;
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(II)Lclient!gm;", line = 269)
	public static Class277 method23628(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >> 16;
		if (Class35_Sub11.aClass273Array1[local3] == null || Class35_Sub11.aClass273Array1[local3].method26538(arg0) == null) {
			@Pc(20) boolean local20 = Class211.method25607(local3, null);
			if (!local20) {
				return null;
			}
		}
		return Class35_Sub11.aClass273Array1[local3].method26538(arg0);
	}

	@OriginalMember(owner = "client!at", name = "m", descriptor = "()V", line = 283)
	public static void method23629() {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub24_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub8_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub5_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1, Class329.aClass329_6.anInt4094 * 1453209707);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1, 0);
		if (Class284.aClass86_9 != null && Class284.aClass86_9.method20296() && Class284.aClass86_9.method20183()) {
			Class284.aClass86_9.method20141();
		}
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1, 1);
		Class486.method29979();
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub38_1, 3);
		Class632.method32649();
		client.aClass517_1.method30443().method32293();
		client.aBoolean598 = true;
	}

	@OriginalMember(owner = "client!at", name = "h", descriptor = "()V", line = 283)
	public static void method23630() {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub24_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub8_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub5_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1, Class329.aClass329_6.anInt4094 * 1453209707);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1, 0);
		if (Class284.aClass86_9 != null && Class284.aClass86_9.method20296() && Class284.aClass86_9.method20183()) {
			Class284.aClass86_9.method20141();
		}
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1, 1);
		Class486.method29979();
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub38_1, 3);
		Class632.method32649();
		client.aClass517_1.method30443().method32293();
		client.aBoolean598 = true;
	}

	@OriginalMember(owner = "client!at", name = "aj", descriptor = "()V", line = 312)
	public static void method23631() {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub24_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub8_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub5_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1, Class329.aClass329_6.anInt4094 * 1453209707);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1, 0);
		if (Class284.aClass86_9 != null && Class284.aClass86_9.method20296() && Class284.aClass86_9.method20183()) {
			Class284.aClass86_9.method20141();
		}
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1, 0);
		Class486.method29979();
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub38_1, 2);
		Class632.method32649();
		client.aClass517_1.method30443().method32293();
		client.aBoolean598 = true;
	}

	@OriginalMember(owner = "client!at", name = "ai", descriptor = "(Z)V", line = 341)
	public static void method23632() {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub24_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub8_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub5_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1, Class329.aClass329_6.anInt4094 * 1453209707);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1, 0);
		if (Class284.aClass86_9 != null && Class284.aClass86_9.method20296() && Class284.aClass86_9.method20183()) {
			Class284.aClass86_9.method20141();
		}
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1, 0);
		Class486.method29979();
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub38_1, 1);
		Class632.method32649();
		client.aClass517_1.method30443().method32293();
		client.aBoolean598 = true;
	}

	@OriginalMember(owner = "client!at", name = "ag", descriptor = "(Z)V", line = 341)
	public static void method23633() {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub24_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub8_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub5_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1, Class329.aClass329_6.anInt4094 * 1453209707);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1, 0);
		if (Class284.aClass86_9 != null && Class284.aClass86_9.method20296() && Class284.aClass86_9.method20183()) {
			Class284.aClass86_9.method20141();
		}
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1, 0);
		Class486.method29979();
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub38_1, 1);
		Class632.method32649();
		client.aClass517_1.method30443().method32293();
		client.aBoolean598 = true;
	}

	@OriginalMember(owner = "client!at", name = "j", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZS)V", line = 487)
	static void method23634(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		if (!Class683.aBoolean861 && Class683.anInt5826 * 324852453 < 504) {
			@Pc(16) int local16 = arg2 == -1 ? client.anInt3472 * 846725895 : arg2;
			@Pc(32) Class77_Sub1_Sub7 local32 = new Class77_Sub1_Sub7(arg0, arg1, local16, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
			Class522.method30605(local32);
		}
	}

	@OriginalMember(owner = "client!at", name = "ac", descriptor = "(I)I", line = 490)
	public static int method23635() {
		return Class574.aTwitchWebcamDeviceArray1 == null ? 0 : Class574.aTwitchWebcamDeviceArray1.length;
	}
}
