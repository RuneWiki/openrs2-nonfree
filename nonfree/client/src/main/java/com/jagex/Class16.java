package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public abstract class Class16 {

	@OriginalMember(owner = "client!cf", name = "gu", descriptor = "Lclient!zc;")
	public static Class616 aClass616_3;

	@OriginalMember(owner = "client!cf", name = "af", descriptor = "[Lclient!co;")
	static Class6[] aClass6Array3;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "[Z")
	static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 4)
	Class16() {
	}

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "(Lclient!ahb;I)Lclient!kz;", line = 13)
	public static Class291 method1676(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20375();
		return new Class291(local3);
	}

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "(IB)I", line = 58)
	public static int method1675(@OriginalArg(0) int arg0) {
		@Pc(5) Class214 local5 = (Class214) Class196.aMap9.get(arg0);
		return local5 == null ? 0 : local5.method24270();
	}

	@OriginalMember(owner = "client!cf", name = "ga", descriptor = "(B)V", line = 3267)
	public static final void method1679() {
		if (client.anInt3093 * 490957615 == -1 || client.anInt3137 * -100499367 == -1) {
			return;
		}
		@Pc(28) int local28 = (client.anInt3156 * -1782978705 * (client.anInt3055 * 217570963 - client.anInt3097 * 2063113245) >> 16) + client.anInt3097 * 2063113245;
		client.anInt3156 += local28 * 1611618191;
		if (client.anInt3156 * -1782978705 >= 65535) {
			client.anInt3156 = -142628751;
			if (client.aBoolean588) {
				client.aBoolean583 = false;
			} else {
				client.aBoolean583 = true;
			}
			client.aBoolean588 = true;
		} else {
			client.aBoolean583 = false;
			client.aBoolean588 = false;
		}
		@Pc(62) float local62 = (float) (client.anInt3156 * -1782978705) / 65535.0F;
		@Pc(65) float[] local65 = new float[3];
		@Pc(69) int local69 = client.anInt3049 * 376065690;
		@Pc(100) int local100;
		@Pc(138) int local138;
		@Pc(148) int local148;
		@Pc(152) int local152;
		@Pc(160) int local160;
		@Pc(178) int local178;
		for (@Pc(71) int local71 = 0; local71 < 3; local71++) {
			@Pc(86) int local86 = client.anIntArrayArrayArray15[client.anInt3093 * 490957615][local69][local71] * 3;
			local100 = client.anIntArrayArrayArray15[client.anInt3093 * 490957615][local69 + 1][local71] * 3;
			local138 = (client.anIntArrayArrayArray15[client.anInt3093 * 490957615][local69 + 2][local71] - (client.anIntArrayArrayArray15[client.anInt3093 * 490957615][local69 + 3][local71] - client.anIntArrayArrayArray15[client.anInt3093 * 490957615][local69 + 2][local71])) * 3;
			local148 = client.anIntArrayArrayArray15[client.anInt3093 * 490957615][local69][local71];
			local152 = local100 - local86;
			local160 = local138 + (local86 - local100 * 2);
			local178 = client.anIntArrayArrayArray15[client.anInt3093 * 490957615][local69 + 2][local71] - local148 + local100 - local138;
			local65[local71] = ((float) local152 + ((float) local160 + local62 * (float) local178) * local62) * local62 + (float) local148;
		}
		@Pc(204) Class464 local204 = client.aClass370_1.method26942();
		Class586.anInt5460 = ((int) local65[0] - local204.anInt5071 * 439329280) * 1317181071;
		Class140.anInt3424 = (int) local65[1] * 1930901799;
		Class149.anInt3434 = ((int) local65[2] - local204.anInt5073 * 625123840) * 1723080977;
		@Pc(238) float[] local238 = new float[3];
		local100 = client.anInt3095 * 1855828962;
		for (local138 = 0; local138 < 3; local138++) {
			local148 = client.anIntArrayArrayArray15[client.anInt3137 * -100499367][local100][local138] * 3;
			local152 = client.anIntArrayArrayArray15[client.anInt3137 * -100499367][local100 + 1][local138] * 3;
			local160 = (client.anIntArrayArrayArray15[client.anInt3137 * -100499367][local100 + 2][local138] - (client.anIntArrayArrayArray15[client.anInt3137 * -100499367][local100 + 3][local138] - client.anIntArrayArrayArray15[client.anInt3137 * -100499367][local100 + 2][local138])) * 3;
			local178 = client.anIntArrayArrayArray15[client.anInt3137 * -100499367][local100][local138];
			@Pc(325) int local325 = local152 - local148;
			@Pc(333) int local333 = local160 + (local148 - local152 * 2);
			@Pc(351) int local351 = client.anIntArrayArrayArray15[client.anInt3137 * -100499367][local100 + 2][local138] - local178 + local152 - local160;
			local238[local138] = (float) local178 + ((float) local325 + (local62 * (float) local351 + (float) local333) * local62) * local62;
		}
		@Pc(381) float local381 = local238[0] - local65[0];
		@Pc(391) float local391 = -1.0F * (local238[1] - local65[1]);
		@Pc(399) float local399 = local238[2] - local65[2];
		@Pc(409) double local409 = Math.sqrt((double) (local381 * local381 + local399 * local399));
		Class30.anInt2350 = ((int) (Math.atan2((double) local391, local409) * 2607.5945876176133D) & 0x3FFF) * 1250124359;
		Class3_Sub35_Sub1.anInt2644 = ((int) (-Math.atan2((double) local381, (double) local399) * 2607.5945876176133D) & 0x3FFF) * 1729985211;
		Class150.anInt3437 = (client.anIntArrayArrayArray15[client.anInt3093 * 490957615][local69][3] + ((client.anIntArrayArrayArray15[client.anInt3093 * 490957615][local69 + 2][3] - client.anIntArrayArrayArray15[client.anInt3093 * 490957615][local69][3]) * -1782978705 * client.anInt3156 >> 16)) * -1574073519;
	}

	@OriginalMember(owner = "client!cf", name = "ik", descriptor = "(BI)V", line = 4534)
	static final void method1678(@OriginalArg(0) byte arg0) {
		@Pc(3) byte[][][] local3 = client.aClass370_1.method26957();
		if (local3 == null) {
			local3 = new byte[4][client.aClass370_1.method26943()][client.aClass370_1.method27062()];
			client.aClass370_1.method26958(local3);
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			for (@Pc(25) int local25 = 0; local25 < client.aClass370_1.method26943(); local25++) {
				for (@Pc(32) int local32 = 0; local32 < client.aClass370_1.method27062(); local32++) {
					local3[local20][local25][local32] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "lk", descriptor = "(I[II)V", line = 11168)
	static final void method1677(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (!Class33.method7569(arg0, arg1)) {
			return;
		}
		@Pc(10) Class178[] local10 = Class178.aClass186Array1[arg0].aClass178Array8;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(20) Class178 local20 = local10[local12];
			if (local20 != null && local20.aClass71_6 != null) {
				local20.aClass71_6.method20041();
			}
		}
	}
}
