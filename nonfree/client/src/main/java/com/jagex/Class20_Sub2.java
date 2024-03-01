package com.jagex;

import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

@OriginalClass("client!abw")
public class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!abw", name = "l", descriptor = "I")
	static final int anInt525 = 7;

	@OriginalMember(owner = "client!abw", name = "ck", descriptor = "Lclient!ij;")
	static Class236 aClass236_1;

	@OriginalMember(owner = "client!abw", name = "g", descriptor = "I")
	static final int anInt543 = 4;

	@OriginalMember(owner = "client!abw", name = "h", descriptor = "Lclient!abv;")
	final Class21_Sub3 aClass21_Sub3_5;

	@OriginalMember(owner = "client!abw", name = "x", descriptor = "I")
	int anInt526;

	@OriginalMember(owner = "client!abw", name = "bq", descriptor = "I")
	int anInt527;

	@OriginalMember(owner = "client!abw", name = "bj", descriptor = "I")
	int anInt528;

	@OriginalMember(owner = "client!abw", name = "s", descriptor = "I")
	int anInt529;

	@OriginalMember(owner = "client!abw", name = "av", descriptor = "Lclient!ia;")
	Class233 aClass233_1;

	@OriginalMember(owner = "client!abw", name = "bh", descriptor = "[I")
	final int[] anIntArray58;

	@OriginalMember(owner = "client!abw", name = "ax", descriptor = "Lclient!jy;")
	Class267 aClass267_1;

	@OriginalMember(owner = "client!abw", name = "al", descriptor = "Lclient!jy;")
	Class267 aClass267_2;

	@OriginalMember(owner = "client!abw", name = "k", descriptor = "Lclient!jj;")
	Class257 aClass257_1;

	@OriginalMember(owner = "client!abw", name = "ap", descriptor = "Z")
	boolean aBoolean123;

	@OriginalMember(owner = "client!abw", name = "ab", descriptor = "Z")
	boolean aBoolean124;

	@OriginalMember(owner = "client!abw", name = "ag", descriptor = "I")
	int anInt534;

	@OriginalMember(owner = "client!abw", name = "am", descriptor = "I")
	int anInt535;

	@OriginalMember(owner = "client!abw", name = "ar", descriptor = "Z")
	boolean aBoolean126;

	@OriginalMember(owner = "client!abw", name = "ae", descriptor = "I")
	int anInt536;

	@OriginalMember(owner = "client!abw", name = "ad", descriptor = "I")
	int anInt537;

	@OriginalMember(owner = "client!abw", name = "aw", descriptor = "I")
	int anInt538;

	@OriginalMember(owner = "client!abw", name = "ac", descriptor = "I")
	int anInt539;

	@OriginalMember(owner = "client!abw", name = "bw", descriptor = "I")
	int anInt540;

	@OriginalMember(owner = "client!abw", name = "bp", descriptor = "I")
	int anInt541;

	@OriginalMember(owner = "client!abw", name = "bd", descriptor = "Z")
	boolean aBoolean127;

	@OriginalMember(owner = "client!abw", name = "bs", descriptor = "I")
	int anInt542;

	@OriginalMember(owner = "client!abw", name = "bc", descriptor = "[I")
	int[] anIntArray61;

	@OriginalMember(owner = "client!abw", name = "d", descriptor = "I")
	int anInt544;

	@OriginalMember(owner = "client!abw", name = "bx", descriptor = "[I")
	final int[] anIntArray63;

	@OriginalMember(owner = "client!abw", name = "bo", descriptor = "[F")
	float[] aFloatArray36;

	@OriginalMember(owner = "client!abw", name = "bn", descriptor = "[I")
	int[] anIntArray64;

	@OriginalMember(owner = "client!abw", name = "be", descriptor = "[I")
	final int[] anIntArray65;

	@OriginalMember(owner = "client!abw", name = "ao", descriptor = "Lclient!jy;")
	Class267 aClass267_3;

	@OriginalMember(owner = "client!abw", name = "bv", descriptor = "I")
	int anInt546;

	@OriginalMember(owner = "client!abw", name = "bz", descriptor = "Z")
	boolean aBoolean129;

	@OriginalMember(owner = "client!abw", name = "az", descriptor = "Lclient!jy;")
	Class267 aClass267_4;

	@OriginalMember(owner = "client!abw", name = "bk", descriptor = "[I")
	int[] anIntArray56;

	@OriginalMember(owner = "client!abw", name = "at", descriptor = "I")
	int anInt531;

	@OriginalMember(owner = "client!abw", name = "af", descriptor = "I")
	int anInt532;

	@OriginalMember(owner = "client!abw", name = "au", descriptor = "Z")
	boolean aBoolean125;

	@OriginalMember(owner = "client!abw", name = "ay", descriptor = "Z")
	boolean aBoolean128;

	@OriginalMember(owner = "client!abw", name = "b", descriptor = "I")
	int anInt530;

	@OriginalMember(owner = "client!abw", name = "c", descriptor = "I")
	int anInt533;

	@OriginalMember(owner = "client!abw", name = "z", descriptor = "[I")
	int[] anIntArray62;

	@OriginalMember(owner = "client!abw", name = "j", descriptor = "[I")
	int[] anIntArray54;

	@OriginalMember(owner = "client!abw", name = "n", descriptor = "[I")
	int[] anIntArray55;

	@OriginalMember(owner = "client!abw", name = "r", descriptor = "[S")
	short[] aShortArray24;

	@OriginalMember(owner = "client!abw", name = "br", descriptor = "[Lclient!dt;")
	Class135[] aClass135Array2;

	@OriginalMember(owner = "client!abw", name = "bb", descriptor = "[Lclient!cd;")
	Class109[] aClass109Array2;

	@OriginalMember(owner = "client!abw", name = "by", descriptor = "I")
	int anInt545;

	@OriginalMember(owner = "client!abw", name = "bl", descriptor = "[Lclient!jp;")
	Class261[] aClass261Array1;

	@OriginalMember(owner = "client!abw", name = "bi", descriptor = "[Lclient!iz;")
	Class249[] aClass249Array1;

	@OriginalMember(owner = "client!abw", name = "q", descriptor = "[S")
	short[] aShortArray12;

	@OriginalMember(owner = "client!abw", name = "m", descriptor = "[S")
	short[] aShortArray13;

	@OriginalMember(owner = "client!abw", name = "v", descriptor = "[S")
	short[] aShortArray14;

	@OriginalMember(owner = "client!abw", name = "t", descriptor = "[S")
	short[] aShortArray15;

	@OriginalMember(owner = "client!abw", name = "w", descriptor = "[S")
	short[] aShortArray17;

	@OriginalMember(owner = "client!abw", name = "o", descriptor = "[B")
	byte[] aByteArray7;

	@OriginalMember(owner = "client!abw", name = "i", descriptor = "[F")
	float[] aFloatArray35;

	@OriginalMember(owner = "client!abw", name = "f", descriptor = "[F")
	float[] aFloatArray37;

	@OriginalMember(owner = "client!abw", name = "ak", descriptor = "[S")
	short[] aShortArray16;

	@OriginalMember(owner = "client!abw", name = "aa", descriptor = "[B")
	byte[] aByteArray8;

	@OriginalMember(owner = "client!abw", name = "ah", descriptor = "[S")
	short[] aShortArray18;

	@OriginalMember(owner = "client!abw", name = "an", descriptor = "[S")
	short[] aShortArray22;

	@OriginalMember(owner = "client!abw", name = "aj", descriptor = "[S")
	short[] aShortArray19;

	@OriginalMember(owner = "client!abw", name = "as", descriptor = "[S")
	short[] aShortArray20;

	@OriginalMember(owner = "client!abw", name = "aq", descriptor = "[S")
	short[] aShortArray21;

	@OriginalMember(owner = "client!abw", name = "u", descriptor = "S")
	short aShort11;

	@OriginalMember(owner = "client!abw", name = "y", descriptor = "S")
	short aShort10;

	@OriginalMember(owner = "client!abw", name = "bg", descriptor = "[S")
	short[] aShortArray23;

	@OriginalMember(owner = "client!abw", name = "ba", descriptor = "[J")
	long[] aLongArray2;

	@OriginalMember(owner = "client!abw", name = "bf", descriptor = "[I")
	int[] anIntArray57;

	@OriginalMember(owner = "client!abw", name = "bt", descriptor = "[I")
	int[] anIntArray60;

	@OriginalMember(owner = "client!abw", name = "bm", descriptor = "[I")
	int[] anIntArray59;

	@OriginalMember(owner = "client!abw", name = "e", descriptor = "[[I")
	int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!abw", name = "bu", descriptor = "[[I")
	int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!abw", name = "ai", descriptor = "[[I")
	int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!abw", name = "<init>", descriptor = "(Lclient!abv;IIZZ)V", line = 101)
	Class20_Sub2(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt530 = 0;
		this.anInt533 = 0;
		this.anInt544 = 0;
		this.anInt531 = 0;
		this.anInt532 = 0;
		this.aBoolean123 = false;
		this.aBoolean124 = true;
		this.aBoolean125 = false;
		this.aBoolean128 = false;
		this.aBoolean126 = false;
		this.aBoolean127 = false;
		this.aFloatArray36 = new float[2];
		this.anIntArray61 = new int[1];
		this.anIntArray64 = new int[1];
		this.anIntArray65 = new int[8];
		this.anIntArray63 = new int[8];
		this.anIntArray58 = new int[8];
		this.aClass21_Sub3_5 = arg0;
		this.anInt526 = arg1;
		this.anInt529 = arg2;
		this.aBoolean123 = arg4;
		if (arg3 || Class241.method24643(this.anInt526, this.anInt529)) {
			this.aClass267_1 = new Class267(Class241.method24648(this.anInt526, this.anInt529));
		}
		if (arg3 || Class241.method24666(this.anInt526, this.anInt529)) {
			this.aClass267_3 = new Class267(Class241.method24651(this.anInt526, this.anInt529));
		}
		if (arg3 || Class241.method24711(this.anInt526, this.anInt529)) {
			this.aClass267_4 = new Class267(Class241.method24650(this.anInt526, this.anInt529));
		}
		if (arg3 || Class241.method24675(this.anInt526, this.anInt529)) {
			this.aClass267_2 = new Class267(Class241.method24649(this.anInt526, this.anInt529));
		}
		if (arg3 || Class241.method24647(this.anInt526, this.anInt529)) {
			this.aClass233_1 = new Class233(Class241.method24715(this.anInt526, this.anInt529));
		}
		if (arg3 && arg4) {
			this.aClass267_1.anInterface21_23 = this.aClass267_1.anInterface21_22 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			this.aClass267_3.anInterface21_23 = this.aClass267_3.anInterface21_22 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			this.aClass267_4.anInterface21_23 = this.aClass267_4.anInterface21_22 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			this.aClass267_2.anInterface21_23 = this.aClass267_2.anInterface21_22 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
		}
	}

	@OriginalMember(owner = "client!abw", name = "<init>", descriptor = "(Lclient!abv;Lclient!dy;IIII)V", line = 120)
	Class20_Sub2(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(9) Class134 local9 = arg0.aClass134_7;
		@Pc(13) int[] local13 = new int[arg1.anInt3414];
		this.anIntArray56 = new int[arg1.anInt3411 + 1];
		for (@Pc(22) int local22 = 0; local22 < arg1.anInt3414; local22++) {
			if (arg1.aByteArray65 == null || arg1.aByteArray65[local22] != 2) {
				if (arg1.aShortArray94 != null && arg1.aShortArray94[local22] != -1) {
					@Pc(55) Class133 local55 = local9.method22906(arg1.aShortArray94[local22] & 0xFFFF);
					if (((this.anInt529 & 0x40) == 0 || !local55.aBoolean620) && local55.aBoolean619) {
						continue;
					}
				}
				local13[this.anInt531++] = local22;
				this.anIntArray56[arg1.aShortArray89[local22]]++;
				this.anIntArray56[arg1.aShortArray90[local22]]++;
				this.anIntArray56[arg1.aShortArray91[local22]]++;
			}
		}
		this.anInt532 = this.anInt531;
		@Pc(120) long[] local120 = new long[this.anInt531];
		@Pc(129) boolean local129 = (this.anInt526 & 0x100) != 0;
		@Pc(139) int local139;
		@Pc(143) int local143;
		@Pc(156) int local156;
		@Pc(371) int local371;
		@Pc(272) short local272;
		for (@Pc(131) int local131 = 0; local131 < this.anInt531; local131++) {
			local139 = local13[local131];
			@Pc(141) Class133 local141 = null;
			local143 = 0;
			@Pc(145) byte local145 = 0;
			@Pc(147) byte local147 = 0;
			@Pc(149) byte local149 = 0;
			@Pc(154) boolean local154;
			if (arg1.aClass130Array1 != null) {
				local154 = false;
				for (local156 = 0; local156 < arg1.aClass130Array1.length; local156++) {
					@Pc(166) Class130 local166 = arg1.aClass130Array1[local156];
					if (local139 == local166.anInt3323 * 1416068411) {
						@Pc(179) Class287 local179 = Class530.method32482(local166.anInt3322 * -1448993679);
						if (local179.aBoolean709) {
							local154 = true;
						}
						if (local179.anInt4360 * 2145333981 != -1) {
							@Pc(198) Class133 local198 = local9.method22906(local179.anInt4360 * 2145333981);
							if (local198.aClass458_2 == Class458.aClass458_5) {
								this.aBoolean125 = true;
							}
						}
					}
				}
				if (local154) {
					local120[local131] = Long.MAX_VALUE;
					this.anInt532--;
					continue;
				}
			}
			if (arg1.aClass135Array4 != null) {
				local154 = false;
				for (local156 = 0; local156 < arg1.aClass135Array4.length; local156++) {
					@Pc(237) Class135 local237 = arg1.aClass135Array4[local156];
					if (local139 == local237.anInt3386 * 1948021955) {
						@Pc(250) Class271 local250 = Class298.method25629(local237.anInt3393 * -1647516813);
						if (local250.aBoolean702) {
							local154 = true;
						}
					}
				}
				if (local154) {
					local120[local131] = Long.MAX_VALUE;
					this.anInt532--;
					continue;
				}
			}
			local272 = -1;
			if (arg1.aShortArray94 != null) {
				local272 = arg1.aShortArray94[local139];
				if (local272 != -1) {
					local141 = local9.method22906(local272 & 0xFFFF);
					if ((this.anInt529 & 0x40) != 0 && local141.aBoolean620) {
						local272 = -1;
						local141 = null;
					} else {
						local147 = local141.aByte118;
						local149 = local141.aByte119;
					}
				}
			}
			@Pc(327) boolean local327 = arg1.aByteArray64 != null && arg1.aByteArray64[local139] != 0 || local141 != null && local141.aClass458_2 != Class458.aClass458_4;
			if ((local129 || local327) && arg1.aByteArray63 != null) {
				local143 += arg1.aByteArray63[local139] << 17;
			}
			if (local327) {
				local143 += 65536;
			}
			local143 += (local147 & 0xFF) << 8;
			local143 += local149 & 0xFF;
			local371 = local145 + ((local272 & 0xFFFF) << 16);
			@Pc(377) int local377 = local371 + (local131 & 0xFFFF);
			local120[local131] = ((long) local143 << 32) + (long) local377;
			this.aBoolean125 |= local327;
			this.aBoolean128 |= local141 != null && (local141.aByte113 != 0 || local141.aByte117 != 0);
		}
		client.method22801(local120, local13);
		this.anInt530 = arg1.anInt3410;
		this.anInt533 = arg1.anInt3411;
		this.anIntArray62 = arg1.anIntArray331;
		this.anIntArray54 = arg1.anIntArray332;
		this.anIntArray55 = arg1.anIntArray333;
		this.aShortArray24 = arg1.aShortArray88;
		@Pc(443) Class254[] local443 = new Class254[this.anInt533];
		this.aClass135Array2 = arg1.aClass135Array4;
		this.aClass109Array2 = arg1.aClass109Array4;
		@Pc(491) int local491;
		if (arg1.aClass130Array1 != null) {
			this.anInt545 = arg1.aClass130Array1.length;
			this.aClass261Array1 = new Class261[this.anInt545];
			this.aClass249Array1 = new Class249[this.anInt545];
			for (local139 = 0; local139 < this.anInt545; local139++) {
				@Pc(480) Class130 local480 = arg1.aClass130Array1[local139];
				@Pc(487) Class287 local487 = Class530.method32482(local480.anInt3322 * -1448993679);
				local371 = -1;
				for (local491 = 0; local491 < this.anInt531; local491++) {
					if (local13[local491] == local480.anInt3323 * 1416068411) {
						local371 = local491;
						break;
					}
				}
				if (local371 == -1) {
					throw new RuntimeException();
				}
				local491 = Class360.anIntArray422[arg1.aShortArray87[local480.anInt3323 * 1416068411] & 0xFFFF] & 0xFFFFFF;
				local491 |= 255 - (arg1.aByteArray64 == null ? 0 : arg1.aByteArray64[local480.anInt3323 * 1416068411]) << 24;
				this.aClass261Array1[local139] = new Class261(local371, arg1.aShortArray89[local480.anInt3323 * 1416068411], arg1.aShortArray90[local480.anInt3323 * 1416068411], arg1.aShortArray91[local480.anInt3323 * 1416068411], local487.anInt4362 * -1430406499, local487.anInt4361 * -1025441045, local487.anInt4360 * 2145333981, local487.anInt4363 * 1656323389, local487.anInt4359 * -1686355509, local487.aBoolean709, local487.aBoolean710, local480.anInt3325 * -2041558757);
				this.aClass249Array1[local139] = new Class249(local491);
			}
		}
		local139 = this.anInt531 * 3;
		this.aShortArray12 = new short[local139];
		this.aShortArray13 = new short[local139];
		this.aShortArray14 = new short[local139];
		this.aShortArray15 = new short[local139];
		this.aShortArray17 = new short[local139];
		this.aByteArray7 = new byte[local139];
		this.aFloatArray35 = new float[local139];
		this.aFloatArray37 = new float[local139];
		this.aShortArray16 = new short[this.anInt531];
		this.aByteArray8 = new byte[this.anInt531];
		this.aShortArray18 = new short[this.anInt531];
		this.aShortArray22 = new short[this.anInt531];
		this.aShortArray19 = new short[this.anInt531];
		this.aShortArray20 = new short[this.anInt531];
		if (arg1.aShortArray95 != null) {
			this.aShortArray21 = new short[this.anInt531];
		}
		this.aShort11 = (short) arg3;
		this.aShort10 = (short) arg4;
		this.aShortArray23 = new short[local139];
		this.aLongArray2 = new long[local139];
		@Pc(708) int local708 = 0;
		for (local143 = 0; local143 < arg1.anInt3411; local143++) {
			local371 = this.anIntArray56[local143];
			this.anIntArray56[local143] = local708;
			local708 += local371;
			local443[local143] = new Class254();
		}
		this.anIntArray56[arg1.anInt3411] = local708;
		@Pc(749) Class132 local749 = this.method5323(arg1, local13, this.anInt531);
		@Pc(753) Class260[] local753 = new Class260[arg1.anInt3414];
		@Pc(764) short local764;
		@Pc(774) short local774;
		@Pc(784) int local784;
		for (local491 = 0; local491 < arg1.anInt3414; local491++) {
			local764 = arg1.aShortArray89[local491];
			local272 = arg1.aShortArray90[local491];
			local774 = arg1.aShortArray91[local491];
			local784 = this.anIntArray62[local272] - this.anIntArray62[local764];
			@Pc(794) int local794 = this.anIntArray54[local272] - this.anIntArray54[local764];
			@Pc(804) int local804 = this.anIntArray55[local272] - this.anIntArray55[local764];
			@Pc(814) int local814 = this.anIntArray62[local774] - this.anIntArray62[local764];
			@Pc(824) int local824 = this.anIntArray54[local774] - this.anIntArray54[local764];
			@Pc(834) int local834 = this.anIntArray55[local774] - this.anIntArray55[local764];
			@Pc(842) int local842 = local794 * local834 - local824 * local804;
			@Pc(850) int local850 = local804 * local814 - local834 * local784;
			@Pc(858) int local858;
			for (local858 = local784 * local824 - local814 * local794; local842 > 8192 || local850 > 8192 || local858 > 8192 || local842 < -8192 || local850 < -8192 || local858 < -8192; local858 >>= 0x1) {
				local842 >>= 0x1;
				local850 >>= 0x1;
			}
			@Pc(904) int local904 = (int) Math.sqrt((double) (local842 * local842 + local850 * local850 + local858 * local858));
			if (local904 <= 0) {
				local904 = 1;
			}
			local842 = local842 * 256 / local904;
			local850 = local850 * 256 / local904;
			local858 = local858 * 256 / local904;
			@Pc(936) byte local936 = arg1.aByteArray65 == null ? 0 : arg1.aByteArray65[local491];
			if (local936 == 0) {
				@Pc(942) Class254 local942 = local443[local764];
				local942.anInt4190 += local842;
				local942.anInt4189 += local850;
				local942.anInt4191 += local858;
				local942.anInt4192++;
				@Pc(970) Class254 local970 = local443[local272];
				local970.anInt4190 += local842;
				local970.anInt4189 += local850;
				local970.anInt4191 += local858;
				local970.anInt4192++;
				@Pc(998) Class254 local998 = local443[local774];
				local998.anInt4190 += local842;
				local998.anInt4189 += local850;
				local998.anInt4191 += local858;
				local998.anInt4192++;
			} else if (local936 == 1) {
				@Pc(1034) Class260 local1034 = local753[local491] = new Class260();
				local1034.anInt4196 = local842;
				local1034.anInt4197 = local850;
				local1034.anInt4198 = local858;
			}
		}
		@Pc(1062) int local1062;
		@Pc(1096) short local1096;
		for (local491 = 0; local491 < this.anInt531; local491++) {
			@Pc(1055) int local1055 = local13[local491];
			local1062 = arg1.aShortArray87[local1055] & 0xFFFF;
			if (arg1.aShortArray93 == null) {
				local156 = -1;
			} else {
				local156 = arg1.aShortArray93[local1055];
			}
			if (arg1.aByteArray64 == null) {
				local784 = 0;
			} else {
				local784 = arg1.aByteArray64[local1055] & 0xFF;
			}
			local1096 = arg1.aShortArray94 == null ? -1 : arg1.aShortArray94[local1055];
			if (local1096 != -1 && (this.anInt529 & 0x40) != 0 && local9.method22906(local1096).aBoolean620) {
				local1096 = -1;
			}
			@Pc(1114) float local1114 = 0.0F;
			@Pc(1116) float local1116 = 0.0F;
			@Pc(1118) float local1118 = 0.0F;
			@Pc(1120) float local1120 = 0.0F;
			@Pc(1122) float local1122 = 0.0F;
			@Pc(1124) float local1124 = 0.0F;
			@Pc(1126) byte local1126 = 0;
			@Pc(1128) byte local1128 = 0;
			@Pc(1130) int local1130 = 0;
			@Pc(1179) short local1179;
			@Pc(1184) short local1184;
			@Pc(1189) short local1189;
			@Pc(1162) byte local1162;
			if (local1096 != -1) {
				if (local156 == -1) {
					local1114 = 0.0F;
					local1116 = 1.0F;
					local1118 = 1.0F;
					local1120 = 1.0F;
					local1126 = 1;
					local1122 = 0.0F;
					local1124 = 0.0F;
					local1128 = 2;
				} else {
					local156 &= 0xFFFF;
					local1162 = arg1.aByteArray66[local156];
					@Pc(1169) short local1169;
					@Pc(1174) short local1174;
					@Pc(1212) float local1212;
					@Pc(1220) float local1220;
					@Pc(1228) float local1228;
					@Pc(1308) float local1308;
					@Pc(1316) float local1316;
					@Pc(1324) float local1324;
					@Pc(1332) float local1332;
					@Pc(1340) float local1340;
					@Pc(1348) float local1348;
					if (local1162 == 0) {
						local1169 = arg1.aShortArray89[local1055];
						local1174 = arg1.aShortArray90[local1055];
						local1179 = arg1.aShortArray91[local1055];
						local1184 = arg1.aShortArray92[local156];
						local1189 = arg1.aShortArray96[local156];
						@Pc(1194) short local1194 = arg1.aShortArray86[local156];
						@Pc(1200) float local1200 = (float) arg1.anIntArray331[local1184];
						@Pc(1206) float local1206 = (float) arg1.anIntArray332[local1184];
						local1212 = arg1.anIntArray333[local1184];
						local1220 = (float) arg1.anIntArray331[local1189] - local1200;
						local1228 = (float) arg1.anIntArray332[local1189] - local1206;
						@Pc(1236) float local1236 = (float) arg1.anIntArray333[local1189] - local1212;
						@Pc(1244) float local1244 = (float) arg1.anIntArray331[local1194] - local1200;
						@Pc(1252) float local1252 = (float) arg1.anIntArray332[local1194] - local1206;
						@Pc(1260) float local1260 = (float) arg1.anIntArray333[local1194] - local1212;
						@Pc(1268) float local1268 = (float) arg1.anIntArray331[local1169] - local1200;
						@Pc(1276) float local1276 = (float) arg1.anIntArray332[local1169] - local1206;
						@Pc(1284) float local1284 = (float) arg1.anIntArray333[local1169] - local1212;
						@Pc(1292) float local1292 = (float) arg1.anIntArray331[local1174] - local1200;
						@Pc(1300) float local1300 = (float) arg1.anIntArray332[local1174] - local1206;
						local1308 = (float) arg1.anIntArray333[local1174] - local1212;
						local1316 = (float) arg1.anIntArray331[local1179] - local1200;
						local1324 = (float) arg1.anIntArray332[local1179] - local1206;
						local1332 = (float) arg1.anIntArray333[local1179] - local1212;
						local1340 = local1228 * local1260 - local1236 * local1252;
						local1348 = local1236 * local1244 - local1220 * local1260;
						@Pc(1356) float local1356 = local1220 * local1252 - local1228 * local1244;
						@Pc(1364) float local1364 = local1252 * local1356 - local1260 * local1348;
						@Pc(1372) float local1372 = local1260 * local1340 - local1244 * local1356;
						@Pc(1380) float local1380 = local1244 * local1348 - local1252 * local1340;
						@Pc(1394) float local1394 = 1.0F / (local1364 * local1220 + local1372 * local1228 + local1380 * local1236);
						local1114 = (local1364 * local1268 + local1372 * local1276 + local1380 * local1284) * local1394;
						local1118 = (local1364 * local1292 + local1372 * local1300 + local1380 * local1308) * local1394;
						local1122 = (local1364 * local1316 + local1372 * local1324 + local1380 * local1332) * local1394;
						@Pc(1444) float local1444 = local1228 * local1356 - local1236 * local1348;
						@Pc(1452) float local1452 = local1236 * local1340 - local1220 * local1356;
						@Pc(1460) float local1460 = local1220 * local1348 - local1228 * local1340;
						@Pc(1474) float local1474 = 1.0F / (local1444 * local1244 + local1452 * local1252 + local1460 * local1260);
						local1116 = (local1444 * local1268 + local1452 * local1276 + local1460 * local1284) * local1474;
						local1120 = (local1444 * local1292 + local1452 * local1300 + local1460 * local1308) * local1474;
						local1124 = (local1444 * local1316 + local1452 * local1324 + local1460 * local1332) * local1474;
					} else {
						local1169 = arg1.aShortArray89[local1055];
						local1174 = arg1.aShortArray90[local1055];
						local1179 = arg1.aShortArray91[local1055];
						@Pc(1537) int local1537 = local749.anIntArray328[local156];
						@Pc(1542) int local1542 = local749.anIntArray326[local156];
						@Pc(1547) int local1547 = local749.anIntArray327[local156];
						@Pc(1552) float[] local1552 = local749.aFloatArrayArray22[local156];
						@Pc(1557) byte local1557 = arg1.aByteArray62[local156];
						local1212 = (float) arg1.anIntArray339[local156] / 256.0F;
						if (local1162 == 1) {
							local1220 = (float) arg1.anIntArray338[local156] / 1024.0F;
							this.method5320(arg1.anIntArray331[local1169], arg1.anIntArray332[local1169], arg1.anIntArray333[local1169], local1537, local1542, local1547, local1552, local1220, local1557, local1212, this.aFloatArray36);
							local1114 = this.aFloatArray36[0];
							local1116 = this.aFloatArray36[1];
							this.method5320(arg1.anIntArray331[local1174], arg1.anIntArray332[local1174], arg1.anIntArray333[local1174], local1537, local1542, local1547, local1552, local1220, local1557, local1212, this.aFloatArray36);
							local1118 = this.aFloatArray36[0];
							local1120 = this.aFloatArray36[1];
							this.method5320(arg1.anIntArray331[local1179], arg1.anIntArray332[local1179], arg1.anIntArray333[local1179], local1537, local1542, local1547, local1552, local1220, local1557, local1212, this.aFloatArray36);
							local1122 = this.aFloatArray36[0];
							local1124 = this.aFloatArray36[1];
							local1228 = local1220 / 2.0F;
							if ((local1557 & 0x1) == 0) {
								if (local1118 - local1114 > local1228) {
									local1118 -= local1220;
									local1126 = 1;
								} else if (local1114 - local1118 > local1228) {
									local1118 += local1220;
									local1126 = 2;
								}
								if (local1122 - local1114 > local1228) {
									local1122 -= local1220;
									local1128 = 1;
								} else if (local1114 - local1122 > local1228) {
									local1122 += local1220;
									local1128 = 2;
								}
							} else {
								if (local1120 - local1116 > local1228) {
									local1120 -= local1220;
									local1126 = 1;
								} else if (local1116 - local1120 > local1228) {
									local1120 += local1220;
									local1126 = 2;
								}
								if (local1124 - local1116 > local1228) {
									local1124 -= local1220;
									local1128 = 1;
								} else if (local1116 - local1124 > local1228) {
									local1124 += local1220;
									local1128 = 2;
								}
							}
						} else if (local1162 == 2) {
							local1220 = (float) arg1.anIntArray335[local156] / 256.0F;
							local1228 = (float) arg1.anIntArray340[local156] / 256.0F;
							@Pc(1814) int local1814 = arg1.anIntArray331[local1174] - arg1.anIntArray331[local1169];
							@Pc(1824) int local1824 = arg1.anIntArray332[local1174] - arg1.anIntArray332[local1169];
							@Pc(1834) int local1834 = arg1.anIntArray333[local1174] - arg1.anIntArray333[local1169];
							@Pc(1844) int local1844 = arg1.anIntArray331[local1179] - arg1.anIntArray331[local1169];
							@Pc(1854) int local1854 = arg1.anIntArray332[local1179] - arg1.anIntArray332[local1169];
							@Pc(1864) int local1864 = arg1.anIntArray333[local1179] - arg1.anIntArray333[local1169];
							@Pc(1872) int local1872 = local1824 * local1864 - local1854 * local1834;
							@Pc(1880) int local1880 = local1834 * local1844 - local1864 * local1814;
							@Pc(1888) int local1888 = local1814 * local1854 - local1844 * local1824;
							local1308 = 64.0F / (float) arg1.anIntArray336[local156];
							local1316 = 64.0F / (float) arg1.anIntArray337[local156];
							local1324 = 64.0F / (float) arg1.anIntArray338[local156];
							local1332 = ((float) local1872 * local1552[0] + (float) local1880 * local1552[1] + (float) local1888 * local1552[2]) / local1308;
							local1340 = ((float) local1872 * local1552[3] + (float) local1880 * local1552[4] + (float) local1888 * local1552[5]) / local1316;
							local1348 = ((float) local1872 * local1552[6] + (float) local1880 * local1552[7] + (float) local1888 * local1552[8]) / local1324;
							local1130 = this.method5321(local1332, local1340, local1348);
							this.method5322(arg1.anIntArray331[local1169], arg1.anIntArray332[local1169], arg1.anIntArray333[local1169], local1537, local1542, local1547, local1130, local1552, local1557, local1212, local1220, local1228, this.aFloatArray36);
							local1114 = this.aFloatArray36[0];
							local1116 = this.aFloatArray36[1];
							this.method5322(arg1.anIntArray331[local1174], arg1.anIntArray332[local1174], arg1.anIntArray333[local1174], local1537, local1542, local1547, local1130, local1552, local1557, local1212, local1220, local1228, this.aFloatArray36);
							local1118 = this.aFloatArray36[0];
							local1120 = this.aFloatArray36[1];
							this.method5322(arg1.anIntArray331[local1179], arg1.anIntArray332[local1179], arg1.anIntArray333[local1179], local1537, local1542, local1547, local1130, local1552, local1557, local1212, local1220, local1228, this.aFloatArray36);
							local1122 = this.aFloatArray36[0];
							local1124 = this.aFloatArray36[1];
						} else if (local1162 == 3) {
							this.method5451(arg1.anIntArray331[local1169], arg1.anIntArray332[local1169], arg1.anIntArray333[local1169], local1537, local1542, local1547, local1552, local1557, local1212, this.aFloatArray36);
							local1114 = this.aFloatArray36[0];
							local1116 = this.aFloatArray36[1];
							this.method5451(arg1.anIntArray331[local1174], arg1.anIntArray332[local1174], arg1.anIntArray333[local1174], local1537, local1542, local1547, local1552, local1557, local1212, this.aFloatArray36);
							local1118 = this.aFloatArray36[0];
							local1120 = this.aFloatArray36[1];
							this.method5451(arg1.anIntArray331[local1179], arg1.anIntArray332[local1179], arg1.anIntArray333[local1179], local1537, local1542, local1547, local1552, local1557, local1212, this.aFloatArray36);
							local1122 = this.aFloatArray36[0];
							local1124 = this.aFloatArray36[1];
							if ((local1557 & 0x1) == 0) {
								if (local1118 - local1114 > 0.5F) {
									local1118--;
									local1126 = 1;
								} else if (local1114 - local1118 > 0.5F) {
									local1118++;
									local1126 = 2;
								}
								if (local1122 - local1114 > 0.5F) {
									local1122--;
									local1128 = 1;
								} else if (local1114 - local1122 > 0.5F) {
									local1122++;
									local1128 = 2;
								}
							} else {
								if (local1120 - local1116 > 0.5F) {
									local1120--;
									local1126 = 1;
								} else if (local1116 - local1120 > 0.5F) {
									local1120++;
									local1126 = 2;
								}
								if (local1124 - local1116 > 0.5F) {
									local1124--;
									local1128 = 1;
								} else if (local1116 - local1124 > 0.5F) {
									local1124++;
									local1128 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray65 == null) {
				local1162 = 0;
			} else {
				local1162 = arg1.aByteArray65[local1055];
			}
			if (local1162 == 0) {
				@Pc(2330) long local2330 = (long) (local156 << 2) + ((long) (local1130 << 24) + (long) (local1062 << 8) + (long) local784 << 32);
				local1179 = arg1.aShortArray89[local1055];
				local1184 = arg1.aShortArray90[local1055];
				local1189 = arg1.aShortArray91[local1055];
				@Pc(2349) Class254 local2349 = local443[local1179];
				this.aShortArray18[local491] = this.method5262(arg1, local1179, local491, local2330, local2349.anInt4190, local2349.anInt4189, local2349.anInt4191, local2349.anInt4192, local1114, local1116);
				@Pc(2373) Class254 local2373 = local443[local1184];
				this.aShortArray22[local491] = this.method5262(arg1, local1184, local491, local2330 + (long) local1126, local2373.anInt4190, local2373.anInt4189, local2373.anInt4191, local2373.anInt4192, local1118, local1120);
				@Pc(2400) Class254 local2400 = local443[local1189];
				this.aShortArray19[local491] = this.method5262(arg1, local1189, local491, local2330 + (long) local1128, local2400.anInt4190, local2400.anInt4189, local2400.anInt4191, local2400.anInt4192, local1122, local1124);
			} else if (local1162 == 1) {
				@Pc(2431) Class260 local2431 = local753[local1055];
				@Pc(2472) long local2472 = (long) ((local156 << 2) + (local2431.anInt4196 > 0 ? 1024 : 2048) + (local2431.anInt4197 + 256 << 12) + (local2431.anInt4198 + 256 << 22)) + ((long) (local1130 << 24) + (long) (local1062 << 8) + (long) local784 << 32);
				this.aShortArray18[local491] = this.method5262(arg1, arg1.aShortArray89[local1055], local491, local2472, local2431.anInt4196, local2431.anInt4197, local2431.anInt4198, 0, local1114, local1116);
				this.aShortArray22[local491] = this.method5262(arg1, arg1.aShortArray90[local1055], local491, local2472 + (long) local1126, local2431.anInt4196, local2431.anInt4197, local2431.anInt4198, 0, local1118, local1120);
				this.aShortArray19[local491] = this.method5262(arg1, arg1.aShortArray91[local1055], local491, local2472 + (long) local1128, local2431.anInt4196, local2431.anInt4197, local2431.anInt4198, 0, local1122, local1124);
			}
			if (arg1.aByteArray64 != null) {
				this.aByteArray8[local491] = arg1.aByteArray64[local1055];
			}
			if (arg1.aShortArray95 != null) {
				this.aShortArray21[local491] = arg1.aShortArray95[local1055];
			}
			this.aShortArray16[local491] = arg1.aShortArray87[local1055];
			this.aShortArray20[local491] = local1096;
		}
		if (this.anInt532 > 0) {
			local491 = 1;
			local764 = this.aShortArray20[0];
			for (local1062 = 0; local1062 < this.anInt532; local1062++) {
				local774 = this.aShortArray20[local1062];
				if (local774 != local764) {
					local491++;
					local764 = local774;
				}
			}
			this.anIntArray57 = new int[local491];
			this.anIntArray60 = new int[local491];
			this.anIntArray59 = new int[local491 + 1];
			this.anIntArray59[0] = 0;
			local1062 = this.anInt544;
			local774 = 0;
			local491 = 0;
			local764 = this.aShortArray20[0];
			for (local784 = 0; local784 < this.anInt532; local784++) {
				local1096 = this.aShortArray20[local784];
				if (local1096 != local764) {
					this.anIntArray57[local491] = local1062;
					this.anIntArray60[local491] = local774 - local1062 + 1;
					local491++;
					this.anIntArray59[local491] = local784;
					local1062 = this.anInt544;
					local774 = 0;
					local764 = local1096;
				}
				@Pc(2687) short local2687 = this.aShortArray18[local784];
				if (local2687 < local1062) {
					local1062 = local2687;
				}
				if (local2687 > local774) {
					local774 = local2687;
				}
				local2687 = this.aShortArray22[local784];
				if (local2687 < local1062) {
					local1062 = local2687;
				}
				if (local2687 > local774) {
					local774 = local2687;
				}
				local2687 = this.aShortArray19[local784];
				if (local2687 < local1062) {
					local1062 = local2687;
				}
				if (local2687 > local774) {
					local774 = local2687;
				}
			}
			this.anIntArray57[local491] = local1062;
			this.anIntArray60[local491] = local774 - local1062 + 1;
			local491++;
			this.anIntArray59[local491] = this.anInt532;
		}
		this.aLongArray2 = null;
		this.aShortArray12 = method5263(this.aShortArray12, this.anInt544);
		this.aShortArray13 = method5263(this.aShortArray13, this.anInt544);
		this.aShortArray14 = method5263(this.aShortArray14, this.anInt544);
		this.aShortArray15 = method5263(this.aShortArray15, this.anInt544);
		this.aShortArray17 = method5263(this.aShortArray17, this.anInt544);
		this.aByteArray7 = method5275(this.aByteArray7, this.anInt544);
		this.aFloatArray35 = method5271(this.aFloatArray35, this.anInt544);
		this.aFloatArray37 = method5271(this.aFloatArray37, this.anInt544);
		if (arg1.anIntArray330 != null && Class241.method24660(arg2, this.anInt529)) {
			this.anIntArrayArray8 = arg1.method22962(false);
		}
		if (arg1.aClass130Array1 != null && Class241.method24661(arg2, this.anInt529)) {
			this.anIntArrayArray9 = arg1.method22987();
		}
		if (arg1.anIntArray334 != null && Class241.method24676(arg2, this.anInt529)) {
			local491 = 0;
			@Pc(2847) int[] local2847 = new int[256];
			for (local1062 = 0; local1062 < this.anInt531; local1062++) {
				local156 = arg1.anIntArray334[local13[local1062]];
				if (local156 >= 0) {
					@Pc(2866) int local2866 = local2847[local156]++;
					if (local156 > local491) {
						local491 = local156;
					}
				}
			}
			this.anIntArrayArray10 = new int[local491 + 1][];
			for (local1062 = 0; local1062 <= local491; local1062++) {
				this.anIntArrayArray10[local1062] = new int[local2847[local1062]];
				local2847[local1062] = 0;
			}
			for (local1062 = 0; local1062 < this.anInt531; local1062++) {
				local156 = arg1.anIntArray334[local13[local1062]];
				if (local156 >= 0) {
					this.anIntArrayArray10[local156][local2847[local156]++] = local1062;
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "go", descriptor = "(Lclient!dy;IIJIIIIFF)S", line = 643)
	short method5262(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray56[arg1];
		@Pc(11) int local11 = this.anIntArray56[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray23[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray23[local15] & 0xFFFF) - 1;
			if (this.aLongArray2[local15] == arg3) {
				return (short) local35;
			}
		}
		this.aShortArray23[local13] = (short) (this.anInt544 + 1);
		this.aLongArray2[local13] = arg3;
		this.aShortArray13[this.anInt544] = (short) arg2;
		this.aShortArray12[this.anInt544] = (short) arg1;
		this.aShortArray14[this.anInt544] = (short) arg4;
		this.aShortArray15[this.anInt544] = (short) arg5;
		this.aShortArray17[this.anInt544] = (short) arg6;
		this.aByteArray7[this.anInt544] = (byte) arg7;
		this.aFloatArray35[this.anInt544] = arg8;
		this.aFloatArray37[this.anInt544] = arg9;
		return (short) this.anInt544++;
	}

	@OriginalMember(owner = "client!abw", name = "hf", descriptor = "(Lclient!dy;IIJIIIIFF)S", line = 643)
	short method5277(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray56[arg1];
		@Pc(11) int local11 = this.anIntArray56[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray23[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray23[local15] & 0xFFFF) - 1;
			if (this.aLongArray2[local15] == arg3) {
				return (short) local35;
			}
		}
		this.aShortArray23[local13] = (short) (this.anInt544 + 1);
		this.aLongArray2[local13] = arg3;
		this.aShortArray13[this.anInt544] = (short) arg2;
		this.aShortArray12[this.anInt544] = (short) arg1;
		this.aShortArray14[this.anInt544] = (short) arg4;
		this.aShortArray15[this.anInt544] = (short) arg5;
		this.aShortArray17[this.anInt544] = (short) arg6;
		this.aByteArray7[this.anInt544] = (byte) arg7;
		this.aFloatArray35[this.anInt544] = arg8;
		this.aFloatArray37[this.anInt544] = arg9;
		return (short) this.anInt544++;
	}

	@OriginalMember(owner = "client!abw", name = "hp", descriptor = "(Lclient!dy;IIJIIIIFF)S", line = 643)
	short method5295(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(4) int local4 = this.anIntArray56[arg1];
		@Pc(11) int local11 = this.anIntArray56[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray23[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray23[local15] & 0xFFFF) - 1;
			if (this.aLongArray2[local15] == arg3) {
				return (short) local35;
			}
		}
		this.aShortArray23[local13] = (short) (this.anInt544 + 1);
		this.aLongArray2[local13] = arg3;
		this.aShortArray13[this.anInt544] = (short) arg2;
		this.aShortArray12[this.anInt544] = (short) arg1;
		this.aShortArray14[this.anInt544] = (short) arg4;
		this.aShortArray15[this.anInt544] = (short) arg5;
		this.aShortArray17[this.anInt544] = (short) arg6;
		this.aByteArray7[this.anInt544] = (byte) arg7;
		this.aFloatArray35[this.anInt544] = arg8;
		this.aFloatArray37[this.anInt544] = arg9;
		return (short) this.anInt544++;
	}

	@OriginalMember(owner = "client!abw", name = "gi", descriptor = "([BI)[B", line = 668)
	static byte[] method5275(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!abw", name = "hq", descriptor = "([BI)[B", line = 668)
	static byte[] method5296(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!abw", name = "gb", descriptor = "([SI)[S", line = 674)
	static short[] method5263(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!abw", name = "ht", descriptor = "([SI)[S", line = 674)
	static short[] method5265(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!abw", name = "hv", descriptor = "([SI)[S", line = 674)
	static short[] method5273(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!abw", name = "gl", descriptor = "([FI)[F", line = 680)
	static float[] method5271(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!abw", name = "bu", descriptor = "()I", line = 686)
	@Override
	public int method5385() {
		return this.anInt526;
	}

	@OriginalMember(owner = "client!abw", name = "y", descriptor = "()I", line = 686)
	@Override
	public int method5327() {
		return this.anInt526;
	}

	@OriginalMember(owner = "client!abw", name = "u", descriptor = "(I)V", line = 690)
	@Override
	public void method5326(@OriginalArg(0) int arg0) {
		if (this.aClass267_1 != null) {
			this.aClass267_1.aBoolean691 = Class241.method24648(arg0, this.anInt529);
		}
		if (this.aClass267_3 != null) {
			this.aClass267_3.aBoolean691 = Class241.method24651(arg0, this.anInt529);
		}
		if (this.aClass267_4 != null) {
			this.aClass267_4.aBoolean691 = Class241.method24650(arg0, this.anInt529);
		}
		if (this.aClass267_2 != null) {
			this.aClass267_2.aBoolean691 = Class241.method24649(arg0, this.anInt529);
		}
		this.anInt526 = arg0;
		if (this.aClass257_1 != null && (this.anInt526 & 0x10000) == 0) {
			this.aShortArray14 = this.aClass257_1.aShortArray106;
			this.aShortArray15 = this.aClass257_1.aShortArray105;
			this.aShortArray17 = this.aClass257_1.aShortArray107;
			this.aByteArray7 = this.aClass257_1.aByteArray77;
			this.aClass257_1 = null;
		}
		this.aBoolean124 = true;
		this.method5289();
	}

	@OriginalMember(owner = "client!abw", name = "bc", descriptor = "(I)V", line = 690)
	@Override
	public void method5388(@OriginalArg(0) int arg0) {
		if (this.aClass267_1 != null) {
			this.aClass267_1.aBoolean691 = Class241.method24648(arg0, this.anInt529);
		}
		if (this.aClass267_3 != null) {
			this.aClass267_3.aBoolean691 = Class241.method24651(arg0, this.anInt529);
		}
		if (this.aClass267_4 != null) {
			this.aClass267_4.aBoolean691 = Class241.method24650(arg0, this.anInt529);
		}
		if (this.aClass267_2 != null) {
			this.aClass267_2.aBoolean691 = Class241.method24649(arg0, this.anInt529);
		}
		this.anInt526 = arg0;
		if (this.aClass257_1 != null && (this.anInt526 & 0x10000) == 0) {
			this.aShortArray14 = this.aClass257_1.aShortArray106;
			this.aShortArray15 = this.aClass257_1.aShortArray105;
			this.aShortArray17 = this.aClass257_1.aShortArray107;
			this.aByteArray7 = this.aClass257_1.aByteArray77;
			this.aClass257_1 = null;
		}
		this.aBoolean124 = true;
		this.method5289();
	}

	@OriginalMember(owner = "client!abw", name = "bn", descriptor = "(I)V", line = 690)
	@Override
	public void method5364(@OriginalArg(0) int arg0) {
		if (this.aClass267_1 != null) {
			this.aClass267_1.aBoolean691 = Class241.method24648(arg0, this.anInt529);
		}
		if (this.aClass267_3 != null) {
			this.aClass267_3.aBoolean691 = Class241.method24651(arg0, this.anInt529);
		}
		if (this.aClass267_4 != null) {
			this.aClass267_4.aBoolean691 = Class241.method24650(arg0, this.anInt529);
		}
		if (this.aClass267_2 != null) {
			this.aClass267_2.aBoolean691 = Class241.method24649(arg0, this.anInt529);
		}
		this.anInt526 = arg0;
		if (this.aClass257_1 != null && (this.anInt526 & 0x10000) == 0) {
			this.aShortArray14 = this.aClass257_1.aShortArray106;
			this.aShortArray15 = this.aClass257_1.aShortArray105;
			this.aShortArray17 = this.aClass257_1.aShortArray107;
			this.aByteArray7 = this.aClass257_1.aByteArray77;
			this.aClass257_1 = null;
		}
		this.aBoolean124 = true;
		this.method5289();
	}

	@OriginalMember(owner = "client!abw", name = "bo", descriptor = "(I)V", line = 690)
	@Override
	public void method5387(@OriginalArg(0) int arg0) {
		if (this.aClass267_1 != null) {
			this.aClass267_1.aBoolean691 = Class241.method24648(arg0, this.anInt529);
		}
		if (this.aClass267_3 != null) {
			this.aClass267_3.aBoolean691 = Class241.method24651(arg0, this.anInt529);
		}
		if (this.aClass267_4 != null) {
			this.aClass267_4.aBoolean691 = Class241.method24650(arg0, this.anInt529);
		}
		if (this.aClass267_2 != null) {
			this.aClass267_2.aBoolean691 = Class241.method24649(arg0, this.anInt529);
		}
		this.anInt526 = arg0;
		if (this.aClass257_1 != null && (this.anInt526 & 0x10000) == 0) {
			this.aShortArray14 = this.aClass257_1.aShortArray106;
			this.aShortArray15 = this.aClass257_1.aShortArray105;
			this.aShortArray17 = this.aClass257_1.aShortArray107;
			this.aByteArray7 = this.aClass257_1.aByteArray77;
			this.aClass257_1 = null;
		}
		this.aBoolean124 = true;
		this.method5289();
	}

	@OriginalMember(owner = "client!abw", name = "ba", descriptor = "(I)V", line = 690)
	@Override
	public void method5386(@OriginalArg(0) int arg0) {
		if (this.aClass267_1 != null) {
			this.aClass267_1.aBoolean691 = Class241.method24648(arg0, this.anInt529);
		}
		if (this.aClass267_3 != null) {
			this.aClass267_3.aBoolean691 = Class241.method24651(arg0, this.anInt529);
		}
		if (this.aClass267_4 != null) {
			this.aClass267_4.aBoolean691 = Class241.method24650(arg0, this.anInt529);
		}
		if (this.aClass267_2 != null) {
			this.aClass267_2.aBoolean691 = Class241.method24649(arg0, this.anInt529);
		}
		this.anInt526 = arg0;
		if (this.aClass257_1 != null && (this.anInt526 & 0x10000) == 0) {
			this.aShortArray14 = this.aClass257_1.aShortArray106;
			this.aShortArray15 = this.aClass257_1.aShortArray105;
			this.aShortArray17 = this.aClass257_1.aShortArray107;
			this.aByteArray7 = this.aClass257_1.aByteArray77;
			this.aClass257_1 = null;
		}
		this.aBoolean124 = true;
		this.method5289();
	}

	@OriginalMember(owner = "client!abw", name = "bh", descriptor = "()V", line = 707)
	@Override
	public void method5392() {
		if (this.anInt544 > 0 && this.anInt532 > 0) {
			this.method5283();
			this.method5297();
			this.method5289();
		}
	}

	@OriginalMember(owner = "client!abw", name = "b", descriptor = "()V", line = 707)
	@Override
	public void method5328() {
		if (this.anInt544 > 0 && this.anInt532 > 0) {
			this.method5283();
			this.method5297();
			this.method5289();
		}
	}

	@OriginalMember(owner = "client!abw", name = "bx", descriptor = "()V", line = 707)
	@Override
	public void method5391() {
		if (this.anInt544 > 0 && this.anInt532 > 0) {
			this.method5283();
			this.method5297();
			this.method5289();
		}
	}

	@OriginalMember(owner = "client!abw", name = "be", descriptor = "()V", line = 707)
	@Override
	public void method5390() {
		if (this.anInt544 > 0 && this.anInt532 > 0) {
			this.method5283();
			this.method5297();
			this.method5289();
		}
	}

	@OriginalMember(owner = "client!abw", name = "bl", descriptor = "(BIZ)Lclient!dh;", line = 716)
	@Override
	public Class20 method5383(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class20_Sub2 local22;
		@Pc(14) Class20_Sub2 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass21_Sub3_5.aClass20_Sub2Array5[arg0 - 1];
			local22 = this.aClass21_Sub3_5.aClass20_Sub2Array6[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class20_Sub2(this.aClass21_Sub3_5, 0, 0, true, false);
		}
		return this.method5264(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!abw", name = "bi", descriptor = "(BIZ)Lclient!dh;", line = 716)
	@Override
	public Class20 method5368(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class20_Sub2 local22;
		@Pc(14) Class20_Sub2 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass21_Sub3_5.aClass20_Sub2Array5[arg0 - 1];
			local22 = this.aClass21_Sub3_5.aClass20_Sub2Array6[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class20_Sub2(this.aClass21_Sub3_5, 0, 0, true, false);
		}
		return this.method5264(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!abw", name = "s", descriptor = "(BIZ)Lclient!dh;", line = 716)
	@Override
	public Class20 method5430(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class20_Sub2 local22;
		@Pc(14) Class20_Sub2 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass21_Sub3_5.aClass20_Sub2Array5[arg0 - 1];
			local22 = this.aClass21_Sub3_5.aClass20_Sub2Array6[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class20_Sub2(this.aClass21_Sub3_5, 0, 0, true, false);
		}
		return this.method5264(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!abw", name = "gu", descriptor = "(Lclient!abw;Lclient!abw;IZZ)Lclient!dh;", line = 729)
	Class20 method5264(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.anInt526 = arg2;
		arg0.anInt529 = this.anInt529;
		arg0.aShort11 = this.aShort11;
		arg0.aShort10 = this.aShort10;
		arg0.anInt530 = this.anInt530;
		arg0.anInt533 = this.anInt533;
		arg0.anInt544 = this.anInt544;
		arg0.anInt531 = this.anInt531;
		arg0.anInt532 = this.anInt532;
		arg0.anInt545 = this.anInt545;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean125 = this.aBoolean125;
		} else {
			arg0.aBoolean125 = true;
		}
		arg0.aBoolean128 = this.aBoolean128;
		@Pc(59) boolean local59 = Class241.method24692(arg2, this.anInt529);
		@Pc(64) boolean local64 = Class241.method24632(arg2, this.anInt529);
		@Pc(69) boolean local69 = Class241.method24716(arg2, this.anInt529);
		@Pc(75) boolean local75 = local59 | local64 | local69;
		@Pc(166) int local166;
		if (local75) {
			if (!local59) {
				arg0.anIntArray62 = this.anIntArray62;
			} else if (arg1.anIntArray62 == null || arg1.anIntArray62.length < this.anInt530) {
				arg0.anIntArray62 = arg1.anIntArray62 = new int[this.anInt530];
			} else {
				arg0.anIntArray62 = arg1.anIntArray62;
			}
			if (!local64) {
				arg0.anIntArray54 = this.anIntArray54;
			} else if (arg1.anIntArray54 == null || arg1.anIntArray54.length < this.anInt530) {
				arg0.anIntArray54 = arg1.anIntArray54 = new int[this.anInt530];
			} else {
				arg0.anIntArray54 = arg1.anIntArray54;
			}
			if (!local69) {
				arg0.anIntArray55 = this.anIntArray55;
			} else if (arg1.anIntArray55 == null || arg1.anIntArray55.length < this.anInt530) {
				arg0.anIntArray55 = arg1.anIntArray55 = new int[this.anInt530];
			} else {
				arg0.anIntArray55 = arg1.anIntArray55;
			}
			for (local166 = 0; local166 < this.anInt530; local166++) {
				if (local59) {
					arg0.anIntArray62[local166] = this.anIntArray62[local166];
				}
				if (local64) {
					arg0.anIntArray54[local166] = this.anIntArray54[local166];
				}
				if (local69) {
					arg0.anIntArray55[local166] = this.anIntArray55[local166];
				}
			}
		} else {
			arg0.anIntArray62 = this.anIntArray62;
			arg0.anIntArray54 = this.anIntArray54;
			arg0.anIntArray55 = this.anIntArray55;
		}
		if (Class241.method24648(arg2, this.anInt529)) {
			arg0.aClass267_1 = arg1.aClass267_1;
			arg0.aClass267_1.anInterface21_22 = this.aClass267_1.anInterface21_22;
			arg0.aClass267_1.aBoolean692 = this.aClass267_1.aBoolean692;
			arg0.aClass267_1.aBoolean691 = true;
		} else if (Class241.method24643(arg2, this.anInt529)) {
			arg0.aClass267_1 = this.aClass267_1;
		} else {
			arg0.aClass267_1 = null;
		}
		if (Class241.method24636(arg2, this.anInt529)) {
			if (arg1.aShortArray16 == null || arg1.aShortArray16.length < this.anInt531) {
				arg0.aShortArray16 = arg1.aShortArray16 = new short[this.anInt531];
			} else {
				arg0.aShortArray16 = arg1.aShortArray16;
			}
			for (local166 = 0; local166 < this.anInt531; local166++) {
				arg0.aShortArray16[local166] = this.aShortArray16[local166];
			}
		} else {
			arg0.aShortArray16 = this.aShortArray16;
		}
		if (Class241.method24689(arg2, this.anInt529)) {
			if (arg1.aByteArray8 == null || arg1.aByteArray8.length < this.anInt531) {
				arg0.aByteArray8 = arg1.aByteArray8 = new byte[this.anInt531];
			} else {
				arg0.aByteArray8 = arg1.aByteArray8;
			}
			for (local166 = 0; local166 < this.anInt531; local166++) {
				arg0.aByteArray8[local166] = this.aByteArray8[local166];
			}
		} else {
			arg0.aByteArray8 = this.aByteArray8;
		}
		if (Class241.method24650(arg2, this.anInt529)) {
			arg0.aClass267_4 = arg1.aClass267_4;
			arg0.aClass267_4.anInterface21_22 = this.aClass267_4.anInterface21_22;
			arg0.aClass267_4.aBoolean692 = this.aClass267_4.aBoolean692;
			arg0.aClass267_4.aBoolean691 = true;
		} else if (Class241.method24711(arg2, this.anInt529)) {
			arg0.aClass267_4 = this.aClass267_4;
		} else {
			arg0.aClass267_4 = null;
		}
		@Pc(469) int local469;
		if (Class241.method24635(arg2, this.anInt529)) {
			if (arg1.aShortArray14 == null || arg1.aShortArray14.length < this.anInt544) {
				local166 = this.anInt544;
				arg0.aShortArray14 = arg1.aShortArray14 = new short[local166];
				arg0.aShortArray15 = arg1.aShortArray15 = new short[local166];
				arg0.aShortArray17 = arg1.aShortArray17 = new short[local166];
			} else {
				arg0.aShortArray14 = arg1.aShortArray14;
				arg0.aShortArray15 = arg1.aShortArray15;
				arg0.aShortArray17 = arg1.aShortArray17;
			}
			if (this.aClass257_1 == null) {
				arg0.aClass257_1 = null;
				for (local166 = 0; local166 < this.anInt544; local166++) {
					arg0.aShortArray14[local166] = this.aShortArray14[local166];
					arg0.aShortArray15[local166] = this.aShortArray15[local166];
					arg0.aShortArray17[local166] = this.aShortArray17[local166];
				}
			} else {
				if (arg1.aClass257_1 == null) {
					arg1.aClass257_1 = new Class257();
				}
				@Pc(457) Class257 local457 = arg0.aClass257_1 = arg1.aClass257_1;
				if (local457.aShortArray106 == null || local457.aShortArray106.length < this.anInt544) {
					local469 = this.anInt544;
					local457.aShortArray106 = new short[local469];
					local457.aShortArray105 = new short[local469];
					local457.aShortArray107 = new short[local469];
					local457.aByteArray77 = new byte[local469];
				}
				for (local469 = 0; local469 < this.anInt544; local469++) {
					arg0.aShortArray14[local469] = this.aShortArray14[local469];
					arg0.aShortArray15[local469] = this.aShortArray15[local469];
					arg0.aShortArray17[local469] = this.aShortArray17[local469];
					local457.aShortArray106[local469] = this.aClass257_1.aShortArray106[local469];
					local457.aShortArray105[local469] = this.aClass257_1.aShortArray105[local469];
					local457.aShortArray107[local469] = this.aClass257_1.aShortArray107[local469];
					local457.aByteArray77[local469] = this.aClass257_1.aByteArray77[local469];
				}
			}
			arg0.aByteArray7 = this.aByteArray7;
		} else {
			arg0.aClass257_1 = this.aClass257_1;
			arg0.aShortArray14 = this.aShortArray14;
			arg0.aShortArray15 = this.aShortArray15;
			arg0.aShortArray17 = this.aShortArray17;
			arg0.aByteArray7 = this.aByteArray7;
		}
		if (Class241.method24649(arg2, this.anInt529)) {
			arg0.aClass267_2 = arg1.aClass267_2;
			arg0.aClass267_2.anInterface21_22 = this.aClass267_2.anInterface21_22;
			arg0.aClass267_2.aBoolean692 = this.aClass267_2.aBoolean692;
			arg0.aClass267_2.aBoolean691 = true;
		} else if (Class241.method24675(arg2, this.anInt529)) {
			arg0.aClass267_2 = this.aClass267_2;
		} else {
			arg0.aClass267_2 = null;
		}
		if (Class241.method24638(arg2, this.anInt529)) {
			if (arg1.aFloatArray35 == null || arg1.aFloatArray35.length < this.anInt531) {
				local166 = this.anInt544;
				arg0.aFloatArray35 = arg1.aFloatArray35 = new float[local166];
				arg0.aFloatArray37 = arg1.aFloatArray37 = new float[local166];
			} else {
				arg0.aFloatArray35 = arg1.aFloatArray35;
				arg0.aFloatArray37 = arg1.aFloatArray37;
			}
			for (local166 = 0; local166 < this.anInt544; local166++) {
				arg0.aFloatArray35[local166] = this.aFloatArray35[local166];
				arg0.aFloatArray37[local166] = this.aFloatArray37[local166];
			}
		} else {
			arg0.aFloatArray35 = this.aFloatArray35;
			arg0.aFloatArray37 = this.aFloatArray37;
		}
		if (Class241.method24651(arg2, this.anInt529)) {
			arg0.aClass267_3 = arg1.aClass267_3;
			arg0.aClass267_3.anInterface21_22 = this.aClass267_3.anInterface21_22;
			arg0.aClass267_3.aBoolean692 = this.aClass267_3.aBoolean692;
			arg0.aClass267_3.aBoolean691 = true;
		} else if (Class241.method24666(arg2, this.anInt529)) {
			arg0.aClass267_3 = this.aClass267_3;
		} else {
			arg0.aClass267_3 = null;
		}
		if (Class241.method24639(arg2, this.anInt529)) {
			if (arg1.aShortArray18 == null || arg1.aShortArray18.length < this.anInt531) {
				local166 = this.anInt531;
				arg0.aShortArray18 = arg1.aShortArray18 = new short[local166];
				arg0.aShortArray22 = arg1.aShortArray22 = new short[local166];
				arg0.aShortArray19 = arg1.aShortArray19 = new short[local166];
			} else {
				arg0.aShortArray18 = arg1.aShortArray18;
				arg0.aShortArray22 = arg1.aShortArray22;
				arg0.aShortArray19 = arg1.aShortArray19;
			}
			for (local166 = 0; local166 < this.anInt531; local166++) {
				arg0.aShortArray18[local166] = this.aShortArray18[local166];
				arg0.aShortArray22[local166] = this.aShortArray22[local166];
				arg0.aShortArray19[local166] = this.aShortArray19[local166];
			}
		} else {
			arg0.aShortArray18 = this.aShortArray18;
			arg0.aShortArray22 = this.aShortArray22;
			arg0.aShortArray19 = this.aShortArray19;
		}
		if (Class241.method24715(arg2, this.anInt529)) {
			arg0.aClass233_1 = arg1.aClass233_1;
			arg0.aClass233_1.anInterface30_6 = this.aClass233_1.anInterface30_6;
			arg0.aClass233_1.aBoolean679 = this.aClass233_1.aBoolean679;
			arg0.aClass233_1.aBoolean680 = true;
		} else if (Class241.method24647(arg2, this.anInt529)) {
			arg0.aClass233_1 = this.aClass233_1;
		} else {
			arg0.aClass233_1 = null;
		}
		if (Class241.method24640(arg2, this.anInt529)) {
			if (arg1.aShortArray20 == null || arg1.aShortArray20.length < this.anInt531) {
				local166 = this.anInt531;
				arg0.aShortArray20 = arg1.aShortArray20 = new short[local166];
			} else {
				arg0.aShortArray20 = arg1.aShortArray20;
			}
			for (local166 = 0; local166 < this.anInt531; local166++) {
				arg0.aShortArray20[local166] = this.aShortArray20[local166];
			}
		} else {
			arg0.aShortArray20 = this.aShortArray20;
		}
		if (!Class241.method24728(arg2, this.anInt529)) {
			arg0.aClass249Array1 = this.aClass249Array1;
		} else if (arg1.aClass249Array1 == null || arg1.aClass249Array1.length < this.anInt545) {
			local166 = this.anInt545;
			arg0.aClass249Array1 = arg1.aClass249Array1 = new Class249[local166];
			for (local469 = 0; local469 < this.anInt545; local469++) {
				arg0.aClass249Array1[local469] = this.aClass249Array1[local469].method24915();
			}
		} else {
			arg0.aClass249Array1 = arg1.aClass249Array1;
			for (local166 = 0; local166 < this.anInt545; local166++) {
				arg0.aClass249Array1[local166].method24918(this.aClass249Array1[local166]);
			}
		}
		arg0.aClass261Array1 = this.aClass261Array1;
		if (this.aBoolean126) {
			arg0.anInt534 = this.anInt534;
			arg0.anInt535 = this.anInt535;
			arg0.anInt538 = this.anInt538;
			arg0.anInt539 = this.anInt539;
			arg0.anInt536 = this.anInt536;
			arg0.anInt537 = this.anInt537;
			arg0.anInt540 = this.anInt540;
			arg0.anInt541 = this.anInt541;
			arg0.aBoolean126 = true;
		} else {
			arg0.aBoolean126 = false;
		}
		if (this.aBoolean127) {
			arg0.anInt542 = this.anInt542;
			arg0.aBoolean127 = true;
		} else {
			arg0.aBoolean127 = false;
		}
		arg0.anIntArrayArray8 = this.anIntArrayArray8;
		arg0.anIntArrayArray10 = this.anIntArrayArray10;
		arg0.anIntArrayArray9 = this.anIntArrayArray9;
		arg0.aShortArray23 = this.aShortArray23;
		arg0.anIntArray56 = this.anIntArray56;
		arg0.aShortArray12 = this.aShortArray12;
		arg0.aShortArray13 = this.aShortArray13;
		arg0.aShortArray24 = this.aShortArray24;
		arg0.aShortArray21 = this.aShortArray21;
		arg0.anIntArray59 = this.anIntArray59;
		arg0.anIntArray60 = this.anIntArray60;
		arg0.anIntArray57 = this.anIntArray57;
		arg0.aClass135Array2 = this.aClass135Array2;
		arg0.aClass109Array2 = this.aClass109Array2;
		return arg0;
	}

	@OriginalMember(owner = "client!abw", name = "he", descriptor = "(Lclient!abw;Lclient!abw;IZZ)Lclient!dh;", line = 729)
	Class20 method5287(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) int arg2) {
		arg0.anInt526 = arg2;
		arg0.anInt529 = this.anInt529;
		arg0.aShort11 = this.aShort11;
		arg0.aShort10 = this.aShort10;
		arg0.anInt530 = this.anInt530;
		arg0.anInt533 = this.anInt533;
		arg0.anInt544 = this.anInt544;
		arg0.anInt531 = this.anInt531;
		arg0.anInt532 = this.anInt532;
		arg0.anInt545 = this.anInt545;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean125 = this.aBoolean125;
		} else {
			arg0.aBoolean125 = true;
		}
		arg0.aBoolean128 = this.aBoolean128;
		@Pc(59) boolean local59 = Class241.method24692(arg2, this.anInt529);
		@Pc(64) boolean local64 = Class241.method24632(arg2, this.anInt529);
		@Pc(69) boolean local69 = Class241.method24716(arg2, this.anInt529);
		@Pc(75) boolean local75 = local59 | local64 | local69;
		@Pc(166) int local166;
		if (local75) {
			if (!local59) {
				arg0.anIntArray62 = this.anIntArray62;
			} else if (arg1.anIntArray62 == null || arg1.anIntArray62.length < this.anInt530) {
				arg0.anIntArray62 = arg1.anIntArray62 = new int[this.anInt530];
			} else {
				arg0.anIntArray62 = arg1.anIntArray62;
			}
			if (!local64) {
				arg0.anIntArray54 = this.anIntArray54;
			} else if (arg1.anIntArray54 == null || arg1.anIntArray54.length < this.anInt530) {
				arg0.anIntArray54 = arg1.anIntArray54 = new int[this.anInt530];
			} else {
				arg0.anIntArray54 = arg1.anIntArray54;
			}
			if (!local69) {
				arg0.anIntArray55 = this.anIntArray55;
			} else if (arg1.anIntArray55 == null || arg1.anIntArray55.length < this.anInt530) {
				arg0.anIntArray55 = arg1.anIntArray55 = new int[this.anInt530];
			} else {
				arg0.anIntArray55 = arg1.anIntArray55;
			}
			for (local166 = 0; local166 < this.anInt530; local166++) {
				if (local59) {
					arg0.anIntArray62[local166] = this.anIntArray62[local166];
				}
				if (local64) {
					arg0.anIntArray54[local166] = this.anIntArray54[local166];
				}
				if (local69) {
					arg0.anIntArray55[local166] = this.anIntArray55[local166];
				}
			}
		} else {
			arg0.anIntArray62 = this.anIntArray62;
			arg0.anIntArray54 = this.anIntArray54;
			arg0.anIntArray55 = this.anIntArray55;
		}
		if (Class241.method24648(arg2, this.anInt529)) {
			arg0.aClass267_1 = arg1.aClass267_1;
			arg0.aClass267_1.anInterface21_22 = this.aClass267_1.anInterface21_22;
			arg0.aClass267_1.aBoolean692 = this.aClass267_1.aBoolean692;
			arg0.aClass267_1.aBoolean691 = true;
		} else if (Class241.method24643(arg2, this.anInt529)) {
			arg0.aClass267_1 = this.aClass267_1;
		} else {
			arg0.aClass267_1 = null;
		}
		if (Class241.method24636(arg2, this.anInt529)) {
			if (arg1.aShortArray16 == null || arg1.aShortArray16.length < this.anInt531) {
				arg0.aShortArray16 = arg1.aShortArray16 = new short[this.anInt531];
			} else {
				arg0.aShortArray16 = arg1.aShortArray16;
			}
			for (local166 = 0; local166 < this.anInt531; local166++) {
				arg0.aShortArray16[local166] = this.aShortArray16[local166];
			}
		} else {
			arg0.aShortArray16 = this.aShortArray16;
		}
		if (Class241.method24689(arg2, this.anInt529)) {
			if (arg1.aByteArray8 == null || arg1.aByteArray8.length < this.anInt531) {
				arg0.aByteArray8 = arg1.aByteArray8 = new byte[this.anInt531];
			} else {
				arg0.aByteArray8 = arg1.aByteArray8;
			}
			for (local166 = 0; local166 < this.anInt531; local166++) {
				arg0.aByteArray8[local166] = this.aByteArray8[local166];
			}
		} else {
			arg0.aByteArray8 = this.aByteArray8;
		}
		if (Class241.method24650(arg2, this.anInt529)) {
			arg0.aClass267_4 = arg1.aClass267_4;
			arg0.aClass267_4.anInterface21_22 = this.aClass267_4.anInterface21_22;
			arg0.aClass267_4.aBoolean692 = this.aClass267_4.aBoolean692;
			arg0.aClass267_4.aBoolean691 = true;
		} else if (Class241.method24711(arg2, this.anInt529)) {
			arg0.aClass267_4 = this.aClass267_4;
		} else {
			arg0.aClass267_4 = null;
		}
		@Pc(469) int local469;
		if (Class241.method24635(arg2, this.anInt529)) {
			if (arg1.aShortArray14 == null || arg1.aShortArray14.length < this.anInt544) {
				local166 = this.anInt544;
				arg0.aShortArray14 = arg1.aShortArray14 = new short[local166];
				arg0.aShortArray15 = arg1.aShortArray15 = new short[local166];
				arg0.aShortArray17 = arg1.aShortArray17 = new short[local166];
			} else {
				arg0.aShortArray14 = arg1.aShortArray14;
				arg0.aShortArray15 = arg1.aShortArray15;
				arg0.aShortArray17 = arg1.aShortArray17;
			}
			if (this.aClass257_1 == null) {
				arg0.aClass257_1 = null;
				for (local166 = 0; local166 < this.anInt544; local166++) {
					arg0.aShortArray14[local166] = this.aShortArray14[local166];
					arg0.aShortArray15[local166] = this.aShortArray15[local166];
					arg0.aShortArray17[local166] = this.aShortArray17[local166];
				}
			} else {
				if (arg1.aClass257_1 == null) {
					arg1.aClass257_1 = new Class257();
				}
				@Pc(457) Class257 local457 = arg0.aClass257_1 = arg1.aClass257_1;
				if (local457.aShortArray106 == null || local457.aShortArray106.length < this.anInt544) {
					local469 = this.anInt544;
					local457.aShortArray106 = new short[local469];
					local457.aShortArray105 = new short[local469];
					local457.aShortArray107 = new short[local469];
					local457.aByteArray77 = new byte[local469];
				}
				for (local469 = 0; local469 < this.anInt544; local469++) {
					arg0.aShortArray14[local469] = this.aShortArray14[local469];
					arg0.aShortArray15[local469] = this.aShortArray15[local469];
					arg0.aShortArray17[local469] = this.aShortArray17[local469];
					local457.aShortArray106[local469] = this.aClass257_1.aShortArray106[local469];
					local457.aShortArray105[local469] = this.aClass257_1.aShortArray105[local469];
					local457.aShortArray107[local469] = this.aClass257_1.aShortArray107[local469];
					local457.aByteArray77[local469] = this.aClass257_1.aByteArray77[local469];
				}
			}
			arg0.aByteArray7 = this.aByteArray7;
		} else {
			arg0.aClass257_1 = this.aClass257_1;
			arg0.aShortArray14 = this.aShortArray14;
			arg0.aShortArray15 = this.aShortArray15;
			arg0.aShortArray17 = this.aShortArray17;
			arg0.aByteArray7 = this.aByteArray7;
		}
		if (Class241.method24649(arg2, this.anInt529)) {
			arg0.aClass267_2 = arg1.aClass267_2;
			arg0.aClass267_2.anInterface21_22 = this.aClass267_2.anInterface21_22;
			arg0.aClass267_2.aBoolean692 = this.aClass267_2.aBoolean692;
			arg0.aClass267_2.aBoolean691 = true;
		} else if (Class241.method24675(arg2, this.anInt529)) {
			arg0.aClass267_2 = this.aClass267_2;
		} else {
			arg0.aClass267_2 = null;
		}
		if (Class241.method24638(arg2, this.anInt529)) {
			if (arg1.aFloatArray35 == null || arg1.aFloatArray35.length < this.anInt531) {
				local166 = this.anInt544;
				arg0.aFloatArray35 = arg1.aFloatArray35 = new float[local166];
				arg0.aFloatArray37 = arg1.aFloatArray37 = new float[local166];
			} else {
				arg0.aFloatArray35 = arg1.aFloatArray35;
				arg0.aFloatArray37 = arg1.aFloatArray37;
			}
			for (local166 = 0; local166 < this.anInt544; local166++) {
				arg0.aFloatArray35[local166] = this.aFloatArray35[local166];
				arg0.aFloatArray37[local166] = this.aFloatArray37[local166];
			}
		} else {
			arg0.aFloatArray35 = this.aFloatArray35;
			arg0.aFloatArray37 = this.aFloatArray37;
		}
		if (Class241.method24651(arg2, this.anInt529)) {
			arg0.aClass267_3 = arg1.aClass267_3;
			arg0.aClass267_3.anInterface21_22 = this.aClass267_3.anInterface21_22;
			arg0.aClass267_3.aBoolean692 = this.aClass267_3.aBoolean692;
			arg0.aClass267_3.aBoolean691 = true;
		} else if (Class241.method24666(arg2, this.anInt529)) {
			arg0.aClass267_3 = this.aClass267_3;
		} else {
			arg0.aClass267_3 = null;
		}
		if (Class241.method24639(arg2, this.anInt529)) {
			if (arg1.aShortArray18 == null || arg1.aShortArray18.length < this.anInt531) {
				local166 = this.anInt531;
				arg0.aShortArray18 = arg1.aShortArray18 = new short[local166];
				arg0.aShortArray22 = arg1.aShortArray22 = new short[local166];
				arg0.aShortArray19 = arg1.aShortArray19 = new short[local166];
			} else {
				arg0.aShortArray18 = arg1.aShortArray18;
				arg0.aShortArray22 = arg1.aShortArray22;
				arg0.aShortArray19 = arg1.aShortArray19;
			}
			for (local166 = 0; local166 < this.anInt531; local166++) {
				arg0.aShortArray18[local166] = this.aShortArray18[local166];
				arg0.aShortArray22[local166] = this.aShortArray22[local166];
				arg0.aShortArray19[local166] = this.aShortArray19[local166];
			}
		} else {
			arg0.aShortArray18 = this.aShortArray18;
			arg0.aShortArray22 = this.aShortArray22;
			arg0.aShortArray19 = this.aShortArray19;
		}
		if (Class241.method24715(arg2, this.anInt529)) {
			arg0.aClass233_1 = arg1.aClass233_1;
			arg0.aClass233_1.anInterface30_6 = this.aClass233_1.anInterface30_6;
			arg0.aClass233_1.aBoolean679 = this.aClass233_1.aBoolean679;
			arg0.aClass233_1.aBoolean680 = true;
		} else if (Class241.method24647(arg2, this.anInt529)) {
			arg0.aClass233_1 = this.aClass233_1;
		} else {
			arg0.aClass233_1 = null;
		}
		if (Class241.method24640(arg2, this.anInt529)) {
			if (arg1.aShortArray20 == null || arg1.aShortArray20.length < this.anInt531) {
				local166 = this.anInt531;
				arg0.aShortArray20 = arg1.aShortArray20 = new short[local166];
			} else {
				arg0.aShortArray20 = arg1.aShortArray20;
			}
			for (local166 = 0; local166 < this.anInt531; local166++) {
				arg0.aShortArray20[local166] = this.aShortArray20[local166];
			}
		} else {
			arg0.aShortArray20 = this.aShortArray20;
		}
		if (!Class241.method24728(arg2, this.anInt529)) {
			arg0.aClass249Array1 = this.aClass249Array1;
		} else if (arg1.aClass249Array1 == null || arg1.aClass249Array1.length < this.anInt545) {
			local166 = this.anInt545;
			arg0.aClass249Array1 = arg1.aClass249Array1 = new Class249[local166];
			for (local469 = 0; local469 < this.anInt545; local469++) {
				arg0.aClass249Array1[local469] = this.aClass249Array1[local469].method24915();
			}
		} else {
			arg0.aClass249Array1 = arg1.aClass249Array1;
			for (local166 = 0; local166 < this.anInt545; local166++) {
				arg0.aClass249Array1[local166].method24918(this.aClass249Array1[local166]);
			}
		}
		arg0.aClass261Array1 = this.aClass261Array1;
		if (this.aBoolean126) {
			arg0.anInt534 = this.anInt534;
			arg0.anInt535 = this.anInt535;
			arg0.anInt538 = this.anInt538;
			arg0.anInt539 = this.anInt539;
			arg0.anInt536 = this.anInt536;
			arg0.anInt537 = this.anInt537;
			arg0.anInt540 = this.anInt540;
			arg0.anInt541 = this.anInt541;
			arg0.aBoolean126 = true;
		} else {
			arg0.aBoolean126 = false;
		}
		if (this.aBoolean127) {
			arg0.anInt542 = this.anInt542;
			arg0.aBoolean127 = true;
		} else {
			arg0.aBoolean127 = false;
		}
		arg0.anIntArrayArray8 = this.anIntArrayArray8;
		arg0.anIntArrayArray10 = this.anIntArrayArray10;
		arg0.anIntArrayArray9 = this.anIntArrayArray9;
		arg0.aShortArray23 = this.aShortArray23;
		arg0.anIntArray56 = this.anIntArray56;
		arg0.aShortArray12 = this.aShortArray12;
		arg0.aShortArray13 = this.aShortArray13;
		arg0.aShortArray24 = this.aShortArray24;
		arg0.aShortArray21 = this.aShortArray21;
		arg0.anIntArray59 = this.anIntArray59;
		arg0.anIntArray60 = this.anIntArray60;
		arg0.anIntArray57 = this.anIntArray57;
		arg0.aClass135Array2 = this.aClass135Array2;
		arg0.aClass109Array2 = this.aClass109Array2;
		return arg0;
	}

	@OriginalMember(owner = "client!abw", name = "gg", descriptor = "()V", line = 999)
	void method5289() {
		if (!this.aBoolean124) {
			return;
		}
		this.aBoolean124 = false;
		if (this.aClass135Array2 == null && this.aClass109Array2 == null && this.aClass261Array1 == null && !Class241.method24705(this.anInt526, this.anInt529)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray62 != null && !Class241.method24653(this.anInt526, this.anInt529)) {
				if (this.aClass267_1 == null || this.aClass267_1.method25264()) {
					if (!this.aBoolean126) {
						this.method5270();
					}
					local23 = true;
				} else {
					this.aBoolean124 = true;
				}
			}
			if (this.anIntArray54 != null && !Class241.method24652(this.anInt526, this.anInt529)) {
				if (this.aClass267_1 == null || this.aClass267_1.method25264()) {
					if (!this.aBoolean126) {
						this.method5270();
					}
					local25 = true;
				} else {
					this.aBoolean124 = true;
				}
			}
			if (this.anIntArray55 != null && !Class241.method24654(this.anInt526, this.anInt529)) {
				if (this.aClass267_1 == null || this.aClass267_1.method25264()) {
					if (!this.aBoolean126) {
						this.method5270();
					}
					local27 = true;
				} else {
					this.aBoolean124 = true;
				}
			}
			if (local23) {
				this.anIntArray62 = null;
			}
			if (local25) {
				this.anIntArray54 = null;
			}
			if (local27) {
				this.anIntArray55 = null;
			}
		}
		if (this.aShortArray23 != null && this.anIntArray62 == null && this.anIntArray54 == null && this.anIntArray55 == null) {
			this.aShortArray23 = null;
			this.anIntArray56 = null;
		}
		if (this.aByteArray7 != null && !Class241.method24655(this.anInt526, this.anInt529)) {
			label204: {
				label203: {
					if ((this.anInt529 & 0x37) == 0) {
						if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
							break label203;
						}
					} else if (this.aClass267_2 == null || this.aClass267_2.method25264()) {
						break label203;
					}
					this.aBoolean124 = true;
					break label204;
				}
				this.aShortArray17 = null;
				this.aShortArray15 = null;
				this.aShortArray14 = null;
				this.aByteArray7 = null;
			}
		}
		if (this.aShortArray16 != null && !Class241.method24703(this.anInt526, this.anInt529)) {
			if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
				this.aShortArray16 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aByteArray8 != null && !Class241.method24740(this.anInt526, this.anInt529)) {
			if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
				this.aByteArray8 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aFloatArray35 != null && !Class241.method24673(this.anInt526, this.anInt529)) {
			if (this.aClass267_3 == null || this.aClass267_3.method25264()) {
				this.aFloatArray37 = null;
				this.aFloatArray35 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aShortArray20 != null && !Class241.method24663(this.anInt526, this.anInt529)) {
			if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
				this.aShortArray20 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aShortArray18 != null && !Class241.method24662(this.anInt526, this.anInt529)) {
			if ((this.aClass233_1 == null || this.aClass233_1.method24585()) && (this.aClass267_4 == null || this.aClass267_4.method25264())) {
				this.aShortArray19 = null;
				this.aShortArray22 = null;
				this.aShortArray18 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aShortArray12 != null) {
			if (this.aClass267_1 == null || this.aClass267_1.method25264()) {
				this.aShortArray12 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aShortArray13 != null) {
			if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
				this.aShortArray13 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.anIntArrayArray10 != null && !Class241.method24676(this.anInt526, this.anInt529)) {
			this.anIntArrayArray10 = null;
			this.aShortArray21 = null;
		}
		if (this.anIntArrayArray8 != null && !Class241.method24660(this.anInt526, this.anInt529)) {
			this.anIntArrayArray8 = null;
			this.aShortArray24 = null;
		}
		if (this.anIntArrayArray9 != null && !Class241.method24661(this.anInt526, this.anInt529)) {
			this.anIntArrayArray9 = null;
		}
		if (this.anIntArray59 != null && (this.anInt526 & 0x800) == 0 && (this.anInt526 & 0x40000) == 0) {
			this.anIntArray59 = null;
			this.anIntArray60 = null;
			this.anIntArray57 = null;
		}
	}

	@OriginalMember(owner = "client!abw", name = "hj", descriptor = "()V", line = 999)
	void method5299() {
		if (!this.aBoolean124) {
			return;
		}
		this.aBoolean124 = false;
		if (this.aClass135Array2 == null && this.aClass109Array2 == null && this.aClass261Array1 == null && !Class241.method24705(this.anInt526, this.anInt529)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray62 != null && !Class241.method24653(this.anInt526, this.anInt529)) {
				if (this.aClass267_1 == null || this.aClass267_1.method25264()) {
					if (!this.aBoolean126) {
						this.method5270();
					}
					local23 = true;
				} else {
					this.aBoolean124 = true;
				}
			}
			if (this.anIntArray54 != null && !Class241.method24652(this.anInt526, this.anInt529)) {
				if (this.aClass267_1 == null || this.aClass267_1.method25264()) {
					if (!this.aBoolean126) {
						this.method5270();
					}
					local25 = true;
				} else {
					this.aBoolean124 = true;
				}
			}
			if (this.anIntArray55 != null && !Class241.method24654(this.anInt526, this.anInt529)) {
				if (this.aClass267_1 == null || this.aClass267_1.method25264()) {
					if (!this.aBoolean126) {
						this.method5270();
					}
					local27 = true;
				} else {
					this.aBoolean124 = true;
				}
			}
			if (local23) {
				this.anIntArray62 = null;
			}
			if (local25) {
				this.anIntArray54 = null;
			}
			if (local27) {
				this.anIntArray55 = null;
			}
		}
		if (this.aShortArray23 != null && this.anIntArray62 == null && this.anIntArray54 == null && this.anIntArray55 == null) {
			this.aShortArray23 = null;
			this.anIntArray56 = null;
		}
		if (this.aByteArray7 != null && !Class241.method24655(this.anInt526, this.anInt529)) {
			label204: {
				label203: {
					if ((this.anInt529 & 0x37) == 0) {
						if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
							break label203;
						}
					} else if (this.aClass267_2 == null || this.aClass267_2.method25264()) {
						break label203;
					}
					this.aBoolean124 = true;
					break label204;
				}
				this.aShortArray17 = null;
				this.aShortArray15 = null;
				this.aShortArray14 = null;
				this.aByteArray7 = null;
			}
		}
		if (this.aShortArray16 != null && !Class241.method24703(this.anInt526, this.anInt529)) {
			if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
				this.aShortArray16 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aByteArray8 != null && !Class241.method24740(this.anInt526, this.anInt529)) {
			if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
				this.aByteArray8 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aFloatArray35 != null && !Class241.method24673(this.anInt526, this.anInt529)) {
			if (this.aClass267_3 == null || this.aClass267_3.method25264()) {
				this.aFloatArray37 = null;
				this.aFloatArray35 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aShortArray20 != null && !Class241.method24663(this.anInt526, this.anInt529)) {
			if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
				this.aShortArray20 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aShortArray18 != null && !Class241.method24662(this.anInt526, this.anInt529)) {
			if ((this.aClass233_1 == null || this.aClass233_1.method24585()) && (this.aClass267_4 == null || this.aClass267_4.method25264())) {
				this.aShortArray19 = null;
				this.aShortArray22 = null;
				this.aShortArray18 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aShortArray12 != null) {
			if (this.aClass267_1 == null || this.aClass267_1.method25264()) {
				this.aShortArray12 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aShortArray13 != null) {
			if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
				this.aShortArray13 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.anIntArrayArray10 != null && !Class241.method24676(this.anInt526, this.anInt529)) {
			this.anIntArrayArray10 = null;
			this.aShortArray21 = null;
		}
		if (this.anIntArrayArray8 != null && !Class241.method24660(this.anInt526, this.anInt529)) {
			this.anIntArrayArray8 = null;
			this.aShortArray24 = null;
		}
		if (this.anIntArrayArray9 != null && !Class241.method24661(this.anInt526, this.anInt529)) {
			this.anIntArrayArray9 = null;
		}
		if (this.anIntArray59 != null && (this.anInt526 & 0x800) == 0 && (this.anInt526 & 0x40000) == 0) {
			this.anIntArray59 = null;
			this.anIntArray60 = null;
			this.anIntArray57 = null;
		}
	}

	@OriginalMember(owner = "client!abw", name = "hu", descriptor = "()V", line = 999)
	void method5300() {
		if (!this.aBoolean124) {
			return;
		}
		this.aBoolean124 = false;
		if (this.aClass135Array2 == null && this.aClass109Array2 == null && this.aClass261Array1 == null && !Class241.method24705(this.anInt526, this.anInt529)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray62 != null && !Class241.method24653(this.anInt526, this.anInt529)) {
				if (this.aClass267_1 == null || this.aClass267_1.method25264()) {
					if (!this.aBoolean126) {
						this.method5270();
					}
					local23 = true;
				} else {
					this.aBoolean124 = true;
				}
			}
			if (this.anIntArray54 != null && !Class241.method24652(this.anInt526, this.anInt529)) {
				if (this.aClass267_1 == null || this.aClass267_1.method25264()) {
					if (!this.aBoolean126) {
						this.method5270();
					}
					local25 = true;
				} else {
					this.aBoolean124 = true;
				}
			}
			if (this.anIntArray55 != null && !Class241.method24654(this.anInt526, this.anInt529)) {
				if (this.aClass267_1 == null || this.aClass267_1.method25264()) {
					if (!this.aBoolean126) {
						this.method5270();
					}
					local27 = true;
				} else {
					this.aBoolean124 = true;
				}
			}
			if (local23) {
				this.anIntArray62 = null;
			}
			if (local25) {
				this.anIntArray54 = null;
			}
			if (local27) {
				this.anIntArray55 = null;
			}
		}
		if (this.aShortArray23 != null && this.anIntArray62 == null && this.anIntArray54 == null && this.anIntArray55 == null) {
			this.aShortArray23 = null;
			this.anIntArray56 = null;
		}
		if (this.aByteArray7 != null && !Class241.method24655(this.anInt526, this.anInt529)) {
			label204: {
				label203: {
					if ((this.anInt529 & 0x37) == 0) {
						if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
							break label203;
						}
					} else if (this.aClass267_2 == null || this.aClass267_2.method25264()) {
						break label203;
					}
					this.aBoolean124 = true;
					break label204;
				}
				this.aShortArray17 = null;
				this.aShortArray15 = null;
				this.aShortArray14 = null;
				this.aByteArray7 = null;
			}
		}
		if (this.aShortArray16 != null && !Class241.method24703(this.anInt526, this.anInt529)) {
			if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
				this.aShortArray16 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aByteArray8 != null && !Class241.method24740(this.anInt526, this.anInt529)) {
			if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
				this.aByteArray8 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aFloatArray35 != null && !Class241.method24673(this.anInt526, this.anInt529)) {
			if (this.aClass267_3 == null || this.aClass267_3.method25264()) {
				this.aFloatArray37 = null;
				this.aFloatArray35 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aShortArray20 != null && !Class241.method24663(this.anInt526, this.anInt529)) {
			if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
				this.aShortArray20 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aShortArray18 != null && !Class241.method24662(this.anInt526, this.anInt529)) {
			if ((this.aClass233_1 == null || this.aClass233_1.method24585()) && (this.aClass267_4 == null || this.aClass267_4.method25264())) {
				this.aShortArray19 = null;
				this.aShortArray22 = null;
				this.aShortArray18 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aShortArray12 != null) {
			if (this.aClass267_1 == null || this.aClass267_1.method25264()) {
				this.aShortArray12 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.aShortArray13 != null) {
			if (this.aClass267_4 == null || this.aClass267_4.method25264()) {
				this.aShortArray13 = null;
			} else {
				this.aBoolean124 = true;
			}
		}
		if (this.anIntArrayArray10 != null && !Class241.method24676(this.anInt526, this.anInt529)) {
			this.anIntArrayArray10 = null;
			this.aShortArray21 = null;
		}
		if (this.anIntArrayArray8 != null && !Class241.method24660(this.anInt526, this.anInt529)) {
			this.anIntArrayArray8 = null;
			this.aShortArray24 = null;
		}
		if (this.anIntArrayArray9 != null && !Class241.method24661(this.anInt526, this.anInt529)) {
			this.anIntArrayArray9 = null;
		}
		if (this.anIntArray59 != null && (this.anInt526 & 0x800) == 0 && (this.anInt526 & 0x40000) == 0) {
			this.anIntArray59 = null;
			this.anIntArray60 = null;
			this.anIntArray57 = null;
		}
	}

	@OriginalMember(owner = "client!abw", name = "hi", descriptor = "()V", line = 1097)
	void method5266() {
		if (this.aClass267_1 != null) {
			this.aClass267_1.aBoolean692 = false;
		}
	}

	@OriginalMember(owner = "client!abw", name = "hl", descriptor = "()V", line = 1097)
	void method5301() {
		if (this.aClass267_1 != null) {
			this.aClass267_1.aBoolean692 = false;
		}
	}

	@OriginalMember(owner = "client!abw", name = "hk", descriptor = "()V", line = 1101)
	void method5267() {
		if (this.aClass267_4 != null) {
			this.aClass267_4.aBoolean692 = false;
		}
	}

	@OriginalMember(owner = "client!abw", name = "ik", descriptor = "()V", line = 1101)
	void method5292() {
		if (this.aClass267_4 != null) {
			this.aClass267_4.aBoolean692 = false;
		}
	}

	@OriginalMember(owner = "client!abw", name = "id", descriptor = "()V", line = 1101)
	void method5294() {
		if (this.aClass267_4 != null) {
			this.aClass267_4.aBoolean692 = false;
		}
	}

	@OriginalMember(owner = "client!abw", name = "ha", descriptor = "()V", line = 1105)
	void method5268() {
		if ((this.anInt529 & 0x37) == 0) {
			if (this.aClass267_4 != null) {
				this.aClass267_4.aBoolean692 = false;
			}
		} else if (this.aClass267_2 != null) {
			this.aClass267_2.aBoolean692 = false;
		}
	}

	@OriginalMember(owner = "client!abw", name = "iu", descriptor = "()V", line = 1105)
	void method5272() {
		if ((this.anInt529 & 0x37) == 0) {
			if (this.aClass267_4 != null) {
				this.aClass267_4.aBoolean692 = false;
			}
		} else if (this.aClass267_2 != null) {
			this.aClass267_2.aBoolean692 = false;
		}
	}

	@OriginalMember(owner = "client!abw", name = "il", descriptor = "()V", line = 1105)
	void method5290() {
		if ((this.anInt529 & 0x37) == 0) {
			if (this.aClass267_4 != null) {
				this.aClass267_4.aBoolean692 = false;
			}
		} else if (this.aClass267_2 != null) {
			this.aClass267_2.aBoolean692 = false;
		}
	}

	@OriginalMember(owner = "client!abw", name = "hg", descriptor = "()V", line = 1114)
	void method5276() {
		if (this.aClass233_1 != null) {
			this.aClass233_1.aBoolean679 = false;
		}
	}

	@OriginalMember(owner = "client!abw", name = "iq", descriptor = "()V", line = 1114)
	void method5302() {
		if (this.aClass233_1 != null) {
			this.aClass233_1.aBoolean679 = false;
		}
	}

	@OriginalMember(owner = "client!abw", name = "ir", descriptor = "()V", line = 1114)
	void method5303() {
		if (this.aClass233_1 != null) {
			this.aClass233_1.aBoolean679 = false;
		}
	}

	@OriginalMember(owner = "client!abw", name = "im", descriptor = "()V", line = 1114)
	void method5305() {
		if (this.aClass233_1 != null) {
			this.aClass233_1.aBoolean679 = false;
		}
	}

	@OriginalMember(owner = "client!abw", name = "c", descriptor = "(I)V", line = 1118)
	@Override
	public void method5329(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt533; local9++) {
			@Pc(29) int local29 = this.anIntArray55[local9] * local3 + this.anIntArray62[local9] * local7 >> 14;
			this.anIntArray55[local9] = this.anIntArray55[local9] * local7 - this.anIntArray62[local9] * local3 >> 14;
			this.anIntArray62[local9] = local29;
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "bq", descriptor = "(I)V", line = 1118)
	@Override
	public void method5370(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt533; local9++) {
			@Pc(29) int local29 = this.anIntArray55[local9] * local3 + this.anIntArray62[local9] * local7 >> 14;
			this.anIntArray55[local9] = this.anIntArray55[local9] * local7 - this.anIntArray62[local9] * local3 >> 14;
			this.anIntArray62[local9] = local29;
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "bj", descriptor = "(I)V", line = 1118)
	@Override
	public void method5393(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt533; local9++) {
			@Pc(29) int local29 = this.anIntArray55[local9] * local3 + this.anIntArray62[local9] * local7 >> 14;
			this.anIntArray55[local9] = this.anIntArray55[local9] * local7 - this.anIntArray62[local9] * local3 >> 14;
			this.anIntArray62[local9] = local29;
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "z", descriptor = "(I)V", line = 1130)
	@Override
	public void method5330(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt533; local9++) {
			local29 = this.anIntArray55[local9] * local3 + this.anIntArray62[local9] * local7 >> 14;
			this.anIntArray55[local9] = this.anIntArray55[local9] * local7 - this.anIntArray62[local9] * local3 >> 14;
			this.anIntArray62[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt544; local9++) {
			local29 = this.aShortArray17[local9] * local3 + this.aShortArray14[local9] * local7 >> 14;
			this.aShortArray17[local9] = (short) (this.aShortArray17[local9] * local7 - this.aShortArray14[local9] * local3 >> 14);
			this.aShortArray14[local9] = (short) local29;
		}
		this.method5266();
		this.method5268();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "bv", descriptor = "(I)V", line = 1130)
	@Override
	public void method5395(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt533; local9++) {
			local29 = this.anIntArray55[local9] * local3 + this.anIntArray62[local9] * local7 >> 14;
			this.anIntArray55[local9] = this.anIntArray55[local9] * local7 - this.anIntArray62[local9] * local3 >> 14;
			this.anIntArray62[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt544; local9++) {
			local29 = this.aShortArray17[local9] * local3 + this.aShortArray14[local9] * local7 >> 14;
			this.aShortArray17[local9] = (short) (this.aShortArray17[local9] * local7 - this.aShortArray14[local9] * local3 >> 14);
			this.aShortArray14[local9] = (short) local29;
		}
		this.method5266();
		this.method5268();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "bz", descriptor = "(I)V", line = 1130)
	@Override
	public void method5454(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt533; local9++) {
			local29 = this.anIntArray55[local9] * local3 + this.anIntArray62[local9] * local7 >> 14;
			this.anIntArray55[local9] = this.anIntArray55[local9] * local7 - this.anIntArray62[local9] * local3 >> 14;
			this.anIntArray62[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt544; local9++) {
			local29 = this.aShortArray17[local9] * local3 + this.aShortArray14[local9] * local7 >> 14;
			this.aShortArray17[local9] = (short) (this.aShortArray17[local9] * local7 - this.aShortArray14[local9] * local3 >> 14);
			this.aShortArray14[local9] = (short) local29;
		}
		this.method5266();
		this.method5268();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "ck", descriptor = "(I)V", line = 1130)
	@Override
	public void method5397(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt533; local9++) {
			local29 = this.anIntArray55[local9] * local3 + this.anIntArray62[local9] * local7 >> 14;
			this.anIntArray55[local9] = this.anIntArray55[local9] * local7 - this.anIntArray62[local9] * local3 >> 14;
			this.anIntArray62[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt544; local9++) {
			local29 = this.aShortArray17[local9] * local3 + this.aShortArray14[local9] * local7 >> 14;
			this.aShortArray17[local9] = (short) (this.aShortArray17[local9] * local7 - this.aShortArray14[local9] * local3 >> 14);
			this.aShortArray14[local9] = (short) local29;
		}
		this.method5266();
		this.method5268();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "j", descriptor = "(I)V", line = 1148)
	@Override
	public void method5331(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt533; local9++) {
			@Pc(29) int local29 = this.anIntArray54[local9] * local7 - this.anIntArray55[local9] * local3 >> 14;
			this.anIntArray55[local9] = this.anIntArray54[local9] * local3 + this.anIntArray55[local9] * local7 >> 14;
			this.anIntArray54[local9] = local29;
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "cj", descriptor = "(I)V", line = 1148)
	@Override
	public void method5506(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt533; local9++) {
			@Pc(29) int local29 = this.anIntArray54[local9] * local7 - this.anIntArray55[local9] * local3 >> 14;
			this.anIntArray55[local9] = this.anIntArray54[local9] * local3 + this.anIntArray55[local9] * local7 >> 14;
			this.anIntArray54[local9] = local29;
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "cm", descriptor = "(I)V", line = 1148)
	@Override
	public void method5467(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt533; local9++) {
			@Pc(29) int local29 = this.anIntArray54[local9] * local7 - this.anIntArray55[local9] * local3 >> 14;
			this.anIntArray55[local9] = this.anIntArray54[local9] * local3 + this.anIntArray55[local9] * local7 >> 14;
			this.anIntArray54[local9] = local29;
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "n", descriptor = "(I)V", line = 1160)
	@Override
	public void method5482(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt533; local9++) {
			@Pc(29) int local29 = this.anIntArray54[local9] * local3 + this.anIntArray62[local9] * local7 >> 14;
			this.anIntArray54[local9] = this.anIntArray54[local9] * local7 - this.anIntArray62[local9] * local3 >> 14;
			this.anIntArray62[local9] = local29;
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "fb", descriptor = "(I)V", line = 1160)
	@Override
	public void method5484(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class317.anIntArray419[arg0];
		@Pc(7) int local7 = Class317.anIntArray420[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt533; local9++) {
			@Pc(29) int local29 = this.anIntArray54[local9] * local3 + this.anIntArray62[local9] * local7 >> 14;
			this.anIntArray54[local9] = this.anIntArray54[local9] * local7 - this.anIntArray62[local9] * local3 >> 14;
			this.anIntArray62[local9] = local29;
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "e", descriptor = "(III)V", line = 1172)
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt533; local1++) {
			if (arg0 != 0) {
				this.anIntArray62[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray54[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray55[local1] += arg2;
			}
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "cv", descriptor = "(III)V", line = 1172)
	@Override
	public void method5431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt533; local1++) {
			if (arg0 != 0) {
				this.anIntArray62[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray54[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray55[local1] += arg2;
			}
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "cu", descriptor = "(III)V", line = 1172)
	@Override
	public void method5396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt533; local1++) {
			if (arg0 != 0) {
				this.anIntArray62[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray54[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray55[local1] += arg2;
			}
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "r", descriptor = "()V", line = 1182)
	@Override
	public void method5334() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt533; local1++) {
			this.anIntArray55[local1] = -this.anIntArray55[local1];
		}
		for (local1 = 0; local1 < this.anInt544; local1++) {
			this.aShortArray17[local1] = (short) -this.aShortArray17[local1];
		}
		for (local1 = 0; local1 < this.anInt531; local1++) {
			@Pc(45) short local45 = this.aShortArray18[local1];
			this.aShortArray18[local1] = this.aShortArray19[local1];
			this.aShortArray19[local1] = local45;
		}
		this.method5266();
		this.method5268();
		this.method5276();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "cl", descriptor = "()V", line = 1182)
	@Override
	public void method5503() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt533; local1++) {
			this.anIntArray55[local1] = -this.anIntArray55[local1];
		}
		for (local1 = 0; local1 < this.anInt544; local1++) {
			this.aShortArray17[local1] = (short) -this.aShortArray17[local1];
		}
		for (local1 = 0; local1 < this.anInt531; local1++) {
			@Pc(45) short local45 = this.aShortArray18[local1];
			this.aShortArray18[local1] = this.aShortArray19[local1];
			this.aShortArray19[local1] = local45;
		}
		this.method5266();
		this.method5268();
		this.method5276();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "cq", descriptor = "()V", line = 1182)
	@Override
	public void method5403() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt533; local1++) {
			this.anIntArray55[local1] = -this.anIntArray55[local1];
		}
		for (local1 = 0; local1 < this.anInt544; local1++) {
			this.aShortArray17[local1] = (short) -this.aShortArray17[local1];
		}
		for (local1 = 0; local1 < this.anInt531; local1++) {
			@Pc(45) short local45 = this.aShortArray18[local1];
			this.aShortArray18[local1] = this.aShortArray19[local1];
			this.aShortArray19[local1] = local45;
		}
		this.method5266();
		this.method5268();
		this.method5276();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "d", descriptor = "(III)V", line = 1196)
	@Override
	public void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt533; local1++) {
			if (arg0 != 128) {
				this.anIntArray62[local1] = this.anIntArray62[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray54[local1] = this.anIntArray54[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray55[local1] = this.anIntArray55[local1] * arg2 >> 7;
			}
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "cg", descriptor = "(III)V", line = 1196)
	@Override
	public void method5404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt533; local1++) {
			if (arg0 != 128) {
				this.anIntArray62[local1] = this.anIntArray62[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray54[local1] = this.anIntArray54[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray55[local1] = this.anIntArray55[local1] * arg2 >> 7;
			}
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "cp", descriptor = "(III)V", line = 1196)
	@Override
	public void method5405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt533; local1++) {
			if (arg0 != 128) {
				this.anIntArray62[local1] = this.anIntArray62[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray54[local1] = this.anIntArray54[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray55[local1] = this.anIntArray55[local1] * arg2 >> 7;
			}
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "cc", descriptor = "(III)V", line = 1196)
	@Override
	public void method5406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt533; local1++) {
			if (arg0 != 128) {
				this.anIntArray62[local1] = this.anIntArray62[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray54[local1] = this.anIntArray54[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray55[local1] = this.anIntArray55[local1] * arg2 >> 7;
			}
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "cs", descriptor = "(IILclient!ci;Lclient!ci;III)V", line = 1206)
	@Override
	public void method5407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(9) int local9 = arg4 + this.anInt538;
		@Pc(14) int local14 = arg4 + this.anInt539;
		@Pc(19) int local19 = arg6 + this.anInt540;
		@Pc(24) int local24 = arg6 + this.anInt541;
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
			for (local195 = 0; local195 < this.anInt533; local195++) {
				this.anIntArray54[local195] = this.anIntArray54[local195] + arg2.method3547(this.anIntArray62[local195] + arg4, this.anIntArray55[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				local195 = this.anInt536;
				if (local195 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt533; local239++) {
					local252 = (this.anIntArray54[local239] << 16) / local195;
					if (local252 < arg1) {
						this.anIntArray54[local239] += (arg2.method3547(this.anIntArray62[local239] + arg4, this.anIntArray55[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
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
					local195 = this.anInt537 - this.anInt536;
					for (local239 = 0; local239 < this.anInt533; local239++) {
						this.anIntArray54[local239] = this.anIntArray54[local239] + (arg3.method3547(this.anIntArray62[local239] + arg4, this.anIntArray55[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt537 - this.anInt536;
					for (local239 = 0; local239 < this.anInt533; local239++) {
						local252 = this.anIntArray62[local239] + arg4;
						local323 = this.anIntArray55[local239] + arg6;
						@Pc(468) int local468 = arg2.method3547(local252, local323);
						@Pc(474) int local474 = arg3.method3547(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray54[local239] = ((this.anIntArray54[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "ct", descriptor = "(IILclient!ci;Lclient!ci;III)V", line = 1206)
	@Override
	public void method5408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(9) int local9 = arg4 + this.anInt538;
		@Pc(14) int local14 = arg4 + this.anInt539;
		@Pc(19) int local19 = arg6 + this.anInt540;
		@Pc(24) int local24 = arg6 + this.anInt541;
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
			for (local195 = 0; local195 < this.anInt533; local195++) {
				this.anIntArray54[local195] = this.anIntArray54[local195] + arg2.method3547(this.anIntArray62[local195] + arg4, this.anIntArray55[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				local195 = this.anInt536;
				if (local195 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt533; local239++) {
					local252 = (this.anIntArray54[local239] << 16) / local195;
					if (local252 < arg1) {
						this.anIntArray54[local239] += (arg2.method3547(this.anIntArray62[local239] + arg4, this.anIntArray55[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
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
					local195 = this.anInt537 - this.anInt536;
					for (local239 = 0; local239 < this.anInt533; local239++) {
						this.anIntArray54[local239] = this.anIntArray54[local239] + (arg3.method3547(this.anIntArray62[local239] + arg4, this.anIntArray55[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt537 - this.anInt536;
					for (local239 = 0; local239 < this.anInt533; local239++) {
						local252 = this.anIntArray62[local239] + arg4;
						local323 = this.anIntArray55[local239] + arg6;
						@Pc(468) int local468 = arg2.method3547(local252, local323);
						@Pc(474) int local474 = arg3.method3547(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray54[local239] = ((this.anIntArray54[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "q", descriptor = "(IILclient!ci;Lclient!ci;III)V", line = 1206)
	@Override
	public void method5336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(9) int local9 = arg4 + this.anInt538;
		@Pc(14) int local14 = arg4 + this.anInt539;
		@Pc(19) int local19 = arg6 + this.anInt540;
		@Pc(24) int local24 = arg6 + this.anInt541;
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
			for (local195 = 0; local195 < this.anInt533; local195++) {
				this.anIntArray54[local195] = this.anIntArray54[local195] + arg2.method3547(this.anIntArray62[local195] + arg4, this.anIntArray55[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				local195 = this.anInt536;
				if (local195 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt533; local239++) {
					local252 = (this.anIntArray54[local239] << 16) / local195;
					if (local252 < arg1) {
						this.anIntArray54[local239] += (arg2.method3547(this.anIntArray62[local239] + arg4, this.anIntArray55[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
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
					local195 = this.anInt537 - this.anInt536;
					for (local239 = 0; local239 < this.anInt533; local239++) {
						this.anIntArray54[local239] = this.anIntArray54[local239] + (arg3.method3547(this.anIntArray62[local239] + arg4, this.anIntArray55[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt537 - this.anInt536;
					for (local239 = 0; local239 < this.anInt533; local239++) {
						local252 = this.anIntArray62[local239] + arg4;
						local323 = this.anIntArray55[local239] + arg6;
						@Pc(468) int local468 = arg2.method3547(local252, local323);
						@Pc(474) int local474 = arg3.method3547(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray54[local239] = ((this.anIntArray54[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "cx", descriptor = "(IILclient!ci;Lclient!ci;III)V", line = 1206)
	@Override
	public void method5409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(9) int local9 = arg4 + this.anInt538;
		@Pc(14) int local14 = arg4 + this.anInt539;
		@Pc(19) int local19 = arg6 + this.anInt540;
		@Pc(24) int local24 = arg6 + this.anInt541;
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
			for (local195 = 0; local195 < this.anInt533; local195++) {
				this.anIntArray54[local195] = this.anIntArray54[local195] + arg2.method3547(this.anIntArray62[local195] + arg4, this.anIntArray55[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				local195 = this.anInt536;
				if (local195 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt533; local239++) {
					local252 = (this.anIntArray54[local239] << 16) / local195;
					if (local252 < arg1) {
						this.anIntArray54[local239] += (arg2.method3547(this.anIntArray62[local239] + arg4, this.anIntArray55[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
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
					local195 = this.anInt537 - this.anInt536;
					for (local239 = 0; local239 < this.anInt533; local239++) {
						this.anIntArray54[local239] = this.anIntArray54[local239] + (arg3.method3547(this.anIntArray62[local239] + arg4, this.anIntArray55[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.anInt537 - this.anInt536;
					for (local239 = 0; local239 < this.anInt533; local239++) {
						local252 = this.anIntArray62[local239] + arg4;
						local323 = this.anIntArray55[local239] + arg6;
						@Pc(468) int local468 = arg2.method3547(local252, local323);
						@Pc(474) int local474 = arg3.method3547(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray54[local239] = ((this.anIntArray54[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "hc", descriptor = "()V", line = 1270)
	void method5270() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt533; local17++) {
			@Pc(26) int local26 = this.anIntArray62[local17];
			@Pc(31) int local31 = this.anIntArray54[local17];
			@Pc(36) int local36 = this.anIntArray55[local17];
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
		this.anInt538 = local1;
		this.anInt539 = local7;
		this.anInt536 = local3;
		this.anInt537 = local9;
		this.anInt540 = local5;
		this.anInt541 = local11;
		this.anInt535 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt534 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean126 = true;
	}

	@OriginalMember(owner = "client!abw", name = "ag", descriptor = "()V", line = 1305)
	@Override
	public void method5359() {
		if (this.aBoolean127) {
			return;
		}
		if (!this.aBoolean126) {
			this.method5270();
		}
		this.anInt542 = this.anInt536;
		this.aBoolean127 = true;
	}

	@OriginalMember(owner = "client!abw", name = "dw", descriptor = "()V", line = 1305)
	@Override
	public void method5444() {
		if (this.aBoolean127) {
			return;
		}
		if (!this.aBoolean126) {
			this.method5270();
		}
		this.anInt542 = this.anInt536;
		this.aBoolean127 = true;
	}

	@OriginalMember(owner = "client!abw", name = "dj", descriptor = "()V", line = 1305)
	@Override
	public void method5441() {
		if (this.aBoolean127) {
			return;
		}
		if (!this.aBoolean126) {
			this.method5270();
		}
		this.anInt542 = this.anInt536;
		this.aBoolean127 = true;
	}

	@OriginalMember(owner = "client!abw", name = "dm", descriptor = "()V", line = 1305)
	@Override
	public void method5443() {
		if (this.aBoolean127) {
			return;
		}
		if (!this.aBoolean126) {
			this.method5270();
		}
		this.anInt542 = this.anInt536;
		this.aBoolean127 = true;
	}

	@OriginalMember(owner = "client!abw", name = "dx", descriptor = "()V", line = 1305)
	@Override
	public void method5442() {
		if (this.aBoolean127) {
			return;
		}
		if (!this.aBoolean126) {
			this.method5270();
		}
		this.anInt542 = this.anInt536;
		this.aBoolean127 = true;
	}

	@OriginalMember(owner = "client!abw", name = "av", descriptor = "()I", line = 1313)
	@Override
	public int method5355() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt535;
	}

	@OriginalMember(owner = "client!abw", name = "du", descriptor = "()I", line = 1313)
	@Override
	public int method5478() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt535;
	}

	@OriginalMember(owner = "client!abw", name = "ax", descriptor = "()I", line = 1318)
	@Override
	public int method5356() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt534;
	}

	@OriginalMember(owner = "client!abw", name = "do", descriptor = "()I", line = 1318)
	@Override
	public int method5446() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt534;
	}

	@OriginalMember(owner = "client!abw", name = "di", descriptor = "()I", line = 1318)
	@Override
	public int method5447() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt534;
	}

	@OriginalMember(owner = "client!abw", name = "ee", descriptor = "()I", line = 1323)
	@Override
	public int method5449() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt538;
	}

	@OriginalMember(owner = "client!abw", name = "az", descriptor = "()I", line = 1323)
	@Override
	public int method5363() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt538;
	}

	@OriginalMember(owner = "client!abw", name = "dn", descriptor = "()I", line = 1323)
	@Override
	public int method5448() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt538;
	}

	@OriginalMember(owner = "client!abw", name = "al", descriptor = "()I", line = 1328)
	@Override
	public int method5358() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt539;
	}

	@OriginalMember(owner = "client!abw", name = "ef", descriptor = "()I", line = 1328)
	@Override
	public int method5341() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt539;
	}

	@OriginalMember(owner = "client!abw", name = "ex", descriptor = "()I", line = 1328)
	@Override
	public int method5319() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt539;
	}

	@OriginalMember(owner = "client!abw", name = "eb", descriptor = "()I", line = 1328)
	@Override
	public int method5458() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt539;
	}

	@OriginalMember(owner = "client!abw", name = "ey", descriptor = "()I", line = 1328)
	@Override
	public int method5468() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt539;
	}

	@OriginalMember(owner = "client!abw", name = "ao", descriptor = "()I", line = 1333)
	@Override
	public int method5466() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt536;
	}

	@OriginalMember(owner = "client!abw", name = "er", descriptor = "()I", line = 1333)
	@Override
	public int method5462() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt536;
	}

	@OriginalMember(owner = "client!abw", name = "ej", descriptor = "()I", line = 1333)
	@Override
	public int method5367() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt536;
	}

	@OriginalMember(owner = "client!abw", name = "en", descriptor = "()I", line = 1333)
	@Override
	public int method5456() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt536;
	}

	@OriginalMember(owner = "client!abw", name = "ap", descriptor = "()I", line = 1338)
	@Override
	public int method5486() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt537;
	}

	@OriginalMember(owner = "client!abw", name = "ew", descriptor = "()I", line = 1338)
	@Override
	public int method5483() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt537;
	}

	@OriginalMember(owner = "client!abw", name = "em", descriptor = "()I", line = 1338)
	@Override
	public int method5498() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt537;
	}

	@OriginalMember(owner = "client!abw", name = "ab", descriptor = "()I", line = 1343)
	@Override
	public int method5450() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt540;
	}

	@OriginalMember(owner = "client!abw", name = "ea", descriptor = "()I", line = 1343)
	@Override
	public int method5377() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt540;
	}

	@OriginalMember(owner = "client!abw", name = "ec", descriptor = "()I", line = 1343)
	@Override
	public int method5459() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt540;
	}

	@OriginalMember(owner = "client!abw", name = "au", descriptor = "()I", line = 1348)
	@Override
	public int method5362() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt541;
	}

	@OriginalMember(owner = "client!abw", name = "ez", descriptor = "()I", line = 1348)
	@Override
	public int method5394() {
		if (!this.aBoolean126) {
			this.method5270();
		}
		return this.anInt541;
	}

	@OriginalMember(owner = "client!abw", name = "ep", descriptor = "()I", line = 1353)
	@Override
	public int method5353() {
		if (!this.aBoolean127) {
			this.method5359();
		}
		return this.anInt542;
	}

	@OriginalMember(owner = "client!abw", name = "ay", descriptor = "()I", line = 1353)
	@Override
	public int method5519() {
		if (!this.aBoolean127) {
			this.method5359();
		}
		return this.anInt542;
	}

	@OriginalMember(owner = "client!abw", name = "bb", descriptor = "(Lclient!dh;IIIZ)V", line = 1358)
	@Override
	public void method5381(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class20_Sub2 local2 = (Class20_Sub2) arg0;
		if (this.anInt531 == 0 || local2.anInt531 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt533;
		@Pc(15) int[] local15 = local2.anIntArray62;
		@Pc(18) int[] local18 = local2.anIntArray54;
		@Pc(21) int[] local21 = local2.anIntArray55;
		@Pc(24) short[] local24 = local2.aShortArray14;
		@Pc(27) short[] local27 = local2.aShortArray15;
		@Pc(30) short[] local30 = local2.aShortArray17;
		@Pc(33) byte[] local33 = local2.aByteArray7;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass257_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass257_1.aShortArray106;
			local44 = this.aClass257_1.aShortArray105;
			local48 = this.aClass257_1.aShortArray107;
			local52 = this.aClass257_1.aByteArray77;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass257_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass257_1.aShortArray106;
			local72 = local2.aClass257_1.aShortArray105;
			local76 = local2.aClass257_1.aShortArray107;
			local80 = local2.aClass257_1.aByteArray77;
		}
		@Pc(92) int[] local92 = local2.anIntArray56;
		@Pc(95) short[] local95 = local2.aShortArray23;
		if (!local2.aBoolean126) {
			local2.method5270();
		}
		@Pc(103) int local103 = local2.anInt536;
		@Pc(106) int local106 = local2.anInt537;
		@Pc(109) int local109 = local2.anInt538;
		@Pc(112) int local112 = local2.anInt539;
		@Pc(115) int local115 = local2.anInt540;
		@Pc(118) int local118 = local2.anInt541;
		for (@Pc(120) int local120 = 0; local120 < this.anInt533; local120++) {
			@Pc(131) int local131 = this.anIntArray54[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray62[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray55[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray56[local120];
						@Pc(180) int local180 = this.anIntArray56[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray23[local182] != 0; local182++) {
							local168 = (this.aShortArray23[local182] & 0xFFFF) - 1;
							if (this.aByteArray7[local168] != 0) {
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
										local234 = local95[local246] - 1 & 0xFFFF;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass257_1 = new Class257();
											local40 = this.aClass257_1.aShortArray106 = Class140.method23022(this.aShortArray14);
											local44 = this.aClass257_1.aShortArray105 = Class140.method23022(this.aShortArray15);
											local48 = this.aClass257_1.aShortArray107 = Class140.method23022(this.aShortArray17);
											local52 = this.aClass257_1.aByteArray77 = Class185.method23912(this.aByteArray7);
										}
										if (local68 == null) {
											@Pc(325) Class257 local325 = local2.aClass257_1 = new Class257();
											local68 = local325.aShortArray106 = Class140.method23022(local24);
											local72 = local325.aShortArray105 = Class140.method23022(local27);
											local76 = local325.aShortArray107 = Class140.method23022(local30);
											local80 = local325.aByteArray77 = Class185.method23912(local33);
										}
										@Pc(358) short local358 = this.aShortArray14[local168];
										@Pc(363) short local363 = this.aShortArray15[local168];
										@Pc(368) short local368 = this.aShortArray17[local168];
										@Pc(373) byte local373 = this.aByteArray7[local168];
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
										local173 = this.anIntArray56[local120];
										local180 = this.anIntArray56[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray23[local385] != 0; local385++) {
											local394 = (this.aShortArray23[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										local2.method5268();
										this.method5268();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "br", descriptor = "(Lclient!dh;IIIZ)V", line = 1358)
	@Override
	public void method5380(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class20_Sub2 local2 = (Class20_Sub2) arg0;
		if (this.anInt531 == 0 || local2.anInt531 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt533;
		@Pc(15) int[] local15 = local2.anIntArray62;
		@Pc(18) int[] local18 = local2.anIntArray54;
		@Pc(21) int[] local21 = local2.anIntArray55;
		@Pc(24) short[] local24 = local2.aShortArray14;
		@Pc(27) short[] local27 = local2.aShortArray15;
		@Pc(30) short[] local30 = local2.aShortArray17;
		@Pc(33) byte[] local33 = local2.aByteArray7;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass257_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass257_1.aShortArray106;
			local44 = this.aClass257_1.aShortArray105;
			local48 = this.aClass257_1.aShortArray107;
			local52 = this.aClass257_1.aByteArray77;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass257_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass257_1.aShortArray106;
			local72 = local2.aClass257_1.aShortArray105;
			local76 = local2.aClass257_1.aShortArray107;
			local80 = local2.aClass257_1.aByteArray77;
		}
		@Pc(92) int[] local92 = local2.anIntArray56;
		@Pc(95) short[] local95 = local2.aShortArray23;
		if (!local2.aBoolean126) {
			local2.method5270();
		}
		@Pc(103) int local103 = local2.anInt536;
		@Pc(106) int local106 = local2.anInt537;
		@Pc(109) int local109 = local2.anInt538;
		@Pc(112) int local112 = local2.anInt539;
		@Pc(115) int local115 = local2.anInt540;
		@Pc(118) int local118 = local2.anInt541;
		for (@Pc(120) int local120 = 0; local120 < this.anInt533; local120++) {
			@Pc(131) int local131 = this.anIntArray54[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray62[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray55[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray56[local120];
						@Pc(180) int local180 = this.anIntArray56[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray23[local182] != 0; local182++) {
							local168 = (this.aShortArray23[local182] & 0xFFFF) - 1;
							if (this.aByteArray7[local168] != 0) {
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
										local234 = local95[local246] - 1 & 0xFFFF;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass257_1 = new Class257();
											local40 = this.aClass257_1.aShortArray106 = Class140.method23022(this.aShortArray14);
											local44 = this.aClass257_1.aShortArray105 = Class140.method23022(this.aShortArray15);
											local48 = this.aClass257_1.aShortArray107 = Class140.method23022(this.aShortArray17);
											local52 = this.aClass257_1.aByteArray77 = Class185.method23912(this.aByteArray7);
										}
										if (local68 == null) {
											@Pc(325) Class257 local325 = local2.aClass257_1 = new Class257();
											local68 = local325.aShortArray106 = Class140.method23022(local24);
											local72 = local325.aShortArray105 = Class140.method23022(local27);
											local76 = local325.aShortArray107 = Class140.method23022(local30);
											local80 = local325.aByteArray77 = Class185.method23912(local33);
										}
										@Pc(358) short local358 = this.aShortArray14[local168];
										@Pc(363) short local363 = this.aShortArray15[local168];
										@Pc(368) short local368 = this.aShortArray17[local168];
										@Pc(373) byte local373 = this.aByteArray7[local168];
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
										local173 = this.anIntArray56[local120];
										local180 = this.anIntArray56[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray23[local385] != 0; local385++) {
											local394 = (this.aShortArray23[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										local2.method5268();
										this.method5268();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "by", descriptor = "(Lclient!dh;IIIZ)V", line = 1358)
	@Override
	public void method5452(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class20_Sub2 local2 = (Class20_Sub2) arg0;
		if (this.anInt531 == 0 || local2.anInt531 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt533;
		@Pc(15) int[] local15 = local2.anIntArray62;
		@Pc(18) int[] local18 = local2.anIntArray54;
		@Pc(21) int[] local21 = local2.anIntArray55;
		@Pc(24) short[] local24 = local2.aShortArray14;
		@Pc(27) short[] local27 = local2.aShortArray15;
		@Pc(30) short[] local30 = local2.aShortArray17;
		@Pc(33) byte[] local33 = local2.aByteArray7;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass257_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass257_1.aShortArray106;
			local44 = this.aClass257_1.aShortArray105;
			local48 = this.aClass257_1.aShortArray107;
			local52 = this.aClass257_1.aByteArray77;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass257_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass257_1.aShortArray106;
			local72 = local2.aClass257_1.aShortArray105;
			local76 = local2.aClass257_1.aShortArray107;
			local80 = local2.aClass257_1.aByteArray77;
		}
		@Pc(92) int[] local92 = local2.anIntArray56;
		@Pc(95) short[] local95 = local2.aShortArray23;
		if (!local2.aBoolean126) {
			local2.method5270();
		}
		@Pc(103) int local103 = local2.anInt536;
		@Pc(106) int local106 = local2.anInt537;
		@Pc(109) int local109 = local2.anInt538;
		@Pc(112) int local112 = local2.anInt539;
		@Pc(115) int local115 = local2.anInt540;
		@Pc(118) int local118 = local2.anInt541;
		for (@Pc(120) int local120 = 0; local120 < this.anInt533; local120++) {
			@Pc(131) int local131 = this.anIntArray54[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray62[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray55[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray56[local120];
						@Pc(180) int local180 = this.anIntArray56[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray23[local182] != 0; local182++) {
							local168 = (this.aShortArray23[local182] & 0xFFFF) - 1;
							if (this.aByteArray7[local168] != 0) {
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
										local234 = local95[local246] - 1 & 0xFFFF;
										if (local33[local234] != 0) {
											break;
										}
									}
									if (local234 != -1) {
										if (local40 == null) {
											this.aClass257_1 = new Class257();
											local40 = this.aClass257_1.aShortArray106 = Class140.method23022(this.aShortArray14);
											local44 = this.aClass257_1.aShortArray105 = Class140.method23022(this.aShortArray15);
											local48 = this.aClass257_1.aShortArray107 = Class140.method23022(this.aShortArray17);
											local52 = this.aClass257_1.aByteArray77 = Class185.method23912(this.aByteArray7);
										}
										if (local68 == null) {
											@Pc(325) Class257 local325 = local2.aClass257_1 = new Class257();
											local68 = local325.aShortArray106 = Class140.method23022(local24);
											local72 = local325.aShortArray105 = Class140.method23022(local27);
											local76 = local325.aShortArray107 = Class140.method23022(local30);
											local80 = local325.aByteArray77 = Class185.method23912(local33);
										}
										@Pc(358) short local358 = this.aShortArray14[local168];
										@Pc(363) short local363 = this.aShortArray15[local168];
										@Pc(368) short local368 = this.aShortArray17[local168];
										@Pc(373) byte local373 = this.aByteArray7[local168];
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
										local173 = this.anIntArray56[local120];
										local180 = this.anIntArray56[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray23[local385] != 0; local385++) {
											local394 = (this.aShortArray23[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										local2.method5268();
										this.method5268();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "am", descriptor = "(I)V", line = 1490)
	@Override
	public void method5365(@OriginalArg(0) int arg0) {
		this.aShort11 = (short) arg0;
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "ed", descriptor = "(I)V", line = 1490)
	@Override
	public void method5369(@OriginalArg(0) int arg0) {
		this.aShort11 = (short) arg0;
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "ar", descriptor = "(I)V", line = 1495)
	@Override
	public void method5489(@OriginalArg(0) int arg0) {
		this.aShort10 = (short) arg0;
		this.method5266();
		this.method5268();
	}

	@OriginalMember(owner = "client!abw", name = "eq", descriptor = "(I)V", line = 1495)
	@Override
	public void method5464(@OriginalArg(0) int arg0) {
		this.aShort10 = (short) arg0;
		this.method5266();
		this.method5268();
	}

	@OriginalMember(owner = "client!abw", name = "ae", descriptor = "()I", line = 1501)
	@Override
	public int method5332() {
		return this.aShort11;
	}

	@OriginalMember(owner = "client!abw", name = "et", descriptor = "()I", line = 1501)
	@Override
	public int method5402() {
		return this.aShort11;
	}

	@OriginalMember(owner = "client!abw", name = "ev", descriptor = "()I", line = 1501)
	@Override
	public int method5465() {
		return this.aShort11;
	}

	@OriginalMember(owner = "client!abw", name = "eo", descriptor = "()I", line = 1501)
	@Override
	public int method5344() {
		return this.aShort11;
	}

	@OriginalMember(owner = "client!abw", name = "ei", descriptor = "()I", line = 1505)
	@Override
	public int method5469() {
		return this.aShort10;
	}

	@OriginalMember(owner = "client!abw", name = "ek", descriptor = "()I", line = 1505)
	@Override
	public int method5400() {
		return this.aShort10;
	}

	@OriginalMember(owner = "client!abw", name = "ad", descriptor = "()I", line = 1505)
	@Override
	public int method5398() {
		return this.aShort10;
	}

	@OriginalMember(owner = "client!abw", name = "el", descriptor = "()[B", line = 1509)
	@Override
	public byte[] method5470() {
		return this.aByteArray8;
	}

	@OriginalMember(owner = "client!abw", name = "aw", descriptor = "()[B", line = 1509)
	@Override
	public byte[] method5354() {
		return this.aByteArray8;
	}

	@OriginalMember(owner = "client!abw", name = "eu", descriptor = "()[B", line = 1509)
	@Override
	public byte[] method5471() {
		return this.aByteArray8;
	}

	@OriginalMember(owner = "client!abw", name = "ac", descriptor = "(SS)V", line = 1513)
	@Override
	public void method5415(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt531; local1++) {
			if (this.aShortArray16[local1] == arg0) {
				this.aShortArray16[local1] = arg1;
			}
		}
		if (this.aClass261Array1 != null) {
			for (local1 = 0; local1 < this.anInt545; local1++) {
				@Pc(32) Class261 local32 = this.aClass261Array1[local1];
				@Pc(37) Class249 local37 = this.aClass249Array1[local1];
				local37.anInt3799 = local37.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local32.anInt4201] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "eg", descriptor = "(SS)V", line = 1513)
	@Override
	public void method5472(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt531; local1++) {
			if (this.aShortArray16[local1] == arg0) {
				this.aShortArray16[local1] = arg1;
			}
		}
		if (this.aClass261Array1 != null) {
			for (local1 = 0; local1 < this.anInt545; local1++) {
				@Pc(32) Class261 local32 = this.aClass261Array1[local1];
				@Pc(37) Class249 local37 = this.aClass249Array1[local1];
				local37.anInt3799 = local37.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local32.anInt4201] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "es", descriptor = "(SS)V", line = 1513)
	@Override
	public void method5473(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt531; local1++) {
			if (this.aShortArray16[local1] == arg0) {
				this.aShortArray16[local1] = arg1;
			}
		}
		if (this.aClass261Array1 != null) {
			for (local1 = 0; local1 < this.anInt545; local1++) {
				@Pc(32) Class261 local32 = this.aClass261Array1[local1];
				@Pc(37) Class249 local37 = this.aClass249Array1[local1];
				local37.anInt3799 = local37.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local32.anInt4201] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "bw", descriptor = "(B[B)V", line = 1527)
	@Override
	public void method5371(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt531; local3++) {
				this.aByteArray8[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt531; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray8[local3] = (byte) local39;
			}
		}
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "ft", descriptor = "(B[B)V", line = 1527)
	@Override
	public void method5475(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt531; local3++) {
				this.aByteArray8[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt531; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray8[local3] = (byte) local39;
			}
		}
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "eh", descriptor = "(B[B)V", line = 1527)
	@Override
	public void method5325(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt531; local3++) {
				this.aByteArray8[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt531; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray8[local3] = (byte) local39;
			}
		}
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "bp", descriptor = "(SS)V", line = 1542)
	@Override
	public void method5372(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class134 local3 = this.aClass21_Sub3_5.aClass134_7;
		for (@Pc(5) int local5 = 0; local5 < this.anInt531; local5++) {
			if (this.aShortArray20[local5] == arg0) {
				this.aShortArray20[local5] = arg1;
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
				this.aBoolean128 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass261Array1 != null) {
			for (@Pc(90) int local90 = 0; local90 < this.anInt545; local90++) {
				@Pc(99) Class261 local99 = this.aClass261Array1[local90];
				@Pc(104) Class249 local104 = this.aClass249Array1[local90];
				local104.anInt3799 = local104.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local99.anInt4201] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "fp", descriptor = "(SS)V", line = 1542)
	@Override
	public void method5476(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class134 local3 = this.aClass21_Sub3_5.aClass134_7;
		for (@Pc(5) int local5 = 0; local5 < this.anInt531; local5++) {
			if (this.aShortArray20[local5] == arg0) {
				this.aShortArray20[local5] = arg1;
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
				this.aBoolean128 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass261Array1 != null) {
			for (@Pc(90) int local90 = 0; local90 < this.anInt545; local90++) {
				@Pc(99) Class261 local99 = this.aClass261Array1[local90];
				@Pc(104) Class249 local104 = this.aClass249Array1[local90];
				local104.anInt3799 = local104.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local99.anInt4201] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "fv", descriptor = "(IIII)V", line = 1574)
	@Override
	public void method5487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt531; local1++) {
			@Pc(12) int local12 = this.aShortArray16[local1] & 0xFFFF;
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
			this.aShortArray16[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass261Array1 != null) {
			for (local1 = 0; local1 < this.anInt545; local1++) {
				@Pc(97) Class261 local97 = this.aClass261Array1[local1];
				@Pc(102) Class249 local102 = this.aClass249Array1[local1];
				local102.anInt3799 = local102.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local97.anInt4201] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "bd", descriptor = "(IIII)V", line = 1574)
	@Override
	public void method5373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt531; local1++) {
			@Pc(12) int local12 = this.aShortArray16[local1] & 0xFFFF;
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
			this.aShortArray16[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass261Array1 != null) {
			for (local1 = 0; local1 < this.anInt545; local1++) {
				@Pc(97) Class261 local97 = this.aClass261Array1[local1];
				@Pc(102) Class249 local102 = this.aClass249Array1[local1];
				local102.anInt3799 = local102.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local97.anInt4201] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "fy", descriptor = "(IIII)V", line = 1574)
	@Override
	public void method5488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt531; local1++) {
			@Pc(12) int local12 = this.aShortArray16[local1] & 0xFFFF;
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
			this.aShortArray16[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass261Array1 != null) {
			for (local1 = 0; local1 < this.anInt545; local1++) {
				@Pc(97) Class261 local97 = this.aClass261Array1[local1];
				@Pc(102) Class249 local102 = this.aClass249Array1[local1];
				local102.anInt3799 = local102.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local97.anInt4201] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "fd", descriptor = "(IIII)V", line = 1574)
	@Override
	public void method5485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt531; local1++) {
			@Pc(12) int local12 = this.aShortArray16[local1] & 0xFFFF;
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
			this.aShortArray16[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass261Array1 != null) {
			for (local1 = 0; local1 < this.anInt545; local1++) {
				@Pc(97) Class261 local97 = this.aClass261Array1[local1];
				@Pc(102) Class249 local102 = this.aClass249Array1[local1];
				local102.anInt3799 = local102.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local97.anInt4201] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "fz", descriptor = "(IIII)V", line = 1574)
	@Override
	public void method5453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt531; local1++) {
			@Pc(12) int local12 = this.aShortArray16[local1] & 0xFFFF;
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
			this.aShortArray16[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass261Array1 != null) {
			for (local1 = 0; local1 < this.anInt545; local1++) {
				@Pc(97) Class261 local97 = this.aClass261Array1[local1];
				@Pc(102) Class249 local102 = this.aClass249Array1[local1];
				local102.anInt3799 = local102.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local97.anInt4201] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5267();
	}

	@OriginalMember(owner = "client!abw", name = "fn", descriptor = "()Z", line = 1595)
	@Override
	public boolean method5455() {
		if (this.aShortArray20 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray20.length; local6++) {
			if (this.aShortArray20[local6] != -1 && !this.aClass21_Sub3_5.aClass247_3.method24902(this.aClass21_Sub3_5.aClass134_7.method22906(this.aShortArray20[local6]), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!abw", name = "bs", descriptor = "()Z", line = 1595)
	@Override
	public boolean method5440() {
		if (this.aShortArray20 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray20.length; local6++) {
			if (this.aShortArray20[local6] != -1 && !this.aClass21_Sub3_5.aClass247_3.method24902(this.aClass21_Sub3_5.aClass134_7.method22906(this.aShortArray20[local6]), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!abw", name = "fx", descriptor = "()Z", line = 1595)
	@Override
	public boolean method5338() {
		if (this.aShortArray20 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray20.length; local6++) {
			if (this.aShortArray20[local6] != -1 && !this.aClass21_Sub3_5.aClass247_3.method24902(this.aClass21_Sub3_5.aClass134_7.method22906(this.aShortArray20[local6]), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!abw", name = "fh", descriptor = "()Z", line = 1595)
	@Override
	public boolean method5481() {
		if (this.aShortArray20 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray20.length; local6++) {
			if (this.aShortArray20[local6] != -1 && !this.aClass21_Sub3_5.aClass247_3.method24902(this.aClass21_Sub3_5.aClass134_7.method22906(this.aShortArray20[local6]), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!abw", name = "fs", descriptor = "()Z", line = 1595)
	@Override
	public boolean method5479() {
		if (this.aShortArray20 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray20.length; local6++) {
			if (this.aShortArray20[local6] != -1 && !this.aClass21_Sub3_5.aClass247_3.method24902(this.aClass21_Sub3_5.aClass134_7.method22906(this.aShortArray20[local6]), -1)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!abw", name = "bm", descriptor = "()Z", line = 1603)
	@Override
	public boolean method5375() {
		return this.aBoolean125;
	}

	@OriginalMember(owner = "client!abw", name = "fu", descriptor = "()Z", line = 1603)
	@Override
	public boolean method5438() {
		return this.aBoolean125;
	}

	@OriginalMember(owner = "client!abw", name = "bf", descriptor = "()Z", line = 1607)
	@Override
	public boolean method5376() {
		return this.aBoolean128;
	}

	@OriginalMember(owner = "client!abw", name = "fg", descriptor = "()Z", line = 1607)
	@Override
	public boolean method5460() {
		return this.aBoolean128;
	}

	@OriginalMember(owner = "client!abw", name = "v", descriptor = "()V", line = 1610)
	@Override
	void method5382() {
	}

	@OriginalMember(owner = "client!abw", name = "cy", descriptor = "()V", line = 1610)
	@Override
	void method5318() {
	}

	@OriginalMember(owner = "client!abw", name = "cb", descriptor = "()V", line = 1611)
	@Override
	void method5411() {
	}

	@OriginalMember(owner = "client!abw", name = "cz", descriptor = "()V", line = 1611)
	@Override
	void method5412() {
	}

	@OriginalMember(owner = "client!abw", name = "cn", descriptor = "()V", line = 1611)
	@Override
	void method5413() {
	}

	@OriginalMember(owner = "client!abw", name = "t", descriptor = "()V", line = 1611)
	@Override
	void method5339() {
	}

	@OriginalMember(owner = "client!abw", name = "af", descriptor = "()Z", line = 1614)
	@Override
	boolean method5346() {
		if (this.anIntArrayArray8 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt530; local6++) {
			this.anIntArray62[local6] <<= 0x4;
			this.anIntArray54[local6] <<= 0x4;
			this.anIntArray55[local6] <<= 0x4;
		}
		this.anInt528 = 0;
		this.anInt527 = 0;
		this.anInt546 = 0;
		return true;
	}

	@OriginalMember(owner = "client!abw", name = "cd", descriptor = "()Z", line = 1614)
	@Override
	boolean method5366() {
		if (this.anIntArrayArray8 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt530; local6++) {
			this.anIntArray62[local6] <<= 0x4;
			this.anIntArray54[local6] <<= 0x4;
			this.anIntArray55[local6] <<= 0x4;
		}
		this.anInt528 = 0;
		this.anInt527 = 0;
		this.anInt546 = 0;
		return true;
	}

	@OriginalMember(owner = "client!abw", name = "co", descriptor = "()Z", line = 1614)
	@Override
	boolean method5414() {
		if (this.anIntArrayArray8 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt530; local6++) {
			this.anIntArray62[local6] <<= 0x4;
			this.anIntArray54[local6] <<= 0x4;
			this.anIntArray55[local6] <<= 0x4;
		}
		this.anInt528 = 0;
		this.anInt527 = 0;
		this.anInt546 = 0;
		return true;
	}

	@OriginalMember(owner = "client!abw", name = "aa", descriptor = "(I[IIIIZI[I)V", line = 1627)
	@Override
	void method5348(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			this.anInt528 = 0;
			this.anInt527 = 0;
			this.anInt546 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray8.length) {
					local46 = this.anIntArrayArray8[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local56]) != 0) {
							this.anInt528 += this.anIntArray62[local56];
							this.anInt527 += this.anIntArray54[local56];
							this.anInt546 += this.anIntArray55[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt528 = this.anInt528 / local18 + arg2;
				this.anInt527 = this.anInt527 / local18 + arg3;
				this.anInt546 = this.anInt546 / local18 + arg4;
				this.aBoolean129 = true;
			} else {
				this.anInt528 = arg2;
				this.anInt527 = arg3;
				this.anInt546 = arg4;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local29 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local36 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local29;
				arg4 = local36;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local247 = this.anIntArrayArray8[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
							this.anIntArray62[local48] += arg2;
							this.anIntArray54[local48] += arg3;
							this.anIntArray55[local48] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(391) int local391;
		@Pc(416) int local416;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(642) int local642;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(685) int local685;
		@Pc(690) int local690;
		@Pc(695) int local695;
		@Pc(700) int local700;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(829) int local829;
		@Pc(834) int local834;
		@Pc(836) int local836;
		@Pc(962) int local962;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray8.length) {
						local247 = this.anIntArrayArray8[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
								this.anIntArray62[local48] -= this.anInt528;
								this.anIntArray54[local48] -= this.anInt527;
								this.anIntArray55[local48] -= this.anInt546;
								if (arg4 != 0) {
									local56 = Class317.anIntArray419[arg4];
									local366 = Class317.anIntArray420[arg4];
									local391 = this.anIntArray54[local48] * local56 + this.anIntArray62[local48] * local366 + 16383 >> 14;
									this.anIntArray54[local48] = this.anIntArray54[local48] * local366 - this.anIntArray62[local48] * local56 + 16383 >> 14;
									this.anIntArray62[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class317.anIntArray419[arg2];
									local366 = Class317.anIntArray420[arg2];
									local391 = this.anIntArray54[local48] * local366 - this.anIntArray55[local48] * local56 + 16383 >> 14;
									this.anIntArray55[local48] = this.anIntArray54[local48] * local56 + this.anIntArray55[local48] * local366 + 16383 >> 14;
									this.anIntArray54[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class317.anIntArray419[arg3];
									local366 = Class317.anIntArray420[arg3];
									local391 = this.anIntArray55[local48] * local56 + this.anIntArray62[local48] * local366 + 16383 >> 14;
									this.anIntArray55[local48] = this.anIntArray55[local48] * local366 - this.anIntArray62[local48] * local56 + 16383 >> 14;
									this.anIntArray62[local48] = local391;
								}
								this.anIntArray62[local48] += this.anInt528;
								this.anIntArray54[local48] += this.anInt527;
								this.anIntArray55[local48] += this.anInt546;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray8.length) {
							local247 = this.anIntArrayArray8[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
									local56 = this.anIntArray56[local48];
									local366 = this.anIntArray56[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray23[local391] != 0; local391++) {
										local416 = (this.aShortArray23[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class317.anIntArray419[arg4];
											local459 = Class317.anIntArray420[arg4];
											local463 = this.aShortArray15[local416] * local455 + this.aShortArray14[local416] * local459 + 16383 >> 14;
											this.aShortArray15[local416] = (short) (this.aShortArray15[local416] * local459 - this.aShortArray14[local416] * local455 + 16383 >> 14);
											this.aShortArray14[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class317.anIntArray419[arg2];
											local459 = Class317.anIntArray420[arg2];
											local463 = this.aShortArray15[local416] * local459 - this.aShortArray17[local416] * local455 + 16383 >> 14;
											this.aShortArray17[local416] = (short) (this.aShortArray15[local416] * local455 + this.aShortArray17[local416] * local459 + 16383 >> 14);
											this.aShortArray15[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class317.anIntArray419[arg3];
											local459 = Class317.anIntArray420[arg3];
											local463 = this.aShortArray17[local416] * local455 + this.aShortArray14[local416] * local459 + 16383 >> 14;
											this.aShortArray17[local416] = (short) (this.aShortArray17[local416] * local459 - this.aShortArray14[local416] * local455 + 16383 >> 14);
											this.aShortArray14[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method5268();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean129) {
					local366 = arg7[0] * this.anInt528 + arg7[3] * this.anInt527 + arg7[6] * this.anInt546 + 8192 >> 14;
					local391 = arg7[1] * this.anInt528 + arg7[4] * this.anInt527 + arg7[7] * this.anInt546 + 8192 >> 14;
					local416 = arg7[2] * this.anInt528 + arg7[5] * this.anInt527 + arg7[8] * this.anInt546 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt528 = local366;
					this.anInt527 = local391;
					this.anInt546 = local416;
					this.aBoolean129 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class317.anIntArray420[arg2];
				local416 = Class317.anIntArray419[arg2];
				local455 = Class317.anIntArray420[arg3];
				local459 = Class317.anIntArray419[arg3];
				local463 = Class317.anIntArray420[arg4];
				local467 = Class317.anIntArray419[arg4];
				local475 = local416 * local463 + 8192 >> 14;
				local483 = local416 * local467 + 8192 >> 14;
				local443[0] = local455 * local463 + local459 * local483 + 8192 >> 14;
				local443[1] = -local455 * local467 + local459 * local475 + 8192 >> 14;
				local443[2] = local459 * local391 + 8192 >> 14;
				local443[3] = local391 * local467 + 8192 >> 14;
				local443[4] = local391 * local463 + 8192 >> 14;
				local443[5] = -local416;
				local443[6] = -local459 * local463 + local455 * local483 + 8192 >> 14;
				local443[7] = local459 * local467 + local455 * local475 + 8192 >> 14;
				local443[8] = local455 * local391 + 8192 >> 14;
				@Pc(614) int local614 = local443[0] * -this.anInt528 + local443[1] * -this.anInt527 + local443[2] * -this.anInt546 + 8192 >> 14;
				local642 = local443[3] * -this.anInt528 + local443[4] * -this.anInt527 + local443[5] * -this.anInt546 + 8192 >> 14;
				local670 = local443[6] * -this.anInt528 + local443[7] * -this.anInt527 + local443[8] * -this.anInt546 + 8192 >> 14;
				local675 = local614 + this.anInt528;
				@Pc(680) int local680 = local642 + this.anInt527;
				local685 = local670 + this.anInt546;
				@Pc(688) int[] local688 = new int[9];
				for (local690 = 0; local690 < 3; local690++) {
					for (local695 = 0; local695 < 3; local695++) {
						local700 = 0;
						for (@Pc(702) int local702 = 0; local702 < 3; local702++) {
							local700 += local443[local690 * 3 + local702] * arg7[local695 * 3 + local702];
						}
						local688[local690 * 3 + local695] = local700 + 8192 >> 14;
					}
				}
				local690 = local443[0] * local249 + local443[1] * local48 + local443[2] * local56 + 8192 >> 14;
				local695 = local443[3] * local249 + local443[4] * local48 + local443[5] * local56 + 8192 >> 14;
				local700 = local443[6] * local249 + local443[7] * local48 + local443[8] * local56 + 8192 >> 14;
				local690 += local675;
				local695 += local680;
				local700 += local685;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local829 = 0; local829 < 3; local829++) {
						local834 = 0;
						for (local836 = 0; local836 < 3; local836++) {
							local834 += arg7[local824 * 3 + local836] * local688[local829 + local836 * 3];
						}
						local822[local824 * 3 + local829] = local834 + 8192 >> 14;
					}
				}
				local824 = arg7[0] * local690 + arg7[1] * local695 + arg7[2] * local700 + 8192 >> 14;
				local829 = arg7[3] * local690 + arg7[4] * local695 + arg7[5] * local700 + 8192 >> 14;
				local834 = arg7[6] * local690 + arg7[7] * local695 + arg7[8] * local700 + 8192 >> 14;
				local824 += local18;
				local829 += local29;
				local834 += local36;
				for (local836 = 0; local836 < local2; local836++) {
					local962 = arg1[local836];
					if (local962 < this.anIntArrayArray8.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray8[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray62[local982] + local822[1] * this.anIntArray54[local982] + local822[2] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray62[local982] + local822[4] * this.anIntArray54[local982] + local822[5] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray62[local982] + local822[7] * this.anIntArray54[local982] + local822[8] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray62[local982] = local1090;
								this.anIntArray54[local982] = local1094;
								this.anIntArray55[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class261 local2520;
			@Pc(2525) Class249 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray10 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray10.length) {
							local46 = this.anIntArrayArray10[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local56]) != 0) {
									local366 = (this.aByteArray8[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray8[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass261Array1 != null) {
							for (local29 = 0; local29 < this.anInt545; local29++) {
								local2520 = this.aClass261Array1[local29];
								local2525 = this.aClass249Array1[local29];
								local2525.anInt3799 = local2525.anInt3799 & 0xFFFFFF | 255 - (this.aByteArray8[local2520.anInt4201] & 0xFF) << 24;
							}
						}
						this.method5267();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class249 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local247 = this.anIntArrayArray9[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass249Array1[local247[local249]];
									local2764.anInt3800 += arg2;
									local2764.anInt3801 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local247 = this.anIntArrayArray9[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass249Array1[local247[local249]];
									local2764.anInt3798 = local2764.anInt3798 * arg2 >> 7;
									local2764.anInt3797 = local2764.anInt3797 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray9 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray9.length) {
							local247 = this.anIntArrayArray9[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2764 = this.aClass249Array1[local247[local249]];
								local2764.anInt3802 = local2764.anInt3802 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray10 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray10.length) {
						local46 = this.anIntArrayArray10[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local56]) != 0) {
								local366 = this.aShortArray16[local56] & 0xFFFF;
								local391 = local366 >> 10 & 0x3F;
								local416 = local366 >> 7 & 0x7;
								local455 = local366 & 0x7F;
								@Pc(2625) int local2625 = local391 + arg2 & 0x3F;
								local416 += arg3 / 4;
								if (local416 < 0) {
									local416 = 0;
								} else if (local416 > 7) {
									local416 = 7;
								}
								local455 += arg4;
								if (local455 < 0) {
									local455 = 0;
								} else if (local455 > 127) {
									local455 = 127;
								}
								this.aShortArray16[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass261Array1 != null) {
						for (local29 = 0; local29 < this.anInt545; local29++) {
							local2520 = this.aClass261Array1[local29];
							local2525 = this.aClass249Array1[local29];
							local2525.anInt3799 = local2525.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local2520.anInt4201] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5267();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local247 = this.anIntArrayArray8[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
							this.anIntArray62[local48] -= this.anInt528;
							this.anIntArray54[local48] -= this.anInt527;
							this.anIntArray55[local48] -= this.anInt546;
							this.anIntArray62[local48] = this.anIntArray62[local48] * arg2 >> 7;
							this.anIntArray54[local48] = this.anIntArray54[local48] * arg3 >> 7;
							this.anIntArray55[local48] = this.anIntArray55[local48] * arg4 >> 7;
							this.anIntArray62[local48] += this.anInt528;
							this.anIntArray54[local48] += this.anInt527;
							this.anIntArray55[local48] += this.anInt546;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local29 = arg7[10] << 4;
			local36 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local48 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (this.aBoolean129) {
				local366 = arg7[0] * this.anInt528 + arg7[3] * this.anInt527 + arg7[6] * this.anInt546 + 8192 >> 14;
				local391 = arg7[1] * this.anInt528 + arg7[4] * this.anInt527 + arg7[7] * this.anInt546 + 8192 >> 14;
				local416 = arg7[2] * this.anInt528 + arg7[5] * this.anInt527 + arg7[8] * this.anInt546 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt528 = local366;
				this.anInt527 = local391;
				this.anInt546 = local416;
				this.aBoolean129 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt528 + 8192 >> 14;
			local459 = local391 * -this.anInt527 + 8192 >> 14;
			local463 = local416 * -this.anInt546 + 8192 >> 14;
			local467 = local455 + this.anInt528;
			local475 = local459 + this.anInt527;
			local483 = local463 + this.anInt546;
			@Pc(1838) int[] local1838 = new int[] { local366 * arg7[0] + 8192 >> 14, local366 * arg7[3] + 8192 >> 14, local366 * arg7[6] + 8192 >> 14, local391 * arg7[1] + 8192 >> 14, local391 * arg7[4] + 8192 >> 14, local391 * arg7[7] + 8192 >> 14, local416 * arg7[2] + 8192 >> 14, local416 * arg7[5] + 8192 >> 14, local416 * arg7[8] + 8192 >> 14 };
			local642 = local366 * local249 + 8192 >> 14;
			local670 = local391 * local48 + 8192 >> 14;
			local675 = local416 * local56 + 8192 >> 14;
			@Pc(1974) int local1974 = local642 + local467;
			@Pc(1978) int local1978 = local670 + local475;
			@Pc(1982) int local1982 = local675 + local483;
			@Pc(1985) int[] local1985 = new int[9];
			@Pc(1992) int local1992;
			for (local685 = 0; local685 < 3; local685++) {
				for (local1992 = 0; local1992 < 3; local1992++) {
					local690 = 0;
					for (local695 = 0; local695 < 3; local695++) {
						local690 += arg7[local685 * 3 + local695] * local1838[local1992 + local695 * 3];
					}
					local1985[local685 * 3 + local1992] = local690 + 8192 >> 14;
				}
			}
			local685 = arg7[0] * local1974 + arg7[1] * local1978 + arg7[2] * local1982 + 8192 >> 14;
			local1992 = arg7[3] * local1974 + arg7[4] * local1978 + arg7[5] * local1982 + 8192 >> 14;
			local690 = arg7[6] * local1974 + arg7[7] * local1978 + arg7[8] * local1982 + 8192 >> 14;
			local685 += local18;
			local1992 += local29;
			local690 += local36;
			for (local695 = 0; local695 < local2; local695++) {
				local700 = arg1[local695];
				if (local700 < this.anIntArrayArray8.length) {
					local822 = this.anIntArrayArray8[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray62[local829] + local1985[1] * this.anIntArray54[local829] + local1985[2] * this.anIntArray55[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray62[local829] + local1985[4] * this.anIntArray54[local829] + local1985[5] * this.anIntArray55[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray62[local829] + local1985[7] * this.anIntArray54[local829] + local1985[8] * this.anIntArray55[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray62[local829] = local2253;
							this.anIntArray54[local829] = local2257;
							this.anIntArray55[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "cw", descriptor = "(I[IIIIZI[I)V", line = 1627)
	@Override
	void method5421(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			this.anInt528 = 0;
			this.anInt527 = 0;
			this.anInt546 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray8.length) {
					local46 = this.anIntArrayArray8[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local56]) != 0) {
							this.anInt528 += this.anIntArray62[local56];
							this.anInt527 += this.anIntArray54[local56];
							this.anInt546 += this.anIntArray55[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt528 = this.anInt528 / local18 + arg2;
				this.anInt527 = this.anInt527 / local18 + arg3;
				this.anInt546 = this.anInt546 / local18 + arg4;
				this.aBoolean129 = true;
			} else {
				this.anInt528 = arg2;
				this.anInt527 = arg3;
				this.anInt546 = arg4;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local29 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local36 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local29;
				arg4 = local36;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local247 = this.anIntArrayArray8[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
							this.anIntArray62[local48] += arg2;
							this.anIntArray54[local48] += arg3;
							this.anIntArray55[local48] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(391) int local391;
		@Pc(416) int local416;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(642) int local642;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(685) int local685;
		@Pc(690) int local690;
		@Pc(695) int local695;
		@Pc(700) int local700;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(829) int local829;
		@Pc(834) int local834;
		@Pc(836) int local836;
		@Pc(962) int local962;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray8.length) {
						local247 = this.anIntArrayArray8[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
								this.anIntArray62[local48] -= this.anInt528;
								this.anIntArray54[local48] -= this.anInt527;
								this.anIntArray55[local48] -= this.anInt546;
								if (arg4 != 0) {
									local56 = Class317.anIntArray419[arg4];
									local366 = Class317.anIntArray420[arg4];
									local391 = this.anIntArray54[local48] * local56 + this.anIntArray62[local48] * local366 + 16383 >> 14;
									this.anIntArray54[local48] = this.anIntArray54[local48] * local366 - this.anIntArray62[local48] * local56 + 16383 >> 14;
									this.anIntArray62[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class317.anIntArray419[arg2];
									local366 = Class317.anIntArray420[arg2];
									local391 = this.anIntArray54[local48] * local366 - this.anIntArray55[local48] * local56 + 16383 >> 14;
									this.anIntArray55[local48] = this.anIntArray54[local48] * local56 + this.anIntArray55[local48] * local366 + 16383 >> 14;
									this.anIntArray54[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class317.anIntArray419[arg3];
									local366 = Class317.anIntArray420[arg3];
									local391 = this.anIntArray55[local48] * local56 + this.anIntArray62[local48] * local366 + 16383 >> 14;
									this.anIntArray55[local48] = this.anIntArray55[local48] * local366 - this.anIntArray62[local48] * local56 + 16383 >> 14;
									this.anIntArray62[local48] = local391;
								}
								this.anIntArray62[local48] += this.anInt528;
								this.anIntArray54[local48] += this.anInt527;
								this.anIntArray55[local48] += this.anInt546;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray8.length) {
							local247 = this.anIntArrayArray8[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
									local56 = this.anIntArray56[local48];
									local366 = this.anIntArray56[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray23[local391] != 0; local391++) {
										local416 = (this.aShortArray23[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class317.anIntArray419[arg4];
											local459 = Class317.anIntArray420[arg4];
											local463 = this.aShortArray15[local416] * local455 + this.aShortArray14[local416] * local459 + 16383 >> 14;
											this.aShortArray15[local416] = (short) (this.aShortArray15[local416] * local459 - this.aShortArray14[local416] * local455 + 16383 >> 14);
											this.aShortArray14[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class317.anIntArray419[arg2];
											local459 = Class317.anIntArray420[arg2];
											local463 = this.aShortArray15[local416] * local459 - this.aShortArray17[local416] * local455 + 16383 >> 14;
											this.aShortArray17[local416] = (short) (this.aShortArray15[local416] * local455 + this.aShortArray17[local416] * local459 + 16383 >> 14);
											this.aShortArray15[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class317.anIntArray419[arg3];
											local459 = Class317.anIntArray420[arg3];
											local463 = this.aShortArray17[local416] * local455 + this.aShortArray14[local416] * local459 + 16383 >> 14;
											this.aShortArray17[local416] = (short) (this.aShortArray17[local416] * local459 - this.aShortArray14[local416] * local455 + 16383 >> 14);
											this.aShortArray14[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method5268();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean129) {
					local366 = arg7[0] * this.anInt528 + arg7[3] * this.anInt527 + arg7[6] * this.anInt546 + 8192 >> 14;
					local391 = arg7[1] * this.anInt528 + arg7[4] * this.anInt527 + arg7[7] * this.anInt546 + 8192 >> 14;
					local416 = arg7[2] * this.anInt528 + arg7[5] * this.anInt527 + arg7[8] * this.anInt546 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt528 = local366;
					this.anInt527 = local391;
					this.anInt546 = local416;
					this.aBoolean129 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class317.anIntArray420[arg2];
				local416 = Class317.anIntArray419[arg2];
				local455 = Class317.anIntArray420[arg3];
				local459 = Class317.anIntArray419[arg3];
				local463 = Class317.anIntArray420[arg4];
				local467 = Class317.anIntArray419[arg4];
				local475 = local416 * local463 + 8192 >> 14;
				local483 = local416 * local467 + 8192 >> 14;
				local443[0] = local455 * local463 + local459 * local483 + 8192 >> 14;
				local443[1] = -local455 * local467 + local459 * local475 + 8192 >> 14;
				local443[2] = local459 * local391 + 8192 >> 14;
				local443[3] = local391 * local467 + 8192 >> 14;
				local443[4] = local391 * local463 + 8192 >> 14;
				local443[5] = -local416;
				local443[6] = -local459 * local463 + local455 * local483 + 8192 >> 14;
				local443[7] = local459 * local467 + local455 * local475 + 8192 >> 14;
				local443[8] = local455 * local391 + 8192 >> 14;
				@Pc(614) int local614 = local443[0] * -this.anInt528 + local443[1] * -this.anInt527 + local443[2] * -this.anInt546 + 8192 >> 14;
				local642 = local443[3] * -this.anInt528 + local443[4] * -this.anInt527 + local443[5] * -this.anInt546 + 8192 >> 14;
				local670 = local443[6] * -this.anInt528 + local443[7] * -this.anInt527 + local443[8] * -this.anInt546 + 8192 >> 14;
				local675 = local614 + this.anInt528;
				@Pc(680) int local680 = local642 + this.anInt527;
				local685 = local670 + this.anInt546;
				@Pc(688) int[] local688 = new int[9];
				for (local690 = 0; local690 < 3; local690++) {
					for (local695 = 0; local695 < 3; local695++) {
						local700 = 0;
						for (@Pc(702) int local702 = 0; local702 < 3; local702++) {
							local700 += local443[local690 * 3 + local702] * arg7[local695 * 3 + local702];
						}
						local688[local690 * 3 + local695] = local700 + 8192 >> 14;
					}
				}
				local690 = local443[0] * local249 + local443[1] * local48 + local443[2] * local56 + 8192 >> 14;
				local695 = local443[3] * local249 + local443[4] * local48 + local443[5] * local56 + 8192 >> 14;
				local700 = local443[6] * local249 + local443[7] * local48 + local443[8] * local56 + 8192 >> 14;
				local690 += local675;
				local695 += local680;
				local700 += local685;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local829 = 0; local829 < 3; local829++) {
						local834 = 0;
						for (local836 = 0; local836 < 3; local836++) {
							local834 += arg7[local824 * 3 + local836] * local688[local829 + local836 * 3];
						}
						local822[local824 * 3 + local829] = local834 + 8192 >> 14;
					}
				}
				local824 = arg7[0] * local690 + arg7[1] * local695 + arg7[2] * local700 + 8192 >> 14;
				local829 = arg7[3] * local690 + arg7[4] * local695 + arg7[5] * local700 + 8192 >> 14;
				local834 = arg7[6] * local690 + arg7[7] * local695 + arg7[8] * local700 + 8192 >> 14;
				local824 += local18;
				local829 += local29;
				local834 += local36;
				for (local836 = 0; local836 < local2; local836++) {
					local962 = arg1[local836];
					if (local962 < this.anIntArrayArray8.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray8[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray62[local982] + local822[1] * this.anIntArray54[local982] + local822[2] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray62[local982] + local822[4] * this.anIntArray54[local982] + local822[5] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray62[local982] + local822[7] * this.anIntArray54[local982] + local822[8] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray62[local982] = local1090;
								this.anIntArray54[local982] = local1094;
								this.anIntArray55[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class261 local2520;
			@Pc(2525) Class249 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray10 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray10.length) {
							local46 = this.anIntArrayArray10[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local56]) != 0) {
									local366 = (this.aByteArray8[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray8[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass261Array1 != null) {
							for (local29 = 0; local29 < this.anInt545; local29++) {
								local2520 = this.aClass261Array1[local29];
								local2525 = this.aClass249Array1[local29];
								local2525.anInt3799 = local2525.anInt3799 & 0xFFFFFF | 255 - (this.aByteArray8[local2520.anInt4201] & 0xFF) << 24;
							}
						}
						this.method5267();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class249 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local247 = this.anIntArrayArray9[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass249Array1[local247[local249]];
									local2764.anInt3800 += arg2;
									local2764.anInt3801 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local247 = this.anIntArrayArray9[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass249Array1[local247[local249]];
									local2764.anInt3798 = local2764.anInt3798 * arg2 >> 7;
									local2764.anInt3797 = local2764.anInt3797 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray9 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray9.length) {
							local247 = this.anIntArrayArray9[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2764 = this.aClass249Array1[local247[local249]];
								local2764.anInt3802 = local2764.anInt3802 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray10 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray10.length) {
						local46 = this.anIntArrayArray10[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local56]) != 0) {
								local366 = this.aShortArray16[local56] & 0xFFFF;
								local391 = local366 >> 10 & 0x3F;
								local416 = local366 >> 7 & 0x7;
								local455 = local366 & 0x7F;
								@Pc(2625) int local2625 = local391 + arg2 & 0x3F;
								local416 += arg3 / 4;
								if (local416 < 0) {
									local416 = 0;
								} else if (local416 > 7) {
									local416 = 7;
								}
								local455 += arg4;
								if (local455 < 0) {
									local455 = 0;
								} else if (local455 > 127) {
									local455 = 127;
								}
								this.aShortArray16[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass261Array1 != null) {
						for (local29 = 0; local29 < this.anInt545; local29++) {
							local2520 = this.aClass261Array1[local29];
							local2525 = this.aClass249Array1[local29];
							local2525.anInt3799 = local2525.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local2520.anInt4201] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5267();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local247 = this.anIntArrayArray8[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
							this.anIntArray62[local48] -= this.anInt528;
							this.anIntArray54[local48] -= this.anInt527;
							this.anIntArray55[local48] -= this.anInt546;
							this.anIntArray62[local48] = this.anIntArray62[local48] * arg2 >> 7;
							this.anIntArray54[local48] = this.anIntArray54[local48] * arg3 >> 7;
							this.anIntArray55[local48] = this.anIntArray55[local48] * arg4 >> 7;
							this.anIntArray62[local48] += this.anInt528;
							this.anIntArray54[local48] += this.anInt527;
							this.anIntArray55[local48] += this.anInt546;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local29 = arg7[10] << 4;
			local36 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local48 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (this.aBoolean129) {
				local366 = arg7[0] * this.anInt528 + arg7[3] * this.anInt527 + arg7[6] * this.anInt546 + 8192 >> 14;
				local391 = arg7[1] * this.anInt528 + arg7[4] * this.anInt527 + arg7[7] * this.anInt546 + 8192 >> 14;
				local416 = arg7[2] * this.anInt528 + arg7[5] * this.anInt527 + arg7[8] * this.anInt546 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt528 = local366;
				this.anInt527 = local391;
				this.anInt546 = local416;
				this.aBoolean129 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt528 + 8192 >> 14;
			local459 = local391 * -this.anInt527 + 8192 >> 14;
			local463 = local416 * -this.anInt546 + 8192 >> 14;
			local467 = local455 + this.anInt528;
			local475 = local459 + this.anInt527;
			local483 = local463 + this.anInt546;
			@Pc(1838) int[] local1838 = new int[] { local366 * arg7[0] + 8192 >> 14, local366 * arg7[3] + 8192 >> 14, local366 * arg7[6] + 8192 >> 14, local391 * arg7[1] + 8192 >> 14, local391 * arg7[4] + 8192 >> 14, local391 * arg7[7] + 8192 >> 14, local416 * arg7[2] + 8192 >> 14, local416 * arg7[5] + 8192 >> 14, local416 * arg7[8] + 8192 >> 14 };
			local642 = local366 * local249 + 8192 >> 14;
			local670 = local391 * local48 + 8192 >> 14;
			local675 = local416 * local56 + 8192 >> 14;
			@Pc(1974) int local1974 = local642 + local467;
			@Pc(1978) int local1978 = local670 + local475;
			@Pc(1982) int local1982 = local675 + local483;
			@Pc(1985) int[] local1985 = new int[9];
			@Pc(1992) int local1992;
			for (local685 = 0; local685 < 3; local685++) {
				for (local1992 = 0; local1992 < 3; local1992++) {
					local690 = 0;
					for (local695 = 0; local695 < 3; local695++) {
						local690 += arg7[local685 * 3 + local695] * local1838[local1992 + local695 * 3];
					}
					local1985[local685 * 3 + local1992] = local690 + 8192 >> 14;
				}
			}
			local685 = arg7[0] * local1974 + arg7[1] * local1978 + arg7[2] * local1982 + 8192 >> 14;
			local1992 = arg7[3] * local1974 + arg7[4] * local1978 + arg7[5] * local1982 + 8192 >> 14;
			local690 = arg7[6] * local1974 + arg7[7] * local1978 + arg7[8] * local1982 + 8192 >> 14;
			local685 += local18;
			local1992 += local29;
			local690 += local36;
			for (local695 = 0; local695 < local2; local695++) {
				local700 = arg1[local695];
				if (local700 < this.anIntArrayArray8.length) {
					local822 = this.anIntArrayArray8[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray62[local829] + local1985[1] * this.anIntArray54[local829] + local1985[2] * this.anIntArray55[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray62[local829] + local1985[4] * this.anIntArray54[local829] + local1985[5] * this.anIntArray55[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray62[local829] + local1985[7] * this.anIntArray54[local829] + local1985[8] * this.anIntArray55[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray62[local829] = local2253;
							this.anIntArray54[local829] = local2257;
							this.anIntArray55[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "cf", descriptor = "(I[IIIIZI[I)V", line = 1627)
	@Override
	void method5422(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			this.anInt528 = 0;
			this.anInt527 = 0;
			this.anInt546 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray8.length) {
					local46 = this.anIntArrayArray8[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local56]) != 0) {
							this.anInt528 += this.anIntArray62[local56];
							this.anInt527 += this.anIntArray54[local56];
							this.anInt546 += this.anIntArray55[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt528 = this.anInt528 / local18 + arg2;
				this.anInt527 = this.anInt527 / local18 + arg3;
				this.anInt546 = this.anInt546 / local18 + arg4;
				this.aBoolean129 = true;
			} else {
				this.anInt528 = arg2;
				this.anInt527 = arg3;
				this.anInt546 = arg4;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local29 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local36 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local29;
				arg4 = local36;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local247 = this.anIntArrayArray8[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
							this.anIntArray62[local48] += arg2;
							this.anIntArray54[local48] += arg3;
							this.anIntArray55[local48] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(391) int local391;
		@Pc(416) int local416;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(642) int local642;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(685) int local685;
		@Pc(690) int local690;
		@Pc(695) int local695;
		@Pc(700) int local700;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(829) int local829;
		@Pc(834) int local834;
		@Pc(836) int local836;
		@Pc(962) int local962;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray8.length) {
						local247 = this.anIntArrayArray8[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
								this.anIntArray62[local48] -= this.anInt528;
								this.anIntArray54[local48] -= this.anInt527;
								this.anIntArray55[local48] -= this.anInt546;
								if (arg4 != 0) {
									local56 = Class317.anIntArray419[arg4];
									local366 = Class317.anIntArray420[arg4];
									local391 = this.anIntArray54[local48] * local56 + this.anIntArray62[local48] * local366 + 16383 >> 14;
									this.anIntArray54[local48] = this.anIntArray54[local48] * local366 - this.anIntArray62[local48] * local56 + 16383 >> 14;
									this.anIntArray62[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class317.anIntArray419[arg2];
									local366 = Class317.anIntArray420[arg2];
									local391 = this.anIntArray54[local48] * local366 - this.anIntArray55[local48] * local56 + 16383 >> 14;
									this.anIntArray55[local48] = this.anIntArray54[local48] * local56 + this.anIntArray55[local48] * local366 + 16383 >> 14;
									this.anIntArray54[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class317.anIntArray419[arg3];
									local366 = Class317.anIntArray420[arg3];
									local391 = this.anIntArray55[local48] * local56 + this.anIntArray62[local48] * local366 + 16383 >> 14;
									this.anIntArray55[local48] = this.anIntArray55[local48] * local366 - this.anIntArray62[local48] * local56 + 16383 >> 14;
									this.anIntArray62[local48] = local391;
								}
								this.anIntArray62[local48] += this.anInt528;
								this.anIntArray54[local48] += this.anInt527;
								this.anIntArray55[local48] += this.anInt546;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray8.length) {
							local247 = this.anIntArrayArray8[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
									local56 = this.anIntArray56[local48];
									local366 = this.anIntArray56[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray23[local391] != 0; local391++) {
										local416 = (this.aShortArray23[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class317.anIntArray419[arg4];
											local459 = Class317.anIntArray420[arg4];
											local463 = this.aShortArray15[local416] * local455 + this.aShortArray14[local416] * local459 + 16383 >> 14;
											this.aShortArray15[local416] = (short) (this.aShortArray15[local416] * local459 - this.aShortArray14[local416] * local455 + 16383 >> 14);
											this.aShortArray14[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class317.anIntArray419[arg2];
											local459 = Class317.anIntArray420[arg2];
											local463 = this.aShortArray15[local416] * local459 - this.aShortArray17[local416] * local455 + 16383 >> 14;
											this.aShortArray17[local416] = (short) (this.aShortArray15[local416] * local455 + this.aShortArray17[local416] * local459 + 16383 >> 14);
											this.aShortArray15[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class317.anIntArray419[arg3];
											local459 = Class317.anIntArray420[arg3];
											local463 = this.aShortArray17[local416] * local455 + this.aShortArray14[local416] * local459 + 16383 >> 14;
											this.aShortArray17[local416] = (short) (this.aShortArray17[local416] * local459 - this.aShortArray14[local416] * local455 + 16383 >> 14);
											this.aShortArray14[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method5268();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean129) {
					local366 = arg7[0] * this.anInt528 + arg7[3] * this.anInt527 + arg7[6] * this.anInt546 + 8192 >> 14;
					local391 = arg7[1] * this.anInt528 + arg7[4] * this.anInt527 + arg7[7] * this.anInt546 + 8192 >> 14;
					local416 = arg7[2] * this.anInt528 + arg7[5] * this.anInt527 + arg7[8] * this.anInt546 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt528 = local366;
					this.anInt527 = local391;
					this.anInt546 = local416;
					this.aBoolean129 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class317.anIntArray420[arg2];
				local416 = Class317.anIntArray419[arg2];
				local455 = Class317.anIntArray420[arg3];
				local459 = Class317.anIntArray419[arg3];
				local463 = Class317.anIntArray420[arg4];
				local467 = Class317.anIntArray419[arg4];
				local475 = local416 * local463 + 8192 >> 14;
				local483 = local416 * local467 + 8192 >> 14;
				local443[0] = local455 * local463 + local459 * local483 + 8192 >> 14;
				local443[1] = -local455 * local467 + local459 * local475 + 8192 >> 14;
				local443[2] = local459 * local391 + 8192 >> 14;
				local443[3] = local391 * local467 + 8192 >> 14;
				local443[4] = local391 * local463 + 8192 >> 14;
				local443[5] = -local416;
				local443[6] = -local459 * local463 + local455 * local483 + 8192 >> 14;
				local443[7] = local459 * local467 + local455 * local475 + 8192 >> 14;
				local443[8] = local455 * local391 + 8192 >> 14;
				@Pc(614) int local614 = local443[0] * -this.anInt528 + local443[1] * -this.anInt527 + local443[2] * -this.anInt546 + 8192 >> 14;
				local642 = local443[3] * -this.anInt528 + local443[4] * -this.anInt527 + local443[5] * -this.anInt546 + 8192 >> 14;
				local670 = local443[6] * -this.anInt528 + local443[7] * -this.anInt527 + local443[8] * -this.anInt546 + 8192 >> 14;
				local675 = local614 + this.anInt528;
				@Pc(680) int local680 = local642 + this.anInt527;
				local685 = local670 + this.anInt546;
				@Pc(688) int[] local688 = new int[9];
				for (local690 = 0; local690 < 3; local690++) {
					for (local695 = 0; local695 < 3; local695++) {
						local700 = 0;
						for (@Pc(702) int local702 = 0; local702 < 3; local702++) {
							local700 += local443[local690 * 3 + local702] * arg7[local695 * 3 + local702];
						}
						local688[local690 * 3 + local695] = local700 + 8192 >> 14;
					}
				}
				local690 = local443[0] * local249 + local443[1] * local48 + local443[2] * local56 + 8192 >> 14;
				local695 = local443[3] * local249 + local443[4] * local48 + local443[5] * local56 + 8192 >> 14;
				local700 = local443[6] * local249 + local443[7] * local48 + local443[8] * local56 + 8192 >> 14;
				local690 += local675;
				local695 += local680;
				local700 += local685;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local829 = 0; local829 < 3; local829++) {
						local834 = 0;
						for (local836 = 0; local836 < 3; local836++) {
							local834 += arg7[local824 * 3 + local836] * local688[local829 + local836 * 3];
						}
						local822[local824 * 3 + local829] = local834 + 8192 >> 14;
					}
				}
				local824 = arg7[0] * local690 + arg7[1] * local695 + arg7[2] * local700 + 8192 >> 14;
				local829 = arg7[3] * local690 + arg7[4] * local695 + arg7[5] * local700 + 8192 >> 14;
				local834 = arg7[6] * local690 + arg7[7] * local695 + arg7[8] * local700 + 8192 >> 14;
				local824 += local18;
				local829 += local29;
				local834 += local36;
				for (local836 = 0; local836 < local2; local836++) {
					local962 = arg1[local836];
					if (local962 < this.anIntArrayArray8.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray8[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray62[local982] + local822[1] * this.anIntArray54[local982] + local822[2] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray62[local982] + local822[4] * this.anIntArray54[local982] + local822[5] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray62[local982] + local822[7] * this.anIntArray54[local982] + local822[8] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray62[local982] = local1090;
								this.anIntArray54[local982] = local1094;
								this.anIntArray55[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class261 local2520;
			@Pc(2525) Class249 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray10 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray10.length) {
							local46 = this.anIntArrayArray10[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local56]) != 0) {
									local366 = (this.aByteArray8[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray8[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass261Array1 != null) {
							for (local29 = 0; local29 < this.anInt545; local29++) {
								local2520 = this.aClass261Array1[local29];
								local2525 = this.aClass249Array1[local29];
								local2525.anInt3799 = local2525.anInt3799 & 0xFFFFFF | 255 - (this.aByteArray8[local2520.anInt4201] & 0xFF) << 24;
							}
						}
						this.method5267();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class249 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local247 = this.anIntArrayArray9[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass249Array1[local247[local249]];
									local2764.anInt3800 += arg2;
									local2764.anInt3801 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local247 = this.anIntArrayArray9[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass249Array1[local247[local249]];
									local2764.anInt3798 = local2764.anInt3798 * arg2 >> 7;
									local2764.anInt3797 = local2764.anInt3797 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray9 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray9.length) {
							local247 = this.anIntArrayArray9[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2764 = this.aClass249Array1[local247[local249]];
								local2764.anInt3802 = local2764.anInt3802 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray10 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray10.length) {
						local46 = this.anIntArrayArray10[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local56]) != 0) {
								local366 = this.aShortArray16[local56] & 0xFFFF;
								local391 = local366 >> 10 & 0x3F;
								local416 = local366 >> 7 & 0x7;
								local455 = local366 & 0x7F;
								@Pc(2625) int local2625 = local391 + arg2 & 0x3F;
								local416 += arg3 / 4;
								if (local416 < 0) {
									local416 = 0;
								} else if (local416 > 7) {
									local416 = 7;
								}
								local455 += arg4;
								if (local455 < 0) {
									local455 = 0;
								} else if (local455 > 127) {
									local455 = 127;
								}
								this.aShortArray16[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass261Array1 != null) {
						for (local29 = 0; local29 < this.anInt545; local29++) {
							local2520 = this.aClass261Array1[local29];
							local2525 = this.aClass249Array1[local29];
							local2525.anInt3799 = local2525.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local2520.anInt4201] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5267();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local247 = this.anIntArrayArray8[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
							this.anIntArray62[local48] -= this.anInt528;
							this.anIntArray54[local48] -= this.anInt527;
							this.anIntArray55[local48] -= this.anInt546;
							this.anIntArray62[local48] = this.anIntArray62[local48] * arg2 >> 7;
							this.anIntArray54[local48] = this.anIntArray54[local48] * arg3 >> 7;
							this.anIntArray55[local48] = this.anIntArray55[local48] * arg4 >> 7;
							this.anIntArray62[local48] += this.anInt528;
							this.anIntArray54[local48] += this.anInt527;
							this.anIntArray55[local48] += this.anInt546;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local29 = arg7[10] << 4;
			local36 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local48 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (this.aBoolean129) {
				local366 = arg7[0] * this.anInt528 + arg7[3] * this.anInt527 + arg7[6] * this.anInt546 + 8192 >> 14;
				local391 = arg7[1] * this.anInt528 + arg7[4] * this.anInt527 + arg7[7] * this.anInt546 + 8192 >> 14;
				local416 = arg7[2] * this.anInt528 + arg7[5] * this.anInt527 + arg7[8] * this.anInt546 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt528 = local366;
				this.anInt527 = local391;
				this.anInt546 = local416;
				this.aBoolean129 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt528 + 8192 >> 14;
			local459 = local391 * -this.anInt527 + 8192 >> 14;
			local463 = local416 * -this.anInt546 + 8192 >> 14;
			local467 = local455 + this.anInt528;
			local475 = local459 + this.anInt527;
			local483 = local463 + this.anInt546;
			@Pc(1838) int[] local1838 = new int[] { local366 * arg7[0] + 8192 >> 14, local366 * arg7[3] + 8192 >> 14, local366 * arg7[6] + 8192 >> 14, local391 * arg7[1] + 8192 >> 14, local391 * arg7[4] + 8192 >> 14, local391 * arg7[7] + 8192 >> 14, local416 * arg7[2] + 8192 >> 14, local416 * arg7[5] + 8192 >> 14, local416 * arg7[8] + 8192 >> 14 };
			local642 = local366 * local249 + 8192 >> 14;
			local670 = local391 * local48 + 8192 >> 14;
			local675 = local416 * local56 + 8192 >> 14;
			@Pc(1974) int local1974 = local642 + local467;
			@Pc(1978) int local1978 = local670 + local475;
			@Pc(1982) int local1982 = local675 + local483;
			@Pc(1985) int[] local1985 = new int[9];
			@Pc(1992) int local1992;
			for (local685 = 0; local685 < 3; local685++) {
				for (local1992 = 0; local1992 < 3; local1992++) {
					local690 = 0;
					for (local695 = 0; local695 < 3; local695++) {
						local690 += arg7[local685 * 3 + local695] * local1838[local1992 + local695 * 3];
					}
					local1985[local685 * 3 + local1992] = local690 + 8192 >> 14;
				}
			}
			local685 = arg7[0] * local1974 + arg7[1] * local1978 + arg7[2] * local1982 + 8192 >> 14;
			local1992 = arg7[3] * local1974 + arg7[4] * local1978 + arg7[5] * local1982 + 8192 >> 14;
			local690 = arg7[6] * local1974 + arg7[7] * local1978 + arg7[8] * local1982 + 8192 >> 14;
			local685 += local18;
			local1992 += local29;
			local690 += local36;
			for (local695 = 0; local695 < local2; local695++) {
				local700 = arg1[local695];
				if (local700 < this.anIntArrayArray8.length) {
					local822 = this.anIntArrayArray8[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray62[local829] + local1985[1] * this.anIntArray54[local829] + local1985[2] * this.anIntArray55[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray62[local829] + local1985[4] * this.anIntArray54[local829] + local1985[5] * this.anIntArray55[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray62[local829] + local1985[7] * this.anIntArray54[local829] + local1985[8] * this.anIntArray55[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray62[local829] = local2253;
							this.anIntArray54[local829] = local2257;
							this.anIntArray55[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "dv", descriptor = "(I[IIIIZI[I)V", line = 1627)
	@Override
	void method5423(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			this.anInt528 = 0;
			this.anInt527 = 0;
			this.anInt546 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray8.length) {
					local46 = this.anIntArrayArray8[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local56]) != 0) {
							this.anInt528 += this.anIntArray62[local56];
							this.anInt527 += this.anIntArray54[local56];
							this.anInt546 += this.anIntArray55[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt528 = this.anInt528 / local18 + arg2;
				this.anInt527 = this.anInt527 / local18 + arg3;
				this.anInt546 = this.anInt546 / local18 + arg4;
				this.aBoolean129 = true;
			} else {
				this.anInt528 = arg2;
				this.anInt527 = arg3;
				this.anInt546 = arg4;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local29 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local36 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local29;
				arg4 = local36;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local247 = this.anIntArrayArray8[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
							this.anIntArray62[local48] += arg2;
							this.anIntArray54[local48] += arg3;
							this.anIntArray55[local48] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(391) int local391;
		@Pc(416) int local416;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(642) int local642;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(685) int local685;
		@Pc(690) int local690;
		@Pc(695) int local695;
		@Pc(700) int local700;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(829) int local829;
		@Pc(834) int local834;
		@Pc(836) int local836;
		@Pc(962) int local962;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray8.length) {
						local247 = this.anIntArrayArray8[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
								this.anIntArray62[local48] -= this.anInt528;
								this.anIntArray54[local48] -= this.anInt527;
								this.anIntArray55[local48] -= this.anInt546;
								if (arg4 != 0) {
									local56 = Class317.anIntArray419[arg4];
									local366 = Class317.anIntArray420[arg4];
									local391 = this.anIntArray54[local48] * local56 + this.anIntArray62[local48] * local366 + 16383 >> 14;
									this.anIntArray54[local48] = this.anIntArray54[local48] * local366 - this.anIntArray62[local48] * local56 + 16383 >> 14;
									this.anIntArray62[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class317.anIntArray419[arg2];
									local366 = Class317.anIntArray420[arg2];
									local391 = this.anIntArray54[local48] * local366 - this.anIntArray55[local48] * local56 + 16383 >> 14;
									this.anIntArray55[local48] = this.anIntArray54[local48] * local56 + this.anIntArray55[local48] * local366 + 16383 >> 14;
									this.anIntArray54[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class317.anIntArray419[arg3];
									local366 = Class317.anIntArray420[arg3];
									local391 = this.anIntArray55[local48] * local56 + this.anIntArray62[local48] * local366 + 16383 >> 14;
									this.anIntArray55[local48] = this.anIntArray55[local48] * local366 - this.anIntArray62[local48] * local56 + 16383 >> 14;
									this.anIntArray62[local48] = local391;
								}
								this.anIntArray62[local48] += this.anInt528;
								this.anIntArray54[local48] += this.anInt527;
								this.anIntArray55[local48] += this.anInt546;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray8.length) {
							local247 = this.anIntArrayArray8[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
									local56 = this.anIntArray56[local48];
									local366 = this.anIntArray56[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray23[local391] != 0; local391++) {
										local416 = (this.aShortArray23[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class317.anIntArray419[arg4];
											local459 = Class317.anIntArray420[arg4];
											local463 = this.aShortArray15[local416] * local455 + this.aShortArray14[local416] * local459 + 16383 >> 14;
											this.aShortArray15[local416] = (short) (this.aShortArray15[local416] * local459 - this.aShortArray14[local416] * local455 + 16383 >> 14);
											this.aShortArray14[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class317.anIntArray419[arg2];
											local459 = Class317.anIntArray420[arg2];
											local463 = this.aShortArray15[local416] * local459 - this.aShortArray17[local416] * local455 + 16383 >> 14;
											this.aShortArray17[local416] = (short) (this.aShortArray15[local416] * local455 + this.aShortArray17[local416] * local459 + 16383 >> 14);
											this.aShortArray15[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class317.anIntArray419[arg3];
											local459 = Class317.anIntArray420[arg3];
											local463 = this.aShortArray17[local416] * local455 + this.aShortArray14[local416] * local459 + 16383 >> 14;
											this.aShortArray17[local416] = (short) (this.aShortArray17[local416] * local459 - this.aShortArray14[local416] * local455 + 16383 >> 14);
											this.aShortArray14[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method5268();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean129) {
					local366 = arg7[0] * this.anInt528 + arg7[3] * this.anInt527 + arg7[6] * this.anInt546 + 8192 >> 14;
					local391 = arg7[1] * this.anInt528 + arg7[4] * this.anInt527 + arg7[7] * this.anInt546 + 8192 >> 14;
					local416 = arg7[2] * this.anInt528 + arg7[5] * this.anInt527 + arg7[8] * this.anInt546 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt528 = local366;
					this.anInt527 = local391;
					this.anInt546 = local416;
					this.aBoolean129 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class317.anIntArray420[arg2];
				local416 = Class317.anIntArray419[arg2];
				local455 = Class317.anIntArray420[arg3];
				local459 = Class317.anIntArray419[arg3];
				local463 = Class317.anIntArray420[arg4];
				local467 = Class317.anIntArray419[arg4];
				local475 = local416 * local463 + 8192 >> 14;
				local483 = local416 * local467 + 8192 >> 14;
				local443[0] = local455 * local463 + local459 * local483 + 8192 >> 14;
				local443[1] = -local455 * local467 + local459 * local475 + 8192 >> 14;
				local443[2] = local459 * local391 + 8192 >> 14;
				local443[3] = local391 * local467 + 8192 >> 14;
				local443[4] = local391 * local463 + 8192 >> 14;
				local443[5] = -local416;
				local443[6] = -local459 * local463 + local455 * local483 + 8192 >> 14;
				local443[7] = local459 * local467 + local455 * local475 + 8192 >> 14;
				local443[8] = local455 * local391 + 8192 >> 14;
				@Pc(614) int local614 = local443[0] * -this.anInt528 + local443[1] * -this.anInt527 + local443[2] * -this.anInt546 + 8192 >> 14;
				local642 = local443[3] * -this.anInt528 + local443[4] * -this.anInt527 + local443[5] * -this.anInt546 + 8192 >> 14;
				local670 = local443[6] * -this.anInt528 + local443[7] * -this.anInt527 + local443[8] * -this.anInt546 + 8192 >> 14;
				local675 = local614 + this.anInt528;
				@Pc(680) int local680 = local642 + this.anInt527;
				local685 = local670 + this.anInt546;
				@Pc(688) int[] local688 = new int[9];
				for (local690 = 0; local690 < 3; local690++) {
					for (local695 = 0; local695 < 3; local695++) {
						local700 = 0;
						for (@Pc(702) int local702 = 0; local702 < 3; local702++) {
							local700 += local443[local690 * 3 + local702] * arg7[local695 * 3 + local702];
						}
						local688[local690 * 3 + local695] = local700 + 8192 >> 14;
					}
				}
				local690 = local443[0] * local249 + local443[1] * local48 + local443[2] * local56 + 8192 >> 14;
				local695 = local443[3] * local249 + local443[4] * local48 + local443[5] * local56 + 8192 >> 14;
				local700 = local443[6] * local249 + local443[7] * local48 + local443[8] * local56 + 8192 >> 14;
				local690 += local675;
				local695 += local680;
				local700 += local685;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local829 = 0; local829 < 3; local829++) {
						local834 = 0;
						for (local836 = 0; local836 < 3; local836++) {
							local834 += arg7[local824 * 3 + local836] * local688[local829 + local836 * 3];
						}
						local822[local824 * 3 + local829] = local834 + 8192 >> 14;
					}
				}
				local824 = arg7[0] * local690 + arg7[1] * local695 + arg7[2] * local700 + 8192 >> 14;
				local829 = arg7[3] * local690 + arg7[4] * local695 + arg7[5] * local700 + 8192 >> 14;
				local834 = arg7[6] * local690 + arg7[7] * local695 + arg7[8] * local700 + 8192 >> 14;
				local824 += local18;
				local829 += local29;
				local834 += local36;
				for (local836 = 0; local836 < local2; local836++) {
					local962 = arg1[local836];
					if (local962 < this.anIntArrayArray8.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray8[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray62[local982] + local822[1] * this.anIntArray54[local982] + local822[2] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray62[local982] + local822[4] * this.anIntArray54[local982] + local822[5] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray62[local982] + local822[7] * this.anIntArray54[local982] + local822[8] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray62[local982] = local1090;
								this.anIntArray54[local982] = local1094;
								this.anIntArray55[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class261 local2520;
			@Pc(2525) Class249 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray10 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray10.length) {
							local46 = this.anIntArrayArray10[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local56]) != 0) {
									local366 = (this.aByteArray8[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray8[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass261Array1 != null) {
							for (local29 = 0; local29 < this.anInt545; local29++) {
								local2520 = this.aClass261Array1[local29];
								local2525 = this.aClass249Array1[local29];
								local2525.anInt3799 = local2525.anInt3799 & 0xFFFFFF | 255 - (this.aByteArray8[local2520.anInt4201] & 0xFF) << 24;
							}
						}
						this.method5267();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class249 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local247 = this.anIntArrayArray9[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass249Array1[local247[local249]];
									local2764.anInt3800 += arg2;
									local2764.anInt3801 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local247 = this.anIntArrayArray9[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass249Array1[local247[local249]];
									local2764.anInt3798 = local2764.anInt3798 * arg2 >> 7;
									local2764.anInt3797 = local2764.anInt3797 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray9 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray9.length) {
							local247 = this.anIntArrayArray9[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2764 = this.aClass249Array1[local247[local249]];
								local2764.anInt3802 = local2764.anInt3802 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray10 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray10.length) {
						local46 = this.anIntArrayArray10[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local56]) != 0) {
								local366 = this.aShortArray16[local56] & 0xFFFF;
								local391 = local366 >> 10 & 0x3F;
								local416 = local366 >> 7 & 0x7;
								local455 = local366 & 0x7F;
								@Pc(2625) int local2625 = local391 + arg2 & 0x3F;
								local416 += arg3 / 4;
								if (local416 < 0) {
									local416 = 0;
								} else if (local416 > 7) {
									local416 = 7;
								}
								local455 += arg4;
								if (local455 < 0) {
									local455 = 0;
								} else if (local455 > 127) {
									local455 = 127;
								}
								this.aShortArray16[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass261Array1 != null) {
						for (local29 = 0; local29 < this.anInt545; local29++) {
							local2520 = this.aClass261Array1[local29];
							local2525 = this.aClass249Array1[local29];
							local2525.anInt3799 = local2525.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local2520.anInt4201] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5267();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local247 = this.anIntArrayArray8[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
							this.anIntArray62[local48] -= this.anInt528;
							this.anIntArray54[local48] -= this.anInt527;
							this.anIntArray55[local48] -= this.anInt546;
							this.anIntArray62[local48] = this.anIntArray62[local48] * arg2 >> 7;
							this.anIntArray54[local48] = this.anIntArray54[local48] * arg3 >> 7;
							this.anIntArray55[local48] = this.anIntArray55[local48] * arg4 >> 7;
							this.anIntArray62[local48] += this.anInt528;
							this.anIntArray54[local48] += this.anInt527;
							this.anIntArray55[local48] += this.anInt546;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local29 = arg7[10] << 4;
			local36 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local48 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (this.aBoolean129) {
				local366 = arg7[0] * this.anInt528 + arg7[3] * this.anInt527 + arg7[6] * this.anInt546 + 8192 >> 14;
				local391 = arg7[1] * this.anInt528 + arg7[4] * this.anInt527 + arg7[7] * this.anInt546 + 8192 >> 14;
				local416 = arg7[2] * this.anInt528 + arg7[5] * this.anInt527 + arg7[8] * this.anInt546 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt528 = local366;
				this.anInt527 = local391;
				this.anInt546 = local416;
				this.aBoolean129 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt528 + 8192 >> 14;
			local459 = local391 * -this.anInt527 + 8192 >> 14;
			local463 = local416 * -this.anInt546 + 8192 >> 14;
			local467 = local455 + this.anInt528;
			local475 = local459 + this.anInt527;
			local483 = local463 + this.anInt546;
			@Pc(1838) int[] local1838 = new int[] { local366 * arg7[0] + 8192 >> 14, local366 * arg7[3] + 8192 >> 14, local366 * arg7[6] + 8192 >> 14, local391 * arg7[1] + 8192 >> 14, local391 * arg7[4] + 8192 >> 14, local391 * arg7[7] + 8192 >> 14, local416 * arg7[2] + 8192 >> 14, local416 * arg7[5] + 8192 >> 14, local416 * arg7[8] + 8192 >> 14 };
			local642 = local366 * local249 + 8192 >> 14;
			local670 = local391 * local48 + 8192 >> 14;
			local675 = local416 * local56 + 8192 >> 14;
			@Pc(1974) int local1974 = local642 + local467;
			@Pc(1978) int local1978 = local670 + local475;
			@Pc(1982) int local1982 = local675 + local483;
			@Pc(1985) int[] local1985 = new int[9];
			@Pc(1992) int local1992;
			for (local685 = 0; local685 < 3; local685++) {
				for (local1992 = 0; local1992 < 3; local1992++) {
					local690 = 0;
					for (local695 = 0; local695 < 3; local695++) {
						local690 += arg7[local685 * 3 + local695] * local1838[local1992 + local695 * 3];
					}
					local1985[local685 * 3 + local1992] = local690 + 8192 >> 14;
				}
			}
			local685 = arg7[0] * local1974 + arg7[1] * local1978 + arg7[2] * local1982 + 8192 >> 14;
			local1992 = arg7[3] * local1974 + arg7[4] * local1978 + arg7[5] * local1982 + 8192 >> 14;
			local690 = arg7[6] * local1974 + arg7[7] * local1978 + arg7[8] * local1982 + 8192 >> 14;
			local685 += local18;
			local1992 += local29;
			local690 += local36;
			for (local695 = 0; local695 < local2; local695++) {
				local700 = arg1[local695];
				if (local700 < this.anIntArrayArray8.length) {
					local822 = this.anIntArrayArray8[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray62[local829] + local1985[1] * this.anIntArray54[local829] + local1985[2] * this.anIntArray55[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray62[local829] + local1985[4] * this.anIntArray54[local829] + local1985[5] * this.anIntArray55[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray62[local829] + local1985[7] * this.anIntArray54[local829] + local1985[8] * this.anIntArray55[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray62[local829] = local2253;
							this.anIntArray54[local829] = local2257;
							this.anIntArray55[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "df", descriptor = "(I[IIIIZI[I)V", line = 1627)
	@Override
	void method5505(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local18 = 0;
			this.anInt528 = 0;
			this.anInt527 = 0;
			this.anInt546 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray8.length) {
					local46 = this.anIntArrayArray8[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local56]) != 0) {
							this.anInt528 += this.anIntArray62[local56];
							this.anInt527 += this.anIntArray54[local56];
							this.anInt546 += this.anIntArray55[local56];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				this.anInt528 = this.anInt528 / local18 + arg2;
				this.anInt527 = this.anInt527 / local18 + arg3;
				this.anInt546 = this.anInt546 / local18 + arg4;
				this.aBoolean129 = true;
			} else {
				this.anInt528 = arg2;
				this.anInt527 = arg3;
				this.anInt546 = arg4;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local18 = arg7[0] * arg2 + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local29 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local36 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local18;
				arg3 = local29;
				arg4 = local36;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local247 = this.anIntArrayArray8[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
							this.anIntArray62[local48] += arg2;
							this.anIntArray54[local48] += arg3;
							this.anIntArray55[local48] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(391) int local391;
		@Pc(416) int local416;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(642) int local642;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(685) int local685;
		@Pc(690) int local690;
		@Pc(695) int local695;
		@Pc(700) int local700;
		@Pc(822) int[] local822;
		@Pc(824) int local824;
		@Pc(829) int local829;
		@Pc(834) int local834;
		@Pc(836) int local836;
		@Pc(962) int local962;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray8.length) {
						local247 = this.anIntArrayArray8[local29];
						for (local249 = 0; local249 < local247.length; local249++) {
							local48 = local247[local249];
							if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
								this.anIntArray62[local48] -= this.anInt528;
								this.anIntArray54[local48] -= this.anInt527;
								this.anIntArray55[local48] -= this.anInt546;
								if (arg4 != 0) {
									local56 = Class317.anIntArray419[arg4];
									local366 = Class317.anIntArray420[arg4];
									local391 = this.anIntArray54[local48] * local56 + this.anIntArray62[local48] * local366 + 16383 >> 14;
									this.anIntArray54[local48] = this.anIntArray54[local48] * local366 - this.anIntArray62[local48] * local56 + 16383 >> 14;
									this.anIntArray62[local48] = local391;
								}
								if (arg2 != 0) {
									local56 = Class317.anIntArray419[arg2];
									local366 = Class317.anIntArray420[arg2];
									local391 = this.anIntArray54[local48] * local366 - this.anIntArray55[local48] * local56 + 16383 >> 14;
									this.anIntArray55[local48] = this.anIntArray54[local48] * local56 + this.anIntArray55[local48] * local366 + 16383 >> 14;
									this.anIntArray54[local48] = local391;
								}
								if (arg3 != 0) {
									local56 = Class317.anIntArray419[arg3];
									local366 = Class317.anIntArray420[arg3];
									local391 = this.anIntArray55[local48] * local56 + this.anIntArray62[local48] * local366 + 16383 >> 14;
									this.anIntArray55[local48] = this.anIntArray55[local48] * local366 - this.anIntArray62[local48] * local56 + 16383 >> 14;
									this.anIntArray62[local48] = local391;
								}
								this.anIntArray62[local48] += this.anInt528;
								this.anIntArray54[local48] += this.anInt527;
								this.anIntArray55[local48] += this.anInt546;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray8.length) {
							local247 = this.anIntArrayArray8[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local48 = local247[local249];
								if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
									local56 = this.anIntArray56[local48];
									local366 = this.anIntArray56[local48 + 1];
									for (local391 = local56; local391 < local366 && this.aShortArray23[local391] != 0; local391++) {
										local416 = (this.aShortArray23[local391] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local455 = Class317.anIntArray419[arg4];
											local459 = Class317.anIntArray420[arg4];
											local463 = this.aShortArray15[local416] * local455 + this.aShortArray14[local416] * local459 + 16383 >> 14;
											this.aShortArray15[local416] = (short) (this.aShortArray15[local416] * local459 - this.aShortArray14[local416] * local455 + 16383 >> 14);
											this.aShortArray14[local416] = (short) local463;
										}
										if (arg2 != 0) {
											local455 = Class317.anIntArray419[arg2];
											local459 = Class317.anIntArray420[arg2];
											local463 = this.aShortArray15[local416] * local459 - this.aShortArray17[local416] * local455 + 16383 >> 14;
											this.aShortArray17[local416] = (short) (this.aShortArray15[local416] * local455 + this.aShortArray17[local416] * local459 + 16383 >> 14);
											this.aShortArray15[local416] = (short) local463;
										}
										if (arg3 != 0) {
											local455 = Class317.anIntArray419[arg3];
											local459 = Class317.anIntArray420[arg3];
											local463 = this.aShortArray17[local416] * local455 + this.aShortArray14[local416] * local459 + 16383 >> 14;
											this.aShortArray17[local416] = (short) (this.aShortArray17[local416] * local459 - this.aShortArray14[local416] * local455 + 16383 >> 14);
											this.aShortArray14[local416] = (short) local463;
										}
									}
								}
							}
						}
					}
					this.method5268();
				}
			} else {
				local18 = arg7[9] << 4;
				local29 = arg7[10] << 4;
				local36 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local48 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (this.aBoolean129) {
					local366 = arg7[0] * this.anInt528 + arg7[3] * this.anInt527 + arg7[6] * this.anInt546 + 8192 >> 14;
					local391 = arg7[1] * this.anInt528 + arg7[4] * this.anInt527 + arg7[7] * this.anInt546 + 8192 >> 14;
					local416 = arg7[2] * this.anInt528 + arg7[5] * this.anInt527 + arg7[8] * this.anInt546 + 8192 >> 14;
					local366 += local249;
					local391 += local48;
					local416 += local56;
					this.anInt528 = local366;
					this.anInt527 = local391;
					this.anInt546 = local416;
					this.aBoolean129 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local391 = Class317.anIntArray420[arg2];
				local416 = Class317.anIntArray419[arg2];
				local455 = Class317.anIntArray420[arg3];
				local459 = Class317.anIntArray419[arg3];
				local463 = Class317.anIntArray420[arg4];
				local467 = Class317.anIntArray419[arg4];
				local475 = local416 * local463 + 8192 >> 14;
				local483 = local416 * local467 + 8192 >> 14;
				local443[0] = local455 * local463 + local459 * local483 + 8192 >> 14;
				local443[1] = -local455 * local467 + local459 * local475 + 8192 >> 14;
				local443[2] = local459 * local391 + 8192 >> 14;
				local443[3] = local391 * local467 + 8192 >> 14;
				local443[4] = local391 * local463 + 8192 >> 14;
				local443[5] = -local416;
				local443[6] = -local459 * local463 + local455 * local483 + 8192 >> 14;
				local443[7] = local459 * local467 + local455 * local475 + 8192 >> 14;
				local443[8] = local455 * local391 + 8192 >> 14;
				@Pc(614) int local614 = local443[0] * -this.anInt528 + local443[1] * -this.anInt527 + local443[2] * -this.anInt546 + 8192 >> 14;
				local642 = local443[3] * -this.anInt528 + local443[4] * -this.anInt527 + local443[5] * -this.anInt546 + 8192 >> 14;
				local670 = local443[6] * -this.anInt528 + local443[7] * -this.anInt527 + local443[8] * -this.anInt546 + 8192 >> 14;
				local675 = local614 + this.anInt528;
				@Pc(680) int local680 = local642 + this.anInt527;
				local685 = local670 + this.anInt546;
				@Pc(688) int[] local688 = new int[9];
				for (local690 = 0; local690 < 3; local690++) {
					for (local695 = 0; local695 < 3; local695++) {
						local700 = 0;
						for (@Pc(702) int local702 = 0; local702 < 3; local702++) {
							local700 += local443[local690 * 3 + local702] * arg7[local695 * 3 + local702];
						}
						local688[local690 * 3 + local695] = local700 + 8192 >> 14;
					}
				}
				local690 = local443[0] * local249 + local443[1] * local48 + local443[2] * local56 + 8192 >> 14;
				local695 = local443[3] * local249 + local443[4] * local48 + local443[5] * local56 + 8192 >> 14;
				local700 = local443[6] * local249 + local443[7] * local48 + local443[8] * local56 + 8192 >> 14;
				local690 += local675;
				local695 += local680;
				local700 += local685;
				local822 = new int[9];
				for (local824 = 0; local824 < 3; local824++) {
					for (local829 = 0; local829 < 3; local829++) {
						local834 = 0;
						for (local836 = 0; local836 < 3; local836++) {
							local834 += arg7[local824 * 3 + local836] * local688[local829 + local836 * 3];
						}
						local822[local824 * 3 + local829] = local834 + 8192 >> 14;
					}
				}
				local824 = arg7[0] * local690 + arg7[1] * local695 + arg7[2] * local700 + 8192 >> 14;
				local829 = arg7[3] * local690 + arg7[4] * local695 + arg7[5] * local700 + 8192 >> 14;
				local834 = arg7[6] * local690 + arg7[7] * local695 + arg7[8] * local700 + 8192 >> 14;
				local824 += local18;
				local829 += local29;
				local834 += local36;
				for (local836 = 0; local836 < local2; local836++) {
					local962 = arg1[local836];
					if (local962 < this.anIntArrayArray8.length) {
						@Pc(972) int[] local972 = this.anIntArrayArray8[local962];
						for (@Pc(974) int local974 = 0; local974 < local972.length; local974++) {
							@Pc(982) int local982 = local972[local974];
							if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local982]) != 0) {
								@Pc(1024) int local1024 = local822[0] * this.anIntArray62[local982] + local822[1] * this.anIntArray54[local982] + local822[2] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1055) int local1055 = local822[3] * this.anIntArray62[local982] + local822[4] * this.anIntArray54[local982] + local822[5] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1086) int local1086 = local822[6] * this.anIntArray62[local982] + local822[7] * this.anIntArray54[local982] + local822[8] * this.anIntArray55[local982] + 8192 >> 14;
								@Pc(1090) int local1090 = local1024 + local824;
								@Pc(1094) int local1094 = local1055 + local829;
								@Pc(1098) int local1098 = local1086 + local834;
								this.anIntArray62[local982] = local1090;
								this.anIntArray54[local982] = local1094;
								this.anIntArray55[local982] = local1098;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2424) boolean local2424;
			@Pc(2520) Class261 local2520;
			@Pc(2525) Class249 local2525;
			if (arg0 == 5) {
				if (this.anIntArrayArray10 != null) {
					local2424 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray10.length) {
							local46 = this.anIntArrayArray10[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local56]) != 0) {
									local366 = (this.aByteArray8[local56] & 0xFF) + arg2 * 8;
									if (local366 < 0) {
										local366 = 0;
									} else if (local366 > 255) {
										local366 = 255;
									}
									this.aByteArray8[local56] = (byte) local366;
								}
							}
							local2424 |= local46.length > 0;
						}
					}
					if (local2424) {
						if (this.aClass261Array1 != null) {
							for (local29 = 0; local29 < this.anInt545; local29++) {
								local2520 = this.aClass261Array1[local29];
								local2525 = this.aClass249Array1[local29];
								local2525.anInt3799 = local2525.anInt3799 & 0xFFFFFF | 255 - (this.aByteArray8[local2520.anInt4201] & 0xFF) << 24;
							}
						}
						this.method5267();
					}
				}
			} else if (arg0 != 7) {
				@Pc(2764) Class249 local2764;
				if (arg0 == 8) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local247 = this.anIntArrayArray9[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass249Array1[local247[local249]];
									local2764.anInt3800 += arg2;
									local2764.anInt3801 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local247 = this.anIntArrayArray9[local29];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2764 = this.aClass249Array1[local247[local249]];
									local2764.anInt3798 = local2764.anInt3798 * arg2 >> 7;
									local2764.anInt3797 = local2764.anInt3797 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray9 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray9.length) {
							local247 = this.anIntArrayArray9[local29];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2764 = this.aClass249Array1[local247[local249]];
								local2764.anInt3802 = local2764.anInt3802 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray10 != null) {
				local2424 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray10.length) {
						local46 = this.anIntArrayArray10[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local56]) != 0) {
								local366 = this.aShortArray16[local56] & 0xFFFF;
								local391 = local366 >> 10 & 0x3F;
								local416 = local366 >> 7 & 0x7;
								local455 = local366 & 0x7F;
								@Pc(2625) int local2625 = local391 + arg2 & 0x3F;
								local416 += arg3 / 4;
								if (local416 < 0) {
									local416 = 0;
								} else if (local416 > 7) {
									local416 = 7;
								}
								local455 += arg4;
								if (local455 < 0) {
									local455 = 0;
								} else if (local455 > 127) {
									local455 = 127;
								}
								this.aShortArray16[local56] = (short) (local2625 << 10 | local416 << 7 | local455);
							}
						}
						local2424 |= local46.length > 0;
					}
				}
				if (local2424) {
					if (this.aClass261Array1 != null) {
						for (local29 = 0; local29 < this.anInt545; local29++) {
							local2520 = this.aClass261Array1[local29];
							local2525 = this.aClass249Array1[local29];
							local2525.anInt3799 = local2525.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local2520.anInt4201] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5267();
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local247 = this.anIntArrayArray8[local29];
					for (local249 = 0; local249 < local247.length; local249++) {
						local48 = local247[local249];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local48]) != 0) {
							this.anIntArray62[local48] -= this.anInt528;
							this.anIntArray54[local48] -= this.anInt527;
							this.anIntArray55[local48] -= this.anInt546;
							this.anIntArray62[local48] = this.anIntArray62[local48] * arg2 >> 7;
							this.anIntArray54[local48] = this.anIntArray54[local48] * arg3 >> 7;
							this.anIntArray55[local48] = this.anIntArray55[local48] * arg4 >> 7;
							this.anIntArray62[local48] += this.anInt528;
							this.anIntArray54[local48] += this.anInt527;
							this.anIntArray55[local48] += this.anInt546;
						}
					}
				}
			}
		} else {
			local18 = arg7[9] << 4;
			local29 = arg7[10] << 4;
			local36 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local48 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (this.aBoolean129) {
				local366 = arg7[0] * this.anInt528 + arg7[3] * this.anInt527 + arg7[6] * this.anInt546 + 8192 >> 14;
				local391 = arg7[1] * this.anInt528 + arg7[4] * this.anInt527 + arg7[7] * this.anInt546 + 8192 >> 14;
				local416 = arg7[2] * this.anInt528 + arg7[5] * this.anInt527 + arg7[8] * this.anInt546 + 8192 >> 14;
				local366 += local249;
				local391 += local48;
				local416 += local56;
				this.anInt528 = local366;
				this.anInt527 = local391;
				this.anInt546 = local416;
				this.aBoolean129 = false;
			}
			local366 = arg2 << 15 >> 7;
			local391 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local455 = local366 * -this.anInt528 + 8192 >> 14;
			local459 = local391 * -this.anInt527 + 8192 >> 14;
			local463 = local416 * -this.anInt546 + 8192 >> 14;
			local467 = local455 + this.anInt528;
			local475 = local459 + this.anInt527;
			local483 = local463 + this.anInt546;
			@Pc(1838) int[] local1838 = new int[] { local366 * arg7[0] + 8192 >> 14, local366 * arg7[3] + 8192 >> 14, local366 * arg7[6] + 8192 >> 14, local391 * arg7[1] + 8192 >> 14, local391 * arg7[4] + 8192 >> 14, local391 * arg7[7] + 8192 >> 14, local416 * arg7[2] + 8192 >> 14, local416 * arg7[5] + 8192 >> 14, local416 * arg7[8] + 8192 >> 14 };
			local642 = local366 * local249 + 8192 >> 14;
			local670 = local391 * local48 + 8192 >> 14;
			local675 = local416 * local56 + 8192 >> 14;
			@Pc(1974) int local1974 = local642 + local467;
			@Pc(1978) int local1978 = local670 + local475;
			@Pc(1982) int local1982 = local675 + local483;
			@Pc(1985) int[] local1985 = new int[9];
			@Pc(1992) int local1992;
			for (local685 = 0; local685 < 3; local685++) {
				for (local1992 = 0; local1992 < 3; local1992++) {
					local690 = 0;
					for (local695 = 0; local695 < 3; local695++) {
						local690 += arg7[local685 * 3 + local695] * local1838[local1992 + local695 * 3];
					}
					local1985[local685 * 3 + local1992] = local690 + 8192 >> 14;
				}
			}
			local685 = arg7[0] * local1974 + arg7[1] * local1978 + arg7[2] * local1982 + 8192 >> 14;
			local1992 = arg7[3] * local1974 + arg7[4] * local1978 + arg7[5] * local1982 + 8192 >> 14;
			local690 = arg7[6] * local1974 + arg7[7] * local1978 + arg7[8] * local1982 + 8192 >> 14;
			local685 += local18;
			local1992 += local29;
			local690 += local36;
			for (local695 = 0; local695 < local2; local695++) {
				local700 = arg1[local695];
				if (local700 < this.anIntArrayArray8.length) {
					local822 = this.anIntArrayArray8[local700];
					for (local824 = 0; local824 < local822.length; local824++) {
						local829 = local822[local824];
						if (this.aShortArray24 == null || (arg6 & this.aShortArray24[local829]) != 0) {
							local834 = local1985[0] * this.anIntArray62[local829] + local1985[1] * this.anIntArray54[local829] + local1985[2] * this.anIntArray55[local829] + 8192 >> 14;
							local836 = local1985[3] * this.anIntArray62[local829] + local1985[4] * this.anIntArray54[local829] + local1985[5] * this.anIntArray55[local829] + 8192 >> 14;
							local962 = local1985[6] * this.anIntArray62[local829] + local1985[7] * this.anIntArray54[local829] + local1985[8] * this.anIntArray55[local829] + 8192 >> 14;
							@Pc(2253) int local2253 = local834 + local685;
							@Pc(2257) int local2257 = local836 + local1992;
							@Pc(2261) int local2261 = local962 + local690;
							this.anIntArray62[local829] = local2253;
							this.anIntArray54[local829] = local2257;
							this.anIntArray55[local829] = local2261;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "ah", descriptor = "(IIII)V", line = 2091)
	@Override
	void method5349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		if (arg0 == 0) {
			local3 = 0;
			this.anInt528 = 0;
			this.anInt527 = 0;
			this.anInt546 = 0;
			for (local14 = 0; local14 < this.anInt533; local14++) {
				this.anInt528 += this.anIntArray62[local14];
				this.anInt527 += this.anIntArray54[local14];
				this.anInt546 += this.anIntArray55[local14];
				local3++;
			}
			if (local3 > 0) {
				this.anInt528 = this.anInt528 / local3 + arg1;
				this.anInt527 = this.anInt527 / local3 + arg2;
				this.anInt546 = this.anInt546 / local3 + arg3;
			} else {
				this.anInt528 = arg1;
				this.anInt527 = arg2;
				this.anInt546 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt533; local3++) {
				this.anIntArray62[local3] += arg1;
				this.anIntArray54[local3] += arg2;
				this.anIntArray55[local3] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt533; local3++) {
					this.anIntArray62[local3] -= this.anInt528;
					this.anIntArray54[local3] -= this.anInt527;
					this.anIntArray55[local3] -= this.anInt546;
					if (arg3 != 0) {
						local14 = Class317.anIntArray419[arg3];
						local167 = Class317.anIntArray420[arg3];
						local185 = this.anIntArray54[local3] * local14 + this.anIntArray62[local3] * local167 + 16383 >> 14;
						this.anIntArray54[local3] = this.anIntArray54[local3] * local167 - this.anIntArray62[local3] * local14 + 16383 >> 14;
						this.anIntArray62[local3] = local185;
					}
					if (arg1 != 0) {
						local14 = Class317.anIntArray419[arg1];
						local167 = Class317.anIntArray420[arg1];
						local185 = this.anIntArray54[local3] * local167 - this.anIntArray55[local3] * local14 + 16383 >> 14;
						this.anIntArray55[local3] = this.anIntArray54[local3] * local14 + this.anIntArray55[local3] * local167 + 16383 >> 14;
						this.anIntArray54[local3] = local185;
					}
					if (arg2 != 0) {
						local14 = Class317.anIntArray419[arg2];
						local167 = Class317.anIntArray420[arg2];
						local185 = this.anIntArray55[local3] * local14 + this.anIntArray62[local3] * local167 + 16383 >> 14;
						this.anIntArray55[local3] = this.anIntArray55[local3] * local167 - this.anIntArray62[local3] * local14 + 16383 >> 14;
						this.anIntArray62[local3] = local185;
					}
					this.anIntArray62[local3] += this.anInt528;
					this.anIntArray54[local3] += this.anInt527;
					this.anIntArray55[local3] += this.anInt546;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt533; local3++) {
					this.anIntArray62[local3] -= this.anInt528;
					this.anIntArray54[local3] -= this.anInt527;
					this.anIntArray55[local3] -= this.anInt546;
					this.anIntArray62[local3] = this.anIntArray62[local3] * arg1 / 128;
					this.anIntArray54[local3] = this.anIntArray54[local3] * arg2 / 128;
					this.anIntArray55[local3] = this.anIntArray55[local3] * arg3 / 128;
					this.anIntArray62[local3] += this.anInt528;
					this.anIntArray54[local3] += this.anInt527;
					this.anIntArray55[local3] += this.anInt546;
				}
			} else {
				@Pc(503) Class261 local503;
				@Pc(508) Class249 local508;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt531; local3++) {
						local14 = (this.aByteArray8[local3] & 0xFF) + arg1 * 8;
						if (local14 < 0) {
							local14 = 0;
						} else if (local14 > 255) {
							local14 = 255;
						}
						this.aByteArray8[local3] = (byte) local14;
					}
					if (this.aClass261Array1 != null) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local503 = this.aClass261Array1[local3];
							local508 = this.aClass249Array1[local3];
							local508.anInt3799 = local508.anInt3799 & 0xFFFFFF | 255 - (this.aByteArray8[local503.anInt4201] & 0xFF) << 24;
						}
					}
					this.method5267();
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt531; local3++) {
						local14 = this.aShortArray16[local3] & 0xFFFF;
						local167 = local14 >> 10 & 0x3F;
						local185 = local14 >> 7 & 0x7;
						@Pc(563) int local563 = local14 & 0x7F;
						@Pc(569) int local569 = local167 + arg1 & 0x3F;
						local185 += arg2 / 4;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						local563 += arg3;
						if (local563 < 0) {
							local563 = 0;
						} else if (local563 > 127) {
							local563 = 127;
						}
						this.aShortArray16[local3] = (short) (local569 << 10 | local185 << 7 | local563);
					}
					if (this.aClass261Array1 != null) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local503 = this.aClass261Array1[local3];
							local508 = this.aClass249Array1[local3];
							local508.anInt3799 = local508.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local503.anInt4201] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5267();
				} else {
					@Pc(671) Class249 local671;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3800 += arg1;
							local671.anInt3801 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3798 = local671.anInt3798 * arg1 >> 7;
							local671.anInt3797 = local671.anInt3797 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3802 = local671.anInt3802 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "dk", descriptor = "(IIII)V", line = 2091)
	@Override
	void method5428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		if (arg0 == 0) {
			local3 = 0;
			this.anInt528 = 0;
			this.anInt527 = 0;
			this.anInt546 = 0;
			for (local14 = 0; local14 < this.anInt533; local14++) {
				this.anInt528 += this.anIntArray62[local14];
				this.anInt527 += this.anIntArray54[local14];
				this.anInt546 += this.anIntArray55[local14];
				local3++;
			}
			if (local3 > 0) {
				this.anInt528 = this.anInt528 / local3 + arg1;
				this.anInt527 = this.anInt527 / local3 + arg2;
				this.anInt546 = this.anInt546 / local3 + arg3;
			} else {
				this.anInt528 = arg1;
				this.anInt527 = arg2;
				this.anInt546 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt533; local3++) {
				this.anIntArray62[local3] += arg1;
				this.anIntArray54[local3] += arg2;
				this.anIntArray55[local3] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt533; local3++) {
					this.anIntArray62[local3] -= this.anInt528;
					this.anIntArray54[local3] -= this.anInt527;
					this.anIntArray55[local3] -= this.anInt546;
					if (arg3 != 0) {
						local14 = Class317.anIntArray419[arg3];
						local167 = Class317.anIntArray420[arg3];
						local185 = this.anIntArray54[local3] * local14 + this.anIntArray62[local3] * local167 + 16383 >> 14;
						this.anIntArray54[local3] = this.anIntArray54[local3] * local167 - this.anIntArray62[local3] * local14 + 16383 >> 14;
						this.anIntArray62[local3] = local185;
					}
					if (arg1 != 0) {
						local14 = Class317.anIntArray419[arg1];
						local167 = Class317.anIntArray420[arg1];
						local185 = this.anIntArray54[local3] * local167 - this.anIntArray55[local3] * local14 + 16383 >> 14;
						this.anIntArray55[local3] = this.anIntArray54[local3] * local14 + this.anIntArray55[local3] * local167 + 16383 >> 14;
						this.anIntArray54[local3] = local185;
					}
					if (arg2 != 0) {
						local14 = Class317.anIntArray419[arg2];
						local167 = Class317.anIntArray420[arg2];
						local185 = this.anIntArray55[local3] * local14 + this.anIntArray62[local3] * local167 + 16383 >> 14;
						this.anIntArray55[local3] = this.anIntArray55[local3] * local167 - this.anIntArray62[local3] * local14 + 16383 >> 14;
						this.anIntArray62[local3] = local185;
					}
					this.anIntArray62[local3] += this.anInt528;
					this.anIntArray54[local3] += this.anInt527;
					this.anIntArray55[local3] += this.anInt546;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt533; local3++) {
					this.anIntArray62[local3] -= this.anInt528;
					this.anIntArray54[local3] -= this.anInt527;
					this.anIntArray55[local3] -= this.anInt546;
					this.anIntArray62[local3] = this.anIntArray62[local3] * arg1 / 128;
					this.anIntArray54[local3] = this.anIntArray54[local3] * arg2 / 128;
					this.anIntArray55[local3] = this.anIntArray55[local3] * arg3 / 128;
					this.anIntArray62[local3] += this.anInt528;
					this.anIntArray54[local3] += this.anInt527;
					this.anIntArray55[local3] += this.anInt546;
				}
			} else {
				@Pc(503) Class261 local503;
				@Pc(508) Class249 local508;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt531; local3++) {
						local14 = (this.aByteArray8[local3] & 0xFF) + arg1 * 8;
						if (local14 < 0) {
							local14 = 0;
						} else if (local14 > 255) {
							local14 = 255;
						}
						this.aByteArray8[local3] = (byte) local14;
					}
					if (this.aClass261Array1 != null) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local503 = this.aClass261Array1[local3];
							local508 = this.aClass249Array1[local3];
							local508.anInt3799 = local508.anInt3799 & 0xFFFFFF | 255 - (this.aByteArray8[local503.anInt4201] & 0xFF) << 24;
						}
					}
					this.method5267();
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt531; local3++) {
						local14 = this.aShortArray16[local3] & 0xFFFF;
						local167 = local14 >> 10 & 0x3F;
						local185 = local14 >> 7 & 0x7;
						@Pc(563) int local563 = local14 & 0x7F;
						@Pc(569) int local569 = local167 + arg1 & 0x3F;
						local185 += arg2 / 4;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						local563 += arg3;
						if (local563 < 0) {
							local563 = 0;
						} else if (local563 > 127) {
							local563 = 127;
						}
						this.aShortArray16[local3] = (short) (local569 << 10 | local185 << 7 | local563);
					}
					if (this.aClass261Array1 != null) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local503 = this.aClass261Array1[local3];
							local508 = this.aClass249Array1[local3];
							local508.anInt3799 = local508.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local503.anInt4201] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5267();
				} else {
					@Pc(671) Class249 local671;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3800 += arg1;
							local671.anInt3801 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3798 = local671.anInt3798 * arg1 >> 7;
							local671.anInt3797 = local671.anInt3797 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3802 = local671.anInt3802 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "dh", descriptor = "(IIII)V", line = 2091)
	@Override
	void method5425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		if (arg0 == 0) {
			local3 = 0;
			this.anInt528 = 0;
			this.anInt527 = 0;
			this.anInt546 = 0;
			for (local14 = 0; local14 < this.anInt533; local14++) {
				this.anInt528 += this.anIntArray62[local14];
				this.anInt527 += this.anIntArray54[local14];
				this.anInt546 += this.anIntArray55[local14];
				local3++;
			}
			if (local3 > 0) {
				this.anInt528 = this.anInt528 / local3 + arg1;
				this.anInt527 = this.anInt527 / local3 + arg2;
				this.anInt546 = this.anInt546 / local3 + arg3;
			} else {
				this.anInt528 = arg1;
				this.anInt527 = arg2;
				this.anInt546 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt533; local3++) {
				this.anIntArray62[local3] += arg1;
				this.anIntArray54[local3] += arg2;
				this.anIntArray55[local3] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt533; local3++) {
					this.anIntArray62[local3] -= this.anInt528;
					this.anIntArray54[local3] -= this.anInt527;
					this.anIntArray55[local3] -= this.anInt546;
					if (arg3 != 0) {
						local14 = Class317.anIntArray419[arg3];
						local167 = Class317.anIntArray420[arg3];
						local185 = this.anIntArray54[local3] * local14 + this.anIntArray62[local3] * local167 + 16383 >> 14;
						this.anIntArray54[local3] = this.anIntArray54[local3] * local167 - this.anIntArray62[local3] * local14 + 16383 >> 14;
						this.anIntArray62[local3] = local185;
					}
					if (arg1 != 0) {
						local14 = Class317.anIntArray419[arg1];
						local167 = Class317.anIntArray420[arg1];
						local185 = this.anIntArray54[local3] * local167 - this.anIntArray55[local3] * local14 + 16383 >> 14;
						this.anIntArray55[local3] = this.anIntArray54[local3] * local14 + this.anIntArray55[local3] * local167 + 16383 >> 14;
						this.anIntArray54[local3] = local185;
					}
					if (arg2 != 0) {
						local14 = Class317.anIntArray419[arg2];
						local167 = Class317.anIntArray420[arg2];
						local185 = this.anIntArray55[local3] * local14 + this.anIntArray62[local3] * local167 + 16383 >> 14;
						this.anIntArray55[local3] = this.anIntArray55[local3] * local167 - this.anIntArray62[local3] * local14 + 16383 >> 14;
						this.anIntArray62[local3] = local185;
					}
					this.anIntArray62[local3] += this.anInt528;
					this.anIntArray54[local3] += this.anInt527;
					this.anIntArray55[local3] += this.anInt546;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt533; local3++) {
					this.anIntArray62[local3] -= this.anInt528;
					this.anIntArray54[local3] -= this.anInt527;
					this.anIntArray55[local3] -= this.anInt546;
					this.anIntArray62[local3] = this.anIntArray62[local3] * arg1 / 128;
					this.anIntArray54[local3] = this.anIntArray54[local3] * arg2 / 128;
					this.anIntArray55[local3] = this.anIntArray55[local3] * arg3 / 128;
					this.anIntArray62[local3] += this.anInt528;
					this.anIntArray54[local3] += this.anInt527;
					this.anIntArray55[local3] += this.anInt546;
				}
			} else {
				@Pc(503) Class261 local503;
				@Pc(508) Class249 local508;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt531; local3++) {
						local14 = (this.aByteArray8[local3] & 0xFF) + arg1 * 8;
						if (local14 < 0) {
							local14 = 0;
						} else if (local14 > 255) {
							local14 = 255;
						}
						this.aByteArray8[local3] = (byte) local14;
					}
					if (this.aClass261Array1 != null) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local503 = this.aClass261Array1[local3];
							local508 = this.aClass249Array1[local3];
							local508.anInt3799 = local508.anInt3799 & 0xFFFFFF | 255 - (this.aByteArray8[local503.anInt4201] & 0xFF) << 24;
						}
					}
					this.method5267();
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt531; local3++) {
						local14 = this.aShortArray16[local3] & 0xFFFF;
						local167 = local14 >> 10 & 0x3F;
						local185 = local14 >> 7 & 0x7;
						@Pc(563) int local563 = local14 & 0x7F;
						@Pc(569) int local569 = local167 + arg1 & 0x3F;
						local185 += arg2 / 4;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						local563 += arg3;
						if (local563 < 0) {
							local563 = 0;
						} else if (local563 > 127) {
							local563 = 127;
						}
						this.aShortArray16[local3] = (short) (local569 << 10 | local185 << 7 | local563);
					}
					if (this.aClass261Array1 != null) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local503 = this.aClass261Array1[local3];
							local508 = this.aClass249Array1[local3];
							local508.anInt3799 = local508.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local503.anInt4201] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5267();
				} else {
					@Pc(671) Class249 local671;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3800 += arg1;
							local671.anInt3801 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3798 = local671.anInt3798 * arg1 >> 7;
							local671.anInt3797 = local671.anInt3797 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3802 = local671.anInt3802 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "db", descriptor = "(IIII)V", line = 2091)
	@Override
	void method5426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		if (arg0 == 0) {
			local3 = 0;
			this.anInt528 = 0;
			this.anInt527 = 0;
			this.anInt546 = 0;
			for (local14 = 0; local14 < this.anInt533; local14++) {
				this.anInt528 += this.anIntArray62[local14];
				this.anInt527 += this.anIntArray54[local14];
				this.anInt546 += this.anIntArray55[local14];
				local3++;
			}
			if (local3 > 0) {
				this.anInt528 = this.anInt528 / local3 + arg1;
				this.anInt527 = this.anInt527 / local3 + arg2;
				this.anInt546 = this.anInt546 / local3 + arg3;
			} else {
				this.anInt528 = arg1;
				this.anInt527 = arg2;
				this.anInt546 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt533; local3++) {
				this.anIntArray62[local3] += arg1;
				this.anIntArray54[local3] += arg2;
				this.anIntArray55[local3] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt533; local3++) {
					this.anIntArray62[local3] -= this.anInt528;
					this.anIntArray54[local3] -= this.anInt527;
					this.anIntArray55[local3] -= this.anInt546;
					if (arg3 != 0) {
						local14 = Class317.anIntArray419[arg3];
						local167 = Class317.anIntArray420[arg3];
						local185 = this.anIntArray54[local3] * local14 + this.anIntArray62[local3] * local167 + 16383 >> 14;
						this.anIntArray54[local3] = this.anIntArray54[local3] * local167 - this.anIntArray62[local3] * local14 + 16383 >> 14;
						this.anIntArray62[local3] = local185;
					}
					if (arg1 != 0) {
						local14 = Class317.anIntArray419[arg1];
						local167 = Class317.anIntArray420[arg1];
						local185 = this.anIntArray54[local3] * local167 - this.anIntArray55[local3] * local14 + 16383 >> 14;
						this.anIntArray55[local3] = this.anIntArray54[local3] * local14 + this.anIntArray55[local3] * local167 + 16383 >> 14;
						this.anIntArray54[local3] = local185;
					}
					if (arg2 != 0) {
						local14 = Class317.anIntArray419[arg2];
						local167 = Class317.anIntArray420[arg2];
						local185 = this.anIntArray55[local3] * local14 + this.anIntArray62[local3] * local167 + 16383 >> 14;
						this.anIntArray55[local3] = this.anIntArray55[local3] * local167 - this.anIntArray62[local3] * local14 + 16383 >> 14;
						this.anIntArray62[local3] = local185;
					}
					this.anIntArray62[local3] += this.anInt528;
					this.anIntArray54[local3] += this.anInt527;
					this.anIntArray55[local3] += this.anInt546;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt533; local3++) {
					this.anIntArray62[local3] -= this.anInt528;
					this.anIntArray54[local3] -= this.anInt527;
					this.anIntArray55[local3] -= this.anInt546;
					this.anIntArray62[local3] = this.anIntArray62[local3] * arg1 / 128;
					this.anIntArray54[local3] = this.anIntArray54[local3] * arg2 / 128;
					this.anIntArray55[local3] = this.anIntArray55[local3] * arg3 / 128;
					this.anIntArray62[local3] += this.anInt528;
					this.anIntArray54[local3] += this.anInt527;
					this.anIntArray55[local3] += this.anInt546;
				}
			} else {
				@Pc(503) Class261 local503;
				@Pc(508) Class249 local508;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt531; local3++) {
						local14 = (this.aByteArray8[local3] & 0xFF) + arg1 * 8;
						if (local14 < 0) {
							local14 = 0;
						} else if (local14 > 255) {
							local14 = 255;
						}
						this.aByteArray8[local3] = (byte) local14;
					}
					if (this.aClass261Array1 != null) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local503 = this.aClass261Array1[local3];
							local508 = this.aClass249Array1[local3];
							local508.anInt3799 = local508.anInt3799 & 0xFFFFFF | 255 - (this.aByteArray8[local503.anInt4201] & 0xFF) << 24;
						}
					}
					this.method5267();
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt531; local3++) {
						local14 = this.aShortArray16[local3] & 0xFFFF;
						local167 = local14 >> 10 & 0x3F;
						local185 = local14 >> 7 & 0x7;
						@Pc(563) int local563 = local14 & 0x7F;
						@Pc(569) int local569 = local167 + arg1 & 0x3F;
						local185 += arg2 / 4;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						local563 += arg3;
						if (local563 < 0) {
							local563 = 0;
						} else if (local563 > 127) {
							local563 = 127;
						}
						this.aShortArray16[local3] = (short) (local569 << 10 | local185 << 7 | local563);
					}
					if (this.aClass261Array1 != null) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local503 = this.aClass261Array1[local3];
							local508 = this.aClass249Array1[local3];
							local508.anInt3799 = local508.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local503.anInt4201] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5267();
				} else {
					@Pc(671) Class249 local671;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3800 += arg1;
							local671.anInt3801 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3798 = local671.anInt3798 * arg1 >> 7;
							local671.anInt3797 = local671.anInt3797 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3802 = local671.anInt3802 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "dp", descriptor = "(IIII)V", line = 2091)
	@Override
	void method5360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		if (arg0 == 0) {
			local3 = 0;
			this.anInt528 = 0;
			this.anInt527 = 0;
			this.anInt546 = 0;
			for (local14 = 0; local14 < this.anInt533; local14++) {
				this.anInt528 += this.anIntArray62[local14];
				this.anInt527 += this.anIntArray54[local14];
				this.anInt546 += this.anIntArray55[local14];
				local3++;
			}
			if (local3 > 0) {
				this.anInt528 = this.anInt528 / local3 + arg1;
				this.anInt527 = this.anInt527 / local3 + arg2;
				this.anInt546 = this.anInt546 / local3 + arg3;
			} else {
				this.anInt528 = arg1;
				this.anInt527 = arg2;
				this.anInt546 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt533; local3++) {
				this.anIntArray62[local3] += arg1;
				this.anIntArray54[local3] += arg2;
				this.anIntArray55[local3] += arg3;
			}
		} else {
			@Pc(167) int local167;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt533; local3++) {
					this.anIntArray62[local3] -= this.anInt528;
					this.anIntArray54[local3] -= this.anInt527;
					this.anIntArray55[local3] -= this.anInt546;
					if (arg3 != 0) {
						local14 = Class317.anIntArray419[arg3];
						local167 = Class317.anIntArray420[arg3];
						local185 = this.anIntArray54[local3] * local14 + this.anIntArray62[local3] * local167 + 16383 >> 14;
						this.anIntArray54[local3] = this.anIntArray54[local3] * local167 - this.anIntArray62[local3] * local14 + 16383 >> 14;
						this.anIntArray62[local3] = local185;
					}
					if (arg1 != 0) {
						local14 = Class317.anIntArray419[arg1];
						local167 = Class317.anIntArray420[arg1];
						local185 = this.anIntArray54[local3] * local167 - this.anIntArray55[local3] * local14 + 16383 >> 14;
						this.anIntArray55[local3] = this.anIntArray54[local3] * local14 + this.anIntArray55[local3] * local167 + 16383 >> 14;
						this.anIntArray54[local3] = local185;
					}
					if (arg2 != 0) {
						local14 = Class317.anIntArray419[arg2];
						local167 = Class317.anIntArray420[arg2];
						local185 = this.anIntArray55[local3] * local14 + this.anIntArray62[local3] * local167 + 16383 >> 14;
						this.anIntArray55[local3] = this.anIntArray55[local3] * local167 - this.anIntArray62[local3] * local14 + 16383 >> 14;
						this.anIntArray62[local3] = local185;
					}
					this.anIntArray62[local3] += this.anInt528;
					this.anIntArray54[local3] += this.anInt527;
					this.anIntArray55[local3] += this.anInt546;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt533; local3++) {
					this.anIntArray62[local3] -= this.anInt528;
					this.anIntArray54[local3] -= this.anInt527;
					this.anIntArray55[local3] -= this.anInt546;
					this.anIntArray62[local3] = this.anIntArray62[local3] * arg1 / 128;
					this.anIntArray54[local3] = this.anIntArray54[local3] * arg2 / 128;
					this.anIntArray55[local3] = this.anIntArray55[local3] * arg3 / 128;
					this.anIntArray62[local3] += this.anInt528;
					this.anIntArray54[local3] += this.anInt527;
					this.anIntArray55[local3] += this.anInt546;
				}
			} else {
				@Pc(503) Class261 local503;
				@Pc(508) Class249 local508;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt531; local3++) {
						local14 = (this.aByteArray8[local3] & 0xFF) + arg1 * 8;
						if (local14 < 0) {
							local14 = 0;
						} else if (local14 > 255) {
							local14 = 255;
						}
						this.aByteArray8[local3] = (byte) local14;
					}
					if (this.aClass261Array1 != null) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local503 = this.aClass261Array1[local3];
							local508 = this.aClass249Array1[local3];
							local508.anInt3799 = local508.anInt3799 & 0xFFFFFF | 255 - (this.aByteArray8[local503.anInt4201] & 0xFF) << 24;
						}
					}
					this.method5267();
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt531; local3++) {
						local14 = this.aShortArray16[local3] & 0xFFFF;
						local167 = local14 >> 10 & 0x3F;
						local185 = local14 >> 7 & 0x7;
						@Pc(563) int local563 = local14 & 0x7F;
						@Pc(569) int local569 = local167 + arg1 & 0x3F;
						local185 += arg2 / 4;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						local563 += arg3;
						if (local563 < 0) {
							local563 = 0;
						} else if (local563 > 127) {
							local563 = 127;
						}
						this.aShortArray16[local3] = (short) (local569 << 10 | local185 << 7 | local563);
					}
					if (this.aClass261Array1 != null) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local503 = this.aClass261Array1[local3];
							local508 = this.aClass249Array1[local3];
							local508.anInt3799 = local508.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local503.anInt4201] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5267();
				} else {
					@Pc(671) Class249 local671;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3800 += arg1;
							local671.anInt3801 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3798 = local671.anInt3798 * arg1 >> 7;
							local671.anInt3797 = local671.anInt3797 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt545; local3++) {
							local671 = this.aClass249Array1[local3];
							local671.anInt3802 = local671.anInt3802 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "ca", descriptor = "(I[IIIIIZ)V", line = 2236)
	@Override
	void method5418(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			this.anInt528 = 0;
			this.anInt527 = 0;
			this.anInt546 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray8.length) {
					local46 = this.anIntArrayArray8[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						this.anInt528 += this.anIntArray62[local56];
						this.anInt527 += this.anIntArray54[local56];
						this.anInt546 += this.anIntArray55[local56];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				this.anInt528 = this.anInt528 / local18 + local8;
				this.anInt527 = this.anInt527 / local18 + local12;
				this.anInt546 = this.anInt546 / local18 + local16;
			} else {
				this.anInt528 = local8;
				this.anInt527 = local12;
				this.anInt546 = local16;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local159 = this.anIntArrayArray8[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray62[local48] += local8;
						this.anIntArray54[local48] += local12;
						this.anIntArray55[local48] += local16;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(289) int local289;
		@Pc(746) int local746;
		@Pc(752) int local752;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local159 = this.anIntArrayArray8[local29];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray62[local48] -= this.anInt528;
							this.anIntArray54[local48] -= this.anInt527;
							this.anIntArray55[local48] -= this.anInt546;
							if (arg4 != 0) {
								local56 = Class317.anIntArray419[arg4];
								local271 = Class317.anIntArray420[arg4];
								local289 = this.anIntArray54[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = this.anIntArray54[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							if (arg2 != 0) {
								local56 = Class317.anIntArray419[arg2];
								local271 = Class317.anIntArray420[arg2];
								local289 = this.anIntArray54[local48] * local271 - this.anIntArray55[local48] * local56 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray54[local48] * local56 + this.anIntArray55[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class317.anIntArray419[arg3];
								local271 = Class317.anIntArray420[arg3];
								local289 = this.anIntArray55[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray55[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							this.anIntArray62[local48] += this.anInt528;
							this.anIntArray54[local48] += this.anInt527;
							this.anIntArray55[local48] += this.anInt546;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray62[local48] -= this.anInt528;
							this.anIntArray54[local48] -= this.anInt527;
							this.anIntArray55[local48] -= this.anInt546;
							if (arg2 != 0) {
								local56 = Class317.anIntArray419[arg2];
								local271 = Class317.anIntArray420[arg2];
								local289 = this.anIntArray54[local48] * local271 - this.anIntArray55[local48] * local56 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray54[local48] * local56 + this.anIntArray55[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = local289;
							}
							if (arg4 != 0) {
								local56 = Class317.anIntArray419[arg4];
								local271 = Class317.anIntArray420[arg4];
								local289 = this.anIntArray54[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = this.anIntArray54[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class317.anIntArray419[arg3];
								local271 = Class317.anIntArray420[arg3];
								local289 = this.anIntArray55[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray55[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							this.anIntArray62[local48] += this.anInt528;
							this.anIntArray54[local48] += this.anInt527;
							this.anIntArray55[local48] += this.anInt546;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray8.length) {
						local159 = this.anIntArrayArray8[local29];
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							local56 = this.anIntArray56[local48];
							local271 = this.anIntArray56[local48 + 1];
							for (local289 = local56; local289 < local271 && this.aShortArray23[local289] != 0; local289++) {
								local746 = (this.aShortArray23[local289] & 0xFFFF) - 1;
								@Pc(756) int local756;
								@Pc(774) int local774;
								if (arg4 != 0) {
									local752 = Class317.anIntArray419[arg4];
									local756 = Class317.anIntArray420[arg4];
									local774 = this.aShortArray15[local746] * local752 + this.aShortArray14[local746] * local756 + 16383 >> 14;
									this.aShortArray15[local746] = (short) (this.aShortArray15[local746] * local756 - this.aShortArray14[local746] * local752 + 16383 >> 14);
									this.aShortArray14[local746] = (short) local774;
								}
								if (arg2 != 0) {
									local752 = Class317.anIntArray419[arg2];
									local756 = Class317.anIntArray420[arg2];
									local774 = this.aShortArray15[local746] * local756 - this.aShortArray17[local746] * local752 + 16383 >> 14;
									this.aShortArray17[local746] = (short) (this.aShortArray15[local746] * local752 + this.aShortArray17[local746] * local756 + 16383 >> 14);
									this.aShortArray15[local746] = (short) local774;
								}
								if (arg3 != 0) {
									local752 = Class317.anIntArray419[arg3];
									local756 = Class317.anIntArray420[arg3];
									local774 = this.aShortArray17[local746] * local752 + this.aShortArray14[local746] * local756 + 16383 >> 14;
									this.aShortArray17[local746] = (short) (this.aShortArray17[local746] * local756 - this.aShortArray14[local746] * local752 + 16383 >> 14);
									this.aShortArray14[local746] = (short) local774;
								}
							}
						}
					}
				}
				this.method5268();
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local159 = this.anIntArrayArray8[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray62[local48] -= this.anInt528;
						this.anIntArray54[local48] -= this.anInt527;
						this.anIntArray55[local48] -= this.anInt546;
						this.anIntArray62[local48] = this.anIntArray62[local48] * arg2 >> 7;
						this.anIntArray54[local48] = this.anIntArray54[local48] * arg3 >> 7;
						this.anIntArray55[local48] = this.anIntArray55[local48] * arg4 >> 7;
						this.anIntArray62[local48] += this.anInt528;
						this.anIntArray54[local48] += this.anInt527;
						this.anIntArray55[local48] += this.anInt546;
					}
				}
			}
		} else {
			@Pc(1058) boolean local1058;
			@Pc(1143) Class261 local1143;
			@Pc(1148) Class249 local1148;
			if (arg0 == 5) {
				if (this.anIntArrayArray10 != null) {
					local1058 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray10.length) {
							local46 = this.anIntArrayArray10[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								local271 = (this.aByteArray8[local56] & 0xFF) + arg2 * 8;
								if (local271 < 0) {
									local271 = 0;
								} else if (local271 > 255) {
									local271 = 255;
								}
								this.aByteArray8[local56] = (byte) local271;
							}
							local1058 |= local46.length > 0;
						}
					}
					if (local1058) {
						if (this.aClass261Array1 != null) {
							for (local29 = 0; local29 < this.anInt545; local29++) {
								local1143 = this.aClass261Array1[local29];
								local1148 = this.aClass249Array1[local29];
								local1148.anInt3799 = local1148.anInt3799 & 0xFFFFFF | 255 - (this.aByteArray8[local1143.anInt4201] & 0xFF) << 24;
							}
						}
						this.method5267();
					}
				}
			} else if (arg0 != 7) {
				@Pc(1376) Class249 local1376;
				if (arg0 == 8) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local159 = this.anIntArrayArray9[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass249Array1[local159[local161]];
									local1376.anInt3800 += arg2;
									local1376.anInt3801 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local159 = this.anIntArrayArray9[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass249Array1[local159[local161]];
									local1376.anInt3798 = local1376.anInt3798 * arg2 >> 7;
									local1376.anInt3797 = local1376.anInt3797 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray9 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray9.length) {
							local159 = this.anIntArrayArray9[local29];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1376 = this.aClass249Array1[local159[local161]];
								local1376.anInt3802 = local1376.anInt3802 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray10 != null) {
				local1058 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray10.length) {
						local46 = this.anIntArrayArray10[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							local271 = this.aShortArray16[local56] & 0xFFFF;
							local289 = local271 >> 10 & 0x3F;
							local746 = local271 >> 7 & 0x7;
							local752 = local271 & 0x7F;
							@Pc(1237) int local1237 = local289 + arg2 & 0x3F;
							local746 += arg3 / 4;
							if (local746 < 0) {
								local746 = 0;
							} else if (local746 > 7) {
								local746 = 7;
							}
							local752 += arg4;
							if (local752 < 0) {
								local752 = 0;
							} else if (local752 > 127) {
								local752 = 127;
							}
							this.aShortArray16[local56] = (short) (local1237 << 10 | local746 << 7 | local752);
						}
						local1058 |= local46.length > 0;
					}
				}
				if (local1058) {
					if (this.aClass261Array1 != null) {
						for (local29 = 0; local29 < this.anInt545; local29++) {
							local1143 = this.aClass261Array1[local29];
							local1148 = this.aClass249Array1[local29];
							local1148.anInt3799 = local1148.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local1143.anInt4201] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5267();
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "ce", descriptor = "(I[IIIIIZ)V", line = 2236)
	@Override
	void method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			this.anInt528 = 0;
			this.anInt527 = 0;
			this.anInt546 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray8.length) {
					local46 = this.anIntArrayArray8[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						this.anInt528 += this.anIntArray62[local56];
						this.anInt527 += this.anIntArray54[local56];
						this.anInt546 += this.anIntArray55[local56];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				this.anInt528 = this.anInt528 / local18 + local8;
				this.anInt527 = this.anInt527 / local18 + local12;
				this.anInt546 = this.anInt546 / local18 + local16;
			} else {
				this.anInt528 = local8;
				this.anInt527 = local12;
				this.anInt546 = local16;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local159 = this.anIntArrayArray8[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray62[local48] += local8;
						this.anIntArray54[local48] += local12;
						this.anIntArray55[local48] += local16;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(289) int local289;
		@Pc(746) int local746;
		@Pc(752) int local752;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local159 = this.anIntArrayArray8[local29];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray62[local48] -= this.anInt528;
							this.anIntArray54[local48] -= this.anInt527;
							this.anIntArray55[local48] -= this.anInt546;
							if (arg4 != 0) {
								local56 = Class317.anIntArray419[arg4];
								local271 = Class317.anIntArray420[arg4];
								local289 = this.anIntArray54[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = this.anIntArray54[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							if (arg2 != 0) {
								local56 = Class317.anIntArray419[arg2];
								local271 = Class317.anIntArray420[arg2];
								local289 = this.anIntArray54[local48] * local271 - this.anIntArray55[local48] * local56 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray54[local48] * local56 + this.anIntArray55[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class317.anIntArray419[arg3];
								local271 = Class317.anIntArray420[arg3];
								local289 = this.anIntArray55[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray55[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							this.anIntArray62[local48] += this.anInt528;
							this.anIntArray54[local48] += this.anInt527;
							this.anIntArray55[local48] += this.anInt546;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray62[local48] -= this.anInt528;
							this.anIntArray54[local48] -= this.anInt527;
							this.anIntArray55[local48] -= this.anInt546;
							if (arg2 != 0) {
								local56 = Class317.anIntArray419[arg2];
								local271 = Class317.anIntArray420[arg2];
								local289 = this.anIntArray54[local48] * local271 - this.anIntArray55[local48] * local56 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray54[local48] * local56 + this.anIntArray55[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = local289;
							}
							if (arg4 != 0) {
								local56 = Class317.anIntArray419[arg4];
								local271 = Class317.anIntArray420[arg4];
								local289 = this.anIntArray54[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = this.anIntArray54[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class317.anIntArray419[arg3];
								local271 = Class317.anIntArray420[arg3];
								local289 = this.anIntArray55[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray55[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							this.anIntArray62[local48] += this.anInt528;
							this.anIntArray54[local48] += this.anInt527;
							this.anIntArray55[local48] += this.anInt546;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray8.length) {
						local159 = this.anIntArrayArray8[local29];
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							local56 = this.anIntArray56[local48];
							local271 = this.anIntArray56[local48 + 1];
							for (local289 = local56; local289 < local271 && this.aShortArray23[local289] != 0; local289++) {
								local746 = (this.aShortArray23[local289] & 0xFFFF) - 1;
								@Pc(756) int local756;
								@Pc(774) int local774;
								if (arg4 != 0) {
									local752 = Class317.anIntArray419[arg4];
									local756 = Class317.anIntArray420[arg4];
									local774 = this.aShortArray15[local746] * local752 + this.aShortArray14[local746] * local756 + 16383 >> 14;
									this.aShortArray15[local746] = (short) (this.aShortArray15[local746] * local756 - this.aShortArray14[local746] * local752 + 16383 >> 14);
									this.aShortArray14[local746] = (short) local774;
								}
								if (arg2 != 0) {
									local752 = Class317.anIntArray419[arg2];
									local756 = Class317.anIntArray420[arg2];
									local774 = this.aShortArray15[local746] * local756 - this.aShortArray17[local746] * local752 + 16383 >> 14;
									this.aShortArray17[local746] = (short) (this.aShortArray15[local746] * local752 + this.aShortArray17[local746] * local756 + 16383 >> 14);
									this.aShortArray15[local746] = (short) local774;
								}
								if (arg3 != 0) {
									local752 = Class317.anIntArray419[arg3];
									local756 = Class317.anIntArray420[arg3];
									local774 = this.aShortArray17[local746] * local752 + this.aShortArray14[local746] * local756 + 16383 >> 14;
									this.aShortArray17[local746] = (short) (this.aShortArray17[local746] * local756 - this.aShortArray14[local746] * local752 + 16383 >> 14);
									this.aShortArray14[local746] = (short) local774;
								}
							}
						}
					}
				}
				this.method5268();
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local159 = this.anIntArrayArray8[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray62[local48] -= this.anInt528;
						this.anIntArray54[local48] -= this.anInt527;
						this.anIntArray55[local48] -= this.anInt546;
						this.anIntArray62[local48] = this.anIntArray62[local48] * arg2 >> 7;
						this.anIntArray54[local48] = this.anIntArray54[local48] * arg3 >> 7;
						this.anIntArray55[local48] = this.anIntArray55[local48] * arg4 >> 7;
						this.anIntArray62[local48] += this.anInt528;
						this.anIntArray54[local48] += this.anInt527;
						this.anIntArray55[local48] += this.anInt546;
					}
				}
			}
		} else {
			@Pc(1058) boolean local1058;
			@Pc(1143) Class261 local1143;
			@Pc(1148) Class249 local1148;
			if (arg0 == 5) {
				if (this.anIntArrayArray10 != null) {
					local1058 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray10.length) {
							local46 = this.anIntArrayArray10[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								local271 = (this.aByteArray8[local56] & 0xFF) + arg2 * 8;
								if (local271 < 0) {
									local271 = 0;
								} else if (local271 > 255) {
									local271 = 255;
								}
								this.aByteArray8[local56] = (byte) local271;
							}
							local1058 |= local46.length > 0;
						}
					}
					if (local1058) {
						if (this.aClass261Array1 != null) {
							for (local29 = 0; local29 < this.anInt545; local29++) {
								local1143 = this.aClass261Array1[local29];
								local1148 = this.aClass249Array1[local29];
								local1148.anInt3799 = local1148.anInt3799 & 0xFFFFFF | 255 - (this.aByteArray8[local1143.anInt4201] & 0xFF) << 24;
							}
						}
						this.method5267();
					}
				}
			} else if (arg0 != 7) {
				@Pc(1376) Class249 local1376;
				if (arg0 == 8) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local159 = this.anIntArrayArray9[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass249Array1[local159[local161]];
									local1376.anInt3800 += arg2;
									local1376.anInt3801 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local159 = this.anIntArrayArray9[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass249Array1[local159[local161]];
									local1376.anInt3798 = local1376.anInt3798 * arg2 >> 7;
									local1376.anInt3797 = local1376.anInt3797 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray9 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray9.length) {
							local159 = this.anIntArrayArray9[local29];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1376 = this.aClass249Array1[local159[local161]];
								local1376.anInt3802 = local1376.anInt3802 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray10 != null) {
				local1058 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray10.length) {
						local46 = this.anIntArrayArray10[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							local271 = this.aShortArray16[local56] & 0xFFFF;
							local289 = local271 >> 10 & 0x3F;
							local746 = local271 >> 7 & 0x7;
							local752 = local271 & 0x7F;
							@Pc(1237) int local1237 = local289 + arg2 & 0x3F;
							local746 += arg3 / 4;
							if (local746 < 0) {
								local746 = 0;
							} else if (local746 > 7) {
								local746 = 7;
							}
							local752 += arg4;
							if (local752 < 0) {
								local752 = 0;
							} else if (local752 > 127) {
								local752 = 127;
							}
							this.aShortArray16[local56] = (short) (local1237 << 10 | local746 << 7 | local752);
						}
						local1058 |= local46.length > 0;
					}
				}
				if (local1058) {
					if (this.aClass261Array1 != null) {
						for (local29 = 0; local29 < this.anInt545; local29++) {
							local1143 = this.aClass261Array1[local29];
							local1148 = this.aClass249Array1[local29];
							local1148.anInt3799 = local1148.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local1143.anInt4201] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5267();
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "cr", descriptor = "(I[IIIIIZ)V", line = 2236)
	@Override
	void method5345(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			this.anInt528 = 0;
			this.anInt527 = 0;
			this.anInt546 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray8.length) {
					local46 = this.anIntArrayArray8[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						this.anInt528 += this.anIntArray62[local56];
						this.anInt527 += this.anIntArray54[local56];
						this.anInt546 += this.anIntArray55[local56];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				this.anInt528 = this.anInt528 / local18 + local8;
				this.anInt527 = this.anInt527 / local18 + local12;
				this.anInt546 = this.anInt546 / local18 + local16;
			} else {
				this.anInt528 = local8;
				this.anInt527 = local12;
				this.anInt546 = local16;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local159 = this.anIntArrayArray8[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray62[local48] += local8;
						this.anIntArray54[local48] += local12;
						this.anIntArray55[local48] += local16;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(289) int local289;
		@Pc(746) int local746;
		@Pc(752) int local752;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local159 = this.anIntArrayArray8[local29];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray62[local48] -= this.anInt528;
							this.anIntArray54[local48] -= this.anInt527;
							this.anIntArray55[local48] -= this.anInt546;
							if (arg4 != 0) {
								local56 = Class317.anIntArray419[arg4];
								local271 = Class317.anIntArray420[arg4];
								local289 = this.anIntArray54[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = this.anIntArray54[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							if (arg2 != 0) {
								local56 = Class317.anIntArray419[arg2];
								local271 = Class317.anIntArray420[arg2];
								local289 = this.anIntArray54[local48] * local271 - this.anIntArray55[local48] * local56 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray54[local48] * local56 + this.anIntArray55[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class317.anIntArray419[arg3];
								local271 = Class317.anIntArray420[arg3];
								local289 = this.anIntArray55[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray55[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							this.anIntArray62[local48] += this.anInt528;
							this.anIntArray54[local48] += this.anInt527;
							this.anIntArray55[local48] += this.anInt546;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray62[local48] -= this.anInt528;
							this.anIntArray54[local48] -= this.anInt527;
							this.anIntArray55[local48] -= this.anInt546;
							if (arg2 != 0) {
								local56 = Class317.anIntArray419[arg2];
								local271 = Class317.anIntArray420[arg2];
								local289 = this.anIntArray54[local48] * local271 - this.anIntArray55[local48] * local56 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray54[local48] * local56 + this.anIntArray55[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = local289;
							}
							if (arg4 != 0) {
								local56 = Class317.anIntArray419[arg4];
								local271 = Class317.anIntArray420[arg4];
								local289 = this.anIntArray54[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = this.anIntArray54[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class317.anIntArray419[arg3];
								local271 = Class317.anIntArray420[arg3];
								local289 = this.anIntArray55[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray55[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							this.anIntArray62[local48] += this.anInt528;
							this.anIntArray54[local48] += this.anInt527;
							this.anIntArray55[local48] += this.anInt546;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray8.length) {
						local159 = this.anIntArrayArray8[local29];
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							local56 = this.anIntArray56[local48];
							local271 = this.anIntArray56[local48 + 1];
							for (local289 = local56; local289 < local271 && this.aShortArray23[local289] != 0; local289++) {
								local746 = (this.aShortArray23[local289] & 0xFFFF) - 1;
								@Pc(756) int local756;
								@Pc(774) int local774;
								if (arg4 != 0) {
									local752 = Class317.anIntArray419[arg4];
									local756 = Class317.anIntArray420[arg4];
									local774 = this.aShortArray15[local746] * local752 + this.aShortArray14[local746] * local756 + 16383 >> 14;
									this.aShortArray15[local746] = (short) (this.aShortArray15[local746] * local756 - this.aShortArray14[local746] * local752 + 16383 >> 14);
									this.aShortArray14[local746] = (short) local774;
								}
								if (arg2 != 0) {
									local752 = Class317.anIntArray419[arg2];
									local756 = Class317.anIntArray420[arg2];
									local774 = this.aShortArray15[local746] * local756 - this.aShortArray17[local746] * local752 + 16383 >> 14;
									this.aShortArray17[local746] = (short) (this.aShortArray15[local746] * local752 + this.aShortArray17[local746] * local756 + 16383 >> 14);
									this.aShortArray15[local746] = (short) local774;
								}
								if (arg3 != 0) {
									local752 = Class317.anIntArray419[arg3];
									local756 = Class317.anIntArray420[arg3];
									local774 = this.aShortArray17[local746] * local752 + this.aShortArray14[local746] * local756 + 16383 >> 14;
									this.aShortArray17[local746] = (short) (this.aShortArray17[local746] * local756 - this.aShortArray14[local746] * local752 + 16383 >> 14);
									this.aShortArray14[local746] = (short) local774;
								}
							}
						}
					}
				}
				this.method5268();
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local159 = this.anIntArrayArray8[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray62[local48] -= this.anInt528;
						this.anIntArray54[local48] -= this.anInt527;
						this.anIntArray55[local48] -= this.anInt546;
						this.anIntArray62[local48] = this.anIntArray62[local48] * arg2 >> 7;
						this.anIntArray54[local48] = this.anIntArray54[local48] * arg3 >> 7;
						this.anIntArray55[local48] = this.anIntArray55[local48] * arg4 >> 7;
						this.anIntArray62[local48] += this.anInt528;
						this.anIntArray54[local48] += this.anInt527;
						this.anIntArray55[local48] += this.anInt546;
					}
				}
			}
		} else {
			@Pc(1058) boolean local1058;
			@Pc(1143) Class261 local1143;
			@Pc(1148) Class249 local1148;
			if (arg0 == 5) {
				if (this.anIntArrayArray10 != null) {
					local1058 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray10.length) {
							local46 = this.anIntArrayArray10[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								local271 = (this.aByteArray8[local56] & 0xFF) + arg2 * 8;
								if (local271 < 0) {
									local271 = 0;
								} else if (local271 > 255) {
									local271 = 255;
								}
								this.aByteArray8[local56] = (byte) local271;
							}
							local1058 |= local46.length > 0;
						}
					}
					if (local1058) {
						if (this.aClass261Array1 != null) {
							for (local29 = 0; local29 < this.anInt545; local29++) {
								local1143 = this.aClass261Array1[local29];
								local1148 = this.aClass249Array1[local29];
								local1148.anInt3799 = local1148.anInt3799 & 0xFFFFFF | 255 - (this.aByteArray8[local1143.anInt4201] & 0xFF) << 24;
							}
						}
						this.method5267();
					}
				}
			} else if (arg0 != 7) {
				@Pc(1376) Class249 local1376;
				if (arg0 == 8) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local159 = this.anIntArrayArray9[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass249Array1[local159[local161]];
									local1376.anInt3800 += arg2;
									local1376.anInt3801 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local159 = this.anIntArrayArray9[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass249Array1[local159[local161]];
									local1376.anInt3798 = local1376.anInt3798 * arg2 >> 7;
									local1376.anInt3797 = local1376.anInt3797 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray9 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray9.length) {
							local159 = this.anIntArrayArray9[local29];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1376 = this.aClass249Array1[local159[local161]];
								local1376.anInt3802 = local1376.anInt3802 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray10 != null) {
				local1058 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray10.length) {
						local46 = this.anIntArrayArray10[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							local271 = this.aShortArray16[local56] & 0xFFFF;
							local289 = local271 >> 10 & 0x3F;
							local746 = local271 >> 7 & 0x7;
							local752 = local271 & 0x7F;
							@Pc(1237) int local1237 = local289 + arg2 & 0x3F;
							local746 += arg3 / 4;
							if (local746 < 0) {
								local746 = 0;
							} else if (local746 > 7) {
								local746 = 7;
							}
							local752 += arg4;
							if (local752 < 0) {
								local752 = 0;
							} else if (local752 > 127) {
								local752 = 127;
							}
							this.aShortArray16[local56] = (short) (local1237 << 10 | local746 << 7 | local752);
						}
						local1058 |= local46.length > 0;
					}
				}
				if (local1058) {
					if (this.aClass261Array1 != null) {
						for (local29 = 0; local29 < this.anInt545; local29++) {
							local1143 = this.aClass261Array1[local29];
							local1148 = this.aClass249Array1[local29];
							local1148.anInt3799 = local1148.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local1143.anInt4201] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5267();
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "ak", descriptor = "(I[IIIIIZ)V", line = 2236)
	@Override
	void method5347(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(2) int local2 = arg1.length;
		@Pc(18) int local18;
		@Pc(29) int local29;
		@Pc(56) int local56;
		@Pc(8) int local8;
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(36) int local36;
		@Pc(46) int[] local46;
		@Pc(48) int local48;
		if (arg0 == 0) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			local18 = 0;
			this.anInt528 = 0;
			this.anInt527 = 0;
			this.anInt546 = 0;
			for (local29 = 0; local29 < local2; local29++) {
				local36 = arg1[local29];
				if (local36 < this.anIntArrayArray8.length) {
					local46 = this.anIntArrayArray8[local36];
					for (local48 = 0; local48 < local46.length; local48++) {
						local56 = local46[local48];
						this.anInt528 += this.anIntArray62[local56];
						this.anInt527 += this.anIntArray54[local56];
						this.anInt546 += this.anIntArray55[local56];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				this.anInt528 = this.anInt528 / local18 + local8;
				this.anInt527 = this.anInt527 / local18 + local12;
				this.anInt546 = this.anInt546 / local18 + local16;
			} else {
				this.anInt528 = local8;
				this.anInt527 = local12;
				this.anInt546 = local16;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local8 = arg2 << 4;
			local12 = arg3 << 4;
			local16 = arg4 << 4;
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local159 = this.anIntArrayArray8[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray62[local48] += local8;
						this.anIntArray54[local48] += local12;
						this.anIntArray55[local48] += local16;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(289) int local289;
		@Pc(746) int local746;
		@Pc(752) int local752;
		if (arg0 == 2) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local159 = this.anIntArrayArray8[local29];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray62[local48] -= this.anInt528;
							this.anIntArray54[local48] -= this.anInt527;
							this.anIntArray55[local48] -= this.anInt546;
							if (arg4 != 0) {
								local56 = Class317.anIntArray419[arg4];
								local271 = Class317.anIntArray420[arg4];
								local289 = this.anIntArray54[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = this.anIntArray54[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							if (arg2 != 0) {
								local56 = Class317.anIntArray419[arg2];
								local271 = Class317.anIntArray420[arg2];
								local289 = this.anIntArray54[local48] * local271 - this.anIntArray55[local48] * local56 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray54[local48] * local56 + this.anIntArray55[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class317.anIntArray419[arg3];
								local271 = Class317.anIntArray420[arg3];
								local289 = this.anIntArray55[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray55[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							this.anIntArray62[local48] += this.anInt528;
							this.anIntArray54[local48] += this.anInt527;
							this.anIntArray55[local48] += this.anInt546;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							this.anIntArray62[local48] -= this.anInt528;
							this.anIntArray54[local48] -= this.anInt527;
							this.anIntArray55[local48] -= this.anInt546;
							if (arg2 != 0) {
								local56 = Class317.anIntArray419[arg2];
								local271 = Class317.anIntArray420[arg2];
								local289 = this.anIntArray54[local48] * local271 - this.anIntArray55[local48] * local56 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray54[local48] * local56 + this.anIntArray55[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = local289;
							}
							if (arg4 != 0) {
								local56 = Class317.anIntArray419[arg4];
								local271 = Class317.anIntArray420[arg4];
								local289 = this.anIntArray54[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray54[local48] = this.anIntArray54[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							if (arg3 != 0) {
								local56 = Class317.anIntArray419[arg3];
								local271 = Class317.anIntArray420[arg3];
								local289 = this.anIntArray55[local48] * local56 + this.anIntArray62[local48] * local271 + 16383 >> 14;
								this.anIntArray55[local48] = this.anIntArray55[local48] * local271 - this.anIntArray62[local48] * local56 + 16383 >> 14;
								this.anIntArray62[local48] = local289;
							}
							this.anIntArray62[local48] += this.anInt528;
							this.anIntArray54[local48] += this.anInt527;
							this.anIntArray55[local48] += this.anInt546;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local29 = arg1[local18];
					if (local29 < this.anIntArrayArray8.length) {
						local159 = this.anIntArrayArray8[local29];
						for (local161 = 0; local161 < local159.length; local161++) {
							local48 = local159[local161];
							local56 = this.anIntArray56[local48];
							local271 = this.anIntArray56[local48 + 1];
							for (local289 = local56; local289 < local271 && this.aShortArray23[local289] != 0; local289++) {
								local746 = (this.aShortArray23[local289] & 0xFFFF) - 1;
								@Pc(756) int local756;
								@Pc(774) int local774;
								if (arg4 != 0) {
									local752 = Class317.anIntArray419[arg4];
									local756 = Class317.anIntArray420[arg4];
									local774 = this.aShortArray15[local746] * local752 + this.aShortArray14[local746] * local756 + 16383 >> 14;
									this.aShortArray15[local746] = (short) (this.aShortArray15[local746] * local756 - this.aShortArray14[local746] * local752 + 16383 >> 14);
									this.aShortArray14[local746] = (short) local774;
								}
								if (arg2 != 0) {
									local752 = Class317.anIntArray419[arg2];
									local756 = Class317.anIntArray420[arg2];
									local774 = this.aShortArray15[local746] * local756 - this.aShortArray17[local746] * local752 + 16383 >> 14;
									this.aShortArray17[local746] = (short) (this.aShortArray15[local746] * local752 + this.aShortArray17[local746] * local756 + 16383 >> 14);
									this.aShortArray15[local746] = (short) local774;
								}
								if (arg3 != 0) {
									local752 = Class317.anIntArray419[arg3];
									local756 = Class317.anIntArray420[arg3];
									local774 = this.aShortArray17[local746] * local752 + this.aShortArray14[local746] * local756 + 16383 >> 14;
									this.aShortArray17[local746] = (short) (this.aShortArray17[local746] * local756 - this.aShortArray14[local746] * local752 + 16383 >> 14);
									this.aShortArray14[local746] = (short) local774;
								}
							}
						}
					}
				}
				this.method5268();
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local29 = arg1[local18];
				if (local29 < this.anIntArrayArray8.length) {
					local159 = this.anIntArrayArray8[local29];
					for (local161 = 0; local161 < local159.length; local161++) {
						local48 = local159[local161];
						this.anIntArray62[local48] -= this.anInt528;
						this.anIntArray54[local48] -= this.anInt527;
						this.anIntArray55[local48] -= this.anInt546;
						this.anIntArray62[local48] = this.anIntArray62[local48] * arg2 >> 7;
						this.anIntArray54[local48] = this.anIntArray54[local48] * arg3 >> 7;
						this.anIntArray55[local48] = this.anIntArray55[local48] * arg4 >> 7;
						this.anIntArray62[local48] += this.anInt528;
						this.anIntArray54[local48] += this.anInt527;
						this.anIntArray55[local48] += this.anInt546;
					}
				}
			}
		} else {
			@Pc(1058) boolean local1058;
			@Pc(1143) Class261 local1143;
			@Pc(1148) Class249 local1148;
			if (arg0 == 5) {
				if (this.anIntArrayArray10 != null) {
					local1058 = false;
					for (local29 = 0; local29 < local2; local29++) {
						local36 = arg1[local29];
						if (local36 < this.anIntArrayArray10.length) {
							local46 = this.anIntArrayArray10[local36];
							for (local48 = 0; local48 < local46.length; local48++) {
								local56 = local46[local48];
								local271 = (this.aByteArray8[local56] & 0xFF) + arg2 * 8;
								if (local271 < 0) {
									local271 = 0;
								} else if (local271 > 255) {
									local271 = 255;
								}
								this.aByteArray8[local56] = (byte) local271;
							}
							local1058 |= local46.length > 0;
						}
					}
					if (local1058) {
						if (this.aClass261Array1 != null) {
							for (local29 = 0; local29 < this.anInt545; local29++) {
								local1143 = this.aClass261Array1[local29];
								local1148 = this.aClass249Array1[local29];
								local1148.anInt3799 = local1148.anInt3799 & 0xFFFFFF | 255 - (this.aByteArray8[local1143.anInt4201] & 0xFF) << 24;
							}
						}
						this.method5267();
					}
				}
			} else if (arg0 != 7) {
				@Pc(1376) Class249 local1376;
				if (arg0 == 8) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local159 = this.anIntArrayArray9[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass249Array1[local159[local161]];
									local1376.anInt3800 += arg2;
									local1376.anInt3801 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray9 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local29 = arg1[local18];
							if (local29 < this.anIntArrayArray9.length) {
								local159 = this.anIntArrayArray9[local29];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1376 = this.aClass249Array1[local159[local161]];
									local1376.anInt3798 = local1376.anInt3798 * arg2 >> 7;
									local1376.anInt3797 = local1376.anInt3797 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray9 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local29 = arg1[local18];
						if (local29 < this.anIntArrayArray9.length) {
							local159 = this.anIntArrayArray9[local29];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1376 = this.aClass249Array1[local159[local161]];
								local1376.anInt3802 = local1376.anInt3802 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray10 != null) {
				local1058 = false;
				for (local29 = 0; local29 < local2; local29++) {
					local36 = arg1[local29];
					if (local36 < this.anIntArrayArray10.length) {
						local46 = this.anIntArrayArray10[local36];
						for (local48 = 0; local48 < local46.length; local48++) {
							local56 = local46[local48];
							local271 = this.aShortArray16[local56] & 0xFFFF;
							local289 = local271 >> 10 & 0x3F;
							local746 = local271 >> 7 & 0x7;
							local752 = local271 & 0x7F;
							@Pc(1237) int local1237 = local289 + arg2 & 0x3F;
							local746 += arg3 / 4;
							if (local746 < 0) {
								local746 = 0;
							} else if (local746 > 7) {
								local746 = 7;
							}
							local752 += arg4;
							if (local752 < 0) {
								local752 = 0;
							} else if (local752 > 127) {
								local752 = 127;
							}
							this.aShortArray16[local56] = (short) (local1237 << 10 | local746 << 7 | local752);
						}
						local1058 |= local46.length > 0;
					}
				}
				if (local1058) {
					if (this.aClass261Array1 != null) {
						for (local29 = 0; local29 < this.anInt545; local29++) {
							local1143 = this.aClass261Array1[local29];
							local1148 = this.aClass249Array1[local29];
							local1148.anInt3799 = local1148.anInt3799 & 0xFF000000 | Class360.anIntArray422[this.aShortArray16[local1143.anInt4201] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5267();
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "an", descriptor = "()V", line = 2539)
	@Override
	void method5350() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt530; local1++) {
			this.anIntArray62[local1] = this.anIntArray62[local1] + 7 >> 4;
			this.anIntArray54[local1] = this.anIntArray54[local1] + 7 >> 4;
			this.anIntArray55[local1] = this.anIntArray55[local1] + 7 >> 4;
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "ci", descriptor = "()V", line = 2539)
	@Override
	void method5361() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt530; local1++) {
			this.anIntArray62[local1] = this.anIntArray62[local1] + 7 >> 4;
			this.anIntArray54[local1] = this.anIntArray54[local1] + 7 >> 4;
			this.anIntArray55[local1] = this.anIntArray55[local1] + 7 >> 4;
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "ch", descriptor = "()V", line = 2539)
	@Override
	void method5419() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt530; local1++) {
			this.anIntArray62[local1] = this.anIntArray62[local1] + 7 >> 4;
			this.anIntArray54[local1] = this.anIntArray54[local1] + 7 >> 4;
			this.anIntArray55[local1] = this.anIntArray55[local1] + 7 >> 4;
		}
		this.method5266();
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!abw", name = "dy", descriptor = "(Lclient!mu;IZ)V", line = 2549)
	@Override
	public void method5429(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray24 == null) {
			return;
		}
		@Pc(5) Class332 local5 = arg0;
		if (arg2) {
			local5 = this.aClass21_Sub3_5.aClass332_38;
			local5.method26209(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt533; local19++) {
			if ((arg1 & this.aShortArray24[local19]) != 0) {
				local5.method26206((float) this.anIntArray62[local19], (float) this.anIntArray54[local19], (float) this.anIntArray55[local19], local17);
				this.anIntArray62[local19] = (int) local17[0];
				this.anIntArray54[local19] = (int) local17[1];
				this.anIntArray55[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "dg", descriptor = "(Lclient!mu;IZ)V", line = 2549)
	@Override
	public void method5480(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray24 == null) {
			return;
		}
		@Pc(5) Class332 local5 = arg0;
		if (arg2) {
			local5 = this.aClass21_Sub3_5.aClass332_38;
			local5.method26209(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt533; local19++) {
			if ((arg1 & this.aShortArray24[local19]) != 0) {
				local5.method26206((float) this.anIntArray62[local19], (float) this.anIntArray54[local19], (float) this.anIntArray55[local19], local17);
				this.anIntArray62[local19] = (int) local17[0];
				this.anIntArray54[local19] = (int) local17[1];
				this.anIntArray55[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "aj", descriptor = "(Lclient!mu;IZ)V", line = 2549)
	@Override
	public void method5351(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray24 == null) {
			return;
		}
		@Pc(5) Class332 local5 = arg0;
		if (arg2) {
			local5 = this.aClass21_Sub3_5.aClass332_38;
			local5.method26209(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt533; local19++) {
			if ((arg1 & this.aShortArray24[local19]) != 0) {
				local5.method26206((float) this.anIntArray62[local19], (float) this.anIntArray54[local19], (float) this.anIntArray55[local19], local17);
				this.anIntArray62[local19] = (int) local17[0];
				this.anIntArray54[local19] = (int) local17[1];
				this.anIntArray55[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "bg", descriptor = "()[Lclient!cd;", line = 2566)
	@Override
	public Class109[] method5379() {
		return this.aClass109Array2;
	}

	@OriginalMember(owner = "client!abw", name = "fm", descriptor = "()[Lclient!cd;", line = 2566)
	@Override
	public Class109[] method5477() {
		return this.aClass109Array2;
	}

	@OriginalMember(owner = "client!abw", name = "bk", descriptor = "()[Lclient!dt;", line = 2570)
	@Override
	public Class135[] method5378() {
		return this.aClass135Array2;
	}

	@OriginalMember(owner = "client!abw", name = "fe", descriptor = "()[Lclient!dt;", line = 2570)
	@Override
	public Class135[] method5384() {
		return this.aClass135Array2;
	}

	@OriginalMember(owner = "client!abw", name = "dd", descriptor = "(Lclient!mu;)V", line = 2574)
	@Override
	public void method5436(@OriginalArg(0) Class332 arg0) {
		@Pc(3) Class328 local3 = this.aClass21_Sub3_5.aClass328_86;
		local3.method26056(arg0);
		@Pc(11) int local11;
		if (this.aClass135Array2 != null) {
			for (local11 = 0; local11 < this.aClass135Array2.length; local11++) {
				@Pc(21) Class135 local21 = this.aClass135Array2[local11];
				@Pc(23) Class135 local23 = local21;
				if (local21.aClass135_1 != null) {
					local23 = local21.aClass135_1;
				}
				local23.anInt3391 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray62[local21.anInt3387 * 1769457087] + local3.aFloatArray106[4] * (float) this.anIntArray54[local21.anInt3387 * 1769457087] + local3.aFloatArray106[8] * (float) this.anIntArray55[local21.anInt3387 * 1769457087]) * -976519565;
				local23.anInt3390 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray62[local21.anInt3387 * 1769457087] + local3.aFloatArray106[5] * (float) this.anIntArray54[local21.anInt3387 * 1769457087] + local3.aFloatArray106[9] * (float) this.anIntArray55[local21.anInt3387 * 1769457087]) * 458577149;
				local23.anInt3385 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray62[local21.anInt3387 * 1769457087] + local3.aFloatArray106[6] * (float) this.anIntArray54[local21.anInt3387 * 1769457087] + local3.aFloatArray106[10] * (float) this.anIntArray55[local21.anInt3387 * 1769457087]) * -1599219563;
				local23.anInt3392 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray62[local21.anInt3388 * -2046385949] + local3.aFloatArray106[4] * (float) this.anIntArray54[local21.anInt3388 * -2046385949] + local3.aFloatArray106[8] * (float) this.anIntArray55[local21.anInt3388 * -2046385949]) * 506106203;
				local23.anInt3384 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray62[local21.anInt3388 * -2046385949] + local3.aFloatArray106[5] * (float) this.anIntArray54[local21.anInt3388 * -2046385949] + local3.aFloatArray106[9] * (float) this.anIntArray55[local21.anInt3388 * -2046385949]) * 1565185457;
				local23.anInt3394 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray62[local21.anInt3388 * -2046385949] + local3.aFloatArray106[6] * (float) this.anIntArray54[local21.anInt3388 * -2046385949] + local3.aFloatArray106[10] * (float) this.anIntArray55[local21.anInt3388 * -2046385949]) * 568173405;
				local23.anInt3395 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray62[local21.anInt3389 * 2144051441] + local3.aFloatArray106[4] * (float) this.anIntArray54[local21.anInt3389 * 2144051441] + local3.aFloatArray106[8] * (float) this.anIntArray55[local21.anInt3389 * 2144051441]) * 590275719;
				local23.anInt3396 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray62[local21.anInt3389 * 2144051441] + local3.aFloatArray106[5] * (float) this.anIntArray54[local21.anInt3389 * 2144051441] + local3.aFloatArray106[9] * (float) this.anIntArray55[local21.anInt3389 * 2144051441]) * -866719829;
				local23.anInt3397 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray62[local21.anInt3389 * 2144051441] + local3.aFloatArray106[6] * (float) this.anIntArray54[local21.anInt3389 * 2144051441] + local3.aFloatArray106[10] * (float) this.anIntArray55[local21.anInt3389 * 2144051441]) * -1133642555;
			}
		}
		if (this.aClass109Array2 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass109Array2.length; local11++) {
			@Pc(505) Class109 local505 = this.aClass109Array2[local11];
			@Pc(507) Class109 local507 = local505;
			if (local505.aClass109_2 != null) {
				local507 = local505.aClass109_2;
			}
			if (local505.aClass328_95 == null) {
				local505.aClass328_95 = new Class328(local3);
			} else {
				local505.aClass328_95.method26104(local3);
			}
			local507.anInt2993 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray62[local505.anInt2997 * -193228163] + local3.aFloatArray106[4] * (float) this.anIntArray54[local505.anInt2997 * -193228163] + local3.aFloatArray106[8] * (float) this.anIntArray55[local505.anInt2997 * -193228163]) * 635550127;
			local507.anInt2995 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray62[local505.anInt2997 * -193228163] + local3.aFloatArray106[5] * (float) this.anIntArray54[local505.anInt2997 * -193228163] + local3.aFloatArray106[9] * (float) this.anIntArray55[local505.anInt2997 * -193228163]) * -698189527;
			local507.anInt2996 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray62[local505.anInt2997 * -193228163] + local3.aFloatArray106[6] * (float) this.anIntArray54[local505.anInt2997 * -193228163] + local3.aFloatArray106[10] * (float) this.anIntArray55[local505.anInt2997 * -193228163]) * 965917875;
		}
	}

	@OriginalMember(owner = "client!abw", name = "bt", descriptor = "(Lclient!mu;)V", line = 2574)
	@Override
	public void method5463(@OriginalArg(0) Class332 arg0) {
		@Pc(3) Class328 local3 = this.aClass21_Sub3_5.aClass328_86;
		local3.method26056(arg0);
		@Pc(11) int local11;
		if (this.aClass135Array2 != null) {
			for (local11 = 0; local11 < this.aClass135Array2.length; local11++) {
				@Pc(21) Class135 local21 = this.aClass135Array2[local11];
				@Pc(23) Class135 local23 = local21;
				if (local21.aClass135_1 != null) {
					local23 = local21.aClass135_1;
				}
				local23.anInt3391 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray62[local21.anInt3387 * 1769457087] + local3.aFloatArray106[4] * (float) this.anIntArray54[local21.anInt3387 * 1769457087] + local3.aFloatArray106[8] * (float) this.anIntArray55[local21.anInt3387 * 1769457087]) * -976519565;
				local23.anInt3390 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray62[local21.anInt3387 * 1769457087] + local3.aFloatArray106[5] * (float) this.anIntArray54[local21.anInt3387 * 1769457087] + local3.aFloatArray106[9] * (float) this.anIntArray55[local21.anInt3387 * 1769457087]) * 458577149;
				local23.anInt3385 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray62[local21.anInt3387 * 1769457087] + local3.aFloatArray106[6] * (float) this.anIntArray54[local21.anInt3387 * 1769457087] + local3.aFloatArray106[10] * (float) this.anIntArray55[local21.anInt3387 * 1769457087]) * -1599219563;
				local23.anInt3392 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray62[local21.anInt3388 * -2046385949] + local3.aFloatArray106[4] * (float) this.anIntArray54[local21.anInt3388 * -2046385949] + local3.aFloatArray106[8] * (float) this.anIntArray55[local21.anInt3388 * -2046385949]) * 506106203;
				local23.anInt3384 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray62[local21.anInt3388 * -2046385949] + local3.aFloatArray106[5] * (float) this.anIntArray54[local21.anInt3388 * -2046385949] + local3.aFloatArray106[9] * (float) this.anIntArray55[local21.anInt3388 * -2046385949]) * 1565185457;
				local23.anInt3394 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray62[local21.anInt3388 * -2046385949] + local3.aFloatArray106[6] * (float) this.anIntArray54[local21.anInt3388 * -2046385949] + local3.aFloatArray106[10] * (float) this.anIntArray55[local21.anInt3388 * -2046385949]) * 568173405;
				local23.anInt3395 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray62[local21.anInt3389 * 2144051441] + local3.aFloatArray106[4] * (float) this.anIntArray54[local21.anInt3389 * 2144051441] + local3.aFloatArray106[8] * (float) this.anIntArray55[local21.anInt3389 * 2144051441]) * 590275719;
				local23.anInt3396 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray62[local21.anInt3389 * 2144051441] + local3.aFloatArray106[5] * (float) this.anIntArray54[local21.anInt3389 * 2144051441] + local3.aFloatArray106[9] * (float) this.anIntArray55[local21.anInt3389 * 2144051441]) * -866719829;
				local23.anInt3397 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray62[local21.anInt3389 * 2144051441] + local3.aFloatArray106[6] * (float) this.anIntArray54[local21.anInt3389 * 2144051441] + local3.aFloatArray106[10] * (float) this.anIntArray55[local21.anInt3389 * 2144051441]) * -1133642555;
			}
		}
		if (this.aClass109Array2 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass109Array2.length; local11++) {
			@Pc(505) Class109 local505 = this.aClass109Array2[local11];
			@Pc(507) Class109 local507 = local505;
			if (local505.aClass109_2 != null) {
				local507 = local505.aClass109_2;
			}
			if (local505.aClass328_95 == null) {
				local505.aClass328_95 = new Class328(local3);
			} else {
				local505.aClass328_95.method26104(local3);
			}
			local507.anInt2993 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray62[local505.anInt2997 * -193228163] + local3.aFloatArray106[4] * (float) this.anIntArray54[local505.anInt2997 * -193228163] + local3.aFloatArray106[8] * (float) this.anIntArray55[local505.anInt2997 * -193228163]) * 635550127;
			local507.anInt2995 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray62[local505.anInt2997 * -193228163] + local3.aFloatArray106[5] * (float) this.anIntArray54[local505.anInt2997 * -193228163] + local3.aFloatArray106[9] * (float) this.anIntArray55[local505.anInt2997 * -193228163]) * -698189527;
			local507.anInt2996 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray62[local505.anInt2997 * -193228163] + local3.aFloatArray106[6] * (float) this.anIntArray54[local505.anInt2997 * -193228163] + local3.aFloatArray106[10] * (float) this.anIntArray55[local505.anInt2997 * -193228163]) * 965917875;
		}
	}

	@OriginalMember(owner = "client!abw", name = "dt", descriptor = "(Lclient!mu;)V", line = 2574)
	@Override
	public void method5435(@OriginalArg(0) Class332 arg0) {
		@Pc(3) Class328 local3 = this.aClass21_Sub3_5.aClass328_86;
		local3.method26056(arg0);
		@Pc(11) int local11;
		if (this.aClass135Array2 != null) {
			for (local11 = 0; local11 < this.aClass135Array2.length; local11++) {
				@Pc(21) Class135 local21 = this.aClass135Array2[local11];
				@Pc(23) Class135 local23 = local21;
				if (local21.aClass135_1 != null) {
					local23 = local21.aClass135_1;
				}
				local23.anInt3391 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray62[local21.anInt3387 * 1769457087] + local3.aFloatArray106[4] * (float) this.anIntArray54[local21.anInt3387 * 1769457087] + local3.aFloatArray106[8] * (float) this.anIntArray55[local21.anInt3387 * 1769457087]) * -976519565;
				local23.anInt3390 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray62[local21.anInt3387 * 1769457087] + local3.aFloatArray106[5] * (float) this.anIntArray54[local21.anInt3387 * 1769457087] + local3.aFloatArray106[9] * (float) this.anIntArray55[local21.anInt3387 * 1769457087]) * 458577149;
				local23.anInt3385 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray62[local21.anInt3387 * 1769457087] + local3.aFloatArray106[6] * (float) this.anIntArray54[local21.anInt3387 * 1769457087] + local3.aFloatArray106[10] * (float) this.anIntArray55[local21.anInt3387 * 1769457087]) * -1599219563;
				local23.anInt3392 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray62[local21.anInt3388 * -2046385949] + local3.aFloatArray106[4] * (float) this.anIntArray54[local21.anInt3388 * -2046385949] + local3.aFloatArray106[8] * (float) this.anIntArray55[local21.anInt3388 * -2046385949]) * 506106203;
				local23.anInt3384 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray62[local21.anInt3388 * -2046385949] + local3.aFloatArray106[5] * (float) this.anIntArray54[local21.anInt3388 * -2046385949] + local3.aFloatArray106[9] * (float) this.anIntArray55[local21.anInt3388 * -2046385949]) * 1565185457;
				local23.anInt3394 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray62[local21.anInt3388 * -2046385949] + local3.aFloatArray106[6] * (float) this.anIntArray54[local21.anInt3388 * -2046385949] + local3.aFloatArray106[10] * (float) this.anIntArray55[local21.anInt3388 * -2046385949]) * 568173405;
				local23.anInt3395 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray62[local21.anInt3389 * 2144051441] + local3.aFloatArray106[4] * (float) this.anIntArray54[local21.anInt3389 * 2144051441] + local3.aFloatArray106[8] * (float) this.anIntArray55[local21.anInt3389 * 2144051441]) * 590275719;
				local23.anInt3396 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray62[local21.anInt3389 * 2144051441] + local3.aFloatArray106[5] * (float) this.anIntArray54[local21.anInt3389 * 2144051441] + local3.aFloatArray106[9] * (float) this.anIntArray55[local21.anInt3389 * 2144051441]) * -866719829;
				local23.anInt3397 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray62[local21.anInt3389 * 2144051441] + local3.aFloatArray106[6] * (float) this.anIntArray54[local21.anInt3389 * 2144051441] + local3.aFloatArray106[10] * (float) this.anIntArray55[local21.anInt3389 * 2144051441]) * -1133642555;
			}
		}
		if (this.aClass109Array2 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass109Array2.length; local11++) {
			@Pc(505) Class109 local505 = this.aClass109Array2[local11];
			@Pc(507) Class109 local507 = local505;
			if (local505.aClass109_2 != null) {
				local507 = local505.aClass109_2;
			}
			if (local505.aClass328_95 == null) {
				local505.aClass328_95 = new Class328(local3);
			} else {
				local505.aClass328_95.method26104(local3);
			}
			local507.anInt2993 = (int) (local3.aFloatArray106[12] + local3.aFloatArray106[0] * (float) this.anIntArray62[local505.anInt2997 * -193228163] + local3.aFloatArray106[4] * (float) this.anIntArray54[local505.anInt2997 * -193228163] + local3.aFloatArray106[8] * (float) this.anIntArray55[local505.anInt2997 * -193228163]) * 635550127;
			local507.anInt2995 = (int) (local3.aFloatArray106[13] + local3.aFloatArray106[1] * (float) this.anIntArray62[local505.anInt2997 * -193228163] + local3.aFloatArray106[5] * (float) this.anIntArray54[local505.anInt2997 * -193228163] + local3.aFloatArray106[9] * (float) this.anIntArray55[local505.anInt2997 * -193228163]) * -698189527;
			local507.anInt2996 = (int) (local3.aFloatArray106[14] + local3.aFloatArray106[2] * (float) this.anIntArray62[local505.anInt2997 * -193228163] + local3.aFloatArray106[6] * (float) this.anIntArray54[local505.anInt2997 * -193228163] + local3.aFloatArray106[10] * (float) this.anIntArray55[local505.anInt2997 * -193228163]) * 965917875;
		}
	}

	@OriginalMember(owner = "client!abw", name = "ai", descriptor = "(IILclient!mu;ZI)Z", line = 2607)
	@Override
	public boolean method5417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5291(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abw", name = "dr", descriptor = "(IILclient!mu;ZI)Z", line = 2607)
	@Override
	public boolean method5433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5291(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abw", name = "dc", descriptor = "(IILclient!mu;ZI)Z", line = 2607)
	@Override
	public boolean method5434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5291(arg0, arg1, 0, 0, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abw", name = "ip", descriptor = "(IIIILclient!mu;ZI)Z", line = 2611)
	boolean method5274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class332 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class328 local3 = this.aClass21_Sub3_5.aClass328_86;
		local3.method26056(arg4);
		local3.method26046(this.aClass21_Sub3_5.aClass328_84);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(34) int local34 = this.anInt539 - this.anInt538 >> 1;
		@Pc(42) int local42 = this.anInt537 - this.anInt536 >> 1;
		@Pc(50) int local50 = this.anInt541 - this.anInt540 >> 1;
		@Pc(55) int local55 = this.anInt538 + local34;
		@Pc(60) int local60 = this.anInt536 + local42;
		@Pc(65) int local65 = this.anInt540 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray65[0] = local71;
		this.anIntArray63[0] = local77;
		this.anIntArray58[0] = local83;
		this.anIntArray65[1] = local89;
		this.anIntArray63[1] = local77;
		this.anIntArray58[1] = local83;
		this.anIntArray65[2] = local71;
		this.anIntArray63[2] = local95;
		this.anIntArray58[2] = local83;
		this.anIntArray65[3] = local89;
		this.anIntArray63[3] = local95;
		this.anIntArray58[3] = local83;
		this.anIntArray65[4] = local71;
		this.anIntArray63[4] = local77;
		this.anIntArray58[4] = local101;
		this.anIntArray65[5] = local89;
		this.anIntArray63[5] = local77;
		this.anIntArray58[5] = local101;
		this.anIntArray65[6] = local71;
		this.anIntArray63[6] = local95;
		this.anIntArray58[6] = local101;
		this.anIntArray65[7] = local89;
		this.anIntArray63[7] = local95;
		this.anIntArray58[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray65[local223];
			local238 = this.anIntArray63[local223];
			local244 = this.anIntArray58[local223];
			local270 = local3.aFloatArray106[2] * local232 + local3.aFloatArray106[6] * local238 + local3.aFloatArray106[10] * local244 + local3.aFloatArray106[14];
			local296 = local3.aFloatArray106[3] * local232 + local3.aFloatArray106[7] * local238 + local3.aFloatArray106[11] * local244 + local3.aFloatArray106[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray106[0] * local232 + local3.aFloatArray106[4] * local238 + local3.aFloatArray106[8] * local244 + local3.aFloatArray106[12];
				local353 = local3.aFloatArray106[1] * local232 + local3.aFloatArray106[5] * local238 + local3.aFloatArray106[9] * local244 + local3.aFloatArray106[13];
				@Pc(365) float local365 = this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local327 / local296;
				@Pc(377) float local377 = this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local353 / local296;
				if (local365 < local15) {
					local15 = local365;
				}
				if (local365 > local17) {
					local17 = local365;
				}
				if (local377 < local19) {
					local19 = local377;
				}
				if (local377 > local21) {
					local21 = local377;
				}
				local13 = true;
			}
		}
		local223 = arg0 + arg2;
		@Pc(413) int local413 = arg1 + arg3;
		if (local13 && (float) local223 > local15 && (float) arg0 < local17 && (float) local413 > local19 && (float) arg1 < local21) {
			if (arg5) {
				return true;
			}
			if (this.anIntArray61.length < this.anInt544) {
				this.anIntArray61 = new int[this.anInt544];
				this.anIntArray64 = new int[this.anInt544];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt533; local457++) {
				local232 = this.anIntArray62[local457];
				local238 = this.anIntArray54[local457];
				local244 = this.anIntArray55[local457];
				local270 = local3.aFloatArray106[2] * local232 + local3.aFloatArray106[6] * local238 + local3.aFloatArray106[10] * local244 + local3.aFloatArray106[14];
				local296 = local3.aFloatArray106[3] * local232 + local3.aFloatArray106[7] * local238 + local3.aFloatArray106[11] * local244 + local3.aFloatArray106[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray106[0] * local232 + local3.aFloatArray106[4] * local238 + local3.aFloatArray106[8] * local244 + local3.aFloatArray106[12];
					local353 = local3.aFloatArray106[1] * local232 + local3.aFloatArray106[5] * local238 + local3.aFloatArray106[9] * local244 + local3.aFloatArray106[13];
					local593 = this.anIntArray56[local457];
					local600 = this.anIntArray56[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray23[local602] != 0; local602++) {
						local620 = (this.aShortArray23[local602] & 0xFFFF) - 1;
						this.anIntArray61[local620] = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local327 / local296);
						this.anIntArray64[local620] = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray56[local457];
					local600 = this.anIntArray56[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray23[local602] != 0; local602++) {
						local620 = (this.aShortArray23[local602] & 0xFFFF) - 1;
						this.anIntArray61[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt531; local457++) {
				if (this.anIntArray61[this.aShortArray18[local457] & 0xFFFF] != -999999 && this.anIntArray61[this.aShortArray22[local457] & 0xFFFF] != -999999 && this.anIntArray61[this.aShortArray19[local457] & 0xFFFF] != -999999 && this.method5279(arg0, arg1, local223, local413, this.anIntArray64[this.aShortArray18[local457] & 0xFFFF], this.anIntArray64[this.aShortArray22[local457] & 0xFFFF], this.anIntArray64[this.aShortArray19[local457] & 0xFFFF], this.anIntArray61[this.aShortArray18[local457] & 0xFFFF], this.anIntArray61[this.aShortArray22[local457] & 0xFFFF], this.anIntArray61[this.aShortArray19[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!abw", name = "hd", descriptor = "(IIIILclient!mu;ZI)Z", line = 2611)
	boolean method5291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class332 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class328 local3 = this.aClass21_Sub3_5.aClass328_86;
		local3.method26056(arg4);
		local3.method26046(this.aClass21_Sub3_5.aClass328_84);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(34) int local34 = this.anInt539 - this.anInt538 >> 1;
		@Pc(42) int local42 = this.anInt537 - this.anInt536 >> 1;
		@Pc(50) int local50 = this.anInt541 - this.anInt540 >> 1;
		@Pc(55) int local55 = this.anInt538 + local34;
		@Pc(60) int local60 = this.anInt536 + local42;
		@Pc(65) int local65 = this.anInt540 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray65[0] = local71;
		this.anIntArray63[0] = local77;
		this.anIntArray58[0] = local83;
		this.anIntArray65[1] = local89;
		this.anIntArray63[1] = local77;
		this.anIntArray58[1] = local83;
		this.anIntArray65[2] = local71;
		this.anIntArray63[2] = local95;
		this.anIntArray58[2] = local83;
		this.anIntArray65[3] = local89;
		this.anIntArray63[3] = local95;
		this.anIntArray58[3] = local83;
		this.anIntArray65[4] = local71;
		this.anIntArray63[4] = local77;
		this.anIntArray58[4] = local101;
		this.anIntArray65[5] = local89;
		this.anIntArray63[5] = local77;
		this.anIntArray58[5] = local101;
		this.anIntArray65[6] = local71;
		this.anIntArray63[6] = local95;
		this.anIntArray58[6] = local101;
		this.anIntArray65[7] = local89;
		this.anIntArray63[7] = local95;
		this.anIntArray58[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray65[local223];
			local238 = this.anIntArray63[local223];
			local244 = this.anIntArray58[local223];
			local270 = local3.aFloatArray106[2] * local232 + local3.aFloatArray106[6] * local238 + local3.aFloatArray106[10] * local244 + local3.aFloatArray106[14];
			local296 = local3.aFloatArray106[3] * local232 + local3.aFloatArray106[7] * local238 + local3.aFloatArray106[11] * local244 + local3.aFloatArray106[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray106[0] * local232 + local3.aFloatArray106[4] * local238 + local3.aFloatArray106[8] * local244 + local3.aFloatArray106[12];
				local353 = local3.aFloatArray106[1] * local232 + local3.aFloatArray106[5] * local238 + local3.aFloatArray106[9] * local244 + local3.aFloatArray106[13];
				@Pc(365) float local365 = this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local327 / local296;
				@Pc(377) float local377 = this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local353 / local296;
				if (local365 < local15) {
					local15 = local365;
				}
				if (local365 > local17) {
					local17 = local365;
				}
				if (local377 < local19) {
					local19 = local377;
				}
				if (local377 > local21) {
					local21 = local377;
				}
				local13 = true;
			}
		}
		local223 = arg0 + arg2;
		@Pc(413) int local413 = arg1 + arg3;
		if (local13 && (float) local223 > local15 && (float) arg0 < local17 && (float) local413 > local19 && (float) arg1 < local21) {
			if (arg5) {
				return true;
			}
			if (this.anIntArray61.length < this.anInt544) {
				this.anIntArray61 = new int[this.anInt544];
				this.anIntArray64 = new int[this.anInt544];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt533; local457++) {
				local232 = this.anIntArray62[local457];
				local238 = this.anIntArray54[local457];
				local244 = this.anIntArray55[local457];
				local270 = local3.aFloatArray106[2] * local232 + local3.aFloatArray106[6] * local238 + local3.aFloatArray106[10] * local244 + local3.aFloatArray106[14];
				local296 = local3.aFloatArray106[3] * local232 + local3.aFloatArray106[7] * local238 + local3.aFloatArray106[11] * local244 + local3.aFloatArray106[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray106[0] * local232 + local3.aFloatArray106[4] * local238 + local3.aFloatArray106[8] * local244 + local3.aFloatArray106[12];
					local353 = local3.aFloatArray106[1] * local232 + local3.aFloatArray106[5] * local238 + local3.aFloatArray106[9] * local244 + local3.aFloatArray106[13];
					local593 = this.anIntArray56[local457];
					local600 = this.anIntArray56[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray23[local602] != 0; local602++) {
						local620 = (this.aShortArray23[local602] & 0xFFFF) - 1;
						this.anIntArray61[local620] = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local327 / local296);
						this.anIntArray64[local620] = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray56[local457];
					local600 = this.anIntArray56[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray23[local602] != 0; local602++) {
						local620 = (this.aShortArray23[local602] & 0xFFFF) - 1;
						this.anIntArray61[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt531; local457++) {
				if (this.anIntArray61[this.aShortArray18[local457] & 0xFFFF] != -999999 && this.anIntArray61[this.aShortArray22[local457] & 0xFFFF] != -999999 && this.anIntArray61[this.aShortArray19[local457] & 0xFFFF] != -999999 && this.method5279(arg0, arg1, local223, local413, this.anIntArray64[this.aShortArray18[local457] & 0xFFFF], this.anIntArray64[this.aShortArray22[local457] & 0xFFFF], this.anIntArray64[this.aShortArray19[local457] & 0xFFFF], this.anIntArray61[this.aShortArray18[local457] & 0xFFFF], this.anIntArray61[this.aShortArray22[local457] & 0xFFFF], this.anIntArray61[this.aShortArray19[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!abw", name = "ig", descriptor = "(IIIILclient!mu;ZI)Z", line = 2611)
	boolean method5304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class332 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class328 local3 = this.aClass21_Sub3_5.aClass328_86;
		local3.method26056(arg4);
		local3.method26046(this.aClass21_Sub3_5.aClass328_84);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(34) int local34 = this.anInt539 - this.anInt538 >> 1;
		@Pc(42) int local42 = this.anInt537 - this.anInt536 >> 1;
		@Pc(50) int local50 = this.anInt541 - this.anInt540 >> 1;
		@Pc(55) int local55 = this.anInt538 + local34;
		@Pc(60) int local60 = this.anInt536 + local42;
		@Pc(65) int local65 = this.anInt540 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray65[0] = local71;
		this.anIntArray63[0] = local77;
		this.anIntArray58[0] = local83;
		this.anIntArray65[1] = local89;
		this.anIntArray63[1] = local77;
		this.anIntArray58[1] = local83;
		this.anIntArray65[2] = local71;
		this.anIntArray63[2] = local95;
		this.anIntArray58[2] = local83;
		this.anIntArray65[3] = local89;
		this.anIntArray63[3] = local95;
		this.anIntArray58[3] = local83;
		this.anIntArray65[4] = local71;
		this.anIntArray63[4] = local77;
		this.anIntArray58[4] = local101;
		this.anIntArray65[5] = local89;
		this.anIntArray63[5] = local77;
		this.anIntArray58[5] = local101;
		this.anIntArray65[6] = local71;
		this.anIntArray63[6] = local95;
		this.anIntArray58[6] = local101;
		this.anIntArray65[7] = local89;
		this.anIntArray63[7] = local95;
		this.anIntArray58[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray65[local223];
			local238 = this.anIntArray63[local223];
			local244 = this.anIntArray58[local223];
			local270 = local3.aFloatArray106[2] * local232 + local3.aFloatArray106[6] * local238 + local3.aFloatArray106[10] * local244 + local3.aFloatArray106[14];
			local296 = local3.aFloatArray106[3] * local232 + local3.aFloatArray106[7] * local238 + local3.aFloatArray106[11] * local244 + local3.aFloatArray106[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray106[0] * local232 + local3.aFloatArray106[4] * local238 + local3.aFloatArray106[8] * local244 + local3.aFloatArray106[12];
				local353 = local3.aFloatArray106[1] * local232 + local3.aFloatArray106[5] * local238 + local3.aFloatArray106[9] * local244 + local3.aFloatArray106[13];
				@Pc(365) float local365 = this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local327 / local296;
				@Pc(377) float local377 = this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local353 / local296;
				if (local365 < local15) {
					local15 = local365;
				}
				if (local365 > local17) {
					local17 = local365;
				}
				if (local377 < local19) {
					local19 = local377;
				}
				if (local377 > local21) {
					local21 = local377;
				}
				local13 = true;
			}
		}
		local223 = arg0 + arg2;
		@Pc(413) int local413 = arg1 + arg3;
		if (local13 && (float) local223 > local15 && (float) arg0 < local17 && (float) local413 > local19 && (float) arg1 < local21) {
			if (arg5) {
				return true;
			}
			if (this.anIntArray61.length < this.anInt544) {
				this.anIntArray61 = new int[this.anInt544];
				this.anIntArray64 = new int[this.anInt544];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt533; local457++) {
				local232 = this.anIntArray62[local457];
				local238 = this.anIntArray54[local457];
				local244 = this.anIntArray55[local457];
				local270 = local3.aFloatArray106[2] * local232 + local3.aFloatArray106[6] * local238 + local3.aFloatArray106[10] * local244 + local3.aFloatArray106[14];
				local296 = local3.aFloatArray106[3] * local232 + local3.aFloatArray106[7] * local238 + local3.aFloatArray106[11] * local244 + local3.aFloatArray106[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray106[0] * local232 + local3.aFloatArray106[4] * local238 + local3.aFloatArray106[8] * local244 + local3.aFloatArray106[12];
					local353 = local3.aFloatArray106[1] * local232 + local3.aFloatArray106[5] * local238 + local3.aFloatArray106[9] * local244 + local3.aFloatArray106[13];
					local593 = this.anIntArray56[local457];
					local600 = this.anIntArray56[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray23[local602] != 0; local602++) {
						local620 = (this.aShortArray23[local602] & 0xFFFF) - 1;
						this.anIntArray61[local620] = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local327 / local296);
						this.anIntArray64[local620] = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray56[local457];
					local600 = this.anIntArray56[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray23[local602] != 0; local602++) {
						local620 = (this.aShortArray23[local602] & 0xFFFF) - 1;
						this.anIntArray61[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt531; local457++) {
				if (this.anIntArray61[this.aShortArray18[local457] & 0xFFFF] != -999999 && this.anIntArray61[this.aShortArray22[local457] & 0xFFFF] != -999999 && this.anIntArray61[this.aShortArray19[local457] & 0xFFFF] != -999999 && this.method5279(arg0, arg1, local223, local413, this.anIntArray64[this.aShortArray18[local457] & 0xFFFF], this.anIntArray64[this.aShortArray22[local457] & 0xFFFF], this.anIntArray64[this.aShortArray19[local457] & 0xFFFF], this.anIntArray61[this.aShortArray18[local457] & 0xFFFF], this.anIntArray61[this.aShortArray22[local457] & 0xFFFF], this.anIntArray61[this.aShortArray19[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!abw", name = "ix", descriptor = "(IIIILclient!mu;ZI)Z", line = 2611)
	boolean method5306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class332 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class328 local3 = this.aClass21_Sub3_5.aClass328_86;
		local3.method26056(arg4);
		local3.method26046(this.aClass21_Sub3_5.aClass328_84);
		@Pc(13) boolean local13 = false;
		@Pc(15) float local15 = Float.MAX_VALUE;
		@Pc(17) float local17 = -3.4028235E38F;
		@Pc(19) float local19 = Float.MAX_VALUE;
		@Pc(21) float local21 = -3.4028235E38F;
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(34) int local34 = this.anInt539 - this.anInt538 >> 1;
		@Pc(42) int local42 = this.anInt537 - this.anInt536 >> 1;
		@Pc(50) int local50 = this.anInt541 - this.anInt540 >> 1;
		@Pc(55) int local55 = this.anInt538 + local34;
		@Pc(60) int local60 = this.anInt536 + local42;
		@Pc(65) int local65 = this.anInt540 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg6);
		@Pc(77) int local77 = local60 - (local42 << arg6);
		@Pc(83) int local83 = local65 - (local50 << arg6);
		@Pc(89) int local89 = local55 + (local34 << arg6);
		@Pc(95) int local95 = local60 + (local42 << arg6);
		@Pc(101) int local101 = local65 + (local50 << arg6);
		this.anIntArray65[0] = local71;
		this.anIntArray63[0] = local77;
		this.anIntArray58[0] = local83;
		this.anIntArray65[1] = local89;
		this.anIntArray63[1] = local77;
		this.anIntArray58[1] = local83;
		this.anIntArray65[2] = local71;
		this.anIntArray63[2] = local95;
		this.anIntArray58[2] = local83;
		this.anIntArray65[3] = local89;
		this.anIntArray63[3] = local95;
		this.anIntArray58[3] = local83;
		this.anIntArray65[4] = local71;
		this.anIntArray63[4] = local77;
		this.anIntArray58[4] = local101;
		this.anIntArray65[5] = local89;
		this.anIntArray63[5] = local77;
		this.anIntArray58[5] = local101;
		this.anIntArray65[6] = local71;
		this.anIntArray63[6] = local95;
		this.anIntArray58[6] = local101;
		this.anIntArray65[7] = local89;
		this.anIntArray63[7] = local95;
		this.anIntArray58[7] = local101;
		@Pc(327) float local327;
		@Pc(353) float local353;
		@Pc(270) float local270;
		@Pc(296) float local296;
		@Pc(232) float local232;
		@Pc(238) float local238;
		@Pc(244) float local244;
		@Pc(223) int local223;
		for (local223 = 0; local223 < 8; local223++) {
			local232 = this.anIntArray65[local223];
			local238 = this.anIntArray63[local223];
			local244 = this.anIntArray58[local223];
			local270 = local3.aFloatArray106[2] * local232 + local3.aFloatArray106[6] * local238 + local3.aFloatArray106[10] * local244 + local3.aFloatArray106[14];
			local296 = local3.aFloatArray106[3] * local232 + local3.aFloatArray106[7] * local238 + local3.aFloatArray106[11] * local244 + local3.aFloatArray106[15];
			if (local270 >= -local296) {
				local327 = local3.aFloatArray106[0] * local232 + local3.aFloatArray106[4] * local238 + local3.aFloatArray106[8] * local244 + local3.aFloatArray106[12];
				local353 = local3.aFloatArray106[1] * local232 + local3.aFloatArray106[5] * local238 + local3.aFloatArray106[9] * local244 + local3.aFloatArray106[13];
				@Pc(365) float local365 = this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local327 / local296;
				@Pc(377) float local377 = this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local353 / local296;
				if (local365 < local15) {
					local15 = local365;
				}
				if (local365 > local17) {
					local17 = local365;
				}
				if (local377 < local19) {
					local19 = local377;
				}
				if (local377 > local21) {
					local21 = local377;
				}
				local13 = true;
			}
		}
		local223 = arg0 + arg2;
		@Pc(413) int local413 = arg1 + arg3;
		if (local13 && (float) local223 > local15 && (float) arg0 < local17 && (float) local413 > local19 && (float) arg1 < local21) {
			if (arg5) {
				return true;
			}
			if (this.anIntArray61.length < this.anInt544) {
				this.anIntArray61 = new int[this.anInt544];
				this.anIntArray64 = new int[this.anInt544];
			}
			@Pc(457) int local457;
			for (local457 = 0; local457 < this.anInt533; local457++) {
				local232 = this.anIntArray62[local457];
				local238 = this.anIntArray54[local457];
				local244 = this.anIntArray55[local457];
				local270 = local3.aFloatArray106[2] * local232 + local3.aFloatArray106[6] * local238 + local3.aFloatArray106[10] * local244 + local3.aFloatArray106[14];
				local296 = local3.aFloatArray106[3] * local232 + local3.aFloatArray106[7] * local238 + local3.aFloatArray106[11] * local244 + local3.aFloatArray106[15];
				@Pc(593) int local593;
				@Pc(600) int local600;
				@Pc(602) int local602;
				@Pc(620) int local620;
				if (local270 >= -local296) {
					local327 = local3.aFloatArray106[0] * local232 + local3.aFloatArray106[4] * local238 + local3.aFloatArray106[8] * local244 + local3.aFloatArray106[12];
					local353 = local3.aFloatArray106[1] * local232 + local3.aFloatArray106[5] * local238 + local3.aFloatArray106[9] * local244 + local3.aFloatArray106[13];
					local593 = this.anIntArray56[local457];
					local600 = this.anIntArray56[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray23[local602] != 0; local602++) {
						local620 = (this.aShortArray23[local602] & 0xFFFF) - 1;
						this.anIntArray61[local620] = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local327 / local296);
						this.anIntArray64[local620] = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local353 / local296);
					}
				} else {
					local593 = this.anIntArray56[local457];
					local600 = this.anIntArray56[local457 + 1];
					for (local602 = local593; local602 < local600 && this.aShortArray23[local602] != 0; local602++) {
						local620 = (this.aShortArray23[local602] & 0xFFFF) - 1;
						this.anIntArray61[local620] = -999999;
					}
				}
			}
			for (local457 = 0; local457 < this.anInt531; local457++) {
				if (this.anIntArray61[this.aShortArray18[local457] & 0xFFFF] != -999999 && this.anIntArray61[this.aShortArray22[local457] & 0xFFFF] != -999999 && this.anIntArray61[this.aShortArray19[local457] & 0xFFFF] != -999999 && this.method5279(arg0, arg1, local223, local413, this.anIntArray64[this.aShortArray18[local457] & 0xFFFF], this.anIntArray64[this.aShortArray22[local457] & 0xFFFF], this.anIntArray64[this.aShortArray19[local457] & 0xFFFF], this.anIntArray61[this.aShortArray18[local457] & 0xFFFF], this.anIntArray61[this.aShortArray22[local457] & 0xFFFF], this.anIntArray61[this.aShortArray19[local457] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!abw", name = "ho", descriptor = "(IIIIIIIIII)Z", line = 2726)
	boolean method5279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 < arg4 && arg3 < arg5 && arg3 < arg6) {
			return false;
		} else if (arg1 > arg4 && arg1 > arg5 && arg1 > arg6) {
			return false;
		} else if (arg2 < arg7 && arg2 < arg8 && arg2 < arg9) {
			return false;
		} else {
			return arg0 <= arg7 || arg0 <= arg8 || arg0 <= arg9;
		}
	}

	@OriginalMember(owner = "client!abw", name = "in", descriptor = "(IIIIIIIIII)Z", line = 2726)
	boolean method5307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 < arg4 && arg3 < arg5 && arg3 < arg6) {
			return false;
		} else if (arg1 > arg4 && arg1 > arg5 && arg1 > arg6) {
			return false;
		} else if (arg2 < arg7 && arg2 < arg8 && arg2 < arg9) {
			return false;
		} else {
			return arg0 <= arg7 || arg0 <= arg8 || arg0 <= arg9;
		}
	}

	@OriginalMember(owner = "client!abw", name = "dz", descriptor = "(Lclient!amd;)Lclient!amd;", line = 2734)
	@Override
	public Class3_Sub1_Sub3 method5507(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		if (this.anInt544 == 0) {
			return null;
		}
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass21_Sub3_5.anInt2512 > 0) {
			local29 = this.anInt538 - (this.anInt537 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local45 = this.anInt539 - (this.anInt536 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		} else {
			local29 = this.anInt538 - (this.anInt536 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local45 = this.anInt539 - (this.anInt537 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass21_Sub3_5.anInt2513 > 0) {
			local98 = this.anInt540 - (this.anInt537 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local114 = this.anInt541 - (this.anInt536 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		} else {
			local98 = this.anInt540 - (this.anInt536 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local114 = this.anInt541 - (this.anInt537 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class3_Sub1_Sub3_Sub2 local162 = (Class3_Sub1_Sub3_Sub2) arg0;
		@Pc(171) Class3_Sub1_Sub3_Sub2 local171;
		if (local162 != null && local162.method21275(local153, local159)) {
			local171 = local162;
			local162.method21269();
		} else {
			local171 = new Class3_Sub1_Sub3_Sub2(this.aClass21_Sub3_5, local153, local159);
		}
		local171.method21267(local29, local98, local45, local114);
		this.method5280(local171);
		return local171;
	}

	@OriginalMember(owner = "client!abw", name = "da", descriptor = "(Lclient!amd;)Lclient!amd;", line = 2734)
	@Override
	public Class3_Sub1_Sub3 method5437(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		if (this.anInt544 == 0) {
			return null;
		}
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass21_Sub3_5.anInt2512 > 0) {
			local29 = this.anInt538 - (this.anInt537 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local45 = this.anInt539 - (this.anInt536 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		} else {
			local29 = this.anInt538 - (this.anInt536 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local45 = this.anInt539 - (this.anInt537 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass21_Sub3_5.anInt2513 > 0) {
			local98 = this.anInt540 - (this.anInt537 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local114 = this.anInt541 - (this.anInt536 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		} else {
			local98 = this.anInt540 - (this.anInt536 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local114 = this.anInt541 - (this.anInt537 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class3_Sub1_Sub3_Sub2 local162 = (Class3_Sub1_Sub3_Sub2) arg0;
		@Pc(171) Class3_Sub1_Sub3_Sub2 local171;
		if (local162 != null && local162.method21275(local153, local159)) {
			local171 = local162;
			local162.method21269();
		} else {
			local171 = new Class3_Sub1_Sub3_Sub2(this.aClass21_Sub3_5, local153, local159);
		}
		local171.method21267(local29, local98, local45, local114);
		this.method5280(local171);
		return local171;
	}

	@OriginalMember(owner = "client!abw", name = "aq", descriptor = "(Lclient!amd;)Lclient!amd;", line = 2734)
	@Override
	public Class3_Sub1_Sub3 method5357(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		if (this.anInt544 == 0) {
			return null;
		}
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass21_Sub3_5.anInt2512 > 0) {
			local29 = this.anInt538 - (this.anInt537 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local45 = this.anInt539 - (this.anInt536 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		} else {
			local29 = this.anInt538 - (this.anInt536 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local45 = this.anInt539 - (this.anInt537 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass21_Sub3_5.anInt2513 > 0) {
			local98 = this.anInt540 - (this.anInt537 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local114 = this.anInt541 - (this.anInt536 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		} else {
			local98 = this.anInt540 - (this.anInt536 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local114 = this.anInt541 - (this.anInt537 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class3_Sub1_Sub3_Sub2 local162 = (Class3_Sub1_Sub3_Sub2) arg0;
		@Pc(171) Class3_Sub1_Sub3_Sub2 local171;
		if (local162 != null && local162.method21275(local153, local159)) {
			local171 = local162;
			local162.method21269();
		} else {
			local171 = new Class3_Sub1_Sub3_Sub2(this.aClass21_Sub3_5, local153, local159);
		}
		local171.method21267(local29, local98, local45, local114);
		this.method5280(local171);
		return local171;
	}

	@OriginalMember(owner = "client!abw", name = "de", descriptor = "(Lclient!amd;)Lclient!amd;", line = 2734)
	@Override
	public Class3_Sub1_Sub3 method5439(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		if (this.anInt544 == 0) {
			return null;
		}
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass21_Sub3_5.anInt2512 > 0) {
			local29 = this.anInt538 - (this.anInt537 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local45 = this.anInt539 - (this.anInt536 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		} else {
			local29 = this.anInt538 - (this.anInt536 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local45 = this.anInt539 - (this.anInt537 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass21_Sub3_5.anInt2513 > 0) {
			local98 = this.anInt540 - (this.anInt537 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local114 = this.anInt541 - (this.anInt536 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		} else {
			local98 = this.anInt540 - (this.anInt536 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local114 = this.anInt541 - (this.anInt537 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class3_Sub1_Sub3_Sub2 local162 = (Class3_Sub1_Sub3_Sub2) arg0;
		@Pc(171) Class3_Sub1_Sub3_Sub2 local171;
		if (local162 != null && local162.method21275(local153, local159)) {
			local171 = local162;
			local162.method21269();
		} else {
			local171 = new Class3_Sub1_Sub3_Sub2(this.aClass21_Sub3_5, local153, local159);
		}
		local171.method21267(local29, local98, local45, local114);
		this.method5280(local171);
		return local171;
	}

	@OriginalMember(owner = "client!abw", name = "dl", descriptor = "(Lclient!amd;)Lclient!amd;", line = 2734)
	@Override
	public Class3_Sub1_Sub3 method5509(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		if (this.anInt544 == 0) {
			return null;
		}
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass21_Sub3_5.anInt2512 > 0) {
			local29 = this.anInt538 - (this.anInt537 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local45 = this.anInt539 - (this.anInt536 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		} else {
			local29 = this.anInt538 - (this.anInt536 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local45 = this.anInt539 - (this.anInt537 * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass21_Sub3_5.anInt2513 > 0) {
			local98 = this.anInt540 - (this.anInt537 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local114 = this.anInt541 - (this.anInt536 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		} else {
			local98 = this.anInt540 - (this.anInt536 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
			local114 = this.anInt541 - (this.anInt537 * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class3_Sub1_Sub3_Sub2 local162 = (Class3_Sub1_Sub3_Sub2) arg0;
		@Pc(171) Class3_Sub1_Sub3_Sub2 local171;
		if (local162 != null && local162.method21275(local153, local159)) {
			local171 = local162;
			local162.method21269();
		} else {
			local171 = new Class3_Sub1_Sub3_Sub2(this.aClass21_Sub3_5, local153, local159);
		}
		local171.method21267(local29, local98, local45, local114);
		this.method5280(local171);
		return local171;
	}

	@OriginalMember(owner = "client!abw", name = "hb", descriptor = "(Lclient!aov;)V", line = 2771)
	void method5280(@OriginalArg(0) Class3_Sub1_Sub3_Sub2 arg0) {
		if (this.anIntArray61.length < this.anInt544) {
			this.anIntArray61 = new int[this.anInt544];
			this.anIntArray64 = new int[this.anInt544];
		}
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(99) int local99;
		for (local17 = 0; local17 < this.anInt533; local17++) {
			local44 = (this.anIntArray62[local17] - (this.anIntArray54[local17] * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511) - arg0.anInt2873;
			local67 = (this.anIntArray55[local17] - (this.anIntArray54[local17] * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511) - arg0.anInt2874;
			local72 = this.anIntArray56[local17];
			local79 = this.anIntArray56[local17 + 1];
			for (local81 = local72; local81 < local79 && this.aShortArray23[local81] != 0; local81++) {
				local99 = (this.aShortArray23[local81] & 0xFFFF) - 1;
				this.anIntArray61[local99] = local44;
				this.anIntArray64[local99] = local67;
			}
		}
		for (local17 = 0; local17 < this.anInt532; local17++) {
			if (this.aByteArray8 == null || this.aByteArray8[local17] <= 128) {
				local44 = this.aShortArray18[local17] & 0xFFFF;
				local67 = this.aShortArray22[local17] & 0xFFFF;
				local72 = this.aShortArray19[local17] & 0xFFFF;
				local79 = this.anIntArray61[local44];
				local81 = this.anIntArray61[local67];
				local99 = this.anIntArray61[local72];
				@Pc(170) int local170 = this.anIntArray64[local44];
				@Pc(175) int local175 = this.anIntArray64[local67];
				@Pc(180) int local180 = this.anIntArray64[local72];
				if ((local79 - local81) * (local175 - local180) - (local175 - local170) * (local99 - local81) > 0) {
					arg0.method21270(local170, local175, local180, local79, local81, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "ih", descriptor = "(Lclient!aov;)V", line = 2771)
	void method5288(@OriginalArg(0) Class3_Sub1_Sub3_Sub2 arg0) {
		if (this.anIntArray61.length < this.anInt544) {
			this.anIntArray61 = new int[this.anInt544];
			this.anIntArray64 = new int[this.anInt544];
		}
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(99) int local99;
		for (local17 = 0; local17 < this.anInt533; local17++) {
			local44 = (this.anIntArray62[local17] - (this.anIntArray54[local17] * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511) - arg0.anInt2873;
			local67 = (this.anIntArray55[local17] - (this.anIntArray54[local17] * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511) - arg0.anInt2874;
			local72 = this.anIntArray56[local17];
			local79 = this.anIntArray56[local17 + 1];
			for (local81 = local72; local81 < local79 && this.aShortArray23[local81] != 0; local81++) {
				local99 = (this.aShortArray23[local81] & 0xFFFF) - 1;
				this.anIntArray61[local99] = local44;
				this.anIntArray64[local99] = local67;
			}
		}
		for (local17 = 0; local17 < this.anInt532; local17++) {
			if (this.aByteArray8 == null || this.aByteArray8[local17] <= 128) {
				local44 = this.aShortArray18[local17] & 0xFFFF;
				local67 = this.aShortArray22[local17] & 0xFFFF;
				local72 = this.aShortArray19[local17] & 0xFFFF;
				local79 = this.anIntArray61[local44];
				local81 = this.anIntArray61[local67];
				local99 = this.anIntArray61[local72];
				@Pc(170) int local170 = this.anIntArray64[local44];
				@Pc(175) int local175 = this.anIntArray64[local67];
				@Pc(180) int local180 = this.anIntArray64[local72];
				if ((local79 - local81) * (local175 - local180) - (local175 - local170) * (local99 - local81) > 0) {
					arg0.method21270(local170, local175, local180, local79, local81, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "if", descriptor = "(Lclient!aov;)V", line = 2771)
	void method5293(@OriginalArg(0) Class3_Sub1_Sub3_Sub2 arg0) {
		if (this.anIntArray61.length < this.anInt544) {
			this.anIntArray61 = new int[this.anInt544];
			this.anIntArray64 = new int[this.anInt544];
		}
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(99) int local99;
		for (local17 = 0; local17 < this.anInt533; local17++) {
			local44 = (this.anIntArray62[local17] - (this.anIntArray54[local17] * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511) - arg0.anInt2873;
			local67 = (this.anIntArray55[local17] - (this.anIntArray54[local17] * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511) - arg0.anInt2874;
			local72 = this.anIntArray56[local17];
			local79 = this.anIntArray56[local17 + 1];
			for (local81 = local72; local81 < local79 && this.aShortArray23[local81] != 0; local81++) {
				local99 = (this.aShortArray23[local81] & 0xFFFF) - 1;
				this.anIntArray61[local99] = local44;
				this.anIntArray64[local99] = local67;
			}
		}
		for (local17 = 0; local17 < this.anInt532; local17++) {
			if (this.aByteArray8 == null || this.aByteArray8[local17] <= 128) {
				local44 = this.aShortArray18[local17] & 0xFFFF;
				local67 = this.aShortArray22[local17] & 0xFFFF;
				local72 = this.aShortArray19[local17] & 0xFFFF;
				local79 = this.anIntArray61[local44];
				local81 = this.anIntArray61[local67];
				local99 = this.anIntArray61[local72];
				@Pc(170) int local170 = this.anIntArray64[local44];
				@Pc(175) int local175 = this.anIntArray64[local67];
				@Pc(180) int local180 = this.anIntArray64[local72];
				if ((local79 - local81) * (local175 - local180) - (local175 - local170) * (local99 - local81) > 0) {
					arg0.method21270(local170, local175, local180, local79, local81, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "ia", descriptor = "(Lclient!aov;)V", line = 2771)
	void method5313(@OriginalArg(0) Class3_Sub1_Sub3_Sub2 arg0) {
		if (this.anIntArray61.length < this.anInt544) {
			this.anIntArray61 = new int[this.anInt544];
			this.anIntArray64 = new int[this.anInt544];
		}
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(67) int local67;
		@Pc(72) int local72;
		@Pc(79) int local79;
		@Pc(81) int local81;
		@Pc(99) int local99;
		for (local17 = 0; local17 < this.anInt533; local17++) {
			local44 = (this.anIntArray62[local17] - (this.anIntArray54[local17] * this.aClass21_Sub3_5.anInt2512 >> 8) >> this.aClass21_Sub3_5.anInt2511) - arg0.anInt2873;
			local67 = (this.anIntArray55[local17] - (this.anIntArray54[local17] * this.aClass21_Sub3_5.anInt2513 >> 8) >> this.aClass21_Sub3_5.anInt2511) - arg0.anInt2874;
			local72 = this.anIntArray56[local17];
			local79 = this.anIntArray56[local17 + 1];
			for (local81 = local72; local81 < local79 && this.aShortArray23[local81] != 0; local81++) {
				local99 = (this.aShortArray23[local81] & 0xFFFF) - 1;
				this.anIntArray61[local99] = local44;
				this.anIntArray64[local99] = local67;
			}
		}
		for (local17 = 0; local17 < this.anInt532; local17++) {
			if (this.aByteArray8 == null || this.aByteArray8[local17] <= 128) {
				local44 = this.aShortArray18[local17] & 0xFFFF;
				local67 = this.aShortArray22[local17] & 0xFFFF;
				local72 = this.aShortArray19[local17] & 0xFFFF;
				local79 = this.anIntArray61[local44];
				local81 = this.anIntArray61[local67];
				local99 = this.anIntArray61[local72];
				@Pc(170) int local170 = this.anIntArray64[local44];
				@Pc(175) int local175 = this.anIntArray64[local67];
				@Pc(180) int local180 = this.anIntArray64[local72];
				if ((local79 - local81) * (local175 - local180) - (local175 - local170) * (local99 - local81) > 0) {
					arg0.method21270(local170, local175, local180, local79, local81, local99);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abw", name = "as", descriptor = "(Lclient!mu;Lclient!du;I)V", line = 2805)
	@Override
	public void method5352(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) int arg2) {
		if (aClass236_1 != null) {
			aClass236_1.method24598();
		}
		if (arg1 != null) {
			arg1.aBoolean621 = false;
		}
		if (this.anInt544 == 0) {
			return;
		}
		@Pc(16) Class328 local16 = this.aClass21_Sub3_5.aClass328_91;
		@Pc(20) Class328 local20 = this.aClass21_Sub3_5.aClass328_86;
		@Pc(24) Class328 local24 = this.aClass21_Sub3_5.aClass328_88;
		local20.method26056(arg0);
		local24.method26104(local20);
		local24.method26046(this.aClass21_Sub3_5.aClass328_84);
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(44) float[] local44 = this.aClass21_Sub3_5.aFloatArray75;
		local20.method26052(0.0F, (float) this.anInt536, 0.0F, local44);
		@Pc(56) float local56 = local44[0];
		@Pc(60) float local60 = local44[1];
		@Pc(64) float local64 = local44[2];
		local20.method26052(0.0F, (float) this.anInt537, 0.0F, local44);
		@Pc(76) float local76 = local44[0];
		@Pc(80) float local80 = local44[1];
		@Pc(84) float local84 = local44[2];
		@Pc(121) float local121;
		@Pc(147) float local147;
		for (@Pc(86) int local86 = 0; local86 < 6; local86++) {
			@Pc(95) float[] local95 = this.aClass21_Sub3_5.aFloatArrayArray21[local86];
			local121 = local95[0] * local56 + local95[1] * local60 + local95[2] * local64 + local95[3] + (float) this.anInt535;
			local147 = local95[0] * local76 + local95[1] * local80 + local95[2] * local84 + local95[3] + (float) this.anInt535;
			if (local121 < 0.0F && local147 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(162) boolean local162 = false;
			@Pc(164) boolean local164 = true;
			@Pc(172) int local172 = this.anInt538 + this.anInt539 >> 1;
			@Pc(180) int local180 = this.anInt540 + this.anInt541 >> 1;
			@Pc(185) int local185 = this.anInt536;
			@Pc(216) float local216 = local24.aFloatArray106[0] * (float) local172 + local24.aFloatArray106[4] * (float) local185 + local24.aFloatArray106[8] * (float) local180 + local24.aFloatArray106[12];
			@Pc(245) float local245 = local24.aFloatArray106[1] * (float) local172 + local24.aFloatArray106[5] * (float) local185 + local24.aFloatArray106[9] * (float) local180 + local24.aFloatArray106[13];
			local121 = local24.aFloatArray106[2] * (float) local172 + local24.aFloatArray106[6] * (float) local185 + local24.aFloatArray106[10] * (float) local180 + local24.aFloatArray106[14];
			local147 = local24.aFloatArray106[3] * (float) local172 + local24.aFloatArray106[7] * (float) local185 + local24.aFloatArray106[11] * (float) local180 + local24.aFloatArray106[15];
			if (local121 >= -local147) {
				arg1.anInt3401 = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local216 / local147);
				arg1.anInt3400 = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local245 / local147);
			} else {
				local162 = true;
			}
			local185 = this.anInt537;
			@Pc(375) float local375 = local24.aFloatArray106[0] * (float) local172 + local24.aFloatArray106[4] * (float) local185 + local24.aFloatArray106[8] * (float) local180 + local24.aFloatArray106[12];
			@Pc(404) float local404 = local24.aFloatArray106[1] * (float) local172 + local24.aFloatArray106[5] * (float) local185 + local24.aFloatArray106[9] * (float) local180 + local24.aFloatArray106[13];
			@Pc(433) float local433 = local24.aFloatArray106[2] * (float) local172 + local24.aFloatArray106[6] * (float) local185 + local24.aFloatArray106[10] * (float) local180 + local24.aFloatArray106[14];
			@Pc(462) float local462 = local24.aFloatArray106[3] * (float) local172 + local24.aFloatArray106[7] * (float) local185 + local24.aFloatArray106[11] * (float) local180 + local24.aFloatArray106[15];
			if (local433 >= -local462) {
				arg1.anInt3403 = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local375 / local462);
				arg1.anInt3402 = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local404 / local462);
			} else {
				local162 = true;
			}
			@Pc(528) float local528;
			@Pc(536) float local536;
			if (local162) {
				if (local121 < -local147 && local433 < -local462) {
					local164 = false;
				} else {
					@Pc(544) float local544;
					@Pc(552) float local552;
					if (local121 < -local147) {
						local528 = (local121 + local147) / (local433 + local462) - 1.0F;
						local536 = local216 + local528 * (local375 - local216);
						local544 = local245 + local528 * (local404 - local245);
						local552 = local147 + local528 * (local462 - local147);
						arg1.anInt3401 = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local536 / local552);
						arg1.anInt3400 = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local544 / local552);
					} else if (local433 < -local462) {
						local528 = (local433 + local462) / (local121 + local147) - 1.0F;
						local536 = local375 + local528 * (local216 - local375);
						local544 = local404 + local528 * (local245 - local404);
						local552 = local462 + local528 * (local147 - local462);
						arg1.anInt3403 = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local536 / local552);
						arg1.anInt3402 = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local544 / local552);
					}
				}
			}
			if (local164) {
				if (local121 / local147 > local433 / local462) {
					local528 = local216 + local16.aFloatArray106[0] * (float) this.anInt535 + local16.aFloatArray106[12];
					local536 = local147 + local16.aFloatArray106[3] * (float) this.anInt535 + local16.aFloatArray106[15];
					arg1.anInt3404 = (int) (this.aClass21_Sub3_5.aFloat186 - (float) arg1.anInt3401 + this.aClass21_Sub3_5.aFloat187 * local528 / local536);
				} else {
					local528 = local375 + local16.aFloatArray106[0] * (float) this.anInt535 + local16.aFloatArray106[12];
					local536 = local462 + local16.aFloatArray106[3] * (float) this.anInt535 + local16.aFloatArray106[15];
					arg1.anInt3404 = (int) (this.aClass21_Sub3_5.aFloat186 - (float) arg1.anInt3403 + this.aClass21_Sub3_5.aFloat187 * local528 / local536);
				}
				arg1.aBoolean621 = true;
			}
		}
		this.aClass21_Sub3_5.method17558(arg2);
		this.method5281(arg0);
		this.aClass21_Sub3_5.method17558(0);
		local20.method26056(arg0);
		local20.method26046(this.aClass21_Sub3_5.aClass328_78);
		this.method5282(local20);
	}

	@OriginalMember(owner = "client!abw", name = "dq", descriptor = "(Lclient!mu;Lclient!du;I)V", line = 2805)
	@Override
	public void method5410(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) int arg2) {
		if (aClass236_1 != null) {
			aClass236_1.method24598();
		}
		if (arg1 != null) {
			arg1.aBoolean621 = false;
		}
		if (this.anInt544 == 0) {
			return;
		}
		@Pc(16) Class328 local16 = this.aClass21_Sub3_5.aClass328_91;
		@Pc(20) Class328 local20 = this.aClass21_Sub3_5.aClass328_86;
		@Pc(24) Class328 local24 = this.aClass21_Sub3_5.aClass328_88;
		local20.method26056(arg0);
		local24.method26104(local20);
		local24.method26046(this.aClass21_Sub3_5.aClass328_84);
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(44) float[] local44 = this.aClass21_Sub3_5.aFloatArray75;
		local20.method26052(0.0F, (float) this.anInt536, 0.0F, local44);
		@Pc(56) float local56 = local44[0];
		@Pc(60) float local60 = local44[1];
		@Pc(64) float local64 = local44[2];
		local20.method26052(0.0F, (float) this.anInt537, 0.0F, local44);
		@Pc(76) float local76 = local44[0];
		@Pc(80) float local80 = local44[1];
		@Pc(84) float local84 = local44[2];
		@Pc(121) float local121;
		@Pc(147) float local147;
		for (@Pc(86) int local86 = 0; local86 < 6; local86++) {
			@Pc(95) float[] local95 = this.aClass21_Sub3_5.aFloatArrayArray21[local86];
			local121 = local95[0] * local56 + local95[1] * local60 + local95[2] * local64 + local95[3] + (float) this.anInt535;
			local147 = local95[0] * local76 + local95[1] * local80 + local95[2] * local84 + local95[3] + (float) this.anInt535;
			if (local121 < 0.0F && local147 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(162) boolean local162 = false;
			@Pc(164) boolean local164 = true;
			@Pc(172) int local172 = this.anInt538 + this.anInt539 >> 1;
			@Pc(180) int local180 = this.anInt540 + this.anInt541 >> 1;
			@Pc(185) int local185 = this.anInt536;
			@Pc(216) float local216 = local24.aFloatArray106[0] * (float) local172 + local24.aFloatArray106[4] * (float) local185 + local24.aFloatArray106[8] * (float) local180 + local24.aFloatArray106[12];
			@Pc(245) float local245 = local24.aFloatArray106[1] * (float) local172 + local24.aFloatArray106[5] * (float) local185 + local24.aFloatArray106[9] * (float) local180 + local24.aFloatArray106[13];
			local121 = local24.aFloatArray106[2] * (float) local172 + local24.aFloatArray106[6] * (float) local185 + local24.aFloatArray106[10] * (float) local180 + local24.aFloatArray106[14];
			local147 = local24.aFloatArray106[3] * (float) local172 + local24.aFloatArray106[7] * (float) local185 + local24.aFloatArray106[11] * (float) local180 + local24.aFloatArray106[15];
			if (local121 >= -local147) {
				arg1.anInt3401 = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local216 / local147);
				arg1.anInt3400 = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local245 / local147);
			} else {
				local162 = true;
			}
			local185 = this.anInt537;
			@Pc(375) float local375 = local24.aFloatArray106[0] * (float) local172 + local24.aFloatArray106[4] * (float) local185 + local24.aFloatArray106[8] * (float) local180 + local24.aFloatArray106[12];
			@Pc(404) float local404 = local24.aFloatArray106[1] * (float) local172 + local24.aFloatArray106[5] * (float) local185 + local24.aFloatArray106[9] * (float) local180 + local24.aFloatArray106[13];
			@Pc(433) float local433 = local24.aFloatArray106[2] * (float) local172 + local24.aFloatArray106[6] * (float) local185 + local24.aFloatArray106[10] * (float) local180 + local24.aFloatArray106[14];
			@Pc(462) float local462 = local24.aFloatArray106[3] * (float) local172 + local24.aFloatArray106[7] * (float) local185 + local24.aFloatArray106[11] * (float) local180 + local24.aFloatArray106[15];
			if (local433 >= -local462) {
				arg1.anInt3403 = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local375 / local462);
				arg1.anInt3402 = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local404 / local462);
			} else {
				local162 = true;
			}
			@Pc(528) float local528;
			@Pc(536) float local536;
			if (local162) {
				if (local121 < -local147 && local433 < -local462) {
					local164 = false;
				} else {
					@Pc(544) float local544;
					@Pc(552) float local552;
					if (local121 < -local147) {
						local528 = (local121 + local147) / (local433 + local462) - 1.0F;
						local536 = local216 + local528 * (local375 - local216);
						local544 = local245 + local528 * (local404 - local245);
						local552 = local147 + local528 * (local462 - local147);
						arg1.anInt3401 = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local536 / local552);
						arg1.anInt3400 = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local544 / local552);
					} else if (local433 < -local462) {
						local528 = (local433 + local462) / (local121 + local147) - 1.0F;
						local536 = local375 + local528 * (local216 - local375);
						local544 = local404 + local528 * (local245 - local404);
						local552 = local462 + local528 * (local147 - local462);
						arg1.anInt3403 = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local536 / local552);
						arg1.anInt3402 = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local544 / local552);
					}
				}
			}
			if (local164) {
				if (local121 / local147 > local433 / local462) {
					local528 = local216 + local16.aFloatArray106[0] * (float) this.anInt535 + local16.aFloatArray106[12];
					local536 = local147 + local16.aFloatArray106[3] * (float) this.anInt535 + local16.aFloatArray106[15];
					arg1.anInt3404 = (int) (this.aClass21_Sub3_5.aFloat186 - (float) arg1.anInt3401 + this.aClass21_Sub3_5.aFloat187 * local528 / local536);
				} else {
					local528 = local375 + local16.aFloatArray106[0] * (float) this.anInt535 + local16.aFloatArray106[12];
					local536 = local462 + local16.aFloatArray106[3] * (float) this.anInt535 + local16.aFloatArray106[15];
					arg1.anInt3404 = (int) (this.aClass21_Sub3_5.aFloat186 - (float) arg1.anInt3403 + this.aClass21_Sub3_5.aFloat187 * local528 / local536);
				}
				arg1.aBoolean621 = true;
			}
		}
		this.aClass21_Sub3_5.method17558(arg2);
		this.method5281(arg0);
		this.aClass21_Sub3_5.method17558(0);
		local20.method26056(arg0);
		local20.method26046(this.aClass21_Sub3_5.aClass328_78);
		this.method5282(local20);
	}

	@OriginalMember(owner = "client!abw", name = "ds", descriptor = "(Lclient!mu;Lclient!du;I)V", line = 2805)
	@Override
	public void method5432(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) int arg2) {
		if (aClass236_1 != null) {
			aClass236_1.method24598();
		}
		if (arg1 != null) {
			arg1.aBoolean621 = false;
		}
		if (this.anInt544 == 0) {
			return;
		}
		@Pc(16) Class328 local16 = this.aClass21_Sub3_5.aClass328_91;
		@Pc(20) Class328 local20 = this.aClass21_Sub3_5.aClass328_86;
		@Pc(24) Class328 local24 = this.aClass21_Sub3_5.aClass328_88;
		local20.method26056(arg0);
		local24.method26104(local20);
		local24.method26046(this.aClass21_Sub3_5.aClass328_84);
		if (!this.aBoolean126) {
			this.method5270();
		}
		@Pc(44) float[] local44 = this.aClass21_Sub3_5.aFloatArray75;
		local20.method26052(0.0F, (float) this.anInt536, 0.0F, local44);
		@Pc(56) float local56 = local44[0];
		@Pc(60) float local60 = local44[1];
		@Pc(64) float local64 = local44[2];
		local20.method26052(0.0F, (float) this.anInt537, 0.0F, local44);
		@Pc(76) float local76 = local44[0];
		@Pc(80) float local80 = local44[1];
		@Pc(84) float local84 = local44[2];
		@Pc(121) float local121;
		@Pc(147) float local147;
		for (@Pc(86) int local86 = 0; local86 < 6; local86++) {
			@Pc(95) float[] local95 = this.aClass21_Sub3_5.aFloatArrayArray21[local86];
			local121 = local95[0] * local56 + local95[1] * local60 + local95[2] * local64 + local95[3] + (float) this.anInt535;
			local147 = local95[0] * local76 + local95[1] * local80 + local95[2] * local84 + local95[3] + (float) this.anInt535;
			if (local121 < 0.0F && local147 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(162) boolean local162 = false;
			@Pc(164) boolean local164 = true;
			@Pc(172) int local172 = this.anInt538 + this.anInt539 >> 1;
			@Pc(180) int local180 = this.anInt540 + this.anInt541 >> 1;
			@Pc(185) int local185 = this.anInt536;
			@Pc(216) float local216 = local24.aFloatArray106[0] * (float) local172 + local24.aFloatArray106[4] * (float) local185 + local24.aFloatArray106[8] * (float) local180 + local24.aFloatArray106[12];
			@Pc(245) float local245 = local24.aFloatArray106[1] * (float) local172 + local24.aFloatArray106[5] * (float) local185 + local24.aFloatArray106[9] * (float) local180 + local24.aFloatArray106[13];
			local121 = local24.aFloatArray106[2] * (float) local172 + local24.aFloatArray106[6] * (float) local185 + local24.aFloatArray106[10] * (float) local180 + local24.aFloatArray106[14];
			local147 = local24.aFloatArray106[3] * (float) local172 + local24.aFloatArray106[7] * (float) local185 + local24.aFloatArray106[11] * (float) local180 + local24.aFloatArray106[15];
			if (local121 >= -local147) {
				arg1.anInt3401 = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local216 / local147);
				arg1.anInt3400 = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local245 / local147);
			} else {
				local162 = true;
			}
			local185 = this.anInt537;
			@Pc(375) float local375 = local24.aFloatArray106[0] * (float) local172 + local24.aFloatArray106[4] * (float) local185 + local24.aFloatArray106[8] * (float) local180 + local24.aFloatArray106[12];
			@Pc(404) float local404 = local24.aFloatArray106[1] * (float) local172 + local24.aFloatArray106[5] * (float) local185 + local24.aFloatArray106[9] * (float) local180 + local24.aFloatArray106[13];
			@Pc(433) float local433 = local24.aFloatArray106[2] * (float) local172 + local24.aFloatArray106[6] * (float) local185 + local24.aFloatArray106[10] * (float) local180 + local24.aFloatArray106[14];
			@Pc(462) float local462 = local24.aFloatArray106[3] * (float) local172 + local24.aFloatArray106[7] * (float) local185 + local24.aFloatArray106[11] * (float) local180 + local24.aFloatArray106[15];
			if (local433 >= -local462) {
				arg1.anInt3403 = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local375 / local462);
				arg1.anInt3402 = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local404 / local462);
			} else {
				local162 = true;
			}
			@Pc(528) float local528;
			@Pc(536) float local536;
			if (local162) {
				if (local121 < -local147 && local433 < -local462) {
					local164 = false;
				} else {
					@Pc(544) float local544;
					@Pc(552) float local552;
					if (local121 < -local147) {
						local528 = (local121 + local147) / (local433 + local462) - 1.0F;
						local536 = local216 + local528 * (local375 - local216);
						local544 = local245 + local528 * (local404 - local245);
						local552 = local147 + local528 * (local462 - local147);
						arg1.anInt3401 = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local536 / local552);
						arg1.anInt3400 = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local544 / local552);
					} else if (local433 < -local462) {
						local528 = (local433 + local462) / (local121 + local147) - 1.0F;
						local536 = local375 + local528 * (local216 - local375);
						local544 = local404 + local528 * (local245 - local404);
						local552 = local462 + local528 * (local147 - local462);
						arg1.anInt3403 = (int) (this.aClass21_Sub3_5.aFloat186 + this.aClass21_Sub3_5.aFloat187 * local536 / local552);
						arg1.anInt3402 = (int) (this.aClass21_Sub3_5.aFloat183 + this.aClass21_Sub3_5.aFloat200 * local544 / local552);
					}
				}
			}
			if (local164) {
				if (local121 / local147 > local433 / local462) {
					local528 = local216 + local16.aFloatArray106[0] * (float) this.anInt535 + local16.aFloatArray106[12];
					local536 = local147 + local16.aFloatArray106[3] * (float) this.anInt535 + local16.aFloatArray106[15];
					arg1.anInt3404 = (int) (this.aClass21_Sub3_5.aFloat186 - (float) arg1.anInt3401 + this.aClass21_Sub3_5.aFloat187 * local528 / local536);
				} else {
					local528 = local375 + local16.aFloatArray106[0] * (float) this.anInt535 + local16.aFloatArray106[12];
					local536 = local462 + local16.aFloatArray106[3] * (float) this.anInt535 + local16.aFloatArray106[15];
					arg1.anInt3404 = (int) (this.aClass21_Sub3_5.aFloat186 - (float) arg1.anInt3403 + this.aClass21_Sub3_5.aFloat187 * local528 / local536);
				}
				arg1.aBoolean621 = true;
			}
		}
		this.aClass21_Sub3_5.method17558(arg2);
		this.method5281(arg0);
		this.aClass21_Sub3_5.method17558(0);
		local20.method26056(arg0);
		local20.method26046(this.aClass21_Sub3_5.aClass328_78);
		this.method5282(local20);
	}

	@OriginalMember(owner = "client!abw", name = "hz", descriptor = "(Lclient!mu;)V", line = 2908)
	void method5281(@OriginalArg(0) Class332 arg0) {
		if (this.anInt532 == 0 || (!this.method5283() || !this.method5297())) {
			return;
		}
		if (aClass236_1 != null) {
		}
		this.aClass21_Sub3_5.method17557();
		this.aClass21_Sub3_5.method17647();
		@Pc(22) Class32 local22 = this.aClass21_Sub3_5.aClass32_3;
		this.aClass21_Sub3_5.method17544(0, this.aClass267_1.anInterface21_22);
		this.aClass21_Sub3_5.method17544(1, this.aClass267_4.anInterface21_22);
		this.aClass21_Sub3_5.method17544(2, this.aClass267_3.anInterface21_22);
		this.aClass21_Sub3_5.method17545(this.aClass233_1.anInterface30_6);
		this.aClass21_Sub3_5.aClass328_86.method26056(arg0);
		local22.method7774(this.aClass21_Sub3_5.aClass328_86);
		local22.aClass328_44.method26042();
		if (this.aClass21_Sub3_5.aBoolean435) {
			@Pc(70) Class139 local70 = this.aClass21_Sub3_5.method17671();
			local22.aClass333_7.method26251(0.0F, 1.0F, 0.0F, (float) -this.aClass21_Sub3_5.anInt2485);
			local22.aClass333_7.method26256(3.0F / (float) (local70.anInt3417 * 1125508145));
			local22.aClass320_33.method25863((float) (local70.anInt3422 * -470091381 >> 16 & 0xFF) / 255.0F, (float) (local70.anInt3422 * -470091381 >> 8 & 0xFF) / 255.0F, (float) (local70.anInt3422 * -470091381 >> 0 & 0xFF) / 255.0F);
		} else {
			local22.aClass333_7.method26251(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass320_33.method25863(0.0F, 0.0F, 0.0F);
		}
		if (this.aClass21_Sub3_5.anInt2520 > 0) {
			local22.aClass333_8.method26251(0.0F, 0.0F, 1.0F, -this.aClass21_Sub3_5.aFloat198);
			local22.aClass320_31.method25863((float) (this.aClass21_Sub3_5.anInt2519 >> 16 & 0xFF) / 255.0F, (float) (this.aClass21_Sub3_5.anInt2519 >> 8 & 0xFF) / 255.0F, (float) (this.aClass21_Sub3_5.anInt2519 >> 0 & 0xFF) / 255.0F);
			this.aClass21_Sub3_5.aClass328_86.method26056(arg0);
			this.aClass21_Sub3_5.aClass328_86.method26086();
			local22.aClass333_7.method26257(this.aClass21_Sub3_5.aClass328_86);
			this.aClass21_Sub3_5.aClass328_86.method26056(arg0);
			this.aClass21_Sub3_5.aClass328_86.method26046(this.aClass21_Sub3_5.aClass328_78);
			this.aClass21_Sub3_5.aClass328_86.method26086();
			local22.aClass333_8.method26257(this.aClass21_Sub3_5.aClass328_86);
			local22.aClass333_8.method26256(1.0F / (this.aClass21_Sub3_5.aFloat199 - this.aClass21_Sub3_5.aFloat198));
		} else {
			local22.aClass333_8.method26251(0.0F, 0.0F, 0.0F, 0.0F);
			local22.aClass320_31.method25863(0.0F, 0.0F, 0.0F);
		}
		@Pc(282) int local282;
		@Pc(289) int local289;
		if ((this.anInt529 & 0x37) == 0) {
			this.aClass21_Sub3_5.method17738(this.aClass21_Sub3_5.aClass37_20);
			if (this.aClass21_Sub3_5.aBoolean422) {
				this.aClass21_Sub3_5.method17533(false);
			}
			for (@Pc(272) int local272 = 0; local272 < this.anIntArray57.length; local272++) {
				local282 = this.anIntArray59[local272];
				local289 = this.anIntArray59[local272 + 1];
				@Pc(294) short local294 = this.aShortArray20[local282];
				@Pc(296) boolean local296 = false;
				@Pc(298) byte local298 = 0;
				if (local294 == -1) {
					local22.anInterface20_14 = this.aClass21_Sub3_5.anInterface20_23;
					@Pc(385) float[] local385 = local22.aClass328_44.aFloatArray106;
					local22.aClass328_44.aFloatArray106[13] = 0.0F;
					local385[12] = 0.0F;
				} else {
					@Pc(310) Class133 local310 = this.aClass21_Sub3_5.aClass134_7.method22906(local294 & 0xFFFF);
					local22.anInterface20_14 = this.aClass21_Sub3_5.aClass247_3.method24907(local310);
					local296 = !Class431.method27957(local310.aByte118);
					local22.aClass328_44.aFloatArray106[12] = (float) (this.aClass21_Sub3_5.anInt2487 % 128000) / 1000.0F * (float) local310.aByte113 / 64.0F % 1.0F;
					local22.aClass328_44.aFloatArray106[13] = (float) (this.aClass21_Sub3_5.anInt2487 % 128000) / 1000.0F * (float) local310.aByte117 / 64.0F % 1.0F;
					if (local310.aClass458_2 == Class458.aClass458_3) {
						local298 = local310.aByte115;
					}
				}
				this.aClass21_Sub3_5.method17531(local298);
				local22.anInt842 = this.anIntArray57[local272];
				local22.anInt841 = this.anIntArray60[local272];
				local22.anInt843 = local282 * 3;
				local22.anInt844 = local289 - local282;
				local22.method7775(local296);
			}
		} else {
			this.aClass21_Sub3_5.method17544(3, this.aClass267_2.anInterface21_22);
			this.aClass21_Sub3_5.method17738(this.aClass21_Sub3_5.aClass37_17);
			@Pc(444) Class332 local444 = this.aClass21_Sub3_5.aClass332_38;
			local444.method26235(arg0);
			local444.method26248();
			local282 = 0;
			@Pc(571) int local571;
			if (this.aClass21_Sub3_5.aBoolean422) {
				this.aClass21_Sub3_5.method17533(true);
			} else {
				local22.aClass320_34.method25863(this.aClass21_Sub3_5.aFloatArray76[0], this.aClass21_Sub3_5.aFloatArray76[1], this.aClass21_Sub3_5.aFloatArray76[2]);
				local22.aClass320_34.method25926(local444);
				local22.aClass320_35.method25863(this.aClass21_Sub3_5.aFloat195 * this.aClass21_Sub3_5.aFloat193, this.aClass21_Sub3_5.aFloat195 * this.aClass21_Sub3_5.aFloat194, this.aClass21_Sub3_5.aFloat195 * this.aClass21_Sub3_5.aFloat185);
				local22.aClass320_36.method25863(-this.aClass21_Sub3_5.aFloat196 * this.aClass21_Sub3_5.aFloat193, -this.aClass21_Sub3_5.aFloat196 * this.aClass21_Sub3_5.aFloat194, -this.aClass21_Sub3_5.aFloat196 * this.aClass21_Sub3_5.aFloat185);
				local22.aClass320_37.method25863(this.aClass21_Sub3_5.aFloat197 * this.aClass21_Sub3_5.aFloat193, this.aClass21_Sub3_5.aFloat197 * this.aClass21_Sub3_5.aFloat194, this.aClass21_Sub3_5.aFloat197 * this.aClass21_Sub3_5.aFloat185);
				if (this.aClass21_Sub3_5.anInt2508 > 0) {
					local282 = this.aClass21_Sub3_5.anInt2508;
					@Pc(569) Class320 local569 = this.aClass21_Sub3_5.aClass320_59;
					for (local571 = 0; local571 < local282; local571++) {
						@Pc(580) Class3_Sub15 local580 = this.aClass21_Sub3_5.aClass3_Sub15Array19[local571];
						@Pc(584) int local584 = local580.method11279();
						local569.method25893(local580.aClass320_45);
						local569.method25914(local444);
						local22.aFloatArray50[local571 * 4] = local569.aFloat259;
						local22.aFloatArray50[local571 * 4 + 1] = local569.aFloat260;
						local22.aFloatArray50[local571 * 4 + 2] = local569.aFloat261;
						local22.aFloatArray50[local571 * 4 + 3] = 1.0F / ((float) local580.method11291() * 2.5F);
						@Pc(643) float local643 = local580.method11300() / 255.0F;
						local22.aFloatArray49[local571 * 4] = (float) (local584 >> 16 & 0xFF) * local643;
						local22.aFloatArray49[local571 * 4 + 1] = (float) (local584 >> 8 & 0xFF) * local643;
						local22.aFloatArray49[local571 * 4 + 2] = (float) (local584 & 0xFF) * local643;
						local22.aFloatArray49[local571 * 4 + 3] = 1.0F;
					}
				}
			}
			for (local289 = 0; local289 < this.anIntArray57.length; local289++) {
				local571 = this.anIntArray59[local289];
				@Pc(719) int local719 = this.anIntArray59[local289 + 1];
				@Pc(724) short local724 = this.aShortArray20[local571];
				@Pc(726) byte local726 = 11;
				@Pc(728) Class133 local728 = null;
				@Pc(730) byte local730 = 0;
				if (local724 == -1) {
					local22.anInterface20_14 = this.aClass21_Sub3_5.anInterface20_23;
					@Pc(815) float[] local815 = local22.aClass328_44.aFloatArray106;
					local22.aClass328_44.aFloatArray106[13] = 0.0F;
					local815[12] = 0.0F;
				} else {
					local728 = this.aClass21_Sub3_5.aClass134_7.method22906(local724 & 0xFFFF);
					local22.anInterface20_14 = this.aClass21_Sub3_5.aClass247_3.method24907(local728);
					local726 = local728.aByte118;
					local22.method7773(local728.aByte119);
					local22.aClass328_44.aFloatArray106[12] = (float) (this.aClass21_Sub3_5.anInt2487 % 128000) / 1000.0F * (float) local728.aByte113 / 64.0F % 1.0F;
					local22.aClass328_44.aFloatArray106[13] = (float) (this.aClass21_Sub3_5.anInt2487 % 128000) / 1000.0F * (float) local728.aByte117 / 64.0F % 1.0F;
					if (local728.aClass458_2 == Class458.aClass458_3) {
						local730 = local728.aByte115;
					}
				}
				this.aClass21_Sub3_5.method17531(local730);
				local22.anInt842 = this.anIntArray57[local289];
				local22.anInt841 = this.anIntArray60[local289];
				local22.anInt843 = local571 * 3;
				local22.anInt844 = local719 - local571;
				switch(local726) {
					case 1:
						local22.aClass320_32.method25863(this.aClass21_Sub3_5.aClass328_92.aFloatArray106[12], this.aClass21_Sub3_5.aClass328_92.aFloatArray106[13], this.aClass21_Sub3_5.aClass328_92.aFloatArray106[14]);
						local22.aClass320_32.method25914(local444);
						local22.method7786(local282);
						break;
					case 2:
					case 3:
					case 4:
					default:
						local22.method7784(local282);
						break;
					case 5:
						if (this.aClass21_Sub3_5.aBoolean422) {
							local22.method7784(local282);
						} else {
							@Pc(942) Class40_Sub1_Sub2 local942 = this.aClass21_Sub3_5.aClass40_Sub1_Sub2_3;
							local942.method17003(local728.aByte119, local728.anInt3371 * 1742226327);
							local942.aClass328_76.method26056(arg0);
							local942.aClass328_75.method26056(arg0);
							local942.aClass328_75.method26046(this.aClass21_Sub3_5.aClass328_85);
							local942.anInt2457 = this.anIntArray57[local289] * 1751888089;
							local942.anInt2455 = this.anIntArray60[local289] * -1184914869;
							local942.anInt2458 = local571 * -1721517983;
							local942.anInt2456 = (local719 - local571) * -1185463005;
							local942.method17004();
						}
						break;
					case 6:
						local22.method7775(!Class431.method27957(local726));
						break;
					case 7:
						local22.aClass320_32.method25863(this.aClass21_Sub3_5.aClass328_92.aFloatArray106[12], this.aClass21_Sub3_5.aClass328_92.aFloatArray106[13], this.aClass21_Sub3_5.aClass328_92.aFloatArray106[14]);
						local22.aClass320_32.method25914(local444);
						local22.aClass328_45.method26056(arg0);
						local22.anInterface27_3 = this.aClass21_Sub3_5.method17764();
						local22.method7772(local282);
				}
			}
		}
		this.method5289();
	}

	@OriginalMember(owner = "client!abw", name = "hx", descriptor = "(Lclient!mq;)V", line = 3082)
	void method5282(@OriginalArg(0) Class328 arg0) {
		if (this.aClass261Array1 == null) {
			return;
		}
		this.aClass21_Sub3_5.method17108(!this.aBoolean125);
		@Pc(16) Class332 local16 = this.aClass21_Sub3_5.aClass332_38;
		@Pc(20) Class39 local20 = this.aClass21_Sub3_5.aClass39_3;
		@Pc(28) boolean local28 = this.aClass21_Sub3_5.anInt2520 > 0;
		if (local28) {
			local20.aClass320_44.method25863((float) (this.aClass21_Sub3_5.anInt2519 >> 16 & 0xFF) / 255.0F, (float) (this.aClass21_Sub3_5.anInt2519 >> 8 & 0xFF) / 255.0F, (float) (this.aClass21_Sub3_5.anInt2519 >> 0 & 0xFF) / 255.0F);
		} else {
			local20.aClass320_44.method25863(0.0F, 0.0F, 0.0F);
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt545; local72++) {
			@Pc(81) Class261 local81 = this.aClass261Array1[local72];
			@Pc(86) Class249 local86 = this.aClass249Array1[local72];
			if (!local81.aBoolean690 || !this.aClass21_Sub3_5.method17131()) {
				@Pc(115) float local115 = (float) (this.anIntArray62[local81.anInt4200] + this.anIntArray62[local81.anInt4202] + this.anIntArray62[local81.anInt4199]) * 0.3333333F;
				@Pc(136) float local136 = (float) (this.anIntArray54[local81.anInt4200] + this.anIntArray54[local81.anInt4202] + this.anIntArray54[local81.anInt4199]) * 0.3333333F;
				@Pc(157) float local157 = (float) (this.anIntArray55[local81.anInt4200] + this.anIntArray55[local81.anInt4202] + this.anIntArray55[local81.anInt4199]) * 0.3333333F;
				@Pc(183) float local183 = arg0.aFloatArray106[0] * local115 + arg0.aFloatArray106[4] * local136 + arg0.aFloatArray106[8] * local157 + arg0.aFloatArray106[12];
				@Pc(209) float local209 = arg0.aFloatArray106[1] * local115 + arg0.aFloatArray106[5] * local136 + arg0.aFloatArray106[9] * local157 + arg0.aFloatArray106[13];
				@Pc(235) float local235 = arg0.aFloatArray106[2] * local115 + arg0.aFloatArray106[6] * local136 + arg0.aFloatArray106[10] * local157 + arg0.aFloatArray106[14];
				@Pc(256) float local256 = (float) (1.0D / Math.sqrt((double) (local183 * local183 + local209 * local209 + local235 * local235))) * (float) local81.anInt4203;
				local16.method26191(local86.anInt3802, local86.anInt3798 * local81.aShort163 >> 7, local86.anInt3797 * local81.aShort162 >> 7, local183 + (float) local86.anInt3800 - local183 * local256, local209 + (float) local86.anInt3801 - local209 * local256, local235 - local235 * local256);
				local16.method26193(this.aClass21_Sub3_5.aClass332_39);
				this.aClass21_Sub3_5.aClass328_88.method26056(local16);
				local20.method8254(this.aClass21_Sub3_5.aClass328_88);
				local20.aClass328_49.method26042();
				local20.anInt883 = local86.anInt3799;
				if (local28) {
					local20.aFloat134 = 1.0F - (this.aClass21_Sub3_5.aFloat199 - local235) / (this.aClass21_Sub3_5.aFloat199 - this.aClass21_Sub3_5.aFloat198);
				}
				local20.anInterface20_17 = null;
				if (local81.aShort164 != -1) {
					local20.anInterface20_17 = this.aClass21_Sub3_5.aClass247_3.method24907(this.aClass21_Sub3_5.aClass134_7.method22906(local81.aShort164 & 0xFFFF));
				}
				local20.method8255(local28);
			}
		}
		this.aClass21_Sub3_5.method17108(true);
	}

	@OriginalMember(owner = "client!abw", name = "ij", descriptor = "(Lclient!mq;)V", line = 3082)
	void method5298(@OriginalArg(0) Class328 arg0) {
		if (this.aClass261Array1 == null) {
			return;
		}
		this.aClass21_Sub3_5.method17108(!this.aBoolean125);
		@Pc(16) Class332 local16 = this.aClass21_Sub3_5.aClass332_38;
		@Pc(20) Class39 local20 = this.aClass21_Sub3_5.aClass39_3;
		@Pc(28) boolean local28 = this.aClass21_Sub3_5.anInt2520 > 0;
		if (local28) {
			local20.aClass320_44.method25863((float) (this.aClass21_Sub3_5.anInt2519 >> 16 & 0xFF) / 255.0F, (float) (this.aClass21_Sub3_5.anInt2519 >> 8 & 0xFF) / 255.0F, (float) (this.aClass21_Sub3_5.anInt2519 >> 0 & 0xFF) / 255.0F);
		} else {
			local20.aClass320_44.method25863(0.0F, 0.0F, 0.0F);
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt545; local72++) {
			@Pc(81) Class261 local81 = this.aClass261Array1[local72];
			@Pc(86) Class249 local86 = this.aClass249Array1[local72];
			if (!local81.aBoolean690 || !this.aClass21_Sub3_5.method17131()) {
				@Pc(115) float local115 = (float) (this.anIntArray62[local81.anInt4200] + this.anIntArray62[local81.anInt4202] + this.anIntArray62[local81.anInt4199]) * 0.3333333F;
				@Pc(136) float local136 = (float) (this.anIntArray54[local81.anInt4200] + this.anIntArray54[local81.anInt4202] + this.anIntArray54[local81.anInt4199]) * 0.3333333F;
				@Pc(157) float local157 = (float) (this.anIntArray55[local81.anInt4200] + this.anIntArray55[local81.anInt4202] + this.anIntArray55[local81.anInt4199]) * 0.3333333F;
				@Pc(183) float local183 = arg0.aFloatArray106[0] * local115 + arg0.aFloatArray106[4] * local136 + arg0.aFloatArray106[8] * local157 + arg0.aFloatArray106[12];
				@Pc(209) float local209 = arg0.aFloatArray106[1] * local115 + arg0.aFloatArray106[5] * local136 + arg0.aFloatArray106[9] * local157 + arg0.aFloatArray106[13];
				@Pc(235) float local235 = arg0.aFloatArray106[2] * local115 + arg0.aFloatArray106[6] * local136 + arg0.aFloatArray106[10] * local157 + arg0.aFloatArray106[14];
				@Pc(256) float local256 = (float) (1.0D / Math.sqrt((double) (local183 * local183 + local209 * local209 + local235 * local235))) * (float) local81.anInt4203;
				local16.method26191(local86.anInt3802, local86.anInt3798 * local81.aShort163 >> 7, local86.anInt3797 * local81.aShort162 >> 7, local183 + (float) local86.anInt3800 - local183 * local256, local209 + (float) local86.anInt3801 - local209 * local256, local235 - local235 * local256);
				local16.method26193(this.aClass21_Sub3_5.aClass332_39);
				this.aClass21_Sub3_5.aClass328_88.method26056(local16);
				local20.method8254(this.aClass21_Sub3_5.aClass328_88);
				local20.aClass328_49.method26042();
				local20.anInt883 = local86.anInt3799;
				if (local28) {
					local20.aFloat134 = 1.0F - (this.aClass21_Sub3_5.aFloat199 - local235) / (this.aClass21_Sub3_5.aFloat199 - this.aClass21_Sub3_5.aFloat198);
				}
				local20.anInterface20_17 = null;
				if (local81.aShort164 != -1) {
					local20.anInterface20_17 = this.aClass21_Sub3_5.aClass247_3.method24907(this.aClass21_Sub3_5.aClass134_7.method22906(local81.aShort164 & 0xFFFF));
				}
				local20.method8255(local28);
			}
		}
		this.aClass21_Sub3_5.method17108(true);
	}

	@OriginalMember(owner = "client!abw", name = "hs", descriptor = "()Z", line = 3123)
	boolean method5297() {
		if (this.aClass233_1.aBoolean679) {
			return true;
		}
		if (this.aClass233_1.anInterface30_5 == null) {
			this.aClass233_1.anInterface30_5 = this.aClass21_Sub3_5.method17648(false);
		}
		@Pc(20) Interface30 local20 = this.aClass233_1.anInterface30_5;
		local20.method25720(this.anInt532 * 6);
		@Pc(30) Unsafe local30 = this.aClass21_Sub3_5.anUnsafe3;
		if (local30 != null) {
			@Pc(37) int local37 = this.anInt532 * 6;
			@Pc(42) long local42 = local20.method25710(0, local37);
			if (local42 == 0L) {
				return false;
			}
			for (@Pc(50) int local50 = 0; local50 < this.anInt532; local50++) {
				local30.putShort(local42, this.aShortArray18[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray22[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray19[local50]);
				local42 += 2L;
			}
			local20.method25707();
			this.aClass233_1.anInterface30_6 = local20;
			this.aClass233_1.aBoolean679 = true;
			this.aBoolean124 = true;
			return true;
		}
		@Pc(108) ByteBuffer local108 = this.aClass21_Sub3_5.aByteBuffer4;
		local108.clear();
		for (@Pc(113) int local113 = 0; local113 < this.anInt532; local113++) {
			local108.putShort(this.aShortArray18[local113]);
			local108.putShort(this.aShortArray22[local113]);
			local108.putShort(this.aShortArray19[local113]);
		}
		if (local20.method25705(0, local108.position(), this.aClass21_Sub3_5.aLong101)) {
			this.aClass233_1.anInterface30_6 = local20;
			this.aClass233_1.aBoolean679 = true;
			this.aBoolean124 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!abw", name = "iy", descriptor = "()Z", line = 3123)
	boolean method5308() {
		if (this.aClass233_1.aBoolean679) {
			return true;
		}
		if (this.aClass233_1.anInterface30_5 == null) {
			this.aClass233_1.anInterface30_5 = this.aClass21_Sub3_5.method17648(false);
		}
		@Pc(20) Interface30 local20 = this.aClass233_1.anInterface30_5;
		local20.method25720(this.anInt532 * 6);
		@Pc(30) Unsafe local30 = this.aClass21_Sub3_5.anUnsafe3;
		if (local30 != null) {
			@Pc(37) int local37 = this.anInt532 * 6;
			@Pc(42) long local42 = local20.method25710(0, local37);
			if (local42 == 0L) {
				return false;
			}
			for (@Pc(50) int local50 = 0; local50 < this.anInt532; local50++) {
				local30.putShort(local42, this.aShortArray18[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray22[local50]);
				local42 += 2L;
				local30.putShort(local42, this.aShortArray19[local50]);
				local42 += 2L;
			}
			local20.method25707();
			this.aClass233_1.anInterface30_6 = local20;
			this.aClass233_1.aBoolean679 = true;
			this.aBoolean124 = true;
			return true;
		}
		@Pc(108) ByteBuffer local108 = this.aClass21_Sub3_5.aByteBuffer4;
		local108.clear();
		for (@Pc(113) int local113 = 0; local113 < this.anInt532; local113++) {
			local108.putShort(this.aShortArray18[local113]);
			local108.putShort(this.aShortArray22[local113]);
			local108.putShort(this.aShortArray19[local113]);
		}
		if (local20.method25705(0, local108.position(), this.aClass21_Sub3_5.aLong101)) {
			this.aClass233_1.anInterface30_6 = local20;
			this.aClass233_1.aBoolean679 = true;
			this.aBoolean124 = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!abw", name = "is", descriptor = "()Z", line = 3165)
	boolean method5269() {
		@Pc(7) boolean local7 = !this.aClass267_4.aBoolean692;
		@Pc(20) boolean local20 = (this.anInt529 & 0x37) != 0 && !this.aClass267_2.aBoolean692;
		@Pc(28) boolean local28 = !this.aClass267_1.aBoolean692;
		@Pc(36) boolean local36 = !this.aClass267_3.aBoolean692;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface21 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray12 != null) {
			if (this.aClass267_1.anInterface21_23 == null) {
				this.aClass267_1.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_1.anInterface21_23;
			local69.method25687(this.anInt544 * 12, 12);
			local81 = this.aClass21_Sub3_5.anUnsafe3;
			if (local81 == null) {
				local149 = this.aClass21_Sub3_5.aByteBuffer4;
				local149.clear();
				for (local154 = 0; local154 < this.anInt544; local154++) {
					local149.putFloat((float) this.anIntArray62[this.aShortArray12[local154]]);
					local149.putFloat((float) this.anIntArray54[this.aShortArray12[local154]]);
					local149.putFloat((float) this.anIntArray55[this.aShortArray12[local154]]);
				}
				local69.method25705(0, local149.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				local88 = this.anInt544 * 12;
				local93 = local69.method25710(0, local88);
				for (local95 = 0; local95 < this.anInt544; local95++) {
					local104 = this.aShortArray12[local95];
					local81.putFloat(local93, (float) this.anIntArray62[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray54[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray55[local104]);
					local93 += 4L;
				}
				local69.method25707();
			}
			this.aClass267_1.anInterface21_22 = local69;
			this.aClass267_1.aBoolean692 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass267_4.anInterface21_23 == null) {
				this.aClass267_4.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_4.anInterface21_23;
			local69.method25687(this.anInt544 * 4, 4);
			local81 = this.aClass21_Sub3_5.anUnsafe3;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass21_Sub3_5.aByteBuffer4;
				local149.clear();
				if ((this.anInt529 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass257_1 == null) {
						local600 = this.aShortArray14;
						local604 = this.aShortArray15;
						local264 = this.aShortArray17;
						local612 = this.aByteArray7;
					} else {
						local600 = this.aClass257_1.aShortArray106;
						local604 = this.aClass257_1.aShortArray105;
						local264 = this.aClass257_1.aShortArray107;
						local612 = this.aClass257_1.aByteArray77;
					}
					@Pc(635) float local635 = this.aClass21_Sub3_5.aFloat195 * 768.0F / (float) this.aShort10;
					@Pc(645) float local645 = this.aClass21_Sub3_5.aFloat196 * 768.0F / (float) this.aShort10;
					for (local647 = 0; local647 < this.anInt544; local647++) {
						@Pc(656) short local656 = this.aShortArray13[local647];
						local311 = this.method5286(this.aShortArray16[local656] & 0xFFFF, this.aShortArray20[local656], this.aShort11);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass21_Sub3_5.aFloat193;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass21_Sub3_5.aFloat194;
						local346 = (float) (local311 & 0xFF) * this.aClass21_Sub3_5.aFloat185;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local600[local647] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local604[local647] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local600[local647] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local604[local647] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass21_Sub3_5.aFloat197 + local366 * (local366 < 0.0F ? local645 : local635);
						@Pc(801) int local801 = (int) (local682 * local796);
						if (local801 < 0) {
							local801 = 0;
						} else if (local801 > 255) {
							local801 = 255;
						}
						@Pc(816) int local816 = (int) (local693 * local796);
						if (local816 < 0) {
							local816 = 0;
						} else if (local816 > 255) {
							local816 = 255;
						}
						local465 = (int) (local346 * local796);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						local149.putInt(255 - this.aByteArray8[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt544; local154++) {
						@Pc(876) short local876 = this.aShortArray13[local154];
						local95 = 255 - this.aByteArray8[local876] << 24 | this.method5286(this.aShortArray16[local876] & 0xFFFF, this.aShortArray20[local876], this.aShort11);
						local149.putInt(local95);
					}
				}
				local69.method25705(0, local149.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				local88 = this.anInt544 * 4;
				local93 = local69.method25710(0, local88);
				if ((this.anInt529 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass257_1 == null) {
						local264 = this.aShortArray14;
						local268 = this.aShortArray15;
						local272 = this.aShortArray17;
						local276 = this.aByteArray7;
					} else {
						local264 = this.aClass257_1.aShortArray106;
						local268 = this.aClass257_1.aShortArray105;
						local272 = this.aClass257_1.aShortArray107;
						local276 = this.aClass257_1.aByteArray77;
					}
					@Pc(299) float local299 = this.aClass21_Sub3_5.aFloat195 * 768.0F / (float) this.aShort10;
					@Pc(309) float local309 = this.aClass21_Sub3_5.aFloat196 * 768.0F / (float) this.aShort10;
					for (local311 = 0; local311 < this.anInt544; local311++) {
						@Pc(320) short local320 = this.aShortArray13[local311];
						@Pc(335) int local335 = this.method5286(this.aShortArray16[local320] & 0xFFFF, this.aShortArray20[local320], this.aShort11);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass21_Sub3_5.aFloat193;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass21_Sub3_5.aFloat194;
						local366 = (float) (local335 & 0xFF) * this.aClass21_Sub3_5.aFloat185;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local264[local311] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local268[local311] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local264[local311] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local268[local311] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass21_Sub3_5.aFloat197 + local407 * (local407 < 0.0F ? local309 : local299);
						local465 = (int) (local346 * local460);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						@Pc(480) int local480 = (int) (local357 * local460);
						if (local480 < 0) {
							local480 = 0;
						} else if (local480 > 255) {
							local480 = 255;
						}
						@Pc(495) int local495 = (int) (local366 * local460);
						if (local495 < 0) {
							local495 = 0;
						} else if (local495 > 255) {
							local495 = 255;
						}
						local81.putInt(local93, 255 - this.aByteArray8[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt544; local95++) {
						local104 = this.aShortArray13[local95];
						local568 = 255 - this.aByteArray8[local104] << 24 | this.method5286(this.aShortArray16[local104] & 0xFFFF, this.aShortArray20[local104], this.aShort11);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method25707();
			}
			this.aClass267_4.anInterface21_22 = local69;
			this.aClass267_4.aBoolean692 = true;
		}
		if (local20) {
			if (this.aClass267_2.anInterface21_23 == null) {
				this.aClass267_2.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_2.anInterface21_23;
			local69.method25687(this.anInt544 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass257_1 == null) {
				local956 = this.aShortArray14;
				local960 = this.aShortArray15;
				local600 = this.aShortArray17;
				local968 = this.aByteArray7;
			} else {
				local956 = this.aClass257_1.aShortArray106;
				local960 = this.aClass257_1.aShortArray105;
				local600 = this.aClass257_1.aShortArray107;
				local968 = this.aClass257_1.aByteArray77;
			}
			@Pc(985) Unsafe local985 = this.aClass21_Sub3_5.anUnsafe3;
			if (local985 == null) {
				@Pc(1068) ByteBuffer local1068 = this.aClass21_Sub3_5.aByteBuffer4;
				local1068.clear();
				for (local568 = 0; local568 < this.anInt544; local568++) {
					@Pc(1093) Class320 local1093 = new Class320((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local968[local568] > 1) {
						local1093.method25887((float) local968[local568]);
					}
					local1093.method25890();
					local1068.putFloat(local1093.aFloat259);
					local1068.putFloat(local1093.aFloat260);
					local1068.putFloat(local1093.aFloat261);
				}
				local69.method25705(0, local1068.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				@Pc(992) int local992 = this.anInt544 * 12;
				@Pc(997) long local997 = local69.method25710(0, local992);
				for (local647 = 0; local647 < this.anInt544; local647++) {
					@Pc(1019) Class320 local1019 = new Class320((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local968[local647] > 1) {
						local1019.method25887((float) local968[local647]);
					}
					local1019.method25890();
					local985.putFloat(local997, local1019.aFloat259);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat260);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat261);
					local997 += 4L;
				}
				local69.method25707();
			}
			this.aClass267_2.anInterface21_22 = local69;
			this.aClass267_2.aBoolean692 = true;
		}
		if (local36) {
			if (this.aClass267_3.anInterface21_23 == null) {
				this.aClass267_3.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_3.anInterface21_23;
			local69.method25687(this.anInt544 * 8, 8);
			local81 = this.aClass21_Sub3_5.anUnsafe3;
			if (local81 == null) {
				local149 = this.aClass21_Sub3_5.aByteBuffer4;
				local149.clear();
				for (local154 = 0; local154 < this.anInt544; local154++) {
					local149.putFloat(this.aFloatArray35[local154]);
					local149.putFloat(this.aFloatArray37[local154]);
				}
				local69.method25705(0, local149.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				local88 = this.anInt544 * 8;
				local93 = local69.method25710(0, local88);
				for (local95 = 0; local95 < this.anInt544; local95++) {
					local81.putFloat(local93, this.aFloatArray35[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray37[local95]);
					local93 += 4L;
				}
				local69.method25707();
			}
			this.aClass267_3.anInterface21_22 = local69;
			this.aClass267_3.aBoolean692 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!abw", name = "hn", descriptor = "()Z", line = 3165)
	boolean method5283() {
		@Pc(7) boolean local7 = !this.aClass267_4.aBoolean692;
		@Pc(20) boolean local20 = (this.anInt529 & 0x37) != 0 && !this.aClass267_2.aBoolean692;
		@Pc(28) boolean local28 = !this.aClass267_1.aBoolean692;
		@Pc(36) boolean local36 = !this.aClass267_3.aBoolean692;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface21 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray12 != null) {
			if (this.aClass267_1.anInterface21_23 == null) {
				this.aClass267_1.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_1.anInterface21_23;
			local69.method25687(this.anInt544 * 12, 12);
			local81 = this.aClass21_Sub3_5.anUnsafe3;
			if (local81 == null) {
				local149 = this.aClass21_Sub3_5.aByteBuffer4;
				local149.clear();
				for (local154 = 0; local154 < this.anInt544; local154++) {
					local149.putFloat((float) this.anIntArray62[this.aShortArray12[local154]]);
					local149.putFloat((float) this.anIntArray54[this.aShortArray12[local154]]);
					local149.putFloat((float) this.anIntArray55[this.aShortArray12[local154]]);
				}
				local69.method25705(0, local149.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				local88 = this.anInt544 * 12;
				local93 = local69.method25710(0, local88);
				for (local95 = 0; local95 < this.anInt544; local95++) {
					local104 = this.aShortArray12[local95];
					local81.putFloat(local93, (float) this.anIntArray62[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray54[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray55[local104]);
					local93 += 4L;
				}
				local69.method25707();
			}
			this.aClass267_1.anInterface21_22 = local69;
			this.aClass267_1.aBoolean692 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass267_4.anInterface21_23 == null) {
				this.aClass267_4.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_4.anInterface21_23;
			local69.method25687(this.anInt544 * 4, 4);
			local81 = this.aClass21_Sub3_5.anUnsafe3;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass21_Sub3_5.aByteBuffer4;
				local149.clear();
				if ((this.anInt529 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass257_1 == null) {
						local600 = this.aShortArray14;
						local604 = this.aShortArray15;
						local264 = this.aShortArray17;
						local612 = this.aByteArray7;
					} else {
						local600 = this.aClass257_1.aShortArray106;
						local604 = this.aClass257_1.aShortArray105;
						local264 = this.aClass257_1.aShortArray107;
						local612 = this.aClass257_1.aByteArray77;
					}
					@Pc(635) float local635 = this.aClass21_Sub3_5.aFloat195 * 768.0F / (float) this.aShort10;
					@Pc(645) float local645 = this.aClass21_Sub3_5.aFloat196 * 768.0F / (float) this.aShort10;
					for (local647 = 0; local647 < this.anInt544; local647++) {
						@Pc(656) short local656 = this.aShortArray13[local647];
						local311 = this.method5286(this.aShortArray16[local656] & 0xFFFF, this.aShortArray20[local656], this.aShort11);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass21_Sub3_5.aFloat193;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass21_Sub3_5.aFloat194;
						local346 = (float) (local311 & 0xFF) * this.aClass21_Sub3_5.aFloat185;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local600[local647] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local604[local647] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local600[local647] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local604[local647] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass21_Sub3_5.aFloat197 + local366 * (local366 < 0.0F ? local645 : local635);
						@Pc(801) int local801 = (int) (local682 * local796);
						if (local801 < 0) {
							local801 = 0;
						} else if (local801 > 255) {
							local801 = 255;
						}
						@Pc(816) int local816 = (int) (local693 * local796);
						if (local816 < 0) {
							local816 = 0;
						} else if (local816 > 255) {
							local816 = 255;
						}
						local465 = (int) (local346 * local796);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						local149.putInt(255 - this.aByteArray8[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt544; local154++) {
						@Pc(876) short local876 = this.aShortArray13[local154];
						local95 = 255 - this.aByteArray8[local876] << 24 | this.method5286(this.aShortArray16[local876] & 0xFFFF, this.aShortArray20[local876], this.aShort11);
						local149.putInt(local95);
					}
				}
				local69.method25705(0, local149.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				local88 = this.anInt544 * 4;
				local93 = local69.method25710(0, local88);
				if ((this.anInt529 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass257_1 == null) {
						local264 = this.aShortArray14;
						local268 = this.aShortArray15;
						local272 = this.aShortArray17;
						local276 = this.aByteArray7;
					} else {
						local264 = this.aClass257_1.aShortArray106;
						local268 = this.aClass257_1.aShortArray105;
						local272 = this.aClass257_1.aShortArray107;
						local276 = this.aClass257_1.aByteArray77;
					}
					@Pc(299) float local299 = this.aClass21_Sub3_5.aFloat195 * 768.0F / (float) this.aShort10;
					@Pc(309) float local309 = this.aClass21_Sub3_5.aFloat196 * 768.0F / (float) this.aShort10;
					for (local311 = 0; local311 < this.anInt544; local311++) {
						@Pc(320) short local320 = this.aShortArray13[local311];
						@Pc(335) int local335 = this.method5286(this.aShortArray16[local320] & 0xFFFF, this.aShortArray20[local320], this.aShort11);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass21_Sub3_5.aFloat193;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass21_Sub3_5.aFloat194;
						local366 = (float) (local335 & 0xFF) * this.aClass21_Sub3_5.aFloat185;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local264[local311] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local268[local311] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local264[local311] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local268[local311] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass21_Sub3_5.aFloat197 + local407 * (local407 < 0.0F ? local309 : local299);
						local465 = (int) (local346 * local460);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						@Pc(480) int local480 = (int) (local357 * local460);
						if (local480 < 0) {
							local480 = 0;
						} else if (local480 > 255) {
							local480 = 255;
						}
						@Pc(495) int local495 = (int) (local366 * local460);
						if (local495 < 0) {
							local495 = 0;
						} else if (local495 > 255) {
							local495 = 255;
						}
						local81.putInt(local93, 255 - this.aByteArray8[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt544; local95++) {
						local104 = this.aShortArray13[local95];
						local568 = 255 - this.aByteArray8[local104] << 24 | this.method5286(this.aShortArray16[local104] & 0xFFFF, this.aShortArray20[local104], this.aShort11);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method25707();
			}
			this.aClass267_4.anInterface21_22 = local69;
			this.aClass267_4.aBoolean692 = true;
		}
		if (local20) {
			if (this.aClass267_2.anInterface21_23 == null) {
				this.aClass267_2.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_2.anInterface21_23;
			local69.method25687(this.anInt544 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass257_1 == null) {
				local956 = this.aShortArray14;
				local960 = this.aShortArray15;
				local600 = this.aShortArray17;
				local968 = this.aByteArray7;
			} else {
				local956 = this.aClass257_1.aShortArray106;
				local960 = this.aClass257_1.aShortArray105;
				local600 = this.aClass257_1.aShortArray107;
				local968 = this.aClass257_1.aByteArray77;
			}
			@Pc(985) Unsafe local985 = this.aClass21_Sub3_5.anUnsafe3;
			if (local985 == null) {
				@Pc(1068) ByteBuffer local1068 = this.aClass21_Sub3_5.aByteBuffer4;
				local1068.clear();
				for (local568 = 0; local568 < this.anInt544; local568++) {
					@Pc(1093) Class320 local1093 = new Class320((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local968[local568] > 1) {
						local1093.method25887((float) local968[local568]);
					}
					local1093.method25890();
					local1068.putFloat(local1093.aFloat259);
					local1068.putFloat(local1093.aFloat260);
					local1068.putFloat(local1093.aFloat261);
				}
				local69.method25705(0, local1068.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				@Pc(992) int local992 = this.anInt544 * 12;
				@Pc(997) long local997 = local69.method25710(0, local992);
				for (local647 = 0; local647 < this.anInt544; local647++) {
					@Pc(1019) Class320 local1019 = new Class320((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local968[local647] > 1) {
						local1019.method25887((float) local968[local647]);
					}
					local1019.method25890();
					local985.putFloat(local997, local1019.aFloat259);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat260);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat261);
					local997 += 4L;
				}
				local69.method25707();
			}
			this.aClass267_2.anInterface21_22 = local69;
			this.aClass267_2.aBoolean692 = true;
		}
		if (local36) {
			if (this.aClass267_3.anInterface21_23 == null) {
				this.aClass267_3.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_3.anInterface21_23;
			local69.method25687(this.anInt544 * 8, 8);
			local81 = this.aClass21_Sub3_5.anUnsafe3;
			if (local81 == null) {
				local149 = this.aClass21_Sub3_5.aByteBuffer4;
				local149.clear();
				for (local154 = 0; local154 < this.anInt544; local154++) {
					local149.putFloat(this.aFloatArray35[local154]);
					local149.putFloat(this.aFloatArray37[local154]);
				}
				local69.method25705(0, local149.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				local88 = this.anInt544 * 8;
				local93 = local69.method25710(0, local88);
				for (local95 = 0; local95 < this.anInt544; local95++) {
					local81.putFloat(local93, this.aFloatArray35[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray37[local95]);
					local93 += 4L;
				}
				local69.method25707();
			}
			this.aClass267_3.anInterface21_22 = local69;
			this.aClass267_3.aBoolean692 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!abw", name = "it", descriptor = "()Z", line = 3165)
	boolean method5310() {
		@Pc(7) boolean local7 = !this.aClass267_4.aBoolean692;
		@Pc(20) boolean local20 = (this.anInt529 & 0x37) != 0 && !this.aClass267_2.aBoolean692;
		@Pc(28) boolean local28 = !this.aClass267_1.aBoolean692;
		@Pc(36) boolean local36 = !this.aClass267_3.aBoolean692;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface21 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray12 != null) {
			if (this.aClass267_1.anInterface21_23 == null) {
				this.aClass267_1.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_1.anInterface21_23;
			local69.method25687(this.anInt544 * 12, 12);
			local81 = this.aClass21_Sub3_5.anUnsafe3;
			if (local81 == null) {
				local149 = this.aClass21_Sub3_5.aByteBuffer4;
				local149.clear();
				for (local154 = 0; local154 < this.anInt544; local154++) {
					local149.putFloat((float) this.anIntArray62[this.aShortArray12[local154]]);
					local149.putFloat((float) this.anIntArray54[this.aShortArray12[local154]]);
					local149.putFloat((float) this.anIntArray55[this.aShortArray12[local154]]);
				}
				local69.method25705(0, local149.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				local88 = this.anInt544 * 12;
				local93 = local69.method25710(0, local88);
				for (local95 = 0; local95 < this.anInt544; local95++) {
					local104 = this.aShortArray12[local95];
					local81.putFloat(local93, (float) this.anIntArray62[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray54[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray55[local104]);
					local93 += 4L;
				}
				local69.method25707();
			}
			this.aClass267_1.anInterface21_22 = local69;
			this.aClass267_1.aBoolean692 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass267_4.anInterface21_23 == null) {
				this.aClass267_4.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_4.anInterface21_23;
			local69.method25687(this.anInt544 * 4, 4);
			local81 = this.aClass21_Sub3_5.anUnsafe3;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass21_Sub3_5.aByteBuffer4;
				local149.clear();
				if ((this.anInt529 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass257_1 == null) {
						local600 = this.aShortArray14;
						local604 = this.aShortArray15;
						local264 = this.aShortArray17;
						local612 = this.aByteArray7;
					} else {
						local600 = this.aClass257_1.aShortArray106;
						local604 = this.aClass257_1.aShortArray105;
						local264 = this.aClass257_1.aShortArray107;
						local612 = this.aClass257_1.aByteArray77;
					}
					@Pc(635) float local635 = this.aClass21_Sub3_5.aFloat195 * 768.0F / (float) this.aShort10;
					@Pc(645) float local645 = this.aClass21_Sub3_5.aFloat196 * 768.0F / (float) this.aShort10;
					for (local647 = 0; local647 < this.anInt544; local647++) {
						@Pc(656) short local656 = this.aShortArray13[local647];
						local311 = this.method5286(this.aShortArray16[local656] & 0xFFFF, this.aShortArray20[local656], this.aShort11);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass21_Sub3_5.aFloat193;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass21_Sub3_5.aFloat194;
						local346 = (float) (local311 & 0xFF) * this.aClass21_Sub3_5.aFloat185;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local600[local647] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local604[local647] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local600[local647] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local604[local647] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass21_Sub3_5.aFloat197 + local366 * (local366 < 0.0F ? local645 : local635);
						@Pc(801) int local801 = (int) (local682 * local796);
						if (local801 < 0) {
							local801 = 0;
						} else if (local801 > 255) {
							local801 = 255;
						}
						@Pc(816) int local816 = (int) (local693 * local796);
						if (local816 < 0) {
							local816 = 0;
						} else if (local816 > 255) {
							local816 = 255;
						}
						local465 = (int) (local346 * local796);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						local149.putInt(255 - this.aByteArray8[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt544; local154++) {
						@Pc(876) short local876 = this.aShortArray13[local154];
						local95 = 255 - this.aByteArray8[local876] << 24 | this.method5286(this.aShortArray16[local876] & 0xFFFF, this.aShortArray20[local876], this.aShort11);
						local149.putInt(local95);
					}
				}
				local69.method25705(0, local149.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				local88 = this.anInt544 * 4;
				local93 = local69.method25710(0, local88);
				if ((this.anInt529 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass257_1 == null) {
						local264 = this.aShortArray14;
						local268 = this.aShortArray15;
						local272 = this.aShortArray17;
						local276 = this.aByteArray7;
					} else {
						local264 = this.aClass257_1.aShortArray106;
						local268 = this.aClass257_1.aShortArray105;
						local272 = this.aClass257_1.aShortArray107;
						local276 = this.aClass257_1.aByteArray77;
					}
					@Pc(299) float local299 = this.aClass21_Sub3_5.aFloat195 * 768.0F / (float) this.aShort10;
					@Pc(309) float local309 = this.aClass21_Sub3_5.aFloat196 * 768.0F / (float) this.aShort10;
					for (local311 = 0; local311 < this.anInt544; local311++) {
						@Pc(320) short local320 = this.aShortArray13[local311];
						@Pc(335) int local335 = this.method5286(this.aShortArray16[local320] & 0xFFFF, this.aShortArray20[local320], this.aShort11);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass21_Sub3_5.aFloat193;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass21_Sub3_5.aFloat194;
						local366 = (float) (local335 & 0xFF) * this.aClass21_Sub3_5.aFloat185;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local264[local311] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local268[local311] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local264[local311] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local268[local311] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass21_Sub3_5.aFloat197 + local407 * (local407 < 0.0F ? local309 : local299);
						local465 = (int) (local346 * local460);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						@Pc(480) int local480 = (int) (local357 * local460);
						if (local480 < 0) {
							local480 = 0;
						} else if (local480 > 255) {
							local480 = 255;
						}
						@Pc(495) int local495 = (int) (local366 * local460);
						if (local495 < 0) {
							local495 = 0;
						} else if (local495 > 255) {
							local495 = 255;
						}
						local81.putInt(local93, 255 - this.aByteArray8[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt544; local95++) {
						local104 = this.aShortArray13[local95];
						local568 = 255 - this.aByteArray8[local104] << 24 | this.method5286(this.aShortArray16[local104] & 0xFFFF, this.aShortArray20[local104], this.aShort11);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method25707();
			}
			this.aClass267_4.anInterface21_22 = local69;
			this.aClass267_4.aBoolean692 = true;
		}
		if (local20) {
			if (this.aClass267_2.anInterface21_23 == null) {
				this.aClass267_2.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_2.anInterface21_23;
			local69.method25687(this.anInt544 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass257_1 == null) {
				local956 = this.aShortArray14;
				local960 = this.aShortArray15;
				local600 = this.aShortArray17;
				local968 = this.aByteArray7;
			} else {
				local956 = this.aClass257_1.aShortArray106;
				local960 = this.aClass257_1.aShortArray105;
				local600 = this.aClass257_1.aShortArray107;
				local968 = this.aClass257_1.aByteArray77;
			}
			@Pc(985) Unsafe local985 = this.aClass21_Sub3_5.anUnsafe3;
			if (local985 == null) {
				@Pc(1068) ByteBuffer local1068 = this.aClass21_Sub3_5.aByteBuffer4;
				local1068.clear();
				for (local568 = 0; local568 < this.anInt544; local568++) {
					@Pc(1093) Class320 local1093 = new Class320((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local968[local568] > 1) {
						local1093.method25887((float) local968[local568]);
					}
					local1093.method25890();
					local1068.putFloat(local1093.aFloat259);
					local1068.putFloat(local1093.aFloat260);
					local1068.putFloat(local1093.aFloat261);
				}
				local69.method25705(0, local1068.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				@Pc(992) int local992 = this.anInt544 * 12;
				@Pc(997) long local997 = local69.method25710(0, local992);
				for (local647 = 0; local647 < this.anInt544; local647++) {
					@Pc(1019) Class320 local1019 = new Class320((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local968[local647] > 1) {
						local1019.method25887((float) local968[local647]);
					}
					local1019.method25890();
					local985.putFloat(local997, local1019.aFloat259);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat260);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat261);
					local997 += 4L;
				}
				local69.method25707();
			}
			this.aClass267_2.anInterface21_22 = local69;
			this.aClass267_2.aBoolean692 = true;
		}
		if (local36) {
			if (this.aClass267_3.anInterface21_23 == null) {
				this.aClass267_3.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_3.anInterface21_23;
			local69.method25687(this.anInt544 * 8, 8);
			local81 = this.aClass21_Sub3_5.anUnsafe3;
			if (local81 == null) {
				local149 = this.aClass21_Sub3_5.aByteBuffer4;
				local149.clear();
				for (local154 = 0; local154 < this.anInt544; local154++) {
					local149.putFloat(this.aFloatArray35[local154]);
					local149.putFloat(this.aFloatArray37[local154]);
				}
				local69.method25705(0, local149.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				local88 = this.anInt544 * 8;
				local93 = local69.method25710(0, local88);
				for (local95 = 0; local95 < this.anInt544; local95++) {
					local81.putFloat(local93, this.aFloatArray35[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray37[local95]);
					local93 += 4L;
				}
				local69.method25707();
			}
			this.aClass267_3.anInterface21_22 = local69;
			this.aClass267_3.aBoolean692 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!abw", name = "iw", descriptor = "()Z", line = 3165)
	boolean method5311() {
		@Pc(7) boolean local7 = !this.aClass267_4.aBoolean692;
		@Pc(20) boolean local20 = (this.anInt529 & 0x37) != 0 && !this.aClass267_2.aBoolean692;
		@Pc(28) boolean local28 = !this.aClass267_1.aBoolean692;
		@Pc(36) boolean local36 = !this.aClass267_3.aBoolean692;
		if (!local28 && !local7 && !local20 && !local36) {
			return true;
		}
		@Pc(48) boolean local48 = true;
		@Pc(69) Interface21 local69;
		@Pc(81) Unsafe local81;
		@Pc(149) ByteBuffer local149;
		@Pc(154) int local154;
		@Pc(95) int local95;
		@Pc(104) short local104;
		@Pc(88) int local88;
		@Pc(93) long local93;
		if (local28 && this.aShortArray12 != null) {
			if (this.aClass267_1.anInterface21_23 == null) {
				this.aClass267_1.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_1.anInterface21_23;
			local69.method25687(this.anInt544 * 12, 12);
			local81 = this.aClass21_Sub3_5.anUnsafe3;
			if (local81 == null) {
				local149 = this.aClass21_Sub3_5.aByteBuffer4;
				local149.clear();
				for (local154 = 0; local154 < this.anInt544; local154++) {
					local149.putFloat((float) this.anIntArray62[this.aShortArray12[local154]]);
					local149.putFloat((float) this.anIntArray54[this.aShortArray12[local154]]);
					local149.putFloat((float) this.anIntArray55[this.aShortArray12[local154]]);
				}
				local69.method25705(0, local149.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				local88 = this.anInt544 * 12;
				local93 = local69.method25710(0, local88);
				for (local95 = 0; local95 < this.anInt544; local95++) {
					local104 = this.aShortArray12[local95];
					local81.putFloat(local93, (float) this.anIntArray62[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray54[local104]);
					local93 += 4L;
					local81.putFloat(local93, (float) this.anIntArray55[local104]);
					local93 += 4L;
				}
				local69.method25707();
			}
			this.aClass267_1.anInterface21_22 = local69;
			this.aClass267_1.aBoolean692 = true;
		}
		@Pc(647) int local647;
		@Pc(600) short[] local600;
		@Pc(568) int local568;
		if (local7) {
			if (this.aClass267_4.anInterface21_23 == null) {
				this.aClass267_4.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_4.anInterface21_23;
			local69.method25687(this.anInt544 * 4, 4);
			local81 = this.aClass21_Sub3_5.anUnsafe3;
			@Pc(311) int local311;
			@Pc(346) float local346;
			@Pc(366) float local366;
			@Pc(465) int local465;
			@Pc(264) short[] local264;
			if (local81 == null) {
				local149 = this.aClass21_Sub3_5.aByteBuffer4;
				local149.clear();
				if ((this.anInt529 & 0x37) == 0) {
					@Pc(604) short[] local604;
					@Pc(612) byte[] local612;
					if (this.aClass257_1 == null) {
						local600 = this.aShortArray14;
						local604 = this.aShortArray15;
						local264 = this.aShortArray17;
						local612 = this.aByteArray7;
					} else {
						local600 = this.aClass257_1.aShortArray106;
						local604 = this.aClass257_1.aShortArray105;
						local264 = this.aClass257_1.aShortArray107;
						local612 = this.aClass257_1.aByteArray77;
					}
					@Pc(635) float local635 = this.aClass21_Sub3_5.aFloat195 * 768.0F / (float) this.aShort10;
					@Pc(645) float local645 = this.aClass21_Sub3_5.aFloat196 * 768.0F / (float) this.aShort10;
					for (local647 = 0; local647 < this.anInt544; local647++) {
						@Pc(656) short local656 = this.aShortArray13[local647];
						local311 = this.method5286(this.aShortArray16[local656] & 0xFFFF, this.aShortArray20[local656], this.aShort11);
						@Pc(682) float local682 = (float) (local311 >> 16 & 0xFF) * this.aClass21_Sub3_5.aFloat193;
						@Pc(693) float local693 = (float) (local311 >> 8 & 0xFF) * this.aClass21_Sub3_5.aFloat194;
						local346 = (float) (local311 & 0xFF) * this.aClass21_Sub3_5.aFloat185;
						@Pc(706) byte local706 = local612[local647];
						if (local706 == 0) {
							local366 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local600[local647] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local604[local647] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local264[local647]) * 0.0026041667F;
						} else {
							local366 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local600[local647] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local604[local647] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local264[local647]) / ((float) local706 * 256.0F);
						}
						@Pc(796) float local796 = this.aClass21_Sub3_5.aFloat197 + local366 * (local366 < 0.0F ? local645 : local635);
						@Pc(801) int local801 = (int) (local682 * local796);
						if (local801 < 0) {
							local801 = 0;
						} else if (local801 > 255) {
							local801 = 255;
						}
						@Pc(816) int local816 = (int) (local693 * local796);
						if (local816 < 0) {
							local816 = 0;
						} else if (local816 > 255) {
							local816 = 255;
						}
						local465 = (int) (local346 * local796);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						local149.putInt(255 - this.aByteArray8[local656] << 24 | local801 << 16 | local816 << 8 | local465);
					}
				} else {
					for (local154 = 0; local154 < this.anInt544; local154++) {
						@Pc(876) short local876 = this.aShortArray13[local154];
						local95 = 255 - this.aByteArray8[local876] << 24 | this.method5286(this.aShortArray16[local876] & 0xFFFF, this.aShortArray20[local876], this.aShort11);
						local149.putInt(local95);
					}
				}
				local69.method25705(0, local149.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				local88 = this.anInt544 * 4;
				local93 = local69.method25710(0, local88);
				if ((this.anInt529 & 0x37) == 0) {
					@Pc(268) short[] local268;
					@Pc(272) short[] local272;
					@Pc(276) byte[] local276;
					if (this.aClass257_1 == null) {
						local264 = this.aShortArray14;
						local268 = this.aShortArray15;
						local272 = this.aShortArray17;
						local276 = this.aByteArray7;
					} else {
						local264 = this.aClass257_1.aShortArray106;
						local268 = this.aClass257_1.aShortArray105;
						local272 = this.aClass257_1.aShortArray107;
						local276 = this.aClass257_1.aByteArray77;
					}
					@Pc(299) float local299 = this.aClass21_Sub3_5.aFloat195 * 768.0F / (float) this.aShort10;
					@Pc(309) float local309 = this.aClass21_Sub3_5.aFloat196 * 768.0F / (float) this.aShort10;
					for (local311 = 0; local311 < this.anInt544; local311++) {
						@Pc(320) short local320 = this.aShortArray13[local311];
						@Pc(335) int local335 = this.method5286(this.aShortArray16[local320] & 0xFFFF, this.aShortArray20[local320], this.aShort11);
						local346 = (float) (local335 >> 16 & 0xFF) * this.aClass21_Sub3_5.aFloat193;
						@Pc(357) float local357 = (float) (local335 >> 8 & 0xFF) * this.aClass21_Sub3_5.aFloat194;
						local366 = (float) (local335 & 0xFF) * this.aClass21_Sub3_5.aFloat185;
						@Pc(370) byte local370 = local276[local311];
						@Pc(407) float local407;
						if (local370 == 0) {
							local407 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local264[local311] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local268[local311] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local272[local311]) * 0.0026041667F;
						} else {
							local407 = (this.aClass21_Sub3_5.aFloatArray76[0] * (float) local264[local311] + this.aClass21_Sub3_5.aFloatArray76[1] * (float) local268[local311] + this.aClass21_Sub3_5.aFloatArray76[2] * (float) local272[local311]) / ((float) local370 * 256.0F);
						}
						@Pc(460) float local460 = this.aClass21_Sub3_5.aFloat197 + local407 * (local407 < 0.0F ? local309 : local299);
						local465 = (int) (local346 * local460);
						if (local465 < 0) {
							local465 = 0;
						} else if (local465 > 255) {
							local465 = 255;
						}
						@Pc(480) int local480 = (int) (local357 * local460);
						if (local480 < 0) {
							local480 = 0;
						} else if (local480 > 255) {
							local480 = 255;
						}
						@Pc(495) int local495 = (int) (local366 * local460);
						if (local495 < 0) {
							local495 = 0;
						} else if (local495 > 255) {
							local495 = 255;
						}
						local81.putInt(local93, 255 - this.aByteArray8[local320] << 24 | local465 << 16 | local480 << 8 | local495);
						local93 += 4L;
					}
				} else {
					for (local95 = 0; local95 < this.anInt544; local95++) {
						local104 = this.aShortArray13[local95];
						local568 = 255 - this.aByteArray8[local104] << 24 | this.method5286(this.aShortArray16[local104] & 0xFFFF, this.aShortArray20[local104], this.aShort11);
						local81.putInt(local93, local568);
						local93 += 4L;
					}
				}
				local69.method25707();
			}
			this.aClass267_4.anInterface21_22 = local69;
			this.aClass267_4.aBoolean692 = true;
		}
		if (local20) {
			if (this.aClass267_2.anInterface21_23 == null) {
				this.aClass267_2.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_2.anInterface21_23;
			local69.method25687(this.anInt544 * 12, 12);
			@Pc(956) short[] local956;
			@Pc(960) short[] local960;
			@Pc(968) byte[] local968;
			if (this.aClass257_1 == null) {
				local956 = this.aShortArray14;
				local960 = this.aShortArray15;
				local600 = this.aShortArray17;
				local968 = this.aByteArray7;
			} else {
				local956 = this.aClass257_1.aShortArray106;
				local960 = this.aClass257_1.aShortArray105;
				local600 = this.aClass257_1.aShortArray107;
				local968 = this.aClass257_1.aByteArray77;
			}
			@Pc(985) Unsafe local985 = this.aClass21_Sub3_5.anUnsafe3;
			if (local985 == null) {
				@Pc(1068) ByteBuffer local1068 = this.aClass21_Sub3_5.aByteBuffer4;
				local1068.clear();
				for (local568 = 0; local568 < this.anInt544; local568++) {
					@Pc(1093) Class320 local1093 = new Class320((float) local956[local568], (float) local960[local568], (float) local600[local568]);
					if (local968[local568] > 1) {
						local1093.method25887((float) local968[local568]);
					}
					local1093.method25890();
					local1068.putFloat(local1093.aFloat259);
					local1068.putFloat(local1093.aFloat260);
					local1068.putFloat(local1093.aFloat261);
				}
				local69.method25705(0, local1068.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				@Pc(992) int local992 = this.anInt544 * 12;
				@Pc(997) long local997 = local69.method25710(0, local992);
				for (local647 = 0; local647 < this.anInt544; local647++) {
					@Pc(1019) Class320 local1019 = new Class320((float) local956[local647], (float) local960[local647], (float) local600[local647]);
					if (local968[local647] > 1) {
						local1019.method25887((float) local968[local647]);
					}
					local1019.method25890();
					local985.putFloat(local997, local1019.aFloat259);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat260);
					local997 += 4L;
					local985.putFloat(local997, local1019.aFloat261);
					local997 += 4L;
				}
				local69.method25707();
			}
			this.aClass267_2.anInterface21_22 = local69;
			this.aClass267_2.aBoolean692 = true;
		}
		if (local36) {
			if (this.aClass267_3.anInterface21_23 == null) {
				this.aClass267_3.anInterface21_23 = this.aClass21_Sub3_5.method17542(this.aBoolean123);
			}
			local69 = this.aClass267_3.anInterface21_23;
			local69.method25687(this.anInt544 * 8, 8);
			local81 = this.aClass21_Sub3_5.anUnsafe3;
			if (local81 == null) {
				local149 = this.aClass21_Sub3_5.aByteBuffer4;
				local149.clear();
				for (local154 = 0; local154 < this.anInt544; local154++) {
					local149.putFloat(this.aFloatArray35[local154]);
					local149.putFloat(this.aFloatArray37[local154]);
				}
				local69.method25705(0, local149.position(), this.aClass21_Sub3_5.aLong101);
			} else {
				local88 = this.anInt544 * 8;
				local93 = local69.method25710(0, local88);
				for (local95 = 0; local95 < this.anInt544; local95++) {
					local81.putFloat(local93, this.aFloatArray35[local95]);
					local93 += 4L;
					local81.putFloat(local93, this.aFloatArray37[local95]);
					local93 += 4L;
				}
				local69.method25707();
			}
			this.aClass267_3.anInterface21_22 = local69;
			this.aClass267_3.aBoolean692 = true;
		}
		return local48;
	}

	@OriginalMember(owner = "client!abw", name = "iv", descriptor = "()V", line = 3406)
	void method5278() {
		if (this.aClass267_1 != null) {
			this.aClass267_1.method25265();
		}
		if (this.aClass267_3 != null) {
			this.aClass267_3.method25265();
		}
		if (this.aClass267_4 != null) {
			this.aClass267_4.method25265();
		}
		if (this.aClass267_2 != null) {
			this.aClass267_2.method25265();
		}
		if (this.aClass233_1 != null) {
			this.aClass233_1.method24587();
		}
	}

	@OriginalMember(owner = "client!abw", name = "hw", descriptor = "()V", line = 3406)
	void method5284() {
		if (this.aClass267_1 != null) {
			this.aClass267_1.method25265();
		}
		if (this.aClass267_3 != null) {
			this.aClass267_3.method25265();
		}
		if (this.aClass267_4 != null) {
			this.aClass267_4.method25265();
		}
		if (this.aClass267_2 != null) {
			this.aClass267_2.method25265();
		}
		if (this.aClass233_1 != null) {
			this.aClass233_1.method24587();
		}
	}

	@OriginalMember(owner = "client!abw", name = "ii", descriptor = "()V", line = 3406)
	void method5312() {
		if (this.aClass267_1 != null) {
			this.aClass267_1.method25265();
		}
		if (this.aClass267_3 != null) {
			this.aClass267_3.method25265();
		}
		if (this.aClass267_4 != null) {
			this.aClass267_4.method25265();
		}
		if (this.aClass267_2 != null) {
			this.aClass267_2.method25265();
		}
		if (this.aClass233_1 != null) {
			this.aClass233_1.method24587();
		}
	}

	@OriginalMember(owner = "client!abw", name = "hy", descriptor = "(II)I", line = 3414)
	int method5285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!abw", name = "io", descriptor = "(II)I", line = 3414)
	int method5309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!abw", name = "iz", descriptor = "(II)I", line = 3414)
	int method5314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!abw", name = "ie", descriptor = "(II)I", line = 3414)
	int method5315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!abw", name = "hr", descriptor = "(ISI)I", line = 3421)
	int method5286(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.aClass21_Sub3_5.anIntArray250[this.method5285(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(20) Class133 local20 = this.aClass21_Sub3_5.aClass134_7.method22906(arg1 & 0xFFFF);
			@Pc(25) int local25 = local20.aByte120 & 0xFF;
			@Pc(35) int local35;
			@Pc(58) int local58;
			if (local25 != 0) {
				if (arg2 < 0) {
					local35 = 0;
				} else if (arg2 > 127) {
					local35 = 16777215;
				} else {
					local35 = arg2 * 131586;
				}
				if (local25 == 256) {
					local8 = local35;
				} else {
					local58 = 256 - local25;
					local8 = ((local35 & 0xFF00FF) * local25 + (local8 & 0xFF00FF) * local58 & 0xFF00FF00) + ((local35 & 0xFF00) * local25 + (local8 & 0xFF00) * local58 & 0xFF0000) >> 8;
				}
			}
			local35 = local20.aByte121 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(104) int local104 = (local8 >> 16 & 0xFF) * local35;
				if (local104 > 65535) {
					local104 = 65535;
				}
				local58 = (local8 >> 8 & 0xFF) * local35;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(128) int local128 = (local8 & 0xFF) * local35;
				if (local128 > 65535) {
					local128 = 65535;
				}
				local8 = ((local104 & 0xFF00) << 8) + (local58 & 0xFF00) + (local128 >> 8);
			}
		}
		return local8 & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!abw", name = "ic", descriptor = "(ISI)I", line = 3421)
	int method5316(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.aClass21_Sub3_5.anIntArray250[this.method5285(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(20) Class133 local20 = this.aClass21_Sub3_5.aClass134_7.method22906(arg1 & 0xFFFF);
			@Pc(25) int local25 = local20.aByte120 & 0xFF;
			@Pc(35) int local35;
			@Pc(58) int local58;
			if (local25 != 0) {
				if (arg2 < 0) {
					local35 = 0;
				} else if (arg2 > 127) {
					local35 = 16777215;
				} else {
					local35 = arg2 * 131586;
				}
				if (local25 == 256) {
					local8 = local35;
				} else {
					local58 = 256 - local25;
					local8 = ((local35 & 0xFF00FF) * local25 + (local8 & 0xFF00FF) * local58 & 0xFF00FF00) + ((local35 & 0xFF00) * local25 + (local8 & 0xFF00) * local58 & 0xFF0000) >> 8;
				}
			}
			local35 = local20.aByte121 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(104) int local104 = (local8 >> 16 & 0xFF) * local35;
				if (local104 > 65535) {
					local104 = 65535;
				}
				local58 = (local8 >> 8 & 0xFF) * local35;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(128) int local128 = (local8 & 0xFF) * local35;
				if (local128 > 65535) {
					local128 = 65535;
				}
				local8 = ((local104 & 0xFF00) << 8) + (local58 & 0xFF00) + (local128 >> 8);
			}
		}
		return local8 & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!abw", name = "je", descriptor = "(ISI)I", line = 3421)
	int method5317(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.aClass21_Sub3_5.anIntArray250[this.method5285(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(20) Class133 local20 = this.aClass21_Sub3_5.aClass134_7.method22906(arg1 & 0xFFFF);
			@Pc(25) int local25 = local20.aByte120 & 0xFF;
			@Pc(35) int local35;
			@Pc(58) int local58;
			if (local25 != 0) {
				if (arg2 < 0) {
					local35 = 0;
				} else if (arg2 > 127) {
					local35 = 16777215;
				} else {
					local35 = arg2 * 131586;
				}
				if (local25 == 256) {
					local8 = local35;
				} else {
					local58 = 256 - local25;
					local8 = ((local35 & 0xFF00FF) * local25 + (local8 & 0xFF00FF) * local58 & 0xFF00FF00) + ((local35 & 0xFF00) * local25 + (local8 & 0xFF00) * local58 & 0xFF0000) >> 8;
				}
			}
			local35 = local20.aByte121 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(104) int local104 = (local8 >> 16 & 0xFF) * local35;
				if (local104 > 65535) {
					local104 = 65535;
				}
				local58 = (local8 >> 8 & 0xFF) * local35;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(128) int local128 = (local8 & 0xFF) * local35;
				if (local128 > 65535) {
					local128 = 65535;
				}
				local8 = ((local104 & 0xFF00) << 8) + (local58 & 0xFF00) + (local128 >> 8);
			}
		}
		return local8 & 0xFFFFFF;
	}
}
