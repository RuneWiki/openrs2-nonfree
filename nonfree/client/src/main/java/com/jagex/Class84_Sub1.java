package com.jagex;

import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeb")
public class Class84_Sub1 extends Class84 {

	@OriginalMember(owner = "client!aeb", name = "w", descriptor = "I")
	static final int anInt363 = 1;

	@OriginalMember(owner = "client!aeb", name = "t", descriptor = "I")
	static final int anInt364 = 2;

	@OriginalMember(owner = "client!aeb", name = "q", descriptor = "I")
	static final int anInt365 = 4;

	@OriginalMember(owner = "client!aeb", name = "d", descriptor = "I")
	static final int anInt367 = 16;

	@OriginalMember(owner = "client!aeb", name = "y", descriptor = "I")
	static final int anInt369 = 7;

	@OriginalMember(owner = "client!aeb", name = "x", descriptor = "I")
	static final int anInt374 = 8;

	@OriginalMember(owner = "client!aeb", name = "l", descriptor = "I")
	static final int anInt376 = 4;

	@OriginalMember(owner = "client!aeb", name = "bm", descriptor = "[J")
	static long[] aLongArray7;

	@OriginalMember(owner = "client!aeb", name = "bh", descriptor = "I")
	static int anInt379;

	@OriginalMember(owner = "client!aeb", name = "be", descriptor = "I")
	static int anInt380;

	@OriginalMember(owner = "client!aeb", name = "cb", descriptor = "I")
	static int anInt381;

	@OriginalMember(owner = "client!aeb", name = "cg", descriptor = "Z")
	static boolean aBoolean62;

	@OriginalMember(owner = "client!aeb", name = "bo", descriptor = "[F")
	static float[] aFloatArray8 = new float[2];

	@OriginalMember(owner = "client!aeb", name = "bk", descriptor = "[I")
	static final int[] anIntArray34 = new int[8];

	@OriginalMember(owner = "client!aeb", name = "br", descriptor = "[I")
	static final int[] anIntArray28 = new int[8];

	@OriginalMember(owner = "client!aeb", name = "bq", descriptor = "[I")
	static final int[] anIntArray35 = new int[8];

	@OriginalMember(owner = "client!aeb", name = "ak", descriptor = "[F")
	float[] aFloatArray6;

	@OriginalMember(owner = "client!aeb", name = "bc", descriptor = "I")
	int anInt362;

	@OriginalMember(owner = "client!aeb", name = "a", descriptor = "[[I")
	int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!aeb", name = "r", descriptor = "I")
	int anInt366;

	@OriginalMember(owner = "client!aeb", name = "at", descriptor = "[S")
	short[] aShortArray8;

	@OriginalMember(owner = "client!aeb", name = "bl", descriptor = "S")
	short aShort1;

	@OriginalMember(owner = "client!aeb", name = "o", descriptor = "[I")
	int[] anIntArray29;

	@OriginalMember(owner = "client!aeb", name = "j", descriptor = "S")
	short aShort2;

	@OriginalMember(owner = "client!aeb", name = "n", descriptor = "[I")
	int[] anIntArray30;

	@OriginalMember(owner = "client!aeb", name = "ai", descriptor = "[S")
	short[] aShortArray9;

	@OriginalMember(owner = "client!aeb", name = "b", descriptor = "[I")
	int[] anIntArray31;

	@OriginalMember(owner = "client!aeb", name = "aj", descriptor = "[S")
	short[] aShortArray10;

	@OriginalMember(owner = "client!aeb", name = "i", descriptor = "S")
	short aShort3;

	@OriginalMember(owner = "client!aeb", name = "ag", descriptor = "[S")
	short[] aShortArray11;

	@OriginalMember(owner = "client!aeb", name = "m", descriptor = "[S")
	short[] aShortArray12;

	@OriginalMember(owner = "client!aeb", name = "ao", descriptor = "Lclient!ck;")
	Class190 aClass190_1;

	@OriginalMember(owner = "client!aeb", name = "al", descriptor = "[B")
	byte[] aByteArray9;

	@OriginalMember(owner = "client!aeb", name = "au", descriptor = "[F")
	float[] aFloatArray7;

	@OriginalMember(owner = "client!aeb", name = "ad", descriptor = "[S")
	short[] aShortArray13;

	@OriginalMember(owner = "client!aeb", name = "ac", descriptor = "[B")
	byte[] aByteArray10;

	@OriginalMember(owner = "client!aeb", name = "av", descriptor = "[S")
	short[] aShortArray14;

	@OriginalMember(owner = "client!aeb", name = "ae", descriptor = "[S")
	short[] aShortArray15;

	@OriginalMember(owner = "client!aeb", name = "ah", descriptor = "[S")
	short[] aShortArray16;

	@OriginalMember(owner = "client!aeb", name = "bi", descriptor = "[I")
	int[] anIntArray32;

	@OriginalMember(owner = "client!aeb", name = "aq", descriptor = "[S")
	short[] aShortArray17;

	@OriginalMember(owner = "client!aeb", name = "z", descriptor = "B")
	byte aByte3;

	@OriginalMember(owner = "client!aeb", name = "aa", descriptor = "Lclient!ca;")
	Interface15 anInterface15_1;

	@OriginalMember(owner = "client!aeb", name = "ap", descriptor = "Lclient!bn;")
	Interface14 anInterface14_1;

	@OriginalMember(owner = "client!aeb", name = "az", descriptor = "I")
	int anInt375;

	@OriginalMember(owner = "client!aeb", name = "bn", descriptor = "[Lclient!bp;")
	Class176[] aClass176Array1;

	@OriginalMember(owner = "client!aeb", name = "bv", descriptor = "S")
	short aShort4;

	@OriginalMember(owner = "client!aeb", name = "as", descriptor = "[[I")
	int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!aeb", name = "ba", descriptor = "S")
	short aShort5;

	@OriginalMember(owner = "client!aeb", name = "bb", descriptor = "S")
	short aShort6;

	@OriginalMember(owner = "client!aeb", name = "bd", descriptor = "S")
	short aShort7;

	@OriginalMember(owner = "client!aeb", name = "by", descriptor = "S")
	short aShort8;

	@OriginalMember(owner = "client!aeb", name = "bw", descriptor = "S")
	short aShort9;

	@OriginalMember(owner = "client!aeb", name = "bg", descriptor = "[I")
	int[] anIntArray33;

	@OriginalMember(owner = "client!aeb", name = "bs", descriptor = "[S")
	short[] aShortArray18;

	@OriginalMember(owner = "client!aeb", name = "bt", descriptor = "[Lclient!dk;")
	Class205[] aClass205Array1;

	@OriginalMember(owner = "client!aeb", name = "bz", descriptor = "[Lclient!cs;")
	Class195[] aClass195Array1;

	@OriginalMember(owner = "client!aeb", name = "bu", descriptor = "I")
	int anInt377;

	@OriginalMember(owner = "client!aeb", name = "bf", descriptor = "[Lclient!ch;")
	Class189[] aClass189Array1;

	@OriginalMember(owner = "client!aeb", name = "g", descriptor = "I")
	int anInt378;

	@OriginalMember(owner = "client!aeb", name = "bp", descriptor = "[[I")
	int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!aeb", name = "k", descriptor = "Z")
	boolean aBoolean57 = false;

	@OriginalMember(owner = "client!aeb", name = "u", descriptor = "Z")
	boolean aBoolean58 = false;

	@OriginalMember(owner = "client!aeb", name = "e", descriptor = "I")
	int anInt368 = 0;

	@OriginalMember(owner = "client!aeb", name = "f", descriptor = "I")
	int anInt373 = 0;

	@OriginalMember(owner = "client!aeb", name = "h", descriptor = "I")
	int anInt370 = 0;

	@OriginalMember(owner = "client!aeb", name = "ax", descriptor = "I")
	int anInt371 = 0;

	@OriginalMember(owner = "client!aeb", name = "ar", descriptor = "I")
	int anInt372 = 0;

	@OriginalMember(owner = "client!aeb", name = "aw", descriptor = "Z")
	boolean aBoolean61 = true;

	@OriginalMember(owner = "client!aeb", name = "bj", descriptor = "Z")
	boolean aBoolean60 = false;

	@OriginalMember(owner = "client!aeb", name = "bx", descriptor = "Z")
	boolean aBoolean59 = false;

	@OriginalMember(owner = "client!aeb", name = "s", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_23;

	@OriginalMember(owner = "client!aeb", name = "am", descriptor = "Lclient!bk;")
	Class172 aClass172_1;

	@OriginalMember(owner = "client!aeb", name = "an", descriptor = "Lclient!bk;")
	Class172 aClass172_4;

	@OriginalMember(owner = "client!aeb", name = "af", descriptor = "Lclient!bk;")
	Class172 aClass172_2;

	@OriginalMember(owner = "client!aeb", name = "ay", descriptor = "Lclient!bk;")
	Class172 aClass172_3;

	@OriginalMember(owner = "client!aeb", name = "ab", descriptor = "Lclient!bo;")
	Class175 aClass175_1;

	@OriginalMember(owner = "client!aeb", name = "<init>", descriptor = "(Lclient!aeq;)V", line = 99)
	Class84_Sub1(@OriginalArg(0) Class86_Sub3 arg0) {
		this.aClass86_Sub3_23 = arg0;
		this.aClass172_1 = new Class172(null, 5126, 3, 0);
		this.aClass172_4 = new Class172(null, 5126, 2, 0);
		this.aClass172_2 = new Class172(null, 5126, 3, 0);
		this.aClass172_3 = new Class172(null, 5121, 4, 0);
		this.aClass175_1 = new Class175();
	}

	@OriginalMember(owner = "client!aeb", name = "<init>", descriptor = "(Lclient!aeq;Lclient!dz;IIII)V", line = 108)
	Class84_Sub1(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass86_Sub3_23 = arg0;
		this.anInt366 = arg2;
		this.anInt378 = arg5;
		if (Class170.method24458(arg2, arg5)) {
			this.aClass172_1 = new Class172(null, 5126, 3, 0);
		}
		if (Class170.method24465(arg2, arg5)) {
			this.aClass172_4 = new Class172(null, 5126, 2, 0);
		}
		if (Class170.method24462(arg2, arg5)) {
			this.aClass172_2 = new Class172(null, 5126, 3, 0);
		}
		if (Class170.method24464(arg2, arg5)) {
			this.aClass172_3 = new Class172(null, 5121, 4, 0);
		}
		if (Class170.method24468(arg2, arg5)) {
			this.aClass175_1 = new Class175();
		}
		@Pc(104) Class209 local104 = arg0.aClass209_9;
		@Pc(107) Interface44 local107 = arg0.anInterface44_6;
		@Pc(111) int[] local111 = new int[arg1.anInt3735];
		this.anIntArray33 = new int[arg1.anInt3738 + 1];
		for (@Pc(120) int local120 = 0; local120 < arg1.anInt3735; local120++) {
			if (arg1.aByteArray65 == null || arg1.aByteArray65[local120] != 2) {
				if (arg1.aShortArray106 != null && arg1.aShortArray106[local120] != -1) {
					@Pc(153) Class215 local153 = local104.method25584(arg1.aShortArray106[local120] & 0xFFFF);
					if (((this.anInt378 & 0x40) == 0 || !local153.aBoolean641) && local153.aBoolean637) {
						continue;
					}
				}
				local111[this.anInt371++] = local120;
				this.anIntArray33[arg1.aShortArray101[local120]]++;
				this.anIntArray33[arg1.aShortArray98[local120]]++;
				this.anIntArray33[arg1.aShortArray103[local120]]++;
			}
		}
		this.anInt372 = this.anInt371;
		@Pc(218) long[] local218 = new long[this.anInt371];
		@Pc(227) boolean local227 = (this.anInt366 & 0x100) != 0;
		@Pc(237) int local237;
		@Pc(241) int local241;
		@Pc(254) int local254;
		@Pc(482) int local482;
		@Pc(374) short local374;
		for (@Pc(229) int local229 = 0; local229 < this.anInt371; local229++) {
			local237 = local111[local229];
			@Pc(239) Class215 local239 = null;
			local241 = 0;
			@Pc(243) byte local243 = 0;
			@Pc(245) byte local245 = 0;
			@Pc(247) byte local247 = 0;
			@Pc(252) boolean local252;
			if (arg1.aClass204Array1 != null) {
				local252 = false;
				for (local254 = 0; local254 < arg1.aClass204Array1.length; local254++) {
					@Pc(264) Class204 local264 = arg1.aClass204Array1[local254];
					if (local237 == local264.anInt3566 * 1329690033) {
						@Pc(278) Class394 local278 = local107.method28576(local264.anInt3563 * 452560563);
						if (local278.aBoolean732) {
							local252 = true;
						}
						if (local278.anInt4595 * 651115273 != -1) {
							@Pc(297) Class215 local297 = local104.method25584(local278.anInt4595 * 651115273);
							if (local297.aClass597_2 == Class597.aClass597_5) {
								this.aBoolean57 = true;
							}
						}
					}
				}
				if (local252) {
					local218[local229] = Long.MAX_VALUE;
					this.anInt372--;
					continue;
				}
			}
			if (arg1.aClass205Array4 != null) {
				local252 = false;
				for (local254 = 0; local254 < arg1.aClass205Array4.length; local254++) {
					@Pc(336) Class205 local336 = arg1.aClass205Array4[local254];
					if (local237 == local336.anInt3568 * -1916225325) {
						@Pc(352) Class396 local352 = this.aClass86_Sub3_23.anInterface47_6.method28528(local336.anInt3569 * 1708272351);
						if (local352.aBoolean743) {
							local252 = true;
						}
					}
				}
				if (local252) {
					local218[local229] = Long.MAX_VALUE;
					this.anInt372--;
					continue;
				}
			}
			local374 = -1;
			if (arg1.aShortArray106 != null) {
				local374 = arg1.aShortArray106[local237];
				if (local374 != -1) {
					local239 = local104.method25584(local374 & 0xFFFF);
					if ((this.anInt378 & 0x40) != 0 && local239.aBoolean641) {
						local374 = -1;
						local239 = null;
					} else {
						local245 = local239.aByte118;
						local247 = local239.aByte119;
						if (local239.aByte113 != 0 || local239.aByte114 != 0) {
							this.aBoolean58 = true;
						}
					}
				}
			}
			@Pc(438) boolean local438 = arg1.aByteArray67 != null && arg1.aByteArray67[local237] != 0 || local239 != null && local239.aClass597_2 != Class597.aClass597_4;
			if ((local227 || local438) && arg1.aByteArray66 != null) {
				local241 += arg1.aByteArray66[local237] << 17;
			}
			if (local438) {
				local241 += 65536;
			}
			local241 += (local245 & 0xFF) << 8;
			local241 += local247 & 0xFF;
			local482 = local243 + ((local374 & 0xFFFF) << 16);
			@Pc(488) int local488 = local482 + (local229 & 0xFFFF);
			local218[local229] = ((long) local241 << 32) + (long) local488;
			this.aBoolean57 |= local438;
			this.aBoolean58 |= local239 != null && (local239.aByte113 != 0 || local239.aByte114 != 0);
		}
		Class426.method28770(local218, local111);
		this.anInt368 = arg1.anInt3732;
		this.anInt373 = arg1.anInt3738;
		this.anIntArray29 = arg1.anIntArray353;
		this.anIntArray31 = arg1.anIntArray352;
		this.anIntArray30 = arg1.anIntArray357;
		this.aShortArray12 = arg1.aShortArray100;
		@Pc(554) Class177[] local554 = new Class177[this.anInt373];
		this.aClass205Array1 = arg1.aClass205Array4;
		this.aClass195Array1 = arg1.aClass195Array4;
		@Pc(603) int local603;
		if (arg1.aClass204Array1 != null) {
			this.anInt377 = arg1.aClass204Array1.length;
			this.aClass189Array1 = new Class189[this.anInt377];
			this.aClass176Array1 = new Class176[this.anInt377];
			for (local237 = 0; local237 < this.anInt377; local237++) {
				@Pc(591) Class204 local591 = arg1.aClass204Array1[local237];
				@Pc(599) Class394 local599 = local107.method28576(local591.anInt3563 * 452560563);
				local482 = -1;
				for (local603 = 0; local603 < this.anInt371; local603++) {
					if (local111[local603] == local591.anInt3566 * 1329690033) {
						local482 = local603;
						break;
					}
				}
				if (local482 == -1) {
					throw new RuntimeException();
				}
				local603 = Class656.anIntArray532[arg1.aShortArray104[local591.anInt3566 * 1329690033] & 0xFFFF] & 0xFFFFFF;
				local603 |= 255 - (arg1.aByteArray67 == null ? 0 : arg1.aByteArray67[local591.anInt3566 * 1329690033]) << 24;
				this.aClass189Array1[local237] = new Class189(local482, arg1.aShortArray101[local591.anInt3566 * 1329690033], arg1.aShortArray98[local591.anInt3566 * 1329690033], arg1.aShortArray103[local591.anInt3566 * 1329690033], local599.anInt4596 * -312833239, local599.anInt4597 * -407898751, local599.anInt4595 * 651115273, local599.anInt4599 * -1616229305, local599.anInt4594 * 1576328455, local599.aBoolean732, local599.aBoolean731, local591.anInt3564 * -1972242819);
				this.aClass176Array1[local237] = new Class176(local603);
			}
		}
		local237 = this.anInt371 * 3;
		this.aShortArray10 = new short[local237];
		this.aShortArray9 = new short[local237];
		this.aShortArray11 = new short[local237];
		this.aByteArray9 = new byte[local237];
		this.aFloatArray6 = new float[local237];
		this.aFloatArray7 = new float[local237];
		this.aShortArray13 = new short[this.anInt371];
		this.aByteArray10 = new byte[this.anInt371];
		this.aShortArray14 = new short[this.anInt371];
		this.aShortArray8 = new short[this.anInt371];
		this.aShortArray15 = new short[this.anInt371];
		this.aShortArray16 = new short[this.anInt371];
		if (arg1.aShortArray102 != null) {
			this.aShortArray17 = new short[this.anInt371];
		}
		this.aShort2 = (short) arg3;
		this.aShort3 = (short) arg4;
		this.aShortArray18 = new short[local237];
		aLongArray7 = new long[local237];
		@Pc(811) int local811 = 0;
		for (local241 = 0; local241 < arg1.anInt3738; local241++) {
			local482 = this.anIntArray33[local241];
			this.anIntArray33[local241] = local811;
			local811 += local482;
			local554[local241] = new Class177();
		}
		this.anIntArray33[arg1.anInt3738] = local811;
		@Pc(852) Class226 local852 = this.method6760(arg1, local111, this.anInt371);
		@Pc(856) Class179[] local856 = new Class179[arg1.anInt3735];
		@Pc(867) short local867;
		@Pc(877) short local877;
		@Pc(887) int local887;
		@Pc(897) int local897;
		for (local603 = 0; local603 < arg1.anInt3735; local603++) {
			local867 = arg1.aShortArray101[local603];
			local374 = arg1.aShortArray98[local603];
			local877 = arg1.aShortArray103[local603];
			local887 = this.anIntArray29[local374] - this.anIntArray29[local867];
			local897 = this.anIntArray31[local374] - this.anIntArray31[local867];
			@Pc(907) int local907 = this.anIntArray30[local374] - this.anIntArray30[local867];
			@Pc(917) int local917 = this.anIntArray29[local877] - this.anIntArray29[local867];
			@Pc(927) int local927 = this.anIntArray31[local877] - this.anIntArray31[local867];
			@Pc(937) int local937 = this.anIntArray30[local877] - this.anIntArray30[local867];
			@Pc(945) int local945 = local897 * local937 - local927 * local907;
			@Pc(953) int local953 = local907 * local917 - local937 * local887;
			@Pc(961) int local961;
			for (local961 = local887 * local927 - local917 * local897; local945 > 8192 || local953 > 8192 || local961 > 8192 || local945 < -8192 || local953 < -8192 || local961 < -8192; local961 >>= 0x1) {
				local945 >>= 0x1;
				local953 >>= 0x1;
			}
			@Pc(1007) int local1007 = (int) Math.sqrt((double) (local945 * local945 + local953 * local953 + local961 * local961));
			if (local1007 <= 0) {
				local1007 = 1;
			}
			local945 = local945 * 256 / local1007;
			local953 = local953 * 256 / local1007;
			local961 = local961 * 256 / local1007;
			@Pc(1039) byte local1039 = arg1.aByteArray65 == null ? 0 : arg1.aByteArray65[local603];
			if (local1039 == 0) {
				@Pc(1045) Class177 local1045 = local554[local867];
				local1045.anInt3306 += local945;
				local1045.anInt3305 += local953;
				local1045.anInt3304 += local961;
				local1045.anInt3307++;
				@Pc(1073) Class177 local1073 = local554[local374];
				local1073.anInt3306 += local945;
				local1073.anInt3305 += local953;
				local1073.anInt3304 += local961;
				local1073.anInt3307++;
				@Pc(1101) Class177 local1101 = local554[local877];
				local1101.anInt3306 += local945;
				local1101.anInt3305 += local953;
				local1101.anInt3304 += local961;
				local1101.anInt3307++;
			} else if (local1039 == 1) {
				@Pc(1137) Class179 local1137 = local856[local603] = new Class179();
				local1137.anInt3312 = local945;
				local1137.anInt3311 = local953;
				local1137.anInt3310 = local961;
			}
		}
		@Pc(1165) int local1165;
		for (local603 = 0; local603 < this.anInt371; local603++) {
			@Pc(1158) int local1158 = local111[local603];
			local1165 = arg1.aShortArray104[local1158] & 0xFFFF;
			local254 = arg1.aByteArray67 == null ? 0 : arg1.aByteArray67[local1158] & 0xFF;
			@Pc(1187) short local1187 = arg1.aShortArray106 == null ? -1 : arg1.aShortArray106[local1158];
			if (local1187 != -1 && (this.anInt378 & 0x40) != 0 && local104.method25584(local1187).aBoolean641) {
				local1187 = -1;
			}
			@Pc(1205) float local1205 = 0.0F;
			@Pc(1207) float local1207 = 0.0F;
			@Pc(1209) float local1209 = 0.0F;
			@Pc(1211) float local1211 = 0.0F;
			@Pc(1213) float local1213 = 0.0F;
			@Pc(1215) float local1215 = 0.0F;
			@Pc(1366) short local1366;
			@Pc(1265) long local1265;
			@Pc(1278) long local1278;
			@Pc(1291) long local1291;
			if (local1187 == -1) {
				local1291 = 0L;
				local1278 = 0L;
				local1265 = 0L;
			} else {
				@Pc(1228) short local1228 = arg1.aShortArray105 == null ? -1 : arg1.aShortArray105[local1158];
				@Pc(1238) int local1238;
				if (local1228 == 32766) {
					local1238 = arg1.aByteArray68[local1158] & 0xFF;
					@Pc(1245) int local1245 = arg1.aByteArray63[local1158] & 0xFF;
					@Pc(1252) int local1252 = arg1.aByteArray64[local1158] & 0xFF;
					@Pc(1262) int local1262 = local1238 + arg1.anIntArray356[arg1.aShortArray101[local1158]];
					local1265 = local1262;
					@Pc(1275) int local1275 = local1245 + arg1.anIntArray356[arg1.aShortArray98[local1158]];
					local1278 = local1262;
					@Pc(1288) int local1288 = local1252 + arg1.anIntArray356[arg1.aShortArray103[local1158]];
					local1291 = local1262;
					local1205 = arg1.aFloatArray98[local1262];
					local1207 = arg1.aFloatArray97[local1262];
					local1209 = arg1.aFloatArray98[local1275];
					local1211 = arg1.aFloatArray97[local1275];
					local1213 = arg1.aFloatArray98[local1288];
					local1215 = arg1.aFloatArray97[local1288];
				} else if (local1228 == -1) {
					local1205 = 0.0F;
					local1207 = 1.0F;
					local1265 = 65535L;
					local1209 = 1.0F;
					local1211 = 1.0F;
					local1278 = 131071L;
					local1213 = 0.0F;
					local1215 = 0.0F;
					local1291 = 196607L;
				} else {
					@Pc(1348) int local1348 = local1228 & 0xFFFF;
					local1238 = 0;
					@Pc(1352) byte local1352 = 0;
					@Pc(1354) byte local1354 = 0;
					@Pc(1359) byte local1359 = arg1.aByteArray62[local1348];
					@Pc(1371) short local1371;
					@Pc(1376) short local1376;
					@Pc(1409) float local1409;
					@Pc(1417) float local1417;
					@Pc(1425) float local1425;
					@Pc(1505) float local1505;
					@Pc(1513) float local1513;
					@Pc(1521) float local1521;
					@Pc(1529) float local1529;
					@Pc(1537) float local1537;
					@Pc(1545) float local1545;
					if (local1359 == 0) {
						local1366 = arg1.aShortArray101[local1158];
						local1371 = arg1.aShortArray98[local1158];
						local1376 = arg1.aShortArray103[local1158];
						@Pc(1381) short local1381 = arg1.aShortArray107[local1348];
						@Pc(1386) short local1386 = arg1.aShortArray99[local1348];
						@Pc(1391) short local1391 = arg1.aShortArray108[local1348];
						@Pc(1397) float local1397 = (float) arg1.anIntArray353[local1381];
						@Pc(1403) float local1403 = (float) arg1.anIntArray352[local1381];
						local1409 = arg1.anIntArray357[local1381];
						local1417 = (float) arg1.anIntArray353[local1386] - local1397;
						local1425 = (float) arg1.anIntArray352[local1386] - local1403;
						@Pc(1433) float local1433 = (float) arg1.anIntArray357[local1386] - local1409;
						@Pc(1441) float local1441 = (float) arg1.anIntArray353[local1391] - local1397;
						@Pc(1449) float local1449 = (float) arg1.anIntArray352[local1391] - local1403;
						@Pc(1457) float local1457 = (float) arg1.anIntArray357[local1391] - local1409;
						@Pc(1465) float local1465 = (float) arg1.anIntArray353[local1366] - local1397;
						@Pc(1473) float local1473 = (float) arg1.anIntArray352[local1366] - local1403;
						@Pc(1481) float local1481 = (float) arg1.anIntArray357[local1366] - local1409;
						@Pc(1489) float local1489 = (float) arg1.anIntArray353[local1371] - local1397;
						@Pc(1497) float local1497 = (float) arg1.anIntArray352[local1371] - local1403;
						local1505 = (float) arg1.anIntArray357[local1371] - local1409;
						local1513 = (float) arg1.anIntArray353[local1376] - local1397;
						local1521 = (float) arg1.anIntArray352[local1376] - local1403;
						local1529 = (float) arg1.anIntArray357[local1376] - local1409;
						local1537 = local1425 * local1457 - local1433 * local1449;
						local1545 = local1433 * local1441 - local1417 * local1457;
						@Pc(1553) float local1553 = local1417 * local1449 - local1425 * local1441;
						@Pc(1561) float local1561 = local1449 * local1553 - local1457 * local1545;
						@Pc(1569) float local1569 = local1457 * local1537 - local1441 * local1553;
						@Pc(1577) float local1577 = local1441 * local1545 - local1449 * local1537;
						@Pc(1591) float local1591 = 1.0F / (local1561 * local1417 + local1569 * local1425 + local1577 * local1433);
						local1205 = (local1561 * local1465 + local1569 * local1473 + local1577 * local1481) * local1591;
						local1209 = (local1561 * local1489 + local1569 * local1497 + local1577 * local1505) * local1591;
						local1213 = (local1561 * local1513 + local1569 * local1521 + local1577 * local1529) * local1591;
						@Pc(1641) float local1641 = local1425 * local1553 - local1433 * local1545;
						@Pc(1649) float local1649 = local1433 * local1537 - local1417 * local1553;
						@Pc(1657) float local1657 = local1417 * local1545 - local1425 * local1537;
						@Pc(1671) float local1671 = 1.0F / (local1641 * local1441 + local1649 * local1449 + local1657 * local1457);
						local1207 = (local1641 * local1465 + local1649 * local1473 + local1657 * local1481) * local1671;
						local1211 = (local1641 * local1489 + local1649 * local1497 + local1657 * local1505) * local1671;
						local1215 = (local1641 * local1513 + local1649 * local1521 + local1657 * local1529) * local1671;
					} else {
						local1366 = arg1.aShortArray101[local1158];
						local1371 = arg1.aShortArray98[local1158];
						local1376 = arg1.aShortArray103[local1158];
						@Pc(1734) int local1734 = local852.anIntArray366[local1348];
						@Pc(1739) int local1739 = local852.anIntArray365[local1348];
						@Pc(1744) int local1744 = local852.anIntArray367[local1348];
						@Pc(1749) float[] local1749 = local852.aFloatArrayArray22[local1348];
						@Pc(1754) byte local1754 = arg1.aByteArray70[local1348];
						local1409 = (float) arg1.anIntArray361[local1348] / 256.0F;
						if (local1359 == 1) {
							local1417 = (float) arg1.anIntArray360[local1348] / 1024.0F;
							method6749(arg1.anIntArray353[local1366], arg1.anIntArray352[local1366], arg1.anIntArray357[local1366], local1734, local1739, local1744, local1749, local1417, local1754, local1409, aFloatArray8);
							local1205 = aFloatArray8[0];
							local1207 = aFloatArray8[1];
							method6749(arg1.anIntArray353[local1371], arg1.anIntArray352[local1371], arg1.anIntArray357[local1371], local1734, local1739, local1744, local1749, local1417, local1754, local1409, aFloatArray8);
							local1209 = aFloatArray8[0];
							local1211 = aFloatArray8[1];
							method6749(arg1.anIntArray353[local1376], arg1.anIntArray352[local1376], arg1.anIntArray357[local1376], local1734, local1739, local1744, local1749, local1417, local1754, local1409, aFloatArray8);
							local1213 = aFloatArray8[0];
							local1215 = aFloatArray8[1];
							local1425 = local1417 / 2.0F;
							if ((local1754 & 0x1) == 0) {
								if (local1209 - local1205 > local1425) {
									local1209 -= local1417;
									local1352 = 1;
								} else if (local1205 - local1209 > local1425) {
									local1209 += local1417;
									local1352 = 2;
								}
								if (local1213 - local1205 > local1425) {
									local1213 -= local1417;
									local1354 = 1;
								} else if (local1205 - local1213 > local1425) {
									local1213 += local1417;
									local1354 = 2;
								}
							} else {
								if (local1211 - local1207 > local1425) {
									local1211 -= local1417;
									local1352 = 1;
								} else if (local1207 - local1211 > local1425) {
									local1211 += local1417;
									local1352 = 2;
								}
								if (local1215 - local1207 > local1425) {
									local1215 -= local1417;
									local1354 = 1;
								} else if (local1207 - local1215 > local1425) {
									local1215 += local1417;
									local1354 = 2;
								}
							}
						} else if (local1359 == 2) {
							local1417 = (float) arg1.anIntArray362[local1348] / 256.0F;
							local1425 = (float) arg1.anIntArray363[local1348] / 256.0F;
							@Pc(1999) int local1999 = arg1.anIntArray353[local1371] - arg1.anIntArray353[local1366];
							@Pc(2009) int local2009 = arg1.anIntArray352[local1371] - arg1.anIntArray352[local1366];
							@Pc(2019) int local2019 = arg1.anIntArray357[local1371] - arg1.anIntArray357[local1366];
							@Pc(2029) int local2029 = arg1.anIntArray353[local1376] - arg1.anIntArray353[local1366];
							@Pc(2039) int local2039 = arg1.anIntArray352[local1376] - arg1.anIntArray352[local1366];
							@Pc(2049) int local2049 = arg1.anIntArray357[local1376] - arg1.anIntArray357[local1366];
							@Pc(2057) int local2057 = local2009 * local2049 - local2039 * local2019;
							@Pc(2065) int local2065 = local2019 * local2029 - local2049 * local1999;
							@Pc(2073) int local2073 = local1999 * local2039 - local2029 * local2009;
							local1505 = 64.0F / (float) arg1.anIntArray358[local1348];
							local1513 = 64.0F / (float) arg1.anIntArray359[local1348];
							local1521 = 64.0F / (float) arg1.anIntArray360[local1348];
							local1529 = ((float) local2057 * local1749[0] + (float) local2065 * local1749[1] + (float) local2073 * local1749[2]) / local1505;
							local1537 = ((float) local2057 * local1749[3] + (float) local2065 * local1749[4] + (float) local2073 * local1749[5]) / local1513;
							local1545 = ((float) local2057 * local1749[6] + (float) local2065 * local1749[7] + (float) local2073 * local1749[8]) / local1521;
							local1238 = method6752(local1529, local1537, local1545);
							method6758(arg1.anIntArray353[local1366], arg1.anIntArray352[local1366], arg1.anIntArray357[local1366], local1734, local1739, local1744, local1238, local1749, local1754, local1409, local1417, local1425, aFloatArray8);
							local1205 = aFloatArray8[0];
							local1207 = aFloatArray8[1];
							method6758(arg1.anIntArray353[local1371], arg1.anIntArray352[local1371], arg1.anIntArray357[local1371], local1734, local1739, local1744, local1238, local1749, local1754, local1409, local1417, local1425, aFloatArray8);
							local1209 = aFloatArray8[0];
							local1211 = aFloatArray8[1];
							method6758(arg1.anIntArray353[local1376], arg1.anIntArray352[local1376], arg1.anIntArray357[local1376], local1734, local1739, local1744, local1238, local1749, local1754, local1409, local1417, local1425, aFloatArray8);
							local1213 = aFloatArray8[0];
							local1215 = aFloatArray8[1];
						} else if (local1359 == 3) {
							method6746(arg1.anIntArray353[local1366], arg1.anIntArray352[local1366], arg1.anIntArray357[local1366], local1734, local1739, local1744, local1749, local1754, local1409, aFloatArray8);
							local1205 = aFloatArray8[0];
							local1207 = aFloatArray8[1];
							method6746(arg1.anIntArray353[local1371], arg1.anIntArray352[local1371], arg1.anIntArray357[local1371], local1734, local1739, local1744, local1749, local1754, local1409, aFloatArray8);
							local1209 = aFloatArray8[0];
							local1211 = aFloatArray8[1];
							method6746(arg1.anIntArray353[local1376], arg1.anIntArray352[local1376], arg1.anIntArray357[local1376], local1734, local1739, local1744, local1749, local1754, local1409, aFloatArray8);
							local1213 = aFloatArray8[0];
							local1215 = aFloatArray8[1];
							if ((local1754 & 0x1) == 0) {
								if (local1209 - local1205 > 0.5F) {
									local1209--;
									local1352 = 1;
								} else if (local1205 - local1209 > 0.5F) {
									local1209++;
									local1352 = 2;
								}
								if (local1213 - local1205 > 0.5F) {
									local1213--;
									local1354 = 1;
								} else if (local1205 - local1213 > 0.5F) {
									local1213++;
									local1354 = 2;
								}
							} else {
								if (local1211 - local1207 > 0.5F) {
									local1211--;
									local1352 = 1;
								} else if (local1207 - local1211 > 0.5F) {
									local1211++;
									local1352 = 2;
								}
								if (local1215 - local1207 > 0.5F) {
									local1215--;
									local1354 = 1;
								} else if (local1207 - local1215 > 0.5F) {
									local1215++;
									local1354 = 2;
								}
							}
						}
					}
					local1265 = local1238 << 16 | local1348;
					local1278 = (long) (local1352 << 19) | local1265;
					local1291 = (long) (local1354 << 19) | local1265;
				}
			}
			@Pc(2495) byte local2495 = arg1.aByteArray65 == null ? 0 : arg1.aByteArray65[local1158];
			if (local2495 == 0) {
				@Pc(2504) long local2504 = (long) ((local1165 << 8) + local254);
				@Pc(2509) short local2509 = arg1.aShortArray101[local1158];
				@Pc(2514) short local2514 = arg1.aShortArray98[local1158];
				local1366 = arg1.aShortArray103[local1158];
				@Pc(2523) Class177 local2523 = local554[local2509];
				this.aShortArray14[local603] = this.method2676(arg1, local2509, local2504 | local1265 << 24, local2523.anInt3306, local2523.anInt3305, local2523.anInt3304, local2523.anInt3307, local1205, local1207);
				@Pc(2550) Class177 local2550 = local554[local2514];
				this.aShortArray8[local603] = this.method2676(arg1, local2514, local2504 | local1278 << 24, local2550.anInt3306, local2550.anInt3305, local2550.anInt3304, local2550.anInt3307, local1209, local1211);
				@Pc(2577) Class177 local2577 = local554[local1366];
				this.aShortArray15[local603] = this.method2676(arg1, local1366, local2504 | local1291 << 24, local2577.anInt3306, local2577.anInt3305, local2577.anInt3304, local2577.anInt3307, local1213, local1215);
			} else if (local2495 == 1) {
				@Pc(2608) Class179 local2608 = local856[local1158];
				@Pc(2640) long local2640 = ((long) (local2608.anInt3312 & Integer.MIN_VALUE) << 9) + ((long) (local2608.anInt3311 + 256) << 32) + ((long) (local2608.anInt3310 + 256) << 24) + (long) (local1165 << 8) + (long) local254;
				this.aShortArray14[local603] = this.method2676(arg1, arg1.aShortArray101[local1158], local2640 | local1265 << 41, local2608.anInt3312, local2608.anInt3311, local2608.anInt3310, 0, local1205, local1207);
				this.aShortArray8[local603] = this.method2676(arg1, arg1.aShortArray98[local1158], local2640 | local1265 << 41, local2608.anInt3312, local2608.anInt3311, local2608.anInt3310, 0, local1209, local1211);
				this.aShortArray15[local603] = this.method2676(arg1, arg1.aShortArray103[local1158], local2640 | local1265 << 41, local2608.anInt3312, local2608.anInt3311, local2608.anInt3310, 0, local1213, local1215);
			}
			if (arg1.aByteArray67 != null) {
				this.aByteArray10[local603] = arg1.aByteArray67[local1158];
			}
			if (arg1.aShortArray102 != null) {
				this.aShortArray17[local603] = arg1.aShortArray102[local1158];
			}
			this.aShortArray13[local603] = arg1.aShortArray104[local1158];
			this.aShortArray16[local603] = local1187;
		}
		local603 = 0;
		local867 = -10000;
		for (local1165 = 0; local1165 < this.anInt372; local1165++) {
			local877 = this.aShortArray16[local1165];
			if (local877 != local867) {
				local603++;
				local867 = local877;
			}
		}
		this.anIntArray32 = new int[local603 + 1];
		local603 = 0;
		local867 = -10000;
		for (local1165 = 0; local1165 < this.anInt372; local1165++) {
			local877 = this.aShortArray16[local1165];
			if (local877 != local867) {
				this.anIntArray32[local603++] = local1165;
				local867 = local877;
			}
		}
		this.anIntArray32[local603] = this.anInt372;
		aLongArray7 = null;
		this.aShortArray10 = method2684(this.aShortArray10, this.anInt370);
		this.aShortArray9 = method2684(this.aShortArray9, this.anInt370);
		this.aShortArray11 = method2684(this.aShortArray11, this.anInt370);
		this.aByteArray9 = method2680(this.aByteArray9, this.anInt370);
		this.aFloatArray6 = method2686(this.aFloatArray6, this.anInt370);
		this.aFloatArray7 = method2686(this.aFloatArray7, this.anInt370);
		if (arg1.anIntArray354 != null && Class170.method24513(arg2, this.anInt378)) {
			this.anIntArrayArray1 = arg1.method25675(false);
		}
		if (arg1.aClass204Array1 != null && Class170.method24514(arg2, this.anInt378)) {
			this.anIntArrayArray3 = arg1.method25680();
		}
		if (arg1.anIntArray355 != null && Class170.method24510(arg2, this.anInt378)) {
			local1165 = 0;
			@Pc(2897) int[] local2897 = new int[256];
			for (local887 = 0; local887 < this.anInt371; local887++) {
				local897 = arg1.anIntArray355[local111[local887]];
				if (local897 >= 0) {
					@Pc(2916) int local2916 = local2897[local897]++;
					if (local897 > local1165) {
						local1165 = local897;
					}
				}
			}
			this.anIntArrayArray2 = new int[local1165 + 1][];
			for (local887 = 0; local887 <= local1165; local887++) {
				this.anIntArrayArray2[local887] = new int[local2897[local887]];
				local2897[local887] = 0;
			}
			for (local887 = 0; local887 < this.anInt371; local887++) {
				local897 = arg1.anIntArray355[local111[local887]];
				if (local897 >= 0) {
					this.anIntArrayArray2[local897][local2897[local897]++] = local887;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "hh", descriptor = "(Lclient!dz;IJIIIIFF)S", line = 637)
	short method2676(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray33[arg1];
		@Pc(11) int local11 = this.anIntArray33[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray18[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray18[local15] & 0xFFFF) - 1;
			if (aLongArray7[local15] == arg2) {
				return (short) local35;
			}
		}
		this.aShortArray18[local13] = (short) (this.anInt370 + 1);
		aLongArray7[local13] = arg2;
		this.aShortArray10[this.anInt370] = (short) arg3;
		this.aShortArray9[this.anInt370] = (short) arg4;
		this.aShortArray11[this.anInt370] = (short) arg5;
		this.aByteArray9[this.anInt370] = (byte) arg6;
		this.aFloatArray6[this.anInt370] = arg7;
		this.aFloatArray7[this.anInt370] = arg8;
		return (short) this.anInt370++;
	}

	@OriginalMember(owner = "client!aeb", name = "ip", descriptor = "(Lclient!dz;IJIIIIFF)S", line = 637)
	short method2677(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray33[arg1];
		@Pc(11) int local11 = this.anIntArray33[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray18[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray18[local15] & 0xFFFF) - 1;
			if (aLongArray7[local15] == arg2) {
				return (short) local35;
			}
		}
		this.aShortArray18[local13] = (short) (this.anInt370 + 1);
		aLongArray7[local13] = arg2;
		this.aShortArray10[this.anInt370] = (short) arg3;
		this.aShortArray9[this.anInt370] = (short) arg4;
		this.aShortArray11[this.anInt370] = (short) arg5;
		this.aByteArray9[this.anInt370] = (byte) arg6;
		this.aFloatArray6[this.anInt370] = arg7;
		this.aFloatArray7[this.anInt370] = arg8;
		return (short) this.anInt370++;
	}

	@OriginalMember(owner = "client!aeb", name = "iw", descriptor = "(Lclient!dz;IJIIIIFF)S", line = 637)
	short method2678(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray33[arg1];
		@Pc(11) int local11 = this.anIntArray33[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray18[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray18[local15] & 0xFFFF) - 1;
			if (aLongArray7[local15] == arg2) {
				return (short) local35;
			}
		}
		this.aShortArray18[local13] = (short) (this.anInt370 + 1);
		aLongArray7[local13] = arg2;
		this.aShortArray10[this.anInt370] = (short) arg3;
		this.aShortArray9[this.anInt370] = (short) arg4;
		this.aShortArray11[this.anInt370] = (short) arg5;
		this.aByteArray9[this.anInt370] = (byte) arg6;
		this.aFloatArray6[this.anInt370] = arg7;
		this.aFloatArray7[this.anInt370] = arg8;
		return (short) this.anInt370++;
	}

	@OriginalMember(owner = "client!aeb", name = "ii", descriptor = "(Lclient!dz;IJIIIIFF)S", line = 637)
	short method2679(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		@Pc(4) int local4 = this.anIntArray33[arg1];
		@Pc(11) int local11 = this.anIntArray33[arg1 + 1];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = local4; local15 < local11; local15++) {
			if (this.aShortArray18[local15] == 0) {
				local13 = local15;
				break;
			}
			@Pc(35) int local35 = (this.aShortArray18[local15] & 0xFFFF) - 1;
			if (aLongArray7[local15] == arg2) {
				return (short) local35;
			}
		}
		this.aShortArray18[local13] = (short) (this.anInt370 + 1);
		aLongArray7[local13] = arg2;
		this.aShortArray10[this.anInt370] = (short) arg3;
		this.aShortArray9[this.anInt370] = (short) arg4;
		this.aShortArray11[this.anInt370] = (short) arg5;
		this.aByteArray9[this.anInt370] = (byte) arg6;
		this.aFloatArray6[this.anInt370] = arg7;
		this.aFloatArray7[this.anInt370] = arg8;
		return (short) this.anInt370++;
	}

	@OriginalMember(owner = "client!aeb", name = "hb", descriptor = "([BI)[B", line = 660)
	static byte[] method2680(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aeb", name = "it", descriptor = "([BI)[B", line = 660)
	static byte[] method2681(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aeb", name = "ig", descriptor = "([SI)[S", line = 666)
	static short[] method2682(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aeb", name = "in", descriptor = "([SI)[S", line = 666)
	static short[] method2683(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aeb", name = "hg", descriptor = "([SI)[S", line = 666)
	static short[] method2684(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aeb", name = "ic", descriptor = "([SI)[S", line = 666)
	static short[] method2685(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aeb", name = "hv", descriptor = "([FI)[F", line = 672)
	static float[] method2686(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aeb", name = "iy", descriptor = "([FI)[F", line = 672)
	static float[] method2687(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		System.arraycopy(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!aeb", name = "x", descriptor = "()I", line = 678)
	@Override
	public int method6875() {
		return this.anInt366;
	}

	@OriginalMember(owner = "client!aeb", name = "bf", descriptor = "()I", line = 678)
	@Override
	public int method6801() {
		return this.anInt366;
	}

	@OriginalMember(owner = "client!aeb", name = "bu", descriptor = "()I", line = 678)
	@Override
	public int method6850() {
		return this.anInt366;
	}

	@OriginalMember(owner = "client!aeb", name = "bn", descriptor = "(I)V", line = 682)
	@Override
	public void method6852(@OriginalArg(0) int arg0) {
		this.anInt366 = arg0;
		if (this.aClass190_1 != null && (this.anInt366 & 0x10000) == 0) {
			this.aShortArray10 = this.aClass190_1.aShortArray85;
			this.aShortArray9 = this.aClass190_1.aShortArray84;
			this.aShortArray11 = this.aClass190_1.aShortArray83;
			this.aByteArray9 = this.aClass190_1.aByteArray59;
			this.aClass190_1 = null;
		}
		this.aBoolean61 = true;
		this.method2693();
	}

	@OriginalMember(owner = "client!aeb", name = "q", descriptor = "(I)V", line = 682)
	@Override
	public void method6795(@OriginalArg(0) int arg0) {
		this.anInt366 = arg0;
		if (this.aClass190_1 != null && (this.anInt366 & 0x10000) == 0) {
			this.aShortArray10 = this.aClass190_1.aShortArray85;
			this.aShortArray9 = this.aClass190_1.aShortArray84;
			this.aShortArray11 = this.aClass190_1.aShortArray83;
			this.aByteArray9 = this.aClass190_1.aByteArray59;
			this.aClass190_1 = null;
		}
		this.aBoolean61 = true;
		this.method2693();
	}

	@OriginalMember(owner = "client!aeb", name = "d", descriptor = "()V", line = 695)
	@Override
	public void method6796() {
		if (this.anInt370 <= 0 || this.anInt372 <= 0) {
			return;
		}
		this.method2715(false);
		if ((this.aByte3 & 0x10) == 0 && this.aClass175_1.anInterface15_4 == null) {
			this.method2713(false);
		}
		this.method2693();
	}

	@OriginalMember(owner = "client!aeb", name = "bp", descriptor = "()V", line = 695)
	@Override
	public void method6823() {
		if (this.anInt370 <= 0 || this.anInt372 <= 0) {
			return;
		}
		this.method2715(false);
		if ((this.aByte3 & 0x10) == 0 && this.aClass175_1.anInterface15_4 == null) {
			this.method2713(false);
		}
		this.method2693();
	}

	@OriginalMember(owner = "client!aeb", name = "bo", descriptor = "()V", line = 695)
	@Override
	public void method6957() {
		if (this.anInt370 <= 0 || this.anInt372 <= 0) {
			return;
		}
		this.method2715(false);
		if ((this.aByte3 & 0x10) == 0 && this.aClass175_1.anInterface15_4 == null) {
			this.method2713(false);
		}
		this.method2693();
	}

	@OriginalMember(owner = "client!aeb", name = "bk", descriptor = "()V", line = 695)
	@Override
	public void method6869() {
		if (this.anInt370 <= 0 || this.anInt372 <= 0) {
			return;
		}
		this.method2715(false);
		if ((this.aByte3 & 0x10) == 0 && this.aClass175_1.anInterface15_4 == null) {
			this.method2713(false);
		}
		this.method2693();
	}

	@OriginalMember(owner = "client!aeb", name = "bm", descriptor = "()V", line = 695)
	@Override
	public void method6854() {
		if (this.anInt370 <= 0 || this.anInt372 <= 0) {
			return;
		}
		this.method2715(false);
		if ((this.aByte3 & 0x10) == 0 && this.aClass175_1.anInterface15_4 == null) {
			this.method2713(false);
		}
		this.method2693();
	}

	@OriginalMember(owner = "client!aeb", name = "t", descriptor = "(BIZ)Lclient!dv;", line = 704)
	@Override
	public Class84 method6794(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class84_Sub1 local22;
		@Pc(14) Class84_Sub1 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass86_Sub3_23.aClass84_Sub1Array2[arg0 - 1];
			local22 = this.aClass86_Sub3_23.aClass84_Sub1Array1[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class84_Sub1(this.aClass86_Sub3_23);
		}
		return this.method2688(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!aeb", name = "bz", descriptor = "(BIZ)Lclient!dv;", line = 704)
	@Override
	public Class84 method6849(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class84_Sub1 local22;
		@Pc(14) Class84_Sub1 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass86_Sub3_23.aClass84_Sub1Array2[arg0 - 1];
			local22 = this.aClass86_Sub3_23.aClass84_Sub1Array1[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class84_Sub1(this.aClass86_Sub3_23);
		}
		return this.method2688(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!aeb", name = "bt", descriptor = "(BIZ)Lclient!dv;", line = 704)
	@Override
	public Class84 method6848(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(1) boolean local1 = false;
		@Pc(22) Class84_Sub1 local22;
		@Pc(14) Class84_Sub1 local14;
		if (arg0 > 0 && arg0 <= 8) {
			local14 = this.aClass86_Sub3_23.aClass84_Sub1Array2[arg0 - 1];
			local22 = this.aClass86_Sub3_23.aClass84_Sub1Array1[arg0 - 1];
			local1 = true;
		} else {
			local22 = local14 = new Class84_Sub1(this.aClass86_Sub3_23);
		}
		return this.method2688(local22, local14, arg1, local1, arg2);
	}

	@OriginalMember(owner = "client!aeb", name = "hk", descriptor = "(Lclient!aeb;Lclient!aeb;IZZ)Lclient!dv;", line = 717)
	Class84 method2688(@OriginalArg(0) Class84_Sub1 arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		arg0.aByte3 = 0;
		arg0.anInt366 = arg2;
		arg0.anInt378 = this.anInt378;
		arg0.aShort2 = this.aShort2;
		arg0.aShort3 = this.aShort3;
		arg0.anInt368 = this.anInt368;
		arg0.anInt373 = this.anInt373;
		arg0.anInt370 = this.anInt370;
		arg0.anInt371 = this.anInt371;
		arg0.anInt372 = this.anInt372;
		arg0.anInt377 = this.anInt377;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean57 = this.aBoolean57;
		} else {
			arg0.aBoolean57 = true;
		}
		arg0.aBoolean58 = this.aBoolean58;
		@Pc(62) boolean local62 = Class170.method24420(arg2, this.anInt378);
		@Pc(67) boolean local67 = Class170.method24422(arg2, this.anInt378);
		@Pc(72) boolean local72 = Class170.method24428(arg2, this.anInt378);
		@Pc(78) boolean local78 = local62 | local67 | local72;
		@Pc(169) int local169;
		if (local78) {
			if (!local62) {
				arg0.anIntArray29 = this.anIntArray29;
			} else if (arg1.anIntArray29 == null || arg1.anIntArray29.length < this.anInt368) {
				arg0.anIntArray29 = arg1.anIntArray29 = new int[this.anInt368];
			} else {
				arg0.anIntArray29 = arg1.anIntArray29;
			}
			if (!local67) {
				arg0.anIntArray31 = this.anIntArray31;
			} else if (arg1.anIntArray31 == null || arg1.anIntArray31.length < this.anInt368) {
				arg0.anIntArray31 = arg1.anIntArray31 = new int[this.anInt368];
			} else {
				arg0.anIntArray31 = arg1.anIntArray31;
			}
			if (!local72) {
				arg0.anIntArray30 = this.anIntArray30;
			} else if (arg1.anIntArray30 == null || arg1.anIntArray30.length < this.anInt368) {
				arg0.anIntArray30 = arg1.anIntArray30 = new int[this.anInt368];
			} else {
				arg0.anIntArray30 = arg1.anIntArray30;
			}
			for (local169 = 0; local169 < this.anInt368; local169++) {
				if (local62) {
					arg0.anIntArray29[local169] = this.anIntArray29[local169];
				}
				if (local67) {
					arg0.anIntArray31[local169] = this.anIntArray31[local169];
				}
				if (local72) {
					arg0.anIntArray30[local169] = this.anIntArray30[local169];
				}
			}
		} else {
			arg0.anIntArray29 = this.anIntArray29;
			arg0.anIntArray31 = this.anIntArray31;
			arg0.anIntArray30 = this.anIntArray30;
		}
		if (Class170.method24470(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x1);
			}
			arg0.aClass172_1 = arg1.aClass172_1;
			arg0.aClass172_1.aByte107 = this.aClass172_1.aByte107;
			arg0.aClass172_1.anInterface14_6 = this.aClass172_1.anInterface14_6;
		} else if (Class170.method24458(arg2, this.anInt378)) {
			arg0.aClass172_1 = this.aClass172_1;
		} else {
			arg0.aClass172_1 = null;
		}
		if (Class170.method24438(arg2, this.anInt378)) {
			if (arg1.aShortArray13 == null || arg1.aShortArray13.length < this.anInt371) {
				arg0.aShortArray13 = arg1.aShortArray13 = new short[this.anInt371];
			} else {
				arg0.aShortArray13 = arg1.aShortArray13;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray13[local169] = this.aShortArray13[local169];
			}
		} else {
			arg0.aShortArray13 = this.aShortArray13;
		}
		if (Class170.method24441(arg2, this.anInt378)) {
			if (arg1.aByteArray10 == null || arg1.aByteArray10.length < this.anInt371) {
				arg0.aByteArray10 = arg1.aByteArray10 = new byte[this.anInt371];
			} else {
				arg0.aByteArray10 = arg1.aByteArray10;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aByteArray10[local169] = this.aByteArray10[local169];
			}
		} else {
			arg0.aByteArray10 = this.aByteArray10;
		}
		if (Class170.method24476(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x2);
			}
			arg0.aClass172_3 = arg1.aClass172_3;
			arg0.aClass172_3.aByte107 = this.aClass172_3.aByte107;
			arg0.aClass172_3.anInterface14_6 = this.aClass172_3.anInterface14_6;
		} else if (Class170.method24464(arg2, this.anInt378)) {
			arg0.aClass172_3 = this.aClass172_3;
		} else {
			arg0.aClass172_3 = null;
		}
		@Pc(482) int local482;
		if (Class170.method24437(arg2, this.anInt378)) {
			if (arg1.aShortArray10 == null || arg1.aShortArray10.length < this.anInt370) {
				local169 = this.anInt370;
				arg0.aShortArray10 = arg1.aShortArray10 = new short[local169];
				arg0.aShortArray9 = arg1.aShortArray9 = new short[local169];
				arg0.aShortArray11 = arg1.aShortArray11 = new short[local169];
			} else {
				arg0.aShortArray10 = arg1.aShortArray10;
				arg0.aShortArray9 = arg1.aShortArray9;
				arg0.aShortArray11 = arg1.aShortArray11;
			}
			if (this.aClass190_1 == null) {
				for (local169 = 0; local169 < this.anInt370; local169++) {
					arg0.aShortArray10[local169] = this.aShortArray10[local169];
					arg0.aShortArray9[local169] = this.aShortArray9[local169];
					arg0.aShortArray11[local169] = this.aShortArray11[local169];
				}
			} else {
				if (arg1.aClass190_1 == null) {
					arg1.aClass190_1 = new Class190();
				}
				@Pc(470) Class190 local470 = arg0.aClass190_1 = arg1.aClass190_1;
				if (local470.aShortArray85 == null || local470.aShortArray85.length < this.anInt370) {
					local482 = this.anInt370;
					local470.aShortArray85 = new short[local482];
					local470.aShortArray84 = new short[local482];
					local470.aShortArray83 = new short[local482];
					local470.aByteArray59 = new byte[local482];
				}
				for (local482 = 0; local482 < this.anInt370; local482++) {
					arg0.aShortArray10[local482] = this.aShortArray10[local482];
					arg0.aShortArray9[local482] = this.aShortArray9[local482];
					arg0.aShortArray11[local482] = this.aShortArray11[local482];
					local470.aShortArray85[local482] = this.aClass190_1.aShortArray85[local482];
					local470.aShortArray84[local482] = this.aClass190_1.aShortArray84[local482];
					local470.aShortArray83[local482] = this.aClass190_1.aShortArray83[local482];
					local470.aByteArray59[local482] = this.aClass190_1.aByteArray59[local482];
				}
			}
			arg0.aByteArray9 = this.aByteArray9;
		} else {
			arg0.aClass190_1 = this.aClass190_1;
			arg0.aShortArray10 = this.aShortArray10;
			arg0.aShortArray9 = this.aShortArray9;
			arg0.aShortArray11 = this.aShortArray11;
			arg0.aByteArray9 = this.aByteArray9;
		}
		if (Class170.method24473(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x4);
			}
			arg0.aClass172_2 = arg1.aClass172_2;
			arg0.aClass172_2.aByte107 = this.aClass172_2.aByte107;
			arg0.aClass172_2.anInterface14_6 = this.aClass172_2.anInterface14_6;
		} else if (Class170.method24462(arg2, this.anInt378)) {
			arg0.aClass172_2 = this.aClass172_2;
		} else {
			arg0.aClass172_2 = null;
		}
		if (Class170.method24445(arg2, this.anInt378)) {
			if (arg1.aFloatArray6 == null || arg1.aFloatArray6.length < this.anInt371) {
				local169 = this.anInt370;
				arg0.aFloatArray6 = arg1.aFloatArray6 = new float[local169];
				arg0.aFloatArray7 = arg1.aFloatArray7 = new float[local169];
			} else {
				arg0.aFloatArray6 = arg1.aFloatArray6;
				arg0.aFloatArray7 = arg1.aFloatArray7;
			}
			for (local169 = 0; local169 < this.anInt370; local169++) {
				arg0.aFloatArray6[local169] = this.aFloatArray6[local169];
				arg0.aFloatArray7[local169] = this.aFloatArray7[local169];
			}
		} else {
			arg0.aFloatArray6 = this.aFloatArray6;
			arg0.aFloatArray7 = this.aFloatArray7;
		}
		if (Class170.method24481(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x8);
			}
			arg0.aClass172_4 = arg1.aClass172_4;
			arg0.aClass172_4.aByte107 = this.aClass172_4.aByte107;
			arg0.aClass172_4.anInterface14_6 = this.aClass172_4.anInterface14_6;
		} else if (Class170.method24465(arg2, this.anInt378)) {
			arg0.aClass172_4 = this.aClass172_4;
		} else {
			arg0.aClass172_4 = null;
		}
		if (Class170.method24447(arg2, this.anInt378)) {
			if (arg1.aShortArray14 == null || arg1.aShortArray14.length < this.anInt371) {
				local169 = this.anInt371;
				arg0.aShortArray14 = arg1.aShortArray14 = new short[local169];
				arg0.aShortArray8 = arg1.aShortArray8 = new short[local169];
				arg0.aShortArray15 = arg1.aShortArray15 = new short[local169];
			} else {
				arg0.aShortArray14 = arg1.aShortArray14;
				arg0.aShortArray8 = arg1.aShortArray8;
				arg0.aShortArray15 = arg1.aShortArray15;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray14[local169] = this.aShortArray14[local169];
				arg0.aShortArray8[local169] = this.aShortArray8[local169];
				arg0.aShortArray15[local169] = this.aShortArray15[local169];
			}
		} else {
			arg0.aShortArray14 = this.aShortArray14;
			arg0.aShortArray8 = this.aShortArray8;
			arg0.aShortArray15 = this.aShortArray15;
		}
		if (Class170.method24484(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x10);
			}
			arg0.aClass175_1 = arg1.aClass175_1;
			arg0.aClass175_1.anInterface15_4 = this.aClass175_1.anInterface15_4;
		} else if (Class170.method24468(arg2, this.anInt378)) {
			arg0.aClass175_1 = this.aClass175_1;
		} else {
			arg0.aClass175_1 = null;
		}
		if (Class170.method24449(arg2, this.anInt378)) {
			if (arg1.aShortArray16 == null || arg1.aShortArray16.length < this.anInt371) {
				local169 = this.anInt371;
				arg0.aShortArray16 = arg1.aShortArray16 = new short[local169];
			} else {
				arg0.aShortArray16 = arg1.aShortArray16;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray16[local169] = this.aShortArray16[local169];
			}
		} else {
			arg0.aShortArray16 = this.aShortArray16;
		}
		if (!Class170.method24451(arg2, this.anInt378)) {
			arg0.aClass176Array1 = this.aClass176Array1;
		} else if (arg1.aClass176Array1 == null || arg1.aClass176Array1.length < this.anInt377) {
			local169 = this.anInt377;
			arg0.aClass176Array1 = arg1.aClass176Array1 = new Class176[local169];
			for (local482 = 0; local482 < this.anInt377; local482++) {
				arg0.aClass176Array1[local482] = this.aClass176Array1[local482].method24553();
			}
		} else {
			arg0.aClass176Array1 = arg1.aClass176Array1;
			for (local169 = 0; local169 < this.anInt377; local169++) {
				arg0.aClass176Array1[local169].method24556(this.aClass176Array1[local169]);
			}
		}
		arg0.aClass189Array1 = this.aClass189Array1;
		if (this.aBoolean60) {
			arg0.anInt375 = this.anInt375;
			arg0.anInt362 = this.anInt362;
			arg0.aShort1 = this.aShort1;
			arg0.aShort6 = this.aShort6;
			arg0.aShort4 = this.aShort4;
			arg0.aShort5 = this.aShort5;
			arg0.aShort7 = this.aShort7;
			arg0.aShort8 = this.aShort8;
			arg0.aBoolean60 = true;
		} else {
			arg0.aBoolean60 = false;
		}
		if (this.aBoolean59) {
			arg0.aShort9 = this.aShort9;
			arg0.aBoolean59 = true;
		} else {
			arg0.aBoolean59 = false;
		}
		arg0.anIntArrayArray1 = this.anIntArrayArray1;
		arg0.anIntArrayArray2 = this.anIntArrayArray2;
		arg0.anIntArrayArray3 = this.anIntArrayArray3;
		arg0.aShortArray18 = this.aShortArray18;
		arg0.anIntArray33 = this.anIntArray33;
		arg0.aShortArray12 = this.aShortArray12;
		arg0.aShortArray17 = this.aShortArray17;
		arg0.anIntArray32 = this.anIntArray32;
		arg0.aClass205Array1 = this.aClass205Array1;
		arg0.aClass195Array1 = this.aClass195Array1;
		return arg0;
	}

	@OriginalMember(owner = "client!aeb", name = "iz", descriptor = "(Lclient!aeb;Lclient!aeb;IZZ)Lclient!dv;", line = 717)
	Class84 method2689(@OriginalArg(0) Class84_Sub1 arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		arg0.aByte3 = 0;
		arg0.anInt366 = arg2;
		arg0.anInt378 = this.anInt378;
		arg0.aShort2 = this.aShort2;
		arg0.aShort3 = this.aShort3;
		arg0.anInt368 = this.anInt368;
		arg0.anInt373 = this.anInt373;
		arg0.anInt370 = this.anInt370;
		arg0.anInt371 = this.anInt371;
		arg0.anInt372 = this.anInt372;
		arg0.anInt377 = this.anInt377;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean57 = this.aBoolean57;
		} else {
			arg0.aBoolean57 = true;
		}
		arg0.aBoolean58 = this.aBoolean58;
		@Pc(62) boolean local62 = Class170.method24420(arg2, this.anInt378);
		@Pc(67) boolean local67 = Class170.method24422(arg2, this.anInt378);
		@Pc(72) boolean local72 = Class170.method24428(arg2, this.anInt378);
		@Pc(78) boolean local78 = local62 | local67 | local72;
		@Pc(169) int local169;
		if (local78) {
			if (!local62) {
				arg0.anIntArray29 = this.anIntArray29;
			} else if (arg1.anIntArray29 == null || arg1.anIntArray29.length < this.anInt368) {
				arg0.anIntArray29 = arg1.anIntArray29 = new int[this.anInt368];
			} else {
				arg0.anIntArray29 = arg1.anIntArray29;
			}
			if (!local67) {
				arg0.anIntArray31 = this.anIntArray31;
			} else if (arg1.anIntArray31 == null || arg1.anIntArray31.length < this.anInt368) {
				arg0.anIntArray31 = arg1.anIntArray31 = new int[this.anInt368];
			} else {
				arg0.anIntArray31 = arg1.anIntArray31;
			}
			if (!local72) {
				arg0.anIntArray30 = this.anIntArray30;
			} else if (arg1.anIntArray30 == null || arg1.anIntArray30.length < this.anInt368) {
				arg0.anIntArray30 = arg1.anIntArray30 = new int[this.anInt368];
			} else {
				arg0.anIntArray30 = arg1.anIntArray30;
			}
			for (local169 = 0; local169 < this.anInt368; local169++) {
				if (local62) {
					arg0.anIntArray29[local169] = this.anIntArray29[local169];
				}
				if (local67) {
					arg0.anIntArray31[local169] = this.anIntArray31[local169];
				}
				if (local72) {
					arg0.anIntArray30[local169] = this.anIntArray30[local169];
				}
			}
		} else {
			arg0.anIntArray29 = this.anIntArray29;
			arg0.anIntArray31 = this.anIntArray31;
			arg0.anIntArray30 = this.anIntArray30;
		}
		if (Class170.method24470(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x1);
			}
			arg0.aClass172_1 = arg1.aClass172_1;
			arg0.aClass172_1.aByte107 = this.aClass172_1.aByte107;
			arg0.aClass172_1.anInterface14_6 = this.aClass172_1.anInterface14_6;
		} else if (Class170.method24458(arg2, this.anInt378)) {
			arg0.aClass172_1 = this.aClass172_1;
		} else {
			arg0.aClass172_1 = null;
		}
		if (Class170.method24438(arg2, this.anInt378)) {
			if (arg1.aShortArray13 == null || arg1.aShortArray13.length < this.anInt371) {
				arg0.aShortArray13 = arg1.aShortArray13 = new short[this.anInt371];
			} else {
				arg0.aShortArray13 = arg1.aShortArray13;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray13[local169] = this.aShortArray13[local169];
			}
		} else {
			arg0.aShortArray13 = this.aShortArray13;
		}
		if (Class170.method24441(arg2, this.anInt378)) {
			if (arg1.aByteArray10 == null || arg1.aByteArray10.length < this.anInt371) {
				arg0.aByteArray10 = arg1.aByteArray10 = new byte[this.anInt371];
			} else {
				arg0.aByteArray10 = arg1.aByteArray10;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aByteArray10[local169] = this.aByteArray10[local169];
			}
		} else {
			arg0.aByteArray10 = this.aByteArray10;
		}
		if (Class170.method24476(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x2);
			}
			arg0.aClass172_3 = arg1.aClass172_3;
			arg0.aClass172_3.aByte107 = this.aClass172_3.aByte107;
			arg0.aClass172_3.anInterface14_6 = this.aClass172_3.anInterface14_6;
		} else if (Class170.method24464(arg2, this.anInt378)) {
			arg0.aClass172_3 = this.aClass172_3;
		} else {
			arg0.aClass172_3 = null;
		}
		@Pc(482) int local482;
		if (Class170.method24437(arg2, this.anInt378)) {
			if (arg1.aShortArray10 == null || arg1.aShortArray10.length < this.anInt370) {
				local169 = this.anInt370;
				arg0.aShortArray10 = arg1.aShortArray10 = new short[local169];
				arg0.aShortArray9 = arg1.aShortArray9 = new short[local169];
				arg0.aShortArray11 = arg1.aShortArray11 = new short[local169];
			} else {
				arg0.aShortArray10 = arg1.aShortArray10;
				arg0.aShortArray9 = arg1.aShortArray9;
				arg0.aShortArray11 = arg1.aShortArray11;
			}
			if (this.aClass190_1 == null) {
				for (local169 = 0; local169 < this.anInt370; local169++) {
					arg0.aShortArray10[local169] = this.aShortArray10[local169];
					arg0.aShortArray9[local169] = this.aShortArray9[local169];
					arg0.aShortArray11[local169] = this.aShortArray11[local169];
				}
			} else {
				if (arg1.aClass190_1 == null) {
					arg1.aClass190_1 = new Class190();
				}
				@Pc(470) Class190 local470 = arg0.aClass190_1 = arg1.aClass190_1;
				if (local470.aShortArray85 == null || local470.aShortArray85.length < this.anInt370) {
					local482 = this.anInt370;
					local470.aShortArray85 = new short[local482];
					local470.aShortArray84 = new short[local482];
					local470.aShortArray83 = new short[local482];
					local470.aByteArray59 = new byte[local482];
				}
				for (local482 = 0; local482 < this.anInt370; local482++) {
					arg0.aShortArray10[local482] = this.aShortArray10[local482];
					arg0.aShortArray9[local482] = this.aShortArray9[local482];
					arg0.aShortArray11[local482] = this.aShortArray11[local482];
					local470.aShortArray85[local482] = this.aClass190_1.aShortArray85[local482];
					local470.aShortArray84[local482] = this.aClass190_1.aShortArray84[local482];
					local470.aShortArray83[local482] = this.aClass190_1.aShortArray83[local482];
					local470.aByteArray59[local482] = this.aClass190_1.aByteArray59[local482];
				}
			}
			arg0.aByteArray9 = this.aByteArray9;
		} else {
			arg0.aClass190_1 = this.aClass190_1;
			arg0.aShortArray10 = this.aShortArray10;
			arg0.aShortArray9 = this.aShortArray9;
			arg0.aShortArray11 = this.aShortArray11;
			arg0.aByteArray9 = this.aByteArray9;
		}
		if (Class170.method24473(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x4);
			}
			arg0.aClass172_2 = arg1.aClass172_2;
			arg0.aClass172_2.aByte107 = this.aClass172_2.aByte107;
			arg0.aClass172_2.anInterface14_6 = this.aClass172_2.anInterface14_6;
		} else if (Class170.method24462(arg2, this.anInt378)) {
			arg0.aClass172_2 = this.aClass172_2;
		} else {
			arg0.aClass172_2 = null;
		}
		if (Class170.method24445(arg2, this.anInt378)) {
			if (arg1.aFloatArray6 == null || arg1.aFloatArray6.length < this.anInt371) {
				local169 = this.anInt370;
				arg0.aFloatArray6 = arg1.aFloatArray6 = new float[local169];
				arg0.aFloatArray7 = arg1.aFloatArray7 = new float[local169];
			} else {
				arg0.aFloatArray6 = arg1.aFloatArray6;
				arg0.aFloatArray7 = arg1.aFloatArray7;
			}
			for (local169 = 0; local169 < this.anInt370; local169++) {
				arg0.aFloatArray6[local169] = this.aFloatArray6[local169];
				arg0.aFloatArray7[local169] = this.aFloatArray7[local169];
			}
		} else {
			arg0.aFloatArray6 = this.aFloatArray6;
			arg0.aFloatArray7 = this.aFloatArray7;
		}
		if (Class170.method24481(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x8);
			}
			arg0.aClass172_4 = arg1.aClass172_4;
			arg0.aClass172_4.aByte107 = this.aClass172_4.aByte107;
			arg0.aClass172_4.anInterface14_6 = this.aClass172_4.anInterface14_6;
		} else if (Class170.method24465(arg2, this.anInt378)) {
			arg0.aClass172_4 = this.aClass172_4;
		} else {
			arg0.aClass172_4 = null;
		}
		if (Class170.method24447(arg2, this.anInt378)) {
			if (arg1.aShortArray14 == null || arg1.aShortArray14.length < this.anInt371) {
				local169 = this.anInt371;
				arg0.aShortArray14 = arg1.aShortArray14 = new short[local169];
				arg0.aShortArray8 = arg1.aShortArray8 = new short[local169];
				arg0.aShortArray15 = arg1.aShortArray15 = new short[local169];
			} else {
				arg0.aShortArray14 = arg1.aShortArray14;
				arg0.aShortArray8 = arg1.aShortArray8;
				arg0.aShortArray15 = arg1.aShortArray15;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray14[local169] = this.aShortArray14[local169];
				arg0.aShortArray8[local169] = this.aShortArray8[local169];
				arg0.aShortArray15[local169] = this.aShortArray15[local169];
			}
		} else {
			arg0.aShortArray14 = this.aShortArray14;
			arg0.aShortArray8 = this.aShortArray8;
			arg0.aShortArray15 = this.aShortArray15;
		}
		if (Class170.method24484(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x10);
			}
			arg0.aClass175_1 = arg1.aClass175_1;
			arg0.aClass175_1.anInterface15_4 = this.aClass175_1.anInterface15_4;
		} else if (Class170.method24468(arg2, this.anInt378)) {
			arg0.aClass175_1 = this.aClass175_1;
		} else {
			arg0.aClass175_1 = null;
		}
		if (Class170.method24449(arg2, this.anInt378)) {
			if (arg1.aShortArray16 == null || arg1.aShortArray16.length < this.anInt371) {
				local169 = this.anInt371;
				arg0.aShortArray16 = arg1.aShortArray16 = new short[local169];
			} else {
				arg0.aShortArray16 = arg1.aShortArray16;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray16[local169] = this.aShortArray16[local169];
			}
		} else {
			arg0.aShortArray16 = this.aShortArray16;
		}
		if (!Class170.method24451(arg2, this.anInt378)) {
			arg0.aClass176Array1 = this.aClass176Array1;
		} else if (arg1.aClass176Array1 == null || arg1.aClass176Array1.length < this.anInt377) {
			local169 = this.anInt377;
			arg0.aClass176Array1 = arg1.aClass176Array1 = new Class176[local169];
			for (local482 = 0; local482 < this.anInt377; local482++) {
				arg0.aClass176Array1[local482] = this.aClass176Array1[local482].method24553();
			}
		} else {
			arg0.aClass176Array1 = arg1.aClass176Array1;
			for (local169 = 0; local169 < this.anInt377; local169++) {
				arg0.aClass176Array1[local169].method24556(this.aClass176Array1[local169]);
			}
		}
		arg0.aClass189Array1 = this.aClass189Array1;
		if (this.aBoolean60) {
			arg0.anInt375 = this.anInt375;
			arg0.anInt362 = this.anInt362;
			arg0.aShort1 = this.aShort1;
			arg0.aShort6 = this.aShort6;
			arg0.aShort4 = this.aShort4;
			arg0.aShort5 = this.aShort5;
			arg0.aShort7 = this.aShort7;
			arg0.aShort8 = this.aShort8;
			arg0.aBoolean60 = true;
		} else {
			arg0.aBoolean60 = false;
		}
		if (this.aBoolean59) {
			arg0.aShort9 = this.aShort9;
			arg0.aBoolean59 = true;
		} else {
			arg0.aBoolean59 = false;
		}
		arg0.anIntArrayArray1 = this.anIntArrayArray1;
		arg0.anIntArrayArray2 = this.anIntArrayArray2;
		arg0.anIntArrayArray3 = this.anIntArrayArray3;
		arg0.aShortArray18 = this.aShortArray18;
		arg0.anIntArray33 = this.anIntArray33;
		arg0.aShortArray12 = this.aShortArray12;
		arg0.aShortArray17 = this.aShortArray17;
		arg0.anIntArray32 = this.anIntArray32;
		arg0.aClass205Array1 = this.aClass205Array1;
		arg0.aClass195Array1 = this.aClass195Array1;
		return arg0;
	}

	@OriginalMember(owner = "client!aeb", name = "iu", descriptor = "(Lclient!aeb;Lclient!aeb;IZZ)Lclient!dv;", line = 717)
	Class84 method2690(@OriginalArg(0) Class84_Sub1 arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		arg0.aByte3 = 0;
		arg0.anInt366 = arg2;
		arg0.anInt378 = this.anInt378;
		arg0.aShort2 = this.aShort2;
		arg0.aShort3 = this.aShort3;
		arg0.anInt368 = this.anInt368;
		arg0.anInt373 = this.anInt373;
		arg0.anInt370 = this.anInt370;
		arg0.anInt371 = this.anInt371;
		arg0.anInt372 = this.anInt372;
		arg0.anInt377 = this.anInt377;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean57 = this.aBoolean57;
		} else {
			arg0.aBoolean57 = true;
		}
		arg0.aBoolean58 = this.aBoolean58;
		@Pc(62) boolean local62 = Class170.method24420(arg2, this.anInt378);
		@Pc(67) boolean local67 = Class170.method24422(arg2, this.anInt378);
		@Pc(72) boolean local72 = Class170.method24428(arg2, this.anInt378);
		@Pc(78) boolean local78 = local62 | local67 | local72;
		@Pc(169) int local169;
		if (local78) {
			if (!local62) {
				arg0.anIntArray29 = this.anIntArray29;
			} else if (arg1.anIntArray29 == null || arg1.anIntArray29.length < this.anInt368) {
				arg0.anIntArray29 = arg1.anIntArray29 = new int[this.anInt368];
			} else {
				arg0.anIntArray29 = arg1.anIntArray29;
			}
			if (!local67) {
				arg0.anIntArray31 = this.anIntArray31;
			} else if (arg1.anIntArray31 == null || arg1.anIntArray31.length < this.anInt368) {
				arg0.anIntArray31 = arg1.anIntArray31 = new int[this.anInt368];
			} else {
				arg0.anIntArray31 = arg1.anIntArray31;
			}
			if (!local72) {
				arg0.anIntArray30 = this.anIntArray30;
			} else if (arg1.anIntArray30 == null || arg1.anIntArray30.length < this.anInt368) {
				arg0.anIntArray30 = arg1.anIntArray30 = new int[this.anInt368];
			} else {
				arg0.anIntArray30 = arg1.anIntArray30;
			}
			for (local169 = 0; local169 < this.anInt368; local169++) {
				if (local62) {
					arg0.anIntArray29[local169] = this.anIntArray29[local169];
				}
				if (local67) {
					arg0.anIntArray31[local169] = this.anIntArray31[local169];
				}
				if (local72) {
					arg0.anIntArray30[local169] = this.anIntArray30[local169];
				}
			}
		} else {
			arg0.anIntArray29 = this.anIntArray29;
			arg0.anIntArray31 = this.anIntArray31;
			arg0.anIntArray30 = this.anIntArray30;
		}
		if (Class170.method24470(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x1);
			}
			arg0.aClass172_1 = arg1.aClass172_1;
			arg0.aClass172_1.aByte107 = this.aClass172_1.aByte107;
			arg0.aClass172_1.anInterface14_6 = this.aClass172_1.anInterface14_6;
		} else if (Class170.method24458(arg2, this.anInt378)) {
			arg0.aClass172_1 = this.aClass172_1;
		} else {
			arg0.aClass172_1 = null;
		}
		if (Class170.method24438(arg2, this.anInt378)) {
			if (arg1.aShortArray13 == null || arg1.aShortArray13.length < this.anInt371) {
				arg0.aShortArray13 = arg1.aShortArray13 = new short[this.anInt371];
			} else {
				arg0.aShortArray13 = arg1.aShortArray13;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray13[local169] = this.aShortArray13[local169];
			}
		} else {
			arg0.aShortArray13 = this.aShortArray13;
		}
		if (Class170.method24441(arg2, this.anInt378)) {
			if (arg1.aByteArray10 == null || arg1.aByteArray10.length < this.anInt371) {
				arg0.aByteArray10 = arg1.aByteArray10 = new byte[this.anInt371];
			} else {
				arg0.aByteArray10 = arg1.aByteArray10;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aByteArray10[local169] = this.aByteArray10[local169];
			}
		} else {
			arg0.aByteArray10 = this.aByteArray10;
		}
		if (Class170.method24476(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x2);
			}
			arg0.aClass172_3 = arg1.aClass172_3;
			arg0.aClass172_3.aByte107 = this.aClass172_3.aByte107;
			arg0.aClass172_3.anInterface14_6 = this.aClass172_3.anInterface14_6;
		} else if (Class170.method24464(arg2, this.anInt378)) {
			arg0.aClass172_3 = this.aClass172_3;
		} else {
			arg0.aClass172_3 = null;
		}
		@Pc(482) int local482;
		if (Class170.method24437(arg2, this.anInt378)) {
			if (arg1.aShortArray10 == null || arg1.aShortArray10.length < this.anInt370) {
				local169 = this.anInt370;
				arg0.aShortArray10 = arg1.aShortArray10 = new short[local169];
				arg0.aShortArray9 = arg1.aShortArray9 = new short[local169];
				arg0.aShortArray11 = arg1.aShortArray11 = new short[local169];
			} else {
				arg0.aShortArray10 = arg1.aShortArray10;
				arg0.aShortArray9 = arg1.aShortArray9;
				arg0.aShortArray11 = arg1.aShortArray11;
			}
			if (this.aClass190_1 == null) {
				for (local169 = 0; local169 < this.anInt370; local169++) {
					arg0.aShortArray10[local169] = this.aShortArray10[local169];
					arg0.aShortArray9[local169] = this.aShortArray9[local169];
					arg0.aShortArray11[local169] = this.aShortArray11[local169];
				}
			} else {
				if (arg1.aClass190_1 == null) {
					arg1.aClass190_1 = new Class190();
				}
				@Pc(470) Class190 local470 = arg0.aClass190_1 = arg1.aClass190_1;
				if (local470.aShortArray85 == null || local470.aShortArray85.length < this.anInt370) {
					local482 = this.anInt370;
					local470.aShortArray85 = new short[local482];
					local470.aShortArray84 = new short[local482];
					local470.aShortArray83 = new short[local482];
					local470.aByteArray59 = new byte[local482];
				}
				for (local482 = 0; local482 < this.anInt370; local482++) {
					arg0.aShortArray10[local482] = this.aShortArray10[local482];
					arg0.aShortArray9[local482] = this.aShortArray9[local482];
					arg0.aShortArray11[local482] = this.aShortArray11[local482];
					local470.aShortArray85[local482] = this.aClass190_1.aShortArray85[local482];
					local470.aShortArray84[local482] = this.aClass190_1.aShortArray84[local482];
					local470.aShortArray83[local482] = this.aClass190_1.aShortArray83[local482];
					local470.aByteArray59[local482] = this.aClass190_1.aByteArray59[local482];
				}
			}
			arg0.aByteArray9 = this.aByteArray9;
		} else {
			arg0.aClass190_1 = this.aClass190_1;
			arg0.aShortArray10 = this.aShortArray10;
			arg0.aShortArray9 = this.aShortArray9;
			arg0.aShortArray11 = this.aShortArray11;
			arg0.aByteArray9 = this.aByteArray9;
		}
		if (Class170.method24473(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x4);
			}
			arg0.aClass172_2 = arg1.aClass172_2;
			arg0.aClass172_2.aByte107 = this.aClass172_2.aByte107;
			arg0.aClass172_2.anInterface14_6 = this.aClass172_2.anInterface14_6;
		} else if (Class170.method24462(arg2, this.anInt378)) {
			arg0.aClass172_2 = this.aClass172_2;
		} else {
			arg0.aClass172_2 = null;
		}
		if (Class170.method24445(arg2, this.anInt378)) {
			if (arg1.aFloatArray6 == null || arg1.aFloatArray6.length < this.anInt371) {
				local169 = this.anInt370;
				arg0.aFloatArray6 = arg1.aFloatArray6 = new float[local169];
				arg0.aFloatArray7 = arg1.aFloatArray7 = new float[local169];
			} else {
				arg0.aFloatArray6 = arg1.aFloatArray6;
				arg0.aFloatArray7 = arg1.aFloatArray7;
			}
			for (local169 = 0; local169 < this.anInt370; local169++) {
				arg0.aFloatArray6[local169] = this.aFloatArray6[local169];
				arg0.aFloatArray7[local169] = this.aFloatArray7[local169];
			}
		} else {
			arg0.aFloatArray6 = this.aFloatArray6;
			arg0.aFloatArray7 = this.aFloatArray7;
		}
		if (Class170.method24481(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x8);
			}
			arg0.aClass172_4 = arg1.aClass172_4;
			arg0.aClass172_4.aByte107 = this.aClass172_4.aByte107;
			arg0.aClass172_4.anInterface14_6 = this.aClass172_4.anInterface14_6;
		} else if (Class170.method24465(arg2, this.anInt378)) {
			arg0.aClass172_4 = this.aClass172_4;
		} else {
			arg0.aClass172_4 = null;
		}
		if (Class170.method24447(arg2, this.anInt378)) {
			if (arg1.aShortArray14 == null || arg1.aShortArray14.length < this.anInt371) {
				local169 = this.anInt371;
				arg0.aShortArray14 = arg1.aShortArray14 = new short[local169];
				arg0.aShortArray8 = arg1.aShortArray8 = new short[local169];
				arg0.aShortArray15 = arg1.aShortArray15 = new short[local169];
			} else {
				arg0.aShortArray14 = arg1.aShortArray14;
				arg0.aShortArray8 = arg1.aShortArray8;
				arg0.aShortArray15 = arg1.aShortArray15;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray14[local169] = this.aShortArray14[local169];
				arg0.aShortArray8[local169] = this.aShortArray8[local169];
				arg0.aShortArray15[local169] = this.aShortArray15[local169];
			}
		} else {
			arg0.aShortArray14 = this.aShortArray14;
			arg0.aShortArray8 = this.aShortArray8;
			arg0.aShortArray15 = this.aShortArray15;
		}
		if (Class170.method24484(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x10);
			}
			arg0.aClass175_1 = arg1.aClass175_1;
			arg0.aClass175_1.anInterface15_4 = this.aClass175_1.anInterface15_4;
		} else if (Class170.method24468(arg2, this.anInt378)) {
			arg0.aClass175_1 = this.aClass175_1;
		} else {
			arg0.aClass175_1 = null;
		}
		if (Class170.method24449(arg2, this.anInt378)) {
			if (arg1.aShortArray16 == null || arg1.aShortArray16.length < this.anInt371) {
				local169 = this.anInt371;
				arg0.aShortArray16 = arg1.aShortArray16 = new short[local169];
			} else {
				arg0.aShortArray16 = arg1.aShortArray16;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray16[local169] = this.aShortArray16[local169];
			}
		} else {
			arg0.aShortArray16 = this.aShortArray16;
		}
		if (!Class170.method24451(arg2, this.anInt378)) {
			arg0.aClass176Array1 = this.aClass176Array1;
		} else if (arg1.aClass176Array1 == null || arg1.aClass176Array1.length < this.anInt377) {
			local169 = this.anInt377;
			arg0.aClass176Array1 = arg1.aClass176Array1 = new Class176[local169];
			for (local482 = 0; local482 < this.anInt377; local482++) {
				arg0.aClass176Array1[local482] = this.aClass176Array1[local482].method24553();
			}
		} else {
			arg0.aClass176Array1 = arg1.aClass176Array1;
			for (local169 = 0; local169 < this.anInt377; local169++) {
				arg0.aClass176Array1[local169].method24556(this.aClass176Array1[local169]);
			}
		}
		arg0.aClass189Array1 = this.aClass189Array1;
		if (this.aBoolean60) {
			arg0.anInt375 = this.anInt375;
			arg0.anInt362 = this.anInt362;
			arg0.aShort1 = this.aShort1;
			arg0.aShort6 = this.aShort6;
			arg0.aShort4 = this.aShort4;
			arg0.aShort5 = this.aShort5;
			arg0.aShort7 = this.aShort7;
			arg0.aShort8 = this.aShort8;
			arg0.aBoolean60 = true;
		} else {
			arg0.aBoolean60 = false;
		}
		if (this.aBoolean59) {
			arg0.aShort9 = this.aShort9;
			arg0.aBoolean59 = true;
		} else {
			arg0.aBoolean59 = false;
		}
		arg0.anIntArrayArray1 = this.anIntArrayArray1;
		arg0.anIntArrayArray2 = this.anIntArrayArray2;
		arg0.anIntArrayArray3 = this.anIntArrayArray3;
		arg0.aShortArray18 = this.aShortArray18;
		arg0.anIntArray33 = this.anIntArray33;
		arg0.aShortArray12 = this.aShortArray12;
		arg0.aShortArray17 = this.aShortArray17;
		arg0.anIntArray32 = this.anIntArray32;
		arg0.aClass205Array1 = this.aClass205Array1;
		arg0.aClass195Array1 = this.aClass195Array1;
		return arg0;
	}

	@OriginalMember(owner = "client!aeb", name = "is", descriptor = "(Lclient!aeb;Lclient!aeb;IZZ)Lclient!dv;", line = 717)
	Class84 method2691(@OriginalArg(0) Class84_Sub1 arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		arg0.aByte3 = 0;
		arg0.anInt366 = arg2;
		arg0.anInt378 = this.anInt378;
		arg0.aShort2 = this.aShort2;
		arg0.aShort3 = this.aShort3;
		arg0.anInt368 = this.anInt368;
		arg0.anInt373 = this.anInt373;
		arg0.anInt370 = this.anInt370;
		arg0.anInt371 = this.anInt371;
		arg0.anInt372 = this.anInt372;
		arg0.anInt377 = this.anInt377;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean57 = this.aBoolean57;
		} else {
			arg0.aBoolean57 = true;
		}
		arg0.aBoolean58 = this.aBoolean58;
		@Pc(62) boolean local62 = Class170.method24420(arg2, this.anInt378);
		@Pc(67) boolean local67 = Class170.method24422(arg2, this.anInt378);
		@Pc(72) boolean local72 = Class170.method24428(arg2, this.anInt378);
		@Pc(78) boolean local78 = local62 | local67 | local72;
		@Pc(169) int local169;
		if (local78) {
			if (!local62) {
				arg0.anIntArray29 = this.anIntArray29;
			} else if (arg1.anIntArray29 == null || arg1.anIntArray29.length < this.anInt368) {
				arg0.anIntArray29 = arg1.anIntArray29 = new int[this.anInt368];
			} else {
				arg0.anIntArray29 = arg1.anIntArray29;
			}
			if (!local67) {
				arg0.anIntArray31 = this.anIntArray31;
			} else if (arg1.anIntArray31 == null || arg1.anIntArray31.length < this.anInt368) {
				arg0.anIntArray31 = arg1.anIntArray31 = new int[this.anInt368];
			} else {
				arg0.anIntArray31 = arg1.anIntArray31;
			}
			if (!local72) {
				arg0.anIntArray30 = this.anIntArray30;
			} else if (arg1.anIntArray30 == null || arg1.anIntArray30.length < this.anInt368) {
				arg0.anIntArray30 = arg1.anIntArray30 = new int[this.anInt368];
			} else {
				arg0.anIntArray30 = arg1.anIntArray30;
			}
			for (local169 = 0; local169 < this.anInt368; local169++) {
				if (local62) {
					arg0.anIntArray29[local169] = this.anIntArray29[local169];
				}
				if (local67) {
					arg0.anIntArray31[local169] = this.anIntArray31[local169];
				}
				if (local72) {
					arg0.anIntArray30[local169] = this.anIntArray30[local169];
				}
			}
		} else {
			arg0.anIntArray29 = this.anIntArray29;
			arg0.anIntArray31 = this.anIntArray31;
			arg0.anIntArray30 = this.anIntArray30;
		}
		if (Class170.method24470(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x1);
			}
			arg0.aClass172_1 = arg1.aClass172_1;
			arg0.aClass172_1.aByte107 = this.aClass172_1.aByte107;
			arg0.aClass172_1.anInterface14_6 = this.aClass172_1.anInterface14_6;
		} else if (Class170.method24458(arg2, this.anInt378)) {
			arg0.aClass172_1 = this.aClass172_1;
		} else {
			arg0.aClass172_1 = null;
		}
		if (Class170.method24438(arg2, this.anInt378)) {
			if (arg1.aShortArray13 == null || arg1.aShortArray13.length < this.anInt371) {
				arg0.aShortArray13 = arg1.aShortArray13 = new short[this.anInt371];
			} else {
				arg0.aShortArray13 = arg1.aShortArray13;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray13[local169] = this.aShortArray13[local169];
			}
		} else {
			arg0.aShortArray13 = this.aShortArray13;
		}
		if (Class170.method24441(arg2, this.anInt378)) {
			if (arg1.aByteArray10 == null || arg1.aByteArray10.length < this.anInt371) {
				arg0.aByteArray10 = arg1.aByteArray10 = new byte[this.anInt371];
			} else {
				arg0.aByteArray10 = arg1.aByteArray10;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aByteArray10[local169] = this.aByteArray10[local169];
			}
		} else {
			arg0.aByteArray10 = this.aByteArray10;
		}
		if (Class170.method24476(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x2);
			}
			arg0.aClass172_3 = arg1.aClass172_3;
			arg0.aClass172_3.aByte107 = this.aClass172_3.aByte107;
			arg0.aClass172_3.anInterface14_6 = this.aClass172_3.anInterface14_6;
		} else if (Class170.method24464(arg2, this.anInt378)) {
			arg0.aClass172_3 = this.aClass172_3;
		} else {
			arg0.aClass172_3 = null;
		}
		@Pc(482) int local482;
		if (Class170.method24437(arg2, this.anInt378)) {
			if (arg1.aShortArray10 == null || arg1.aShortArray10.length < this.anInt370) {
				local169 = this.anInt370;
				arg0.aShortArray10 = arg1.aShortArray10 = new short[local169];
				arg0.aShortArray9 = arg1.aShortArray9 = new short[local169];
				arg0.aShortArray11 = arg1.aShortArray11 = new short[local169];
			} else {
				arg0.aShortArray10 = arg1.aShortArray10;
				arg0.aShortArray9 = arg1.aShortArray9;
				arg0.aShortArray11 = arg1.aShortArray11;
			}
			if (this.aClass190_1 == null) {
				for (local169 = 0; local169 < this.anInt370; local169++) {
					arg0.aShortArray10[local169] = this.aShortArray10[local169];
					arg0.aShortArray9[local169] = this.aShortArray9[local169];
					arg0.aShortArray11[local169] = this.aShortArray11[local169];
				}
			} else {
				if (arg1.aClass190_1 == null) {
					arg1.aClass190_1 = new Class190();
				}
				@Pc(470) Class190 local470 = arg0.aClass190_1 = arg1.aClass190_1;
				if (local470.aShortArray85 == null || local470.aShortArray85.length < this.anInt370) {
					local482 = this.anInt370;
					local470.aShortArray85 = new short[local482];
					local470.aShortArray84 = new short[local482];
					local470.aShortArray83 = new short[local482];
					local470.aByteArray59 = new byte[local482];
				}
				for (local482 = 0; local482 < this.anInt370; local482++) {
					arg0.aShortArray10[local482] = this.aShortArray10[local482];
					arg0.aShortArray9[local482] = this.aShortArray9[local482];
					arg0.aShortArray11[local482] = this.aShortArray11[local482];
					local470.aShortArray85[local482] = this.aClass190_1.aShortArray85[local482];
					local470.aShortArray84[local482] = this.aClass190_1.aShortArray84[local482];
					local470.aShortArray83[local482] = this.aClass190_1.aShortArray83[local482];
					local470.aByteArray59[local482] = this.aClass190_1.aByteArray59[local482];
				}
			}
			arg0.aByteArray9 = this.aByteArray9;
		} else {
			arg0.aClass190_1 = this.aClass190_1;
			arg0.aShortArray10 = this.aShortArray10;
			arg0.aShortArray9 = this.aShortArray9;
			arg0.aShortArray11 = this.aShortArray11;
			arg0.aByteArray9 = this.aByteArray9;
		}
		if (Class170.method24473(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x4);
			}
			arg0.aClass172_2 = arg1.aClass172_2;
			arg0.aClass172_2.aByte107 = this.aClass172_2.aByte107;
			arg0.aClass172_2.anInterface14_6 = this.aClass172_2.anInterface14_6;
		} else if (Class170.method24462(arg2, this.anInt378)) {
			arg0.aClass172_2 = this.aClass172_2;
		} else {
			arg0.aClass172_2 = null;
		}
		if (Class170.method24445(arg2, this.anInt378)) {
			if (arg1.aFloatArray6 == null || arg1.aFloatArray6.length < this.anInt371) {
				local169 = this.anInt370;
				arg0.aFloatArray6 = arg1.aFloatArray6 = new float[local169];
				arg0.aFloatArray7 = arg1.aFloatArray7 = new float[local169];
			} else {
				arg0.aFloatArray6 = arg1.aFloatArray6;
				arg0.aFloatArray7 = arg1.aFloatArray7;
			}
			for (local169 = 0; local169 < this.anInt370; local169++) {
				arg0.aFloatArray6[local169] = this.aFloatArray6[local169];
				arg0.aFloatArray7[local169] = this.aFloatArray7[local169];
			}
		} else {
			arg0.aFloatArray6 = this.aFloatArray6;
			arg0.aFloatArray7 = this.aFloatArray7;
		}
		if (Class170.method24481(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x8);
			}
			arg0.aClass172_4 = arg1.aClass172_4;
			arg0.aClass172_4.aByte107 = this.aClass172_4.aByte107;
			arg0.aClass172_4.anInterface14_6 = this.aClass172_4.anInterface14_6;
		} else if (Class170.method24465(arg2, this.anInt378)) {
			arg0.aClass172_4 = this.aClass172_4;
		} else {
			arg0.aClass172_4 = null;
		}
		if (Class170.method24447(arg2, this.anInt378)) {
			if (arg1.aShortArray14 == null || arg1.aShortArray14.length < this.anInt371) {
				local169 = this.anInt371;
				arg0.aShortArray14 = arg1.aShortArray14 = new short[local169];
				arg0.aShortArray8 = arg1.aShortArray8 = new short[local169];
				arg0.aShortArray15 = arg1.aShortArray15 = new short[local169];
			} else {
				arg0.aShortArray14 = arg1.aShortArray14;
				arg0.aShortArray8 = arg1.aShortArray8;
				arg0.aShortArray15 = arg1.aShortArray15;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray14[local169] = this.aShortArray14[local169];
				arg0.aShortArray8[local169] = this.aShortArray8[local169];
				arg0.aShortArray15[local169] = this.aShortArray15[local169];
			}
		} else {
			arg0.aShortArray14 = this.aShortArray14;
			arg0.aShortArray8 = this.aShortArray8;
			arg0.aShortArray15 = this.aShortArray15;
		}
		if (Class170.method24484(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x10);
			}
			arg0.aClass175_1 = arg1.aClass175_1;
			arg0.aClass175_1.anInterface15_4 = this.aClass175_1.anInterface15_4;
		} else if (Class170.method24468(arg2, this.anInt378)) {
			arg0.aClass175_1 = this.aClass175_1;
		} else {
			arg0.aClass175_1 = null;
		}
		if (Class170.method24449(arg2, this.anInt378)) {
			if (arg1.aShortArray16 == null || arg1.aShortArray16.length < this.anInt371) {
				local169 = this.anInt371;
				arg0.aShortArray16 = arg1.aShortArray16 = new short[local169];
			} else {
				arg0.aShortArray16 = arg1.aShortArray16;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray16[local169] = this.aShortArray16[local169];
			}
		} else {
			arg0.aShortArray16 = this.aShortArray16;
		}
		if (!Class170.method24451(arg2, this.anInt378)) {
			arg0.aClass176Array1 = this.aClass176Array1;
		} else if (arg1.aClass176Array1 == null || arg1.aClass176Array1.length < this.anInt377) {
			local169 = this.anInt377;
			arg0.aClass176Array1 = arg1.aClass176Array1 = new Class176[local169];
			for (local482 = 0; local482 < this.anInt377; local482++) {
				arg0.aClass176Array1[local482] = this.aClass176Array1[local482].method24553();
			}
		} else {
			arg0.aClass176Array1 = arg1.aClass176Array1;
			for (local169 = 0; local169 < this.anInt377; local169++) {
				arg0.aClass176Array1[local169].method24556(this.aClass176Array1[local169]);
			}
		}
		arg0.aClass189Array1 = this.aClass189Array1;
		if (this.aBoolean60) {
			arg0.anInt375 = this.anInt375;
			arg0.anInt362 = this.anInt362;
			arg0.aShort1 = this.aShort1;
			arg0.aShort6 = this.aShort6;
			arg0.aShort4 = this.aShort4;
			arg0.aShort5 = this.aShort5;
			arg0.aShort7 = this.aShort7;
			arg0.aShort8 = this.aShort8;
			arg0.aBoolean60 = true;
		} else {
			arg0.aBoolean60 = false;
		}
		if (this.aBoolean59) {
			arg0.aShort9 = this.aShort9;
			arg0.aBoolean59 = true;
		} else {
			arg0.aBoolean59 = false;
		}
		arg0.anIntArrayArray1 = this.anIntArrayArray1;
		arg0.anIntArrayArray2 = this.anIntArrayArray2;
		arg0.anIntArrayArray3 = this.anIntArrayArray3;
		arg0.aShortArray18 = this.aShortArray18;
		arg0.anIntArray33 = this.anIntArray33;
		arg0.aShortArray12 = this.aShortArray12;
		arg0.aShortArray17 = this.aShortArray17;
		arg0.anIntArray32 = this.anIntArray32;
		arg0.aClass205Array1 = this.aClass205Array1;
		arg0.aClass195Array1 = this.aClass195Array1;
		return arg0;
	}

	@OriginalMember(owner = "client!aeb", name = "ix", descriptor = "(Lclient!aeb;Lclient!aeb;IZZ)Lclient!dv;", line = 717)
	Class84 method2692(@OriginalArg(0) Class84_Sub1 arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		arg0.aByte3 = 0;
		arg0.anInt366 = arg2;
		arg0.anInt378 = this.anInt378;
		arg0.aShort2 = this.aShort2;
		arg0.aShort3 = this.aShort3;
		arg0.anInt368 = this.anInt368;
		arg0.anInt373 = this.anInt373;
		arg0.anInt370 = this.anInt370;
		arg0.anInt371 = this.anInt371;
		arg0.anInt372 = this.anInt372;
		arg0.anInt377 = this.anInt377;
		if ((arg2 & 0x100) == 0) {
			arg0.aBoolean57 = this.aBoolean57;
		} else {
			arg0.aBoolean57 = true;
		}
		arg0.aBoolean58 = this.aBoolean58;
		@Pc(62) boolean local62 = Class170.method24420(arg2, this.anInt378);
		@Pc(67) boolean local67 = Class170.method24422(arg2, this.anInt378);
		@Pc(72) boolean local72 = Class170.method24428(arg2, this.anInt378);
		@Pc(78) boolean local78 = local62 | local67 | local72;
		@Pc(169) int local169;
		if (local78) {
			if (!local62) {
				arg0.anIntArray29 = this.anIntArray29;
			} else if (arg1.anIntArray29 == null || arg1.anIntArray29.length < this.anInt368) {
				arg0.anIntArray29 = arg1.anIntArray29 = new int[this.anInt368];
			} else {
				arg0.anIntArray29 = arg1.anIntArray29;
			}
			if (!local67) {
				arg0.anIntArray31 = this.anIntArray31;
			} else if (arg1.anIntArray31 == null || arg1.anIntArray31.length < this.anInt368) {
				arg0.anIntArray31 = arg1.anIntArray31 = new int[this.anInt368];
			} else {
				arg0.anIntArray31 = arg1.anIntArray31;
			}
			if (!local72) {
				arg0.anIntArray30 = this.anIntArray30;
			} else if (arg1.anIntArray30 == null || arg1.anIntArray30.length < this.anInt368) {
				arg0.anIntArray30 = arg1.anIntArray30 = new int[this.anInt368];
			} else {
				arg0.anIntArray30 = arg1.anIntArray30;
			}
			for (local169 = 0; local169 < this.anInt368; local169++) {
				if (local62) {
					arg0.anIntArray29[local169] = this.anIntArray29[local169];
				}
				if (local67) {
					arg0.anIntArray31[local169] = this.anIntArray31[local169];
				}
				if (local72) {
					arg0.anIntArray30[local169] = this.anIntArray30[local169];
				}
			}
		} else {
			arg0.anIntArray29 = this.anIntArray29;
			arg0.anIntArray31 = this.anIntArray31;
			arg0.anIntArray30 = this.anIntArray30;
		}
		if (Class170.method24470(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x1);
			}
			arg0.aClass172_1 = arg1.aClass172_1;
			arg0.aClass172_1.aByte107 = this.aClass172_1.aByte107;
			arg0.aClass172_1.anInterface14_6 = this.aClass172_1.anInterface14_6;
		} else if (Class170.method24458(arg2, this.anInt378)) {
			arg0.aClass172_1 = this.aClass172_1;
		} else {
			arg0.aClass172_1 = null;
		}
		if (Class170.method24438(arg2, this.anInt378)) {
			if (arg1.aShortArray13 == null || arg1.aShortArray13.length < this.anInt371) {
				arg0.aShortArray13 = arg1.aShortArray13 = new short[this.anInt371];
			} else {
				arg0.aShortArray13 = arg1.aShortArray13;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray13[local169] = this.aShortArray13[local169];
			}
		} else {
			arg0.aShortArray13 = this.aShortArray13;
		}
		if (Class170.method24441(arg2, this.anInt378)) {
			if (arg1.aByteArray10 == null || arg1.aByteArray10.length < this.anInt371) {
				arg0.aByteArray10 = arg1.aByteArray10 = new byte[this.anInt371];
			} else {
				arg0.aByteArray10 = arg1.aByteArray10;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aByteArray10[local169] = this.aByteArray10[local169];
			}
		} else {
			arg0.aByteArray10 = this.aByteArray10;
		}
		if (Class170.method24476(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x2);
			}
			arg0.aClass172_3 = arg1.aClass172_3;
			arg0.aClass172_3.aByte107 = this.aClass172_3.aByte107;
			arg0.aClass172_3.anInterface14_6 = this.aClass172_3.anInterface14_6;
		} else if (Class170.method24464(arg2, this.anInt378)) {
			arg0.aClass172_3 = this.aClass172_3;
		} else {
			arg0.aClass172_3 = null;
		}
		@Pc(482) int local482;
		if (Class170.method24437(arg2, this.anInt378)) {
			if (arg1.aShortArray10 == null || arg1.aShortArray10.length < this.anInt370) {
				local169 = this.anInt370;
				arg0.aShortArray10 = arg1.aShortArray10 = new short[local169];
				arg0.aShortArray9 = arg1.aShortArray9 = new short[local169];
				arg0.aShortArray11 = arg1.aShortArray11 = new short[local169];
			} else {
				arg0.aShortArray10 = arg1.aShortArray10;
				arg0.aShortArray9 = arg1.aShortArray9;
				arg0.aShortArray11 = arg1.aShortArray11;
			}
			if (this.aClass190_1 == null) {
				for (local169 = 0; local169 < this.anInt370; local169++) {
					arg0.aShortArray10[local169] = this.aShortArray10[local169];
					arg0.aShortArray9[local169] = this.aShortArray9[local169];
					arg0.aShortArray11[local169] = this.aShortArray11[local169];
				}
			} else {
				if (arg1.aClass190_1 == null) {
					arg1.aClass190_1 = new Class190();
				}
				@Pc(470) Class190 local470 = arg0.aClass190_1 = arg1.aClass190_1;
				if (local470.aShortArray85 == null || local470.aShortArray85.length < this.anInt370) {
					local482 = this.anInt370;
					local470.aShortArray85 = new short[local482];
					local470.aShortArray84 = new short[local482];
					local470.aShortArray83 = new short[local482];
					local470.aByteArray59 = new byte[local482];
				}
				for (local482 = 0; local482 < this.anInt370; local482++) {
					arg0.aShortArray10[local482] = this.aShortArray10[local482];
					arg0.aShortArray9[local482] = this.aShortArray9[local482];
					arg0.aShortArray11[local482] = this.aShortArray11[local482];
					local470.aShortArray85[local482] = this.aClass190_1.aShortArray85[local482];
					local470.aShortArray84[local482] = this.aClass190_1.aShortArray84[local482];
					local470.aShortArray83[local482] = this.aClass190_1.aShortArray83[local482];
					local470.aByteArray59[local482] = this.aClass190_1.aByteArray59[local482];
				}
			}
			arg0.aByteArray9 = this.aByteArray9;
		} else {
			arg0.aClass190_1 = this.aClass190_1;
			arg0.aShortArray10 = this.aShortArray10;
			arg0.aShortArray9 = this.aShortArray9;
			arg0.aShortArray11 = this.aShortArray11;
			arg0.aByteArray9 = this.aByteArray9;
		}
		if (Class170.method24473(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x4);
			}
			arg0.aClass172_2 = arg1.aClass172_2;
			arg0.aClass172_2.aByte107 = this.aClass172_2.aByte107;
			arg0.aClass172_2.anInterface14_6 = this.aClass172_2.anInterface14_6;
		} else if (Class170.method24462(arg2, this.anInt378)) {
			arg0.aClass172_2 = this.aClass172_2;
		} else {
			arg0.aClass172_2 = null;
		}
		if (Class170.method24445(arg2, this.anInt378)) {
			if (arg1.aFloatArray6 == null || arg1.aFloatArray6.length < this.anInt371) {
				local169 = this.anInt370;
				arg0.aFloatArray6 = arg1.aFloatArray6 = new float[local169];
				arg0.aFloatArray7 = arg1.aFloatArray7 = new float[local169];
			} else {
				arg0.aFloatArray6 = arg1.aFloatArray6;
				arg0.aFloatArray7 = arg1.aFloatArray7;
			}
			for (local169 = 0; local169 < this.anInt370; local169++) {
				arg0.aFloatArray6[local169] = this.aFloatArray6[local169];
				arg0.aFloatArray7[local169] = this.aFloatArray7[local169];
			}
		} else {
			arg0.aFloatArray6 = this.aFloatArray6;
			arg0.aFloatArray7 = this.aFloatArray7;
		}
		if (Class170.method24481(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x8);
			}
			arg0.aClass172_4 = arg1.aClass172_4;
			arg0.aClass172_4.aByte107 = this.aClass172_4.aByte107;
			arg0.aClass172_4.anInterface14_6 = this.aClass172_4.anInterface14_6;
		} else if (Class170.method24465(arg2, this.anInt378)) {
			arg0.aClass172_4 = this.aClass172_4;
		} else {
			arg0.aClass172_4 = null;
		}
		if (Class170.method24447(arg2, this.anInt378)) {
			if (arg1.aShortArray14 == null || arg1.aShortArray14.length < this.anInt371) {
				local169 = this.anInt371;
				arg0.aShortArray14 = arg1.aShortArray14 = new short[local169];
				arg0.aShortArray8 = arg1.aShortArray8 = new short[local169];
				arg0.aShortArray15 = arg1.aShortArray15 = new short[local169];
			} else {
				arg0.aShortArray14 = arg1.aShortArray14;
				arg0.aShortArray8 = arg1.aShortArray8;
				arg0.aShortArray15 = arg1.aShortArray15;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray14[local169] = this.aShortArray14[local169];
				arg0.aShortArray8[local169] = this.aShortArray8[local169];
				arg0.aShortArray15[local169] = this.aShortArray15[local169];
			}
		} else {
			arg0.aShortArray14 = this.aShortArray14;
			arg0.aShortArray8 = this.aShortArray8;
			arg0.aShortArray15 = this.aShortArray15;
		}
		if (Class170.method24484(arg2, this.anInt378)) {
			if (arg3) {
				arg0.aByte3 = (byte) (arg0.aByte3 | 0x10);
			}
			arg0.aClass175_1 = arg1.aClass175_1;
			arg0.aClass175_1.anInterface15_4 = this.aClass175_1.anInterface15_4;
		} else if (Class170.method24468(arg2, this.anInt378)) {
			arg0.aClass175_1 = this.aClass175_1;
		} else {
			arg0.aClass175_1 = null;
		}
		if (Class170.method24449(arg2, this.anInt378)) {
			if (arg1.aShortArray16 == null || arg1.aShortArray16.length < this.anInt371) {
				local169 = this.anInt371;
				arg0.aShortArray16 = arg1.aShortArray16 = new short[local169];
			} else {
				arg0.aShortArray16 = arg1.aShortArray16;
			}
			for (local169 = 0; local169 < this.anInt371; local169++) {
				arg0.aShortArray16[local169] = this.aShortArray16[local169];
			}
		} else {
			arg0.aShortArray16 = this.aShortArray16;
		}
		if (!Class170.method24451(arg2, this.anInt378)) {
			arg0.aClass176Array1 = this.aClass176Array1;
		} else if (arg1.aClass176Array1 == null || arg1.aClass176Array1.length < this.anInt377) {
			local169 = this.anInt377;
			arg0.aClass176Array1 = arg1.aClass176Array1 = new Class176[local169];
			for (local482 = 0; local482 < this.anInt377; local482++) {
				arg0.aClass176Array1[local482] = this.aClass176Array1[local482].method24553();
			}
		} else {
			arg0.aClass176Array1 = arg1.aClass176Array1;
			for (local169 = 0; local169 < this.anInt377; local169++) {
				arg0.aClass176Array1[local169].method24556(this.aClass176Array1[local169]);
			}
		}
		arg0.aClass189Array1 = this.aClass189Array1;
		if (this.aBoolean60) {
			arg0.anInt375 = this.anInt375;
			arg0.anInt362 = this.anInt362;
			arg0.aShort1 = this.aShort1;
			arg0.aShort6 = this.aShort6;
			arg0.aShort4 = this.aShort4;
			arg0.aShort5 = this.aShort5;
			arg0.aShort7 = this.aShort7;
			arg0.aShort8 = this.aShort8;
			arg0.aBoolean60 = true;
		} else {
			arg0.aBoolean60 = false;
		}
		if (this.aBoolean59) {
			arg0.aShort9 = this.aShort9;
			arg0.aBoolean59 = true;
		} else {
			arg0.aBoolean59 = false;
		}
		arg0.anIntArrayArray1 = this.anIntArrayArray1;
		arg0.anIntArrayArray2 = this.anIntArrayArray2;
		arg0.anIntArrayArray3 = this.anIntArrayArray3;
		arg0.aShortArray18 = this.aShortArray18;
		arg0.anIntArray33 = this.anIntArray33;
		arg0.aShortArray12 = this.aShortArray12;
		arg0.aShortArray17 = this.aShortArray17;
		arg0.anIntArray32 = this.anIntArray32;
		arg0.aClass205Array1 = this.aClass205Array1;
		arg0.aClass195Array1 = this.aClass195Array1;
		return arg0;
	}

	@OriginalMember(owner = "client!aeb", name = "hy", descriptor = "()V", line = 982)
	void method2693() {
		if (!this.aBoolean61) {
			return;
		}
		this.aBoolean61 = false;
		if (this.aClass205Array1 == null && this.aClass195Array1 == null && this.aClass189Array1 == null && !Class170.method24435(this.anInt366, this.anInt378)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray29 != null && !Class170.method24487(this.anInt366, this.anInt378)) {
				if (this.aClass172_1 != null && this.aClass172_1.anInterface14_6 == null) {
					this.aBoolean61 = true;
				} else {
					if (!this.aBoolean60) {
						this.method2695();
					}
					local23 = true;
				}
			}
			if (this.anIntArray31 != null && !Class170.method24490(this.anInt366, this.anInt378)) {
				if (this.aClass172_1 != null && this.aClass172_1.anInterface14_6 == null) {
					this.aBoolean61 = true;
				} else {
					if (!this.aBoolean60) {
						this.method2695();
					}
					local25 = true;
				}
			}
			if (this.anIntArray30 != null && !Class170.method24492(this.anInt366, this.anInt378)) {
				if (this.aClass172_1 != null && this.aClass172_1.anInterface14_6 == null) {
					this.aBoolean61 = true;
				} else {
					if (!this.aBoolean60) {
						this.method2695();
					}
					local27 = true;
				}
			}
			if (local23) {
				this.anIntArray29 = null;
			}
			if (local25) {
				this.anIntArray31 = null;
			}
			if (local27) {
				this.anIntArray30 = null;
			}
		}
		if (this.aShortArray18 != null && this.anIntArray29 == null && this.anIntArray31 == null && this.anIntArray30 == null) {
			this.aShortArray18 = null;
			this.anIntArray33 = null;
		}
		if (this.aByteArray9 != null && !Class170.method24495(this.anInt366, this.anInt378)) {
			if (this.aClass172_2 == null) {
				if (this.aClass172_3 != null && this.aClass172_3.anInterface14_6 == null) {
					this.aBoolean61 = true;
				} else {
					this.aShortArray11 = null;
					this.aShortArray9 = null;
					this.aShortArray10 = null;
					this.aByteArray9 = null;
				}
			} else if (this.aClass172_2.anInterface14_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aShortArray11 = null;
				this.aShortArray9 = null;
				this.aShortArray10 = null;
				this.aByteArray9 = null;
			}
		}
		if (this.aShortArray13 != null && !Class170.method24497(this.anInt366, this.anInt378)) {
			if (this.aClass172_3 != null && this.aClass172_3.anInterface14_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aShortArray13 = null;
			}
		}
		if (this.aByteArray10 != null && !Class170.method24501(this.anInt366, this.anInt378)) {
			if (this.aClass172_3 != null && this.aClass172_3.anInterface14_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aByteArray10 = null;
			}
		}
		if (this.aFloatArray6 != null && !Class170.method24505(this.anInt366, this.anInt378)) {
			if (this.aClass172_4 != null && this.aClass172_4.anInterface14_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aFloatArray7 = null;
				this.aFloatArray6 = null;
			}
		}
		if (this.aShortArray16 != null && !Class170.method24522(this.anInt366, this.anInt378)) {
			if (this.aClass172_3 != null && this.aClass172_3.anInterface14_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aShortArray16 = null;
			}
		}
		if (this.aShortArray14 != null && !Class170.method24518(this.anInt366, this.anInt378)) {
			if (this.aClass175_1 != null && this.aClass175_1.anInterface15_4 == null || this.aClass172_3 != null && this.aClass172_3.anInterface14_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aShortArray15 = null;
				this.aShortArray8 = null;
				this.aShortArray14 = null;
			}
		}
		if (this.anIntArrayArray2 != null && !Class170.method24510(this.anInt366, this.anInt378)) {
			this.anIntArrayArray2 = null;
			this.aShortArray17 = null;
		}
		if (this.anIntArrayArray1 != null && !Class170.method24513(this.anInt366, this.anInt378)) {
			this.anIntArrayArray1 = null;
			this.aShortArray12 = null;
		}
		if (this.anIntArrayArray3 != null && !Class170.method24514(this.anInt366, this.anInt378)) {
			this.anIntArrayArray3 = null;
		}
		if (this.anIntArray32 != null && (this.anInt366 & 0x800) == 0 && (this.anInt366 & 0x40000) == 0) {
			this.anIntArray32 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ia", descriptor = "()V", line = 982)
	void method2694() {
		if (!this.aBoolean61) {
			return;
		}
		this.aBoolean61 = false;
		if (this.aClass205Array1 == null && this.aClass195Array1 == null && this.aClass189Array1 == null && !Class170.method24435(this.anInt366, this.anInt378)) {
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(27) boolean local27 = false;
			if (this.anIntArray29 != null && !Class170.method24487(this.anInt366, this.anInt378)) {
				if (this.aClass172_1 != null && this.aClass172_1.anInterface14_6 == null) {
					this.aBoolean61 = true;
				} else {
					if (!this.aBoolean60) {
						this.method2695();
					}
					local23 = true;
				}
			}
			if (this.anIntArray31 != null && !Class170.method24490(this.anInt366, this.anInt378)) {
				if (this.aClass172_1 != null && this.aClass172_1.anInterface14_6 == null) {
					this.aBoolean61 = true;
				} else {
					if (!this.aBoolean60) {
						this.method2695();
					}
					local25 = true;
				}
			}
			if (this.anIntArray30 != null && !Class170.method24492(this.anInt366, this.anInt378)) {
				if (this.aClass172_1 != null && this.aClass172_1.anInterface14_6 == null) {
					this.aBoolean61 = true;
				} else {
					if (!this.aBoolean60) {
						this.method2695();
					}
					local27 = true;
				}
			}
			if (local23) {
				this.anIntArray29 = null;
			}
			if (local25) {
				this.anIntArray31 = null;
			}
			if (local27) {
				this.anIntArray30 = null;
			}
		}
		if (this.aShortArray18 != null && this.anIntArray29 == null && this.anIntArray31 == null && this.anIntArray30 == null) {
			this.aShortArray18 = null;
			this.anIntArray33 = null;
		}
		if (this.aByteArray9 != null && !Class170.method24495(this.anInt366, this.anInt378)) {
			if (this.aClass172_2 == null) {
				if (this.aClass172_3 != null && this.aClass172_3.anInterface14_6 == null) {
					this.aBoolean61 = true;
				} else {
					this.aShortArray11 = null;
					this.aShortArray9 = null;
					this.aShortArray10 = null;
					this.aByteArray9 = null;
				}
			} else if (this.aClass172_2.anInterface14_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aShortArray11 = null;
				this.aShortArray9 = null;
				this.aShortArray10 = null;
				this.aByteArray9 = null;
			}
		}
		if (this.aShortArray13 != null && !Class170.method24497(this.anInt366, this.anInt378)) {
			if (this.aClass172_3 != null && this.aClass172_3.anInterface14_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aShortArray13 = null;
			}
		}
		if (this.aByteArray10 != null && !Class170.method24501(this.anInt366, this.anInt378)) {
			if (this.aClass172_3 != null && this.aClass172_3.anInterface14_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aByteArray10 = null;
			}
		}
		if (this.aFloatArray6 != null && !Class170.method24505(this.anInt366, this.anInt378)) {
			if (this.aClass172_4 != null && this.aClass172_4.anInterface14_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aFloatArray7 = null;
				this.aFloatArray6 = null;
			}
		}
		if (this.aShortArray16 != null && !Class170.method24522(this.anInt366, this.anInt378)) {
			if (this.aClass172_3 != null && this.aClass172_3.anInterface14_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aShortArray16 = null;
			}
		}
		if (this.aShortArray14 != null && !Class170.method24518(this.anInt366, this.anInt378)) {
			if (this.aClass175_1 != null && this.aClass175_1.anInterface15_4 == null || this.aClass172_3 != null && this.aClass172_3.anInterface14_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aShortArray15 = null;
				this.aShortArray8 = null;
				this.aShortArray14 = null;
			}
		}
		if (this.anIntArrayArray2 != null && !Class170.method24510(this.anInt366, this.anInt378)) {
			this.anIntArrayArray2 = null;
			this.aShortArray17 = null;
		}
		if (this.anIntArrayArray1 != null && !Class170.method24513(this.anInt366, this.anInt378)) {
			this.anIntArrayArray1 = null;
			this.aShortArray12 = null;
		}
		if (this.anIntArrayArray3 != null && !Class170.method24514(this.anInt366, this.anInt378)) {
			this.anIntArrayArray3 = null;
		}
		if (this.anIntArray32 != null && (this.anInt366 & 0x800) == 0 && (this.anInt366 & 0x40000) == 0) {
			this.anIntArray32 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "s", descriptor = "(I)V", line = 1083)
	@Override
	public void method6797(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt373; local9++) {
			@Pc(29) int local29 = this.anIntArray30[local9] * local3 + this.anIntArray29[local9] * local7 >> 14;
			this.anIntArray30[local9] = this.anIntArray30[local9] * local7 - this.anIntArray29[local9] * local3 >> 14;
			this.anIntArray29[local9] = local29;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "br", descriptor = "(I)V", line = 1083)
	@Override
	public void method6857(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt373; local9++) {
			@Pc(29) int local29 = this.anIntArray30[local9] * local3 + this.anIntArray29[local9] * local7 >> 14;
			this.anIntArray30[local9] = this.anIntArray30[local9] * local7 - this.anIntArray29[local9] * local3 >> 14;
			this.anIntArray29[local9] = local29;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "r", descriptor = "(I)V", line = 1095)
	@Override
	public void method6798(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt373; local9++) {
			local29 = this.anIntArray30[local9] * local3 + this.anIntArray29[local9] * local7 >> 14;
			this.anIntArray30[local9] = this.anIntArray30[local9] * local7 - this.anIntArray29[local9] * local3 >> 14;
			this.anIntArray29[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt370; local9++) {
			local29 = this.aShortArray11[local9] * local3 + this.aShortArray10[local9] * local7 >> 14;
			this.aShortArray11[local9] = (short) (this.aShortArray11[local9] * local7 - this.aShortArray10[local9] * local3 >> 14);
			this.aShortArray10[local9] = (short) local29;
		}
		if (this.aClass172_2 == null && this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
		if (this.aClass172_2 != null) {
			this.aClass172_2.anInterface14_6 = null;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "fd", descriptor = "(I)V", line = 1095)
	@Override
	public void method6853(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt373; local9++) {
			local29 = this.anIntArray30[local9] * local3 + this.anIntArray29[local9] * local7 >> 14;
			this.anIntArray30[local9] = this.anIntArray30[local9] * local7 - this.anIntArray29[local9] * local3 >> 14;
			this.anIntArray29[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt370; local9++) {
			local29 = this.aShortArray11[local9] * local3 + this.aShortArray10[local9] * local7 >> 14;
			this.aShortArray11[local9] = (short) (this.aShortArray11[local9] * local7 - this.aShortArray10[local9] * local3 >> 14);
			this.aShortArray10[local9] = (short) local29;
		}
		if (this.aClass172_2 == null && this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
		if (this.aClass172_2 != null) {
			this.aClass172_2.anInterface14_6 = null;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "fj", descriptor = "(I)V", line = 1095)
	@Override
	public void method6858(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt373; local9++) {
			local29 = this.anIntArray30[local9] * local3 + this.anIntArray29[local9] * local7 >> 14;
			this.anIntArray30[local9] = this.anIntArray30[local9] * local7 - this.anIntArray29[local9] * local3 >> 14;
			this.anIntArray29[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt370; local9++) {
			local29 = this.aShortArray11[local9] * local3 + this.aShortArray10[local9] * local7 >> 14;
			this.aShortArray11[local9] = (short) (this.aShortArray11[local9] * local7 - this.aShortArray10[local9] * local3 >> 14);
			this.aShortArray10[local9] = (short) local29;
		}
		if (this.aClass172_2 == null && this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
		if (this.aClass172_2 != null) {
			this.aClass172_2.anInterface14_6 = null;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "fh", descriptor = "(I)V", line = 1095)
	@Override
	public void method6947(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		@Pc(9) int local9;
		@Pc(29) int local29;
		for (local9 = 0; local9 < this.anInt373; local9++) {
			local29 = this.anIntArray30[local9] * local3 + this.anIntArray29[local9] * local7 >> 14;
			this.anIntArray30[local9] = this.anIntArray30[local9] * local7 - this.anIntArray29[local9] * local3 >> 14;
			this.anIntArray29[local9] = local29;
		}
		for (local9 = 0; local9 < this.anInt370; local9++) {
			local29 = this.aShortArray11[local9] * local3 + this.aShortArray10[local9] * local7 >> 14;
			this.aShortArray11[local9] = (short) (this.aShortArray11[local9] * local7 - this.aShortArray10[local9] * local3 >> 14);
			this.aShortArray10[local9] = (short) local29;
		}
		if (this.aClass172_2 == null && this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
		if (this.aClass172_2 != null) {
			this.aClass172_2.anInterface14_6 = null;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "g", descriptor = "(I)V", line = 1114)
	@Override
	public void method6799(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt373; local9++) {
			@Pc(29) int local29 = this.anIntArray31[local9] * local7 - this.anIntArray30[local9] * local3 >> 14;
			this.anIntArray30[local9] = this.anIntArray31[local9] * local3 + this.anIntArray30[local9] * local7 >> 14;
			this.anIntArray31[local9] = local29;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "be", descriptor = "(I)V", line = 1114)
	@Override
	public void method6949(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt373; local9++) {
			@Pc(29) int local29 = this.anIntArray31[local9] * local7 - this.anIntArray30[local9] * local3 >> 14;
			this.anIntArray30[local9] = this.anIntArray31[local9] * local3 + this.anIntArray30[local9] * local7 >> 14;
			this.anIntArray31[local9] = local29;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "bq", descriptor = "(I)V", line = 1114)
	@Override
	public void method6886(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt373; local9++) {
			@Pc(29) int local29 = this.anIntArray31[local9] * local7 - this.anIntArray30[local9] * local3 >> 14;
			this.anIntArray30[local9] = this.anIntArray31[local9] * local3 + this.anIntArray30[local9] * local7 >> 14;
			this.anIntArray31[local9] = local29;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "bh", descriptor = "(I)V", line = 1114)
	@Override
	public void method6859(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt373; local9++) {
			@Pc(29) int local29 = this.anIntArray31[local9] * local7 - this.anIntArray30[local9] * local3 >> 14;
			this.anIntArray30[local9] = this.anIntArray31[local9] * local3 + this.anIntArray30[local9] * local7 >> 14;
			this.anIntArray31[local9] = local29;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "z", descriptor = "(I)V", line = 1126)
	@Override
	public void method6800(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt373; local9++) {
			@Pc(29) int local29 = this.anIntArray31[local9] * local3 + this.anIntArray29[local9] * local7 >> 14;
			this.anIntArray31[local9] = this.anIntArray31[local9] * local7 - this.anIntArray29[local9] * local3 >> 14;
			this.anIntArray29[local9] = local29;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "cb", descriptor = "(I)V", line = 1126)
	@Override
	public void method6860(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt373; local9++) {
			@Pc(29) int local29 = this.anIntArray31[local9] * local3 + this.anIntArray29[local9] * local7 >> 14;
			this.anIntArray31[local9] = this.anIntArray31[local9] * local7 - this.anIntArray29[local9] * local3 >> 14;
			this.anIntArray29[local9] = local29;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "cg", descriptor = "(I)V", line = 1126)
	@Override
	public void method6861(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class436.anIntArray464[arg0];
		@Pc(7) int local7 = Class436.anIntArray463[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt373; local9++) {
			@Pc(29) int local29 = this.anIntArray31[local9] * local3 + this.anIntArray29[local9] * local7 >> 14;
			this.anIntArray31[local9] = this.anIntArray31[local9] * local7 - this.anIntArray29[local9] * local3 >> 14;
			this.anIntArray29[local9] = local29;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "j", descriptor = "(III)V", line = 1138)
	@Override
	public void method6872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt373; local1++) {
			if (arg0 != 0) {
				this.anIntArray29[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray31[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray30[local1] += arg2;
			}
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "fn", descriptor = "(III)V", line = 1138)
	@Override
	public void method6948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt373; local1++) {
			if (arg0 != 0) {
				this.anIntArray29[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray31[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray30[local1] += arg2;
			}
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "fg", descriptor = "(III)V", line = 1138)
	@Override
	public void method6923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt373; local1++) {
			if (arg0 != 0) {
				this.anIntArray29[local1] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray31[local1] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray30[local1] += arg2;
			}
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "cf", descriptor = "()V", line = 1148)
	@Override
	public void method6863() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt373; local1++) {
			this.anIntArray30[local1] = -this.anIntArray30[local1];
		}
		for (local1 = 0; local1 < this.anInt370; local1++) {
			this.aShortArray11[local1] = (short) -this.aShortArray11[local1];
		}
		for (local1 = 0; local1 < this.anInt371; local1++) {
			@Pc(45) short local45 = this.aShortArray14[local1];
			this.aShortArray14[local1] = this.aShortArray15[local1];
			this.aShortArray15[local1] = local45;
		}
		if (this.aClass172_2 == null && this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
		if (this.aClass172_2 != null) {
			this.aClass172_2.anInterface14_6 = null;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		if (this.aClass175_1 != null) {
			this.aClass175_1.anInterface15_4 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "cp", descriptor = "()V", line = 1148)
	@Override
	public void method6959() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt373; local1++) {
			this.anIntArray30[local1] = -this.anIntArray30[local1];
		}
		for (local1 = 0; local1 < this.anInt370; local1++) {
			this.aShortArray11[local1] = (short) -this.aShortArray11[local1];
		}
		for (local1 = 0; local1 < this.anInt371; local1++) {
			@Pc(45) short local45 = this.aShortArray14[local1];
			this.aShortArray14[local1] = this.aShortArray15[local1];
			this.aShortArray15[local1] = local45;
		}
		if (this.aClass172_2 == null && this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
		if (this.aClass172_2 != null) {
			this.aClass172_2.anInterface14_6 = null;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		if (this.aClass175_1 != null) {
			this.aClass175_1.anInterface15_4 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "cl", descriptor = "()V", line = 1148)
	@Override
	public void method6899() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt373; local1++) {
			this.anIntArray30[local1] = -this.anIntArray30[local1];
		}
		for (local1 = 0; local1 < this.anInt370; local1++) {
			this.aShortArray11[local1] = (short) -this.aShortArray11[local1];
		}
		for (local1 = 0; local1 < this.anInt371; local1++) {
			@Pc(45) short local45 = this.aShortArray14[local1];
			this.aShortArray14[local1] = this.aShortArray15[local1];
			this.aShortArray15[local1] = local45;
		}
		if (this.aClass172_2 == null && this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
		if (this.aClass172_2 != null) {
			this.aClass172_2.anInterface14_6 = null;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		if (this.aClass175_1 != null) {
			this.aClass175_1.anInterface15_4 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "cc", descriptor = "()V", line = 1148)
	@Override
	public void method6955() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt373; local1++) {
			this.anIntArray30[local1] = -this.anIntArray30[local1];
		}
		for (local1 = 0; local1 < this.anInt370; local1++) {
			this.aShortArray11[local1] = (short) -this.aShortArray11[local1];
		}
		for (local1 = 0; local1 < this.anInt371; local1++) {
			@Pc(45) short local45 = this.aShortArray14[local1];
			this.aShortArray14[local1] = this.aShortArray15[local1];
			this.aShortArray15[local1] = local45;
		}
		if (this.aClass172_2 == null && this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
		if (this.aClass172_2 != null) {
			this.aClass172_2.anInterface14_6 = null;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		if (this.aClass175_1 != null) {
			this.aClass175_1.anInterface15_4 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "i", descriptor = "()V", line = 1148)
	@Override
	public void method6802() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt373; local1++) {
			this.anIntArray30[local1] = -this.anIntArray30[local1];
		}
		for (local1 = 0; local1 < this.anInt370; local1++) {
			this.aShortArray11[local1] = (short) -this.aShortArray11[local1];
		}
		for (local1 = 0; local1 < this.anInt371; local1++) {
			@Pc(45) short local45 = this.aShortArray14[local1];
			this.aShortArray14[local1] = this.aShortArray15[local1];
			this.aShortArray15[local1] = local45;
		}
		if (this.aClass172_2 == null && this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
		if (this.aClass172_2 != null) {
			this.aClass172_2.anInterface14_6 = null;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		if (this.aClass175_1 != null) {
			this.aClass175_1.anInterface15_4 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "k", descriptor = "(III)V", line = 1163)
	@Override
	public void method6803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt373; local1++) {
			if (arg0 != 128) {
				this.anIntArray29[local1] = this.anIntArray29[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray31[local1] = this.anIntArray31[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray30[local1] = this.anIntArray30[local1] * arg2 >> 7;
			}
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "ck", descriptor = "(III)V", line = 1163)
	@Override
	public void method6807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt373; local1++) {
			if (arg0 != 128) {
				this.anIntArray29[local1] = this.anIntArray29[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray31[local1] = this.anIntArray31[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray30[local1] = this.anIntArray30[local1] * arg2 >> 7;
			}
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "cw", descriptor = "(III)V", line = 1163)
	@Override
	public void method6805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt373; local1++) {
			if (arg0 != 128) {
				this.anIntArray29[local1] = this.anIntArray29[local1] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray31[local1] = this.anIntArray31[local1] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray30[local1] = this.anIntArray30[local1] * arg2 >> 7;
			}
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "u", descriptor = "(IILclient!cj;Lclient!cj;III)V", line = 1173)
	@Override
	public void method6804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(9) int local9 = arg4 + this.aShort1;
		@Pc(14) int local14 = arg4 + this.aShort6;
		@Pc(19) int local19 = arg6 + this.aShort7;
		@Pc(24) int local24 = arg6 + this.aShort8;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt607 * -1924295585 || local19 < 0 || local24 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt606 * -1466328823)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt607 * -1924295585 || local19 < 0 || local24 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt606 * -1466328823) {
				return;
			}
		} else {
			local9 >>= arg2.anInt609 * -1495101509;
			local14 = local14 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			local19 >>= arg2.anInt609 * -1495101509;
			local24 = local24 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			if (arg2.method5500(local9, local19) == arg5 && arg2.method5500(local14, local19) == arg5 && arg2.method5500(local9, local24) == arg5 && arg2.method5500(local14, local24) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt373; local195++) {
				this.anIntArray31[local195] = this.anIntArray31[local195] + arg2.method5496(this.anIntArray29[local195] + arg4, this.anIntArray30[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(234) short local234 = this.aShort4;
				if (local234 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt373; local239++) {
					local252 = (this.anIntArray31[local239] << 16) / local234;
					if (local252 < arg1) {
						this.anIntArray31[local239] += (arg2.method5496(this.anIntArray29[local239] + arg4, this.anIntArray30[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 16;
					local239 = (arg1 >> 8 & 0xFF) * 16;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt607 * -1924295585 << arg2.anInt609 * -1495101509 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt606 * -1466328823 << arg2.anInt609 * -1495101509) {
						return;
					}
					this.method6767(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.aShort5 - this.aShort4;
					for (local239 = 0; local239 < this.anInt373; local239++) {
						this.anIntArray31[local239] = this.anIntArray31[local239] + (arg3.method5496(this.anIntArray29[local239] + arg4, this.anIntArray30[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort5 - this.aShort4;
					for (local239 = 0; local239 < this.anInt373; local239++) {
						local252 = this.anIntArray29[local239] + arg4;
						local323 = this.anIntArray30[local239] + arg6;
						@Pc(468) int local468 = arg2.method5496(local252, local323);
						@Pc(474) int local474 = arg3.method5496(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray31[local239] = ((this.anIntArray31[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "ch", descriptor = "(IILclient!cj;Lclient!cj;III)V", line = 1173)
	@Override
	public void method6867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(9) int local9 = arg4 + this.aShort1;
		@Pc(14) int local14 = arg4 + this.aShort6;
		@Pc(19) int local19 = arg6 + this.aShort7;
		@Pc(24) int local24 = arg6 + this.aShort8;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt607 * -1924295585 || local19 < 0 || local24 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt606 * -1466328823)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt607 * -1924295585 || local19 < 0 || local24 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt606 * -1466328823) {
				return;
			}
		} else {
			local9 >>= arg2.anInt609 * -1495101509;
			local14 = local14 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			local19 >>= arg2.anInt609 * -1495101509;
			local24 = local24 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			if (arg2.method5500(local9, local19) == arg5 && arg2.method5500(local14, local19) == arg5 && arg2.method5500(local9, local24) == arg5 && arg2.method5500(local14, local24) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt373; local195++) {
				this.anIntArray31[local195] = this.anIntArray31[local195] + arg2.method5496(this.anIntArray29[local195] + arg4, this.anIntArray30[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(234) short local234 = this.aShort4;
				if (local234 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt373; local239++) {
					local252 = (this.anIntArray31[local239] << 16) / local234;
					if (local252 < arg1) {
						this.anIntArray31[local239] += (arg2.method5496(this.anIntArray29[local239] + arg4, this.anIntArray30[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 16;
					local239 = (arg1 >> 8 & 0xFF) * 16;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt607 * -1924295585 << arg2.anInt609 * -1495101509 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt606 * -1466328823 << arg2.anInt609 * -1495101509) {
						return;
					}
					this.method6767(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.aShort5 - this.aShort4;
					for (local239 = 0; local239 < this.anInt373; local239++) {
						this.anIntArray31[local239] = this.anIntArray31[local239] + (arg3.method5496(this.anIntArray29[local239] + arg4, this.anIntArray30[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort5 - this.aShort4;
					for (local239 = 0; local239 < this.anInt373; local239++) {
						local252 = this.anIntArray29[local239] + arg4;
						local323 = this.anIntArray30[local239] + arg6;
						@Pc(468) int local468 = arg2.method5496(local252, local323);
						@Pc(474) int local474 = arg3.method5496(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray31[local239] = ((this.anIntArray31[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "cz", descriptor = "(IILclient!cj;Lclient!cj;III)V", line = 1173)
	@Override
	public void method6904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(9) int local9 = arg4 + this.aShort1;
		@Pc(14) int local14 = arg4 + this.aShort6;
		@Pc(19) int local19 = arg6 + this.aShort7;
		@Pc(24) int local24 = arg6 + this.aShort8;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt607 * -1924295585 || local19 < 0 || local24 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt606 * -1466328823)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt607 * -1924295585 || local19 < 0 || local24 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt606 * -1466328823) {
				return;
			}
		} else {
			local9 >>= arg2.anInt609 * -1495101509;
			local14 = local14 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			local19 >>= arg2.anInt609 * -1495101509;
			local24 = local24 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			if (arg2.method5500(local9, local19) == arg5 && arg2.method5500(local14, local19) == arg5 && arg2.method5500(local9, local24) == arg5 && arg2.method5500(local14, local24) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt373; local195++) {
				this.anIntArray31[local195] = this.anIntArray31[local195] + arg2.method5496(this.anIntArray29[local195] + arg4, this.anIntArray30[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(234) short local234 = this.aShort4;
				if (local234 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt373; local239++) {
					local252 = (this.anIntArray31[local239] << 16) / local234;
					if (local252 < arg1) {
						this.anIntArray31[local239] += (arg2.method5496(this.anIntArray29[local239] + arg4, this.anIntArray30[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 16;
					local239 = (arg1 >> 8 & 0xFF) * 16;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt607 * -1924295585 << arg2.anInt609 * -1495101509 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt606 * -1466328823 << arg2.anInt609 * -1495101509) {
						return;
					}
					this.method6767(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.aShort5 - this.aShort4;
					for (local239 = 0; local239 < this.anInt373; local239++) {
						this.anIntArray31[local239] = this.anIntArray31[local239] + (arg3.method5496(this.anIntArray29[local239] + arg4, this.anIntArray30[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort5 - this.aShort4;
					for (local239 = 0; local239 < this.anInt373; local239++) {
						local252 = this.anIntArray29[local239] + arg4;
						local323 = this.anIntArray30[local239] + arg6;
						@Pc(468) int local468 = arg2.method5496(local252, local323);
						@Pc(474) int local474 = arg3.method5496(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray31[local239] = ((this.anIntArray31[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "ca", descriptor = "(IILclient!cj;Lclient!cj;III)V", line = 1173)
	@Override
	public void method6868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(9) int local9 = arg4 + this.aShort1;
		@Pc(14) int local14 = arg4 + this.aShort6;
		@Pc(19) int local19 = arg6 + this.aShort7;
		@Pc(24) int local24 = arg6 + this.aShort8;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt607 * -1924295585 || local19 < 0 || local24 + arg2.anInt608 * 127780559 >> arg2.anInt609 * -1495101509 >= arg2.anInt606 * -1466328823)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local9 < 0 || local14 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt607 * -1924295585 || local19 < 0 || local24 + arg3.anInt608 * 127780559 >> arg3.anInt609 * -1495101509 >= arg3.anInt606 * -1466328823) {
				return;
			}
		} else {
			local9 >>= arg2.anInt609 * -1495101509;
			local14 = local14 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			local19 >>= arg2.anInt609 * -1495101509;
			local24 = local24 + (arg2.anInt608 * 127780559 - 1) >> arg2.anInt609 * -1495101509;
			if (arg2.method5500(local9, local19) == arg5 && arg2.method5500(local14, local19) == arg5 && arg2.method5500(local9, local24) == arg5 && arg2.method5500(local14, local24) == arg5) {
				return;
			}
		}
		@Pc(195) int local195;
		if (arg0 == 1) {
			for (local195 = 0; local195 < this.anInt373; local195++) {
				this.anIntArray31[local195] = this.anIntArray31[local195] + arg2.method5496(this.anIntArray29[local195] + arg4, this.anIntArray30[local195] + arg6) - arg5;
			}
		} else {
			@Pc(239) int local239;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(234) short local234 = this.aShort4;
				if (local234 == 0) {
					return;
				}
				for (local239 = 0; local239 < this.anInt373; local239++) {
					local252 = (this.anIntArray31[local239] << 16) / local234;
					if (local252 < arg1) {
						this.anIntArray31[local239] += (arg2.method5496(this.anIntArray29[local239] + arg4, this.anIntArray30[local239] + arg6) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(323) int local323;
				if (arg0 == 3) {
					local195 = (arg1 & 0xFF) * 16;
					local239 = (arg1 >> 8 & 0xFF) * 16;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local323 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local195 >> 1) < 0 || arg4 + (local195 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt607 * -1924295585 << arg2.anInt609 * -1495101509 || arg6 - (local239 >> 1) < 0 || arg6 + (local239 >> 1) + arg2.anInt608 * 127780559 >= arg2.anInt606 * -1466328823 << arg2.anInt609 * -1495101509) {
						return;
					}
					this.method6767(arg2, arg4, arg5, arg6, local195, local239, local252, local323);
				} else if (arg0 == 4) {
					local195 = this.aShort5 - this.aShort4;
					for (local239 = 0; local239 < this.anInt373; local239++) {
						this.anIntArray31[local239] = this.anIntArray31[local239] + (arg3.method5496(this.anIntArray29[local239] + arg4, this.anIntArray30[local239] + arg6) - arg5) + local195;
					}
				} else if (arg0 == 5) {
					local195 = this.aShort5 - this.aShort4;
					for (local239 = 0; local239 < this.anInt373; local239++) {
						local252 = this.anIntArray29[local239] + arg4;
						local323 = this.anIntArray30[local239] + arg6;
						@Pc(468) int local468 = arg2.method5496(local252, local323);
						@Pc(474) int local474 = arg3.method5496(local252, local323);
						@Pc(480) int local480 = local468 - local474 - arg1;
						this.anIntArray31[local239] = ((this.anIntArray31[local239] << 8) / local195 * local480 >> 8) - (arg5 - local468);
					}
				}
			}
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "hs", descriptor = "()V", line = 1237)
	void method2695() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt373; local17++) {
			@Pc(26) int local26 = this.anIntArray29[local17];
			@Pc(31) int local31 = this.anIntArray31[local17];
			@Pc(36) int local36 = this.anIntArray30[local17];
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
		this.aShort1 = (short) local1;
		this.aShort6 = (short) local7;
		this.aShort4 = (short) local3;
		this.aShort5 = (short) local9;
		this.aShort7 = (short) local5;
		this.aShort8 = (short) local11;
		this.anInt362 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt375 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean60 = true;
	}

	@OriginalMember(owner = "client!aeb", name = "ij", descriptor = "()V", line = 1237)
	void method2696() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt373; local17++) {
			@Pc(26) int local26 = this.anIntArray29[local17];
			@Pc(31) int local31 = this.anIntArray31[local17];
			@Pc(36) int local36 = this.anIntArray30[local17];
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
		this.aShort1 = (short) local1;
		this.aShort6 = (short) local7;
		this.aShort4 = (short) local3;
		this.aShort5 = (short) local9;
		this.aShort7 = (short) local5;
		this.aShort8 = (short) local11;
		this.anInt362 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt375 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean60 = true;
	}

	@OriginalMember(owner = "client!aeb", name = "ik", descriptor = "()V", line = 1237)
	void method2697() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt373; local17++) {
			@Pc(26) int local26 = this.anIntArray29[local17];
			@Pc(31) int local31 = this.anIntArray31[local17];
			@Pc(36) int local36 = this.anIntArray30[local17];
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
		this.aShort1 = (short) local1;
		this.aShort6 = (short) local7;
		this.aShort4 = (short) local3;
		this.aShort5 = (short) local9;
		this.aShort7 = (short) local5;
		this.aShort8 = (short) local11;
		this.anInt362 = (int) (Math.sqrt((double) local13) + 0.99D);
		this.anInt375 = (int) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean60 = true;
	}

	@OriginalMember(owner = "client!aeb", name = "di", descriptor = "()V", line = 1272)
	@Override
	public void method6891() {
		if (this.aBoolean59) {
			return;
		}
		if (!this.aBoolean60) {
			this.method2695();
		}
		this.aShort9 = this.aShort4;
		this.aBoolean59 = true;
	}

	@OriginalMember(owner = "client!aeb", name = "af", descriptor = "()V", line = 1272)
	@Override
	public void method6829() {
		if (this.aBoolean59) {
			return;
		}
		if (!this.aBoolean60) {
			this.method2695();
		}
		this.aShort9 = this.aShort4;
		this.aBoolean59 = true;
	}

	@OriginalMember(owner = "client!aeb", name = "ac", descriptor = "()I", line = 1280)
	@Override
	public int method6820() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.anInt362;
	}

	@OriginalMember(owner = "client!aeb", name = "dp", descriptor = "()I", line = 1280)
	@Override
	public int method6856() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.anInt362;
	}

	@OriginalMember(owner = "client!aeb", name = "dr", descriptor = "()I", line = 1280)
	@Override
	public int method6862() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.anInt362;
	}

	@OriginalMember(owner = "client!aeb", name = "de", descriptor = "()I", line = 1280)
	@Override
	public int method6894() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.anInt362;
	}

	@OriginalMember(owner = "client!aeb", name = "du", descriptor = "()I", line = 1280)
	@Override
	public int method6895() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.anInt362;
	}

	@OriginalMember(owner = "client!aeb", name = "dk", descriptor = "()I", line = 1280)
	@Override
	public int method6896() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.anInt362;
	}

	@OriginalMember(owner = "client!aeb", name = "ds", descriptor = "()I", line = 1280)
	@Override
	public int method6897() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.anInt362;
	}

	@OriginalMember(owner = "client!aeb", name = "df", descriptor = "()I", line = 1280)
	@Override
	public int method6898() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.anInt362;
	}

	@OriginalMember(owner = "client!aeb", name = "dx", descriptor = "()I", line = 1285)
	@Override
	public int method6827() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.anInt375;
	}

	@OriginalMember(owner = "client!aeb", name = "dc", descriptor = "()I", line = 1285)
	@Override
	public int method6901() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.anInt375;
	}

	@OriginalMember(owner = "client!aeb", name = "dl", descriptor = "()I", line = 1285)
	@Override
	public int method6902() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.anInt375;
	}

	@OriginalMember(owner = "client!aeb", name = "av", descriptor = "()I", line = 1285)
	@Override
	public int method6821() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.anInt375;
	}

	@OriginalMember(owner = "client!aeb", name = "db", descriptor = "()I", line = 1285)
	@Override
	public int method6793() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.anInt375;
	}

	@OriginalMember(owner = "client!aeb", name = "at", descriptor = "()I", line = 1290)
	@Override
	public int method6906() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort1;
	}

	@OriginalMember(owner = "client!aeb", name = "fa", descriptor = "()I", line = 1290)
	@Override
	public int method6864() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort1;
	}

	@OriginalMember(owner = "client!aeb", name = "ae", descriptor = "()I", line = 1295)
	@Override
	public int method6822() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!aeb", name = "dj", descriptor = "()I", line = 1295)
	@Override
	public int method6900() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!aeb", name = "dg", descriptor = "()I", line = 1295)
	@Override
	public int method6903() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!aeb", name = "dd", descriptor = "()I", line = 1295)
	@Override
	public int method6808() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!aeb", name = "eh", descriptor = "()I", line = 1300)
	@Override
	public int method6926() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort4;
	}

	@OriginalMember(owner = "client!aeb", name = "ej", descriptor = "()I", line = 1300)
	@Override
	public int method6842() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort4;
	}

	@OriginalMember(owner = "client!aeb", name = "ah", descriptor = "()I", line = 1300)
	@Override
	public int method6824() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort4;
	}

	@OriginalMember(owner = "client!aeb", name = "eq", descriptor = "()I", line = 1305)
	@Override
	public int method6831() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!aeb", name = "as", descriptor = "()I", line = 1305)
	@Override
	public int method6825() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!aeb", name = "eo", descriptor = "()I", line = 1305)
	@Override
	public int method6907() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!aeb", name = "ep", descriptor = "()I", line = 1305)
	@Override
	public int method6913() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!aeb", name = "es", descriptor = "()I", line = 1305)
	@Override
	public int method6910() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!aeb", name = "aq", descriptor = "()I", line = 1310)
	@Override
	public int method6826() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!aeb", name = "ed", descriptor = "()I", line = 1310)
	@Override
	public int method6960() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!aeb", name = "ei", descriptor = "()I", line = 1310)
	@Override
	public int method6911() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!aeb", name = "am", descriptor = "()I", line = 1315)
	@Override
	public int method6817() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!aeb", name = "ee", descriptor = "()I", line = 1315)
	@Override
	public int method6909() {
		if (!this.aBoolean60) {
			this.method2695();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!aeb", name = "ay", descriptor = "()I", line = 1320)
	@Override
	public int method6828() {
		if (!this.aBoolean59) {
			this.method6829();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!aeb", name = "en", descriptor = "()I", line = 1320)
	@Override
	public int method6914() {
		if (!this.aBoolean59) {
			this.method6829();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!aeb", name = "ex", descriptor = "()I", line = 1320)
	@Override
	public int method6915() {
		if (!this.aBoolean59) {
			this.method6829();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!aeb", name = "bi", descriptor = "(Lclient!dv;IIIZ)V", line = 1325)
	@Override
	public void method6845(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class84_Sub1 local2 = (Class84_Sub1) arg0;
		if (this.anInt371 == 0 || local2.anInt371 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt373;
		@Pc(15) int[] local15 = local2.anIntArray29;
		@Pc(18) int[] local18 = local2.anIntArray31;
		@Pc(21) int[] local21 = local2.anIntArray30;
		@Pc(24) short[] local24 = local2.aShortArray10;
		@Pc(27) short[] local27 = local2.aShortArray9;
		@Pc(30) short[] local30 = local2.aShortArray11;
		@Pc(33) byte[] local33 = local2.aByteArray9;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass190_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass190_1.aShortArray85;
			local44 = this.aClass190_1.aShortArray84;
			local48 = this.aClass190_1.aShortArray83;
			local52 = this.aClass190_1.aByteArray59;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass190_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass190_1.aShortArray85;
			local72 = local2.aClass190_1.aShortArray84;
			local76 = local2.aClass190_1.aShortArray83;
			local80 = local2.aClass190_1.aByteArray59;
		}
		@Pc(92) int[] local92 = local2.anIntArray33;
		@Pc(95) short[] local95 = local2.aShortArray18;
		if (!local2.aBoolean60) {
			local2.method2695();
		}
		@Pc(103) short local103 = local2.aShort4;
		@Pc(106) short local106 = local2.aShort5;
		@Pc(109) short local109 = local2.aShort1;
		@Pc(112) short local112 = local2.aShort6;
		@Pc(115) short local115 = local2.aShort7;
		@Pc(118) short local118 = local2.aShort8;
		for (@Pc(120) int local120 = 0; local120 < this.anInt373; local120++) {
			@Pc(131) int local131 = this.anIntArray31[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray29[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray30[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray33[local120];
						@Pc(180) int local180 = this.anIntArray33[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray18[local182] != 0; local182++) {
							local168 = (this.aShortArray18[local182] & 0xFFFF) - 1;
							if (this.aByteArray9[local168] != 0) {
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
											this.aClass190_1 = new Class190();
											local40 = this.aClass190_1.aShortArray85 = Class77_Sub42.method22709(this.aShortArray10);
											local44 = this.aClass190_1.aShortArray84 = Class77_Sub42.method22709(this.aShortArray9);
											local48 = this.aClass190_1.aShortArray83 = Class77_Sub42.method22709(this.aShortArray11);
											local52 = this.aClass190_1.aByteArray59 = Class137.method14101(this.aByteArray9);
										}
										if (local68 == null) {
											@Pc(325) Class190 local325 = local2.aClass190_1 = new Class190();
											local68 = local325.aShortArray85 = Class77_Sub42.method22709(local24);
											local72 = local325.aShortArray84 = Class77_Sub42.method22709(local27);
											local76 = local325.aShortArray83 = Class77_Sub42.method22709(local30);
											local80 = local325.aByteArray59 = Class137.method14101(local33);
										}
										@Pc(358) short local358 = this.aShortArray10[local168];
										@Pc(363) short local363 = this.aShortArray9[local168];
										@Pc(368) short local368 = this.aShortArray11[local168];
										@Pc(373) byte local373 = this.aByteArray9[local168];
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
										local173 = this.anIntArray33[local120];
										local180 = this.anIntArray33[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray18[local385] != 0; local385++) {
											local394 = (this.aShortArray18[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										if (this.aClass172_2 == null && this.aClass172_3 != null) {
											this.aClass172_3.anInterface14_6 = null;
										}
										if (this.aClass172_2 != null) {
											this.aClass172_2.anInterface14_6 = null;
										}
										if (local2.aClass172_2 == null && local2.aClass172_3 != null) {
											local2.aClass172_3.anInterface14_6 = null;
										}
										if (local2.aClass172_2 != null) {
											local2.aClass172_2.anInterface14_6 = null;
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

	@OriginalMember(owner = "client!aeb", name = "bw", descriptor = "(Lclient!dv;IIIZ)V", line = 1325)
	@Override
	public void method6855(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class84_Sub1 local2 = (Class84_Sub1) arg0;
		if (this.anInt371 == 0 || local2.anInt371 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt373;
		@Pc(15) int[] local15 = local2.anIntArray29;
		@Pc(18) int[] local18 = local2.anIntArray31;
		@Pc(21) int[] local21 = local2.anIntArray30;
		@Pc(24) short[] local24 = local2.aShortArray10;
		@Pc(27) short[] local27 = local2.aShortArray9;
		@Pc(30) short[] local30 = local2.aShortArray11;
		@Pc(33) byte[] local33 = local2.aByteArray9;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass190_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass190_1.aShortArray85;
			local44 = this.aClass190_1.aShortArray84;
			local48 = this.aClass190_1.aShortArray83;
			local52 = this.aClass190_1.aByteArray59;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass190_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass190_1.aShortArray85;
			local72 = local2.aClass190_1.aShortArray84;
			local76 = local2.aClass190_1.aShortArray83;
			local80 = local2.aClass190_1.aByteArray59;
		}
		@Pc(92) int[] local92 = local2.anIntArray33;
		@Pc(95) short[] local95 = local2.aShortArray18;
		if (!local2.aBoolean60) {
			local2.method2695();
		}
		@Pc(103) short local103 = local2.aShort4;
		@Pc(106) short local106 = local2.aShort5;
		@Pc(109) short local109 = local2.aShort1;
		@Pc(112) short local112 = local2.aShort6;
		@Pc(115) short local115 = local2.aShort7;
		@Pc(118) short local118 = local2.aShort8;
		for (@Pc(120) int local120 = 0; local120 < this.anInt373; local120++) {
			@Pc(131) int local131 = this.anIntArray31[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray29[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray30[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray33[local120];
						@Pc(180) int local180 = this.anIntArray33[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray18[local182] != 0; local182++) {
							local168 = (this.aShortArray18[local182] & 0xFFFF) - 1;
							if (this.aByteArray9[local168] != 0) {
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
											this.aClass190_1 = new Class190();
											local40 = this.aClass190_1.aShortArray85 = Class77_Sub42.method22709(this.aShortArray10);
											local44 = this.aClass190_1.aShortArray84 = Class77_Sub42.method22709(this.aShortArray9);
											local48 = this.aClass190_1.aShortArray83 = Class77_Sub42.method22709(this.aShortArray11);
											local52 = this.aClass190_1.aByteArray59 = Class137.method14101(this.aByteArray9);
										}
										if (local68 == null) {
											@Pc(325) Class190 local325 = local2.aClass190_1 = new Class190();
											local68 = local325.aShortArray85 = Class77_Sub42.method22709(local24);
											local72 = local325.aShortArray84 = Class77_Sub42.method22709(local27);
											local76 = local325.aShortArray83 = Class77_Sub42.method22709(local30);
											local80 = local325.aByteArray59 = Class137.method14101(local33);
										}
										@Pc(358) short local358 = this.aShortArray10[local168];
										@Pc(363) short local363 = this.aShortArray9[local168];
										@Pc(368) short local368 = this.aShortArray11[local168];
										@Pc(373) byte local373 = this.aByteArray9[local168];
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
										local173 = this.anIntArray33[local120];
										local180 = this.anIntArray33[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray18[local385] != 0; local385++) {
											local394 = (this.aShortArray18[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										if (this.aClass172_2 == null && this.aClass172_3 != null) {
											this.aClass172_3.anInterface14_6 = null;
										}
										if (this.aClass172_2 != null) {
											this.aClass172_2.anInterface14_6 = null;
										}
										if (local2.aClass172_2 == null && local2.aClass172_3 != null) {
											local2.aClass172_3.anInterface14_6 = null;
										}
										if (local2.aClass172_2 != null) {
											local2.aClass172_2.anInterface14_6 = null;
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

	@OriginalMember(owner = "client!aeb", name = "bg", descriptor = "(Lclient!dv;IIIZ)V", line = 1325)
	@Override
	public void method6841(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class84_Sub1 local2 = (Class84_Sub1) arg0;
		if (this.anInt371 == 0 || local2.anInt371 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt373;
		@Pc(15) int[] local15 = local2.anIntArray29;
		@Pc(18) int[] local18 = local2.anIntArray31;
		@Pc(21) int[] local21 = local2.anIntArray30;
		@Pc(24) short[] local24 = local2.aShortArray10;
		@Pc(27) short[] local27 = local2.aShortArray9;
		@Pc(30) short[] local30 = local2.aShortArray11;
		@Pc(33) byte[] local33 = local2.aByteArray9;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass190_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass190_1.aShortArray85;
			local44 = this.aClass190_1.aShortArray84;
			local48 = this.aClass190_1.aShortArray83;
			local52 = this.aClass190_1.aByteArray59;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass190_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass190_1.aShortArray85;
			local72 = local2.aClass190_1.aShortArray84;
			local76 = local2.aClass190_1.aShortArray83;
			local80 = local2.aClass190_1.aByteArray59;
		}
		@Pc(92) int[] local92 = local2.anIntArray33;
		@Pc(95) short[] local95 = local2.aShortArray18;
		if (!local2.aBoolean60) {
			local2.method2695();
		}
		@Pc(103) short local103 = local2.aShort4;
		@Pc(106) short local106 = local2.aShort5;
		@Pc(109) short local109 = local2.aShort1;
		@Pc(112) short local112 = local2.aShort6;
		@Pc(115) short local115 = local2.aShort7;
		@Pc(118) short local118 = local2.aShort8;
		for (@Pc(120) int local120 = 0; local120 < this.anInt373; local120++) {
			@Pc(131) int local131 = this.anIntArray31[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray29[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray30[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray33[local120];
						@Pc(180) int local180 = this.anIntArray33[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray18[local182] != 0; local182++) {
							local168 = (this.aShortArray18[local182] & 0xFFFF) - 1;
							if (this.aByteArray9[local168] != 0) {
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
											this.aClass190_1 = new Class190();
											local40 = this.aClass190_1.aShortArray85 = Class77_Sub42.method22709(this.aShortArray10);
											local44 = this.aClass190_1.aShortArray84 = Class77_Sub42.method22709(this.aShortArray9);
											local48 = this.aClass190_1.aShortArray83 = Class77_Sub42.method22709(this.aShortArray11);
											local52 = this.aClass190_1.aByteArray59 = Class137.method14101(this.aByteArray9);
										}
										if (local68 == null) {
											@Pc(325) Class190 local325 = local2.aClass190_1 = new Class190();
											local68 = local325.aShortArray85 = Class77_Sub42.method22709(local24);
											local72 = local325.aShortArray84 = Class77_Sub42.method22709(local27);
											local76 = local325.aShortArray83 = Class77_Sub42.method22709(local30);
											local80 = local325.aByteArray59 = Class137.method14101(local33);
										}
										@Pc(358) short local358 = this.aShortArray10[local168];
										@Pc(363) short local363 = this.aShortArray9[local168];
										@Pc(368) short local368 = this.aShortArray11[local168];
										@Pc(373) byte local373 = this.aByteArray9[local168];
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
										local173 = this.anIntArray33[local120];
										local180 = this.anIntArray33[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray18[local385] != 0; local385++) {
											local394 = (this.aShortArray18[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										if (this.aClass172_2 == null && this.aClass172_3 != null) {
											this.aClass172_3.anInterface14_6 = null;
										}
										if (this.aClass172_2 != null) {
											this.aClass172_2.anInterface14_6 = null;
										}
										if (local2.aClass172_2 == null && local2.aClass172_3 != null) {
											local2.aClass172_3.anInterface14_6 = null;
										}
										if (local2.aClass172_2 != null) {
											local2.aClass172_2.anInterface14_6 = null;
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

	@OriginalMember(owner = "client!aeb", name = "bs", descriptor = "(Lclient!dv;IIIZ)V", line = 1325)
	@Override
	public void method6847(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class84_Sub1 local2 = (Class84_Sub1) arg0;
		if (this.anInt371 == 0 || local2.anInt371 == 0) {
			return;
		}
		@Pc(12) int local12 = local2.anInt373;
		@Pc(15) int[] local15 = local2.anIntArray29;
		@Pc(18) int[] local18 = local2.anIntArray31;
		@Pc(21) int[] local21 = local2.anIntArray30;
		@Pc(24) short[] local24 = local2.aShortArray10;
		@Pc(27) short[] local27 = local2.aShortArray9;
		@Pc(30) short[] local30 = local2.aShortArray11;
		@Pc(33) byte[] local33 = local2.aByteArray9;
		@Pc(40) short[] local40;
		@Pc(44) short[] local44;
		@Pc(48) short[] local48;
		@Pc(52) byte[] local52;
		if (this.aClass190_1 == null) {
			local40 = null;
			local44 = null;
			local48 = null;
			local52 = null;
		} else {
			local40 = this.aClass190_1.aShortArray85;
			local44 = this.aClass190_1.aShortArray84;
			local48 = this.aClass190_1.aShortArray83;
			local52 = this.aClass190_1.aByteArray59;
		}
		@Pc(68) short[] local68;
		@Pc(72) short[] local72;
		@Pc(76) short[] local76;
		@Pc(80) byte[] local80;
		if (local2.aClass190_1 == null) {
			local68 = null;
			local72 = null;
			local76 = null;
			local80 = null;
		} else {
			local68 = local2.aClass190_1.aShortArray85;
			local72 = local2.aClass190_1.aShortArray84;
			local76 = local2.aClass190_1.aShortArray83;
			local80 = local2.aClass190_1.aByteArray59;
		}
		@Pc(92) int[] local92 = local2.anIntArray33;
		@Pc(95) short[] local95 = local2.aShortArray18;
		if (!local2.aBoolean60) {
			local2.method2695();
		}
		@Pc(103) short local103 = local2.aShort4;
		@Pc(106) short local106 = local2.aShort5;
		@Pc(109) short local109 = local2.aShort1;
		@Pc(112) short local112 = local2.aShort6;
		@Pc(115) short local115 = local2.aShort7;
		@Pc(118) short local118 = local2.aShort8;
		for (@Pc(120) int local120 = 0; local120 < this.anInt373; local120++) {
			@Pc(131) int local131 = this.anIntArray31[local120] - arg2;
			if (local131 >= local103 && local131 <= local106) {
				@Pc(145) int local145 = this.anIntArray29[local120] - arg1;
				if (local145 >= local109 && local145 <= local112) {
					@Pc(159) int local159 = this.anIntArray30[local120] - arg3;
					if (local159 >= local115 && local159 <= local118) {
						@Pc(168) int local168 = -1;
						@Pc(173) int local173 = this.anIntArray33[local120];
						@Pc(180) int local180 = this.anIntArray33[local120 + 1];
						@Pc(182) int local182;
						for (local182 = local173; local182 < local180 && this.aShortArray18[local182] != 0; local182++) {
							local168 = (this.aShortArray18[local182] & 0xFFFF) - 1;
							if (this.aByteArray9[local168] != 0) {
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
											this.aClass190_1 = new Class190();
											local40 = this.aClass190_1.aShortArray85 = Class77_Sub42.method22709(this.aShortArray10);
											local44 = this.aClass190_1.aShortArray84 = Class77_Sub42.method22709(this.aShortArray9);
											local48 = this.aClass190_1.aShortArray83 = Class77_Sub42.method22709(this.aShortArray11);
											local52 = this.aClass190_1.aByteArray59 = Class137.method14101(this.aByteArray9);
										}
										if (local68 == null) {
											@Pc(325) Class190 local325 = local2.aClass190_1 = new Class190();
											local68 = local325.aShortArray85 = Class77_Sub42.method22709(local24);
											local72 = local325.aShortArray84 = Class77_Sub42.method22709(local27);
											local76 = local325.aShortArray83 = Class77_Sub42.method22709(local30);
											local80 = local325.aByteArray59 = Class137.method14101(local33);
										}
										@Pc(358) short local358 = this.aShortArray10[local168];
										@Pc(363) short local363 = this.aShortArray9[local168];
										@Pc(368) short local368 = this.aShortArray11[local168];
										@Pc(373) byte local373 = this.aByteArray9[local168];
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
										local173 = this.anIntArray33[local120];
										local180 = this.anIntArray33[local120 + 1];
										for (local385 = local173; local385 < local180 && this.aShortArray18[local385] != 0; local385++) {
											local394 = (this.aShortArray18[local385] & 0xFFFF) - 1;
											if (local52[local394] != 0) {
												local40[local394] += local358;
												local44[local394] += local363;
												local48[local394] += local368;
												local52[local394] += local373;
											}
										}
										if (this.aClass172_2 == null && this.aClass172_3 != null) {
											this.aClass172_3.anInterface14_6 = null;
										}
										if (this.aClass172_2 != null) {
											this.aClass172_2.anInterface14_6 = null;
										}
										if (local2.aClass172_2 == null && local2.aClass172_3 != null) {
											local2.aClass172_3.anInterface14_6 = null;
										}
										if (local2.aClass172_2 != null) {
											local2.aClass172_2.anInterface14_6 = null;
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

	@OriginalMember(owner = "client!aeb", name = "er", descriptor = "(I)V", line = 1459)
	@Override
	public void method6917(@OriginalArg(0) int arg0) {
		this.aShort2 = (short) arg0;
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "an", descriptor = "(I)V", line = 1459)
	@Override
	public void method6830(@OriginalArg(0) int arg0) {
		this.aShort2 = (short) arg0;
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ef", descriptor = "(I)V", line = 1459)
	@Override
	public void method6916(@OriginalArg(0) int arg0) {
		this.aShort2 = (short) arg0;
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ab", descriptor = "(I)V", line = 1464)
	@Override
	public void method6892(@OriginalArg(0) int arg0) {
		this.aShort3 = (short) arg0;
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
		if (this.aClass172_2 != null) {
			this.aClass172_2.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "em", descriptor = "(I)V", line = 1464)
	@Override
	public void method6918(@OriginalArg(0) int arg0) {
		this.aShort3 = (short) arg0;
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
		if (this.aClass172_2 != null) {
			this.aClass172_2.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "et", descriptor = "(I)V", line = 1464)
	@Override
	public void method6877(@OriginalArg(0) int arg0) {
		this.aShort3 = (short) arg0;
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
		if (this.aClass172_2 != null) {
			this.aClass172_2.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ew", descriptor = "(I)V", line = 1464)
	@Override
	public void method6919(@OriginalArg(0) int arg0) {
		this.aShort3 = (short) arg0;
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
		if (this.aClass172_2 != null) {
			this.aClass172_2.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "eu", descriptor = "()I", line = 1470)
	@Override
	public int method6946() {
		return this.aShort2;
	}

	@OriginalMember(owner = "client!aeb", name = "aa", descriptor = "()I", line = 1470)
	@Override
	public int method6832() {
		return this.aShort2;
	}

	@OriginalMember(owner = "client!aeb", name = "ap", descriptor = "()I", line = 1474)
	@Override
	public int method6833() {
		return this.aShort3;
	}

	@OriginalMember(owner = "client!aeb", name = "ea", descriptor = "()I", line = 1474)
	@Override
	public int method6921() {
		return this.aShort3;
	}

	@OriginalMember(owner = "client!aeb", name = "ec", descriptor = "()[B", line = 1478)
	@Override
	public byte[] method6922() {
		return this.aByteArray10;
	}

	@OriginalMember(owner = "client!aeb", name = "aw", descriptor = "()[B", line = 1478)
	@Override
	public byte[] method6834() {
		return this.aByteArray10;
	}

	@OriginalMember(owner = "client!aeb", name = "az", descriptor = "(SS)V", line = 1482)
	@Override
	public void method6835(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt371; local1++) {
			if (this.aShortArray13[local1] == arg0) {
				this.aShortArray13[local1] = arg1;
			}
		}
		if (this.aClass189Array1 != null) {
			for (local1 = 0; local1 < this.anInt377; local1++) {
				@Pc(32) Class189 local32 = this.aClass189Array1[local1];
				@Pc(37) Class176 local37 = this.aClass176Array1[local1];
				local37.anInt3302 = local37.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local32.anInt3339] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "eg", descriptor = "(SS)V", line = 1482)
	@Override
	public void method6924(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt371; local1++) {
			if (this.aShortArray13[local1] == arg0) {
				this.aShortArray13[local1] = arg1;
			}
		}
		if (this.aClass189Array1 != null) {
			for (local1 = 0; local1 < this.anInt377; local1++) {
				@Pc(32) Class189 local32 = this.aClass189Array1[local1];
				@Pc(37) Class176 local37 = this.aClass176Array1[local1];
				local37.anInt3302 = local37.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local32.anInt3339] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "el", descriptor = "(SS)V", line = 1482)
	@Override
	public void method6956(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt371; local1++) {
			if (this.aShortArray13[local1] == arg0) {
				this.aShortArray13[local1] = arg1;
			}
		}
		if (this.aClass189Array1 != null) {
			for (local1 = 0; local1 < this.anInt377; local1++) {
				@Pc(32) Class189 local32 = this.aClass189Array1[local1];
				@Pc(37) Class176 local37 = this.aClass176Array1[local1];
				local37.anInt3302 = local37.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local32.anInt3339] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ey", descriptor = "(B[B)V", line = 1496)
	@Override
	public void method6925(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt371; local3++) {
				this.aByteArray10[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt371; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray10[local3] = (byte) local39;
			}
		}
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "eb", descriptor = "(B[B)V", line = 1496)
	@Override
	public void method6920(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt371; local3++) {
				this.aByteArray10[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt371; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray10[local3] = (byte) local39;
			}
		}
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "bc", descriptor = "(B[B)V", line = 1496)
	@Override
	public void method6865(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt371; local3++) {
				this.aByteArray10[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt371; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray10[local3] = (byte) local39;
			}
		}
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ez", descriptor = "(B[B)V", line = 1496)
	@Override
	public void method6927(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(3) int local3;
		if (arg1 == null) {
			for (local3 = 0; local3 < this.anInt371; local3++) {
				this.aByteArray10[local3] = arg0;
			}
		} else {
			for (local3 = 0; local3 < this.anInt371; local3++) {
				@Pc(39) int local39 = 255 - (255 - (arg1[local3] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray10[local3] = (byte) local39;
			}
		}
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "bj", descriptor = "(SS)V", line = 1511)
	@Override
	public void method6890(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class209 local3 = this.aClass86_Sub3_23.aClass209_9;
		for (@Pc(5) int local5 = 0; local5 < this.anInt371; local5++) {
			if (this.aShortArray16[local5] == arg0) {
				this.aShortArray16[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class215 local36 = local3.method25584(arg0 & 0xFFFF);
			local24 = local36.aByte122;
			local26 = local36.aByte117;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class215 local56 = local3.method25584(arg1 & 0xFFFF);
			local44 = local56.aByte122;
			local46 = local56.aByte117;
			if (local56.aByte113 != 0 || local56.aByte114 != 0) {
				this.aBoolean58 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass189Array1 != null) {
			for (@Pc(90) int local90 = 0; local90 < this.anInt377; local90++) {
				@Pc(99) Class189 local99 = this.aClass189Array1[local90];
				@Pc(104) Class176 local104 = this.aClass176Array1[local90];
				local104.anInt3302 = local104.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local99.anInt3339] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ev", descriptor = "(SS)V", line = 1511)
	@Override
	public void method6928(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class209 local3 = this.aClass86_Sub3_23.aClass209_9;
		for (@Pc(5) int local5 = 0; local5 < this.anInt371; local5++) {
			if (this.aShortArray16[local5] == arg0) {
				this.aShortArray16[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class215 local36 = local3.method25584(arg0 & 0xFFFF);
			local24 = local36.aByte122;
			local26 = local36.aByte117;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class215 local56 = local3.method25584(arg1 & 0xFFFF);
			local44 = local56.aByte122;
			local46 = local56.aByte117;
			if (local56.aByte113 != 0 || local56.aByte114 != 0) {
				this.aBoolean58 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass189Array1 != null) {
			for (@Pc(90) int local90 = 0; local90 < this.anInt377; local90++) {
				@Pc(99) Class189 local99 = this.aClass189Array1[local90];
				@Pc(104) Class176 local104 = this.aClass176Array1[local90];
				local104.anInt3302 = local104.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local99.anInt3339] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ek", descriptor = "(SS)V", line = 1511)
	@Override
	public void method6929(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class209 local3 = this.aClass86_Sub3_23.aClass209_9;
		for (@Pc(5) int local5 = 0; local5 < this.anInt371; local5++) {
			if (this.aShortArray16[local5] == arg0) {
				this.aShortArray16[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class215 local36 = local3.method25584(arg0 & 0xFFFF);
			local24 = local36.aByte122;
			local26 = local36.aByte117;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class215 local56 = local3.method25584(arg1 & 0xFFFF);
			local44 = local56.aByte122;
			local46 = local56.aByte117;
			if (local56.aByte113 != 0 || local56.aByte114 != 0) {
				this.aBoolean58 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass189Array1 != null) {
			for (@Pc(90) int local90 = 0; local90 < this.anInt377; local90++) {
				@Pc(99) Class189 local99 = this.aClass189Array1[local90];
				@Pc(104) Class176 local104 = this.aClass176Array1[local90];
				local104.anInt3302 = local104.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local99.anInt3339] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "fv", descriptor = "(SS)V", line = 1511)
	@Override
	public void method6930(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class209 local3 = this.aClass86_Sub3_23.aClass209_9;
		for (@Pc(5) int local5 = 0; local5 < this.anInt371; local5++) {
			if (this.aShortArray16[local5] == arg0) {
				this.aShortArray16[local5] = arg1;
			}
		}
		@Pc(24) byte local24 = 0;
		@Pc(26) byte local26 = 0;
		if (arg0 != -1) {
			@Pc(36) Class215 local36 = local3.method25584(arg0 & 0xFFFF);
			local24 = local36.aByte122;
			local26 = local36.aByte117;
		}
		@Pc(44) byte local44 = 0;
		@Pc(46) byte local46 = 0;
		if (arg1 != -1) {
			@Pc(56) Class215 local56 = local3.method25584(arg1 & 0xFFFF);
			local44 = local56.aByte122;
			local46 = local56.aByte117;
			if (local56.aByte113 != 0 || local56.aByte114 != 0) {
				this.aBoolean58 = true;
			}
		}
		if (!(local24 != local44 | local26 != local46)) {
			return;
		}
		if (this.aClass189Array1 != null) {
			for (@Pc(90) int local90 = 0; local90 < this.anInt377; local90++) {
				@Pc(99) Class189 local99 = this.aClass189Array1[local90];
				@Pc(104) Class176 local104 = this.aClass176Array1[local90];
				local104.anInt3302 = local104.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local99.anInt3339] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "bv", descriptor = "(IIII)V", line = 1543)
	@Override
	public void method6837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt371; local1++) {
			@Pc(12) int local12 = this.aShortArray13[local1] & 0xFFFF;
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
			this.aShortArray13[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass189Array1 != null) {
			for (local1 = 0; local1 < this.anInt377; local1++) {
				@Pc(97) Class189 local97 = this.aClass189Array1[local1];
				@Pc(102) Class176 local102 = this.aClass176Array1[local1];
				local102.anInt3302 = local102.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local97.anInt3339] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "fq", descriptor = "(IIII)V", line = 1543)
	@Override
	public void method6931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt371; local1++) {
			@Pc(12) int local12 = this.aShortArray13[local1] & 0xFFFF;
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
			this.aShortArray13[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass189Array1 != null) {
			for (local1 = 0; local1 < this.anInt377; local1++) {
				@Pc(97) Class189 local97 = this.aClass189Array1[local1];
				@Pc(102) Class176 local102 = this.aClass176Array1[local1];
				local102.anInt3302 = local102.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local97.anInt3339] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "fm", descriptor = "(IIII)V", line = 1543)
	@Override
	public void method6912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt371; local1++) {
			@Pc(12) int local12 = this.aShortArray13[local1] & 0xFFFF;
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
			this.aShortArray13[local1] = (short) (local18 << 10 | local24 << 7 | local28);
		}
		if (this.aClass189Array1 != null) {
			for (local1 = 0; local1 < this.anInt377; local1++) {
				@Pc(97) Class189 local97 = this.aClass189Array1[local1];
				@Pc(102) Class176 local102 = this.aClass176Array1[local1];
				local102.anInt3302 = local102.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local97.anInt3339] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass172_3 != null) {
			this.aClass172_3.anInterface14_6 = null;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ff", descriptor = "()Z", line = 1564)
	@Override
	public boolean method6940() {
		if (this.aShortArray16 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray16.length; local6++) {
			if (this.aShortArray16[local6] != -1) {
				@Pc(29) Class215 local29 = this.aClass86_Sub3_23.aClass209_9.method25584(this.aShortArray16[local6] & 0xFFFF);
				if (local29.aBoolean638 && !this.aClass86_Sub3_23.aClass198_1.method25481(Class596.aClass596_2, local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aeb", name = "ba", descriptor = "()Z", line = 1564)
	@Override
	public boolean method6839() {
		if (this.aShortArray16 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray16.length; local6++) {
			if (this.aShortArray16[local6] != -1) {
				@Pc(29) Class215 local29 = this.aClass86_Sub3_23.aClass209_9.method25584(this.aShortArray16[local6] & 0xFFFF);
				if (local29.aBoolean638 && !this.aClass86_Sub3_23.aClass198_1.method25481(Class596.aClass596_2, local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aeb", name = "fi", descriptor = "()Z", line = 1564)
	@Override
	public boolean method6866() {
		if (this.aShortArray16 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray16.length; local6++) {
			if (this.aShortArray16[local6] != -1) {
				@Pc(29) Class215 local29 = this.aClass86_Sub3_23.aClass209_9.method25584(this.aShortArray16[local6] & 0xFFFF);
				if (local29.aBoolean638 && !this.aClass86_Sub3_23.aClass198_1.method25481(Class596.aClass596_2, local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aeb", name = "fz", descriptor = "()Z", line = 1564)
	@Override
	public boolean method6838() {
		if (this.aShortArray16 == null) {
			return true;
		}
		for (@Pc(6) int local6 = 0; local6 < this.aShortArray16.length; local6++) {
			if (this.aShortArray16[local6] != -1) {
				@Pc(29) Class215 local29 = this.aClass86_Sub3_23.aClass209_9.method25584(this.aShortArray16[local6] & 0xFFFF);
				if (local29.aBoolean638 && !this.aClass86_Sub3_23.aClass198_1.method25481(Class596.aClass596_2, local29, -1)) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aeb", name = "bl", descriptor = "()Z", line = 1576)
	@Override
	public boolean method6809() {
		return this.aBoolean57;
	}

	@OriginalMember(owner = "client!aeb", name = "fs", descriptor = "()Z", line = 1576)
	@Override
	public boolean method6941() {
		return this.aBoolean57;
	}

	@OriginalMember(owner = "client!aeb", name = "fb", descriptor = "()Z", line = 1576)
	@Override
	public boolean method6942() {
		return this.aBoolean57;
	}

	@OriginalMember(owner = "client!aeb", name = "fu", descriptor = "()Z", line = 1576)
	@Override
	public boolean method6943() {
		return this.aBoolean57;
	}

	@OriginalMember(owner = "client!aeb", name = "bb", descriptor = "()Z", line = 1580)
	@Override
	public boolean method6840() {
		return this.aBoolean58;
	}

	@OriginalMember(owner = "client!aeb", name = "fo", descriptor = "()Z", line = 1580)
	@Override
	public boolean method6944() {
		return this.aBoolean58;
	}

	@OriginalMember(owner = "client!aeb", name = "f", descriptor = "()V", line = 1583)
	@Override
	void method6958() {
	}

	@OriginalMember(owner = "client!aeb", name = "fp", descriptor = "()V", line = 1583)
	@Override
	void method6950() {
	}

	@OriginalMember(owner = "client!aeb", name = "fy", descriptor = "()V", line = 1583)
	@Override
	void method6951() {
	}

	@OriginalMember(owner = "client!aeb", name = "fx", descriptor = "()V", line = 1584)
	@Override
	void method6836() {
	}

	@OriginalMember(owner = "client!aeb", name = "o", descriptor = "()V", line = 1584)
	@Override
	void method6883() {
	}

	@OriginalMember(owner = "client!aeb", name = "fr", descriptor = "()V", line = 1584)
	@Override
	void method6953() {
	}

	@OriginalMember(owner = "client!aeb", name = "fc", descriptor = "()V", line = 1584)
	@Override
	void method6954() {
	}

	@OriginalMember(owner = "client!aeb", name = "ai", descriptor = "()Z", line = 1587)
	@Override
	boolean method6811() {
		if (this.anIntArrayArray1 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt368; local6++) {
			this.anIntArray29[local6] <<= 0x4;
			this.anIntArray31[local6] <<= 0x4;
			this.anIntArray30[local6] <<= 0x4;
		}
		anInt379 = 0;
		anInt380 = 0;
		anInt381 = 0;
		return true;
	}

	@OriginalMember(owner = "client!aeb", name = "cr", descriptor = "()Z", line = 1587)
	@Override
	boolean method6844() {
		if (this.anIntArrayArray1 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt368; local6++) {
			this.anIntArray29[local6] <<= 0x4;
			this.anIntArray31[local6] <<= 0x4;
			this.anIntArray30[local6] <<= 0x4;
		}
		anInt379 = 0;
		anInt380 = 0;
		anInt381 = 0;
		return true;
	}

	@OriginalMember(owner = "client!aeb", name = "al", descriptor = "(I[IIIIZI[I)V", line = 1600)
	@Override
	void method6846(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			anInt379 = 0;
			anInt380 = 0;
			anInt381 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray1.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray1[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local53]) != 0) {
							anInt379 += this.anIntArray29[local53];
							anInt380 += this.anIntArray31[local53];
							anInt381 += this.anIntArray30[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt379 = anInt379 / local18 + arg2;
				anInt380 = anInt380 / local18 + arg3;
				anInt381 = anInt381 / local18 + arg4;
				aBoolean62 = true;
			} else {
				anInt379 = arg2;
				anInt380 = arg3;
				anInt381 = arg4;
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
				if (local26 < this.anIntArrayArray1.length) {
					local228 = this.anIntArrayArray1[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
							this.anIntArray29[local45] += arg2;
							this.anIntArray31[local45] += arg3;
							this.anIntArray30[local45] += arg4;
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
					if (local26 < this.anIntArrayArray1.length) {
						local228 = this.anIntArrayArray1[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
								this.anIntArray29[local45] -= anInt379;
								this.anIntArray31[local45] -= anInt380;
								this.anIntArray30[local45] -= anInt381;
								if (arg4 != 0) {
									local53 = Class436.anIntArray464[arg4];
									local343 = Class436.anIntArray463[arg4];
									local365 = this.anIntArray31[local45] * local53 + this.anIntArray29[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = this.anIntArray31[local45] * local343 - this.anIntArray29[local45] * local53 + 16383 >> 14;
									this.anIntArray29[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class436.anIntArray464[arg2];
									local343 = Class436.anIntArray463[arg2];
									local365 = this.anIntArray31[local45] * local343 - this.anIntArray30[local45] * local53 + 16383 >> 14;
									this.anIntArray30[local45] = this.anIntArray31[local45] * local53 + this.anIntArray30[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class436.anIntArray464[arg3];
									local343 = Class436.anIntArray463[arg3];
									local365 = this.anIntArray30[local45] * local53 + this.anIntArray29[local45] * local343 + 16383 >> 14;
									this.anIntArray30[local45] = this.anIntArray30[local45] * local343 - this.anIntArray29[local45] * local53 + 16383 >> 14;
									this.anIntArray29[local45] = local365;
								}
								this.anIntArray29[local45] += anInt379;
								this.anIntArray31[local45] += anInt380;
								this.anIntArray30[local45] += anInt381;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray1.length) {
							local228 = this.anIntArrayArray1[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
									local53 = this.anIntArray33[local45];
									local343 = this.anIntArray33[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray18[local365] != 0; local365++) {
										local387 = (this.aShortArray18[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class436.anIntArray464[arg4];
											local426 = Class436.anIntArray463[arg4];
											local430 = this.aShortArray9[local387] * local422 + this.aShortArray10[local387] * local426 + 16383 >> 14;
											this.aShortArray9[local387] = (short) (this.aShortArray9[local387] * local426 - this.aShortArray10[local387] * local422 + 16383 >> 14);
											this.aShortArray10[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class436.anIntArray464[arg2];
											local426 = Class436.anIntArray463[arg2];
											local430 = this.aShortArray9[local387] * local426 - this.aShortArray11[local387] * local422 + 16383 >> 14;
											this.aShortArray11[local387] = (short) (this.aShortArray9[local387] * local422 + this.aShortArray11[local387] * local426 + 16383 >> 14);
											this.aShortArray9[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class436.anIntArray464[arg3];
											local426 = Class436.anIntArray463[arg3];
											local430 = this.aShortArray11[local387] * local422 + this.aShortArray10[local387] * local426 + 16383 >> 14;
											this.aShortArray11[local387] = (short) (this.aShortArray11[local387] * local426 - this.aShortArray10[local387] * local422 + 16383 >> 14);
											this.aShortArray10[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass172_2 == null && this.aClass172_3 != null) {
						this.aClass172_3.anInterface14_6 = null;
					}
					if (this.aClass172_2 != null) {
						this.aClass172_2.anInterface14_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean62) {
					local343 = arg7[0] * anInt379 + arg7[3] * anInt380 + arg7[6] * anInt381 + 8192 >> 14;
					local365 = arg7[1] * anInt379 + arg7[4] * anInt380 + arg7[7] * anInt381 + 8192 >> 14;
					local387 = arg7[2] * anInt379 + arg7[5] * anInt380 + arg7[8] * anInt381 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt379 = local343;
					anInt380 = local365;
					anInt381 = local387;
					aBoolean62 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class436.anIntArray463[arg2];
				local387 = Class436.anIntArray464[arg2];
				local422 = Class436.anIntArray463[arg3];
				local426 = Class436.anIntArray464[arg3];
				local430 = Class436.anIntArray463[arg4];
				local434 = Class436.anIntArray464[arg4];
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
				@Pc(578) int local578 = local410[0] * -anInt379 + local410[1] * -anInt380 + local410[2] * -anInt381 + 8192 >> 14;
				local603 = local410[3] * -anInt379 + local410[4] * -anInt380 + local410[5] * -anInt381 + 8192 >> 14;
				local628 = local410[6] * -anInt379 + local410[7] * -anInt380 + local410[8] * -anInt381 + 8192 >> 14;
				local632 = local578 + anInt379;
				@Pc(636) int local636 = local603 + anInt380;
				local640 = local628 + anInt381;
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
					if (local917 < this.anIntArrayArray1.length) {
						@Pc(927) int[] local927 = this.anIntArrayArray1[local917];
						for (@Pc(929) int local929 = 0; local929 < local927.length; local929++) {
							@Pc(937) int local937 = local927[local929];
							if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local937]) != 0) {
								@Pc(979) int local979 = local777[0] * this.anIntArray29[local937] + local777[1] * this.anIntArray31[local937] + local777[2] * this.anIntArray30[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray29[local937] + local777[4] * this.anIntArray31[local937] + local777[5] * this.anIntArray30[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray29[local937] + local777[7] * this.anIntArray31[local937] + local777[8] * this.anIntArray30[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray29[local937] = local1045;
								this.anIntArray31[local937] = local1049;
								this.anIntArray30[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class189 local2452;
			@Pc(2457) Class176 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray2 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray2.length) {
							local228 = this.anIntArrayArray2[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray17 == null || (arg6 & this.aShortArray17[local45]) != 0) {
									local53 = (this.aByteArray10[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray10[local45] = (byte) local53;
									if (this.aClass172_3 != null) {
										this.aClass172_3.anInterface14_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass189Array1 != null) {
						for (local18 = 0; local18 < this.anInt377; local18++) {
							local2452 = this.aClass189Array1[local18];
							local2457 = this.aClass176Array1[local18];
							local2457.anInt3302 = local2457.anInt3302 & 0xFFFFFF | 255 - (this.aByteArray10[local2452.anInt3339] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class176 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local228 = this.anIntArrayArray3[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass176Array1[local228[local230]];
									local2686.anInt3301 += arg2;
									local2686.anInt3300 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local228 = this.anIntArrayArray3[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass176Array1[local228[local230]];
									local2686.anInt3299 = local2686.anInt3299 * arg2 >> 7;
									local2686.anInt3298 = local2686.anInt3298 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray3 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray3.length) {
							local228 = this.anIntArrayArray3[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local2686 = this.aClass176Array1[local228[local230]];
								local2686.anInt3303 = local2686.anInt3303 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray2 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray2.length) {
						local228 = this.anIntArrayArray2[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray17 == null || (arg6 & this.aShortArray17[local45]) != 0) {
								local53 = this.aShortArray13[local45] & 0xFFFF;
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
								this.aShortArray13[local45] = (short) (local2553 << 10 | local365 << 7 | local387);
								if (this.aClass172_3 != null) {
									this.aClass172_3.anInterface14_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass189Array1 != null) {
					for (local18 = 0; local18 < this.anInt377; local18++) {
						local2452 = this.aClass189Array1[local18];
						local2457 = this.aClass176Array1[local18];
						local2457.anInt3302 = local2457.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local2452.anInt3339] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray1.length) {
					local228 = this.anIntArrayArray1[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
							this.anIntArray29[local45] -= anInt379;
							this.anIntArray31[local45] -= anInt380;
							this.anIntArray30[local45] -= anInt381;
							this.anIntArray29[local45] = this.anIntArray29[local45] * arg2 >> 7;
							this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
							this.anIntArray30[local45] = this.anIntArray30[local45] * arg4 >> 7;
							this.anIntArray29[local45] += anInt379;
							this.anIntArray31[local45] += anInt380;
							this.anIntArray30[local45] += anInt381;
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
			if (aBoolean62) {
				local343 = arg7[0] * anInt379 + arg7[3] * anInt380 + arg7[6] * anInt381 + 8192 >> 14;
				local365 = arg7[1] * anInt379 + arg7[4] * anInt380 + arg7[7] * anInt381 + 8192 >> 14;
				local387 = arg7[2] * anInt379 + arg7[5] * anInt380 + arg7[8] * anInt381 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt379 = local343;
				anInt380 = local365;
				anInt381 = local387;
				aBoolean62 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt379 + 8192 >> 14;
			local426 = local365 * -anInt380 + 8192 >> 14;
			local430 = local387 * -anInt381 + 8192 >> 14;
			local434 = local422 + anInt379;
			local442 = local426 + anInt380;
			local450 = local430 + anInt381;
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
				if (local655 < this.anIntArrayArray1.length) {
					local777 = this.anIntArrayArray1[local655];
					for (local779 = 0; local779 < local777.length; local779++) {
						local784 = local777[local779];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local784]) != 0) {
							local789 = local1929[0] * this.anIntArray29[local784] + local1929[1] * this.anIntArray31[local784] + local1929[2] * this.anIntArray30[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray29[local784] + local1929[4] * this.anIntArray31[local784] + local1929[5] * this.anIntArray30[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray29[local784] + local1929[7] * this.anIntArray31[local784] + local1929[8] * this.anIntArray30[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray29[local784] = local2197;
							this.anIntArray31[local784] = local2201;
							this.anIntArray30[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "co", descriptor = "(I[IIIIZI[I)V", line = 1600)
	@Override
	void method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			anInt379 = 0;
			anInt380 = 0;
			anInt381 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray1.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray1[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local53]) != 0) {
							anInt379 += this.anIntArray29[local53];
							anInt380 += this.anIntArray31[local53];
							anInt381 += this.anIntArray30[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt379 = anInt379 / local18 + arg2;
				anInt380 = anInt380 / local18 + arg3;
				anInt381 = anInt381 / local18 + arg4;
				aBoolean62 = true;
			} else {
				anInt379 = arg2;
				anInt380 = arg3;
				anInt381 = arg4;
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
				if (local26 < this.anIntArrayArray1.length) {
					local228 = this.anIntArrayArray1[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
							this.anIntArray29[local45] += arg2;
							this.anIntArray31[local45] += arg3;
							this.anIntArray30[local45] += arg4;
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
					if (local26 < this.anIntArrayArray1.length) {
						local228 = this.anIntArrayArray1[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
								this.anIntArray29[local45] -= anInt379;
								this.anIntArray31[local45] -= anInt380;
								this.anIntArray30[local45] -= anInt381;
								if (arg4 != 0) {
									local53 = Class436.anIntArray464[arg4];
									local343 = Class436.anIntArray463[arg4];
									local365 = this.anIntArray31[local45] * local53 + this.anIntArray29[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = this.anIntArray31[local45] * local343 - this.anIntArray29[local45] * local53 + 16383 >> 14;
									this.anIntArray29[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class436.anIntArray464[arg2];
									local343 = Class436.anIntArray463[arg2];
									local365 = this.anIntArray31[local45] * local343 - this.anIntArray30[local45] * local53 + 16383 >> 14;
									this.anIntArray30[local45] = this.anIntArray31[local45] * local53 + this.anIntArray30[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class436.anIntArray464[arg3];
									local343 = Class436.anIntArray463[arg3];
									local365 = this.anIntArray30[local45] * local53 + this.anIntArray29[local45] * local343 + 16383 >> 14;
									this.anIntArray30[local45] = this.anIntArray30[local45] * local343 - this.anIntArray29[local45] * local53 + 16383 >> 14;
									this.anIntArray29[local45] = local365;
								}
								this.anIntArray29[local45] += anInt379;
								this.anIntArray31[local45] += anInt380;
								this.anIntArray30[local45] += anInt381;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray1.length) {
							local228 = this.anIntArrayArray1[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
									local53 = this.anIntArray33[local45];
									local343 = this.anIntArray33[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray18[local365] != 0; local365++) {
										local387 = (this.aShortArray18[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class436.anIntArray464[arg4];
											local426 = Class436.anIntArray463[arg4];
											local430 = this.aShortArray9[local387] * local422 + this.aShortArray10[local387] * local426 + 16383 >> 14;
											this.aShortArray9[local387] = (short) (this.aShortArray9[local387] * local426 - this.aShortArray10[local387] * local422 + 16383 >> 14);
											this.aShortArray10[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class436.anIntArray464[arg2];
											local426 = Class436.anIntArray463[arg2];
											local430 = this.aShortArray9[local387] * local426 - this.aShortArray11[local387] * local422 + 16383 >> 14;
											this.aShortArray11[local387] = (short) (this.aShortArray9[local387] * local422 + this.aShortArray11[local387] * local426 + 16383 >> 14);
											this.aShortArray9[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class436.anIntArray464[arg3];
											local426 = Class436.anIntArray463[arg3];
											local430 = this.aShortArray11[local387] * local422 + this.aShortArray10[local387] * local426 + 16383 >> 14;
											this.aShortArray11[local387] = (short) (this.aShortArray11[local387] * local426 - this.aShortArray10[local387] * local422 + 16383 >> 14);
											this.aShortArray10[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass172_2 == null && this.aClass172_3 != null) {
						this.aClass172_3.anInterface14_6 = null;
					}
					if (this.aClass172_2 != null) {
						this.aClass172_2.anInterface14_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean62) {
					local343 = arg7[0] * anInt379 + arg7[3] * anInt380 + arg7[6] * anInt381 + 8192 >> 14;
					local365 = arg7[1] * anInt379 + arg7[4] * anInt380 + arg7[7] * anInt381 + 8192 >> 14;
					local387 = arg7[2] * anInt379 + arg7[5] * anInt380 + arg7[8] * anInt381 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt379 = local343;
					anInt380 = local365;
					anInt381 = local387;
					aBoolean62 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class436.anIntArray463[arg2];
				local387 = Class436.anIntArray464[arg2];
				local422 = Class436.anIntArray463[arg3];
				local426 = Class436.anIntArray464[arg3];
				local430 = Class436.anIntArray463[arg4];
				local434 = Class436.anIntArray464[arg4];
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
				@Pc(578) int local578 = local410[0] * -anInt379 + local410[1] * -anInt380 + local410[2] * -anInt381 + 8192 >> 14;
				local603 = local410[3] * -anInt379 + local410[4] * -anInt380 + local410[5] * -anInt381 + 8192 >> 14;
				local628 = local410[6] * -anInt379 + local410[7] * -anInt380 + local410[8] * -anInt381 + 8192 >> 14;
				local632 = local578 + anInt379;
				@Pc(636) int local636 = local603 + anInt380;
				local640 = local628 + anInt381;
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
					if (local917 < this.anIntArrayArray1.length) {
						@Pc(927) int[] local927 = this.anIntArrayArray1[local917];
						for (@Pc(929) int local929 = 0; local929 < local927.length; local929++) {
							@Pc(937) int local937 = local927[local929];
							if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local937]) != 0) {
								@Pc(979) int local979 = local777[0] * this.anIntArray29[local937] + local777[1] * this.anIntArray31[local937] + local777[2] * this.anIntArray30[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray29[local937] + local777[4] * this.anIntArray31[local937] + local777[5] * this.anIntArray30[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray29[local937] + local777[7] * this.anIntArray31[local937] + local777[8] * this.anIntArray30[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray29[local937] = local1045;
								this.anIntArray31[local937] = local1049;
								this.anIntArray30[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class189 local2452;
			@Pc(2457) Class176 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray2 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray2.length) {
							local228 = this.anIntArrayArray2[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray17 == null || (arg6 & this.aShortArray17[local45]) != 0) {
									local53 = (this.aByteArray10[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray10[local45] = (byte) local53;
									if (this.aClass172_3 != null) {
										this.aClass172_3.anInterface14_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass189Array1 != null) {
						for (local18 = 0; local18 < this.anInt377; local18++) {
							local2452 = this.aClass189Array1[local18];
							local2457 = this.aClass176Array1[local18];
							local2457.anInt3302 = local2457.anInt3302 & 0xFFFFFF | 255 - (this.aByteArray10[local2452.anInt3339] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class176 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local228 = this.anIntArrayArray3[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass176Array1[local228[local230]];
									local2686.anInt3301 += arg2;
									local2686.anInt3300 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local228 = this.anIntArrayArray3[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass176Array1[local228[local230]];
									local2686.anInt3299 = local2686.anInt3299 * arg2 >> 7;
									local2686.anInt3298 = local2686.anInt3298 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray3 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray3.length) {
							local228 = this.anIntArrayArray3[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local2686 = this.aClass176Array1[local228[local230]];
								local2686.anInt3303 = local2686.anInt3303 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray2 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray2.length) {
						local228 = this.anIntArrayArray2[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray17 == null || (arg6 & this.aShortArray17[local45]) != 0) {
								local53 = this.aShortArray13[local45] & 0xFFFF;
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
								this.aShortArray13[local45] = (short) (local2553 << 10 | local365 << 7 | local387);
								if (this.aClass172_3 != null) {
									this.aClass172_3.anInterface14_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass189Array1 != null) {
					for (local18 = 0; local18 < this.anInt377; local18++) {
						local2452 = this.aClass189Array1[local18];
						local2457 = this.aClass176Array1[local18];
						local2457.anInt3302 = local2457.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local2452.anInt3339] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray1.length) {
					local228 = this.anIntArrayArray1[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
							this.anIntArray29[local45] -= anInt379;
							this.anIntArray31[local45] -= anInt380;
							this.anIntArray30[local45] -= anInt381;
							this.anIntArray29[local45] = this.anIntArray29[local45] * arg2 >> 7;
							this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
							this.anIntArray30[local45] = this.anIntArray30[local45] * arg4 >> 7;
							this.anIntArray29[local45] += anInt379;
							this.anIntArray31[local45] += anInt380;
							this.anIntArray30[local45] += anInt381;
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
			if (aBoolean62) {
				local343 = arg7[0] * anInt379 + arg7[3] * anInt380 + arg7[6] * anInt381 + 8192 >> 14;
				local365 = arg7[1] * anInt379 + arg7[4] * anInt380 + arg7[7] * anInt381 + 8192 >> 14;
				local387 = arg7[2] * anInt379 + arg7[5] * anInt380 + arg7[8] * anInt381 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt379 = local343;
				anInt380 = local365;
				anInt381 = local387;
				aBoolean62 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt379 + 8192 >> 14;
			local426 = local365 * -anInt380 + 8192 >> 14;
			local430 = local387 * -anInt381 + 8192 >> 14;
			local434 = local422 + anInt379;
			local442 = local426 + anInt380;
			local450 = local430 + anInt381;
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
				if (local655 < this.anIntArrayArray1.length) {
					local777 = this.anIntArrayArray1[local655];
					for (local779 = 0; local779 < local777.length; local779++) {
						local784 = local777[local779];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local784]) != 0) {
							local789 = local1929[0] * this.anIntArray29[local784] + local1929[1] * this.anIntArray31[local784] + local1929[2] * this.anIntArray30[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray29[local784] + local1929[4] * this.anIntArray31[local784] + local1929[5] * this.anIntArray30[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray29[local784] + local1929[7] * this.anIntArray31[local784] + local1929[8] * this.anIntArray30[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray29[local784] = local2197;
							this.anIntArray31[local784] = local2201;
							this.anIntArray30[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "cn", descriptor = "(I[IIIIZI[I)V", line = 1600)
	@Override
	void method6876(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			anInt379 = 0;
			anInt380 = 0;
			anInt381 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray1.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray1[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local53]) != 0) {
							anInt379 += this.anIntArray29[local53];
							anInt380 += this.anIntArray31[local53];
							anInt381 += this.anIntArray30[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt379 = anInt379 / local18 + arg2;
				anInt380 = anInt380 / local18 + arg3;
				anInt381 = anInt381 / local18 + arg4;
				aBoolean62 = true;
			} else {
				anInt379 = arg2;
				anInt380 = arg3;
				anInt381 = arg4;
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
				if (local26 < this.anIntArrayArray1.length) {
					local228 = this.anIntArrayArray1[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
							this.anIntArray29[local45] += arg2;
							this.anIntArray31[local45] += arg3;
							this.anIntArray30[local45] += arg4;
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
					if (local26 < this.anIntArrayArray1.length) {
						local228 = this.anIntArrayArray1[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
								this.anIntArray29[local45] -= anInt379;
								this.anIntArray31[local45] -= anInt380;
								this.anIntArray30[local45] -= anInt381;
								if (arg4 != 0) {
									local53 = Class436.anIntArray464[arg4];
									local343 = Class436.anIntArray463[arg4];
									local365 = this.anIntArray31[local45] * local53 + this.anIntArray29[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = this.anIntArray31[local45] * local343 - this.anIntArray29[local45] * local53 + 16383 >> 14;
									this.anIntArray29[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class436.anIntArray464[arg2];
									local343 = Class436.anIntArray463[arg2];
									local365 = this.anIntArray31[local45] * local343 - this.anIntArray30[local45] * local53 + 16383 >> 14;
									this.anIntArray30[local45] = this.anIntArray31[local45] * local53 + this.anIntArray30[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class436.anIntArray464[arg3];
									local343 = Class436.anIntArray463[arg3];
									local365 = this.anIntArray30[local45] * local53 + this.anIntArray29[local45] * local343 + 16383 >> 14;
									this.anIntArray30[local45] = this.anIntArray30[local45] * local343 - this.anIntArray29[local45] * local53 + 16383 >> 14;
									this.anIntArray29[local45] = local365;
								}
								this.anIntArray29[local45] += anInt379;
								this.anIntArray31[local45] += anInt380;
								this.anIntArray30[local45] += anInt381;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray1.length) {
							local228 = this.anIntArrayArray1[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
									local53 = this.anIntArray33[local45];
									local343 = this.anIntArray33[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray18[local365] != 0; local365++) {
										local387 = (this.aShortArray18[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class436.anIntArray464[arg4];
											local426 = Class436.anIntArray463[arg4];
											local430 = this.aShortArray9[local387] * local422 + this.aShortArray10[local387] * local426 + 16383 >> 14;
											this.aShortArray9[local387] = (short) (this.aShortArray9[local387] * local426 - this.aShortArray10[local387] * local422 + 16383 >> 14);
											this.aShortArray10[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class436.anIntArray464[arg2];
											local426 = Class436.anIntArray463[arg2];
											local430 = this.aShortArray9[local387] * local426 - this.aShortArray11[local387] * local422 + 16383 >> 14;
											this.aShortArray11[local387] = (short) (this.aShortArray9[local387] * local422 + this.aShortArray11[local387] * local426 + 16383 >> 14);
											this.aShortArray9[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class436.anIntArray464[arg3];
											local426 = Class436.anIntArray463[arg3];
											local430 = this.aShortArray11[local387] * local422 + this.aShortArray10[local387] * local426 + 16383 >> 14;
											this.aShortArray11[local387] = (short) (this.aShortArray11[local387] * local426 - this.aShortArray10[local387] * local422 + 16383 >> 14);
											this.aShortArray10[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass172_2 == null && this.aClass172_3 != null) {
						this.aClass172_3.anInterface14_6 = null;
					}
					if (this.aClass172_2 != null) {
						this.aClass172_2.anInterface14_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean62) {
					local343 = arg7[0] * anInt379 + arg7[3] * anInt380 + arg7[6] * anInt381 + 8192 >> 14;
					local365 = arg7[1] * anInt379 + arg7[4] * anInt380 + arg7[7] * anInt381 + 8192 >> 14;
					local387 = arg7[2] * anInt379 + arg7[5] * anInt380 + arg7[8] * anInt381 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt379 = local343;
					anInt380 = local365;
					anInt381 = local387;
					aBoolean62 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class436.anIntArray463[arg2];
				local387 = Class436.anIntArray464[arg2];
				local422 = Class436.anIntArray463[arg3];
				local426 = Class436.anIntArray464[arg3];
				local430 = Class436.anIntArray463[arg4];
				local434 = Class436.anIntArray464[arg4];
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
				@Pc(578) int local578 = local410[0] * -anInt379 + local410[1] * -anInt380 + local410[2] * -anInt381 + 8192 >> 14;
				local603 = local410[3] * -anInt379 + local410[4] * -anInt380 + local410[5] * -anInt381 + 8192 >> 14;
				local628 = local410[6] * -anInt379 + local410[7] * -anInt380 + local410[8] * -anInt381 + 8192 >> 14;
				local632 = local578 + anInt379;
				@Pc(636) int local636 = local603 + anInt380;
				local640 = local628 + anInt381;
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
					if (local917 < this.anIntArrayArray1.length) {
						@Pc(927) int[] local927 = this.anIntArrayArray1[local917];
						for (@Pc(929) int local929 = 0; local929 < local927.length; local929++) {
							@Pc(937) int local937 = local927[local929];
							if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local937]) != 0) {
								@Pc(979) int local979 = local777[0] * this.anIntArray29[local937] + local777[1] * this.anIntArray31[local937] + local777[2] * this.anIntArray30[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray29[local937] + local777[4] * this.anIntArray31[local937] + local777[5] * this.anIntArray30[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray29[local937] + local777[7] * this.anIntArray31[local937] + local777[8] * this.anIntArray30[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray29[local937] = local1045;
								this.anIntArray31[local937] = local1049;
								this.anIntArray30[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class189 local2452;
			@Pc(2457) Class176 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray2 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray2.length) {
							local228 = this.anIntArrayArray2[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray17 == null || (arg6 & this.aShortArray17[local45]) != 0) {
									local53 = (this.aByteArray10[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray10[local45] = (byte) local53;
									if (this.aClass172_3 != null) {
										this.aClass172_3.anInterface14_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass189Array1 != null) {
						for (local18 = 0; local18 < this.anInt377; local18++) {
							local2452 = this.aClass189Array1[local18];
							local2457 = this.aClass176Array1[local18];
							local2457.anInt3302 = local2457.anInt3302 & 0xFFFFFF | 255 - (this.aByteArray10[local2452.anInt3339] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class176 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local228 = this.anIntArrayArray3[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass176Array1[local228[local230]];
									local2686.anInt3301 += arg2;
									local2686.anInt3300 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local228 = this.anIntArrayArray3[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass176Array1[local228[local230]];
									local2686.anInt3299 = local2686.anInt3299 * arg2 >> 7;
									local2686.anInt3298 = local2686.anInt3298 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray3 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray3.length) {
							local228 = this.anIntArrayArray3[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local2686 = this.aClass176Array1[local228[local230]];
								local2686.anInt3303 = local2686.anInt3303 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray2 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray2.length) {
						local228 = this.anIntArrayArray2[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray17 == null || (arg6 & this.aShortArray17[local45]) != 0) {
								local53 = this.aShortArray13[local45] & 0xFFFF;
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
								this.aShortArray13[local45] = (short) (local2553 << 10 | local365 << 7 | local387);
								if (this.aClass172_3 != null) {
									this.aClass172_3.anInterface14_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass189Array1 != null) {
					for (local18 = 0; local18 < this.anInt377; local18++) {
						local2452 = this.aClass189Array1[local18];
						local2457 = this.aClass176Array1[local18];
						local2457.anInt3302 = local2457.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local2452.anInt3339] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray1.length) {
					local228 = this.anIntArrayArray1[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
							this.anIntArray29[local45] -= anInt379;
							this.anIntArray31[local45] -= anInt380;
							this.anIntArray30[local45] -= anInt381;
							this.anIntArray29[local45] = this.anIntArray29[local45] * arg2 >> 7;
							this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
							this.anIntArray30[local45] = this.anIntArray30[local45] * arg4 >> 7;
							this.anIntArray29[local45] += anInt379;
							this.anIntArray31[local45] += anInt380;
							this.anIntArray30[local45] += anInt381;
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
			if (aBoolean62) {
				local343 = arg7[0] * anInt379 + arg7[3] * anInt380 + arg7[6] * anInt381 + 8192 >> 14;
				local365 = arg7[1] * anInt379 + arg7[4] * anInt380 + arg7[7] * anInt381 + 8192 >> 14;
				local387 = arg7[2] * anInt379 + arg7[5] * anInt380 + arg7[8] * anInt381 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt379 = local343;
				anInt380 = local365;
				anInt381 = local387;
				aBoolean62 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt379 + 8192 >> 14;
			local426 = local365 * -anInt380 + 8192 >> 14;
			local430 = local387 * -anInt381 + 8192 >> 14;
			local434 = local422 + anInt379;
			local442 = local426 + anInt380;
			local450 = local430 + anInt381;
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
				if (local655 < this.anIntArrayArray1.length) {
					local777 = this.anIntArrayArray1[local655];
					for (local779 = 0; local779 < local777.length; local779++) {
						local784 = local777[local779];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local784]) != 0) {
							local789 = local1929[0] * this.anIntArray29[local784] + local1929[1] * this.anIntArray31[local784] + local1929[2] * this.anIntArray30[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray29[local784] + local1929[4] * this.anIntArray31[local784] + local1929[5] * this.anIntArray30[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray29[local784] + local1929[7] * this.anIntArray31[local784] + local1929[8] * this.anIntArray30[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray29[local784] = local2197;
							this.anIntArray31[local784] = local2201;
							this.anIntArray30[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "cq", descriptor = "(I[IIIIZI[I)V", line = 1600)
	@Override
	void method6870(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
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
			anInt379 = 0;
			anInt380 = 0;
			anInt381 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				local33 = arg1[local26];
				if (local33 < this.anIntArrayArray1.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray1[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local53]) != 0) {
							anInt379 += this.anIntArray29[local53];
							anInt380 += this.anIntArray31[local53];
							anInt381 += this.anIntArray30[local53];
							local18++;
						}
					}
				}
			}
			if (local18 > 0) {
				anInt379 = anInt379 / local18 + arg2;
				anInt380 = anInt380 / local18 + arg3;
				anInt381 = anInt381 / local18 + arg4;
				aBoolean62 = true;
			} else {
				anInt379 = arg2;
				anInt380 = arg3;
				anInt381 = arg4;
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
				if (local26 < this.anIntArrayArray1.length) {
					local228 = this.anIntArrayArray1[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
							this.anIntArray29[local45] += arg2;
							this.anIntArray31[local45] += arg3;
							this.anIntArray30[local45] += arg4;
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
					if (local26 < this.anIntArrayArray1.length) {
						local228 = this.anIntArrayArray1[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
								this.anIntArray29[local45] -= anInt379;
								this.anIntArray31[local45] -= anInt380;
								this.anIntArray30[local45] -= anInt381;
								if (arg4 != 0) {
									local53 = Class436.anIntArray464[arg4];
									local343 = Class436.anIntArray463[arg4];
									local365 = this.anIntArray31[local45] * local53 + this.anIntArray29[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = this.anIntArray31[local45] * local343 - this.anIntArray29[local45] * local53 + 16383 >> 14;
									this.anIntArray29[local45] = local365;
								}
								if (arg2 != 0) {
									local53 = Class436.anIntArray464[arg2];
									local343 = Class436.anIntArray463[arg2];
									local365 = this.anIntArray31[local45] * local343 - this.anIntArray30[local45] * local53 + 16383 >> 14;
									this.anIntArray30[local45] = this.anIntArray31[local45] * local53 + this.anIntArray30[local45] * local343 + 16383 >> 14;
									this.anIntArray31[local45] = local365;
								}
								if (arg3 != 0) {
									local53 = Class436.anIntArray464[arg3];
									local343 = Class436.anIntArray463[arg3];
									local365 = this.anIntArray30[local45] * local53 + this.anIntArray29[local45] * local343 + 16383 >> 14;
									this.anIntArray30[local45] = this.anIntArray30[local45] * local343 - this.anIntArray29[local45] * local53 + 16383 >> 14;
									this.anIntArray29[local45] = local365;
								}
								this.anIntArray29[local45] += anInt379;
								this.anIntArray31[local45] += anInt380;
								this.anIntArray30[local45] += anInt381;
							}
						}
					}
				}
				if (arg5) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray1.length) {
							local228 = this.anIntArrayArray1[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
									local53 = this.anIntArray33[local45];
									local343 = this.anIntArray33[local45 + 1];
									for (local365 = local53; local365 < local343 && this.aShortArray18[local365] != 0; local365++) {
										local387 = (this.aShortArray18[local365] & 0xFFFF) - 1;
										if (arg4 != 0) {
											local422 = Class436.anIntArray464[arg4];
											local426 = Class436.anIntArray463[arg4];
											local430 = this.aShortArray9[local387] * local422 + this.aShortArray10[local387] * local426 + 16383 >> 14;
											this.aShortArray9[local387] = (short) (this.aShortArray9[local387] * local426 - this.aShortArray10[local387] * local422 + 16383 >> 14);
											this.aShortArray10[local387] = (short) local430;
										}
										if (arg2 != 0) {
											local422 = Class436.anIntArray464[arg2];
											local426 = Class436.anIntArray463[arg2];
											local430 = this.aShortArray9[local387] * local426 - this.aShortArray11[local387] * local422 + 16383 >> 14;
											this.aShortArray11[local387] = (short) (this.aShortArray9[local387] * local422 + this.aShortArray11[local387] * local426 + 16383 >> 14);
											this.aShortArray9[local387] = (short) local430;
										}
										if (arg3 != 0) {
											local422 = Class436.anIntArray464[arg3];
											local426 = Class436.anIntArray463[arg3];
											local430 = this.aShortArray11[local387] * local422 + this.aShortArray10[local387] * local426 + 16383 >> 14;
											this.aShortArray11[local387] = (short) (this.aShortArray11[local387] * local426 - this.aShortArray10[local387] * local422 + 16383 >> 14);
											this.aShortArray10[local387] = (short) local430;
										}
									}
								}
							}
						}
					}
					if (this.aClass172_2 == null && this.aClass172_3 != null) {
						this.aClass172_3.anInterface14_6 = null;
					}
					if (this.aClass172_2 != null) {
						this.aClass172_2.anInterface14_6 = null;
					}
				}
			} else {
				local18 = arg7[9] << 4;
				local26 = arg7[10] << 4;
				local33 = arg7[11] << 4;
				local230 = arg7[12] << 4;
				local45 = arg7[13] << 4;
				local53 = arg7[14] << 4;
				if (aBoolean62) {
					local343 = arg7[0] * anInt379 + arg7[3] * anInt380 + arg7[6] * anInt381 + 8192 >> 14;
					local365 = arg7[1] * anInt379 + arg7[4] * anInt380 + arg7[7] * anInt381 + 8192 >> 14;
					local387 = arg7[2] * anInt379 + arg7[5] * anInt380 + arg7[8] * anInt381 + 8192 >> 14;
					local343 += local230;
					local365 += local45;
					local387 += local53;
					anInt379 = local343;
					anInt380 = local365;
					anInt381 = local387;
					aBoolean62 = false;
				}
				@Pc(410) int[] local410 = new int[9];
				local365 = Class436.anIntArray463[arg2];
				local387 = Class436.anIntArray464[arg2];
				local422 = Class436.anIntArray463[arg3];
				local426 = Class436.anIntArray464[arg3];
				local430 = Class436.anIntArray463[arg4];
				local434 = Class436.anIntArray464[arg4];
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
				@Pc(578) int local578 = local410[0] * -anInt379 + local410[1] * -anInt380 + local410[2] * -anInt381 + 8192 >> 14;
				local603 = local410[3] * -anInt379 + local410[4] * -anInt380 + local410[5] * -anInt381 + 8192 >> 14;
				local628 = local410[6] * -anInt379 + local410[7] * -anInt380 + local410[8] * -anInt381 + 8192 >> 14;
				local632 = local578 + anInt379;
				@Pc(636) int local636 = local603 + anInt380;
				local640 = local628 + anInt381;
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
					if (local917 < this.anIntArrayArray1.length) {
						@Pc(927) int[] local927 = this.anIntArrayArray1[local917];
						for (@Pc(929) int local929 = 0; local929 < local927.length; local929++) {
							@Pc(937) int local937 = local927[local929];
							if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local937]) != 0) {
								@Pc(979) int local979 = local777[0] * this.anIntArray29[local937] + local777[1] * this.anIntArray31[local937] + local777[2] * this.anIntArray30[local937] + 8192 >> 14;
								@Pc(1010) int local1010 = local777[3] * this.anIntArray29[local937] + local777[4] * this.anIntArray31[local937] + local777[5] * this.anIntArray30[local937] + 8192 >> 14;
								@Pc(1041) int local1041 = local777[6] * this.anIntArray29[local937] + local777[7] * this.anIntArray31[local937] + local777[8] * this.anIntArray30[local937] + 8192 >> 14;
								@Pc(1045) int local1045 = local979 + local779;
								@Pc(1049) int local1049 = local1010 + local784;
								@Pc(1053) int local1053 = local1041 + local789;
								this.anIntArray29[local937] = local1045;
								this.anIntArray31[local937] = local1049;
								this.anIntArray30[local937] = local1053;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2452) Class189 local2452;
			@Pc(2457) Class176 local2457;
			if (arg0 == 5) {
				if (this.anIntArrayArray2 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray2.length) {
							local228 = this.anIntArrayArray2[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local45 = local228[local230];
								if (this.aShortArray17 == null || (arg6 & this.aShortArray17[local45]) != 0) {
									local53 = (this.aByteArray10[local45] & 0xFF) + arg2 * 8;
									if (local53 < 0) {
										local53 = 0;
									} else if (local53 > 255) {
										local53 = 255;
									}
									this.aByteArray10[local45] = (byte) local53;
									if (this.aClass172_3 != null) {
										this.aClass172_3.anInterface14_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass189Array1 != null) {
						for (local18 = 0; local18 < this.anInt377; local18++) {
							local2452 = this.aClass189Array1[local18];
							local2457 = this.aClass176Array1[local18];
							local2457.anInt3302 = local2457.anInt3302 & 0xFFFFFF | 255 - (this.aByteArray10[local2452.anInt3339] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2686) Class176 local2686;
				if (arg0 == 8) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local228 = this.anIntArrayArray3[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass176Array1[local228[local230]];
									local2686.anInt3301 += arg2;
									local2686.anInt3300 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local228 = this.anIntArrayArray3[local26];
								for (local230 = 0; local230 < local228.length; local230++) {
									local2686 = this.aClass176Array1[local228[local230]];
									local2686.anInt3299 = local2686.anInt3299 * arg2 >> 7;
									local2686.anInt3298 = local2686.anInt3298 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray3 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray3.length) {
							local228 = this.anIntArrayArray3[local26];
							for (local230 = 0; local230 < local228.length; local230++) {
								local2686 = this.aClass176Array1[local228[local230]];
								local2686.anInt3303 = local2686.anInt3303 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray2 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray2.length) {
						local228 = this.anIntArrayArray2[local26];
						for (local230 = 0; local230 < local228.length; local230++) {
							local45 = local228[local230];
							if (this.aShortArray17 == null || (arg6 & this.aShortArray17[local45]) != 0) {
								local53 = this.aShortArray13[local45] & 0xFFFF;
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
								this.aShortArray13[local45] = (short) (local2553 << 10 | local365 << 7 | local387);
								if (this.aClass172_3 != null) {
									this.aClass172_3.anInterface14_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass189Array1 != null) {
					for (local18 = 0; local18 < this.anInt377; local18++) {
						local2452 = this.aClass189Array1[local18];
						local2457 = this.aClass176Array1[local18];
						local2457.anInt3302 = local2457.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local2452.anInt3339] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray1.length) {
					local228 = this.anIntArrayArray1[local26];
					for (local230 = 0; local230 < local228.length; local230++) {
						local45 = local228[local230];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local45]) != 0) {
							this.anIntArray29[local45] -= anInt379;
							this.anIntArray31[local45] -= anInt380;
							this.anIntArray30[local45] -= anInt381;
							this.anIntArray29[local45] = this.anIntArray29[local45] * arg2 >> 7;
							this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
							this.anIntArray30[local45] = this.anIntArray30[local45] * arg4 >> 7;
							this.anIntArray29[local45] += anInt379;
							this.anIntArray31[local45] += anInt380;
							this.anIntArray30[local45] += anInt381;
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
			if (aBoolean62) {
				local343 = arg7[0] * anInt379 + arg7[3] * anInt380 + arg7[6] * anInt381 + 8192 >> 14;
				local365 = arg7[1] * anInt379 + arg7[4] * anInt380 + arg7[7] * anInt381 + 8192 >> 14;
				local387 = arg7[2] * anInt379 + arg7[5] * anInt380 + arg7[8] * anInt381 + 8192 >> 14;
				local343 += local230;
				local365 += local45;
				local387 += local53;
				anInt379 = local343;
				anInt380 = local365;
				anInt381 = local387;
				aBoolean62 = false;
			}
			local343 = arg2 << 15 >> 7;
			local365 = arg3 << 15 >> 7;
			local387 = arg4 << 15 >> 7;
			local422 = local343 * -anInt379 + 8192 >> 14;
			local426 = local365 * -anInt380 + 8192 >> 14;
			local430 = local387 * -anInt381 + 8192 >> 14;
			local434 = local422 + anInt379;
			local442 = local426 + anInt380;
			local450 = local430 + anInt381;
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
				if (local655 < this.anIntArrayArray1.length) {
					local777 = this.anIntArrayArray1[local655];
					for (local779 = 0; local779 < local777.length; local779++) {
						local784 = local777[local779];
						if (this.aShortArray12 == null || (arg6 & this.aShortArray12[local784]) != 0) {
							local789 = local1929[0] * this.anIntArray29[local784] + local1929[1] * this.anIntArray31[local784] + local1929[2] * this.anIntArray30[local784] + 8192 >> 14;
							local791 = local1929[3] * this.anIntArray29[local784] + local1929[4] * this.anIntArray31[local784] + local1929[5] * this.anIntArray30[local784] + 8192 >> 14;
							local917 = local1929[6] * this.anIntArray29[local784] + local1929[7] * this.anIntArray31[local784] + local1929[8] * this.anIntArray30[local784] + 8192 >> 14;
							@Pc(2197) int local2197 = local789 + local640;
							@Pc(2201) int local2201 = local791 + local1936;
							@Pc(2205) int local2205 = local917 + local645;
							this.anIntArray29[local784] = local2197;
							this.anIntArray31[local784] = local2201;
							this.anIntArray30[local784] = local2205;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ao", descriptor = "(IIII)V", line = 2057)
	@Override
	void method6908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			anInt379 = 0;
			anInt380 = 0;
			anInt381 = 0;
			for (local11 = 0; local11 < this.anInt373; local11++) {
				anInt379 += this.anIntArray29[local11];
				anInt380 += this.anIntArray31[local11];
				anInt381 += this.anIntArray30[local11];
				local3++;
			}
			if (local3 > 0) {
				anInt379 = anInt379 / local3 + arg1;
				anInt380 = anInt380 / local3 + arg2;
				anInt381 = anInt381 / local3 + arg3;
			} else {
				anInt379 = arg1;
				anInt380 = arg2;
				anInt381 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt373; local3++) {
				this.anIntArray29[local3] += arg1;
				this.anIntArray31[local3] += arg2;
				this.anIntArray30[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt373; local3++) {
					this.anIntArray29[local3] -= anInt379;
					this.anIntArray31[local3] -= anInt380;
					this.anIntArray30[local3] -= anInt381;
					if (arg3 != 0) {
						local11 = Class436.anIntArray464[arg3];
						local146 = Class436.anIntArray463[arg3];
						local164 = this.anIntArray31[local3] * local11 + this.anIntArray29[local3] * local146 + 16383 >> 14;
						this.anIntArray31[local3] = this.anIntArray31[local3] * local146 - this.anIntArray29[local3] * local11 + 16383 >> 14;
						this.anIntArray29[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class436.anIntArray464[arg1];
						local146 = Class436.anIntArray463[arg1];
						local164 = this.anIntArray31[local3] * local146 - this.anIntArray30[local3] * local11 + 16383 >> 14;
						this.anIntArray30[local3] = this.anIntArray31[local3] * local11 + this.anIntArray30[local3] * local146 + 16383 >> 14;
						this.anIntArray31[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class436.anIntArray464[arg2];
						local146 = Class436.anIntArray463[arg2];
						local164 = this.anIntArray30[local3] * local11 + this.anIntArray29[local3] * local146 + 16383 >> 14;
						this.anIntArray30[local3] = this.anIntArray30[local3] * local146 - this.anIntArray29[local3] * local11 + 16383 >> 14;
						this.anIntArray29[local3] = local164;
					}
					this.anIntArray29[local3] += anInt379;
					this.anIntArray31[local3] += anInt380;
					this.anIntArray30[local3] += anInt381;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt373; local3++) {
					this.anIntArray29[local3] -= anInt379;
					this.anIntArray31[local3] -= anInt380;
					this.anIntArray30[local3] -= anInt381;
					this.anIntArray29[local3] = this.anIntArray29[local3] * arg1 / 128;
					this.anIntArray31[local3] = this.anIntArray31[local3] * arg2 / 128;
					this.anIntArray30[local3] = this.anIntArray30[local3] * arg3 / 128;
					this.anIntArray29[local3] += anInt379;
					this.anIntArray31[local3] += anInt380;
					this.anIntArray30[local3] += anInt381;
				}
			} else {
				@Pc(480) Class189 local480;
				@Pc(485) Class176 local485;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt371; local3++) {
						local11 = (this.aByteArray10[local3] & 0xFF) + arg1 * 8;
						if (local11 < 0) {
							local11 = 0;
						} else if (local11 > 255) {
							local11 = 255;
						}
						this.aByteArray10[local3] = (byte) local11;
					}
					if (this.aClass172_3 != null) {
						this.aClass172_3.anInterface14_6 = null;
					}
					if (this.aClass189Array1 != null) {
						for (local3 = 0; local3 < this.anInt377; local3++) {
							local480 = this.aClass189Array1[local3];
							local485 = this.aClass176Array1[local3];
							local485.anInt3302 = local485.anInt3302 & 0xFFFFFF | 255 - (this.aByteArray10[local480.anInt3339] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt371; local3++) {
						local11 = this.aShortArray13[local3] & 0xFFFF;
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
						this.aShortArray13[local3] = (short) (local544 << 10 | local164 << 7 | local538);
					}
					if (this.aClass172_3 != null) {
						this.aClass172_3.anInterface14_6 = null;
					}
					if (this.aClass189Array1 != null) {
						for (local3 = 0; local3 < this.anInt377; local3++) {
							local480 = this.aClass189Array1[local3];
							local485 = this.aClass176Array1[local3];
							local485.anInt3302 = local485.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local480.anInt3339] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(651) Class176 local651;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt377; local3++) {
							local651 = this.aClass176Array1[local3];
							local651.anInt3301 += arg1;
							local651.anInt3300 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt377; local3++) {
							local651 = this.aClass176Array1[local3];
							local651.anInt3299 = local651.anInt3299 * arg1 >> 7;
							local651.anInt3298 = local651.anInt3298 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt377; local3++) {
							local651 = this.aClass176Array1[local3];
							local651.anInt3303 = local651.anInt3303 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "cy", descriptor = "(IIII)V", line = 2057)
	@Override
	void method6878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3;
		@Pc(11) int local11;
		if (arg0 == 0) {
			local3 = 0;
			anInt379 = 0;
			anInt380 = 0;
			anInt381 = 0;
			for (local11 = 0; local11 < this.anInt373; local11++) {
				anInt379 += this.anIntArray29[local11];
				anInt380 += this.anIntArray31[local11];
				anInt381 += this.anIntArray30[local11];
				local3++;
			}
			if (local3 > 0) {
				anInt379 = anInt379 / local3 + arg1;
				anInt380 = anInt380 / local3 + arg2;
				anInt381 = anInt381 / local3 + arg3;
			} else {
				anInt379 = arg1;
				anInt380 = arg2;
				anInt381 = arg3;
			}
		} else if (arg0 == 1) {
			for (local3 = 0; local3 < this.anInt373; local3++) {
				this.anIntArray29[local3] += arg1;
				this.anIntArray31[local3] += arg2;
				this.anIntArray30[local3] += arg3;
			}
		} else {
			@Pc(146) int local146;
			@Pc(164) int local164;
			if (arg0 == 2) {
				for (local3 = 0; local3 < this.anInt373; local3++) {
					this.anIntArray29[local3] -= anInt379;
					this.anIntArray31[local3] -= anInt380;
					this.anIntArray30[local3] -= anInt381;
					if (arg3 != 0) {
						local11 = Class436.anIntArray464[arg3];
						local146 = Class436.anIntArray463[arg3];
						local164 = this.anIntArray31[local3] * local11 + this.anIntArray29[local3] * local146 + 16383 >> 14;
						this.anIntArray31[local3] = this.anIntArray31[local3] * local146 - this.anIntArray29[local3] * local11 + 16383 >> 14;
						this.anIntArray29[local3] = local164;
					}
					if (arg1 != 0) {
						local11 = Class436.anIntArray464[arg1];
						local146 = Class436.anIntArray463[arg1];
						local164 = this.anIntArray31[local3] * local146 - this.anIntArray30[local3] * local11 + 16383 >> 14;
						this.anIntArray30[local3] = this.anIntArray31[local3] * local11 + this.anIntArray30[local3] * local146 + 16383 >> 14;
						this.anIntArray31[local3] = local164;
					}
					if (arg2 != 0) {
						local11 = Class436.anIntArray464[arg2];
						local146 = Class436.anIntArray463[arg2];
						local164 = this.anIntArray30[local3] * local11 + this.anIntArray29[local3] * local146 + 16383 >> 14;
						this.anIntArray30[local3] = this.anIntArray30[local3] * local146 - this.anIntArray29[local3] * local11 + 16383 >> 14;
						this.anIntArray29[local3] = local164;
					}
					this.anIntArray29[local3] += anInt379;
					this.anIntArray31[local3] += anInt380;
					this.anIntArray30[local3] += anInt381;
				}
			} else if (arg0 == 3) {
				for (local3 = 0; local3 < this.anInt373; local3++) {
					this.anIntArray29[local3] -= anInt379;
					this.anIntArray31[local3] -= anInt380;
					this.anIntArray30[local3] -= anInt381;
					this.anIntArray29[local3] = this.anIntArray29[local3] * arg1 / 128;
					this.anIntArray31[local3] = this.anIntArray31[local3] * arg2 / 128;
					this.anIntArray30[local3] = this.anIntArray30[local3] * arg3 / 128;
					this.anIntArray29[local3] += anInt379;
					this.anIntArray31[local3] += anInt380;
					this.anIntArray30[local3] += anInt381;
				}
			} else {
				@Pc(480) Class189 local480;
				@Pc(485) Class176 local485;
				if (arg0 == 5) {
					for (local3 = 0; local3 < this.anInt371; local3++) {
						local11 = (this.aByteArray10[local3] & 0xFF) + arg1 * 8;
						if (local11 < 0) {
							local11 = 0;
						} else if (local11 > 255) {
							local11 = 255;
						}
						this.aByteArray10[local3] = (byte) local11;
					}
					if (this.aClass172_3 != null) {
						this.aClass172_3.anInterface14_6 = null;
					}
					if (this.aClass189Array1 != null) {
						for (local3 = 0; local3 < this.anInt377; local3++) {
							local480 = this.aClass189Array1[local3];
							local485 = this.aClass176Array1[local3];
							local485.anInt3302 = local485.anInt3302 & 0xFFFFFF | 255 - (this.aByteArray10[local480.anInt3339] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local3 = 0; local3 < this.anInt371; local3++) {
						local11 = this.aShortArray13[local3] & 0xFFFF;
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
						this.aShortArray13[local3] = (short) (local544 << 10 | local164 << 7 | local538);
					}
					if (this.aClass172_3 != null) {
						this.aClass172_3.anInterface14_6 = null;
					}
					if (this.aClass189Array1 != null) {
						for (local3 = 0; local3 < this.anInt377; local3++) {
							local480 = this.aClass189Array1[local3];
							local485 = this.aClass176Array1[local3];
							local485.anInt3302 = local485.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local480.anInt3339] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(651) Class176 local651;
					if (arg0 == 8) {
						for (local3 = 0; local3 < this.anInt377; local3++) {
							local651 = this.aClass176Array1[local3];
							local651.anInt3301 += arg1;
							local651.anInt3300 += arg2;
						}
					} else if (arg0 == 10) {
						for (local3 = 0; local3 < this.anInt377; local3++) {
							local651 = this.aClass176Array1[local3];
							local651.anInt3299 = local651.anInt3299 * arg1 >> 7;
							local651.anInt3298 = local651.anInt3298 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local3 = 0; local3 < this.anInt377; local3++) {
							local651 = this.aClass176Array1[local3];
							local651.anInt3303 = local651.anInt3303 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ag", descriptor = "(I[IIIIIZ)V", line = 2202)
	@Override
	void method6812(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			anInt379 = 0;
			anInt380 = 0;
			anInt381 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray1.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray1[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						anInt379 += this.anIntArray29[local53];
						anInt380 += this.anIntArray31[local53];
						anInt381 += this.anIntArray30[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				anInt379 = anInt379 / local18 + local8;
				anInt380 = anInt380 / local18 + local12;
				anInt381 = anInt381 / local18 + local16;
			} else {
				anInt379 = local8;
				anInt380 = local12;
				anInt381 = local16;
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
				if (local26 < this.anIntArrayArray1.length) {
					local141 = this.anIntArrayArray1[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray29[local45] += local8;
						this.anIntArray31[local45] += local12;
						this.anIntArray30[local45] += local16;
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
				if (local26 < this.anIntArrayArray1.length) {
					local141 = this.anIntArrayArray1[local26];
					if ((arg5 & 0x1) == 0) {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray29[local45] -= anInt379;
							this.anIntArray31[local45] -= anInt380;
							this.anIntArray30[local45] -= anInt381;
							if (arg4 != 0) {
								local53 = Class436.anIntArray464[arg4];
								local250 = Class436.anIntArray463[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							if (arg2 != 0) {
								local53 = Class436.anIntArray464[arg2];
								local250 = Class436.anIntArray463[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray30[local45] * local53 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray31[local45] * local53 + this.anIntArray30[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class436.anIntArray464[arg3];
								local250 = Class436.anIntArray463[arg3];
								local268 = this.anIntArray30[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray30[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							this.anIntArray29[local45] += anInt379;
							this.anIntArray31[local45] += anInt380;
							this.anIntArray30[local45] += anInt381;
						}
					} else {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray29[local45] -= anInt379;
							this.anIntArray31[local45] -= anInt380;
							this.anIntArray30[local45] -= anInt381;
							if (arg2 != 0) {
								local53 = Class436.anIntArray464[arg2];
								local250 = Class436.anIntArray463[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray30[local45] * local53 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray31[local45] * local53 + this.anIntArray30[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg4 != 0) {
								local53 = Class436.anIntArray464[arg4];
								local250 = Class436.anIntArray463[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class436.anIntArray464[arg3];
								local250 = Class436.anIntArray463[arg3];
								local268 = this.anIntArray30[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray30[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							this.anIntArray29[local45] += anInt379;
							this.anIntArray31[local45] += anInt380;
							this.anIntArray30[local45] += anInt381;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray1.length) {
						local141 = this.anIntArrayArray1[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray33[local45];
							local250 = this.anIntArray33[local45 + 1];
							for (local268 = local53; local268 < local250 && this.aShortArray18[local268] != 0; local268++) {
								local716 = (this.aShortArray18[local268] & 0xFFFF) - 1;
								@Pc(722) int local722;
								@Pc(726) int local726;
								@Pc(744) int local744;
								if (arg4 != 0) {
									local722 = Class436.anIntArray464[arg4];
									local726 = Class436.anIntArray463[arg4];
									local744 = this.aShortArray9[local716] * local722 + this.aShortArray10[local716] * local726 + 16383 >> 14;
									this.aShortArray9[local716] = (short) (this.aShortArray9[local716] * local726 - this.aShortArray10[local716] * local722 + 16383 >> 14);
									this.aShortArray10[local716] = (short) local744;
								}
								if (arg2 != 0) {
									local722 = Class436.anIntArray464[arg2];
									local726 = Class436.anIntArray463[arg2];
									local744 = this.aShortArray9[local716] * local726 - this.aShortArray11[local716] * local722 + 16383 >> 14;
									this.aShortArray11[local716] = (short) (this.aShortArray9[local716] * local722 + this.aShortArray11[local716] * local726 + 16383 >> 14);
									this.aShortArray9[local716] = (short) local744;
								}
								if (arg3 != 0) {
									local722 = Class436.anIntArray464[arg3];
									local726 = Class436.anIntArray463[arg3];
									local744 = this.aShortArray11[local716] * local722 + this.aShortArray10[local716] * local726 + 16383 >> 14;
									this.aShortArray11[local716] = (short) (this.aShortArray11[local716] * local726 - this.aShortArray10[local716] * local722 + 16383 >> 14);
									this.aShortArray10[local716] = (short) local744;
								}
							}
						}
					}
				}
				if (this.aClass172_2 == null && this.aClass172_3 != null) {
					this.aClass172_3.anInterface14_6 = null;
				}
				if (this.aClass172_2 != null) {
					this.aClass172_2.anInterface14_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray1.length) {
					local141 = this.anIntArrayArray1[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray29[local45] -= anInt379;
						this.anIntArray31[local45] -= anInt380;
						this.anIntArray30[local45] -= anInt381;
						this.anIntArray29[local45] = this.anIntArray29[local45] * arg2 >> 7;
						this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
						this.anIntArray30[local45] = this.anIntArray30[local45] * arg4 >> 7;
						this.anIntArray29[local45] += anInt379;
						this.anIntArray31[local45] += anInt380;
						this.anIntArray30[local45] += anInt381;
					}
				}
			}
		} else {
			@Pc(1119) Class189 local1119;
			@Pc(1124) Class176 local1124;
			if (arg0 == 5) {
				if (this.anIntArrayArray2 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray2.length) {
							local141 = this.anIntArrayArray2[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local45 = local141[local143];
								local53 = (this.aByteArray10[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray10[local45] = (byte) local53;
							}
							if (local141.length > 0 && this.aClass172_3 != null) {
								this.aClass172_3.anInterface14_6 = null;
							}
						}
					}
					if (this.aClass189Array1 != null) {
						for (local18 = 0; local18 < this.anInt377; local18++) {
							local1119 = this.aClass189Array1[local18];
							local1124 = this.aClass176Array1[local18];
							local1124.anInt3302 = local1124.anInt3302 & 0xFFFFFF | 255 - (this.aByteArray10[local1119.anInt3339] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1345) Class176 local1345;
				if (arg0 == 8) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local141 = this.anIntArrayArray3[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass176Array1[local141[local143]];
									local1345.anInt3301 += arg2;
									local1345.anInt3300 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local141 = this.anIntArrayArray3[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass176Array1[local141[local143]];
									local1345.anInt3299 = local1345.anInt3299 * arg2 >> 7;
									local1345.anInt3298 = local1345.anInt3298 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray3 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray3.length) {
							local141 = this.anIntArrayArray3[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local1345 = this.aClass176Array1[local141[local143]];
								local1345.anInt3303 = local1345.anInt3303 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray2 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray2.length) {
						local141 = this.anIntArrayArray2[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.aShortArray13[local45] & 0xFFFF;
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
							this.aShortArray13[local45] = (short) (local1209 << 10 | local268 << 7 | local716);
						}
						if (local141.length > 0 && this.aClass172_3 != null) {
							this.aClass172_3.anInterface14_6 = null;
						}
					}
				}
				if (this.aClass189Array1 != null) {
					for (local18 = 0; local18 < this.anInt377; local18++) {
						local1119 = this.aClass189Array1[local18];
						local1124 = this.aClass176Array1[local18];
						local1124.anInt3302 = local1124.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local1119.anInt3339] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "cu", descriptor = "(I[IIIIIZ)V", line = 2202)
	@Override
	void method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			anInt379 = 0;
			anInt380 = 0;
			anInt381 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray1.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray1[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						anInt379 += this.anIntArray29[local53];
						anInt380 += this.anIntArray31[local53];
						anInt381 += this.anIntArray30[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				anInt379 = anInt379 / local18 + local8;
				anInt380 = anInt380 / local18 + local12;
				anInt381 = anInt381 / local18 + local16;
			} else {
				anInt379 = local8;
				anInt380 = local12;
				anInt381 = local16;
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
				if (local26 < this.anIntArrayArray1.length) {
					local141 = this.anIntArrayArray1[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray29[local45] += local8;
						this.anIntArray31[local45] += local12;
						this.anIntArray30[local45] += local16;
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
				if (local26 < this.anIntArrayArray1.length) {
					local141 = this.anIntArrayArray1[local26];
					if ((arg5 & 0x1) == 0) {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray29[local45] -= anInt379;
							this.anIntArray31[local45] -= anInt380;
							this.anIntArray30[local45] -= anInt381;
							if (arg4 != 0) {
								local53 = Class436.anIntArray464[arg4];
								local250 = Class436.anIntArray463[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							if (arg2 != 0) {
								local53 = Class436.anIntArray464[arg2];
								local250 = Class436.anIntArray463[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray30[local45] * local53 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray31[local45] * local53 + this.anIntArray30[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class436.anIntArray464[arg3];
								local250 = Class436.anIntArray463[arg3];
								local268 = this.anIntArray30[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray30[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							this.anIntArray29[local45] += anInt379;
							this.anIntArray31[local45] += anInt380;
							this.anIntArray30[local45] += anInt381;
						}
					} else {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray29[local45] -= anInt379;
							this.anIntArray31[local45] -= anInt380;
							this.anIntArray30[local45] -= anInt381;
							if (arg2 != 0) {
								local53 = Class436.anIntArray464[arg2];
								local250 = Class436.anIntArray463[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray30[local45] * local53 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray31[local45] * local53 + this.anIntArray30[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg4 != 0) {
								local53 = Class436.anIntArray464[arg4];
								local250 = Class436.anIntArray463[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class436.anIntArray464[arg3];
								local250 = Class436.anIntArray463[arg3];
								local268 = this.anIntArray30[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray30[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							this.anIntArray29[local45] += anInt379;
							this.anIntArray31[local45] += anInt380;
							this.anIntArray30[local45] += anInt381;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray1.length) {
						local141 = this.anIntArrayArray1[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray33[local45];
							local250 = this.anIntArray33[local45 + 1];
							for (local268 = local53; local268 < local250 && this.aShortArray18[local268] != 0; local268++) {
								local716 = (this.aShortArray18[local268] & 0xFFFF) - 1;
								@Pc(722) int local722;
								@Pc(726) int local726;
								@Pc(744) int local744;
								if (arg4 != 0) {
									local722 = Class436.anIntArray464[arg4];
									local726 = Class436.anIntArray463[arg4];
									local744 = this.aShortArray9[local716] * local722 + this.aShortArray10[local716] * local726 + 16383 >> 14;
									this.aShortArray9[local716] = (short) (this.aShortArray9[local716] * local726 - this.aShortArray10[local716] * local722 + 16383 >> 14);
									this.aShortArray10[local716] = (short) local744;
								}
								if (arg2 != 0) {
									local722 = Class436.anIntArray464[arg2];
									local726 = Class436.anIntArray463[arg2];
									local744 = this.aShortArray9[local716] * local726 - this.aShortArray11[local716] * local722 + 16383 >> 14;
									this.aShortArray11[local716] = (short) (this.aShortArray9[local716] * local722 + this.aShortArray11[local716] * local726 + 16383 >> 14);
									this.aShortArray9[local716] = (short) local744;
								}
								if (arg3 != 0) {
									local722 = Class436.anIntArray464[arg3];
									local726 = Class436.anIntArray463[arg3];
									local744 = this.aShortArray11[local716] * local722 + this.aShortArray10[local716] * local726 + 16383 >> 14;
									this.aShortArray11[local716] = (short) (this.aShortArray11[local716] * local726 - this.aShortArray10[local716] * local722 + 16383 >> 14);
									this.aShortArray10[local716] = (short) local744;
								}
							}
						}
					}
				}
				if (this.aClass172_2 == null && this.aClass172_3 != null) {
					this.aClass172_3.anInterface14_6 = null;
				}
				if (this.aClass172_2 != null) {
					this.aClass172_2.anInterface14_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray1.length) {
					local141 = this.anIntArrayArray1[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray29[local45] -= anInt379;
						this.anIntArray31[local45] -= anInt380;
						this.anIntArray30[local45] -= anInt381;
						this.anIntArray29[local45] = this.anIntArray29[local45] * arg2 >> 7;
						this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
						this.anIntArray30[local45] = this.anIntArray30[local45] * arg4 >> 7;
						this.anIntArray29[local45] += anInt379;
						this.anIntArray31[local45] += anInt380;
						this.anIntArray30[local45] += anInt381;
					}
				}
			}
		} else {
			@Pc(1119) Class189 local1119;
			@Pc(1124) Class176 local1124;
			if (arg0 == 5) {
				if (this.anIntArrayArray2 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray2.length) {
							local141 = this.anIntArrayArray2[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local45 = local141[local143];
								local53 = (this.aByteArray10[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray10[local45] = (byte) local53;
							}
							if (local141.length > 0 && this.aClass172_3 != null) {
								this.aClass172_3.anInterface14_6 = null;
							}
						}
					}
					if (this.aClass189Array1 != null) {
						for (local18 = 0; local18 < this.anInt377; local18++) {
							local1119 = this.aClass189Array1[local18];
							local1124 = this.aClass176Array1[local18];
							local1124.anInt3302 = local1124.anInt3302 & 0xFFFFFF | 255 - (this.aByteArray10[local1119.anInt3339] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1345) Class176 local1345;
				if (arg0 == 8) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local141 = this.anIntArrayArray3[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass176Array1[local141[local143]];
									local1345.anInt3301 += arg2;
									local1345.anInt3300 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local141 = this.anIntArrayArray3[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass176Array1[local141[local143]];
									local1345.anInt3299 = local1345.anInt3299 * arg2 >> 7;
									local1345.anInt3298 = local1345.anInt3298 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray3 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray3.length) {
							local141 = this.anIntArrayArray3[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local1345 = this.aClass176Array1[local141[local143]];
								local1345.anInt3303 = local1345.anInt3303 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray2 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray2.length) {
						local141 = this.anIntArrayArray2[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.aShortArray13[local45] & 0xFFFF;
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
							this.aShortArray13[local45] = (short) (local1209 << 10 | local268 << 7 | local716);
						}
						if (local141.length > 0 && this.aClass172_3 != null) {
							this.aClass172_3.anInterface14_6 = null;
						}
					}
				}
				if (this.aClass189Array1 != null) {
					for (local18 = 0; local18 < this.anInt377; local18++) {
						local1119 = this.aClass189Array1[local18];
						local1124 = this.aClass176Array1[local18];
						local1124.anInt3302 = local1124.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local1119.anInt3339] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "cm", descriptor = "(I[IIIIIZ)V", line = 2202)
	@Override
	void method6873(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			anInt379 = 0;
			anInt380 = 0;
			anInt381 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray1.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray1[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						anInt379 += this.anIntArray29[local53];
						anInt380 += this.anIntArray31[local53];
						anInt381 += this.anIntArray30[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				anInt379 = anInt379 / local18 + local8;
				anInt380 = anInt380 / local18 + local12;
				anInt381 = anInt381 / local18 + local16;
			} else {
				anInt379 = local8;
				anInt380 = local12;
				anInt381 = local16;
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
				if (local26 < this.anIntArrayArray1.length) {
					local141 = this.anIntArrayArray1[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray29[local45] += local8;
						this.anIntArray31[local45] += local12;
						this.anIntArray30[local45] += local16;
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
				if (local26 < this.anIntArrayArray1.length) {
					local141 = this.anIntArrayArray1[local26];
					if ((arg5 & 0x1) == 0) {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray29[local45] -= anInt379;
							this.anIntArray31[local45] -= anInt380;
							this.anIntArray30[local45] -= anInt381;
							if (arg4 != 0) {
								local53 = Class436.anIntArray464[arg4];
								local250 = Class436.anIntArray463[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							if (arg2 != 0) {
								local53 = Class436.anIntArray464[arg2];
								local250 = Class436.anIntArray463[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray30[local45] * local53 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray31[local45] * local53 + this.anIntArray30[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class436.anIntArray464[arg3];
								local250 = Class436.anIntArray463[arg3];
								local268 = this.anIntArray30[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray30[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							this.anIntArray29[local45] += anInt379;
							this.anIntArray31[local45] += anInt380;
							this.anIntArray30[local45] += anInt381;
						}
					} else {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray29[local45] -= anInt379;
							this.anIntArray31[local45] -= anInt380;
							this.anIntArray30[local45] -= anInt381;
							if (arg2 != 0) {
								local53 = Class436.anIntArray464[arg2];
								local250 = Class436.anIntArray463[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray30[local45] * local53 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray31[local45] * local53 + this.anIntArray30[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg4 != 0) {
								local53 = Class436.anIntArray464[arg4];
								local250 = Class436.anIntArray463[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class436.anIntArray464[arg3];
								local250 = Class436.anIntArray463[arg3];
								local268 = this.anIntArray30[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray30[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							this.anIntArray29[local45] += anInt379;
							this.anIntArray31[local45] += anInt380;
							this.anIntArray30[local45] += anInt381;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray1.length) {
						local141 = this.anIntArrayArray1[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray33[local45];
							local250 = this.anIntArray33[local45 + 1];
							for (local268 = local53; local268 < local250 && this.aShortArray18[local268] != 0; local268++) {
								local716 = (this.aShortArray18[local268] & 0xFFFF) - 1;
								@Pc(722) int local722;
								@Pc(726) int local726;
								@Pc(744) int local744;
								if (arg4 != 0) {
									local722 = Class436.anIntArray464[arg4];
									local726 = Class436.anIntArray463[arg4];
									local744 = this.aShortArray9[local716] * local722 + this.aShortArray10[local716] * local726 + 16383 >> 14;
									this.aShortArray9[local716] = (short) (this.aShortArray9[local716] * local726 - this.aShortArray10[local716] * local722 + 16383 >> 14);
									this.aShortArray10[local716] = (short) local744;
								}
								if (arg2 != 0) {
									local722 = Class436.anIntArray464[arg2];
									local726 = Class436.anIntArray463[arg2];
									local744 = this.aShortArray9[local716] * local726 - this.aShortArray11[local716] * local722 + 16383 >> 14;
									this.aShortArray11[local716] = (short) (this.aShortArray9[local716] * local722 + this.aShortArray11[local716] * local726 + 16383 >> 14);
									this.aShortArray9[local716] = (short) local744;
								}
								if (arg3 != 0) {
									local722 = Class436.anIntArray464[arg3];
									local726 = Class436.anIntArray463[arg3];
									local744 = this.aShortArray11[local716] * local722 + this.aShortArray10[local716] * local726 + 16383 >> 14;
									this.aShortArray11[local716] = (short) (this.aShortArray11[local716] * local726 - this.aShortArray10[local716] * local722 + 16383 >> 14);
									this.aShortArray10[local716] = (short) local744;
								}
							}
						}
					}
				}
				if (this.aClass172_2 == null && this.aClass172_3 != null) {
					this.aClass172_3.anInterface14_6 = null;
				}
				if (this.aClass172_2 != null) {
					this.aClass172_2.anInterface14_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray1.length) {
					local141 = this.anIntArrayArray1[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray29[local45] -= anInt379;
						this.anIntArray31[local45] -= anInt380;
						this.anIntArray30[local45] -= anInt381;
						this.anIntArray29[local45] = this.anIntArray29[local45] * arg2 >> 7;
						this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
						this.anIntArray30[local45] = this.anIntArray30[local45] * arg4 >> 7;
						this.anIntArray29[local45] += anInt379;
						this.anIntArray31[local45] += anInt380;
						this.anIntArray30[local45] += anInt381;
					}
				}
			}
		} else {
			@Pc(1119) Class189 local1119;
			@Pc(1124) Class176 local1124;
			if (arg0 == 5) {
				if (this.anIntArrayArray2 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray2.length) {
							local141 = this.anIntArrayArray2[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local45 = local141[local143];
								local53 = (this.aByteArray10[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray10[local45] = (byte) local53;
							}
							if (local141.length > 0 && this.aClass172_3 != null) {
								this.aClass172_3.anInterface14_6 = null;
							}
						}
					}
					if (this.aClass189Array1 != null) {
						for (local18 = 0; local18 < this.anInt377; local18++) {
							local1119 = this.aClass189Array1[local18];
							local1124 = this.aClass176Array1[local18];
							local1124.anInt3302 = local1124.anInt3302 & 0xFFFFFF | 255 - (this.aByteArray10[local1119.anInt3339] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1345) Class176 local1345;
				if (arg0 == 8) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local141 = this.anIntArrayArray3[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass176Array1[local141[local143]];
									local1345.anInt3301 += arg2;
									local1345.anInt3300 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local141 = this.anIntArrayArray3[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass176Array1[local141[local143]];
									local1345.anInt3299 = local1345.anInt3299 * arg2 >> 7;
									local1345.anInt3298 = local1345.anInt3298 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray3 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray3.length) {
							local141 = this.anIntArrayArray3[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local1345 = this.aClass176Array1[local141[local143]];
								local1345.anInt3303 = local1345.anInt3303 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray2 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray2.length) {
						local141 = this.anIntArrayArray2[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.aShortArray13[local45] & 0xFFFF;
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
							this.aShortArray13[local45] = (short) (local1209 << 10 | local268 << 7 | local716);
						}
						if (local141.length > 0 && this.aClass172_3 != null) {
							this.aClass172_3.anInterface14_6 = null;
						}
					}
				}
				if (this.aClass189Array1 != null) {
					for (local18 = 0; local18 < this.anInt377; local18++) {
						local1119 = this.aClass189Array1[local18];
						local1124 = this.aClass176Array1[local18];
						local1124.anInt3302 = local1124.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local1119.anInt3339] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ci", descriptor = "(I[IIIIIZ)V", line = 2202)
	@Override
	void method6874(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			anInt379 = 0;
			anInt380 = 0;
			anInt381 = 0;
			for (local26 = 0; local26 < local2; local26++) {
				@Pc(33) int local33 = arg1[local26];
				if (local33 < this.anIntArrayArray1.length) {
					@Pc(43) int[] local43 = this.anIntArrayArray1[local33];
					for (local45 = 0; local45 < local43.length; local45++) {
						local53 = local43[local45];
						anInt379 += this.anIntArray29[local53];
						anInt380 += this.anIntArray31[local53];
						anInt381 += this.anIntArray30[local53];
						local18++;
					}
				}
			}
			if (local18 > 0) {
				anInt379 = anInt379 / local18 + local8;
				anInt380 = anInt380 / local18 + local12;
				anInt381 = anInt381 / local18 + local16;
			} else {
				anInt379 = local8;
				anInt380 = local12;
				anInt381 = local16;
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
				if (local26 < this.anIntArrayArray1.length) {
					local141 = this.anIntArrayArray1[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray29[local45] += local8;
						this.anIntArray31[local45] += local12;
						this.anIntArray30[local45] += local16;
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
				if (local26 < this.anIntArrayArray1.length) {
					local141 = this.anIntArrayArray1[local26];
					if ((arg5 & 0x1) == 0) {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray29[local45] -= anInt379;
							this.anIntArray31[local45] -= anInt380;
							this.anIntArray30[local45] -= anInt381;
							if (arg4 != 0) {
								local53 = Class436.anIntArray464[arg4];
								local250 = Class436.anIntArray463[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							if (arg2 != 0) {
								local53 = Class436.anIntArray464[arg2];
								local250 = Class436.anIntArray463[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray30[local45] * local53 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray31[local45] * local53 + this.anIntArray30[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class436.anIntArray464[arg3];
								local250 = Class436.anIntArray463[arg3];
								local268 = this.anIntArray30[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray30[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							this.anIntArray29[local45] += anInt379;
							this.anIntArray31[local45] += anInt380;
							this.anIntArray30[local45] += anInt381;
						}
					} else {
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							this.anIntArray29[local45] -= anInt379;
							this.anIntArray31[local45] -= anInt380;
							this.anIntArray30[local45] -= anInt381;
							if (arg2 != 0) {
								local53 = Class436.anIntArray464[arg2];
								local250 = Class436.anIntArray463[arg2];
								local268 = this.anIntArray31[local45] * local250 - this.anIntArray30[local45] * local53 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray31[local45] * local53 + this.anIntArray30[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = local268;
							}
							if (arg4 != 0) {
								local53 = Class436.anIntArray464[arg4];
								local250 = Class436.anIntArray463[arg4];
								local268 = this.anIntArray31[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray31[local45] = this.anIntArray31[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							if (arg3 != 0) {
								local53 = Class436.anIntArray464[arg3];
								local250 = Class436.anIntArray463[arg3];
								local268 = this.anIntArray30[local45] * local53 + this.anIntArray29[local45] * local250 + 16383 >> 14;
								this.anIntArray30[local45] = this.anIntArray30[local45] * local250 - this.anIntArray29[local45] * local53 + 16383 >> 14;
								this.anIntArray29[local45] = local268;
							}
							this.anIntArray29[local45] += anInt379;
							this.anIntArray31[local45] += anInt380;
							this.anIntArray30[local45] += anInt381;
						}
					}
				}
			}
			if (arg6) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray1.length) {
						local141 = this.anIntArrayArray1[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.anIntArray33[local45];
							local250 = this.anIntArray33[local45 + 1];
							for (local268 = local53; local268 < local250 && this.aShortArray18[local268] != 0; local268++) {
								local716 = (this.aShortArray18[local268] & 0xFFFF) - 1;
								@Pc(722) int local722;
								@Pc(726) int local726;
								@Pc(744) int local744;
								if (arg4 != 0) {
									local722 = Class436.anIntArray464[arg4];
									local726 = Class436.anIntArray463[arg4];
									local744 = this.aShortArray9[local716] * local722 + this.aShortArray10[local716] * local726 + 16383 >> 14;
									this.aShortArray9[local716] = (short) (this.aShortArray9[local716] * local726 - this.aShortArray10[local716] * local722 + 16383 >> 14);
									this.aShortArray10[local716] = (short) local744;
								}
								if (arg2 != 0) {
									local722 = Class436.anIntArray464[arg2];
									local726 = Class436.anIntArray463[arg2];
									local744 = this.aShortArray9[local716] * local726 - this.aShortArray11[local716] * local722 + 16383 >> 14;
									this.aShortArray11[local716] = (short) (this.aShortArray9[local716] * local722 + this.aShortArray11[local716] * local726 + 16383 >> 14);
									this.aShortArray9[local716] = (short) local744;
								}
								if (arg3 != 0) {
									local722 = Class436.anIntArray464[arg3];
									local726 = Class436.anIntArray463[arg3];
									local744 = this.aShortArray11[local716] * local722 + this.aShortArray10[local716] * local726 + 16383 >> 14;
									this.aShortArray11[local716] = (short) (this.aShortArray11[local716] * local726 - this.aShortArray10[local716] * local722 + 16383 >> 14);
									this.aShortArray10[local716] = (short) local744;
								}
							}
						}
					}
				}
				if (this.aClass172_2 == null && this.aClass172_3 != null) {
					this.aClass172_3.anInterface14_6 = null;
				}
				if (this.aClass172_2 != null) {
					this.aClass172_2.anInterface14_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local18 = 0; local18 < local2; local18++) {
				local26 = arg1[local18];
				if (local26 < this.anIntArrayArray1.length) {
					local141 = this.anIntArrayArray1[local26];
					for (local143 = 0; local143 < local141.length; local143++) {
						local45 = local141[local143];
						this.anIntArray29[local45] -= anInt379;
						this.anIntArray31[local45] -= anInt380;
						this.anIntArray30[local45] -= anInt381;
						this.anIntArray29[local45] = this.anIntArray29[local45] * arg2 >> 7;
						this.anIntArray31[local45] = this.anIntArray31[local45] * arg3 >> 7;
						this.anIntArray30[local45] = this.anIntArray30[local45] * arg4 >> 7;
						this.anIntArray29[local45] += anInt379;
						this.anIntArray31[local45] += anInt380;
						this.anIntArray30[local45] += anInt381;
					}
				}
			}
		} else {
			@Pc(1119) Class189 local1119;
			@Pc(1124) Class176 local1124;
			if (arg0 == 5) {
				if (this.anIntArrayArray2 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray2.length) {
							local141 = this.anIntArrayArray2[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local45 = local141[local143];
								local53 = (this.aByteArray10[local45] & 0xFF) + arg2 * 8;
								if (local53 < 0) {
									local53 = 0;
								} else if (local53 > 255) {
									local53 = 255;
								}
								this.aByteArray10[local45] = (byte) local53;
							}
							if (local141.length > 0 && this.aClass172_3 != null) {
								this.aClass172_3.anInterface14_6 = null;
							}
						}
					}
					if (this.aClass189Array1 != null) {
						for (local18 = 0; local18 < this.anInt377; local18++) {
							local1119 = this.aClass189Array1[local18];
							local1124 = this.aClass176Array1[local18];
							local1124.anInt3302 = local1124.anInt3302 & 0xFFFFFF | 255 - (this.aByteArray10[local1119.anInt3339] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1345) Class176 local1345;
				if (arg0 == 8) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local141 = this.anIntArrayArray3[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass176Array1[local141[local143]];
									local1345.anInt3301 += arg2;
									local1345.anInt3300 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray3 != null) {
						for (local18 = 0; local18 < local2; local18++) {
							local26 = arg1[local18];
							if (local26 < this.anIntArrayArray3.length) {
								local141 = this.anIntArrayArray3[local26];
								for (local143 = 0; local143 < local141.length; local143++) {
									local1345 = this.aClass176Array1[local141[local143]];
									local1345.anInt3299 = local1345.anInt3299 * arg2 >> 7;
									local1345.anInt3298 = local1345.anInt3298 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray3 != null) {
					for (local18 = 0; local18 < local2; local18++) {
						local26 = arg1[local18];
						if (local26 < this.anIntArrayArray3.length) {
							local141 = this.anIntArrayArray3[local26];
							for (local143 = 0; local143 < local141.length; local143++) {
								local1345 = this.aClass176Array1[local141[local143]];
								local1345.anInt3303 = local1345.anInt3303 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray2 != null) {
				for (local18 = 0; local18 < local2; local18++) {
					local26 = arg1[local18];
					if (local26 < this.anIntArrayArray2.length) {
						local141 = this.anIntArrayArray2[local26];
						for (local143 = 0; local143 < local141.length; local143++) {
							local45 = local141[local143];
							local53 = this.aShortArray13[local45] & 0xFFFF;
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
							this.aShortArray13[local45] = (short) (local1209 << 10 | local268 << 7 | local716);
						}
						if (local141.length > 0 && this.aClass172_3 != null) {
							this.aClass172_3.anInterface14_6 = null;
						}
					}
				}
				if (this.aClass189Array1 != null) {
					for (local18 = 0; local18 < this.anInt377; local18++) {
						local1119 = this.aClass189Array1[local18];
						local1124 = this.aClass176Array1[local18];
						local1124.anInt3302 = local1124.anInt3302 & 0xFF000000 | Class656.anIntArray532[this.aShortArray13[local1119.anInt3339] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ak", descriptor = "()V", line = 2498)
	@Override
	void method6881() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt368; local1++) {
			this.anIntArray29[local1] = this.anIntArray29[local1] + 7 >> 4;
			this.anIntArray31[local1] = this.anIntArray31[local1] + 7 >> 4;
			this.anIntArray30[local1] = this.anIntArray30[local1] + 7 >> 4;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "cx", descriptor = "()V", line = 2498)
	@Override
	void method6932() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt368; local1++) {
			this.anIntArray29[local1] = this.anIntArray29[local1] + 7 >> 4;
			this.anIntArray31[local1] = this.anIntArray31[local1] + 7 >> 4;
			this.anIntArray30[local1] = this.anIntArray30[local1] + 7 >> 4;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "cv", descriptor = "()V", line = 2498)
	@Override
	void method6815() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt368; local1++) {
			this.anIntArray29[local1] = this.anIntArray29[local1] + 7 >> 4;
			this.anIntArray31[local1] = this.anIntArray31[local1] + 7 >> 4;
			this.anIntArray30[local1] = this.anIntArray30[local1] + 7 >> 4;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "ct", descriptor = "()V", line = 2498)
	@Override
	void method6880() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt368; local1++) {
			this.anIntArray29[local1] = this.anIntArray29[local1] + 7 >> 4;
			this.anIntArray31[local1] = this.anIntArray31[local1] + 7 >> 4;
			this.anIntArray30[local1] = this.anIntArray30[local1] + 7 >> 4;
		}
		if (this.aClass172_1 != null) {
			this.aClass172_1.anInterface14_6 = null;
		}
		this.aBoolean60 = false;
	}

	@OriginalMember(owner = "client!aeb", name = "cd", descriptor = "(Lclient!ow;IZ)V", line = 2508)
	@Override
	public void method6905(@OriginalArg(0) Class455 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray12 == null) {
			return;
		}
		@Pc(5) Class455 local5 = arg0;
		if (arg2) {
			local5 = this.aClass86_Sub3_23.aClass455_10;
			local5.method29405(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt373; local19++) {
			if ((arg1 & this.aShortArray12[local19]) != 0) {
				local5.method29442((float) this.anIntArray29[local19], (float) this.anIntArray31[local19], (float) this.anIntArray30[local19], local17);
				this.anIntArray29[local19] = (int) local17[0];
				this.anIntArray31[local19] = (int) local17[1];
				this.anIntArray30[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "cs", descriptor = "(Lclient!ow;IZ)V", line = 2508)
	@Override
	public void method6879(@OriginalArg(0) Class455 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray12 == null) {
			return;
		}
		@Pc(5) Class455 local5 = arg0;
		if (arg2) {
			local5 = this.aClass86_Sub3_23.aClass455_10;
			local5.method29405(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt373; local19++) {
			if ((arg1 & this.aShortArray12[local19]) != 0) {
				local5.method29442((float) this.anIntArray29[local19], (float) this.anIntArray31[local19], (float) this.anIntArray30[local19], local17);
				this.anIntArray29[local19] = (int) local17[0];
				this.anIntArray31[local19] = (int) local17[1];
				this.anIntArray30[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "au", descriptor = "(Lclient!ow;IZ)V", line = 2508)
	@Override
	public void method6816(@OriginalArg(0) Class455 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray12 == null) {
			return;
		}
		@Pc(5) Class455 local5 = arg0;
		if (arg2) {
			local5 = this.aClass86_Sub3_23.aClass455_10;
			local5.method29405(arg0);
		}
		@Pc(17) float[] local17 = new float[3];
		for (@Pc(19) int local19 = 0; local19 < this.anInt373; local19++) {
			if ((arg1 & this.aShortArray12[local19]) != 0) {
				local5.method29442((float) this.anIntArray29[local19], (float) this.anIntArray31[local19], (float) this.anIntArray30[local19], local17);
				this.anIntArray29[local19] = (int) local17[0];
				this.anIntArray31[local19] = (int) local17[1];
				this.anIntArray30[local19] = (int) local17[2];
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "bx", descriptor = "()[Lclient!cs;", line = 2525)
	@Override
	public Class195[] method6843() {
		return this.aClass195Array1;
	}

	@OriginalMember(owner = "client!aeb", name = "fe", descriptor = "()[Lclient!cs;", line = 2525)
	@Override
	public Class195[] method6936() {
		return this.aClass195Array1;
	}

	@OriginalMember(owner = "client!aeb", name = "fw", descriptor = "()[Lclient!cs;", line = 2525)
	@Override
	public Class195[] method6806() {
		return this.aClass195Array1;
	}

	@OriginalMember(owner = "client!aeb", name = "by", descriptor = "()[Lclient!dk;", line = 2529)
	@Override
	public Class205[] method6938() {
		return this.aClass205Array1;
	}

	@OriginalMember(owner = "client!aeb", name = "fl", descriptor = "()[Lclient!dk;", line = 2529)
	@Override
	public Class205[] method6933() {
		return this.aClass205Array1;
	}

	@OriginalMember(owner = "client!aeb", name = "ft", descriptor = "()[Lclient!dk;", line = 2529)
	@Override
	public Class205[] method6934() {
		return this.aClass205Array1;
	}

	@OriginalMember(owner = "client!aeb", name = "fk", descriptor = "()[Lclient!dk;", line = 2529)
	@Override
	public Class205[] method6935() {
		return this.aClass205Array1;
	}

	@OriginalMember(owner = "client!aeb", name = "bd", descriptor = "(Lclient!ow;)V", line = 2533)
	@Override
	public void method6851(@OriginalArg(0) Class455 arg0) {
		@Pc(3) Class442 local3 = this.aClass86_Sub3_23.aClass442_21;
		local3.method28969(arg0);
		@Pc(11) int local11;
		if (this.aClass205Array1 != null) {
			for (local11 = 0; local11 < this.aClass205Array1.length; local11++) {
				@Pc(21) Class205 local21 = this.aClass205Array1[local11];
				@Pc(23) Class205 local23 = local21;
				if (local21.aClass205_1 != null) {
					local23 = local21.aClass205_1;
				}
				local23.anInt3573 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray29[local21.anInt3572 * 1404619919] + local3.aFloatArray109[4] * (float) this.anIntArray31[local21.anInt3572 * 1404619919] + local3.aFloatArray109[8] * (float) this.anIntArray30[local21.anInt3572 * 1404619919]) * -697779603;
				local23.anInt3580 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray29[local21.anInt3572 * 1404619919] + local3.aFloatArray109[5] * (float) this.anIntArray31[local21.anInt3572 * 1404619919] + local3.aFloatArray109[9] * (float) this.anIntArray30[local21.anInt3572 * 1404619919]) * 880720549;
				local23.anInt3574 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray29[local21.anInt3572 * 1404619919] + local3.aFloatArray109[6] * (float) this.anIntArray31[local21.anInt3572 * 1404619919] + local3.aFloatArray109[10] * (float) this.anIntArray30[local21.anInt3572 * 1404619919]) * -487629419;
				local23.anInt3575 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray29[local21.anInt3570 * 496404005] + local3.aFloatArray109[4] * (float) this.anIntArray31[local21.anInt3570 * 496404005] + local3.aFloatArray109[8] * (float) this.anIntArray30[local21.anInt3570 * 496404005]) * 1861716229;
				local23.anInt3567 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray29[local21.anInt3570 * 496404005] + local3.aFloatArray109[5] * (float) this.anIntArray31[local21.anInt3570 * 496404005] + local3.aFloatArray109[9] * (float) this.anIntArray30[local21.anInt3570 * 496404005]) * 968631629;
				local23.anInt3576 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray29[local21.anInt3570 * 496404005] + local3.aFloatArray109[6] * (float) this.anIntArray31[local21.anInt3570 * 496404005] + local3.aFloatArray109[10] * (float) this.anIntArray30[local21.anInt3570 * 496404005]) * -337212495;
				local23.anInt3578 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray29[local21.anInt3571 * 1123614299] + local3.aFloatArray109[4] * (float) this.anIntArray31[local21.anInt3571 * 1123614299] + local3.aFloatArray109[8] * (float) this.anIntArray30[local21.anInt3571 * 1123614299]) * -289878931;
				local23.anInt3579 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray29[local21.anInt3571 * 1123614299] + local3.aFloatArray109[5] * (float) this.anIntArray31[local21.anInt3571 * 1123614299] + local3.aFloatArray109[9] * (float) this.anIntArray30[local21.anInt3571 * 1123614299]) * 286740539;
				local23.anInt3577 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray29[local21.anInt3571 * 1123614299] + local3.aFloatArray109[6] * (float) this.anIntArray31[local21.anInt3571 * 1123614299] + local3.aFloatArray109[10] * (float) this.anIntArray30[local21.anInt3571 * 1123614299]) * -2010684097;
			}
		}
		if (this.aClass195Array1 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass195Array1.length; local11++) {
			@Pc(505) Class195 local505 = this.aClass195Array1[local11];
			@Pc(507) Class195 local507 = local505;
			if (local505.aClass195_2 != null) {
				local507 = local505.aClass195_2;
			}
			if (local505.aClass442_96 == null) {
				local505.aClass442_96 = new Class442(local3);
			} else {
				local505.aClass442_96.method28954(local3);
			}
			local507.anInt3547 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray29[local505.anInt3550 * -1634673991] + local3.aFloatArray109[4] * (float) this.anIntArray31[local505.anInt3550 * -1634673991] + local3.aFloatArray109[8] * (float) this.anIntArray30[local505.anInt3550 * -1634673991]) * 1976103833;
			local507.anInt3548 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray29[local505.anInt3550 * -1634673991] + local3.aFloatArray109[5] * (float) this.anIntArray31[local505.anInt3550 * -1634673991] + local3.aFloatArray109[9] * (float) this.anIntArray30[local505.anInt3550 * -1634673991]) * 1216251817;
			local507.anInt3546 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray29[local505.anInt3550 * -1634673991] + local3.aFloatArray109[6] * (float) this.anIntArray31[local505.anInt3550 * -1634673991] + local3.aFloatArray109[10] * (float) this.anIntArray30[local505.anInt3550 * -1634673991]) * -1645064349;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "da", descriptor = "(Lclient!ow;)V", line = 2533)
	@Override
	public void method6961(@OriginalArg(0) Class455 arg0) {
		@Pc(3) Class442 local3 = this.aClass86_Sub3_23.aClass442_21;
		local3.method28969(arg0);
		@Pc(11) int local11;
		if (this.aClass205Array1 != null) {
			for (local11 = 0; local11 < this.aClass205Array1.length; local11++) {
				@Pc(21) Class205 local21 = this.aClass205Array1[local11];
				@Pc(23) Class205 local23 = local21;
				if (local21.aClass205_1 != null) {
					local23 = local21.aClass205_1;
				}
				local23.anInt3573 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray29[local21.anInt3572 * 1404619919] + local3.aFloatArray109[4] * (float) this.anIntArray31[local21.anInt3572 * 1404619919] + local3.aFloatArray109[8] * (float) this.anIntArray30[local21.anInt3572 * 1404619919]) * -697779603;
				local23.anInt3580 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray29[local21.anInt3572 * 1404619919] + local3.aFloatArray109[5] * (float) this.anIntArray31[local21.anInt3572 * 1404619919] + local3.aFloatArray109[9] * (float) this.anIntArray30[local21.anInt3572 * 1404619919]) * 880720549;
				local23.anInt3574 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray29[local21.anInt3572 * 1404619919] + local3.aFloatArray109[6] * (float) this.anIntArray31[local21.anInt3572 * 1404619919] + local3.aFloatArray109[10] * (float) this.anIntArray30[local21.anInt3572 * 1404619919]) * -487629419;
				local23.anInt3575 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray29[local21.anInt3570 * 496404005] + local3.aFloatArray109[4] * (float) this.anIntArray31[local21.anInt3570 * 496404005] + local3.aFloatArray109[8] * (float) this.anIntArray30[local21.anInt3570 * 496404005]) * 1861716229;
				local23.anInt3567 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray29[local21.anInt3570 * 496404005] + local3.aFloatArray109[5] * (float) this.anIntArray31[local21.anInt3570 * 496404005] + local3.aFloatArray109[9] * (float) this.anIntArray30[local21.anInt3570 * 496404005]) * 968631629;
				local23.anInt3576 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray29[local21.anInt3570 * 496404005] + local3.aFloatArray109[6] * (float) this.anIntArray31[local21.anInt3570 * 496404005] + local3.aFloatArray109[10] * (float) this.anIntArray30[local21.anInt3570 * 496404005]) * -337212495;
				local23.anInt3578 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray29[local21.anInt3571 * 1123614299] + local3.aFloatArray109[4] * (float) this.anIntArray31[local21.anInt3571 * 1123614299] + local3.aFloatArray109[8] * (float) this.anIntArray30[local21.anInt3571 * 1123614299]) * -289878931;
				local23.anInt3579 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray29[local21.anInt3571 * 1123614299] + local3.aFloatArray109[5] * (float) this.anIntArray31[local21.anInt3571 * 1123614299] + local3.aFloatArray109[9] * (float) this.anIntArray30[local21.anInt3571 * 1123614299]) * 286740539;
				local23.anInt3577 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray29[local21.anInt3571 * 1123614299] + local3.aFloatArray109[6] * (float) this.anIntArray31[local21.anInt3571 * 1123614299] + local3.aFloatArray109[10] * (float) this.anIntArray30[local21.anInt3571 * 1123614299]) * -2010684097;
			}
		}
		if (this.aClass195Array1 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass195Array1.length; local11++) {
			@Pc(505) Class195 local505 = this.aClass195Array1[local11];
			@Pc(507) Class195 local507 = local505;
			if (local505.aClass195_2 != null) {
				local507 = local505.aClass195_2;
			}
			if (local505.aClass442_96 == null) {
				local505.aClass442_96 = new Class442(local3);
			} else {
				local505.aClass442_96.method28954(local3);
			}
			local507.anInt3547 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray29[local505.anInt3550 * -1634673991] + local3.aFloatArray109[4] * (float) this.anIntArray31[local505.anInt3550 * -1634673991] + local3.aFloatArray109[8] * (float) this.anIntArray30[local505.anInt3550 * -1634673991]) * 1976103833;
			local507.anInt3548 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray29[local505.anInt3550 * -1634673991] + local3.aFloatArray109[5] * (float) this.anIntArray31[local505.anInt3550 * -1634673991] + local3.aFloatArray109[9] * (float) this.anIntArray30[local505.anInt3550 * -1634673991]) * 1216251817;
			local507.anInt3546 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray29[local505.anInt3550 * -1634673991] + local3.aFloatArray109[6] * (float) this.anIntArray31[local505.anInt3550 * -1634673991] + local3.aFloatArray109[10] * (float) this.anIntArray30[local505.anInt3550 * -1634673991]) * -1645064349;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "dv", descriptor = "(Lclient!ow;)V", line = 2533)
	@Override
	public void method6887(@OriginalArg(0) Class455 arg0) {
		@Pc(3) Class442 local3 = this.aClass86_Sub3_23.aClass442_21;
		local3.method28969(arg0);
		@Pc(11) int local11;
		if (this.aClass205Array1 != null) {
			for (local11 = 0; local11 < this.aClass205Array1.length; local11++) {
				@Pc(21) Class205 local21 = this.aClass205Array1[local11];
				@Pc(23) Class205 local23 = local21;
				if (local21.aClass205_1 != null) {
					local23 = local21.aClass205_1;
				}
				local23.anInt3573 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray29[local21.anInt3572 * 1404619919] + local3.aFloatArray109[4] * (float) this.anIntArray31[local21.anInt3572 * 1404619919] + local3.aFloatArray109[8] * (float) this.anIntArray30[local21.anInt3572 * 1404619919]) * -697779603;
				local23.anInt3580 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray29[local21.anInt3572 * 1404619919] + local3.aFloatArray109[5] * (float) this.anIntArray31[local21.anInt3572 * 1404619919] + local3.aFloatArray109[9] * (float) this.anIntArray30[local21.anInt3572 * 1404619919]) * 880720549;
				local23.anInt3574 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray29[local21.anInt3572 * 1404619919] + local3.aFloatArray109[6] * (float) this.anIntArray31[local21.anInt3572 * 1404619919] + local3.aFloatArray109[10] * (float) this.anIntArray30[local21.anInt3572 * 1404619919]) * -487629419;
				local23.anInt3575 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray29[local21.anInt3570 * 496404005] + local3.aFloatArray109[4] * (float) this.anIntArray31[local21.anInt3570 * 496404005] + local3.aFloatArray109[8] * (float) this.anIntArray30[local21.anInt3570 * 496404005]) * 1861716229;
				local23.anInt3567 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray29[local21.anInt3570 * 496404005] + local3.aFloatArray109[5] * (float) this.anIntArray31[local21.anInt3570 * 496404005] + local3.aFloatArray109[9] * (float) this.anIntArray30[local21.anInt3570 * 496404005]) * 968631629;
				local23.anInt3576 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray29[local21.anInt3570 * 496404005] + local3.aFloatArray109[6] * (float) this.anIntArray31[local21.anInt3570 * 496404005] + local3.aFloatArray109[10] * (float) this.anIntArray30[local21.anInt3570 * 496404005]) * -337212495;
				local23.anInt3578 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray29[local21.anInt3571 * 1123614299] + local3.aFloatArray109[4] * (float) this.anIntArray31[local21.anInt3571 * 1123614299] + local3.aFloatArray109[8] * (float) this.anIntArray30[local21.anInt3571 * 1123614299]) * -289878931;
				local23.anInt3579 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray29[local21.anInt3571 * 1123614299] + local3.aFloatArray109[5] * (float) this.anIntArray31[local21.anInt3571 * 1123614299] + local3.aFloatArray109[9] * (float) this.anIntArray30[local21.anInt3571 * 1123614299]) * 286740539;
				local23.anInt3577 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray29[local21.anInt3571 * 1123614299] + local3.aFloatArray109[6] * (float) this.anIntArray31[local21.anInt3571 * 1123614299] + local3.aFloatArray109[10] * (float) this.anIntArray30[local21.anInt3571 * 1123614299]) * -2010684097;
			}
		}
		if (this.aClass195Array1 == null) {
			return;
		}
		for (local11 = 0; local11 < this.aClass195Array1.length; local11++) {
			@Pc(505) Class195 local505 = this.aClass195Array1[local11];
			@Pc(507) Class195 local507 = local505;
			if (local505.aClass195_2 != null) {
				local507 = local505.aClass195_2;
			}
			if (local505.aClass442_96 == null) {
				local505.aClass442_96 = new Class442(local3);
			} else {
				local505.aClass442_96.method28954(local3);
			}
			local507.anInt3547 = (int) (local3.aFloatArray109[12] + local3.aFloatArray109[0] * (float) this.anIntArray29[local505.anInt3550 * -1634673991] + local3.aFloatArray109[4] * (float) this.anIntArray31[local505.anInt3550 * -1634673991] + local3.aFloatArray109[8] * (float) this.anIntArray30[local505.anInt3550 * -1634673991]) * 1976103833;
			local507.anInt3548 = (int) (local3.aFloatArray109[13] + local3.aFloatArray109[1] * (float) this.anIntArray29[local505.anInt3550 * -1634673991] + local3.aFloatArray109[5] * (float) this.anIntArray31[local505.anInt3550 * -1634673991] + local3.aFloatArray109[9] * (float) this.anIntArray30[local505.anInt3550 * -1634673991]) * 1216251817;
			local507.anInt3546 = (int) (local3.aFloatArray109[14] + local3.aFloatArray109[2] * (float) this.anIntArray29[local505.anInt3550 * -1634673991] + local3.aFloatArray109[6] * (float) this.anIntArray31[local505.anInt3550 * -1634673991] + local3.aFloatArray109[10] * (float) this.anIntArray30[local505.anInt3550 * -1634673991]) * -1645064349;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "dq", descriptor = "(IILclient!ow;ZI)Z", line = 2566)
	@Override
	public boolean method6885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class442 local3 = this.aClass86_Sub3_23.aClass442_21;
		local3.method28969(arg2);
		local3.method28965(this.aClass86_Sub3_23.aClass442_28);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(34) int local34 = this.aShort6 - this.aShort1 >> 1;
		@Pc(42) int local42 = this.aShort5 - this.aShort4 >> 1;
		@Pc(50) int local50 = this.aShort8 - this.aShort7 >> 1;
		@Pc(55) int local55 = this.aShort1 + local34;
		@Pc(60) int local60 = this.aShort4 + local42;
		@Pc(65) int local65 = this.aShort7 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray34[0] = local71;
		anIntArray28[0] = local77;
		anIntArray35[0] = local83;
		anIntArray34[1] = local89;
		anIntArray28[1] = local77;
		anIntArray35[1] = local83;
		anIntArray34[2] = local71;
		anIntArray28[2] = local95;
		anIntArray35[2] = local83;
		anIntArray34[3] = local89;
		anIntArray28[3] = local95;
		anIntArray35[3] = local83;
		anIntArray34[4] = local71;
		anIntArray28[4] = local77;
		anIntArray35[4] = local101;
		anIntArray34[5] = local89;
		anIntArray28[5] = local77;
		anIntArray35[5] = local101;
		anIntArray34[6] = local71;
		anIntArray28[6] = local95;
		anIntArray35[6] = local101;
		anIntArray34[7] = local89;
		anIntArray28[7] = local95;
		anIntArray35[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray34[local199];
			local210 = anIntArray28[local199];
			local214 = anIntArray35[local199];
			local243 = local3.aFloatArray109[2] * (float) local206 + local3.aFloatArray109[6] * (float) local210 + local3.aFloatArray109[10] * (float) local214 + local3.aFloatArray109[14];
			local272 = local3.aFloatArray109[3] * (float) local206 + local3.aFloatArray109[7] * (float) local210 + local3.aFloatArray109[11] * (float) local214 + local3.aFloatArray109[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray109[0] * (float) local206 + local3.aFloatArray109[4] * (float) local210 + local3.aFloatArray109[8] * (float) local214 + local3.aFloatArray109[12];
				local335 = local3.aFloatArray109[1] * (float) local206 + local3.aFloatArray109[5] * (float) local210 + local3.aFloatArray109[9] * (float) local214 + local3.aFloatArray109[13];
				@Pc(348) int local348 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local306 / local272);
				local361 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local335 / local272);
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
			if (this.aClass86_Sub3_23.anIntArray58.length < this.anInt370) {
				this.aClass86_Sub3_23.anIntArray58 = new int[this.anInt370];
				this.aClass86_Sub3_23.anIntArray59 = new int[this.anInt370];
			}
			@Pc(426) int[] local426 = this.aClass86_Sub3_23.anIntArray58;
			@Pc(430) int[] local430 = this.aClass86_Sub3_23.anIntArray59;
			for (local361 = 0; local361 < this.anInt373; local361++) {
				local206 = this.anIntArray29[local361];
				local210 = this.anIntArray31[local361];
				local214 = this.anIntArray30[local361];
				local243 = local3.aFloatArray109[2] * (float) local206 + local3.aFloatArray109[6] * (float) local210 + local3.aFloatArray109[10] * (float) local214 + local3.aFloatArray109[14];
				local272 = local3.aFloatArray109[3] * (float) local206 + local3.aFloatArray109[7] * (float) local210 + local3.aFloatArray109[11] * (float) local214 + local3.aFloatArray109[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray109[0] * (float) local206 + local3.aFloatArray109[4] * (float) local210 + local3.aFloatArray109[8] * (float) local214 + local3.aFloatArray109[12];
					local335 = local3.aFloatArray109[1] * (float) local206 + local3.aFloatArray109[5] * (float) local210 + local3.aFloatArray109[9] * (float) local214 + local3.aFloatArray109[13];
					local577 = this.anIntArray33[local361];
					local584 = this.anIntArray33[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray18[local586] != 0; local586++) {
						local604 = (this.aShortArray18[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local306 / local272);
						local430[local604] = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray33[local361];
					local584 = this.anIntArray33[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray18[local586] != 0; local586++) {
						local604 = (this.aShortArray18[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt371; local361++) {
				if (local426[this.aShortArray14[local361] & 0xFFFF] != -999999 && local426[this.aShortArray8[local361] & 0xFFFF] != -999999 && local426[this.aShortArray15[local361] & 0xFFFF] != -999999 && this.method2698(arg0, arg1, local430[this.aShortArray14[local361] & 0xFFFF], local430[this.aShortArray8[local361] & 0xFFFF], local430[this.aShortArray15[local361] & 0xFFFF], local426[this.aShortArray14[local361] & 0xFFFF], local426[this.aShortArray8[local361] & 0xFFFF], local426[this.aShortArray15[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aeb", name = "do", descriptor = "(IILclient!ow;ZI)Z", line = 2566)
	@Override
	public boolean method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class442 local3 = this.aClass86_Sub3_23.aClass442_21;
		local3.method28969(arg2);
		local3.method28965(this.aClass86_Sub3_23.aClass442_28);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(34) int local34 = this.aShort6 - this.aShort1 >> 1;
		@Pc(42) int local42 = this.aShort5 - this.aShort4 >> 1;
		@Pc(50) int local50 = this.aShort8 - this.aShort7 >> 1;
		@Pc(55) int local55 = this.aShort1 + local34;
		@Pc(60) int local60 = this.aShort4 + local42;
		@Pc(65) int local65 = this.aShort7 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray34[0] = local71;
		anIntArray28[0] = local77;
		anIntArray35[0] = local83;
		anIntArray34[1] = local89;
		anIntArray28[1] = local77;
		anIntArray35[1] = local83;
		anIntArray34[2] = local71;
		anIntArray28[2] = local95;
		anIntArray35[2] = local83;
		anIntArray34[3] = local89;
		anIntArray28[3] = local95;
		anIntArray35[3] = local83;
		anIntArray34[4] = local71;
		anIntArray28[4] = local77;
		anIntArray35[4] = local101;
		anIntArray34[5] = local89;
		anIntArray28[5] = local77;
		anIntArray35[5] = local101;
		anIntArray34[6] = local71;
		anIntArray28[6] = local95;
		anIntArray35[6] = local101;
		anIntArray34[7] = local89;
		anIntArray28[7] = local95;
		anIntArray35[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray34[local199];
			local210 = anIntArray28[local199];
			local214 = anIntArray35[local199];
			local243 = local3.aFloatArray109[2] * (float) local206 + local3.aFloatArray109[6] * (float) local210 + local3.aFloatArray109[10] * (float) local214 + local3.aFloatArray109[14];
			local272 = local3.aFloatArray109[3] * (float) local206 + local3.aFloatArray109[7] * (float) local210 + local3.aFloatArray109[11] * (float) local214 + local3.aFloatArray109[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray109[0] * (float) local206 + local3.aFloatArray109[4] * (float) local210 + local3.aFloatArray109[8] * (float) local214 + local3.aFloatArray109[12];
				local335 = local3.aFloatArray109[1] * (float) local206 + local3.aFloatArray109[5] * (float) local210 + local3.aFloatArray109[9] * (float) local214 + local3.aFloatArray109[13];
				@Pc(348) int local348 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local306 / local272);
				local361 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local335 / local272);
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
			if (this.aClass86_Sub3_23.anIntArray58.length < this.anInt370) {
				this.aClass86_Sub3_23.anIntArray58 = new int[this.anInt370];
				this.aClass86_Sub3_23.anIntArray59 = new int[this.anInt370];
			}
			@Pc(426) int[] local426 = this.aClass86_Sub3_23.anIntArray58;
			@Pc(430) int[] local430 = this.aClass86_Sub3_23.anIntArray59;
			for (local361 = 0; local361 < this.anInt373; local361++) {
				local206 = this.anIntArray29[local361];
				local210 = this.anIntArray31[local361];
				local214 = this.anIntArray30[local361];
				local243 = local3.aFloatArray109[2] * (float) local206 + local3.aFloatArray109[6] * (float) local210 + local3.aFloatArray109[10] * (float) local214 + local3.aFloatArray109[14];
				local272 = local3.aFloatArray109[3] * (float) local206 + local3.aFloatArray109[7] * (float) local210 + local3.aFloatArray109[11] * (float) local214 + local3.aFloatArray109[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray109[0] * (float) local206 + local3.aFloatArray109[4] * (float) local210 + local3.aFloatArray109[8] * (float) local214 + local3.aFloatArray109[12];
					local335 = local3.aFloatArray109[1] * (float) local206 + local3.aFloatArray109[5] * (float) local210 + local3.aFloatArray109[9] * (float) local214 + local3.aFloatArray109[13];
					local577 = this.anIntArray33[local361];
					local584 = this.anIntArray33[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray18[local586] != 0; local586++) {
						local604 = (this.aShortArray18[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local306 / local272);
						local430[local604] = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray33[local361];
					local584 = this.anIntArray33[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray18[local586] != 0; local586++) {
						local604 = (this.aShortArray18[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt371; local361++) {
				if (local426[this.aShortArray14[local361] & 0xFFFF] != -999999 && local426[this.aShortArray8[local361] & 0xFFFF] != -999999 && local426[this.aShortArray15[local361] & 0xFFFF] != -999999 && this.method2698(arg0, arg1, local430[this.aShortArray14[local361] & 0xFFFF], local430[this.aShortArray8[local361] & 0xFFFF], local430[this.aShortArray15[local361] & 0xFFFF], local426[this.aShortArray14[local361] & 0xFFFF], local426[this.aShortArray8[local361] & 0xFFFF], local426[this.aShortArray15[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aeb", name = "dt", descriptor = "(IILclient!ow;ZI)Z", line = 2566)
	@Override
	public boolean method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class442 local3 = this.aClass86_Sub3_23.aClass442_21;
		local3.method28969(arg2);
		local3.method28965(this.aClass86_Sub3_23.aClass442_28);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(34) int local34 = this.aShort6 - this.aShort1 >> 1;
		@Pc(42) int local42 = this.aShort5 - this.aShort4 >> 1;
		@Pc(50) int local50 = this.aShort8 - this.aShort7 >> 1;
		@Pc(55) int local55 = this.aShort1 + local34;
		@Pc(60) int local60 = this.aShort4 + local42;
		@Pc(65) int local65 = this.aShort7 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray34[0] = local71;
		anIntArray28[0] = local77;
		anIntArray35[0] = local83;
		anIntArray34[1] = local89;
		anIntArray28[1] = local77;
		anIntArray35[1] = local83;
		anIntArray34[2] = local71;
		anIntArray28[2] = local95;
		anIntArray35[2] = local83;
		anIntArray34[3] = local89;
		anIntArray28[3] = local95;
		anIntArray35[3] = local83;
		anIntArray34[4] = local71;
		anIntArray28[4] = local77;
		anIntArray35[4] = local101;
		anIntArray34[5] = local89;
		anIntArray28[5] = local77;
		anIntArray35[5] = local101;
		anIntArray34[6] = local71;
		anIntArray28[6] = local95;
		anIntArray35[6] = local101;
		anIntArray34[7] = local89;
		anIntArray28[7] = local95;
		anIntArray35[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray34[local199];
			local210 = anIntArray28[local199];
			local214 = anIntArray35[local199];
			local243 = local3.aFloatArray109[2] * (float) local206 + local3.aFloatArray109[6] * (float) local210 + local3.aFloatArray109[10] * (float) local214 + local3.aFloatArray109[14];
			local272 = local3.aFloatArray109[3] * (float) local206 + local3.aFloatArray109[7] * (float) local210 + local3.aFloatArray109[11] * (float) local214 + local3.aFloatArray109[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray109[0] * (float) local206 + local3.aFloatArray109[4] * (float) local210 + local3.aFloatArray109[8] * (float) local214 + local3.aFloatArray109[12];
				local335 = local3.aFloatArray109[1] * (float) local206 + local3.aFloatArray109[5] * (float) local210 + local3.aFloatArray109[9] * (float) local214 + local3.aFloatArray109[13];
				@Pc(348) int local348 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local306 / local272);
				local361 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local335 / local272);
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
			if (this.aClass86_Sub3_23.anIntArray58.length < this.anInt370) {
				this.aClass86_Sub3_23.anIntArray58 = new int[this.anInt370];
				this.aClass86_Sub3_23.anIntArray59 = new int[this.anInt370];
			}
			@Pc(426) int[] local426 = this.aClass86_Sub3_23.anIntArray58;
			@Pc(430) int[] local430 = this.aClass86_Sub3_23.anIntArray59;
			for (local361 = 0; local361 < this.anInt373; local361++) {
				local206 = this.anIntArray29[local361];
				local210 = this.anIntArray31[local361];
				local214 = this.anIntArray30[local361];
				local243 = local3.aFloatArray109[2] * (float) local206 + local3.aFloatArray109[6] * (float) local210 + local3.aFloatArray109[10] * (float) local214 + local3.aFloatArray109[14];
				local272 = local3.aFloatArray109[3] * (float) local206 + local3.aFloatArray109[7] * (float) local210 + local3.aFloatArray109[11] * (float) local214 + local3.aFloatArray109[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray109[0] * (float) local206 + local3.aFloatArray109[4] * (float) local210 + local3.aFloatArray109[8] * (float) local214 + local3.aFloatArray109[12];
					local335 = local3.aFloatArray109[1] * (float) local206 + local3.aFloatArray109[5] * (float) local210 + local3.aFloatArray109[9] * (float) local214 + local3.aFloatArray109[13];
					local577 = this.anIntArray33[local361];
					local584 = this.anIntArray33[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray18[local586] != 0; local586++) {
						local604 = (this.aShortArray18[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local306 / local272);
						local430[local604] = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray33[local361];
					local584 = this.anIntArray33[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray18[local586] != 0; local586++) {
						local604 = (this.aShortArray18[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt371; local361++) {
				if (local426[this.aShortArray14[local361] & 0xFFFF] != -999999 && local426[this.aShortArray8[local361] & 0xFFFF] != -999999 && local426[this.aShortArray15[local361] & 0xFFFF] != -999999 && this.method2698(arg0, arg1, local430[this.aShortArray14[local361] & 0xFFFF], local430[this.aShortArray8[local361] & 0xFFFF], local430[this.aShortArray15[local361] & 0xFFFF], local426[this.aShortArray14[local361] & 0xFFFF], local426[this.aShortArray8[local361] & 0xFFFF], local426[this.aShortArray15[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aeb", name = "dh", descriptor = "(IILclient!ow;ZI)Z", line = 2566)
	@Override
	public boolean method6884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class442 local3 = this.aClass86_Sub3_23.aClass442_21;
		local3.method28969(arg2);
		local3.method28965(this.aClass86_Sub3_23.aClass442_28);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(34) int local34 = this.aShort6 - this.aShort1 >> 1;
		@Pc(42) int local42 = this.aShort5 - this.aShort4 >> 1;
		@Pc(50) int local50 = this.aShort8 - this.aShort7 >> 1;
		@Pc(55) int local55 = this.aShort1 + local34;
		@Pc(60) int local60 = this.aShort4 + local42;
		@Pc(65) int local65 = this.aShort7 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray34[0] = local71;
		anIntArray28[0] = local77;
		anIntArray35[0] = local83;
		anIntArray34[1] = local89;
		anIntArray28[1] = local77;
		anIntArray35[1] = local83;
		anIntArray34[2] = local71;
		anIntArray28[2] = local95;
		anIntArray35[2] = local83;
		anIntArray34[3] = local89;
		anIntArray28[3] = local95;
		anIntArray35[3] = local83;
		anIntArray34[4] = local71;
		anIntArray28[4] = local77;
		anIntArray35[4] = local101;
		anIntArray34[5] = local89;
		anIntArray28[5] = local77;
		anIntArray35[5] = local101;
		anIntArray34[6] = local71;
		anIntArray28[6] = local95;
		anIntArray35[6] = local101;
		anIntArray34[7] = local89;
		anIntArray28[7] = local95;
		anIntArray35[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray34[local199];
			local210 = anIntArray28[local199];
			local214 = anIntArray35[local199];
			local243 = local3.aFloatArray109[2] * (float) local206 + local3.aFloatArray109[6] * (float) local210 + local3.aFloatArray109[10] * (float) local214 + local3.aFloatArray109[14];
			local272 = local3.aFloatArray109[3] * (float) local206 + local3.aFloatArray109[7] * (float) local210 + local3.aFloatArray109[11] * (float) local214 + local3.aFloatArray109[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray109[0] * (float) local206 + local3.aFloatArray109[4] * (float) local210 + local3.aFloatArray109[8] * (float) local214 + local3.aFloatArray109[12];
				local335 = local3.aFloatArray109[1] * (float) local206 + local3.aFloatArray109[5] * (float) local210 + local3.aFloatArray109[9] * (float) local214 + local3.aFloatArray109[13];
				@Pc(348) int local348 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local306 / local272);
				local361 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local335 / local272);
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
			if (this.aClass86_Sub3_23.anIntArray58.length < this.anInt370) {
				this.aClass86_Sub3_23.anIntArray58 = new int[this.anInt370];
				this.aClass86_Sub3_23.anIntArray59 = new int[this.anInt370];
			}
			@Pc(426) int[] local426 = this.aClass86_Sub3_23.anIntArray58;
			@Pc(430) int[] local430 = this.aClass86_Sub3_23.anIntArray59;
			for (local361 = 0; local361 < this.anInt373; local361++) {
				local206 = this.anIntArray29[local361];
				local210 = this.anIntArray31[local361];
				local214 = this.anIntArray30[local361];
				local243 = local3.aFloatArray109[2] * (float) local206 + local3.aFloatArray109[6] * (float) local210 + local3.aFloatArray109[10] * (float) local214 + local3.aFloatArray109[14];
				local272 = local3.aFloatArray109[3] * (float) local206 + local3.aFloatArray109[7] * (float) local210 + local3.aFloatArray109[11] * (float) local214 + local3.aFloatArray109[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray109[0] * (float) local206 + local3.aFloatArray109[4] * (float) local210 + local3.aFloatArray109[8] * (float) local214 + local3.aFloatArray109[12];
					local335 = local3.aFloatArray109[1] * (float) local206 + local3.aFloatArray109[5] * (float) local210 + local3.aFloatArray109[9] * (float) local214 + local3.aFloatArray109[13];
					local577 = this.anIntArray33[local361];
					local584 = this.anIntArray33[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray18[local586] != 0; local586++) {
						local604 = (this.aShortArray18[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local306 / local272);
						local430[local604] = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray33[local361];
					local584 = this.anIntArray33[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray18[local586] != 0; local586++) {
						local604 = (this.aShortArray18[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt371; local361++) {
				if (local426[this.aShortArray14[local361] & 0xFFFF] != -999999 && local426[this.aShortArray8[local361] & 0xFFFF] != -999999 && local426[this.aShortArray15[local361] & 0xFFFF] != -999999 && this.method2698(arg0, arg1, local430[this.aShortArray14[local361] & 0xFFFF], local430[this.aShortArray8[local361] & 0xFFFF], local430[this.aShortArray15[local361] & 0xFFFF], local426[this.aShortArray14[local361] & 0xFFFF], local426[this.aShortArray8[local361] & 0xFFFF], local426[this.aShortArray15[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aeb", name = "dn", descriptor = "(IILclient!ow;ZI)Z", line = 2566)
	@Override
	public boolean method6952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class442 local3 = this.aClass86_Sub3_23.aClass442_21;
		local3.method28969(arg2);
		local3.method28965(this.aClass86_Sub3_23.aClass442_28);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(34) int local34 = this.aShort6 - this.aShort1 >> 1;
		@Pc(42) int local42 = this.aShort5 - this.aShort4 >> 1;
		@Pc(50) int local50 = this.aShort8 - this.aShort7 >> 1;
		@Pc(55) int local55 = this.aShort1 + local34;
		@Pc(60) int local60 = this.aShort4 + local42;
		@Pc(65) int local65 = this.aShort7 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray34[0] = local71;
		anIntArray28[0] = local77;
		anIntArray35[0] = local83;
		anIntArray34[1] = local89;
		anIntArray28[1] = local77;
		anIntArray35[1] = local83;
		anIntArray34[2] = local71;
		anIntArray28[2] = local95;
		anIntArray35[2] = local83;
		anIntArray34[3] = local89;
		anIntArray28[3] = local95;
		anIntArray35[3] = local83;
		anIntArray34[4] = local71;
		anIntArray28[4] = local77;
		anIntArray35[4] = local101;
		anIntArray34[5] = local89;
		anIntArray28[5] = local77;
		anIntArray35[5] = local101;
		anIntArray34[6] = local71;
		anIntArray28[6] = local95;
		anIntArray35[6] = local101;
		anIntArray34[7] = local89;
		anIntArray28[7] = local95;
		anIntArray35[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray34[local199];
			local210 = anIntArray28[local199];
			local214 = anIntArray35[local199];
			local243 = local3.aFloatArray109[2] * (float) local206 + local3.aFloatArray109[6] * (float) local210 + local3.aFloatArray109[10] * (float) local214 + local3.aFloatArray109[14];
			local272 = local3.aFloatArray109[3] * (float) local206 + local3.aFloatArray109[7] * (float) local210 + local3.aFloatArray109[11] * (float) local214 + local3.aFloatArray109[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray109[0] * (float) local206 + local3.aFloatArray109[4] * (float) local210 + local3.aFloatArray109[8] * (float) local214 + local3.aFloatArray109[12];
				local335 = local3.aFloatArray109[1] * (float) local206 + local3.aFloatArray109[5] * (float) local210 + local3.aFloatArray109[9] * (float) local214 + local3.aFloatArray109[13];
				@Pc(348) int local348 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local306 / local272);
				local361 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local335 / local272);
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
			if (this.aClass86_Sub3_23.anIntArray58.length < this.anInt370) {
				this.aClass86_Sub3_23.anIntArray58 = new int[this.anInt370];
				this.aClass86_Sub3_23.anIntArray59 = new int[this.anInt370];
			}
			@Pc(426) int[] local426 = this.aClass86_Sub3_23.anIntArray58;
			@Pc(430) int[] local430 = this.aClass86_Sub3_23.anIntArray59;
			for (local361 = 0; local361 < this.anInt373; local361++) {
				local206 = this.anIntArray29[local361];
				local210 = this.anIntArray31[local361];
				local214 = this.anIntArray30[local361];
				local243 = local3.aFloatArray109[2] * (float) local206 + local3.aFloatArray109[6] * (float) local210 + local3.aFloatArray109[10] * (float) local214 + local3.aFloatArray109[14];
				local272 = local3.aFloatArray109[3] * (float) local206 + local3.aFloatArray109[7] * (float) local210 + local3.aFloatArray109[11] * (float) local214 + local3.aFloatArray109[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray109[0] * (float) local206 + local3.aFloatArray109[4] * (float) local210 + local3.aFloatArray109[8] * (float) local214 + local3.aFloatArray109[12];
					local335 = local3.aFloatArray109[1] * (float) local206 + local3.aFloatArray109[5] * (float) local210 + local3.aFloatArray109[9] * (float) local214 + local3.aFloatArray109[13];
					local577 = this.anIntArray33[local361];
					local584 = this.anIntArray33[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray18[local586] != 0; local586++) {
						local604 = (this.aShortArray18[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local306 / local272);
						local430[local604] = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray33[local361];
					local584 = this.anIntArray33[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray18[local586] != 0; local586++) {
						local604 = (this.aShortArray18[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt371; local361++) {
				if (local426[this.aShortArray14[local361] & 0xFFFF] != -999999 && local426[this.aShortArray8[local361] & 0xFFFF] != -999999 && local426[this.aShortArray15[local361] & 0xFFFF] != -999999 && this.method2698(arg0, arg1, local430[this.aShortArray14[local361] & 0xFFFF], local430[this.aShortArray8[local361] & 0xFFFF], local430[this.aShortArray15[local361] & 0xFFFF], local426[this.aShortArray14[local361] & 0xFFFF], local426[this.aShortArray8[local361] & 0xFFFF], local426[this.aShortArray15[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aeb", name = "ar", descriptor = "(IILclient!ow;ZI)Z", line = 2566)
	@Override
	public boolean method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class442 local3 = this.aClass86_Sub3_23.aClass442_21;
		local3.method28969(arg2);
		local3.method28965(this.aClass86_Sub3_23.aClass442_28);
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(17) int local17 = Integer.MIN_VALUE;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(21) int local21 = Integer.MIN_VALUE;
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(34) int local34 = this.aShort6 - this.aShort1 >> 1;
		@Pc(42) int local42 = this.aShort5 - this.aShort4 >> 1;
		@Pc(50) int local50 = this.aShort8 - this.aShort7 >> 1;
		@Pc(55) int local55 = this.aShort1 + local34;
		@Pc(60) int local60 = this.aShort4 + local42;
		@Pc(65) int local65 = this.aShort7 + local50;
		@Pc(71) int local71 = local55 - (local34 << arg4);
		@Pc(77) int local77 = local60 - (local42 << arg4);
		@Pc(83) int local83 = local65 - (local50 << arg4);
		@Pc(89) int local89 = local55 + (local34 << arg4);
		@Pc(95) int local95 = local60 + (local42 << arg4);
		@Pc(101) int local101 = local65 + (local50 << arg4);
		anIntArray34[0] = local71;
		anIntArray28[0] = local77;
		anIntArray35[0] = local83;
		anIntArray34[1] = local89;
		anIntArray28[1] = local77;
		anIntArray35[1] = local83;
		anIntArray34[2] = local71;
		anIntArray28[2] = local95;
		anIntArray35[2] = local83;
		anIntArray34[3] = local89;
		anIntArray28[3] = local95;
		anIntArray35[3] = local83;
		anIntArray34[4] = local71;
		anIntArray28[4] = local77;
		anIntArray35[4] = local101;
		anIntArray34[5] = local89;
		anIntArray28[5] = local77;
		anIntArray35[5] = local101;
		anIntArray34[6] = local71;
		anIntArray28[6] = local95;
		anIntArray35[6] = local101;
		anIntArray34[7] = local89;
		anIntArray28[7] = local95;
		anIntArray35[7] = local101;
		@Pc(306) float local306;
		@Pc(335) float local335;
		@Pc(243) float local243;
		@Pc(272) float local272;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(361) int local361;
		for (@Pc(199) int local199 = 0; local199 < 8; local199++) {
			local206 = anIntArray34[local199];
			local210 = anIntArray28[local199];
			local214 = anIntArray35[local199];
			local243 = local3.aFloatArray109[2] * (float) local206 + local3.aFloatArray109[6] * (float) local210 + local3.aFloatArray109[10] * (float) local214 + local3.aFloatArray109[14];
			local272 = local3.aFloatArray109[3] * (float) local206 + local3.aFloatArray109[7] * (float) local210 + local3.aFloatArray109[11] * (float) local214 + local3.aFloatArray109[15];
			if (local243 >= -local272) {
				local306 = local3.aFloatArray109[0] * (float) local206 + local3.aFloatArray109[4] * (float) local210 + local3.aFloatArray109[8] * (float) local214 + local3.aFloatArray109[12];
				local335 = local3.aFloatArray109[1] * (float) local206 + local3.aFloatArray109[5] * (float) local210 + local3.aFloatArray109[9] * (float) local214 + local3.aFloatArray109[13];
				@Pc(348) int local348 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local306 / local272);
				local361 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local335 / local272);
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
			if (this.aClass86_Sub3_23.anIntArray58.length < this.anInt370) {
				this.aClass86_Sub3_23.anIntArray58 = new int[this.anInt370];
				this.aClass86_Sub3_23.anIntArray59 = new int[this.anInt370];
			}
			@Pc(426) int[] local426 = this.aClass86_Sub3_23.anIntArray58;
			@Pc(430) int[] local430 = this.aClass86_Sub3_23.anIntArray59;
			for (local361 = 0; local361 < this.anInt373; local361++) {
				local206 = this.anIntArray29[local361];
				local210 = this.anIntArray31[local361];
				local214 = this.anIntArray30[local361];
				local243 = local3.aFloatArray109[2] * (float) local206 + local3.aFloatArray109[6] * (float) local210 + local3.aFloatArray109[10] * (float) local214 + local3.aFloatArray109[14];
				local272 = local3.aFloatArray109[3] * (float) local206 + local3.aFloatArray109[7] * (float) local210 + local3.aFloatArray109[11] * (float) local214 + local3.aFloatArray109[15];
				@Pc(577) int local577;
				@Pc(584) int local584;
				@Pc(586) int local586;
				@Pc(604) int local604;
				if (local243 >= -local272) {
					local306 = local3.aFloatArray109[0] * (float) local206 + local3.aFloatArray109[4] * (float) local210 + local3.aFloatArray109[8] * (float) local214 + local3.aFloatArray109[12];
					local335 = local3.aFloatArray109[1] * (float) local206 + local3.aFloatArray109[5] * (float) local210 + local3.aFloatArray109[9] * (float) local214 + local3.aFloatArray109[13];
					local577 = this.anIntArray33[local361];
					local584 = this.anIntArray33[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray18[local586] != 0; local586++) {
						local604 = (this.aShortArray18[local586] & 0xFFFF) - 1;
						local426[local604] = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local306 / local272);
						local430[local604] = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local335 / local272);
					}
				} else {
					local577 = this.anIntArray33[local361];
					local584 = this.anIntArray33[local361 + 1];
					for (local586 = local577; local586 < local584 && this.aShortArray18[local586] != 0; local586++) {
						local604 = (this.aShortArray18[local586] & 0xFFFF) - 1;
						local426[local604] = -999999;
					}
				}
			}
			for (local361 = 0; local361 < this.anInt371; local361++) {
				if (local426[this.aShortArray14[local361] & 0xFFFF] != -999999 && local426[this.aShortArray8[local361] & 0xFFFF] != -999999 && local426[this.aShortArray15[local361] & 0xFFFF] != -999999 && this.method2698(arg0, arg1, local430[this.aShortArray14[local361] & 0xFFFF], local430[this.aShortArray8[local361] & 0xFFFF], local430[this.aShortArray15[local361] & 0xFFFF], local426[this.aShortArray14[local361] & 0xFFFF], local426[this.aShortArray8[local361] & 0xFFFF], local426[this.aShortArray15[local361] & 0xFFFF])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aeb", name = "hm", descriptor = "(IIIIIIII)Z", line = 2681)
	boolean method2698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!aeb", name = "io", descriptor = "(IIIIIIII)Z", line = 2681)
	boolean method2699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!aeb", name = "ir", descriptor = "(IIIIIIII)Z", line = 2681)
	boolean method2700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!aeb", name = "im", descriptor = "(IIIIIIII)Z", line = 2681)
	boolean method2701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!aeb", name = "dy", descriptor = "(Lclient!arp;)Lclient!arp;", line = 2689)
	@Override
	public Class77_Sub1_Sub16 method6871(@OriginalArg(0) Class77_Sub1_Sub16 arg0) {
		if (this.anInt370 == 0) {
			return null;
		}
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass86_Sub3_23.anInt706 > 0) {
			local29 = this.aShort1 - (this.aShort5 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local45 = this.aShort6 - (this.aShort4 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
		} else {
			local29 = this.aShort1 - (this.aShort4 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local45 = this.aShort6 - (this.aShort5 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass86_Sub3_23.anInt701 > 0) {
			local98 = this.aShort7 - (this.aShort5 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local114 = this.aShort8 - (this.aShort4 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
		} else {
			local98 = this.aShort7 - (this.aShort4 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local114 = this.aShort8 - (this.aShort5 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class77_Sub1_Sub16_Sub1 local162 = (Class77_Sub1_Sub16_Sub1) arg0;
		@Pc(171) Class77_Sub1_Sub16_Sub1 local171;
		if (local162 != null && local162.method23047(local153, local159)) {
			local171 = local162;
			local162.method23048();
		} else {
			local171 = new Class77_Sub1_Sub16_Sub1(this.aClass86_Sub3_23, local153, local159);
		}
		local171.method23045(local29, local98, local45, local114);
		this.method2703(local171);
		return local171;
	}

	@OriginalMember(owner = "client!aeb", name = "dz", descriptor = "(Lclient!arp;)Lclient!arp;", line = 2689)
	@Override
	public Class77_Sub1_Sub16 method6889(@OriginalArg(0) Class77_Sub1_Sub16 arg0) {
		if (this.anInt370 == 0) {
			return null;
		}
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass86_Sub3_23.anInt706 > 0) {
			local29 = this.aShort1 - (this.aShort5 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local45 = this.aShort6 - (this.aShort4 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
		} else {
			local29 = this.aShort1 - (this.aShort4 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local45 = this.aShort6 - (this.aShort5 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass86_Sub3_23.anInt701 > 0) {
			local98 = this.aShort7 - (this.aShort5 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local114 = this.aShort8 - (this.aShort4 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
		} else {
			local98 = this.aShort7 - (this.aShort4 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local114 = this.aShort8 - (this.aShort5 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class77_Sub1_Sub16_Sub1 local162 = (Class77_Sub1_Sub16_Sub1) arg0;
		@Pc(171) Class77_Sub1_Sub16_Sub1 local171;
		if (local162 != null && local162.method23047(local153, local159)) {
			local171 = local162;
			local162.method23048();
		} else {
			local171 = new Class77_Sub1_Sub16_Sub1(this.aClass86_Sub3_23, local153, local159);
		}
		local171.method23045(local29, local98, local45, local114);
		this.method2703(local171);
		return local171;
	}

	@OriginalMember(owner = "client!aeb", name = "dw", descriptor = "(Lclient!arp;)Lclient!arp;", line = 2689)
	@Override
	public Class77_Sub1_Sub16 method6945(@OriginalArg(0) Class77_Sub1_Sub16 arg0) {
		if (this.anInt370 == 0) {
			return null;
		}
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass86_Sub3_23.anInt706 > 0) {
			local29 = this.aShort1 - (this.aShort5 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local45 = this.aShort6 - (this.aShort4 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
		} else {
			local29 = this.aShort1 - (this.aShort4 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local45 = this.aShort6 - (this.aShort5 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass86_Sub3_23.anInt701 > 0) {
			local98 = this.aShort7 - (this.aShort5 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local114 = this.aShort8 - (this.aShort4 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
		} else {
			local98 = this.aShort7 - (this.aShort4 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local114 = this.aShort8 - (this.aShort5 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class77_Sub1_Sub16_Sub1 local162 = (Class77_Sub1_Sub16_Sub1) arg0;
		@Pc(171) Class77_Sub1_Sub16_Sub1 local171;
		if (local162 != null && local162.method23047(local153, local159)) {
			local171 = local162;
			local162.method23048();
		} else {
			local171 = new Class77_Sub1_Sub16_Sub1(this.aClass86_Sub3_23, local153, local159);
		}
		local171.method23045(local29, local98, local45, local114);
		this.method2703(local171);
		return local171;
	}

	@OriginalMember(owner = "client!aeb", name = "ad", descriptor = "(Lclient!arp;)Lclient!arp;", line = 2689)
	@Override
	public Class77_Sub1_Sub16 method6819(@OriginalArg(0) Class77_Sub1_Sub16 arg0) {
		if (this.anInt370 == 0) {
			return null;
		}
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass86_Sub3_23.anInt706 > 0) {
			local29 = this.aShort1 - (this.aShort5 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local45 = this.aShort6 - (this.aShort4 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
		} else {
			local29 = this.aShort1 - (this.aShort4 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local45 = this.aShort6 - (this.aShort5 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass86_Sub3_23.anInt701 > 0) {
			local98 = this.aShort7 - (this.aShort5 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local114 = this.aShort8 - (this.aShort4 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
		} else {
			local98 = this.aShort7 - (this.aShort4 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local114 = this.aShort8 - (this.aShort5 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class77_Sub1_Sub16_Sub1 local162 = (Class77_Sub1_Sub16_Sub1) arg0;
		@Pc(171) Class77_Sub1_Sub16_Sub1 local171;
		if (local162 != null && local162.method23047(local153, local159)) {
			local171 = local162;
			local162.method23048();
		} else {
			local171 = new Class77_Sub1_Sub16_Sub1(this.aClass86_Sub3_23, local153, local159);
		}
		local171.method23045(local29, local98, local45, local114);
		this.method2703(local171);
		return local171;
	}

	@OriginalMember(owner = "client!aeb", name = "dm", descriptor = "(Lclient!arp;)Lclient!arp;", line = 2689)
	@Override
	public Class77_Sub1_Sub16 method6888(@OriginalArg(0) Class77_Sub1_Sub16 arg0) {
		if (this.anInt370 == 0) {
			return null;
		}
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(29) int local29;
		@Pc(45) int local45;
		if (this.aClass86_Sub3_23.anInt706 > 0) {
			local29 = this.aShort1 - (this.aShort5 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local45 = this.aShort6 - (this.aShort4 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
		} else {
			local29 = this.aShort1 - (this.aShort4 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local45 = this.aShort6 - (this.aShort5 * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677;
		}
		@Pc(98) int local98;
		@Pc(114) int local114;
		if (this.aClass86_Sub3_23.anInt701 > 0) {
			local98 = this.aShort7 - (this.aShort5 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local114 = this.aShort8 - (this.aShort4 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
		} else {
			local98 = this.aShort7 - (this.aShort4 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
			local114 = this.aShort8 - (this.aShort5 * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677;
		}
		@Pc(153) int local153 = local45 - local29 + 1;
		@Pc(159) int local159 = local114 - local98 + 1;
		@Pc(162) Class77_Sub1_Sub16_Sub1 local162 = (Class77_Sub1_Sub16_Sub1) arg0;
		@Pc(171) Class77_Sub1_Sub16_Sub1 local171;
		if (local162 != null && local162.method23047(local153, local159)) {
			local171 = local162;
			local162.method23048();
		} else {
			local171 = new Class77_Sub1_Sub16_Sub1(this.aClass86_Sub3_23, local153, local159);
		}
		local171.method23045(local29, local98, local45, local114);
		this.method2703(local171);
		return local171;
	}

	@OriginalMember(owner = "client!aeb", name = "ih", descriptor = "(Lclient!ase;)V", line = 2726)
	void method2702(@OriginalArg(0) Class77_Sub1_Sub16_Sub1 arg0) {
		if (this.aClass86_Sub3_23.anIntArray58.length < this.anInt370) {
			this.aClass86_Sub3_23.anIntArray58 = new int[this.anInt370];
			this.aClass86_Sub3_23.anIntArray59 = new int[this.anInt370];
		}
		@Pc(22) int[] local22 = this.aClass86_Sub3_23.anIntArray58;
		@Pc(26) int[] local26 = this.aClass86_Sub3_23.anIntArray59;
		@Pc(28) int local28;
		@Pc(55) int local55;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(110) int local110;
		for (local28 = 0; local28 < this.anInt373; local28++) {
			local55 = (this.anIntArray29[local28] - (this.anIntArray31[local28] * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677) - arg0.anInt3123;
			local78 = (this.anIntArray30[local28] - (this.anIntArray31[local28] * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677) - arg0.anInt3122;
			local83 = this.anIntArray33[local28];
			local90 = this.anIntArray33[local28 + 1];
			for (local92 = local83; local92 < local90 && this.aShortArray18[local92] != 0; local92++) {
				local110 = (this.aShortArray18[local92] & 0xFFFF) - 1;
				local22[local110] = local55;
				local26[local110] = local78;
			}
		}
		for (local28 = 0; local28 < this.anInt372; local28++) {
			if (this.aByteArray10 == null || this.aByteArray10[local28] <= 128) {
				local55 = this.aShortArray14[local28] & 0xFFFF;
				local78 = this.aShortArray8[local28] & 0xFFFF;
				local83 = this.aShortArray15[local28] & 0xFFFF;
				local90 = local22[local55];
				local92 = local22[local78];
				local110 = local22[local83];
				@Pc(175) int local175 = local26[local55];
				@Pc(179) int local179 = local26[local78];
				@Pc(183) int local183 = local26[local83];
				if ((local90 - local92) * (local179 - local183) - (local179 - local175) * (local110 - local92) > 0) {
					arg0.method23052(local175, local179, local183, local90, local92, local110);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "hx", descriptor = "(Lclient!ase;)V", line = 2726)
	void method2703(@OriginalArg(0) Class77_Sub1_Sub16_Sub1 arg0) {
		if (this.aClass86_Sub3_23.anIntArray58.length < this.anInt370) {
			this.aClass86_Sub3_23.anIntArray58 = new int[this.anInt370];
			this.aClass86_Sub3_23.anIntArray59 = new int[this.anInt370];
		}
		@Pc(22) int[] local22 = this.aClass86_Sub3_23.anIntArray58;
		@Pc(26) int[] local26 = this.aClass86_Sub3_23.anIntArray59;
		@Pc(28) int local28;
		@Pc(55) int local55;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(110) int local110;
		for (local28 = 0; local28 < this.anInt373; local28++) {
			local55 = (this.anIntArray29[local28] - (this.anIntArray31[local28] * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677) - arg0.anInt3123;
			local78 = (this.anIntArray30[local28] - (this.anIntArray31[local28] * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677) - arg0.anInt3122;
			local83 = this.anIntArray33[local28];
			local90 = this.anIntArray33[local28 + 1];
			for (local92 = local83; local92 < local90 && this.aShortArray18[local92] != 0; local92++) {
				local110 = (this.aShortArray18[local92] & 0xFFFF) - 1;
				local22[local110] = local55;
				local26[local110] = local78;
			}
		}
		for (local28 = 0; local28 < this.anInt372; local28++) {
			if (this.aByteArray10 == null || this.aByteArray10[local28] <= 128) {
				local55 = this.aShortArray14[local28] & 0xFFFF;
				local78 = this.aShortArray8[local28] & 0xFFFF;
				local83 = this.aShortArray15[local28] & 0xFFFF;
				local90 = local22[local55];
				local92 = local22[local78];
				local110 = local22[local83];
				@Pc(175) int local175 = local26[local55];
				@Pc(179) int local179 = local26[local78];
				@Pc(183) int local183 = local26[local83];
				if ((local90 - local92) * (local179 - local183) - (local179 - local175) * (local110 - local92) > 0) {
					arg0.method23052(local175, local179, local183, local90, local92, local110);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "il", descriptor = "(Lclient!ase;)V", line = 2726)
	void method2704(@OriginalArg(0) Class77_Sub1_Sub16_Sub1 arg0) {
		if (this.aClass86_Sub3_23.anIntArray58.length < this.anInt370) {
			this.aClass86_Sub3_23.anIntArray58 = new int[this.anInt370];
			this.aClass86_Sub3_23.anIntArray59 = new int[this.anInt370];
		}
		@Pc(22) int[] local22 = this.aClass86_Sub3_23.anIntArray58;
		@Pc(26) int[] local26 = this.aClass86_Sub3_23.anIntArray59;
		@Pc(28) int local28;
		@Pc(55) int local55;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(110) int local110;
		for (local28 = 0; local28 < this.anInt373; local28++) {
			local55 = (this.anIntArray29[local28] - (this.anIntArray31[local28] * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677) - arg0.anInt3123;
			local78 = (this.anIntArray30[local28] - (this.anIntArray31[local28] * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677) - arg0.anInt3122;
			local83 = this.anIntArray33[local28];
			local90 = this.anIntArray33[local28 + 1];
			for (local92 = local83; local92 < local90 && this.aShortArray18[local92] != 0; local92++) {
				local110 = (this.aShortArray18[local92] & 0xFFFF) - 1;
				local22[local110] = local55;
				local26[local110] = local78;
			}
		}
		for (local28 = 0; local28 < this.anInt372; local28++) {
			if (this.aByteArray10 == null || this.aByteArray10[local28] <= 128) {
				local55 = this.aShortArray14[local28] & 0xFFFF;
				local78 = this.aShortArray8[local28] & 0xFFFF;
				local83 = this.aShortArray15[local28] & 0xFFFF;
				local90 = local22[local55];
				local92 = local22[local78];
				local110 = local22[local83];
				@Pc(175) int local175 = local26[local55];
				@Pc(179) int local179 = local26[local78];
				@Pc(183) int local183 = local26[local83];
				if ((local90 - local92) * (local179 - local183) - (local179 - local175) * (local110 - local92) > 0) {
					arg0.method23052(local175, local179, local183, local90, local92, local110);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ie", descriptor = "(Lclient!ase;)V", line = 2726)
	void method2705(@OriginalArg(0) Class77_Sub1_Sub16_Sub1 arg0) {
		if (this.aClass86_Sub3_23.anIntArray58.length < this.anInt370) {
			this.aClass86_Sub3_23.anIntArray58 = new int[this.anInt370];
			this.aClass86_Sub3_23.anIntArray59 = new int[this.anInt370];
		}
		@Pc(22) int[] local22 = this.aClass86_Sub3_23.anIntArray58;
		@Pc(26) int[] local26 = this.aClass86_Sub3_23.anIntArray59;
		@Pc(28) int local28;
		@Pc(55) int local55;
		@Pc(78) int local78;
		@Pc(83) int local83;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(110) int local110;
		for (local28 = 0; local28 < this.anInt373; local28++) {
			local55 = (this.anIntArray29[local28] - (this.anIntArray31[local28] * this.aClass86_Sub3_23.anInt706 >> 8) >> this.aClass86_Sub3_23.anInt677) - arg0.anInt3123;
			local78 = (this.anIntArray30[local28] - (this.anIntArray31[local28] * this.aClass86_Sub3_23.anInt701 >> 8) >> this.aClass86_Sub3_23.anInt677) - arg0.anInt3122;
			local83 = this.anIntArray33[local28];
			local90 = this.anIntArray33[local28 + 1];
			for (local92 = local83; local92 < local90 && this.aShortArray18[local92] != 0; local92++) {
				local110 = (this.aShortArray18[local92] & 0xFFFF) - 1;
				local22[local110] = local55;
				local26[local110] = local78;
			}
		}
		for (local28 = 0; local28 < this.anInt372; local28++) {
			if (this.aByteArray10 == null || this.aByteArray10[local28] <= 128) {
				local55 = this.aShortArray14[local28] & 0xFFFF;
				local78 = this.aShortArray8[local28] & 0xFFFF;
				local83 = this.aShortArray15[local28] & 0xFFFF;
				local90 = local22[local55];
				local92 = local22[local78];
				local110 = local22[local83];
				@Pc(175) int local175 = local26[local55];
				@Pc(179) int local179 = local26[local78];
				@Pc(183) int local183 = local26[local83];
				if ((local90 - local92) * (local179 - local183) - (local179 - local175) * (local110 - local92) > 0) {
					arg0.method23052(local175, local179, local183, local90, local92, local110);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ax", descriptor = "(Lclient!ow;Lclient!eh;I)V", line = 2762)
	@Override
	public void method6813(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt370 == 0) {
			return;
		}
		@Pc(14) Class442 local14 = this.aClass86_Sub3_23.aClass442_26;
		@Pc(18) Class442 local18 = this.aClass86_Sub3_23.aClass442_21;
		@Pc(22) Class442 local22 = this.aClass86_Sub3_23.aClass442_23;
		local18.method28969(arg0);
		local22.method28954(local18);
		local22.method28965(this.aClass86_Sub3_23.aClass442_28);
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(42) float[] local42 = this.aClass86_Sub3_23.aFloatArray21;
		local18.method28984(0.0F, (float) this.aShort4, 0.0F, local42);
		@Pc(54) float local54 = local42[0];
		@Pc(58) float local58 = local42[1];
		@Pc(62) float local62 = local42[2];
		local18.method28984(0.0F, (float) this.aShort5, 0.0F, local42);
		@Pc(74) float local74 = local42[0];
		@Pc(78) float local78 = local42[1];
		@Pc(82) float local82 = local42[2];
		@Pc(119) float local119;
		@Pc(145) float local145;
		for (@Pc(84) int local84 = 0; local84 < 6; local84++) {
			@Pc(93) float[] local93 = this.aClass86_Sub3_23.aFloatArrayArray11[local84];
			local119 = local93[0] * local54 + local93[1] * local58 + local93[2] * local62 + local93[3] + (float) this.anInt362;
			local145 = local93[0] * local74 + local93[1] * local78 + local93[2] * local82 + local93[3] + (float) this.anInt362;
			if (local119 < 0.0F && local145 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(160) boolean local160 = false;
			@Pc(162) boolean local162 = true;
			@Pc(170) int local170 = this.aShort1 + this.aShort6 >> 1;
			@Pc(178) int local178 = this.aShort7 + this.aShort8 >> 1;
			@Pc(183) short local183 = this.aShort4;
			@Pc(214) float local214 = local22.aFloatArray109[0] * (float) local170 + local22.aFloatArray109[4] * (float) local183 + local22.aFloatArray109[8] * (float) local178 + local22.aFloatArray109[12];
			@Pc(243) float local243 = local22.aFloatArray109[1] * (float) local170 + local22.aFloatArray109[5] * (float) local183 + local22.aFloatArray109[9] * (float) local178 + local22.aFloatArray109[13];
			local119 = local22.aFloatArray109[2] * (float) local170 + local22.aFloatArray109[6] * (float) local183 + local22.aFloatArray109[10] * (float) local178 + local22.aFloatArray109[14];
			local145 = local22.aFloatArray109[3] * (float) local170 + local22.aFloatArray109[7] * (float) local183 + local22.aFloatArray109[11] * (float) local178 + local22.aFloatArray109[15];
			if (local119 >= -local145) {
				arg1.anInt3745 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local214 / local145);
				arg1.anInt3746 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local243 / local145);
			} else {
				local160 = true;
			}
			local183 = this.aShort5;
			@Pc(373) float local373 = local22.aFloatArray109[0] * (float) local170 + local22.aFloatArray109[4] * (float) local183 + local22.aFloatArray109[8] * (float) local178 + local22.aFloatArray109[12];
			@Pc(402) float local402 = local22.aFloatArray109[1] * (float) local170 + local22.aFloatArray109[5] * (float) local183 + local22.aFloatArray109[9] * (float) local178 + local22.aFloatArray109[13];
			@Pc(431) float local431 = local22.aFloatArray109[2] * (float) local170 + local22.aFloatArray109[6] * (float) local183 + local22.aFloatArray109[10] * (float) local178 + local22.aFloatArray109[14];
			@Pc(460) float local460 = local22.aFloatArray109[3] * (float) local170 + local22.aFloatArray109[7] * (float) local183 + local22.aFloatArray109[11] * (float) local178 + local22.aFloatArray109[15];
			if (local431 >= -local460) {
				arg1.anInt3748 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local373 / local460);
				arg1.anInt3747 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local402 / local460);
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
						arg1.anInt3745 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local534 / local550);
						arg1.anInt3746 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local542 / local550);
					} else if (local431 < -local460) {
						local526 = (local431 + local460) / (local119 + local145) - 1.0F;
						local534 = local373 + local526 * (local214 - local373);
						local542 = local402 + local526 * (local243 - local402);
						local550 = local460 + local526 * (local145 - local460);
						arg1.anInt3748 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local534 / local550);
						arg1.anInt3747 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local542 / local550);
					}
				}
			}
			if (local162) {
				if (local119 / local145 > local431 / local460) {
					local526 = local214 + local14.aFloatArray109[0] * (float) this.anInt362 + local14.aFloatArray109[12];
					local534 = local145 + local14.aFloatArray109[3] * (float) this.anInt362 + local14.aFloatArray109[15];
					arg1.anInt3744 = (int) (this.aClass86_Sub3_23.aFloat58 - (float) arg1.anInt3745 + this.aClass86_Sub3_23.aFloat71 * local526 / local534);
				} else {
					local526 = local373 + local14.aFloatArray109[0] * (float) this.anInt362 + local14.aFloatArray109[12];
					local534 = local460 + local14.aFloatArray109[3] * (float) this.anInt362 + local14.aFloatArray109[15];
					arg1.anInt3744 = (int) (this.aClass86_Sub3_23.aFloat58 - (float) arg1.anInt3748 + this.aClass86_Sub3_23.aFloat71 * local526 / local534);
				}
				arg1.aBoolean644 = true;
			}
		}
		this.aClass86_Sub3_23.method6178();
		this.aClass86_Sub3_23.method6076(local18);
		this.method2706();
		this.aClass86_Sub3_23.method6081();
		local18.method28965(this.aClass86_Sub3_23.aClass442_22);
		this.method2709(local18);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@OriginalMember(owner = "client!aeb", name = "cj", descriptor = "(Lclient!ow;Lclient!eh;I)V", line = 2762)
	@Override
	public void method6939(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt370 == 0) {
			return;
		}
		@Pc(14) Class442 local14 = this.aClass86_Sub3_23.aClass442_26;
		@Pc(18) Class442 local18 = this.aClass86_Sub3_23.aClass442_21;
		@Pc(22) Class442 local22 = this.aClass86_Sub3_23.aClass442_23;
		local18.method28969(arg0);
		local22.method28954(local18);
		local22.method28965(this.aClass86_Sub3_23.aClass442_28);
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(42) float[] local42 = this.aClass86_Sub3_23.aFloatArray21;
		local18.method28984(0.0F, (float) this.aShort4, 0.0F, local42);
		@Pc(54) float local54 = local42[0];
		@Pc(58) float local58 = local42[1];
		@Pc(62) float local62 = local42[2];
		local18.method28984(0.0F, (float) this.aShort5, 0.0F, local42);
		@Pc(74) float local74 = local42[0];
		@Pc(78) float local78 = local42[1];
		@Pc(82) float local82 = local42[2];
		@Pc(119) float local119;
		@Pc(145) float local145;
		for (@Pc(84) int local84 = 0; local84 < 6; local84++) {
			@Pc(93) float[] local93 = this.aClass86_Sub3_23.aFloatArrayArray11[local84];
			local119 = local93[0] * local54 + local93[1] * local58 + local93[2] * local62 + local93[3] + (float) this.anInt362;
			local145 = local93[0] * local74 + local93[1] * local78 + local93[2] * local82 + local93[3] + (float) this.anInt362;
			if (local119 < 0.0F && local145 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(160) boolean local160 = false;
			@Pc(162) boolean local162 = true;
			@Pc(170) int local170 = this.aShort1 + this.aShort6 >> 1;
			@Pc(178) int local178 = this.aShort7 + this.aShort8 >> 1;
			@Pc(183) short local183 = this.aShort4;
			@Pc(214) float local214 = local22.aFloatArray109[0] * (float) local170 + local22.aFloatArray109[4] * (float) local183 + local22.aFloatArray109[8] * (float) local178 + local22.aFloatArray109[12];
			@Pc(243) float local243 = local22.aFloatArray109[1] * (float) local170 + local22.aFloatArray109[5] * (float) local183 + local22.aFloatArray109[9] * (float) local178 + local22.aFloatArray109[13];
			local119 = local22.aFloatArray109[2] * (float) local170 + local22.aFloatArray109[6] * (float) local183 + local22.aFloatArray109[10] * (float) local178 + local22.aFloatArray109[14];
			local145 = local22.aFloatArray109[3] * (float) local170 + local22.aFloatArray109[7] * (float) local183 + local22.aFloatArray109[11] * (float) local178 + local22.aFloatArray109[15];
			if (local119 >= -local145) {
				arg1.anInt3745 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local214 / local145);
				arg1.anInt3746 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local243 / local145);
			} else {
				local160 = true;
			}
			local183 = this.aShort5;
			@Pc(373) float local373 = local22.aFloatArray109[0] * (float) local170 + local22.aFloatArray109[4] * (float) local183 + local22.aFloatArray109[8] * (float) local178 + local22.aFloatArray109[12];
			@Pc(402) float local402 = local22.aFloatArray109[1] * (float) local170 + local22.aFloatArray109[5] * (float) local183 + local22.aFloatArray109[9] * (float) local178 + local22.aFloatArray109[13];
			@Pc(431) float local431 = local22.aFloatArray109[2] * (float) local170 + local22.aFloatArray109[6] * (float) local183 + local22.aFloatArray109[10] * (float) local178 + local22.aFloatArray109[14];
			@Pc(460) float local460 = local22.aFloatArray109[3] * (float) local170 + local22.aFloatArray109[7] * (float) local183 + local22.aFloatArray109[11] * (float) local178 + local22.aFloatArray109[15];
			if (local431 >= -local460) {
				arg1.anInt3748 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local373 / local460);
				arg1.anInt3747 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local402 / local460);
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
						arg1.anInt3745 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local534 / local550);
						arg1.anInt3746 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local542 / local550);
					} else if (local431 < -local460) {
						local526 = (local431 + local460) / (local119 + local145) - 1.0F;
						local534 = local373 + local526 * (local214 - local373);
						local542 = local402 + local526 * (local243 - local402);
						local550 = local460 + local526 * (local145 - local460);
						arg1.anInt3748 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local534 / local550);
						arg1.anInt3747 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local542 / local550);
					}
				}
			}
			if (local162) {
				if (local119 / local145 > local431 / local460) {
					local526 = local214 + local14.aFloatArray109[0] * (float) this.anInt362 + local14.aFloatArray109[12];
					local534 = local145 + local14.aFloatArray109[3] * (float) this.anInt362 + local14.aFloatArray109[15];
					arg1.anInt3744 = (int) (this.aClass86_Sub3_23.aFloat58 - (float) arg1.anInt3745 + this.aClass86_Sub3_23.aFloat71 * local526 / local534);
				} else {
					local526 = local373 + local14.aFloatArray109[0] * (float) this.anInt362 + local14.aFloatArray109[12];
					local534 = local460 + local14.aFloatArray109[3] * (float) this.anInt362 + local14.aFloatArray109[15];
					arg1.anInt3744 = (int) (this.aClass86_Sub3_23.aFloat58 - (float) arg1.anInt3748 + this.aClass86_Sub3_23.aFloat71 * local526 / local534);
				}
				arg1.aBoolean644 = true;
			}
		}
		this.aClass86_Sub3_23.method6178();
		this.aClass86_Sub3_23.method6076(local18);
		this.method2706();
		this.aClass86_Sub3_23.method6081();
		local18.method28965(this.aClass86_Sub3_23.aClass442_22);
		this.method2709(local18);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ce", descriptor = "(Lclient!ow;Lclient!eh;I)V", line = 2762)
	@Override
	public void method6814(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) int arg2) {
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (this.anInt370 == 0) {
			return;
		}
		@Pc(14) Class442 local14 = this.aClass86_Sub3_23.aClass442_26;
		@Pc(18) Class442 local18 = this.aClass86_Sub3_23.aClass442_21;
		@Pc(22) Class442 local22 = this.aClass86_Sub3_23.aClass442_23;
		local18.method28969(arg0);
		local22.method28954(local18);
		local22.method28965(this.aClass86_Sub3_23.aClass442_28);
		if (!this.aBoolean60) {
			this.method2695();
		}
		@Pc(42) float[] local42 = this.aClass86_Sub3_23.aFloatArray21;
		local18.method28984(0.0F, (float) this.aShort4, 0.0F, local42);
		@Pc(54) float local54 = local42[0];
		@Pc(58) float local58 = local42[1];
		@Pc(62) float local62 = local42[2];
		local18.method28984(0.0F, (float) this.aShort5, 0.0F, local42);
		@Pc(74) float local74 = local42[0];
		@Pc(78) float local78 = local42[1];
		@Pc(82) float local82 = local42[2];
		@Pc(119) float local119;
		@Pc(145) float local145;
		for (@Pc(84) int local84 = 0; local84 < 6; local84++) {
			@Pc(93) float[] local93 = this.aClass86_Sub3_23.aFloatArrayArray11[local84];
			local119 = local93[0] * local54 + local93[1] * local58 + local93[2] * local62 + local93[3] + (float) this.anInt362;
			local145 = local93[0] * local74 + local93[1] * local78 + local93[2] * local82 + local93[3] + (float) this.anInt362;
			if (local119 < 0.0F && local145 < 0.0F) {
				return;
			}
		}
		if (arg1 != null) {
			@Pc(160) boolean local160 = false;
			@Pc(162) boolean local162 = true;
			@Pc(170) int local170 = this.aShort1 + this.aShort6 >> 1;
			@Pc(178) int local178 = this.aShort7 + this.aShort8 >> 1;
			@Pc(183) short local183 = this.aShort4;
			@Pc(214) float local214 = local22.aFloatArray109[0] * (float) local170 + local22.aFloatArray109[4] * (float) local183 + local22.aFloatArray109[8] * (float) local178 + local22.aFloatArray109[12];
			@Pc(243) float local243 = local22.aFloatArray109[1] * (float) local170 + local22.aFloatArray109[5] * (float) local183 + local22.aFloatArray109[9] * (float) local178 + local22.aFloatArray109[13];
			local119 = local22.aFloatArray109[2] * (float) local170 + local22.aFloatArray109[6] * (float) local183 + local22.aFloatArray109[10] * (float) local178 + local22.aFloatArray109[14];
			local145 = local22.aFloatArray109[3] * (float) local170 + local22.aFloatArray109[7] * (float) local183 + local22.aFloatArray109[11] * (float) local178 + local22.aFloatArray109[15];
			if (local119 >= -local145) {
				arg1.anInt3745 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local214 / local145);
				arg1.anInt3746 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local243 / local145);
			} else {
				local160 = true;
			}
			local183 = this.aShort5;
			@Pc(373) float local373 = local22.aFloatArray109[0] * (float) local170 + local22.aFloatArray109[4] * (float) local183 + local22.aFloatArray109[8] * (float) local178 + local22.aFloatArray109[12];
			@Pc(402) float local402 = local22.aFloatArray109[1] * (float) local170 + local22.aFloatArray109[5] * (float) local183 + local22.aFloatArray109[9] * (float) local178 + local22.aFloatArray109[13];
			@Pc(431) float local431 = local22.aFloatArray109[2] * (float) local170 + local22.aFloatArray109[6] * (float) local183 + local22.aFloatArray109[10] * (float) local178 + local22.aFloatArray109[14];
			@Pc(460) float local460 = local22.aFloatArray109[3] * (float) local170 + local22.aFloatArray109[7] * (float) local183 + local22.aFloatArray109[11] * (float) local178 + local22.aFloatArray109[15];
			if (local431 >= -local460) {
				arg1.anInt3748 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local373 / local460);
				arg1.anInt3747 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local402 / local460);
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
						arg1.anInt3745 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local534 / local550);
						arg1.anInt3746 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local542 / local550);
					} else if (local431 < -local460) {
						local526 = (local431 + local460) / (local119 + local145) - 1.0F;
						local534 = local373 + local526 * (local214 - local373);
						local542 = local402 + local526 * (local243 - local402);
						local550 = local460 + local526 * (local145 - local460);
						arg1.anInt3748 = (int) (this.aClass86_Sub3_23.aFloat58 + this.aClass86_Sub3_23.aFloat71 * local534 / local550);
						arg1.anInt3747 = (int) (this.aClass86_Sub3_23.aFloat59 + this.aClass86_Sub3_23.aFloat60 * local542 / local550);
					}
				}
			}
			if (local162) {
				if (local119 / local145 > local431 / local460) {
					local526 = local214 + local14.aFloatArray109[0] * (float) this.anInt362 + local14.aFloatArray109[12];
					local534 = local145 + local14.aFloatArray109[3] * (float) this.anInt362 + local14.aFloatArray109[15];
					arg1.anInt3744 = (int) (this.aClass86_Sub3_23.aFloat58 - (float) arg1.anInt3745 + this.aClass86_Sub3_23.aFloat71 * local526 / local534);
				} else {
					local526 = local373 + local14.aFloatArray109[0] * (float) this.anInt362 + local14.aFloatArray109[12];
					local534 = local460 + local14.aFloatArray109[3] * (float) this.anInt362 + local14.aFloatArray109[15];
					arg1.anInt3744 = (int) (this.aClass86_Sub3_23.aFloat58 - (float) arg1.anInt3748 + this.aClass86_Sub3_23.aFloat71 * local526 / local534);
				}
				arg1.aBoolean644 = true;
			}
		}
		this.aClass86_Sub3_23.method6178();
		this.aClass86_Sub3_23.method6076(local18);
		this.method2706();
		this.aClass86_Sub3_23.method6081();
		local18.method28965(this.aClass86_Sub3_23.aClass442_22);
		this.method2709(local18);
		if ((arg2 & 0x2) != 0) {
			OpenGL.glPolygonMode(1028, 6914);
		}
	}

	@OriginalMember(owner = "client!aeb", name = "he", descriptor = "()V", line = 2865)
	void method2706() {
		if (this.anInt372 == 0) {
			return;
		}
		if (this.aByte3 != 0) {
			this.method2715(true);
		}
		this.method2715(false);
		if (this.aClass175_1 != null) {
			if (this.aClass175_1.anInterface15_4 == null) {
				this.method2713((this.aByte3 & 0x10) != 0);
			}
			if (this.aClass175_1.anInterface15_4 != null) {
				this.aClass86_Sub3_23.method6233(this.aClass172_2 != null);
				this.aClass86_Sub3_23.method6155(this.aClass172_1, this.aClass172_2, this.aClass172_3, this.aClass172_4);
				@Pc(59) int local59 = this.anIntArray32.length - 1;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(69) int local69 = this.anIntArray32[local61];
					@Pc(76) int local76 = this.anIntArray32[local61 + 1];
					@Pc(91) int local91 = this.aShortArray16[local69] == -1 ? -1 : this.aShortArray16[local69] & 0xFFFF;
					this.aClass86_Sub3_23.method6183(local91, this.aClass172_2 != null);
					this.aClass86_Sub3_23.method6163(this.aClass175_1.anInterface15_4, 4, local69 * 3, (local76 - local69) * 3);
				}
			}
		}
		this.method2693();
	}

	@OriginalMember(owner = "client!aeb", name = "iv", descriptor = "()V", line = 2865)
	void method2707() {
		if (this.anInt372 == 0) {
			return;
		}
		if (this.aByte3 != 0) {
			this.method2715(true);
		}
		this.method2715(false);
		if (this.aClass175_1 != null) {
			if (this.aClass175_1.anInterface15_4 == null) {
				this.method2713((this.aByte3 & 0x10) != 0);
			}
			if (this.aClass175_1.anInterface15_4 != null) {
				this.aClass86_Sub3_23.method6233(this.aClass172_2 != null);
				this.aClass86_Sub3_23.method6155(this.aClass172_1, this.aClass172_2, this.aClass172_3, this.aClass172_4);
				@Pc(59) int local59 = this.anIntArray32.length - 1;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(69) int local69 = this.anIntArray32[local61];
					@Pc(76) int local76 = this.anIntArray32[local61 + 1];
					@Pc(91) int local91 = this.aShortArray16[local69] == -1 ? -1 : this.aShortArray16[local69] & 0xFFFF;
					this.aClass86_Sub3_23.method6183(local91, this.aClass172_2 != null);
					this.aClass86_Sub3_23.method6163(this.aClass175_1.anInterface15_4, 4, local69 * 3, (local76 - local69) * 3);
				}
			}
		}
		this.method2693();
	}

	@OriginalMember(owner = "client!aeb", name = "jz", descriptor = "()V", line = 2865)
	void method2708() {
		if (this.anInt372 == 0) {
			return;
		}
		if (this.aByte3 != 0) {
			this.method2715(true);
		}
		this.method2715(false);
		if (this.aClass175_1 != null) {
			if (this.aClass175_1.anInterface15_4 == null) {
				this.method2713((this.aByte3 & 0x10) != 0);
			}
			if (this.aClass175_1.anInterface15_4 != null) {
				this.aClass86_Sub3_23.method6233(this.aClass172_2 != null);
				this.aClass86_Sub3_23.method6155(this.aClass172_1, this.aClass172_2, this.aClass172_3, this.aClass172_4);
				@Pc(59) int local59 = this.anIntArray32.length - 1;
				for (@Pc(61) int local61 = 0; local61 < local59; local61++) {
					@Pc(69) int local69 = this.anIntArray32[local61];
					@Pc(76) int local76 = this.anIntArray32[local61 + 1];
					@Pc(91) int local91 = this.aShortArray16[local69] == -1 ? -1 : this.aShortArray16[local69] & 0xFFFF;
					this.aClass86_Sub3_23.method6183(local91, this.aClass172_2 != null);
					this.aClass86_Sub3_23.method6163(this.aClass175_1.anInterface15_4, 4, local69 * 3, (local76 - local69) * 3);
				}
			}
		}
		this.method2693();
	}

	@OriginalMember(owner = "client!aeb", name = "ho", descriptor = "(Lclient!oi;)V", line = 2887)
	void method2709(@OriginalArg(0) Class442 arg0) {
		if (this.aClass189Array1 == null) {
			return;
		}
		@Pc(6) Class442 local6 = this.aClass86_Sub3_23.aClass442_24;
		this.aClass86_Sub3_23.method6071();
		this.aClass86_Sub3_23.method20230(!this.aBoolean57);
		this.aClass86_Sub3_23.method6233(false);
		this.aClass86_Sub3_23.method6155(this.aClass86_Sub3_23.aClass172_9, null, null, this.aClass86_Sub3_23.aClass172_10);
		for (@Pc(35) int local35 = 0; local35 < this.anInt377; local35++) {
			@Pc(44) Class189 local44 = this.aClass189Array1[local35];
			@Pc(49) Class176 local49 = this.aClass176Array1[local35];
			if (!local44.aBoolean566 || !this.aClass86_Sub3_23.method20183()) {
				@Pc(78) float local78 = (float) (this.anIntArray29[local44.anInt3338] + this.anIntArray29[local44.anInt3341] + this.anIntArray29[local44.anInt3337]) * 0.3333333F;
				@Pc(99) float local99 = (float) (this.anIntArray31[local44.anInt3338] + this.anIntArray31[local44.anInt3341] + this.anIntArray31[local44.anInt3337]) * 0.3333333F;
				@Pc(120) float local120 = (float) (this.anIntArray30[local44.anInt3338] + this.anIntArray30[local44.anInt3341] + this.anIntArray30[local44.anInt3337]) * 0.3333333F;
				@Pc(146) float local146 = arg0.aFloatArray109[0] * local78 + arg0.aFloatArray109[4] * local99 + arg0.aFloatArray109[8] * local120 + arg0.aFloatArray109[12];
				@Pc(172) float local172 = arg0.aFloatArray109[1] * local78 + arg0.aFloatArray109[5] * local99 + arg0.aFloatArray109[9] * local120 + arg0.aFloatArray109[13];
				@Pc(198) float local198 = arg0.aFloatArray109[2] * local78 + arg0.aFloatArray109[6] * local99 + arg0.aFloatArray109[10] * local120 + arg0.aFloatArray109[14];
				@Pc(219) float local219 = (float) (1.0D / Math.sqrt((double) (local146 * local146 + local172 * local172 + local198 * local198))) * (float) local44.anInt3340;
				local6.method29058(local49.anInt3303, local49.anInt3299 * local44.aShort151 >> 7, local49.anInt3298 * local44.aShort152 >> 7, local146 + (float) local49.anInt3301 - local146 * local219, local172 + (float) local49.anInt3300 - local172 * local219, local198 - local198 * local219);
				this.aClass86_Sub3_23.method6079(local6);
				@Pc(267) int local267 = local49.anInt3302;
				OpenGL.glColor4ub((byte) (local267 >> 16), (byte) (local267 >> 8), (byte) local267, (byte) (local267 >> 24));
				this.aClass86_Sub3_23.method6180(local44.aShort153);
				this.aClass86_Sub3_23.method6250(local44.aByte109);
				this.aClass86_Sub3_23.method6159(7, 0, 4);
			}
		}
		this.aClass86_Sub3_23.method20230(true);
		this.aClass86_Sub3_23.method6081();
	}

	@OriginalMember(owner = "client!aeb", name = "jr", descriptor = "(Lclient!oi;)V", line = 2887)
	void method2710(@OriginalArg(0) Class442 arg0) {
		if (this.aClass189Array1 == null) {
			return;
		}
		@Pc(6) Class442 local6 = this.aClass86_Sub3_23.aClass442_24;
		this.aClass86_Sub3_23.method6071();
		this.aClass86_Sub3_23.method20230(!this.aBoolean57);
		this.aClass86_Sub3_23.method6233(false);
		this.aClass86_Sub3_23.method6155(this.aClass86_Sub3_23.aClass172_9, null, null, this.aClass86_Sub3_23.aClass172_10);
		for (@Pc(35) int local35 = 0; local35 < this.anInt377; local35++) {
			@Pc(44) Class189 local44 = this.aClass189Array1[local35];
			@Pc(49) Class176 local49 = this.aClass176Array1[local35];
			if (!local44.aBoolean566 || !this.aClass86_Sub3_23.method20183()) {
				@Pc(78) float local78 = (float) (this.anIntArray29[local44.anInt3338] + this.anIntArray29[local44.anInt3341] + this.anIntArray29[local44.anInt3337]) * 0.3333333F;
				@Pc(99) float local99 = (float) (this.anIntArray31[local44.anInt3338] + this.anIntArray31[local44.anInt3341] + this.anIntArray31[local44.anInt3337]) * 0.3333333F;
				@Pc(120) float local120 = (float) (this.anIntArray30[local44.anInt3338] + this.anIntArray30[local44.anInt3341] + this.anIntArray30[local44.anInt3337]) * 0.3333333F;
				@Pc(146) float local146 = arg0.aFloatArray109[0] * local78 + arg0.aFloatArray109[4] * local99 + arg0.aFloatArray109[8] * local120 + arg0.aFloatArray109[12];
				@Pc(172) float local172 = arg0.aFloatArray109[1] * local78 + arg0.aFloatArray109[5] * local99 + arg0.aFloatArray109[9] * local120 + arg0.aFloatArray109[13];
				@Pc(198) float local198 = arg0.aFloatArray109[2] * local78 + arg0.aFloatArray109[6] * local99 + arg0.aFloatArray109[10] * local120 + arg0.aFloatArray109[14];
				@Pc(219) float local219 = (float) (1.0D / Math.sqrt((double) (local146 * local146 + local172 * local172 + local198 * local198))) * (float) local44.anInt3340;
				local6.method29058(local49.anInt3303, local49.anInt3299 * local44.aShort151 >> 7, local49.anInt3298 * local44.aShort152 >> 7, local146 + (float) local49.anInt3301 - local146 * local219, local172 + (float) local49.anInt3300 - local172 * local219, local198 - local198 * local219);
				this.aClass86_Sub3_23.method6079(local6);
				@Pc(267) int local267 = local49.anInt3302;
				OpenGL.glColor4ub((byte) (local267 >> 16), (byte) (local267 >> 8), (byte) local267, (byte) (local267 >> 24));
				this.aClass86_Sub3_23.method6180(local44.aShort153);
				this.aClass86_Sub3_23.method6250(local44.aByte109);
				this.aClass86_Sub3_23.method6159(7, 0, 4);
			}
		}
		this.aClass86_Sub3_23.method20230(true);
		this.aClass86_Sub3_23.method6081();
	}

	@OriginalMember(owner = "client!aeb", name = "js", descriptor = "(Lclient!oi;)V", line = 2887)
	void method2711(@OriginalArg(0) Class442 arg0) {
		if (this.aClass189Array1 == null) {
			return;
		}
		@Pc(6) Class442 local6 = this.aClass86_Sub3_23.aClass442_24;
		this.aClass86_Sub3_23.method6071();
		this.aClass86_Sub3_23.method20230(!this.aBoolean57);
		this.aClass86_Sub3_23.method6233(false);
		this.aClass86_Sub3_23.method6155(this.aClass86_Sub3_23.aClass172_9, null, null, this.aClass86_Sub3_23.aClass172_10);
		for (@Pc(35) int local35 = 0; local35 < this.anInt377; local35++) {
			@Pc(44) Class189 local44 = this.aClass189Array1[local35];
			@Pc(49) Class176 local49 = this.aClass176Array1[local35];
			if (!local44.aBoolean566 || !this.aClass86_Sub3_23.method20183()) {
				@Pc(78) float local78 = (float) (this.anIntArray29[local44.anInt3338] + this.anIntArray29[local44.anInt3341] + this.anIntArray29[local44.anInt3337]) * 0.3333333F;
				@Pc(99) float local99 = (float) (this.anIntArray31[local44.anInt3338] + this.anIntArray31[local44.anInt3341] + this.anIntArray31[local44.anInt3337]) * 0.3333333F;
				@Pc(120) float local120 = (float) (this.anIntArray30[local44.anInt3338] + this.anIntArray30[local44.anInt3341] + this.anIntArray30[local44.anInt3337]) * 0.3333333F;
				@Pc(146) float local146 = arg0.aFloatArray109[0] * local78 + arg0.aFloatArray109[4] * local99 + arg0.aFloatArray109[8] * local120 + arg0.aFloatArray109[12];
				@Pc(172) float local172 = arg0.aFloatArray109[1] * local78 + arg0.aFloatArray109[5] * local99 + arg0.aFloatArray109[9] * local120 + arg0.aFloatArray109[13];
				@Pc(198) float local198 = arg0.aFloatArray109[2] * local78 + arg0.aFloatArray109[6] * local99 + arg0.aFloatArray109[10] * local120 + arg0.aFloatArray109[14];
				@Pc(219) float local219 = (float) (1.0D / Math.sqrt((double) (local146 * local146 + local172 * local172 + local198 * local198))) * (float) local44.anInt3340;
				local6.method29058(local49.anInt3303, local49.anInt3299 * local44.aShort151 >> 7, local49.anInt3298 * local44.aShort152 >> 7, local146 + (float) local49.anInt3301 - local146 * local219, local172 + (float) local49.anInt3300 - local172 * local219, local198 - local198 * local219);
				this.aClass86_Sub3_23.method6079(local6);
				@Pc(267) int local267 = local49.anInt3302;
				OpenGL.glColor4ub((byte) (local267 >> 16), (byte) (local267 >> 8), (byte) local267, (byte) (local267 >> 24));
				this.aClass86_Sub3_23.method6180(local44.aShort153);
				this.aClass86_Sub3_23.method6250(local44.aByte109);
				this.aClass86_Sub3_23.method6159(7, 0, 4);
			}
		}
		this.aClass86_Sub3_23.method20230(true);
		this.aClass86_Sub3_23.method6081();
	}

	@OriginalMember(owner = "client!aeb", name = "jv", descriptor = "(Z)V", line = 2918)
	void method2712(@OriginalArg(0) boolean arg0) {
		if (this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1.aByteArray53.length < this.anInt372 * 6) {
			this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1 = new Class77_Sub39_Sub2((this.anInt372 + 100) * 6);
		} else {
			this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1.anInt3089 = 0;
		}
		@Pc(31) Class77_Sub39_Sub2 local31 = this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1;
		@Pc(37) int local37;
		if (this.aClass86_Sub3_23.aBoolean116) {
			for (local37 = 0; local37 < this.anInt372; local37++) {
				local31.method22408(this.aShortArray14[local37]);
				local31.method22408(this.aShortArray8[local37]);
				local31.method22408(this.aShortArray15[local37]);
			}
		} else {
			for (local37 = 0; local37 < this.anInt372; local37++) {
				local31.method22412(this.aShortArray14[local37]);
				local31.method22412(this.aShortArray8[local37]);
				local31.method22412(this.aShortArray15[local37]);
			}
		}
		if (local31.anInt3089 * 31645619 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface15_1 == null) {
				this.anInterface15_1 = this.aClass86_Sub3_23.method6138(5123, local31.aByteArray53, local31.anInt3089 * 31645619, true);
			} else {
				this.anInterface15_1.method1832(local31.aByteArray53, local31.anInt3089 * 31645619);
			}
			this.aClass175_1.anInterface15_4 = this.anInterface15_1;
		} else {
			this.aClass175_1.anInterface15_4 = this.aClass86_Sub3_23.method6138(5123, local31.aByteArray53, local31.anInt3089 * 31645619, false);
		}
		if (!arg0) {
			this.aBoolean61 = true;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "iq", descriptor = "(Z)V", line = 2918)
	void method2713(@OriginalArg(0) boolean arg0) {
		if (this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1.aByteArray53.length < this.anInt372 * 6) {
			this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1 = new Class77_Sub39_Sub2((this.anInt372 + 100) * 6);
		} else {
			this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1.anInt3089 = 0;
		}
		@Pc(31) Class77_Sub39_Sub2 local31 = this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1;
		@Pc(37) int local37;
		if (this.aClass86_Sub3_23.aBoolean116) {
			for (local37 = 0; local37 < this.anInt372; local37++) {
				local31.method22408(this.aShortArray14[local37]);
				local31.method22408(this.aShortArray8[local37]);
				local31.method22408(this.aShortArray15[local37]);
			}
		} else {
			for (local37 = 0; local37 < this.anInt372; local37++) {
				local31.method22412(this.aShortArray14[local37]);
				local31.method22412(this.aShortArray8[local37]);
				local31.method22412(this.aShortArray15[local37]);
			}
		}
		if (local31.anInt3089 * 31645619 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface15_1 == null) {
				this.anInterface15_1 = this.aClass86_Sub3_23.method6138(5123, local31.aByteArray53, local31.anInt3089 * 31645619, true);
			} else {
				this.anInterface15_1.method1832(local31.aByteArray53, local31.anInt3089 * 31645619);
			}
			this.aClass175_1.anInterface15_4 = this.anInterface15_1;
		} else {
			this.aClass175_1.anInterface15_4 = this.aClass86_Sub3_23.method6138(5123, local31.aByteArray53, local31.anInt3089 * 31645619, false);
		}
		if (!arg0) {
			this.aBoolean61 = true;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "jl", descriptor = "(Z)V", line = 2918)
	void method2714(@OriginalArg(0) boolean arg0) {
		if (this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1.aByteArray53.length < this.anInt372 * 6) {
			this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1 = new Class77_Sub39_Sub2((this.anInt372 + 100) * 6);
		} else {
			this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1.anInt3089 = 0;
		}
		@Pc(31) Class77_Sub39_Sub2 local31 = this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1;
		@Pc(37) int local37;
		if (this.aClass86_Sub3_23.aBoolean116) {
			for (local37 = 0; local37 < this.anInt372; local37++) {
				local31.method22408(this.aShortArray14[local37]);
				local31.method22408(this.aShortArray8[local37]);
				local31.method22408(this.aShortArray15[local37]);
			}
		} else {
			for (local37 = 0; local37 < this.anInt372; local37++) {
				local31.method22412(this.aShortArray14[local37]);
				local31.method22412(this.aShortArray8[local37]);
				local31.method22412(this.aShortArray15[local37]);
			}
		}
		if (local31.anInt3089 * 31645619 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface15_1 == null) {
				this.anInterface15_1 = this.aClass86_Sub3_23.method6138(5123, local31.aByteArray53, local31.anInt3089 * 31645619, true);
			} else {
				this.anInterface15_1.method1832(local31.aByteArray53, local31.anInt3089 * 31645619);
			}
			this.aClass175_1.anInterface15_4 = this.anInterface15_1;
		} else {
			this.aClass175_1.anInterface15_4 = this.aClass86_Sub3_23.method6138(5123, local31.aByteArray53, local31.anInt3089 * 31645619, false);
		}
		if (!arg0) {
			this.aBoolean61 = true;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "ib", descriptor = "(Z)V", line = 2946)
	void method2715(@OriginalArg(0) boolean arg0) {
		@Pc(10) boolean local10 = this.aClass172_3 != null && this.aClass172_3.anInterface14_6 == null;
		@Pc(21) boolean local21 = this.aClass172_2 != null && this.aClass172_2.anInterface14_6 == null;
		@Pc(32) boolean local32 = this.aClass172_1 != null && this.aClass172_1.anInterface14_6 == null;
		@Pc(43) boolean local43 = this.aClass172_4 != null && this.aClass172_4.anInterface14_6 == null;
		if (arg0) {
			local10 &= (this.aByte3 & 0x2) != 0;
			local21 &= (this.aByte3 & 0x4) != 0;
			local32 &= (this.aByte3 & 0x1) != 0;
			local43 &= (this.aByte3 & 0x8) != 0;
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
		if (this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1.aByteArray53.length < this.anInt370 * local91) {
			this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1 = new Class77_Sub39_Sub2((this.anInt370 + 100) * local91);
		} else {
			this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1.anInt3089 = 0;
		}
		@Pc(170) Class77_Sub39_Sub2 local170 = this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(217) int local217;
		@Pc(235) int local235;
		if (local32) {
			@Pc(196) int local196;
			@Pc(203) int local203;
			@Pc(208) int local208;
			@Pc(215) int local215;
			if (this.aClass86_Sub3_23.aBoolean116) {
				for (local178 = 0; local178 < this.anInt373; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray29[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray31[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray30[local178]);
					local208 = this.anIntArray33[local178];
					local215 = this.anIntArray33[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray18[local217] != 0; local217++) {
						local235 = (this.aShortArray18[local217] & 0xFFFF) - 1;
						local170.anInt3089 = local235 * local91 * -1387468933;
						local170.method22417(local189);
						local170.method22417(local196);
						local170.method22417(local203);
					}
				}
			} else {
				for (local178 = 0; local178 < this.anInt373; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray29[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray31[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray30[local178]);
					local208 = this.anIntArray33[local178];
					local215 = this.anIntArray33[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray18[local217] != 0; local217++) {
						local235 = (this.aShortArray18[local217] & 0xFFFF) - 1;
						local170.anInt3089 = local235 * local91 * -1387468933;
						local170.method22420(local189);
						local170.method22420(local196);
						local170.method22420(local203);
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
			if (this.aClass172_2 == null) {
				if (this.aClass190_1 == null) {
					local353 = this.aShortArray10;
					local357 = this.aShortArray9;
					local361 = this.aShortArray11;
					local365 = this.aByteArray9;
				} else {
					local353 = this.aClass190_1.aShortArray85;
					local357 = this.aClass190_1.aShortArray84;
					local361 = this.aClass190_1.aShortArray83;
					local365 = this.aClass190_1.aByteArray59;
				}
				@Pc(384) float local384 = this.aClass86_Sub3_23.aFloatArray23[0];
				@Pc(390) float local390 = this.aClass86_Sub3_23.aFloatArray23[1];
				@Pc(396) float local396 = this.aClass86_Sub3_23.aFloatArray23[2];
				@Pc(400) float local400 = this.aClass86_Sub3_23.aFloat68;
				@Pc(410) float local410 = this.aClass86_Sub3_23.aFloat73 * 768.0F / (float) this.aShort3;
				@Pc(420) float local420 = this.aClass86_Sub3_23.aFloat57 * 768.0F / (float) this.aShort3;
				for (@Pc(422) int local422 = 0; local422 < this.anInt371; local422++) {
					@Pc(443) int local443 = this.method2720(this.aShortArray13[local422], this.aShortArray16[local422], this.aShort2, this.aByteArray10[local422]);
					@Pc(452) float local452 = (float) (local443 >>> 24) * this.aClass86_Sub3_23.aFloat65;
					local463 = (float) (local443 >> 16 & 0xFF) * this.aClass86_Sub3_23.aFloat66;
					@Pc(474) float local474 = (float) (local443 >> 8 & 0xFF) * this.aClass86_Sub3_23.aFloat67;
					@Pc(481) int local481 = this.aShortArray14[local422] & 0xFFFF;
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
					local170.anInt3089 = (local95 + local481 * local91) * -1387468933;
					local170.method22403(local555);
					local170.method22403(local570);
					local170.method22403(local585);
					local170.method22403(255 - (this.aByteArray10[local422] & 0xFF));
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
					local170.anInt3089 = (local95 + local481 * local91) * -1387468933;
					local170.method22403(local555);
					local170.method22403(local570);
					local170.method22403(local585);
					local170.method22403(255 - (this.aByteArray10[local422] & 0xFF));
					local481 = this.aShortArray15[local422] & 0xFFFF;
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
					local170.anInt3089 = (local95 + local481 * local91) * -1387468933;
					local170.method22403(local555);
					local170.method22403(local570);
					local170.method22403(local585);
					local170.method22403(255 - (this.aByteArray10[local422] & 0xFF));
				}
			} else {
				for (local178 = 0; local178 < this.anInt371; local178++) {
					local189 = this.method2720(this.aShortArray13[local178], this.aShortArray16[local178], this.aShort2, this.aByteArray10[local178]);
					local170.anInt3089 = (local95 + (this.aShortArray14[local178] & 0xFFFF) * local91) * -1387468933;
					local170.method22417(local189);
					local170.anInt3089 = (local95 + (this.aShortArray8[local178] & 0xFFFF) * local91) * -1387468933;
					local170.method22417(local189);
					local170.anInt3089 = (local95 + (this.aShortArray15[local178] & 0xFFFF) * local91) * -1387468933;
					local170.method22417(local189);
				}
			}
		}
		if (local21) {
			if (this.aClass190_1 == null) {
				local353 = this.aShortArray10;
				local357 = this.aShortArray9;
				local361 = this.aShortArray11;
				local365 = this.aByteArray9;
			} else {
				local353 = this.aClass190_1.aShortArray85;
				local357 = this.aClass190_1.aShortArray84;
				local361 = this.aClass190_1.aShortArray83;
				local365 = this.aClass190_1.aByteArray59;
			}
			@Pc(1055) float local1055 = 3.0F / (float) this.aShort3;
			local511 = 3.0F / (float) (this.aShort3 + this.aShort3 / 2);
			local170.anInt3089 = local97 * -1387468933;
			if (this.aClass86_Sub3_23.aBoolean116) {
				for (local217 = 0; local217 < this.anInt370; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method22659((float) local353[local217] * local511);
						local170.method22659((float) local357[local217] * local511);
						local170.method22659((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method22659((float) local353[local217] * local463);
						local170.method22659((float) local357[local217] * local463);
						local170.method22659((float) local361[local217] * local463);
					}
					local170.anInt3089 += (local91 - 12) * -1387468933;
				}
			} else {
				for (local217 = 0; local217 < this.anInt370; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method22663((float) local353[local217] * local511);
						local170.method22663((float) local357[local217] * local511);
						local170.method22663((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method22663((float) local353[local217] * local463);
						local170.method22663((float) local357[local217] * local463);
						local170.method22663((float) local361[local217] * local463);
					}
					local170.anInt3089 += (local91 - 12) * -1387468933;
				}
			}
		}
		if (local43) {
			local170.anInt3089 = local99 * -1387468933;
			if (this.aClass86_Sub3_23.aBoolean116) {
				for (local178 = 0; local178 < this.anInt370; local178++) {
					local170.method22659(this.aFloatArray6[local178]);
					local170.method22659(this.aFloatArray7[local178]);
					local170.anInt3089 += (local91 - 8) * -1387468933;
				}
			} else {
				for (local178 = 0; local178 < this.anInt370; local178++) {
					local170.method22663(this.aFloatArray6[local178]);
					local170.method22663(this.aFloatArray7[local178]);
					local170.anInt3089 += (local91 - 8) * -1387468933;
				}
			}
		}
		local170.anInt3089 = local91 * this.anInt370 * -1387468933;
		@Pc(1348) Interface14 local1348;
		if (arg0) {
			if (this.anInterface14_1 == null) {
				this.anInterface14_1 = this.aClass86_Sub3_23.method6141(local91, local170.aByteArray53, local170.anInt3089 * 31645619, true);
			} else {
				this.anInterface14_1.method1785(local91, local170.aByteArray53, local170.anInt3089 * 31645619);
			}
			local1348 = this.anInterface14_1;
			this.aByte3 = 0;
		} else {
			local1348 = this.aClass86_Sub3_23.method6141(local91, local170.aByteArray53, local170.anInt3089 * 31645619, false);
			this.aBoolean61 = true;
		}
		if (local32) {
			this.aClass172_1.anInterface14_6 = local1348;
			this.aClass172_1.aByte107 = local93;
		}
		if (local43) {
			this.aClass172_4.anInterface14_6 = local1348;
			this.aClass172_4.aByte107 = local99;
		}
		if (local10) {
			this.aClass172_3.anInterface14_6 = local1348;
			this.aClass172_3.aByte107 = local95;
		}
		if (local21) {
			this.aClass172_2.anInterface14_6 = local1348;
			this.aClass172_2.aByte107 = local97;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "jn", descriptor = "(Z)V", line = 2946)
	void method2716(@OriginalArg(0) boolean arg0) {
		@Pc(10) boolean local10 = this.aClass172_3 != null && this.aClass172_3.anInterface14_6 == null;
		@Pc(21) boolean local21 = this.aClass172_2 != null && this.aClass172_2.anInterface14_6 == null;
		@Pc(32) boolean local32 = this.aClass172_1 != null && this.aClass172_1.anInterface14_6 == null;
		@Pc(43) boolean local43 = this.aClass172_4 != null && this.aClass172_4.anInterface14_6 == null;
		if (arg0) {
			local10 &= (this.aByte3 & 0x2) != 0;
			local21 &= (this.aByte3 & 0x4) != 0;
			local32 &= (this.aByte3 & 0x1) != 0;
			local43 &= (this.aByte3 & 0x8) != 0;
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
		if (this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1.aByteArray53.length < this.anInt370 * local91) {
			this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1 = new Class77_Sub39_Sub2((this.anInt370 + 100) * local91);
		} else {
			this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1.anInt3089 = 0;
		}
		@Pc(170) Class77_Sub39_Sub2 local170 = this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(217) int local217;
		@Pc(235) int local235;
		if (local32) {
			@Pc(196) int local196;
			@Pc(203) int local203;
			@Pc(208) int local208;
			@Pc(215) int local215;
			if (this.aClass86_Sub3_23.aBoolean116) {
				for (local178 = 0; local178 < this.anInt373; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray29[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray31[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray30[local178]);
					local208 = this.anIntArray33[local178];
					local215 = this.anIntArray33[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray18[local217] != 0; local217++) {
						local235 = (this.aShortArray18[local217] & 0xFFFF) - 1;
						local170.anInt3089 = local235 * local91 * -1387468933;
						local170.method22417(local189);
						local170.method22417(local196);
						local170.method22417(local203);
					}
				}
			} else {
				for (local178 = 0; local178 < this.anInt373; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray29[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray31[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray30[local178]);
					local208 = this.anIntArray33[local178];
					local215 = this.anIntArray33[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray18[local217] != 0; local217++) {
						local235 = (this.aShortArray18[local217] & 0xFFFF) - 1;
						local170.anInt3089 = local235 * local91 * -1387468933;
						local170.method22420(local189);
						local170.method22420(local196);
						local170.method22420(local203);
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
			if (this.aClass172_2 == null) {
				if (this.aClass190_1 == null) {
					local353 = this.aShortArray10;
					local357 = this.aShortArray9;
					local361 = this.aShortArray11;
					local365 = this.aByteArray9;
				} else {
					local353 = this.aClass190_1.aShortArray85;
					local357 = this.aClass190_1.aShortArray84;
					local361 = this.aClass190_1.aShortArray83;
					local365 = this.aClass190_1.aByteArray59;
				}
				@Pc(384) float local384 = this.aClass86_Sub3_23.aFloatArray23[0];
				@Pc(390) float local390 = this.aClass86_Sub3_23.aFloatArray23[1];
				@Pc(396) float local396 = this.aClass86_Sub3_23.aFloatArray23[2];
				@Pc(400) float local400 = this.aClass86_Sub3_23.aFloat68;
				@Pc(410) float local410 = this.aClass86_Sub3_23.aFloat73 * 768.0F / (float) this.aShort3;
				@Pc(420) float local420 = this.aClass86_Sub3_23.aFloat57 * 768.0F / (float) this.aShort3;
				for (@Pc(422) int local422 = 0; local422 < this.anInt371; local422++) {
					@Pc(443) int local443 = this.method2720(this.aShortArray13[local422], this.aShortArray16[local422], this.aShort2, this.aByteArray10[local422]);
					@Pc(452) float local452 = (float) (local443 >>> 24) * this.aClass86_Sub3_23.aFloat65;
					local463 = (float) (local443 >> 16 & 0xFF) * this.aClass86_Sub3_23.aFloat66;
					@Pc(474) float local474 = (float) (local443 >> 8 & 0xFF) * this.aClass86_Sub3_23.aFloat67;
					@Pc(481) int local481 = this.aShortArray14[local422] & 0xFFFF;
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
					local170.anInt3089 = (local95 + local481 * local91) * -1387468933;
					local170.method22403(local555);
					local170.method22403(local570);
					local170.method22403(local585);
					local170.method22403(255 - (this.aByteArray10[local422] & 0xFF));
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
					local170.anInt3089 = (local95 + local481 * local91) * -1387468933;
					local170.method22403(local555);
					local170.method22403(local570);
					local170.method22403(local585);
					local170.method22403(255 - (this.aByteArray10[local422] & 0xFF));
					local481 = this.aShortArray15[local422] & 0xFFFF;
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
					local170.anInt3089 = (local95 + local481 * local91) * -1387468933;
					local170.method22403(local555);
					local170.method22403(local570);
					local170.method22403(local585);
					local170.method22403(255 - (this.aByteArray10[local422] & 0xFF));
				}
			} else {
				for (local178 = 0; local178 < this.anInt371; local178++) {
					local189 = this.method2720(this.aShortArray13[local178], this.aShortArray16[local178], this.aShort2, this.aByteArray10[local178]);
					local170.anInt3089 = (local95 + (this.aShortArray14[local178] & 0xFFFF) * local91) * -1387468933;
					local170.method22417(local189);
					local170.anInt3089 = (local95 + (this.aShortArray8[local178] & 0xFFFF) * local91) * -1387468933;
					local170.method22417(local189);
					local170.anInt3089 = (local95 + (this.aShortArray15[local178] & 0xFFFF) * local91) * -1387468933;
					local170.method22417(local189);
				}
			}
		}
		if (local21) {
			if (this.aClass190_1 == null) {
				local353 = this.aShortArray10;
				local357 = this.aShortArray9;
				local361 = this.aShortArray11;
				local365 = this.aByteArray9;
			} else {
				local353 = this.aClass190_1.aShortArray85;
				local357 = this.aClass190_1.aShortArray84;
				local361 = this.aClass190_1.aShortArray83;
				local365 = this.aClass190_1.aByteArray59;
			}
			@Pc(1055) float local1055 = 3.0F / (float) this.aShort3;
			local511 = 3.0F / (float) (this.aShort3 + this.aShort3 / 2);
			local170.anInt3089 = local97 * -1387468933;
			if (this.aClass86_Sub3_23.aBoolean116) {
				for (local217 = 0; local217 < this.anInt370; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method22659((float) local353[local217] * local511);
						local170.method22659((float) local357[local217] * local511);
						local170.method22659((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method22659((float) local353[local217] * local463);
						local170.method22659((float) local357[local217] * local463);
						local170.method22659((float) local361[local217] * local463);
					}
					local170.anInt3089 += (local91 - 12) * -1387468933;
				}
			} else {
				for (local217 = 0; local217 < this.anInt370; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method22663((float) local353[local217] * local511);
						local170.method22663((float) local357[local217] * local511);
						local170.method22663((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method22663((float) local353[local217] * local463);
						local170.method22663((float) local357[local217] * local463);
						local170.method22663((float) local361[local217] * local463);
					}
					local170.anInt3089 += (local91 - 12) * -1387468933;
				}
			}
		}
		if (local43) {
			local170.anInt3089 = local99 * -1387468933;
			if (this.aClass86_Sub3_23.aBoolean116) {
				for (local178 = 0; local178 < this.anInt370; local178++) {
					local170.method22659(this.aFloatArray6[local178]);
					local170.method22659(this.aFloatArray7[local178]);
					local170.anInt3089 += (local91 - 8) * -1387468933;
				}
			} else {
				for (local178 = 0; local178 < this.anInt370; local178++) {
					local170.method22663(this.aFloatArray6[local178]);
					local170.method22663(this.aFloatArray7[local178]);
					local170.anInt3089 += (local91 - 8) * -1387468933;
				}
			}
		}
		local170.anInt3089 = local91 * this.anInt370 * -1387468933;
		@Pc(1348) Interface14 local1348;
		if (arg0) {
			if (this.anInterface14_1 == null) {
				this.anInterface14_1 = this.aClass86_Sub3_23.method6141(local91, local170.aByteArray53, local170.anInt3089 * 31645619, true);
			} else {
				this.anInterface14_1.method1785(local91, local170.aByteArray53, local170.anInt3089 * 31645619);
			}
			local1348 = this.anInterface14_1;
			this.aByte3 = 0;
		} else {
			local1348 = this.aClass86_Sub3_23.method6141(local91, local170.aByteArray53, local170.anInt3089 * 31645619, false);
			this.aBoolean61 = true;
		}
		if (local32) {
			this.aClass172_1.anInterface14_6 = local1348;
			this.aClass172_1.aByte107 = local93;
		}
		if (local43) {
			this.aClass172_4.anInterface14_6 = local1348;
			this.aClass172_4.aByte107 = local99;
		}
		if (local10) {
			this.aClass172_3.anInterface14_6 = local1348;
			this.aClass172_3.aByte107 = local95;
		}
		if (local21) {
			this.aClass172_2.anInterface14_6 = local1348;
			this.aClass172_2.aByte107 = local97;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "jd", descriptor = "(Z)V", line = 2946)
	void method2717(@OriginalArg(0) boolean arg0) {
		@Pc(10) boolean local10 = this.aClass172_3 != null && this.aClass172_3.anInterface14_6 == null;
		@Pc(21) boolean local21 = this.aClass172_2 != null && this.aClass172_2.anInterface14_6 == null;
		@Pc(32) boolean local32 = this.aClass172_1 != null && this.aClass172_1.anInterface14_6 == null;
		@Pc(43) boolean local43 = this.aClass172_4 != null && this.aClass172_4.anInterface14_6 == null;
		if (arg0) {
			local10 &= (this.aByte3 & 0x2) != 0;
			local21 &= (this.aByte3 & 0x4) != 0;
			local32 &= (this.aByte3 & 0x1) != 0;
			local43 &= (this.aByte3 & 0x8) != 0;
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
		if (this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1.aByteArray53.length < this.anInt370 * local91) {
			this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1 = new Class77_Sub39_Sub2((this.anInt370 + 100) * local91);
		} else {
			this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1.anInt3089 = 0;
		}
		@Pc(170) Class77_Sub39_Sub2 local170 = this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(217) int local217;
		@Pc(235) int local235;
		if (local32) {
			@Pc(196) int local196;
			@Pc(203) int local203;
			@Pc(208) int local208;
			@Pc(215) int local215;
			if (this.aClass86_Sub3_23.aBoolean116) {
				for (local178 = 0; local178 < this.anInt373; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray29[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray31[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray30[local178]);
					local208 = this.anIntArray33[local178];
					local215 = this.anIntArray33[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray18[local217] != 0; local217++) {
						local235 = (this.aShortArray18[local217] & 0xFFFF) - 1;
						local170.anInt3089 = local235 * local91 * -1387468933;
						local170.method22417(local189);
						local170.method22417(local196);
						local170.method22417(local203);
					}
				}
			} else {
				for (local178 = 0; local178 < this.anInt373; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray29[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray31[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray30[local178]);
					local208 = this.anIntArray33[local178];
					local215 = this.anIntArray33[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray18[local217] != 0; local217++) {
						local235 = (this.aShortArray18[local217] & 0xFFFF) - 1;
						local170.anInt3089 = local235 * local91 * -1387468933;
						local170.method22420(local189);
						local170.method22420(local196);
						local170.method22420(local203);
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
			if (this.aClass172_2 == null) {
				if (this.aClass190_1 == null) {
					local353 = this.aShortArray10;
					local357 = this.aShortArray9;
					local361 = this.aShortArray11;
					local365 = this.aByteArray9;
				} else {
					local353 = this.aClass190_1.aShortArray85;
					local357 = this.aClass190_1.aShortArray84;
					local361 = this.aClass190_1.aShortArray83;
					local365 = this.aClass190_1.aByteArray59;
				}
				@Pc(384) float local384 = this.aClass86_Sub3_23.aFloatArray23[0];
				@Pc(390) float local390 = this.aClass86_Sub3_23.aFloatArray23[1];
				@Pc(396) float local396 = this.aClass86_Sub3_23.aFloatArray23[2];
				@Pc(400) float local400 = this.aClass86_Sub3_23.aFloat68;
				@Pc(410) float local410 = this.aClass86_Sub3_23.aFloat73 * 768.0F / (float) this.aShort3;
				@Pc(420) float local420 = this.aClass86_Sub3_23.aFloat57 * 768.0F / (float) this.aShort3;
				for (@Pc(422) int local422 = 0; local422 < this.anInt371; local422++) {
					@Pc(443) int local443 = this.method2720(this.aShortArray13[local422], this.aShortArray16[local422], this.aShort2, this.aByteArray10[local422]);
					@Pc(452) float local452 = (float) (local443 >>> 24) * this.aClass86_Sub3_23.aFloat65;
					local463 = (float) (local443 >> 16 & 0xFF) * this.aClass86_Sub3_23.aFloat66;
					@Pc(474) float local474 = (float) (local443 >> 8 & 0xFF) * this.aClass86_Sub3_23.aFloat67;
					@Pc(481) int local481 = this.aShortArray14[local422] & 0xFFFF;
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
					local170.anInt3089 = (local95 + local481 * local91) * -1387468933;
					local170.method22403(local555);
					local170.method22403(local570);
					local170.method22403(local585);
					local170.method22403(255 - (this.aByteArray10[local422] & 0xFF));
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
					local170.anInt3089 = (local95 + local481 * local91) * -1387468933;
					local170.method22403(local555);
					local170.method22403(local570);
					local170.method22403(local585);
					local170.method22403(255 - (this.aByteArray10[local422] & 0xFF));
					local481 = this.aShortArray15[local422] & 0xFFFF;
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
					local170.anInt3089 = (local95 + local481 * local91) * -1387468933;
					local170.method22403(local555);
					local170.method22403(local570);
					local170.method22403(local585);
					local170.method22403(255 - (this.aByteArray10[local422] & 0xFF));
				}
			} else {
				for (local178 = 0; local178 < this.anInt371; local178++) {
					local189 = this.method2720(this.aShortArray13[local178], this.aShortArray16[local178], this.aShort2, this.aByteArray10[local178]);
					local170.anInt3089 = (local95 + (this.aShortArray14[local178] & 0xFFFF) * local91) * -1387468933;
					local170.method22417(local189);
					local170.anInt3089 = (local95 + (this.aShortArray8[local178] & 0xFFFF) * local91) * -1387468933;
					local170.method22417(local189);
					local170.anInt3089 = (local95 + (this.aShortArray15[local178] & 0xFFFF) * local91) * -1387468933;
					local170.method22417(local189);
				}
			}
		}
		if (local21) {
			if (this.aClass190_1 == null) {
				local353 = this.aShortArray10;
				local357 = this.aShortArray9;
				local361 = this.aShortArray11;
				local365 = this.aByteArray9;
			} else {
				local353 = this.aClass190_1.aShortArray85;
				local357 = this.aClass190_1.aShortArray84;
				local361 = this.aClass190_1.aShortArray83;
				local365 = this.aClass190_1.aByteArray59;
			}
			@Pc(1055) float local1055 = 3.0F / (float) this.aShort3;
			local511 = 3.0F / (float) (this.aShort3 + this.aShort3 / 2);
			local170.anInt3089 = local97 * -1387468933;
			if (this.aClass86_Sub3_23.aBoolean116) {
				for (local217 = 0; local217 < this.anInt370; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method22659((float) local353[local217] * local511);
						local170.method22659((float) local357[local217] * local511);
						local170.method22659((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method22659((float) local353[local217] * local463);
						local170.method22659((float) local357[local217] * local463);
						local170.method22659((float) local361[local217] * local463);
					}
					local170.anInt3089 += (local91 - 12) * -1387468933;
				}
			} else {
				for (local217 = 0; local217 < this.anInt370; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method22663((float) local353[local217] * local511);
						local170.method22663((float) local357[local217] * local511);
						local170.method22663((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method22663((float) local353[local217] * local463);
						local170.method22663((float) local357[local217] * local463);
						local170.method22663((float) local361[local217] * local463);
					}
					local170.anInt3089 += (local91 - 12) * -1387468933;
				}
			}
		}
		if (local43) {
			local170.anInt3089 = local99 * -1387468933;
			if (this.aClass86_Sub3_23.aBoolean116) {
				for (local178 = 0; local178 < this.anInt370; local178++) {
					local170.method22659(this.aFloatArray6[local178]);
					local170.method22659(this.aFloatArray7[local178]);
					local170.anInt3089 += (local91 - 8) * -1387468933;
				}
			} else {
				for (local178 = 0; local178 < this.anInt370; local178++) {
					local170.method22663(this.aFloatArray6[local178]);
					local170.method22663(this.aFloatArray7[local178]);
					local170.anInt3089 += (local91 - 8) * -1387468933;
				}
			}
		}
		local170.anInt3089 = local91 * this.anInt370 * -1387468933;
		@Pc(1348) Interface14 local1348;
		if (arg0) {
			if (this.anInterface14_1 == null) {
				this.anInterface14_1 = this.aClass86_Sub3_23.method6141(local91, local170.aByteArray53, local170.anInt3089 * 31645619, true);
			} else {
				this.anInterface14_1.method1785(local91, local170.aByteArray53, local170.anInt3089 * 31645619);
			}
			local1348 = this.anInterface14_1;
			this.aByte3 = 0;
		} else {
			local1348 = this.aClass86_Sub3_23.method6141(local91, local170.aByteArray53, local170.anInt3089 * 31645619, false);
			this.aBoolean61 = true;
		}
		if (local32) {
			this.aClass172_1.anInterface14_6 = local1348;
			this.aClass172_1.aByte107 = local93;
		}
		if (local43) {
			this.aClass172_4.anInterface14_6 = local1348;
			this.aClass172_4.aByte107 = local99;
		}
		if (local10) {
			this.aClass172_3.anInterface14_6 = local1348;
			this.aClass172_3.aByte107 = local95;
		}
		if (local21) {
			this.aClass172_2.anInterface14_6 = local1348;
			this.aClass172_2.aByte107 = local97;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "jo", descriptor = "(Z)V", line = 2946)
	void method2718(@OriginalArg(0) boolean arg0) {
		@Pc(10) boolean local10 = this.aClass172_3 != null && this.aClass172_3.anInterface14_6 == null;
		@Pc(21) boolean local21 = this.aClass172_2 != null && this.aClass172_2.anInterface14_6 == null;
		@Pc(32) boolean local32 = this.aClass172_1 != null && this.aClass172_1.anInterface14_6 == null;
		@Pc(43) boolean local43 = this.aClass172_4 != null && this.aClass172_4.anInterface14_6 == null;
		if (arg0) {
			local10 &= (this.aByte3 & 0x2) != 0;
			local21 &= (this.aByte3 & 0x4) != 0;
			local32 &= (this.aByte3 & 0x1) != 0;
			local43 &= (this.aByte3 & 0x8) != 0;
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
		if (this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1.aByteArray53.length < this.anInt370 * local91) {
			this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1 = new Class77_Sub39_Sub2((this.anInt370 + 100) * local91);
		} else {
			this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1.anInt3089 = 0;
		}
		@Pc(170) Class77_Sub39_Sub2 local170 = this.aClass86_Sub3_23.aClass77_Sub39_Sub2_1;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(217) int local217;
		@Pc(235) int local235;
		if (local32) {
			@Pc(196) int local196;
			@Pc(203) int local203;
			@Pc(208) int local208;
			@Pc(215) int local215;
			if (this.aClass86_Sub3_23.aBoolean116) {
				for (local178 = 0; local178 < this.anInt373; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray29[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray31[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray30[local178]);
					local208 = this.anIntArray33[local178];
					local215 = this.anIntArray33[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray18[local217] != 0; local217++) {
						local235 = (this.aShortArray18[local217] & 0xFFFF) - 1;
						local170.anInt3089 = local235 * local91 * -1387468933;
						local170.method22417(local189);
						local170.method22417(local196);
						local170.method22417(local203);
					}
				}
			} else {
				for (local178 = 0; local178 < this.anInt373; local178++) {
					local189 = Stream.floatToRawIntBits((float) this.anIntArray29[local178]);
					local196 = Stream.floatToRawIntBits((float) this.anIntArray31[local178]);
					local203 = Stream.floatToRawIntBits((float) this.anIntArray30[local178]);
					local208 = this.anIntArray33[local178];
					local215 = this.anIntArray33[local178 + 1];
					for (local217 = local208; local217 < local215 && this.aShortArray18[local217] != 0; local217++) {
						local235 = (this.aShortArray18[local217] & 0xFFFF) - 1;
						local170.anInt3089 = local235 * local91 * -1387468933;
						local170.method22420(local189);
						local170.method22420(local196);
						local170.method22420(local203);
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
			if (this.aClass172_2 == null) {
				if (this.aClass190_1 == null) {
					local353 = this.aShortArray10;
					local357 = this.aShortArray9;
					local361 = this.aShortArray11;
					local365 = this.aByteArray9;
				} else {
					local353 = this.aClass190_1.aShortArray85;
					local357 = this.aClass190_1.aShortArray84;
					local361 = this.aClass190_1.aShortArray83;
					local365 = this.aClass190_1.aByteArray59;
				}
				@Pc(384) float local384 = this.aClass86_Sub3_23.aFloatArray23[0];
				@Pc(390) float local390 = this.aClass86_Sub3_23.aFloatArray23[1];
				@Pc(396) float local396 = this.aClass86_Sub3_23.aFloatArray23[2];
				@Pc(400) float local400 = this.aClass86_Sub3_23.aFloat68;
				@Pc(410) float local410 = this.aClass86_Sub3_23.aFloat73 * 768.0F / (float) this.aShort3;
				@Pc(420) float local420 = this.aClass86_Sub3_23.aFloat57 * 768.0F / (float) this.aShort3;
				for (@Pc(422) int local422 = 0; local422 < this.anInt371; local422++) {
					@Pc(443) int local443 = this.method2720(this.aShortArray13[local422], this.aShortArray16[local422], this.aShort2, this.aByteArray10[local422]);
					@Pc(452) float local452 = (float) (local443 >>> 24) * this.aClass86_Sub3_23.aFloat65;
					local463 = (float) (local443 >> 16 & 0xFF) * this.aClass86_Sub3_23.aFloat66;
					@Pc(474) float local474 = (float) (local443 >> 8 & 0xFF) * this.aClass86_Sub3_23.aFloat67;
					@Pc(481) int local481 = this.aShortArray14[local422] & 0xFFFF;
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
					local170.anInt3089 = (local95 + local481 * local91) * -1387468933;
					local170.method22403(local555);
					local170.method22403(local570);
					local170.method22403(local585);
					local170.method22403(255 - (this.aByteArray10[local422] & 0xFF));
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
					local170.anInt3089 = (local95 + local481 * local91) * -1387468933;
					local170.method22403(local555);
					local170.method22403(local570);
					local170.method22403(local585);
					local170.method22403(255 - (this.aByteArray10[local422] & 0xFF));
					local481 = this.aShortArray15[local422] & 0xFFFF;
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
					local170.anInt3089 = (local95 + local481 * local91) * -1387468933;
					local170.method22403(local555);
					local170.method22403(local570);
					local170.method22403(local585);
					local170.method22403(255 - (this.aByteArray10[local422] & 0xFF));
				}
			} else {
				for (local178 = 0; local178 < this.anInt371; local178++) {
					local189 = this.method2720(this.aShortArray13[local178], this.aShortArray16[local178], this.aShort2, this.aByteArray10[local178]);
					local170.anInt3089 = (local95 + (this.aShortArray14[local178] & 0xFFFF) * local91) * -1387468933;
					local170.method22417(local189);
					local170.anInt3089 = (local95 + (this.aShortArray8[local178] & 0xFFFF) * local91) * -1387468933;
					local170.method22417(local189);
					local170.anInt3089 = (local95 + (this.aShortArray15[local178] & 0xFFFF) * local91) * -1387468933;
					local170.method22417(local189);
				}
			}
		}
		if (local21) {
			if (this.aClass190_1 == null) {
				local353 = this.aShortArray10;
				local357 = this.aShortArray9;
				local361 = this.aShortArray11;
				local365 = this.aByteArray9;
			} else {
				local353 = this.aClass190_1.aShortArray85;
				local357 = this.aClass190_1.aShortArray84;
				local361 = this.aClass190_1.aShortArray83;
				local365 = this.aClass190_1.aByteArray59;
			}
			@Pc(1055) float local1055 = 3.0F / (float) this.aShort3;
			local511 = 3.0F / (float) (this.aShort3 + this.aShort3 / 2);
			local170.anInt3089 = local97 * -1387468933;
			if (this.aClass86_Sub3_23.aBoolean116) {
				for (local217 = 0; local217 < this.anInt370; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method22659((float) local353[local217] * local511);
						local170.method22659((float) local357[local217] * local511);
						local170.method22659((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method22659((float) local353[local217] * local463);
						local170.method22659((float) local357[local217] * local463);
						local170.method22659((float) local361[local217] * local463);
					}
					local170.anInt3089 += (local91 - 12) * -1387468933;
				}
			} else {
				for (local217 = 0; local217 < this.anInt370; local217++) {
					local235 = local365[local217] & 0xFF;
					if (local235 == 0) {
						local170.method22663((float) local353[local217] * local511);
						local170.method22663((float) local357[local217] * local511);
						local170.method22663((float) local361[local217] * local511);
					} else {
						local463 = local1055 / (float) local235;
						local170.method22663((float) local353[local217] * local463);
						local170.method22663((float) local357[local217] * local463);
						local170.method22663((float) local361[local217] * local463);
					}
					local170.anInt3089 += (local91 - 12) * -1387468933;
				}
			}
		}
		if (local43) {
			local170.anInt3089 = local99 * -1387468933;
			if (this.aClass86_Sub3_23.aBoolean116) {
				for (local178 = 0; local178 < this.anInt370; local178++) {
					local170.method22659(this.aFloatArray6[local178]);
					local170.method22659(this.aFloatArray7[local178]);
					local170.anInt3089 += (local91 - 8) * -1387468933;
				}
			} else {
				for (local178 = 0; local178 < this.anInt370; local178++) {
					local170.method22663(this.aFloatArray6[local178]);
					local170.method22663(this.aFloatArray7[local178]);
					local170.anInt3089 += (local91 - 8) * -1387468933;
				}
			}
		}
		local170.anInt3089 = local91 * this.anInt370 * -1387468933;
		@Pc(1348) Interface14 local1348;
		if (arg0) {
			if (this.anInterface14_1 == null) {
				this.anInterface14_1 = this.aClass86_Sub3_23.method6141(local91, local170.aByteArray53, local170.anInt3089 * 31645619, true);
			} else {
				this.anInterface14_1.method1785(local91, local170.aByteArray53, local170.anInt3089 * 31645619);
			}
			local1348 = this.anInterface14_1;
			this.aByte3 = 0;
		} else {
			local1348 = this.aClass86_Sub3_23.method6141(local91, local170.aByteArray53, local170.anInt3089 * 31645619, false);
			this.aBoolean61 = true;
		}
		if (local32) {
			this.aClass172_1.anInterface14_6 = local1348;
			this.aClass172_1.aByte107 = local93;
		}
		if (local43) {
			this.aClass172_4.anInterface14_6 = local1348;
			this.aClass172_4.aByte107 = local99;
		}
		if (local10) {
			this.aClass172_3.anInterface14_6 = local1348;
			this.aClass172_3.aByte107 = local95;
		}
		if (local21) {
			this.aClass172_2.anInterface14_6 = local1348;
			this.aClass172_2.aByte107 = local97;
		}
	}

	@OriginalMember(owner = "client!aeb", name = "jk", descriptor = "(ISIB)I", line = 3231)
	int method2719(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = Class656.anIntArray532[method2723(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(17) Class215 local17 = this.aClass86_Sub3_23.aClass209_9.method25584(arg1 & 0xFFFF);
			@Pc(22) int local22 = local17.aByte122 & 0xFF;
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
			local28 = local17.aByte117 & 0xFF;
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

	@OriginalMember(owner = "client!aeb", name = "if", descriptor = "(ISIB)I", line = 3231)
	int method2720(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = Class656.anIntArray532[method2723(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(17) Class215 local17 = this.aClass86_Sub3_23.aClass209_9.method25584(arg1 & 0xFFFF);
			@Pc(22) int local22 = local17.aByte122 & 0xFF;
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
			local28 = local17.aByte117 & 0xFF;
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

	@OriginalMember(owner = "client!aeb", name = "jg", descriptor = "(ISIB)I", line = 3231)
	int method2721(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = Class656.anIntArray532[method2723(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(17) Class215 local17 = this.aClass86_Sub3_23.aClass209_9.method25584(arg1 & 0xFFFF);
			@Pc(22) int local22 = local17.aByte122 & 0xFF;
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
			local28 = local17.aByte117 & 0xFF;
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

	@OriginalMember(owner = "client!aeb", name = "jp", descriptor = "(ISIB)I", line = 3231)
	int method2722(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = Class656.anIntArray532[method2723(arg0, arg2)];
		if (arg1 != -1) {
			@Pc(17) Class215 local17 = this.aClass86_Sub3_23.aClass209_9.method25584(arg1 & 0xFFFF);
			@Pc(22) int local22 = local17.aByte122 & 0xFF;
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
			local28 = local17.aByte117 & 0xFF;
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

	@OriginalMember(owner = "client!aeb", name = "id", descriptor = "(II)I", line = 3263)
	static final int method2723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!aeb", name = "jh", descriptor = "(II)I", line = 3263)
	static final int method2724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!aeb", name = "jx", descriptor = "(II)I", line = 3263)
	static final int method2725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!aeb", name = "jw", descriptor = "(II)I", line = 3263)
	static final int method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!aeb", name = "jy", descriptor = "(II)I", line = 3263)
	static final int method2727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
