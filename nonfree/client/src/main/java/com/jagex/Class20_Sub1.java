package com.jagex;

import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abk")
public class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!abk", name = "l", descriptor = "I")
	static final int anInt213 = 7;

	@OriginalMember(owner = "client!abk", name = "h", descriptor = "I")
	static final int anInt214 = 1;

	@OriginalMember(owner = "client!abk", name = "x", descriptor = "I")
	static final int anInt215 = 2;

	@OriginalMember(owner = "client!abk", name = "s", descriptor = "I")
	static final int anInt216 = 4;

	@OriginalMember(owner = "client!abk", name = "u", descriptor = "I")
	static final int anInt217 = 8;

	@OriginalMember(owner = "client!abk", name = "y", descriptor = "I")
	static final int anInt219 = 16;

	@OriginalMember(owner = "client!abk", name = "ck", descriptor = "Z")
	static boolean aBoolean48;

	@OriginalMember(owner = "client!abk", name = "g", descriptor = "I")
	static final int anInt226 = 4;

	@OriginalMember(owner = "client!abk", name = "bn", descriptor = "[J")
	static long[] aLongArray1;

	@OriginalMember(owner = "client!abk", name = "bq", descriptor = "I")
	static int anInt230;

	@OriginalMember(owner = "client!abk", name = "bv", descriptor = "I")
	static int anInt231;

	@OriginalMember(owner = "client!abk", name = "bz", descriptor = "I")
	static int anInt232;

	@OriginalMember(owner = "client!abk", name = "be", descriptor = "[F")
	static float[] aFloatArray18 = new float[2];

	@OriginalMember(owner = "client!abk", name = "bx", descriptor = "[I")
	static final int[] anIntArray37 = new int[8];

	@OriginalMember(owner = "client!abk", name = "bh", descriptor = "[I")
	static final int[] anIntArray38 = new int[8];

	@OriginalMember(owner = "client!abk", name = "bj", descriptor = "[I")
	static final int[] anIntArray34 = new int[8];

	@OriginalMember(owner = "client!abk", name = "j", descriptor = "B")
	byte aByte1;

	@OriginalMember(owner = "client!abk", name = "bm", descriptor = "S")
	short aShort2;

	@OriginalMember(owner = "client!abk", name = "aa", descriptor = "Lclient!cu;")
	Class119 aClass119_1;

	@OriginalMember(owner = "client!abk", name = "bp", descriptor = "S")
	short aShort4;

	@OriginalMember(owner = "client!abk", name = "bs", descriptor = "S")
	short aShort5;

	@OriginalMember(owner = "client!abk", name = "ae", descriptor = "Lclient!bu;")
	Interface5 anInterface5_2;

	@OriginalMember(owner = "client!abk", name = "aw", descriptor = "I")
	int anInt225;

	@OriginalMember(owner = "client!abk", name = "bf", descriptor = "S")
	short aShort6;

	@OriginalMember(owner = "client!abk", name = "bt", descriptor = "S")
	short aShort7;

	@OriginalMember(owner = "client!abk", name = "bg", descriptor = "S")
	short aShort8;

	@OriginalMember(owner = "client!abk", name = "ar", descriptor = "Lclient!cq;")
	Interface7 anInterface7_1;

	@OriginalMember(owner = "client!abk", name = "ac", descriptor = "I")
	int anInt228;

	@OriginalMember(owner = "client!abk", name = "bd", descriptor = "S")
	short aShort9;

	@OriginalMember(owner = "client!abk", name = "r", descriptor = "Z")
	boolean aBoolean46 = false;

	@OriginalMember(owner = "client!abk", name = "d", descriptor = "Z")
	boolean aBoolean47 = false;

	@OriginalMember(owner = "client!abk", name = "q", descriptor = "I")
	int anInt220 = 0;

	@OriginalMember(owner = "client!abk", name = "m", descriptor = "I")
	int anInt221 = 0;

	@OriginalMember(owner = "client!abk", name = "f", descriptor = "I")
	int anInt222 = 0;

	@OriginalMember(owner = "client!abk", name = "aj", descriptor = "I")
	int anInt223 = 0;

	@OriginalMember(owner = "client!abk", name = "as", descriptor = "I")
	int anInt224 = 0;

	@OriginalMember(owner = "client!abk", name = "ad", descriptor = "Z")
	boolean aBoolean49 = true;

	@OriginalMember(owner = "client!abk", name = "bw", descriptor = "Z")
	boolean aBoolean51 = false;

	@OriginalMember(owner = "client!abk", name = "bk", descriptor = "Z")
	boolean aBoolean50 = false;

	@OriginalMember(owner = "client!abk", name = "b", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_25;

	@OriginalMember(owner = "client!abk", name = "c", descriptor = "I")
	int anInt227;

	@OriginalMember(owner = "client!abk", name = "z", descriptor = "I")
	int anInt218;

	@OriginalMember(owner = "client!abk", name = "ab", descriptor = "Lclient!bc;")
	Class88 aClass88_5;

	@OriginalMember(owner = "client!abk", name = "ag", descriptor = "Lclient!bc;")
	Class88 aClass88_7;

	@OriginalMember(owner = "client!abk", name = "ay", descriptor = "Lclient!bc;")
	Class88 aClass88_6;

	@OriginalMember(owner = "client!abk", name = "au", descriptor = "Lclient!bc;")
	Class88 aClass88_8;

	@OriginalMember(owner = "client!abk", name = "am", descriptor = "Lclient!bo;")
	Class97 aClass97_1;

	@OriginalMember(owner = "client!abk", name = "bb", descriptor = "[I")
	int[] anIntArray36;

	@OriginalMember(owner = "client!abk", name = "v", descriptor = "[I")
	int[] anIntArray32;

	@OriginalMember(owner = "client!abk", name = "t", descriptor = "[I")
	int[] anIntArray31;

	@OriginalMember(owner = "client!abk", name = "w", descriptor = "[I")
	int[] anIntArray35;

	@OriginalMember(owner = "client!abk", name = "i", descriptor = "[S")
	short[] aShortArray10;

	@OriginalMember(owner = "client!abk", name = "bl", descriptor = "[Lclient!dt;")
	Class135[] aClass135Array1;

	@OriginalMember(owner = "client!abk", name = "bi", descriptor = "[Lclient!cd;")
	Class109[] aClass109Array1;

	@OriginalMember(owner = "client!abk", name = "bu", descriptor = "I")
	int anInt229;

	@OriginalMember(owner = "client!abk", name = "ba", descriptor = "[Lclient!cv;")
	Class120[] aClass120Array1;

	@OriginalMember(owner = "client!abk", name = "bo", descriptor = "[Lclient!ba;")
	Class86[] aClass86Array1;

	@OriginalMember(owner = "client!abk", name = "k", descriptor = "[S")
	short[] aShortArray2;

	@OriginalMember(owner = "client!abk", name = "at", descriptor = "[S")
	short[] aShortArray6;

	@OriginalMember(owner = "client!abk", name = "af", descriptor = "[S")
	short[] aShortArray3;

	@OriginalMember(owner = "client!abk", name = "ak", descriptor = "[B")
	byte[] aByteArray4;

	@OriginalMember(owner = "client!abk", name = "ah", descriptor = "[F")
	float[] aFloatArray19;

	@OriginalMember(owner = "client!abk", name = "an", descriptor = "[F")
	float[] aFloatArray20;

	@OriginalMember(owner = "client!abk", name = "ai", descriptor = "[S")
	short[] aShortArray4;

	@OriginalMember(owner = "client!abk", name = "aq", descriptor = "[B")
	byte[] aByteArray5;

	@OriginalMember(owner = "client!abk", name = "av", descriptor = "[S")
	short[] aShortArray9;

	@OriginalMember(owner = "client!abk", name = "ax", descriptor = "[S")
	short[] aShortArray5;

	@OriginalMember(owner = "client!abk", name = "az", descriptor = "[S")
	short[] aShortArray8;

	@OriginalMember(owner = "client!abk", name = "al", descriptor = "[S")
	short[] aShortArray7;

	@OriginalMember(owner = "client!abk", name = "ap", descriptor = "[S")
	short[] aShortArray1;

	@OriginalMember(owner = "client!abk", name = "n", descriptor = "S")
	short aShort1;

	@OriginalMember(owner = "client!abk", name = "e", descriptor = "S")
	short aShort3;

	@OriginalMember(owner = "client!abk", name = "by", descriptor = "[S")
	short[] aShortArray11;

	@OriginalMember(owner = "client!abk", name = "br", descriptor = "[I")
	int[] anIntArray33;

	@OriginalMember(owner = "client!abk", name = "o", descriptor = "[[I")
	int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!abk", name = "bc", descriptor = "[[I")
	int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!abk", name = "ao", descriptor = "[[I")
	int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!abk", name = "<init>", descriptor = "(Lclient!abt;)V", line = 100)
	Class20_Sub1(@OriginalArg(0) Class21_Sub2 arg0) {
		this.aClass21_Sub2_25 = arg0;
		this.aClass88_5 = new Class88(null, 5126, 3, 0);
		this.aClass88_7 = new Class88(null, 5126, 2, 0);
		this.aClass88_6 = new Class88(null, 5126, 3, 0);
		this.aClass88_8 = new Class88(null, 5121, 4, 0);
		this.aClass97_1 = new Class97();
	}

	@OriginalMember(owner = "client!abk", name = "<init>", descriptor = "(Lclient!abt;Lclient!dy;IIII)V", line = 109)
	Class20_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass21_Sub2_25 = arg0;
		this.anInt227 = arg2;
		this.anInt218 = arg5;
		if (Class93.method21690(arg2, arg5)) {
			this.aClass88_5 = new Class88(null, 5126, 3, 0);
		}
		if (Class93.method21693(arg2, arg5)) {
			this.aClass88_7 = new Class88(null, 5126, 2, 0);
		}
		if (Class93.method21691(arg2, arg5)) {
			this.aClass88_6 = new Class88(null, 5126, 3, 0);
		}
		if (Class93.method21697(arg2, arg5)) {
			this.aClass88_8 = new Class88(null, 5121, 4, 0);
		}
		if (Class93.method21694(arg2, arg5)) {
			this.aClass97_1 = new Class97();
		}
		@Pc(104) Class134 local104 = arg0.aClass134_7;
		@Pc(108) int[] local108 = new int[arg1.anInt3414];
		this.anIntArray36 = new int[arg1.anInt3411 + 1];
		for (@Pc(117) int local117 = 0; local117 < arg1.anInt3414; local117++) {
			if (arg1.aByteArray65 == null || arg1.aByteArray65[local117] != 2) {
				if (arg1.aShortArray94 != null && arg1.aShortArray94[local117] != -1) {
					@Pc(150) Class133 local150 = local104.method22906(arg1.aShortArray94[local117] & 0xFFFF);
					if (((this.anInt218 & 0x40) == 0 || !local150.aBoolean620) && local150.aBoolean619) {
						continue;
					}
				}
				local108[this.anInt223++] = local117;
				this.anIntArray36[arg1.aShortArray89[local117]]++;
				this.anIntArray36[arg1.aShortArray90[local117]]++;
				this.anIntArray36[arg1.aShortArray91[local117]]++;
			}
		}
		this.anInt224 = this.anInt223;
		@Pc(215) long[] local215 = new long[this.anInt223];
		@Pc(224) boolean local224 = (this.anInt227 & 0x100) != 0;
		@Pc(234) int local234;
		@Pc(238) int local238;
		@Pc(251) int local251;
		@Pc(293) Class133 local293;
		@Pc(475) int local475;
		@Pc(367) short local367;
		for (@Pc(226) int local226 = 0; local226 < this.anInt223; local226++) {
			local234 = local108[local226];
			@Pc(236) Class133 local236 = null;
			local238 = 0;
			@Pc(240) byte local240 = 0;
			@Pc(242) byte local242 = 0;
			@Pc(244) byte local244 = 0;
			@Pc(249) boolean local249;
			if (arg1.aClass130Array1 != null) {
				local249 = false;
				for (local251 = 0; local251 < arg1.aClass130Array1.length; local251++) {
					@Pc(261) Class130 local261 = arg1.aClass130Array1[local251];
					if (local234 == local261.anInt3323 * 1416068411) {
						@Pc(274) Class287 local274 = Class530.method32482(local261.anInt3322 * -1448993679);
						if (local274.aBoolean709) {
							local249 = true;
						}
						if (local274.anInt4360 * 2145333981 != -1) {
							local293 = local104.method22906(local274.anInt4360 * 2145333981);
							if (local293.aClass458_2 == Class458.aClass458_5) {
								this.aBoolean46 = true;
							}
						}
					}
				}
				if (local249) {
					local215[local226] = Long.MAX_VALUE;
					this.anInt224--;
					continue;
				}
			}
			if (arg1.aClass135Array4 != null) {
				local249 = false;
				for (local251 = 0; local251 < arg1.aClass135Array4.length; local251++) {
					@Pc(332) Class135 local332 = arg1.aClass135Array4[local251];
					if (local234 == local332.anInt3386 * 1948021955) {
						@Pc(345) Class271 local345 = Class298.method25629(local332.anInt3393 * -1647516813);
						if (local345.aBoolean702) {
							local249 = true;
						}
					}
				}
				if (local249) {
					local215[local226] = Long.MAX_VALUE;
					this.anInt224--;
					continue;
				}
			}
			local367 = -1;
			if (arg1.aShortArray94 != null) {
				local367 = arg1.aShortArray94[local234];
				if (local367 != -1) {
					local236 = local104.method22906(local367 & 0xFFFF);
					if ((this.anInt218 & 0x40) != 0 && local236.aBoolean620) {
						local367 = -1;
						local236 = null;
					} else {
						local242 = local236.aByte118;
						local244 = local236.aByte119;
						if (local236.aByte113 != 0 || local236.aByte117 != 0) {
							this.aBoolean47 = true;
						}
					}
				}
			}
			@Pc(431) boolean local431 = arg1.aByteArray64 != null && arg1.aByteArray64[local234] != 0 || local236 != null && local236.aClass458_2 != Class458.aClass458_4;
			if ((local224 || local431) && arg1.aByteArray63 != null) {
				local238 += arg1.aByteArray63[local234] << 17;
			}
			if (local431) {
				local238 += 65536;
			}
			local238 += (local242 & 0xFF) << 8;
			local238 += local244 & 0xFF;
			local475 = local240 + ((local367 & 0xFFFF) << 16);
			@Pc(481) int local481 = local475 + (local226 & 0xFFFF);
			local215[local226] = ((long) local238 << 32) + (long) local481;
			this.aBoolean46 |= local431;
			this.aBoolean47 |= local236 != null && (local236.aByte113 != 0 || local236.aByte117 != 0);
		}
		client.method22801(local215, local108);
		this.anInt220 = arg1.anInt3410;
		this.anInt221 = arg1.anInt3411;
		this.anIntArray32 = arg1.anIntArray331;
		this.anIntArray31 = arg1.anIntArray332;
		this.anIntArray35 = arg1.anIntArray333;
		this.aShortArray10 = arg1.aShortArray88;
		@Pc(547) Class96[] local547 = new Class96[this.anInt221];
		this.aClass135Array1 = arg1.aClass135Array4;
		this.aClass109Array1 = arg1.aClass109Array4;
		@Pc(595) int local595;
		if (arg1.aClass130Array1 != null) {
			this.anInt229 = arg1.aClass130Array1.length;
			this.aClass120Array1 = new Class120[this.anInt229];
			this.aClass86Array1 = new Class86[this.anInt229];
			for (local234 = 0; local234 < this.anInt229; local234++) {
				@Pc(584) Class130 local584 = arg1.aClass130Array1[local234];
				@Pc(591) Class287 local591 = Class530.method32482(local584.anInt3322 * -1448993679);
				local475 = -1;
				for (local595 = 0; local595 < this.anInt223; local595++) {
					if (local108[local595] == local584.anInt3323 * 1416068411) {
						local475 = local595;
						break;
					}
				}
				if (local475 == -1) {
					throw new RuntimeException();
				}
				local595 = Class360.anIntArray422[arg1.aShortArray87[local584.anInt3323 * 1416068411] & 0xFFFF] & 0xFFFFFF;
				local595 |= 255 - (arg1.aByteArray64 == null ? 0 : arg1.aByteArray64[local584.anInt3323 * 1416068411]) << 24;
				this.aClass120Array1[local234] = new Class120(local475, arg1.aShortArray89[local584.anInt3323 * 1416068411], arg1.aShortArray90[local584.anInt3323 * 1416068411], arg1.aShortArray91[local584.anInt3323 * 1416068411], local591.anInt4362 * -1430406499, local591.anInt4361 * -1025441045, local591.anInt4360 * 2145333981, local591.anInt4363 * 1656323389, local591.anInt4359 * -1686355509, local591.aBoolean709, local591.aBoolean710, local584.anInt3325 * -2041558757);
				this.aClass86Array1[local234] = new Class86(local595);
			}
		}
		local234 = this.anInt223 * 3;
		this.aShortArray2 = new short[local234];
		this.aShortArray6 = new short[local234];
		this.aShortArray3 = new short[local234];
		this.aByteArray4 = new byte[local234];
		this.aFloatArray19 = new float[local234];
		this.aFloatArray20 = new float[local234];
		this.aShortArray4 = new short[this.anInt223];
		this.aByteArray5 = new byte[this.anInt223];
		this.aShortArray9 = new short[this.anInt223];
		this.aShortArray5 = new short[this.anInt223];
		this.aShortArray8 = new short[this.anInt223];
		this.aShortArray7 = new short[this.anInt223];
		if (arg1.aShortArray95 != null) {
			this.aShortArray1 = new short[this.anInt223];
		}
		this.aShort1 = (short) arg3;
		this.aShort3 = (short) arg4;
		this.aShortArray11 = new short[local234];
		aLongArray1 = new long[local234];
		@Pc(803) int local803 = 0;
		for (local238 = 0; local238 < arg1.anInt3411; local238++) {
			local475 = this.anIntArray36[local238];
			this.anIntArray36[local238] = local803;
			local803 += local475;
			local547[local238] = new Class96();
		}
		this.anIntArray36[arg1.anInt3411] = local803;
		@Pc(844) Class132 local844 = this.method5323(arg1, local108, this.anInt223);
		@Pc(848) Class94[] local848 = new Class94[arg1.anInt3414];
		@Pc(859) short local859;
		@Pc(869) short local869;
		@Pc(879) int local879;
		@Pc(889) int local889;
		for (local595 = 0; local595 < arg1.anInt3414; local595++) {
			local859 = arg1.aShortArray89[local595];
			local367 = arg1.aShortArray90[local595];
			local869 = arg1.aShortArray91[local595];
			local879 = this.anIntArray32[local367] - this.anIntArray32[local859];
			local889 = this.anIntArray31[local367] - this.anIntArray31[local859];
			@Pc(899) int local899 = this.anIntArray35[local367] - this.anIntArray35[local859];
			@Pc(909) int local909 = this.anIntArray32[local869] - this.anIntArray32[local859];
			@Pc(919) int local919 = this.anIntArray31[local869] - this.anIntArray31[local859];
			@Pc(929) int local929 = this.anIntArray35[local869] - this.anIntArray35[local859];
			@Pc(937) int local937 = local889 * local929 - local919 * local899;
			@Pc(945) int local945 = local899 * local909 - local929 * local879;
			@Pc(953) int local953;
			for (local953 = local879 * local919 - local909 * local889; local937 > 8192 || local945 > 8192 || local953 > 8192 || local937 < -8192 || local945 < -8192 || local953 < -8192; local953 >>= 0x1) {
				local937 >>= 0x1;
				local945 >>= 0x1;
			}
			@Pc(999) int local999 = (int) Math.sqrt((double) (local937 * local937 + local945 * local945 + local953 * local953));
			if (local999 <= 0) {
				local999 = 1;
			}
			local937 = local937 * 256 / local999;
			local945 = local945 * 256 / local999;
			local953 = local953 * 256 / local999;
			@Pc(1031) byte local1031 = arg1.aByteArray65 == null ? 0 : arg1.aByteArray65[local595];
			if (local1031 == 0) {
				@Pc(1037) Class96 local1037 = local547[local859];
				local1037.anInt2952 += local937;
				local1037.anInt2953 += local945;
				local1037.anInt2954 += local953;
				local1037.anInt2951++;
				@Pc(1065) Class96 local1065 = local547[local367];
				local1065.anInt2952 += local937;
				local1065.anInt2953 += local945;
				local1065.anInt2954 += local953;
				local1065.anInt2951++;
				@Pc(1093) Class96 local1093 = local547[local869];
				local1093.anInt2952 += local937;
				local1093.anInt2953 += local945;
				local1093.anInt2954 += local953;
				local1093.anInt2951++;
			} else if (local1031 == 1) {
				@Pc(1129) Class94 local1129 = local848[local595] = new Class94();
				local1129.anInt2942 = local937;
				local1129.anInt2943 = local945;
				local1129.anInt2944 = local953;
			}
		}
		@Pc(1157) int local1157;
		for (local595 = 0; local595 < this.anInt223; local595++) {
			@Pc(1150) int local1150 = local108[local595];
			local1157 = arg1.aShortArray87[local1150] & 0xFFFF;
			if (arg1.aShortArray93 == null) {
				local251 = -1;
			} else {
				local251 = arg1.aShortArray93[local1150];
			}
			if (arg1.aByteArray64 == null) {
				local879 = 0;
			} else {
				local879 = arg1.aByteArray64[local1150] & 0xFF;
			}
			@Pc(1191) short local1191 = arg1.aShortArray94 == null ? -1 : arg1.aShortArray94[local1150];
			if (local1191 != -1 && (this.anInt218 & 0x40) != 0) {
				local293 = local104.method22906(local1191 & 0xFFFF);
				if (local293.aBoolean620) {
					local1191 = -1;
				}
			}
			@Pc(1213) float local1213 = 0.0F;
			@Pc(1215) float local1215 = 0.0F;
			@Pc(1217) float local1217 = 0.0F;
			@Pc(1219) float local1219 = 0.0F;
			@Pc(1221) float local1221 = 0.0F;
			@Pc(1223) float local1223 = 0.0F;
			@Pc(1225) byte local1225 = 0;
			@Pc(1227) byte local1227 = 0;
			@Pc(1229) int local1229 = 0;
			@Pc(1278) short local1278;
			@Pc(1283) short local1283;
			@Pc(1288) short local1288;
			@Pc(1261) byte local1261;
			if (local1191 != -1) {
				if (local251 == -1) {
					local1213 = 0.0F;
					local1215 = 1.0F;
					local1217 = 1.0F;
					local1219 = 1.0F;
					local1225 = 1;
					local1221 = 0.0F;
					local1223 = 0.0F;
					local1227 = 2;
				} else {
					local251 &= 0xFFFF;
					local1261 = arg1.aByteArray66[local251];
					@Pc(1268) short local1268;
					@Pc(1273) short local1273;
					@Pc(1311) float local1311;
					@Pc(1319) float local1319;
					@Pc(1327) float local1327;
					@Pc(1407) float local1407;
					@Pc(1415) float local1415;
					@Pc(1423) float local1423;
					@Pc(1431) float local1431;
					@Pc(1439) float local1439;
					@Pc(1447) float local1447;
					if (local1261 == 0) {
						local1268 = arg1.aShortArray89[local1150];
						local1273 = arg1.aShortArray90[local1150];
						local1278 = arg1.aShortArray91[local1150];
						local1283 = arg1.aShortArray92[local251];
						local1288 = arg1.aShortArray96[local251];
						@Pc(1293) short local1293 = arg1.aShortArray86[local251];
						@Pc(1299) float local1299 = (float) arg1.anIntArray331[local1283];
						@Pc(1305) float local1305 = (float) arg1.anIntArray332[local1283];
						local1311 = arg1.anIntArray333[local1283];
						local1319 = (float) arg1.anIntArray331[local1288] - local1299;
						local1327 = (float) arg1.anIntArray332[local1288] - local1305;
						@Pc(1335) float local1335 = (float) arg1.anIntArray333[local1288] - local1311;
						@Pc(1343) float local1343 = (float) arg1.anIntArray331[local1293] - local1299;
						@Pc(1351) float local1351 = (float) arg1.anIntArray332[local1293] - local1305;
						@Pc(1359) float local1359 = (float) arg1.anIntArray333[local1293] - local1311;
						@Pc(1367) float local1367 = (float) arg1.anIntArray331[local1268] - local1299;
						@Pc(1375) float local1375 = (float) arg1.anIntArray332[local1268] - local1305;
						@Pc(1383) float local1383 = (float) arg1.anIntArray333[local1268] - local1311;
						@Pc(1391) float local1391 = (float) arg1.anIntArray331[local1273] - local1299;
						@Pc(1399) float local1399 = (float) arg1.anIntArray332[local1273] - local1305;
						local1407 = (float) arg1.anIntArray333[local1273] - local1311;
						local1415 = (float) arg1.anIntArray331[local1278] - local1299;
						local1423 = (float) arg1.anIntArray332[local1278] - local1305;
						local1431 = (float) arg1.anIntArray333[local1278] - local1311;
						local1439 = local1327 * local1359 - local1335 * local1351;
						local1447 = local1335 * local1343 - local1319 * local1359;
						@Pc(1455) float local1455 = local1319 * local1351 - local1327 * local1343;
						@Pc(1463) float local1463 = local1351 * local1455 - local1359 * local1447;
						@Pc(1471) float local1471 = local1359 * local1439 - local1343 * local1455;
						@Pc(1479) float local1479 = local1343 * local1447 - local1351 * local1439;
						@Pc(1493) float local1493 = 1.0F / (local1463 * local1319 + local1471 * local1327 + local1479 * local1335);
						local1213 = (local1463 * local1367 + local1471 * local1375 + local1479 * local1383) * local1493;
						local1217 = (local1463 * local1391 + local1471 * local1399 + local1479 * local1407) * local1493;
						local1221 = (local1463 * local1415 + local1471 * local1423 + local1479 * local1431) * local1493;
						@Pc(1543) float local1543 = local1327 * local1455 - local1335 * local1447;
						@Pc(1551) float local1551 = local1335 * local1439 - local1319 * local1455;
						@Pc(1559) float local1559 = local1319 * local1447 - local1327 * local1439;
						@Pc(1573) float local1573 = 1.0F / (local1543 * local1343 + local1551 * local1351 + local1559 * local1359);
						local1215 = (local1543 * local1367 + local1551 * local1375 + local1559 * local1383) * local1573;
						local1219 = (local1543 * local1391 + local1551 * local1399 + local1559 * local1407) * local1573;
						local1223 = (local1543 * local1415 + local1551 * local1423 + local1559 * local1431) * local1573;
					} else {
						local1268 = arg1.aShortArray89[local1150];
						local1273 = arg1.aShortArray90[local1150];
						local1278 = arg1.aShortArray91[local1150];
						@Pc(1636) int local1636 = local844.anIntArray328[local251];
						@Pc(1641) int local1641 = local844.anIntArray326[local251];
						@Pc(1646) int local1646 = local844.anIntArray327[local251];
						@Pc(1651) float[] local1651 = local844.aFloatArrayArray22[local251];
						@Pc(1656) byte local1656 = arg1.aByteArray62[local251];
						local1311 = (float) arg1.anIntArray339[local251] / 256.0F;
						if (local1261 == 1) {
							local1319 = (float) arg1.anIntArray338[local251] / 1024.0F;
							this.method5320(arg1.anIntArray331[local1268], arg1.anIntArray332[local1268], arg1.anIntArray333[local1268], local1636, local1641, local1646, local1651, local1319, local1656, local1311, aFloatArray18);
							local1213 = aFloatArray18[0];
							local1215 = aFloatArray18[1];
							this.method5320(arg1.anIntArray331[local1273], arg1.anIntArray332[local1273], arg1.anIntArray333[local1273], local1636, local1641, local1646, local1651, local1319, local1656, local1311, aFloatArray18);
							local1217 = aFloatArray18[0];
							local1219 = aFloatArray18[1];
							this.method5320(arg1.anIntArray331[local1278], arg1.anIntArray332[local1278], arg1.anIntArray333[local1278], local1636, local1641, local1646, local1651, local1319, local1656, local1311, aFloatArray18);
							local1221 = aFloatArray18[0];
							local1223 = aFloatArray18[1];
							local1327 = local1319 / 2.0F;
							if ((local1656 & 0x1) == 0) {
								if (local1217 - local1213 > local1327) {
									local1217 -= local1319;
									local1225 = 1;
								} else if (local1213 - local1217 > local1327) {
									local1217 += local1319;
									local1225 = 2;
								}
								if (local1221 - local1213 > local1327) {
									local1221 -= local1319;
									local1227 = 1;
								} else if (local1213 - local1221 > local1327) {
									local1221 += local1319;
									local1227 = 2;
								}
							} else {
								if (local1219 - local1215 > local1327) {
									local1219 -= local1319;
									local1225 = 1;
								} else if (local1215 - local1219 > local1327) {
									local1219 += local1319;
									local1225 = 2;
								}
								if (local1223 - local1215 > local1327) {
									local1223 -= local1319;
									local1227 = 1;
								} else if (local1215 - local1223 > local1327) {
									local1223 += local1319;
									local1227 = 2;
								}
							}
						} else if (local1261 == 2) {
							local1319 = (float) arg1.anIntArray335[local251] / 256.0F;
							local1327 = (float) arg1.anIntArray340[local251] / 256.0F;
							@Pc(1904) int local1904 = arg1.anIntArray331[local1273] - arg1.anIntArray331[local1268];
							@Pc(1914) int local1914 = arg1.anIntArray332[local1273] - arg1.anIntArray332[local1268];
							@Pc(1924) int local1924 = arg1.anIntArray333[local1273] - arg1.anIntArray333[local1268];
							@Pc(1934) int local1934 = arg1.anIntArray331[local1278] - arg1.anIntArray331[local1268];
							@Pc(1944) int local1944 = arg1.anIntArray332[local1278] - arg1.anIntArray332[local1268];
							@Pc(1954) int local1954 = arg1.anIntArray333[local1278] - arg1.anIntArray333[local1268];
							@Pc(1962) int local1962 = local1914 * local1954 - local1944 * local1924;
							@Pc(1970) int local1970 = local1924 * local1934 - local1954 * local1904;
							@Pc(1978) int local1978 = local1904 * local1944 - local1934 * local1914;
							local1407 = 64.0F / (float) arg1.anIntArray336[local251];
							local1415 = 64.0F / (float) arg1.anIntArray337[local251];
							local1423 = 64.0F / (float) arg1.anIntArray338[local251];
							local1431 = ((float) local1962 * local1651[0] + (float) local1970 * local1651[1] + (float) local1978 * local1651[2]) / local1407;
							local1439 = ((float) local1962 * local1651[3] + (float) local1970 * local1651[4] + (float) local1978 * local1651[5]) / local1415;
							local1447 = ((float) local1962 * local1651[6] + (float) local1970 * local1651[7] + (float) local1978 * local1651[8]) / local1423;
							local1229 = this.method5321(local1431, local1439, local1447);
							this.method5322(arg1.anIntArray331[local1268], arg1.anIntArray332[local1268], arg1.anIntArray333[local1268], local1636, local1641, local1646, local1229, local1651, local1656, local1311, local1319, local1327, aFloatArray18);
							local1213 = aFloatArray18[0];
							local1215 = aFloatArray18[1];
							this.method5322(arg1.anIntArray331[local1273], arg1.anIntArray332[local1273], arg1.anIntArray333[local1273], local1636, local1641, local1646, local1229, local1651, local1656, local1311, local1319, local1327, aFloatArray18);
							local1217 = aFloatArray18[0];
							local1219 = aFloatArray18[1];
							this.method5322(arg1.anIntArray331[local1278], arg1.anIntArray332[local1278], arg1.anIntArray333[local1278], local1636, local1641, local1646, local1229, local1651, local1656, local1311, local1319, local1327, aFloatArray18);
							local1221 = aFloatArray18[0];
							local1223 = aFloatArray18[1];
						} else if (local1261 == 3) {
							this.method5451(arg1.anIntArray331[local1268], arg1.anIntArray332[local1268], arg1.anIntArray333[local1268], local1636, local1641, local1646, local1651, local1656, local1311, aFloatArray18);
							local1213 = aFloatArray18[0];
							local1215 = aFloatArray18[1];
							this.method5451(arg1.anIntArray331[local1273], arg1.anIntArray332[local1273], arg1.anIntArray333[local1273], local1636, local1641, local1646, local1651, local1656, local1311, aFloatArray18);
							local1217 = aFloatArray18[0];
							local1219 = aFloatArray18[1];
							this.method5451(arg1.anIntArray331[local1278], arg1.anIntArray332[local1278], arg1.anIntArray333[local1278], local1636, local1641, local1646, local1651, local1656, local1311, aFloatArray18);
							local1221 = aFloatArray18[0];
							local1223 = aFloatArray18[1];
							if ((local1656 & 0x1) == 0) {
								if (local1217 - local1213 > 0.5F) {
									local1217--;
									local1225 = 1;
								} else if (local1213 - local1217 > 0.5F) {
									local1217++;
									local1225 = 2;
								}
								if (local1221 - local1213 > 0.5F) {
									local1221--;
									local1227 = 1;
								} else if (local1213 - local1221 > 0.5F) {
									local1221++;
									local1227 = 2;
								}
							} else {
								if (local1219 - local1215 > 0.5F) {
									local1219--;
									local1225 = 1;
								} else if (local1215 - local1219 > 0.5F) {
									local1219++;
									local1225 = 2;
								}
								if (local1223 - local1215 > 0.5F) {
									local1223--;
									local1227 = 1;
								} else if (local1215 - local1223 > 0.5F) {
									local1223++;
									local1227 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray65 == null) {
				local1261 = 0;
			} else {
				local1261 = arg1.aByteArray65[local1150];
			}
			if (local1261 == 0) {
				@Pc(2402) long local2402 = (long) (local251 << 2) + ((long) (local1229 << 24) + (long) (local1157 << 8) + (long) local879 << 32);
				local1278 = arg1.aShortArray89[local1150];
				local1283 = arg1.aShortArray90[local1150];
				local1288 = arg1.aShortArray91[local1150];
				@Pc(2421) Class96 local2421 = local547[local1278];
				this.aShortArray9[local595] = this.method2293(arg1, local1278, local2402, local2421.anInt2952, local2421.anInt2953, local2421.anInt2954, local2421.anInt2951, local1213, local1215);
				@Pc(2444) Class96 local2444 = local547[local1283];
				this.aShortArray5[local595] = this.method2293(arg1, local1283, local2402 + (long) local1225, local2444.anInt2952, local2444.anInt2953, local2444.anInt2954, local2444.anInt2951, local1217, local1219);
				@Pc(2470) Class96 local2470 = local547[local1288];
				this.aShortArray8[local595] = this.method2293(arg1, local1288, local2402 + (long) local1227, local2470.anInt2952, local2470.anInt2953, local2470.anInt2954, local2470.anInt2951, local1221, local1223);
			} else if (local1261 == 1) {
				@Pc(2500) Class94 local2500 = local848[local1150];
				@Pc(2541) long local2541 = (long) ((local251 << 2) + (local2500.anInt2942 > 0 ? 1024 : 2048) + (local2500.anInt2943 + 256 << 12) + (local2500.anInt2944 + 256 << 22)) + ((long) (local1229 << 24) + (long) (local1157 << 8) + (long) local879 << 32);
				this.aShortArray9[local595] = this.method2293(arg1, arg1.aShortArray89[local1150], local2541, local2500.anInt2942, local2500.anInt2943, local2500.anInt2944, 0, local1213, local1215);
				this.aShortArray5[local595] = this.method2293(arg1, arg1.aShortArray90[local1150], local2541 + (long) local1225, local2500.anInt2942, local2500.anInt2943, local2500.anInt2944, 0, local1217, local1219);
				this.aShortArray8[local595] = this.method2293(arg1, arg1.aShortArray91[local1150], local2541 + (long) local1227, local2500.anInt2942, local2500.anInt2943, local2500.anInt2944, 0, local1221, local1223);
			}
			if (arg1.aByteArray64 != null) {
				this.aByteArray5[local595] = arg1.aByteArray64[local1150];
			}
			if (arg1.aShortArray95 != null) {
				this.aShortArray1[local595] = arg1.aShortArray95[local1150];
			}
			this.aShortArray4[local595] = arg1.aShortArray87[local1150];
			this.aShortArray7[local595] = local1191;
		}
		local595 = 0;
		local859 = -10000;
		for (local1157 = 0; local1157 < this.anInt224; local1157++) {
			local869 = this.aShortArray7[local1157];
			if (local869 != local859) {
				local595++;
				local859 = local869;
			}
		}
		this.anIntArray33 = new int[local595 + 1];
		local595 = 0;
		local859 = -10000;
		for (local1157 = 0; local1157 < this.anInt224; local1157++) {
			local869 = this.aShortArray7[local1157];
			if (local869 != local859) {
				this.anIntArray33[local595++] = local1157;
				local859 = local869;
			}
		}
		this.anIntArray33[local595] = this.anInt224;
		aLongArray1 = null;
		this.aShortArray2 = method2278(this.aShortArray2, this.anInt222);
		this.aShortArray6 = method2278(this.aShortArray6, this.anInt222);
		this.aShortArray3 = method2278(this.aShortArray3, this.anInt222);
		this.aByteArray4 = method2277(this.aByteArray4, this.anInt222);
		this.aFloatArray19 = method2279(this.aFloatArray19, this.anInt222);
		this.aFloatArray20 = method2279(this.aFloatArray20, this.anInt222);
		if (arg1.anIntArray330 != null && Class93.method21761(arg2, this.anInt218)) {
			this.anIntArrayArray3 = arg1.method22962(false);
		}
		if (arg1.aClass130Array1 != null && Class93.method21734(arg2, this.anInt218)) {
			this.anIntArrayArray4 = arg1.method22987();
		}
		if (arg1.anIntArray334 != null && Class93.method21707(arg2, this.anInt218)) {
			local1157 = 0;
			@Pc(2792) int[] local2792 = new int[256];
			for (local879 = 0; local879 < this.anInt223; local879++) {
				local889 = arg1.anIntArray334[local108[local879]];
				if (local889 >= 0) {
					@Pc(2811) int local2811 = local2792[local889]++;
					if (local889 > local1157) {
						local1157 = local889;
					}
				}
			}
			this.anIntArrayArray5 = new int[local1157 + 1][];
			for (local879 = 0; local879 <= local1157; local879++) {
				this.anIntArrayArray5[local879] = new int[local2792[local879]];
				local2792[local879] = 0;
			}
			for (local879 = 0; local879 < this.anInt223; local879++) {
				local889 = arg1.anIntArray334[local108[local879]];
				if (local889 >= 0) {
					this.anIntArrayArray5[local889][local2792[local889]++] = local879;
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "go", descriptor = "(Lclient!dy;IJIIIIFF)S", line = 615)
	short method2293(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray36[arg1];
		@Pc(11) int local11 = this.anIntArray36[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray11[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray11[local15] & 0xFFFF) - 1;
			if (aLongArray1[local15] == arg2) {
				return (short) local35;
			}
		}
		this.aShortArray11[local13] = (short) (this.anInt222 + 1);
		aLongArray1[local13] = arg2;
		this.aShortArray2[this.anInt222] = (short) arg3;
		this.aShortArray6[this.anInt222] = (short) arg4;
		this.aShortArray3[this.anInt222] = (short) arg5;
		this.aByteArray4[this.anInt222] = (byte) arg6;
		this.aFloatArray19[this.anInt222] = arg7;
		this.aFloatArray20[this.anInt222] = arg8;
		return (short) this.anInt222++;
	}

	@OriginalMember(owner = "client!abk", name = "hx", descriptor = "(Lclient!dy;IJIIIIFF)S", line = 615)
	short method2298(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray36[arg1];
		@Pc(11) int local11 = this.anIntArray36[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray11[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray11[local15] & 0xFFFF) - 1;
			if (aLongArray1[local15] == arg2) {
				return (short) local35;
			}
		}
		this.aShortArray11[local13] = (short) (this.anInt222 + 1);
		aLongArray1[local13] = arg2;
		this.aShortArray2[this.anInt222] = (short) arg3;
		this.aShortArray6[this.anInt222] = (short) arg4;
		this.aShortArray3[this.anInt222] = (short) arg5;
		this.aByteArray4[this.anInt222] = (byte) arg6;
		this.aFloatArray19[this.anInt222] = arg7;
		this.aFloatArray20[this.anInt222] = arg8;
		return (short) this.anInt222++;
	}

	@OriginalMember(owner = "client!abk", name = "gi", descriptor = "([BI)[B", line = 638)
	static byte[] method2277(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!abk", name = "hn", descriptor = "([BI)[B", line = 638)
	static byte[] method2288(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!abk", name = "hs", descriptor = "([BI)[B", line = 638)
	static byte[] method2299(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!abk", name = "gb", descriptor = "([SI)[S", line = 644)
	static short[] method2278(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!abk", name = "hw", descriptor = "([SI)[S", line = 644)
	static short[] method2300(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!abk", name = "hy", descriptor = "([SI)[S", line = 644)
	static short[] method2301(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!abk", name = "gl", descriptor = "([FI)[F", line = 650)
	static float[] method2279(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!abk", name = "hr", descriptor = "([FI)[F", line = 650)
	static float[] method2302(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!abk", name = "y", descriptor = "()I", line = 656)
	@Override
	public int method5327() {
		return this.anInt227;
	}

	@OriginalMember(owner = "client!abk", name = "bu", descriptor = "()I", line = 656)
	@Override
	public int method5385() {
		return this.anInt227;
	}

	@OriginalMember(owner = "client!abk", name = "u", descriptor = "(I)V", line = 660)
	@Override
	public void method5326(@OriginalArg(0) int arg0) {
		this.anInt227 = arg0;
		if (this.aClass119_1 != null && (this.anInt227 & 0x10000) == 0) {
			this.aShortArray2 = this.aClass119_1.aShortArray75;
			this.aShortArray6 = this.aClass119_1.aShortArray73;
			this.aShortArray3 = this.aClass119_1.aShortArray74;
			this.aByteArray4 = this.aClass119_1.aByteArray58;
			this.aClass119_1 = null;
		}
		this.aBoolean49 = true;
		this.method2295();
	}

	@OriginalMember(owner = "client!abk", name = "bo", descriptor = "(I)V", line = 660)
	@Override
	public void method5387(@OriginalArg(0) int arg0) {
		this.anInt227 = arg0;
		if (this.aClass119_1 != null && (this.anInt227 & 0x10000) == 0) {
			this.aShortArray2 = this.aClass119_1.aShortArray75;
			this.aShortArray6 = this.aClass119_1.aShortArray73;
			this.aShortArray3 = this.aClass119_1.aShortArray74;
			this.aByteArray4 = this.aClass119_1.aByteArray58;
			this.aClass119_1 = null;
		}
		this.aBoolean49 = true;
		this.method2295();
	}

	@OriginalMember(owner = "client!abk", name = "bc", descriptor = "(I)V", line = 660)
	@Override
	public void method5388(@OriginalArg(0) int arg0) {
		this.anInt227 = arg0;
		if (this.aClass119_1 != null && (this.anInt227 & 0x10000) == 0) {
			this.aShortArray2 = this.aClass119_1.aShortArray75;
			this.aShortArray6 = this.aClass119_1.aShortArray73;
			this.aShortArray3 = this.aClass119_1.aShortArray74;
			this.aByteArray4 = this.aClass119_1.aByteArray58;
			this.aClass119_1 = null;
		}
		this.aBoolean49 = true;
		this.method2295();
	}

	@OriginalMember(owner = "client!abk", name = "bn", descriptor = "(I)V", line = 660)
	@Override
	public void method5364(@OriginalArg(0) int arg0) {
		this.anInt227 = arg0;
		if (this.aClass119_1 != null && (this.anInt227 & 0x10000) == 0) {
			this.aShortArray2 = this.aClass119_1.aShortArray75;
			this.aShortArray6 = this.aClass119_1.aShortArray73;
			this.aShortArray3 = this.aClass119_1.aShortArray74;
			this.aByteArray4 = this.aClass119_1.aByteArray58;
			this.aClass119_1 = null;
		}
		this.aBoolean49 = true;
		this.method2295();
	}

	@OriginalMember(owner = "client!abk", name = "ba", descriptor = "(I)V", line = 660)
	@Override
	public void method5386(@OriginalArg(0) int arg0) {
		this.anInt227 = arg0;
		if (this.aClass119_1 != null && (this.anInt227 & 0x10000) == 0) {
			this.aShortArray2 = this.aClass119_1.aShortArray75;
			this.aShortArray6 = this.aClass119_1.aShortArray73;
			this.aShortArray3 = this.aClass119_1.aShortArray74;
			this.aByteArray4 = this.aClass119_1.aByteArray58;
			this.aClass119_1 = null;
		}
		this.aBoolean49 = true;
		this.method2295();
	}

	@OriginalMember(owner = "client!abk", name = "be", descriptor = "()V", line = 673)
	@Override
	public void method5390() {
		if (this.anInt222 <= 0 || this.anInt224 <= 0) {
			return;
		}
		this.method2296(false);
		if ((this.aByte1 & 0x10) == 0 && this.aClass97_1.anInterface7_5 == null) {
			this.method2281(false);
		}
		this.method2295();
	}

	@OriginalMember(owner = "client!abk", name = "bx", descriptor = "()V", line = 673)
	@Override
	public void method5391() {
		if (this.anInt222 <= 0 || this.anInt224 <= 0) {
			return;
		}
		this.method2296(false);
		if ((this.aByte1 & 0x10) == 0 && this.aClass97_1.anInterface7_5 == null) {
			this.method2281(false);
		}
		this.method2295();
	}

	@OriginalMember(owner = "client!abk", name = "bh", descriptor = "()V", line = 673)
	@Override
	public void method5392() {
		if (this.anInt222 <= 0 || this.anInt224 <= 0) {
			return;
		}
		this.method2296(false);
		if ((this.aByte1 & 0x10) == 0 && this.aClass97_1.anInterface7_5 == null) {
			this.method2281(false);
		}
		this.method2295();
	}

	@OriginalMember(owner = "client!abk", name = "b", descriptor = "()V", line = 673)
	@Override
	public void method5328() {
		if (this.anInt222 <= 0 || this.anInt224 <= 0) {
			return;
		}
		this.method2296(false);
		if ((this.aByte1 & 0x10) == 0 && this.aClass97_1.anInterface7_5 == null) {
			this.method2281(false);
		}
		this.method2295();
	}

	@OriginalMember(owner = "client!abk", name = "s", descriptor = "(BIZ)Lclient!dh;", line = 682)
	@Override
	public Class20 method5430(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class20_Sub1 local22;
		@Pc(14) Class20_Sub1 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass21_Sub2_25.aClass20_Sub1Array2[arg0 - 1];
			local22 = this.aClass21_Sub2_25.aClass20_Sub1Array1[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class20_Sub1(this.aClass21_Sub2_25);
		}
		return this.method2280(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!abk", name = "bl", descriptor = "(BIZ)Lclient!dh;", line = 682)
	@Override
	public Class20 method5383(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class20_Sub1 local22;
		@Pc(14) Class20_Sub1 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass21_Sub2_25.aClass20_Sub1Array2[arg0 - 1];
			local22 = this.aClass21_Sub2_25.aClass20_Sub1Array1[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class20_Sub1(this.aClass21_Sub2_25);
		}
		return this.method2280(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!abk", name = "bi", descriptor = "(BIZ)Lclient!dh;", line = 682)
	@Override
	public Class20 method5368(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class20_Sub1 local22;
		@Pc(14) Class20_Sub1 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass21_Sub2_25.aClass20_Sub1Array2[arg0 - 1];
			local22 = this.aClass21_Sub2_25.aClass20_Sub1Array1[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class20_Sub1(this.aClass21_Sub2_25);
		}
		return this.method2280(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!abk", name = "gu", descriptor = "(Lclient!abk;Lclient!abk;IZZ)Lclient!dh;", line = 695)
	Class20 method2280(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) Class20_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.aByte1 = 0;
		arg0.anInt227 = arg2;
		arg0.anInt218 = this.anInt218;
		arg0.aShort1 = this.aShort1;
		arg0.aShort3 = this.aShort3;
		arg0.anInt220 = this.anInt220;
		arg0.anInt221 = this.anInt221;
		arg0.anInt222 = this.anInt222;
		arg0.anInt223 = this.anInt223;
		arg0.anInt224 = this.anInt224;
		arg0.anInt229 = this.anInt229;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean46 = this.aBoolean46;
		} else {
			arg0.aBoolean46 = true;
		}
		arg0.aBoolean47 = this.aBoolean47;
		@Pc(62) boolean local62 = Class93.method21679(arg2, this.anInt218);
		@Pc(67) boolean local67 = Class93.method21680(arg2, this.anInt218);
		@Pc(72) boolean local72 = Class93.method21686(arg2, this.anInt218);
		@Pc(78) boolean local78 = local62 | local67 | local72;
		@Pc(169) int local169;
		if (local78) {
			if (!local62) {
				arg0.anIntArray32 = this.anIntArray32;
			} else if (arg1.anIntArray32 == null || arg1.anIntArray32.length < this.anInt220) {
				arg0.anIntArray32 = arg1.anIntArray32 = new int[this.anInt220];
			} else {
				arg0.anIntArray32 = arg1.anIntArray32;
			}
			if (!local67) {
				arg0.anIntArray31 = this.anIntArray31;
			} else if (arg1.anIntArray31 == null || arg1.anIntArray31.length < this.anInt220) {
				arg0.anIntArray31 = arg1.anIntArray31 = new int[this.anInt220];
			} else {
				arg0.anIntArray31 = arg1.anIntArray31;
			}
			if (!local72) {
				arg0.anIntArray35 = this.anIntArray35;
			} else if (arg1.anIntArray35 == null || arg1.anIntArray35.length < this.anInt220) {
				arg0.anIntArray35 = arg1.anIntArray35 = new int[this.anInt220];
			} else {
				arg0.anIntArray35 = arg1.anIntArray35;
			}
			for (local169 = 0; local169 < this.anInt220; local169++) {
				if (local62) {
					arg0.anIntArray32[local169] = this.anIntArray32[local169];
				}
				if (local67) {
					arg0.anIntArray31[local169] = this.anIntArray31[local169];
				}
				if (local72) {
					arg0.anIntArray35[local169] = this.anIntArray35[local169];
				}
			}
		} else {
			arg0.anIntArray32 = this.anIntArray32;
			arg0.anIntArray31 = this.anIntArray31;
			arg0.anIntArray35 = this.anIntArray35;
		}
		if (Class93.method21695(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x1);
			}
			arg0.aClass88_5 = arg1.aClass88_5;
			arg0.aClass88_5.aByte106 = this.aClass88_5.aByte106;
			arg0.aClass88_5.anInterface5_6 = this.aClass88_5.anInterface5_6;
		} else if (Class93.method21690(arg2, this.anInt218)) {
			arg0.aClass88_5 = this.aClass88_5;
		} else {
			arg0.aClass88_5 = null;
		}
		if (Class93.method21719(arg2, this.anInt218)) {
			if (arg1.aShortArray4 == null || arg1.aShortArray4.length < this.anInt223) {
				arg0.aShortArray4 = arg1.aShortArray4 = new short[this.anInt223];
			} else {
				arg0.aShortArray4 = arg1.aShortArray4;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aShortArray4[local169] = this.aShortArray4[local169];
			}
		} else {
			arg0.aShortArray4 = this.aShortArray4;
		}
		if (Class93.method21685(arg2, this.anInt218)) {
			if (arg1.aByteArray5 == null || arg1.aByteArray5.length < this.anInt223) {
				arg0.aByteArray5 = arg1.aByteArray5 = new byte[this.anInt223];
			} else {
				arg0.aByteArray5 = arg1.aByteArray5;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aByteArray5[local169] = this.aByteArray5[local169];
			}
		} else {
			arg0.aByteArray5 = this.aByteArray5;
		}
		if (Class93.method21776(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x2);
			}
			arg0.aClass88_8 = arg1.aClass88_8;
			arg0.aClass88_8.aByte106 = this.aClass88_8.aByte106;
			arg0.aClass88_8.anInterface5_6 = this.aClass88_8.anInterface5_6;
		} else if (Class93.method21697(arg2, this.anInt218)) {
			arg0.aClass88_8 = this.aClass88_8;
		} else {
			arg0.aClass88_8 = null;
		}
		@Pc(482) int local482;
		if (Class93.method21745(arg2, this.anInt218)) {
			if (arg1.aShortArray2 == null || arg1.aShortArray2.length < this.anInt222) {
				local169 = this.anInt222;
				arg0.aShortArray2 = arg1.aShortArray2 = new short[local169];
				arg0.aShortArray6 = arg1.aShortArray6 = new short[local169];
				arg0.aShortArray3 = arg1.aShortArray3 = new short[local169];
			} else {
				arg0.aShortArray2 = arg1.aShortArray2;
				arg0.aShortArray6 = arg1.aShortArray6;
				arg0.aShortArray3 = arg1.aShortArray3;
			}
			if (this.aClass119_1 == null) {
				for (local169 = 0; local169 < this.anInt222; local169++) {
					arg0.aShortArray2[local169] = this.aShortArray2[local169];
					arg0.aShortArray6[local169] = this.aShortArray6[local169];
					arg0.aShortArray3[local169] = this.aShortArray3[local169];
				}
			} else {
				if (arg1.aClass119_1 == null) {
					arg1.aClass119_1 = new Class119();
				}
				@Pc(470) Class119 local470 = arg0.aClass119_1 = arg1.aClass119_1;
				if (local470.aShortArray75 == null || local470.aShortArray75.length < this.anInt222) {
					local482 = this.anInt222;
					local470.aShortArray75 = new short[local482];
					local470.aShortArray73 = new short[local482];
					local470.aShortArray74 = new short[local482];
					local470.aByteArray58 = new byte[local482];
				}
				for (local482 = 0; local482 < this.anInt222; local482++) {
					arg0.aShortArray2[local482] = this.aShortArray2[local482];
					arg0.aShortArray6[local482] = this.aShortArray6[local482];
					arg0.aShortArray3[local482] = this.aShortArray3[local482];
					local470.aShortArray75[local482] = this.aClass119_1.aShortArray75[local482];
					local470.aShortArray73[local482] = this.aClass119_1.aShortArray73[local482];
					local470.aShortArray74[local482] = this.aClass119_1.aShortArray74[local482];
					local470.aByteArray58[local482] = this.aClass119_1.aByteArray58[local482];
				}
			}
			arg0.aByteArray4 = this.aByteArray4;
		} else {
			arg0.aClass119_1 = this.aClass119_1;
			arg0.aShortArray2 = this.aShortArray2;
			arg0.aShortArray6 = this.aShortArray6;
			arg0.aShortArray3 = this.aShortArray3;
			arg0.aByteArray4 = this.aByteArray4;
		}
		if (Class93.method21779(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x4);
			}
			arg0.aClass88_6 = arg1.aClass88_6;
			arg0.aClass88_6.aByte106 = this.aClass88_6.aByte106;
			arg0.aClass88_6.anInterface5_6 = this.aClass88_6.anInterface5_6;
		} else if (Class93.method21691(arg2, this.anInt218)) {
			arg0.aClass88_6 = this.aClass88_6;
		} else {
			arg0.aClass88_6 = null;
		}
		if (Class93.method21767(arg2, this.anInt218)) {
			if (arg1.aFloatArray19 == null || arg1.aFloatArray19.length < this.anInt223) {
				local169 = this.anInt222;
				arg0.aFloatArray19 = arg1.aFloatArray19 = new float[local169];
				arg0.aFloatArray20 = arg1.aFloatArray20 = new float[local169];
			} else {
				arg0.aFloatArray19 = arg1.aFloatArray19;
				arg0.aFloatArray20 = arg1.aFloatArray20;
			}
			for (local169 = 0; local169 < this.anInt222; local169++) {
				arg0.aFloatArray19[local169] = this.aFloatArray19[local169];
				arg0.aFloatArray20[local169] = this.aFloatArray20[local169];
			}
		} else {
			arg0.aFloatArray19 = this.aFloatArray19;
			arg0.aFloatArray20 = this.aFloatArray20;
		}
		if (Class93.method21723(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x8);
			}
			arg0.aClass88_7 = arg1.aClass88_7;
			arg0.aClass88_7.aByte106 = this.aClass88_7.aByte106;
			arg0.aClass88_7.anInterface5_6 = this.aClass88_7.anInterface5_6;
		} else if (Class93.method21693(arg2, this.anInt218)) {
			arg0.aClass88_7 = this.aClass88_7;
		} else {
			arg0.aClass88_7 = null;
		}
		if (Class93.method21687(arg2, this.anInt218)) {
			if (arg1.aShortArray9 == null || arg1.aShortArray9.length < this.anInt223) {
				local169 = this.anInt223;
				arg0.aShortArray9 = arg1.aShortArray9 = new short[local169];
				arg0.aShortArray5 = arg1.aShortArray5 = new short[local169];
				arg0.aShortArray8 = arg1.aShortArray8 = new short[local169];
			} else {
				arg0.aShortArray9 = arg1.aShortArray9;
				arg0.aShortArray5 = arg1.aShortArray5;
				arg0.aShortArray8 = arg1.aShortArray8;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aShortArray9[local169] = this.aShortArray9[local169];
				arg0.aShortArray5[local169] = this.aShortArray5[local169];
				arg0.aShortArray8[local169] = this.aShortArray8[local169];
			}
		} else {
			arg0.aShortArray9 = this.aShortArray9;
			arg0.aShortArray5 = this.aShortArray5;
			arg0.aShortArray8 = this.aShortArray8;
		}
		if (Class93.method21699(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x10);
			}
			arg0.aClass97_1 = arg1.aClass97_1;
			arg0.aClass97_1.anInterface7_5 = this.aClass97_1.anInterface7_5;
		} else if (Class93.method21694(arg2, this.anInt218)) {
			arg0.aClass97_1 = this.aClass97_1;
		} else {
			arg0.aClass97_1 = null;
		}
		if (Class93.method21717(arg2, this.anInt218)) {
			if (arg1.aShortArray7 == null || arg1.aShortArray7.length < this.anInt223) {
				local169 = this.anInt223;
				arg0.aShortArray7 = arg1.aShortArray7 = new short[local169];
			} else {
				arg0.aShortArray7 = arg1.aShortArray7;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aShortArray7[local169] = this.aShortArray7[local169];
			}
		} else {
			arg0.aShortArray7 = this.aShortArray7;
		}
		if (!Class93.method21709(arg2, this.anInt218)) {
			arg0.aClass86Array1 = this.aClass86Array1;
		} else if (arg1.aClass86Array1 == null || arg1.aClass86Array1.length < this.anInt229) {
			local169 = this.anInt229;
			arg0.aClass86Array1 = arg1.aClass86Array1 = new Class86[local169];
			for (local482 = 0; local482 < this.anInt229; local482++) {
				arg0.aClass86Array1[local482] = this.aClass86Array1[local482].method21641();
			}
		} else {
			arg0.aClass86Array1 = arg1.aClass86Array1;
			for (local169 = 0; local169 < this.anInt229; local169++) {
				arg0.aClass86Array1[local169].method21642(this.aClass86Array1[local169]);
			}
		}
		arg0.aClass120Array1 = this.aClass120Array1;
		if (this.aBoolean51) {
			arg0.anInt225 = this.anInt225;
			arg0.anInt228 = this.anInt228;
			arg0.aShort5 = this.aShort5;
			arg0.aShort2 = this.aShort2;
			arg0.aShort4 = this.aShort4;
			arg0.aShort9 = this.aShort9;
			arg0.aShort6 = this.aShort6;
			arg0.aShort7 = this.aShort7;
			arg0.aBoolean51 = true;
		} else {
			arg0.aBoolean51 = false;
		}
		if (this.aBoolean50) {
			arg0.aShort8 = this.aShort8;
			arg0.aBoolean50 = true;
		} else {
			arg0.aBoolean50 = false;
		}
		arg0.anIntArrayArray3 = this.anIntArrayArray3;
		arg0.anIntArrayArray5 = this.anIntArrayArray5;
		arg0.anIntArrayArray4 = this.anIntArrayArray4;
		arg0.aShortArray11 = this.aShortArray11;
		arg0.anIntArray36 = this.anIntArray36;
		arg0.aShortArray10 = this.aShortArray10;
		arg0.aShortArray1 = this.aShortArray1;
		arg0.anIntArray33 = this.anIntArray33;
		arg0.aClass135Array1 = this.aClass135Array1;
		arg0.aClass109Array1 = this.aClass109Array1;
		return arg0;
	}

	@OriginalMember(owner = "client!abk", name = "hf", descriptor = "(Lclient!abk;Lclient!abk;IZZ)Lclient!dh;", line = 695)
	Class20 method2297(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) Class20_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		arg0.aByte1 = 0;
		arg0.anInt227 = arg2;
		arg0.anInt218 = this.anInt218;
		arg0.aShort1 = this.aShort1;
		arg0.aShort3 = this.aShort3;
		arg0.anInt220 = this.anInt220;
		arg0.anInt221 = this.anInt221;
		arg0.anInt222 = this.anInt222;
		arg0.anInt223 = this.anInt223;
		arg0.anInt224 = this.anInt224;
		arg0.anInt229 = this.anInt229;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean46 = this.aBoolean46;
		} else {
			arg0.aBoolean46 = true;
		}
		arg0.aBoolean47 = this.aBoolean47;
		@Pc(62) boolean local62 = Class93.method21679(arg2, this.anInt218);
		@Pc(67) boolean local67 = Class93.method21680(arg2, this.anInt218);
		@Pc(72) boolean local72 = Class93.method21686(arg2, this.anInt218);
		@Pc(78) boolean local78 = local62 | local67 | local72;
		@Pc(169) int local169;
		if (local78) {
			if (!local62) {
				arg0.anIntArray32 = this.anIntArray32;
			} else if (arg1.anIntArray32 == null || arg1.anIntArray32.length < this.anInt220) {
				arg0.anIntArray32 = arg1.anIntArray32 = new int[this.anInt220];
			} else {
				arg0.anIntArray32 = arg1.anIntArray32;
			}
			if (!local67) {
				arg0.anIntArray31 = this.anIntArray31;
			} else if (arg1.anIntArray31 == null || arg1.anIntArray31.length < this.anInt220) {
				arg0.anIntArray31 = arg1.anIntArray31 = new int[this.anInt220];
			} else {
				arg0.anIntArray31 = arg1.anIntArray31;
			}
			if (!local72) {
				arg0.anIntArray35 = this.anIntArray35;
			} else if (arg1.anIntArray35 == null || arg1.anIntArray35.length < this.anInt220) {
				arg0.anIntArray35 = arg1.anIntArray35 = new int[this.anInt220];
			} else {
				arg0.anIntArray35 = arg1.anIntArray35;
			}
			for (local169 = 0; local169 < this.anInt220; local169++) {
				if (local62) {
					arg0.anIntArray32[local169] = this.anIntArray32[local169];
				}
				if (local67) {
					arg0.anIntArray31[local169] = this.anIntArray31[local169];
				}
				if (local72) {
					arg0.anIntArray35[local169] = this.anIntArray35[local169];
				}
			}
		} else {
			arg0.anIntArray32 = this.anIntArray32;
			arg0.anIntArray31 = this.anIntArray31;
			arg0.anIntArray35 = this.anIntArray35;
		}
		if (Class93.method21695(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x1);
			}
			arg0.aClass88_5 = arg1.aClass88_5;
			arg0.aClass88_5.aByte106 = this.aClass88_5.aByte106;
			arg0.aClass88_5.anInterface5_6 = this.aClass88_5.anInterface5_6;
		} else if (Class93.method21690(arg2, this.anInt218)) {
			arg0.aClass88_5 = this.aClass88_5;
		} else {
			arg0.aClass88_5 = null;
		}
		if (Class93.method21719(arg2, this.anInt218)) {
			if (arg1.aShortArray4 == null || arg1.aShortArray4.length < this.anInt223) {
				arg0.aShortArray4 = arg1.aShortArray4 = new short[this.anInt223];
			} else {
				arg0.aShortArray4 = arg1.aShortArray4;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aShortArray4[local169] = this.aShortArray4[local169];
			}
		} else {
			arg0.aShortArray4 = this.aShortArray4;
		}
		if (Class93.method21685(arg2, this.anInt218)) {
			if (arg1.aByteArray5 == null || arg1.aByteArray5.length < this.anInt223) {
				arg0.aByteArray5 = arg1.aByteArray5 = new byte[this.anInt223];
			} else {
				arg0.aByteArray5 = arg1.aByteArray5;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aByteArray5[local169] = this.aByteArray5[local169];
			}
		} else {
			arg0.aByteArray5 = this.aByteArray5;
		}
		if (Class93.method21776(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x2);
			}
			arg0.aClass88_8 = arg1.aClass88_8;
			arg0.aClass88_8.aByte106 = this.aClass88_8.aByte106;
			arg0.aClass88_8.anInterface5_6 = this.aClass88_8.anInterface5_6;
		} else if (Class93.method21697(arg2, this.anInt218)) {
			arg0.aClass88_8 = this.aClass88_8;
		} else {
			arg0.aClass88_8 = null;
		}
		@Pc(482) int local482;
		if (Class93.method21745(arg2, this.anInt218)) {
			if (arg1.aShortArray2 == null || arg1.aShortArray2.length < this.anInt222) {
				local169 = this.anInt222;
				arg0.aShortArray2 = arg1.aShortArray2 = new short[local169];
				arg0.aShortArray6 = arg1.aShortArray6 = new short[local169];
				arg0.aShortArray3 = arg1.aShortArray3 = new short[local169];
			} else {
				arg0.aShortArray2 = arg1.aShortArray2;
				arg0.aShortArray6 = arg1.aShortArray6;
				arg0.aShortArray3 = arg1.aShortArray3;
			}
			if (this.aClass119_1 == null) {
				for (local169 = 0; local169 < this.anInt222; local169++) {
					arg0.aShortArray2[local169] = this.aShortArray2[local169];
					arg0.aShortArray6[local169] = this.aShortArray6[local169];
					arg0.aShortArray3[local169] = this.aShortArray3[local169];
				}
			} else {
				if (arg1.aClass119_1 == null) {
					arg1.aClass119_1 = new Class119();
				}
				@Pc(470) Class119 local470 = arg0.aClass119_1 = arg1.aClass119_1;
				if (local470.aShortArray75 == null || local470.aShortArray75.length < this.anInt222) {
					local482 = this.anInt222;
					local470.aShortArray75 = new short[local482];
					local470.aShortArray73 = new short[local482];
					local470.aShortArray74 = new short[local482];
					local470.aByteArray58 = new byte[local482];
				}
				for (local482 = 0; local482 < this.anInt222; local482++) {
					arg0.aShortArray2[local482] = this.aShortArray2[local482];
					arg0.aShortArray6[local482] = this.aShortArray6[local482];
					arg0.aShortArray3[local482] = this.aShortArray3[local482];
					local470.aShortArray75[local482] = this.aClass119_1.aShortArray75[local482];
					local470.aShortArray73[local482] = this.aClass119_1.aShortArray73[local482];
					local470.aShortArray74[local482] = this.aClass119_1.aShortArray74[local482];
					local470.aByteArray58[local482] = this.aClass119_1.aByteArray58[local482];
				}
			}
			arg0.aByteArray4 = this.aByteArray4;
		} else {
			arg0.aClass119_1 = this.aClass119_1;
			arg0.aShortArray2 = this.aShortArray2;
			arg0.aShortArray6 = this.aShortArray6;
			arg0.aShortArray3 = this.aShortArray3;
			arg0.aByteArray4 = this.aByteArray4;
		}
		if (Class93.method21779(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x4);
			}
			arg0.aClass88_6 = arg1.aClass88_6;
			arg0.aClass88_6.aByte106 = this.aClass88_6.aByte106;
			arg0.aClass88_6.anInterface5_6 = this.aClass88_6.anInterface5_6;
		} else if (Class93.method21691(arg2, this.anInt218)) {
			arg0.aClass88_6 = this.aClass88_6;
		} else {
			arg0.aClass88_6 = null;
		}
		if (Class93.method21767(arg2, this.anInt218)) {
			if (arg1.aFloatArray19 == null || arg1.aFloatArray19.length < this.anInt223) {
				local169 = this.anInt222;
				arg0.aFloatArray19 = arg1.aFloatArray19 = new float[local169];
				arg0.aFloatArray20 = arg1.aFloatArray20 = new float[local169];
			} else {
				arg0.aFloatArray19 = arg1.aFloatArray19;
				arg0.aFloatArray20 = arg1.aFloatArray20;
			}
			for (local169 = 0; local169 < this.anInt222; local169++) {
				arg0.aFloatArray19[local169] = this.aFloatArray19[local169];
				arg0.aFloatArray20[local169] = this.aFloatArray20[local169];
			}
		} else {
			arg0.aFloatArray19 = this.aFloatArray19;
			arg0.aFloatArray20 = this.aFloatArray20;
		}
		if (Class93.method21723(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x8);
			}
			arg0.aClass88_7 = arg1.aClass88_7;
			arg0.aClass88_7.aByte106 = this.aClass88_7.aByte106;
			arg0.aClass88_7.anInterface5_6 = this.aClass88_7.anInterface5_6;
		} else if (Class93.method21693(arg2, this.anInt218)) {
			arg0.aClass88_7 = this.aClass88_7;
		} else {
			arg0.aClass88_7 = null;
		}
		if (Class93.method21687(arg2, this.anInt218)) {
			if (arg1.aShortArray9 == null || arg1.aShortArray9.length < this.anInt223) {
				local169 = this.anInt223;
				arg0.aShortArray9 = arg1.aShortArray9 = new short[local169];
				arg0.aShortArray5 = arg1.aShortArray5 = new short[local169];
				arg0.aShortArray8 = arg1.aShortArray8 = new short[local169];
			} else {
				arg0.aShortArray9 = arg1.aShortArray9;
				arg0.aShortArray5 = arg1.aShortArray5;
				arg0.aShortArray8 = arg1.aShortArray8;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aShortArray9[local169] = this.aShortArray9[local169];
				arg0.aShortArray5[local169] = this.aShortArray5[local169];
				arg0.aShortArray8[local169] = this.aShortArray8[local169];
			}
		} else {
			arg0.aShortArray9 = this.aShortArray9;
			arg0.aShortArray5 = this.aShortArray5;
			arg0.aShortArray8 = this.aShortArray8;
		}
		if (Class93.method21699(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x10);
			}
			arg0.aClass97_1 = arg1.aClass97_1;
			arg0.aClass97_1.anInterface7_5 = this.aClass97_1.anInterface7_5;
		} else if (Class93.method21694(arg2, this.anInt218)) {
			arg0.aClass97_1 = this.aClass97_1;
		} else {
			arg0.aClass97_1 = null;
		}
		if (Class93.method21717(arg2, this.anInt218)) {
			if (arg1.aShortArray7 == null || arg1.aShortArray7.length < this.anInt223) {
				local169 = this.anInt223;
				arg0.aShortArray7 = arg1.aShortArray7 = new short[local169];
			} else {
				arg0.aShortArray7 = arg1.aShortArray7;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aShortArray7[local169] = this.aShortArray7[local169];
			}
		} else {
			arg0.aShortArray7 = this.aShortArray7;
		}
		if (!Class93.method21709(arg2, this.anInt218)) {
			arg0.aClass86Array1 = this.aClass86Array1;
		} else if (arg1.aClass86Array1 == null || arg1.aClass86Array1.length < this.anInt229) {
			local169 = this.anInt229;
			arg0.aClass86Array1 = arg1.aClass86Array1 = new Class86[local169];
			for (local482 = 0; local482 < this.anInt229; local482++) {
				arg0.aClass86Array1[local482] = this.aClass86Array1[local482].method21641();
			}
		} else {
			arg0.aClass86Array1 = arg1.aClass86Array1;
			for (local169 = 0; local169 < this.anInt229; local169++) {
				arg0.aClass86Array1[local169].method21642(this.aClass86Array1[local169]);
			}
		}
		arg0.aClass120Array1 = this.aClass120Array1;
		if (this.aBoolean51) {
			arg0.anInt225 = this.anInt225;
			arg0.anInt228 = this.anInt228;
			arg0.aShort5 = this.aShort5;
			arg0.aShort2 = this.aShort2;
			arg0.aShort4 = this.aShort4;
			arg0.aShort9 = this.aShort9;
			arg0.aShort6 = this.aShort6;
			arg0.aShort7 = this.aShort7;
			arg0.aBoolean51 = true;
		} else {
			arg0.aBoolean51 = false;
		}
		if (this.aBoolean50) {
			arg0.aShort8 = this.aShort8;
			arg0.aBoolean50 = true;
		} else {
			arg0.aBoolean50 = false;
		}
		arg0.anIntArrayArray3 = this.anIntArrayArray3;
		arg0.anIntArrayArray5 = this.anIntArrayArray5;
		arg0.anIntArrayArray4 = this.anIntArrayArray4;
		arg0.aShortArray11 = this.aShortArray11;
		arg0.anIntArray36 = this.anIntArray36;
		arg0.aShortArray10 = this.aShortArray10;
		arg0.aShortArray1 = this.aShortArray1;
		arg0.anIntArray33 = this.anIntArray33;
		arg0.aClass135Array1 = this.aClass135Array1;
		arg0.aClass109Array1 = this.aClass109Array1;
		return arg0;
	}

	@OriginalMember(owner = "client!abk", name = "hq", descriptor = "(Lclient!abk;Lclient!abk;IZZ)Lclient!dh;", line = 695)
	Class20 method2303(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) Class20_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		arg0.aByte1 = 0;
		arg0.anInt227 = arg2;
		arg0.anInt218 = this.anInt218;
		arg0.aShort1 = this.aShort1;
		arg0.aShort3 = this.aShort3;
		arg0.anInt220 = this.anInt220;
		arg0.anInt221 = this.anInt221;
		arg0.anInt222 = this.anInt222;
		arg0.anInt223 = this.anInt223;
		arg0.anInt224 = this.anInt224;
		arg0.anInt229 = this.anInt229;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean46 = this.aBoolean46;
		} else {
			arg0.aBoolean46 = true;
		}
		arg0.aBoolean47 = this.aBoolean47;
		@Pc(62) boolean local62 = Class93.method21679(arg2, this.anInt218);
		@Pc(67) boolean local67 = Class93.method21680(arg2, this.anInt218);
		@Pc(72) boolean local72 = Class93.method21686(arg2, this.anInt218);
		@Pc(78) boolean local78 = local62 | local67 | local72;
		@Pc(169) int local169;
		if (local78) {
			if (!local62) {
				arg0.anIntArray32 = this.anIntArray32;
			} else if (arg1.anIntArray32 == null || arg1.anIntArray32.length < this.anInt220) {
				arg0.anIntArray32 = arg1.anIntArray32 = new int[this.anInt220];
			} else {
				arg0.anIntArray32 = arg1.anIntArray32;
			}
			if (!local67) {
				arg0.anIntArray31 = this.anIntArray31;
			} else if (arg1.anIntArray31 == null || arg1.anIntArray31.length < this.anInt220) {
				arg0.anIntArray31 = arg1.anIntArray31 = new int[this.anInt220];
			} else {
				arg0.anIntArray31 = arg1.anIntArray31;
			}
			if (!local72) {
				arg0.anIntArray35 = this.anIntArray35;
			} else if (arg1.anIntArray35 == null || arg1.anIntArray35.length < this.anInt220) {
				arg0.anIntArray35 = arg1.anIntArray35 = new int[this.anInt220];
			} else {
				arg0.anIntArray35 = arg1.anIntArray35;
			}
			for (local169 = 0; local169 < this.anInt220; local169++) {
				if (local62) {
					arg0.anIntArray32[local169] = this.anIntArray32[local169];
				}
				if (local67) {
					arg0.anIntArray31[local169] = this.anIntArray31[local169];
				}
				if (local72) {
					arg0.anIntArray35[local169] = this.anIntArray35[local169];
				}
			}
		} else {
			arg0.anIntArray32 = this.anIntArray32;
			arg0.anIntArray31 = this.anIntArray31;
			arg0.anIntArray35 = this.anIntArray35;
		}
		if (Class93.method21695(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x1);
			}
			arg0.aClass88_5 = arg1.aClass88_5;
			arg0.aClass88_5.aByte106 = this.aClass88_5.aByte106;
			arg0.aClass88_5.anInterface5_6 = this.aClass88_5.anInterface5_6;
		} else if (Class93.method21690(arg2, this.anInt218)) {
			arg0.aClass88_5 = this.aClass88_5;
		} else {
			arg0.aClass88_5 = null;
		}
		if (Class93.method21719(arg2, this.anInt218)) {
			if (arg1.aShortArray4 == null || arg1.aShortArray4.length < this.anInt223) {
				arg0.aShortArray4 = arg1.aShortArray4 = new short[this.anInt223];
			} else {
				arg0.aShortArray4 = arg1.aShortArray4;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aShortArray4[local169] = this.aShortArray4[local169];
			}
		} else {
			arg0.aShortArray4 = this.aShortArray4;
		}
		if (Class93.method21685(arg2, this.anInt218)) {
			if (arg1.aByteArray5 == null || arg1.aByteArray5.length < this.anInt223) {
				arg0.aByteArray5 = arg1.aByteArray5 = new byte[this.anInt223];
			} else {
				arg0.aByteArray5 = arg1.aByteArray5;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aByteArray5[local169] = this.aByteArray5[local169];
			}
		} else {
			arg0.aByteArray5 = this.aByteArray5;
		}
		if (Class93.method21776(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x2);
			}
			arg0.aClass88_8 = arg1.aClass88_8;
			arg0.aClass88_8.aByte106 = this.aClass88_8.aByte106;
			arg0.aClass88_8.anInterface5_6 = this.aClass88_8.anInterface5_6;
		} else if (Class93.method21697(arg2, this.anInt218)) {
			arg0.aClass88_8 = this.aClass88_8;
		} else {
			arg0.aClass88_8 = null;
		}
		@Pc(482) int local482;
		if (Class93.method21745(arg2, this.anInt218)) {
			if (arg1.aShortArray2 == null || arg1.aShortArray2.length < this.anInt222) {
				local169 = this.anInt222;
				arg0.aShortArray2 = arg1.aShortArray2 = new short[local169];
				arg0.aShortArray6 = arg1.aShortArray6 = new short[local169];
				arg0.aShortArray3 = arg1.aShortArray3 = new short[local169];
			} else {
				arg0.aShortArray2 = arg1.aShortArray2;
				arg0.aShortArray6 = arg1.aShortArray6;
				arg0.aShortArray3 = arg1.aShortArray3;
			}
			if (this.aClass119_1 == null) {
				for (local169 = 0; local169 < this.anInt222; local169++) {
					arg0.aShortArray2[local169] = this.aShortArray2[local169];
					arg0.aShortArray6[local169] = this.aShortArray6[local169];
					arg0.aShortArray3[local169] = this.aShortArray3[local169];
				}
			} else {
				if (arg1.aClass119_1 == null) {
					arg1.aClass119_1 = new Class119();
				}
				@Pc(470) Class119 local470 = arg0.aClass119_1 = arg1.aClass119_1;
				if (local470.aShortArray75 == null || local470.aShortArray75.length < this.anInt222) {
					local482 = this.anInt222;
					local470.aShortArray75 = new short[local482];
					local470.aShortArray73 = new short[local482];
					local470.aShortArray74 = new short[local482];
					local470.aByteArray58 = new byte[local482];
				}
				for (local482 = 0; local482 < this.anInt222; local482++) {
					arg0.aShortArray2[local482] = this.aShortArray2[local482];
					arg0.aShortArray6[local482] = this.aShortArray6[local482];
					arg0.aShortArray3[local482] = this.aShortArray3[local482];
					local470.aShortArray75[local482] = this.aClass119_1.aShortArray75[local482];
					local470.aShortArray73[local482] = this.aClass119_1.aShortArray73[local482];
					local470.aShortArray74[local482] = this.aClass119_1.aShortArray74[local482];
					local470.aByteArray58[local482] = this.aClass119_1.aByteArray58[local482];
				}
			}
			arg0.aByteArray4 = this.aByteArray4;
		} else {
			arg0.aClass119_1 = this.aClass119_1;
			arg0.aShortArray2 = this.aShortArray2;
			arg0.aShortArray6 = this.aShortArray6;
			arg0.aShortArray3 = this.aShortArray3;
			arg0.aByteArray4 = this.aByteArray4;
		}
		if (Class93.method21779(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x4);
			}
			arg0.aClass88_6 = arg1.aClass88_6;
			arg0.aClass88_6.aByte106 = this.aClass88_6.aByte106;
			arg0.aClass88_6.anInterface5_6 = this.aClass88_6.anInterface5_6;
		} else if (Class93.method21691(arg2, this.anInt218)) {
			arg0.aClass88_6 = this.aClass88_6;
		} else {
			arg0.aClass88_6 = null;
		}
		if (Class93.method21767(arg2, this.anInt218)) {
			if (arg1.aFloatArray19 == null || arg1.aFloatArray19.length < this.anInt223) {
				local169 = this.anInt222;
				arg0.aFloatArray19 = arg1.aFloatArray19 = new float[local169];
				arg0.aFloatArray20 = arg1.aFloatArray20 = new float[local169];
			} else {
				arg0.aFloatArray19 = arg1.aFloatArray19;
				arg0.aFloatArray20 = arg1.aFloatArray20;
			}
			for (local169 = 0; local169 < this.anInt222; local169++) {
				arg0.aFloatArray19[local169] = this.aFloatArray19[local169];
				arg0.aFloatArray20[local169] = this.aFloatArray20[local169];
			}
		} else {
			arg0.aFloatArray19 = this.aFloatArray19;
			arg0.aFloatArray20 = this.aFloatArray20;
		}
		if (Class93.method21723(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x8);
			}
			arg0.aClass88_7 = arg1.aClass88_7;
			arg0.aClass88_7.aByte106 = this.aClass88_7.aByte106;
			arg0.aClass88_7.anInterface5_6 = this.aClass88_7.anInterface5_6;
		} else if (Class93.method21693(arg2, this.anInt218)) {
			arg0.aClass88_7 = this.aClass88_7;
		} else {
			arg0.aClass88_7 = null;
		}
		if (Class93.method21687(arg2, this.anInt218)) {
			if (arg1.aShortArray9 == null || arg1.aShortArray9.length < this.anInt223) {
				local169 = this.anInt223;
				arg0.aShortArray9 = arg1.aShortArray9 = new short[local169];
				arg0.aShortArray5 = arg1.aShortArray5 = new short[local169];
				arg0.aShortArray8 = arg1.aShortArray8 = new short[local169];
			} else {
				arg0.aShortArray9 = arg1.aShortArray9;
				arg0.aShortArray5 = arg1.aShortArray5;
				arg0.aShortArray8 = arg1.aShortArray8;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aShortArray9[local169] = this.aShortArray9[local169];
				arg0.aShortArray5[local169] = this.aShortArray5[local169];
				arg0.aShortArray8[local169] = this.aShortArray8[local169];
			}
		} else {
			arg0.aShortArray9 = this.aShortArray9;
			arg0.aShortArray5 = this.aShortArray5;
			arg0.aShortArray8 = this.aShortArray8;
		}
		if (Class93.method21699(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x10);
			}
			arg0.aClass97_1 = arg1.aClass97_1;
			arg0.aClass97_1.anInterface7_5 = this.aClass97_1.anInterface7_5;
		} else if (Class93.method21694(arg2, this.anInt218)) {
			arg0.aClass97_1 = this.aClass97_1;
		} else {
			arg0.aClass97_1 = null;
		}
		if (Class93.method21717(arg2, this.anInt218)) {
			if (arg1.aShortArray7 == null || arg1.aShortArray7.length < this.anInt223) {
				local169 = this.anInt223;
				arg0.aShortArray7 = arg1.aShortArray7 = new short[local169];
			} else {
				arg0.aShortArray7 = arg1.aShortArray7;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aShortArray7[local169] = this.aShortArray7[local169];
			}
		} else {
			arg0.aShortArray7 = this.aShortArray7;
		}
		if (!Class93.method21709(arg2, this.anInt218)) {
			arg0.aClass86Array1 = this.aClass86Array1;
		} else if (arg1.aClass86Array1 == null || arg1.aClass86Array1.length < this.anInt229) {
			local169 = this.anInt229;
			arg0.aClass86Array1 = arg1.aClass86Array1 = new Class86[local169];
			for (local482 = 0; local482 < this.anInt229; local482++) {
				arg0.aClass86Array1[local482] = this.aClass86Array1[local482].method21641();
			}
		} else {
			arg0.aClass86Array1 = arg1.aClass86Array1;
			for (local169 = 0; local169 < this.anInt229; local169++) {
				arg0.aClass86Array1[local169].method21642(this.aClass86Array1[local169]);
			}
		}
		arg0.aClass120Array1 = this.aClass120Array1;
		if (this.aBoolean51) {
			arg0.anInt225 = this.anInt225;
			arg0.anInt228 = this.anInt228;
			arg0.aShort5 = this.aShort5;
			arg0.aShort2 = this.aShort2;
			arg0.aShort4 = this.aShort4;
			arg0.aShort9 = this.aShort9;
			arg0.aShort6 = this.aShort6;
			arg0.aShort7 = this.aShort7;
			arg0.aBoolean51 = true;
		} else {
			arg0.aBoolean51 = false;
		}
		if (this.aBoolean50) {
			arg0.aShort8 = this.aShort8;
			arg0.aBoolean50 = true;
		} else {
			arg0.aBoolean50 = false;
		}
		arg0.anIntArrayArray3 = this.anIntArrayArray3;
		arg0.anIntArrayArray5 = this.anIntArrayArray5;
		arg0.anIntArrayArray4 = this.anIntArrayArray4;
		arg0.aShortArray11 = this.aShortArray11;
		arg0.anIntArray36 = this.anIntArray36;
		arg0.aShortArray10 = this.aShortArray10;
		arg0.aShortArray1 = this.aShortArray1;
		arg0.anIntArray33 = this.anIntArray33;
		arg0.aClass135Array1 = this.aClass135Array1;
		arg0.aClass109Array1 = this.aClass109Array1;
		return arg0;
	}

	@OriginalMember(owner = "client!abk", name = "hp", descriptor = "(Lclient!abk;Lclient!abk;IZZ)Lclient!dh;", line = 695)
	Class20 method2320(@OriginalArg(0) Class20_Sub1 arg0, @OriginalArg(1) Class20_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		arg0.aByte1 = 0;
		arg0.anInt227 = arg2;
		arg0.anInt218 = this.anInt218;
		arg0.aShort1 = this.aShort1;
		arg0.aShort3 = this.aShort3;
		arg0.anInt220 = this.anInt220;
		arg0.anInt221 = this.anInt221;
		arg0.anInt222 = this.anInt222;
		arg0.anInt223 = this.anInt223;
		arg0.anInt224 = this.anInt224;
		arg0.anInt229 = this.anInt229;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean46 = this.aBoolean46;
		} else {
			arg0.aBoolean46 = true;
		}
		arg0.aBoolean47 = this.aBoolean47;
		@Pc(62) boolean local62 = Class93.method21679(arg2, this.anInt218);
		@Pc(67) boolean local67 = Class93.method21680(arg2, this.anInt218);
		@Pc(72) boolean local72 = Class93.method21686(arg2, this.anInt218);
		@Pc(78) boolean local78 = local62 | local67 | local72;
		@Pc(169) int local169;
		if (local78) {
			if (!local62) {
				arg0.anIntArray32 = this.anIntArray32;
			} else if (arg1.anIntArray32 == null || arg1.anIntArray32.length < this.anInt220) {
				arg0.anIntArray32 = arg1.anIntArray32 = new int[this.anInt220];
			} else {
				arg0.anIntArray32 = arg1.anIntArray32;
			}
			if (!local67) {
				arg0.anIntArray31 = this.anIntArray31;
			} else if (arg1.anIntArray31 == null || arg1.anIntArray31.length < this.anInt220) {
				arg0.anIntArray31 = arg1.anIntArray31 = new int[this.anInt220];
			} else {
				arg0.anIntArray31 = arg1.anIntArray31;
			}
			if (!local72) {
				arg0.anIntArray35 = this.anIntArray35;
			} else if (arg1.anIntArray35 == null || arg1.anIntArray35.length < this.anInt220) {
				arg0.anIntArray35 = arg1.anIntArray35 = new int[this.anInt220];
			} else {
				arg0.anIntArray35 = arg1.anIntArray35;
			}
			for (local169 = 0; local169 < this.anInt220; local169++) {
				if (local62) {
					arg0.anIntArray32[local169] = this.anIntArray32[local169];
				}
				if (local67) {
					arg0.anIntArray31[local169] = this.anIntArray31[local169];
				}
				if (local72) {
					arg0.anIntArray35[local169] = this.anIntArray35[local169];
				}
			}
		} else {
			arg0.anIntArray32 = this.anIntArray32;
			arg0.anIntArray31 = this.anIntArray31;
			arg0.anIntArray35 = this.anIntArray35;
		}
		if (Class93.method21695(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x1);
			}
			arg0.aClass88_5 = arg1.aClass88_5;
			arg0.aClass88_5.aByte106 = this.aClass88_5.aByte106;
			arg0.aClass88_5.anInterface5_6 = this.aClass88_5.anInterface5_6;
		} else if (Class93.method21690(arg2, this.anInt218)) {
			arg0.aClass88_5 = this.aClass88_5;
		} else {
			arg0.aClass88_5 = null;
		}
		if (Class93.method21719(arg2, this.anInt218)) {
			if (arg1.aShortArray4 == null || arg1.aShortArray4.length < this.anInt223) {
				arg0.aShortArray4 = arg1.aShortArray4 = new short[this.anInt223];
			} else {
				arg0.aShortArray4 = arg1.aShortArray4;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aShortArray4[local169] = this.aShortArray4[local169];
			}
		} else {
			arg0.aShortArray4 = this.aShortArray4;
		}
		if (Class93.method21685(arg2, this.anInt218)) {
			if (arg1.aByteArray5 == null || arg1.aByteArray5.length < this.anInt223) {
				arg0.aByteArray5 = arg1.aByteArray5 = new byte[this.anInt223];
			} else {
				arg0.aByteArray5 = arg1.aByteArray5;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aByteArray5[local169] = this.aByteArray5[local169];
			}
		} else {
			arg0.aByteArray5 = this.aByteArray5;
		}
		if (Class93.method21776(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x2);
			}
			arg0.aClass88_8 = arg1.aClass88_8;
			arg0.aClass88_8.aByte106 = this.aClass88_8.aByte106;
			arg0.aClass88_8.anInterface5_6 = this.aClass88_8.anInterface5_6;
		} else if (Class93.method21697(arg2, this.anInt218)) {
			arg0.aClass88_8 = this.aClass88_8;
		} else {
			arg0.aClass88_8 = null;
		}
		@Pc(482) int local482;
		if (Class93.method21745(arg2, this.anInt218)) {
			if (arg1.aShortArray2 == null || arg1.aShortArray2.length < this.anInt222) {
				local169 = this.anInt222;
				arg0.aShortArray2 = arg1.aShortArray2 = new short[local169];
				arg0.aShortArray6 = arg1.aShortArray6 = new short[local169];
				arg0.aShortArray3 = arg1.aShortArray3 = new short[local169];
			} else {
				arg0.aShortArray2 = arg1.aShortArray2;
				arg0.aShortArray6 = arg1.aShortArray6;
				arg0.aShortArray3 = arg1.aShortArray3;
			}
			if (this.aClass119_1 == null) {
				for (local169 = 0; local169 < this.anInt222; local169++) {
					arg0.aShortArray2[local169] = this.aShortArray2[local169];
					arg0.aShortArray6[local169] = this.aShortArray6[local169];
					arg0.aShortArray3[local169] = this.aShortArray3[local169];
				}
			} else {
				if (arg1.aClass119_1 == null) {
					arg1.aClass119_1 = new Class119();
				}
				@Pc(470) Class119 local470 = arg0.aClass119_1 = arg1.aClass119_1;
				if (local470.aShortArray75 == null || local470.aShortArray75.length < this.anInt222) {
					local482 = this.anInt222;
					local470.aShortArray75 = new short[local482];
					local470.aShortArray73 = new short[local482];
					local470.aShortArray74 = new short[local482];
					local470.aByteArray58 = new byte[local482];
				}
				for (local482 = 0; local482 < this.anInt222; local482++) {
					arg0.aShortArray2[local482] = this.aShortArray2[local482];
					arg0.aShortArray6[local482] = this.aShortArray6[local482];
					arg0.aShortArray3[local482] = this.aShortArray3[local482];
					local470.aShortArray75[local482] = this.aClass119_1.aShortArray75[local482];
					local470.aShortArray73[local482] = this.aClass119_1.aShortArray73[local482];
					local470.aShortArray74[local482] = this.aClass119_1.aShortArray74[local482];
					local470.aByteArray58[local482] = this.aClass119_1.aByteArray58[local482];
				}
			}
			arg0.aByteArray4 = this.aByteArray4;
		} else {
			arg0.aClass119_1 = this.aClass119_1;
			arg0.aShortArray2 = this.aShortArray2;
			arg0.aShortArray6 = this.aShortArray6;
			arg0.aShortArray3 = this.aShortArray3;
			arg0.aByteArray4 = this.aByteArray4;
		}
		if (Class93.method21779(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x4);
			}
			arg0.aClass88_6 = arg1.aClass88_6;
			arg0.aClass88_6.aByte106 = this.aClass88_6.aByte106;
			arg0.aClass88_6.anInterface5_6 = this.aClass88_6.anInterface5_6;
		} else if (Class93.method21691(arg2, this.anInt218)) {
			arg0.aClass88_6 = this.aClass88_6;
		} else {
			arg0.aClass88_6 = null;
		}
		if (Class93.method21767(arg2, this.anInt218)) {
			if (arg1.aFloatArray19 == null || arg1.aFloatArray19.length < this.anInt223) {
				local169 = this.anInt222;
				arg0.aFloatArray19 = arg1.aFloatArray19 = new float[local169];
				arg0.aFloatArray20 = arg1.aFloatArray20 = new float[local169];
			} else {
				arg0.aFloatArray19 = arg1.aFloatArray19;
				arg0.aFloatArray20 = arg1.aFloatArray20;
			}
			for (local169 = 0; local169 < this.anInt222; local169++) {
				arg0.aFloatArray19[local169] = this.aFloatArray19[local169];
				arg0.aFloatArray20[local169] = this.aFloatArray20[local169];
			}
		} else {
			arg0.aFloatArray19 = this.aFloatArray19;
			arg0.aFloatArray20 = this.aFloatArray20;
		}
		if (Class93.method21723(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x8);
			}
			arg0.aClass88_7 = arg1.aClass88_7;
			arg0.aClass88_7.aByte106 = this.aClass88_7.aByte106;
			arg0.aClass88_7.anInterface5_6 = this.aClass88_7.anInterface5_6;
		} else if (Class93.method21693(arg2, this.anInt218)) {
			arg0.aClass88_7 = this.aClass88_7;
		} else {
			arg0.aClass88_7 = null;
		}
		if (Class93.method21687(arg2, this.anInt218)) {
			if (arg1.aShortArray9 == null || arg1.aShortArray9.length < this.anInt223) {
				local169 = this.anInt223;
				arg0.aShortArray9 = arg1.aShortArray9 = new short[local169];
				arg0.aShortArray5 = arg1.aShortArray5 = new short[local169];
				arg0.aShortArray8 = arg1.aShortArray8 = new short[local169];
			} else {
				arg0.aShortArray9 = arg1.aShortArray9;
				arg0.aShortArray5 = arg1.aShortArray5;
				arg0.aShortArray8 = arg1.aShortArray8;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aShortArray9[local169] = this.aShortArray9[local169];
				arg0.aShortArray5[local169] = this.aShortArray5[local169];
				arg0.aShortArray8[local169] = this.aShortArray8[local169];
			}
		} else {
			arg0.aShortArray9 = this.aShortArray9;
			arg0.aShortArray5 = this.aShortArray5;
			arg0.aShortArray8 = this.aShortArray8;
		}
		if (Class93.method21699(arg2, this.anInt218)) {
			if (arg3) {
				arg0.aByte1 = (byte) (arg0.aByte1 | 0x10);
			}
			arg0.aClass97_1 = arg1.aClass97_1;
			arg0.aClass97_1.anInterface7_5 = this.aClass97_1.anInterface7_5;
		} else if (Class93.method21694(arg2, this.anInt218)) {
			arg0.aClass97_1 = this.aClass97_1;
		} else {
			arg0.aClass97_1 = null;
		}
		if (Class93.method21717(arg2, this.anInt218)) {
			if (arg1.aShortArray7 == null || arg1.aShortArray7.length < this.anInt223) {
				local169 = this.anInt223;
				arg0.aShortArray7 = arg1.aShortArray7 = new short[local169];
			} else {
				arg0.aShortArray7 = arg1.aShortArray7;
			}
			for (local169 = 0; local169 < this.anInt223; local169++) {
				arg0.aShortArray7[local169] = this.aShortArray7[local169];
			}
		} else {
			arg0.aShortArray7 = this.aShortArray7;
		}
		if (!Class93.method21709(arg2, this.anInt218)) {
			arg0.aClass86Array1 = this.aClass86Array1;
		} else if (arg1.aClass86Array1 == null || arg1.aClass86Array1.length < this.anInt229) {
			local169 = this.anInt229;
			arg0.aClass86Array1 = arg1.aClass86Array1 = new Class86[local169];
			for (local482 = 0; local482 < this.anInt229; local482++) {
				arg0.aClass86Array1[local482] = this.aClass86Array1[local482].method21641();
			}
		} else {
			arg0.aClass86Array1 = arg1.aClass86Array1;
			for (local169 = 0; local169 < this.anInt229; local169++) {
				arg0.aClass86Array1[local169].method21642(this.aClass86Array1[local169]);
			}
		}
		arg0.aClass120Array1 = this.aClass120Array1;
		if (this.aBoolean51) {
			arg0.anInt225 = this.anInt225;
			arg0.anInt228 = this.anInt228;
			arg0.aShort5 = this.aShort5;
			arg0.aShort2 = this.aShort2;
			arg0.aShort4 = this.aShort4;
			arg0.aShort9 = this.aShort9;
			arg0.aShort6 = this.aShort6;
			arg0.aShort7 = this.aShort7;
			arg0.aBoolean51 = true;
		} else {
			arg0.aBoolean51 = false;
		}
		if (this.aBoolean50) {
			arg0.aShort8 = this.aShort8;
			arg0.aBoolean50 = true;
		} else {
			arg0.aBoolean50 = false;
		}
		arg0.anIntArrayArray3 = this.anIntArrayArray3;
		arg0.anIntArrayArray5 = this.anIntArrayArray5;
		arg0.anIntArrayArray4 = this.anIntArrayArray4;
		arg0.aShortArray11 = this.aShortArray11;
		arg0.anIntArray36 = this.anIntArray36;
		arg0.aShortArray10 = this.aShortArray10;
		arg0.aShortArray1 = this.aShortArray1;
		arg0.anIntArray33 = this.anIntArray33;
		arg0.aClass135Array1 = this.aClass135Array1;
		arg0.aClass109Array1 = this.aClass109Array1;
		return arg0;
	}

	@OriginalMember(owner = "client!abk", name = "gg", descriptor = "()V", line = 960)
	void method2295() {
		if (!this.aBoolean49) {
			return;
		}
		this.aBoolean49 = false;
		if (this.aClass135Array1 == null && this.aClass109Array1 == null && this.aClass120Array1 == null && !Class93.method21682(this.anInt227, this.anInt218)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray32 != null && !Class93.method21700(this.anInt227, this.anInt218)) {
				if (this.aClass88_5 != null && this.aClass88_5.anInterface5_6 == null) {
					this.aBoolean49 = true;
				} else {
					if (!this.aBoolean51) {
						this.method2282();
					}
					local23 = true;
				}
			}
			if (this.anIntArray31 != null && !Class93.method21701(this.anInt227, this.anInt218)) {
				if (this.aClass88_5 != null && this.aClass88_5.anInterface5_6 == null) {
					this.aBoolean49 = true;
				} else {
					if (!this.aBoolean51) {
						this.method2282();
					}
					local25 = true;
				}
			}
			if (this.anIntArray35 != null && !Class93.method21762(this.anInt227, this.anInt218)) {
				if (this.aClass88_5 != null && this.aClass88_5.anInterface5_6 == null) {
					this.aBoolean49 = true;
				} else {
					if (!this.aBoolean51) {
						this.method2282();
					}
					local27 = true;
				}
			}
			if (local23) {
				this.anIntArray32 = null;
			}
			if (local25) {
				this.anIntArray31 = null;
			}
			if (local27) {
				this.anIntArray35 = null;
			}
		}
		if (this.aShortArray11 != null && this.anIntArray32 == null && this.anIntArray31 == null && this.anIntArray35 == null) {
			this.aShortArray11 = null;
			this.anIntArray36 = null;
		}
		if (this.aByteArray4 != null && !Class93.method21681(this.anInt227, this.anInt218)) {
			if (this.aClass88_6 == null) {
				if (this.aClass88_8 != null && this.aClass88_8.anInterface5_6 == null) {
					this.aBoolean49 = true;
				} else {
					this.aShortArray3 = null;
					this.aShortArray6 = null;
					this.aShortArray2 = null;
					this.aByteArray4 = null;
				}
			} else if (this.aClass88_6.anInterface5_6 == null) {
				this.aBoolean49 = true;
			} else {
				this.aShortArray3 = null;
				this.aShortArray6 = null;
				this.aShortArray2 = null;
				this.aByteArray4 = null;
			}
		}
		if (this.aShortArray4 != null && !Class93.method21704(this.anInt227, this.anInt218)) {
			if (this.aClass88_8 != null && this.aClass88_8.anInterface5_6 == null) {
				this.aBoolean49 = true;
			} else {
				this.aShortArray4 = null;
			}
		}
		if (this.aByteArray5 != null && !Class93.method21688(this.anInt227, this.anInt218)) {
			if (this.aClass88_8 != null && this.aClass88_8.anInterface5_6 == null) {
				this.aBoolean49 = true;
			} else {
				this.aByteArray5 = null;
			}
		}
		if (this.aFloatArray19 != null && !Class93.method21706(this.anInt227, this.anInt218)) {
			if (this.aClass88_7 != null && this.aClass88_7.anInterface5_6 == null) {
				this.aBoolean49 = true;
			} else {
				this.aFloatArray20 = null;
				this.aFloatArray19 = null;
			}
		}
		if (this.aShortArray7 != null && !Class93.method21711(this.anInt227, this.anInt218)) {
			if (this.aClass88_8 != null && this.aClass88_8.anInterface5_6 == null) {
				this.aBoolean49 = true;
			} else {
				this.aShortArray7 = null;
			}
		}
		if (this.aShortArray9 != null && !Class93.method21710(this.anInt227, this.anInt218)) {
			if (this.aClass97_1 != null && this.aClass97_1.anInterface7_5 == null || this.aClass88_8 != null && this.aClass88_8.anInterface5_6 == null) {
				this.aBoolean49 = true;
			} else {
				this.aShortArray8 = null;
				this.aShortArray5 = null;
				this.aShortArray9 = null;
			}
		}
		if (this.anIntArrayArray5 != null && !Class93.method21707(this.anInt227, this.anInt218)) {
			this.anIntArrayArray5 = null;
			this.aShortArray1 = null;
		}
		if (this.anIntArrayArray3 != null && !Class93.method21761(this.anInt227, this.anInt218)) {
			this.anIntArrayArray3 = null;
			this.aShortArray10 = null;
		}
		if (this.anIntArrayArray4 != null && !Class93.method21734(this.anInt227, this.anInt218)) {
			this.anIntArrayArray4 = null;
		}
		if (this.anIntArray33 != null && (this.anInt227 & 0x800) == 0 && (this.anInt227 & 0x40000) == 0) {
			this.anIntArray33 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "hv", descriptor = "()V", line = 960)
	void method2304() {
		if (!this.aBoolean49) {
			return;
		}
		this.aBoolean49 = false;
		if (this.aClass135Array1 == null && this.aClass109Array1 == null && this.aClass120Array1 == null && !Class93.method21682(this.anInt227, this.anInt218)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray32 != null && !Class93.method21700(this.anInt227, this.anInt218)) {
				if (this.aClass88_5 != null && this.aClass88_5.anInterface5_6 == null) {
					this.aBoolean49 = true;
				} else {
					if (!this.aBoolean51) {
						this.method2282();
					}
					local23 = true;
				}
			}
			if (this.anIntArray31 != null && !Class93.method21701(this.anInt227, this.anInt218)) {
				if (this.aClass88_5 != null && this.aClass88_5.anInterface5_6 == null) {
					this.aBoolean49 = true;
				} else {
					if (!this.aBoolean51) {
						this.method2282();
					}
					local25 = true;
				}
			}
			if (this.anIntArray35 != null && !Class93.method21762(this.anInt227, this.anInt218)) {
				if (this.aClass88_5 != null && this.aClass88_5.anInterface5_6 == null) {
					this.aBoolean49 = true;
				} else {
					if (!this.aBoolean51) {
						this.method2282();
					}
					local27 = true;
				}
			}
			if (local23) {
				this.anIntArray32 = null;
			}
			if (local25) {
				this.anIntArray31 = null;
			}
			if (local27) {
				this.anIntArray35 = null;
			}
		}
		if (this.aShortArray11 != null && this.anIntArray32 == null && this.anIntArray31 == null && this.anIntArray35 == null) {
			this.aShortArray11 = null;
			this.anIntArray36 = null;
		}
		if (this.aByteArray4 != null && !Class93.method21681(this.anInt227, this.anInt218)) {
			if (this.aClass88_6 == null) {
				if (this.aClass88_8 != null && this.aClass88_8.anInterface5_6 == null) {
					this.aBoolean49 = true;
				} else {
					this.aShortArray3 = null;
					this.aShortArray6 = null;
					this.aShortArray2 = null;
					this.aByteArray4 = null;
				}
			} else if (this.aClass88_6.anInterface5_6 == null) {
				this.aBoolean49 = true;
			} else {
				this.aShortArray3 = null;
				this.aShortArray6 = null;
				this.aShortArray2 = null;
				this.aByteArray4 = null;
			}
		}
		if (this.aShortArray4 != null && !Class93.method21704(this.anInt227, this.anInt218)) {
			if (this.aClass88_8 != null && this.aClass88_8.anInterface5_6 == null) {
				this.aBoolean49 = true;
			} else {
				this.aShortArray4 = null;
			}
		}
		if (this.aByteArray5 != null && !Class93.method21688(this.anInt227, this.anInt218)) {
			if (this.aClass88_8 != null && this.aClass88_8.anInterface5_6 == null) {
				this.aBoolean49 = true;
			} else {
				this.aByteArray5 = null;
			}
		}
		if (this.aFloatArray19 != null && !Class93.method21706(this.anInt227, this.anInt218)) {
			if (this.aClass88_7 != null && this.aClass88_7.anInterface5_6 == null) {
				this.aBoolean49 = true;
			} else {
				this.aFloatArray20 = null;
				this.aFloatArray19 = null;
			}
		}
		if (this.aShortArray7 != null && !Class93.method21711(this.anInt227, this.anInt218)) {
			if (this.aClass88_8 != null && this.aClass88_8.anInterface5_6 == null) {
				this.aBoolean49 = true;
			} else {
				this.aShortArray7 = null;
			}
		}
		if (this.aShortArray9 != null && !Class93.method21710(this.anInt227, this.anInt218)) {
			if (this.aClass97_1 != null && this.aClass97_1.anInterface7_5 == null || this.aClass88_8 != null && this.aClass88_8.anInterface5_6 == null) {
				this.aBoolean49 = true;
			} else {
				this.aShortArray8 = null;
				this.aShortArray5 = null;
				this.aShortArray9 = null;
			}
		}
		if (this.anIntArrayArray5 != null && !Class93.method21707(this.anInt227, this.anInt218)) {
			this.anIntArrayArray5 = null;
			this.aShortArray1 = null;
		}
		if (this.anIntArrayArray3 != null && !Class93.method21761(this.anInt227, this.anInt218)) {
			this.anIntArrayArray3 = null;
			this.aShortArray10 = null;
		}
		if (this.anIntArrayArray4 != null && !Class93.method21734(this.anInt227, this.anInt218)) {
			this.anIntArrayArray4 = null;
		}
		if (this.anIntArray33 != null && (this.anInt227 & 0x800) == 0 && (this.anInt227 & 0x40000) == 0) {
			this.anIntArray33 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "c", descriptor = "(I)V", line = 1061)
	@Override
	public void method5329(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt221; local9++) {
			@Pc(29) int local29 = this.anIntArray35[local9] * local3 + this.anIntArray32[local9] * local7 >> 14;
			this.anIntArray35[local9] = this.anIntArray35[local9] * local7 - this.anIntArray32[local9] * local3 >> 14;
			this.anIntArray32[local9] = local29;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "bj", descriptor = "(I)V", line = 1061)
	@Override
	public void method5393(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt221; local9++) {
			@Pc(29) int local29 = this.anIntArray35[local9] * local3 + this.anIntArray32[local9] * local7 >> 14;
			this.anIntArray35[local9] = this.anIntArray35[local9] * local7 - this.anIntArray32[local9] * local3 >> 14;
			this.anIntArray32[local9] = local29;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "bq", descriptor = "(I)V", line = 1061)
	@Override
	public void method5370(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt221; local9++) {
			@Pc(29) int local29 = this.anIntArray35[local9] * local3 + this.anIntArray32[local9] * local7 >> 14;
			this.anIntArray35[local9] = this.anIntArray35[local9] * local7 - this.anIntArray32[local9] * local3 >> 14;
			this.anIntArray32[local9] = local29;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "z", descriptor = "(I)V", line = 1073)
	@Override
	public void method5330(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt221; local9++) {
			local29 = this.anIntArray35[local9] * local3 + this.anIntArray32[local9] * local7 >> 14;
			this.anIntArray35[local9] = this.anIntArray35[local9] * local7 - this.anIntArray32[local9] * local3 >> 14;
			this.anIntArray32[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt222; local9++) {
			local29 = this.aShortArray3[local9] * local3 + this.aShortArray2[local9] * local7 >> 14;
			this.aShortArray3[local9] = (short) (this.aShortArray3[local9] * local7 - this.aShortArray2[local9] * local3 >> 14);
			this.aShortArray2[local9] = (short) local29;
		}
		if (this.aClass88_6 == null && this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
		if (this.aClass88_6 != null) {
			this.aClass88_6.anInterface5_6 = null;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "bv", descriptor = "(I)V", line = 1073)
	@Override
	public void method5395(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt221; local9++) {
			local29 = this.anIntArray35[local9] * local3 + this.anIntArray32[local9] * local7 >> 14;
			this.anIntArray35[local9] = this.anIntArray35[local9] * local7 - this.anIntArray32[local9] * local3 >> 14;
			this.anIntArray32[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt222; local9++) {
			local29 = this.aShortArray3[local9] * local3 + this.aShortArray2[local9] * local7 >> 14;
			this.aShortArray3[local9] = (short) (this.aShortArray3[local9] * local7 - this.aShortArray2[local9] * local3 >> 14);
			this.aShortArray2[local9] = (short) local29;
		}
		if (this.aClass88_6 == null && this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
		if (this.aClass88_6 != null) {
			this.aClass88_6.anInterface5_6 = null;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "bz", descriptor = "(I)V", line = 1073)
	@Override
	public void method5454(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt221; local9++) {
			local29 = this.anIntArray35[local9] * local3 + this.anIntArray32[local9] * local7 >> 14;
			this.anIntArray35[local9] = this.anIntArray35[local9] * local7 - this.anIntArray32[local9] * local3 >> 14;
			this.anIntArray32[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt222; local9++) {
			local29 = this.aShortArray3[local9] * local3 + this.aShortArray2[local9] * local7 >> 14;
			this.aShortArray3[local9] = (short) (this.aShortArray3[local9] * local7 - this.aShortArray2[local9] * local3 >> 14);
			this.aShortArray2[local9] = (short) local29;
		}
		if (this.aClass88_6 == null && this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
		if (this.aClass88_6 != null) {
			this.aClass88_6.anInterface5_6 = null;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "ck", descriptor = "(I)V", line = 1073)
	@Override
	public void method5397(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt221; local9++) {
			local29 = this.anIntArray35[local9] * local3 + this.anIntArray32[local9] * local7 >> 14;
			this.anIntArray35[local9] = this.anIntArray35[local9] * local7 - this.anIntArray32[local9] * local3 >> 14;
			this.anIntArray32[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt222; local9++) {
			local29 = this.aShortArray3[local9] * local3 + this.aShortArray2[local9] * local7 >> 14;
			this.aShortArray3[local9] = (short) (this.aShortArray3[local9] * local7 - this.aShortArray2[local9] * local3 >> 14);
			this.aShortArray2[local9] = (short) local29;
		}
		if (this.aClass88_6 == null && this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
		if (this.aClass88_6 != null) {
			this.aClass88_6.anInterface5_6 = null;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "j", descriptor = "(I)V", line = 1092)
	@Override
	public void method5331(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt221; local9++) {
			@Pc(29) int local29 = this.anIntArray31[local9] * local7 - this.anIntArray35[local9] * local3 >> 14;
			this.anIntArray35[local9] = this.anIntArray31[local9] * local3 + this.anIntArray35[local9] * local7 >> 14;
			this.anIntArray31[local9] = local29;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "cm", descriptor = "(I)V", line = 1092)
	@Override
	public void method5467(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt221; local9++) {
			@Pc(29) int local29 = this.anIntArray31[local9] * local7 - this.anIntArray35[local9] * local3 >> 14;
			this.anIntArray35[local9] = this.anIntArray31[local9] * local3 + this.anIntArray35[local9] * local7 >> 14;
			this.anIntArray31[local9] = local29;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "cj", descriptor = "(I)V", line = 1092)
	@Override
	public void method5506(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt221; local9++) {
			@Pc(29) int local29 = this.anIntArray31[local9] * local7 - this.anIntArray35[local9] * local3 >> 14;
			this.anIntArray35[local9] = this.anIntArray31[local9] * local3 + this.anIntArray35[local9] * local7 >> 14;
			this.anIntArray31[local9] = local29;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "n", descriptor = "(I)V", line = 1104)
	@Override
	public void method5482(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt221; local9++) {
			@Pc(29) int local29 = this.anIntArray31[local9] * local3 + this.anIntArray32[local9] * local7 >> 14;
			this.anIntArray31[local9] = this.anIntArray31[local9] * local7 - this.anIntArray32[local9] * local3 >> 14;
			this.anIntArray32[local9] = local29;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "fb", descriptor = "(I)V", line = 1104)
	@Override
	public void method5484(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt221; local9++) {
			@Pc(29) int local29 = this.anIntArray31[local9] * local3 + this.anIntArray32[local9] * local7 >> 14;
			this.anIntArray31[local9] = this.anIntArray31[local9] * local7 - this.anIntArray32[local9] * local3 >> 14;
			this.anIntArray32[local9] = local29;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "e", descriptor = "(III)V", line = 1116)
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt221; local1++) {
			if (arg0 != 0) {
				this.anIntArray32[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray31[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray35[local1] += arg2;
			}
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "cu", descriptor = "(III)V", line = 1116)
	@Override
	public void method5396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt221; local1++) {
			if (arg0 != 0) {
				this.anIntArray32[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray31[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray35[local1] += arg2;
			}
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "cv", descriptor = "(III)V", line = 1116)
	@Override
	public void method5431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt221; local1++) {
			if (arg0 != 0) {
				this.anIntArray32[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray31[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray35[local1] += arg2;
			}
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "r", descriptor = "()V", line = 1126)
	@Override
	public void method5334() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt221; local1++) {
			this.anIntArray35[local1] = -this.anIntArray35[local1];
		}
		for (local1 = 0; local1 < this.anInt222; local1++) {
			this.aShortArray3[local1] = (short) -this.aShortArray3[local1];
		}
		for (local1 = 0; local1 < this.anInt223; local1++) {
			@Pc(45) short local45 = this.aShortArray9[local1];
			this.aShortArray9[local1] = this.aShortArray8[local1];
			this.aShortArray8[local1] = local45;
		}
		if (this.aClass88_6 == null && this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
		if (this.aClass88_6 != null) {
			this.aClass88_6.anInterface5_6 = null;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		if (this.aClass97_1 != null) {
			this.aClass97_1.anInterface7_5 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "cl", descriptor = "()V", line = 1126)
	@Override
	public void method5503() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt221; local1++) {
			this.anIntArray35[local1] = -this.anIntArray35[local1];
		}
		for (local1 = 0; local1 < this.anInt222; local1++) {
			this.aShortArray3[local1] = (short) -this.aShortArray3[local1];
		}
		for (local1 = 0; local1 < this.anInt223; local1++) {
			@Pc(45) short local45 = this.aShortArray9[local1];
			this.aShortArray9[local1] = this.aShortArray8[local1];
			this.aShortArray8[local1] = local45;
		}
		if (this.aClass88_6 == null && this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
		if (this.aClass88_6 != null) {
			this.aClass88_6.anInterface5_6 = null;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		if (this.aClass97_1 != null) {
			this.aClass97_1.anInterface7_5 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "cq", descriptor = "()V", line = 1126)
	@Override
	public void method5403() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt221; local1++) {
			this.anIntArray35[local1] = -this.anIntArray35[local1];
		}
		for (local1 = 0; local1 < this.anInt222; local1++) {
			this.aShortArray3[local1] = (short) -this.aShortArray3[local1];
		}
		for (local1 = 0; local1 < this.anInt223; local1++) {
			@Pc(45) short local45 = this.aShortArray9[local1];
			this.aShortArray9[local1] = this.aShortArray8[local1];
			this.aShortArray8[local1] = local45;
		}
		if (this.aClass88_6 == null && this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
		if (this.aClass88_6 != null) {
			this.aClass88_6.anInterface5_6 = null;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		if (this.aClass97_1 != null) {
			this.aClass97_1.anInterface7_5 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "d", descriptor = "(III)V", line = 1141)
	@Override
	public void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt221; local1++) {
			if (arg0 != 128) {
				this.anIntArray32[local1] = this.anIntArray32[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray31[local1] = this.anIntArray31[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray35[local1] = this.anIntArray35[local1] * arg2 >> 7;
			}
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "cp", descriptor = "(III)V", line = 1141)
	@Override
	public void method5405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt221; local1++) {
			if (arg0 != 128) {
				this.anIntArray32[local1] = this.anIntArray32[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray31[local1] = this.anIntArray31[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray35[local1] = this.anIntArray35[local1] * arg2 >> 7;
			}
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "cc", descriptor = "(III)V", line = 1141)
	@Override
	public void method5406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt221; local1++) {
			if (arg0 != 128) {
				this.anIntArray32[local1] = this.anIntArray32[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray31[local1] = this.anIntArray31[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray35[local1] = this.anIntArray35[local1] * arg2 >> 7;
			}
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "cg", descriptor = "(III)V", line = 1141)
	@Override
	public void method5404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt221; local1++) {
			if (arg0 != 128) {
				this.anIntArray32[local1] = this.anIntArray32[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray31[local1] = this.anIntArray31[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray35[local1] = this.anIntArray35[local1] * arg2 >> 7;
			}
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "ct", descriptor = "(IILclient!ci;Lclient!ci;III)V", line = 1151)
	@Override
	public void method5408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(9) int local9 = arg4 + this.aShort5;
		@Pc(14) int local14 = arg4 + this.aShort2;
		@Pc(19) int local19 = arg6 + this.aShort6;
		@Pc(24) int local24 = arg6 + this.aShort7;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt338 * 76934957 >> arg2.anInt336 * 1371852633 >= arg2.anInt339 * -1007974723 || local19 < 0 || local24 + arg2.anInt338 * 76934957 >> arg2.anInt336 * 1371852633 >= arg2.anInt337 * -207323189)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt338 * 76934957 >> arg3.anInt336 * 1371852633 >= arg3.anInt339 * -1007974723 || local19 < 0 || local24 + arg3.anInt338 * 76934957 >> arg3.anInt336 * 1371852633 >= arg3.anInt337 * -207323189) {
				return;
			}
		} else {
			local9 >>= arg2.anInt336 * 1371852633;
			local14 = local14 + (arg2.anInt338 * 76934957 - 1) >> arg2.anInt336 * 1371852633;
			local19 >>= arg2.anInt336 * 1371852633;
			local24 = local24 + (arg2.anInt338 * 76934957 - 1) >> arg2.anInt336 * 1371852633;
			if (arg2.method3548(local9, local19) == arg5 && arg2.method3548(local14, local19) == arg5 && arg2.method3548(local9, local24) == arg5 && arg2.method3548(local14, local24) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt221; local195++) {
				this.anIntArray31[local195] = this.anIntArray31[local195] + arg2.method3547(this.anIntArray32[local195] + arg4, this.anIntArray35[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(234) short local234 = this.aShort4;
				if (local234 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt221; local239++) {
					local252 = (this.anIntArray31[local239] << 16) / local234;
					if (local252 < arg1) {
						this.anIntArray31[local239] += (arg2.method3547(this.anIntArray32[local239] + arg4, this.anIntArray35[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 4;
					local239 = (arg1 >> 8 & 0xFF) * 4;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt338 * 76934957 >= arg2.anInt339 * -1007974723 << arg2.anInt336 * 1371852633 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt338 * 76934957 >= arg2.anInt337 * -207323189 << arg2.anInt336 * 1371852633) {
						return;
					}
					this.method5337(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.aShort9 - this.aShort4;
					for (local239 = 0; local239 < this.anInt221; local239++) {
						this.anIntArray31[local239] = this.anIntArray31[local239] + (arg3.method3547(this.anIntArray32[local239] + arg4, this.anIntArray35[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort9 - this.aShort4;
					for (local239 = 0; local239 < this.anInt221; local239++) {
						local252 = this.anIntArray32[local239] + arg4;
						local323 = this.anIntArray35[local239] + arg6;
						@Pc(468) int local468 = arg2.method3547(local252, local323);
						@Pc(474) int local474 = arg3.method3547(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray31[local239] = ((this.anIntArray31[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "q", descriptor = "(IILclient!ci;Lclient!ci;III)V", line = 1151)
	@Override
	public void method5336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(9) int local9 = arg4 + this.aShort5;
		@Pc(14) int local14 = arg4 + this.aShort2;
		@Pc(19) int local19 = arg6 + this.aShort6;
		@Pc(24) int local24 = arg6 + this.aShort7;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt338 * 76934957 >> arg2.anInt336 * 1371852633 >= arg2.anInt339 * -1007974723 || local19 < 0 || local24 + arg2.anInt338 * 76934957 >> arg2.anInt336 * 1371852633 >= arg2.anInt337 * -207323189)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt338 * 76934957 >> arg3.anInt336 * 1371852633 >= arg3.anInt339 * -1007974723 || local19 < 0 || local24 + arg3.anInt338 * 76934957 >> arg3.anInt336 * 1371852633 >= arg3.anInt337 * -207323189) {
				return;
			}
		} else {
			local9 >>= arg2.anInt336 * 1371852633;
			local14 = local14 + (arg2.anInt338 * 76934957 - 1) >> arg2.anInt336 * 1371852633;
			local19 >>= arg2.anInt336 * 1371852633;
			local24 = local24 + (arg2.anInt338 * 76934957 - 1) >> arg2.anInt336 * 1371852633;
			if (arg2.method3548(local9, local19) == arg5 && arg2.method3548(local14, local19) == arg5 && arg2.method3548(local9, local24) == arg5 && arg2.method3548(local14, local24) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt221; local195++) {
				this.anIntArray31[local195] = this.anIntArray31[local195] + arg2.method3547(this.anIntArray32[local195] + arg4, this.anIntArray35[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(234) short local234 = this.aShort4;
				if (local234 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt221; local239++) {
					local252 = (this.anIntArray31[local239] << 16) / local234;
					if (local252 < arg1) {
						this.anIntArray31[local239] += (arg2.method3547(this.anIntArray32[local239] + arg4, this.anIntArray35[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 4;
					local239 = (arg1 >> 8 & 0xFF) * 4;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt338 * 76934957 >= arg2.anInt339 * -1007974723 << arg2.anInt336 * 1371852633 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt338 * 76934957 >= arg2.anInt337 * -207323189 << arg2.anInt336 * 1371852633) {
						return;
					}
					this.method5337(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.aShort9 - this.aShort4;
					for (local239 = 0; local239 < this.anInt221; local239++) {
						this.anIntArray31[local239] = this.anIntArray31[local239] + (arg3.method3547(this.anIntArray32[local239] + arg4, this.anIntArray35[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort9 - this.aShort4;
					for (local239 = 0; local239 < this.anInt221; local239++) {
						local252 = this.anIntArray32[local239] + arg4;
						local323 = this.anIntArray35[local239] + arg6;
						@Pc(468) int local468 = arg2.method3547(local252, local323);
						@Pc(474) int local474 = arg3.method3547(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray31[local239] = ((this.anIntArray31[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "cs", descriptor = "(IILclient!ci;Lclient!ci;III)V", line = 1151)
	@Override
	public void method5407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(9) int local9 = arg4 + this.aShort5;
		@Pc(14) int local14 = arg4 + this.aShort2;
		@Pc(19) int local19 = arg6 + this.aShort6;
		@Pc(24) int local24 = arg6 + this.aShort7;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt338 * 76934957 >> arg2.anInt336 * 1371852633 >= arg2.anInt339 * -1007974723 || local19 < 0 || local24 + arg2.anInt338 * 76934957 >> arg2.anInt336 * 1371852633 >= arg2.anInt337 * -207323189)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt338 * 76934957 >> arg3.anInt336 * 1371852633 >= arg3.anInt339 * -1007974723 || local19 < 0 || local24 + arg3.anInt338 * 76934957 >> arg3.anInt336 * 1371852633 >= arg3.anInt337 * -207323189) {
				return;
			}
		} else {
			local9 >>= arg2.anInt336 * 1371852633;
			local14 = local14 + (arg2.anInt338 * 76934957 - 1) >> arg2.anInt336 * 1371852633;
			local19 >>= arg2.anInt336 * 1371852633;
			local24 = local24 + (arg2.anInt338 * 76934957 - 1) >> arg2.anInt336 * 1371852633;
			if (arg2.method3548(local9, local19) == arg5 && arg2.method3548(local14, local19) == arg5 && arg2.method3548(local9, local24) == arg5 && arg2.method3548(local14, local24) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt221; local195++) {
				this.anIntArray31[local195] = this.anIntArray31[local195] + arg2.method3547(this.anIntArray32[local195] + arg4, this.anIntArray35[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(234) short local234 = this.aShort4;
				if (local234 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt221; local239++) {
					local252 = (this.anIntArray31[local239] << 16) / local234;
					if (local252 < arg1) {
						this.anIntArray31[local239] += (arg2.method3547(this.anIntArray32[local239] + arg4, this.anIntArray35[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 4;
					local239 = (arg1 >> 8 & 0xFF) * 4;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt338 * 76934957 >= arg2.anInt339 * -1007974723 << arg2.anInt336 * 1371852633 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt338 * 76934957 >= arg2.anInt337 * -207323189 << arg2.anInt336 * 1371852633) {
						return;
					}
					this.method5337(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.aShort9 - this.aShort4;
					for (local239 = 0; local239 < this.anInt221; local239++) {
						this.anIntArray31[local239] = this.anIntArray31[local239] + (arg3.method3547(this.anIntArray32[local239] + arg4, this.anIntArray35[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort9 - this.aShort4;
					for (local239 = 0; local239 < this.anInt221; local239++) {
						local252 = this.anIntArray32[local239] + arg4;
						local323 = this.anIntArray35[local239] + arg6;
						@Pc(468) int local468 = arg2.method3547(local252, local323);
						@Pc(474) int local474 = arg3.method3547(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray31[local239] = ((this.anIntArray31[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "cx", descriptor = "(IILclient!ci;Lclient!ci;III)V", line = 1151)
	@Override
	public void method5409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(9) int local9 = arg4 + this.aShort5;
		@Pc(14) int local14 = arg4 + this.aShort2;
		@Pc(19) int local19 = arg6 + this.aShort6;
		@Pc(24) int local24 = arg6 + this.aShort7;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt338 * 76934957 >> arg2.anInt336 * 1371852633 >= arg2.anInt339 * -1007974723 || local19 < 0 || local24 + arg2.anInt338 * 76934957 >> arg2.anInt336 * 1371852633 >= arg2.anInt337 * -207323189)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt338 * 76934957 >> arg3.anInt336 * 1371852633 >= arg3.anInt339 * -1007974723 || local19 < 0 || local24 + arg3.anInt338 * 76934957 >> arg3.anInt336 * 1371852633 >= arg3.anInt337 * -207323189) {
				return;
			}
		} else {
			local9 >>= arg2.anInt336 * 1371852633;
			local14 = local14 + (arg2.anInt338 * 76934957 - 1) >> arg2.anInt336 * 1371852633;
			local19 >>= arg2.anInt336 * 1371852633;
			local24 = local24 + (arg2.anInt338 * 76934957 - 1) >> arg2.anInt336 * 1371852633;
			if (arg2.method3548(local9, local19) == arg5 && arg2.method3548(local14, local19) == arg5 && arg2.method3548(local9, local24) == arg5 && arg2.method3548(local14, local24) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt221; local195++) {
				this.anIntArray31[local195] = this.anIntArray31[local195] + arg2.method3547(this.anIntArray32[local195] + arg4, this.anIntArray35[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(234) short local234 = this.aShort4;
				if (local234 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt221; local239++) {
					local252 = (this.anIntArray31[local239] << 16) / local234;
					if (local252 < arg1) {
						this.anIntArray31[local239] += (arg2.method3547(this.anIntArray32[local239] + arg4, this.anIntArray35[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 4;
					local239 = (arg1 >> 8 & 0xFF) * 4;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt338 * 76934957 >= arg2.anInt339 * -1007974723 << arg2.anInt336 * 1371852633 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt338 * 76934957 >= arg2.anInt337 * -207323189 << arg2.anInt336 * 1371852633) {
						return;
					}
					this.method5337(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.aShort9 - this.aShort4;
					for (local239 = 0; local239 < this.anInt221; local239++) {
						this.anIntArray31[local239] = this.anIntArray31[local239] + (arg3.method3547(this.anIntArray32[local239] + arg4, this.anIntArray35[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort9 - this.aShort4;
					for (local239 = 0; local239 < this.anInt221; local239++) {
						local252 = this.anIntArray32[local239] + arg4;
						local323 = this.anIntArray35[local239] + arg6;
						@Pc(468) int local468 = arg2.method3547(local252, local323);
						@Pc(474) int local474 = arg3.method3547(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray31[local239] = ((this.anIntArray31[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "hi", descriptor = "()V", line = 1215)
	void method2282() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt221; local17++) {
			@Pc(26) int local26 = this.anIntArray32[local17];
			@Pc(31) int local31 = this.anIntArray31[local17];
			@Pc(36) int local36 = this.anIntArray35[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			local74 = local26 * local26 + local36 * local36 + local31 * local31;
			if (local74 > local15) {
				local15 = local74;
			}
		}
		this.aShort5 = (short) local1;
		this.aShort2 = (short) local7;
		this.aShort4 = (short) local3;
		this.aShort9 = (short) local9;
		this.aShort6 = (short) local5;
		this.aShort7 = (short) local11;
		this.anInt228 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt225 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean51 = true;
	}

	@OriginalMember(owner = "client!abk", name = "ht", descriptor = "()V", line = 1215)
	void method2305() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt221; local17++) {
			@Pc(26) int local26 = this.anIntArray32[local17];
			@Pc(31) int local31 = this.anIntArray31[local17];
			@Pc(36) int local36 = this.anIntArray35[local17];
			if (local26 < local1) {
				local1 = local26;
			}
			if (local26 > local7) {
				local7 = local26;
			}
			if (local31 < local3) {
				local3 = local31;
			}
			if (local31 > local9) {
				local9 = local31;
			}
			if (local36 < local5) {
				local5 = local36;
			}
			if (local36 > local11) {
				local11 = local36;
			}
			@Pc(74) int local74 = local26 * local26 + local36 * local36;
			if (local74 > local13) {
				local13 = local74;
			}
			local74 = local26 * local26 + local36 * local36 + local31 * local31;
			if (local74 > local15) {
				local15 = local74;
			}
		}
		this.aShort5 = (short) local1;
		this.aShort2 = (short) local7;
		this.aShort4 = (short) local3;
		this.aShort9 = (short) local9;
		this.aShort6 = (short) local5;
		this.aShort7 = (short) local11;
		this.anInt228 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt225 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean51 = true;
	}

	@OriginalMember(owner = "client!abk", name = "dj", descriptor = "()V", line = 1250)
	@Override
	public void method5441() {
		if (this.aBoolean50) {
			return;
		}
		if (!this.aBoolean51) {
			this.method2282();
		}
		this.aShort8 = this.aShort4;
		this.aBoolean50 = true;
	}

	@OriginalMember(owner = "client!abk", name = "dx", descriptor = "()V", line = 1250)
	@Override
	public void method5442() {
		if (this.aBoolean50) {
			return;
		}
		if (!this.aBoolean51) {
			this.method2282();
		}
		this.aShort8 = this.aShort4;
		this.aBoolean50 = true;
	}

	@OriginalMember(owner = "client!abk", name = "dw", descriptor = "()V", line = 1250)
	@Override
	public void method5444() {
		if (this.aBoolean50) {
			return;
		}
		if (!this.aBoolean51) {
			this.method2282();
		}
		this.aShort8 = this.aShort4;
		this.aBoolean50 = true;
	}

	@OriginalMember(owner = "client!abk", name = "dm", descriptor = "()V", line = 1250)
	@Override
	public void method5443() {
		if (this.aBoolean50) {
			return;
		}
		if (!this.aBoolean51) {
			this.method2282();
		}
		this.aShort8 = this.aShort4;
		this.aBoolean50 = true;
	}

	@OriginalMember(owner = "client!abk", name = "ag", descriptor = "()V", line = 1250)
	@Override
	public void method5359() {
		if (this.aBoolean50) {
			return;
		}
		if (!this.aBoolean51) {
			this.method2282();
		}
		this.aShort8 = this.aShort4;
		this.aBoolean50 = true;
	}

	@OriginalMember(owner = "client!abk", name = "av", descriptor = "()I", line = 1258)
	@Override
	public int method5355() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.anInt228;
	}

	@OriginalMember(owner = "client!abk", name = "du", descriptor = "()I", line = 1258)
	@Override
	public int method5478() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.anInt228;
	}

	@OriginalMember(owner = "client!abk", name = "ax", descriptor = "()I", line = 1263)
	@Override
	public int method5356() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.anInt225;
	}

	@OriginalMember(owner = "client!abk", name = "do", descriptor = "()I", line = 1263)
	@Override
	public int method5446() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.anInt225;
	}

	@OriginalMember(owner = "client!abk", name = "di", descriptor = "()I", line = 1263)
	@Override
	public int method5447() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.anInt225;
	}

	@OriginalMember(owner = "client!abk", name = "az", descriptor = "()I", line = 1268)
	@Override
	public int method5363() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!abk", name = "ee", descriptor = "()I", line = 1268)
	@Override
	public int method5449() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!abk", name = "dn", descriptor = "()I", line = 1268)
	@Override
	public int method5448() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!abk", name = "al", descriptor = "()I", line = 1273)
	@Override
	public int method5358() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort2;
	}

	@OriginalMember(owner = "client!abk", name = "ex", descriptor = "()I", line = 1273)
	@Override
	public int method5319() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort2;
	}

	@OriginalMember(owner = "client!abk", name = "ef", descriptor = "()I", line = 1273)
	@Override
	public int method5341() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort2;
	}

	@OriginalMember(owner = "client!abk", name = "eb", descriptor = "()I", line = 1273)
	@Override
	public int method5458() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort2;
	}

	@OriginalMember(owner = "client!abk", name = "ey", descriptor = "()I", line = 1273)
	@Override
	public int method5468() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort2;
	}

	@OriginalMember(owner = "client!abk", name = "ao", descriptor = "()I", line = 1278)
	@Override
	public int method5466() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort4;
	}

	@OriginalMember(owner = "client!abk", name = "er", descriptor = "()I", line = 1278)
	@Override
	public int method5462() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort4;
	}

	@OriginalMember(owner = "client!abk", name = "ej", descriptor = "()I", line = 1278)
	@Override
	public int method5367() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort4;
	}

	@OriginalMember(owner = "client!abk", name = "en", descriptor = "()I", line = 1278)
	@Override
	public int method5456() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort4;
	}

	@OriginalMember(owner = "client!abk", name = "ap", descriptor = "()I", line = 1283)
	@Override
	public int method5486() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!abk", name = "em", descriptor = "()I", line = 1283)
	@Override
	public int method5498() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!abk", name = "ew", descriptor = "()I", line = 1283)
	@Override
	public int method5483() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!abk", name = "ab", descriptor = "()I", line = 1288)
	@Override
	public int method5450() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!abk", name = "ec", descriptor = "()I", line = 1288)
	@Override
	public int method5459() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!abk", name = "ea", descriptor = "()I", line = 1288)
	@Override
	public int method5377() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!abk", name = "au", descriptor = "()I", line = 1293)
	@Override
	public int method5362() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!abk", name = "ez", descriptor = "()I", line = 1293)
	@Override
	public int method5394() {
		if (!this.aBoolean51) {
			this.method2282();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!abk", name = "ay", descriptor = "()I", line = 1298)
	@Override
	public int method5519() {
		if (!this.aBoolean50) {
			this.method5359();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!abk", name = "ep", descriptor = "()I", line = 1298)
	@Override
	public int method5353() {
		if (!this.aBoolean50) {
			this.method5359();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!abk", name = "br", descriptor = "(Lclient!dh;IIIZ)V", line = 1303)
	@Override
	public void method5380(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class20_Sub1 local2 = (Class20_Sub1) arg0;
		if (this.anInt223 == 0 || local2.anInt223 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt221;
		@Pc(15) int[] local15 = local2.anIntArray32;
		@Pc(18) int[] local18 = local2.anIntArray31;
		@Pc(21) int[] local21 = local2.anIntArray35;
		@Pc(24) short[] local24 = local2.aShortArray2;
		@Pc(27) short[] local27 = local2.aShortArray6;
		@Pc(30) short[] local30 = local2.aShortArray3;
		@Pc(33) byte[] local33 = local2.aByteArray4;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass119_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass119_1.aShortArray75;
			local44 = this.aClass119_1.aShortArray73;
			local48 = this.aClass119_1.aShortArray74;
			local52 = this.aClass119_1.aByteArray58;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass119_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass119_1.aShortArray75;
			local72 = local2.aClass119_1.aShortArray73;
			local76 = local2.aClass119_1.aShortArray74;
			local80 = local2.aClass119_1.aByteArray58;
		}
		@Pc(92) int[] local92 = local2.anIntArray36;
		@Pc(95) short[] local95 = local2.aShortArray11;
		if (!local2.aBoolean51) {
			local2.method2282();
		}
		@Pc(103) short local103 = local2.aShort4;
		@Pc(106) short local106 = local2.aShort9;
		@Pc(109) short local109 = local2.aShort5;
		@Pc(112) short local112 = local2.aShort2;
		@Pc(115) short local115 = local2.aShort6;
		@Pc(118) short local118 = local2.aShort7;
		for (@Pc(120) int local120 = 0; local120 < this.anInt221; local120++) {
			@Pc(131) int local131 = this.anIntArray31[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray32[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray35[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray36[local120];
						@Pc(180) int local180 = this.anIntArray36[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray11[local182] != 0; local182++) {
							local168 = (this.aShortArray11[local182] & 0xFFFF) - 1;
							if (this.aByteArray4[local168] != 0) {
								break;
							}
						}
						if (local168 != -1) {
							for (local182 = 0; local182 < local12; local182++) {
								if (local145 == local15[local182] && local159 == local21[local182] && local131 == local18[local182]) {
									@Pc(234) int local234 = -1;
									local173 = local92[local182];
									local180 = local92[local182 + 1];
									for (@Pc(246) int local246 = local173; local246 < local180 && local95[local246] != 0; local246++) {
										local234 = (local95[local246] & 0xFFFF) - 1;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass119_1 = new Class119();
											local40 = this.aClass119_1.aShortArray75 = Class140.method23022(this.aShortArray2);
											local44 = this.aClass119_1.aShortArray73 = Class140.method23022(this.aShortArray6);
											local48 = this.aClass119_1.aShortArray74 = Class140.method23022(this.aShortArray3);
											local52 = this.aClass119_1.aByteArray58 = Class185.method23912(this.aByteArray4);
										}
										if (local68 == null) {
											@Pc(325) Class119 local325 = local2.aClass119_1 = new Class119();
											local68 = local325.aShortArray75 = Class140.method23022(local24);
											local72 = local325.aShortArray73 = Class140.method23022(local27);
											local76 = local325.aShortArray74 = Class140.method23022(local30);
											local80 = local325.aByteArray58 = Class185.method23912(local33);
										}
										@Pc(358) short local358 = this.aShortArray2[local168];
										@Pc(363) short local363 = this.aShortArray6[local168];
										@Pc(368) short local368 = this.aShortArray3[local168];
										@Pc(373) byte local373 = this.aByteArray4[local168];
										local173 = local92[local182];
										local180 = local92[local182 + 1];
										@Pc(385) int local385;
										@Pc(394) int local394;
										for (local385 = local173; local385 < local180; local385++) {
											local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										local358 = local24[local234];
										local363 = local27[local234];
										local368 = local30[local234];
										local373 = local33[local234];
										local173 = this.anIntArray36[local120];
										local180 = this.anIntArray36[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray11[local385] != 0; local385++) {
											local394 = (this.aShortArray11[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										if (this.aClass88_6 == null && this.aClass88_8 != null) {
											this.aClass88_8.anInterface5_6 = null;
										}
										if (this.aClass88_6 != null) {
											this.aClass88_6.anInterface5_6 = null;
										}
										if (local2.aClass88_6 == null && local2.aClass88_8 != null) {
											local2.aClass88_8.anInterface5_6 = null;
										}
										if (local2.aClass88_6 != null) {
											local2.aClass88_6.anInterface5_6 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "by", descriptor = "(Lclient!dh;IIIZ)V", line = 1303)
	@Override
	public void method5452(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class20_Sub1 local2 = (Class20_Sub1) arg0;
		if (this.anInt223 == 0 || local2.anInt223 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt221;
		@Pc(15) int[] local15 = local2.anIntArray32;
		@Pc(18) int[] local18 = local2.anIntArray31;
		@Pc(21) int[] local21 = local2.anIntArray35;
		@Pc(24) short[] local24 = local2.aShortArray2;
		@Pc(27) short[] local27 = local2.aShortArray6;
		@Pc(30) short[] local30 = local2.aShortArray3;
		@Pc(33) byte[] local33 = local2.aByteArray4;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass119_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass119_1.aShortArray75;
			local44 = this.aClass119_1.aShortArray73;
			local48 = this.aClass119_1.aShortArray74;
			local52 = this.aClass119_1.aByteArray58;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass119_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass119_1.aShortArray75;
			local72 = local2.aClass119_1.aShortArray73;
			local76 = local2.aClass119_1.aShortArray74;
			local80 = local2.aClass119_1.aByteArray58;
		}
		@Pc(92) int[] local92 = local2.anIntArray36;
		@Pc(95) short[] local95 = local2.aShortArray11;
		if (!local2.aBoolean51) {
			local2.method2282();
		}
		@Pc(103) short local103 = local2.aShort4;
		@Pc(106) short local106 = local2.aShort9;
		@Pc(109) short local109 = local2.aShort5;
		@Pc(112) short local112 = local2.aShort2;
		@Pc(115) short local115 = local2.aShort6;
		@Pc(118) short local118 = local2.aShort7;
		for (@Pc(120) int local120 = 0; local120 < this.anInt221; local120++) {
			@Pc(131) int local131 = this.anIntArray31[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray32[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray35[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray36[local120];
						@Pc(180) int local180 = this.anIntArray36[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray11[local182] != 0; local182++) {
							local168 = (this.aShortArray11[local182] & 0xFFFF) - 1;
							if (this.aByteArray4[local168] != 0) {
								break;
							}
						}
						if (local168 != -1) {
							for (local182 = 0; local182 < local12; local182++) {
								if (local145 == local15[local182] && local159 == local21[local182] && local131 == local18[local182]) {
									@Pc(234) int local234 = -1;
									local173 = local92[local182];
									local180 = local92[local182 + 1];
									for (@Pc(246) int local246 = local173; local246 < local180 && local95[local246] != 0; local246++) {
										local234 = (local95[local246] & 0xFFFF) - 1;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass119_1 = new Class119();
											local40 = this.aClass119_1.aShortArray75 = Class140.method23022(this.aShortArray2);
											local44 = this.aClass119_1.aShortArray73 = Class140.method23022(this.aShortArray6);
											local48 = this.aClass119_1.aShortArray74 = Class140.method23022(this.aShortArray3);
											local52 = this.aClass119_1.aByteArray58 = Class185.method23912(this.aByteArray4);
										}
										if (local68 == null) {
											@Pc(325) Class119 local325 = local2.aClass119_1 = new Class119();
											local68 = local325.aShortArray75 = Class140.method23022(local24);
											local72 = local325.aShortArray73 = Class140.method23022(local27);
											local76 = local325.aShortArray74 = Class140.method23022(local30);
											local80 = local325.aByteArray58 = Class185.method23912(local33);
										}
										@Pc(358) short local358 = this.aShortArray2[local168];
										@Pc(363) short local363 = this.aShortArray6[local168];
										@Pc(368) short local368 = this.aShortArray3[local168];
										@Pc(373) byte local373 = this.aByteArray4[local168];
										local173 = local92[local182];
										local180 = local92[local182 + 1];
										@Pc(385) int local385;
										@Pc(394) int local394;
										for (local385 = local173; local385 < local180; local385++) {
											local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										local358 = local24[local234];
										local363 = local27[local234];
										local368 = local30[local234];
										local373 = local33[local234];
										local173 = this.anIntArray36[local120];
										local180 = this.anIntArray36[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray11[local385] != 0; local385++) {
											local394 = (this.aShortArray11[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										if (this.aClass88_6 == null && this.aClass88_8 != null) {
											this.aClass88_8.anInterface5_6 = null;
										}
										if (this.aClass88_6 != null) {
											this.aClass88_6.anInterface5_6 = null;
										}
										if (local2.aClass88_6 == null && local2.aClass88_8 != null) {
											local2.aClass88_8.anInterface5_6 = null;
										}
										if (local2.aClass88_6 != null) {
											local2.aClass88_6.anInterface5_6 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "bb", descriptor = "(Lclient!dh;IIIZ)V", line = 1303)
	@Override
	public void method5381(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class20_Sub1 local2 = (Class20_Sub1) arg0;
		if (this.anInt223 == 0 || local2.anInt223 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt221;
		@Pc(15) int[] local15 = local2.anIntArray32;
		@Pc(18) int[] local18 = local2.anIntArray31;
		@Pc(21) int[] local21 = local2.anIntArray35;
		@Pc(24) short[] local24 = local2.aShortArray2;
		@Pc(27) short[] local27 = local2.aShortArray6;
		@Pc(30) short[] local30 = local2.aShortArray3;
		@Pc(33) byte[] local33 = local2.aByteArray4;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass119_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass119_1.aShortArray75;
			local44 = this.aClass119_1.aShortArray73;
			local48 = this.aClass119_1.aShortArray74;
			local52 = this.aClass119_1.aByteArray58;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass119_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass119_1.aShortArray75;
			local72 = local2.aClass119_1.aShortArray73;
			local76 = local2.aClass119_1.aShortArray74;
			local80 = local2.aClass119_1.aByteArray58;
		}
		@Pc(92) int[] local92 = local2.anIntArray36;
		@Pc(95) short[] local95 = local2.aShortArray11;
		if (!local2.aBoolean51) {
			local2.method2282();
		}
		@Pc(103) short local103 = local2.aShort4;
		@Pc(106) short local106 = local2.aShort9;
		@Pc(109) short local109 = local2.aShort5;
		@Pc(112) short local112 = local2.aShort2;
		@Pc(115) short local115 = local2.aShort6;
		@Pc(118) short local118 = local2.aShort7;
		for (@Pc(120) int local120 = 0; local120 < this.anInt221; local120++) {
			@Pc(131) int local131 = this.anIntArray31[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray32[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray35[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray36[local120];
						@Pc(180) int local180 = this.anIntArray36[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray11[local182] != 0; local182++) {
							local168 = (this.aShortArray11[local182] & 0xFFFF) - 1;
							if (this.aByteArray4[local168] != 0) {
								break;
							}
						}
						if (local168 != -1) {
							for (local182 = 0; local182 < local12; local182++) {
								if (local145 == local15[local182] && local159 == local21[local182] && local131 == local18[local182]) {
									@Pc(234) int local234 = -1;
									local173 = local92[local182];
									local180 = local92[local182 + 1];
									for (@Pc(246) int local246 = local173; local246 < local180 && local95[local246] != 0; local246++) {
										local234 = (local95[local246] & 0xFFFF) - 1;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass119_1 = new Class119();
											local40 = this.aClass119_1.aShortArray75 = Class140.method23022(this.aShortArray2);
											local44 = this.aClass119_1.aShortArray73 = Class140.method23022(this.aShortArray6);
											local48 = this.aClass119_1.aShortArray74 = Class140.method23022(this.aShortArray3);
											local52 = this.aClass119_1.aByteArray58 = Class185.method23912(this.aByteArray4);
										}
										if (local68 == null) {
											@Pc(325) Class119 local325 = local2.aClass119_1 = new Class119();
											local68 = local325.aShortArray75 = Class140.method23022(local24);
											local72 = local325.aShortArray73 = Class140.method23022(local27);
											local76 = local325.aShortArray74 = Class140.method23022(local30);
											local80 = local325.aByteArray58 = Class185.method23912(local33);
										}
										@Pc(358) short local358 = this.aShortArray2[local168];
										@Pc(363) short local363 = this.aShortArray6[local168];
										@Pc(368) short local368 = this.aShortArray3[local168];
										@Pc(373) byte local373 = this.aByteArray4[local168];
										local173 = local92[local182];
										local180 = local92[local182 + 1];
										@Pc(385) int local385;
										@Pc(394) int local394;
										for (local385 = local173; local385 < local180; local385++) {
											local394 = local95[local385] - 1;
											if (local394 == -1) {
												break;
											}
											if (local80[local394] != 0) {
												local68[local394] += local358;
												local72[local394] += local363;
												local76[local394] += local368;
												local80[local394] += local373;
											}
										}
										local358 = local24[local234];
										local363 = local27[local234];
										local368 = local30[local234];
										local373 = local33[local234];
										local173 = this.anIntArray36[local120];
										local180 = this.anIntArray36[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray11[local385] != 0; local385++) {
											local394 = (this.aShortArray11[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										if (this.aClass88_6 == null && this.aClass88_8 != null) {
											this.aClass88_8.anInterface5_6 = null;
										}
										if (this.aClass88_6 != null) {
											this.aClass88_6.anInterface5_6 = null;
										}
										if (local2.aClass88_6 == null && local2.aClass88_8 != null) {
											local2.aClass88_8.anInterface5_6 = null;
										}
										if (local2.aClass88_6 != null) {
											local2.aClass88_6.anInterface5_6 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "am", descriptor = "(I)V", line = 1437)
	@Override
	public void method5365(@OriginalArg(0) int arg0) {
		this.aShort1 = (short) arg0;
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "ed", descriptor = "(I)V", line = 1437)
	@Override
	public void method5369(@OriginalArg(0) int arg0) {
		this.aShort1 = (short) arg0;
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "ar", descriptor = "(I)V", line = 1442)
	@Override
	public void method5489(@OriginalArg(0) int arg0) {
		this.aShort3 = (short) arg0;
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
		if (this.aClass88_6 != null) {
			this.aClass88_6.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "eq", descriptor = "(I)V", line = 1442)
	@Override
	public void method5464(@OriginalArg(0) int arg0) {
		this.aShort3 = (short) arg0;
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
		if (this.aClass88_6 != null) {
			this.aClass88_6.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "ae", descriptor = "()I", line = 1448)
	@Override
	public int method5332() {
		return this.aShort1;
	}

	@OriginalMember(owner = "client!abk", name = "ev", descriptor = "()I", line = 1448)
	@Override
	public int method5465() {
		return this.aShort1;
	}

	@OriginalMember(owner = "client!abk", name = "eo", descriptor = "()I", line = 1448)
	@Override
	public int method5344() {
		return this.aShort1;
	}

	@OriginalMember(owner = "client!abk", name = "et", descriptor = "()I", line = 1448)
	@Override
	public int method5402() {
		return this.aShort1;
	}

	@OriginalMember(owner = "client!abk", name = "ad", descriptor = "()I", line = 1452)
	@Override
	public int method5398() {
		return this.aShort3;
	}

	@OriginalMember(owner = "client!abk", name = "ek", descriptor = "()I", line = 1452)
	@Override
	public int method5400() {
		return this.aShort3;
	}

	@OriginalMember(owner = "client!abk", name = "ei", descriptor = "()I", line = 1452)
	@Override
	public int method5469() {
		return this.aShort3;
	}

	@OriginalMember(owner = "client!abk", name = "aw", descriptor = "()[B", line = 1456)
	@Override
	public byte[] method5354() {
		return this.aByteArray5;
	}

	@OriginalMember(owner = "client!abk", name = "el", descriptor = "()[B", line = 1456)
	@Override
	public byte[] method5470() {
		return this.aByteArray5;
	}

	@OriginalMember(owner = "client!abk", name = "eu", descriptor = "()[B", line = 1456)
	@Override
	public byte[] method5471() {
		return this.aByteArray5;
	}

	@OriginalMember(owner = "client!abk", name = "ac", descriptor = "(SS)V", line = 1460)
	@Override
	public void method5415(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt223; local1++) {
			if (this.aShortArray4[local1] == arg0) {
				this.aShortArray4[local1] = arg1;
			}
		}
		if (this.aClass120Array1 != null) {
			for (local1 = 0; local1 < this.anInt229; local1++) {
				@Pc(32) Class120 local32 = this.aClass120Array1[local1];
				@Pc(37) Class86 local37 = this.aClass86Array1[local1];
				local37.anInt2930 = local37.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local32.anInt3208] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "eg", descriptor = "(SS)V", line = 1460)
	@Override
	public void method5472(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt223; local1++) {
			if (this.aShortArray4[local1] == arg0) {
				this.aShortArray4[local1] = arg1;
			}
		}
		if (this.aClass120Array1 != null) {
			for (local1 = 0; local1 < this.anInt229; local1++) {
				@Pc(32) Class120 local32 = this.aClass120Array1[local1];
				@Pc(37) Class86 local37 = this.aClass86Array1[local1];
				local37.anInt2930 = local37.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local32.anInt3208] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "es", descriptor = "(SS)V", line = 1460)
	@Override
	public void method5473(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt223; local1++) {
			if (this.aShortArray4[local1] == arg0) {
				this.aShortArray4[local1] = arg1;
			}
		}
		if (this.aClass120Array1 != null) {
			for (local1 = 0; local1 < this.anInt229; local1++) {
				@Pc(32) Class120 local32 = this.aClass120Array1[local1];
				@Pc(37) Class86 local37 = this.aClass86Array1[local1];
				local37.anInt2930 = local37.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local32.anInt3208] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "bw", descriptor = "(B[B)V", line = 1474)
	@Override
	public void method5371(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt223; local3++) {
				this.aByteArray5[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt223; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray5[local3] = (byte) local39;
			}
		}
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "eh", descriptor = "(B[B)V", line = 1474)
	@Override
	public void method5325(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt223; local3++) {
				this.aByteArray5[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt223; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray5[local3] = (byte) local39;
			}
		}
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "ft", descriptor = "(B[B)V", line = 1474)
	@Override
	public void method5475(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt223; local3++) {
				this.aByteArray5[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt223; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray5[local3] = (byte) local39;
			}
		}
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "fp", descriptor = "(SS)V", line = 1489)
	@Override
	public void method5476(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class134 local3 = this.aClass21_Sub2_25.aClass134_7;
		for (@Pc(5) int local5 = 0; local5 < this.anInt223; local5++) {
			if (this.aShortArray7[local5] == arg0) {
				this.aShortArray7[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class133 local36 = local3.method22906(arg0 & 0xFFFF);
			local24 = local36.aByte120;
			local26 = local36.aByte121;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class133 local56 = local3.method22906(arg1 & 0xFFFF);
			local44 = local56.aByte120;
			local46 = local56.aByte121;
			if (local56.aByte113 != 0 || local56.aByte117 != 0) {
				this.aBoolean47 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass120Array1 != null) {
			for (@Pc(90) int local90 = 0; local90 < this.anInt229; local90++) {
				@Pc(99) Class120 local99 = this.aClass120Array1[local90];
				@Pc(104) Class86 local104 = this.aClass86Array1[local90];
				local104.anInt2930 = local104.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local99.anInt3208] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "bp", descriptor = "(SS)V", line = 1489)
	@Override
	public void method5372(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class134 local3 = this.aClass21_Sub2_25.aClass134_7;
		for (@Pc(5) int local5 = 0; local5 < this.anInt223; local5++) {
			if (this.aShortArray7[local5] == arg0) {
				this.aShortArray7[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class133 local36 = local3.method22906(arg0 & 0xFFFF);
			local24 = local36.aByte120;
			local26 = local36.aByte121;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class133 local56 = local3.method22906(arg1 & 0xFFFF);
			local44 = local56.aByte120;
			local46 = local56.aByte121;
			if (local56.aByte113 != 0 || local56.aByte117 != 0) {
				this.aBoolean47 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass120Array1 != null) {
			for (@Pc(90) int local90 = 0; local90 < this.anInt229; local90++) {
				@Pc(99) Class120 local99 = this.aClass120Array1[local90];
				@Pc(104) Class86 local104 = this.aClass86Array1[local90];
				local104.anInt2930 = local104.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local99.anInt3208] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "bd", descriptor = "(IIII)V", line = 1521)
	@Override
	public void method5373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt223; local1++) {
			@Pc(12) int local12 = this.aShortArray4[local1] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 += (arg2 - local28) * arg3 >> 7;
			}
			this.aShortArray4[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass120Array1 != null) {
			for (local1 = 0; local1 < this.anInt229; local1++) {
				@Pc(97) Class120 local97 = this.aClass120Array1[local1];
				@Pc(102) Class86 local102 = this.aClass86Array1[local1];
				local102.anInt2930 = local102.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local97.anInt3208] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "fd", descriptor = "(IIII)V", line = 1521)
	@Override
	public void method5485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt223; local1++) {
			@Pc(12) int local12 = this.aShortArray4[local1] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 += (arg2 - local28) * arg3 >> 7;
			}
			this.aShortArray4[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass120Array1 != null) {
			for (local1 = 0; local1 < this.anInt229; local1++) {
				@Pc(97) Class120 local97 = this.aClass120Array1[local1];
				@Pc(102) Class86 local102 = this.aClass86Array1[local1];
				local102.anInt2930 = local102.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local97.anInt3208] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "fv", descriptor = "(IIII)V", line = 1521)
	@Override
	public void method5487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt223; local1++) {
			@Pc(12) int local12 = this.aShortArray4[local1] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 += (arg2 - local28) * arg3 >> 7;
			}
			this.aShortArray4[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass120Array1 != null) {
			for (local1 = 0; local1 < this.anInt229; local1++) {
				@Pc(97) Class120 local97 = this.aClass120Array1[local1];
				@Pc(102) Class86 local102 = this.aClass86Array1[local1];
				local102.anInt2930 = local102.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local97.anInt3208] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "fy", descriptor = "(IIII)V", line = 1521)
	@Override
	public void method5488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt223; local1++) {
			@Pc(12) int local12 = this.aShortArray4[local1] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 += (arg2 - local28) * arg3 >> 7;
			}
			this.aShortArray4[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass120Array1 != null) {
			for (local1 = 0; local1 < this.anInt229; local1++) {
				@Pc(97) Class120 local97 = this.aClass120Array1[local1];
				@Pc(102) Class86 local102 = this.aClass86Array1[local1];
				local102.anInt2930 = local102.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local97.anInt3208] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "fz", descriptor = "(IIII)V", line = 1521)
	@Override
	public void method5453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt223; local1++) {
			@Pc(12) int local12 = this.aShortArray4[local1] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 += (arg2 - local28) * arg3 >> 7;
			}
			this.aShortArray4[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass120Array1 != null) {
			for (local1 = 0; local1 < this.anInt229; local1++) {
				@Pc(97) Class120 local97 = this.aClass120Array1[local1];
				@Pc(102) Class86 local102 = this.aClass86Array1[local1];
				local102.anInt2930 = local102.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local97.anInt3208] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass88_8 != null) {
			this.aClass88_8.anInterface5_6 = null;
		}
	}

	@OriginalMember(owner = "client!abk", name = "bs", descriptor = "()Z", line = 1542)
	@Override
	public boolean method5440() {
		if (this.aShortArray7 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray7.length; local6++) {
			if (this.aShortArray7[local6] != -1) {
				@Pc(29) Class133 local29 = this.aClass21_Sub2_25.aClass134_7.method22906(this.aShortArray7[local6] & 0xFFFF);
				if (local29.anInt3351 * -1410868471 != -1 && !this.aClass21_Sub2_25.aClass112_1.method22019(local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!abk", name = "fx", descriptor = "()Z", line = 1542)
	@Override
	public boolean method5338() {
		if (this.aShortArray7 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray7.length; local6++) {
			if (this.aShortArray7[local6] != -1) {
				@Pc(29) Class133 local29 = this.aClass21_Sub2_25.aClass134_7.method22906(this.aShortArray7[local6] & 0xFFFF);
				if (local29.anInt3351 * -1410868471 != -1 && !this.aClass21_Sub2_25.aClass112_1.method22019(local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!abk", name = "fn", descriptor = "()Z", line = 1542)
	@Override
	public boolean method5455() {
		if (this.aShortArray7 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray7.length; local6++) {
			if (this.aShortArray7[local6] != -1) {
				@Pc(29) Class133 local29 = this.aClass21_Sub2_25.aClass134_7.method22906(this.aShortArray7[local6] & 0xFFFF);
				if (local29.anInt3351 * -1410868471 != -1 && !this.aClass21_Sub2_25.aClass112_1.method22019(local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!abk", name = "fs", descriptor = "()Z", line = 1542)
	@Override
	public boolean method5479() {
		if (this.aShortArray7 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray7.length; local6++) {
			if (this.aShortArray7[local6] != -1) {
				@Pc(29) Class133 local29 = this.aClass21_Sub2_25.aClass134_7.method22906(this.aShortArray7[local6] & 0xFFFF);
				if (local29.anInt3351 * -1410868471 != -1 && !this.aClass21_Sub2_25.aClass112_1.method22019(local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!abk", name = "fh", descriptor = "()Z", line = 1542)
	@Override
	public boolean method5481() {
		if (this.aShortArray7 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray7.length; local6++) {
			if (this.aShortArray7[local6] != -1) {
				@Pc(29) Class133 local29 = this.aClass21_Sub2_25.aClass134_7.method22906(this.aShortArray7[local6] & 0xFFFF);
				if (local29.anInt3351 * -1410868471 != -1 && !this.aClass21_Sub2_25.aClass112_1.method22019(local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!abk", name = "bm", descriptor = "()Z", line = 1554)
	@Override
	public boolean method5375() {
		return this.aBoolean46;
	}

	@OriginalMember(owner = "client!abk", name = "fu", descriptor = "()Z", line = 1554)
	@Override
	public boolean method5438() {
		return this.aBoolean46;
	}

	@OriginalMember(owner = "client!abk", name = "fg", descriptor = "()Z", line = 1558)
	@Override
	public boolean method5460() {
		return this.aBoolean47;
	}

	@OriginalMember(owner = "client!abk", name = "bf", descriptor = "()Z", line = 1558)
	@Override
	public boolean method5376() {
		return this.aBoolean47;
	}

	@OriginalMember(owner = "client!abk", name = "v", descriptor = "()V", line = 1561)
	@Override
	void method5382() {
	}

	@OriginalMember(owner = "client!abk", name = "cy", descriptor = "()V", line = 1561)
	@Override
	void method5318() {
	}

	@OriginalMember(owner = "client!abk", name = "cb", descriptor = "()V", line = 1562)
	@Override
	void method5411() {
	}

	@OriginalMember(owner = "client!abk", name = "cz", descriptor = "()V", line = 1562)
	@Override
	void method5412() {
	}

	@OriginalMember(owner = "client!abk", name = "t", descriptor = "()V", line = 1562)
	@Override
	void method5339() {
	}

	@OriginalMember(owner = "client!abk", name = "cn", descriptor = "()V", line = 1562)
	@Override
	void method5413() {
	}

	@OriginalMember(owner = "client!abk", name = "af", descriptor = "()Z", line = 1565)
	@Override
	boolean method5346() {
		if (this.anIntArrayArray3 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt220; local6++) {
			this.anIntArray32[local6] <<= 0x4;
			this.anIntArray31[local6] <<= 0x4;
			this.anIntArray35[local6] <<= 0x4;
		}
		anInt230 = 0;
		anInt231 = 0;
		anInt232 = 0;
		return true;
	}

	@OriginalMember(owner = "client!abk", name = "co", descriptor = "()Z", line = 1565)
	@Override
	boolean method5414() {
		if (this.anIntArrayArray3 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt220; local6++) {
			this.anIntArray32[local6] <<= 0x4;
			this.anIntArray31[local6] <<= 0x4;
			this.anIntArray35[local6] <<= 0x4;
		}
		anInt230 = 0;
		anInt231 = 0;
		anInt232 = 0;
		return true;
	}

	@OriginalMember(owner = "client!abk", name = "cd", descriptor = "()Z", line = 1565)
	@Override
	boolean method5366() {
		if (this.anIntArrayArray3 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt220; local6++) {
			this.anIntArray32[local6] <<= 0x4;
			this.anIntArray31[local6] <<= 0x4;
			this.anIntArray35[local6] <<= 0x4;
		}
		anInt230 = 0;
		anInt231 = 0;
		anInt232 = 0;
		return true;
	}

	@OriginalMember(owner = "client!abk", name = "cf", descriptor = "(I[IIIIZI[I)V", line = 1578)
	@Override
	void method5422(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(53) int local53;
		@Pc(33) int local33;
		@Pc(45) int local45;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			anInt230 = 0;
			anInt231 = 0;
			anInt232 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray3.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray3[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local53]) != 0) {
							anInt230 += this.anIntArray32[local53];
							anInt231 += this.anIntArray31[local53];
							anInt232 += this.anIntArray35[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt230 = anInt230 / local18 + arg2;
				anInt231 = anInt231 / local18 + arg3;
				anInt232 = anInt232 / local18 + arg4;
				aBoolean48 = true;
			} else {
				anInt230 = arg2;
				anInt231 = arg3;
				anInt232 = arg4;
			}
			return;
		}
		@Pc(228) int[] local228;
		@Pc(230) int local230;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local26 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local33 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local26;
				arg4 = local33;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local228 = this.anIntArrayArray3[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
							this.anIntArray32[local45] += arg2;
							this.anIntArray31[local45] += arg3;
							this.anIntArray35[local45] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(343) int local343;
		@Pc(365) int local365;
		@Pc(387) int local387;
		@Pc(422) int local422;
		@Pc(426) int local426;
		@Pc(430) int local430;
		@Pc(434) int local434;
		@Pc(442) int local442;
		@Pc(450) int local450;
		@Pc(603) int local603;
		@Pc(628) int local628;
		@Pc(632) int local632;
		@Pc(640) int local640;
		@Pc(645) int local645;
		@Pc(650) int local650;
		@Pc(655) int local655;
		@Pc(777) int[] local777;
		@Pc(779) int local779;
		@Pc(784) int local784;
		@Pc(789) int local789;
		@Pc(791) int local791;
		@Pc(917) int local917;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray3.length) {
						local228 = this.anIntArrayArray3[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
								this.anIntArray32[local45] -= anInt230;
								this.anIntArray31[local45] -= anInt231;
								this.anIntArray35[local45] -= anInt232;
								if (arg4 != 0) {
									local53 = Class317.anIntArray419[arg4];
									local343 = Class317.anIntArray420[arg4];
									local365 = this.anIntArray31[local45] * local53 + this.anIntArray32[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = this.anIntArray31[local45] * local343 - this.anIntArray32[local45] * local53 + 16383 >> 14;
									this.anIntArray32[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class317.anIntArray419[arg2];
									local343 = Class317.anIntArray420[arg2];
									local365 = this.anIntArray31[local45] * local343 - this.anIntArray35[local45] * local53 + 16383 >> 14;
									this.anIntArray35[local45] = this.anIntArray31[local45] * local53 + this.anIntArray35[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class317.anIntArray419[arg3];
									local343 = Class317.anIntArray420[arg3];
									local365 = this.anIntArray35[local45] * local53 + this.anIntArray32[local45] * local343 + 16383 >> 14;
									this.anIntArray35[local45] = this.anIntArray35[local45] * local343 - this.anIntArray32[local45] * local53 + 16383 >> 14;
									this.anIntArray32[local45] = local365;
								}
								this.anIntArray32[local45] += anInt230;
								this.anIntArray31[local45] += anInt231;
								this.anIntArray35[local45] += anInt232;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray3.length) {
							local228 = this.anIntArrayArray3[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
									local53 = this.anIntArray36[local45];
									local343 = this.anIntArray36[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray11[local365] != 0; local365++) {
										local387 = (this.aShortArray11[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class317.anIntArray419[arg4];
											local426 = Class317.anIntArray420[arg4];
											local430 = this.aShortArray6[local387] * local422 + this.aShortArray2[local387] * local426 + 16383 >> 14;
											this.aShortArray6[local387] = (short) (this.aShortArray6[local387] * local426 - this.aShortArray2[local387] * local422 + 16383 >> 14);
											this.aShortArray2[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class317.anIntArray419[arg2];
											local426 = Class317.anIntArray420[arg2];
											local430 = this.aShortArray6[local387] * local426 - this.aShortArray3[local387] * local422 + 16383 >> 14;
											this.aShortArray3[local387] = (short) (this.aShortArray6[local387] * local422 + this.aShortArray3[local387] * local426 + 16383 >> 14);
											this.aShortArray6[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class317.anIntArray419[arg3];
											local426 = Class317.anIntArray420[arg3];
											local430 = this.aShortArray3[local387] * local422 + this.aShortArray2[local387] * local426 + 16383 >> 14;
											this.aShortArray3[local387] = (short) (this.aShortArray3[local387] * local426 - this.aShortArray2[local387] * local422 + 16383 >> 14);
											this.aShortArray2[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass88_6 == null && this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass88_6 != null) {
						this.aClass88_6.anInterface5_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean48) {
					local343 = arg7[0] * anInt230 + arg7[3] * anInt231 + arg7[6] * anInt232 + 8192 >> 14;
					local365 = arg7[1] * anInt230 + arg7[4] * anInt231 + arg7[7] * anInt232 + 8192 >> 14;
					local387 = arg7[2] * anInt230 + arg7[5] * anInt231 + arg7[8] * anInt232 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt230 = local343;
					anInt231 = local365;
					anInt232 = local387;
					aBoolean48 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class317.anIntArray420[arg2];
				local387 = Class317.anIntArray419[arg2];
				local422 = Class317.anIntArray420[arg3];
				local426 = Class317.anIntArray419[arg3];
				local430 = Class317.anIntArray420[arg4];
				local434 = Class317.anIntArray419[arg4];
				local442 = local387 * local430 + 8192 >> 14;
				local450 = local387 * local434 + 8192 >> 14;
				local410[0] = local422 * local430 + local426 * local450 + 8192 >> 14;
				local410[1] = -local422 * local434 + local426 * local442 + 8192 >> 14;
				local410[2] = local426 * local365 + 8192 >> 14;
				local410[3] = local365 * local434 + 8192 >> 14;
				local410[4] = local365 * local430 + 8192 >> 14;
				local410[5] = -local387;
				local410[6] = -local426 * local430 + local422 * local450 + 8192 >> 14;
				local410[7] = local426 * local434 + local422 * local442 + 8192 >> 14;
				local410[8] = local422 * local365 + 8192 >> 14;
				@Pc(578) int local578 = local410[0] * -anInt230 + local410[1] * -anInt231 + local410[2] * -anInt232 + 8192 >> 14;
				local603 = local410[3] * -anInt230 + local410[4] * -anInt231 + local410[5] * -anInt232 + 8192 >> 14;
				local628 = local410[6] * -anInt230 + local410[7] * -anInt231 + local410[8] * -anInt232 + 8192 >> 14;
				local632 = local578 + anInt230;
				@Pc(636) int local636 = local603 + anInt231;
				local640 = local628 + anInt232;
				@Pc(643) int[] local643 = new int[9];
				for (local645 = 0; local645 < 3; local645++) {
					for (local650 = 0; local650 < 3; local650++) {
						local655 = 0;
						for (@Pc(657) int local657 = 0; local657 < 3; local657++) {
							local655 += local410[local645 * 3 + local657] * arg7[local650 * 3 + local657];
						}
						local643[local645 * 3 + local650] = local655 + 8192 >> 14;
					}
				}
				local645 = local410[0] * local230 + local410[1] * local45 + local410[2] * local53 + 8192 >> 14;
				local650 = local410[3] * local230 + local410[4] * local45 + local410[5] * local53 + 8192 >> 14;
				local655 = local410[6] * local230 + local410[7] * local45 + local410[8] * local53 + 8192 >> 14;
				local645 += local632;
				local650 += local636;
				local655 += local640;
				local777 = new int[9];
				for (local779 = 0; local779 < 3; local779++) {
					for (local784 = 0; local784 < 3; local784++) {
						local789 = 0;
						for (local791 = 0; local791 < 3; local791++) {
							local789 += arg7[local779 * 3 + local791] * local643[local784 + local791 * 3];
						}
						local777[local779 * 3 + local784] = local789 + 8192 >> 14;
					}
				}
				local779 = arg7[0] * local645 + arg7[1] * local650 + arg7[2] * local655 + 8192 >> 14;
				local784 = arg7[3] * local645 + arg7[4] * local650 + arg7[5] * local655 + 8192 >> 14;
				local789 = arg7[6] * local645 + arg7[7] * local650 + arg7[8] * local655 + 8192 >> 14;
				local779 += local18;
				local784 += local26;
				local789 += local33;
				for (local791 = 0; local791 < local2; local791++) {
					local917 = arg1[local791];
					if (local917 < this.anIntArrayArray3.length) {
						@Pc(927) int[] local927 = this.anIntArrayArray3[local917];
						for (@Pc(929) int local929 = 0; local929 < local927.length; local929++) {
							@Pc(937) int local937 = local927[local929];
							if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local937]) != 0) {
								@Pc(979) int local979 = local777[0] * this.anIntArray32[local937] + local777[1] * this.anIntArray31[local937] + local777[2] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray32[local937] + local777[4] * this.anIntArray31[local937] + local777[5] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray32[local937] + local777[7] * this.anIntArray31[local937] + local777[8] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray32[local937] = local1045;
								this.anIntArray31[local937] = local1049;
								this.anIntArray35[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class120 local2452;
			@Pc(2457) Class86 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray5 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray5.length) {
							local228 = this.anIntArrayArray5[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray1 == null || (arg6 & this.aShortArray1[local45]) != 0) {
									local53 = (this.aByteArray5[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray5[local45] = (byte) local53;
									if (this.aClass88_8 != null) {
										this.aClass88_8.anInterface5_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass120Array1 != null) {
						for (local18 = 0; local18 < this.anInt229; local18++) {
							local2452 = this.aClass120Array1[local18];
							local2457 = this.aClass86Array1[local18];
							local2457.anInt2930 = local2457.anInt2930 & 0xFFFFFF | 255 - (this.aByteArray5[local2452.anInt3208] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class86 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local228 = this.anIntArrayArray4[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass86Array1[local228[local230]];
									local2686.anInt2932 += arg2;
									local2686.anInt2931 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local228 = this.anIntArrayArray4[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass86Array1[local228[local230]];
									local2686.anInt2928 = local2686.anInt2928 * arg2 >> 7;
									local2686.anInt2929 = local2686.anInt2929 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray4 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray4.length) {
							local228 = this.anIntArrayArray4[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local2686 = this.aClass86Array1[local228[local230]];
								local2686.anInt2927 = local2686.anInt2927 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray5 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray5.length) {
						local228 = this.anIntArrayArray5[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray1 == null || (arg6 & this.aShortArray1[local45]) != 0) {
								local53 = this.aShortArray4[local45] & 0xFFFF;
								local343 = local53 >> 10 & 0x3F;
								local365 = local53 >> 7 & 0x7;
								local387 = local53 & 0x7F;
								@Pc(2553) int local2553 = local343 + arg2 & 0x3F;
								local365 += arg3 / 4;
								if (local365 < 0) {
									local365 = 0;
								} else if (local365 > 7) {
									local365 = 7;
								}
								local387 += arg4;
								if (local387 < 0) {
									local387 = 0;
								} else if (local387 > 127) {
									local387 = 127;
								}
								this.aShortArray4[local45] = (short) (local2553 << 10 | local365 << 7 | local387);
								if (this.aClass88_8 != null) {
									this.aClass88_8.anInterface5_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass120Array1 != null) {
					for (local18 = 0; local18 < this.anInt229; local18++) {
						local2452 = this.aClass120Array1[local18];
						local2457 = this.aClass86Array1[local18];
						local2457.anInt2930 = local2457.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local2452.anInt3208] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local228 = this.anIntArrayArray3[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
							this.anIntArray32[local45] -= anInt230;
							this.anIntArray31[local45] -= anInt231;
							this.anIntArray35[local45] -= anInt232;
							this.anIntArray32[local45] = this.anIntArray32[local45] * arg2 >> 7;
							this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
							this.anIntArray35[local45] = this.anIntArray35[local45] * arg4 >> 7;
							this.anIntArray32[local45] += anInt230;
							this.anIntArray31[local45] += anInt231;
							this.anIntArray35[local45] += anInt232;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local26 = arg7[10] << 4;
			local33 = arg7[11] << 4;
			local230 = arg7[12] << 4;
			local45 = arg7[13] << 4;
			local53 = arg7[14] << 4;
			if (aBoolean48) {
				local343 = arg7[0] * anInt230 + arg7[3] * anInt231 + arg7[6] * anInt232 + 8192 >> 14;
				local365 = arg7[1] * anInt230 + arg7[4] * anInt231 + arg7[7] * anInt232 + 8192 >> 14;
				local387 = arg7[2] * anInt230 + arg7[5] * anInt231 + arg7[8] * anInt232 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt230 = local343;
				anInt231 = local365;
				anInt232 = local387;
				aBoolean48 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt230 + 8192 >> 14;
			local426 = local365 * -anInt231 + 8192 >> 14;
			local430 = local387 * -anInt232 + 8192 >> 14;
			local434 = local422 + anInt230;
			local442 = local426 + anInt231;
			local450 = local430 + anInt232;
			@Pc(1782) int[] local1782 = new int[] { local343 * arg7[0] + 8192 >> 14, local343 * arg7[3] + 8192 >> 14, local343 * arg7[6] + 8192 >> 14, local365 * arg7[1] + 8192 >> 14, local365 * arg7[4] + 8192 >> 14, local365 * arg7[7] + 8192 >> 14, local387 * arg7[2] + 8192 >> 14, local387 * arg7[5] + 8192 >> 14, local387 * arg7[8] + 8192 >> 14 };
			local603 = local343 * local230 + 8192 >> 14;
			local628 = local365 * local45 + 8192 >> 14;
			local632 = local387 * local53 + 8192 >> 14;
			@Pc(1918) int local1918 = local603 + local434;
			@Pc(1922) int local1922 = local628 + local442;
			@Pc(1926) int local1926 = local632 + local450;
			@Pc(1929) int[] local1929 = new int[9];
			@Pc(1936) int local1936;
			for (local640 = 0; local640 < 3; local640++) {
				for (local1936 = 0; local1936 < 3; local1936++) {
					local645 = 0;
					for (local650 = 0; local650 < 3; local650++) {
						local645 += arg7[local640 * 3 + local650] * local1782[local1936 + local650 * 3];
					}
					local1929[local640 * 3 + local1936] = local645 + 8192 >> 14;
				}
			}
			local640 = arg7[0] * local1918 + arg7[1] * local1922 + arg7[2] * local1926 + 8192 >> 14;
			local1936 = arg7[3] * local1918 + arg7[4] * local1922 + arg7[5] * local1926 + 8192 >> 14;
			local645 = arg7[6] * local1918 + arg7[7] * local1922 + arg7[8] * local1926 + 8192 >> 14;
			local640 += local18;
			local1936 += local26;
			local645 += local33;
			for (local650 = 0; local650 < local2; local650++) {
				local655 = arg1[local650];
				if (local655 < this.anIntArrayArray3.length) {
					local777 = this.anIntArrayArray3[local655];
					for (local779 = 0; local779 < local777.length; local779++) {
						local784 = local777[local779];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local784]) != 0) {
							local789 = local1929[0] * this.anIntArray32[local784] + local1929[1] * this.anIntArray31[local784] + local1929[2] * this.anIntArray35[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray32[local784] + local1929[4] * this.anIntArray31[local784] + local1929[5] * this.anIntArray35[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray32[local784] + local1929[7] * this.anIntArray31[local784] + local1929[8] * this.anIntArray35[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray32[local784] = local2197;
							this.anIntArray31[local784] = local2201;
							this.anIntArray35[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "dv", descriptor = "(I[IIIIZI[I)V", line = 1578)
	@Override
	void method5423(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(53) int local53;
		@Pc(33) int local33;
		@Pc(45) int local45;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			anInt230 = 0;
			anInt231 = 0;
			anInt232 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray3.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray3[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local53]) != 0) {
							anInt230 += this.anIntArray32[local53];
							anInt231 += this.anIntArray31[local53];
							anInt232 += this.anIntArray35[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt230 = anInt230 / local18 + arg2;
				anInt231 = anInt231 / local18 + arg3;
				anInt232 = anInt232 / local18 + arg4;
				aBoolean48 = true;
			} else {
				anInt230 = arg2;
				anInt231 = arg3;
				anInt232 = arg4;
			}
			return;
		}
		@Pc(228) int[] local228;
		@Pc(230) int local230;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local26 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local33 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local26;
				arg4 = local33;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local228 = this.anIntArrayArray3[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
							this.anIntArray32[local45] += arg2;
							this.anIntArray31[local45] += arg3;
							this.anIntArray35[local45] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(343) int local343;
		@Pc(365) int local365;
		@Pc(387) int local387;
		@Pc(422) int local422;
		@Pc(426) int local426;
		@Pc(430) int local430;
		@Pc(434) int local434;
		@Pc(442) int local442;
		@Pc(450) int local450;
		@Pc(603) int local603;
		@Pc(628) int local628;
		@Pc(632) int local632;
		@Pc(640) int local640;
		@Pc(645) int local645;
		@Pc(650) int local650;
		@Pc(655) int local655;
		@Pc(777) int[] local777;
		@Pc(779) int local779;
		@Pc(784) int local784;
		@Pc(789) int local789;
		@Pc(791) int local791;
		@Pc(917) int local917;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray3.length) {
						local228 = this.anIntArrayArray3[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
								this.anIntArray32[local45] -= anInt230;
								this.anIntArray31[local45] -= anInt231;
								this.anIntArray35[local45] -= anInt232;
								if (arg4 != 0) {
									local53 = Class317.anIntArray419[arg4];
									local343 = Class317.anIntArray420[arg4];
									local365 = this.anIntArray31[local45] * local53 + this.anIntArray32[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = this.anIntArray31[local45] * local343 - this.anIntArray32[local45] * local53 + 16383 >> 14;
									this.anIntArray32[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class317.anIntArray419[arg2];
									local343 = Class317.anIntArray420[arg2];
									local365 = this.anIntArray31[local45] * local343 - this.anIntArray35[local45] * local53 + 16383 >> 14;
									this.anIntArray35[local45] = this.anIntArray31[local45] * local53 + this.anIntArray35[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class317.anIntArray419[arg3];
									local343 = Class317.anIntArray420[arg3];
									local365 = this.anIntArray35[local45] * local53 + this.anIntArray32[local45] * local343 + 16383 >> 14;
									this.anIntArray35[local45] = this.anIntArray35[local45] * local343 - this.anIntArray32[local45] * local53 + 16383 >> 14;
									this.anIntArray32[local45] = local365;
								}
								this.anIntArray32[local45] += anInt230;
								this.anIntArray31[local45] += anInt231;
								this.anIntArray35[local45] += anInt232;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray3.length) {
							local228 = this.anIntArrayArray3[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
									local53 = this.anIntArray36[local45];
									local343 = this.anIntArray36[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray11[local365] != 0; local365++) {
										local387 = (this.aShortArray11[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class317.anIntArray419[arg4];
											local426 = Class317.anIntArray420[arg4];
											local430 = this.aShortArray6[local387] * local422 + this.aShortArray2[local387] * local426 + 16383 >> 14;
											this.aShortArray6[local387] = (short) (this.aShortArray6[local387] * local426 - this.aShortArray2[local387] * local422 + 16383 >> 14);
											this.aShortArray2[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class317.anIntArray419[arg2];
											local426 = Class317.anIntArray420[arg2];
											local430 = this.aShortArray6[local387] * local426 - this.aShortArray3[local387] * local422 + 16383 >> 14;
											this.aShortArray3[local387] = (short) (this.aShortArray6[local387] * local422 + this.aShortArray3[local387] * local426 + 16383 >> 14);
											this.aShortArray6[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class317.anIntArray419[arg3];
											local426 = Class317.anIntArray420[arg3];
											local430 = this.aShortArray3[local387] * local422 + this.aShortArray2[local387] * local426 + 16383 >> 14;
											this.aShortArray3[local387] = (short) (this.aShortArray3[local387] * local426 - this.aShortArray2[local387] * local422 + 16383 >> 14);
											this.aShortArray2[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass88_6 == null && this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass88_6 != null) {
						this.aClass88_6.anInterface5_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean48) {
					local343 = arg7[0] * anInt230 + arg7[3] * anInt231 + arg7[6] * anInt232 + 8192 >> 14;
					local365 = arg7[1] * anInt230 + arg7[4] * anInt231 + arg7[7] * anInt232 + 8192 >> 14;
					local387 = arg7[2] * anInt230 + arg7[5] * anInt231 + arg7[8] * anInt232 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt230 = local343;
					anInt231 = local365;
					anInt232 = local387;
					aBoolean48 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class317.anIntArray420[arg2];
				local387 = Class317.anIntArray419[arg2];
				local422 = Class317.anIntArray420[arg3];
				local426 = Class317.anIntArray419[arg3];
				local430 = Class317.anIntArray420[arg4];
				local434 = Class317.anIntArray419[arg4];
				local442 = local387 * local430 + 8192 >> 14;
				local450 = local387 * local434 + 8192 >> 14;
				local410[0] = local422 * local430 + local426 * local450 + 8192 >> 14;
				local410[1] = -local422 * local434 + local426 * local442 + 8192 >> 14;
				local410[2] = local426 * local365 + 8192 >> 14;
				local410[3] = local365 * local434 + 8192 >> 14;
				local410[4] = local365 * local430 + 8192 >> 14;
				local410[5] = -local387;
				local410[6] = -local426 * local430 + local422 * local450 + 8192 >> 14;
				local410[7] = local426 * local434 + local422 * local442 + 8192 >> 14;
				local410[8] = local422 * local365 + 8192 >> 14;
				@Pc(578) int local578 = local410[0] * -anInt230 + local410[1] * -anInt231 + local410[2] * -anInt232 + 8192 >> 14;
				local603 = local410[3] * -anInt230 + local410[4] * -anInt231 + local410[5] * -anInt232 + 8192 >> 14;
				local628 = local410[6] * -anInt230 + local410[7] * -anInt231 + local410[8] * -anInt232 + 8192 >> 14;
				local632 = local578 + anInt230;
				@Pc(636) int local636 = local603 + anInt231;
				local640 = local628 + anInt232;
				@Pc(643) int[] local643 = new int[9];
				for (local645 = 0; local645 < 3; local645++) {
					for (local650 = 0; local650 < 3; local650++) {
						local655 = 0;
						for (@Pc(657) int local657 = 0; local657 < 3; local657++) {
							local655 += local410[local645 * 3 + local657] * arg7[local650 * 3 + local657];
						}
						local643[local645 * 3 + local650] = local655 + 8192 >> 14;
					}
				}
				local645 = local410[0] * local230 + local410[1] * local45 + local410[2] * local53 + 8192 >> 14;
				local650 = local410[3] * local230 + local410[4] * local45 + local410[5] * local53 + 8192 >> 14;
				local655 = local410[6] * local230 + local410[7] * local45 + local410[8] * local53 + 8192 >> 14;
				local645 += local632;
				local650 += local636;
				local655 += local640;
				local777 = new int[9];
				for (local779 = 0; local779 < 3; local779++) {
					for (local784 = 0; local784 < 3; local784++) {
						local789 = 0;
						for (local791 = 0; local791 < 3; local791++) {
							local789 += arg7[local779 * 3 + local791] * local643[local784 + local791 * 3];
						}
						local777[local779 * 3 + local784] = local789 + 8192 >> 14;
					}
				}
				local779 = arg7[0] * local645 + arg7[1] * local650 + arg7[2] * local655 + 8192 >> 14;
				local784 = arg7[3] * local645 + arg7[4] * local650 + arg7[5] * local655 + 8192 >> 14;
				local789 = arg7[6] * local645 + arg7[7] * local650 + arg7[8] * local655 + 8192 >> 14;
				local779 += local18;
				local784 += local26;
				local789 += local33;
				for (local791 = 0; local791 < local2; local791++) {
					local917 = arg1[local791];
					if (local917 < this.anIntArrayArray3.length) {
						@Pc(927) int[] local927 = this.anIntArrayArray3[local917];
						for (@Pc(929) int local929 = 0; local929 < local927.length; local929++) {
							@Pc(937) int local937 = local927[local929];
							if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local937]) != 0) {
								@Pc(979) int local979 = local777[0] * this.anIntArray32[local937] + local777[1] * this.anIntArray31[local937] + local777[2] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray32[local937] + local777[4] * this.anIntArray31[local937] + local777[5] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray32[local937] + local777[7] * this.anIntArray31[local937] + local777[8] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray32[local937] = local1045;
								this.anIntArray31[local937] = local1049;
								this.anIntArray35[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class120 local2452;
			@Pc(2457) Class86 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray5 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray5.length) {
							local228 = this.anIntArrayArray5[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray1 == null || (arg6 & this.aShortArray1[local45]) != 0) {
									local53 = (this.aByteArray5[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray5[local45] = (byte) local53;
									if (this.aClass88_8 != null) {
										this.aClass88_8.anInterface5_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass120Array1 != null) {
						for (local18 = 0; local18 < this.anInt229; local18++) {
							local2452 = this.aClass120Array1[local18];
							local2457 = this.aClass86Array1[local18];
							local2457.anInt2930 = local2457.anInt2930 & 0xFFFFFF | 255 - (this.aByteArray5[local2452.anInt3208] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class86 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local228 = this.anIntArrayArray4[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass86Array1[local228[local230]];
									local2686.anInt2932 += arg2;
									local2686.anInt2931 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local228 = this.anIntArrayArray4[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass86Array1[local228[local230]];
									local2686.anInt2928 = local2686.anInt2928 * arg2 >> 7;
									local2686.anInt2929 = local2686.anInt2929 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray4 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray4.length) {
							local228 = this.anIntArrayArray4[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local2686 = this.aClass86Array1[local228[local230]];
								local2686.anInt2927 = local2686.anInt2927 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray5 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray5.length) {
						local228 = this.anIntArrayArray5[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray1 == null || (arg6 & this.aShortArray1[local45]) != 0) {
								local53 = this.aShortArray4[local45] & 0xFFFF;
								local343 = local53 >> 10 & 0x3F;
								local365 = local53 >> 7 & 0x7;
								local387 = local53 & 0x7F;
								@Pc(2553) int local2553 = local343 + arg2 & 0x3F;
								local365 += arg3 / 4;
								if (local365 < 0) {
									local365 = 0;
								} else if (local365 > 7) {
									local365 = 7;
								}
								local387 += arg4;
								if (local387 < 0) {
									local387 = 0;
								} else if (local387 > 127) {
									local387 = 127;
								}
								this.aShortArray4[local45] = (short) (local2553 << 10 | local365 << 7 | local387);
								if (this.aClass88_8 != null) {
									this.aClass88_8.anInterface5_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass120Array1 != null) {
					for (local18 = 0; local18 < this.anInt229; local18++) {
						local2452 = this.aClass120Array1[local18];
						local2457 = this.aClass86Array1[local18];
						local2457.anInt2930 = local2457.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local2452.anInt3208] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local228 = this.anIntArrayArray3[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
							this.anIntArray32[local45] -= anInt230;
							this.anIntArray31[local45] -= anInt231;
							this.anIntArray35[local45] -= anInt232;
							this.anIntArray32[local45] = this.anIntArray32[local45] * arg2 >> 7;
							this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
							this.anIntArray35[local45] = this.anIntArray35[local45] * arg4 >> 7;
							this.anIntArray32[local45] += anInt230;
							this.anIntArray31[local45] += anInt231;
							this.anIntArray35[local45] += anInt232;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local26 = arg7[10] << 4;
			local33 = arg7[11] << 4;
			local230 = arg7[12] << 4;
			local45 = arg7[13] << 4;
			local53 = arg7[14] << 4;
			if (aBoolean48) {
				local343 = arg7[0] * anInt230 + arg7[3] * anInt231 + arg7[6] * anInt232 + 8192 >> 14;
				local365 = arg7[1] * anInt230 + arg7[4] * anInt231 + arg7[7] * anInt232 + 8192 >> 14;
				local387 = arg7[2] * anInt230 + arg7[5] * anInt231 + arg7[8] * anInt232 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt230 = local343;
				anInt231 = local365;
				anInt232 = local387;
				aBoolean48 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt230 + 8192 >> 14;
			local426 = local365 * -anInt231 + 8192 >> 14;
			local430 = local387 * -anInt232 + 8192 >> 14;
			local434 = local422 + anInt230;
			local442 = local426 + anInt231;
			local450 = local430 + anInt232;
			@Pc(1782) int[] local1782 = new int[] { local343 * arg7[0] + 8192 >> 14, local343 * arg7[3] + 8192 >> 14, local343 * arg7[6] + 8192 >> 14, local365 * arg7[1] + 8192 >> 14, local365 * arg7[4] + 8192 >> 14, local365 * arg7[7] + 8192 >> 14, local387 * arg7[2] + 8192 >> 14, local387 * arg7[5] + 8192 >> 14, local387 * arg7[8] + 8192 >> 14 };
			local603 = local343 * local230 + 8192 >> 14;
			local628 = local365 * local45 + 8192 >> 14;
			local632 = local387 * local53 + 8192 >> 14;
			@Pc(1918) int local1918 = local603 + local434;
			@Pc(1922) int local1922 = local628 + local442;
			@Pc(1926) int local1926 = local632 + local450;
			@Pc(1929) int[] local1929 = new int[9];
			@Pc(1936) int local1936;
			for (local640 = 0; local640 < 3; local640++) {
				for (local1936 = 0; local1936 < 3; local1936++) {
					local645 = 0;
					for (local650 = 0; local650 < 3; local650++) {
						local645 += arg7[local640 * 3 + local650] * local1782[local1936 + local650 * 3];
					}
					local1929[local640 * 3 + local1936] = local645 + 8192 >> 14;
				}
			}
			local640 = arg7[0] * local1918 + arg7[1] * local1922 + arg7[2] * local1926 + 8192 >> 14;
			local1936 = arg7[3] * local1918 + arg7[4] * local1922 + arg7[5] * local1926 + 8192 >> 14;
			local645 = arg7[6] * local1918 + arg7[7] * local1922 + arg7[8] * local1926 + 8192 >> 14;
			local640 += local18;
			local1936 += local26;
			local645 += local33;
			for (local650 = 0; local650 < local2; local650++) {
				local655 = arg1[local650];
				if (local655 < this.anIntArrayArray3.length) {
					local777 = this.anIntArrayArray3[local655];
					for (local779 = 0; local779 < local777.length; local779++) {
						local784 = local777[local779];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local784]) != 0) {
							local789 = local1929[0] * this.anIntArray32[local784] + local1929[1] * this.anIntArray31[local784] + local1929[2] * this.anIntArray35[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray32[local784] + local1929[4] * this.anIntArray31[local784] + local1929[5] * this.anIntArray35[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray32[local784] + local1929[7] * this.anIntArray31[local784] + local1929[8] * this.anIntArray35[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray32[local784] = local2197;
							this.anIntArray31[local784] = local2201;
							this.anIntArray35[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "cw", descriptor = "(I[IIIIZI[I)V", line = 1578)
	@Override
	void method5421(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(53) int local53;
		@Pc(33) int local33;
		@Pc(45) int local45;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			anInt230 = 0;
			anInt231 = 0;
			anInt232 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray3.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray3[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local53]) != 0) {
							anInt230 += this.anIntArray32[local53];
							anInt231 += this.anIntArray31[local53];
							anInt232 += this.anIntArray35[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt230 = anInt230 / local18 + arg2;
				anInt231 = anInt231 / local18 + arg3;
				anInt232 = anInt232 / local18 + arg4;
				aBoolean48 = true;
			} else {
				anInt230 = arg2;
				anInt231 = arg3;
				anInt232 = arg4;
			}
			return;
		}
		@Pc(228) int[] local228;
		@Pc(230) int local230;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local26 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local33 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local26;
				arg4 = local33;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local228 = this.anIntArrayArray3[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
							this.anIntArray32[local45] += arg2;
							this.anIntArray31[local45] += arg3;
							this.anIntArray35[local45] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(343) int local343;
		@Pc(365) int local365;
		@Pc(387) int local387;
		@Pc(422) int local422;
		@Pc(426) int local426;
		@Pc(430) int local430;
		@Pc(434) int local434;
		@Pc(442) int local442;
		@Pc(450) int local450;
		@Pc(603) int local603;
		@Pc(628) int local628;
		@Pc(632) int local632;
		@Pc(640) int local640;
		@Pc(645) int local645;
		@Pc(650) int local650;
		@Pc(655) int local655;
		@Pc(777) int[] local777;
		@Pc(779) int local779;
		@Pc(784) int local784;
		@Pc(789) int local789;
		@Pc(791) int local791;
		@Pc(917) int local917;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray3.length) {
						local228 = this.anIntArrayArray3[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
								this.anIntArray32[local45] -= anInt230;
								this.anIntArray31[local45] -= anInt231;
								this.anIntArray35[local45] -= anInt232;
								if (arg4 != 0) {
									local53 = Class317.anIntArray419[arg4];
									local343 = Class317.anIntArray420[arg4];
									local365 = this.anIntArray31[local45] * local53 + this.anIntArray32[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = this.anIntArray31[local45] * local343 - this.anIntArray32[local45] * local53 + 16383 >> 14;
									this.anIntArray32[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class317.anIntArray419[arg2];
									local343 = Class317.anIntArray420[arg2];
									local365 = this.anIntArray31[local45] * local343 - this.anIntArray35[local45] * local53 + 16383 >> 14;
									this.anIntArray35[local45] = this.anIntArray31[local45] * local53 + this.anIntArray35[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class317.anIntArray419[arg3];
									local343 = Class317.anIntArray420[arg3];
									local365 = this.anIntArray35[local45] * local53 + this.anIntArray32[local45] * local343 + 16383 >> 14;
									this.anIntArray35[local45] = this.anIntArray35[local45] * local343 - this.anIntArray32[local45] * local53 + 16383 >> 14;
									this.anIntArray32[local45] = local365;
								}
								this.anIntArray32[local45] += anInt230;
								this.anIntArray31[local45] += anInt231;
								this.anIntArray35[local45] += anInt232;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray3.length) {
							local228 = this.anIntArrayArray3[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
									local53 = this.anIntArray36[local45];
									local343 = this.anIntArray36[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray11[local365] != 0; local365++) {
										local387 = (this.aShortArray11[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class317.anIntArray419[arg4];
											local426 = Class317.anIntArray420[arg4];
											local430 = this.aShortArray6[local387] * local422 + this.aShortArray2[local387] * local426 + 16383 >> 14;
											this.aShortArray6[local387] = (short) (this.aShortArray6[local387] * local426 - this.aShortArray2[local387] * local422 + 16383 >> 14);
											this.aShortArray2[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class317.anIntArray419[arg2];
											local426 = Class317.anIntArray420[arg2];
											local430 = this.aShortArray6[local387] * local426 - this.aShortArray3[local387] * local422 + 16383 >> 14;
											this.aShortArray3[local387] = (short) (this.aShortArray6[local387] * local422 + this.aShortArray3[local387] * local426 + 16383 >> 14);
											this.aShortArray6[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class317.anIntArray419[arg3];
											local426 = Class317.anIntArray420[arg3];
											local430 = this.aShortArray3[local387] * local422 + this.aShortArray2[local387] * local426 + 16383 >> 14;
											this.aShortArray3[local387] = (short) (this.aShortArray3[local387] * local426 - this.aShortArray2[local387] * local422 + 16383 >> 14);
											this.aShortArray2[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass88_6 == null && this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass88_6 != null) {
						this.aClass88_6.anInterface5_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean48) {
					local343 = arg7[0] * anInt230 + arg7[3] * anInt231 + arg7[6] * anInt232 + 8192 >> 14;
					local365 = arg7[1] * anInt230 + arg7[4] * anInt231 + arg7[7] * anInt232 + 8192 >> 14;
					local387 = arg7[2] * anInt230 + arg7[5] * anInt231 + arg7[8] * anInt232 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt230 = local343;
					anInt231 = local365;
					anInt232 = local387;
					aBoolean48 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class317.anIntArray420[arg2];
				local387 = Class317.anIntArray419[arg2];
				local422 = Class317.anIntArray420[arg3];
				local426 = Class317.anIntArray419[arg3];
				local430 = Class317.anIntArray420[arg4];
				local434 = Class317.anIntArray419[arg4];
				local442 = local387 * local430 + 8192 >> 14;
				local450 = local387 * local434 + 8192 >> 14;
				local410[0] = local422 * local430 + local426 * local450 + 8192 >> 14;
				local410[1] = -local422 * local434 + local426 * local442 + 8192 >> 14;
				local410[2] = local426 * local365 + 8192 >> 14;
				local410[3] = local365 * local434 + 8192 >> 14;
				local410[4] = local365 * local430 + 8192 >> 14;
				local410[5] = -local387;
				local410[6] = -local426 * local430 + local422 * local450 + 8192 >> 14;
				local410[7] = local426 * local434 + local422 * local442 + 8192 >> 14;
				local410[8] = local422 * local365 + 8192 >> 14;
				@Pc(578) int local578 = local410[0] * -anInt230 + local410[1] * -anInt231 + local410[2] * -anInt232 + 8192 >> 14;
				local603 = local410[3] * -anInt230 + local410[4] * -anInt231 + local410[5] * -anInt232 + 8192 >> 14;
				local628 = local410[6] * -anInt230 + local410[7] * -anInt231 + local410[8] * -anInt232 + 8192 >> 14;
				local632 = local578 + anInt230;
				@Pc(636) int local636 = local603 + anInt231;
				local640 = local628 + anInt232;
				@Pc(643) int[] local643 = new int[9];
				for (local645 = 0; local645 < 3; local645++) {
					for (local650 = 0; local650 < 3; local650++) {
						local655 = 0;
						for (@Pc(657) int local657 = 0; local657 < 3; local657++) {
							local655 += local410[local645 * 3 + local657] * arg7[local650 * 3 + local657];
						}
						local643[local645 * 3 + local650] = local655 + 8192 >> 14;
					}
				}
				local645 = local410[0] * local230 + local410[1] * local45 + local410[2] * local53 + 8192 >> 14;
				local650 = local410[3] * local230 + local410[4] * local45 + local410[5] * local53 + 8192 >> 14;
				local655 = local410[6] * local230 + local410[7] * local45 + local410[8] * local53 + 8192 >> 14;
				local645 += local632;
				local650 += local636;
				local655 += local640;
				local777 = new int[9];
				for (local779 = 0; local779 < 3; local779++) {
					for (local784 = 0; local784 < 3; local784++) {
						local789 = 0;
						for (local791 = 0; local791 < 3; local791++) {
							local789 += arg7[local779 * 3 + local791] * local643[local784 + local791 * 3];
						}
						local777[local779 * 3 + local784] = local789 + 8192 >> 14;
					}
				}
				local779 = arg7[0] * local645 + arg7[1] * local650 + arg7[2] * local655 + 8192 >> 14;
				local784 = arg7[3] * local645 + arg7[4] * local650 + arg7[5] * local655 + 8192 >> 14;
				local789 = arg7[6] * local645 + arg7[7] * local650 + arg7[8] * local655 + 8192 >> 14;
				local779 += local18;
				local784 += local26;
				local789 += local33;
				for (local791 = 0; local791 < local2; local791++) {
					local917 = arg1[local791];
					if (local917 < this.anIntArrayArray3.length) {
						@Pc(927) int[] local927 = this.anIntArrayArray3[local917];
						for (@Pc(929) int local929 = 0; local929 < local927.length; local929++) {
							@Pc(937) int local937 = local927[local929];
							if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local937]) != 0) {
								@Pc(979) int local979 = local777[0] * this.anIntArray32[local937] + local777[1] * this.anIntArray31[local937] + local777[2] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray32[local937] + local777[4] * this.anIntArray31[local937] + local777[5] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray32[local937] + local777[7] * this.anIntArray31[local937] + local777[8] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray32[local937] = local1045;
								this.anIntArray31[local937] = local1049;
								this.anIntArray35[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class120 local2452;
			@Pc(2457) Class86 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray5 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray5.length) {
							local228 = this.anIntArrayArray5[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray1 == null || (arg6 & this.aShortArray1[local45]) != 0) {
									local53 = (this.aByteArray5[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray5[local45] = (byte) local53;
									if (this.aClass88_8 != null) {
										this.aClass88_8.anInterface5_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass120Array1 != null) {
						for (local18 = 0; local18 < this.anInt229; local18++) {
							local2452 = this.aClass120Array1[local18];
							local2457 = this.aClass86Array1[local18];
							local2457.anInt2930 = local2457.anInt2930 & 0xFFFFFF | 255 - (this.aByteArray5[local2452.anInt3208] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class86 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local228 = this.anIntArrayArray4[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass86Array1[local228[local230]];
									local2686.anInt2932 += arg2;
									local2686.anInt2931 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local228 = this.anIntArrayArray4[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass86Array1[local228[local230]];
									local2686.anInt2928 = local2686.anInt2928 * arg2 >> 7;
									local2686.anInt2929 = local2686.anInt2929 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray4 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray4.length) {
							local228 = this.anIntArrayArray4[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local2686 = this.aClass86Array1[local228[local230]];
								local2686.anInt2927 = local2686.anInt2927 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray5 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray5.length) {
						local228 = this.anIntArrayArray5[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray1 == null || (arg6 & this.aShortArray1[local45]) != 0) {
								local53 = this.aShortArray4[local45] & 0xFFFF;
								local343 = local53 >> 10 & 0x3F;
								local365 = local53 >> 7 & 0x7;
								local387 = local53 & 0x7F;
								@Pc(2553) int local2553 = local343 + arg2 & 0x3F;
								local365 += arg3 / 4;
								if (local365 < 0) {
									local365 = 0;
								} else if (local365 > 7) {
									local365 = 7;
								}
								local387 += arg4;
								if (local387 < 0) {
									local387 = 0;
								} else if (local387 > 127) {
									local387 = 127;
								}
								this.aShortArray4[local45] = (short) (local2553 << 10 | local365 << 7 | local387);
								if (this.aClass88_8 != null) {
									this.aClass88_8.anInterface5_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass120Array1 != null) {
					for (local18 = 0; local18 < this.anInt229; local18++) {
						local2452 = this.aClass120Array1[local18];
						local2457 = this.aClass86Array1[local18];
						local2457.anInt2930 = local2457.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local2452.anInt3208] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local228 = this.anIntArrayArray3[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
							this.anIntArray32[local45] -= anInt230;
							this.anIntArray31[local45] -= anInt231;
							this.anIntArray35[local45] -= anInt232;
							this.anIntArray32[local45] = this.anIntArray32[local45] * arg2 >> 7;
							this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
							this.anIntArray35[local45] = this.anIntArray35[local45] * arg4 >> 7;
							this.anIntArray32[local45] += anInt230;
							this.anIntArray31[local45] += anInt231;
							this.anIntArray35[local45] += anInt232;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local26 = arg7[10] << 4;
			local33 = arg7[11] << 4;
			local230 = arg7[12] << 4;
			local45 = arg7[13] << 4;
			local53 = arg7[14] << 4;
			if (aBoolean48) {
				local343 = arg7[0] * anInt230 + arg7[3] * anInt231 + arg7[6] * anInt232 + 8192 >> 14;
				local365 = arg7[1] * anInt230 + arg7[4] * anInt231 + arg7[7] * anInt232 + 8192 >> 14;
				local387 = arg7[2] * anInt230 + arg7[5] * anInt231 + arg7[8] * anInt232 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt230 = local343;
				anInt231 = local365;
				anInt232 = local387;
				aBoolean48 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt230 + 8192 >> 14;
			local426 = local365 * -anInt231 + 8192 >> 14;
			local430 = local387 * -anInt232 + 8192 >> 14;
			local434 = local422 + anInt230;
			local442 = local426 + anInt231;
			local450 = local430 + anInt232;
			@Pc(1782) int[] local1782 = new int[] { local343 * arg7[0] + 8192 >> 14, local343 * arg7[3] + 8192 >> 14, local343 * arg7[6] + 8192 >> 14, local365 * arg7[1] + 8192 >> 14, local365 * arg7[4] + 8192 >> 14, local365 * arg7[7] + 8192 >> 14, local387 * arg7[2] + 8192 >> 14, local387 * arg7[5] + 8192 >> 14, local387 * arg7[8] + 8192 >> 14 };
			local603 = local343 * local230 + 8192 >> 14;
			local628 = local365 * local45 + 8192 >> 14;
			local632 = local387 * local53 + 8192 >> 14;
			@Pc(1918) int local1918 = local603 + local434;
			@Pc(1922) int local1922 = local628 + local442;
			@Pc(1926) int local1926 = local632 + local450;
			@Pc(1929) int[] local1929 = new int[9];
			@Pc(1936) int local1936;
			for (local640 = 0; local640 < 3; local640++) {
				for (local1936 = 0; local1936 < 3; local1936++) {
					local645 = 0;
					for (local650 = 0; local650 < 3; local650++) {
						local645 += arg7[local640 * 3 + local650] * local1782[local1936 + local650 * 3];
					}
					local1929[local640 * 3 + local1936] = local645 + 8192 >> 14;
				}
			}
			local640 = arg7[0] * local1918 + arg7[1] * local1922 + arg7[2] * local1926 + 8192 >> 14;
			local1936 = arg7[3] * local1918 + arg7[4] * local1922 + arg7[5] * local1926 + 8192 >> 14;
			local645 = arg7[6] * local1918 + arg7[7] * local1922 + arg7[8] * local1926 + 8192 >> 14;
			local640 += local18;
			local1936 += local26;
			local645 += local33;
			for (local650 = 0; local650 < local2; local650++) {
				local655 = arg1[local650];
				if (local655 < this.anIntArrayArray3.length) {
					local777 = this.anIntArrayArray3[local655];
					for (local779 = 0; local779 < local777.length; local779++) {
						local784 = local777[local779];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local784]) != 0) {
							local789 = local1929[0] * this.anIntArray32[local784] + local1929[1] * this.anIntArray31[local784] + local1929[2] * this.anIntArray35[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray32[local784] + local1929[4] * this.anIntArray31[local784] + local1929[5] * this.anIntArray35[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray32[local784] + local1929[7] * this.anIntArray31[local784] + local1929[8] * this.anIntArray35[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray32[local784] = local2197;
							this.anIntArray31[local784] = local2201;
							this.anIntArray35[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "aa", descriptor = "(I[IIIIZI[I)V", line = 1578)
	@Override
	void method5348(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(53) int local53;
		@Pc(33) int local33;
		@Pc(45) int local45;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			anInt230 = 0;
			anInt231 = 0;
			anInt232 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray3.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray3[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local53]) != 0) {
							anInt230 += this.anIntArray32[local53];
							anInt231 += this.anIntArray31[local53];
							anInt232 += this.anIntArray35[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt230 = anInt230 / local18 + arg2;
				anInt231 = anInt231 / local18 + arg3;
				anInt232 = anInt232 / local18 + arg4;
				aBoolean48 = true;
			} else {
				anInt230 = arg2;
				anInt231 = arg3;
				anInt232 = arg4;
			}
			return;
		}
		@Pc(228) int[] local228;
		@Pc(230) int local230;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local26 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local33 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local26;
				arg4 = local33;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local228 = this.anIntArrayArray3[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
							this.anIntArray32[local45] += arg2;
							this.anIntArray31[local45] += arg3;
							this.anIntArray35[local45] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(343) int local343;
		@Pc(365) int local365;
		@Pc(387) int local387;
		@Pc(422) int local422;
		@Pc(426) int local426;
		@Pc(430) int local430;
		@Pc(434) int local434;
		@Pc(442) int local442;
		@Pc(450) int local450;
		@Pc(603) int local603;
		@Pc(628) int local628;
		@Pc(632) int local632;
		@Pc(640) int local640;
		@Pc(645) int local645;
		@Pc(650) int local650;
		@Pc(655) int local655;
		@Pc(777) int[] local777;
		@Pc(779) int local779;
		@Pc(784) int local784;
		@Pc(789) int local789;
		@Pc(791) int local791;
		@Pc(917) int local917;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray3.length) {
						local228 = this.anIntArrayArray3[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
								this.anIntArray32[local45] -= anInt230;
								this.anIntArray31[local45] -= anInt231;
								this.anIntArray35[local45] -= anInt232;
								if (arg4 != 0) {
									local53 = Class317.anIntArray419[arg4];
									local343 = Class317.anIntArray420[arg4];
									local365 = this.anIntArray31[local45] * local53 + this.anIntArray32[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = this.anIntArray31[local45] * local343 - this.anIntArray32[local45] * local53 + 16383 >> 14;
									this.anIntArray32[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class317.anIntArray419[arg2];
									local343 = Class317.anIntArray420[arg2];
									local365 = this.anIntArray31[local45] * local343 - this.anIntArray35[local45] * local53 + 16383 >> 14;
									this.anIntArray35[local45] = this.anIntArray31[local45] * local53 + this.anIntArray35[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class317.anIntArray419[arg3];
									local343 = Class317.anIntArray420[arg3];
									local365 = this.anIntArray35[local45] * local53 + this.anIntArray32[local45] * local343 + 16383 >> 14;
									this.anIntArray35[local45] = this.anIntArray35[local45] * local343 - this.anIntArray32[local45] * local53 + 16383 >> 14;
									this.anIntArray32[local45] = local365;
								}
								this.anIntArray32[local45] += anInt230;
								this.anIntArray31[local45] += anInt231;
								this.anIntArray35[local45] += anInt232;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray3.length) {
							local228 = this.anIntArrayArray3[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
									local53 = this.anIntArray36[local45];
									local343 = this.anIntArray36[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray11[local365] != 0; local365++) {
										local387 = (this.aShortArray11[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class317.anIntArray419[arg4];
											local426 = Class317.anIntArray420[arg4];
											local430 = this.aShortArray6[local387] * local422 + this.aShortArray2[local387] * local426 + 16383 >> 14;
											this.aShortArray6[local387] = (short) (this.aShortArray6[local387] * local426 - this.aShortArray2[local387] * local422 + 16383 >> 14);
											this.aShortArray2[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class317.anIntArray419[arg2];
											local426 = Class317.anIntArray420[arg2];
											local430 = this.aShortArray6[local387] * local426 - this.aShortArray3[local387] * local422 + 16383 >> 14;
											this.aShortArray3[local387] = (short) (this.aShortArray6[local387] * local422 + this.aShortArray3[local387] * local426 + 16383 >> 14);
											this.aShortArray6[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class317.anIntArray419[arg3];
											local426 = Class317.anIntArray420[arg3];
											local430 = this.aShortArray3[local387] * local422 + this.aShortArray2[local387] * local426 + 16383 >> 14;
											this.aShortArray3[local387] = (short) (this.aShortArray3[local387] * local426 - this.aShortArray2[local387] * local422 + 16383 >> 14);
											this.aShortArray2[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass88_6 == null && this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass88_6 != null) {
						this.aClass88_6.anInterface5_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean48) {
					local343 = arg7[0] * anInt230 + arg7[3] * anInt231 + arg7[6] * anInt232 + 8192 >> 14;
					local365 = arg7[1] * anInt230 + arg7[4] * anInt231 + arg7[7] * anInt232 + 8192 >> 14;
					local387 = arg7[2] * anInt230 + arg7[5] * anInt231 + arg7[8] * anInt232 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt230 = local343;
					anInt231 = local365;
					anInt232 = local387;
					aBoolean48 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class317.anIntArray420[arg2];
				local387 = Class317.anIntArray419[arg2];
				local422 = Class317.anIntArray420[arg3];
				local426 = Class317.anIntArray419[arg3];
				local430 = Class317.anIntArray420[arg4];
				local434 = Class317.anIntArray419[arg4];
				local442 = local387 * local430 + 8192 >> 14;
				local450 = local387 * local434 + 8192 >> 14;
				local410[0] = local422 * local430 + local426 * local450 + 8192 >> 14;
				local410[1] = -local422 * local434 + local426 * local442 + 8192 >> 14;
				local410[2] = local426 * local365 + 8192 >> 14;
				local410[3] = local365 * local434 + 8192 >> 14;
				local410[4] = local365 * local430 + 8192 >> 14;
				local410[5] = -local387;
				local410[6] = -local426 * local430 + local422 * local450 + 8192 >> 14;
				local410[7] = local426 * local434 + local422 * local442 + 8192 >> 14;
				local410[8] = local422 * local365 + 8192 >> 14;
				@Pc(578) int local578 = local410[0] * -anInt230 + local410[1] * -anInt231 + local410[2] * -anInt232 + 8192 >> 14;
				local603 = local410[3] * -anInt230 + local410[4] * -anInt231 + local410[5] * -anInt232 + 8192 >> 14;
				local628 = local410[6] * -anInt230 + local410[7] * -anInt231 + local410[8] * -anInt232 + 8192 >> 14;
				local632 = local578 + anInt230;
				@Pc(636) int local636 = local603 + anInt231;
				local640 = local628 + anInt232;
				@Pc(643) int[] local643 = new int[9];
				for (local645 = 0; local645 < 3; local645++) {
					for (local650 = 0; local650 < 3; local650++) {
						local655 = 0;
						for (@Pc(657) int local657 = 0; local657 < 3; local657++) {
							local655 += local410[local645 * 3 + local657] * arg7[local650 * 3 + local657];
						}
						local643[local645 * 3 + local650] = local655 + 8192 >> 14;
					}
				}
				local645 = local410[0] * local230 + local410[1] * local45 + local410[2] * local53 + 8192 >> 14;
				local650 = local410[3] * local230 + local410[4] * local45 + local410[5] * local53 + 8192 >> 14;
				local655 = local410[6] * local230 + local410[7] * local45 + local410[8] * local53 + 8192 >> 14;
				local645 += local632;
				local650 += local636;
				local655 += local640;
				local777 = new int[9];
				for (local779 = 0; local779 < 3; local779++) {
					for (local784 = 0; local784 < 3; local784++) {
						local789 = 0;
						for (local791 = 0; local791 < 3; local791++) {
							local789 += arg7[local779 * 3 + local791] * local643[local784 + local791 * 3];
						}
						local777[local779 * 3 + local784] = local789 + 8192 >> 14;
					}
				}
				local779 = arg7[0] * local645 + arg7[1] * local650 + arg7[2] * local655 + 8192 >> 14;
				local784 = arg7[3] * local645 + arg7[4] * local650 + arg7[5] * local655 + 8192 >> 14;
				local789 = arg7[6] * local645 + arg7[7] * local650 + arg7[8] * local655 + 8192 >> 14;
				local779 += local18;
				local784 += local26;
				local789 += local33;
				for (local791 = 0; local791 < local2; local791++) {
					local917 = arg1[local791];
					if (local917 < this.anIntArrayArray3.length) {
						@Pc(927) int[] local927 = this.anIntArrayArray3[local917];
						for (@Pc(929) int local929 = 0; local929 < local927.length; local929++) {
							@Pc(937) int local937 = local927[local929];
							if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local937]) != 0) {
								@Pc(979) int local979 = local777[0] * this.anIntArray32[local937] + local777[1] * this.anIntArray31[local937] + local777[2] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray32[local937] + local777[4] * this.anIntArray31[local937] + local777[5] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray32[local937] + local777[7] * this.anIntArray31[local937] + local777[8] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray32[local937] = local1045;
								this.anIntArray31[local937] = local1049;
								this.anIntArray35[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class120 local2452;
			@Pc(2457) Class86 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray5 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray5.length) {
							local228 = this.anIntArrayArray5[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray1 == null || (arg6 & this.aShortArray1[local45]) != 0) {
									local53 = (this.aByteArray5[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray5[local45] = (byte) local53;
									if (this.aClass88_8 != null) {
										this.aClass88_8.anInterface5_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass120Array1 != null) {
						for (local18 = 0; local18 < this.anInt229; local18++) {
							local2452 = this.aClass120Array1[local18];
							local2457 = this.aClass86Array1[local18];
							local2457.anInt2930 = local2457.anInt2930 & 0xFFFFFF | 255 - (this.aByteArray5[local2452.anInt3208] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class86 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local228 = this.anIntArrayArray4[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass86Array1[local228[local230]];
									local2686.anInt2932 += arg2;
									local2686.anInt2931 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local228 = this.anIntArrayArray4[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass86Array1[local228[local230]];
									local2686.anInt2928 = local2686.anInt2928 * arg2 >> 7;
									local2686.anInt2929 = local2686.anInt2929 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray4 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray4.length) {
							local228 = this.anIntArrayArray4[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local2686 = this.aClass86Array1[local228[local230]];
								local2686.anInt2927 = local2686.anInt2927 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray5 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray5.length) {
						local228 = this.anIntArrayArray5[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray1 == null || (arg6 & this.aShortArray1[local45]) != 0) {
								local53 = this.aShortArray4[local45] & 0xFFFF;
								local343 = local53 >> 10 & 0x3F;
								local365 = local53 >> 7 & 0x7;
								local387 = local53 & 0x7F;
								@Pc(2553) int local2553 = local343 + arg2 & 0x3F;
								local365 += arg3 / 4;
								if (local365 < 0) {
									local365 = 0;
								} else if (local365 > 7) {
									local365 = 7;
								}
								local387 += arg4;
								if (local387 < 0) {
									local387 = 0;
								} else if (local387 > 127) {
									local387 = 127;
								}
								this.aShortArray4[local45] = (short) (local2553 << 10 | local365 << 7 | local387);
								if (this.aClass88_8 != null) {
									this.aClass88_8.anInterface5_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass120Array1 != null) {
					for (local18 = 0; local18 < this.anInt229; local18++) {
						local2452 = this.aClass120Array1[local18];
						local2457 = this.aClass86Array1[local18];
						local2457.anInt2930 = local2457.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local2452.anInt3208] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local228 = this.anIntArrayArray3[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
							this.anIntArray32[local45] -= anInt230;
							this.anIntArray31[local45] -= anInt231;
							this.anIntArray35[local45] -= anInt232;
							this.anIntArray32[local45] = this.anIntArray32[local45] * arg2 >> 7;
							this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
							this.anIntArray35[local45] = this.anIntArray35[local45] * arg4 >> 7;
							this.anIntArray32[local45] += anInt230;
							this.anIntArray31[local45] += anInt231;
							this.anIntArray35[local45] += anInt232;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local26 = arg7[10] << 4;
			local33 = arg7[11] << 4;
			local230 = arg7[12] << 4;
			local45 = arg7[13] << 4;
			local53 = arg7[14] << 4;
			if (aBoolean48) {
				local343 = arg7[0] * anInt230 + arg7[3] * anInt231 + arg7[6] * anInt232 + 8192 >> 14;
				local365 = arg7[1] * anInt230 + arg7[4] * anInt231 + arg7[7] * anInt232 + 8192 >> 14;
				local387 = arg7[2] * anInt230 + arg7[5] * anInt231 + arg7[8] * anInt232 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt230 = local343;
				anInt231 = local365;
				anInt232 = local387;
				aBoolean48 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt230 + 8192 >> 14;
			local426 = local365 * -anInt231 + 8192 >> 14;
			local430 = local387 * -anInt232 + 8192 >> 14;
			local434 = local422 + anInt230;
			local442 = local426 + anInt231;
			local450 = local430 + anInt232;
			@Pc(1782) int[] local1782 = new int[] { local343 * arg7[0] + 8192 >> 14, local343 * arg7[3] + 8192 >> 14, local343 * arg7[6] + 8192 >> 14, local365 * arg7[1] + 8192 >> 14, local365 * arg7[4] + 8192 >> 14, local365 * arg7[7] + 8192 >> 14, local387 * arg7[2] + 8192 >> 14, local387 * arg7[5] + 8192 >> 14, local387 * arg7[8] + 8192 >> 14 };
			local603 = local343 * local230 + 8192 >> 14;
			local628 = local365 * local45 + 8192 >> 14;
			local632 = local387 * local53 + 8192 >> 14;
			@Pc(1918) int local1918 = local603 + local434;
			@Pc(1922) int local1922 = local628 + local442;
			@Pc(1926) int local1926 = local632 + local450;
			@Pc(1929) int[] local1929 = new int[9];
			@Pc(1936) int local1936;
			for (local640 = 0; local640 < 3; local640++) {
				for (local1936 = 0; local1936 < 3; local1936++) {
					local645 = 0;
					for (local650 = 0; local650 < 3; local650++) {
						local645 += arg7[local640 * 3 + local650] * local1782[local1936 + local650 * 3];
					}
					local1929[local640 * 3 + local1936] = local645 + 8192 >> 14;
				}
			}
			local640 = arg7[0] * local1918 + arg7[1] * local1922 + arg7[2] * local1926 + 8192 >> 14;
			local1936 = arg7[3] * local1918 + arg7[4] * local1922 + arg7[5] * local1926 + 8192 >> 14;
			local645 = arg7[6] * local1918 + arg7[7] * local1922 + arg7[8] * local1926 + 8192 >> 14;
			local640 += local18;
			local1936 += local26;
			local645 += local33;
			for (local650 = 0; local650 < local2; local650++) {
				local655 = arg1[local650];
				if (local655 < this.anIntArrayArray3.length) {
					local777 = this.anIntArrayArray3[local655];
					for (local779 = 0; local779 < local777.length; local779++) {
						local784 = local777[local779];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local784]) != 0) {
							local789 = local1929[0] * this.anIntArray32[local784] + local1929[1] * this.anIntArray31[local784] + local1929[2] * this.anIntArray35[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray32[local784] + local1929[4] * this.anIntArray31[local784] + local1929[5] * this.anIntArray35[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray32[local784] + local1929[7] * this.anIntArray31[local784] + local1929[8] * this.anIntArray35[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray32[local784] = local2197;
							this.anIntArray31[local784] = local2201;
							this.anIntArray35[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "df", descriptor = "(I[IIIIZI[I)V", line = 1578)
	@Override
	void method5505(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(53) int local53;
		@Pc(33) int local33;
		@Pc(45) int local45;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			anInt230 = 0;
			anInt231 = 0;
			anInt232 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray3.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray3[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local53]) != 0) {
							anInt230 += this.anIntArray32[local53];
							anInt231 += this.anIntArray31[local53];
							anInt232 += this.anIntArray35[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt230 = anInt230 / local18 + arg2;
				anInt231 = anInt231 / local18 + arg3;
				anInt232 = anInt232 / local18 + arg4;
				aBoolean48 = true;
			} else {
				anInt230 = arg2;
				anInt231 = arg3;
				anInt232 = arg4;
			}
			return;
		}
		@Pc(228) int[] local228;
		@Pc(230) int local230;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local26 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local33 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local26;
				arg4 = local33;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local228 = this.anIntArrayArray3[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
							this.anIntArray32[local45] += arg2;
							this.anIntArray31[local45] += arg3;
							this.anIntArray35[local45] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(343) int local343;
		@Pc(365) int local365;
		@Pc(387) int local387;
		@Pc(422) int local422;
		@Pc(426) int local426;
		@Pc(430) int local430;
		@Pc(434) int local434;
		@Pc(442) int local442;
		@Pc(450) int local450;
		@Pc(603) int local603;
		@Pc(628) int local628;
		@Pc(632) int local632;
		@Pc(640) int local640;
		@Pc(645) int local645;
		@Pc(650) int local650;
		@Pc(655) int local655;
		@Pc(777) int[] local777;
		@Pc(779) int local779;
		@Pc(784) int local784;
		@Pc(789) int local789;
		@Pc(791) int local791;
		@Pc(917) int local917;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray3.length) {
						local228 = this.anIntArrayArray3[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
								this.anIntArray32[local45] -= anInt230;
								this.anIntArray31[local45] -= anInt231;
								this.anIntArray35[local45] -= anInt232;
								if (arg4 != 0) {
									local53 = Class317.anIntArray419[arg4];
									local343 = Class317.anIntArray420[arg4];
									local365 = this.anIntArray31[local45] * local53 + this.anIntArray32[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = this.anIntArray31[local45] * local343 - this.anIntArray32[local45] * local53 + 16383 >> 14;
									this.anIntArray32[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class317.anIntArray419[arg2];
									local343 = Class317.anIntArray420[arg2];
									local365 = this.anIntArray31[local45] * local343 - this.anIntArray35[local45] * local53 + 16383 >> 14;
									this.anIntArray35[local45] = this.anIntArray31[local45] * local53 + this.anIntArray35[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class317.anIntArray419[arg3];
									local343 = Class317.anIntArray420[arg3];
									local365 = this.anIntArray35[local45] * local53 + this.anIntArray32[local45] * local343 + 16383 >> 14;
									this.anIntArray35[local45] = this.anIntArray35[local45] * local343 - this.anIntArray32[local45] * local53 + 16383 >> 14;
									this.anIntArray32[local45] = local365;
								}
								this.anIntArray32[local45] += anInt230;
								this.anIntArray31[local45] += anInt231;
								this.anIntArray35[local45] += anInt232;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray3.length) {
							local228 = this.anIntArrayArray3[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
									local53 = this.anIntArray36[local45];
									local343 = this.anIntArray36[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray11[local365] != 0; local365++) {
										local387 = (this.aShortArray11[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class317.anIntArray419[arg4];
											local426 = Class317.anIntArray420[arg4];
											local430 = this.aShortArray6[local387] * local422 + this.aShortArray2[local387] * local426 + 16383 >> 14;
											this.aShortArray6[local387] = (short) (this.aShortArray6[local387] * local426 - this.aShortArray2[local387] * local422 + 16383 >> 14);
											this.aShortArray2[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class317.anIntArray419[arg2];
											local426 = Class317.anIntArray420[arg2];
											local430 = this.aShortArray6[local387] * local426 - this.aShortArray3[local387] * local422 + 16383 >> 14;
											this.aShortArray3[local387] = (short) (this.aShortArray6[local387] * local422 + this.aShortArray3[local387] * local426 + 16383 >> 14);
											this.aShortArray6[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class317.anIntArray419[arg3];
											local426 = Class317.anIntArray420[arg3];
											local430 = this.aShortArray3[local387] * local422 + this.aShortArray2[local387] * local426 + 16383 >> 14;
											this.aShortArray3[local387] = (short) (this.aShortArray3[local387] * local426 - this.aShortArray2[local387] * local422 + 16383 >> 14);
											this.aShortArray2[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass88_6 == null && this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass88_6 != null) {
						this.aClass88_6.anInterface5_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean48) {
					local343 = arg7[0] * anInt230 + arg7[3] * anInt231 + arg7[6] * anInt232 + 8192 >> 14;
					local365 = arg7[1] * anInt230 + arg7[4] * anInt231 + arg7[7] * anInt232 + 8192 >> 14;
					local387 = arg7[2] * anInt230 + arg7[5] * anInt231 + arg7[8] * anInt232 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt230 = local343;
					anInt231 = local365;
					anInt232 = local387;
					aBoolean48 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class317.anIntArray420[arg2];
				local387 = Class317.anIntArray419[arg2];
				local422 = Class317.anIntArray420[arg3];
				local426 = Class317.anIntArray419[arg3];
				local430 = Class317.anIntArray420[arg4];
				local434 = Class317.anIntArray419[arg4];
				local442 = local387 * local430 + 8192 >> 14;
				local450 = local387 * local434 + 8192 >> 14;
				local410[0] = local422 * local430 + local426 * local450 + 8192 >> 14;
				local410[1] = -local422 * local434 + local426 * local442 + 8192 >> 14;
				local410[2] = local426 * local365 + 8192 >> 14;
				local410[3] = local365 * local434 + 8192 >> 14;
				local410[4] = local365 * local430 + 8192 >> 14;
				local410[5] = -local387;
				local410[6] = -local426 * local430 + local422 * local450 + 8192 >> 14;
				local410[7] = local426 * local434 + local422 * local442 + 8192 >> 14;
				local410[8] = local422 * local365 + 8192 >> 14;
				@Pc(578) int local578 = local410[0] * -anInt230 + local410[1] * -anInt231 + local410[2] * -anInt232 + 8192 >> 14;
				local603 = local410[3] * -anInt230 + local410[4] * -anInt231 + local410[5] * -anInt232 + 8192 >> 14;
				local628 = local410[6] * -anInt230 + local410[7] * -anInt231 + local410[8] * -anInt232 + 8192 >> 14;
				local632 = local578 + anInt230;
				@Pc(636) int local636 = local603 + anInt231;
				local640 = local628 + anInt232;
				@Pc(643) int[] local643 = new int[9];
				for (local645 = 0; local645 < 3; local645++) {
					for (local650 = 0; local650 < 3; local650++) {
						local655 = 0;
						for (@Pc(657) int local657 = 0; local657 < 3; local657++) {
							local655 += local410[local645 * 3 + local657] * arg7[local650 * 3 + local657];
						}
						local643[local645 * 3 + local650] = local655 + 8192 >> 14;
					}
				}
				local645 = local410[0] * local230 + local410[1] * local45 + local410[2] * local53 + 8192 >> 14;
				local650 = local410[3] * local230 + local410[4] * local45 + local410[5] * local53 + 8192 >> 14;
				local655 = local410[6] * local230 + local410[7] * local45 + local410[8] * local53 + 8192 >> 14;
				local645 += local632;
				local650 += local636;
				local655 += local640;
				local777 = new int[9];
				for (local779 = 0; local779 < 3; local779++) {
					for (local784 = 0; local784 < 3; local784++) {
						local789 = 0;
						for (local791 = 0; local791 < 3; local791++) {
							local789 += arg7[local779 * 3 + local791] * local643[local784 + local791 * 3];
						}
						local777[local779 * 3 + local784] = local789 + 8192 >> 14;
					}
				}
				local779 = arg7[0] * local645 + arg7[1] * local650 + arg7[2] * local655 + 8192 >> 14;
				local784 = arg7[3] * local645 + arg7[4] * local650 + arg7[5] * local655 + 8192 >> 14;
				local789 = arg7[6] * local645 + arg7[7] * local650 + arg7[8] * local655 + 8192 >> 14;
				local779 += local18;
				local784 += local26;
				local789 += local33;
				for (local791 = 0; local791 < local2; local791++) {
					local917 = arg1[local791];
					if (local917 < this.anIntArrayArray3.length) {
						@Pc(927) int[] local927 = this.anIntArrayArray3[local917];
						for (@Pc(929) int local929 = 0; local929 < local927.length; local929++) {
							@Pc(937) int local937 = local927[local929];
							if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local937]) != 0) {
								@Pc(979) int local979 = local777[0] * this.anIntArray32[local937] + local777[1] * this.anIntArray31[local937] + local777[2] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray32[local937] + local777[4] * this.anIntArray31[local937] + local777[5] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray32[local937] + local777[7] * this.anIntArray31[local937] + local777[8] * this.anIntArray35[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray32[local937] = local1045;
								this.anIntArray31[local937] = local1049;
								this.anIntArray35[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class120 local2452;
			@Pc(2457) Class86 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray5 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray5.length) {
							local228 = this.anIntArrayArray5[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray1 == null || (arg6 & this.aShortArray1[local45]) != 0) {
									local53 = (this.aByteArray5[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray5[local45] = (byte) local53;
									if (this.aClass88_8 != null) {
										this.aClass88_8.anInterface5_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass120Array1 != null) {
						for (local18 = 0; local18 < this.anInt229; local18++) {
							local2452 = this.aClass120Array1[local18];
							local2457 = this.aClass86Array1[local18];
							local2457.anInt2930 = local2457.anInt2930 & 0xFFFFFF | 255 - (this.aByteArray5[local2452.anInt3208] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class86 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local228 = this.anIntArrayArray4[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass86Array1[local228[local230]];
									local2686.anInt2932 += arg2;
									local2686.anInt2931 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local228 = this.anIntArrayArray4[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass86Array1[local228[local230]];
									local2686.anInt2928 = local2686.anInt2928 * arg2 >> 7;
									local2686.anInt2929 = local2686.anInt2929 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray4 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray4.length) {
							local228 = this.anIntArrayArray4[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local2686 = this.aClass86Array1[local228[local230]];
								local2686.anInt2927 = local2686.anInt2927 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray5 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray5.length) {
						local228 = this.anIntArrayArray5[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray1 == null || (arg6 & this.aShortArray1[local45]) != 0) {
								local53 = this.aShortArray4[local45] & 0xFFFF;
								local343 = local53 >> 10 & 0x3F;
								local365 = local53 >> 7 & 0x7;
								local387 = local53 & 0x7F;
								@Pc(2553) int local2553 = local343 + arg2 & 0x3F;
								local365 += arg3 / 4;
								if (local365 < 0) {
									local365 = 0;
								} else if (local365 > 7) {
									local365 = 7;
								}
								local387 += arg4;
								if (local387 < 0) {
									local387 = 0;
								} else if (local387 > 127) {
									local387 = 127;
								}
								this.aShortArray4[local45] = (short) (local2553 << 10 | local365 << 7 | local387);
								if (this.aClass88_8 != null) {
									this.aClass88_8.anInterface5_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass120Array1 != null) {
					for (local18 = 0; local18 < this.anInt229; local18++) {
						local2452 = this.aClass120Array1[local18];
						local2457 = this.aClass86Array1[local18];
						local2457.anInt2930 = local2457.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local2452.anInt3208] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local228 = this.anIntArrayArray3[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local45]) != 0) {
							this.anIntArray32[local45] -= anInt230;
							this.anIntArray31[local45] -= anInt231;
							this.anIntArray35[local45] -= anInt232;
							this.anIntArray32[local45] = this.anIntArray32[local45] * arg2 >> 7;
							this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
							this.anIntArray35[local45] = this.anIntArray35[local45] * arg4 >> 7;
							this.anIntArray32[local45] += anInt230;
							this.anIntArray31[local45] += anInt231;
							this.anIntArray35[local45] += anInt232;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local26 = arg7[10] << 4;
			local33 = arg7[11] << 4;
			local230 = arg7[12] << 4;
			local45 = arg7[13] << 4;
			local53 = arg7[14] << 4;
			if (aBoolean48) {
				local343 = arg7[0] * anInt230 + arg7[3] * anInt231 + arg7[6] * anInt232 + 8192 >> 14;
				local365 = arg7[1] * anInt230 + arg7[4] * anInt231 + arg7[7] * anInt232 + 8192 >> 14;
				local387 = arg7[2] * anInt230 + arg7[5] * anInt231 + arg7[8] * anInt232 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt230 = local343;
				anInt231 = local365;
				anInt232 = local387;
				aBoolean48 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt230 + 8192 >> 14;
			local426 = local365 * -anInt231 + 8192 >> 14;
			local430 = local387 * -anInt232 + 8192 >> 14;
			local434 = local422 + anInt230;
			local442 = local426 + anInt231;
			local450 = local430 + anInt232;
			@Pc(1782) int[] local1782 = new int[] { local343 * arg7[0] + 8192 >> 14, local343 * arg7[3] + 8192 >> 14, local343 * arg7[6] + 8192 >> 14, local365 * arg7[1] + 8192 >> 14, local365 * arg7[4] + 8192 >> 14, local365 * arg7[7] + 8192 >> 14, local387 * arg7[2] + 8192 >> 14, local387 * arg7[5] + 8192 >> 14, local387 * arg7[8] + 8192 >> 14 };
			local603 = local343 * local230 + 8192 >> 14;
			local628 = local365 * local45 + 8192 >> 14;
			local632 = local387 * local53 + 8192 >> 14;
			@Pc(1918) int local1918 = local603 + local434;
			@Pc(1922) int local1922 = local628 + local442;
			@Pc(1926) int local1926 = local632 + local450;
			@Pc(1929) int[] local1929 = new int[9];
			@Pc(1936) int local1936;
			for (local640 = 0; local640 < 3; local640++) {
				for (local1936 = 0; local1936 < 3; local1936++) {
					local645 = 0;
					for (local650 = 0; local650 < 3; local650++) {
						local645 += arg7[local640 * 3 + local650] * local1782[local1936 + local650 * 3];
					}
					local1929[local640 * 3 + local1936] = local645 + 8192 >> 14;
				}
			}
			local640 = arg7[0] * local1918 + arg7[1] * local1922 + arg7[2] * local1926 + 8192 >> 14;
			local1936 = arg7[3] * local1918 + arg7[4] * local1922 + arg7[5] * local1926 + 8192 >> 14;
			local645 = arg7[6] * local1918 + arg7[7] * local1922 + arg7[8] * local1926 + 8192 >> 14;
			local640 += local18;
			local1936 += local26;
			local645 += local33;
			for (local650 = 0; local650 < local2; local650++) {
				local655 = arg1[local650];
				if (local655 < this.anIntArrayArray3.length) {
					local777 = this.anIntArrayArray3[local655];
					for (local779 = 0; local779 < local777.length; local779++) {
						local784 = local777[local779];
						if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local784]) != 0) {
							local789 = local1929[0] * this.anIntArray32[local784] + local1929[1] * this.anIntArray31[local784] + local1929[2] * this.anIntArray35[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray32[local784] + local1929[4] * this.anIntArray31[local784] + local1929[5] * this.anIntArray35[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray32[local784] + local1929[7] * this.anIntArray31[local784] + local1929[8] * this.anIntArray35[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray32[local784] = local2197;
							this.anIntArray31[local784] = local2201;
							this.anIntArray35[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "dh", descriptor = "(IIII)V", line = 2035)
	@Override
	void method5425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			anInt230 = 0;
			anInt231 = 0;
			anInt232 = 0;
			for (local11 = 0; local11 < this.anInt221; local11++) {
				anInt230 += this.anIntArray32[local11];
				anInt231 += this.anIntArray31[local11];
				anInt232 += this.anIntArray35[local11];
				local3++;
			}
			if (local3 > 0) {
				anInt230 = anInt230 / local3 + arg1;
				anInt231 = anInt231 / local3 + arg2;
				anInt232 = anInt232 / local3 + arg3;
			} else {
				anInt230 = arg1;
				anInt231 = arg2;
				anInt232 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt221; local3++) {
				this.anIntArray32[local3] += arg1;
				this.anIntArray31[local3] += arg2;
				this.anIntArray35[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt221; local3++) {
					this.anIntArray32[local3] -= anInt230;
					this.anIntArray31[local3] -= anInt231;
					this.anIntArray35[local3] -= anInt232;
					if (arg3 != 0) {
						local11 = Class317.anIntArray419[arg3];
						local146 = Class317.anIntArray420[arg3];
						local164 = this.anIntArray31[local3] * local11 + this.anIntArray32[local3] * local146 + 16383 >> 14;
						this.anIntArray31[local3] = this.anIntArray31[local3] * local146 - this.anIntArray32[local3] * local11 + 16383 >> 14;
						this.anIntArray32[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class317.anIntArray419[arg1];
						local146 = Class317.anIntArray420[arg1];
						local164 = this.anIntArray31[local3] * local146 - this.anIntArray35[local3] * local11 + 16383 >> 14;
						this.anIntArray35[local3] = this.anIntArray31[local3] * local11 + this.anIntArray35[local3] * local146 + 16383 >> 14;
						this.anIntArray31[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class317.anIntArray419[arg2];
						local146 = Class317.anIntArray420[arg2];
						local164 = this.anIntArray35[local3] * local11 + this.anIntArray32[local3] * local146 + 16383 >> 14;
						this.anIntArray35[local3] = this.anIntArray35[local3] * local146 - this.anIntArray32[local3] * local11 + 16383 >> 14;
						this.anIntArray32[local3] = local164;
					}
					this.anIntArray32[local3] += anInt230;
					this.anIntArray31[local3] += anInt231;
					this.anIntArray35[local3] += anInt232;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt221; local3++) {
					this.anIntArray32[local3] -= anInt230;
					this.anIntArray31[local3] -= anInt231;
					this.anIntArray35[local3] -= anInt232;
					this.anIntArray32[local3] = this.anIntArray32[local3] * arg1 / 128;
					this.anIntArray31[local3] = this.anIntArray31[local3] * arg2 / 128;
					this.anIntArray35[local3] = this.anIntArray35[local3] * arg3 / 128;
					this.anIntArray32[local3] += anInt230;
					this.anIntArray31[local3] += anInt231;
					this.anIntArray35[local3] += anInt232;
				}
			} else {
				@Pc(480) Class120 local480;
				@Pc(485) Class86 local485;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt223; local3++) {
						local11 = (this.aByteArray5[local3] & 0xFF) + arg1 * 8;
						if (local11 < 0) {
							local11 = 0;
						} else if (local11 > 255) {
							local11 = 255;
						}
						this.aByteArray5[local3] = (byte) local11;
					}
					if (this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass120Array1 != null) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local480 = this.aClass120Array1[local3];
							local485 = this.aClass86Array1[local3];
							local485.anInt2930 = local485.anInt2930 & 0xFFFFFF | 255 - (this.aByteArray5[local480.anInt3208] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt223; local3++) {
						local11 = this.aShortArray4[local3] & 0xFFFF;
						local146 = local11 >> 10 & 0x3F;
						local164 = local11 >> 7 & 0x7;
						@Pc(538) int local538 = local11 & 0x7F;
						@Pc(544) int local544 = local146 + arg1 & 0x3F;
						local164 += arg2 / 4;
						if (local164 < 0) {
							local164 = 0;
						} else if (local164 > 7) {
							local164 = 7;
						}
						local538 += arg3;
						if (local538 < 0) {
							local538 = 0;
						} else if (local538 > 127) {
							local538 = 127;
						}
						this.aShortArray4[local3] = (short) (local544 << 10 | local164 << 7 | local538);
					}
					if (this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass120Array1 != null) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local480 = this.aClass120Array1[local3];
							local485 = this.aClass86Array1[local3];
							local485.anInt2930 = local485.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local480.anInt3208] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(651) Class86 local651;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2932 += arg1;
							local651.anInt2931 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2928 = local651.anInt2928 * arg1 >> 7;
							local651.anInt2929 = local651.anInt2929 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2927 = local651.anInt2927 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "ah", descriptor = "(IIII)V", line = 2035)
	@Override
	void method5349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			anInt230 = 0;
			anInt231 = 0;
			anInt232 = 0;
			for (local11 = 0; local11 < this.anInt221; local11++) {
				anInt230 += this.anIntArray32[local11];
				anInt231 += this.anIntArray31[local11];
				anInt232 += this.anIntArray35[local11];
				local3++;
			}
			if (local3 > 0) {
				anInt230 = anInt230 / local3 + arg1;
				anInt231 = anInt231 / local3 + arg2;
				anInt232 = anInt232 / local3 + arg3;
			} else {
				anInt230 = arg1;
				anInt231 = arg2;
				anInt232 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt221; local3++) {
				this.anIntArray32[local3] += arg1;
				this.anIntArray31[local3] += arg2;
				this.anIntArray35[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt221; local3++) {
					this.anIntArray32[local3] -= anInt230;
					this.anIntArray31[local3] -= anInt231;
					this.anIntArray35[local3] -= anInt232;
					if (arg3 != 0) {
						local11 = Class317.anIntArray419[arg3];
						local146 = Class317.anIntArray420[arg3];
						local164 = this.anIntArray31[local3] * local11 + this.anIntArray32[local3] * local146 + 16383 >> 14;
						this.anIntArray31[local3] = this.anIntArray31[local3] * local146 - this.anIntArray32[local3] * local11 + 16383 >> 14;
						this.anIntArray32[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class317.anIntArray419[arg1];
						local146 = Class317.anIntArray420[arg1];
						local164 = this.anIntArray31[local3] * local146 - this.anIntArray35[local3] * local11 + 16383 >> 14;
						this.anIntArray35[local3] = this.anIntArray31[local3] * local11 + this.anIntArray35[local3] * local146 + 16383 >> 14;
						this.anIntArray31[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class317.anIntArray419[arg2];
						local146 = Class317.anIntArray420[arg2];
						local164 = this.anIntArray35[local3] * local11 + this.anIntArray32[local3] * local146 + 16383 >> 14;
						this.anIntArray35[local3] = this.anIntArray35[local3] * local146 - this.anIntArray32[local3] * local11 + 16383 >> 14;
						this.anIntArray32[local3] = local164;
					}
					this.anIntArray32[local3] += anInt230;
					this.anIntArray31[local3] += anInt231;
					this.anIntArray35[local3] += anInt232;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt221; local3++) {
					this.anIntArray32[local3] -= anInt230;
					this.anIntArray31[local3] -= anInt231;
					this.anIntArray35[local3] -= anInt232;
					this.anIntArray32[local3] = this.anIntArray32[local3] * arg1 / 128;
					this.anIntArray31[local3] = this.anIntArray31[local3] * arg2 / 128;
					this.anIntArray35[local3] = this.anIntArray35[local3] * arg3 / 128;
					this.anIntArray32[local3] += anInt230;
					this.anIntArray31[local3] += anInt231;
					this.anIntArray35[local3] += anInt232;
				}
			} else {
				@Pc(480) Class120 local480;
				@Pc(485) Class86 local485;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt223; local3++) {
						local11 = (this.aByteArray5[local3] & 0xFF) + arg1 * 8;
						if (local11 < 0) {
							local11 = 0;
						} else if (local11 > 255) {
							local11 = 255;
						}
						this.aByteArray5[local3] = (byte) local11;
					}
					if (this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass120Array1 != null) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local480 = this.aClass120Array1[local3];
							local485 = this.aClass86Array1[local3];
							local485.anInt2930 = local485.anInt2930 & 0xFFFFFF | 255 - (this.aByteArray5[local480.anInt3208] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt223; local3++) {
						local11 = this.aShortArray4[local3] & 0xFFFF;
						local146 = local11 >> 10 & 0x3F;
						local164 = local11 >> 7 & 0x7;
						@Pc(538) int local538 = local11 & 0x7F;
						@Pc(544) int local544 = local146 + arg1 & 0x3F;
						local164 += arg2 / 4;
						if (local164 < 0) {
							local164 = 0;
						} else if (local164 > 7) {
							local164 = 7;
						}
						local538 += arg3;
						if (local538 < 0) {
							local538 = 0;
						} else if (local538 > 127) {
							local538 = 127;
						}
						this.aShortArray4[local3] = (short) (local544 << 10 | local164 << 7 | local538);
					}
					if (this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass120Array1 != null) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local480 = this.aClass120Array1[local3];
							local485 = this.aClass86Array1[local3];
							local485.anInt2930 = local485.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local480.anInt3208] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(651) Class86 local651;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2932 += arg1;
							local651.anInt2931 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2928 = local651.anInt2928 * arg1 >> 7;
							local651.anInt2929 = local651.anInt2929 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2927 = local651.anInt2927 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "dk", descriptor = "(IIII)V", line = 2035)
	@Override
	void method5428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			anInt230 = 0;
			anInt231 = 0;
			anInt232 = 0;
			for (local11 = 0; local11 < this.anInt221; local11++) {
				anInt230 += this.anIntArray32[local11];
				anInt231 += this.anIntArray31[local11];
				anInt232 += this.anIntArray35[local11];
				local3++;
			}
			if (local3 > 0) {
				anInt230 = anInt230 / local3 + arg1;
				anInt231 = anInt231 / local3 + arg2;
				anInt232 = anInt232 / local3 + arg3;
			} else {
				anInt230 = arg1;
				anInt231 = arg2;
				anInt232 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt221; local3++) {
				this.anIntArray32[local3] += arg1;
				this.anIntArray31[local3] += arg2;
				this.anIntArray35[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt221; local3++) {
					this.anIntArray32[local3] -= anInt230;
					this.anIntArray31[local3] -= anInt231;
					this.anIntArray35[local3] -= anInt232;
					if (arg3 != 0) {
						local11 = Class317.anIntArray419[arg3];
						local146 = Class317.anIntArray420[arg3];
						local164 = this.anIntArray31[local3] * local11 + this.anIntArray32[local3] * local146 + 16383 >> 14;
						this.anIntArray31[local3] = this.anIntArray31[local3] * local146 - this.anIntArray32[local3] * local11 + 16383 >> 14;
						this.anIntArray32[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class317.anIntArray419[arg1];
						local146 = Class317.anIntArray420[arg1];
						local164 = this.anIntArray31[local3] * local146 - this.anIntArray35[local3] * local11 + 16383 >> 14;
						this.anIntArray35[local3] = this.anIntArray31[local3] * local11 + this.anIntArray35[local3] * local146 + 16383 >> 14;
						this.anIntArray31[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class317.anIntArray419[arg2];
						local146 = Class317.anIntArray420[arg2];
						local164 = this.anIntArray35[local3] * local11 + this.anIntArray32[local3] * local146 + 16383 >> 14;
						this.anIntArray35[local3] = this.anIntArray35[local3] * local146 - this.anIntArray32[local3] * local11 + 16383 >> 14;
						this.anIntArray32[local3] = local164;
					}
					this.anIntArray32[local3] += anInt230;
					this.anIntArray31[local3] += anInt231;
					this.anIntArray35[local3] += anInt232;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt221; local3++) {
					this.anIntArray32[local3] -= anInt230;
					this.anIntArray31[local3] -= anInt231;
					this.anIntArray35[local3] -= anInt232;
					this.anIntArray32[local3] = this.anIntArray32[local3] * arg1 / 128;
					this.anIntArray31[local3] = this.anIntArray31[local3] * arg2 / 128;
					this.anIntArray35[local3] = this.anIntArray35[local3] * arg3 / 128;
					this.anIntArray32[local3] += anInt230;
					this.anIntArray31[local3] += anInt231;
					this.anIntArray35[local3] += anInt232;
				}
			} else {
				@Pc(480) Class120 local480;
				@Pc(485) Class86 local485;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt223; local3++) {
						local11 = (this.aByteArray5[local3] & 0xFF) + arg1 * 8;
						if (local11 < 0) {
							local11 = 0;
						} else if (local11 > 255) {
							local11 = 255;
						}
						this.aByteArray5[local3] = (byte) local11;
					}
					if (this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass120Array1 != null) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local480 = this.aClass120Array1[local3];
							local485 = this.aClass86Array1[local3];
							local485.anInt2930 = local485.anInt2930 & 0xFFFFFF | 255 - (this.aByteArray5[local480.anInt3208] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt223; local3++) {
						local11 = this.aShortArray4[local3] & 0xFFFF;
						local146 = local11 >> 10 & 0x3F;
						local164 = local11 >> 7 & 0x7;
						@Pc(538) int local538 = local11 & 0x7F;
						@Pc(544) int local544 = local146 + arg1 & 0x3F;
						local164 += arg2 / 4;
						if (local164 < 0) {
							local164 = 0;
						} else if (local164 > 7) {
							local164 = 7;
						}
						local538 += arg3;
						if (local538 < 0) {
							local538 = 0;
						} else if (local538 > 127) {
							local538 = 127;
						}
						this.aShortArray4[local3] = (short) (local544 << 10 | local164 << 7 | local538);
					}
					if (this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass120Array1 != null) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local480 = this.aClass120Array1[local3];
							local485 = this.aClass86Array1[local3];
							local485.anInt2930 = local485.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local480.anInt3208] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(651) Class86 local651;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2932 += arg1;
							local651.anInt2931 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2928 = local651.anInt2928 * arg1 >> 7;
							local651.anInt2929 = local651.anInt2929 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2927 = local651.anInt2927 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "db", descriptor = "(IIII)V", line = 2035)
	@Override
	void method5426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			anInt230 = 0;
			anInt231 = 0;
			anInt232 = 0;
			for (local11 = 0; local11 < this.anInt221; local11++) {
				anInt230 += this.anIntArray32[local11];
				anInt231 += this.anIntArray31[local11];
				anInt232 += this.anIntArray35[local11];
				local3++;
			}
			if (local3 > 0) {
				anInt230 = anInt230 / local3 + arg1;
				anInt231 = anInt231 / local3 + arg2;
				anInt232 = anInt232 / local3 + arg3;
			} else {
				anInt230 = arg1;
				anInt231 = arg2;
				anInt232 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt221; local3++) {
				this.anIntArray32[local3] += arg1;
				this.anIntArray31[local3] += arg2;
				this.anIntArray35[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt221; local3++) {
					this.anIntArray32[local3] -= anInt230;
					this.anIntArray31[local3] -= anInt231;
					this.anIntArray35[local3] -= anInt232;
					if (arg3 != 0) {
						local11 = Class317.anIntArray419[arg3];
						local146 = Class317.anIntArray420[arg3];
						local164 = this.anIntArray31[local3] * local11 + this.anIntArray32[local3] * local146 + 16383 >> 14;
						this.anIntArray31[local3] = this.anIntArray31[local3] * local146 - this.anIntArray32[local3] * local11 + 16383 >> 14;
						this.anIntArray32[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class317.anIntArray419[arg1];
						local146 = Class317.anIntArray420[arg1];
						local164 = this.anIntArray31[local3] * local146 - this.anIntArray35[local3] * local11 + 16383 >> 14;
						this.anIntArray35[local3] = this.anIntArray31[local3] * local11 + this.anIntArray35[local3] * local146 + 16383 >> 14;
						this.anIntArray31[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class317.anIntArray419[arg2];
						local146 = Class317.anIntArray420[arg2];
						local164 = this.anIntArray35[local3] * local11 + this.anIntArray32[local3] * local146 + 16383 >> 14;
						this.anIntArray35[local3] = this.anIntArray35[local3] * local146 - this.anIntArray32[local3] * local11 + 16383 >> 14;
						this.anIntArray32[local3] = local164;
					}
					this.anIntArray32[local3] += anInt230;
					this.anIntArray31[local3] += anInt231;
					this.anIntArray35[local3] += anInt232;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt221; local3++) {
					this.anIntArray32[local3] -= anInt230;
					this.anIntArray31[local3] -= anInt231;
					this.anIntArray35[local3] -= anInt232;
					this.anIntArray32[local3] = this.anIntArray32[local3] * arg1 / 128;
					this.anIntArray31[local3] = this.anIntArray31[local3] * arg2 / 128;
					this.anIntArray35[local3] = this.anIntArray35[local3] * arg3 / 128;
					this.anIntArray32[local3] += anInt230;
					this.anIntArray31[local3] += anInt231;
					this.anIntArray35[local3] += anInt232;
				}
			} else {
				@Pc(480) Class120 local480;
				@Pc(485) Class86 local485;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt223; local3++) {
						local11 = (this.aByteArray5[local3] & 0xFF) + arg1 * 8;
						if (local11 < 0) {
							local11 = 0;
						} else if (local11 > 255) {
							local11 = 255;
						}
						this.aByteArray5[local3] = (byte) local11;
					}
					if (this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass120Array1 != null) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local480 = this.aClass120Array1[local3];
							local485 = this.aClass86Array1[local3];
							local485.anInt2930 = local485.anInt2930 & 0xFFFFFF | 255 - (this.aByteArray5[local480.anInt3208] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt223; local3++) {
						local11 = this.aShortArray4[local3] & 0xFFFF;
						local146 = local11 >> 10 & 0x3F;
						local164 = local11 >> 7 & 0x7;
						@Pc(538) int local538 = local11 & 0x7F;
						@Pc(544) int local544 = local146 + arg1 & 0x3F;
						local164 += arg2 / 4;
						if (local164 < 0) {
							local164 = 0;
						} else if (local164 > 7) {
							local164 = 7;
						}
						local538 += arg3;
						if (local538 < 0) {
							local538 = 0;
						} else if (local538 > 127) {
							local538 = 127;
						}
						this.aShortArray4[local3] = (short) (local544 << 10 | local164 << 7 | local538);
					}
					if (this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass120Array1 != null) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local480 = this.aClass120Array1[local3];
							local485 = this.aClass86Array1[local3];
							local485.anInt2930 = local485.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local480.anInt3208] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(651) Class86 local651;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2932 += arg1;
							local651.anInt2931 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2928 = local651.anInt2928 * arg1 >> 7;
							local651.anInt2929 = local651.anInt2929 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2927 = local651.anInt2927 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "dp", descriptor = "(IIII)V", line = 2035)
	@Override
	void method5360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			anInt230 = 0;
			anInt231 = 0;
			anInt232 = 0;
			for (local11 = 0; local11 < this.anInt221; local11++) {
				anInt230 += this.anIntArray32[local11];
				anInt231 += this.anIntArray31[local11];
				anInt232 += this.anIntArray35[local11];
				local3++;
			}
			if (local3 > 0) {
				anInt230 = anInt230 / local3 + arg1;
				anInt231 = anInt231 / local3 + arg2;
				anInt232 = anInt232 / local3 + arg3;
			} else {
				anInt230 = arg1;
				anInt231 = arg2;
				anInt232 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt221; local3++) {
				this.anIntArray32[local3] += arg1;
				this.anIntArray31[local3] += arg2;
				this.anIntArray35[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt221; local3++) {
					this.anIntArray32[local3] -= anInt230;
					this.anIntArray31[local3] -= anInt231;
					this.anIntArray35[local3] -= anInt232;
					if (arg3 != 0) {
						local11 = Class317.anIntArray419[arg3];
						local146 = Class317.anIntArray420[arg3];
						local164 = this.anIntArray31[local3] * local11 + this.anIntArray32[local3] * local146 + 16383 >> 14;
						this.anIntArray31[local3] = this.anIntArray31[local3] * local146 - this.anIntArray32[local3] * local11 + 16383 >> 14;
						this.anIntArray32[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class317.anIntArray419[arg1];
						local146 = Class317.anIntArray420[arg1];
						local164 = this.anIntArray31[local3] * local146 - this.anIntArray35[local3] * local11 + 16383 >> 14;
						this.anIntArray35[local3] = this.anIntArray31[local3] * local11 + this.anIntArray35[local3] * local146 + 16383 >> 14;
						this.anIntArray31[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class317.anIntArray419[arg2];
						local146 = Class317.anIntArray420[arg2];
						local164 = this.anIntArray35[local3] * local11 + this.anIntArray32[local3] * local146 + 16383 >> 14;
						this.anIntArray35[local3] = this.anIntArray35[local3] * local146 - this.anIntArray32[local3] * local11 + 16383 >> 14;
						this.anIntArray32[local3] = local164;
					}
					this.anIntArray32[local3] += anInt230;
					this.anIntArray31[local3] += anInt231;
					this.anIntArray35[local3] += anInt232;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt221; local3++) {
					this.anIntArray32[local3] -= anInt230;
					this.anIntArray31[local3] -= anInt231;
					this.anIntArray35[local3] -= anInt232;
					this.anIntArray32[local3] = this.anIntArray32[local3] * arg1 / 128;
					this.anIntArray31[local3] = this.anIntArray31[local3] * arg2 / 128;
					this.anIntArray35[local3] = this.anIntArray35[local3] * arg3 / 128;
					this.anIntArray32[local3] += anInt230;
					this.anIntArray31[local3] += anInt231;
					this.anIntArray35[local3] += anInt232;
				}
			} else {
				@Pc(480) Class120 local480;
				@Pc(485) Class86 local485;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt223; local3++) {
						local11 = (this.aByteArray5[local3] & 0xFF) + arg1 * 8;
						if (local11 < 0) {
							local11 = 0;
						} else if (local11 > 255) {
							local11 = 255;
						}
						this.aByteArray5[local3] = (byte) local11;
					}
					if (this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass120Array1 != null) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local480 = this.aClass120Array1[local3];
							local485 = this.aClass86Array1[local3];
							local485.anInt2930 = local485.anInt2930 & 0xFFFFFF | 255 - (this.aByteArray5[local480.anInt3208] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt223; local3++) {
						local11 = this.aShortArray4[local3] & 0xFFFF;
						local146 = local11 >> 10 & 0x3F;
						local164 = local11 >> 7 & 0x7;
						@Pc(538) int local538 = local11 & 0x7F;
						@Pc(544) int local544 = local146 + arg1 & 0x3F;
						local164 += arg2 / 4;
						if (local164 < 0) {
							local164 = 0;
						} else if (local164 > 7) {
							local164 = 7;
						}
						local538 += arg3;
						if (local538 < 0) {
							local538 = 0;
						} else if (local538 > 127) {
							local538 = 127;
						}
						this.aShortArray4[local3] = (short) (local544 << 10 | local164 << 7 | local538);
					}
					if (this.aClass88_8 != null) {
						this.aClass88_8.anInterface5_6 = null;
					}
					if (this.aClass120Array1 != null) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local480 = this.aClass120Array1[local3];
							local485 = this.aClass86Array1[local3];
							local485.anInt2930 = local485.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local480.anInt3208] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(651) Class86 local651;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2932 += arg1;
							local651.anInt2931 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2928 = local651.anInt2928 * arg1 >> 7;
							local651.anInt2929 = local651.anInt2929 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt229; local3++) {
							local651 = this.aClass86Array1[local3];
							local651.anInt2927 = local651.anInt2927 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "cr", descriptor = "(I[IIIIIZ)V", line = 2180)
	@Override
	void method5345(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(53) int local53;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(45) int local45;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			anInt230 = 0;
			anInt231 = 0;
			anInt232 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray3.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray3[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						anInt230 += this.anIntArray32[local53];
						anInt231 += this.anIntArray31[local53];
						anInt232 += this.anIntArray35[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				anInt230 = anInt230 / local18 + local8;
				anInt231 = anInt231 / local18 + local12;
				anInt232 = anInt232 / local18 + local16;
			} else {
				anInt230 = local8;
				anInt231 = local12;
				anInt232 = local16;
			}
			return;
		}
		@Pc(141) int[] local141;
		@Pc(143) int local143;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local141 = this.anIntArrayArray3[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray32[local45] += local8;
						this.anIntArray31[local45] += local12;
						this.anIntArray35[local45] += local16;
					}
				}
			}
			return;
		}
		@Pc(250) int local250;
		@Pc(268) int local268;
		@Pc(716) int local716;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local141 = this.anIntArrayArray3[local26];
					if ((arg5 & 0x1) == 0) {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray32[local45] -= anInt230;
							this.anIntArray31[local45] -= anInt231;
							this.anIntArray35[local45] -= anInt232;
							if (arg4 != 0) {
								local53 = Class317.anIntArray419[arg4];
								local250 = Class317.anIntArray420[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							if (arg2 != 0) {
								local53 = Class317.anIntArray419[arg2];
								local250 = Class317.anIntArray420[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray35[local45] * local53 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray31[local45] * local53 + this.anIntArray35[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class317.anIntArray419[arg3];
								local250 = Class317.anIntArray420[arg3];
								local268 = this.anIntArray35[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray35[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							this.anIntArray32[local45] += anInt230;
							this.anIntArray31[local45] += anInt231;
							this.anIntArray35[local45] += anInt232;
						}
					} else {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray32[local45] -= anInt230;
							this.anIntArray31[local45] -= anInt231;
							this.anIntArray35[local45] -= anInt232;
							if (arg2 != 0) {
								local53 = Class317.anIntArray419[arg2];
								local250 = Class317.anIntArray420[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray35[local45] * local53 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray31[local45] * local53 + this.anIntArray35[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg4 != 0) {
								local53 = Class317.anIntArray419[arg4];
								local250 = Class317.anIntArray420[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class317.anIntArray419[arg3];
								local250 = Class317.anIntArray420[arg3];
								local268 = this.anIntArray35[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray35[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							this.anIntArray32[local45] += anInt230;
							this.anIntArray31[local45] += anInt231;
							this.anIntArray35[local45] += anInt232;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray3.length) {
						local141 = this.anIntArrayArray3[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray36[local45];
							local250 = this.anIntArray36[local45 + 1];
							for (local268 = local53; local268 < local250 && this.aShortArray11[local268] != 0; local268++) {
								local716 = (this.aShortArray11[local268] & 0xFFFF) - 1;
								@Pc(722) int local722;
								@Pc(726) int local726;
								@Pc(744) int local744;
								if (arg4 != 0) {
									local722 = Class317.anIntArray419[arg4];
									local726 = Class317.anIntArray420[arg4];
									local744 = this.aShortArray6[local716] * local722 + this.aShortArray2[local716] * local726 + 16383 >> 14;
									this.aShortArray6[local716] = (short) (this.aShortArray6[local716] * local726 - this.aShortArray2[local716] * local722 + 16383 >> 14);
									this.aShortArray2[local716] = (short) local744;
								}
								if (arg2 != 0) {
									local722 = Class317.anIntArray419[arg2];
									local726 = Class317.anIntArray420[arg2];
									local744 = this.aShortArray6[local716] * local726 - this.aShortArray3[local716] * local722 + 16383 >> 14;
									this.aShortArray3[local716] = (short) (this.aShortArray6[local716] * local722 + this.aShortArray3[local716] * local726 + 16383 >> 14);
									this.aShortArray6[local716] = (short) local744;
								}
								if (arg3 != 0) {
									local722 = Class317.anIntArray419[arg3];
									local726 = Class317.anIntArray420[arg3];
									local744 = this.aShortArray3[local716] * local722 + this.aShortArray2[local716] * local726 + 16383 >> 14;
									this.aShortArray3[local716] = (short) (this.aShortArray3[local716] * local726 - this.aShortArray2[local716] * local722 + 16383 >> 14);
									this.aShortArray2[local716] = (short) local744;
								}
							}
						}
					}
				}
				if (this.aClass88_6 == null && this.aClass88_8 != null) {
					this.aClass88_8.anInterface5_6 = null;
				}
				if (this.aClass88_6 != null) {
					this.aClass88_6.anInterface5_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local141 = this.anIntArrayArray3[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray32[local45] -= anInt230;
						this.anIntArray31[local45] -= anInt231;
						this.anIntArray35[local45] -= anInt232;
						this.anIntArray32[local45] = this.anIntArray32[local45] * arg2 >> 7;
						this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
						this.anIntArray35[local45] = this.anIntArray35[local45] * arg4 >> 7;
						this.anIntArray32[local45] += anInt230;
						this.anIntArray31[local45] += anInt231;
						this.anIntArray35[local45] += anInt232;
					}
				}
			}
		} else {
			@Pc(1119) Class120 local1119;
			@Pc(1124) Class86 local1124;
			if (arg0 == 5) {
				if (this.anIntArrayArray5 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray5.length) {
							local141 = this.anIntArrayArray5[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local45 = local141[local143];
								local53 = (this.aByteArray5[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray5[local45] = (byte) local53;
							}
							if (local141.length > 0 && this.aClass88_8 != null) {
								this.aClass88_8.anInterface5_6 = null;
							}
						}
					}
					if (this.aClass120Array1 != null) {
						for (local18 = 0; local18 < this.anInt229; local18++) {
							local1119 = this.aClass120Array1[local18];
							local1124 = this.aClass86Array1[local18];
							local1124.anInt2930 = local1124.anInt2930 & 0xFFFFFF | 255 - (this.aByteArray5[local1119.anInt3208] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1345) Class86 local1345;
				if (arg0 == 8) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local141 = this.anIntArrayArray4[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass86Array1[local141[local143]];
									local1345.anInt2932 += arg2;
									local1345.anInt2931 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local141 = this.anIntArrayArray4[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass86Array1[local141[local143]];
									local1345.anInt2928 = local1345.anInt2928 * arg2 >> 7;
									local1345.anInt2929 = local1345.anInt2929 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray4 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray4.length) {
							local141 = this.anIntArrayArray4[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local1345 = this.aClass86Array1[local141[local143]];
								local1345.anInt2927 = local1345.anInt2927 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray5 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray5.length) {
						local141 = this.anIntArrayArray5[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.aShortArray4[local45] & 0xFFFF;
							local250 = local53 >> 10 & 0x3F;
							local268 = local53 >> 7 & 0x7;
							local716 = local53 & 0x7F;
							@Pc(1209) int local1209 = local250 + arg2 & 0x3F;
							local268 += arg3 / 4;
							if (local268 < 0) {
								local268 = 0;
							} else if (local268 > 7) {
								local268 = 7;
							}
							local716 += arg4;
							if (local716 < 0) {
								local716 = 0;
							} else if (local716 > 127) {
								local716 = 127;
							}
							this.aShortArray4[local45] = (short) (local1209 << 10 | local268 << 7 | local716);
						}
						if (local141.length > 0 && this.aClass88_8 != null) {
							this.aClass88_8.anInterface5_6 = null;
						}
					}
				}
				if (this.aClass120Array1 != null) {
					for (local18 = 0; local18 < this.anInt229; local18++) {
						local1119 = this.aClass120Array1[local18];
						local1124 = this.aClass86Array1[local18];
						local1124.anInt2930 = local1124.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local1119.anInt3208] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "ca", descriptor = "(I[IIIIIZ)V", line = 2180)
	@Override
	void method5418(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(53) int local53;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(45) int local45;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			anInt230 = 0;
			anInt231 = 0;
			anInt232 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray3.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray3[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						anInt230 += this.anIntArray32[local53];
						anInt231 += this.anIntArray31[local53];
						anInt232 += this.anIntArray35[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				anInt230 = anInt230 / local18 + local8;
				anInt231 = anInt231 / local18 + local12;
				anInt232 = anInt232 / local18 + local16;
			} else {
				anInt230 = local8;
				anInt231 = local12;
				anInt232 = local16;
			}
			return;
		}
		@Pc(141) int[] local141;
		@Pc(143) int local143;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local141 = this.anIntArrayArray3[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray32[local45] += local8;
						this.anIntArray31[local45] += local12;
						this.anIntArray35[local45] += local16;
					}
				}
			}
			return;
		}
		@Pc(250) int local250;
		@Pc(268) int local268;
		@Pc(716) int local716;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local141 = this.anIntArrayArray3[local26];
					if ((arg5 & 0x1) == 0) {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray32[local45] -= anInt230;
							this.anIntArray31[local45] -= anInt231;
							this.anIntArray35[local45] -= anInt232;
							if (arg4 != 0) {
								local53 = Class317.anIntArray419[arg4];
								local250 = Class317.anIntArray420[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							if (arg2 != 0) {
								local53 = Class317.anIntArray419[arg2];
								local250 = Class317.anIntArray420[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray35[local45] * local53 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray31[local45] * local53 + this.anIntArray35[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class317.anIntArray419[arg3];
								local250 = Class317.anIntArray420[arg3];
								local268 = this.anIntArray35[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray35[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							this.anIntArray32[local45] += anInt230;
							this.anIntArray31[local45] += anInt231;
							this.anIntArray35[local45] += anInt232;
						}
					} else {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray32[local45] -= anInt230;
							this.anIntArray31[local45] -= anInt231;
							this.anIntArray35[local45] -= anInt232;
							if (arg2 != 0) {
								local53 = Class317.anIntArray419[arg2];
								local250 = Class317.anIntArray420[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray35[local45] * local53 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray31[local45] * local53 + this.anIntArray35[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg4 != 0) {
								local53 = Class317.anIntArray419[arg4];
								local250 = Class317.anIntArray420[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class317.anIntArray419[arg3];
								local250 = Class317.anIntArray420[arg3];
								local268 = this.anIntArray35[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray35[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							this.anIntArray32[local45] += anInt230;
							this.anIntArray31[local45] += anInt231;
							this.anIntArray35[local45] += anInt232;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray3.length) {
						local141 = this.anIntArrayArray3[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray36[local45];
							local250 = this.anIntArray36[local45 + 1];
							for (local268 = local53; local268 < local250 && this.aShortArray11[local268] != 0; local268++) {
								local716 = (this.aShortArray11[local268] & 0xFFFF) - 1;
								@Pc(722) int local722;
								@Pc(726) int local726;
								@Pc(744) int local744;
								if (arg4 != 0) {
									local722 = Class317.anIntArray419[arg4];
									local726 = Class317.anIntArray420[arg4];
									local744 = this.aShortArray6[local716] * local722 + this.aShortArray2[local716] * local726 + 16383 >> 14;
									this.aShortArray6[local716] = (short) (this.aShortArray6[local716] * local726 - this.aShortArray2[local716] * local722 + 16383 >> 14);
									this.aShortArray2[local716] = (short) local744;
								}
								if (arg2 != 0) {
									local722 = Class317.anIntArray419[arg2];
									local726 = Class317.anIntArray420[arg2];
									local744 = this.aShortArray6[local716] * local726 - this.aShortArray3[local716] * local722 + 16383 >> 14;
									this.aShortArray3[local716] = (short) (this.aShortArray6[local716] * local722 + this.aShortArray3[local716] * local726 + 16383 >> 14);
									this.aShortArray6[local716] = (short) local744;
								}
								if (arg3 != 0) {
									local722 = Class317.anIntArray419[arg3];
									local726 = Class317.anIntArray420[arg3];
									local744 = this.aShortArray3[local716] * local722 + this.aShortArray2[local716] * local726 + 16383 >> 14;
									this.aShortArray3[local716] = (short) (this.aShortArray3[local716] * local726 - this.aShortArray2[local716] * local722 + 16383 >> 14);
									this.aShortArray2[local716] = (short) local744;
								}
							}
						}
					}
				}
				if (this.aClass88_6 == null && this.aClass88_8 != null) {
					this.aClass88_8.anInterface5_6 = null;
				}
				if (this.aClass88_6 != null) {
					this.aClass88_6.anInterface5_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local141 = this.anIntArrayArray3[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray32[local45] -= anInt230;
						this.anIntArray31[local45] -= anInt231;
						this.anIntArray35[local45] -= anInt232;
						this.anIntArray32[local45] = this.anIntArray32[local45] * arg2 >> 7;
						this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
						this.anIntArray35[local45] = this.anIntArray35[local45] * arg4 >> 7;
						this.anIntArray32[local45] += anInt230;
						this.anIntArray31[local45] += anInt231;
						this.anIntArray35[local45] += anInt232;
					}
				}
			}
		} else {
			@Pc(1119) Class120 local1119;
			@Pc(1124) Class86 local1124;
			if (arg0 == 5) {
				if (this.anIntArrayArray5 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray5.length) {
							local141 = this.anIntArrayArray5[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local45 = local141[local143];
								local53 = (this.aByteArray5[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray5[local45] = (byte) local53;
							}
							if (local141.length > 0 && this.aClass88_8 != null) {
								this.aClass88_8.anInterface5_6 = null;
							}
						}
					}
					if (this.aClass120Array1 != null) {
						for (local18 = 0; local18 < this.anInt229; local18++) {
							local1119 = this.aClass120Array1[local18];
							local1124 = this.aClass86Array1[local18];
							local1124.anInt2930 = local1124.anInt2930 & 0xFFFFFF | 255 - (this.aByteArray5[local1119.anInt3208] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1345) Class86 local1345;
				if (arg0 == 8) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local141 = this.anIntArrayArray4[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass86Array1[local141[local143]];
									local1345.anInt2932 += arg2;
									local1345.anInt2931 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local141 = this.anIntArrayArray4[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass86Array1[local141[local143]];
									local1345.anInt2928 = local1345.anInt2928 * arg2 >> 7;
									local1345.anInt2929 = local1345.anInt2929 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray4 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray4.length) {
							local141 = this.anIntArrayArray4[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local1345 = this.aClass86Array1[local141[local143]];
								local1345.anInt2927 = local1345.anInt2927 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray5 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray5.length) {
						local141 = this.anIntArrayArray5[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.aShortArray4[local45] & 0xFFFF;
							local250 = local53 >> 10 & 0x3F;
							local268 = local53 >> 7 & 0x7;
							local716 = local53 & 0x7F;
							@Pc(1209) int local1209 = local250 + arg2 & 0x3F;
							local268 += arg3 / 4;
							if (local268 < 0) {
								local268 = 0;
							} else if (local268 > 7) {
								local268 = 7;
							}
							local716 += arg4;
							if (local716 < 0) {
								local716 = 0;
							} else if (local716 > 127) {
								local716 = 127;
							}
							this.aShortArray4[local45] = (short) (local1209 << 10 | local268 << 7 | local716);
						}
						if (local141.length > 0 && this.aClass88_8 != null) {
							this.aClass88_8.anInterface5_6 = null;
						}
					}
				}
				if (this.aClass120Array1 != null) {
					for (local18 = 0; local18 < this.anInt229; local18++) {
						local1119 = this.aClass120Array1[local18];
						local1124 = this.aClass86Array1[local18];
						local1124.anInt2930 = local1124.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local1119.anInt3208] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "ak", descriptor = "(I[IIIIIZ)V", line = 2180)
	@Override
	void method5347(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(53) int local53;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(45) int local45;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			anInt230 = 0;
			anInt231 = 0;
			anInt232 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray3.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray3[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						anInt230 += this.anIntArray32[local53];
						anInt231 += this.anIntArray31[local53];
						anInt232 += this.anIntArray35[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				anInt230 = anInt230 / local18 + local8;
				anInt231 = anInt231 / local18 + local12;
				anInt232 = anInt232 / local18 + local16;
			} else {
				anInt230 = local8;
				anInt231 = local12;
				anInt232 = local16;
			}
			return;
		}
		@Pc(141) int[] local141;
		@Pc(143) int local143;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local141 = this.anIntArrayArray3[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray32[local45] += local8;
						this.anIntArray31[local45] += local12;
						this.anIntArray35[local45] += local16;
					}
				}
			}
			return;
		}
		@Pc(250) int local250;
		@Pc(268) int local268;
		@Pc(716) int local716;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local141 = this.anIntArrayArray3[local26];
					if ((arg5 & 0x1) == 0) {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray32[local45] -= anInt230;
							this.anIntArray31[local45] -= anInt231;
							this.anIntArray35[local45] -= anInt232;
							if (arg4 != 0) {
								local53 = Class317.anIntArray419[arg4];
								local250 = Class317.anIntArray420[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							if (arg2 != 0) {
								local53 = Class317.anIntArray419[arg2];
								local250 = Class317.anIntArray420[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray35[local45] * local53 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray31[local45] * local53 + this.anIntArray35[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class317.anIntArray419[arg3];
								local250 = Class317.anIntArray420[arg3];
								local268 = this.anIntArray35[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray35[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							this.anIntArray32[local45] += anInt230;
							this.anIntArray31[local45] += anInt231;
							this.anIntArray35[local45] += anInt232;
						}
					} else {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray32[local45] -= anInt230;
							this.anIntArray31[local45] -= anInt231;
							this.anIntArray35[local45] -= anInt232;
							if (arg2 != 0) {
								local53 = Class317.anIntArray419[arg2];
								local250 = Class317.anIntArray420[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray35[local45] * local53 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray31[local45] * local53 + this.anIntArray35[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg4 != 0) {
								local53 = Class317.anIntArray419[arg4];
								local250 = Class317.anIntArray420[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class317.anIntArray419[arg3];
								local250 = Class317.anIntArray420[arg3];
								local268 = this.anIntArray35[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray35[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							this.anIntArray32[local45] += anInt230;
							this.anIntArray31[local45] += anInt231;
							this.anIntArray35[local45] += anInt232;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray3.length) {
						local141 = this.anIntArrayArray3[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray36[local45];
							local250 = this.anIntArray36[local45 + 1];
							for (local268 = local53; local268 < local250 && this.aShortArray11[local268] != 0; local268++) {
								local716 = (this.aShortArray11[local268] & 0xFFFF) - 1;
								@Pc(722) int local722;
								@Pc(726) int local726;
								@Pc(744) int local744;
								if (arg4 != 0) {
									local722 = Class317.anIntArray419[arg4];
									local726 = Class317.anIntArray420[arg4];
									local744 = this.aShortArray6[local716] * local722 + this.aShortArray2[local716] * local726 + 16383 >> 14;
									this.aShortArray6[local716] = (short) (this.aShortArray6[local716] * local726 - this.aShortArray2[local716] * local722 + 16383 >> 14);
									this.aShortArray2[local716] = (short) local744;
								}
								if (arg2 != 0) {
									local722 = Class317.anIntArray419[arg2];
									local726 = Class317.anIntArray420[arg2];
									local744 = this.aShortArray6[local716] * local726 - this.aShortArray3[local716] * local722 + 16383 >> 14;
									this.aShortArray3[local716] = (short) (this.aShortArray6[local716] * local722 + this.aShortArray3[local716] * local726 + 16383 >> 14);
									this.aShortArray6[local716] = (short) local744;
								}
								if (arg3 != 0) {
									local722 = Class317.anIntArray419[arg3];
									local726 = Class317.anIntArray420[arg3];
									local744 = this.aShortArray3[local716] * local722 + this.aShortArray2[local716] * local726 + 16383 >> 14;
									this.aShortArray3[local716] = (short) (this.aShortArray3[local716] * local726 - this.aShortArray2[local716] * local722 + 16383 >> 14);
									this.aShortArray2[local716] = (short) local744;
								}
							}
						}
					}
				}
				if (this.aClass88_6 == null && this.aClass88_8 != null) {
					this.aClass88_8.anInterface5_6 = null;
				}
				if (this.aClass88_6 != null) {
					this.aClass88_6.anInterface5_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local141 = this.anIntArrayArray3[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray32[local45] -= anInt230;
						this.anIntArray31[local45] -= anInt231;
						this.anIntArray35[local45] -= anInt232;
						this.anIntArray32[local45] = this.anIntArray32[local45] * arg2 >> 7;
						this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
						this.anIntArray35[local45] = this.anIntArray35[local45] * arg4 >> 7;
						this.anIntArray32[local45] += anInt230;
						this.anIntArray31[local45] += anInt231;
						this.anIntArray35[local45] += anInt232;
					}
				}
			}
		} else {
			@Pc(1119) Class120 local1119;
			@Pc(1124) Class86 local1124;
			if (arg0 == 5) {
				if (this.anIntArrayArray5 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray5.length) {
							local141 = this.anIntArrayArray5[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local45 = local141[local143];
								local53 = (this.aByteArray5[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray5[local45] = (byte) local53;
							}
							if (local141.length > 0 && this.aClass88_8 != null) {
								this.aClass88_8.anInterface5_6 = null;
							}
						}
					}
					if (this.aClass120Array1 != null) {
						for (local18 = 0; local18 < this.anInt229; local18++) {
							local1119 = this.aClass120Array1[local18];
							local1124 = this.aClass86Array1[local18];
							local1124.anInt2930 = local1124.anInt2930 & 0xFFFFFF | 255 - (this.aByteArray5[local1119.anInt3208] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1345) Class86 local1345;
				if (arg0 == 8) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local141 = this.anIntArrayArray4[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass86Array1[local141[local143]];
									local1345.anInt2932 += arg2;
									local1345.anInt2931 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local141 = this.anIntArrayArray4[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass86Array1[local141[local143]];
									local1345.anInt2928 = local1345.anInt2928 * arg2 >> 7;
									local1345.anInt2929 = local1345.anInt2929 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray4 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray4.length) {
							local141 = this.anIntArrayArray4[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local1345 = this.aClass86Array1[local141[local143]];
								local1345.anInt2927 = local1345.anInt2927 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray5 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray5.length) {
						local141 = this.anIntArrayArray5[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.aShortArray4[local45] & 0xFFFF;
							local250 = local53 >> 10 & 0x3F;
							local268 = local53 >> 7 & 0x7;
							local716 = local53 & 0x7F;
							@Pc(1209) int local1209 = local250 + arg2 & 0x3F;
							local268 += arg3 / 4;
							if (local268 < 0) {
								local268 = 0;
							} else if (local268 > 7) {
								local268 = 7;
							}
							local716 += arg4;
							if (local716 < 0) {
								local716 = 0;
							} else if (local716 > 127) {
								local716 = 127;
							}
							this.aShortArray4[local45] = (short) (local1209 << 10 | local268 << 7 | local716);
						}
						if (local141.length > 0 && this.aClass88_8 != null) {
							this.aClass88_8.anInterface5_6 = null;
						}
					}
				}
				if (this.aClass120Array1 != null) {
					for (local18 = 0; local18 < this.anInt229; local18++) {
						local1119 = this.aClass120Array1[local18];
						local1124 = this.aClass86Array1[local18];
						local1124.anInt2930 = local1124.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local1119.anInt3208] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "ce", descriptor = "(I[IIIIIZ)V", line = 2180)
	@Override
	void method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(53) int local53;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(45) int local45;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			anInt230 = 0;
			anInt231 = 0;
			anInt232 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray3.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray3[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						anInt230 += this.anIntArray32[local53];
						anInt231 += this.anIntArray31[local53];
						anInt232 += this.anIntArray35[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				anInt230 = anInt230 / local18 + local8;
				anInt231 = anInt231 / local18 + local12;
				anInt232 = anInt232 / local18 + local16;
			} else {
				anInt230 = local8;
				anInt231 = local12;
				anInt232 = local16;
			}
			return;
		}
		@Pc(141) int[] local141;
		@Pc(143) int local143;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local141 = this.anIntArrayArray3[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray32[local45] += local8;
						this.anIntArray31[local45] += local12;
						this.anIntArray35[local45] += local16;
					}
				}
			}
			return;
		}
		@Pc(250) int local250;
		@Pc(268) int local268;
		@Pc(716) int local716;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local141 = this.anIntArrayArray3[local26];
					if ((arg5 & 0x1) == 0) {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray32[local45] -= anInt230;
							this.anIntArray31[local45] -= anInt231;
							this.anIntArray35[local45] -= anInt232;
							if (arg4 != 0) {
								local53 = Class317.anIntArray419[arg4];
								local250 = Class317.anIntArray420[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							if (arg2 != 0) {
								local53 = Class317.anIntArray419[arg2];
								local250 = Class317.anIntArray420[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray35[local45] * local53 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray31[local45] * local53 + this.anIntArray35[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class317.anIntArray419[arg3];
								local250 = Class317.anIntArray420[arg3];
								local268 = this.anIntArray35[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray35[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							this.anIntArray32[local45] += anInt230;
							this.anIntArray31[local45] += anInt231;
							this.anIntArray35[local45] += anInt232;
						}
					} else {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray32[local45] -= anInt230;
							this.anIntArray31[local45] -= anInt231;
							this.anIntArray35[local45] -= anInt232;
							if (arg2 != 0) {
								local53 = Class317.anIntArray419[arg2];
								local250 = Class317.anIntArray420[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray35[local45] * local53 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray31[local45] * local53 + this.anIntArray35[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg4 != 0) {
								local53 = Class317.anIntArray419[arg4];
								local250 = Class317.anIntArray420[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class317.anIntArray419[arg3];
								local250 = Class317.anIntArray420[arg3];
								local268 = this.anIntArray35[local45] * local53 + this.anIntArray32[local45] * local250 + 16383 >> 14;
								this.anIntArray35[local45] = this.anIntArray35[local45] * local250 - this.anIntArray32[local45] * local53 + 16383 >> 14;
								this.anIntArray32[local45] = local268;
							}
							this.anIntArray32[local45] += anInt230;
							this.anIntArray31[local45] += anInt231;
							this.anIntArray35[local45] += anInt232;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray3.length) {
						local141 = this.anIntArrayArray3[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray36[local45];
							local250 = this.anIntArray36[local45 + 1];
							for (local268 = local53; local268 < local250 && this.aShortArray11[local268] != 0; local268++) {
								local716 = (this.aShortArray11[local268] & 0xFFFF) - 1;
								@Pc(722) int local722;
								@Pc(726) int local726;
								@Pc(744) int local744;
								if (arg4 != 0) {
									local722 = Class317.anIntArray419[arg4];
									local726 = Class317.anIntArray420[arg4];
									local744 = this.aShortArray6[local716] * local722 + this.aShortArray2[local716] * local726 + 16383 >> 14;
									this.aShortArray6[local716] = (short) (this.aShortArray6[local716] * local726 - this.aShortArray2[local716] * local722 + 16383 >> 14);
									this.aShortArray2[local716] = (short) local744;
								}
								if (arg2 != 0) {
									local722 = Class317.anIntArray419[arg2];
									local726 = Class317.anIntArray420[arg2];
									local744 = this.aShortArray6[local716] * local726 - this.aShortArray3[local716] * local722 + 16383 >> 14;
									this.aShortArray3[local716] = (short) (this.aShortArray6[local716] * local722 + this.aShortArray3[local716] * local726 + 16383 >> 14);
									this.aShortArray6[local716] = (short) local744;
								}
								if (arg3 != 0) {
									local722 = Class317.anIntArray419[arg3];
									local726 = Class317.anIntArray420[arg3];
									local744 = this.aShortArray3[local716] * local722 + this.aShortArray2[local716] * local726 + 16383 >> 14;
									this.aShortArray3[local716] = (short) (this.aShortArray3[local716] * local726 - this.aShortArray2[local716] * local722 + 16383 >> 14);
									this.aShortArray2[local716] = (short) local744;
								}
							}
						}
					}
				}
				if (this.aClass88_6 == null && this.aClass88_8 != null) {
					this.aClass88_8.anInterface5_6 = null;
				}
				if (this.aClass88_6 != null) {
					this.aClass88_6.anInterface5_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray3.length) {
					local141 = this.anIntArrayArray3[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray32[local45] -= anInt230;
						this.anIntArray31[local45] -= anInt231;
						this.anIntArray35[local45] -= anInt232;
						this.anIntArray32[local45] = this.anIntArray32[local45] * arg2 >> 7;
						this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
						this.anIntArray35[local45] = this.anIntArray35[local45] * arg4 >> 7;
						this.anIntArray32[local45] += anInt230;
						this.anIntArray31[local45] += anInt231;
						this.anIntArray35[local45] += anInt232;
					}
				}
			}
		} else {
			@Pc(1119) Class120 local1119;
			@Pc(1124) Class86 local1124;
			if (arg0 == 5) {
				if (this.anIntArrayArray5 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray5.length) {
							local141 = this.anIntArrayArray5[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local45 = local141[local143];
								local53 = (this.aByteArray5[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray5[local45] = (byte) local53;
							}
							if (local141.length > 0 && this.aClass88_8 != null) {
								this.aClass88_8.anInterface5_6 = null;
							}
						}
					}
					if (this.aClass120Array1 != null) {
						for (local18 = 0; local18 < this.anInt229; local18++) {
							local1119 = this.aClass120Array1[local18];
							local1124 = this.aClass86Array1[local18];
							local1124.anInt2930 = local1124.anInt2930 & 0xFFFFFF | 255 - (this.aByteArray5[local1119.anInt3208] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1345) Class86 local1345;
				if (arg0 == 8) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local141 = this.anIntArrayArray4[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass86Array1[local141[local143]];
									local1345.anInt2932 += arg2;
									local1345.anInt2931 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray4 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray4.length) {
								local141 = this.anIntArrayArray4[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass86Array1[local141[local143]];
									local1345.anInt2928 = local1345.anInt2928 * arg2 >> 7;
									local1345.anInt2929 = local1345.anInt2929 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray4 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray4.length) {
							local141 = this.anIntArrayArray4[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local1345 = this.aClass86Array1[local141[local143]];
								local1345.anInt2927 = local1345.anInt2927 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray5 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray5.length) {
						local141 = this.anIntArrayArray5[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.aShortArray4[local45] & 0xFFFF;
							local250 = local53 >> 10 & 0x3F;
							local268 = local53 >> 7 & 0x7;
							local716 = local53 & 0x7F;
							@Pc(1209) int local1209 = local250 + arg2 & 0x3F;
							local268 += arg3 / 4;
							if (local268 < 0) {
								local268 = 0;
							} else if (local268 > 7) {
								local268 = 7;
							}
							local716 += arg4;
							if (local716 < 0) {
								local716 = 0;
							} else if (local716 > 127) {
								local716 = 127;
							}
							this.aShortArray4[local45] = (short) (local1209 << 10 | local268 << 7 | local716);
						}
						if (local141.length > 0 && this.aClass88_8 != null) {
							this.aClass88_8.anInterface5_6 = null;
						}
					}
				}
				if (this.aClass120Array1 != null) {
					for (local18 = 0; local18 < this.anInt229; local18++) {
						local1119 = this.aClass120Array1[local18];
						local1124 = this.aClass86Array1[local18];
						local1124.anInt2930 = local1124.anInt2930 & 0xFF000000 | Class360.anIntArray422[this.aShortArray4[local1119.anInt3208] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "an", descriptor = "()V", line = 2476)
	@Override
	void method5350() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt220; local1++) {
			this.anIntArray32[local1] = this.anIntArray32[local1] + 7 >> 4;
			this.anIntArray31[local1] = this.anIntArray31[local1] + 7 >> 4;
			this.anIntArray35[local1] = this.anIntArray35[local1] + 7 >> 4;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "ch", descriptor = "()V", line = 2476)
	@Override
	void method5419() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt220; local1++) {
			this.anIntArray32[local1] = this.anIntArray32[local1] + 7 >> 4;
			this.anIntArray31[local1] = this.anIntArray31[local1] + 7 >> 4;
			this.anIntArray35[local1] = this.anIntArray35[local1] + 7 >> 4;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "ci", descriptor = "()V", line = 2476)
	@Override
	void method5361() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt220; local1++) {
			this.anIntArray32[local1] = this.anIntArray32[local1] + 7 >> 4;
			this.anIntArray31[local1] = this.anIntArray31[local1] + 7 >> 4;
			this.anIntArray35[local1] = this.anIntArray35[local1] + 7 >> 4;
		}
		if (this.aClass88_5 != null) {
			this.aClass88_5.anInterface5_6 = null;
		}
		this.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!abk", name = "dy", descriptor = "(Lclient!mu;IZ)V", line = 2486)
	@Override
	public void method5429(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray10 == null) {
			return;
		}
		@Pc(5) Class332 local5 = arg0;
		if (arg2) {
			local5 = this.aClass21_Sub2_25.aClass332_4;
			local5.method26209(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt221; local19++) {
			if ((arg1 & this.aShortArray10[local19]) != 0) {
				local5.method26206((float) this.anIntArray32[local19], (float) this.anIntArray31[local19], (float) this.anIntArray35[local19], local17);
				this.anIntArray32[local19] = (int) local17[0];
				this.anIntArray31[local19] = (int) local17[1];
				this.anIntArray35[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "aj", descriptor = "(Lclient!mu;IZ)V", line = 2486)
	@Override
	public void method5351(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray10 == null) {
			return;
		}
		@Pc(5) Class332 local5 = arg0;
		if (arg2) {
			local5 = this.aClass21_Sub2_25.aClass332_4;
			local5.method26209(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt221; local19++) {
			if ((arg1 & this.aShortArray10[local19]) != 0) {
				local5.method26206((float) this.anIntArray32[local19], (float) this.anIntArray31[local19], (float) this.anIntArray35[local19], local17);
				this.anIntArray32[local19] = (int) local17[0];
				this.anIntArray31[local19] = (int) local17[1];
				this.anIntArray35[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "dg", descriptor = "(Lclient!mu;IZ)V", line = 2486)
	@Override
	public void method5480(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray10 == null) {
			return;
		}
		@Pc(5) Class332 local5 = arg0;
		if (arg2) {
			local5 = this.aClass21_Sub2_25.aClass332_4;
			local5.method26209(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt221; local19++) {
			if ((arg1 & this.aShortArray10[local19]) != 0) {
				local5.method26206((float) this.anIntArray32[local19], (float) this.anIntArray31[local19], (float) this.anIntArray35[local19], local17);
				this.anIntArray32[local19] = (int) local17[0];
				this.anIntArray31[local19] = (int) local17[1];
				this.anIntArray35[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "fm", descriptor = "()[Lclient!cd;", line = 2503)
	@Override
	public Class109[] method5477() {
		return this.aClass109Array1;
	}

	@OriginalMember(owner = "client!abk", name = "bg", descriptor = "()[Lclient!cd;", line = 2503)
	@Override
	public Class109[] method5379() {
		return this.aClass109Array1;
	}

	@OriginalMember(owner = "client!abk", name = "bk", descriptor = "()[Lclient!dt;", line = 2507)
	@Override
	public Class135[] method5378() {
		return this.aClass135Array1;
	}

	@OriginalMember(owner = "client!abk", name = "fe", descriptor = "()[Lclient!dt;", line = 2507)
	@Override
	public Class135[] method5384() {
		return this.aClass135Array1;
	}

	@OriginalMember(owner = "client!abk", name = "dt", descriptor = "(Lclient!mu;)V", line = 2511)
	@Override
	public void method5435(@OriginalArg(0) Class332 arg0) {
		@Pc(3) Class328 local3 = this.aClass21_Sub2_25.aClass328_14;
		local3.method26056(arg0);
		@Pc(11) int local11;
		if (this.aClass135Array1 != null) {
			for (local11 = 0; local11 < this.aClass135Array1.length; local11++) {
				@Pc(21) Class135 local21 = this.aClass135Array1[local11];
				@Pc(23) Class135 local23 = local21;
				if (local21.aClass135_1 != null) {
					local23 = local21.aClass135_1;
				}
				local23.anInt3391 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray32[local21.anInt3387 * 1769457087] + local3.aFloatArray106[4] * (float) this.anIntArray31[local21.anInt3387 * 1769457087] + local3.aFloatArray106[8] * (float) this.anIntArray35[local21.anInt3387 * 1769457087]) * -976519565;
				local23.anInt3390 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray32[local21.anInt3387 * 1769457087] + local3.aFloatArray106[5] * (float) this.anIntArray31[local21.anInt3387 * 1769457087] + local3.aFloatArray106[9] * (float) this.anIntArray35[local21.anInt3387 * 1769457087]) * 458577149;
				local23.anInt3385 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray32[local21.anInt3387 * 1769457087] + local3.aFloatArray106[6] * (float) this.anIntArray31[local21.anInt3387 * 1769457087] + local3.aFloatArray106[10] * (float) this.anIntArray35[local21.anInt3387 * 1769457087]) * -1599219563;
				local23.anInt3392 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray32[local21.anInt3388 * -2046385949] + local3.aFloatArray106[4] * (float) this.anIntArray31[local21.anInt3388 * -2046385949] + local3.aFloatArray106[8] * (float) this.anIntArray35[local21.anInt3388 * -2046385949]) * 506106203;
				local23.anInt3384 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray32[local21.anInt3388 * -2046385949] + local3.aFloatArray106[5] * (float) this.anIntArray31[local21.anInt3388 * -2046385949] + local3.aFloatArray106[9] * (float) this.anIntArray35[local21.anInt3388 * -2046385949]) * 1565185457;
				local23.anInt3394 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray32[local21.anInt3388 * -2046385949] + local3.aFloatArray106[6] * (float) this.anIntArray31[local21.anInt3388 * -2046385949] + local3.aFloatArray106[10] * (float) this.anIntArray35[local21.anInt3388 * -2046385949]) * 568173405;
				local23.anInt3395 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray32[local21.anInt3389 * 2144051441] + local3.aFloatArray106[4] * (float) this.anIntArray31[local21.anInt3389 * 2144051441] + local3.aFloatArray106[8] * (float) this.anIntArray35[local21.anInt3389 * 2144051441]) * 590275719;
				local23.anInt3396 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray32[local21.anInt3389 * 2144051441] + local3.aFloatArray106[5] * (float) this.anIntArray31[local21.anInt3389 * 2144051441] + local3.aFloatArray106[9] * (float) this.anIntArray35[local21.anInt3389 * 2144051441]) * -866719829;
				local23.anInt3397 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray32[local21.anInt3389 * 2144051441] + local3.aFloatArray106[6] * (float) this.anIntArray31[local21.anInt3389 * 2144051441] + local3.aFloatArray106[10] * (float) this.anIntArray35[local21.anInt3389 * 2144051441]) * -1133642555;
			}
		}
		if (this.aClass109Array1 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass109Array1.length; local11++) {
			@Pc(505) Class109 local505 = this.aClass109Array1[local11];
			@Pc(507) Class109 local507 = local505;
			if (local505.aClass109_2 != null) {
				local507 = local505.aClass109_2;
			}
			if (local505.aClass328_95 == null) {
				local505.aClass328_95 = new Class328(local3);
			} else {
				local505.aClass328_95.method26104(local3);
			}
			local507.anInt2993 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray32[local505.anInt2997 * -193228163] + local3.aFloatArray106[4] * (float) this.anIntArray31[local505.anInt2997 * -193228163] + local3.aFloatArray106[8] * (float) this.anIntArray35[local505.anInt2997 * -193228163]) * 635550127;
			local507.anInt2995 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray32[local505.anInt2997 * -193228163] + local3.aFloatArray106[5] * (float) this.anIntArray31[local505.anInt2997 * -193228163] + local3.aFloatArray106[9] * (float) this.anIntArray35[local505.anInt2997 * -193228163]) * -698189527;
			local507.anInt2996 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray32[local505.anInt2997 * -193228163] + local3.aFloatArray106[6] * (float) this.anIntArray31[local505.anInt2997 * -193228163] + local3.aFloatArray106[10] * (float) this.anIntArray35[local505.anInt2997 * -193228163]) * 965917875;
		}
	}

	@OriginalMember(owner = "client!abk", name = "bt", descriptor = "(Lclient!mu;)V", line = 2511)
	@Override
	public void method5463(@OriginalArg(0) Class332 arg0) {
		@Pc(3) Class328 local3 = this.aClass21_Sub2_25.aClass328_14;
		local3.method26056(arg0);
		@Pc(11) int local11;
		if (this.aClass135Array1 != null) {
			for (local11 = 0; local11 < this.aClass135Array1.length; local11++) {
				@Pc(21) Class135 local21 = this.aClass135Array1[local11];
				@Pc(23) Class135 local23 = local21;
				if (local21.aClass135_1 != null) {
					local23 = local21.aClass135_1;
				}
				local23.anInt3391 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray32[local21.anInt3387 * 1769457087] + local3.aFloatArray106[4] * (float) this.anIntArray31[local21.anInt3387 * 1769457087] + local3.aFloatArray106[8] * (float) this.anIntArray35[local21.anInt3387 * 1769457087]) * -976519565;
				local23.anInt3390 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray32[local21.anInt3387 * 1769457087] + local3.aFloatArray106[5] * (float) this.anIntArray31[local21.anInt3387 * 1769457087] + local3.aFloatArray106[9] * (float) this.anIntArray35[local21.anInt3387 * 1769457087]) * 458577149;
				local23.anInt3385 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray32[local21.anInt3387 * 1769457087] + local3.aFloatArray106[6] * (float) this.anIntArray31[local21.anInt3387 * 1769457087] + local3.aFloatArray106[10] * (float) this.anIntArray35[local21.anInt3387 * 1769457087]) * -1599219563;
				local23.anInt3392 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray32[local21.anInt3388 * -2046385949] + local3.aFloatArray106[4] * (float) this.anIntArray31[local21.anInt3388 * -2046385949] + local3.aFloatArray106[8] * (float) this.anIntArray35[local21.anInt3388 * -2046385949]) * 506106203;
				local23.anInt3384 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray32[local21.anInt3388 * -2046385949] + local3.aFloatArray106[5] * (float) this.anIntArray31[local21.anInt3388 * -2046385949] + local3.aFloatArray106[9] * (float) this.anIntArray35[local21.anInt3388 * -2046385949]) * 1565185457;
				local23.anInt3394 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray32[local21.anInt3388 * -2046385949] + local3.aFloatArray106[6] * (float) this.anIntArray31[local21.anInt3388 * -2046385949] + local3.aFloatArray106[10] * (float) this.anIntArray35[local21.anInt3388 * -2046385949]) * 568173405;
				local23.anInt3395 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray32[local21.anInt3389 * 2144051441] + local3.aFloatArray106[4] * (float) this.anIntArray31[local21.anInt3389 * 2144051441] + local3.aFloatArray106[8] * (float) this.anIntArray35[local21.anInt3389 * 2144051441]) * 590275719;
				local23.anInt3396 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray32[local21.anInt3389 * 2144051441] + local3.aFloatArray106[5] * (float) this.anIntArray31[local21.anInt3389 * 2144051441] + local3.aFloatArray106[9] * (float) this.anIntArray35[local21.anInt3389 * 2144051441]) * -866719829;
				local23.anInt3397 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray32[local21.anInt3389 * 2144051441] + local3.aFloatArray106[6] * (float) this.anIntArray31[local21.anInt3389 * 2144051441] + local3.aFloatArray106[10] * (float) this.anIntArray35[local21.anInt3389 * 2144051441]) * -1133642555;
			}
		}
		if (this.aClass109Array1 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass109Array1.length; local11++) {
			@Pc(505) Class109 local505 = this.aClass109Array1[local11];
			@Pc(507) Class109 local507 = local505;
			if (local505.aClass109_2 != null) {
				local507 = local505.aClass109_2;
			}
			if (local505.aClass328_95 == null) {
				local505.aClass328_95 = new Class328(local3);
			} else {
				local505.aClass328_95.method26104(local3);
			}
			local507.anInt2993 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray32[local505.anInt2997 * -193228163] + local3.aFloatArray106[4] * (float) this.anIntArray31[local505.anInt2997 * -193228163] + local3.aFloatArray106[8] * (float) this.anIntArray35[local505.anInt2997 * -193228163]) * 635550127;
			local507.anInt2995 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray32[local505.anInt2997 * -193228163] + local3.aFloatArray106[5] * (float) this.anIntArray31[local505.anInt2997 * -193228163] + local3.aFloatArray106[9] * (float) this.anIntArray35[local505.anInt2997 * -193228163]) * -698189527;
			local507.anInt2996 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray32[local505.anInt2997 * -193228163] + local3.aFloatArray106[6] * (float) this.anIntArray31[local505.anInt2997 * -193228163] + local3.aFloatArray106[10] * (float) this.anIntArray35[local505.anInt2997 * -193228163]) * 965917875;
		}
	}

	@OriginalMember(owner = "client!abk", name = "dd", descriptor = "(Lclient!mu;)V", line = 2511)
	@Override
	public void method5436(@OriginalArg(0) Class332 arg0) {
		@Pc(3) Class328 local3 = this.aClass21_Sub2_25.aClass328_14;
		local3.method26056(arg0);
		@Pc(11) int local11;
		if (this.aClass135Array1 != null) {
			for (local11 = 0; local11 < this.aClass135Array1.length; local11++) {
				@Pc(21) Class135 local21 = this.aClass135Array1[local11];
				@Pc(23) Class135 local23 = local21;
				if (local21.aClass135_1 != null) {
					local23 = local21.aClass135_1;
				}
				local23.anInt3391 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray32[local21.anInt3387 * 1769457087] + local3.aFloatArray106[4] * (float) this.anIntArray31[local21.anInt3387 * 1769457087] + local3.aFloatArray106[8] * (float) this.anIntArray35[local21.anInt3387 * 1769457087]) * -976519565;
				local23.anInt3390 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray32[local21.anInt3387 * 1769457087] + local3.aFloatArray106[5] * (float) this.anIntArray31[local21.anInt3387 * 1769457087] + local3.aFloatArray106[9] * (float) this.anIntArray35[local21.anInt3387 * 1769457087]) * 458577149;
				local23.anInt3385 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray32[local21.anInt3387 * 1769457087] + local3.aFloatArray106[6] * (float) this.anIntArray31[local21.anInt3387 * 1769457087] + local3.aFloatArray106[10] * (float) this.anIntArray35[local21.anInt3387 * 1769457087]) * -1599219563;
				local23.anInt3392 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray32[local21.anInt3388 * -2046385949] + local3.aFloatArray106[4] * (float) this.anIntArray31[local21.anInt3388 * -2046385949] + local3.aFloatArray106[8] * (float) this.anIntArray35[local21.anInt3388 * -2046385949]) * 506106203;
				local23.anInt3384 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray32[local21.anInt3388 * -2046385949] + local3.aFloatArray106[5] * (float) this.anIntArray31[local21.anInt3388 * -2046385949] + local3.aFloatArray106[9] * (float) this.anIntArray35[local21.anInt3388 * -2046385949]) * 1565185457;
				local23.anInt3394 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray32[local21.anInt3388 * -2046385949] + local3.aFloatArray106[6] * (float) this.anIntArray31[local21.anInt3388 * -2046385949] + local3.aFloatArray106[10] * (float) this.anIntArray35[local21.anInt3388 * -2046385949]) * 568173405;
				local23.anInt3395 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray32[local21.anInt3389 * 2144051441] + local3.aFloatArray106[4] * (float) this.anIntArray31[local21.anInt3389 * 2144051441] + local3.aFloatArray106[8] * (float) this.anIntArray35[local21.anInt3389 * 2144051441]) * 590275719;
				local23.anInt3396 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray32[local21.anInt3389 * 2144051441] + local3.aFloatArray106[5] * (float) this.anIntArray31[local21.anInt3389 * 2144051441] + local3.aFloatArray106[9] * (float) this.anIntArray35[local21.anInt3389 * 2144051441]) * -866719829;
				local23.anInt3397 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray32[local21.anInt3389 * 2144051441] + local3.aFloatArray106[6] * (float) this.anIntArray31[local21.anInt3389 * 2144051441] + local3.aFloatArray106[10] * (float) this.anIntArray35[local21.anInt3389 * 2144051441]) * -1133642555;
			}
		}
		if (this.aClass109Array1 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass109Array1.length; local11++) {
			@Pc(505) Class109 local505 = this.aClass109Array1[local11];
			@Pc(507) Class109 local507 = local505;
			if (local505.aClass109_2 != null) {
				local507 = local505.aClass109_2;
			}
			if (local505.aClass328_95 == null) {
				local505.aClass328_95 = new Class328(local3);
			} else {
				local505.aClass328_95.method26104(local3);
			}
			local507.anInt2993 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray32[local505.anInt2997 * -193228163] + local3.aFloatArray106[4] * (float) this.anIntArray31[local505.anInt2997 * -193228163] + local3.aFloatArray106[8] * (float) this.anIntArray35[local505.anInt2997 * -193228163]) * 635550127;
			local507.anInt2995 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray32[local505.anInt2997 * -193228163] + local3.aFloatArray106[5] * (float) this.anIntArray31[local505.anInt2997 * -193228163] + local3.aFloatArray106[9] * (float) this.anIntArray35[local505.anInt2997 * -193228163]) * -698189527;
			local507.anInt2996 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray32[local505.anInt2997 * -193228163] + local3.aFloatArray106[6] * (float) this.anIntArray31[local505.anInt2997 * -193228163] + local3.aFloatArray106[10] * (float) this.anIntArray35[local505.anInt2997 * -193228163]) * 965917875;
		}
	}

	@OriginalMember(owner = "client!abk", name = "ai", descriptor = "(IILclient!mu;ZI)Z", line = 2544)
	@Override
	public boolean method5417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class328 local3 = this.aClass21_Sub2_25.aClass328_14;
		local3.method26056(arg2);
		local3.method26046(this.aClass21_Sub2_25.aClass328_13);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(34) int local34 = this.aShort2 - this.aShort5 >> 1;
		@Pc(42) int local42 = this.aShort9 - this.aShort4 >> 1;
		@Pc(50) int local50 = this.aShort7 - this.aShort6 >> 1;
		@Pc(55) int local55 = this.aShort5 + local34;
		@Pc(60) int local60 = this.aShort4 + local42;
		@Pc(65) int local65 = this.aShort6 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray37[0] = local71;
		anIntArray38[0] = local77;
		anIntArray34[0] = local83;
		anIntArray37[1] = local89;
		anIntArray38[1] = local77;
		anIntArray34[1] = local83;
		anIntArray37[2] = local71;
		anIntArray38[2] = local95;
		anIntArray34[2] = local83;
		anIntArray37[3] = local89;
		anIntArray38[3] = local95;
		anIntArray34[3] = local83;
		anIntArray37[4] = local71;
		anIntArray38[4] = local77;
		anIntArray34[4] = local101;
		anIntArray37[5] = local89;
		anIntArray38[5] = local77;
		anIntArray34[5] = local101;
		anIntArray37[6] = local71;
		anIntArray38[6] = local95;
		anIntArray34[6] = local101;
		anIntArray37[7] = local89;
		anIntArray38[7] = local95;
		anIntArray34[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray37[local199];
			local210 = anIntArray38[local199];
			local214 = anIntArray34[local199];
			local243 = local3.aFloatArray106[2] * (float) local206 + local3.aFloatArray106[6] * (float) local210 + local3.aFloatArray106[10] * (float) local214 + local3.aFloatArray106[14];
			local272 = local3.aFloatArray106[3] * (float) local206 + local3.aFloatArray106[7] * (float) local210 + local3.aFloatArray106[11] * (float) local214 + local3.aFloatArray106[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray106[0] * (float) local206 + local3.aFloatArray106[4] * (float) local210 + local3.aFloatArray106[8] * (float) local214 + local3.aFloatArray106[12];
				local335 = local3.aFloatArray106[1] * (float) local206 + local3.aFloatArray106[5] * (float) local210 + local3.aFloatArray106[9] * (float) local214 + local3.aFloatArray106[13];
				@Pc(348) int local348 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local306 / local272);
				local361 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local335 / local272);
				if (local348 < local15) {
					local15 = local348;
				}
				if (local348 > local17) {
					local17 = local348;
				}
				if (local361 < local19) {
					local19 = local361;
				}
				if (local361 > local21) {
					local21 = local361;
				}
				local13 = true;
			}
		}
		if (local13 && arg0 > local15 && arg0 < local17 && arg1 > local19 && arg1 < local21) {
			if (arg3) {
				return true;
			}
			if (this.aClass21_Sub2_25.anIntArray50.length < this.anInt222) {
				this.aClass21_Sub2_25.anIntArray50 = new int[this.anInt222];
				this.aClass21_Sub2_25.anIntArray51 = new int[this.anInt222];
			}
			@Pc(426) int[] local426 = this.aClass21_Sub2_25.anIntArray50;
			@Pc(430) int[] local430 = this.aClass21_Sub2_25.anIntArray51;
			for (local361 = 0; local361 < this.anInt221; local361++) {
				local206 = this.anIntArray32[local361];
				local210 = this.anIntArray31[local361];
				local214 = this.anIntArray35[local361];
				local243 = local3.aFloatArray106[2] * (float) local206 + local3.aFloatArray106[6] * (float) local210 + local3.aFloatArray106[10] * (float) local214 + local3.aFloatArray106[14];
				local272 = local3.aFloatArray106[3] * (float) local206 + local3.aFloatArray106[7] * (float) local210 + local3.aFloatArray106[11] * (float) local214 + local3.aFloatArray106[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray106[0] * (float) local206 + local3.aFloatArray106[4] * (float) local210 + local3.aFloatArray106[8] * (float) local214 + local3.aFloatArray106[12];
					local335 = local3.aFloatArray106[1] * (float) local206 + local3.aFloatArray106[5] * (float) local210 + local3.aFloatArray106[9] * (float) local214 + local3.aFloatArray106[13];
					local577 = this.anIntArray36[local361];
					local584 = this.anIntArray36[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray11[local586] != 0; local586++) {
						local604 = (this.aShortArray11[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local306 / local272);
						local430[local604] = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray36[local361];
					local584 = this.anIntArray36[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray11[local586] != 0; local586++) {
						local604 = (this.aShortArray11[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt223; local361++) {
				if (local426[this.aShortArray9[local361] & 0xFFFF] != -999999 && local426[this.aShortArray5[local361] & 0xFFFF] != -999999 && local426[this.aShortArray8[local361] & 0xFFFF] != -999999 && this.method2290(arg0, arg1, local430[this.aShortArray9[local361] & 0xFFFF], local430[this.aShortArray5[local361] & 0xFFFF], local430[this.aShortArray8[local361] & 0xFFFF], local426[this.aShortArray9[local361] & 0xFFFF], local426[this.aShortArray5[local361] & 0xFFFF], local426[this.aShortArray8[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!abk", name = "dr", descriptor = "(IILclient!mu;ZI)Z", line = 2544)
	@Override
	public boolean method5433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class328 local3 = this.aClass21_Sub2_25.aClass328_14;
		local3.method26056(arg2);
		local3.method26046(this.aClass21_Sub2_25.aClass328_13);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(34) int local34 = this.aShort2 - this.aShort5 >> 1;
		@Pc(42) int local42 = this.aShort9 - this.aShort4 >> 1;
		@Pc(50) int local50 = this.aShort7 - this.aShort6 >> 1;
		@Pc(55) int local55 = this.aShort5 + local34;
		@Pc(60) int local60 = this.aShort4 + local42;
		@Pc(65) int local65 = this.aShort6 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray37[0] = local71;
		anIntArray38[0] = local77;
		anIntArray34[0] = local83;
		anIntArray37[1] = local89;
		anIntArray38[1] = local77;
		anIntArray34[1] = local83;
		anIntArray37[2] = local71;
		anIntArray38[2] = local95;
		anIntArray34[2] = local83;
		anIntArray37[3] = local89;
		anIntArray38[3] = local95;
		anIntArray34[3] = local83;
		anIntArray37[4] = local71;
		anIntArray38[4] = local77;
		anIntArray34[4] = local101;
		anIntArray37[5] = local89;
		anIntArray38[5] = local77;
		anIntArray34[5] = local101;
		anIntArray37[6] = local71;
		anIntArray38[6] = local95;
		anIntArray34[6] = local101;
		anIntArray37[7] = local89;
		anIntArray38[7] = local95;
		anIntArray34[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray37[local199];
			local210 = anIntArray38[local199];
			local214 = anIntArray34[local199];
			local243 = local3.aFloatArray106[2] * (float) local206 + local3.aFloatArray106[6] * (float) local210 + local3.aFloatArray106[10] * (float) local214 + local3.aFloatArray106[14];
			local272 = local3.aFloatArray106[3] * (float) local206 + local3.aFloatArray106[7] * (float) local210 + local3.aFloatArray106[11] * (float) local214 + local3.aFloatArray106[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray106[0] * (float) local206 + local3.aFloatArray106[4] * (float) local210 + local3.aFloatArray106[8] * (float) local214 + local3.aFloatArray106[12];
				local335 = local3.aFloatArray106[1] * (float) local206 + local3.aFloatArray106[5] * (float) local210 + local3.aFloatArray106[9] * (float) local214 + local3.aFloatArray106[13];
				@Pc(348) int local348 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local306 / local272);
				local361 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local335 / local272);
				if (local348 < local15) {
					local15 = local348;
				}
				if (local348 > local17) {
					local17 = local348;
				}
				if (local361 < local19) {
					local19 = local361;
				}
				if (local361 > local21) {
					local21 = local361;
				}
				local13 = true;
			}
		}
		if (local13 && arg0 > local15 && arg0 < local17 && arg1 > local19 && arg1 < local21) {
			if (arg3) {
				return true;
			}
			if (this.aClass21_Sub2_25.anIntArray50.length < this.anInt222) {
				this.aClass21_Sub2_25.anIntArray50 = new int[this.anInt222];
				this.aClass21_Sub2_25.anIntArray51 = new int[this.anInt222];
			}
			@Pc(426) int[] local426 = this.aClass21_Sub2_25.anIntArray50;
			@Pc(430) int[] local430 = this.aClass21_Sub2_25.anIntArray51;
			for (local361 = 0; local361 < this.anInt221; local361++) {
				local206 = this.anIntArray32[local361];
				local210 = this.anIntArray31[local361];
				local214 = this.anIntArray35[local361];
				local243 = local3.aFloatArray106[2] * (float) local206 + local3.aFloatArray106[6] * (float) local210 + local3.aFloatArray106[10] * (float) local214 + local3.aFloatArray106[14];
				local272 = local3.aFloatArray106[3] * (float) local206 + local3.aFloatArray106[7] * (float) local210 + local3.aFloatArray106[11] * (float) local214 + local3.aFloatArray106[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray106[0] * (float) local206 + local3.aFloatArray106[4] * (float) local210 + local3.aFloatArray106[8] * (float) local214 + local3.aFloatArray106[12];
					local335 = local3.aFloatArray106[1] * (float) local206 + local3.aFloatArray106[5] * (float) local210 + local3.aFloatArray106[9] * (float) local214 + local3.aFloatArray106[13];
					local577 = this.anIntArray36[local361];
					local584 = this.anIntArray36[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray11[local586] != 0; local586++) {
						local604 = (this.aShortArray11[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local306 / local272);
						local430[local604] = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray36[local361];
					local584 = this.anIntArray36[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray11[local586] != 0; local586++) {
						local604 = (this.aShortArray11[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt223; local361++) {
				if (local426[this.aShortArray9[local361] & 0xFFFF] != -999999 && local426[this.aShortArray5[local361] & 0xFFFF] != -999999 && local426[this.aShortArray8[local361] & 0xFFFF] != -999999 && this.method2290(arg0, arg1, local430[this.aShortArray9[local361] & 0xFFFF], local430[this.aShortArray5[local361] & 0xFFFF], local430[this.aShortArray8[local361] & 0xFFFF], local426[this.aShortArray9[local361] & 0xFFFF], local426[this.aShortArray5[local361] & 0xFFFF], local426[this.aShortArray8[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!abk", name = "dc", descriptor = "(IILclient!mu;ZI)Z", line = 2544)
	@Override
	public boolean method5434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class328 local3 = this.aClass21_Sub2_25.aClass328_14;
		local3.method26056(arg2);
		local3.method26046(this.aClass21_Sub2_25.aClass328_13);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(34) int local34 = this.aShort2 - this.aShort5 >> 1;
		@Pc(42) int local42 = this.aShort9 - this.aShort4 >> 1;
		@Pc(50) int local50 = this.aShort7 - this.aShort6 >> 1;
		@Pc(55) int local55 = this.aShort5 + local34;
		@Pc(60) int local60 = this.aShort4 + local42;
		@Pc(65) int local65 = this.aShort6 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray37[0] = local71;
		anIntArray38[0] = local77;
		anIntArray34[0] = local83;
		anIntArray37[1] = local89;
		anIntArray38[1] = local77;
		anIntArray34[1] = local83;
		anIntArray37[2] = local71;
		anIntArray38[2] = local95;
		anIntArray34[2] = local83;
		anIntArray37[3] = local89;
		anIntArray38[3] = local95;
		anIntArray34[3] = local83;
		anIntArray37[4] = local71;
		anIntArray38[4] = local77;
		anIntArray34[4] = local101;
		anIntArray37[5] = local89;
		anIntArray38[5] = local77;
		anIntArray34[5] = local101;
		anIntArray37[6] = local71;
		anIntArray38[6] = local95;
		anIntArray34[6] = local101;
		anIntArray37[7] = local89;
		anIntArray38[7] = local95;
		anIntArray34[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray37[local199];
			local210 = anIntArray38[local199];
			local214 = anIntArray34[local199];
			local243 = local3.aFloatArray106[2] * (float) local206 + local3.aFloatArray106[6] * (float) local210 + local3.aFloatArray106[10] * (float) local214 + local3.aFloatArray106[14];
			local272 = local3.aFloatArray106[3] * (float) local206 + local3.aFloatArray106[7] * (float) local210 + local3.aFloatArray106[11] * (float) local214 + local3.aFloatArray106[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray106[0] * (float) local206 + local3.aFloatArray106[4] * (float) local210 + local3.aFloatArray106[8] * (float) local214 + local3.aFloatArray106[12];
				local335 = local3.aFloatArray106[1] * (float) local206 + local3.aFloatArray106[5] * (float) local210 + local3.aFloatArray106[9] * (float) local214 + local3.aFloatArray106[13];
				@Pc(348) int local348 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local306 / local272);
				local361 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local335 / local272);
				if (local348 < local15) {
					local15 = local348;
				}
				if (local348 > local17) {
					local17 = local348;
				}
				if (local361 < local19) {
					local19 = local361;
				}
				if (local361 > local21) {
					local21 = local361;
				}
				local13 = true;
			}
		}
		if (local13 && arg0 > local15 && arg0 < local17 && arg1 > local19 && arg1 < local21) {
			if (arg3) {
				return true;
			}
			if (this.aClass21_Sub2_25.anIntArray50.length < this.anInt222) {
				this.aClass21_Sub2_25.anIntArray50 = new int[this.anInt222];
				this.aClass21_Sub2_25.anIntArray51 = new int[this.anInt222];
			}
			@Pc(426) int[] local426 = this.aClass21_Sub2_25.anIntArray50;
			@Pc(430) int[] local430 = this.aClass21_Sub2_25.anIntArray51;
			for (local361 = 0; local361 < this.anInt221; local361++) {
				local206 = this.anIntArray32[local361];
				local210 = this.anIntArray31[local361];
				local214 = this.anIntArray35[local361];
				local243 = local3.aFloatArray106[2] * (float) local206 + local3.aFloatArray106[6] * (float) local210 + local3.aFloatArray106[10] * (float) local214 + local3.aFloatArray106[14];
				local272 = local3.aFloatArray106[3] * (float) local206 + local3.aFloatArray106[7] * (float) local210 + local3.aFloatArray106[11] * (float) local214 + local3.aFloatArray106[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray106[0] * (float) local206 + local3.aFloatArray106[4] * (float) local210 + local3.aFloatArray106[8] * (float) local214 + local3.aFloatArray106[12];
					local335 = local3.aFloatArray106[1] * (float) local206 + local3.aFloatArray106[5] * (float) local210 + local3.aFloatArray106[9] * (float) local214 + local3.aFloatArray106[13];
					local577 = this.anIntArray36[local361];
					local584 = this.anIntArray36[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray11[local586] != 0; local586++) {
						local604 = (this.aShortArray11[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local306 / local272);
						local430[local604] = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray36[local361];
					local584 = this.anIntArray36[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray11[local586] != 0; local586++) {
						local604 = (this.aShortArray11[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt223; local361++) {
				if (local426[this.aShortArray9[local361] & 0xFFFF] != -999999 && local426[this.aShortArray5[local361] & 0xFFFF] != -999999 && local426[this.aShortArray8[local361] & 0xFFFF] != -999999 && this.method2290(arg0, arg1, local430[this.aShortArray9[local361] & 0xFFFF], local430[this.aShortArray5[local361] & 0xFFFF], local430[this.aShortArray8[local361] & 0xFFFF], local426[this.aShortArray9[local361] & 0xFFFF], local426[this.aShortArray5[local361] & 0xFFFF], local426[this.aShortArray8[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!abk", name = "hk", descriptor = "(IIIIIIII)Z", line = 2659)
	boolean method2290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!abk", name = "he", descriptor = "(IIIIIIII)Z", line = 2659)
	boolean method2306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!abk", name = "hj", descriptor = "(IIIIIIII)Z", line = 2659)
	boolean method2307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!abk", name = "de", descriptor = "(Lclient!amd;)Lclient!amd;", line = 2667)
	@Override
	public Class3_Sub1_Sub3 method5439(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		if (this.anInt222 == 0) {
			return null;
		}
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass21_Sub2_25.anInt377 > 0) {
			local29 = this.aShort5 - (this.aShort9 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local45 = this.aShort2 - (this.aShort4 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
		} else {
			local29 = this.aShort5 - (this.aShort4 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local45 = this.aShort2 - (this.aShort9 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass21_Sub2_25.anInt431 > 0) {
			local98 = this.aShort6 - (this.aShort9 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local114 = this.aShort7 - (this.aShort4 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
		} else {
			local98 = this.aShort6 - (this.aShort4 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local114 = this.aShort7 - (this.aShort9 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class3_Sub1_Sub3_Sub1 local162 = (Class3_Sub1_Sub3_Sub1) arg0;
		@Pc(171) Class3_Sub1_Sub3_Sub1 local171;
		if (local162 != null && local162.method20661(local153, local159)) {
			local171 = local162;
			local162.method20667();
		} else {
			local171 = new Class3_Sub1_Sub3_Sub1(this.aClass21_Sub2_25, local153, local159);
		}
		local171.method20662(local29, local98, local45, local114);
		this.method2283(local171);
		return local171;
	}

	@OriginalMember(owner = "client!abk", name = "aq", descriptor = "(Lclient!amd;)Lclient!amd;", line = 2667)
	@Override
	public Class3_Sub1_Sub3 method5357(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		if (this.anInt222 == 0) {
			return null;
		}
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass21_Sub2_25.anInt377 > 0) {
			local29 = this.aShort5 - (this.aShort9 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local45 = this.aShort2 - (this.aShort4 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
		} else {
			local29 = this.aShort5 - (this.aShort4 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local45 = this.aShort2 - (this.aShort9 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass21_Sub2_25.anInt431 > 0) {
			local98 = this.aShort6 - (this.aShort9 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local114 = this.aShort7 - (this.aShort4 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
		} else {
			local98 = this.aShort6 - (this.aShort4 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local114 = this.aShort7 - (this.aShort9 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class3_Sub1_Sub3_Sub1 local162 = (Class3_Sub1_Sub3_Sub1) arg0;
		@Pc(171) Class3_Sub1_Sub3_Sub1 local171;
		if (local162 != null && local162.method20661(local153, local159)) {
			local171 = local162;
			local162.method20667();
		} else {
			local171 = new Class3_Sub1_Sub3_Sub1(this.aClass21_Sub2_25, local153, local159);
		}
		local171.method20662(local29, local98, local45, local114);
		this.method2283(local171);
		return local171;
	}

	@OriginalMember(owner = "client!abk", name = "da", descriptor = "(Lclient!amd;)Lclient!amd;", line = 2667)
	@Override
	public Class3_Sub1_Sub3 method5437(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		if (this.anInt222 == 0) {
			return null;
		}
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass21_Sub2_25.anInt377 > 0) {
			local29 = this.aShort5 - (this.aShort9 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local45 = this.aShort2 - (this.aShort4 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
		} else {
			local29 = this.aShort5 - (this.aShort4 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local45 = this.aShort2 - (this.aShort9 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass21_Sub2_25.anInt431 > 0) {
			local98 = this.aShort6 - (this.aShort9 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local114 = this.aShort7 - (this.aShort4 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
		} else {
			local98 = this.aShort6 - (this.aShort4 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local114 = this.aShort7 - (this.aShort9 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class3_Sub1_Sub3_Sub1 local162 = (Class3_Sub1_Sub3_Sub1) arg0;
		@Pc(171) Class3_Sub1_Sub3_Sub1 local171;
		if (local162 != null && local162.method20661(local153, local159)) {
			local171 = local162;
			local162.method20667();
		} else {
			local171 = new Class3_Sub1_Sub3_Sub1(this.aClass21_Sub2_25, local153, local159);
		}
		local171.method20662(local29, local98, local45, local114);
		this.method2283(local171);
		return local171;
	}

	@OriginalMember(owner = "client!abk", name = "dz", descriptor = "(Lclient!amd;)Lclient!amd;", line = 2667)
	@Override
	public Class3_Sub1_Sub3 method5507(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		if (this.anInt222 == 0) {
			return null;
		}
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass21_Sub2_25.anInt377 > 0) {
			local29 = this.aShort5 - (this.aShort9 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local45 = this.aShort2 - (this.aShort4 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
		} else {
			local29 = this.aShort5 - (this.aShort4 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local45 = this.aShort2 - (this.aShort9 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass21_Sub2_25.anInt431 > 0) {
			local98 = this.aShort6 - (this.aShort9 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local114 = this.aShort7 - (this.aShort4 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
		} else {
			local98 = this.aShort6 - (this.aShort4 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local114 = this.aShort7 - (this.aShort9 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class3_Sub1_Sub3_Sub1 local162 = (Class3_Sub1_Sub3_Sub1) arg0;
		@Pc(171) Class3_Sub1_Sub3_Sub1 local171;
		if (local162 != null && local162.method20661(local153, local159)) {
			local171 = local162;
			local162.method20667();
		} else {
			local171 = new Class3_Sub1_Sub3_Sub1(this.aClass21_Sub2_25, local153, local159);
		}
		local171.method20662(local29, local98, local45, local114);
		this.method2283(local171);
		return local171;
	}

	@OriginalMember(owner = "client!abk", name = "dl", descriptor = "(Lclient!amd;)Lclient!amd;", line = 2667)
	@Override
	public Class3_Sub1_Sub3 method5509(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		if (this.anInt222 == 0) {
			return null;
		}
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass21_Sub2_25.anInt377 > 0) {
			local29 = this.aShort5 - (this.aShort9 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local45 = this.aShort2 - (this.aShort4 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
		} else {
			local29 = this.aShort5 - (this.aShort4 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local45 = this.aShort2 - (this.aShort9 * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass21_Sub2_25.anInt431 > 0) {
			local98 = this.aShort6 - (this.aShort9 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local114 = this.aShort7 - (this.aShort4 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
		} else {
			local98 = this.aShort6 - (this.aShort4 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
			local114 = this.aShort7 - (this.aShort9 * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class3_Sub1_Sub3_Sub1 local162 = (Class3_Sub1_Sub3_Sub1) arg0;
		@Pc(171) Class3_Sub1_Sub3_Sub1 local171;
		if (local162 != null && local162.method20661(local153, local159)) {
			local171 = local162;
			local162.method20667();
		} else {
			local171 = new Class3_Sub1_Sub3_Sub1(this.aClass21_Sub2_25, local153, local159);
		}
		local171.method20662(local29, local98, local45, local114);
		this.method2283(local171);
		return local171;
	}

	@OriginalMember(owner = "client!abk", name = "ha", descriptor = "(Lclient!aoc;)V", line = 2704)
	void method2283(@OriginalArg(0) Class3_Sub1_Sub3_Sub1 arg0) {
		if (this.aClass21_Sub2_25.anIntArray50.length < this.anInt222) {
			this.aClass21_Sub2_25.anIntArray50 = new int[this.anInt222];
			this.aClass21_Sub2_25.anIntArray51 = new int[this.anInt222];
		}
		@Pc(22) int[] local22 = this.aClass21_Sub2_25.anIntArray50;
		@Pc(26) int[] local26 = this.aClass21_Sub2_25.anIntArray51;
		@Pc(28) int local28;
		@Pc(55) int local55;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(110) int local110;
		for (local28 = 0; local28 < this.anInt221; local28++) {
			local55 = (this.anIntArray32[local28] - (this.anIntArray31[local28] * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408) - arg0.anInt2825;
			local78 = (this.anIntArray35[local28] - (this.anIntArray31[local28] * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408) - arg0.anInt2826;
			local83 = this.anIntArray36[local28];
			local90 = this.anIntArray36[local28 + 1];
			for (local92 = local83; local92 < local90 && this.aShortArray11[local92] != 0; local92++) {
				local110 = (this.aShortArray11[local92] & 0xFFFF) - 1;
				local22[local110] = local55;
				local26[local110] = local78;
			}
		}
		for (local28 = 0; local28 < this.anInt224; local28++) {
			if (this.aByteArray5 == null || this.aByteArray5[local28] <= 128) {
				local55 = this.aShortArray9[local28] & 0xFFFF;
				local78 = this.aShortArray5[local28] & 0xFFFF;
				local83 = this.aShortArray8[local28] & 0xFFFF;
				local90 = local22[local55];
				local92 = local22[local78];
				local110 = local22[local83];
				@Pc(175) int local175 = local26[local55];
				@Pc(179) int local179 = local26[local78];
				@Pc(183) int local183 = local26[local83];
				if ((local90 - local92) * (local179 - local183) - (local179 - local175) * (local110 - local92) > 0) {
					arg0.method20663(local175, local179, local183, local90, local92, local110);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "hu", descriptor = "(Lclient!aoc;)V", line = 2704)
	void method2308(@OriginalArg(0) Class3_Sub1_Sub3_Sub1 arg0) {
		if (this.aClass21_Sub2_25.anIntArray50.length < this.anInt222) {
			this.aClass21_Sub2_25.anIntArray50 = new int[this.anInt222];
			this.aClass21_Sub2_25.anIntArray51 = new int[this.anInt222];
		}
		@Pc(22) int[] local22 = this.aClass21_Sub2_25.anIntArray50;
		@Pc(26) int[] local26 = this.aClass21_Sub2_25.anIntArray51;
		@Pc(28) int local28;
		@Pc(55) int local55;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(110) int local110;
		for (local28 = 0; local28 < this.anInt221; local28++) {
			local55 = (this.anIntArray32[local28] - (this.anIntArray31[local28] * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408) - arg0.anInt2825;
			local78 = (this.anIntArray35[local28] - (this.anIntArray31[local28] * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408) - arg0.anInt2826;
			local83 = this.anIntArray36[local28];
			local90 = this.anIntArray36[local28 + 1];
			for (local92 = local83; local92 < local90 && this.aShortArray11[local92] != 0; local92++) {
				local110 = (this.aShortArray11[local92] & 0xFFFF) - 1;
				local22[local110] = local55;
				local26[local110] = local78;
			}
		}
		for (local28 = 0; local28 < this.anInt224; local28++) {
			if (this.aByteArray5 == null || this.aByteArray5[local28] <= 128) {
				local55 = this.aShortArray9[local28] & 0xFFFF;
				local78 = this.aShortArray5[local28] & 0xFFFF;
				local83 = this.aShortArray8[local28] & 0xFFFF;
				local90 = local22[local55];
				local92 = local22[local78];
				local110 = local22[local83];
				@Pc(175) int local175 = local26[local55];
				@Pc(179) int local179 = local26[local78];
				@Pc(183) int local183 = local26[local83];
				if ((local90 - local92) * (local179 - local183) - (local179 - local175) * (local110 - local92) > 0) {
					arg0.method20663(local175, local179, local183, local90, local92, local110);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "hl", descriptor = "(Lclient!aoc;)V", line = 2704)
	void method2309(@OriginalArg(0) Class3_Sub1_Sub3_Sub1 arg0) {
		if (this.aClass21_Sub2_25.anIntArray50.length < this.anInt222) {
			this.aClass21_Sub2_25.anIntArray50 = new int[this.anInt222];
			this.aClass21_Sub2_25.anIntArray51 = new int[this.anInt222];
		}
		@Pc(22) int[] local22 = this.aClass21_Sub2_25.anIntArray50;
		@Pc(26) int[] local26 = this.aClass21_Sub2_25.anIntArray51;
		@Pc(28) int local28;
		@Pc(55) int local55;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(110) int local110;
		for (local28 = 0; local28 < this.anInt221; local28++) {
			local55 = (this.anIntArray32[local28] - (this.anIntArray31[local28] * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408) - arg0.anInt2825;
			local78 = (this.anIntArray35[local28] - (this.anIntArray31[local28] * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408) - arg0.anInt2826;
			local83 = this.anIntArray36[local28];
			local90 = this.anIntArray36[local28 + 1];
			for (local92 = local83; local92 < local90 && this.aShortArray11[local92] != 0; local92++) {
				local110 = (this.aShortArray11[local92] & 0xFFFF) - 1;
				local22[local110] = local55;
				local26[local110] = local78;
			}
		}
		for (local28 = 0; local28 < this.anInt224; local28++) {
			if (this.aByteArray5 == null || this.aByteArray5[local28] <= 128) {
				local55 = this.aShortArray9[local28] & 0xFFFF;
				local78 = this.aShortArray5[local28] & 0xFFFF;
				local83 = this.aShortArray8[local28] & 0xFFFF;
				local90 = local22[local55];
				local92 = local22[local78];
				local110 = local22[local83];
				@Pc(175) int local175 = local26[local55];
				@Pc(179) int local179 = local26[local78];
				@Pc(183) int local183 = local26[local83];
				if ((local90 - local92) * (local179 - local183) - (local179 - local175) * (local110 - local92) > 0) {
					arg0.method20663(local175, local179, local183, local90, local92, local110);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "ik", descriptor = "(Lclient!aoc;)V", line = 2704)
	void method2310(@OriginalArg(0) Class3_Sub1_Sub3_Sub1 arg0) {
		if (this.aClass21_Sub2_25.anIntArray50.length < this.anInt222) {
			this.aClass21_Sub2_25.anIntArray50 = new int[this.anInt222];
			this.aClass21_Sub2_25.anIntArray51 = new int[this.anInt222];
		}
		@Pc(22) int[] local22 = this.aClass21_Sub2_25.anIntArray50;
		@Pc(26) int[] local26 = this.aClass21_Sub2_25.anIntArray51;
		@Pc(28) int local28;
		@Pc(55) int local55;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(110) int local110;
		for (local28 = 0; local28 < this.anInt221; local28++) {
			local55 = (this.anIntArray32[local28] - (this.anIntArray31[local28] * this.aClass21_Sub2_25.anInt377 >> 8) >> this.aClass21_Sub2_25.anInt408) - arg0.anInt2825;
			local78 = (this.anIntArray35[local28] - (this.anIntArray31[local28] * this.aClass21_Sub2_25.anInt431 >> 8) >> this.aClass21_Sub2_25.anInt408) - arg0.anInt2826;
			local83 = this.anIntArray36[local28];
			local90 = this.anIntArray36[local28 + 1];
			for (local92 = local83; local92 < local90 && this.aShortArray11[local92] != 0; local92++) {
				local110 = (this.aShortArray11[local92] & 0xFFFF) - 1;
				local22[local110] = local55;
				local26[local110] = local78;
			}
		}
		for (local28 = 0; local28 < this.anInt224; local28++) {
			if (this.aByteArray5 == null || this.aByteArray5[local28] <= 128) {
				local55 = this.aShortArray9[local28] & 0xFFFF;
				local78 = this.aShortArray5[local28] & 0xFFFF;
				local83 = this.aShortArray8[local28] & 0xFFFF;
				local90 = local22[local55];
				local92 = local22[local78];
				local110 = local22[local83];
				@Pc(175) int local175 = local26[local55];
				@Pc(179) int local179 = local26[local78];
				@Pc(183) int local183 = local26[local83];
				if ((local90 - local92) * (local179 - local183) - (local179 - local175) * (local110 - local92) > 0) {
					arg0.method20663(local175, local179, local183, local90, local92, local110);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abk", name = "ds", descriptor = "(Lclient!mu;Lclient!du;I)V", line = 2740)
	@Override
	public void method5432(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt222 == 0) {
			return;
		}
		@Pc(14) Class328 local14 = this.aClass21_Sub2_25.aClass328_15;
		@Pc(18) Class328 local18 = this.aClass21_Sub2_25.aClass328_14;
		@Pc(22) Class328 local22 = this.aClass21_Sub2_25.aClass328_7;
		local18.method26056(arg0);
		local22.method26104(local18);
		local22.method26046(this.aClass21_Sub2_25.aClass328_13);
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(42) float[] local42 = this.aClass21_Sub2_25.aFloatArray27;
		local18.method26052(0.0F, (float) this.aShort4, 0.0F, local42);
		@Pc(54) float local54 = local42[0];
		@Pc(58) float local58 = local42[1];
		@Pc(62) float local62 = local42[2];
		local18.method26052(0.0F, (float) this.aShort9, 0.0F, local42);
		@Pc(74) float local74 = local42[0];
		@Pc(78) float local78 = local42[1];
		@Pc(82) float local82 = local42[2];
		@Pc(119) float local119;
		@Pc(145) float local145;
		for (@Pc(84) int local84 = 0; local84 < 6; local84++) {
			@Pc(93) float[] local93 = this.aClass21_Sub2_25.aFloatArrayArray8[local84];
			local119 = local93[0] * local54 + local93[1] * local58 + local93[2] * local62 + local93[3] + (float) this.anInt228;
			local145 = local93[0] * local74 + local93[1] * local78 + local93[2] * local82 + local93[3] + (float) this.anInt228;
			if (local119 < 0.0F && local145 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(160) boolean local160 = false;
			@Pc(162) boolean local162 = true;
			@Pc(170) int local170 = this.aShort5 + this.aShort2 >> 1;
			@Pc(178) int local178 = this.aShort6 + this.aShort7 >> 1;
			@Pc(183) short local183 = this.aShort4;
			@Pc(214) float local214 = local22.aFloatArray106[0] * (float) local170 + local22.aFloatArray106[4] * (float) local183 + local22.aFloatArray106[8] * (float) local178 + local22.aFloatArray106[12];
			@Pc(243) float local243 = local22.aFloatArray106[1] * (float) local170 + local22.aFloatArray106[5] * (float) local183 + local22.aFloatArray106[9] * (float) local178 + local22.aFloatArray106[13];
			local119 = local22.aFloatArray106[2] * (float) local170 + local22.aFloatArray106[6] * (float) local183 + local22.aFloatArray106[10] * (float) local178 + local22.aFloatArray106[14];
			local145 = local22.aFloatArray106[3] * (float) local170 + local22.aFloatArray106[7] * (float) local183 + local22.aFloatArray106[11] * (float) local178 + local22.aFloatArray106[15];
			if (local119 >= -local145) {
				arg1.anInt3401 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local214 / local145);
				arg1.anInt3400 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local243 / local145);
			} else {
				local160 = true;
			}
			local183 = this.aShort9;
			@Pc(373) float local373 = local22.aFloatArray106[0] * (float) local170 + local22.aFloatArray106[4] * (float) local183 + local22.aFloatArray106[8] * (float) local178 + local22.aFloatArray106[12];
			@Pc(402) float local402 = local22.aFloatArray106[1] * (float) local170 + local22.aFloatArray106[5] * (float) local183 + local22.aFloatArray106[9] * (float) local178 + local22.aFloatArray106[13];
			@Pc(431) float local431 = local22.aFloatArray106[2] * (float) local170 + local22.aFloatArray106[6] * (float) local183 + local22.aFloatArray106[10] * (float) local178 + local22.aFloatArray106[14];
			@Pc(460) float local460 = local22.aFloatArray106[3] * (float) local170 + local22.aFloatArray106[7] * (float) local183 + local22.aFloatArray106[11] * (float) local178 + local22.aFloatArray106[15];
			if (local431 >= -local460) {
				arg1.anInt3403 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local373 / local460);
				arg1.anInt3402 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local402 / local460);
			} else {
				local160 = true;
			}
			@Pc(526) float local526;
			@Pc(534) float local534;
			if (local160) {
				if (local119 < -local145 && local431 < -local460) {
					local162 = false;
				} else {
					@Pc(542) float local542;
					@Pc(550) float local550;
					if (local119 < -local145) {
						local526 = (local119 + local145) / (local431 + local460) - 1.0F;
						local534 = local214 + local526 * (local373 - local214);
						local542 = local243 + local526 * (local402 - local243);
						local550 = local145 + local526 * (local460 - local145);
						arg1.anInt3401 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local534 / local550);
						arg1.anInt3400 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local542 / local550);
					} else if (local431 < -local460) {
						local526 = (local431 + local460) / (local119 + local145) - 1.0F;
						local534 = local373 + local526 * (local214 - local373);
						local542 = local402 + local526 * (local243 - local402);
						local550 = local460 + local526 * (local145 - local460);
						arg1.anInt3403 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local534 / local550);
						arg1.anInt3402 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local542 / local550);
					}
				}
			}
			if (local162) {
				if (local119 / local145 > local431 / local460) {
					local526 = local214 + local14.aFloatArray106[0] * (float) this.anInt228 + local14.aFloatArray106[12];
					local534 = local145 + local14.aFloatArray106[3] * (float) this.anInt228 + local14.aFloatArray106[15];
					arg1.anInt3404 = (int) (this.aClass21_Sub2_25.aFloat42 - (float) arg1.anInt3401 + this.aClass21_Sub2_25.aFloat45 * local526 / local534);
				} else {
					local526 = local373 + local14.aFloatArray106[0] * (float) this.anInt228 + local14.aFloatArray106[12];
					local534 = local460 + local14.aFloatArray106[3] * (float) this.anInt228 + local14.aFloatArray106[15];
					arg1.anInt3404 = (int) (this.aClass21_Sub2_25.aFloat42 - (float) arg1.anInt3403 + this.aClass21_Sub2_25.aFloat45 * local526 / local534);
				}
				arg1.aBoolean621 = true;
			}
		}
		this.aClass21_Sub2_25.method4119();
		this.aClass21_Sub2_25.method4205(local18);
		this.method2292();
		this.aClass21_Sub2_25.method4039();
		local18.method26046(this.aClass21_Sub2_25.aClass328_11);
		this.method2287(local18);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@OriginalMember(owner = "client!abk", name = "as", descriptor = "(Lclient!mu;Lclient!du;I)V", line = 2740)
	@Override
	public void method5352(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt222 == 0) {
			return;
		}
		@Pc(14) Class328 local14 = this.aClass21_Sub2_25.aClass328_15;
		@Pc(18) Class328 local18 = this.aClass21_Sub2_25.aClass328_14;
		@Pc(22) Class328 local22 = this.aClass21_Sub2_25.aClass328_7;
		local18.method26056(arg0);
		local22.method26104(local18);
		local22.method26046(this.aClass21_Sub2_25.aClass328_13);
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(42) float[] local42 = this.aClass21_Sub2_25.aFloatArray27;
		local18.method26052(0.0F, (float) this.aShort4, 0.0F, local42);
		@Pc(54) float local54 = local42[0];
		@Pc(58) float local58 = local42[1];
		@Pc(62) float local62 = local42[2];
		local18.method26052(0.0F, (float) this.aShort9, 0.0F, local42);
		@Pc(74) float local74 = local42[0];
		@Pc(78) float local78 = local42[1];
		@Pc(82) float local82 = local42[2];
		@Pc(119) float local119;
		@Pc(145) float local145;
		for (@Pc(84) int local84 = 0; local84 < 6; local84++) {
			@Pc(93) float[] local93 = this.aClass21_Sub2_25.aFloatArrayArray8[local84];
			local119 = local93[0] * local54 + local93[1] * local58 + local93[2] * local62 + local93[3] + (float) this.anInt228;
			local145 = local93[0] * local74 + local93[1] * local78 + local93[2] * local82 + local93[3] + (float) this.anInt228;
			if (local119 < 0.0F && local145 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(160) boolean local160 = false;
			@Pc(162) boolean local162 = true;
			@Pc(170) int local170 = this.aShort5 + this.aShort2 >> 1;
			@Pc(178) int local178 = this.aShort6 + this.aShort7 >> 1;
			@Pc(183) short local183 = this.aShort4;
			@Pc(214) float local214 = local22.aFloatArray106[0] * (float) local170 + local22.aFloatArray106[4] * (float) local183 + local22.aFloatArray106[8] * (float) local178 + local22.aFloatArray106[12];
			@Pc(243) float local243 = local22.aFloatArray106[1] * (float) local170 + local22.aFloatArray106[5] * (float) local183 + local22.aFloatArray106[9] * (float) local178 + local22.aFloatArray106[13];
			local119 = local22.aFloatArray106[2] * (float) local170 + local22.aFloatArray106[6] * (float) local183 + local22.aFloatArray106[10] * (float) local178 + local22.aFloatArray106[14];
			local145 = local22.aFloatArray106[3] * (float) local170 + local22.aFloatArray106[7] * (float) local183 + local22.aFloatArray106[11] * (float) local178 + local22.aFloatArray106[15];
			if (local119 >= -local145) {
				arg1.anInt3401 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local214 / local145);
				arg1.anInt3400 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local243 / local145);
			} else {
				local160 = true;
			}
			local183 = this.aShort9;
			@Pc(373) float local373 = local22.aFloatArray106[0] * (float) local170 + local22.aFloatArray106[4] * (float) local183 + local22.aFloatArray106[8] * (float) local178 + local22.aFloatArray106[12];
			@Pc(402) float local402 = local22.aFloatArray106[1] * (float) local170 + local22.aFloatArray106[5] * (float) local183 + local22.aFloatArray106[9] * (float) local178 + local22.aFloatArray106[13];
			@Pc(431) float local431 = local22.aFloatArray106[2] * (float) local170 + local22.aFloatArray106[6] * (float) local183 + local22.aFloatArray106[10] * (float) local178 + local22.aFloatArray106[14];
			@Pc(460) float local460 = local22.aFloatArray106[3] * (float) local170 + local22.aFloatArray106[7] * (float) local183 + local22.aFloatArray106[11] * (float) local178 + local22.aFloatArray106[15];
			if (local431 >= -local460) {
				arg1.anInt3403 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local373 / local460);
				arg1.anInt3402 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local402 / local460);
			} else {
				local160 = true;
			}
			@Pc(526) float local526;
			@Pc(534) float local534;
			if (local160) {
				if (local119 < -local145 && local431 < -local460) {
					local162 = false;
				} else {
					@Pc(542) float local542;
					@Pc(550) float local550;
					if (local119 < -local145) {
						local526 = (local119 + local145) / (local431 + local460) - 1.0F;
						local534 = local214 + local526 * (local373 - local214);
						local542 = local243 + local526 * (local402 - local243);
						local550 = local145 + local526 * (local460 - local145);
						arg1.anInt3401 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local534 / local550);
						arg1.anInt3400 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local542 / local550);
					} else if (local431 < -local460) {
						local526 = (local431 + local460) / (local119 + local145) - 1.0F;
						local534 = local373 + local526 * (local214 - local373);
						local542 = local402 + local526 * (local243 - local402);
						local550 = local460 + local526 * (local145 - local460);
						arg1.anInt3403 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local534 / local550);
						arg1.anInt3402 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local542 / local550);
					}
				}
			}
			if (local162) {
				if (local119 / local145 > local431 / local460) {
					local526 = local214 + local14.aFloatArray106[0] * (float) this.anInt228 + local14.aFloatArray106[12];
					local534 = local145 + local14.aFloatArray106[3] * (float) this.anInt228 + local14.aFloatArray106[15];
					arg1.anInt3404 = (int) (this.aClass21_Sub2_25.aFloat42 - (float) arg1.anInt3401 + this.aClass21_Sub2_25.aFloat45 * local526 / local534);
				} else {
					local526 = local373 + local14.aFloatArray106[0] * (float) this.anInt228 + local14.aFloatArray106[12];
					local534 = local460 + local14.aFloatArray106[3] * (float) this.anInt228 + local14.aFloatArray106[15];
					arg1.anInt3404 = (int) (this.aClass21_Sub2_25.aFloat42 - (float) arg1.anInt3403 + this.aClass21_Sub2_25.aFloat45 * local526 / local534);
				}
				arg1.aBoolean621 = true;
			}
		}
		this.aClass21_Sub2_25.method4119();
		this.aClass21_Sub2_25.method4205(local18);
		this.method2292();
		this.aClass21_Sub2_25.method4039();
		local18.method26046(this.aClass21_Sub2_25.aClass328_11);
		this.method2287(local18);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@OriginalMember(owner = "client!abk", name = "dq", descriptor = "(Lclient!mu;Lclient!du;I)V", line = 2740)
	@Override
	public void method5410(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt222 == 0) {
			return;
		}
		@Pc(14) Class328 local14 = this.aClass21_Sub2_25.aClass328_15;
		@Pc(18) Class328 local18 = this.aClass21_Sub2_25.aClass328_14;
		@Pc(22) Class328 local22 = this.aClass21_Sub2_25.aClass328_7;
		local18.method26056(arg0);
		local22.method26104(local18);
		local22.method26046(this.aClass21_Sub2_25.aClass328_13);
		if (!this.aBoolean51) {
			this.method2282();
		}
		@Pc(42) float[] local42 = this.aClass21_Sub2_25.aFloatArray27;
		local18.method26052(0.0F, (float) this.aShort4, 0.0F, local42);
		@Pc(54) float local54 = local42[0];
		@Pc(58) float local58 = local42[1];
		@Pc(62) float local62 = local42[2];
		local18.method26052(0.0F, (float) this.aShort9, 0.0F, local42);
		@Pc(74) float local74 = local42[0];
		@Pc(78) float local78 = local42[1];
		@Pc(82) float local82 = local42[2];
		@Pc(119) float local119;
		@Pc(145) float local145;
		for (@Pc(84) int local84 = 0; local84 < 6; local84++) {
			@Pc(93) float[] local93 = this.aClass21_Sub2_25.aFloatArrayArray8[local84];
			local119 = local93[0] * local54 + local93[1] * local58 + local93[2] * local62 + local93[3] + (float) this.anInt228;
			local145 = local93[0] * local74 + local93[1] * local78 + local93[2] * local82 + local93[3] + (float) this.anInt228;
			if (local119 < 0.0F && local145 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(160) boolean local160 = false;
			@Pc(162) boolean local162 = true;
			@Pc(170) int local170 = this.aShort5 + this.aShort2 >> 1;
			@Pc(178) int local178 = this.aShort6 + this.aShort7 >> 1;
			@Pc(183) short local183 = this.aShort4;
			@Pc(214) float local214 = local22.aFloatArray106[0] * (float) local170 + local22.aFloatArray106[4] * (float) local183 + local22.aFloatArray106[8] * (float) local178 + local22.aFloatArray106[12];
			@Pc(243) float local243 = local22.aFloatArray106[1] * (float) local170 + local22.aFloatArray106[5] * (float) local183 + local22.aFloatArray106[9] * (float) local178 + local22.aFloatArray106[13];
			local119 = local22.aFloatArray106[2] * (float) local170 + local22.aFloatArray106[6] * (float) local183 + local22.aFloatArray106[10] * (float) local178 + local22.aFloatArray106[14];
			local145 = local22.aFloatArray106[3] * (float) local170 + local22.aFloatArray106[7] * (float) local183 + local22.aFloatArray106[11] * (float) local178 + local22.aFloatArray106[15];
			if (local119 >= -local145) {
				arg1.anInt3401 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local214 / local145);
				arg1.anInt3400 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local243 / local145);
			} else {
				local160 = true;
			}
			local183 = this.aShort9;
			@Pc(373) float local373 = local22.aFloatArray106[0] * (float) local170 + local22.aFloatArray106[4] * (float) local183 + local22.aFloatArray106[8] * (float) local178 + local22.aFloatArray106[12];
			@Pc(402) float local402 = local22.aFloatArray106[1] * (float) local170 + local22.aFloatArray106[5] * (float) local183 + local22.aFloatArray106[9] * (float) local178 + local22.aFloatArray106[13];
			@Pc(431) float local431 = local22.aFloatArray106[2] * (float) local170 + local22.aFloatArray106[6] * (float) local183 + local22.aFloatArray106[10] * (float) local178 + local22.aFloatArray106[14];
			@Pc(460) float local460 = local22.aFloatArray106[3] * (float) local170 + local22.aFloatArray106[7] * (float) local183 + local22.aFloatArray106[11] * (float) local178 + local22.aFloatArray106[15];
			if (local431 >= -local460) {
				arg1.anInt3403 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local373 / local460);
				arg1.anInt3402 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local402 / local460);
			} else {
				local160 = true;
			}
			@Pc(526) float local526;
			@Pc(534) float local534;
			if (local160) {
				if (local119 < -local145 && local431 < -local460) {
					local162 = false;
				} else {
					@Pc(542) float local542;
					@Pc(550) float local550;
					if (local119 < -local145) {
						local526 = (local119 + local145) / (local431 + local460) - 1.0F;
						local534 = local214 + local526 * (local373 - local214);
						local542 = local243 + local526 * (local402 - local243);
						local550 = local145 + local526 * (local460 - local145);
						arg1.anInt3401 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local534 / local550);
						arg1.anInt3400 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local542 / local550);
					} else if (local431 < -local460) {
						local526 = (local431 + local460) / (local119 + local145) - 1.0F;
						local534 = local373 + local526 * (local214 - local373);
						local542 = local402 + local526 * (local243 - local402);
						local550 = local460 + local526 * (local145 - local460);
						arg1.anInt3403 = (int) (this.aClass21_Sub2_25.aFloat42 + this.aClass21_Sub2_25.aFloat45 * local534 / local550);
						arg1.anInt3402 = (int) (this.aClass21_Sub2_25.aFloat46 + this.aClass21_Sub2_25.aFloat47 * local542 / local550);
					}
				}
			}
			if (local162) {
				if (local119 / local145 > local431 / local460) {
					local526 = local214 + local14.aFloatArray106[0] * (float) this.anInt228 + local14.aFloatArray106[12];
					local534 = local145 + local14.aFloatArray106[3] * (float) this.anInt228 + local14.aFloatArray106[15];
					arg1.anInt3404 = (int) (this.aClass21_Sub2_25.aFloat42 - (float) arg1.anInt3401 + this.aClass21_Sub2_25.aFloat45 * local526 / local534);
				} else {
					local526 = local373 + local14.aFloatArray106[0] * (float) this.anInt228 + local14.aFloatArray106[12];
					local534 = local460 + local14.aFloatArray106[3] * (float) this.anInt228 + local14.aFloatArray106[15];
					arg1.anInt3404 = (int) (this.aClass21_Sub2_25.aFloat42 - (float) arg1.anInt3403 + this.aClass21_Sub2_25.aFloat45 * local526 / local534);
				}
				arg1.aBoolean621 = true;
			}
		}
		this.aClass21_Sub2_25.method4119();
		this.aClass21_Sub2_25.method4205(local18);
		this.method2292();
		this.aClass21_Sub2_25.method4039();
		local18.method26046(this.aClass21_Sub2_25.aClass328_11);
		this.method2287(local18);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@OriginalMember(owner = "client!abk", name = "iu", descriptor = "()V", line = 2843)
	void method2284() {
		if (this.anInt224 == 0) {
			return;
		}
		if (this.aByte1 != 0) {
			this.method2296(true);
		}
		this.method2296(false);
		if (this.aClass97_1 != null) {
			if (this.aClass97_1.anInterface7_5 == null) {
				this.method2281((this.aByte1 & 0x10) != 0);
			}
			if (this.aClass97_1.anInterface7_5 != null) {
				this.aClass21_Sub2_25.method4084(this.aClass88_6 != null);
				this.aClass21_Sub2_25.method4064(this.aClass88_5, this.aClass88_6, this.aClass88_8, this.aClass88_7);
				@Pc(59) int local59 = this.anIntArray33.length - 1;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(69) int local69 = this.anIntArray33[local61];
					@Pc(76) int local76 = this.anIntArray33[local61 + 1];
					@Pc(91) int local91 = this.aShortArray7[local69] == -1 ? -1 : this.aShortArray7[local69] & 0xFFFF;
					this.aClass21_Sub2_25.method4071(local91, this.aClass88_6 != null);
					this.aClass21_Sub2_25.method4066(this.aClass97_1.anInterface7_5, 4, local69 * 3, (local76 - local69) * 3);
				}
			}
		}
		this.method2295();
	}

	@OriginalMember(owner = "client!abk", name = "hg", descriptor = "()V", line = 2843)
	void method2292() {
		if (this.anInt224 == 0) {
			return;
		}
		if (this.aByte1 != 0) {
			this.method2296(true);
		}
		this.method2296(false);
		if (this.aClass97_1 != null) {
			if (this.aClass97_1.anInterface7_5 == null) {
				this.method2281((this.aByte1 & 0x10) != 0);
			}
			if (this.aClass97_1.anInterface7_5 != null) {
				this.aClass21_Sub2_25.method4084(this.aClass88_6 != null);
				this.aClass21_Sub2_25.method4064(this.aClass88_5, this.aClass88_6, this.aClass88_8, this.aClass88_7);
				@Pc(59) int local59 = this.anIntArray33.length - 1;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(69) int local69 = this.anIntArray33[local61];
					@Pc(76) int local76 = this.anIntArray33[local61 + 1];
					@Pc(91) int local91 = this.aShortArray7[local69] == -1 ? -1 : this.aShortArray7[local69] & 0xFFFF;
					this.aClass21_Sub2_25.method4071(local91, this.aClass88_6 != null);
					this.aClass21_Sub2_25.method4066(this.aClass97_1.anInterface7_5, 4, local69 * 3, (local76 - local69) * 3);
				}
			}
		}
		this.method2295();
	}

	@OriginalMember(owner = "client!abk", name = "id", descriptor = "()V", line = 2843)
	void method2294() {
		if (this.anInt224 == 0) {
			return;
		}
		if (this.aByte1 != 0) {
			this.method2296(true);
		}
		this.method2296(false);
		if (this.aClass97_1 != null) {
			if (this.aClass97_1.anInterface7_5 == null) {
				this.method2281((this.aByte1 & 0x10) != 0);
			}
			if (this.aClass97_1.anInterface7_5 != null) {
				this.aClass21_Sub2_25.method4084(this.aClass88_6 != null);
				this.aClass21_Sub2_25.method4064(this.aClass88_5, this.aClass88_6, this.aClass88_8, this.aClass88_7);
				@Pc(59) int local59 = this.anIntArray33.length - 1;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(69) int local69 = this.anIntArray33[local61];
					@Pc(76) int local76 = this.anIntArray33[local61 + 1];
					@Pc(91) int local91 = this.aShortArray7[local69] == -1 ? -1 : this.aShortArray7[local69] & 0xFFFF;
					this.aClass21_Sub2_25.method4071(local91, this.aClass88_6 != null);
					this.aClass21_Sub2_25.method4066(this.aClass97_1.anInterface7_5, 4, local69 * 3, (local76 - local69) * 3);
				}
			}
		}
		this.method2295();
	}

	@OriginalMember(owner = "client!abk", name = "il", descriptor = "()V", line = 2843)
	void method2311() {
		if (this.anInt224 == 0) {
			return;
		}
		if (this.aByte1 != 0) {
			this.method2296(true);
		}
		this.method2296(false);
		if (this.aClass97_1 != null) {
			if (this.aClass97_1.anInterface7_5 == null) {
				this.method2281((this.aByte1 & 0x10) != 0);
			}
			if (this.aClass97_1.anInterface7_5 != null) {
				this.aClass21_Sub2_25.method4084(this.aClass88_6 != null);
				this.aClass21_Sub2_25.method4064(this.aClass88_5, this.aClass88_6, this.aClass88_8, this.aClass88_7);
				@Pc(59) int local59 = this.anIntArray33.length - 1;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(69) int local69 = this.anIntArray33[local61];
					@Pc(76) int local76 = this.anIntArray33[local61 + 1];
					@Pc(91) int local91 = this.aShortArray7[local69] == -1 ? -1 : this.aShortArray7[local69] & 0xFFFF;
					this.aClass21_Sub2_25.method4071(local91, this.aClass88_6 != null);
					this.aClass21_Sub2_25.method4066(this.aClass97_1.anInterface7_5, 4, local69 * 3, (local76 - local69) * 3);
				}
			}
		}
		this.method2295();
	}

	@OriginalMember(owner = "client!abk", name = "hc", descriptor = "(Lclient!mq;)V", line = 2865)
	void method2287(@OriginalArg(0) Class328 arg0) {
		if (this.aClass120Array1 == null) {
			return;
		}
		@Pc(6) Class328 local6 = this.aClass21_Sub2_25.aClass328_10;
		this.aClass21_Sub2_25.method4105();
		this.aClass21_Sub2_25.method17108(!this.aBoolean46);
		this.aClass21_Sub2_25.method4084(false);
		this.aClass21_Sub2_25.method4064(this.aClass21_Sub2_25.aClass88_10, null, null, this.aClass21_Sub2_25.aClass88_9);
		for (@Pc(35) int local35 = 0; local35 < this.anInt229; local35++) {
			@Pc(44) Class120 local44 = this.aClass120Array1[local35];
			@Pc(49) Class86 local49 = this.aClass86Array1[local35];
			if (!local44.aBoolean612 || !this.aClass21_Sub2_25.method17131()) {
				@Pc(78) float local78 = (float) (this.anIntArray32[local44.anInt3205] + this.anIntArray32[local44.anInt3207] + this.anIntArray32[local44.anInt3206]) * 0.3333333F;
				@Pc(99) float local99 = (float) (this.anIntArray31[local44.anInt3205] + this.anIntArray31[local44.anInt3207] + this.anIntArray31[local44.anInt3206]) * 0.3333333F;
				@Pc(120) float local120 = (float) (this.anIntArray35[local44.anInt3205] + this.anIntArray35[local44.anInt3207] + this.anIntArray35[local44.anInt3206]) * 0.3333333F;
				@Pc(146) float local146 = arg0.aFloatArray106[0] * local78 + arg0.aFloatArray106[4] * local99 + arg0.aFloatArray106[8] * local120 + arg0.aFloatArray106[12];
				@Pc(172) float local172 = arg0.aFloatArray106[1] * local78 + arg0.aFloatArray106[5] * local99 + arg0.aFloatArray106[9] * local120 + arg0.aFloatArray106[13];
				@Pc(198) float local198 = arg0.aFloatArray106[2] * local78 + arg0.aFloatArray106[6] * local99 + arg0.aFloatArray106[10] * local120 + arg0.aFloatArray106[14];
				@Pc(219) float local219 = (float) (1.0D / Math.sqrt((double) (local146 * local146 + local172 * local172 + local198 * local198))) * (float) local44.anInt3209;
				local6.method26075(local49.anInt2927, local49.anInt2928 * local44.aShort155 >> 7, local49.anInt2929 * local44.aShort156 >> 7, local146 + (float) local49.anInt2932 - local146 * local219, local172 + (float) local49.anInt2931 - local172 * local219, local198 - local198 * local219);
				this.aClass21_Sub2_25.method4112(local6);
				@Pc(267) int local267 = local49.anInt2930;
				OpenGL.glColor4ub((byte) (local267 >> 16), (byte) (local267 >> 8), (byte) local267, (byte) (local267 >> 24));
				this.aClass21_Sub2_25.method4070(local44.aShort157);
				this.aClass21_Sub2_25.method4089(local44.aByte108);
				this.aClass21_Sub2_25.method4128(7, 0, 4);
			}
		}
		this.aClass21_Sub2_25.method17108(true);
		this.aClass21_Sub2_25.method4039();
	}

	@OriginalMember(owner = "client!abk", name = "iq", descriptor = "(Lclient!mq;)V", line = 2865)
	void method2312(@OriginalArg(0) Class328 arg0) {
		if (this.aClass120Array1 == null) {
			return;
		}
		@Pc(6) Class328 local6 = this.aClass21_Sub2_25.aClass328_10;
		this.aClass21_Sub2_25.method4105();
		this.aClass21_Sub2_25.method17108(!this.aBoolean46);
		this.aClass21_Sub2_25.method4084(false);
		this.aClass21_Sub2_25.method4064(this.aClass21_Sub2_25.aClass88_10, null, null, this.aClass21_Sub2_25.aClass88_9);
		for (@Pc(35) int local35 = 0; local35 < this.anInt229; local35++) {
			@Pc(44) Class120 local44 = this.aClass120Array1[local35];
			@Pc(49) Class86 local49 = this.aClass86Array1[local35];
			if (!local44.aBoolean612 || !this.aClass21_Sub2_25.method17131()) {
				@Pc(78) float local78 = (float) (this.anIntArray32[local44.anInt3205] + this.anIntArray32[local44.anInt3207] + this.anIntArray32[local44.anInt3206]) * 0.3333333F;
				@Pc(99) float local99 = (float) (this.anIntArray31[local44.anInt3205] + this.anIntArray31[local44.anInt3207] + this.anIntArray31[local44.anInt3206]) * 0.3333333F;
				@Pc(120) float local120 = (float) (this.anIntArray35[local44.anInt3205] + this.anIntArray35[local44.anInt3207] + this.anIntArray35[local44.anInt3206]) * 0.3333333F;
				@Pc(146) float local146 = arg0.aFloatArray106[0] * local78 + arg0.aFloatArray106[4] * local99 + arg0.aFloatArray106[8] * local120 + arg0.aFloatArray106[12];
				@Pc(172) float local172 = arg0.aFloatArray106[1] * local78 + arg0.aFloatArray106[5] * local99 + arg0.aFloatArray106[9] * local120 + arg0.aFloatArray106[13];
				@Pc(198) float local198 = arg0.aFloatArray106[2] * local78 + arg0.aFloatArray106[6] * local99 + arg0.aFloatArray106[10] * local120 + arg0.aFloatArray106[14];
				@Pc(219) float local219 = (float) (1.0D / Math.sqrt((double) (local146 * local146 + local172 * local172 + local198 * local198))) * (float) local44.anInt3209;
				local6.method26075(local49.anInt2927, local49.anInt2928 * local44.aShort155 >> 7, local49.anInt2929 * local44.aShort156 >> 7, local146 + (float) local49.anInt2932 - local146 * local219, local172 + (float) local49.anInt2931 - local172 * local219, local198 - local198 * local219);
				this.aClass21_Sub2_25.method4112(local6);
				@Pc(267) int local267 = local49.anInt2930;
				OpenGL.glColor4ub((byte) (local267 >> 16), (byte) (local267 >> 8), (byte) local267, (byte) (local267 >> 24));
				this.aClass21_Sub2_25.method4070(local44.aShort157);
				this.aClass21_Sub2_25.method4089(local44.aByte108);
				this.aClass21_Sub2_25.method4128(7, 0, 4);
			}
		}
		this.aClass21_Sub2_25.method17108(true);
		this.aClass21_Sub2_25.method4039();
	}

	@OriginalMember(owner = "client!abk", name = "hd", descriptor = "(Z)V", line = 2896)
	void method2281(@OriginalArg(0) boolean arg0) {
		if (this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1.aByteArray51.length < this.anInt224 * 6) {
			this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1 = new Class3_Sub41_Sub2((this.anInt224 + 100) * 6);
		} else {
			this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1.anInt2803 = 0;
		}
		@Pc(31) Class3_Sub41_Sub2 local31 = this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1;
		@Pc(37) int local37;
		if (this.aClass21_Sub2_25.aBoolean63) {
			for (local37 = 0; local37 < this.anInt224; local37++) {
				local31.method20251(this.aShortArray9[local37]);
				local31.method20251(this.aShortArray5[local37]);
				local31.method20251(this.aShortArray8[local37]);
			}
		} else {
			for (local37 = 0; local37 < this.anInt224; local37++) {
				local31.method20442(this.aShortArray9[local37]);
				local31.method20442(this.aShortArray5[local37]);
				local31.method20442(this.aShortArray8[local37]);
			}
		}
		if (local31.anInt2803 * 62066237 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface7_1 == null) {
				this.anInterface7_1 = this.aClass21_Sub2_25.method4060(5123, local31.aByteArray51, local31.anInt2803 * 62066237, true);
			} else {
				this.anInterface7_1.method1122(local31.aByteArray51, local31.anInt2803 * 62066237);
			}
			this.aClass97_1.anInterface7_5 = this.anInterface7_1;
		} else {
			this.aClass97_1.anInterface7_5 = this.aClass21_Sub2_25.method4060(5123, local31.aByteArray51, local31.anInt2803 * 62066237, false);
		}
		if (!arg0) {
			this.aBoolean49 = true;
		}
	}

	@OriginalMember(owner = "client!abk", name = "ir", descriptor = "(Z)V", line = 2896)
	void method2291(@OriginalArg(0) boolean arg0) {
		if (this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1.aByteArray51.length < this.anInt224 * 6) {
			this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1 = new Class3_Sub41_Sub2((this.anInt224 + 100) * 6);
		} else {
			this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1.anInt2803 = 0;
		}
		@Pc(31) Class3_Sub41_Sub2 local31 = this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1;
		@Pc(37) int local37;
		if (this.aClass21_Sub2_25.aBoolean63) {
			for (local37 = 0; local37 < this.anInt224; local37++) {
				local31.method20251(this.aShortArray9[local37]);
				local31.method20251(this.aShortArray5[local37]);
				local31.method20251(this.aShortArray8[local37]);
			}
		} else {
			for (local37 = 0; local37 < this.anInt224; local37++) {
				local31.method20442(this.aShortArray9[local37]);
				local31.method20442(this.aShortArray5[local37]);
				local31.method20442(this.aShortArray8[local37]);
			}
		}
		if (local31.anInt2803 * 62066237 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface7_1 == null) {
				this.anInterface7_1 = this.aClass21_Sub2_25.method4060(5123, local31.aByteArray51, local31.anInt2803 * 62066237, true);
			} else {
				this.anInterface7_1.method1122(local31.aByteArray51, local31.anInt2803 * 62066237);
			}
			this.aClass97_1.anInterface7_5 = this.anInterface7_1;
		} else {
			this.aClass97_1.anInterface7_5 = this.aClass21_Sub2_25.method4060(5123, local31.aByteArray51, local31.anInt2803 * 62066237, false);
		}
		if (!arg0) {
			this.aBoolean49 = true;
		}
	}

	@OriginalMember(owner = "client!abk", name = "im", descriptor = "(Z)V", line = 2896)
	void method2313(@OriginalArg(0) boolean arg0) {
		if (this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1.aByteArray51.length < this.anInt224 * 6) {
			this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1 = new Class3_Sub41_Sub2((this.anInt224 + 100) * 6);
		} else {
			this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1.anInt2803 = 0;
		}
		@Pc(31) Class3_Sub41_Sub2 local31 = this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1;
		@Pc(37) int local37;
		if (this.aClass21_Sub2_25.aBoolean63) {
			for (local37 = 0; local37 < this.anInt224; local37++) {
				local31.method20251(this.aShortArray9[local37]);
				local31.method20251(this.aShortArray5[local37]);
				local31.method20251(this.aShortArray8[local37]);
			}
		} else {
			for (local37 = 0; local37 < this.anInt224; local37++) {
				local31.method20442(this.aShortArray9[local37]);
				local31.method20442(this.aShortArray5[local37]);
				local31.method20442(this.aShortArray8[local37]);
			}
		}
		if (local31.anInt2803 * 62066237 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface7_1 == null) {
				this.anInterface7_1 = this.aClass21_Sub2_25.method4060(5123, local31.aByteArray51, local31.anInt2803 * 62066237, true);
			} else {
				this.anInterface7_1.method1122(local31.aByteArray51, local31.anInt2803 * 62066237);
			}
			this.aClass97_1.anInterface7_5 = this.anInterface7_1;
		} else {
			this.aClass97_1.anInterface7_5 = this.aClass21_Sub2_25.method4060(5123, local31.aByteArray51, local31.anInt2803 * 62066237, false);
		}
		if (!arg0) {
			this.aBoolean49 = true;
		}
	}

	@OriginalMember(owner = "client!abk", name = "ig", descriptor = "(Z)V", line = 2896)
	void method2314(@OriginalArg(0) boolean arg0) {
		if (this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1.aByteArray51.length < this.anInt224 * 6) {
			this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1 = new Class3_Sub41_Sub2((this.anInt224 + 100) * 6);
		} else {
			this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1.anInt2803 = 0;
		}
		@Pc(31) Class3_Sub41_Sub2 local31 = this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1;
		@Pc(37) int local37;
		if (this.aClass21_Sub2_25.aBoolean63) {
			for (local37 = 0; local37 < this.anInt224; local37++) {
				local31.method20251(this.aShortArray9[local37]);
				local31.method20251(this.aShortArray5[local37]);
				local31.method20251(this.aShortArray8[local37]);
			}
		} else {
			for (local37 = 0; local37 < this.anInt224; local37++) {
				local31.method20442(this.aShortArray9[local37]);
				local31.method20442(this.aShortArray5[local37]);
				local31.method20442(this.aShortArray8[local37]);
			}
		}
		if (local31.anInt2803 * 62066237 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface7_1 == null) {
				this.anInterface7_1 = this.aClass21_Sub2_25.method4060(5123, local31.aByteArray51, local31.anInt2803 * 62066237, true);
			} else {
				this.anInterface7_1.method1122(local31.aByteArray51, local31.anInt2803 * 62066237);
			}
			this.aClass97_1.anInterface7_5 = this.anInterface7_1;
		} else {
			this.aClass97_1.anInterface7_5 = this.aClass21_Sub2_25.method4060(5123, local31.aByteArray51, local31.anInt2803 * 62066237, false);
		}
		if (!arg0) {
			this.aBoolean49 = true;
		}
	}

	@OriginalMember(owner = "client!abk", name = "ho", descriptor = "(Z)V", line = 2924)
	void method2296(@OriginalArg(0) boolean arg0) {
		@Pc(10) boolean local10 = this.aClass88_8 != null && this.aClass88_8.anInterface5_6 == null;
		@Pc(21) boolean local21 = this.aClass88_6 != null && this.aClass88_6.anInterface5_6 == null;
		@Pc(32) boolean local32 = this.aClass88_5 != null && this.aClass88_5.anInterface5_6 == null;
		@Pc(43) boolean local43 = this.aClass88_7 != null && this.aClass88_7.anInterface5_6 == null;
		if (arg0) {
			local10 &= (this.aByte1 & 0x2) != 0;
			local21 &= (this.aByte1 & 0x4) != 0;
			local32 &= (this.aByte1 & 0x1) != 0;
			local43 &= (this.aByte1 & 0x8) != 0;
		}
		@Pc(91) byte local91 = 0;
		@Pc(93) byte local93 = 0;
		@Pc(95) byte local95 = 0;
		@Pc(97) byte local97 = 0;
		@Pc(99) byte local99 = 0;
		if (local32) {
			local93 = local91;
			local91 = (byte) (local91 + 12);
		}
		if (local10) {
			local95 = local91;
			local91 = (byte) (local91 + 4);
		}
		if (local21) {
			local97 = local91;
			local91 = (byte) (local91 + 12);
		}
		if (local43) {
			local99 = local91;
			local91 = (byte) (local91 + 8);
		}
		if (local91 == 0) {
			return;
		}
		if (this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1.aByteArray51.length < this.anInt222 * local91) {
			this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1 = new Class3_Sub41_Sub2((this.anInt222 + 100) * local91);
		} else {
			this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1.anInt2803 = 0;
		}
		@Pc(170) Class3_Sub41_Sub2 local170 = this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(217) int local217;
		@Pc(235) int local235;
		if (local32) {
			@Pc(196) int local196;
			@Pc(203) int local203;
			@Pc(208) int local208;
			@Pc(215) int local215;
			if (this.aClass21_Sub2_25.aBoolean63) {
				for (local178 = 0; local178 < this.anInt221; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray32[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray31[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray35[local178]);
					local208 = this.anIntArray36[local178];
					local215 = this.anIntArray36[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray11[local217] != 0; local217++) {
						local235 = (this.aShortArray11[local217] & 0xFFFF) - 1;
						local170.anInt2803 = local235 * local91 * -918980331;
						local170.method20254(local189);
						local170.method20254(local196);
						local170.method20254(local203);
					}
				}
			} else {
				for (local178 = 0; local178 < this.anInt221; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray32[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray31[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray35[local178]);
					local208 = this.anIntArray36[local178];
					local215 = this.anIntArray36[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray11[local217] != 0; local217++) {
						local235 = (this.aShortArray11[local217] & 0xFFFF) - 1;
						local170.anInt2803 = local235 * local91 * -918980331;
						local170.method20255(local189);
						local170.method20255(local196);
						local170.method20255(local203);
					}
				}
			}
		}
		@Pc(463) float local463;
		@Pc(353) short[] local353;
		@Pc(357) short[] local357;
		@Pc(361) short[] local361;
		@Pc(365) byte[] local365;
		@Pc(511) float local511;
		if (local10) {
			if (this.aClass88_6 == null) {
				if (this.aClass119_1 == null) {
					local353 = this.aShortArray2;
					local357 = this.aShortArray6;
					local361 = this.aShortArray3;
					local365 = this.aByteArray4;
				} else {
					local353 = this.aClass119_1.aShortArray75;
					local357 = this.aClass119_1.aShortArray73;
					local361 = this.aClass119_1.aShortArray74;
					local365 = this.aClass119_1.aByteArray58;
				}
				@Pc(384) float local384 = this.aClass21_Sub2_25.aFloatArray26[0];
				@Pc(390) float local390 = this.aClass21_Sub2_25.aFloatArray26[1];
				@Pc(396) float local396 = this.aClass21_Sub2_25.aFloatArray26[2];
				@Pc(400) float local400 = this.aClass21_Sub2_25.aFloat44;
				@Pc(410) float local410 = this.aClass21_Sub2_25.aFloat54 * 768.0F / (float) this.aShort3;
				@Pc(420) float local420 = this.aClass21_Sub2_25.aFloat61 * 768.0F / (float) this.aShort3;
				for (@Pc(422) int local422 = 0; local422 < this.anInt223; local422++) {
					@Pc(443) int local443 = this.method2285(this.aShortArray4[local422], this.aShortArray7[local422], this.aShort1, this.aByteArray5[local422]);
					@Pc(452) float local452 = (float) (local443 >>> 24) * this.aClass21_Sub2_25.aFloat52;
					local463 = (float) (local443 >> 16 & 0xFF) * this.aClass21_Sub2_25.aFloat50;
					@Pc(474) float local474 = (float) (local443 >> 8 & 0xFF) * this.aClass21_Sub2_25.aFloat53;
					@Pc(481) int local481 = this.aShortArray9[local422] & 0xFFFF;
					@Pc(486) short local486 = (short) local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					@Pc(550) float local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					@Pc(555) int local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					@Pc(570) int local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					@Pc(585) int local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.anInt2803 = (local95 + local481 * local91) * -918980331;
					local170.method20250(local555);
					local170.method20250(local570);
					local170.method20250(local585);
					local170.method20250(255 - (this.aByteArray5[local422] & 0xFF));
					local481 = this.aShortArray5[local422] & 0xFFFF;
					local486 = local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.anInt2803 = (local95 + local481 * local91) * -918980331;
					local170.method20250(local555);
					local170.method20250(local570);
					local170.method20250(local585);
					local170.method20250(255 - (this.aByteArray5[local422] & 0xFF));
					local481 = this.aShortArray8[local422] & 0xFFFF;
					local486 = local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.anInt2803 = (local95 + local481 * local91) * -918980331;
					local170.method20250(local555);
					local170.method20250(local570);
					local170.method20250(local585);
					local170.method20250(255 - (this.aByteArray5[local422] & 0xFF));
				}
			} else {
				for (local178 = 0; local178 < this.anInt223; local178++) {
					local189 = this.method2285(this.aShortArray4[local178], this.aShortArray7[local178], this.aShort1, this.aByteArray5[local178]);
					local170.anInt2803 = (local95 + (this.aShortArray9[local178] & 0xFFFF) * local91) * -918980331;
					local170.method20254(local189);
					local170.anInt2803 = (local95 + (this.aShortArray5[local178] & 0xFFFF) * local91) * -918980331;
					local170.method20254(local189);
					local170.anInt2803 = (local95 + (this.aShortArray8[local178] & 0xFFFF) * local91) * -918980331;
					local170.method20254(local189);
				}
			}
		}
		if (local21) {
			if (this.aClass119_1 == null) {
				local353 = this.aShortArray2;
				local357 = this.aShortArray6;
				local361 = this.aShortArray3;
				local365 = this.aByteArray4;
			} else {
				local353 = this.aClass119_1.aShortArray75;
				local357 = this.aClass119_1.aShortArray73;
				local361 = this.aClass119_1.aShortArray74;
				local365 = this.aClass119_1.aByteArray58;
			}
			@Pc(1055) float local1055 = 3.0F / (float) this.aShort3;
			local511 = 3.0F / (float) (this.aShort3 + this.aShort3 / 2);
			local170.anInt2803 = local97 * -918980331;
			if (this.aClass21_Sub2_25.aBoolean63) {
				for (local217 = 0; local217 < this.anInt222; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method20474((float) local353[local217] * local511);
						local170.method20474((float) local357[local217] * local511);
						local170.method20474((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method20474((float) local353[local217] * local463);
						local170.method20474((float) local357[local217] * local463);
						local170.method20474((float) local361[local217] * local463);
					}
					local170.anInt2803 += (local91 - 12) * -918980331;
				}
			} else {
				for (local217 = 0; local217 < this.anInt222; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method20475((float) local353[local217] * local511);
						local170.method20475((float) local357[local217] * local511);
						local170.method20475((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method20475((float) local353[local217] * local463);
						local170.method20475((float) local357[local217] * local463);
						local170.method20475((float) local361[local217] * local463);
					}
					local170.anInt2803 += (local91 - 12) * -918980331;
				}
			}
		}
		if (local43) {
			local170.anInt2803 = local99 * -918980331;
			if (this.aClass21_Sub2_25.aBoolean63) {
				for (local178 = 0; local178 < this.anInt222; local178++) {
					local170.method20474(this.aFloatArray19[local178]);
					local170.method20474(this.aFloatArray20[local178]);
					local170.anInt2803 += (local91 - 8) * -918980331;
				}
			} else {
				for (local178 = 0; local178 < this.anInt222; local178++) {
					local170.method20475(this.aFloatArray19[local178]);
					local170.method20475(this.aFloatArray20[local178]);
					local170.anInt2803 += (local91 - 8) * -918980331;
				}
			}
		}
		local170.anInt2803 = local91 * this.anInt222 * -918980331;
		@Pc(1348) Interface5 local1348;
		if (arg0) {
			if (this.anInterface5_2 == null) {
				this.anInterface5_2 = this.aClass21_Sub2_25.method4027(local91, local170.aByteArray51, local170.anInt2803 * 62066237, true);
			} else {
				this.anInterface5_2.method977(local91, local170.aByteArray51, local170.anInt2803 * 62066237);
			}
			local1348 = this.anInterface5_2;
			this.aByte1 = 0;
		} else {
			local1348 = this.aClass21_Sub2_25.method4027(local91, local170.aByteArray51, local170.anInt2803 * 62066237, false);
			this.aBoolean49 = true;
		}
		if (local32) {
			this.aClass88_5.anInterface5_6 = local1348;
			this.aClass88_5.aByte106 = local93;
		}
		if (local43) {
			this.aClass88_7.anInterface5_6 = local1348;
			this.aClass88_7.aByte106 = local99;
		}
		if (local10) {
			this.aClass88_8.anInterface5_6 = local1348;
			this.aClass88_8.aByte106 = local95;
		}
		if (local21) {
			this.aClass88_6.anInterface5_6 = local1348;
			this.aClass88_6.aByte106 = local97;
		}
	}

	@OriginalMember(owner = "client!abk", name = "ip", descriptor = "(Z)V", line = 2924)
	void method2315(@OriginalArg(0) boolean arg0) {
		@Pc(10) boolean local10 = this.aClass88_8 != null && this.aClass88_8.anInterface5_6 == null;
		@Pc(21) boolean local21 = this.aClass88_6 != null && this.aClass88_6.anInterface5_6 == null;
		@Pc(32) boolean local32 = this.aClass88_5 != null && this.aClass88_5.anInterface5_6 == null;
		@Pc(43) boolean local43 = this.aClass88_7 != null && this.aClass88_7.anInterface5_6 == null;
		if (arg0) {
			local10 &= (this.aByte1 & 0x2) != 0;
			local21 &= (this.aByte1 & 0x4) != 0;
			local32 &= (this.aByte1 & 0x1) != 0;
			local43 &= (this.aByte1 & 0x8) != 0;
		}
		@Pc(91) byte local91 = 0;
		@Pc(93) byte local93 = 0;
		@Pc(95) byte local95 = 0;
		@Pc(97) byte local97 = 0;
		@Pc(99) byte local99 = 0;
		if (local32) {
			local93 = local91;
			local91 = (byte) (local91 + 12);
		}
		if (local10) {
			local95 = local91;
			local91 = (byte) (local91 + 4);
		}
		if (local21) {
			local97 = local91;
			local91 = (byte) (local91 + 12);
		}
		if (local43) {
			local99 = local91;
			local91 = (byte) (local91 + 8);
		}
		if (local91 == 0) {
			return;
		}
		if (this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1.aByteArray51.length < this.anInt222 * local91) {
			this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1 = new Class3_Sub41_Sub2((this.anInt222 + 100) * local91);
		} else {
			this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1.anInt2803 = 0;
		}
		@Pc(170) Class3_Sub41_Sub2 local170 = this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(217) int local217;
		@Pc(235) int local235;
		if (local32) {
			@Pc(196) int local196;
			@Pc(203) int local203;
			@Pc(208) int local208;
			@Pc(215) int local215;
			if (this.aClass21_Sub2_25.aBoolean63) {
				for (local178 = 0; local178 < this.anInt221; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray32[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray31[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray35[local178]);
					local208 = this.anIntArray36[local178];
					local215 = this.anIntArray36[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray11[local217] != 0; local217++) {
						local235 = (this.aShortArray11[local217] & 0xFFFF) - 1;
						local170.anInt2803 = local235 * local91 * -918980331;
						local170.method20254(local189);
						local170.method20254(local196);
						local170.method20254(local203);
					}
				}
			} else {
				for (local178 = 0; local178 < this.anInt221; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray32[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray31[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray35[local178]);
					local208 = this.anIntArray36[local178];
					local215 = this.anIntArray36[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray11[local217] != 0; local217++) {
						local235 = (this.aShortArray11[local217] & 0xFFFF) - 1;
						local170.anInt2803 = local235 * local91 * -918980331;
						local170.method20255(local189);
						local170.method20255(local196);
						local170.method20255(local203);
					}
				}
			}
		}
		@Pc(463) float local463;
		@Pc(353) short[] local353;
		@Pc(357) short[] local357;
		@Pc(361) short[] local361;
		@Pc(365) byte[] local365;
		@Pc(511) float local511;
		if (local10) {
			if (this.aClass88_6 == null) {
				if (this.aClass119_1 == null) {
					local353 = this.aShortArray2;
					local357 = this.aShortArray6;
					local361 = this.aShortArray3;
					local365 = this.aByteArray4;
				} else {
					local353 = this.aClass119_1.aShortArray75;
					local357 = this.aClass119_1.aShortArray73;
					local361 = this.aClass119_1.aShortArray74;
					local365 = this.aClass119_1.aByteArray58;
				}
				@Pc(384) float local384 = this.aClass21_Sub2_25.aFloatArray26[0];
				@Pc(390) float local390 = this.aClass21_Sub2_25.aFloatArray26[1];
				@Pc(396) float local396 = this.aClass21_Sub2_25.aFloatArray26[2];
				@Pc(400) float local400 = this.aClass21_Sub2_25.aFloat44;
				@Pc(410) float local410 = this.aClass21_Sub2_25.aFloat54 * 768.0F / (float) this.aShort3;
				@Pc(420) float local420 = this.aClass21_Sub2_25.aFloat61 * 768.0F / (float) this.aShort3;
				for (@Pc(422) int local422 = 0; local422 < this.anInt223; local422++) {
					@Pc(443) int local443 = this.method2285(this.aShortArray4[local422], this.aShortArray7[local422], this.aShort1, this.aByteArray5[local422]);
					@Pc(452) float local452 = (float) (local443 >>> 24) * this.aClass21_Sub2_25.aFloat52;
					local463 = (float) (local443 >> 16 & 0xFF) * this.aClass21_Sub2_25.aFloat50;
					@Pc(474) float local474 = (float) (local443 >> 8 & 0xFF) * this.aClass21_Sub2_25.aFloat53;
					@Pc(481) int local481 = this.aShortArray9[local422] & 0xFFFF;
					@Pc(486) short local486 = (short) local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					@Pc(550) float local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					@Pc(555) int local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					@Pc(570) int local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					@Pc(585) int local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.anInt2803 = (local95 + local481 * local91) * -918980331;
					local170.method20250(local555);
					local170.method20250(local570);
					local170.method20250(local585);
					local170.method20250(255 - (this.aByteArray5[local422] & 0xFF));
					local481 = this.aShortArray5[local422] & 0xFFFF;
					local486 = local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.anInt2803 = (local95 + local481 * local91) * -918980331;
					local170.method20250(local555);
					local170.method20250(local570);
					local170.method20250(local585);
					local170.method20250(255 - (this.aByteArray5[local422] & 0xFF));
					local481 = this.aShortArray8[local422] & 0xFFFF;
					local486 = local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.anInt2803 = (local95 + local481 * local91) * -918980331;
					local170.method20250(local555);
					local170.method20250(local570);
					local170.method20250(local585);
					local170.method20250(255 - (this.aByteArray5[local422] & 0xFF));
				}
			} else {
				for (local178 = 0; local178 < this.anInt223; local178++) {
					local189 = this.method2285(this.aShortArray4[local178], this.aShortArray7[local178], this.aShort1, this.aByteArray5[local178]);
					local170.anInt2803 = (local95 + (this.aShortArray9[local178] & 0xFFFF) * local91) * -918980331;
					local170.method20254(local189);
					local170.anInt2803 = (local95 + (this.aShortArray5[local178] & 0xFFFF) * local91) * -918980331;
					local170.method20254(local189);
					local170.anInt2803 = (local95 + (this.aShortArray8[local178] & 0xFFFF) * local91) * -918980331;
					local170.method20254(local189);
				}
			}
		}
		if (local21) {
			if (this.aClass119_1 == null) {
				local353 = this.aShortArray2;
				local357 = this.aShortArray6;
				local361 = this.aShortArray3;
				local365 = this.aByteArray4;
			} else {
				local353 = this.aClass119_1.aShortArray75;
				local357 = this.aClass119_1.aShortArray73;
				local361 = this.aClass119_1.aShortArray74;
				local365 = this.aClass119_1.aByteArray58;
			}
			@Pc(1055) float local1055 = 3.0F / (float) this.aShort3;
			local511 = 3.0F / (float) (this.aShort3 + this.aShort3 / 2);
			local170.anInt2803 = local97 * -918980331;
			if (this.aClass21_Sub2_25.aBoolean63) {
				for (local217 = 0; local217 < this.anInt222; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method20474((float) local353[local217] * local511);
						local170.method20474((float) local357[local217] * local511);
						local170.method20474((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method20474((float) local353[local217] * local463);
						local170.method20474((float) local357[local217] * local463);
						local170.method20474((float) local361[local217] * local463);
					}
					local170.anInt2803 += (local91 - 12) * -918980331;
				}
			} else {
				for (local217 = 0; local217 < this.anInt222; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method20475((float) local353[local217] * local511);
						local170.method20475((float) local357[local217] * local511);
						local170.method20475((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method20475((float) local353[local217] * local463);
						local170.method20475((float) local357[local217] * local463);
						local170.method20475((float) local361[local217] * local463);
					}
					local170.anInt2803 += (local91 - 12) * -918980331;
				}
			}
		}
		if (local43) {
			local170.anInt2803 = local99 * -918980331;
			if (this.aClass21_Sub2_25.aBoolean63) {
				for (local178 = 0; local178 < this.anInt222; local178++) {
					local170.method20474(this.aFloatArray19[local178]);
					local170.method20474(this.aFloatArray20[local178]);
					local170.anInt2803 += (local91 - 8) * -918980331;
				}
			} else {
				for (local178 = 0; local178 < this.anInt222; local178++) {
					local170.method20475(this.aFloatArray19[local178]);
					local170.method20475(this.aFloatArray20[local178]);
					local170.anInt2803 += (local91 - 8) * -918980331;
				}
			}
		}
		local170.anInt2803 = local91 * this.anInt222 * -918980331;
		@Pc(1348) Interface5 local1348;
		if (arg0) {
			if (this.anInterface5_2 == null) {
				this.anInterface5_2 = this.aClass21_Sub2_25.method4027(local91, local170.aByteArray51, local170.anInt2803 * 62066237, true);
			} else {
				this.anInterface5_2.method977(local91, local170.aByteArray51, local170.anInt2803 * 62066237);
			}
			local1348 = this.anInterface5_2;
			this.aByte1 = 0;
		} else {
			local1348 = this.aClass21_Sub2_25.method4027(local91, local170.aByteArray51, local170.anInt2803 * 62066237, false);
			this.aBoolean49 = true;
		}
		if (local32) {
			this.aClass88_5.anInterface5_6 = local1348;
			this.aClass88_5.aByte106 = local93;
		}
		if (local43) {
			this.aClass88_7.anInterface5_6 = local1348;
			this.aClass88_7.aByte106 = local99;
		}
		if (local10) {
			this.aClass88_8.anInterface5_6 = local1348;
			this.aClass88_8.aByte106 = local95;
		}
		if (local21) {
			this.aClass88_6.anInterface5_6 = local1348;
			this.aClass88_6.aByte106 = local97;
		}
	}

	@OriginalMember(owner = "client!abk", name = "ix", descriptor = "(Z)V", line = 2924)
	void method2316(@OriginalArg(0) boolean arg0) {
		@Pc(10) boolean local10 = this.aClass88_8 != null && this.aClass88_8.anInterface5_6 == null;
		@Pc(21) boolean local21 = this.aClass88_6 != null && this.aClass88_6.anInterface5_6 == null;
		@Pc(32) boolean local32 = this.aClass88_5 != null && this.aClass88_5.anInterface5_6 == null;
		@Pc(43) boolean local43 = this.aClass88_7 != null && this.aClass88_7.anInterface5_6 == null;
		if (arg0) {
			local10 &= (this.aByte1 & 0x2) != 0;
			local21 &= (this.aByte1 & 0x4) != 0;
			local32 &= (this.aByte1 & 0x1) != 0;
			local43 &= (this.aByte1 & 0x8) != 0;
		}
		@Pc(91) byte local91 = 0;
		@Pc(93) byte local93 = 0;
		@Pc(95) byte local95 = 0;
		@Pc(97) byte local97 = 0;
		@Pc(99) byte local99 = 0;
		if (local32) {
			local93 = local91;
			local91 = (byte) (local91 + 12);
		}
		if (local10) {
			local95 = local91;
			local91 = (byte) (local91 + 4);
		}
		if (local21) {
			local97 = local91;
			local91 = (byte) (local91 + 12);
		}
		if (local43) {
			local99 = local91;
			local91 = (byte) (local91 + 8);
		}
		if (local91 == 0) {
			return;
		}
		if (this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1.aByteArray51.length < this.anInt222 * local91) {
			this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1 = new Class3_Sub41_Sub2((this.anInt222 + 100) * local91);
		} else {
			this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1.anInt2803 = 0;
		}
		@Pc(170) Class3_Sub41_Sub2 local170 = this.aClass21_Sub2_25.aClass3_Sub41_Sub2_1;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(217) int local217;
		@Pc(235) int local235;
		if (local32) {
			@Pc(196) int local196;
			@Pc(203) int local203;
			@Pc(208) int local208;
			@Pc(215) int local215;
			if (this.aClass21_Sub2_25.aBoolean63) {
				for (local178 = 0; local178 < this.anInt221; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray32[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray31[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray35[local178]);
					local208 = this.anIntArray36[local178];
					local215 = this.anIntArray36[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray11[local217] != 0; local217++) {
						local235 = (this.aShortArray11[local217] & 0xFFFF) - 1;
						local170.anInt2803 = local235 * local91 * -918980331;
						local170.method20254(local189);
						local170.method20254(local196);
						local170.method20254(local203);
					}
				}
			} else {
				for (local178 = 0; local178 < this.anInt221; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray32[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray31[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray35[local178]);
					local208 = this.anIntArray36[local178];
					local215 = this.anIntArray36[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray11[local217] != 0; local217++) {
						local235 = (this.aShortArray11[local217] & 0xFFFF) - 1;
						local170.anInt2803 = local235 * local91 * -918980331;
						local170.method20255(local189);
						local170.method20255(local196);
						local170.method20255(local203);
					}
				}
			}
		}
		@Pc(463) float local463;
		@Pc(353) short[] local353;
		@Pc(357) short[] local357;
		@Pc(361) short[] local361;
		@Pc(365) byte[] local365;
		@Pc(511) float local511;
		if (local10) {
			if (this.aClass88_6 == null) {
				if (this.aClass119_1 == null) {
					local353 = this.aShortArray2;
					local357 = this.aShortArray6;
					local361 = this.aShortArray3;
					local365 = this.aByteArray4;
				} else {
					local353 = this.aClass119_1.aShortArray75;
					local357 = this.aClass119_1.aShortArray73;
					local361 = this.aClass119_1.aShortArray74;
					local365 = this.aClass119_1.aByteArray58;
				}
				@Pc(384) float local384 = this.aClass21_Sub2_25.aFloatArray26[0];
				@Pc(390) float local390 = this.aClass21_Sub2_25.aFloatArray26[1];
				@Pc(396) float local396 = this.aClass21_Sub2_25.aFloatArray26[2];
				@Pc(400) float local400 = this.aClass21_Sub2_25.aFloat44;
				@Pc(410) float local410 = this.aClass21_Sub2_25.aFloat54 * 768.0F / (float) this.aShort3;
				@Pc(420) float local420 = this.aClass21_Sub2_25.aFloat61 * 768.0F / (float) this.aShort3;
				for (@Pc(422) int local422 = 0; local422 < this.anInt223; local422++) {
					@Pc(443) int local443 = this.method2285(this.aShortArray4[local422], this.aShortArray7[local422], this.aShort1, this.aByteArray5[local422]);
					@Pc(452) float local452 = (float) (local443 >>> 24) * this.aClass21_Sub2_25.aFloat52;
					local463 = (float) (local443 >> 16 & 0xFF) * this.aClass21_Sub2_25.aFloat50;
					@Pc(474) float local474 = (float) (local443 >> 8 & 0xFF) * this.aClass21_Sub2_25.aFloat53;
					@Pc(481) int local481 = this.aShortArray9[local422] & 0xFFFF;
					@Pc(486) short local486 = (short) local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					@Pc(550) float local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					@Pc(555) int local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					@Pc(570) int local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					@Pc(585) int local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.anInt2803 = (local95 + local481 * local91) * -918980331;
					local170.method20250(local555);
					local170.method20250(local570);
					local170.method20250(local585);
					local170.method20250(255 - (this.aByteArray5[local422] & 0xFF));
					local481 = this.aShortArray5[local422] & 0xFFFF;
					local486 = local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.anInt2803 = (local95 + local481 * local91) * -918980331;
					local170.method20250(local555);
					local170.method20250(local570);
					local170.method20250(local585);
					local170.method20250(255 - (this.aByteArray5[local422] & 0xFF));
					local481 = this.aShortArray8[local422] & 0xFFFF;
					local486 = local365[local481];
					if (local486 == 0) {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) * 0.0026041667F;
					} else {
						local511 = (local384 * (float) local353[local481] + local390 * (float) local357[local481] + local396 * (float) local361[local481]) / (float) (local486 * 256);
					}
					local550 = local400 + local511 * (local511 < 0.0F ? local420 : local410);
					local555 = (int) (local452 * local550);
					if (local555 < 0) {
						local555 = 0;
					} else if (local555 > 255) {
						local555 = 255;
					}
					local570 = (int) (local463 * local550);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					local585 = (int) (local474 * local550);
					if (local585 < 0) {
						local585 = 0;
					} else if (local585 > 255) {
						local585 = 255;
					}
					local170.anInt2803 = (local95 + local481 * local91) * -918980331;
					local170.method20250(local555);
					local170.method20250(local570);
					local170.method20250(local585);
					local170.method20250(255 - (this.aByteArray5[local422] & 0xFF));
				}
			} else {
				for (local178 = 0; local178 < this.anInt223; local178++) {
					local189 = this.method2285(this.aShortArray4[local178], this.aShortArray7[local178], this.aShort1, this.aByteArray5[local178]);
					local170.anInt2803 = (local95 + (this.aShortArray9[local178] & 0xFFFF) * local91) * -918980331;
					local170.method20254(local189);
					local170.anInt2803 = (local95 + (this.aShortArray5[local178] & 0xFFFF) * local91) * -918980331;
					local170.method20254(local189);
					local170.anInt2803 = (local95 + (this.aShortArray8[local178] & 0xFFFF) * local91) * -918980331;
					local170.method20254(local189);
				}
			}
		}
		if (local21) {
			if (this.aClass119_1 == null) {
				local353 = this.aShortArray2;
				local357 = this.aShortArray6;
				local361 = this.aShortArray3;
				local365 = this.aByteArray4;
			} else {
				local353 = this.aClass119_1.aShortArray75;
				local357 = this.aClass119_1.aShortArray73;
				local361 = this.aClass119_1.aShortArray74;
				local365 = this.aClass119_1.aByteArray58;
			}
			@Pc(1055) float local1055 = 3.0F / (float) this.aShort3;
			local511 = 3.0F / (float) (this.aShort3 + this.aShort3 / 2);
			local170.anInt2803 = local97 * -918980331;
			if (this.aClass21_Sub2_25.aBoolean63) {
				for (local217 = 0; local217 < this.anInt222; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method20474((float) local353[local217] * local511);
						local170.method20474((float) local357[local217] * local511);
						local170.method20474((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method20474((float) local353[local217] * local463);
						local170.method20474((float) local357[local217] * local463);
						local170.method20474((float) local361[local217] * local463);
					}
					local170.anInt2803 += (local91 - 12) * -918980331;
				}
			} else {
				for (local217 = 0; local217 < this.anInt222; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method20475((float) local353[local217] * local511);
						local170.method20475((float) local357[local217] * local511);
						local170.method20475((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method20475((float) local353[local217] * local463);
						local170.method20475((float) local357[local217] * local463);
						local170.method20475((float) local361[local217] * local463);
					}
					local170.anInt2803 += (local91 - 12) * -918980331;
				}
			}
		}
		if (local43) {
			local170.anInt2803 = local99 * -918980331;
			if (this.aClass21_Sub2_25.aBoolean63) {
				for (local178 = 0; local178 < this.anInt222; local178++) {
					local170.method20474(this.aFloatArray19[local178]);
					local170.method20474(this.aFloatArray20[local178]);
					local170.anInt2803 += (local91 - 8) * -918980331;
				}
			} else {
				for (local178 = 0; local178 < this.anInt222; local178++) {
					local170.method20475(this.aFloatArray19[local178]);
					local170.method20475(this.aFloatArray20[local178]);
					local170.anInt2803 += (local91 - 8) * -918980331;
				}
			}
		}
		local170.anInt2803 = local91 * this.anInt222 * -918980331;
		@Pc(1348) Interface5 local1348;
		if (arg0) {
			if (this.anInterface5_2 == null) {
				this.anInterface5_2 = this.aClass21_Sub2_25.method4027(local91, local170.aByteArray51, local170.anInt2803 * 62066237, true);
			} else {
				this.anInterface5_2.method977(local91, local170.aByteArray51, local170.anInt2803 * 62066237);
			}
			local1348 = this.anInterface5_2;
			this.aByte1 = 0;
		} else {
			local1348 = this.aClass21_Sub2_25.method4027(local91, local170.aByteArray51, local170.anInt2803 * 62066237, false);
			this.aBoolean49 = true;
		}
		if (local32) {
			this.aClass88_5.anInterface5_6 = local1348;
			this.aClass88_5.aByte106 = local93;
		}
		if (local43) {
			this.aClass88_7.anInterface5_6 = local1348;
			this.aClass88_7.aByte106 = local99;
		}
		if (local10) {
			this.aClass88_8.anInterface5_6 = local1348;
			this.aClass88_8.aByte106 = local95;
		}
		if (local21) {
			this.aClass88_6.anInterface5_6 = local1348;
			this.aClass88_6.aByte106 = local97;
		}
	}

	@OriginalMember(owner = "client!abk", name = "hb", descriptor = "(ISIB)I", line = 3209)
	int method2285(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = Class360.anIntArray422[method2286(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(17) Class133 local17 = this.aClass21_Sub2_25.aClass134_7.method22906(arg1 & 0xFFFF);
			@Pc(22) int local22 = local17.aByte120 & 0xFF;
			@Pc(28) int local28;
			@Pc(51) int local51;
			if (local22 != 0) {
				if (arg2 < 0) {
					local28 = 0;
				} else if (arg2 > 127) {
					local28 = 16777215;
				} else {
					local28 = arg2 * 131586;
				}
				if (local22 == 256) {
					local5 = local28;
				} else {
					local51 = 256 - local22;
					local5 = ((local28 & 0xFF00FF) * local22 + (local5 & 0xFF00FF) * local51 & 0xFF00FF00) + ((local28 & 0xFF00) * local22 + (local5 & 0xFF00) * local51 & 0xFF0000) >> 8;
				}
			}
			local28 = local17.aByte121 & 0xFF;
			if (local28 != 0) {
				local28 += 256;
				@Pc(97) int local97 = (local5 >> 16 & 0xFF) * local28;
				if (local97 > 65535) {
					local97 = 65535;
				}
				local51 = (local5 >> 8 & 0xFF) * local28;
				if (local51 > 65535) {
					local51 = 65535;
				}
				@Pc(121) int local121 = (local5 & 0xFF) * local28;
				if (local121 > 65535) {
					local121 = 65535;
				}
				local5 = ((local97 & 0xFF00) << 8) + (local51 & 0xFF00) + (local121 >> 8);
			}
		}
		return local5 << 8 | 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!abk", name = "in", descriptor = "(ISIB)I", line = 3209)
	int method2317(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = Class360.anIntArray422[method2286(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(17) Class133 local17 = this.aClass21_Sub2_25.aClass134_7.method22906(arg1 & 0xFFFF);
			@Pc(22) int local22 = local17.aByte120 & 0xFF;
			@Pc(28) int local28;
			@Pc(51) int local51;
			if (local22 != 0) {
				if (arg2 < 0) {
					local28 = 0;
				} else if (arg2 > 127) {
					local28 = 16777215;
				} else {
					local28 = arg2 * 131586;
				}
				if (local22 == 256) {
					local5 = local28;
				} else {
					local51 = 256 - local22;
					local5 = ((local28 & 0xFF00FF) * local22 + (local5 & 0xFF00FF) * local51 & 0xFF00FF00) + ((local28 & 0xFF00) * local22 + (local5 & 0xFF00) * local51 & 0xFF0000) >> 8;
				}
			}
			local28 = local17.aByte121 & 0xFF;
			if (local28 != 0) {
				local28 += 256;
				@Pc(97) int local97 = (local5 >> 16 & 0xFF) * local28;
				if (local97 > 65535) {
					local97 = 65535;
				}
				local51 = (local5 >> 8 & 0xFF) * local28;
				if (local51 > 65535) {
					local51 = 65535;
				}
				@Pc(121) int local121 = (local5 & 0xFF) * local28;
				if (local121 > 65535) {
					local121 = 65535;
				}
				local5 = ((local97 & 0xFF00) << 8) + (local51 & 0xFF00) + (local121 >> 8);
			}
		}
		return local5 << 8 | 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!abk", name = "ia", descriptor = "(ISIB)I", line = 3209)
	int method2318(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = Class360.anIntArray422[method2286(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(17) Class133 local17 = this.aClass21_Sub2_25.aClass134_7.method22906(arg1 & 0xFFFF);
			@Pc(22) int local22 = local17.aByte120 & 0xFF;
			@Pc(28) int local28;
			@Pc(51) int local51;
			if (local22 != 0) {
				if (arg2 < 0) {
					local28 = 0;
				} else if (arg2 > 127) {
					local28 = 16777215;
				} else {
					local28 = arg2 * 131586;
				}
				if (local22 == 256) {
					local5 = local28;
				} else {
					local51 = 256 - local22;
					local5 = ((local28 & 0xFF00FF) * local22 + (local5 & 0xFF00FF) * local51 & 0xFF00FF00) + ((local28 & 0xFF00) * local22 + (local5 & 0xFF00) * local51 & 0xFF0000) >> 8;
				}
			}
			local28 = local17.aByte121 & 0xFF;
			if (local28 != 0) {
				local28 += 256;
				@Pc(97) int local97 = (local5 >> 16 & 0xFF) * local28;
				if (local97 > 65535) {
					local97 = 65535;
				}
				local51 = (local5 >> 8 & 0xFF) * local28;
				if (local51 > 65535) {
					local51 = 65535;
				}
				@Pc(121) int local121 = (local5 & 0xFF) * local28;
				if (local121 > 65535) {
					local121 = 65535;
				}
				local5 = ((local97 & 0xFF00) << 8) + (local51 & 0xFF00) + (local121 >> 8);
			}
		}
		return local5 << 8 | 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!abk", name = "ih", descriptor = "(ISIB)I", line = 3209)
	int method2319(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = Class360.anIntArray422[method2286(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(17) Class133 local17 = this.aClass21_Sub2_25.aClass134_7.method22906(arg1 & 0xFFFF);
			@Pc(22) int local22 = local17.aByte120 & 0xFF;
			@Pc(28) int local28;
			@Pc(51) int local51;
			if (local22 != 0) {
				if (arg2 < 0) {
					local28 = 0;
				} else if (arg2 > 127) {
					local28 = 16777215;
				} else {
					local28 = arg2 * 131586;
				}
				if (local22 == 256) {
					local5 = local28;
				} else {
					local51 = 256 - local22;
					local5 = ((local28 & 0xFF00FF) * local22 + (local5 & 0xFF00FF) * local51 & 0xFF00FF00) + ((local28 & 0xFF00) * local22 + (local5 & 0xFF00) * local51 & 0xFF0000) >> 8;
				}
			}
			local28 = local17.aByte121 & 0xFF;
			if (local28 != 0) {
				local28 += 256;
				@Pc(97) int local97 = (local5 >> 16 & 0xFF) * local28;
				if (local97 > 65535) {
					local97 = 65535;
				}
				local51 = (local5 >> 8 & 0xFF) * local28;
				if (local51 > 65535) {
					local51 = 65535;
				}
				@Pc(121) int local121 = (local5 & 0xFF) * local28;
				if (local121 > 65535) {
					local121 = 65535;
				}
				local5 = ((local97 & 0xFF00) << 8) + (local51 & 0xFF00) + (local121 >> 8);
			}
		}
		return local5 << 8 | 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!abk", name = "hz", descriptor = "(II)I", line = 3241)
	static final int method2286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!abk", name = "if", descriptor = "(II)I", line = 3241)
	static final int method2289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!abk", name = "ij", descriptor = "(II)I", line = 3241)
	static final int method2321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
