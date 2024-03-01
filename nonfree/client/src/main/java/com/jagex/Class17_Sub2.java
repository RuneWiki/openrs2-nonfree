package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abo")
public class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!abo", name = "s", descriptor = "I")
	static final int anInt316 = -1694498816;

	@OriginalMember(owner = "client!abo", name = "u", descriptor = "I")
	static final int anInt317 = 1;

	@OriginalMember(owner = "client!abo", name = "b", descriptor = "I")
	static final int anInt318 = 4;

	@OriginalMember(owner = "client!abo", name = "y", descriptor = "I")
	static final int anInt320 = 2;

	@OriginalMember(owner = "client!abo", name = "x", descriptor = "I")
	static final int anInt321 = 64;

	@OriginalMember(owner = "client!abo", name = "aq", descriptor = "Z")
	static final boolean aBoolean55 = true;

	@OriginalMember(owner = "client!abo", name = "av", descriptor = "Z")
	static final boolean aBoolean56 = true;

	@OriginalMember(owner = "client!abo", name = "ax", descriptor = "Z")
	static final boolean aBoolean57 = false;

	@OriginalMember(owner = "client!abo", name = "d", descriptor = "[[Lclient!bd;")
	Class89[][] aClass89ArrayArray1;

	@OriginalMember(owner = "client!abo", name = "q", descriptor = "F")
	float aFloat23;

	@OriginalMember(owner = "client!abo", name = "j", descriptor = "[[Lclient!ac;")
	Class22[][] aClass22ArrayArray1;

	@OriginalMember(owner = "client!abo", name = "n", descriptor = "[[Lclient!am;")
	Class74[][] aClass74ArrayArray1;

	@OriginalMember(owner = "client!abo", name = "e", descriptor = "[[Lclient!ad;")
	Class28[][] aClass28ArrayArray1;

	@OriginalMember(owner = "client!abo", name = "r", descriptor = "[[Lclient!aw;")
	Class83[][] aClass83ArrayArray1;

	@OriginalMember(owner = "client!abo", name = "ak", descriptor = "F")
	float aFloat24;

	@OriginalMember(owner = "client!abo", name = "af", descriptor = "F")
	float aFloat25;

	@OriginalMember(owner = "client!abo", name = "m", descriptor = "F")
	float aFloat26;

	@OriginalMember(owner = "client!abo", name = "v", descriptor = "F")
	float aFloat27;

	@OriginalMember(owner = "client!abo", name = "t", descriptor = "F")
	float aFloat28;

	@OriginalMember(owner = "client!abo", name = "w", descriptor = "F")
	float aFloat29;

	@OriginalMember(owner = "client!abo", name = "o", descriptor = "F")
	float aFloat30;

	@OriginalMember(owner = "client!abo", name = "i", descriptor = "F")
	float aFloat31;

	@OriginalMember(owner = "client!abo", name = "at", descriptor = "F")
	float aFloat32;

	@OriginalMember(owner = "client!abo", name = "f", descriptor = "F")
	float aFloat33;

	@OriginalMember(owner = "client!abo", name = "k", descriptor = "F")
	float aFloat34;

	@OriginalMember(owner = "client!abo", name = "ah", descriptor = "F")
	float aFloat35;

	@OriginalMember(owner = "client!abo", name = "an", descriptor = "F")
	float aFloat36;

	@OriginalMember(owner = "client!abo", name = "aj", descriptor = "F")
	float aFloat37;

	@OriginalMember(owner = "client!abo", name = "aa", descriptor = "F")
	float aFloat38;

	@OriginalMember(owner = "client!abo", name = "c", descriptor = "Lclient!abl;")
	final Class21_Sub1 aClass21_Sub1_6;

	@OriginalMember(owner = "client!abo", name = "z", descriptor = "I")
	final int anInt319;

	@OriginalMember(owner = "client!abo", name = "as", descriptor = "[[B")
	byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!abo", name = "ai", descriptor = "[[B")
	byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!abo", name = "<init>", descriptor = "(Lclient!abl;IIII[[I[[II)V", line = 46)
	Class17_Sub2(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass21_Sub1_6 = arg0;
		this.anInt319 = arg2;
		this.aByteArrayArray7 = new byte[arg3 + 1][arg4 + 1];
		@Pc(28) int local28 = this.aClass21_Sub1_6.anInt286 * 144329819 >> 9;
		for (@Pc(30) int local30 = 1; local30 < arg4; local30++) {
			for (@Pc(35) int local35 = 1; local35 < arg3; local35++) {
				@Pc(56) int local56 = arg6[local35 + 1][local30] - arg6[local35 - 1][local30];
				@Pc(72) int local72 = arg6[local35][local30 + 1] - arg6[local35][local30 - 1];
				@Pc(87) int local87 = (int) Math.sqrt((double) (local56 * local56 + arg7 * 512 + local72 * local72));
				@Pc(93) int local93 = (local56 << 8) / local87;
				@Pc(99) int local99 = arg7 * -512 / local87;
				@Pc(105) int local105 = (local72 << 8) / local87;
				@Pc(133) int local133 = local28 + (this.aClass21_Sub1_6.anInt275 * -137017513 * local93 + this.aClass21_Sub1_6.anInt283 * -259798585 * local99 + this.aClass21_Sub1_6.anInt284 * -630661485 * local105 >> 17);
				local133 >>= 0x1;
				if (local133 < 2) {
					local133 = 2;
				} else if (local133 > 126) {
					local133 = 126;
				}
				this.aByteArrayArray7[local35][local30] = (byte) local133;
			}
		}
		this.aByteArrayArray6 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!abo", name = "p", descriptor = "(III)V", line = 71)
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray6.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray6[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray6[local9][local21] < arg2) {
			this.aByteArrayArray6[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!abo", name = "q", descriptor = "(III)V", line = 71)
	@Override
	public void method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray6.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray6[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray6[local9][local21] < arg2) {
			this.aByteArrayArray6[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!abo", name = "r", descriptor = "(III)V", line = 71)
	@Override
	public void method3539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray6.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray6[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray6[local9][local21] < arg2) {
			this.aByteArrayArray6[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!abo", name = "d", descriptor = "(III)V", line = 71)
	@Override
	public void method3555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray6.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray6[local9].length - 1, Math.max(0, arg1));
		if (this.aByteArrayArray6[local9][local21] < arg2) {
			this.aByteArrayArray6[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!abo", name = "g", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 77)
	@Override
	public void method3542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass22ArrayArray1 == null) {
			this.aClass22ArrayArray1 = new Class22[this.anInt339 * -1007974723][this.anInt337 * -207323189];
			this.aClass74ArrayArray1 = new Class74[this.anInt339 * -1007974723][this.anInt337 * -207323189];
		} else if (this.aClass28ArrayArray1 != null || this.aClass89ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(37) boolean local37 = false;
		@Pc(77) int local77;
		@Pc(83) int local83;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local37 = true;
			for (@Pc(68) int local68 = 1; local68 < 2; local68++) {
				local77 = arg2[arg6[local68]];
				local83 = arg4[arg6[local68]];
				if (local77 != 0 && local77 != this.anInt338 * 76934957 || local83 != 0 && local83 != this.anInt338 * 76934957) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class74 local110 = new Class74();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort74 = local114;
			local110.aShortArray52 = new short[local114];
			local110.aShortArray50 = new short[local114];
			local110.aShortArray51 = new short[local114];
			local110.aShortArray49 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt338 * 76934957) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				} else if (local146 == this.anInt338 * 76934957 && local150 == this.anInt338 * 76934957) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt338 * 76934957 && local150 == 0) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) * (this.anInt338 * 76934957 - local146) + (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) * (this.anInt338 * 76934957 - local146) + (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray52[local139] = (short) (local315 * (this.anInt338 * 76934957 - local150) + local364 * local150 >> this.anInt336 * -1551262030);
				}
				local315 = (arg0 << this.anInt336 * 1371852633) + local146;
				local364 = (arg1 << this.anInt336 * 1371852633) + local150;
				local110.aShortArray50[local139] = (short) local146;
				local110.aShortArray49[local139] = (short) local150;
				local110.aShortArray51[local139] = (short) (this.method3583(local315, local364) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray52[local139] < 2) {
					local110.aShortArray52[local139] = 2;
				}
			}
			@Pc(449) boolean local449 = false;
			local146 = 0;
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					local146++;
				}
				local315 = arg11[local150];
				if (local315 != -1) {
					@Pc(482) Class133 local482 = this.aClass21_Sub1_6.aClass134_7.method22906(local315);
					if (!local482.aBoolean620) {
						local449 = true;
						if (this.method3410(local482.aByte118) || local482.aByte113 != 0 || local482.aByte117 != 0) {
							local110.aByte85 = (byte) (local110.aByte85 | 0x4);
						}
					}
				}
			}
			local110.anIntArray258 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray259 = new int[local146];
			}
			local110.aShortArray53 = new short[local146];
			local110.aShortArray56 = new short[local146];
			local110.aShortArray55 = new short[local146];
			if (local449) {
				local110.aShortArray54 = new short[local146];
				local110.aShortArray57 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray258[local110.aShort73] = Class61.method12768(arg9[local150]);
					} else {
						local110.anIntArray258[local110.aShort73] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray259[local110.aShort73] = -1;
						} else {
							local110.anIntArray259[local110.aShort73] = Class61.method12768(arg10[local150]);
						}
					}
					local110.aShortArray53[local110.aShort73] = (short) arg6[local150];
					local110.aShortArray56[local110.aShort73] = (short) arg7[local150];
					local110.aShortArray55[local110.aShort73] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass21_Sub1_6.aClass134_7.method22906(arg11[local150]).aBoolean620) {
							local110.aShortArray54[local110.aShort73] = -1;
						} else {
							local110.aShortArray54[local110.aShort73] = (short) arg11[local150];
							local110.aShortArray57[local110.aShort73] = (short) arg12[local150];
						}
					}
					local110.aShort73++;
				}
			}
			this.aClass74ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(700) Class22 local700 = new Class22();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local700.anInt578 = Class121.method22825(Class61.method12768(arg10[0]), this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				if (local77 == -1) {
					local700.aByte4 = (byte) (local700.aByte4 | 0x2);
				}
			}
			if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
				local700.aByte4 = (byte) (local700.aByte4 | 0x1);
			}
			@Pc(798) Class133 local798 = null;
			if (local83 != -1) {
				local798 = this.aClass21_Sub1_6.aClass134_7.method22906(local83);
			}
			if (local798 == null || (local700.aByte4 & 0x2) != 0 || local798.aBoolean620) {
				@Pc(925) short local925 = Class61.method12768(local77);
				local700.aShort22 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				local700.aShort23 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				local700.aShort21 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				local700.aShort24 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				local700.aShort25 = -1;
			} else {
				local700.aShort22 = (short) (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				local700.aShort23 = (short) (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				local700.aShort21 = (short) (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				local700.aShort24 = (short) (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				local700.aShort25 = (short) local83;
				if (this.method3410(local798.aByte118) || local798.aByte113 != 0 || local798.aByte117 != 0) {
					local700.aByte4 = (byte) (local700.aByte4 | 0x4);
				}
			}
			this.aClass22ArrayArray1[arg0][arg1] = local700;
		}
	}

	@OriginalMember(owner = "client!abo", name = "m", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 77)
	@Override
	public void method3567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass22ArrayArray1 == null) {
			this.aClass22ArrayArray1 = new Class22[this.anInt339 * -1007974723][this.anInt337 * -207323189];
			this.aClass74ArrayArray1 = new Class74[this.anInt339 * -1007974723][this.anInt337 * -207323189];
		} else if (this.aClass28ArrayArray1 != null || this.aClass89ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(37) boolean local37 = false;
		@Pc(77) int local77;
		@Pc(83) int local83;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local37 = true;
			for (@Pc(68) int local68 = 1; local68 < 2; local68++) {
				local77 = arg2[arg6[local68]];
				local83 = arg4[arg6[local68]];
				if (local77 != 0 && local77 != this.anInt338 * 76934957 || local83 != 0 && local83 != this.anInt338 * 76934957) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class74 local110 = new Class74();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort74 = local114;
			local110.aShortArray52 = new short[local114];
			local110.aShortArray50 = new short[local114];
			local110.aShortArray51 = new short[local114];
			local110.aShortArray49 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt338 * 76934957) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				} else if (local146 == this.anInt338 * 76934957 && local150 == this.anInt338 * 76934957) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt338 * 76934957 && local150 == 0) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) * (this.anInt338 * 76934957 - local146) + (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) * (this.anInt338 * 76934957 - local146) + (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray52[local139] = (short) (local315 * (this.anInt338 * 76934957 - local150) + local364 * local150 >> this.anInt336 * -1551262030);
				}
				local315 = (arg0 << this.anInt336 * 1371852633) + local146;
				local364 = (arg1 << this.anInt336 * 1371852633) + local150;
				local110.aShortArray50[local139] = (short) local146;
				local110.aShortArray49[local139] = (short) local150;
				local110.aShortArray51[local139] = (short) (this.method3583(local315, local364) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray52[local139] < 2) {
					local110.aShortArray52[local139] = 2;
				}
			}
			@Pc(449) boolean local449 = false;
			local146 = 0;
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					local146++;
				}
				local315 = arg11[local150];
				if (local315 != -1) {
					@Pc(482) Class133 local482 = this.aClass21_Sub1_6.aClass134_7.method22906(local315);
					if (!local482.aBoolean620) {
						local449 = true;
						if (this.method3410(local482.aByte118) || local482.aByte113 != 0 || local482.aByte117 != 0) {
							local110.aByte85 = (byte) (local110.aByte85 | 0x4);
						}
					}
				}
			}
			local110.anIntArray258 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray259 = new int[local146];
			}
			local110.aShortArray53 = new short[local146];
			local110.aShortArray56 = new short[local146];
			local110.aShortArray55 = new short[local146];
			if (local449) {
				local110.aShortArray54 = new short[local146];
				local110.aShortArray57 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray258[local110.aShort73] = Class61.method12768(arg9[local150]);
					} else {
						local110.anIntArray258[local110.aShort73] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray259[local110.aShort73] = -1;
						} else {
							local110.anIntArray259[local110.aShort73] = Class61.method12768(arg10[local150]);
						}
					}
					local110.aShortArray53[local110.aShort73] = (short) arg6[local150];
					local110.aShortArray56[local110.aShort73] = (short) arg7[local150];
					local110.aShortArray55[local110.aShort73] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass21_Sub1_6.aClass134_7.method22906(arg11[local150]).aBoolean620) {
							local110.aShortArray54[local110.aShort73] = -1;
						} else {
							local110.aShortArray54[local110.aShort73] = (short) arg11[local150];
							local110.aShortArray57[local110.aShort73] = (short) arg12[local150];
						}
					}
					local110.aShort73++;
				}
			}
			this.aClass74ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(700) Class22 local700 = new Class22();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local700.anInt578 = Class121.method22825(Class61.method12768(arg10[0]), this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				if (local77 == -1) {
					local700.aByte4 = (byte) (local700.aByte4 | 0x2);
				}
			}
			if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
				local700.aByte4 = (byte) (local700.aByte4 | 0x1);
			}
			@Pc(798) Class133 local798 = null;
			if (local83 != -1) {
				local798 = this.aClass21_Sub1_6.aClass134_7.method22906(local83);
			}
			if (local798 == null || (local700.aByte4 & 0x2) != 0 || local798.aBoolean620) {
				@Pc(925) short local925 = Class61.method12768(local77);
				local700.aShort22 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				local700.aShort23 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				local700.aShort21 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				local700.aShort24 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				local700.aShort25 = -1;
			} else {
				local700.aShort22 = (short) (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				local700.aShort23 = (short) (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				local700.aShort21 = (short) (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				local700.aShort24 = (short) (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				local700.aShort25 = (short) local83;
				if (this.method3410(local798.aByte118) || local798.aByte113 != 0 || local798.aByte117 != 0) {
					local700.aByte4 = (byte) (local700.aByte4 | 0x4);
				}
			}
			this.aClass22ArrayArray1[arg0][arg1] = local700;
		}
	}

	@OriginalMember(owner = "client!abo", name = "v", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 77)
	@Override
	public void method3552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass22ArrayArray1 == null) {
			this.aClass22ArrayArray1 = new Class22[this.anInt339 * -1007974723][this.anInt337 * -207323189];
			this.aClass74ArrayArray1 = new Class74[this.anInt339 * -1007974723][this.anInt337 * -207323189];
		} else if (this.aClass28ArrayArray1 != null || this.aClass89ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(37) boolean local37 = false;
		@Pc(77) int local77;
		@Pc(83) int local83;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local37 = true;
			for (@Pc(68) int local68 = 1; local68 < 2; local68++) {
				local77 = arg2[arg6[local68]];
				local83 = arg4[arg6[local68]];
				if (local77 != 0 && local77 != this.anInt338 * 76934957 || local83 != 0 && local83 != this.anInt338 * 76934957) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class74 local110 = new Class74();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort74 = local114;
			local110.aShortArray52 = new short[local114];
			local110.aShortArray50 = new short[local114];
			local110.aShortArray51 = new short[local114];
			local110.aShortArray49 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt338 * 76934957) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				} else if (local146 == this.anInt338 * 76934957 && local150 == this.anInt338 * 76934957) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt338 * 76934957 && local150 == 0) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) * (this.anInt338 * 76934957 - local146) + (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) * (this.anInt338 * 76934957 - local146) + (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray52[local139] = (short) (local315 * (this.anInt338 * 76934957 - local150) + local364 * local150 >> this.anInt336 * -1551262030);
				}
				local315 = (arg0 << this.anInt336 * 1371852633) + local146;
				local364 = (arg1 << this.anInt336 * 1371852633) + local150;
				local110.aShortArray50[local139] = (short) local146;
				local110.aShortArray49[local139] = (short) local150;
				local110.aShortArray51[local139] = (short) (this.method3583(local315, local364) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray52[local139] < 2) {
					local110.aShortArray52[local139] = 2;
				}
			}
			@Pc(449) boolean local449 = false;
			local146 = 0;
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					local146++;
				}
				local315 = arg11[local150];
				if (local315 != -1) {
					@Pc(482) Class133 local482 = this.aClass21_Sub1_6.aClass134_7.method22906(local315);
					if (!local482.aBoolean620) {
						local449 = true;
						if (this.method3410(local482.aByte118) || local482.aByte113 != 0 || local482.aByte117 != 0) {
							local110.aByte85 = (byte) (local110.aByte85 | 0x4);
						}
					}
				}
			}
			local110.anIntArray258 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray259 = new int[local146];
			}
			local110.aShortArray53 = new short[local146];
			local110.aShortArray56 = new short[local146];
			local110.aShortArray55 = new short[local146];
			if (local449) {
				local110.aShortArray54 = new short[local146];
				local110.aShortArray57 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray258[local110.aShort73] = Class61.method12768(arg9[local150]);
					} else {
						local110.anIntArray258[local110.aShort73] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray259[local110.aShort73] = -1;
						} else {
							local110.anIntArray259[local110.aShort73] = Class61.method12768(arg10[local150]);
						}
					}
					local110.aShortArray53[local110.aShort73] = (short) arg6[local150];
					local110.aShortArray56[local110.aShort73] = (short) arg7[local150];
					local110.aShortArray55[local110.aShort73] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass21_Sub1_6.aClass134_7.method22906(arg11[local150]).aBoolean620) {
							local110.aShortArray54[local110.aShort73] = -1;
						} else {
							local110.aShortArray54[local110.aShort73] = (short) arg11[local150];
							local110.aShortArray57[local110.aShort73] = (short) arg12[local150];
						}
					}
					local110.aShort73++;
				}
			}
			this.aClass74ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(700) Class22 local700 = new Class22();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local700.anInt578 = Class121.method22825(Class61.method12768(arg10[0]), this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				if (local77 == -1) {
					local700.aByte4 = (byte) (local700.aByte4 | 0x2);
				}
			}
			if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
				local700.aByte4 = (byte) (local700.aByte4 | 0x1);
			}
			@Pc(798) Class133 local798 = null;
			if (local83 != -1) {
				local798 = this.aClass21_Sub1_6.aClass134_7.method22906(local83);
			}
			if (local798 == null || (local700.aByte4 & 0x2) != 0 || local798.aBoolean620) {
				@Pc(925) short local925 = Class61.method12768(local77);
				local700.aShort22 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				local700.aShort23 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				local700.aShort21 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				local700.aShort24 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				local700.aShort25 = -1;
			} else {
				local700.aShort22 = (short) (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				local700.aShort23 = (short) (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				local700.aShort21 = (short) (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				local700.aShort24 = (short) (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				local700.aShort25 = (short) local83;
				if (this.method3410(local798.aByte118) || local798.aByte113 != 0 || local798.aByte117 != 0) {
					local700.aByte4 = (byte) (local700.aByte4 | 0x4);
				}
			}
			this.aClass22ArrayArray1[arg0][arg1] = local700;
		}
	}

	@OriginalMember(owner = "client!abo", name = "t", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 77)
	@Override
	public void method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass22ArrayArray1 == null) {
			this.aClass22ArrayArray1 = new Class22[this.anInt339 * -1007974723][this.anInt337 * -207323189];
			this.aClass74ArrayArray1 = new Class74[this.anInt339 * -1007974723][this.anInt337 * -207323189];
		} else if (this.aClass28ArrayArray1 != null || this.aClass89ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(37) boolean local37 = false;
		@Pc(77) int local77;
		@Pc(83) int local83;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local37 = true;
			for (@Pc(68) int local68 = 1; local68 < 2; local68++) {
				local77 = arg2[arg6[local68]];
				local83 = arg4[arg6[local68]];
				if (local77 != 0 && local77 != this.anInt338 * 76934957 || local83 != 0 && local83 != this.anInt338 * 76934957) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class74 local110 = new Class74();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort74 = local114;
			local110.aShortArray52 = new short[local114];
			local110.aShortArray50 = new short[local114];
			local110.aShortArray51 = new short[local114];
			local110.aShortArray49 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt338 * 76934957) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				} else if (local146 == this.anInt338 * 76934957 && local150 == this.anInt338 * 76934957) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt338 * 76934957 && local150 == 0) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) * (this.anInt338 * 76934957 - local146) + (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) * (this.anInt338 * 76934957 - local146) + (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray52[local139] = (short) (local315 * (this.anInt338 * 76934957 - local150) + local364 * local150 >> this.anInt336 * -1551262030);
				}
				local315 = (arg0 << this.anInt336 * 1371852633) + local146;
				local364 = (arg1 << this.anInt336 * 1371852633) + local150;
				local110.aShortArray50[local139] = (short) local146;
				local110.aShortArray49[local139] = (short) local150;
				local110.aShortArray51[local139] = (short) (this.method3583(local315, local364) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray52[local139] < 2) {
					local110.aShortArray52[local139] = 2;
				}
			}
			@Pc(449) boolean local449 = false;
			local146 = 0;
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					local146++;
				}
				local315 = arg11[local150];
				if (local315 != -1) {
					@Pc(482) Class133 local482 = this.aClass21_Sub1_6.aClass134_7.method22906(local315);
					if (!local482.aBoolean620) {
						local449 = true;
						if (this.method3410(local482.aByte118) || local482.aByte113 != 0 || local482.aByte117 != 0) {
							local110.aByte85 = (byte) (local110.aByte85 | 0x4);
						}
					}
				}
			}
			local110.anIntArray258 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray259 = new int[local146];
			}
			local110.aShortArray53 = new short[local146];
			local110.aShortArray56 = new short[local146];
			local110.aShortArray55 = new short[local146];
			if (local449) {
				local110.aShortArray54 = new short[local146];
				local110.aShortArray57 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray258[local110.aShort73] = Class61.method12768(arg9[local150]);
					} else {
						local110.anIntArray258[local110.aShort73] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray259[local110.aShort73] = -1;
						} else {
							local110.anIntArray259[local110.aShort73] = Class61.method12768(arg10[local150]);
						}
					}
					local110.aShortArray53[local110.aShort73] = (short) arg6[local150];
					local110.aShortArray56[local110.aShort73] = (short) arg7[local150];
					local110.aShortArray55[local110.aShort73] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass21_Sub1_6.aClass134_7.method22906(arg11[local150]).aBoolean620) {
							local110.aShortArray54[local110.aShort73] = -1;
						} else {
							local110.aShortArray54[local110.aShort73] = (short) arg11[local150];
							local110.aShortArray57[local110.aShort73] = (short) arg12[local150];
						}
					}
					local110.aShort73++;
				}
			}
			this.aClass74ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(700) Class22 local700 = new Class22();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local700.anInt578 = Class121.method22825(Class61.method12768(arg10[0]), this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				if (local77 == -1) {
					local700.aByte4 = (byte) (local700.aByte4 | 0x2);
				}
			}
			if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
				local700.aByte4 = (byte) (local700.aByte4 | 0x1);
			}
			@Pc(798) Class133 local798 = null;
			if (local83 != -1) {
				local798 = this.aClass21_Sub1_6.aClass134_7.method22906(local83);
			}
			if (local798 == null || (local700.aByte4 & 0x2) != 0 || local798.aBoolean620) {
				@Pc(925) short local925 = Class61.method12768(local77);
				local700.aShort22 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				local700.aShort23 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				local700.aShort21 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				local700.aShort24 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				local700.aShort25 = -1;
			} else {
				local700.aShort22 = (short) (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				local700.aShort23 = (short) (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				local700.aShort21 = (short) (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				local700.aShort24 = (short) (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				local700.aShort25 = (short) local83;
				if (this.method3410(local798.aByte118) || local798.aByte113 != 0 || local798.aByte117 != 0) {
					local700.aByte4 = (byte) (local700.aByte4 | 0x4);
				}
			}
			this.aClass22ArrayArray1[arg0][arg1] = local700;
		}
	}

	@OriginalMember(owner = "client!abo", name = "w", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 77)
	@Override
	public void method3560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		if (this.aClass22ArrayArray1 == null) {
			this.aClass22ArrayArray1 = new Class22[this.anInt339 * -1007974723][this.anInt337 * -207323189];
			this.aClass74ArrayArray1 = new Class74[this.anInt339 * -1007974723][this.anInt337 * -207323189];
		} else if (this.aClass28ArrayArray1 != null || this.aClass89ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(37) boolean local37 = false;
		@Pc(77) int local77;
		@Pc(83) int local83;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local37 = true;
			for (@Pc(68) int local68 = 1; local68 < 2; local68++) {
				local77 = arg2[arg6[local68]];
				local83 = arg4[arg6[local68]];
				if (local77 != 0 && local77 != this.anInt338 * 76934957 || local83 != 0 && local83 != this.anInt338 * 76934957) {
					local37 = false;
					break;
				}
			}
		}
		if (!local37) {
			@Pc(110) Class74 local110 = new Class74();
			@Pc(114) short local114 = (short) arg2.length;
			@Pc(118) short local118 = (short) arg9.length;
			local110.aShort74 = local114;
			local110.aShortArray52 = new short[local114];
			local110.aShortArray50 = new short[local114];
			local110.aShortArray51 = new short[local114];
			local110.aShortArray49 = new short[local114];
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(315) int local315;
			for (@Pc(139) int local139 = 0; local139 < local114; local139++) {
				local146 = arg2[local139];
				local150 = arg4[local139];
				@Pc(364) int local364;
				if (local146 == 0 && local150 == 0) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				} else if (local146 == 0 && local150 == this.anInt338 * 76934957) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				} else if (local146 == this.anInt338 * 76934957 && local150 == this.anInt338 * 76934957) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				} else if (local146 == this.anInt338 * 76934957 && local150 == 0) {
					local110.aShortArray52[local139] = (short) (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				} else {
					local315 = (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) * (this.anInt338 * 76934957 - local146) + (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) * local146;
					local364 = (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) * (this.anInt338 * 76934957 - local146) + (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) * local146;
					local110.aShortArray52[local139] = (short) (local315 * (this.anInt338 * 76934957 - local150) + local364 * local150 >> this.anInt336 * -1551262030);
				}
				local315 = (arg0 << this.anInt336 * 1371852633) + local146;
				local364 = (arg1 << this.anInt336 * 1371852633) + local150;
				local110.aShortArray50[local139] = (short) local146;
				local110.aShortArray49[local139] = (short) local150;
				local110.aShortArray51[local139] = (short) (this.method3583(local315, local364) + (arg3 == null ? 0 : arg3[local139]));
				if (local110.aShortArray52[local139] < 2) {
					local110.aShortArray52[local139] = 2;
				}
			}
			@Pc(449) boolean local449 = false;
			local146 = 0;
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					local146++;
				}
				local315 = arg11[local150];
				if (local315 != -1) {
					@Pc(482) Class133 local482 = this.aClass21_Sub1_6.aClass134_7.method22906(local315);
					if (!local482.aBoolean620) {
						local449 = true;
						if (this.method3410(local482.aByte118) || local482.aByte113 != 0 || local482.aByte117 != 0) {
							local110.aByte85 = (byte) (local110.aByte85 | 0x4);
						}
					}
				}
			}
			local110.anIntArray258 = new int[local146];
			if (arg10 != null) {
				local110.anIntArray259 = new int[local146];
			}
			local110.aShortArray53 = new short[local146];
			local110.aShortArray56 = new short[local146];
			local110.aShortArray55 = new short[local146];
			if (local449) {
				local110.aShortArray54 = new short[local146];
				local110.aShortArray57 = new short[local146];
			}
			for (local150 = 0; local150 < local118; local150++) {
				if (arg9[local150] >= 0 || arg10 != null && arg10[local150] >= 0) {
					if (arg9[local150] >= 0) {
						local110.anIntArray258[local110.aShort73] = Class61.method12768(arg9[local150]);
					} else {
						local110.anIntArray258[local110.aShort73] = -1;
					}
					if (arg10 != null) {
						if (arg10[local150] == -1) {
							local110.anIntArray259[local110.aShort73] = -1;
						} else {
							local110.anIntArray259[local110.aShort73] = Class61.method12768(arg10[local150]);
						}
					}
					local110.aShortArray53[local110.aShort73] = (short) arg6[local150];
					local110.aShortArray56[local110.aShort73] = (short) arg7[local150];
					local110.aShortArray55[local110.aShort73] = (short) arg8[local150];
					if (local449) {
						if (arg11[local150] == -1 || this.aClass21_Sub1_6.aClass134_7.method22906(arg11[local150]).aBoolean620) {
							local110.aShortArray54[local110.aShort73] = -1;
						} else {
							local110.aShortArray54[local110.aShort73] = (short) arg11[local150];
							local110.aShortArray57[local110.aShort73] = (short) arg12[local150];
						}
					}
					local110.aShort73++;
				}
			}
			this.aClass74ArrayArray1[arg0][arg1] = local110;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(700) Class22 local700 = new Class22();
			local77 = arg9[0];
			local83 = arg11[0];
			if (arg10 != null) {
				local700.anInt578 = Class121.method22825(Class61.method12768(arg10[0]), this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				if (local77 == -1) {
					local700.aByte4 = (byte) (local700.aByte4 | 0x2);
				}
			}
			if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
				local700.aByte4 = (byte) (local700.aByte4 | 0x1);
			}
			@Pc(798) Class133 local798 = null;
			if (local83 != -1) {
				local798 = this.aClass21_Sub1_6.aClass134_7.method22906(local83);
			}
			if (local798 == null || (local700.aByte4 & 0x2) != 0 || local798.aBoolean620) {
				@Pc(925) short local925 = Class61.method12768(local77);
				local700.aShort22 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				local700.aShort23 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				local700.aShort21 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				local700.aShort24 = (short) Class121.method22825(local925, this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				local700.aShort25 = -1;
			} else {
				local700.aShort22 = (short) (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]);
				local700.aShort23 = (short) (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]);
				local700.aShort21 = (short) (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]);
				local700.aShort24 = (short) (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]);
				local700.aShort25 = (short) local83;
				if (this.method3410(local798.aByte118) || local798.aByte113 != 0 || local798.aByte117 != 0) {
					local700.aByte4 = (byte) (local700.aByte4 | 0x4);
				}
			}
			this.aClass22ArrayArray1[arg0][arg1] = local700;
		}
	}

	@OriginalMember(owner = "client!abo", name = "a", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 209)
	@Override
	public void method3541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class139 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(8) boolean local8 = (this.anInt319 & 0x20) == 0;
		if (this.aClass28ArrayArray1 == null && !local8) {
			this.aClass28ArrayArray1 = new Class28[this.anInt339 * -1007974723][this.anInt337 * -207323189];
			this.aClass83ArrayArray1 = new Class83[this.anInt339 * -1007974723][this.anInt337 * -207323189];
		} else if (this.aClass89ArrayArray1 == null && local8) {
			this.aClass89ArrayArray1 = new Class89[this.anInt339 * -1007974723][this.anInt337 * -207323189];
		} else if (this.aClass22ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		@Pc(68) int local68;
		for (local68 = 0; local68 < arg6.length; local68++) {
			if (arg6[local68] == -1) {
				arg6[local68] = 0;
			} else {
				arg6[local68] = Class515.anIntArray490[Class61.method12768(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Class515.anIntArray490[Class61.method12768(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(198) int local198;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(230) int local230;
		@Pc(361) int local361;
		@Pc(410) int local410;
		@Pc(500) int local500;
		@Pc(538) int local538;
		if (local8) {
			@Pc(142) Class89 local142 = new Class89();
			local142.aShort145 = (short) arg2.length;
			local142.aShort146 = (short) (arg2.length / 3);
			local142.aShortArray67 = new short[local142.aShort145];
			local142.aShortArray66 = new short[local142.aShort145];
			local142.aShortArray70 = new short[local142.aShort145];
			local142.anIntArray279 = new int[local142.aShort145];
			local142.aShortArray69 = new short[local142.aShort145];
			local142.aShortArray71 = new short[local142.aShort145];
			local142.aByteArray55 = new byte[local142.aShort145];
			if (arg5 != null) {
				local142.aShortArray68 = new short[local142.aShort145];
			}
			for (local198 = 0; local198 < local142.aShort145; local198++) {
				local206 = arg2[local198];
				local210 = arg4[local198];
				if (local206 == 0 && local210 == 0) {
					local230 = this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1];
				} else if (local206 == 0 && local210 == this.anInt338 * 76934957) {
					local230 = this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1];
				} else if (local206 == this.anInt338 * 76934957 && local210 == this.anInt338 * 76934957) {
					local230 = this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1];
				} else if (local206 == this.anInt338 * 76934957 && local210 == 0) {
					local230 = this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1];
				} else {
					local361 = (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) * (this.anInt338 * 76934957 - local206) + (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) * local206;
					local410 = (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) * (this.anInt338 * 76934957 - local206) + (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) * local206;
					local230 = local361 * (this.anInt338 * 76934957 - local210) + local410 * local210 >> this.anInt336 * -1551262030;
				}
				local361 = (arg0 << this.anInt336 * 1371852633) + local206;
				local410 = (arg1 << this.anInt336 * 1371852633) + local210;
				local142.aShortArray67[local198] = (short) local206;
				local142.aShortArray70[local198] = (short) local210;
				local142.aShortArray66[local198] = (short) (this.method3583(local361, local410) + (arg3 == null ? 0 : arg3[local198]));
				if (local230 < 0) {
					local230 = 0;
				}
				if (arg6[local198] == 0) {
					local142.anIntArray279[local198] = 0;
					if (arg7 != null) {
						local142.aByteArray55[local198] = (byte) local230;
					}
				} else {
					local500 = 0;
					if (arg5 != null) {
						@Pc(512) short local512 = local142.aShortArray68[local198] = (short) arg5[local198];
						if (arg10.anInt3417 * 1125508145 != 0) {
							local500 = local512 * 255 / (arg10.anInt3417 * 1125508145);
							if (local500 < 0) {
								local500 = 0;
							} else if (local500 > 255) {
								local500 = 255;
							}
						}
					}
					local538 = -16777216;
					if (arg8[local198] != -1) {
						@Pc(552) Class133 local552 = this.aClass21_Sub1_6.aClass134_7.method22906(arg8[local198]);
						if (local552.anInt3351 * -1410868471 != -1 && this.method3410(local552.aByte118)) {
							local538 = -1694498816;
						}
					}
					local142.anIntArray279[local198] = local538 | Class222.method24431(method3409(arg6[local198] >> 8, local230), arg10.anInt3422 * -470091381, local500);
					if (arg7 != null) {
						local142.aByteArray55[local198] = (byte) local230;
					}
				}
				local142.aShortArray69[local198] = (short) arg8[local198];
				local142.aShortArray71[local198] = (short) arg9[local198];
			}
			if (arg7 != null) {
				local142.anIntArray280 = new int[local142.aShort146];
				for (local198 = 0; local198 < local142.aShort146; local198++) {
					local206 = local198 * 3;
					if (arg7[local206] != 0) {
						local142.anIntArray280[local198] = arg7[local206] >> 8 | 0xFF000000;
					}
				}
			}
			this.aClass89ArrayArray1[arg0][arg1] = local142;
			return;
		}
		@Pc(655) boolean local655 = true;
		local198 = -1;
		local206 = -1;
		local210 = -1;
		local230 = -1;
		if (arg2.length == 6) {
			for (local361 = 0; local361 < 6; local361++) {
				if (arg2[local361] == 0 && arg4[local361] == 0) {
					if (local198 != -1 && arg6[local198] != arg6[local361]) {
						local655 = false;
						break;
					}
					local198 = local361;
				} else if (arg2[local361] == this.anInt338 * 76934957 && arg4[local361] == 0) {
					if (local206 != -1 && arg6[local206] != arg6[local361]) {
						local655 = false;
						break;
					}
					local206 = local361;
				} else if (arg2[local361] == this.anInt338 * 76934957 && arg4[local361] == this.anInt338 * 76934957) {
					if (local210 != -1 && arg6[local210] != arg6[local361]) {
						local655 = false;
						break;
					}
					local210 = local361;
				} else if (arg2[local361] == 0 && arg4[local361] == this.anInt338 * 76934957) {
					if (local230 != -1 && arg6[local230] != arg6[local361]) {
						local655 = false;
						break;
					}
					local230 = local361;
				}
			}
			if (local198 == -1 || local206 == -1 || local210 == -1 || local230 == -1) {
				local655 = false;
			}
			if (local655) {
				if (arg3 != null) {
					for (local361 = 0; local361 < 4; local361++) {
						if (arg3[local361] != 0) {
							local655 = false;
							break;
						}
					}
				}
				if (local655) {
					for (local361 = 1; local361 < 4; local361++) {
						if (arg2[local361] != arg2[0] && arg2[local361] != arg2[0] + this.anInt338 * 76934957 && arg2[local361] != arg2[0] - this.anInt338 * 76934957) {
							local655 = false;
							break;
						}
						if (arg4[local361] != arg4[0] && arg4[local361] != arg4[0] + this.anInt338 * 76934957 && arg4[local361] != arg4[0] - this.anInt338 * 76934957) {
							local655 = false;
							break;
						}
					}
				}
			}
		} else {
			local655 = false;
		}
		if (!local655) {
			@Pc(1756) Class83 local1756 = new Class83();
			local1756.aShort142 = (short) arg2.length;
			local1756.aShort143 = (short) (arg2.length / 3);
			local1756.aShortArray60 = new short[local1756.aShort142];
			local1756.aShortArray62 = new short[local1756.aShort142];
			local1756.aShortArray65 = new short[local1756.aShort142];
			local1756.anIntArray277 = new int[local1756.aShort142];
			if (arg5 != null) {
				local1756.aShortArray63 = new short[local1756.aShort142];
			}
			@Pc(1960) int local1960;
			@Pc(1829) int local1829;
			for (local410 = 0; local410 < local1756.aShort142; local410++) {
				local500 = arg2[local410];
				local538 = arg4[local410];
				@Pc(2009) int local2009;
				if (local500 == 0 && local538 == 0) {
					local1829 = this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1];
				} else if (local500 == 0 && local538 == this.anInt338 * 76934957) {
					local1829 = this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1];
				} else if (local500 == this.anInt338 * 76934957 && local538 == this.anInt338 * 76934957) {
					local1829 = this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1];
				} else if (local500 == this.anInt338 * 76934957 && local538 == 0) {
					local1829 = this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1];
				} else {
					local1960 = (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) * (this.anInt338 * 76934957 - local500) + (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) * local500;
					local2009 = (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) * (this.anInt338 * 76934957 - local500) + (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) * local500;
					local1829 = local1960 * (this.anInt338 * 76934957 - local538) + local2009 * local538 >> this.anInt336 * -1551262030;
				}
				local1960 = (arg0 << this.anInt336 * 1371852633) + local500;
				local2009 = (arg1 << this.anInt336 * 1371852633) + local538;
				local1756.aShortArray60[local410] = (short) local500;
				local1756.aShortArray65[local410] = (short) local538;
				local1756.aShortArray62[local410] = (short) (this.method3583(local1960, local2009) + (arg3 == null ? 0 : arg3[local410]));
				if (local1829 < 0) {
					local1829 = 0;
				}
				if (arg6[local410] != 0) {
					@Pc(2101) int local2101 = 0;
					if (arg5 != null) {
						@Pc(2113) short local2113 = local1756.aShortArray63[local410] = (short) arg5[local410];
						if (arg10.anInt3417 * 1125508145 != 0) {
							local2101 = local2113 * 255 / (arg10.anInt3417 * 1125508145);
							if (local2101 < 0) {
								local2101 = 0;
							} else if (local2101 > 255) {
								local2101 = 255;
							}
						}
					}
					local1756.anIntArray277[local410] = Class222.method24431(method3409(arg6[local410] >> 8, local1829), arg10.anInt3422 * -470091381, local2101);
					if (arg7 != null) {
						local1756.anIntArray277[local410] |= local1829 << 25;
					}
				} else if (arg7 == null) {
					local1756.anIntArray277[local410] = 0;
				} else {
					local1756.anIntArray277[local410] = local1829 << 25;
				}
			}
			@Pc(2171) boolean local2171 = false;
			for (local500 = 0; local500 < local1756.aShort143; local500++) {
				if (arg8[local500 * 3] != -1 && !this.aClass21_Sub1_6.aClass134_7.method22906(arg8[local500 * 3]).aBoolean620) {
					local2171 = true;
				}
			}
			if (arg7 != null) {
				local1756.anIntArray276 = new int[local1756.aShort143];
			}
			if (local2171) {
				local1756.aShortArray64 = new short[local1756.aShort143];
				local1756.aShortArray61 = new short[local1756.aShort143];
			}
			for (local500 = 0; local500 < local1756.aShort143; local500++) {
				local538 = local500 * 3;
				if (arg7 != null && arg7[local538] != 0) {
					local1756.anIntArray276[local500] = arg7[local538] >> 8;
				}
				if (local2171) {
					local1829 = local538 + 1;
					local1960 = local1829 + 1;
					@Pc(2256) boolean local2256 = false;
					@Pc(2258) boolean local2258 = true;
					@Pc(2262) int local2262 = arg8[local538];
					if (local2262 == -1 || this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
						local2258 = false;
					} else {
						local2256 = true;
					}
					local2262 = arg8[local1829];
					if (local2262 == -1 || this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
						local2258 = false;
					} else {
						local2256 = true;
					}
					local2262 = arg8[local1960];
					if (local2262 == -1 || this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
						local2258 = false;
					} else {
						local2256 = true;
					}
					if (local2258) {
						local1756.aShortArray64[local500] = (short) local2262;
						local1756.aShortArray61[local500] = (short) arg9[local538];
					} else {
						if (local2256) {
							local2262 = arg8[local538];
							if (local2262 != -1 && !this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
								local1756.anIntArray277[local538] = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aShort160 & 0xFFFF) & 0xFFFF];
							}
							local2262 = arg8[local1829];
							if (local2262 != -1 && !this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
								local1756.anIntArray277[local1829] = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aShort160 & 0xFFFF) & 0xFFFF];
							}
							local2262 = arg8[local1960];
							if (local2262 != -1 && !this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
								local1756.anIntArray277[local1960] = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aShort160 & 0xFFFF) & 0xFFFF];
							}
						}
						local1756.aShortArray64[local500] = -1;
					}
				}
			}
			this.aClass83ArrayArray1[arg0][arg1] = local1756;
			return;
		}
		@Pc(903) Class28 local903 = new Class28();
		local410 = arg6[0];
		local500 = arg8[0];
		if (arg7 != null) {
			local903.anInt760 = arg7[0] >> 8;
			if (local410 == 0) {
				local903.aByte18 = (byte) (local903.aByte18 | 0x2);
			}
		} else if (local410 == 0) {
			return;
		}
		if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
			local903.aByte18 = (byte) (local903.aByte18 | 0x1);
		}
		if (local500 == -1 || (local903.aByte18 & 0x2) != 0 || this.aClass21_Sub1_6.aClass134_7.method22906(local500).aBoolean620) {
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt761 = Class222.method24431(method3409(arg6[local198] >> 8, this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt761 |= 255 - (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt764 = Class222.method24431(method3409(arg6[local206] >> 8, this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt764 |= 255 - (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt762 = Class222.method24431(method3409(arg6[local210] >> 8, this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt762 |= 255 - (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt763 = Class222.method24431(method3409(arg6[local230] >> 8, this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt763 |= 255 - (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) << 25;
			}
			local903.aShort38 = -1;
		} else {
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt761 = Class222.method24431(method3409(arg6[local198] >> 8, this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt761 |= 255 - (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt764 = Class222.method24431(method3409(arg6[local206] >> 8, this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt764 |= 255 - (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt762 = Class222.method24431(method3409(arg6[local210] >> 8, this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt762 |= 255 - (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt763 = Class222.method24431(method3409(arg6[local230] >> 8, this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]), arg10.anInt3422 * -470091381, local538);
			local903.aShort38 = (short) local500;
		}
		if (arg5 != null) {
			local903.aShort36 = (short) arg5[local210];
			local903.aShort37 = (short) arg5[local230];
			local903.aShort35 = (short) arg5[local206];
			local903.aShort34 = (short) arg5[local198];
		}
		this.aClass28ArrayArray1[arg0][arg1] = local903;
	}

	@OriginalMember(owner = "client!abo", name = "o", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 209)
	@Override
	public void method3561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class139 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(8) boolean local8 = (this.anInt319 & 0x20) == 0;
		if (this.aClass28ArrayArray1 == null && !local8) {
			this.aClass28ArrayArray1 = new Class28[this.anInt339 * -1007974723][this.anInt337 * -207323189];
			this.aClass83ArrayArray1 = new Class83[this.anInt339 * -1007974723][this.anInt337 * -207323189];
		} else if (this.aClass89ArrayArray1 == null && local8) {
			this.aClass89ArrayArray1 = new Class89[this.anInt339 * -1007974723][this.anInt337 * -207323189];
		} else if (this.aClass22ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		@Pc(68) int local68;
		for (local68 = 0; local68 < arg6.length; local68++) {
			if (arg6[local68] == -1) {
				arg6[local68] = 0;
			} else {
				arg6[local68] = Class515.anIntArray490[Class61.method12768(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Class515.anIntArray490[Class61.method12768(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(198) int local198;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(230) int local230;
		@Pc(361) int local361;
		@Pc(410) int local410;
		@Pc(500) int local500;
		@Pc(538) int local538;
		if (local8) {
			@Pc(142) Class89 local142 = new Class89();
			local142.aShort145 = (short) arg2.length;
			local142.aShort146 = (short) (arg2.length / 3);
			local142.aShortArray67 = new short[local142.aShort145];
			local142.aShortArray66 = new short[local142.aShort145];
			local142.aShortArray70 = new short[local142.aShort145];
			local142.anIntArray279 = new int[local142.aShort145];
			local142.aShortArray69 = new short[local142.aShort145];
			local142.aShortArray71 = new short[local142.aShort145];
			local142.aByteArray55 = new byte[local142.aShort145];
			if (arg5 != null) {
				local142.aShortArray68 = new short[local142.aShort145];
			}
			for (local198 = 0; local198 < local142.aShort145; local198++) {
				local206 = arg2[local198];
				local210 = arg4[local198];
				if (local206 == 0 && local210 == 0) {
					local230 = this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1];
				} else if (local206 == 0 && local210 == this.anInt338 * 76934957) {
					local230 = this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1];
				} else if (local206 == this.anInt338 * 76934957 && local210 == this.anInt338 * 76934957) {
					local230 = this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1];
				} else if (local206 == this.anInt338 * 76934957 && local210 == 0) {
					local230 = this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1];
				} else {
					local361 = (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) * (this.anInt338 * 76934957 - local206) + (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) * local206;
					local410 = (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) * (this.anInt338 * 76934957 - local206) + (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) * local206;
					local230 = local361 * (this.anInt338 * 76934957 - local210) + local410 * local210 >> this.anInt336 * -1551262030;
				}
				local361 = (arg0 << this.anInt336 * 1371852633) + local206;
				local410 = (arg1 << this.anInt336 * 1371852633) + local210;
				local142.aShortArray67[local198] = (short) local206;
				local142.aShortArray70[local198] = (short) local210;
				local142.aShortArray66[local198] = (short) (this.method3583(local361, local410) + (arg3 == null ? 0 : arg3[local198]));
				if (local230 < 0) {
					local230 = 0;
				}
				if (arg6[local198] == 0) {
					local142.anIntArray279[local198] = 0;
					if (arg7 != null) {
						local142.aByteArray55[local198] = (byte) local230;
					}
				} else {
					local500 = 0;
					if (arg5 != null) {
						@Pc(512) short local512 = local142.aShortArray68[local198] = (short) arg5[local198];
						if (arg10.anInt3417 * 1125508145 != 0) {
							local500 = local512 * 255 / (arg10.anInt3417 * 1125508145);
							if (local500 < 0) {
								local500 = 0;
							} else if (local500 > 255) {
								local500 = 255;
							}
						}
					}
					local538 = -16777216;
					if (arg8[local198] != -1) {
						@Pc(552) Class133 local552 = this.aClass21_Sub1_6.aClass134_7.method22906(arg8[local198]);
						if (local552.anInt3351 * -1410868471 != -1 && this.method3410(local552.aByte118)) {
							local538 = -1694498816;
						}
					}
					local142.anIntArray279[local198] = local538 | Class222.method24431(method3409(arg6[local198] >> 8, local230), arg10.anInt3422 * -470091381, local500);
					if (arg7 != null) {
						local142.aByteArray55[local198] = (byte) local230;
					}
				}
				local142.aShortArray69[local198] = (short) arg8[local198];
				local142.aShortArray71[local198] = (short) arg9[local198];
			}
			if (arg7 != null) {
				local142.anIntArray280 = new int[local142.aShort146];
				for (local198 = 0; local198 < local142.aShort146; local198++) {
					local206 = local198 * 3;
					if (arg7[local206] != 0) {
						local142.anIntArray280[local198] = arg7[local206] >> 8 | 0xFF000000;
					}
				}
			}
			this.aClass89ArrayArray1[arg0][arg1] = local142;
			return;
		}
		@Pc(655) boolean local655 = true;
		local198 = -1;
		local206 = -1;
		local210 = -1;
		local230 = -1;
		if (arg2.length == 6) {
			for (local361 = 0; local361 < 6; local361++) {
				if (arg2[local361] == 0 && arg4[local361] == 0) {
					if (local198 != -1 && arg6[local198] != arg6[local361]) {
						local655 = false;
						break;
					}
					local198 = local361;
				} else if (arg2[local361] == this.anInt338 * 76934957 && arg4[local361] == 0) {
					if (local206 != -1 && arg6[local206] != arg6[local361]) {
						local655 = false;
						break;
					}
					local206 = local361;
				} else if (arg2[local361] == this.anInt338 * 76934957 && arg4[local361] == this.anInt338 * 76934957) {
					if (local210 != -1 && arg6[local210] != arg6[local361]) {
						local655 = false;
						break;
					}
					local210 = local361;
				} else if (arg2[local361] == 0 && arg4[local361] == this.anInt338 * 76934957) {
					if (local230 != -1 && arg6[local230] != arg6[local361]) {
						local655 = false;
						break;
					}
					local230 = local361;
				}
			}
			if (local198 == -1 || local206 == -1 || local210 == -1 || local230 == -1) {
				local655 = false;
			}
			if (local655) {
				if (arg3 != null) {
					for (local361 = 0; local361 < 4; local361++) {
						if (arg3[local361] != 0) {
							local655 = false;
							break;
						}
					}
				}
				if (local655) {
					for (local361 = 1; local361 < 4; local361++) {
						if (arg2[local361] != arg2[0] && arg2[local361] != arg2[0] + this.anInt338 * 76934957 && arg2[local361] != arg2[0] - this.anInt338 * 76934957) {
							local655 = false;
							break;
						}
						if (arg4[local361] != arg4[0] && arg4[local361] != arg4[0] + this.anInt338 * 76934957 && arg4[local361] != arg4[0] - this.anInt338 * 76934957) {
							local655 = false;
							break;
						}
					}
				}
			}
		} else {
			local655 = false;
		}
		if (!local655) {
			@Pc(1756) Class83 local1756 = new Class83();
			local1756.aShort142 = (short) arg2.length;
			local1756.aShort143 = (short) (arg2.length / 3);
			local1756.aShortArray60 = new short[local1756.aShort142];
			local1756.aShortArray62 = new short[local1756.aShort142];
			local1756.aShortArray65 = new short[local1756.aShort142];
			local1756.anIntArray277 = new int[local1756.aShort142];
			if (arg5 != null) {
				local1756.aShortArray63 = new short[local1756.aShort142];
			}
			@Pc(1960) int local1960;
			@Pc(1829) int local1829;
			for (local410 = 0; local410 < local1756.aShort142; local410++) {
				local500 = arg2[local410];
				local538 = arg4[local410];
				@Pc(2009) int local2009;
				if (local500 == 0 && local538 == 0) {
					local1829 = this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1];
				} else if (local500 == 0 && local538 == this.anInt338 * 76934957) {
					local1829 = this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1];
				} else if (local500 == this.anInt338 * 76934957 && local538 == this.anInt338 * 76934957) {
					local1829 = this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1];
				} else if (local500 == this.anInt338 * 76934957 && local538 == 0) {
					local1829 = this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1];
				} else {
					local1960 = (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) * (this.anInt338 * 76934957 - local500) + (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) * local500;
					local2009 = (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) * (this.anInt338 * 76934957 - local500) + (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) * local500;
					local1829 = local1960 * (this.anInt338 * 76934957 - local538) + local2009 * local538 >> this.anInt336 * -1551262030;
				}
				local1960 = (arg0 << this.anInt336 * 1371852633) + local500;
				local2009 = (arg1 << this.anInt336 * 1371852633) + local538;
				local1756.aShortArray60[local410] = (short) local500;
				local1756.aShortArray65[local410] = (short) local538;
				local1756.aShortArray62[local410] = (short) (this.method3583(local1960, local2009) + (arg3 == null ? 0 : arg3[local410]));
				if (local1829 < 0) {
					local1829 = 0;
				}
				if (arg6[local410] != 0) {
					@Pc(2101) int local2101 = 0;
					if (arg5 != null) {
						@Pc(2113) short local2113 = local1756.aShortArray63[local410] = (short) arg5[local410];
						if (arg10.anInt3417 * 1125508145 != 0) {
							local2101 = local2113 * 255 / (arg10.anInt3417 * 1125508145);
							if (local2101 < 0) {
								local2101 = 0;
							} else if (local2101 > 255) {
								local2101 = 255;
							}
						}
					}
					local1756.anIntArray277[local410] = Class222.method24431(method3409(arg6[local410] >> 8, local1829), arg10.anInt3422 * -470091381, local2101);
					if (arg7 != null) {
						local1756.anIntArray277[local410] |= local1829 << 25;
					}
				} else if (arg7 == null) {
					local1756.anIntArray277[local410] = 0;
				} else {
					local1756.anIntArray277[local410] = local1829 << 25;
				}
			}
			@Pc(2171) boolean local2171 = false;
			for (local500 = 0; local500 < local1756.aShort143; local500++) {
				if (arg8[local500 * 3] != -1 && !this.aClass21_Sub1_6.aClass134_7.method22906(arg8[local500 * 3]).aBoolean620) {
					local2171 = true;
				}
			}
			if (arg7 != null) {
				local1756.anIntArray276 = new int[local1756.aShort143];
			}
			if (local2171) {
				local1756.aShortArray64 = new short[local1756.aShort143];
				local1756.aShortArray61 = new short[local1756.aShort143];
			}
			for (local500 = 0; local500 < local1756.aShort143; local500++) {
				local538 = local500 * 3;
				if (arg7 != null && arg7[local538] != 0) {
					local1756.anIntArray276[local500] = arg7[local538] >> 8;
				}
				if (local2171) {
					local1829 = local538 + 1;
					local1960 = local1829 + 1;
					@Pc(2256) boolean local2256 = false;
					@Pc(2258) boolean local2258 = true;
					@Pc(2262) int local2262 = arg8[local538];
					if (local2262 == -1 || this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
						local2258 = false;
					} else {
						local2256 = true;
					}
					local2262 = arg8[local1829];
					if (local2262 == -1 || this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
						local2258 = false;
					} else {
						local2256 = true;
					}
					local2262 = arg8[local1960];
					if (local2262 == -1 || this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
						local2258 = false;
					} else {
						local2256 = true;
					}
					if (local2258) {
						local1756.aShortArray64[local500] = (short) local2262;
						local1756.aShortArray61[local500] = (short) arg9[local538];
					} else {
						if (local2256) {
							local2262 = arg8[local538];
							if (local2262 != -1 && !this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
								local1756.anIntArray277[local538] = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aShort160 & 0xFFFF) & 0xFFFF];
							}
							local2262 = arg8[local1829];
							if (local2262 != -1 && !this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
								local1756.anIntArray277[local1829] = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aShort160 & 0xFFFF) & 0xFFFF];
							}
							local2262 = arg8[local1960];
							if (local2262 != -1 && !this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
								local1756.anIntArray277[local1960] = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aShort160 & 0xFFFF) & 0xFFFF];
							}
						}
						local1756.aShortArray64[local500] = -1;
					}
				}
			}
			this.aClass83ArrayArray1[arg0][arg1] = local1756;
			return;
		}
		@Pc(903) Class28 local903 = new Class28();
		local410 = arg6[0];
		local500 = arg8[0];
		if (arg7 != null) {
			local903.anInt760 = arg7[0] >> 8;
			if (local410 == 0) {
				local903.aByte18 = (byte) (local903.aByte18 | 0x2);
			}
		} else if (local410 == 0) {
			return;
		}
		if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
			local903.aByte18 = (byte) (local903.aByte18 | 0x1);
		}
		if (local500 == -1 || (local903.aByte18 & 0x2) != 0 || this.aClass21_Sub1_6.aClass134_7.method22906(local500).aBoolean620) {
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt761 = Class222.method24431(method3409(arg6[local198] >> 8, this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt761 |= 255 - (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt764 = Class222.method24431(method3409(arg6[local206] >> 8, this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt764 |= 255 - (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt762 = Class222.method24431(method3409(arg6[local210] >> 8, this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt762 |= 255 - (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt763 = Class222.method24431(method3409(arg6[local230] >> 8, this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt763 |= 255 - (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) << 25;
			}
			local903.aShort38 = -1;
		} else {
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt761 = Class222.method24431(method3409(arg6[local198] >> 8, this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt761 |= 255 - (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt764 = Class222.method24431(method3409(arg6[local206] >> 8, this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt764 |= 255 - (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt762 = Class222.method24431(method3409(arg6[local210] >> 8, this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt762 |= 255 - (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt763 = Class222.method24431(method3409(arg6[local230] >> 8, this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]), arg10.anInt3422 * -470091381, local538);
			local903.aShort38 = (short) local500;
		}
		if (arg5 != null) {
			local903.aShort36 = (short) arg5[local210];
			local903.aShort37 = (short) arg5[local230];
			local903.aShort35 = (short) arg5[local206];
			local903.aShort34 = (short) arg5[local198];
		}
		this.aClass28ArrayArray1[arg0][arg1] = local903;
	}

	@OriginalMember(owner = "client!abo", name = "i", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 209)
	@Override
	public void method3549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class139 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(8) boolean local8 = (this.anInt319 & 0x20) == 0;
		if (this.aClass28ArrayArray1 == null && !local8) {
			this.aClass28ArrayArray1 = new Class28[this.anInt339 * -1007974723][this.anInt337 * -207323189];
			this.aClass83ArrayArray1 = new Class83[this.anInt339 * -1007974723][this.anInt337 * -207323189];
		} else if (this.aClass89ArrayArray1 == null && local8) {
			this.aClass89ArrayArray1 = new Class89[this.anInt339 * -1007974723][this.anInt337 * -207323189];
		} else if (this.aClass22ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		@Pc(68) int local68;
		for (local68 = 0; local68 < arg6.length; local68++) {
			if (arg6[local68] == -1) {
				arg6[local68] = 0;
			} else {
				arg6[local68] = Class515.anIntArray490[Class61.method12768(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Class515.anIntArray490[Class61.method12768(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(198) int local198;
		@Pc(206) int local206;
		@Pc(210) int local210;
		@Pc(230) int local230;
		@Pc(361) int local361;
		@Pc(410) int local410;
		@Pc(500) int local500;
		@Pc(538) int local538;
		if (local8) {
			@Pc(142) Class89 local142 = new Class89();
			local142.aShort145 = (short) arg2.length;
			local142.aShort146 = (short) (arg2.length / 3);
			local142.aShortArray67 = new short[local142.aShort145];
			local142.aShortArray66 = new short[local142.aShort145];
			local142.aShortArray70 = new short[local142.aShort145];
			local142.anIntArray279 = new int[local142.aShort145];
			local142.aShortArray69 = new short[local142.aShort145];
			local142.aShortArray71 = new short[local142.aShort145];
			local142.aByteArray55 = new byte[local142.aShort145];
			if (arg5 != null) {
				local142.aShortArray68 = new short[local142.aShort145];
			}
			for (local198 = 0; local198 < local142.aShort145; local198++) {
				local206 = arg2[local198];
				local210 = arg4[local198];
				if (local206 == 0 && local210 == 0) {
					local230 = this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1];
				} else if (local206 == 0 && local210 == this.anInt338 * 76934957) {
					local230 = this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1];
				} else if (local206 == this.anInt338 * 76934957 && local210 == this.anInt338 * 76934957) {
					local230 = this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1];
				} else if (local206 == this.anInt338 * 76934957 && local210 == 0) {
					local230 = this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1];
				} else {
					local361 = (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) * (this.anInt338 * 76934957 - local206) + (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) * local206;
					local410 = (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) * (this.anInt338 * 76934957 - local206) + (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) * local206;
					local230 = local361 * (this.anInt338 * 76934957 - local210) + local410 * local210 >> this.anInt336 * -1551262030;
				}
				local361 = (arg0 << this.anInt336 * 1371852633) + local206;
				local410 = (arg1 << this.anInt336 * 1371852633) + local210;
				local142.aShortArray67[local198] = (short) local206;
				local142.aShortArray70[local198] = (short) local210;
				local142.aShortArray66[local198] = (short) (this.method3583(local361, local410) + (arg3 == null ? 0 : arg3[local198]));
				if (local230 < 0) {
					local230 = 0;
				}
				if (arg6[local198] == 0) {
					local142.anIntArray279[local198] = 0;
					if (arg7 != null) {
						local142.aByteArray55[local198] = (byte) local230;
					}
				} else {
					local500 = 0;
					if (arg5 != null) {
						@Pc(512) short local512 = local142.aShortArray68[local198] = (short) arg5[local198];
						if (arg10.anInt3417 * 1125508145 != 0) {
							local500 = local512 * 255 / (arg10.anInt3417 * 1125508145);
							if (local500 < 0) {
								local500 = 0;
							} else if (local500 > 255) {
								local500 = 255;
							}
						}
					}
					local538 = -16777216;
					if (arg8[local198] != -1) {
						@Pc(552) Class133 local552 = this.aClass21_Sub1_6.aClass134_7.method22906(arg8[local198]);
						if (local552.anInt3351 * -1410868471 != -1 && this.method3410(local552.aByte118)) {
							local538 = -1694498816;
						}
					}
					local142.anIntArray279[local198] = local538 | Class222.method24431(method3409(arg6[local198] >> 8, local230), arg10.anInt3422 * -470091381, local500);
					if (arg7 != null) {
						local142.aByteArray55[local198] = (byte) local230;
					}
				}
				local142.aShortArray69[local198] = (short) arg8[local198];
				local142.aShortArray71[local198] = (short) arg9[local198];
			}
			if (arg7 != null) {
				local142.anIntArray280 = new int[local142.aShort146];
				for (local198 = 0; local198 < local142.aShort146; local198++) {
					local206 = local198 * 3;
					if (arg7[local206] != 0) {
						local142.anIntArray280[local198] = arg7[local206] >> 8 | 0xFF000000;
					}
				}
			}
			this.aClass89ArrayArray1[arg0][arg1] = local142;
			return;
		}
		@Pc(655) boolean local655 = true;
		local198 = -1;
		local206 = -1;
		local210 = -1;
		local230 = -1;
		if (arg2.length == 6) {
			for (local361 = 0; local361 < 6; local361++) {
				if (arg2[local361] == 0 && arg4[local361] == 0) {
					if (local198 != -1 && arg6[local198] != arg6[local361]) {
						local655 = false;
						break;
					}
					local198 = local361;
				} else if (arg2[local361] == this.anInt338 * 76934957 && arg4[local361] == 0) {
					if (local206 != -1 && arg6[local206] != arg6[local361]) {
						local655 = false;
						break;
					}
					local206 = local361;
				} else if (arg2[local361] == this.anInt338 * 76934957 && arg4[local361] == this.anInt338 * 76934957) {
					if (local210 != -1 && arg6[local210] != arg6[local361]) {
						local655 = false;
						break;
					}
					local210 = local361;
				} else if (arg2[local361] == 0 && arg4[local361] == this.anInt338 * 76934957) {
					if (local230 != -1 && arg6[local230] != arg6[local361]) {
						local655 = false;
						break;
					}
					local230 = local361;
				}
			}
			if (local198 == -1 || local206 == -1 || local210 == -1 || local230 == -1) {
				local655 = false;
			}
			if (local655) {
				if (arg3 != null) {
					for (local361 = 0; local361 < 4; local361++) {
						if (arg3[local361] != 0) {
							local655 = false;
							break;
						}
					}
				}
				if (local655) {
					for (local361 = 1; local361 < 4; local361++) {
						if (arg2[local361] != arg2[0] && arg2[local361] != arg2[0] + this.anInt338 * 76934957 && arg2[local361] != arg2[0] - this.anInt338 * 76934957) {
							local655 = false;
							break;
						}
						if (arg4[local361] != arg4[0] && arg4[local361] != arg4[0] + this.anInt338 * 76934957 && arg4[local361] != arg4[0] - this.anInt338 * 76934957) {
							local655 = false;
							break;
						}
					}
				}
			}
		} else {
			local655 = false;
		}
		if (!local655) {
			@Pc(1756) Class83 local1756 = new Class83();
			local1756.aShort142 = (short) arg2.length;
			local1756.aShort143 = (short) (arg2.length / 3);
			local1756.aShortArray60 = new short[local1756.aShort142];
			local1756.aShortArray62 = new short[local1756.aShort142];
			local1756.aShortArray65 = new short[local1756.aShort142];
			local1756.anIntArray277 = new int[local1756.aShort142];
			if (arg5 != null) {
				local1756.aShortArray63 = new short[local1756.aShort142];
			}
			@Pc(1960) int local1960;
			@Pc(1829) int local1829;
			for (local410 = 0; local410 < local1756.aShort142; local410++) {
				local500 = arg2[local410];
				local538 = arg4[local410];
				@Pc(2009) int local2009;
				if (local500 == 0 && local538 == 0) {
					local1829 = this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1];
				} else if (local500 == 0 && local538 == this.anInt338 * 76934957) {
					local1829 = this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1];
				} else if (local500 == this.anInt338 * 76934957 && local538 == this.anInt338 * 76934957) {
					local1829 = this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1];
				} else if (local500 == this.anInt338 * 76934957 && local538 == 0) {
					local1829 = this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1];
				} else {
					local1960 = (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) * (this.anInt338 * 76934957 - local500) + (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) * local500;
					local2009 = (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) * (this.anInt338 * 76934957 - local500) + (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) * local500;
					local1829 = local1960 * (this.anInt338 * 76934957 - local538) + local2009 * local538 >> this.anInt336 * -1551262030;
				}
				local1960 = (arg0 << this.anInt336 * 1371852633) + local500;
				local2009 = (arg1 << this.anInt336 * 1371852633) + local538;
				local1756.aShortArray60[local410] = (short) local500;
				local1756.aShortArray65[local410] = (short) local538;
				local1756.aShortArray62[local410] = (short) (this.method3583(local1960, local2009) + (arg3 == null ? 0 : arg3[local410]));
				if (local1829 < 0) {
					local1829 = 0;
				}
				if (arg6[local410] != 0) {
					@Pc(2101) int local2101 = 0;
					if (arg5 != null) {
						@Pc(2113) short local2113 = local1756.aShortArray63[local410] = (short) arg5[local410];
						if (arg10.anInt3417 * 1125508145 != 0) {
							local2101 = local2113 * 255 / (arg10.anInt3417 * 1125508145);
							if (local2101 < 0) {
								local2101 = 0;
							} else if (local2101 > 255) {
								local2101 = 255;
							}
						}
					}
					local1756.anIntArray277[local410] = Class222.method24431(method3409(arg6[local410] >> 8, local1829), arg10.anInt3422 * -470091381, local2101);
					if (arg7 != null) {
						local1756.anIntArray277[local410] |= local1829 << 25;
					}
				} else if (arg7 == null) {
					local1756.anIntArray277[local410] = 0;
				} else {
					local1756.anIntArray277[local410] = local1829 << 25;
				}
			}
			@Pc(2171) boolean local2171 = false;
			for (local500 = 0; local500 < local1756.aShort143; local500++) {
				if (arg8[local500 * 3] != -1 && !this.aClass21_Sub1_6.aClass134_7.method22906(arg8[local500 * 3]).aBoolean620) {
					local2171 = true;
				}
			}
			if (arg7 != null) {
				local1756.anIntArray276 = new int[local1756.aShort143];
			}
			if (local2171) {
				local1756.aShortArray64 = new short[local1756.aShort143];
				local1756.aShortArray61 = new short[local1756.aShort143];
			}
			for (local500 = 0; local500 < local1756.aShort143; local500++) {
				local538 = local500 * 3;
				if (arg7 != null && arg7[local538] != 0) {
					local1756.anIntArray276[local500] = arg7[local538] >> 8;
				}
				if (local2171) {
					local1829 = local538 + 1;
					local1960 = local1829 + 1;
					@Pc(2256) boolean local2256 = false;
					@Pc(2258) boolean local2258 = true;
					@Pc(2262) int local2262 = arg8[local538];
					if (local2262 == -1 || this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
						local2258 = false;
					} else {
						local2256 = true;
					}
					local2262 = arg8[local1829];
					if (local2262 == -1 || this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
						local2258 = false;
					} else {
						local2256 = true;
					}
					local2262 = arg8[local1960];
					if (local2262 == -1 || this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
						local2258 = false;
					} else {
						local2256 = true;
					}
					if (local2258) {
						local1756.aShortArray64[local500] = (short) local2262;
						local1756.aShortArray61[local500] = (short) arg9[local538];
					} else {
						if (local2256) {
							local2262 = arg8[local538];
							if (local2262 != -1 && !this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
								local1756.anIntArray277[local538] = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aShort160 & 0xFFFF) & 0xFFFF];
							}
							local2262 = arg8[local1829];
							if (local2262 != -1 && !this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
								local1756.anIntArray277[local1829] = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aShort160 & 0xFFFF) & 0xFFFF];
							}
							local2262 = arg8[local1960];
							if (local2262 != -1 && !this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aBoolean620) {
								local1756.anIntArray277[local1960] = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_6.aClass134_7.method22906(local2262).aShort160 & 0xFFFF) & 0xFFFF];
							}
						}
						local1756.aShortArray64[local500] = -1;
					}
				}
			}
			this.aClass83ArrayArray1[arg0][arg1] = local1756;
			return;
		}
		@Pc(903) Class28 local903 = new Class28();
		local410 = arg6[0];
		local500 = arg8[0];
		if (arg7 != null) {
			local903.anInt760 = arg7[0] >> 8;
			if (local410 == 0) {
				local903.aByte18 = (byte) (local903.aByte18 | 0x2);
			}
		} else if (local410 == 0) {
			return;
		}
		if (this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0 + 1][arg1 + 1] && this.anIntArrayArray7[arg0][arg1] == this.anIntArrayArray7[arg0][arg1 + 1]) {
			local903.aByte18 = (byte) (local903.aByte18 | 0x1);
		}
		if (local500 == -1 || (local903.aByte18 & 0x2) != 0 || this.aClass21_Sub1_6.aClass134_7.method22906(local500).aBoolean620) {
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt761 = Class222.method24431(method3409(arg6[local198] >> 8, this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt761 |= 255 - (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt764 = Class222.method24431(method3409(arg6[local206] >> 8, this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt764 |= 255 - (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt762 = Class222.method24431(method3409(arg6[local210] >> 8, this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt762 |= 255 - (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt763 = Class222.method24431(method3409(arg6[local230] >> 8, this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt763 |= 255 - (this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]) << 25;
			}
			local903.aShort38 = -1;
		} else {
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local198] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt761 = Class222.method24431(method3409(arg6[local198] >> 8, this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt761 |= 255 - (this.aByteArrayArray7[arg0][arg1] - this.aByteArrayArray6[arg0][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local206] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt764 = Class222.method24431(method3409(arg6[local206] >> 8, this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt764 |= 255 - (this.aByteArrayArray7[arg0 + 1][arg1] - this.aByteArrayArray6[arg0 + 1][arg1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local210] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt762 = Class222.method24431(method3409(arg6[local210] >> 8, this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]), arg10.anInt3422 * -470091381, local538);
			if (local903.anInt760 != 0) {
				local903.anInt762 |= 255 - (this.aByteArrayArray7[arg0 + 1][arg1 + 1] - this.aByteArrayArray6[arg0 + 1][arg1 + 1]) << 25;
			}
			if (arg5 == null || arg10.anInt3417 * 1125508145 == 0) {
				local538 = 0;
			} else {
				local538 = arg5[local230] * 255 / (arg10.anInt3417 * 1125508145);
				if (local538 < 0) {
					local538 = 0;
				} else if (local538 > 255) {
					local538 = 255;
				}
			}
			local903.anInt763 = Class222.method24431(method3409(arg6[local230] >> 8, this.aByteArrayArray7[arg0][arg1 + 1] - this.aByteArrayArray6[arg0][arg1 + 1]), arg10.anInt3422 * -470091381, local538);
			local903.aShort38 = (short) local500;
		}
		if (arg5 != null) {
			local903.aShort36 = (short) arg5[local210];
			local903.aShort37 = (short) arg5[local230];
			local903.aShort35 = (short) arg5[local206];
			local903.aShort34 = (short) arg5[local198];
		}
		this.aClass28ArrayArray1[arg0][arg1] = local903;
	}

	@OriginalMember(owner = "client!abo", name = "aw", descriptor = "(II)I", line = 560)
	static int method3409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = (arg0 & 0xFF0000) * arg1 >> 23;
		if (local7 < 2) {
			local7 = 2;
		} else if (local7 > 253) {
			local7 = 253;
		}
		@Pc(26) int local26 = (arg0 & 0xFF00) * arg1 >> 15;
		if (local26 < 2) {
			local26 = 2;
		} else if (local26 > 253) {
			local26 = 253;
		}
		@Pc(45) int local45 = (arg0 & 0xFF) * arg1 >> 7;
		if (local45 < 2) {
			local45 = 2;
		} else if (local45 > 253) {
			local45 = 253;
		}
		return local7 << 16 | local26 << 8 | local45;
	}

	@OriginalMember(owner = "client!abo", name = "bt", descriptor = "(II)I", line = 560)
	static int method3416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = (arg0 & 0xFF0000) * arg1 >> 23;
		if (local7 < 2) {
			local7 = 2;
		} else if (local7 > 253) {
			local7 = 253;
		}
		@Pc(26) int local26 = (arg0 & 0xFF00) * arg1 >> 15;
		if (local26 < 2) {
			local26 = 2;
		} else if (local26 > 253) {
			local26 = 253;
		}
		@Pc(45) int local45 = (arg0 & 0xFF) * arg1 >> 7;
		if (local45 < 2) {
			local45 = 2;
		} else if (local45 > 253) {
			local45 = 253;
		}
		return local7 << 16 | local26 << 8 | local45;
	}

	@OriginalMember(owner = "client!abo", name = "f", descriptor = "()V", line = 573)
	@Override
	public void method3563() {
		this.aByteArrayArray7 = null;
		this.aByteArrayArray6 = null;
	}

	@OriginalMember(owner = "client!abo", name = "l", descriptor = "()V", line = 573)
	@Override
	public void method3546() {
		this.aByteArrayArray7 = null;
		this.aByteArrayArray6 = null;
	}

	@OriginalMember(owner = "client!abo", name = "h", descriptor = "(III[[ZZI)V", line = 578)
	@Override
	public void method3544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass21_Sub1_6.anIntArray39 == null || this.aClass21_Sub1_6.aFloatArray21 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class328 local16 = this.aClass21_Sub1_6.aClass328_5;
		this.aFloat23 = local16.aFloatArray106[0];
		this.aFloat26 = local16.aFloatArray106[1];
		this.aFloat27 = local16.aFloatArray106[2];
		this.aFloat28 = local16.aFloatArray106[3];
		this.aFloat29 = local16.aFloatArray106[4];
		this.aFloat30 = local16.aFloatArray106[5];
		this.aFloat31 = local16.aFloatArray106[6];
		this.aFloat33 = local16.aFloatArray106[7];
		this.aFloat34 = local16.aFloatArray106[8];
		this.aFloat32 = local16.aFloatArray106[9];
		this.aFloat25 = local16.aFloatArray106[10];
		this.aFloat24 = local16.aFloatArray106[11];
		this.aFloat38 = local16.aFloatArray106[12];
		this.aFloat35 = local16.aFloatArray106[13];
		this.aFloat36 = local16.aFloatArray106[14];
		this.aFloat37 = local16.aFloatArray106[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt339 * -1007974723 && local145 >= 0 && local145 < this.anInt337 * -207323189) {
						this.method3429(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abo", name = "k", descriptor = "(III[[ZZI)V", line = 578)
	@Override
	public void method3564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass21_Sub1_6.anIntArray39 == null || this.aClass21_Sub1_6.aFloatArray21 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class328 local16 = this.aClass21_Sub1_6.aClass328_5;
		this.aFloat23 = local16.aFloatArray106[0];
		this.aFloat26 = local16.aFloatArray106[1];
		this.aFloat27 = local16.aFloatArray106[2];
		this.aFloat28 = local16.aFloatArray106[3];
		this.aFloat29 = local16.aFloatArray106[4];
		this.aFloat30 = local16.aFloatArray106[5];
		this.aFloat31 = local16.aFloatArray106[6];
		this.aFloat33 = local16.aFloatArray106[7];
		this.aFloat34 = local16.aFloatArray106[8];
		this.aFloat32 = local16.aFloatArray106[9];
		this.aFloat25 = local16.aFloatArray106[10];
		this.aFloat24 = local16.aFloatArray106[11];
		this.aFloat38 = local16.aFloatArray106[12];
		this.aFloat35 = local16.aFloatArray106[13];
		this.aFloat36 = local16.aFloatArray106[14];
		this.aFloat37 = local16.aFloatArray106[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt339 * -1007974723 && local145 >= 0 && local145 < this.anInt337 * -207323189) {
						this.method3429(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abo", name = "at", descriptor = "(III[[ZZI)V", line = 578)
	@Override
	public void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass21_Sub1_6.anIntArray39 == null || this.aClass21_Sub1_6.aFloatArray21 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class328 local16 = this.aClass21_Sub1_6.aClass328_5;
		this.aFloat23 = local16.aFloatArray106[0];
		this.aFloat26 = local16.aFloatArray106[1];
		this.aFloat27 = local16.aFloatArray106[2];
		this.aFloat28 = local16.aFloatArray106[3];
		this.aFloat29 = local16.aFloatArray106[4];
		this.aFloat30 = local16.aFloatArray106[5];
		this.aFloat31 = local16.aFloatArray106[6];
		this.aFloat33 = local16.aFloatArray106[7];
		this.aFloat34 = local16.aFloatArray106[8];
		this.aFloat32 = local16.aFloatArray106[9];
		this.aFloat25 = local16.aFloatArray106[10];
		this.aFloat24 = local16.aFloatArray106[11];
		this.aFloat38 = local16.aFloatArray106[12];
		this.aFloat35 = local16.aFloatArray106[13];
		this.aFloat36 = local16.aFloatArray106[14];
		this.aFloat37 = local16.aFloatArray106[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt339 * -1007974723 && local145 >= 0 && local145 < this.anInt337 * -207323189) {
						this.method3429(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abo", name = "af", descriptor = "(III[[ZZI)V", line = 578)
	@Override
	public void method3566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass21_Sub1_6.anIntArray39 == null || this.aClass21_Sub1_6.aFloatArray21 == null) {
			throw new IllegalStateException("");
		}
		@Pc(16) Class328 local16 = this.aClass21_Sub1_6.aClass328_5;
		this.aFloat23 = local16.aFloatArray106[0];
		this.aFloat26 = local16.aFloatArray106[1];
		this.aFloat27 = local16.aFloatArray106[2];
		this.aFloat28 = local16.aFloatArray106[3];
		this.aFloat29 = local16.aFloatArray106[4];
		this.aFloat30 = local16.aFloatArray106[5];
		this.aFloat31 = local16.aFloatArray106[6];
		this.aFloat33 = local16.aFloatArray106[7];
		this.aFloat34 = local16.aFloatArray106[8];
		this.aFloat32 = local16.aFloatArray106[9];
		this.aFloat25 = local16.aFloatArray106[10];
		this.aFloat24 = local16.aFloatArray106[11];
		this.aFloat38 = local16.aFloatArray106[12];
		this.aFloat35 = local16.aFloatArray106[13];
		this.aFloat36 = local16.aFloatArray106[14];
		this.aFloat37 = local16.aFloatArray106[15];
		for (@Pc(114) int local114 = 0; local114 < arg2 + arg2; local114++) {
			for (@Pc(121) int local121 = 0; local121 < arg2 + arg2; local121++) {
				if (arg3[local114][local121]) {
					@Pc(139) int local139 = arg0 - arg2 + local114;
					@Pc(145) int local145 = arg1 - arg2 + local121;
					if (local139 >= 0 && local139 < this.anInt339 * -1007974723 && local145 >= 0 && local145 < this.anInt337 * -207323189) {
						this.method3429(local139, local145, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!abo", name = "bk", descriptor = "(III)V", line = 609)
	void method3417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class12 local4 = this.aClass21_Sub1_6.method3165(Thread.currentThread());
		local4.aClass103_1.anInt2973 = 0;
		if (this.aClass28ArrayArray1 != null) {
			this.method3427(arg0, arg1, local4.aBoolean41, local4, local4.aClass103_1, local4.aFloatArray13, local4.aFloatArray14, local4.aFloatArray10, local4.aFloatArray15, local4.aFloatArray6, arg2);
		} else if (this.aClass22ArrayArray1 != null) {
			this.method3411(arg0, arg1, local4.aClass103_1, local4.aFloatArray13, local4.aFloatArray14, local4.aFloatArray10, local4.aFloatArray15, local4.aFloatArray6, arg2);
		} else if (this.aClass89ArrayArray1 != null) {
			this.method3412(arg0, arg1, local4.aBoolean41, local4, local4.aClass103_1, local4.aFloatArray13, local4.aFloatArray14, local4.aFloatArray10, local4.aFloatArray15, local4.aFloatArray6, arg2);
		}
	}

	@OriginalMember(owner = "client!abo", name = "bg", descriptor = "(III)V", line = 609)
	void method3418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class12 local4 = this.aClass21_Sub1_6.method3165(Thread.currentThread());
		local4.aClass103_1.anInt2973 = 0;
		if (this.aClass28ArrayArray1 != null) {
			this.method3427(arg0, arg1, local4.aBoolean41, local4, local4.aClass103_1, local4.aFloatArray13, local4.aFloatArray14, local4.aFloatArray10, local4.aFloatArray15, local4.aFloatArray6, arg2);
		} else if (this.aClass22ArrayArray1 != null) {
			this.method3411(arg0, arg1, local4.aClass103_1, local4.aFloatArray13, local4.aFloatArray14, local4.aFloatArray10, local4.aFloatArray15, local4.aFloatArray6, arg2);
		} else if (this.aClass89ArrayArray1 != null) {
			this.method3412(arg0, arg1, local4.aBoolean41, local4, local4.aClass103_1, local4.aFloatArray13, local4.aFloatArray14, local4.aFloatArray10, local4.aFloatArray15, local4.aFloatArray6, arg2);
		}
	}

	@OriginalMember(owner = "client!abo", name = "ac", descriptor = "(III)V", line = 609)
	void method3429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class12 local4 = this.aClass21_Sub1_6.method3165(Thread.currentThread());
		local4.aClass103_1.anInt2973 = 0;
		if (this.aClass28ArrayArray1 != null) {
			this.method3427(arg0, arg1, local4.aBoolean41, local4, local4.aClass103_1, local4.aFloatArray13, local4.aFloatArray14, local4.aFloatArray10, local4.aFloatArray15, local4.aFloatArray6, arg2);
		} else if (this.aClass22ArrayArray1 != null) {
			this.method3411(arg0, arg1, local4.aClass103_1, local4.aFloatArray13, local4.aFloatArray14, local4.aFloatArray10, local4.aFloatArray15, local4.aFloatArray6, arg2);
		} else if (this.aClass89ArrayArray1 != null) {
			this.method3412(arg0, arg1, local4.aBoolean41, local4, local4.aClass103_1, local4.aFloatArray13, local4.aFloatArray14, local4.aFloatArray10, local4.aFloatArray15, local4.aFloatArray6, arg2);
		}
	}

	@OriginalMember(owner = "client!abo", name = "bw", descriptor = "(IILclient!bw;[F[F[F[F[FI)V", line = 617)
	void method3411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8) {
		@Pc(6) Class22 local6 = this.aClass22ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(59) int local59;
		@Pc(282) float local282;
		@Pc(346) float local346;
		@Pc(410) float local410;
		@Pc(474) float local474;
		@Pc(319) float local319;
		@Pc(383) float local383;
		@Pc(447) float local447;
		@Pc(511) float local511;
		@Pc(272) float local272;
		@Pc(336) float local336;
		if (local6 == null) {
			@Pc(1349) Class74 local1349 = this.aClass74ArrayArray1[arg0][arg1];
			if (local1349 != null) {
				if (arg8 != 0) {
					if ((local1349.aByte85 & 0x4) == 0) {
						if ((arg8 & 0x2) != 0) {
							return;
						}
					} else if ((arg8 & 0x1) != 0) {
						return;
					}
				}
				@Pc(1370) int local1370;
				for (local1370 = 0; local1370 < local1349.aShort74; local1370++) {
					local45 = local1349.aShortArray50[local1370] + (arg0 << this.anInt336 * 1371852633);
					@Pc(1391) short local1391 = local1349.aShortArray51[local1370];
					local59 = local1349.aShortArray49[local1370] + (arg1 << this.anInt336 * 1371852633);
					local410 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local1391 + this.aFloat25 * (float) local59;
					local474 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local1391 + this.aFloat24 * (float) local59;
					if (local410 < -local474) {
						return;
					}
					local282 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local1391 + this.aFloat34 * (float) local59;
					local346 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local1391 + this.aFloat32 * (float) local59;
					arg3[local1370] = arg2.aFloat229 + arg2.aFloat230 * local282 / local474;
					arg4[local1370] = arg2.aFloat231 + arg2.aFloat232 * local346 / local474;
					arg5[local1370] = arg2.aFloat233 + arg2.aFloat234 * local410 / local474;
					arg6[local1370] = local474;
				}
				@Pc(1549) short local1549;
				@Pc(1554) short local1554;
				@Pc(1559) short local1559;
				@Pc(1638) int local1638;
				if (local1349.aShortArray54 == null) {
					for (local1370 = 0; local1370 < local1349.aShort73; local1370++) {
						local1549 = local1349.aShortArray53[local1370];
						local1554 = local1349.aShortArray56[local1370];
						local1559 = local1349.aShortArray55[local1370];
						local319 = arg3[local1549];
						local383 = arg3[local1554];
						local447 = arg3[local1559];
						local511 = arg4[local1549];
						local272 = arg4[local1554];
						local336 = arg4[local1559];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							local1638 = local1349.anIntArray258[local1370];
							if (local1638 != -1) {
								arg2.aBoolean538 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt2978 || local383 > (float) arg2.anInt2978 || local447 > (float) arg2.anInt2978;
								arg2.method21866(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1549], arg5[local1554], arg5[local1559], (float) Class121.method22825(local1638, local1349.aShortArray52[local1549]), (float) Class121.method22825(local1638, local1349.aShortArray52[local1554]), (float) Class121.method22825(local1638, local1349.aShortArray52[local1559]));
							}
						}
					}
				} else {
					for (local1370 = 0; local1370 < local1349.aShort73; local1370++) {
						local1549 = local1349.aShortArray53[local1370];
						local1554 = local1349.aShortArray56[local1370];
						local1559 = local1349.aShortArray55[local1370];
						local319 = arg3[local1549];
						local383 = arg3[local1554];
						local447 = arg3[local1559];
						local511 = arg4[local1549];
						local272 = arg4[local1554];
						local336 = arg4[local1559];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							arg2.aBoolean538 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt2978 || local383 > (float) arg2.anInt2978 || local447 > (float) arg2.anInt2978;
							local1638 = -1;
							if (local1349.aShortArray54[local1370] != -1) {
								local1638 = this.aClass21_Sub1_6.aClass134_7.method22906(local1349.aShortArray54[local1370] & 0xFFFF).anInt3351 * -1410868471;
							}
							if (local1638 == -1) {
								@Pc(1810) int local1810 = local1349.anIntArray258[local1370];
								if (local1810 != -1) {
									arg2.method21866(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1549], arg5[local1554], arg5[local1559], (float) Class121.method22825(local1810, local1349.aShortArray52[local1549]), (float) Class121.method22825(local1810, local1349.aShortArray52[local1554]), (float) Class121.method22825(local1810, local1349.aShortArray52[local1559]));
								}
							} else {
								arg2.method21872(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1549], arg5[local1554], arg5[local1559], arg6[local1549], arg6[local1554], arg6[local1559], (float) local1349.aShortArray50[local1549] / (float) (this.anInt338 * 76934957), (float) local1349.aShortArray50[local1554] / (float) (this.anInt338 * 76934957), (float) local1349.aShortArray50[local1559] / (float) (this.anInt338 * 76934957), (float) local1349.aShortArray49[local1549] / (float) (this.anInt338 * 76934957), (float) local1349.aShortArray49[local1554] / (float) (this.anInt338 * 76934957), (float) local1349.aShortArray49[local1559] / (float) (this.anInt338 * 76934957), Class515.anIntArray490[local1349.aShortArray52[local1549] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class515.anIntArray490[local1349.aShortArray52[local1554] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class515.anIntArray490[local1349.aShortArray52[local1559] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local1349.aShortArray54[local1370] & 0xFFFF, local1638);
							}
						}
					}
				}
			}
		} else if ((local6.aByte4 & 0x2) == 0) {
			if (arg8 != 0) {
				if ((local6.aByte4 & 0x4) == 0) {
					if ((arg8 & 0x2) != 0) {
						return;
					}
				} else if ((arg8 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt338 * 76934957;
			local45 = local38 + this.anInt338 * 76934957;
			@Pc(52) int local52 = arg1 * this.anInt338 * 76934957;
			local59 = local52 + this.anInt338 * 76934957;
			@Pc(299) float local299;
			@Pc(363) float local363;
			@Pc(427) float local427;
			@Pc(491) float local491;
			@Pc(100) float local100;
			@Pc(140) float local140;
			@Pc(180) float local180;
			@Pc(220) float local220;
			@Pc(117) float local117;
			@Pc(157) float local157;
			@Pc(197) float local197;
			@Pc(237) float local237;
			@Pc(71) int local71;
			@Pc(373) float local373;
			@Pc(309) float local309;
			@Pc(437) float local437;
			@Pc(501) float local501;
			@Pc(400) float local400;
			@Pc(464) float local464;
			if ((local6.aByte4 & 0x1) == 0) {
				local71 = this.anIntArrayArray7[arg0][arg1];
				@Pc(528) int local528 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(539) int local539 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(548) int local548 = this.anIntArrayArray7[arg0][arg1 + 1];
				local100 = this.aFloat36 + this.aFloat27 * (float) local38 + this.aFloat31 * (float) local71 + this.aFloat25 * (float) local52;
				local117 = this.aFloat37 + this.aFloat28 * (float) local38 + this.aFloat33 * (float) local71 + this.aFloat24 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local528 + this.aFloat25 * (float) local52;
				local157 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local528 + this.aFloat24 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local539 + this.aFloat25 * (float) local59;
				local197 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local539 + this.aFloat24 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat36 + this.aFloat27 * (float) local38 + this.aFloat31 * (float) local548 + this.aFloat25 * (float) local59;
				local237 = this.aFloat37 + this.aFloat28 * (float) local38 + this.aFloat33 * (float) local548 + this.aFloat24 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				local272 = this.aFloat38 + this.aFloat23 * (float) local38 + this.aFloat29 * (float) local71 + this.aFloat34 * (float) local52;
				local282 = arg2.aFloat229 + arg2.aFloat230 * local272 / local117;
				local299 = this.aFloat35 + this.aFloat26 * (float) local38 + this.aFloat30 * (float) local71 + this.aFloat32 * (float) local52;
				local309 = arg2.aFloat231 + arg2.aFloat232 * local299 / local117;
				local319 = arg2.aFloat233 + arg2.aFloat234 * local100 / local117;
				local336 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local528 + this.aFloat34 * (float) local52;
				local346 = arg2.aFloat229 + arg2.aFloat230 * local336 / local157;
				local363 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local528 + this.aFloat32 * (float) local52;
				local373 = arg2.aFloat231 + arg2.aFloat232 * local363 / local157;
				local383 = arg2.aFloat233 + arg2.aFloat234 * local140 / local157;
				local400 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local539 + this.aFloat34 * (float) local59;
				local410 = arg2.aFloat229 + arg2.aFloat230 * local400 / local197;
				local427 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local539 + this.aFloat32 * (float) local59;
				local437 = arg2.aFloat231 + arg2.aFloat232 * local427 / local197;
				local447 = arg2.aFloat233 + arg2.aFloat234 * local180 / local197;
				local464 = this.aFloat38 + this.aFloat23 * (float) local38 + this.aFloat29 * (float) local548 + this.aFloat34 * (float) local59;
				local474 = arg2.aFloat229 + arg2.aFloat230 * local464 / local237;
				local491 = this.aFloat35 + this.aFloat26 * (float) local38 + this.aFloat30 * (float) local548 + this.aFloat32 * (float) local59;
				local501 = arg2.aFloat231 + arg2.aFloat232 * local491 / local237;
				local511 = arg2.aFloat233 + arg2.aFloat234 * local220 / local237;
			} else {
				local71 = this.anIntArrayArray7[arg0][arg1];
				@Pc(77) float local77 = this.aFloat31 * (float) local71;
				@Pc(83) float local83 = this.aFloat33 * (float) local71;
				local100 = this.aFloat36 + this.aFloat27 * (float) local38 + local77 + this.aFloat25 * (float) local52;
				local117 = this.aFloat37 + this.aFloat28 * (float) local38 + local83 + this.aFloat24 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat36 + this.aFloat27 * (float) local45 + local77 + this.aFloat25 * (float) local52;
				local157 = this.aFloat37 + this.aFloat28 * (float) local45 + local83 + this.aFloat24 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat36 + this.aFloat27 * (float) local45 + local77 + this.aFloat25 * (float) local59;
				local197 = this.aFloat37 + this.aFloat28 * (float) local45 + local83 + this.aFloat24 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat36 + this.aFloat27 * (float) local38 + local77 + this.aFloat25 * (float) local59;
				local237 = this.aFloat37 + this.aFloat28 * (float) local38 + local83 + this.aFloat24 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				@Pc(249) float local249 = this.aFloat29 * (float) local71;
				@Pc(255) float local255 = this.aFloat30 * (float) local71;
				local272 = this.aFloat38 + this.aFloat23 * (float) local38 + local249 + this.aFloat34 * (float) local52;
				local282 = arg2.aFloat229 + arg2.aFloat230 * local272 / local117;
				local299 = this.aFloat35 + this.aFloat26 * (float) local38 + local255 + this.aFloat32 * (float) local52;
				local309 = arg2.aFloat231 + arg2.aFloat232 * local299 / local117;
				local319 = arg2.aFloat233 + arg2.aFloat234 * local100 / local117;
				local336 = this.aFloat38 + this.aFloat23 * (float) local45 + local249 + this.aFloat34 * (float) local52;
				local346 = arg2.aFloat229 + arg2.aFloat230 * local336 / local157;
				local363 = this.aFloat35 + this.aFloat26 * (float) local45 + local255 + this.aFloat32 * (float) local52;
				local373 = arg2.aFloat231 + arg2.aFloat232 * local363 / local157;
				local383 = arg2.aFloat233 + arg2.aFloat234 * local140 / local157;
				local400 = this.aFloat38 + this.aFloat23 * (float) local45 + local249 + this.aFloat34 * (float) local59;
				local410 = arg2.aFloat229 + arg2.aFloat230 * local400 / local197;
				local427 = this.aFloat35 + this.aFloat26 * (float) local45 + local255 + this.aFloat32 * (float) local59;
				local437 = arg2.aFloat231 + arg2.aFloat232 * local427 / local197;
				local447 = arg2.aFloat233 + arg2.aFloat234 * local180 / local197;
				local464 = this.aFloat38 + this.aFloat23 * (float) local38 + local249 + this.aFloat34 * (float) local59;
				local474 = arg2.aFloat229 + arg2.aFloat230 * local464 / local237;
				local491 = this.aFloat35 + this.aFloat26 * (float) local38 + local255 + this.aFloat32 * (float) local59;
				local501 = arg2.aFloat231 + arg2.aFloat232 * local491 / local237;
				local511 = arg2.aFloat233 + arg2.aFloat234 * local220 / local237;
			}
			local71 = -1;
			if (local6.aShort25 != -1) {
				local71 = this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShort25 & 0xFFFF).anInt3351 * -1410868471;
			}
			if ((local410 - local474) * (local373 - local501) - (local437 - local501) * (local346 - local474) > 0.0F) {
				arg2.aBoolean538 = local410 < 0.0F || local474 < 0.0F || local346 < 0.0F || local410 > (float) arg2.anInt2978 || local474 > (float) arg2.anInt2978 || local346 > (float) arg2.anInt2978;
				if (local71 >= 0) {
					arg2.method21872(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, local197, local237, local157, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Class515.anIntArray490[local6.aShort21 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class515.anIntArray490[local6.aShort24 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class515.anIntArray490[local6.aShort23 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort25 & 0xFFFF, local71);
				} else {
					arg2.method21866(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, (float) (local6.aShort21 & 0xFFFF), (float) (local6.aShort24 & 0xFFFF), (float) (local6.aShort23 & 0xFFFF));
				}
			}
			if ((local282 - local346) * (local501 - local373) - (local309 - local373) * (local474 - local346) > 0.0F) {
				arg2.aBoolean538 = local282 < 0.0F || local346 < 0.0F || local474 < 0.0F || local282 > (float) arg2.anInt2978 || local346 > (float) arg2.anInt2978 || local474 > (float) arg2.anInt2978;
				if (local71 >= 0) {
					arg2.method21872(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, local117, local157, local237, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Class515.anIntArray490[local6.aShort22 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class515.anIntArray490[local6.aShort23 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class515.anIntArray490[local6.aShort24 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort25 & 0xFFFF, local71);
				} else {
					arg2.method21866(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, (float) (local6.aShort22 & 0xFFFF), (float) (local6.aShort23 & 0xFFFF), (float) (local6.aShort24 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!abo", name = "br", descriptor = "(IILclient!bw;[F[F[F[F[FI)V", line = 617)
	void method3419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8) {
		@Pc(6) Class22 local6 = this.aClass22ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(59) int local59;
		@Pc(282) float local282;
		@Pc(346) float local346;
		@Pc(410) float local410;
		@Pc(474) float local474;
		@Pc(319) float local319;
		@Pc(383) float local383;
		@Pc(447) float local447;
		@Pc(511) float local511;
		@Pc(272) float local272;
		@Pc(336) float local336;
		if (local6 == null) {
			@Pc(1349) Class74 local1349 = this.aClass74ArrayArray1[arg0][arg1];
			if (local1349 != null) {
				if (arg8 != 0) {
					if ((local1349.aByte85 & 0x4) == 0) {
						if ((arg8 & 0x2) != 0) {
							return;
						}
					} else if ((arg8 & 0x1) != 0) {
						return;
					}
				}
				@Pc(1370) int local1370;
				for (local1370 = 0; local1370 < local1349.aShort74; local1370++) {
					local45 = local1349.aShortArray50[local1370] + (arg0 << this.anInt336 * 1371852633);
					@Pc(1391) short local1391 = local1349.aShortArray51[local1370];
					local59 = local1349.aShortArray49[local1370] + (arg1 << this.anInt336 * 1371852633);
					local410 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local1391 + this.aFloat25 * (float) local59;
					local474 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local1391 + this.aFloat24 * (float) local59;
					if (local410 < -local474) {
						return;
					}
					local282 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local1391 + this.aFloat34 * (float) local59;
					local346 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local1391 + this.aFloat32 * (float) local59;
					arg3[local1370] = arg2.aFloat229 + arg2.aFloat230 * local282 / local474;
					arg4[local1370] = arg2.aFloat231 + arg2.aFloat232 * local346 / local474;
					arg5[local1370] = arg2.aFloat233 + arg2.aFloat234 * local410 / local474;
					arg6[local1370] = local474;
				}
				@Pc(1549) short local1549;
				@Pc(1554) short local1554;
				@Pc(1559) short local1559;
				@Pc(1638) int local1638;
				if (local1349.aShortArray54 == null) {
					for (local1370 = 0; local1370 < local1349.aShort73; local1370++) {
						local1549 = local1349.aShortArray53[local1370];
						local1554 = local1349.aShortArray56[local1370];
						local1559 = local1349.aShortArray55[local1370];
						local319 = arg3[local1549];
						local383 = arg3[local1554];
						local447 = arg3[local1559];
						local511 = arg4[local1549];
						local272 = arg4[local1554];
						local336 = arg4[local1559];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							local1638 = local1349.anIntArray258[local1370];
							if (local1638 != -1) {
								arg2.aBoolean538 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt2978 || local383 > (float) arg2.anInt2978 || local447 > (float) arg2.anInt2978;
								arg2.method21866(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1549], arg5[local1554], arg5[local1559], (float) Class121.method22825(local1638, local1349.aShortArray52[local1549]), (float) Class121.method22825(local1638, local1349.aShortArray52[local1554]), (float) Class121.method22825(local1638, local1349.aShortArray52[local1559]));
							}
						}
					}
				} else {
					for (local1370 = 0; local1370 < local1349.aShort73; local1370++) {
						local1549 = local1349.aShortArray53[local1370];
						local1554 = local1349.aShortArray56[local1370];
						local1559 = local1349.aShortArray55[local1370];
						local319 = arg3[local1549];
						local383 = arg3[local1554];
						local447 = arg3[local1559];
						local511 = arg4[local1549];
						local272 = arg4[local1554];
						local336 = arg4[local1559];
						if ((local319 - local383) * (local336 - local272) - (local511 - local272) * (local447 - local383) > 0.0F) {
							arg2.aBoolean538 = local319 < 0.0F || local383 < 0.0F || local447 < 0.0F || local319 > (float) arg2.anInt2978 || local383 > (float) arg2.anInt2978 || local447 > (float) arg2.anInt2978;
							local1638 = -1;
							if (local1349.aShortArray54[local1370] != -1) {
								local1638 = this.aClass21_Sub1_6.aClass134_7.method22906(local1349.aShortArray54[local1370] & 0xFFFF).anInt3351 * -1410868471;
							}
							if (local1638 == -1) {
								@Pc(1810) int local1810 = local1349.anIntArray258[local1370];
								if (local1810 != -1) {
									arg2.method21866(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1549], arg5[local1554], arg5[local1559], (float) Class121.method22825(local1810, local1349.aShortArray52[local1549]), (float) Class121.method22825(local1810, local1349.aShortArray52[local1554]), (float) Class121.method22825(local1810, local1349.aShortArray52[local1559]));
								}
							} else {
								arg2.method21872(true, true, false, local511, local272, local336, local319, local383, local447, arg5[local1549], arg5[local1554], arg5[local1559], arg6[local1549], arg6[local1554], arg6[local1559], (float) local1349.aShortArray50[local1549] / (float) (this.anInt338 * 76934957), (float) local1349.aShortArray50[local1554] / (float) (this.anInt338 * 76934957), (float) local1349.aShortArray50[local1559] / (float) (this.anInt338 * 76934957), (float) local1349.aShortArray49[local1549] / (float) (this.anInt338 * 76934957), (float) local1349.aShortArray49[local1554] / (float) (this.anInt338 * 76934957), (float) local1349.aShortArray49[local1559] / (float) (this.anInt338 * 76934957), Class515.anIntArray490[local1349.aShortArray52[local1549] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class515.anIntArray490[local1349.aShortArray52[local1554] & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class515.anIntArray490[local1349.aShortArray52[local1559] & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local1349.aShortArray54[local1370] & 0xFFFF, local1638);
							}
						}
					}
				}
			}
		} else if ((local6.aByte4 & 0x2) == 0) {
			if (arg8 != 0) {
				if ((local6.aByte4 & 0x4) == 0) {
					if ((arg8 & 0x2) != 0) {
						return;
					}
				} else if ((arg8 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt338 * 76934957;
			local45 = local38 + this.anInt338 * 76934957;
			@Pc(52) int local52 = arg1 * this.anInt338 * 76934957;
			local59 = local52 + this.anInt338 * 76934957;
			@Pc(299) float local299;
			@Pc(363) float local363;
			@Pc(427) float local427;
			@Pc(491) float local491;
			@Pc(100) float local100;
			@Pc(140) float local140;
			@Pc(180) float local180;
			@Pc(220) float local220;
			@Pc(117) float local117;
			@Pc(157) float local157;
			@Pc(197) float local197;
			@Pc(237) float local237;
			@Pc(71) int local71;
			@Pc(373) float local373;
			@Pc(309) float local309;
			@Pc(437) float local437;
			@Pc(501) float local501;
			@Pc(400) float local400;
			@Pc(464) float local464;
			if ((local6.aByte4 & 0x1) == 0) {
				local71 = this.anIntArrayArray7[arg0][arg1];
				@Pc(528) int local528 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(539) int local539 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(548) int local548 = this.anIntArrayArray7[arg0][arg1 + 1];
				local100 = this.aFloat36 + this.aFloat27 * (float) local38 + this.aFloat31 * (float) local71 + this.aFloat25 * (float) local52;
				local117 = this.aFloat37 + this.aFloat28 * (float) local38 + this.aFloat33 * (float) local71 + this.aFloat24 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local528 + this.aFloat25 * (float) local52;
				local157 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local528 + this.aFloat24 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local539 + this.aFloat25 * (float) local59;
				local197 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local539 + this.aFloat24 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat36 + this.aFloat27 * (float) local38 + this.aFloat31 * (float) local548 + this.aFloat25 * (float) local59;
				local237 = this.aFloat37 + this.aFloat28 * (float) local38 + this.aFloat33 * (float) local548 + this.aFloat24 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				local272 = this.aFloat38 + this.aFloat23 * (float) local38 + this.aFloat29 * (float) local71 + this.aFloat34 * (float) local52;
				local282 = arg2.aFloat229 + arg2.aFloat230 * local272 / local117;
				local299 = this.aFloat35 + this.aFloat26 * (float) local38 + this.aFloat30 * (float) local71 + this.aFloat32 * (float) local52;
				local309 = arg2.aFloat231 + arg2.aFloat232 * local299 / local117;
				local319 = arg2.aFloat233 + arg2.aFloat234 * local100 / local117;
				local336 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local528 + this.aFloat34 * (float) local52;
				local346 = arg2.aFloat229 + arg2.aFloat230 * local336 / local157;
				local363 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local528 + this.aFloat32 * (float) local52;
				local373 = arg2.aFloat231 + arg2.aFloat232 * local363 / local157;
				local383 = arg2.aFloat233 + arg2.aFloat234 * local140 / local157;
				local400 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local539 + this.aFloat34 * (float) local59;
				local410 = arg2.aFloat229 + arg2.aFloat230 * local400 / local197;
				local427 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local539 + this.aFloat32 * (float) local59;
				local437 = arg2.aFloat231 + arg2.aFloat232 * local427 / local197;
				local447 = arg2.aFloat233 + arg2.aFloat234 * local180 / local197;
				local464 = this.aFloat38 + this.aFloat23 * (float) local38 + this.aFloat29 * (float) local548 + this.aFloat34 * (float) local59;
				local474 = arg2.aFloat229 + arg2.aFloat230 * local464 / local237;
				local491 = this.aFloat35 + this.aFloat26 * (float) local38 + this.aFloat30 * (float) local548 + this.aFloat32 * (float) local59;
				local501 = arg2.aFloat231 + arg2.aFloat232 * local491 / local237;
				local511 = arg2.aFloat233 + arg2.aFloat234 * local220 / local237;
			} else {
				local71 = this.anIntArrayArray7[arg0][arg1];
				@Pc(77) float local77 = this.aFloat31 * (float) local71;
				@Pc(83) float local83 = this.aFloat33 * (float) local71;
				local100 = this.aFloat36 + this.aFloat27 * (float) local38 + local77 + this.aFloat25 * (float) local52;
				local117 = this.aFloat37 + this.aFloat28 * (float) local38 + local83 + this.aFloat24 * (float) local52;
				if (local100 < -local117) {
					return;
				}
				local140 = this.aFloat36 + this.aFloat27 * (float) local45 + local77 + this.aFloat25 * (float) local52;
				local157 = this.aFloat37 + this.aFloat28 * (float) local45 + local83 + this.aFloat24 * (float) local52;
				if (local140 < -local157) {
					return;
				}
				local180 = this.aFloat36 + this.aFloat27 * (float) local45 + local77 + this.aFloat25 * (float) local59;
				local197 = this.aFloat37 + this.aFloat28 * (float) local45 + local83 + this.aFloat24 * (float) local59;
				if (local180 < -local197) {
					return;
				}
				local220 = this.aFloat36 + this.aFloat27 * (float) local38 + local77 + this.aFloat25 * (float) local59;
				local237 = this.aFloat37 + this.aFloat28 * (float) local38 + local83 + this.aFloat24 * (float) local59;
				if (local220 < -local237) {
					return;
				}
				@Pc(249) float local249 = this.aFloat29 * (float) local71;
				@Pc(255) float local255 = this.aFloat30 * (float) local71;
				local272 = this.aFloat38 + this.aFloat23 * (float) local38 + local249 + this.aFloat34 * (float) local52;
				local282 = arg2.aFloat229 + arg2.aFloat230 * local272 / local117;
				local299 = this.aFloat35 + this.aFloat26 * (float) local38 + local255 + this.aFloat32 * (float) local52;
				local309 = arg2.aFloat231 + arg2.aFloat232 * local299 / local117;
				local319 = arg2.aFloat233 + arg2.aFloat234 * local100 / local117;
				local336 = this.aFloat38 + this.aFloat23 * (float) local45 + local249 + this.aFloat34 * (float) local52;
				local346 = arg2.aFloat229 + arg2.aFloat230 * local336 / local157;
				local363 = this.aFloat35 + this.aFloat26 * (float) local45 + local255 + this.aFloat32 * (float) local52;
				local373 = arg2.aFloat231 + arg2.aFloat232 * local363 / local157;
				local383 = arg2.aFloat233 + arg2.aFloat234 * local140 / local157;
				local400 = this.aFloat38 + this.aFloat23 * (float) local45 + local249 + this.aFloat34 * (float) local59;
				local410 = arg2.aFloat229 + arg2.aFloat230 * local400 / local197;
				local427 = this.aFloat35 + this.aFloat26 * (float) local45 + local255 + this.aFloat32 * (float) local59;
				local437 = arg2.aFloat231 + arg2.aFloat232 * local427 / local197;
				local447 = arg2.aFloat233 + arg2.aFloat234 * local180 / local197;
				local464 = this.aFloat38 + this.aFloat23 * (float) local38 + local249 + this.aFloat34 * (float) local59;
				local474 = arg2.aFloat229 + arg2.aFloat230 * local464 / local237;
				local491 = this.aFloat35 + this.aFloat26 * (float) local38 + local255 + this.aFloat32 * (float) local59;
				local501 = arg2.aFloat231 + arg2.aFloat232 * local491 / local237;
				local511 = arg2.aFloat233 + arg2.aFloat234 * local220 / local237;
			}
			local71 = -1;
			if (local6.aShort25 != -1) {
				local71 = this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShort25 & 0xFFFF).anInt3351 * -1410868471;
			}
			if ((local410 - local474) * (local373 - local501) - (local437 - local501) * (local346 - local474) > 0.0F) {
				arg2.aBoolean538 = local410 < 0.0F || local474 < 0.0F || local346 < 0.0F || local410 > (float) arg2.anInt2978 || local474 > (float) arg2.anInt2978 || local346 > (float) arg2.anInt2978;
				if (local71 >= 0) {
					arg2.method21872(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, local197, local237, local157, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, Class515.anIntArray490[local6.aShort21 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class515.anIntArray490[local6.aShort24 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class515.anIntArray490[local6.aShort23 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort25 & 0xFFFF, local71);
				} else {
					arg2.method21866(true, true, false, local437, local501, local373, local410, local474, local346, local447, local511, local383, (float) (local6.aShort21 & 0xFFFF), (float) (local6.aShort24 & 0xFFFF), (float) (local6.aShort23 & 0xFFFF));
				}
			}
			if ((local282 - local346) * (local501 - local373) - (local309 - local373) * (local474 - local346) > 0.0F) {
				arg2.aBoolean538 = local282 < 0.0F || local346 < 0.0F || local474 < 0.0F || local282 > (float) arg2.anInt2978 || local346 > (float) arg2.anInt2978 || local474 > (float) arg2.anInt2978;
				if (local71 >= 0) {
					arg2.method21872(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, local117, local157, local237, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, Class515.anIntArray490[local6.aShort22 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class515.anIntArray490[local6.aShort23 & 0xFFFF] & 0xFFFFFF | 0xFF000000, Class515.anIntArray490[local6.aShort24 & 0xFFFF] & 0xFFFFFF | 0xFF000000, 0, 0.0F, 0.0F, 0.0F, local6.aShort25 & 0xFFFF, local71);
				} else {
					arg2.method21866(true, true, false, local309, local373, local501, local282, local346, local474, local319, local383, local511, (float) (local6.aShort22 & 0xFFFF), (float) (local6.aShort23 & 0xFFFF), (float) (local6.aShort24 & 0xFFFF));
				}
			}
		}
	}

	@OriginalMember(owner = "client!abo", name = "by", descriptor = "(IIZLclient!ab;Lclient!bw;[F[F[F[F[FI)V", line = 835)
	void method3420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) Class103 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class28 local6 = this.aClass28ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(415) float local415;
		@Pc(469) float local469;
		@Pc(523) float local523;
		@Pc(577) float local577;
		@Pc(442) float local442;
		@Pc(550) float local550;
		@Pc(273) float local273;
		@Pc(283) float local283;
		@Pc(293) float local293;
		@Pc(405) float local405;
		@Pc(459) float local459;
		@Pc(513) float local513;
		@Pc(567) float local567;
		if (local6 == null) {
			@Pc(2012) Class83 local2012 = this.aClass83ArrayArray1[arg0][arg1];
			if (local2012 != null) {
				if (arg10 != 0) {
					if ((local2012.aByte105 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2033) int local2033;
				@Pc(2163) int local2163;
				for (local2033 = 0; local2033 < local2012.aShort142; local2033++) {
					local45 = local2012.aShortArray60[local2033] + (arg0 << this.anInt336 * 1371852633);
					local52 = local2012.aShortArray62[local2033];
					local59 = local2012.aShortArray65[local2033] + (arg1 << this.anInt336 * 1371852633);
					local523 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local52 + this.aFloat25 * (float) local59;
					local577 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local52 + this.aFloat24 * (float) local59;
					if (local523 < -local577) {
						return;
					}
					local442 = arg4.aFloat233 + arg4.aFloat234 * local523 / local577;
					arg9[local2033] = 0.0F;
					if (arg2) {
						local550 = local523 - arg3.aFloat5;
						if (local550 > 0.0F) {
							local550 /= arg3.aFloat7;
							if (local550 > 1.0F) {
								local550 = 1.0F;
							}
							arg9[local2033] = local550;
							local2163 = (int) ((float) local2012.aShortArray63[local2033] * local550);
							if (local2163 > 0) {
								local52 -= local2163;
							}
						}
					} else if (arg3.aBoolean43) {
						local550 = local523 - arg3.aFloat5;
						if (local550 > 0.0F) {
							arg9[local2033] = local550 / arg3.aFloat7;
							if (arg9[local2033] > 1.0F) {
								arg9[local2033] = 1.0F;
							}
						}
					}
					local415 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local52 + this.aFloat34 * (float) local59;
					local469 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local52 + this.aFloat32 * (float) local59;
					arg5[local2033] = arg4.aFloat229 + arg4.aFloat230 * local415 / local577;
					arg6[local2033] = arg4.aFloat231 + arg4.aFloat232 * local469 / local577;
					arg7[local2033] = local442;
					arg8[local2033] = local577;
				}
				@Pc(2296) int local2296;
				@Pc(2288) int local2288;
				if (local2012.aShortArray64 == null) {
					for (local2033 = 0; local2033 < local2012.aShort143; local2033++) {
						local2288 = local2033 * 3;
						local2163 = local2288 + 1;
						local2296 = local2163 + 1;
						local273 = arg5[local2288];
						local283 = arg5[local2163];
						local293 = arg5[local2296];
						local405 = arg6[local2288];
						local459 = arg6[local2163];
						local513 = arg6[local2296];
						local567 = arg9[local2288] + arg9[local2163] + arg9[local2296];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean538 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt2978 || local283 > (float) arg4.anInt2978 || local293 > (float) arg4.anInt2978;
							if (local567 >= 3.0F) {
								arg4.method21898(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], arg3.anInt132 * 128222029);
							} else if (local567 > 0.0F) {
								if ((local2012.anIntArray277[local2288] & 0xFFFFFF) != 0) {
									arg4.method21868(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], Class575.method33150(local2012.anIntArray277[local2288], arg3.anInt132 * 128222029, arg9[local2288] * 255.0F), Class575.method33150(local2012.anIntArray277[local2163], arg3.anInt132 * 128222029, arg9[local2163] * 255.0F), Class575.method33150(local2012.anIntArray277[local2296], arg3.anInt132 * 128222029, arg9[local2296] * 255.0F));
								}
							} else if ((local2012.anIntArray277[local2288] & 0xFFFFFF) != 0) {
								arg4.method21868(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], local2012.anIntArray277[local2288], local2012.anIntArray277[local2163], local2012.anIntArray277[local2296]);
							}
						}
					}
				} else {
					for (local2033 = 0; local2033 < local2012.aShort143; local2033++) {
						local2288 = local2033 * 3;
						local2163 = local2288 + 1;
						local2296 = local2163 + 1;
						local273 = arg5[local2288];
						local283 = arg5[local2163];
						local293 = arg5[local2296];
						local405 = arg6[local2288];
						local459 = arg6[local2163];
						local513 = arg6[local2296];
						local567 = arg9[local2288] + arg9[local2163] + arg9[local2296];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean538 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt2978 || local283 > (float) arg4.anInt2978 || local293 > (float) arg4.anInt2978;
							@Pc(2387) Class133 local2387 = null;
							@Pc(2389) int local2389 = -1;
							if (local2012.aShortArray64[local2033] != -1) {
								local2387 = this.aClass21_Sub1_6.aClass134_7.method22906(local2012.aShortArray64[local2033] & 0xFFFF);
								local2389 = local2387.anInt3351 * -1410868471;
							}
							if (local567 < 3.0F) {
								@Pc(2425) int local2425;
								if (local567 > 0.0F) {
									if (local2389 != -1) {
										local2425 = -16777216;
										if (local2389 != -1 && this.method3410(local2387.aByte118)) {
											local2425 = -1694498816;
										}
										arg4.method21872(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], arg8[local2288], arg8[local2163], arg8[local2296], (float) local2012.aShortArray60[local2288] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray60[local2163] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray60[local2296] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2288] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2163] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2296] / (float) (this.anInt338 * 76934957), local2425 | local2012.anIntArray277[local2288] & 0xFFFFFF, local2425 | local2012.anIntArray277[local2163] & 0xFFFFFF, local2425 | local2012.anIntArray277[local2296] & 0xFFFFFF, arg3.anInt132 * 128222029, arg9[local2288] * 255.0F, arg9[local2163] * 255.0F, arg9[local2296] * 255.0F, local2012.aShortArray64[local2033] & 0xFFFF, local2389);
									} else if ((local2012.anIntArray277[local2288] & 0xFFFFFF) != 0) {
										if (local2389 != -1 && this.method3410(local2387.aByte118)) {
											arg4.anInt2973 = -1694498816;
										}
										arg4.method21868(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], Class594.method33426(local2012.anIntArray277[local2288], (int) (arg9[local2288] * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local2012.anIntArray277[local2163], (int) (arg9[local2163] * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local2012.anIntArray277[local2296], (int) (arg9[local2296] * 255.0F) << 24 | arg3.anInt132 * 128222029));
										arg4.anInt2973 = 0;
									}
								} else if (local2389 != -1) {
									local2425 = -16777216;
									if (local2389 != -1 && this.method3410(local2387.aByte118)) {
										local2425 = -1694498816;
									}
									arg4.method21872(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], arg8[local2288], arg8[local2163], arg8[local2296], (float) local2012.aShortArray60[local2288] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray60[local2163] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray60[local2296] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2288] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2163] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2296] / (float) (this.anInt338 * 76934957), local2425 | local2012.anIntArray277[local2288] & 0xFFFFFF, local2425 | local2012.anIntArray277[local2163] & 0xFFFFFF, local2425 | local2012.anIntArray277[local2296] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local2012.aShortArray64[local2033] & 0xFFFF, local2389);
								} else if ((local2012.anIntArray277[local2288] & 0xFFFFFF) != 0) {
									if (local2389 != -1 && this.method3410(local2387.aByte118)) {
										arg4.anInt2973 = -1694498816;
									}
									arg4.method21868(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], local2012.anIntArray277[local2288], local2012.anIntArray277[local2163], local2012.anIntArray277[local2296]);
									arg4.anInt2973 = 0;
								}
							} else {
								arg4.method21898(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], arg3.anInt132 * 128222029);
							}
						}
					}
				}
			}
		} else if ((local6.aByte18 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((local6.aByte18 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt338 * 76934957;
			local45 = local38 + this.anInt338 * 76934957;
			local52 = arg1 * this.anInt338 * 76934957;
			local59 = local52 + this.anInt338 * 76934957;
			@Pc(61) float local61 = 0.0F;
			@Pc(63) float local63 = 0.0F;
			@Pc(65) float local65 = 0.0F;
			@Pc(67) float local67 = 0.0F;
			@Pc(594) float local594;
			@Pc(110) float local110;
			@Pc(150) float local150;
			@Pc(190) float local190;
			@Pc(230) float local230;
			@Pc(127) float local127;
			@Pc(167) float local167;
			@Pc(207) float local207;
			@Pc(247) float local247;
			@Pc(301) float local301;
			@Pc(81) int local81;
			@Pc(621) int local621;
			@Pc(904) int local904;
			@Pc(496) float local496;
			@Pc(604) float local604;
			@Pc(263) float local263;
			@Pc(432) float local432;
			@Pc(486) float local486;
			@Pc(540) float local540;
			@Pc(382) float local382;
			if ((local6.aByte18 & 0x1) == 0 || arg2) {
				local81 = this.anIntArrayArray7[arg0][arg1];
				local621 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(632) int local632 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(641) int local641 = this.anIntArrayArray7[arg0][arg1 + 1];
				local110 = this.aFloat36 + this.aFloat27 * (float) local38 + this.aFloat31 * (float) local81 + this.aFloat25 * (float) local52;
				local127 = this.aFloat37 + this.aFloat28 * (float) local38 + this.aFloat33 * (float) local81 + this.aFloat24 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local621 + this.aFloat25 * (float) local52;
				local167 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local621 + this.aFloat24 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local632 + this.aFloat25 * (float) local59;
				local207 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local632 + this.aFloat24 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat36 + this.aFloat27 * (float) local38 + this.aFloat31 * (float) local641 + this.aFloat25 * (float) local59;
				local247 = this.aFloat37 + this.aFloat28 * (float) local38 + this.aFloat33 * (float) local641 + this.aFloat24 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat233 + arg4.aFloat234 * local110 / local127;
				local273 = arg4.aFloat233 + arg4.aFloat234 * local150 / local167;
				local283 = arg4.aFloat233 + arg4.aFloat234 * local190 / local207;
				local293 = arg4.aFloat233 + arg4.aFloat234 * local230 / local247;
				if (arg2) {
					local301 = local110 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat7;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local61 = local301;
						local904 = (int) ((float) local6.aShort34 * local301);
						if (local904 > 0) {
							local81 -= local904;
						}
					}
					local301 = local150 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat7;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local63 = local301;
						local904 = (int) ((float) local6.aShort35 * local301);
						if (local904 > 0) {
							local621 -= local904;
						}
					}
					local301 = local190 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat7;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local65 = local301;
						local904 = (int) ((float) local6.aShort36 * local301);
						if (local904 > 0) {
							local632 -= local904;
						}
					}
					local301 = local230 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat7;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local67 = local301;
						local904 = (int) ((float) local6.aShort37 * local301);
						if (local904 > 0) {
							local641 -= local904;
						}
					}
				} else if (arg3.aBoolean43) {
					local301 = local110 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat7;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat7;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat7;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat7;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local405 = this.aFloat38 + this.aFloat23 * (float) local38 + this.aFloat29 * (float) local81 + this.aFloat34 * (float) local52;
				local415 = arg4.aFloat229 + arg4.aFloat230 * local405 / local127;
				local432 = this.aFloat35 + this.aFloat26 * (float) local38 + this.aFloat30 * (float) local81 + this.aFloat32 * (float) local52;
				local442 = arg4.aFloat231 + arg4.aFloat232 * local432 / local127;
				local459 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local621 + this.aFloat34 * (float) local52;
				local469 = arg4.aFloat229 + arg4.aFloat230 * local459 / local167;
				local486 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local621 + this.aFloat32 * (float) local52;
				local496 = arg4.aFloat231 + arg4.aFloat232 * local486 / local167;
				local513 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local632 + this.aFloat34 * (float) local59;
				local523 = arg4.aFloat229 + arg4.aFloat230 * local513 / local207;
				local540 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local632 + this.aFloat32 * (float) local59;
				local550 = arg4.aFloat231 + arg4.aFloat232 * local540 / local207;
				local567 = this.aFloat38 + this.aFloat23 * (float) local38 + this.aFloat29 * (float) local641 + this.aFloat34 * (float) local59;
				local577 = arg4.aFloat229 + arg4.aFloat230 * local567 / local247;
				local594 = this.aFloat35 + this.aFloat26 * (float) local38 + this.aFloat30 * (float) local641 + this.aFloat32 * (float) local59;
				local604 = arg4.aFloat231 + arg4.aFloat232 * local594 / local247;
			} else {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(87) float local87 = this.aFloat31 * (float) local81;
				@Pc(93) float local93 = this.aFloat33 * (float) local81;
				local110 = this.aFloat36 + this.aFloat27 * (float) local38 + local87 + this.aFloat25 * (float) local52;
				local127 = this.aFloat37 + this.aFloat28 * (float) local38 + local93 + this.aFloat24 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat36 + this.aFloat27 * (float) local45 + local87 + this.aFloat25 * (float) local52;
				local167 = this.aFloat37 + this.aFloat28 * (float) local45 + local93 + this.aFloat24 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat36 + this.aFloat27 * (float) local45 + local87 + this.aFloat25 * (float) local59;
				local207 = this.aFloat37 + this.aFloat28 * (float) local45 + local93 + this.aFloat24 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat36 + this.aFloat27 * (float) local38 + local87 + this.aFloat25 * (float) local59;
				local247 = this.aFloat37 + this.aFloat28 * (float) local38 + local93 + this.aFloat24 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat233 + arg4.aFloat234 * local110 / local127;
				local273 = arg4.aFloat233 + arg4.aFloat234 * local150 / local167;
				local283 = arg4.aFloat233 + arg4.aFloat234 * local190 / local207;
				local293 = arg4.aFloat233 + arg4.aFloat234 * local230 / local247;
				if (arg3.aBoolean43) {
					local301 = local110 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat7;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat7;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat7;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat7;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local382 = this.aFloat29 * (float) local81;
				@Pc(388) float local388 = this.aFloat30 * (float) local81;
				local405 = this.aFloat38 + this.aFloat23 * (float) local38 + local382 + this.aFloat34 * (float) local52;
				local415 = arg4.aFloat229 + arg4.aFloat230 * local405 / local127;
				local432 = this.aFloat35 + this.aFloat26 * (float) local38 + local388 + this.aFloat32 * (float) local52;
				local442 = arg4.aFloat231 + arg4.aFloat232 * local432 / local127;
				local459 = this.aFloat38 + this.aFloat23 * (float) local45 + local382 + this.aFloat34 * (float) local52;
				local469 = arg4.aFloat229 + arg4.aFloat230 * local459 / local167;
				local486 = this.aFloat35 + this.aFloat26 * (float) local45 + local388 + this.aFloat32 * (float) local52;
				local496 = arg4.aFloat231 + arg4.aFloat232 * local486 / local167;
				local513 = this.aFloat38 + this.aFloat23 * (float) local45 + local382 + this.aFloat34 * (float) local59;
				local523 = arg4.aFloat229 + arg4.aFloat230 * local513 / local207;
				local540 = this.aFloat35 + this.aFloat26 * (float) local45 + local388 + this.aFloat32 * (float) local59;
				local550 = arg4.aFloat231 + arg4.aFloat232 * local540 / local207;
				local567 = this.aFloat38 + this.aFloat23 * (float) local38 + local382 + this.aFloat34 * (float) local59;
				local577 = arg4.aFloat229 + arg4.aFloat230 * local567 / local247;
				local594 = this.aFloat35 + this.aFloat26 * (float) local38 + local388 + this.aFloat32 * (float) local59;
				local604 = arg4.aFloat231 + arg4.aFloat232 * local594 / local247;
			}
			@Pc(1349) Class133 local1349 = null;
			local621 = -1;
			if (local6.aShort38 != -1) {
				local1349 = this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShort38 & 0xFFFF);
				local621 = local1349.anInt3351 * -1410868471;
			}
			@Pc(1381) boolean local1381 = local1349 != null && this.method3410(local1349.aByte118);
			local382 = local63 + local65 + local67;
			if ((local523 - local577) * (local496 - local604) - (local550 - local604) * (local469 - local577) > 0.0F) {
				arg4.aBoolean538 = local523 < 0.0F || local577 < 0.0F || local469 < 0.0F || local523 > (float) arg4.anInt2978 || local577 > (float) arg4.anInt2978 || local469 > (float) arg4.anInt2978;
				if (local382 >= 3.0F) {
					arg4.method21898(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, arg3.anInt132 * 128222029);
				} else if (local382 > 0.0F) {
					if (local621 >= 0) {
						local904 = -16777216;
						if (local1381) {
							local904 = -1694498816;
						}
						arg4.method21872(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt762 & 0xFFFFFF, local904 | local6.anInt763 & 0xFFFFFF, local904 | local6.anInt764 & 0xFFFFFF, arg3.anInt132 * 128222029, local65 * 255.0F, local67 * 255.0F, local63 * 255.0F, local6.aShort38 & 0xFFFF, local621);
					} else {
						if (local1381) {
							arg4.anInt2973 = 100;
						}
						arg4.method21868(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, Class594.method33426(local6.anInt762, (int) (local65 * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local6.anInt763, (int) (local67 * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local6.anInt764, (int) (local63 * 255.0F) << 24 | arg3.anInt132 * 128222029));
						arg4.anInt2973 = 0;
					}
				} else if (local621 >= 0) {
					local904 = -16777216;
					if (local1381) {
						local904 = -1694498816;
					}
					arg4.method21872(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt762 & 0xFFFFFF, local904 | local6.anInt763 & 0xFFFFFF, local904 | local6.anInt764 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort38 & 0xFFFF, local621);
				} else {
					if (local1381) {
						arg4.anInt2973 = 100;
					}
					arg4.method21868(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local6.anInt762, local6.anInt763, local6.anInt764);
					arg4.anInt2973 = 0;
				}
			}
			local382 = local61 + local63 + local67;
			if ((local415 - local469) * (local604 - local496) - (local442 - local496) * (local577 - local469) > 0.0F) {
				arg4.aBoolean538 = local415 < 0.0F || local469 < 0.0F || local577 < 0.0F || local415 > (float) arg4.anInt2978 || local469 > (float) arg4.anInt2978 || local577 > (float) arg4.anInt2978;
				if (local382 < 3.0F) {
					if (local1381) {
						arg4.anInt2973 = -1694498816;
					}
					if (local382 > 0.0F) {
						if (local621 >= 0) {
							local904 = -16777216;
							if (local1381) {
								local904 = -1694498816;
							}
							arg4.method21872(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt761 & 0xFFFFFF, local904 | local6.anInt764 & 0xFFFFFF, local904 | local6.anInt763 & 0xFFFFFF, arg3.anInt132 * 128222029, local61 * 255.0F, local63 * 255.0F, local67 * 255.0F, local6.aShort38 & 0xFFFF, local621);
						} else {
							if (local1381) {
								arg4.anInt2973 = 100;
							}
							arg4.method21868(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, Class594.method33426(local6.anInt761, (int) (local61 * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local6.anInt764, (int) (local63 * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local6.anInt763, (int) (local67 * 255.0F) << 24 | arg3.anInt132 * 128222029));
							arg4.anInt2973 = 0;
						}
					} else if (local621 >= 0) {
						local904 = -16777216;
						if (local1381) {
							local904 = -1694498816;
						}
						arg4.method21872(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt761 & 0xFFFFFF, local904 | local6.anInt764 & 0xFFFFFF, local904 | local6.anInt763 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort38 & 0xFFFF, local621);
					} else {
						if (local1381) {
							arg4.anInt2973 = 100;
						}
						arg4.method21868(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local6.anInt761, local6.anInt764, local6.anInt763);
						arg4.anInt2973 = 0;
					}
				} else {
					arg4.method21898(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, arg3.anInt132 * 128222029);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abo", name = "bp", descriptor = "(IIZLclient!ab;Lclient!bw;[F[F[F[F[FI)V", line = 835)
	void method3427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) Class103 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class28 local6 = this.aClass28ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(415) float local415;
		@Pc(469) float local469;
		@Pc(523) float local523;
		@Pc(577) float local577;
		@Pc(442) float local442;
		@Pc(550) float local550;
		@Pc(273) float local273;
		@Pc(283) float local283;
		@Pc(293) float local293;
		@Pc(405) float local405;
		@Pc(459) float local459;
		@Pc(513) float local513;
		@Pc(567) float local567;
		if (local6 == null) {
			@Pc(2012) Class83 local2012 = this.aClass83ArrayArray1[arg0][arg1];
			if (local2012 != null) {
				if (arg10 != 0) {
					if ((local2012.aByte105 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2033) int local2033;
				@Pc(2163) int local2163;
				for (local2033 = 0; local2033 < local2012.aShort142; local2033++) {
					local45 = local2012.aShortArray60[local2033] + (arg0 << this.anInt336 * 1371852633);
					local52 = local2012.aShortArray62[local2033];
					local59 = local2012.aShortArray65[local2033] + (arg1 << this.anInt336 * 1371852633);
					local523 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local52 + this.aFloat25 * (float) local59;
					local577 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local52 + this.aFloat24 * (float) local59;
					if (local523 < -local577) {
						return;
					}
					local442 = arg4.aFloat233 + arg4.aFloat234 * local523 / local577;
					arg9[local2033] = 0.0F;
					if (arg2) {
						local550 = local523 - arg3.aFloat5;
						if (local550 > 0.0F) {
							local550 /= arg3.aFloat7;
							if (local550 > 1.0F) {
								local550 = 1.0F;
							}
							arg9[local2033] = local550;
							local2163 = (int) ((float) local2012.aShortArray63[local2033] * local550);
							if (local2163 > 0) {
								local52 -= local2163;
							}
						}
					} else if (arg3.aBoolean43) {
						local550 = local523 - arg3.aFloat5;
						if (local550 > 0.0F) {
							arg9[local2033] = local550 / arg3.aFloat7;
							if (arg9[local2033] > 1.0F) {
								arg9[local2033] = 1.0F;
							}
						}
					}
					local415 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local52 + this.aFloat34 * (float) local59;
					local469 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local52 + this.aFloat32 * (float) local59;
					arg5[local2033] = arg4.aFloat229 + arg4.aFloat230 * local415 / local577;
					arg6[local2033] = arg4.aFloat231 + arg4.aFloat232 * local469 / local577;
					arg7[local2033] = local442;
					arg8[local2033] = local577;
				}
				@Pc(2296) int local2296;
				@Pc(2288) int local2288;
				if (local2012.aShortArray64 == null) {
					for (local2033 = 0; local2033 < local2012.aShort143; local2033++) {
						local2288 = local2033 * 3;
						local2163 = local2288 + 1;
						local2296 = local2163 + 1;
						local273 = arg5[local2288];
						local283 = arg5[local2163];
						local293 = arg5[local2296];
						local405 = arg6[local2288];
						local459 = arg6[local2163];
						local513 = arg6[local2296];
						local567 = arg9[local2288] + arg9[local2163] + arg9[local2296];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean538 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt2978 || local283 > (float) arg4.anInt2978 || local293 > (float) arg4.anInt2978;
							if (local567 >= 3.0F) {
								arg4.method21898(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], arg3.anInt132 * 128222029);
							} else if (local567 > 0.0F) {
								if ((local2012.anIntArray277[local2288] & 0xFFFFFF) != 0) {
									arg4.method21868(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], Class575.method33150(local2012.anIntArray277[local2288], arg3.anInt132 * 128222029, arg9[local2288] * 255.0F), Class575.method33150(local2012.anIntArray277[local2163], arg3.anInt132 * 128222029, arg9[local2163] * 255.0F), Class575.method33150(local2012.anIntArray277[local2296], arg3.anInt132 * 128222029, arg9[local2296] * 255.0F));
								}
							} else if ((local2012.anIntArray277[local2288] & 0xFFFFFF) != 0) {
								arg4.method21868(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], local2012.anIntArray277[local2288], local2012.anIntArray277[local2163], local2012.anIntArray277[local2296]);
							}
						}
					}
				} else {
					for (local2033 = 0; local2033 < local2012.aShort143; local2033++) {
						local2288 = local2033 * 3;
						local2163 = local2288 + 1;
						local2296 = local2163 + 1;
						local273 = arg5[local2288];
						local283 = arg5[local2163];
						local293 = arg5[local2296];
						local405 = arg6[local2288];
						local459 = arg6[local2163];
						local513 = arg6[local2296];
						local567 = arg9[local2288] + arg9[local2163] + arg9[local2296];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean538 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt2978 || local283 > (float) arg4.anInt2978 || local293 > (float) arg4.anInt2978;
							@Pc(2387) Class133 local2387 = null;
							@Pc(2389) int local2389 = -1;
							if (local2012.aShortArray64[local2033] != -1) {
								local2387 = this.aClass21_Sub1_6.aClass134_7.method22906(local2012.aShortArray64[local2033] & 0xFFFF);
								local2389 = local2387.anInt3351 * -1410868471;
							}
							if (local567 < 3.0F) {
								@Pc(2425) int local2425;
								if (local567 > 0.0F) {
									if (local2389 != -1) {
										local2425 = -16777216;
										if (local2389 != -1 && this.method3410(local2387.aByte118)) {
											local2425 = -1694498816;
										}
										arg4.method21872(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], arg8[local2288], arg8[local2163], arg8[local2296], (float) local2012.aShortArray60[local2288] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray60[local2163] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray60[local2296] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2288] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2163] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2296] / (float) (this.anInt338 * 76934957), local2425 | local2012.anIntArray277[local2288] & 0xFFFFFF, local2425 | local2012.anIntArray277[local2163] & 0xFFFFFF, local2425 | local2012.anIntArray277[local2296] & 0xFFFFFF, arg3.anInt132 * 128222029, arg9[local2288] * 255.0F, arg9[local2163] * 255.0F, arg9[local2296] * 255.0F, local2012.aShortArray64[local2033] & 0xFFFF, local2389);
									} else if ((local2012.anIntArray277[local2288] & 0xFFFFFF) != 0) {
										if (local2389 != -1 && this.method3410(local2387.aByte118)) {
											arg4.anInt2973 = -1694498816;
										}
										arg4.method21868(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], Class594.method33426(local2012.anIntArray277[local2288], (int) (arg9[local2288] * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local2012.anIntArray277[local2163], (int) (arg9[local2163] * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local2012.anIntArray277[local2296], (int) (arg9[local2296] * 255.0F) << 24 | arg3.anInt132 * 128222029));
										arg4.anInt2973 = 0;
									}
								} else if (local2389 != -1) {
									local2425 = -16777216;
									if (local2389 != -1 && this.method3410(local2387.aByte118)) {
										local2425 = -1694498816;
									}
									arg4.method21872(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], arg8[local2288], arg8[local2163], arg8[local2296], (float) local2012.aShortArray60[local2288] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray60[local2163] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray60[local2296] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2288] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2163] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2296] / (float) (this.anInt338 * 76934957), local2425 | local2012.anIntArray277[local2288] & 0xFFFFFF, local2425 | local2012.anIntArray277[local2163] & 0xFFFFFF, local2425 | local2012.anIntArray277[local2296] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local2012.aShortArray64[local2033] & 0xFFFF, local2389);
								} else if ((local2012.anIntArray277[local2288] & 0xFFFFFF) != 0) {
									if (local2389 != -1 && this.method3410(local2387.aByte118)) {
										arg4.anInt2973 = -1694498816;
									}
									arg4.method21868(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], local2012.anIntArray277[local2288], local2012.anIntArray277[local2163], local2012.anIntArray277[local2296]);
									arg4.anInt2973 = 0;
								}
							} else {
								arg4.method21898(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], arg3.anInt132 * 128222029);
							}
						}
					}
				}
			}
		} else if ((local6.aByte18 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((local6.aByte18 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt338 * 76934957;
			local45 = local38 + this.anInt338 * 76934957;
			local52 = arg1 * this.anInt338 * 76934957;
			local59 = local52 + this.anInt338 * 76934957;
			@Pc(61) float local61 = 0.0F;
			@Pc(63) float local63 = 0.0F;
			@Pc(65) float local65 = 0.0F;
			@Pc(67) float local67 = 0.0F;
			@Pc(594) float local594;
			@Pc(110) float local110;
			@Pc(150) float local150;
			@Pc(190) float local190;
			@Pc(230) float local230;
			@Pc(127) float local127;
			@Pc(167) float local167;
			@Pc(207) float local207;
			@Pc(247) float local247;
			@Pc(301) float local301;
			@Pc(81) int local81;
			@Pc(621) int local621;
			@Pc(904) int local904;
			@Pc(496) float local496;
			@Pc(604) float local604;
			@Pc(263) float local263;
			@Pc(432) float local432;
			@Pc(486) float local486;
			@Pc(540) float local540;
			@Pc(382) float local382;
			if ((local6.aByte18 & 0x1) == 0 || arg2) {
				local81 = this.anIntArrayArray7[arg0][arg1];
				local621 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(632) int local632 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(641) int local641 = this.anIntArrayArray7[arg0][arg1 + 1];
				local110 = this.aFloat36 + this.aFloat27 * (float) local38 + this.aFloat31 * (float) local81 + this.aFloat25 * (float) local52;
				local127 = this.aFloat37 + this.aFloat28 * (float) local38 + this.aFloat33 * (float) local81 + this.aFloat24 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local621 + this.aFloat25 * (float) local52;
				local167 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local621 + this.aFloat24 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local632 + this.aFloat25 * (float) local59;
				local207 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local632 + this.aFloat24 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat36 + this.aFloat27 * (float) local38 + this.aFloat31 * (float) local641 + this.aFloat25 * (float) local59;
				local247 = this.aFloat37 + this.aFloat28 * (float) local38 + this.aFloat33 * (float) local641 + this.aFloat24 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat233 + arg4.aFloat234 * local110 / local127;
				local273 = arg4.aFloat233 + arg4.aFloat234 * local150 / local167;
				local283 = arg4.aFloat233 + arg4.aFloat234 * local190 / local207;
				local293 = arg4.aFloat233 + arg4.aFloat234 * local230 / local247;
				if (arg2) {
					local301 = local110 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat7;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local61 = local301;
						local904 = (int) ((float) local6.aShort34 * local301);
						if (local904 > 0) {
							local81 -= local904;
						}
					}
					local301 = local150 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat7;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local63 = local301;
						local904 = (int) ((float) local6.aShort35 * local301);
						if (local904 > 0) {
							local621 -= local904;
						}
					}
					local301 = local190 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat7;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local65 = local301;
						local904 = (int) ((float) local6.aShort36 * local301);
						if (local904 > 0) {
							local632 -= local904;
						}
					}
					local301 = local230 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat7;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local67 = local301;
						local904 = (int) ((float) local6.aShort37 * local301);
						if (local904 > 0) {
							local641 -= local904;
						}
					}
				} else if (arg3.aBoolean43) {
					local301 = local110 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat7;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat7;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat7;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat7;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local405 = this.aFloat38 + this.aFloat23 * (float) local38 + this.aFloat29 * (float) local81 + this.aFloat34 * (float) local52;
				local415 = arg4.aFloat229 + arg4.aFloat230 * local405 / local127;
				local432 = this.aFloat35 + this.aFloat26 * (float) local38 + this.aFloat30 * (float) local81 + this.aFloat32 * (float) local52;
				local442 = arg4.aFloat231 + arg4.aFloat232 * local432 / local127;
				local459 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local621 + this.aFloat34 * (float) local52;
				local469 = arg4.aFloat229 + arg4.aFloat230 * local459 / local167;
				local486 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local621 + this.aFloat32 * (float) local52;
				local496 = arg4.aFloat231 + arg4.aFloat232 * local486 / local167;
				local513 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local632 + this.aFloat34 * (float) local59;
				local523 = arg4.aFloat229 + arg4.aFloat230 * local513 / local207;
				local540 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local632 + this.aFloat32 * (float) local59;
				local550 = arg4.aFloat231 + arg4.aFloat232 * local540 / local207;
				local567 = this.aFloat38 + this.aFloat23 * (float) local38 + this.aFloat29 * (float) local641 + this.aFloat34 * (float) local59;
				local577 = arg4.aFloat229 + arg4.aFloat230 * local567 / local247;
				local594 = this.aFloat35 + this.aFloat26 * (float) local38 + this.aFloat30 * (float) local641 + this.aFloat32 * (float) local59;
				local604 = arg4.aFloat231 + arg4.aFloat232 * local594 / local247;
			} else {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(87) float local87 = this.aFloat31 * (float) local81;
				@Pc(93) float local93 = this.aFloat33 * (float) local81;
				local110 = this.aFloat36 + this.aFloat27 * (float) local38 + local87 + this.aFloat25 * (float) local52;
				local127 = this.aFloat37 + this.aFloat28 * (float) local38 + local93 + this.aFloat24 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat36 + this.aFloat27 * (float) local45 + local87 + this.aFloat25 * (float) local52;
				local167 = this.aFloat37 + this.aFloat28 * (float) local45 + local93 + this.aFloat24 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat36 + this.aFloat27 * (float) local45 + local87 + this.aFloat25 * (float) local59;
				local207 = this.aFloat37 + this.aFloat28 * (float) local45 + local93 + this.aFloat24 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat36 + this.aFloat27 * (float) local38 + local87 + this.aFloat25 * (float) local59;
				local247 = this.aFloat37 + this.aFloat28 * (float) local38 + local93 + this.aFloat24 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat233 + arg4.aFloat234 * local110 / local127;
				local273 = arg4.aFloat233 + arg4.aFloat234 * local150 / local167;
				local283 = arg4.aFloat233 + arg4.aFloat234 * local190 / local207;
				local293 = arg4.aFloat233 + arg4.aFloat234 * local230 / local247;
				if (arg3.aBoolean43) {
					local301 = local110 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat7;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat7;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat7;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat7;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local382 = this.aFloat29 * (float) local81;
				@Pc(388) float local388 = this.aFloat30 * (float) local81;
				local405 = this.aFloat38 + this.aFloat23 * (float) local38 + local382 + this.aFloat34 * (float) local52;
				local415 = arg4.aFloat229 + arg4.aFloat230 * local405 / local127;
				local432 = this.aFloat35 + this.aFloat26 * (float) local38 + local388 + this.aFloat32 * (float) local52;
				local442 = arg4.aFloat231 + arg4.aFloat232 * local432 / local127;
				local459 = this.aFloat38 + this.aFloat23 * (float) local45 + local382 + this.aFloat34 * (float) local52;
				local469 = arg4.aFloat229 + arg4.aFloat230 * local459 / local167;
				local486 = this.aFloat35 + this.aFloat26 * (float) local45 + local388 + this.aFloat32 * (float) local52;
				local496 = arg4.aFloat231 + arg4.aFloat232 * local486 / local167;
				local513 = this.aFloat38 + this.aFloat23 * (float) local45 + local382 + this.aFloat34 * (float) local59;
				local523 = arg4.aFloat229 + arg4.aFloat230 * local513 / local207;
				local540 = this.aFloat35 + this.aFloat26 * (float) local45 + local388 + this.aFloat32 * (float) local59;
				local550 = arg4.aFloat231 + arg4.aFloat232 * local540 / local207;
				local567 = this.aFloat38 + this.aFloat23 * (float) local38 + local382 + this.aFloat34 * (float) local59;
				local577 = arg4.aFloat229 + arg4.aFloat230 * local567 / local247;
				local594 = this.aFloat35 + this.aFloat26 * (float) local38 + local388 + this.aFloat32 * (float) local59;
				local604 = arg4.aFloat231 + arg4.aFloat232 * local594 / local247;
			}
			@Pc(1349) Class133 local1349 = null;
			local621 = -1;
			if (local6.aShort38 != -1) {
				local1349 = this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShort38 & 0xFFFF);
				local621 = local1349.anInt3351 * -1410868471;
			}
			@Pc(1381) boolean local1381 = local1349 != null && this.method3410(local1349.aByte118);
			local382 = local63 + local65 + local67;
			if ((local523 - local577) * (local496 - local604) - (local550 - local604) * (local469 - local577) > 0.0F) {
				arg4.aBoolean538 = local523 < 0.0F || local577 < 0.0F || local469 < 0.0F || local523 > (float) arg4.anInt2978 || local577 > (float) arg4.anInt2978 || local469 > (float) arg4.anInt2978;
				if (local382 >= 3.0F) {
					arg4.method21898(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, arg3.anInt132 * 128222029);
				} else if (local382 > 0.0F) {
					if (local621 >= 0) {
						local904 = -16777216;
						if (local1381) {
							local904 = -1694498816;
						}
						arg4.method21872(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt762 & 0xFFFFFF, local904 | local6.anInt763 & 0xFFFFFF, local904 | local6.anInt764 & 0xFFFFFF, arg3.anInt132 * 128222029, local65 * 255.0F, local67 * 255.0F, local63 * 255.0F, local6.aShort38 & 0xFFFF, local621);
					} else {
						if (local1381) {
							arg4.anInt2973 = 100;
						}
						arg4.method21868(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, Class594.method33426(local6.anInt762, (int) (local65 * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local6.anInt763, (int) (local67 * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local6.anInt764, (int) (local63 * 255.0F) << 24 | arg3.anInt132 * 128222029));
						arg4.anInt2973 = 0;
					}
				} else if (local621 >= 0) {
					local904 = -16777216;
					if (local1381) {
						local904 = -1694498816;
					}
					arg4.method21872(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt762 & 0xFFFFFF, local904 | local6.anInt763 & 0xFFFFFF, local904 | local6.anInt764 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort38 & 0xFFFF, local621);
				} else {
					if (local1381) {
						arg4.anInt2973 = 100;
					}
					arg4.method21868(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local6.anInt762, local6.anInt763, local6.anInt764);
					arg4.anInt2973 = 0;
				}
			}
			local382 = local61 + local63 + local67;
			if ((local415 - local469) * (local604 - local496) - (local442 - local496) * (local577 - local469) > 0.0F) {
				arg4.aBoolean538 = local415 < 0.0F || local469 < 0.0F || local577 < 0.0F || local415 > (float) arg4.anInt2978 || local469 > (float) arg4.anInt2978 || local577 > (float) arg4.anInt2978;
				if (local382 < 3.0F) {
					if (local1381) {
						arg4.anInt2973 = -1694498816;
					}
					if (local382 > 0.0F) {
						if (local621 >= 0) {
							local904 = -16777216;
							if (local1381) {
								local904 = -1694498816;
							}
							arg4.method21872(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt761 & 0xFFFFFF, local904 | local6.anInt764 & 0xFFFFFF, local904 | local6.anInt763 & 0xFFFFFF, arg3.anInt132 * 128222029, local61 * 255.0F, local63 * 255.0F, local67 * 255.0F, local6.aShort38 & 0xFFFF, local621);
						} else {
							if (local1381) {
								arg4.anInt2973 = 100;
							}
							arg4.method21868(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, Class594.method33426(local6.anInt761, (int) (local61 * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local6.anInt764, (int) (local63 * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local6.anInt763, (int) (local67 * 255.0F) << 24 | arg3.anInt132 * 128222029));
							arg4.anInt2973 = 0;
						}
					} else if (local621 >= 0) {
						local904 = -16777216;
						if (local1381) {
							local904 = -1694498816;
						}
						arg4.method21872(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt761 & 0xFFFFFF, local904 | local6.anInt764 & 0xFFFFFF, local904 | local6.anInt763 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort38 & 0xFFFF, local621);
					} else {
						if (local1381) {
							arg4.anInt2973 = 100;
						}
						arg4.method21868(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local6.anInt761, local6.anInt764, local6.anInt763);
						arg4.anInt2973 = 0;
					}
				} else {
					arg4.method21898(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, arg3.anInt132 * 128222029);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abo", name = "bb", descriptor = "(IIZLclient!ab;Lclient!bw;[F[F[F[F[FI)V", line = 835)
	void method3428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) Class103 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class28 local6 = this.aClass28ArrayArray1[arg0][arg1];
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(415) float local415;
		@Pc(469) float local469;
		@Pc(523) float local523;
		@Pc(577) float local577;
		@Pc(442) float local442;
		@Pc(550) float local550;
		@Pc(273) float local273;
		@Pc(283) float local283;
		@Pc(293) float local293;
		@Pc(405) float local405;
		@Pc(459) float local459;
		@Pc(513) float local513;
		@Pc(567) float local567;
		if (local6 == null) {
			@Pc(2012) Class83 local2012 = this.aClass83ArrayArray1[arg0][arg1];
			if (local2012 != null) {
				if (arg10 != 0) {
					if ((local2012.aByte105 & 0x4) == 0) {
						if ((arg10 & 0x2) != 0) {
							return;
						}
					} else if ((arg10 & 0x1) != 0) {
						return;
					}
				}
				@Pc(2033) int local2033;
				@Pc(2163) int local2163;
				for (local2033 = 0; local2033 < local2012.aShort142; local2033++) {
					local45 = local2012.aShortArray60[local2033] + (arg0 << this.anInt336 * 1371852633);
					local52 = local2012.aShortArray62[local2033];
					local59 = local2012.aShortArray65[local2033] + (arg1 << this.anInt336 * 1371852633);
					local523 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local52 + this.aFloat25 * (float) local59;
					local577 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local52 + this.aFloat24 * (float) local59;
					if (local523 < -local577) {
						return;
					}
					local442 = arg4.aFloat233 + arg4.aFloat234 * local523 / local577;
					arg9[local2033] = 0.0F;
					if (arg2) {
						local550 = local523 - arg3.aFloat5;
						if (local550 > 0.0F) {
							local550 /= arg3.aFloat7;
							if (local550 > 1.0F) {
								local550 = 1.0F;
							}
							arg9[local2033] = local550;
							local2163 = (int) ((float) local2012.aShortArray63[local2033] * local550);
							if (local2163 > 0) {
								local52 -= local2163;
							}
						}
					} else if (arg3.aBoolean43) {
						local550 = local523 - arg3.aFloat5;
						if (local550 > 0.0F) {
							arg9[local2033] = local550 / arg3.aFloat7;
							if (arg9[local2033] > 1.0F) {
								arg9[local2033] = 1.0F;
							}
						}
					}
					local415 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local52 + this.aFloat34 * (float) local59;
					local469 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local52 + this.aFloat32 * (float) local59;
					arg5[local2033] = arg4.aFloat229 + arg4.aFloat230 * local415 / local577;
					arg6[local2033] = arg4.aFloat231 + arg4.aFloat232 * local469 / local577;
					arg7[local2033] = local442;
					arg8[local2033] = local577;
				}
				@Pc(2296) int local2296;
				@Pc(2288) int local2288;
				if (local2012.aShortArray64 == null) {
					for (local2033 = 0; local2033 < local2012.aShort143; local2033++) {
						local2288 = local2033 * 3;
						local2163 = local2288 + 1;
						local2296 = local2163 + 1;
						local273 = arg5[local2288];
						local283 = arg5[local2163];
						local293 = arg5[local2296];
						local405 = arg6[local2288];
						local459 = arg6[local2163];
						local513 = arg6[local2296];
						local567 = arg9[local2288] + arg9[local2163] + arg9[local2296];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean538 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt2978 || local283 > (float) arg4.anInt2978 || local293 > (float) arg4.anInt2978;
							if (local567 >= 3.0F) {
								arg4.method21898(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], arg3.anInt132 * 128222029);
							} else if (local567 > 0.0F) {
								if ((local2012.anIntArray277[local2288] & 0xFFFFFF) != 0) {
									arg4.method21868(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], Class575.method33150(local2012.anIntArray277[local2288], arg3.anInt132 * 128222029, arg9[local2288] * 255.0F), Class575.method33150(local2012.anIntArray277[local2163], arg3.anInt132 * 128222029, arg9[local2163] * 255.0F), Class575.method33150(local2012.anIntArray277[local2296], arg3.anInt132 * 128222029, arg9[local2296] * 255.0F));
								}
							} else if ((local2012.anIntArray277[local2288] & 0xFFFFFF) != 0) {
								arg4.method21868(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], local2012.anIntArray277[local2288], local2012.anIntArray277[local2163], local2012.anIntArray277[local2296]);
							}
						}
					}
				} else {
					for (local2033 = 0; local2033 < local2012.aShort143; local2033++) {
						local2288 = local2033 * 3;
						local2163 = local2288 + 1;
						local2296 = local2163 + 1;
						local273 = arg5[local2288];
						local283 = arg5[local2163];
						local293 = arg5[local2296];
						local405 = arg6[local2288];
						local459 = arg6[local2163];
						local513 = arg6[local2296];
						local567 = arg9[local2288] + arg9[local2163] + arg9[local2296];
						if ((local273 - local283) * (local513 - local459) - (local405 - local459) * (local293 - local283) > 0.0F) {
							arg4.aBoolean538 = local273 < 0.0F || local283 < 0.0F || local293 < 0.0F || local273 > (float) arg4.anInt2978 || local283 > (float) arg4.anInt2978 || local293 > (float) arg4.anInt2978;
							@Pc(2387) Class133 local2387 = null;
							@Pc(2389) int local2389 = -1;
							if (local2012.aShortArray64[local2033] != -1) {
								local2387 = this.aClass21_Sub1_6.aClass134_7.method22906(local2012.aShortArray64[local2033] & 0xFFFF);
								local2389 = local2387.anInt3351 * -1410868471;
							}
							if (local567 < 3.0F) {
								@Pc(2425) int local2425;
								if (local567 > 0.0F) {
									if (local2389 != -1) {
										local2425 = -16777216;
										if (local2389 != -1 && this.method3410(local2387.aByte118)) {
											local2425 = -1694498816;
										}
										arg4.method21872(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], arg8[local2288], arg8[local2163], arg8[local2296], (float) local2012.aShortArray60[local2288] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray60[local2163] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray60[local2296] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2288] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2163] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2296] / (float) (this.anInt338 * 76934957), local2425 | local2012.anIntArray277[local2288] & 0xFFFFFF, local2425 | local2012.anIntArray277[local2163] & 0xFFFFFF, local2425 | local2012.anIntArray277[local2296] & 0xFFFFFF, arg3.anInt132 * 128222029, arg9[local2288] * 255.0F, arg9[local2163] * 255.0F, arg9[local2296] * 255.0F, local2012.aShortArray64[local2033] & 0xFFFF, local2389);
									} else if ((local2012.anIntArray277[local2288] & 0xFFFFFF) != 0) {
										if (local2389 != -1 && this.method3410(local2387.aByte118)) {
											arg4.anInt2973 = -1694498816;
										}
										arg4.method21868(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], Class594.method33426(local2012.anIntArray277[local2288], (int) (arg9[local2288] * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local2012.anIntArray277[local2163], (int) (arg9[local2163] * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local2012.anIntArray277[local2296], (int) (arg9[local2296] * 255.0F) << 24 | arg3.anInt132 * 128222029));
										arg4.anInt2973 = 0;
									}
								} else if (local2389 != -1) {
									local2425 = -16777216;
									if (local2389 != -1 && this.method3410(local2387.aByte118)) {
										local2425 = -1694498816;
									}
									arg4.method21872(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], arg8[local2288], arg8[local2163], arg8[local2296], (float) local2012.aShortArray60[local2288] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray60[local2163] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray60[local2296] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2288] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2163] / (float) (this.anInt338 * 76934957), (float) local2012.aShortArray65[local2296] / (float) (this.anInt338 * 76934957), local2425 | local2012.anIntArray277[local2288] & 0xFFFFFF, local2425 | local2012.anIntArray277[local2163] & 0xFFFFFF, local2425 | local2012.anIntArray277[local2296] & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local2012.aShortArray64[local2033] & 0xFFFF, local2389);
								} else if ((local2012.anIntArray277[local2288] & 0xFFFFFF) != 0) {
									if (local2389 != -1 && this.method3410(local2387.aByte118)) {
										arg4.anInt2973 = -1694498816;
									}
									arg4.method21868(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], local2012.anIntArray277[local2288], local2012.anIntArray277[local2163], local2012.anIntArray277[local2296]);
									arg4.anInt2973 = 0;
								}
							} else {
								arg4.method21898(true, true, false, local405, local459, local513, local273, local283, local293, arg7[local2288], arg7[local2163], arg7[local2296], arg3.anInt132 * 128222029);
							}
						}
					}
				}
			}
		} else if ((local6.aByte18 & 0x2) == 0) {
			if (arg10 != 0) {
				if ((local6.aByte18 & 0x4) == 0) {
					if ((arg10 & 0x2) != 0) {
						return;
					}
				} else if ((arg10 & 0x1) != 0) {
					return;
				}
			}
			@Pc(38) int local38 = arg0 * this.anInt338 * 76934957;
			local45 = local38 + this.anInt338 * 76934957;
			local52 = arg1 * this.anInt338 * 76934957;
			local59 = local52 + this.anInt338 * 76934957;
			@Pc(61) float local61 = 0.0F;
			@Pc(63) float local63 = 0.0F;
			@Pc(65) float local65 = 0.0F;
			@Pc(67) float local67 = 0.0F;
			@Pc(594) float local594;
			@Pc(110) float local110;
			@Pc(150) float local150;
			@Pc(190) float local190;
			@Pc(230) float local230;
			@Pc(127) float local127;
			@Pc(167) float local167;
			@Pc(207) float local207;
			@Pc(247) float local247;
			@Pc(301) float local301;
			@Pc(81) int local81;
			@Pc(621) int local621;
			@Pc(904) int local904;
			@Pc(496) float local496;
			@Pc(604) float local604;
			@Pc(263) float local263;
			@Pc(432) float local432;
			@Pc(486) float local486;
			@Pc(540) float local540;
			@Pc(382) float local382;
			if ((local6.aByte18 & 0x1) == 0 || arg2) {
				local81 = this.anIntArrayArray7[arg0][arg1];
				local621 = this.anIntArrayArray7[arg0 + 1][arg1];
				@Pc(632) int local632 = this.anIntArrayArray7[arg0 + 1][arg1 + 1];
				@Pc(641) int local641 = this.anIntArrayArray7[arg0][arg1 + 1];
				local110 = this.aFloat36 + this.aFloat27 * (float) local38 + this.aFloat31 * (float) local81 + this.aFloat25 * (float) local52;
				local127 = this.aFloat37 + this.aFloat28 * (float) local38 + this.aFloat33 * (float) local81 + this.aFloat24 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local621 + this.aFloat25 * (float) local52;
				local167 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local621 + this.aFloat24 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat36 + this.aFloat27 * (float) local45 + this.aFloat31 * (float) local632 + this.aFloat25 * (float) local59;
				local207 = this.aFloat37 + this.aFloat28 * (float) local45 + this.aFloat33 * (float) local632 + this.aFloat24 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat36 + this.aFloat27 * (float) local38 + this.aFloat31 * (float) local641 + this.aFloat25 * (float) local59;
				local247 = this.aFloat37 + this.aFloat28 * (float) local38 + this.aFloat33 * (float) local641 + this.aFloat24 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat233 + arg4.aFloat234 * local110 / local127;
				local273 = arg4.aFloat233 + arg4.aFloat234 * local150 / local167;
				local283 = arg4.aFloat233 + arg4.aFloat234 * local190 / local207;
				local293 = arg4.aFloat233 + arg4.aFloat234 * local230 / local247;
				if (arg2) {
					local301 = local110 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat7;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local61 = local301;
						local904 = (int) ((float) local6.aShort34 * local301);
						if (local904 > 0) {
							local81 -= local904;
						}
					}
					local301 = local150 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat7;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local63 = local301;
						local904 = (int) ((float) local6.aShort35 * local301);
						if (local904 > 0) {
							local621 -= local904;
						}
					}
					local301 = local190 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat7;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local65 = local301;
						local904 = (int) ((float) local6.aShort36 * local301);
						if (local904 > 0) {
							local632 -= local904;
						}
					}
					local301 = local230 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local301 /= arg3.aFloat7;
						if (local301 > 1.0F) {
							local301 = 1.0F;
						}
						local67 = local301;
						local904 = (int) ((float) local6.aShort37 * local301);
						if (local904 > 0) {
							local641 -= local904;
						}
					}
				} else if (arg3.aBoolean43) {
					local301 = local110 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat7;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat7;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat7;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat7;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local405 = this.aFloat38 + this.aFloat23 * (float) local38 + this.aFloat29 * (float) local81 + this.aFloat34 * (float) local52;
				local415 = arg4.aFloat229 + arg4.aFloat230 * local405 / local127;
				local432 = this.aFloat35 + this.aFloat26 * (float) local38 + this.aFloat30 * (float) local81 + this.aFloat32 * (float) local52;
				local442 = arg4.aFloat231 + arg4.aFloat232 * local432 / local127;
				local459 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local621 + this.aFloat34 * (float) local52;
				local469 = arg4.aFloat229 + arg4.aFloat230 * local459 / local167;
				local486 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local621 + this.aFloat32 * (float) local52;
				local496 = arg4.aFloat231 + arg4.aFloat232 * local486 / local167;
				local513 = this.aFloat38 + this.aFloat23 * (float) local45 + this.aFloat29 * (float) local632 + this.aFloat34 * (float) local59;
				local523 = arg4.aFloat229 + arg4.aFloat230 * local513 / local207;
				local540 = this.aFloat35 + this.aFloat26 * (float) local45 + this.aFloat30 * (float) local632 + this.aFloat32 * (float) local59;
				local550 = arg4.aFloat231 + arg4.aFloat232 * local540 / local207;
				local567 = this.aFloat38 + this.aFloat23 * (float) local38 + this.aFloat29 * (float) local641 + this.aFloat34 * (float) local59;
				local577 = arg4.aFloat229 + arg4.aFloat230 * local567 / local247;
				local594 = this.aFloat35 + this.aFloat26 * (float) local38 + this.aFloat30 * (float) local641 + this.aFloat32 * (float) local59;
				local604 = arg4.aFloat231 + arg4.aFloat232 * local594 / local247;
			} else {
				local81 = this.anIntArrayArray7[arg0][arg1];
				@Pc(87) float local87 = this.aFloat31 * (float) local81;
				@Pc(93) float local93 = this.aFloat33 * (float) local81;
				local110 = this.aFloat36 + this.aFloat27 * (float) local38 + local87 + this.aFloat25 * (float) local52;
				local127 = this.aFloat37 + this.aFloat28 * (float) local38 + local93 + this.aFloat24 * (float) local52;
				if (local110 < -local127) {
					return;
				}
				local150 = this.aFloat36 + this.aFloat27 * (float) local45 + local87 + this.aFloat25 * (float) local52;
				local167 = this.aFloat37 + this.aFloat28 * (float) local45 + local93 + this.aFloat24 * (float) local52;
				if (local150 < -local167) {
					return;
				}
				local190 = this.aFloat36 + this.aFloat27 * (float) local45 + local87 + this.aFloat25 * (float) local59;
				local207 = this.aFloat37 + this.aFloat28 * (float) local45 + local93 + this.aFloat24 * (float) local59;
				if (local190 < -local207) {
					return;
				}
				local230 = this.aFloat36 + this.aFloat27 * (float) local38 + local87 + this.aFloat25 * (float) local59;
				local247 = this.aFloat37 + this.aFloat28 * (float) local38 + local93 + this.aFloat24 * (float) local59;
				if (local230 < -local247) {
					return;
				}
				local263 = arg4.aFloat233 + arg4.aFloat234 * local110 / local127;
				local273 = arg4.aFloat233 + arg4.aFloat234 * local150 / local167;
				local283 = arg4.aFloat233 + arg4.aFloat234 * local190 / local207;
				local293 = arg4.aFloat233 + arg4.aFloat234 * local230 / local247;
				if (arg3.aBoolean43) {
					local301 = local110 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local61 = local301 / arg3.aFloat7;
						if (local61 > 1.0F) {
							local61 = 1.0F;
						}
					}
					local301 = local150 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local63 = local301 / arg3.aFloat7;
						if (local63 > 1.0F) {
							local63 = 1.0F;
						}
					}
					local301 = local190 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local65 = local301 / arg3.aFloat7;
						if (local65 > 1.0F) {
							local65 = 1.0F;
						}
					}
					local301 = local230 - arg3.aFloat5;
					if (local301 > 0.0F) {
						local67 = local301 / arg3.aFloat7;
						if (local67 > 1.0F) {
							local67 = 1.0F;
						}
					}
				}
				local382 = this.aFloat29 * (float) local81;
				@Pc(388) float local388 = this.aFloat30 * (float) local81;
				local405 = this.aFloat38 + this.aFloat23 * (float) local38 + local382 + this.aFloat34 * (float) local52;
				local415 = arg4.aFloat229 + arg4.aFloat230 * local405 / local127;
				local432 = this.aFloat35 + this.aFloat26 * (float) local38 + local388 + this.aFloat32 * (float) local52;
				local442 = arg4.aFloat231 + arg4.aFloat232 * local432 / local127;
				local459 = this.aFloat38 + this.aFloat23 * (float) local45 + local382 + this.aFloat34 * (float) local52;
				local469 = arg4.aFloat229 + arg4.aFloat230 * local459 / local167;
				local486 = this.aFloat35 + this.aFloat26 * (float) local45 + local388 + this.aFloat32 * (float) local52;
				local496 = arg4.aFloat231 + arg4.aFloat232 * local486 / local167;
				local513 = this.aFloat38 + this.aFloat23 * (float) local45 + local382 + this.aFloat34 * (float) local59;
				local523 = arg4.aFloat229 + arg4.aFloat230 * local513 / local207;
				local540 = this.aFloat35 + this.aFloat26 * (float) local45 + local388 + this.aFloat32 * (float) local59;
				local550 = arg4.aFloat231 + arg4.aFloat232 * local540 / local207;
				local567 = this.aFloat38 + this.aFloat23 * (float) local38 + local382 + this.aFloat34 * (float) local59;
				local577 = arg4.aFloat229 + arg4.aFloat230 * local567 / local247;
				local594 = this.aFloat35 + this.aFloat26 * (float) local38 + local388 + this.aFloat32 * (float) local59;
				local604 = arg4.aFloat231 + arg4.aFloat232 * local594 / local247;
			}
			@Pc(1349) Class133 local1349 = null;
			local621 = -1;
			if (local6.aShort38 != -1) {
				local1349 = this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShort38 & 0xFFFF);
				local621 = local1349.anInt3351 * -1410868471;
			}
			@Pc(1381) boolean local1381 = local1349 != null && this.method3410(local1349.aByte118);
			local382 = local63 + local65 + local67;
			if ((local523 - local577) * (local496 - local604) - (local550 - local604) * (local469 - local577) > 0.0F) {
				arg4.aBoolean538 = local523 < 0.0F || local577 < 0.0F || local469 < 0.0F || local523 > (float) arg4.anInt2978 || local577 > (float) arg4.anInt2978 || local469 > (float) arg4.anInt2978;
				if (local382 >= 3.0F) {
					arg4.method21898(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, arg3.anInt132 * 128222029);
				} else if (local382 > 0.0F) {
					if (local621 >= 0) {
						local904 = -16777216;
						if (local1381) {
							local904 = -1694498816;
						}
						arg4.method21872(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt762 & 0xFFFFFF, local904 | local6.anInt763 & 0xFFFFFF, local904 | local6.anInt764 & 0xFFFFFF, arg3.anInt132 * 128222029, local65 * 255.0F, local67 * 255.0F, local63 * 255.0F, local6.aShort38 & 0xFFFF, local621);
					} else {
						if (local1381) {
							arg4.anInt2973 = 100;
						}
						arg4.method21868(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, Class594.method33426(local6.anInt762, (int) (local65 * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local6.anInt763, (int) (local67 * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local6.anInt764, (int) (local63 * 255.0F) << 24 | arg3.anInt132 * 128222029));
						arg4.anInt2973 = 0;
					}
				} else if (local621 >= 0) {
					local904 = -16777216;
					if (local1381) {
						local904 = -1694498816;
					}
					arg4.method21872(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local207, local247, local167, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, local904 | local6.anInt762 & 0xFFFFFF, local904 | local6.anInt763 & 0xFFFFFF, local904 | local6.anInt764 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort38 & 0xFFFF, local621);
				} else {
					if (local1381) {
						arg4.anInt2973 = 100;
					}
					arg4.method21868(true, true, false, local550, local604, local496, local523, local577, local469, local283, local293, local273, local6.anInt762, local6.anInt763, local6.anInt764);
					arg4.anInt2973 = 0;
				}
			}
			local382 = local61 + local63 + local67;
			if ((local415 - local469) * (local604 - local496) - (local442 - local496) * (local577 - local469) > 0.0F) {
				arg4.aBoolean538 = local415 < 0.0F || local469 < 0.0F || local577 < 0.0F || local415 > (float) arg4.anInt2978 || local469 > (float) arg4.anInt2978 || local577 > (float) arg4.anInt2978;
				if (local382 < 3.0F) {
					if (local1381) {
						arg4.anInt2973 = -1694498816;
					}
					if (local382 > 0.0F) {
						if (local621 >= 0) {
							local904 = -16777216;
							if (local1381) {
								local904 = -1694498816;
							}
							arg4.method21872(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt761 & 0xFFFFFF, local904 | local6.anInt764 & 0xFFFFFF, local904 | local6.anInt763 & 0xFFFFFF, arg3.anInt132 * 128222029, local61 * 255.0F, local63 * 255.0F, local67 * 255.0F, local6.aShort38 & 0xFFFF, local621);
						} else {
							if (local1381) {
								arg4.anInt2973 = 100;
							}
							arg4.method21868(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, Class594.method33426(local6.anInt761, (int) (local61 * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local6.anInt764, (int) (local63 * 255.0F) << 24 | arg3.anInt132 * 128222029), Class594.method33426(local6.anInt763, (int) (local67 * 255.0F) << 24 | arg3.anInt132 * 128222029));
							arg4.anInt2973 = 0;
						}
					} else if (local621 >= 0) {
						local904 = -16777216;
						if (local1381) {
							local904 = -1694498816;
						}
						arg4.method21872(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local127, local167, local247, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, local904 | local6.anInt761 & 0xFFFFFF, local904 | local6.anInt764 & 0xFFFFFF, local904 | local6.anInt763 & 0xFFFFFF, 0, 0.0F, 0.0F, 0.0F, local6.aShort38 & 0xFFFF, local621);
					} else {
						if (local1381) {
							arg4.anInt2973 = 100;
						}
						arg4.method21868(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, local6.anInt761, local6.anInt764, local6.anInt763);
						arg4.anInt2973 = 0;
					}
				} else {
					arg4.method21898(true, true, false, local442, local496, local604, local415, local469, local577, local263, local273, local293, arg3.anInt132 * 128222029);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abo", name = "bd", descriptor = "(IIZLclient!ab;Lclient!bw;[F[F[F[F[FI)V", line = 1239)
	void method3412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) Class103 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class89 local6 = this.aClass89ArrayArray1[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(137) int local137;
		for (@Pc(17) int local17 = 0; local17 < local6.aShort145; local17++) {
			@Pc(33) int local33 = local6.aShortArray67[local17] + (arg0 << this.anInt336 * 1371852633);
			@Pc(38) int local38 = local6.aShortArray66[local17];
			@Pc(50) int local50 = local6.aShortArray70[local17] + (arg1 << this.anInt336 * 1371852633);
			@Pc(71) float local71 = this.aFloat36 + this.aFloat27 * (float) local33 + this.aFloat31 * (float) local38 + this.aFloat25 * (float) local50;
			@Pc(92) float local92 = this.aFloat37 + this.aFloat28 * (float) local33 + this.aFloat33 * (float) local38 + this.aFloat24 * (float) local50;
			if (local71 < -local92) {
				return;
			}
			arg9[local17] = 0.0F;
			@Pc(109) float local109;
			if (arg2) {
				local109 = local71 - arg3.aFloat5;
				if (local109 > 0.0F) {
					local109 /= arg3.aFloat7;
					if (local109 > 1.0F) {
						local109 = 1.0F;
					}
					arg9[local17] = local109;
					local137 = (int) ((float) local6.aShortArray68[local17] * local109);
					if (local137 > 0) {
						local38 -= local137;
					}
				}
			} else if (arg3.aBoolean43) {
				local109 = local71 - arg3.aFloat5;
				if (local109 > 0.0F) {
					arg9[local17] = local109 / arg3.aFloat7;
					if (arg9[local17] > 1.0F) {
						arg9[local17] = 1.0F;
					}
				}
			}
			@Pc(194) float local194 = this.aFloat38 + this.aFloat23 * (float) local33 + this.aFloat29 * (float) local38 + this.aFloat34 * (float) local50;
			@Pc(215) float local215 = this.aFloat35 + this.aFloat26 * (float) local33 + this.aFloat30 * (float) local38 + this.aFloat32 * (float) local50;
			arg5[local17] = arg4.aFloat229 + arg4.aFloat230 * local194 / local92;
			arg6[local17] = arg4.aFloat231 + arg4.aFloat232 * local215 / local92;
			arg7[local17] = arg4.aFloat233 + arg4.aFloat234 * local71 / local92;
			arg8[local17] = local92;
		}
		@Pc(263) float local263 = (float) (this.anInt338 * 76934957);
		for (@Pc(265) int local265 = 0; local265 < local6.aShort146; local265++) {
			local137 = local265 * 3;
			@Pc(277) int local277 = local137 + 1;
			@Pc(281) int local281 = local277 + 1;
			@Pc(285) float local285 = arg5[local137];
			@Pc(289) float local289 = arg5[local277];
			@Pc(293) float local293 = arg5[local281];
			@Pc(297) float local297 = arg6[local137];
			@Pc(301) float local301 = arg6[local277];
			@Pc(305) float local305 = arg6[local281];
			if ((local285 - local289) * (local305 - local301) - (local297 - local301) * (local293 - local289) > 0.0F) {
				arg4.aBoolean538 = local285 < 0.0F || local289 < 0.0F || local293 < 0.0F || local285 > (float) arg4.anInt2978 || local289 > (float) arg4.anInt2978 || local293 > (float) arg4.anInt2978;
				if (arg9[local137] + arg9[local277] + arg9[local281] < 3.0F) {
					@Pc(379) int local379 = arg0 << this.anInt336 * 1371852633;
					@Pc(386) int local386 = arg1 << this.anInt336 * 1371852633;
					if ((local6.anIntArray279[local137] & 0xFFFFFF) != 0) {
						if (local6.aShortArray69[local137] == -1 || local6.aShortArray69[local277] == -1 || local6.aShortArray69[local281] == -1) {
							if (arg9[local137] + arg9[local277] + arg9[local281] > 0.0F) {
								arg4.method21868(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], Class575.method33150(local6.anIntArray279[local137], arg3.anInt132 * 128222029, arg9[local137] * 255.0F), Class575.method33150(local6.anIntArray279[local277], arg3.anInt132 * 128222029, arg9[local277] * 255.0F), Class575.method33150(local6.anIntArray279[local281], arg3.anInt132 * 128222029, arg9[local281] * 255.0F));
							} else {
								arg4.method21868(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], local6.anIntArray279[local137], local6.anIntArray279[local277], local6.anIntArray279[local281]);
							}
						} else if (local6.aShortArray69[local137] == local6.aShortArray69[local277] && local6.aShortArray69[local137] == local6.aShortArray69[local281] && local6.aShortArray71[local137] == local6.aShortArray71[local277] && local6.aShortArray71[local137] == local6.aShortArray71[local281]) {
							arg4.method21872(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray67[local137]) / (float) local6.aShortArray71[local137], (float) (local379 + local6.aShortArray67[local277]) / (float) local6.aShortArray71[local277], (float) (local379 + local6.aShortArray67[local281]) / (float) local6.aShortArray71[local281], (float) (local386 + local6.aShortArray70[local137]) / (float) local6.aShortArray71[local137], (float) (local386 + local6.aShortArray70[local277]) / (float) local6.aShortArray71[local277], (float) (local386 + local6.aShortArray70[local281]) / (float) local6.aShortArray71[local281], local6.anIntArray279[local137], local6.anIntArray279[local277], local6.anIntArray279[local281], arg3.anInt132 * 128222029, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray69[local137] & 0xFFFF, this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShortArray69[local137] & 0xFFFF).anInt3351 * -1410868471);
						} else {
							arg4.method21874(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray67[local137]) / local263, (float) (local379 + local6.aShortArray67[local277]) / local263, (float) (local379 + local6.aShortArray67[local281]) / local263, (float) (local386 + local6.aShortArray70[local137]) / local263, (float) (local386 + local6.aShortArray70[local277]) / local263, (float) (local386 + local6.aShortArray70[local281]) / local263, local6.anIntArray279[local137], local6.anIntArray279[local277], local6.anIntArray279[local281], arg3.anInt132 * 128222029, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray69[local137] & 0xFFFF, this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShortArray69[local137] & 0xFFFF).anInt3351 * -1410868471, local263 / (float) local6.aShortArray71[local137], local6.aShortArray69[local277] & 0xFFFF, this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShortArray69[local277] & 0xFFFF).anInt3351 * -1410868471, local263 / (float) local6.aShortArray71[local277], local6.aShortArray69[local281] & 0xFFFF, this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShortArray69[local281] & 0xFFFF).anInt3351 * -1410868471, local263 / (float) local6.aShortArray71[local281]);
						}
					}
				} else {
					arg4.method21898(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg3.anInt132 * 128222029);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abo", name = "bl", descriptor = "(IIZLclient!ab;Lclient!bw;[F[F[F[F[FI)V", line = 1239)
	void method3421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) Class103 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class89 local6 = this.aClass89ArrayArray1[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(137) int local137;
		for (@Pc(17) int local17 = 0; local17 < local6.aShort145; local17++) {
			@Pc(33) int local33 = local6.aShortArray67[local17] + (arg0 << this.anInt336 * 1371852633);
			@Pc(38) int local38 = local6.aShortArray66[local17];
			@Pc(50) int local50 = local6.aShortArray70[local17] + (arg1 << this.anInt336 * 1371852633);
			@Pc(71) float local71 = this.aFloat36 + this.aFloat27 * (float) local33 + this.aFloat31 * (float) local38 + this.aFloat25 * (float) local50;
			@Pc(92) float local92 = this.aFloat37 + this.aFloat28 * (float) local33 + this.aFloat33 * (float) local38 + this.aFloat24 * (float) local50;
			if (local71 < -local92) {
				return;
			}
			arg9[local17] = 0.0F;
			@Pc(109) float local109;
			if (arg2) {
				local109 = local71 - arg3.aFloat5;
				if (local109 > 0.0F) {
					local109 /= arg3.aFloat7;
					if (local109 > 1.0F) {
						local109 = 1.0F;
					}
					arg9[local17] = local109;
					local137 = (int) ((float) local6.aShortArray68[local17] * local109);
					if (local137 > 0) {
						local38 -= local137;
					}
				}
			} else if (arg3.aBoolean43) {
				local109 = local71 - arg3.aFloat5;
				if (local109 > 0.0F) {
					arg9[local17] = local109 / arg3.aFloat7;
					if (arg9[local17] > 1.0F) {
						arg9[local17] = 1.0F;
					}
				}
			}
			@Pc(194) float local194 = this.aFloat38 + this.aFloat23 * (float) local33 + this.aFloat29 * (float) local38 + this.aFloat34 * (float) local50;
			@Pc(215) float local215 = this.aFloat35 + this.aFloat26 * (float) local33 + this.aFloat30 * (float) local38 + this.aFloat32 * (float) local50;
			arg5[local17] = arg4.aFloat229 + arg4.aFloat230 * local194 / local92;
			arg6[local17] = arg4.aFloat231 + arg4.aFloat232 * local215 / local92;
			arg7[local17] = arg4.aFloat233 + arg4.aFloat234 * local71 / local92;
			arg8[local17] = local92;
		}
		@Pc(263) float local263 = (float) (this.anInt338 * 76934957);
		for (@Pc(265) int local265 = 0; local265 < local6.aShort146; local265++) {
			local137 = local265 * 3;
			@Pc(277) int local277 = local137 + 1;
			@Pc(281) int local281 = local277 + 1;
			@Pc(285) float local285 = arg5[local137];
			@Pc(289) float local289 = arg5[local277];
			@Pc(293) float local293 = arg5[local281];
			@Pc(297) float local297 = arg6[local137];
			@Pc(301) float local301 = arg6[local277];
			@Pc(305) float local305 = arg6[local281];
			if ((local285 - local289) * (local305 - local301) - (local297 - local301) * (local293 - local289) > 0.0F) {
				arg4.aBoolean538 = local285 < 0.0F || local289 < 0.0F || local293 < 0.0F || local285 > (float) arg4.anInt2978 || local289 > (float) arg4.anInt2978 || local293 > (float) arg4.anInt2978;
				if (arg9[local137] + arg9[local277] + arg9[local281] < 3.0F) {
					@Pc(379) int local379 = arg0 << this.anInt336 * 1371852633;
					@Pc(386) int local386 = arg1 << this.anInt336 * 1371852633;
					if ((local6.anIntArray279[local137] & 0xFFFFFF) != 0) {
						if (local6.aShortArray69[local137] == -1 || local6.aShortArray69[local277] == -1 || local6.aShortArray69[local281] == -1) {
							if (arg9[local137] + arg9[local277] + arg9[local281] > 0.0F) {
								arg4.method21868(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], Class575.method33150(local6.anIntArray279[local137], arg3.anInt132 * 128222029, arg9[local137] * 255.0F), Class575.method33150(local6.anIntArray279[local277], arg3.anInt132 * 128222029, arg9[local277] * 255.0F), Class575.method33150(local6.anIntArray279[local281], arg3.anInt132 * 128222029, arg9[local281] * 255.0F));
							} else {
								arg4.method21868(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], local6.anIntArray279[local137], local6.anIntArray279[local277], local6.anIntArray279[local281]);
							}
						} else if (local6.aShortArray69[local137] == local6.aShortArray69[local277] && local6.aShortArray69[local137] == local6.aShortArray69[local281] && local6.aShortArray71[local137] == local6.aShortArray71[local277] && local6.aShortArray71[local137] == local6.aShortArray71[local281]) {
							arg4.method21872(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray67[local137]) / (float) local6.aShortArray71[local137], (float) (local379 + local6.aShortArray67[local277]) / (float) local6.aShortArray71[local277], (float) (local379 + local6.aShortArray67[local281]) / (float) local6.aShortArray71[local281], (float) (local386 + local6.aShortArray70[local137]) / (float) local6.aShortArray71[local137], (float) (local386 + local6.aShortArray70[local277]) / (float) local6.aShortArray71[local277], (float) (local386 + local6.aShortArray70[local281]) / (float) local6.aShortArray71[local281], local6.anIntArray279[local137], local6.anIntArray279[local277], local6.anIntArray279[local281], arg3.anInt132 * 128222029, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray69[local137] & 0xFFFF, this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShortArray69[local137] & 0xFFFF).anInt3351 * -1410868471);
						} else {
							arg4.method21874(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray67[local137]) / local263, (float) (local379 + local6.aShortArray67[local277]) / local263, (float) (local379 + local6.aShortArray67[local281]) / local263, (float) (local386 + local6.aShortArray70[local137]) / local263, (float) (local386 + local6.aShortArray70[local277]) / local263, (float) (local386 + local6.aShortArray70[local281]) / local263, local6.anIntArray279[local137], local6.anIntArray279[local277], local6.anIntArray279[local281], arg3.anInt132 * 128222029, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray69[local137] & 0xFFFF, this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShortArray69[local137] & 0xFFFF).anInt3351 * -1410868471, local263 / (float) local6.aShortArray71[local137], local6.aShortArray69[local277] & 0xFFFF, this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShortArray69[local277] & 0xFFFF).anInt3351 * -1410868471, local263 / (float) local6.aShortArray71[local277], local6.aShortArray69[local281] & 0xFFFF, this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShortArray69[local281] & 0xFFFF).anInt3351 * -1410868471, local263 / (float) local6.aShortArray71[local281]);
						}
					}
				} else {
					arg4.method21898(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg3.anInt132 * 128222029);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abo", name = "bi", descriptor = "(IIZLclient!ab;Lclient!bw;[F[F[F[F[FI)V", line = 1239)
	void method3422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) Class103 arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(6) Class89 local6 = this.aClass89ArrayArray1[arg0][arg1];
		if (arg10 != 0 && (arg10 & 0x2) != 0 || local6 == null) {
			return;
		}
		@Pc(137) int local137;
		for (@Pc(17) int local17 = 0; local17 < local6.aShort145; local17++) {
			@Pc(33) int local33 = local6.aShortArray67[local17] + (arg0 << this.anInt336 * 1371852633);
			@Pc(38) int local38 = local6.aShortArray66[local17];
			@Pc(50) int local50 = local6.aShortArray70[local17] + (arg1 << this.anInt336 * 1371852633);
			@Pc(71) float local71 = this.aFloat36 + this.aFloat27 * (float) local33 + this.aFloat31 * (float) local38 + this.aFloat25 * (float) local50;
			@Pc(92) float local92 = this.aFloat37 + this.aFloat28 * (float) local33 + this.aFloat33 * (float) local38 + this.aFloat24 * (float) local50;
			if (local71 < -local92) {
				return;
			}
			arg9[local17] = 0.0F;
			@Pc(109) float local109;
			if (arg2) {
				local109 = local71 - arg3.aFloat5;
				if (local109 > 0.0F) {
					local109 /= arg3.aFloat7;
					if (local109 > 1.0F) {
						local109 = 1.0F;
					}
					arg9[local17] = local109;
					local137 = (int) ((float) local6.aShortArray68[local17] * local109);
					if (local137 > 0) {
						local38 -= local137;
					}
				}
			} else if (arg3.aBoolean43) {
				local109 = local71 - arg3.aFloat5;
				if (local109 > 0.0F) {
					arg9[local17] = local109 / arg3.aFloat7;
					if (arg9[local17] > 1.0F) {
						arg9[local17] = 1.0F;
					}
				}
			}
			@Pc(194) float local194 = this.aFloat38 + this.aFloat23 * (float) local33 + this.aFloat29 * (float) local38 + this.aFloat34 * (float) local50;
			@Pc(215) float local215 = this.aFloat35 + this.aFloat26 * (float) local33 + this.aFloat30 * (float) local38 + this.aFloat32 * (float) local50;
			arg5[local17] = arg4.aFloat229 + arg4.aFloat230 * local194 / local92;
			arg6[local17] = arg4.aFloat231 + arg4.aFloat232 * local215 / local92;
			arg7[local17] = arg4.aFloat233 + arg4.aFloat234 * local71 / local92;
			arg8[local17] = local92;
		}
		@Pc(263) float local263 = (float) (this.anInt338 * 76934957);
		for (@Pc(265) int local265 = 0; local265 < local6.aShort146; local265++) {
			local137 = local265 * 3;
			@Pc(277) int local277 = local137 + 1;
			@Pc(281) int local281 = local277 + 1;
			@Pc(285) float local285 = arg5[local137];
			@Pc(289) float local289 = arg5[local277];
			@Pc(293) float local293 = arg5[local281];
			@Pc(297) float local297 = arg6[local137];
			@Pc(301) float local301 = arg6[local277];
			@Pc(305) float local305 = arg6[local281];
			if ((local285 - local289) * (local305 - local301) - (local297 - local301) * (local293 - local289) > 0.0F) {
				arg4.aBoolean538 = local285 < 0.0F || local289 < 0.0F || local293 < 0.0F || local285 > (float) arg4.anInt2978 || local289 > (float) arg4.anInt2978 || local293 > (float) arg4.anInt2978;
				if (arg9[local137] + arg9[local277] + arg9[local281] < 3.0F) {
					@Pc(379) int local379 = arg0 << this.anInt336 * 1371852633;
					@Pc(386) int local386 = arg1 << this.anInt336 * 1371852633;
					if ((local6.anIntArray279[local137] & 0xFFFFFF) != 0) {
						if (local6.aShortArray69[local137] == -1 || local6.aShortArray69[local277] == -1 || local6.aShortArray69[local281] == -1) {
							if (arg9[local137] + arg9[local277] + arg9[local281] > 0.0F) {
								arg4.method21868(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], Class575.method33150(local6.anIntArray279[local137], arg3.anInt132 * 128222029, arg9[local137] * 255.0F), Class575.method33150(local6.anIntArray279[local277], arg3.anInt132 * 128222029, arg9[local277] * 255.0F), Class575.method33150(local6.anIntArray279[local281], arg3.anInt132 * 128222029, arg9[local281] * 255.0F));
							} else {
								arg4.method21868(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], local6.anIntArray279[local137], local6.anIntArray279[local277], local6.anIntArray279[local281]);
							}
						} else if (local6.aShortArray69[local137] == local6.aShortArray69[local277] && local6.aShortArray69[local137] == local6.aShortArray69[local281] && local6.aShortArray71[local137] == local6.aShortArray71[local277] && local6.aShortArray71[local137] == local6.aShortArray71[local281]) {
							arg4.method21872(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray67[local137]) / (float) local6.aShortArray71[local137], (float) (local379 + local6.aShortArray67[local277]) / (float) local6.aShortArray71[local277], (float) (local379 + local6.aShortArray67[local281]) / (float) local6.aShortArray71[local281], (float) (local386 + local6.aShortArray70[local137]) / (float) local6.aShortArray71[local137], (float) (local386 + local6.aShortArray70[local277]) / (float) local6.aShortArray71[local277], (float) (local386 + local6.aShortArray70[local281]) / (float) local6.aShortArray71[local281], local6.anIntArray279[local137], local6.anIntArray279[local277], local6.anIntArray279[local281], arg3.anInt132 * 128222029, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray69[local137] & 0xFFFF, this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShortArray69[local137] & 0xFFFF).anInt3351 * -1410868471);
						} else {
							arg4.method21874(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg8[local137], arg8[local277], arg8[local281], (float) (local379 + local6.aShortArray67[local137]) / local263, (float) (local379 + local6.aShortArray67[local277]) / local263, (float) (local379 + local6.aShortArray67[local281]) / local263, (float) (local386 + local6.aShortArray70[local137]) / local263, (float) (local386 + local6.aShortArray70[local277]) / local263, (float) (local386 + local6.aShortArray70[local281]) / local263, local6.anIntArray279[local137], local6.anIntArray279[local277], local6.anIntArray279[local281], arg3.anInt132 * 128222029, arg9[local137] * 255.0F, arg9[local277] * 255.0F, arg9[local281] * 255.0F, local6.aShortArray69[local137] & 0xFFFF, this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShortArray69[local137] & 0xFFFF).anInt3351 * -1410868471, local263 / (float) local6.aShortArray71[local137], local6.aShortArray69[local277] & 0xFFFF, this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShortArray69[local277] & 0xFFFF).anInt3351 * -1410868471, local263 / (float) local6.aShortArray71[local277], local6.aShortArray69[local281] & 0xFFFF, this.aClass21_Sub1_6.aClass134_7.method22906(local6.aShortArray69[local281] & 0xFFFF).anInt3351 * -1410868471, local263 / (float) local6.aShortArray71[local281]);
						}
					}
				} else {
					arg4.method21898(true, true, false, local297, local301, local305, local285, local289, local293, arg7[local137], arg7[local277], arg7[local281], arg3.anInt132 * 128222029);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abo", name = "bs", descriptor = "(I)Z", line = 1321)
	boolean method3410(@OriginalArg(0) int arg0) {
		if ((this.anInt319 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!abo", name = "bu", descriptor = "(I)Z", line = 1321)
	boolean method3423(@OriginalArg(0) int arg0) {
		if ((this.anInt319 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!abo", name = "x", descriptor = "(IIIIIII[[Z)V", line = 1329)
	@Override
	public void method3545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class12 local4 = this.aClass21_Sub1_6.method3165(Thread.currentThread());
		@Pc(7) Class103 local7 = local4.aClass103_1;
		local7.anInt2973 = 0;
		local7.aBoolean538 = true;
		this.aClass21_Sub1_6.method3159();
		if (this.aClass28ArrayArray1 != null || this.aClass89ArrayArray1 != null) {
			this.method3414(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray13, local4.aFloatArray14);
		} else if (this.aClass22ArrayArray1 != null) {
			this.method3413(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray13, local4.aFloatArray14);
		}
	}

	@OriginalMember(owner = "client!abo", name = "ak", descriptor = "(IIIIIII[[Z)V", line = 1329)
	@Override
	public void method3543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class12 local4 = this.aClass21_Sub1_6.method3165(Thread.currentThread());
		@Pc(7) Class103 local7 = local4.aClass103_1;
		local7.anInt2973 = 0;
		local7.aBoolean538 = true;
		this.aClass21_Sub1_6.method3159();
		if (this.aClass28ArrayArray1 != null || this.aClass89ArrayArray1 != null) {
			this.method3414(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray13, local4.aFloatArray14);
		} else if (this.aClass22ArrayArray1 != null) {
			this.method3413(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, local4, local7, local4.aFloatArray13, local4.aFloatArray14);
		}
	}

	@OriginalMember(owner = "client!abo", name = "bm", descriptor = "(IIIIIII[[ZLclient!ab;Lclient!bw;[F[F)V", line = 1339)
	void method3413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class12 arg8, @OriginalArg(9) Class103 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean42;
		this.aClass21_Sub1_6.method17108(false);
		arg9.aBoolean537 = false;
		arg9.aBoolean540 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(85) int local85;
					if (this.aClass22ArrayArray1[local32][local37] != null) {
						@Pc(64) Class22 local64 = this.aClass22ArrayArray1[local32][local37];
						if (local64.aShort25 != -1 && (local64.aByte4 & 0x2) == 0 && local64.anInt578 == -1) {
							local85 = this.aClass21_Sub1_6.method3156(local64.aShort25 & 0xFFFF);
							arg9.method21866(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local85, local64.aShort21 & 0xFFFF), (float) Class121.method22825(local85, local64.aShort24 & 0xFFFF), (float) Class121.method22825(local85, local64.aShort23 & 0xFFFF));
							arg9.method21866(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local85, local64.aShort22 & 0xFFFF), (float) Class121.method22825(local85, local64.aShort23 & 0xFFFF), (float) Class121.method22825(local85, local64.aShort24 & 0xFFFF));
						} else if (local64.anInt578 == -1) {
							arg9.method21866(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) (local64.aShort21 & 0xFFFF), (float) (local64.aShort24 & 0xFFFF), (float) (local64.aShort23 & 0xFFFF));
							arg9.method21866(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local64.aShort22 & 0xFFFF), (float) (local64.aShort23 & 0xFFFF), (float) (local64.aShort24 & 0xFFFF));
						} else {
							local85 = local64.anInt578;
							arg9.method21866(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
							arg9.method21866(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
						}
					} else if (this.aClass74ArrayArray1[local32][local37] != null) {
						@Pc(355) Class74 local355 = this.aClass74ArrayArray1[local32][local37];
						for (local85 = 0; local85 < local355.aShort74; local85++) {
							arg10[local85] = local26 + local355.aShortArray50[local85] * local11 / (this.anInt338 * 76934957);
							arg11[local85] = local30 - local355.aShortArray49[local85] * local11 / (this.anInt338 * 76934957);
						}
						for (local85 = 0; local85 < local355.aShort73; local85++) {
							@Pc(408) short local408 = local355.aShortArray53[local85];
							@Pc(413) short local413 = local355.aShortArray56[local85];
							@Pc(418) short local418 = local355.aShortArray55[local85];
							@Pc(422) float local422 = arg10[local408];
							@Pc(426) float local426 = arg10[local413];
							@Pc(430) float local430 = arg10[local418];
							@Pc(434) float local434 = arg11[local408];
							@Pc(438) float local438 = arg11[local413];
							@Pc(442) float local442 = arg11[local418];
							@Pc(456) int local456;
							if (local355.anIntArray259 != null && local355.anIntArray259[local85] != -1) {
								local456 = local355.anIntArray259[local85];
								arg9.method21866(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local456, local355.aShortArray52[local408]), (float) Class121.method22825(local456, local355.aShortArray52[local413]), (float) Class121.method22825(local456, local355.aShortArray52[local418]));
							} else if (local355.aShortArray54 == null || local355.aShortArray54[local85] == -1) {
								local456 = local355.anIntArray258[local85];
								arg9.method21866(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local456, local355.aShortArray52[local408]), (float) Class121.method22825(local456, local355.aShortArray52[local413]), (float) Class121.method22825(local456, local355.aShortArray52[local418]));
							} else {
								local456 = this.aClass21_Sub1_6.method3156(local355.aShortArray54[local85] & 0xFFFF);
								arg9.method21866(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local456, local355.aShortArray52[local408]), (float) Class121.method22825(local456, local355.aShortArray52[local413]), (float) Class121.method22825(local456, local355.aShortArray52[local418]));
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean537 = true;
		this.aClass21_Sub1_6.method17108(local14);
	}

	@OriginalMember(owner = "client!abo", name = "bo", descriptor = "(IIIIIII[[ZLclient!ab;Lclient!bw;[F[F)V", line = 1339)
	void method3415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class12 arg8, @OriginalArg(9) Class103 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean42;
		this.aClass21_Sub1_6.method17108(false);
		arg9.aBoolean537 = false;
		arg9.aBoolean540 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(85) int local85;
					if (this.aClass22ArrayArray1[local32][local37] != null) {
						@Pc(64) Class22 local64 = this.aClass22ArrayArray1[local32][local37];
						if (local64.aShort25 != -1 && (local64.aByte4 & 0x2) == 0 && local64.anInt578 == -1) {
							local85 = this.aClass21_Sub1_6.method3156(local64.aShort25 & 0xFFFF);
							arg9.method21866(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local85, local64.aShort21 & 0xFFFF), (float) Class121.method22825(local85, local64.aShort24 & 0xFFFF), (float) Class121.method22825(local85, local64.aShort23 & 0xFFFF));
							arg9.method21866(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local85, local64.aShort22 & 0xFFFF), (float) Class121.method22825(local85, local64.aShort23 & 0xFFFF), (float) Class121.method22825(local85, local64.aShort24 & 0xFFFF));
						} else if (local64.anInt578 == -1) {
							arg9.method21866(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) (local64.aShort21 & 0xFFFF), (float) (local64.aShort24 & 0xFFFF), (float) (local64.aShort23 & 0xFFFF));
							arg9.method21866(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local64.aShort22 & 0xFFFF), (float) (local64.aShort23 & 0xFFFF), (float) (local64.aShort24 & 0xFFFF));
						} else {
							local85 = local64.anInt578;
							arg9.method21866(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
							arg9.method21866(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
						}
					} else if (this.aClass74ArrayArray1[local32][local37] != null) {
						@Pc(355) Class74 local355 = this.aClass74ArrayArray1[local32][local37];
						for (local85 = 0; local85 < local355.aShort74; local85++) {
							arg10[local85] = local26 + local355.aShortArray50[local85] * local11 / (this.anInt338 * 76934957);
							arg11[local85] = local30 - local355.aShortArray49[local85] * local11 / (this.anInt338 * 76934957);
						}
						for (local85 = 0; local85 < local355.aShort73; local85++) {
							@Pc(408) short local408 = local355.aShortArray53[local85];
							@Pc(413) short local413 = local355.aShortArray56[local85];
							@Pc(418) short local418 = local355.aShortArray55[local85];
							@Pc(422) float local422 = arg10[local408];
							@Pc(426) float local426 = arg10[local413];
							@Pc(430) float local430 = arg10[local418];
							@Pc(434) float local434 = arg11[local408];
							@Pc(438) float local438 = arg11[local413];
							@Pc(442) float local442 = arg11[local418];
							@Pc(456) int local456;
							if (local355.anIntArray259 != null && local355.anIntArray259[local85] != -1) {
								local456 = local355.anIntArray259[local85];
								arg9.method21866(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local456, local355.aShortArray52[local408]), (float) Class121.method22825(local456, local355.aShortArray52[local413]), (float) Class121.method22825(local456, local355.aShortArray52[local418]));
							} else if (local355.aShortArray54 == null || local355.aShortArray54[local85] == -1) {
								local456 = local355.anIntArray258[local85];
								arg9.method21866(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local456, local355.aShortArray52[local408]), (float) Class121.method22825(local456, local355.aShortArray52[local413]), (float) Class121.method22825(local456, local355.aShortArray52[local418]));
							} else {
								local456 = this.aClass21_Sub1_6.method3156(local355.aShortArray54[local85] & 0xFFFF);
								arg9.method21866(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local456, local355.aShortArray52[local408]), (float) Class121.method22825(local456, local355.aShortArray52[local413]), (float) Class121.method22825(local456, local355.aShortArray52[local418]));
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean537 = true;
		this.aClass21_Sub1_6.method17108(local14);
	}

	@OriginalMember(owner = "client!abo", name = "ba", descriptor = "(IIIIIII[[ZLclient!ab;Lclient!bw;[F[F)V", line = 1339)
	void method3424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class12 arg8, @OriginalArg(9) Class103 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean42;
		this.aClass21_Sub1_6.method17108(false);
		arg9.aBoolean537 = false;
		arg9.aBoolean540 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(85) int local85;
					if (this.aClass22ArrayArray1[local32][local37] != null) {
						@Pc(64) Class22 local64 = this.aClass22ArrayArray1[local32][local37];
						if (local64.aShort25 != -1 && (local64.aByte4 & 0x2) == 0 && local64.anInt578 == -1) {
							local85 = this.aClass21_Sub1_6.method3156(local64.aShort25 & 0xFFFF);
							arg9.method21866(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local85, local64.aShort21 & 0xFFFF), (float) Class121.method22825(local85, local64.aShort24 & 0xFFFF), (float) Class121.method22825(local85, local64.aShort23 & 0xFFFF));
							arg9.method21866(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local85, local64.aShort22 & 0xFFFF), (float) Class121.method22825(local85, local64.aShort23 & 0xFFFF), (float) Class121.method22825(local85, local64.aShort24 & 0xFFFF));
						} else if (local64.anInt578 == -1) {
							arg9.method21866(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) (local64.aShort21 & 0xFFFF), (float) (local64.aShort24 & 0xFFFF), (float) (local64.aShort23 & 0xFFFF));
							arg9.method21866(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) (local64.aShort22 & 0xFFFF), (float) (local64.aShort23 & 0xFFFF), (float) (local64.aShort24 & 0xFFFF));
						} else {
							local85 = local64.anInt578;
							arg9.method21866(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
							arg9.method21866(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) local85, (float) local85, (float) local85);
						}
					} else if (this.aClass74ArrayArray1[local32][local37] != null) {
						@Pc(355) Class74 local355 = this.aClass74ArrayArray1[local32][local37];
						for (local85 = 0; local85 < local355.aShort74; local85++) {
							arg10[local85] = local26 + local355.aShortArray50[local85] * local11 / (this.anInt338 * 76934957);
							arg11[local85] = local30 - local355.aShortArray49[local85] * local11 / (this.anInt338 * 76934957);
						}
						for (local85 = 0; local85 < local355.aShort73; local85++) {
							@Pc(408) short local408 = local355.aShortArray53[local85];
							@Pc(413) short local413 = local355.aShortArray56[local85];
							@Pc(418) short local418 = local355.aShortArray55[local85];
							@Pc(422) float local422 = arg10[local408];
							@Pc(426) float local426 = arg10[local413];
							@Pc(430) float local430 = arg10[local418];
							@Pc(434) float local434 = arg11[local408];
							@Pc(438) float local438 = arg11[local413];
							@Pc(442) float local442 = arg11[local418];
							@Pc(456) int local456;
							if (local355.anIntArray259 != null && local355.anIntArray259[local85] != -1) {
								local456 = local355.anIntArray259[local85];
								arg9.method21866(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local456, local355.aShortArray52[local408]), (float) Class121.method22825(local456, local355.aShortArray52[local413]), (float) Class121.method22825(local456, local355.aShortArray52[local418]));
							} else if (local355.aShortArray54 == null || local355.aShortArray54[local85] == -1) {
								local456 = local355.anIntArray258[local85];
								arg9.method21866(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local456, local355.aShortArray52[local408]), (float) Class121.method22825(local456, local355.aShortArray52[local413]), (float) Class121.method22825(local456, local355.aShortArray52[local418]));
							} else {
								local456 = this.aClass21_Sub1_6.method3156(local355.aShortArray54[local85] & 0xFFFF);
								arg9.method21866(true, true, false, local434, local438, local442, local422, local426, local430, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local456, local355.aShortArray52[local408]), (float) Class121.method22825(local456, local355.aShortArray52[local413]), (float) Class121.method22825(local456, local355.aShortArray52[local418]));
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean537 = true;
		this.aClass21_Sub1_6.method17108(local14);
	}

	@OriginalMember(owner = "client!abo", name = "be", descriptor = "(IIIIIII[[ZLclient!ab;Lclient!bw;[F[F)V", line = 1412)
	void method3408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class12 arg8, @OriginalArg(9) Class103 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean42;
		this.aClass21_Sub1_6.method17108(false);
		arg9.aBoolean537 = false;
		arg9.aBoolean540 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(87) int local87;
					@Pc(408) int local408;
					@Pc(412) int local412;
					@Pc(416) int local416;
					@Pc(420) float local420;
					@Pc(424) float local424;
					@Pc(428) float local428;
					@Pc(432) float local432;
					@Pc(436) float local436;
					@Pc(440) float local440;
					@Pc(465) int local465;
					if (this.aClass28ArrayArray1 == null) {
						if (this.aClass89ArrayArray1[local32][local37] != null) {
							@Pc(596) Class89 local596 = this.aClass89ArrayArray1[local32][local37];
							for (local87 = 0; local87 < local596.aShort145; local87++) {
								arg10[local87] = local26 + local596.aShortArray67[local87] * local11 / (this.anInt338 * 76934957);
								arg11[local87] = local30 - local596.aShortArray70[local87] * local11 / (this.anInt338 * 76934957);
							}
							for (local87 = 0; local87 < local596.aShort146; local87++) {
								local408 = local87 * 3;
								local412 = local408 + 1;
								local416 = local412 + 1;
								local420 = arg10[local408];
								local424 = arg10[local412];
								local428 = arg10[local416];
								local432 = arg11[local408];
								local436 = arg11[local412];
								local440 = arg11[local416];
								if (local596.anIntArray280 == null || local596.anIntArray280[local87] == 0) {
									arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local596.anIntArray279[local408], local596.anIntArray279[local412], local596.anIntArray279[local416]);
								} else {
									local465 = local596.anIntArray280[local87];
									arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local465, local465, local465);
								}
							}
						}
					} else if (this.aClass28ArrayArray1[local32][local37] != null) {
						@Pc(67) Class28 local67 = this.aClass28ArrayArray1[local32][local37];
						if (local67.aShort38 != -1 && (local67.aByte18 & 0x2) == 0 && local67.anInt760 == 0) {
							local87 = this.aClass21_Sub1_6.method3156(local67.aShort38 & 0xFFFF);
							arg9.method21866(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local87, local67.anInt762), (float) Class121.method22825(local87, local67.anInt763), (float) Class121.method22825(local87, local67.anInt764));
							arg9.method21866(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local87, local67.anInt761), (float) Class121.method22825(local87, local67.anInt764), (float) Class121.method22825(local87, local67.anInt763));
						} else if (local67.anInt760 == 0) {
							arg9.method21868(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, local67.anInt762, local67.anInt763, local67.anInt764);
							arg9.method21868(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt761, local67.anInt764, local67.anInt763);
						} else {
							local87 = local67.anInt760;
							arg9.method21868(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, Class594.method33426(local87, local67.anInt762 & 0xFF000000), Class594.method33426(local87, local67.anInt763 & 0xFF000000), Class594.method33426(local87, local67.anInt764 & 0xFF000000));
							arg9.method21868(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, Class594.method33426(local87, local67.anInt761 & 0xFF000000), Class594.method33426(local87, local67.anInt764 & 0xFF000000), Class594.method33426(local87, local67.anInt763 & 0xFF000000));
						}
					} else if (this.aClass83ArrayArray1[local32][local37] != null) {
						@Pc(356) Class83 local356 = this.aClass83ArrayArray1[local32][local37];
						for (local87 = 0; local87 < local356.aShort142; local87++) {
							arg10[local87] = local26 + local356.aShortArray60[local87] * local11 / (this.anInt338 * 76934957);
							arg11[local87] = local30 - local356.aShortArray65[local87] * local11 / (this.anInt338 * 76934957);
						}
						for (local87 = 0; local87 < local356.aShort143; local87++) {
							local408 = local87 * 3;
							local412 = local408 + 1;
							local416 = local412 + 1;
							local420 = arg10[local408];
							local424 = arg10[local412];
							local428 = arg10[local416];
							local432 = arg11[local408];
							local436 = arg11[local412];
							local440 = arg11[local416];
							if (local356.anIntArray276 != null && local356.anIntArray276[local87] != 0 && (local356.aShortArray64 == null || local356.aShortArray64 != null && local356.aShortArray64[local87] == -1)) {
								local465 = local356.anIntArray276[local87];
								arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, Class594.method33426(local465, -16777216 - (local356.anIntArray277[local408] & -16777216)), Class594.method33426(local465, -16777216 - (local356.anIntArray277[local412] & -16777216)), Class594.method33426(local465, -16777216 - (local356.anIntArray277[local416] & -16777216)));
							} else if (local356.aShortArray64 == null || local356.aShortArray64[local87] == -1) {
								arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local356.anIntArray277[local408], local356.anIntArray277[local412], local356.anIntArray277[local416]);
							} else {
								local465 = this.aClass21_Sub1_6.method3156(local356.aShortArray64[local87] & 0xFFFF);
								arg9.method21866(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, (float) local465, (float) local465, (float) local465);
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean537 = true;
		this.aClass21_Sub1_6.method17108(local14);
	}

	@OriginalMember(owner = "client!abo", name = "bf", descriptor = "(IIIIIII[[ZLclient!ab;Lclient!bw;[F[F)V", line = 1412)
	void method3414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class12 arg8, @OriginalArg(9) Class103 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean42;
		this.aClass21_Sub1_6.method17108(false);
		arg9.aBoolean537 = false;
		arg9.aBoolean540 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(87) int local87;
					@Pc(408) int local408;
					@Pc(412) int local412;
					@Pc(416) int local416;
					@Pc(420) float local420;
					@Pc(424) float local424;
					@Pc(428) float local428;
					@Pc(432) float local432;
					@Pc(436) float local436;
					@Pc(440) float local440;
					@Pc(465) int local465;
					if (this.aClass28ArrayArray1 == null) {
						if (this.aClass89ArrayArray1[local32][local37] != null) {
							@Pc(596) Class89 local596 = this.aClass89ArrayArray1[local32][local37];
							for (local87 = 0; local87 < local596.aShort145; local87++) {
								arg10[local87] = local26 + local596.aShortArray67[local87] * local11 / (this.anInt338 * 76934957);
								arg11[local87] = local30 - local596.aShortArray70[local87] * local11 / (this.anInt338 * 76934957);
							}
							for (local87 = 0; local87 < local596.aShort146; local87++) {
								local408 = local87 * 3;
								local412 = local408 + 1;
								local416 = local412 + 1;
								local420 = arg10[local408];
								local424 = arg10[local412];
								local428 = arg10[local416];
								local432 = arg11[local408];
								local436 = arg11[local412];
								local440 = arg11[local416];
								if (local596.anIntArray280 == null || local596.anIntArray280[local87] == 0) {
									arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local596.anIntArray279[local408], local596.anIntArray279[local412], local596.anIntArray279[local416]);
								} else {
									local465 = local596.anIntArray280[local87];
									arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local465, local465, local465);
								}
							}
						}
					} else if (this.aClass28ArrayArray1[local32][local37] != null) {
						@Pc(67) Class28 local67 = this.aClass28ArrayArray1[local32][local37];
						if (local67.aShort38 != -1 && (local67.aByte18 & 0x2) == 0 && local67.anInt760 == 0) {
							local87 = this.aClass21_Sub1_6.method3156(local67.aShort38 & 0xFFFF);
							arg9.method21866(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local87, local67.anInt762), (float) Class121.method22825(local87, local67.anInt763), (float) Class121.method22825(local87, local67.anInt764));
							arg9.method21866(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local87, local67.anInt761), (float) Class121.method22825(local87, local67.anInt764), (float) Class121.method22825(local87, local67.anInt763));
						} else if (local67.anInt760 == 0) {
							arg9.method21868(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, local67.anInt762, local67.anInt763, local67.anInt764);
							arg9.method21868(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt761, local67.anInt764, local67.anInt763);
						} else {
							local87 = local67.anInt760;
							arg9.method21868(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, Class594.method33426(local87, local67.anInt762 & 0xFF000000), Class594.method33426(local87, local67.anInt763 & 0xFF000000), Class594.method33426(local87, local67.anInt764 & 0xFF000000));
							arg9.method21868(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, Class594.method33426(local87, local67.anInt761 & 0xFF000000), Class594.method33426(local87, local67.anInt764 & 0xFF000000), Class594.method33426(local87, local67.anInt763 & 0xFF000000));
						}
					} else if (this.aClass83ArrayArray1[local32][local37] != null) {
						@Pc(356) Class83 local356 = this.aClass83ArrayArray1[local32][local37];
						for (local87 = 0; local87 < local356.aShort142; local87++) {
							arg10[local87] = local26 + local356.aShortArray60[local87] * local11 / (this.anInt338 * 76934957);
							arg11[local87] = local30 - local356.aShortArray65[local87] * local11 / (this.anInt338 * 76934957);
						}
						for (local87 = 0; local87 < local356.aShort143; local87++) {
							local408 = local87 * 3;
							local412 = local408 + 1;
							local416 = local412 + 1;
							local420 = arg10[local408];
							local424 = arg10[local412];
							local428 = arg10[local416];
							local432 = arg11[local408];
							local436 = arg11[local412];
							local440 = arg11[local416];
							if (local356.anIntArray276 != null && local356.anIntArray276[local87] != 0 && (local356.aShortArray64 == null || local356.aShortArray64 != null && local356.aShortArray64[local87] == -1)) {
								local465 = local356.anIntArray276[local87];
								arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, Class594.method33426(local465, -16777216 - (local356.anIntArray277[local408] & -16777216)), Class594.method33426(local465, -16777216 - (local356.anIntArray277[local412] & -16777216)), Class594.method33426(local465, -16777216 - (local356.anIntArray277[local416] & -16777216)));
							} else if (local356.aShortArray64 == null || local356.aShortArray64[local87] == -1) {
								arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local356.anIntArray277[local408], local356.anIntArray277[local412], local356.anIntArray277[local416]);
							} else {
								local465 = this.aClass21_Sub1_6.method3156(local356.aShortArray64[local87] & 0xFFFF);
								arg9.method21866(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, (float) local465, (float) local465, (float) local465);
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean537 = true;
		this.aClass21_Sub1_6.method17108(local14);
	}

	@OriginalMember(owner = "client!abo", name = "bc", descriptor = "(IIIIIII[[ZLclient!ab;Lclient!bw;[F[F)V", line = 1412)
	void method3425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class12 arg8, @OriginalArg(9) Class103 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean42;
		this.aClass21_Sub1_6.method17108(false);
		arg9.aBoolean537 = false;
		arg9.aBoolean540 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(87) int local87;
					@Pc(408) int local408;
					@Pc(412) int local412;
					@Pc(416) int local416;
					@Pc(420) float local420;
					@Pc(424) float local424;
					@Pc(428) float local428;
					@Pc(432) float local432;
					@Pc(436) float local436;
					@Pc(440) float local440;
					@Pc(465) int local465;
					if (this.aClass28ArrayArray1 == null) {
						if (this.aClass89ArrayArray1[local32][local37] != null) {
							@Pc(596) Class89 local596 = this.aClass89ArrayArray1[local32][local37];
							for (local87 = 0; local87 < local596.aShort145; local87++) {
								arg10[local87] = local26 + local596.aShortArray67[local87] * local11 / (this.anInt338 * 76934957);
								arg11[local87] = local30 - local596.aShortArray70[local87] * local11 / (this.anInt338 * 76934957);
							}
							for (local87 = 0; local87 < local596.aShort146; local87++) {
								local408 = local87 * 3;
								local412 = local408 + 1;
								local416 = local412 + 1;
								local420 = arg10[local408];
								local424 = arg10[local412];
								local428 = arg10[local416];
								local432 = arg11[local408];
								local436 = arg11[local412];
								local440 = arg11[local416];
								if (local596.anIntArray280 == null || local596.anIntArray280[local87] == 0) {
									arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local596.anIntArray279[local408], local596.anIntArray279[local412], local596.anIntArray279[local416]);
								} else {
									local465 = local596.anIntArray280[local87];
									arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local465, local465, local465);
								}
							}
						}
					} else if (this.aClass28ArrayArray1[local32][local37] != null) {
						@Pc(67) Class28 local67 = this.aClass28ArrayArray1[local32][local37];
						if (local67.aShort38 != -1 && (local67.aByte18 & 0x2) == 0 && local67.anInt760 == 0) {
							local87 = this.aClass21_Sub1_6.method3156(local67.aShort38 & 0xFFFF);
							arg9.method21866(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local87, local67.anInt762), (float) Class121.method22825(local87, local67.anInt763), (float) Class121.method22825(local87, local67.anInt764));
							arg9.method21866(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local87, local67.anInt761), (float) Class121.method22825(local87, local67.anInt764), (float) Class121.method22825(local87, local67.anInt763));
						} else if (local67.anInt760 == 0) {
							arg9.method21868(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, local67.anInt762, local67.anInt763, local67.anInt764);
							arg9.method21868(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt761, local67.anInt764, local67.anInt763);
						} else {
							local87 = local67.anInt760;
							arg9.method21868(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, Class594.method33426(local87, local67.anInt762 & 0xFF000000), Class594.method33426(local87, local67.anInt763 & 0xFF000000), Class594.method33426(local87, local67.anInt764 & 0xFF000000));
							arg9.method21868(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, Class594.method33426(local87, local67.anInt761 & 0xFF000000), Class594.method33426(local87, local67.anInt764 & 0xFF000000), Class594.method33426(local87, local67.anInt763 & 0xFF000000));
						}
					} else if (this.aClass83ArrayArray1[local32][local37] != null) {
						@Pc(356) Class83 local356 = this.aClass83ArrayArray1[local32][local37];
						for (local87 = 0; local87 < local356.aShort142; local87++) {
							arg10[local87] = local26 + local356.aShortArray60[local87] * local11 / (this.anInt338 * 76934957);
							arg11[local87] = local30 - local356.aShortArray65[local87] * local11 / (this.anInt338 * 76934957);
						}
						for (local87 = 0; local87 < local356.aShort143; local87++) {
							local408 = local87 * 3;
							local412 = local408 + 1;
							local416 = local412 + 1;
							local420 = arg10[local408];
							local424 = arg10[local412];
							local428 = arg10[local416];
							local432 = arg11[local408];
							local436 = arg11[local412];
							local440 = arg11[local416];
							if (local356.anIntArray276 != null && local356.anIntArray276[local87] != 0 && (local356.aShortArray64 == null || local356.aShortArray64 != null && local356.aShortArray64[local87] == -1)) {
								local465 = local356.anIntArray276[local87];
								arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, Class594.method33426(local465, -16777216 - (local356.anIntArray277[local408] & -16777216)), Class594.method33426(local465, -16777216 - (local356.anIntArray277[local412] & -16777216)), Class594.method33426(local465, -16777216 - (local356.anIntArray277[local416] & -16777216)));
							} else if (local356.aShortArray64 == null || local356.aShortArray64[local87] == -1) {
								arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local356.anIntArray277[local408], local356.anIntArray277[local412], local356.anIntArray277[local416]);
							} else {
								local465 = this.aClass21_Sub1_6.method3156(local356.aShortArray64[local87] & 0xFFFF);
								arg9.method21866(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, (float) local465, (float) local465, (float) local465);
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean537 = true;
		this.aClass21_Sub1_6.method17108(local14);
	}

	@OriginalMember(owner = "client!abo", name = "bn", descriptor = "(IIIIIII[[ZLclient!ab;Lclient!bw;[F[F)V", line = 1412)
	void method3426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7, @OriginalArg(8) Class12 arg8, @OriginalArg(9) Class103 arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) float[] arg11) {
		@Pc(7) int local7 = (arg6 - arg4) * arg2 / 256;
		@Pc(11) int local11 = arg2 >> 8;
		@Pc(14) boolean local14 = arg8.aBoolean42;
		this.aClass21_Sub1_6.method17108(false);
		arg9.aBoolean537 = false;
		arg9.aBoolean540 = false;
		@Pc(26) int local26 = arg0;
		@Pc(30) int local30 = arg1 + local7;
		for (@Pc(32) int local32 = arg3; local32 < arg5; local32++) {
			for (@Pc(37) int local37 = arg4; local37 < arg6; local37++) {
				if (arg7[local32 - arg3][local37 - arg4]) {
					@Pc(87) int local87;
					@Pc(408) int local408;
					@Pc(412) int local412;
					@Pc(416) int local416;
					@Pc(420) float local420;
					@Pc(424) float local424;
					@Pc(428) float local428;
					@Pc(432) float local432;
					@Pc(436) float local436;
					@Pc(440) float local440;
					@Pc(465) int local465;
					if (this.aClass28ArrayArray1 == null) {
						if (this.aClass89ArrayArray1[local32][local37] != null) {
							@Pc(596) Class89 local596 = this.aClass89ArrayArray1[local32][local37];
							for (local87 = 0; local87 < local596.aShort145; local87++) {
								arg10[local87] = local26 + local596.aShortArray67[local87] * local11 / (this.anInt338 * 76934957);
								arg11[local87] = local30 - local596.aShortArray70[local87] * local11 / (this.anInt338 * 76934957);
							}
							for (local87 = 0; local87 < local596.aShort146; local87++) {
								local408 = local87 * 3;
								local412 = local408 + 1;
								local416 = local412 + 1;
								local420 = arg10[local408];
								local424 = arg10[local412];
								local428 = arg10[local416];
								local432 = arg11[local408];
								local436 = arg11[local412];
								local440 = arg11[local416];
								if (local596.anIntArray280 == null || local596.anIntArray280[local87] == 0) {
									arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local596.anIntArray279[local408], local596.anIntArray279[local412], local596.anIntArray279[local416]);
								} else {
									local465 = local596.anIntArray280[local87];
									arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local465, local465, local465);
								}
							}
						}
					} else if (this.aClass28ArrayArray1[local32][local37] != null) {
						@Pc(67) Class28 local67 = this.aClass28ArrayArray1[local32][local37];
						if (local67.aShort38 != -1 && (local67.aByte18 & 0x2) == 0 && local67.anInt760 == 0) {
							local87 = this.aClass21_Sub1_6.method3156(local67.aShort38 & 0xFFFF);
							arg9.method21866(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local87, local67.anInt762), (float) Class121.method22825(local87, local67.anInt763), (float) Class121.method22825(local87, local67.anInt764));
							arg9.method21866(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, (float) Class121.method22825(local87, local67.anInt761), (float) Class121.method22825(local87, local67.anInt764), (float) Class121.method22825(local87, local67.anInt763));
						} else if (local67.anInt760 == 0) {
							arg9.method21868(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, local67.anInt762, local67.anInt763, local67.anInt764);
							arg9.method21868(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, local67.anInt761, local67.anInt764, local67.anInt763);
						} else {
							local87 = local67.anInt760;
							arg9.method21868(true, true, false, (float) (local30 - local11), (float) (local30 - local11), (float) local30, (float) (local26 + local11), (float) local26, (float) (local26 + local11), 100.0F, 100.0F, 100.0F, Class594.method33426(local87, local67.anInt762 & 0xFF000000), Class594.method33426(local87, local67.anInt763 & 0xFF000000), Class594.method33426(local87, local67.anInt764 & 0xFF000000));
							arg9.method21868(true, true, false, (float) local30, (float) local30, (float) (local30 - local11), (float) local26, (float) (local26 + local11), (float) local26, 100.0F, 100.0F, 100.0F, Class594.method33426(local87, local67.anInt761 & 0xFF000000), Class594.method33426(local87, local67.anInt764 & 0xFF000000), Class594.method33426(local87, local67.anInt763 & 0xFF000000));
						}
					} else if (this.aClass83ArrayArray1[local32][local37] != null) {
						@Pc(356) Class83 local356 = this.aClass83ArrayArray1[local32][local37];
						for (local87 = 0; local87 < local356.aShort142; local87++) {
							arg10[local87] = local26 + local356.aShortArray60[local87] * local11 / (this.anInt338 * 76934957);
							arg11[local87] = local30 - local356.aShortArray65[local87] * local11 / (this.anInt338 * 76934957);
						}
						for (local87 = 0; local87 < local356.aShort143; local87++) {
							local408 = local87 * 3;
							local412 = local408 + 1;
							local416 = local412 + 1;
							local420 = arg10[local408];
							local424 = arg10[local412];
							local428 = arg10[local416];
							local432 = arg11[local408];
							local436 = arg11[local412];
							local440 = arg11[local416];
							if (local356.anIntArray276 != null && local356.anIntArray276[local87] != 0 && (local356.aShortArray64 == null || local356.aShortArray64 != null && local356.aShortArray64[local87] == -1)) {
								local465 = local356.anIntArray276[local87];
								arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, Class594.method33426(local465, -16777216 - (local356.anIntArray277[local408] & -16777216)), Class594.method33426(local465, -16777216 - (local356.anIntArray277[local412] & -16777216)), Class594.method33426(local465, -16777216 - (local356.anIntArray277[local416] & -16777216)));
							} else if (local356.aShortArray64 == null || local356.aShortArray64[local87] == -1) {
								arg9.method21868(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, local356.anIntArray277[local408], local356.anIntArray277[local412], local356.anIntArray277[local416]);
							} else {
								local465 = this.aClass21_Sub1_6.method3156(local356.aShortArray64[local87] & 0xFFFF);
								arg9.method21866(true, true, false, local432, local436, local440, local420, local424, local428, 100.0F, 100.0F, 100.0F, (float) local465, (float) local465, (float) local465);
							}
						}
					}
				}
				local30 -= local11;
			}
			local30 = arg1 + local7;
			local26 += local11;
		}
		arg9.aBoolean537 = true;
		this.aClass21_Sub1_6.method17108(local14);
	}

	@OriginalMember(owner = "client!abo", name = "aa", descriptor = "(IILclient!amd;)Lclient!amd;", line = 1511)
	@Override
	public Class3_Sub1_Sub3 method3582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!abo", name = "c", descriptor = "(IILclient!amd;)Lclient!amd;", line = 1511)
	@Override
	public Class3_Sub1_Sub3 method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!abo", name = "aj", descriptor = "(IILclient!amd;)Lclient!amd;", line = 1511)
	@Override
	public Class3_Sub1_Sub3 method3571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!abo", name = "ah", descriptor = "(IILclient!amd;)Lclient!amd;", line = 1511)
	@Override
	public Class3_Sub1_Sub3 method3569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!abo", name = "an", descriptor = "(IILclient!amd;)Lclient!amd;", line = 1511)
	@Override
	public Class3_Sub1_Sub3 method3568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!abo", name = "ai", descriptor = "(Lclient!amd;IIIIZ)V", line = 1514)
	@Override
	public void method3573(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!abo", name = "z", descriptor = "(Lclient!amd;IIIIZ)V", line = 1514)
	@Override
	public void method3551(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!abo", name = "as", descriptor = "(Lclient!amd;IIIIZ)V", line = 1514)
	@Override
	public void method3572(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!abo", name = "n", descriptor = "(Lclient!amd;IIIIZ)Z", line = 1517)
	@Override
	public boolean method3553(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!abo", name = "aq", descriptor = "(Lclient!amd;IIIIZ)Z", line = 1517)
	@Override
	public boolean method3574(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!abo", name = "av", descriptor = "(Lclient!amd;IIIIZ)V", line = 1520)
	@Override
	public void method3575(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!abo", name = "j", descriptor = "(Lclient!amd;IIIIZ)V", line = 1520)
	@Override
	public void method3540(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!abo", name = "ax", descriptor = "(Lclient!amd;IIIIZ)V", line = 1520)
	@Override
	public void method3576(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!abo", name = "e", descriptor = "(Lclient!afz;[I)V", line = 1521)
	@Override
	public void method3554(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!abo", name = "al", descriptor = "(Lclient!afz;[I)V", line = 1521)
	@Override
	public void method3578(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!abo", name = "az", descriptor = "(Lclient!afz;[I)V", line = 1521)
	@Override
	public void method3558(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!abo", name = "ao", descriptor = "(Lclient!afz;[I)V", line = 1521)
	@Override
	public void method3579(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!abo", name = "ap", descriptor = "(Lclient!afz;[I)V", line = 1521)
	@Override
	public void method3580(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
	}
}
