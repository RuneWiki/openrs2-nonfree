package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public class Class450 {

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	public static final int anInt5014 = 511;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
	public static final int anInt5015 = 9;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	public static final int anInt5016 = 512;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	public static final int anInt5017 = 2;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public static final int anInt5018 = 1024;

	@OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
	public static final int anInt5019 = 8;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
	public static final int anInt5020 = 256;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
	public static final int anInt5021 = 128;

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
	public static final int anInt5022 = 7;

	@OriginalMember(owner = "client!sc", name = "bt", descriptor = "Lclient!co;")
	public static Class6 aClass6_33;

	static {
		Math.sqrt(131072.0D);
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V", line = 19)
	Class450() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "(I)Lclient!ahw;", line = 80)
	static Class64_Sub1 method28382() {
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
		if (Class77.aBoolean527) {
			local3.method13103(16);
			local17 = false;
		}
		if (Class77.aBoolean528) {
			local3.method13103(32);
			local7 = false;
		}
		if (Class77.aBoolean529) {
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
				local61 = Class77.method21570(3, 1000);
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
				local63 = Class77.method21570(5, 1000);
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
				local59 = Class77.method21570(1, 1000);
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

	@OriginalMember(owner = "client!sc", name = "acr", descriptor = "(Lclient!vs;I)V", line = 9078)
	static final void method28383(@OriginalArg(0) Class536 arg0) {
		@Pc(16) boolean local16 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] != 0;
		@Pc(29) int local29 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class532.method32500((long) local29, 0, local16, Class469.aClass530_2);
	}
}
