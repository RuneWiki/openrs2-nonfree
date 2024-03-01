package com.jagex;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public class Class169 {

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
	static final int anInt2589 = 100000;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
	static final int anInt2590 = 50000;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "F")
	static final float aFloat165 = 1.3F;

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
	static final int anInt2591 = 100;

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
	static final int anInt2592 = 500;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
	static final int anInt2593 = 1003;

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "J")
	static final long aLong113 = 64425238954L;

	@OriginalMember(owner = "client!aq", name = "z", descriptor = "J")
	static final long aLong114 = 60129613779L;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
	static final int anInt2594 = 10000;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "Z")
	public static boolean aBoolean389 = false;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "Z")
	public static boolean aBoolean390 = false;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "Z")
	static boolean aBoolean388 = false;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "(Lclient!tj;Lclient!tj;B)V", line = 30)
	public static void method18341(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class93 arg1) {
		if (arg0.aClass93_228 != null) {
			arg0.method23969();
		}
		arg0.aClass93_228 = arg1.aClass93_228;
		arg0.aClass93_227 = arg1;
		arg0.aClass93_228.aClass93_227 = arg0;
		arg0.aClass93_227.aClass93_228 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V", line = 33)
	Class169() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "()Lclient!ali;", line = 38)
	static Class93_Sub36 method18314() {
		@Pc(1) Class38 local1 = null;
		@Pc(7) Class93_Sub36 local7 = new Class93_Sub36(client.aClass702_4, 0);
		try {
			local1 = Class166_Sub18.method15743("", client.aClass702_4.aString241, false);
			@Pc(20) byte[] local20 = new byte[(int) local1.method735()];
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22 += local36) {
				local36 = local1.method726(local20, local22, local20.length - local22);
				if (local36 == -1) {
					throw new IOException();
				}
			}
			local7 = new Class93_Sub36(new Class93_Sub41(local20), client.aClass702_4, 0);
		} catch (@Pc(60) Exception local60) {
		}
		try {
			if (local1 != null) {
				local1.method732();
			}
		} catch (@Pc(67) Exception local67) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "()V", line = 60)
	public static void method18315() {
		@Pc(1) Class38 local1 = null;
		try {
			local1 = Class166_Sub18.method15743("", client.aClass702_4.aString241, true);
			@Pc(12) Class93_Sub41 local12 = Class51.aClass93_Sub36_1.method14356();
			local1.method722(local12.aByteArray58, 0, local12.anInt3070 * 212851357);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method732();
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "()V", line = 60)
	public static void method18327() {
		@Pc(1) Class38 local1 = null;
		try {
			local1 = Class166_Sub18.method15743("", client.aClass702_4.aString241, true);
			@Pc(12) Class93_Sub41 local12 = Class51.aClass93_Sub36_1.method14356();
			local1.method722(local12.aByteArray58, 0, local12.anInt3070 * 212851357);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method732();
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "()I", line = 74)
	public static int method18317() {
		@Pc(2) Class54_Sub1 local2 = Class319.method27223();
		Class129.method21479(local2);
		return local2.method14853();
	}

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "()I", line = 74)
	public static int method18335() {
		@Pc(2) Class54_Sub1 local2 = Class319.method27223();
		Class129.method21479(local2);
		return local2.method14853();
	}

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "()Lclient!alq;", line = 80)
	static Class54_Sub1 method18332() {
		@Pc(3) Class54_Sub1 local3 = new Class54_Sub1();
		@Pc(7) boolean local7 = false;
		@Pc(17) boolean local17;
		@Pc(19) boolean local19;
		if (Class339.aString179.startsWith("win")) {
			local7 = true;
			local17 = true;
			local19 = true;
		} else {
			local17 = true;
			local19 = true;
		}
		if (aBoolean389) {
			local3.method14870(16);
			local17 = false;
		}
		if (aBoolean390) {
			local3.method14870(32);
			local7 = false;
		}
		if (aBoolean388) {
			local3.method14870(16384);
			local19 = false;
		}
		if (!local17 && !local7) {
			Class155_Sub2.method15310(local3);
			return local3;
		}
		@Pc(59) int local59 = -1;
		@Pc(61) int local61 = -1;
		@Pc(63) int local63 = -1;
		if (local7) {
			try {
				Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 3);
				Class106_Sub1.method5148();
				local61 = Class78.method1316(3, 1000);
				if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == 3) {
					local3.method14870(4);
					@Pc(91) Class219 local91 = Class694.aClass104_14.method20571();
					@Pc(98) long local98 = local91.aLong247 * -2731861378298283411L & 0xFFFFFFFFFFFFL;
					@Pc(111) boolean local111;
					switch(local91.anInt3623 * -348611355) {
						case 4098:
							local111 = local98 >= 60129613779L;
							local17 &= local111;
							if (!local111) {
								local3.method14870(512);
							}
							break;
						case 4318:
							local111 = local98 >= 64425238954L;
							local17 &= local111;
							if (!local111) {
								local3.method14870(256);
							}
					}
				}
			} catch (@Pc(142) Exception local142) {
				local3.method14870(4096);
			}
		}
		if (local19) {
			try {
				Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 5);
				Class106_Sub1.method5148();
				local63 = Class78.method1316(5, 1000);
				if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == 5) {
					local3.method14870(8192);
				}
			} catch (@Pc(173) Exception local173) {
				local3.method14870(32768);
			}
		}
		if (local17) {
			try {
				Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 4);
				Class106_Sub1.method5148();
				local59 = Class78.method1316(1, 1000);
				if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == 1) {
					local3.method14870(2);
				}
			} catch (@Pc(204) Exception local204) {
				local3.method14870(2048);
			}
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 0);
		if (local59 == -1 && local61 == -1) {
			Class155_Sub2.method15310(local3);
			return local3;
		}
		local3.method14875(3, local61);
		local3.method14875(1, local59);
		local3.method14875(5, local63);
		local61 = (int) ((float) local61 * 1.3F);
		if ((local61 <= 100000 || local59 <= 100000) && local61 <= local59) {
			Class251.method25967(local3, 1, local61 == -1 ? local59 : local61);
		} else {
			Class251.method25967(local3, 3, local59 == -1 ? local61 : local59);
		}
		return local3;
	}

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "(Lclient!alq;)V", line = 185)
	static void method18319(@OriginalArg(0) Class54_Sub1 arg0) {
		arg0.method14871(0);
		@Pc(18) byte local18;
		if (Class553.anInt3419 * 1798078423 >= 96) {
			@Pc(11) int local11 = Class699.method36706();
			if (local11 <= 100) {
				Class642.method32521();
				local18 = 4;
			} else if (local11 <= 500) {
				Class586.method31641();
				local18 = 3;
			} else if (local11 <= 1003) {
				Class260.method26153();
				local18 = 2;
			} else {
				Class238.method25796();
				local18 = 1;
			}
			arg0.method14875(0, local11);
		} else {
			Class238.method25796();
			local18 = 1;
			arg0.method14870(64);
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == 0) {
			Class51.aClass93_Sub36_1.method14377(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true);
		} else {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0);
			Class543.method30948(0, false);
		}
		Class106_Sub1.method5148();
		arg0.method14869(local18);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(Lclient!alq;)V", line = 185)
	static void method18321(@OriginalArg(0) Class54_Sub1 arg0) {
		arg0.method14871(0);
		@Pc(18) byte local18;
		if (Class553.anInt3419 * 1798078423 >= 96) {
			@Pc(11) int local11 = Class699.method36706();
			if (local11 <= 100) {
				Class642.method32521();
				local18 = 4;
			} else if (local11 <= 500) {
				Class586.method31641();
				local18 = 3;
			} else if (local11 <= 1003) {
				Class260.method26153();
				local18 = 2;
			} else {
				Class238.method25796();
				local18 = 1;
			}
			arg0.method14875(0, local11);
		} else {
			Class238.method25796();
			local18 = 1;
			arg0.method14870(64);
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == 0) {
			Class51.aClass93_Sub36_1.method14377(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true);
		} else {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0);
			Class543.method30948(0, false);
		}
		Class106_Sub1.method5148();
		arg0.method14869(local18);
	}

	@OriginalMember(owner = "client!aq", name = "x", descriptor = "(Lclient!alq;)V", line = 185)
	static void method18325(@OriginalArg(0) Class54_Sub1 arg0) {
		arg0.method14871(0);
		@Pc(18) byte local18;
		if (Class553.anInt3419 * 1798078423 >= 96) {
			@Pc(11) int local11 = Class699.method36706();
			if (local11 <= 100) {
				Class642.method32521();
				local18 = 4;
			} else if (local11 <= 500) {
				Class586.method31641();
				local18 = 3;
			} else if (local11 <= 1003) {
				Class260.method26153();
				local18 = 2;
			} else {
				Class238.method25796();
				local18 = 1;
			}
			arg0.method14875(0, local11);
		} else {
			Class238.method25796();
			local18 = 1;
			arg0.method14870(64);
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == 0) {
			Class51.aClass93_Sub36_1.method14377(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true);
		} else {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0);
			Class543.method30948(0, false);
		}
		Class106_Sub1.method5148();
		arg0.method14869(local18);
	}

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "(Lclient!alq;II)V", line = 224)
	static void method18318(@OriginalArg(0) Class54_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.method14871(arg1);
		@Pc(10) byte local10;
		if (arg2 > 100000) {
			Class642.method32521();
			local10 = 4;
		} else if (arg2 > 50000) {
			Class586.method31641();
			local10 = 3;
		} else if (arg2 > 10000) {
			Class260.method26153();
			local10 = 2;
		} else {
			Class238.method25796();
			local10 = 1;
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == arg1) {
			Class51.aClass93_Sub36_1.method14377(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true);
		} else {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, arg1);
			Class543.method30948(arg1, false);
		}
		Class106_Sub1.method5148();
		arg0.method14869(local10);
	}

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "(Lclient!alq;II)V", line = 224)
	static void method18322(@OriginalArg(0) Class54_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.method14871(arg1);
		@Pc(10) byte local10;
		if (arg2 > 100000) {
			Class642.method32521();
			local10 = 4;
		} else if (arg2 > 50000) {
			Class586.method31641();
			local10 = 3;
		} else if (arg2 > 10000) {
			Class260.method26153();
			local10 = 2;
		} else {
			Class238.method25796();
			local10 = 1;
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == arg1) {
			Class51.aClass93_Sub36_1.method14377(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true);
		} else {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, arg1);
			Class543.method30948(arg1, false);
		}
		Class106_Sub1.method5148();
		arg0.method14869(local10);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!alq;II)V", line = 224)
	static void method18323(@OriginalArg(0) Class54_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.method14871(arg1);
		@Pc(10) byte local10;
		if (arg2 > 100000) {
			Class642.method32521();
			local10 = 4;
		} else if (arg2 > 50000) {
			Class586.method31641();
			local10 = 3;
		} else if (arg2 > 10000) {
			Class260.method26153();
			local10 = 2;
		} else {
			Class238.method25796();
			local10 = 1;
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == arg1) {
			Class51.aClass93_Sub36_1.method14377(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true);
		} else {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, arg1);
			Class543.method30948(arg1, false);
		}
		Class106_Sub1.method5148();
		arg0.method14869(local10);
	}

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "()V", line = 254)
	public static void method18326() {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20565() && Class694.aClass104_14.method20541()) {
			Class694.aClass104_14.method20572();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1);
		Class386.method28235();
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 4);
		Class610.method32021();
		client.aClass532_1.method30532().method33003();
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ae", descriptor = "()V", line = 254)
	public static void method18328() {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20565() && Class694.aClass104_14.method20541()) {
			Class694.aClass104_14.method20572();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1);
		Class386.method28235();
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 4);
		Class610.method32021();
		client.aClass532_1.method30532().method33003();
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "()V", line = 254)
	public static void method18331() {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20565() && Class694.aClass104_14.method20541()) {
			Class694.aClass104_14.method20572();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1);
		Class386.method28235();
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 4);
		Class610.method32021();
		client.aClass532_1.method30532().method33003();
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "()V", line = 254)
	public static void method18333() {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20565() && Class694.aClass104_14.method20541()) {
			Class694.aClass104_14.method20572();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1);
		Class386.method28235();
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 4);
		Class610.method32021();
		client.aClass532_1.method30532().method33003();
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ag", descriptor = "()V", line = 283)
	public static void method18313() {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20565() && Class694.aClass104_14.method20541()) {
			Class694.aClass104_14.method20572();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1);
		Class386.method28235();
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 3);
		Class610.method32021();
		client.aClass532_1.method30532().method33003();
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ac", descriptor = "()V", line = 283)
	public static void method18320() {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20565() && Class694.aClass104_14.method20541()) {
			Class694.aClass104_14.method20572();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1);
		Class386.method28235();
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 3);
		Class610.method32021();
		client.aClass532_1.method30532().method33003();
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "al", descriptor = "()V", line = 283)
	public static void method18329() {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20565() && Class694.aClass104_14.method20541()) {
			Class694.aClass104_14.method20572();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1);
		Class386.method28235();
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 3);
		Class610.method32021();
		client.aClass532_1.method30532().method33003();
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ah", descriptor = "()V", line = 283)
	public static void method18330() {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20565() && Class694.aClass104_14.method20541()) {
			Class694.aClass104_14.method20572();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 1);
		Class386.method28235();
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 3);
		Class610.method32021();
		client.aClass532_1.method30532().method33003();
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ai", descriptor = "()V", line = 312)
	public static void method18316() {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20565() && Class694.aClass104_14.method20541()) {
			Class694.aClass104_14.method20572();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 0);
		Class386.method28235();
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 2);
		Class610.method32021();
		client.aClass532_1.method30532().method33003();
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "as", descriptor = "(Z)V", line = 341)
	public static void method18324() {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20565() && Class694.aClass104_14.method20541()) {
			Class694.aClass104_14.method20572();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 0);
		Class386.method28235();
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 1);
		Class610.method32021();
		client.aClass532_1.method30532().method33003();
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "aw", descriptor = "(Z)V", line = 341)
	public static void method18334() {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20565() && Class694.aClass104_14.method20541()) {
			Class694.aClass104_14.method20572();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 0);
		Class386.method28235();
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 1);
		Class610.method32021();
		client.aClass532_1.method30532().method33003();
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "at", descriptor = "(Z)V", line = 341)
	public static void method18336() {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20565() && Class694.aClass104_14.method20541()) {
			Class694.aClass104_14.method20572();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 0);
		Class386.method28235();
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 1);
		Class610.method32021();
		client.aClass532_1.method30532().method33003();
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ad", descriptor = "(Z)V", line = 341)
	public static void method18337() {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_1, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub15_2, 1);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub2_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub46_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub25_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub21_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub8_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub14_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub19_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub20_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_2, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub39_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub6_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, Class332.aClass332_6.anInt4147 * 595334117);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub28_1, 0);
		if (Class694.aClass104_14 != null && Class694.aClass104_14.method20565() && Class694.aClass104_14.method20541()) {
			Class694.aClass104_14.method20572();
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub29_1, 0);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub31_1, 0);
		Class386.method28235();
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub24_1, 2);
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub40_1, 1);
		Class610.method32021();
		client.aClass532_1.method30532().method33003();
		client.aBoolean609 = true;
	}

	@OriginalMember(owner = "client!aq", name = "dx", descriptor = "(Lclient!dh;Lclient!aat;IIB)V", line = 347)
	static void method18343(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class93_Sub9.aClass22_20.method406();
		if (Class159_Sub1.aBoolean351) {
			return;
		}
		for (@Pc(10) Class93_Sub29 local10 = (Class93_Sub29) arg1.method445(); local10 != null; local10 = (Class93_Sub29) arg1.method415()) {
			@Pc(21) Class322 local21 = (Class322) Class159_Sub1.aClass32_Sub2_2.method18261(local10.anInt1603 * 1208139441);
			if (Class32_Sub11.method17037(local21)) {
				@Pc(34) boolean local34 = Class300.method26722(arg0, local10, local21, arg2, arg3);
				if (local34) {
					Class54.method14856(arg0, local10, local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "ed", descriptor = "(IIB)V", line = 708)
	static final void method18344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class159_Sub1.aFloat152 < Class159_Sub1.aFloat153) {
			Class159_Sub1.aFloat152 = (float) ((double) Class159_Sub1.aFloat152 + (double) Class159_Sub1.aFloat152 / 30.0D);
			if (Class159_Sub1.aFloat152 > Class159_Sub1.aFloat153) {
				Class159_Sub1.aFloat152 = Class159_Sub1.aFloat153;
			}
			Class358.method27780();
			Class159_Sub1.anInt1935 = (int) Class159_Sub1.aFloat153 >> 1;
			Class159_Sub1.aByteArrayArrayArray10 = Class166_Sub6.method15484(Class159_Sub1.anInt1935);
		} else if (Class159_Sub1.aFloat152 > Class159_Sub1.aFloat153) {
			Class159_Sub1.aFloat152 = (float) ((double) Class159_Sub1.aFloat152 - (double) Class159_Sub1.aFloat152 / 30.0D);
			if (Class159_Sub1.aFloat152 < Class159_Sub1.aFloat153) {
				Class159_Sub1.aFloat152 = Class159_Sub1.aFloat153;
			}
			Class358.method27780();
			Class159_Sub1.anInt1935 = (int) Class159_Sub1.aFloat153 >> 1;
			Class159_Sub1.aByteArrayArrayArray10 = Class166_Sub6.method15484(Class159_Sub1.anInt1935);
		}
		if (Class159_Sub1.anInt1956 * 2025914025 != -1 && Class159_Sub1.anInt1951 * 38948535 != -1) {
			@Pc(78) int local78 = Class159_Sub1.anInt1956 * 2025914025 - Class93_Sub14.anInt1527 * -1951188017;
			if (local78 != 0) {
				local78 /= Math.min(Class159_Sub1.anInt1947 * -932386613, Math.abs(local78));
			}
			@Pc(97) int local97 = Class159_Sub1.anInt1951 * 38948535 - Class159_Sub1.anInt1952 * -1606693775;
			if (local97 != 0) {
				local97 /= Math.min(Class159_Sub1.anInt1947 * -932386613, Math.abs(local97));
			}
			Class93_Sub14.anInt1527 = (local78 + -1951188017 * Class93_Sub14.anInt1527) * -1845499089;
			Class159_Sub1.anInt1952 = (Class159_Sub1.anInt1952 * -1606693775 + local97) * 1415476369;
			if (local78 == 0 && local97 == 0) {
				Class159_Sub1.anInt1956 = -130712985;
				Class159_Sub1.anInt1951 = -919990023;
			}
			Class358.method27780();
		}
		@Pc(140) Iterator local140 = Class159_Sub1.aHashMap4.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(149) Class355 local149;
				do {
					if (!local140.hasNext()) {
						local140 = Class159_Sub1.aHashMap5.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local140.hasNext()) {
										if (Class159_Sub1.aBoolean352 && Class93_Sub9.aClass22_20 != null) {
											for (@Pc(240) Class93_Sub9 local240 = (Class93_Sub9) Class93_Sub9.aClass22_20.method445(); local240 != null; local240 = (Class93_Sub9) Class93_Sub9.aClass22_20.method415()) {
												@Pc(252) Class322 local252 = (Class322) Class159_Sub1.aClass32_Sub2_2.method18261(local240.aClass93_Sub29_1.anInt1603 * 1208139441);
												if (local240.method13152(arg0, arg1)) {
													if (local252.aStringArray24 != null) {
														if (local252.aStringArray24[4] != null) {
															Class280.method26458(local252.aStringArray24[4], local252.aString175, -1, 1012, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[3] != null) {
															Class280.method26458(local252.aStringArray24[3], local252.aString175, -1, 1011, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[2] != null) {
															Class280.method26458(local252.aStringArray24[2], local252.aString175, -1, 1010, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[1] != null) {
															Class280.method26458(local252.aStringArray24[1], local252.aString175, -1, 1009, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
														if (local252.aStringArray24[0] != null) {
															Class280.method26458(local252.aStringArray24[0], local252.aString175, -1, 1008, -1, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), local252.anInt4105 * 880251661, 0, true, false, (long) (local240.aClass93_Sub29_1.anInt1603 * 1208139441), false);
														}
													}
													if (!local240.aClass93_Sub29_1.aBoolean340) {
														local240.aClass93_Sub29_1.aBoolean340 = true;
														Class165.method15320(Class155.aClass155_62, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
													}
													if (local240.aClass93_Sub29_1.aBoolean340) {
														Class165.method15320(Class155.aClass155_54, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
													}
												} else if (local240.aClass93_Sub29_1.aBoolean340) {
													local240.aClass93_Sub29_1.aBoolean340 = false;
													Class165.method15320(Class155.aClass155_53, local240.aClass93_Sub29_1.anInt1603 * 1208139441, local252.anInt4105 * 880251661);
												}
											}
										}
										return;
									}
									local149 = (Class355) ((Entry) local140.next()).getValue();
									local149.anInt4217 -= -1862405101;
								} while (local149.anInt4217 * 1950348827 != 0);
								if (local149.anInt4218 * 1599791489 > 1 || Class159_Sub1.aBoolean355) {
									local149.anInt4218 -= -1712890239;
									local149.anInt4217 = Class159_Sub1.anInt1955 * -1400884413;
								} else {
									local140.remove();
								}
							}
						}
					}
					local149 = (Class355) ((Entry) local140.next()).getValue();
					local149.anInt4217 -= -1862405101;
				} while (local149.anInt4217 * 1950348827 != 0);
				if (local149.anInt4218 * 1599791489 > 1 || Class159_Sub1.aBoolean355) {
					local149.anInt4218 -= -1712890239;
					local149.anInt4217 = Class159_Sub1.anInt1955 * -1400884413;
				} else {
					local140.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "bu", descriptor = "(Lclient!arm;IIZI)V", line = 1615)
	static void method18338(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (arg0 == null || Class454.aClass22_55.aClass93_8 == arg0) {
			return;
		}
		@Pc(12) int local12 = arg0.anInt3011 * 1966667949;
		@Pc(17) int local17 = arg0.anInt3009 * -1970204471;
		@Pc(22) int local22 = arg0.anInt3012 * -92627949;
		@Pc(28) int local28 = (int) (arg0.aLong154 * 3050087486000948885L);
		@Pc(33) long local33 = arg0.aLong154 * 3050087486000948885L;
		if (local22 >= 2000) {
			local22 -= 2000;
		}
		@Pc(41) Class611 local41 = client.aClass532_1.method30443();
		if (local22 == 1008 || local22 == 1009 || local22 == 1010 || local22 == 1011 || local22 == 1012) {
			Class62.method1153(local22, local28, local12);
		}
		@Pc(69) Class312 local69;
		if (local22 == 58) {
			local69 = Class124_Sub2.method9308(local17, local12);
			if (local69 != null) {
				Class420.method28745(local69);
			}
		}
		if (local22 == 57 || local22 == 1007) {
			Class334.method27403(local28, local17, local12, arg0.aString100);
		}
		if (local22 == 25) {
			local69 = Class124_Sub2.method9308(local17, local12);
			if (local69 != null) {
				Class624.method32160();
				@Pc(104) Class93_Sub19 local104 = client.method25238(local69);
				Class698.method36701(local69, local104.method13620(), local104.anInt1546 * -1350606777);
				client.aString145 = Class629.method32264(local69);
				if (client.aString145 == null) {
					client.aString145 = "Null";
				}
				client.aString142 = local69.aString165 + Class306.method26823(16777215);
			}
			return;
		}
		@Pc(138) Class446 local138 = null;
		if (local22 == 44) {
			local138 = Class446.aClass446_119;
		} else if (local22 == 45) {
			local138 = Class446.aClass446_25;
		} else if (local22 == 46) {
			local138 = Class446.aClass446_78;
		} else if (local22 == 47) {
			local138 = Class446.aClass446_104;
		} else if (local22 == 48) {
			local138 = Class446.aClass446_6;
		} else if (local22 == 49) {
			local138 = Class446.aClass446_64;
		} else if (local22 == 50) {
			local138 = Class446.aClass446_40;
		} else if (local22 == 51) {
			local138 = Class446.aClass446_50;
		} else if (local22 == 52) {
			local138 = Class446.aClass446_91;
		} else if (local22 == 53) {
			local138 = Class446.aClass446_24;
		}
		@Pc(224) Class93_Sub22 local224;
		if (local138 != null) {
			@Pc(203) Class132_Sub1_Sub1_Sub1_Sub2 local203 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local203 != null) {
				client.anInt3465 = arg1 * 826123699;
				client.anInt3499 = arg2 * -398107037;
				client.anInt3501 = 52502862;
				client.anInt3500 = 0;
				local224 = Class102.method2592(local138, client.aClass175_2.aClass24_2);
				local224.aClass93_Sub41_Sub2_1.method22454(local28);
				local224.aClass93_Sub41_Sub2_1.method22446(Class28.method601() ? 1 : 0);
				client.aClass175_2.method24351(local224);
				Class498.method30137(local203.anIntArray240[0], local203.anIntArray239[0]);
			}
		}
		@Pc(255) Class446 local255 = null;
		if (local22 == 3) {
			local255 = Class446.aClass446_14;
		} else if (local22 == 4) {
			local255 = Class446.aClass446_98;
		} else if (local22 == 5) {
			local255 = Class446.aClass446_29;
		} else if (local22 == 6) {
			local255 = Class446.aClass446_115;
		} else if (local22 == 1001) {
			local255 = Class446.aClass446_121;
		} else if (local22 == 1002) {
			local255 = Class446.aClass446_41;
		}
		if (local255 != null) {
			client.anInt3465 = arg1 * 826123699;
			client.anInt3499 = arg2 * -398107037;
			client.anInt3501 = 52502862;
			client.anInt3500 = 0;
			local224 = Class102.method2592(local255, client.aClass175_2.aClass24_2);
			local224.aClass93_Sub41_Sub2_1.method22447(Class28.method601() ? 1 : 0);
			local224.aClass93_Sub41_Sub2_1.method22454(local41.anInt5624 * -1994307635 + local17);
			local224.aClass93_Sub41_Sub2_1.method22395((int) (local33 >>> 32) & Integer.MAX_VALUE);
			local224.aClass93_Sub41_Sub2_1.method22456(local12 + local41.anInt5623 * 270611681);
			client.aClass175_2.method24351(local224);
			Class498.method30137(local12, local17);
		}
		if (local22 == 23) {
			if (client.anInt3514 * 2055688893 > 0 && Class436.method28815()) {
				Class684.method33424(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, local12 + local41.anInt5623 * 270611681, local41.anInt5624 * -1994307635 + local17);
			} else {
				local224 = Class633.method32307(local12, local17, local28);
				if (local28 == 1) {
					local224.aClass93_Sub41_Sub2_1.method22510(-1);
					local224.aClass93_Sub41_Sub2_1.method22510(-1);
					local224.aClass93_Sub41_Sub2_1.method22454((int) client.aFloat253);
					local224.aClass93_Sub41_Sub2_1.method22510(57);
					local224.aClass93_Sub41_Sub2_1.method22510(client.anInt3477 * -1357343303);
					local224.aClass93_Sub41_Sub2_1.method22510(client.anInt3478 * 663566609);
					local224.aClass93_Sub41_Sub2_1.method22510(89);
					@Pc(439) Class472 local439 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24229().aClass472_61;
					local224.aClass93_Sub41_Sub2_1.method22454((int) local439.aFloat317);
					local224.aClass93_Sub41_Sub2_1.method22454((int) local439.aFloat319);
					local224.aClass93_Sub41_Sub2_1.method22510(63);
				} else {
					client.anInt3465 = arg1 * 826123699;
					client.anInt3499 = arg2 * -398107037;
					client.anInt3501 = -2121232217;
					client.anInt3500 = 0;
				}
				client.aClass175_2.method24351(local224);
				Class498.method30137(local12, local17);
			}
		}
		@Pc(481) Class446 local481 = null;
		if (local22 == 9) {
			local481 = Class446.aClass446_35;
		} else if (local22 == 10) {
			local481 = Class446.aClass446_58;
		} else if (local22 == 11) {
			local481 = Class446.aClass446_90;
		} else if (local22 == 12) {
			local481 = Class446.aClass446_38;
		} else if (local22 == 13) {
			local481 = Class446.aClass446_4;
		} else if (local22 == 1003) {
			local481 = Class446.aClass446_11;
		}
		@Pc(531) Class132_Sub1_Sub1_Sub1_Sub1 local531;
		@Pc(549) Class93_Sub22 local549;
		@Pc(525) Class93_Sub15 local525;
		if (local481 != null) {
			local525 = (Class93_Sub15) client.aClass16_18.method215((long) local28);
			if (local525 != null) {
				local531 = (Class132_Sub1_Sub1_Sub1_Sub1) local525.anObject5;
				client.anInt3465 = arg1 * 826123699;
				client.anInt3499 = arg2 * -398107037;
				client.anInt3501 = 52502862;
				client.anInt3500 = 0;
				local549 = Class102.method2592(local481, client.aClass175_2.aClass24_2);
				local549.aClass93_Sub41_Sub2_1.method22448(Class28.method601() ? 1 : 0);
				local549.aClass93_Sub41_Sub2_1.method22458(local28);
				client.aClass175_2.method24351(local549);
				Class498.method30137(local531.anIntArray240[0], local531.anIntArray239[0]);
			}
		}
		@Pc(599) Class93_Sub22 local599;
		if (local22 == 17) {
			client.anInt3465 = arg1 * 826123699;
			client.anInt3499 = arg2 * -398107037;
			client.anInt3501 = 52502862;
			client.anInt3500 = 0;
			local599 = Class102.method2592(Class446.aClass446_116, client.aClass175_2.aClass24_2);
			local599.aClass93_Sub41_Sub2_1.method22590(local28);
			local599.aClass93_Sub41_Sub2_1.method22446(Class28.method601() ? 1 : 0);
			local599.aClass93_Sub41_Sub2_1.method22590(client.anInt3524 * -239149331);
			local599.aClass93_Sub41_Sub2_1.method22590(local17 + local41.anInt5624 * -1994307635);
			local599.aClass93_Sub41_Sub2_1.method22590(local41.anInt5623 * 270611681 + local12);
			local599.aClass93_Sub41_Sub2_1.method22466(Class148.anInt1394 * -278883695);
			local599.aClass93_Sub41_Sub2_1.method22456(client.anInt3523 * 1573685689);
			client.aClass175_2.method24351(local599);
			Class498.method30137(local12, local17);
		}
		if (local22 == 8) {
			local525 = (Class93_Sub15) client.aClass16_18.method215((long) local28);
			if (local525 != null) {
				local531 = (Class132_Sub1_Sub1_Sub1_Sub1) local525.anObject5;
				client.anInt3465 = arg1 * 826123699;
				client.anInt3499 = arg2 * -398107037;
				client.anInt3501 = 52502862;
				client.anInt3500 = 0;
				local549 = Class102.method2592(Class446.aClass446_118, client.aClass175_2.aClass24_2);
				local549.aClass93_Sub41_Sub2_1.method22395(Class148.anInt1394 * -278883695);
				local549.aClass93_Sub41_Sub2_1.method22454(local28);
				local549.aClass93_Sub41_Sub2_1.method22446(Class28.method601() ? 1 : 0);
				local549.aClass93_Sub41_Sub2_1.method22590(client.anInt3524 * -239149331);
				local549.aClass93_Sub41_Sub2_1.method22454(client.anInt3523 * 1573685689);
				client.aClass175_2.method24351(local549);
				Class498.method30137(local531.anIntArray240[0], local531.anIntArray239[0]);
			}
		}
		if (local22 == 2) {
			client.anInt3465 = arg1 * 826123699;
			client.anInt3499 = arg2 * -398107037;
			client.anInt3501 = 52502862;
			client.anInt3500 = 0;
			local599 = Class102.method2592(Class446.aClass446_23, client.aClass175_2.aClass24_2);
			local599.aClass93_Sub41_Sub2_1.method22446(Class28.method601() ? 1 : 0);
			local599.aClass93_Sub41_Sub2_1.method22590(local12 + local41.anInt5623 * 270611681);
			local599.aClass93_Sub41_Sub2_1.method22590(client.anInt3524 * -239149331);
			local599.aClass93_Sub41_Sub2_1.method22456(local17 + local41.anInt5624 * -1994307635);
			local599.aClass93_Sub41_Sub2_1.method22465(Class148.anInt1394 * -278883695);
			local599.aClass93_Sub41_Sub2_1.method22466((int) (local33 >>> 32) & Integer.MAX_VALUE);
			local599.aClass93_Sub41_Sub2_1.method22454(client.anInt3523 * 1573685689);
			client.aClass175_2.method24351(local599);
			Class498.method30137(local12, local17);
		}
		if (local22 == 60) {
			if (client.anInt3514 * 2055688893 > 0 && Class436.method28815()) {
				Class684.method33424(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, local41.anInt5623 * 270611681 + local12, local17 + local41.anInt5624 * -1994307635);
			} else {
				client.anInt3465 = arg1 * 826123699;
				client.anInt3499 = arg2 * -398107037;
				client.anInt3501 = -2121232217;
				client.anInt3500 = 0;
				local599 = Class102.method2592(Class446.aClass446_109, client.aClass175_2.aClass24_2);
				local599.aClass93_Sub41_Sub2_1.method22458(local17 + local41.anInt5624 * -1994307635);
				local599.aClass93_Sub41_Sub2_1.method22456(local41.anInt5623 * 270611681 + local12);
				client.aClass175_2.method24351(local599);
			}
		}
		if (local22 == 16) {
			client.anInt3465 = arg1 * 826123699;
			client.anInt3499 = arg2 * -398107037;
			client.anInt3501 = 52502862;
			client.anInt3500 = 0;
			local599 = Class102.method2592(Class446.aClass446_71, client.aClass175_2.aClass24_2);
			local599.aClass93_Sub41_Sub2_1.method22454(client.anInt3523 * 1573685689);
			local599.aClass93_Sub41_Sub2_1.method22446(Class28.method601() ? 1 : 0);
			local599.aClass93_Sub41_Sub2_1.method22590(client.anInt3524 * -239149331);
			local599.aClass93_Sub41_Sub2_1.method22456(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2768 * -1688488127);
			local599.aClass93_Sub41_Sub2_1.method22466(Class148.anInt1394 * -278883695);
			client.aClass175_2.method24351(local599);
		}
		@Pc(971) Class446 local971 = null;
		if (local22 == 18) {
			local971 = Class446.aClass446_12;
		} else if (local22 == 19) {
			local971 = Class446.aClass446_122;
		} else if (local22 == 20) {
			local971 = Class446.aClass446_28;
		} else if (local22 == 21) {
			local971 = Class446.aClass446_83;
		} else if (local22 == 22) {
			local971 = Class446.aClass446_18;
		} else if (local22 == 1004) {
			local971 = Class446.aClass446_2;
		}
		@Pc(1027) Class93_Sub22 local1027;
		if (local971 != null) {
			client.anInt3465 = arg1 * 826123699;
			client.anInt3499 = arg2 * -398107037;
			client.anInt3501 = 52502862;
			client.anInt3500 = 0;
			local1027 = Class102.method2592(local971, client.aClass175_2.aClass24_2);
			local1027.aClass93_Sub41_Sub2_1.method22590(local28);
			local1027.aClass93_Sub41_Sub2_1.method22590(local41.anInt5623 * 270611681 + local12);
			local1027.aClass93_Sub41_Sub2_1.method22454(local17 + local41.anInt5624 * -1994307635);
			local1027.aClass93_Sub41_Sub2_1.method22448((arg3 ? 2 : 0) | (Class28.method601() ? 1 : 0));
			client.aClass175_2.method24351(local1027);
			Class498.method30137(local12, local17);
		}
		if (local22 == 15) {
			@Pc(1083) Class132_Sub1_Sub1_Sub1_Sub2 local1083 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local1083 != null) {
				client.anInt3465 = arg1 * 826123699;
				client.anInt3499 = arg2 * -398107037;
				client.anInt3501 = 52502862;
				client.anInt3500 = 0;
				local549 = Class102.method2592(Class446.aClass446_71, client.aClass175_2.aClass24_2);
				local549.aClass93_Sub41_Sub2_1.method22454(client.anInt3523 * 1573685689);
				local549.aClass93_Sub41_Sub2_1.method22446(Class28.method601() ? 1 : 0);
				local549.aClass93_Sub41_Sub2_1.method22590(client.anInt3524 * -239149331);
				local549.aClass93_Sub41_Sub2_1.method22456(local28);
				local549.aClass93_Sub41_Sub2_1.method22466(Class148.anInt1394 * -278883695);
				client.aClass175_2.method24351(local549);
				Class498.method30137(local1083.anIntArray240[0], local1083.anIntArray239[0]);
			}
		}
		if (local22 == 59) {
			client.anInt3465 = arg1 * 826123699;
			client.anInt3499 = arg2 * -398107037;
			client.anInt3501 = -2121232217;
			client.anInt3500 = 0;
			local1027 = Class102.method2592(Class446.aClass446_61, client.aClass175_2.aClass24_2);
			local1027.aClass93_Sub41_Sub2_1.method22458(local41.anInt5623 * 270611681 + local12);
			local1027.aClass93_Sub41_Sub2_1.method22465(Class148.anInt1394 * -278883695);
			local1027.aClass93_Sub41_Sub2_1.method22454(client.anInt3524 * -239149331);
			local1027.aClass93_Sub41_Sub2_1.method22458(local41.anInt5624 * -1994307635 + local17);
			local1027.aClass93_Sub41_Sub2_1.method22458(client.anInt3523 * 1573685689);
			client.aClass175_2.method24351(local1027);
			Class498.method30137(local12, local17);
		}
		if (local22 == 30 && client.aClass312_7 == null) {
			Class1.method16(local17, local12);
			client.aClass312_7 = Class124_Sub2.method9308(local17, local12);
			if (client.aClass312_7 != null) {
				Class354.method27696(client.aClass312_7);
			}
		}
		if (client.aBoolean625) {
			Class624.method32160();
		}
		if (Class627.aClass312_12 != null && client.anInt3502 * -2145300079 == 0) {
			Class354.method27696(Class627.aClass312_12);
		}
	}

	@OriginalMember(owner = "client!aq", name = "cl", descriptor = "(Lclient!yf;B)V", line = 5297)
	static final void method18342(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class286.method26526(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!aq", name = "fe", descriptor = "(Lclient!yf;I)V", line = 6004)
	static final void method18345(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class220.method25547(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!aq", name = "hj", descriptor = "(Lclient!yf;I)V", line = 6434)
	static final void method18339(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class453.method28965(local11, local14, arg0, Class310.aClass310_6);
	}

	@OriginalMember(owner = "client!aq", name = "bbu", descriptor = "(Lclient!yf;S)V", line = 14380)
	static final void method18340(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= 1189701933;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
