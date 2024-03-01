package com.jagex;

import java.awt.Dimension;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public class Class77 {

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
	static final int anInt2903 = 50000;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "F")
	static final float aFloat226 = 1.3F;

	@OriginalMember(owner = "client!aq", name = "x", descriptor = "I")
	static final int anInt2904 = 502;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
	static final int anInt2905 = 10000;

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
	static final int anInt2906 = 104;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
	static final int anInt2907 = 100000;

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
	static final int anInt2908 = 1003;

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "J")
	static final long aLong222 = 64425238954L;

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "J")
	static final long aLong223 = 60129613779L;

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "Z")
	public static boolean aBoolean527 = false;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "Z")
	public static boolean aBoolean528 = false;

	@OriginalMember(owner = "client!aq", name = "z", descriptor = "Z")
	static boolean aBoolean529 = false;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "(IIIB)I", line = 11)
	public static int method21572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V", line = 33)
	Class77() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "(Lclient!ahb;I)Lclient!kn;", line = 33)
	public static Class282 method21573(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20269();
		@Pc(10) Class277 local10 = Class3_Sub30.method11638()[arg0.method20269()];
		@Pc(17) Class276 local17 = Class400.method27575()[arg0.method20269()];
		@Pc(21) int local21 = arg0.method20272();
		@Pc(25) int local25 = arg0.method20272();
		@Pc(29) int local29 = arg0.method20271();
		@Pc(33) int local33 = arg0.method20271();
		@Pc(37) int local37 = arg0.method20275();
		@Pc(41) int local41 = arg0.method20275();
		@Pc(45) int local45 = arg0.method20275();
		@Pc(54) boolean local54 = arg0.method20269() == 1;
		return new Class282(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local54);
	}

	@OriginalMember(owner = "client!aq", name = "z", descriptor = "()Lclient!aht;", line = 38)
	static Class3_Sub45 method21541() {
		@Pc(1) Class592 local1 = null;
		@Pc(7) Class3_Sub45 local7 = new Class3_Sub45(client.aClass543_2, 0);
		try {
			local1 = Class348.method26559("", client.aClass543_2.aString236, false);
			@Pc(20) byte[] local20 = new byte[(int) local1.method33340()];
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22 += local36) {
				local36 = local1.method33341(local20, local22, local20.length - local22);
				if (local36 == -1) {
					throw new IOException();
				}
			}
			local7 = new Class3_Sub45(new Class3_Sub41(local20), client.aClass543_2, 0);
		} catch (@Pc(60) Exception local60) {
		}
		try {
			if (local1 != null) {
				local1.method33339();
			}
		} catch (@Pc(68) Exception local68) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "()Lclient!aht;", line = 38)
	static Class3_Sub45 method21542() {
		@Pc(1) Class592 local1 = null;
		@Pc(7) Class3_Sub45 local7 = new Class3_Sub45(client.aClass543_2, 0);
		try {
			local1 = Class348.method26559("", client.aClass543_2.aString236, false);
			@Pc(20) byte[] local20 = new byte[(int) local1.method33340()];
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22 += local36) {
				local36 = local1.method33341(local20, local22, local20.length - local22);
				if (local36 == -1) {
					throw new IOException();
				}
			}
			local7 = new Class3_Sub45(new Class3_Sub41(local20), client.aClass543_2, 0);
		} catch (@Pc(60) Exception local60) {
		}
		try {
			if (local1 != null) {
				local1.method33339();
			}
		} catch (@Pc(68) Exception local68) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "()Lclient!aht;", line = 38)
	static Class3_Sub45 method21543() {
		@Pc(1) Class592 local1 = null;
		@Pc(7) Class3_Sub45 local7 = new Class3_Sub45(client.aClass543_2, 0);
		try {
			local1 = Class348.method26559("", client.aClass543_2.aString236, false);
			@Pc(20) byte[] local20 = new byte[(int) local1.method33340()];
			@Pc(36) int local36;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22 += local36) {
				local36 = local1.method33341(local20, local22, local20.length - local22);
				if (local36 == -1) {
					throw new IOException();
				}
			}
			local7 = new Class3_Sub45(new Class3_Sub41(local20), client.aClass543_2, 0);
		} catch (@Pc(60) Exception local60) {
		}
		try {
			if (local1 != null) {
				local1.method33339();
			}
		} catch (@Pc(68) Exception local68) {
		}
		return local7;
	}

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "()V", line = 60)
	public static void method21539() {
		@Pc(1) Class592 local1 = null;
		try {
			local1 = Class348.method26559("", client.aClass543_2.aString236, true);
			@Pc(12) Class3_Sub41 local12 = Class510.aClass3_Sub45_37.method13007();
			local1.method33338(local12.aByteArray51, 0, local12.anInt2803 * 62066237);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method33339();
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "()V", line = 60)
	public static void method21547() {
		@Pc(1) Class592 local1 = null;
		try {
			local1 = Class348.method26559("", client.aClass543_2.aString236, true);
			@Pc(12) Class3_Sub41 local12 = Class510.aClass3_Sub45_37.method13007();
			local1.method33338(local12.aByteArray51, 0, local12.anInt2803 * 62066237);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method33339();
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "()V", line = 60)
	public static void method21559() {
		@Pc(1) Class592 local1 = null;
		try {
			local1 = Class348.method26559("", client.aClass543_2.aString236, true);
			@Pc(12) Class3_Sub41 local12 = Class510.aClass3_Sub45_37.method13007();
			local1.method33338(local12.aByteArray51, 0, local12.anInt2803 * 62066237);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method33339();
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "()V", line = 60)
	public static void method21566() {
		@Pc(1) Class592 local1 = null;
		try {
			local1 = Class348.method26559("", client.aClass543_2.aString236, true);
			@Pc(12) Class3_Sub41 local12 = Class510.aClass3_Sub45_37.method13007();
			local1.method33338(local12.aByteArray51, 0, local12.anInt2803 * 62066237);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method33339();
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "()I", line = 74)
	public static int method21545() {
		@Pc(2) Class64_Sub1 local2 = Class450.method28382();
		Class166.method23343(local2);
		return local2.method13085();
	}

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "()I", line = 74)
	public static int method21563() {
		@Pc(2) Class64_Sub1 local2 = Class450.method28382();
		Class166.method23343(local2);
		return local2.method13085();
	}

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "()I", line = 74)
	public static int method21567() {
		@Pc(2) Class64_Sub1 local2 = Class450.method28382();
		Class166.method23343(local2);
		return local2.method13085();
	}

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "()Lclient!ahw;", line = 80)
	static Class64_Sub1 method21549() {
		@Pc(3) Class64_Sub1 local3 = new Class64_Sub1();
		@Pc(7) boolean local7 = false;
		@Pc(17) boolean local17;
		@Pc(19) boolean local19;
		if (Class344.aString208.startsWith("win")) {
			local7 = true;
			local17 = true;
			local19 = true;
		} else {
			local17 = true;
			local19 = true;
		}
		if (aBoolean527) {
			local3.method13103(16);
			local17 = false;
		}
		if (aBoolean528) {
			local3.method13103(32);
			local7 = false;
		}
		if (aBoolean529) {
			local3.method13103(16384);
			local19 = false;
		}
		if (!local17 && !local7) {
			Class75.method19522(local3);
			return local3;
		}
		@Pc(59) int local59 = -1;
		@Pc(61) int local61 = -1;
		@Pc(63) int local63 = -1;
		if (local7) {
			try {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 3);
				Class26_Sub1_Sub1_Sub1.method16728();
				local61 = method21570(3, 1000);
				if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 3) {
					local3.method13103(4);
					@Pc(91) Class117 local91 = Class613.aClass21_13.method17016();
					@Pc(98) long local98 = local91.aLong237 * 3118557101980400735L & 0xFFFFFFFFFFFFL;
					@Pc(111) boolean local111;
					switch(local91.anInt3201 * -1635434713) {
						case 4098:
							local111 = local98 >= 60129613779L;
							local17 &= local111;
							if (!local111) {
								local3.method13103(512);
							}
							break;
						case 4318:
							local111 = local98 >= 64425238954L;
							local17 &= local111;
							if (!local111) {
								local3.method13103(256);
							}
					}
				}
			} catch (@Pc(142) Exception local142) {
				local3.method13103(4096);
			}
		}
		if (local19) {
			try {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 5);
				Class26_Sub1_Sub1_Sub1.method16728();
				local63 = method21570(5, 1000);
				if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 5) {
					local3.method13103(8192);
				}
			} catch (@Pc(173) Exception local173) {
				local3.method13103(32768);
			}
		}
		if (local17) {
			try {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 4);
				Class26_Sub1_Sub1_Sub1.method16728();
				local59 = method21570(1, 1000);
				if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 1) {
					local3.method13103(2);
				}
			} catch (@Pc(204) Exception local204) {
				local3.method13103(2048);
			}
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 0);
		if (local59 == -1 && local61 == -1) {
			Class75.method19522(local3);
			return local3;
		}
		local3.method13105(3, local61);
		local3.method13105(1, local59);
		local3.method13105(5, local63);
		local61 = (int) ((float) local61 * 1.3F);
		if ((local61 <= 100000 || local59 <= 100000) && local61 <= local59) {
			Class359.method26762(local3, 1, local61 == -1 ? local59 : local61);
		} else {
			Class359.method26762(local3, 3, local59 == -1 ? local61 : local59);
		}
		return local3;
	}

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "()Lclient!ahw;", line = 80)
	static Class64_Sub1 method21550() {
		@Pc(3) Class64_Sub1 local3 = new Class64_Sub1();
		@Pc(7) boolean local7 = false;
		@Pc(17) boolean local17;
		@Pc(19) boolean local19;
		if (Class344.aString208.startsWith("win")) {
			local7 = true;
			local17 = true;
			local19 = true;
		} else {
			local17 = true;
			local19 = true;
		}
		if (aBoolean527) {
			local3.method13103(16);
			local17 = false;
		}
		if (aBoolean528) {
			local3.method13103(32);
			local7 = false;
		}
		if (aBoolean529) {
			local3.method13103(16384);
			local19 = false;
		}
		if (!local17 && !local7) {
			Class75.method19522(local3);
			return local3;
		}
		@Pc(59) int local59 = -1;
		@Pc(61) int local61 = -1;
		@Pc(63) int local63 = -1;
		if (local7) {
			try {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 3);
				Class26_Sub1_Sub1_Sub1.method16728();
				local61 = method21570(3, 1000);
				if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 3) {
					local3.method13103(4);
					@Pc(91) Class117 local91 = Class613.aClass21_13.method17016();
					@Pc(98) long local98 = local91.aLong237 * 3118557101980400735L & 0xFFFFFFFFFFFFL;
					@Pc(111) boolean local111;
					switch(local91.anInt3201 * -1635434713) {
						case 4098:
							local111 = local98 >= 60129613779L;
							local17 &= local111;
							if (!local111) {
								local3.method13103(512);
							}
							break;
						case 4318:
							local111 = local98 >= 64425238954L;
							local17 &= local111;
							if (!local111) {
								local3.method13103(256);
							}
					}
				}
			} catch (@Pc(142) Exception local142) {
				local3.method13103(4096);
			}
		}
		if (local19) {
			try {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 5);
				Class26_Sub1_Sub1_Sub1.method16728();
				local63 = method21570(5, 1000);
				if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 5) {
					local3.method13103(8192);
				}
			} catch (@Pc(173) Exception local173) {
				local3.method13103(32768);
			}
		}
		if (local17) {
			try {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 4);
				Class26_Sub1_Sub1_Sub1.method16728();
				local59 = method21570(1, 1000);
				if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 1) {
					local3.method13103(2);
				}
			} catch (@Pc(204) Exception local204) {
				local3.method13103(2048);
			}
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 0);
		if (local59 == -1 && local61 == -1) {
			Class75.method19522(local3);
			return local3;
		}
		local3.method13105(3, local61);
		local3.method13105(1, local59);
		local3.method13105(5, local63);
		local61 = (int) ((float) local61 * 1.3F);
		if ((local61 <= 100000 || local59 <= 100000) && local61 <= local59) {
			Class359.method26762(local3, 1, local61 == -1 ? local59 : local61);
		} else {
			Class359.method26762(local3, 3, local59 == -1 ? local61 : local59);
		}
		return local3;
	}

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "()Lclient!ahw;", line = 80)
	static Class64_Sub1 method21552() {
		@Pc(3) Class64_Sub1 local3 = new Class64_Sub1();
		@Pc(7) boolean local7 = false;
		@Pc(17) boolean local17;
		@Pc(19) boolean local19;
		if (Class344.aString208.startsWith("win")) {
			local7 = true;
			local17 = true;
			local19 = true;
		} else {
			local17 = true;
			local19 = true;
		}
		if (aBoolean527) {
			local3.method13103(16);
			local17 = false;
		}
		if (aBoolean528) {
			local3.method13103(32);
			local7 = false;
		}
		if (aBoolean529) {
			local3.method13103(16384);
			local19 = false;
		}
		if (!local17 && !local7) {
			Class75.method19522(local3);
			return local3;
		}
		@Pc(59) int local59 = -1;
		@Pc(61) int local61 = -1;
		@Pc(63) int local63 = -1;
		if (local7) {
			try {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 3);
				Class26_Sub1_Sub1_Sub1.method16728();
				local61 = method21570(3, 1000);
				if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 3) {
					local3.method13103(4);
					@Pc(91) Class117 local91 = Class613.aClass21_13.method17016();
					@Pc(98) long local98 = local91.aLong237 * 3118557101980400735L & 0xFFFFFFFFFFFFL;
					@Pc(111) boolean local111;
					switch(local91.anInt3201 * -1635434713) {
						case 4098:
							local111 = local98 >= 60129613779L;
							local17 &= local111;
							if (!local111) {
								local3.method13103(512);
							}
							break;
						case 4318:
							local111 = local98 >= 64425238954L;
							local17 &= local111;
							if (!local111) {
								local3.method13103(256);
							}
					}
				}
			} catch (@Pc(142) Exception local142) {
				local3.method13103(4096);
			}
		}
		if (local19) {
			try {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 5);
				Class26_Sub1_Sub1_Sub1.method16728();
				local63 = method21570(5, 1000);
				if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 5) {
					local3.method13103(8192);
				}
			} catch (@Pc(173) Exception local173) {
				local3.method13103(32768);
			}
		}
		if (local17) {
			try {
				Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 4);
				Class26_Sub1_Sub1_Sub1.method16728();
				local59 = method21570(1, 1000);
				if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 1) {
					local3.method13103(2);
				}
			} catch (@Pc(204) Exception local204) {
				local3.method13103(2048);
			}
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub26_1, 0);
		if (local59 == -1 && local61 == -1) {
			Class75.method19522(local3);
			return local3;
		}
		local3.method13105(3, local61);
		local3.method13105(1, local59);
		local3.method13105(5, local63);
		local61 = (int) ((float) local61 * 1.3F);
		if ((local61 <= 100000 || local59 <= 100000) && local61 <= local59) {
			Class359.method26762(local3, 1, local61 == -1 ? local59 : local61);
		} else {
			Class359.method26762(local3, 3, local59 == -1 ? local61 : local59);
		}
		return local3;
	}

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "(IZB)V", line = 118)
	static void method21571(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg1);
		if (local4 != null) {
			for (@Pc(10) int local10 = 0; local10 < local4.anIntArray178.length; local10++) {
				local4.anIntArray178[local10] = -1;
				local4.anIntArray179[local10] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "(Lclient!ahw;)V", line = 185)
	static void method21553(@OriginalArg(0) Class64_Sub1 arg0) {
		arg0.method13104(0);
		@Pc(18) byte local18;
		if (Class390.anInt3031 * -435910341 >= 96) {
			@Pc(11) int local11 = Class46.method8524();
			if (local11 <= 104) {
				Class565.method32912();
				local18 = 4;
			} else if (local11 <= 502) {
				Class572.method33073();
				local18 = 3;
			} else if (local11 <= 1003) {
				Class210.method24250();
				local18 = 2;
			} else {
				Class280.method25423();
				local18 = 1;
			}
			arg0.method13105(0, local11);
		} else {
			Class280.method25423();
			local18 = 1;
			arg0.method13103(64);
		}
		if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 0) {
			Class510.aClass3_Sub45_37.method13000(Class510.aClass3_Sub45_37.aClass60_Sub10_2, true);
		} else {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 0);
			Class546.method32647(0, false);
		}
		Class26_Sub1_Sub1_Sub1.method16728();
		arg0.method13102(local18);
	}

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "(Lclient!ahw;)V", line = 185)
	static void method21554(@OriginalArg(0) Class64_Sub1 arg0) {
		arg0.method13104(0);
		@Pc(18) byte local18;
		if (Class390.anInt3031 * -435910341 >= 96) {
			@Pc(11) int local11 = Class46.method8524();
			if (local11 <= 104) {
				Class565.method32912();
				local18 = 4;
			} else if (local11 <= 502) {
				Class572.method33073();
				local18 = 3;
			} else if (local11 <= 1003) {
				Class210.method24250();
				local18 = 2;
			} else {
				Class280.method25423();
				local18 = 1;
			}
			arg0.method13105(0, local11);
		} else {
			Class280.method25423();
			local18 = 1;
			arg0.method13103(64);
		}
		if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 0) {
			Class510.aClass3_Sub45_37.method13000(Class510.aClass3_Sub45_37.aClass60_Sub10_2, true);
		} else {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 0);
			Class546.method32647(0, false);
		}
		Class26_Sub1_Sub1_Sub1.method16728();
		arg0.method13102(local18);
	}

	@OriginalMember(owner = "client!aq", name = "at", descriptor = "(Lclient!ahw;)V", line = 185)
	static void method21555(@OriginalArg(0) Class64_Sub1 arg0) {
		arg0.method13104(0);
		@Pc(18) byte local18;
		if (Class390.anInt3031 * -435910341 >= 96) {
			@Pc(11) int local11 = Class46.method8524();
			if (local11 <= 104) {
				Class565.method32912();
				local18 = 4;
			} else if (local11 <= 502) {
				Class572.method33073();
				local18 = 3;
			} else if (local11 <= 1003) {
				Class210.method24250();
				local18 = 2;
			} else {
				Class280.method25423();
				local18 = 1;
			}
			arg0.method13105(0, local11);
		} else {
			Class280.method25423();
			local18 = 1;
			arg0.method13103(64);
		}
		if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 0) {
			Class510.aClass3_Sub45_37.method13000(Class510.aClass3_Sub45_37.aClass60_Sub10_2, true);
		} else {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 0);
			Class546.method32647(0, false);
		}
		Class26_Sub1_Sub1_Sub1.method16728();
		arg0.method13102(local18);
	}

	@OriginalMember(owner = "client!aq", name = "af", descriptor = "(Lclient!ahw;)V", line = 185)
	static void method21556(@OriginalArg(0) Class64_Sub1 arg0) {
		arg0.method13104(0);
		@Pc(18) byte local18;
		if (Class390.anInt3031 * -435910341 >= 96) {
			@Pc(11) int local11 = Class46.method8524();
			if (local11 <= 104) {
				Class565.method32912();
				local18 = 4;
			} else if (local11 <= 502) {
				Class572.method33073();
				local18 = 3;
			} else if (local11 <= 1003) {
				Class210.method24250();
				local18 = 2;
			} else {
				Class280.method25423();
				local18 = 1;
			}
			arg0.method13105(0, local11);
		} else {
			Class280.method25423();
			local18 = 1;
			arg0.method13103(64);
		}
		if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == 0) {
			Class510.aClass3_Sub45_37.method13000(Class510.aClass3_Sub45_37.aClass60_Sub10_2, true);
		} else {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, 0);
			Class546.method32647(0, false);
		}
		Class26_Sub1_Sub1_Sub1.method16728();
		arg0.method13102(local18);
	}

	@OriginalMember(owner = "client!aq", name = "ak", descriptor = "()V", line = 254)
	public static void method21551() {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_2, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub9_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub25_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub4_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub3_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub6_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub7_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub2_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub22_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub5_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_2, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub12_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub17_1, Class191.aClass191_2.anInt3679 * -356338717);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub29_1, 0);
		if (Class613.aClass21_13 != null && Class613.aClass21_13.method17166() && Class613.aClass21_13.method17131()) {
			Class613.aClass21_13.method17130();
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub23_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub14_1, 1);
		Class586.method33283();
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub8_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub32_1, 4);
		Class457.method28515();
		client.aClass370_1.method26953().method28901();
		client.aBoolean606 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ah", descriptor = "()V", line = 283)
	public static void method21544() {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_2, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub9_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub25_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub4_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub3_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub6_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub7_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub2_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub22_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub5_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_2, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub12_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub17_1, Class191.aClass191_2.anInt3679 * -356338717);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub29_1, 0);
		if (Class613.aClass21_13 != null && Class613.aClass21_13.method17166() && Class613.aClass21_13.method17131()) {
			Class613.aClass21_13.method17130();
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub23_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub14_1, 1);
		Class586.method33283();
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub8_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub32_1, 3);
		Class457.method28515();
		client.aClass370_1.method26953().method28901();
		client.aBoolean606 = true;
	}

	@OriginalMember(owner = "client!aq", name = "aa", descriptor = "()V", line = 283)
	public static void method21558() {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_2, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub9_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub25_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub4_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub3_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub6_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub7_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub2_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub22_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub5_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_2, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub12_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub17_1, Class191.aClass191_2.anInt3679 * -356338717);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub29_1, 0);
		if (Class613.aClass21_13 != null && Class613.aClass21_13.method17166() && Class613.aClass21_13.method17131()) {
			Class613.aClass21_13.method17130();
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub23_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub14_1, 1);
		Class586.method33283();
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub8_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub32_1, 3);
		Class457.method28515();
		client.aClass370_1.method26953().method28901();
		client.aBoolean606 = true;
	}

	@OriginalMember(owner = "client!aq", name = "an", descriptor = "()V", line = 283)
	public static void method21560() {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_2, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub9_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub25_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub4_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub3_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub6_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub7_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub2_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub22_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub5_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_2, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub12_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub17_1, Class191.aClass191_2.anInt3679 * -356338717);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub29_1, 0);
		if (Class613.aClass21_13 != null && Class613.aClass21_13.method17166() && Class613.aClass21_13.method17131()) {
			Class613.aClass21_13.method17130();
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub23_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub14_1, 1);
		Class586.method33283();
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub8_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub32_1, 3);
		Class457.method28515();
		client.aClass370_1.method26953().method28901();
		client.aBoolean606 = true;
	}

	@OriginalMember(owner = "client!aq", name = "aj", descriptor = "()V", line = 283)
	public static void method21561() {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_2, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub9_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub25_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub4_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub3_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub6_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub7_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub2_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub22_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub5_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_2, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub12_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub17_1, Class191.aClass191_2.anInt3679 * -356338717);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub29_1, 0);
		if (Class613.aClass21_13 != null && Class613.aClass21_13.method17166() && Class613.aClass21_13.method17131()) {
			Class613.aClass21_13.method17130();
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub23_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub14_1, 1);
		Class586.method33283();
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub8_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub32_1, 3);
		Class457.method28515();
		client.aClass370_1.method26953().method28901();
		client.aBoolean606 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ai", descriptor = "()V", line = 312)
	public static void method21546() {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_2, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub9_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub25_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub4_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub3_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub7_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub6_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub2_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub22_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub5_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_2, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub12_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub17_1, Class191.aClass191_2.anInt3679 * -356338717);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub29_1, 0);
		if (Class613.aClass21_13 != null && Class613.aClass21_13.method17166() && Class613.aClass21_13.method17131()) {
			Class613.aClass21_13.method17130();
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub23_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub14_1, 0);
		Class586.method33283();
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub8_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub32_1, 2);
		Class457.method28515();
		client.aClass370_1.method26953().method28901();
		client.aBoolean606 = true;
	}

	@OriginalMember(owner = "client!aq", name = "as", descriptor = "()V", line = 312)
	public static void method21562() {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_2, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub9_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub25_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub4_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub3_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub7_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub6_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub2_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub22_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub5_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_2, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub12_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub17_1, Class191.aClass191_2.anInt3679 * -356338717);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub29_1, 0);
		if (Class613.aClass21_13 != null && Class613.aClass21_13.method17166() && Class613.aClass21_13.method17131()) {
			Class613.aClass21_13.method17130();
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub23_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub14_1, 0);
		Class586.method33283();
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub8_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub32_1, 2);
		Class457.method28515();
		client.aClass370_1.method26953().method28901();
		client.aBoolean606 = true;
	}

	@OriginalMember(owner = "client!aq", name = "av", descriptor = "(Z)V", line = 341)
	public static void method21540() {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_2, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub5_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub9_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub25_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub4_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub3_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub7_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub6_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub2_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub22_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_2, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub12_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub17_1, Class191.aClass191_2.anInt3679 * -356338717);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub29_1, 0);
		if (Class613.aClass21_13 != null && Class613.aClass21_13.method17166() && Class613.aClass21_13.method17131()) {
			Class613.aClass21_13.method17130();
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub23_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub14_1, 0);
		Class586.method33283();
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub8_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub32_1, 1);
		Class457.method28515();
		client.aClass370_1.method26953().method28901();
		client.aBoolean606 = true;
	}

	@OriginalMember(owner = "client!aq", name = "aq", descriptor = "(Z)V", line = 341)
	public static void method21564() {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_2, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub5_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub9_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub25_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub4_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub3_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub7_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub6_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub2_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub22_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_2, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub12_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub17_1, Class191.aClass191_2.anInt3679 * -356338717);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub29_1, 0);
		if (Class613.aClass21_13 != null && Class613.aClass21_13.method17166() && Class613.aClass21_13.method17131()) {
			Class613.aClass21_13.method17130();
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub23_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub14_1, 0);
		Class586.method33283();
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub8_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub32_1, 1);
		Class457.method28515();
		client.aClass370_1.method26953().method28901();
		client.aBoolean606 = true;
	}

	@OriginalMember(owner = "client!aq", name = "ax", descriptor = "(Z)V", line = 341)
	public static void method21565() {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_2, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub5_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub9_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub25_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub4_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub3_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub7_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub6_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub2_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub22_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_2, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub12_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub17_1, Class191.aClass191_2.anInt3679 * -356338717);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub29_1, 0);
		if (Class613.aClass21_13 != null && Class613.aClass21_13.method17166() && Class613.aClass21_13.method17131()) {
			Class613.aClass21_13.method17130();
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub23_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub14_1, 0);
		Class586.method33283();
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub8_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub32_1, 1);
		Class457.method28515();
		client.aClass370_1.method26953().method28901();
		client.aBoolean606 = true;
	}

	@OriginalMember(owner = "client!aq", name = "az", descriptor = "()V", line = 370)
	static void method21548() {
		if (Class390.anInt3018 * -96764183 > 1) {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub20_1, 4);
		} else {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub20_1, 2);
		}
	}

	@OriginalMember(owner = "client!aq", name = "al", descriptor = "()V", line = 370)
	static void method21557() {
		if (Class390.anInt3018 * -96764183 > 1) {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub20_1, 4);
		} else {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub20_1, 2);
		}
	}

	@OriginalMember(owner = "client!aq", name = "fv", descriptor = "(III)I", line = 2123)
	public static int method21570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (-238210995 * Class630.aClass493_1.anInt5220 == -1) {
			return 1;
		}
		if (arg0 != Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373()) {
			Class159.method23206(arg0, Class601.aClass601_62.method33512(Class469.aClass530_2), true);
			if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() != arg0) {
				return -1;
			}
		}
		try {
			@Pc(32) Dimension local32 = Class106.aCanvas6.getSize();
			Class250.method25081(Class601.aClass601_62.method33512(Class469.aClass530_2), true, Class613.aClass21_13, Class454.aClass14_12, Class222.aClass611_7);
			@Pc(50) Class138 local50 = Class138.method22955(Class55.aClass359_17, Class630.aClass493_1.anInt5220 * -238210995, 0);
			@Pc(53) long local53 = Class176.method23413();
			Class613.aClass21_13.method17056();
			client.aClass332_51.method26201(0.0F, 256.0F, 0.0F);
			Class613.aClass21_13.method17106(client.aClass332_51);
			@Pc(66) Class328 local66 = Class613.aClass21_13.method17333();
			local66.method26059((float) (local32.width / 2), (float) (local32.height / 2), 512.0F, 512.0F, (float) client.aClass370_1.method27009(), (float) client.aClass370_1.method26948(), (float) local32.width, (float) local32.height);
			Class613.aClass21_13.method17322(local66);
			Class613.aClass21_13.method17111(1.0F);
			Class613.aClass21_13.method17132(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(116) Class20 local116 = Class613.aClass21_13.method17100(local50, 2048, 64, 64, 768);
			@Pc(118) int local118 = 0;
			label42: for (@Pc(120) int local120 = 0; local120 < 500; local120++) {
				Class613.aClass21_13.method17061(3, 0);
				for (@Pc(129) int local129 = 15; local129 >= 0; local129--) {
					for (@Pc(133) int local133 = 0; local133 <= local129; local133++) {
						client.aClass332_52.method26201((float) (((float) local133 - (float) local129 / 2.0F) * 512.0F), 0.0F, (float) ((local129 + 1) * 512));
						local116.method5352(client.aClass332_52, null, 0);
						local118++;
						if (Class176.method23413() - local53 >= (long) arg1) {
							break label42;
						}
					}
				}
			}
			Class613.aClass21_13.method17019();
			@Pc(189) long local189 = (long) (local118 * 1000) / (Class176.method23413() - local53);
			Class613.aClass21_13.method17061(3, 0);
			return (int) local189;
		} catch (@Pc(197) Throwable local197) {
			local197.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!aq", name = "kj", descriptor = "(Lclient!fo;Lclient!vs;I)V", line = 6049)
	static final void method21574(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class536 arg1) {
		@Pc(1) byte local1 = 10;
		Class461.method28596(arg0, local1, arg1);
	}

	@OriginalMember(owner = "client!aq", name = "vd", descriptor = "(Lclient!vs;I)V", line = 7911)
	static final void method21568(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class440.method28240(local13, local23, true);
	}

	@OriginalMember(owner = "client!aq", name = "ado", descriptor = "(Lclient!vs;I)V", line = 9227)
	static final void method21569(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class44_Sub3.aClass596_1.method33435(local12).anInt5474 * 333655339;
	}
}
