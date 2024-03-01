package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public class Class402 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "Lclient!acb;")
	static Class23_Sub1 aClass23_Sub1_2;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	static int anInt4804;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "I")
	static int anInt4805;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "Z")
	static boolean aBoolean754 = false;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 24)
	Class402() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!q", name = "h", descriptor = "(Lclient!agq;)V", line = 29)
	static void method27615(@OriginalArg(0) Class3_Sub32 arg0) {
		aClass23_Sub1_2 = new Class23_Sub1(client.aClass496_1);
		aClass23_Sub1_2.method5923(Class192.aClass192_3);
		try {
			@Pc(15) Class30_Sub1 local15 = (Class30_Sub1) aClass23_Sub1_2.method5872(Class204.aClass204_5, false);
			@Pc(22) Class69_Sub2 local22 = (Class69_Sub2) aClass23_Sub1_2.method5802(Class208.aClass208_5, false);
			local15.method7446(arg0);
			local22.method14570(new Class335(0.0F, 0.0F, 0.0F));
			aClass23_Sub1_2.method5813(Class320.method25891(99999.0F, 99999.0F, 99999.0F));
			aClass23_Sub1_2.method5809(Class320.method25891(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
			aClass23_Sub1_2.method5812(Class320.method25891(99999.0F, 99999.0F, 99999.0F));
			aClass23_Sub1_2.method5808(Class320.method25891(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
		} catch (@Pc(65) Exception_Sub4 local65) {
		}
		anInt4804 = Class3_Sub10.aClass61_1.method12740() * 2008758633;
		anInt4805 = Class3_Sub10.aClass61_1.method12741() * -1561712435;
		aBoolean754 = true;
	}

	@OriginalMember(owner = "client!q", name = "p", descriptor = "(Lclient!and;I)V", line = 41)
	static final void method27621(@OriginalArg(0) Class3_Sub41_Sub1 arg0) {
		arg0.method19824();
		@Pc(6) int local6 = client.anInt3115 * 2077649275;
		@Pc(19) Class26_Sub1_Sub1_Sub1_Sub2 local19 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local6] = new Class26_Sub1_Sub1_Sub1_Sub2(client.aClass370_1.method26950());
		local19.anInt2355 = local6 * -400995907;
		@Pc(29) int local29 = arg0.method19825(30);
		@Pc(34) byte local34 = (byte) (local29 >> 28);
		@Pc(40) int local40 = local29 >> 14 & 0x3FFF;
		@Pc(44) int local44 = local29 & 0x3FFF;
		@Pc(48) Class464 local48 = client.aClass370_1.method26942();
		local19.anIntArray241[0] = local40 - local48.anInt5071 * -1567811631;
		local19.anIntArray239[0] = local44 - local48.anInt5073 * 1360175441;
		local19.method21437((float) ((local19.anIntArray241[0] << 9) + (local19.method16630() << 8)), local19.method21430().aClass320_61.aFloat260, (float) ((local19.anIntArray239[0] << 9) + (local19.method16630() << 8)));
		Class141.anInt3427 = (local19.aByte101 = local19.aByte102 = local34) * -147142497;
		if (client.aClass370_1.method27075().method26504(local19.anIntArray241[0], local19.anIntArray239[0])) {
			local19.aByte102++;
		}
		if (Class52.aClass3_Sub41Array1[local6] != null) {
			local19.method16763(Class52.aClass3_Sub41Array1[local6]);
		}
		if (Class52.aClass3_Sub41Array2[local6] != null) {
			local19.method16731(Class52.aClass3_Sub41Array2[local6]);
		}
		Class52.anInt1127 = 0;
		Class52.anIntArray167[(Class52.anInt1127 += -983085923) * 701602229 - 1] = local6;
		Class52.aByteArray19[local6] = 0;
		Class52.anInt1130 = 0;
		for (@Pc(174) int local174 = 1; local174 < 2048; local174++) {
			if (local174 != local6) {
				@Pc(186) int local186 = arg0.method19825(18);
				@Pc(192) int local192 = local186 >> 16 & 0x3;
				@Pc(198) int local198 = local186 >> 8 & 0xFF;
				@Pc(202) int local202 = local186 & 0xFF;
				@Pc(210) Class85 local210 = Class52.aClass85Array1[local174] = new Class85();
				local210.anInt2926 = ((local198 << 14) + (local192 << 28) + local202) * 1407132619;
				local210.anInt2924 = 0;
				local210.anInt2925 = 786905529;
				local210.aBoolean533 = false;
				local210.aBoolean532 = false;
				Class52.anIntArray165[(Class52.anInt1130 += 339102359) * 2047726887 - 1] = local174;
				Class52.aByteArray19[local174] = 0;
			}
		}
		arg0.method19826();
		@Pc(260) Class204 local260 = Class80.aClass23_Sub1_1.method5887();
		if (local260 == Class204.aClass204_3) {
			@Pc(268) Class30_Sub3 local268 = (Class30_Sub3) Class80.aClass23_Sub1_1.method5827();
			local268.method7844();
		}
		@Pc(275) Class208 local275 = Class80.aClass23_Sub1_1.method5830();
		if (Class208.aClass208_3 == local275) {
			@Pc(283) Class69_Sub5 local283 = (Class69_Sub5) Class80.aClass23_Sub1_1.method5799();
			local283.method14689();
		}
	}

	@OriginalMember(owner = "client!q", name = "x", descriptor = "()V", line = 48)
	static void method27612() {
		aClass23_Sub1_2 = null;
		aBoolean754 = false;
	}

	@OriginalMember(owner = "client!q", name = "s", descriptor = "()V", line = 48)
	static void method27613() {
		aClass23_Sub1_2 = null;
		aBoolean754 = false;
	}

	@OriginalMember(owner = "client!q", name = "y", descriptor = "()Z", line = 53)
	static boolean method27611() {
		return aBoolean754;
	}

	@OriginalMember(owner = "client!q", name = "u", descriptor = "()Z", line = 53)
	static boolean method27614() {
		return aBoolean754;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "()V", line = 57)
	static void method27616() {
		@Pc(4) Class30_Sub1 local4 = (Class30_Sub1) aClass23_Sub1_2.method5827();
		@Pc(9) Class69_Sub2 local9 = (Class69_Sub2) aClass23_Sub1_2.method5799();
		@Pc(13) Class320 local13 = local4.method16426();
		@Pc(17) Class335 local17 = local9.method14572();
		if (client.aClass178_12 != null) {
			@Pc(25) int local25 = client.aClass178_12.anInt3498 * -1494060731;
			@Pc(30) int local30 = client.aClass178_12.anInt3499 * -751005789;
			@Pc(32) float local32 = 1000.0F;
			@Pc(44) float local44 = (float) (Math.atan((double) ((float) local25 / 2.0F / local32)) * 2.0D);
			@Pc(56) float local56 = (float) (Math.atan((double) ((float) local30 / 2.0F / local32)) * 2.0D);
			try {
				aClass23_Sub1_2.method5818(local44, local56);
			} catch (@Pc(63) Exception_Sub4 local63) {
			}
		}
		if (Class3_Sub10.aClass61_1.method12737()) {
			@Pc(69) Class335 local69 = Class335.method26300();
			local69.method26365(1.0F, 0.0F, 0.0F, (float) (Class3_Sub10.aClass61_1.method12741() - anInt4805 * -202243067) / 200.0F);
			local17.method26312(local69);
			@Pc(92) Class320 local92 = Class320.method25891(0.0F, 1.0F, 0.0F);
			local92.method25889(local17);
			@Pc(97) Class335 local97 = Class335.method26300();
			local97.method26301(local92, (float) (anInt4804 * 1475929817 - Class3_Sub10.aClass61_1.method12740()) / 200.0F);
			local17.method26312(local97);
			local9.method14570(local17);
		}
		anInt4804 = Class3_Sub10.aClass61_1.method12740() * 2008758633;
		anInt4805 = Class3_Sub10.aClass61_1.method12741() * -1561712435;
		local17.method26351();
		@Pc(141) Class320 local141;
		if (Class217.aClass65_1.method13145(98)) {
			local141 = Class320.method25891(0.0F, 0.0F, 25.0F);
			local141.method25889(local17);
			local141.aFloat260 *= -1.0F;
			local13.method25872(local141);
		}
		if (Class217.aClass65_1.method13145(99)) {
			local141 = Class320.method25891(0.0F, 0.0F, -25.0F);
			local141.method25889(local17);
			local141.aFloat260 *= -1.0F;
			local13.method25872(local141);
		}
		if (Class217.aClass65_1.method13145(96)) {
			local141 = Class320.method25891(-25.0F, 0.0F, 0.0F);
			local141.method25889(local17);
			local141.aFloat260 *= -1.0F;
			local13.method25872(local141);
		}
		if (Class217.aClass65_1.method13145(97)) {
			local141 = Class320.method25891(25.0F, 0.0F, 0.0F);
			local141.method25889(local17);
			local141.aFloat260 *= -1.0F;
			local13.method25872(local141);
		}
		@Pc(233) Class3_Sub32 local233 = new Class3_Sub32(0, (int) local13.aFloat259, (int) local13.aFloat260, (int) local13.aFloat261);
		local4.method7446(local233);
		@Pc(241) Class464 local241 = client.aClass370_1.method26942();
		@Pc(248) int local248 = local241.anInt5071 * -1567811631 << 9;
		@Pc(255) int local255 = local241.anInt5073 * 1360175441 << 9;
		aClass23_Sub1_2.method5896(0.02F, client.aClass370_1.method26959().anIntArrayArrayArray14, client.aClass370_1.method27075(), local248, local255);
	}

	@OriginalMember(owner = "client!q", name = "p", descriptor = "(I)Z", line = 148)
	static boolean method27617() {
		return Class21_Sub1.method3215(Class44.aClass483_5.aClass468_1);
	}

	@OriginalMember(owner = "client!q", name = "fl", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 5066)
	static final void method27618(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3556 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * -79820929;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!q", name = "jl", descriptor = "(Lclient!vs;I)V", line = 5776)
	static final void method27619(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class199.method24132(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!q", name = "tl", descriptor = "(Lclient!vs;I)V", line = 7614)
	static final void method27620(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		Class510.aClass183_1.method23573(arg0.anIntArray496[arg0.anInt5319 * 960738381], arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1]);
	}

	@OriginalMember(owner = "client!q", name = "aew", descriptor = "(Lclient!vs;B)V", line = 9660)
	static final void method27622(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class13_Sub23.aClass343_1.method26476(local13).anIntArray263[local23];
	}
}
