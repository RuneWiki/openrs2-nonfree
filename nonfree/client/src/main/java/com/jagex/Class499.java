package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
final class Class499 implements Interface10 {

	@OriginalMember(owner = "client!qv", name = "gi", descriptor = "Lclient!pw;")
	public static Class478 aClass478_126;

	@OriginalMember(owner = "client!qv", name = "v", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 35)
	@Override
	public Object method30208(@OriginalArg(0) Class77_Sub39 arg0) {
		return Class532.method30741(arg0);
	}

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "(Lclient!akv;I)Ljava/lang/Object;", line = 35)
	@Override
	public Object method30209(@OriginalArg(0) Class77_Sub39 arg0) {
		return Class532.method30741(arg0);
	}

	@OriginalMember(owner = "client!qv", name = "l", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 35)
	@Override
	public Object method30211(@OriginalArg(0) Class77_Sub39 arg0) {
		return Class532.method30741(arg0);
	}

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "(Lclient!akv;)Ljava/lang/Object;", line = 35)
	@Override
	public Object method30210(@OriginalArg(0) Class77_Sub39 arg0) {
		return Class532.method30741(arg0);
	}

	@OriginalMember(owner = "client!qv", name = "v", descriptor = "(Lclient!arc;I)V", line = 100)
	static final void method30212(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		@Pc(1) int local1 = 0;
		arg0.method22187();
		@Pc(6) int local6;
		@Pc(15) int local15;
		@Pc(39) int local39;
		for (local6 = 0; local6 < Class152.anInt2399 * -1843550713; local6++) {
			local15 = Class152.anIntArray221[local6];
			if ((Class152.aByteArray37[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					Class152.aByteArray37[local15] = (byte) (Class152.aByteArray37[local15] | 0x2);
				} else {
					local39 = arg0.method22189(1);
					if (local39 == 0) {
						local1 = Class634.method32665(arg0);
						Class152.aByteArray37[local15] = (byte) (Class152.aByteArray37[local15] | 0x2);
					} else {
						Class292.method27011(arg0, local15);
					}
				}
			}
		}
		arg0.method22192();
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22187();
		for (local6 = 0; local6 < Class152.anInt2399 * -1843550713; local6++) {
			local15 = Class152.anIntArray221[local6];
			if ((Class152.aByteArray37[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					Class152.aByteArray37[local15] = (byte) (Class152.aByteArray37[local15] | 0x2);
				} else {
					local39 = arg0.method22189(1);
					if (local39 == 0) {
						local1 = Class634.method32665(arg0);
						Class152.aByteArray37[local15] = (byte) (Class152.aByteArray37[local15] | 0x2);
					} else {
						Class292.method27011(arg0, local15);
					}
				}
			}
		}
		arg0.method22192();
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22187();
		for (local6 = 0; local6 < Class152.anInt2402 * 918952205; local6++) {
			local15 = Class152.anIntArray222[local6];
			if ((Class152.aByteArray37[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					Class152.aByteArray37[local15] = (byte) (Class152.aByteArray37[local15] | 0x2);
				} else {
					local39 = arg0.method22189(1);
					if (local39 == 0) {
						local1 = Class634.method32665(arg0);
						Class152.aByteArray37[local15] = (byte) (Class152.aByteArray37[local15] | 0x2);
					} else if (Class249.method26164(arg0, local15)) {
						Class152.aByteArray37[local15] = (byte) (Class152.aByteArray37[local15] | 0x2);
					}
				}
			}
		}
		arg0.method22192();
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22187();
		for (local6 = 0; local6 < Class152.anInt2402 * 918952205; local6++) {
			local15 = Class152.anIntArray222[local6];
			if ((Class152.aByteArray37[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					Class152.aByteArray37[local15] = (byte) (Class152.aByteArray37[local15] | 0x2);
				} else {
					local39 = arg0.method22189(1);
					if (local39 == 0) {
						local1 = Class634.method32665(arg0);
						Class152.aByteArray37[local15] = (byte) (Class152.aByteArray37[local15] | 0x2);
					} else if (Class249.method26164(arg0, local15)) {
						Class152.aByteArray37[local15] = (byte) (Class152.aByteArray37[local15] | 0x2);
					}
				}
			}
		}
		arg0.method22192();
		if (local1 != 0) {
			throw new RuntimeException();
		}
		Class152.anInt2399 = 0;
		Class152.anInt2402 = 0;
		for (local6 = 1; local6 < 2048; local6++) {
			Class152.aByteArray37[local6] = (byte) (Class152.aByteArray37[local6] >> 1);
			@Pc(316) Class104_Sub1_Sub1_Sub1_Sub2 local316 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local6];
			if (local316 == null) {
				Class152.anIntArray222[(Class152.anInt2402 += -989241915) * 918952205 - 1] = local6;
			} else {
				Class152.anIntArray221[(Class152.anInt2399 += 76736439) * -1843550713 - 1] = local6;
			}
		}
	}

	@OriginalMember(owner = "client!qv", name = "zb", descriptor = "(Lclient!yf;B)V", line = 9132)
	static final void method30213(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass243_1.method26054(local12).method25984();
	}

	@OriginalMember(owner = "client!qv", name = "zv", descriptor = "(Lclient!yf;I)V", line = 9157)
	static final void method30214(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = client.aClass243_1.method26054(local12).method25952();
	}

	@OriginalMember(owner = "client!qv", name = "aiq", descriptor = "(Lclient!yf;I)V", line = 10886)
	static final void method30215(@OriginalArg(0) Class665 arg0) {
		Class136_Sub1.aBoolean345 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1;
	}

	@OriginalMember(owner = "client!qv", name = "aom", descriptor = "(Lclient!yf;I)V", line = 12117)
	static final void method30216(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub13_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		client.aClass517_1.method30486();
		Class667.method33150();
		client.aBoolean593 = false;
	}

	@OriginalMember(owner = "client!qv", name = "asv", descriptor = "(Lclient!yf;B)V", line = 12641)
	static final void method30217(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) (Class290.method26994(local12) / 60000L);
	}
}
