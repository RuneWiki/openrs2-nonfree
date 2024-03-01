package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public class Class210 {

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
	public int anInt3700;

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
	public int anInt3701;

	@OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
	public int anInt3702;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "(Lclient!pt;Lclient!pt;I)V", line = 40)
	public static void method24251(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1) {
		if (arg0.aClass53_18 != null) {
			arg0.method20615();
		}
		arg0.aClass53_18 = arg1;
		arg0.aClass53_17 = arg1.aClass53_17;
		arg0.aClass53_18.aClass53_17 = arg0;
		arg0.aClass53_17.aClass53_18 = arg0;
	}

	@OriginalMember(owner = "client!gu", name = "y", descriptor = "(B)V", line = 312)
	public static void method24250() {
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

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(III)V", line = 393)
	static void method24249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Class630.aClass493_1.aBoolean813) {
			if (Class250.anInt3811 * -1176041819 == 1) {
				return;
			}
			if (Class338.aBoolean719 && Class250.anInt3811 * -1176041819 == 2 && Class2.aClass3_Sub1_Sub7_1.aString110.equals(Class601.aClass601_165.method33512(Class469.aClass530_2))) {
				return;
			}
		}
		@Pc(27) Class611 local27 = Class49_Sub1.method9259();
		@Pc(35) int local35 = local27.method33592(Class601.aClass601_134.method33512(Class469.aClass530_2));
		@Pc(72) int local72;
		@Pc(50) int local50;
		if (Class250.aBoolean687) {
			for (@Pc(94) Class3_Sub1_Sub9 local94 = (Class3_Sub1_Sub9) Class250.aClass546_15.method32623(); local94 != null; local94 = (Class3_Sub1_Sub9) Class250.aClass546_15.method32645()) {
				if (local94.anInt2669 * 2127103997 == 1) {
					local50 = Class44.method15135((Class3_Sub1_Sub7) local94.aClass546_9.aClass3_Sub1_62.aClass3_Sub1_66, local27);
				} else {
					local50 = Class175.method23409(local94, local27);
				}
				if (local50 > local35) {
					local35 = local50;
				}
			}
			local35 += 8;
			local72 = Class250.anInt3804 * 192470685 * 1575832235 * Class250.anInt3812 + 21;
			Class294.anInt4390 = (Class250.anInt3804 * 192470685 * 1575832235 * Class250.anInt3812 + (Class250.aBoolean689 ? 26 : 22)) * -209620949;
		} else {
			for (@Pc(42) Class3_Sub1_Sub7 local42 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32768(); local42 != null; local42 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32709()) {
				local50 = Class44.method15135(local42, local27);
				if (local50 > local35) {
					local35 = local50;
				}
			}
			local35 += 8;
			local72 = Class250.anInt3804 * 192470685 * -1176041819 * Class250.anInt3811 + 21;
			Class294.anInt4390 = ((Class250.aBoolean689 ? 26 : 22) + Class250.anInt3811 * -1176041819 * Class250.anInt3804 * 192470685) * -209620949;
		}
		local35 += 10;
		@Pc(163) int local163 = arg0 - local35 / 2;
		if (local163 + local35 > Class128.anInt3317 * 2037417253) {
			local163 = Class128.anInt3317 * 2037417253 - local35;
		}
		if (local163 < 0) {
			local163 = 0;
		}
		local50 = arg1;
		if (arg1 + local72 > Class575.anInt5428 * 1261116487) {
			local50 = Class575.anInt5428 * 1261116487 - local72;
		}
		if (local50 < 0) {
			local50 = 0;
		}
		Class284.anInt4355 = local163 * 1543066903;
		Class338.anInt4600 = local50 * -534263805;
		Class13_Sub14.anInt663 = local35 * 347361575;
		Class250.anInt3818 = (int) (Math.random() * 24.0D) * -1808601773;
		Class250.aBoolean688 = true;
	}

	@OriginalMember(owner = "client!gu", name = "py", descriptor = "(Lclient!vs;I)V", line = 6898)
	static final void method24244(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3554 * -1920517457;
	}

	@OriginalMember(owner = "client!gu", name = "aku", descriptor = "(Lclient!vs;I)V", line = 11058)
	static final void method24245(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 1248498196;
		@Pc(14) float local14 = (float) arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(25) float local25 = (float) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(36) float local36 = (float) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(49) float local49 = (float) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3] / 1000.0F;
		Class80.aClass23_Sub1_1.method5927(Class320.method25891(local14, local25, local36), local49);
	}

	@OriginalMember(owner = "client!gu", name = "alj", descriptor = "(Lclient!vs;I)V", line = 11099)
	static final void method24246(@OriginalArg(0) Class536 arg0) {
		if (!Class146.method23084()) {
			Class23.method5942();
		}
	}

	@OriginalMember(owner = "client!gu", name = "ams", descriptor = "(Lclient!vs;B)V", line = 11318)
	static final void method24247(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub13_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		client.aClass370_1.method26968();
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}

	@OriginalMember(owner = "client!gu", name = "me", descriptor = "(Ljava/lang/String;ZB)V", line = 11495)
	public static final void method24248(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) int local5 = client.aBoolean584 ? 400 : 100;
		if (arg0 == null) {
			return;
		}
		if (client.anInt3174 * 918731051 >= local5) {
			Class544.method32611(4, client.aBoolean584 ? Class601.aClass601_151.method33512(Class469.aClass530_2) : Class601.aClass601_80.method33512(Class469.aClass530_2));
			return;
		}
		@Pc(34) String local34 = Class65_Sub1.method13183(arg0, Class141.aClass623_1);
		if (local34 == null) {
			return;
		}
		@Pc(40) int local40;
		@Pc(55) String local55;
		@Pc(86) String local86;
		for (local40 = 0; local40 < client.anInt3174 * 918731051; local40++) {
			@Pc(49) Class123 local49 = client.aClass123Array1[local40];
			local55 = Class65_Sub1.method13183(local49.aString161, Class141.aClass623_1);
			if (local55 != null && local55.equals(local34)) {
				Class544.method32611(4, arg0 + Class601.aClass601_153.method33512(Class469.aClass530_2));
				return;
			}
			if (local49.aString159 != null) {
				local86 = Class65_Sub1.method13183(local49.aString159, Class141.aClass623_1);
				if (local86 != null && local86.equals(local34)) {
					Class544.method32611(4, arg0 + Class601.aClass601_153.method33512(Class469.aClass530_2));
					return;
				}
			}
		}
		for (local40 = 0; local40 < client.anInt3042 * -1645830611; local40++) {
			@Pc(121) Class313 local121 = client.aClass313Array1[local40];
			local55 = Class65_Sub1.method13183(local121.aString202, Class141.aClass623_1);
			if (local55 != null && local55.equals(local34)) {
				Class544.method32611(4, Class601.aClass601_34.method33512(Class469.aClass530_2) + arg0 + Class601.aClass601_160.method33512(Class469.aClass530_2));
				return;
			}
			if (local121.aString200 != null) {
				local86 = Class65_Sub1.method13183(local121.aString200, Class141.aClass623_1);
				if (local86 != null && local86.equals(local34)) {
					Class544.method32611(4, Class601.aClass601_34.method33512(Class469.aClass530_2) + arg0 + Class601.aClass601_160.method33512(Class469.aClass530_2));
					return;
				}
			}
		}
		if (Class65_Sub1.method13183(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aString75, Class141.aClass623_1).equals(local34)) {
			Class544.method32611(4, Class601.aClass601_148.method33512(Class469.aClass530_2));
			return;
		}
		@Pc(210) Class82 local210 = Class406.method27657();
		@Pc(216) Class3_Sub23 local216 = Class269.method25284(Class311.aClass311_70, local210.aClass577_2);
		local216.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(arg0) + 1);
		local216.aClass3_Sub41_Sub1_1.method20260(arg0);
		local216.aClass3_Sub41_Sub1_1.method20250(arg1 ? 1 : 0);
		local210.method21601(local216);
	}
}
