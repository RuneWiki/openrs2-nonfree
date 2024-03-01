package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abh")
public class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!abh", name = "s", descriptor = "I")
	static final int anInt202 = 74;

	@OriginalMember(owner = "client!abh", name = "x", descriptor = "I")
	static final int anInt208 = 1;

	@OriginalMember(owner = "client!abh", name = "az", descriptor = "[F")
	static final float[] aFloatArray17 = new float[16];

	@OriginalMember(owner = "client!abh", name = "ak", descriptor = "Lclient!bc;")
	Class88 aClass88_1;

	@OriginalMember(owner = "client!abh", name = "k", descriptor = "[Lclient!ps;")
	Class3[] aClass3Array1;

	@OriginalMember(owner = "client!abh", name = "n", descriptor = "I")
	int anInt206;

	@OriginalMember(owner = "client!abh", name = "aa", descriptor = "Lclient!bc;")
	Class88 aClass88_2;

	@OriginalMember(owner = "client!abh", name = "w", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!abh", name = "at", descriptor = "Lclient!bu;")
	Interface5 anInterface5_1;

	@OriginalMember(owner = "client!abh", name = "af", descriptor = "Lclient!bc;")
	Class88 aClass88_3;

	@OriginalMember(owner = "client!abh", name = "j", descriptor = "I")
	int anInt209;

	@OriginalMember(owner = "client!abh", name = "ah", descriptor = "Lclient!bc;")
	Class88 aClass88_4;

	@OriginalMember(owner = "client!abh", name = "an", descriptor = "I")
	int anInt210;

	@OriginalMember(owner = "client!abh", name = "aj", descriptor = "I")
	int anInt211;

	@OriginalMember(owner = "client!abh", name = "f", descriptor = "Lclient!wk;")
	Class553 aClass553_2 = new Class553();

	@OriginalMember(owner = "client!abh", name = "u", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_24;

	@OriginalMember(owner = "client!abh", name = "y", descriptor = "I")
	int anInt207;

	@OriginalMember(owner = "client!abh", name = "b", descriptor = "I")
	int anInt203;

	@OriginalMember(owner = "client!abh", name = "c", descriptor = "I")
	int anInt204;

	@OriginalMember(owner = "client!abh", name = "z", descriptor = "I")
	final int anInt205;

	@OriginalMember(owner = "client!abh", name = "t", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!abh", name = "r", descriptor = "[[[Lclient!afb;")
	Class3_Sub2[][][] aClass3_Sub2ArrayArrayArray1;

	@OriginalMember(owner = "client!abh", name = "m", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!abh", name = "v", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!abh", name = "d", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!abh", name = "q", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!abh", name = "e", descriptor = "[[S")
	short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!abh", name = "o", descriptor = "[[B")
	byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!abh", name = "as", descriptor = "[[B")
	byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!abh", name = "ai", descriptor = "[[F")
	float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!abh", name = "aq", descriptor = "[[F")
	float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!abh", name = "av", descriptor = "[[F")
	float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!abh", name = "ax", descriptor = "Lclient!xn;")
	Class581 aClass581_1;

	@OriginalMember(owner = "client!abh", name = "i", descriptor = "Lclient!bv;")
	Class102 aClass102_1;

	@OriginalMember(owner = "client!abh", name = "<init>", descriptor = "(Lclient!abt;IIII[[I[[II)V", line = 56)
	Class17_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass21_Sub2_24 = arg0;
		this.anInt207 = this.anInt336 * 1371852633 - 2;
		this.anInt203 = 0x1 << this.anInt207;
		this.anInt204 = arg1;
		this.anInt205 = arg2;
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.aClass3_Sub2ArrayArrayArray1 = new Class3_Sub2[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.aShortArrayArray1 = new short[arg3 * arg4][];
		this.aByteArrayArray3 = new byte[arg3][arg4];
		this.aByteArrayArray4 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray1 = new float[this.anInt339 * -1007974723 + 1][this.anInt337 * -207323189 + 1];
		this.aFloatArrayArray2 = new float[this.anInt339 * -1007974723 + 1][this.anInt337 * -207323189 + 1];
		this.aFloatArrayArray3 = new float[this.anInt339 * -1007974723 + 1][this.anInt337 * -207323189 + 1];
		for (@Pc(130) int local130 = 1; local130 < this.anInt337 * -207323189; local130++) {
			for (@Pc(138) int local138 = 1; local138 < this.anInt339 * -1007974723; local138++) {
				@Pc(160) int local160 = arg6[local138 + 1][local130] - arg6[local138 - 1][local130];
				@Pc(176) int local176 = arg6[local138][local130 + 1] - arg6[local138][local130 - 1];
				@Pc(195) float local195 = (float) (1.0D / Math.sqrt((double) (local160 * local160 + arg7 * 4 * arg7 + local176 * local176)));
				this.aFloatArrayArray1[local138][local130] = (float) local160 * local195;
				this.aFloatArrayArray2[local138][local130] = (float) (-arg7 * 2) * local195;
				this.aFloatArrayArray3[local138][local130] = (float) local176 * local195;
			}
		}
		this.aClass581_1 = new Class581(128);
		if ((this.anInt205 & 0x10) != 0) {
			this.aClass102_1 = new Class102(this.aClass21_Sub2_24, this);
		}
	}

	@OriginalMember(owner = "client!abh", name = "p", descriptor = "(III)V", line = 89)
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray4.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray4[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray4[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray4[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!abh", name = "d", descriptor = "(III)V", line = 89)
	@Override
	public void method3555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray4.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray4[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray4[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray4[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!abh", name = "q", descriptor = "(III)V", line = 89)
	@Override
	public void method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray4.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray4[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray4[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray4[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!abh", name = "r", descriptor = "(III)V", line = 89)
	@Override
	public void method3539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray4.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray4[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray4[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray4[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!abh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 95)
	@Override
	public void method3541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class139 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class134 local3 = this.aClass21_Sub2_24.aClass134_7;
		if (arg5 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[this.anInt339 * -1007974723][this.anInt337 * -207323189][];
		}
		if (arg3 != null && this.anIntArrayArrayArray2 == null) {
			this.anIntArrayArrayArray2 = new int[this.anInt339 * -1007974723][this.anInt337 * -207323189][];
		}
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray4[arg0][arg1] = arg4;
		this.anIntArrayArrayArray3[arg0][arg1] = arg6;
		this.anIntArrayArrayArray1[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray2 != null) {
			this.anIntArrayArrayArray2[arg0][arg1] = arg3;
		}
		@Pc(94) Class3_Sub2[] local94 = this.aClass3_Sub2ArrayArrayArray1[arg0][arg1] = new Class3_Sub2[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt205 & 0x20) != 0 && local104 != -1 && local3.method22906(local104).aBoolean620) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3419 * -729027733) << 48 | (long) (arg10.anInt3417 * 1125508145) << 42 | (long) (arg10.anInt3422 * -470091381) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class3 local163;
			for (local163 = this.aClass581_1.method33217(local158); local163 != null; local163 = this.aClass581_1.method33218()) {
				@Pc(168) Class3_Sub2 local168 = (Class3_Sub2) local163;
				if (local168.anInt1131 == local104 && local168.aFloat141 == (float) local108 && local168.aClass139_3.method23013(arg10)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class3_Sub2(this, local104, local108, arg10);
				this.aClass581_1.method33241(local94[local96], local158);
			} else {
				local94[local96] = (Class3_Sub2) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray3[arg0][arg1] = (byte) (this.aByteArrayArray3[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt211) {
			this.anInt211 = arg6.length;
		}
		this.anInt210 += arg6.length;
	}

	@OriginalMember(owner = "client!abh", name = "o", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 95)
	@Override
	public void method3561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class139 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class134 local3 = this.aClass21_Sub2_24.aClass134_7;
		if (arg5 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[this.anInt339 * -1007974723][this.anInt337 * -207323189][];
		}
		if (arg3 != null && this.anIntArrayArrayArray2 == null) {
			this.anIntArrayArrayArray2 = new int[this.anInt339 * -1007974723][this.anInt337 * -207323189][];
		}
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray4[arg0][arg1] = arg4;
		this.anIntArrayArrayArray3[arg0][arg1] = arg6;
		this.anIntArrayArrayArray1[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray2 != null) {
			this.anIntArrayArrayArray2[arg0][arg1] = arg3;
		}
		@Pc(94) Class3_Sub2[] local94 = this.aClass3_Sub2ArrayArrayArray1[arg0][arg1] = new Class3_Sub2[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt205 & 0x20) != 0 && local104 != -1 && local3.method22906(local104).aBoolean620) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3419 * -729027733) << 48 | (long) (arg10.anInt3417 * 1125508145) << 42 | (long) (arg10.anInt3422 * -470091381) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class3 local163;
			for (local163 = this.aClass581_1.method33217(local158); local163 != null; local163 = this.aClass581_1.method33218()) {
				@Pc(168) Class3_Sub2 local168 = (Class3_Sub2) local163;
				if (local168.anInt1131 == local104 && local168.aFloat141 == (float) local108 && local168.aClass139_3.method23013(arg10)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class3_Sub2(this, local104, local108, arg10);
				this.aClass581_1.method33241(local94[local96], local158);
			} else {
				local94[local96] = (Class3_Sub2) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray3[arg0][arg1] = (byte) (this.aByteArrayArray3[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt211) {
			this.anInt211 = arg6.length;
		}
		this.anInt210 += arg6.length;
	}

	@OriginalMember(owner = "client!abh", name = "i", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 95)
	@Override
	public void method3549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class139 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class134 local3 = this.aClass21_Sub2_24.aClass134_7;
		if (arg5 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[this.anInt339 * -1007974723][this.anInt337 * -207323189][];
		}
		if (arg3 != null && this.anIntArrayArrayArray2 == null) {
			this.anIntArrayArrayArray2 = new int[this.anInt339 * -1007974723][this.anInt337 * -207323189][];
		}
		this.anIntArrayArrayArray6[arg0][arg1] = arg2;
		this.anIntArrayArrayArray4[arg0][arg1] = arg4;
		this.anIntArrayArrayArray3[arg0][arg1] = arg6;
		this.anIntArrayArrayArray1[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray2 != null) {
			this.anIntArrayArrayArray2[arg0][arg1] = arg3;
		}
		@Pc(94) Class3_Sub2[] local94 = this.aClass3_Sub2ArrayArrayArray1[arg0][arg1] = new Class3_Sub2[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt205 & 0x20) != 0 && local104 != -1 && local3.method22906(local104).aBoolean620) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3419 * -729027733) << 48 | (long) (arg10.anInt3417 * 1125508145) << 42 | (long) (arg10.anInt3422 * -470091381) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class3 local163;
			for (local163 = this.aClass581_1.method33217(local158); local163 != null; local163 = this.aClass581_1.method33218()) {
				@Pc(168) Class3_Sub2 local168 = (Class3_Sub2) local163;
				if (local168.anInt1131 == local104 && local168.aFloat141 == (float) local108 && local168.aClass139_3.method23013(arg10)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class3_Sub2(this, local104, local108, arg10);
				this.aClass581_1.method33241(local94[local96], local158);
			} else {
				local94[local96] = (Class3_Sub2) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray3[arg0][arg1] = (byte) (this.aByteArrayArray3[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt211) {
			this.anInt211 = arg6.length;
		}
		this.anInt210 += arg6.length;
	}

	@OriginalMember(owner = "client!abh", name = "g", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 131)
	@Override
	public void method3542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(26) int[] local26 = arg10 == null ? null : new int[local2 * 3];
		@Pc(31) int[] local31 = new int[local2 * 3];
		@Pc(36) int[] local36 = new int[local2 * 3];
		@Pc(45) int[] local45 = arg3 == null ? null : new int[local2 * 3];
		@Pc(54) int[] local54 = arg5 == null ? null : new int[local2 * 3];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local2; local58++) {
			@Pc(65) int local65 = arg6[local58];
			@Pc(69) int local69 = arg7[local58];
			@Pc(73) int local73 = arg8[local58];
			local7[local56] = arg2[local65];
			local12[local56] = arg4[local65];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local65];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local65];
			}
			local56++;
			local7[local56] = arg2[local69];
			local12[local56] = arg4[local69];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local69];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local69];
			}
			local56++;
			local7[local56] = arg2[local73];
			local12[local56] = arg4[local73];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local73];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local73];
			}
			local56++;
		}
		this.method3541(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!abh", name = "m", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 131)
	@Override
	public void method3567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(26) int[] local26 = arg10 == null ? null : new int[local2 * 3];
		@Pc(31) int[] local31 = new int[local2 * 3];
		@Pc(36) int[] local36 = new int[local2 * 3];
		@Pc(45) int[] local45 = arg3 == null ? null : new int[local2 * 3];
		@Pc(54) int[] local54 = arg5 == null ? null : new int[local2 * 3];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local2; local58++) {
			@Pc(65) int local65 = arg6[local58];
			@Pc(69) int local69 = arg7[local58];
			@Pc(73) int local73 = arg8[local58];
			local7[local56] = arg2[local65];
			local12[local56] = arg4[local65];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local65];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local65];
			}
			local56++;
			local7[local56] = arg2[local69];
			local12[local56] = arg4[local69];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local69];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local69];
			}
			local56++;
			local7[local56] = arg2[local73];
			local12[local56] = arg4[local73];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local73];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local73];
			}
			local56++;
		}
		this.method3541(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!abh", name = "w", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 131)
	@Override
	public void method3560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(26) int[] local26 = arg10 == null ? null : new int[local2 * 3];
		@Pc(31) int[] local31 = new int[local2 * 3];
		@Pc(36) int[] local36 = new int[local2 * 3];
		@Pc(45) int[] local45 = arg3 == null ? null : new int[local2 * 3];
		@Pc(54) int[] local54 = arg5 == null ? null : new int[local2 * 3];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local2; local58++) {
			@Pc(65) int local65 = arg6[local58];
			@Pc(69) int local69 = arg7[local58];
			@Pc(73) int local73 = arg8[local58];
			local7[local56] = arg2[local65];
			local12[local56] = arg4[local65];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local65];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local65];
			}
			local56++;
			local7[local56] = arg2[local69];
			local12[local56] = arg4[local69];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local69];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local69];
			}
			local56++;
			local7[local56] = arg2[local73];
			local12[local56] = arg4[local73];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local73];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local73];
			}
			local56++;
		}
		this.method3541(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!abh", name = "v", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 131)
	@Override
	public void method3552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(26) int[] local26 = arg10 == null ? null : new int[local2 * 3];
		@Pc(31) int[] local31 = new int[local2 * 3];
		@Pc(36) int[] local36 = new int[local2 * 3];
		@Pc(45) int[] local45 = arg3 == null ? null : new int[local2 * 3];
		@Pc(54) int[] local54 = arg5 == null ? null : new int[local2 * 3];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local2; local58++) {
			@Pc(65) int local65 = arg6[local58];
			@Pc(69) int local69 = arg7[local58];
			@Pc(73) int local73 = arg8[local58];
			local7[local56] = arg2[local65];
			local12[local56] = arg4[local65];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local65];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local65];
			}
			local56++;
			local7[local56] = arg2[local69];
			local12[local56] = arg4[local69];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local69];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local69];
			}
			local56++;
			local7[local56] = arg2[local73];
			local12[local56] = arg4[local73];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local73];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local73];
			}
			local56++;
		}
		this.method3541(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!abh", name = "t", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 131)
	@Override
	public void method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(26) int[] local26 = arg10 == null ? null : new int[local2 * 3];
		@Pc(31) int[] local31 = new int[local2 * 3];
		@Pc(36) int[] local36 = new int[local2 * 3];
		@Pc(45) int[] local45 = arg3 == null ? null : new int[local2 * 3];
		@Pc(54) int[] local54 = arg5 == null ? null : new int[local2 * 3];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local2; local58++) {
			@Pc(65) int local65 = arg6[local58];
			@Pc(69) int local69 = arg7[local58];
			@Pc(73) int local73 = arg8[local58];
			local7[local56] = arg2[local65];
			local12[local56] = arg4[local65];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local65];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local65];
			}
			local56++;
			local7[local56] = arg2[local69];
			local12[local56] = arg4[local69];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local69];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local69];
			}
			local56++;
			local7[local56] = arg2[local73];
			local12[local56] = arg4[local73];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local73];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local73];
			}
			local56++;
		}
		this.method3541(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!abh", name = "l", descriptor = "()V", line = 177)
	@Override
	public void method3546() {
		if (this.anInt210 > 0) {
			@Pc(16) byte[][] local16 = new byte[this.anInt339 * -1007974723 + 1][this.anInt337 * -207323189 + 1];
			@Pc(18) int local18;
			for (local18 = 1; local18 < this.anInt339 * -1007974723; local18++) {
				for (@Pc(26) int local26 = 1; local26 < this.anInt337 * -207323189; local26++) {
					local16[local18][local26] = (byte) ((this.aByteArrayArray4[local18 - 1][local26] >> 2) + (this.aByteArrayArray4[local18 + 1][local26] >> 3) + (this.aByteArrayArray4[local18][local26 - 1] >> 2) + (this.aByteArrayArray4[local18][local26 + 1] >> 3) + (this.aByteArrayArray4[local18][local26] >> 1));
				}
			}
			this.aClass3Array1 = new Class3[this.aClass581_1.method33220()];
			this.aClass581_1.method33223(this.aClass3Array1);
			for (local18 = 0; local18 < this.aClass3Array1.length; local18++) {
				((Class3_Sub2) this.aClass3Array1[local18]).method9947(this.anInt210);
			}
			local18 = 24;
			if (this.anIntArrayArrayArray5 != null) {
				local18 += 4;
			}
			if ((this.anInt205 & 0x7) != 0) {
				local18 += 12;
			}
			@Pc(147) NativeHeapBuffer local147 = this.aClass21_Sub2_24.aNativeHeap1.a(this.anInt210 * local18, false);
			@Pc(152) Stream local152 = new Stream(local147);
			@Pc(156) Class3_Sub2[] local156 = new Class3_Sub2[this.anInt210];
			@Pc(163) int local163 = Class525.method32379(this.anInt210 / 4);
			if (local163 < 1) {
				local163 = 1;
			}
			@Pc(173) Class581 local173 = new Class581(local163);
			@Pc(177) Class3_Sub2[] local177 = new Class3_Sub2[this.anInt211];
			@Pc(179) int local179;
			@Pc(187) int local187;
			for (local179 = 0; local179 < this.anInt339 * -1007974723; local179++) {
				for (local187 = 0; local187 < this.anInt337 * -207323189; local187++) {
					if (this.anIntArrayArrayArray3[local179][local187] != null) {
						@Pc(208) Class3_Sub2[] local208 = this.aClass3_Sub2ArrayArrayArray1[local179][local187];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray6[local179][local187];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray4[local179][local187];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray1[local179][local187];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray3[local179][local187];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray2 == null ? null : this.anIntArrayArrayArray2[local179][local187];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local179][local187];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(271) float local271 = this.aFloatArrayArray1[local179][local187];
						@Pc(278) float local278 = this.aFloatArrayArray2[local179][local187];
						@Pc(285) float local285 = this.aFloatArrayArray3[local179][local187];
						@Pc(294) float local294 = this.aFloatArrayArray1[local179][local187 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray2[local179][local187 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray3[local179][local187 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray1[local179 + 1][local187 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray2[local179 + 1][local187 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray3[local179 + 1][local187 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray1[local179 + 1][local187];
						@Pc(363) float local363 = this.aFloatArrayArray2[local179 + 1][local187];
						@Pc(372) float local372 = this.aFloatArrayArray3[local179 + 1][local187];
						@Pc(380) int local380 = local16[local179][local187] & 0xFF;
						@Pc(390) int local390 = local16[local179][local187 + 1] & 0xFF;
						@Pc(402) int local402 = local16[local179 + 1][local187 + 1] & 0xFF;
						@Pc(412) int local412 = local16[local179 + 1][local187] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(426) int local426;
						label346: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(424) Class3_Sub2 local424 = local208[local416];
							for (local426 = 0; local426 < local414; local426++) {
								if (local177[local426] == local424) {
									continue label346;
								}
							}
							local177[local414++] = local424;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray1[local187 * this.anInt339 * -1007974723 + local179] = new short[local236.length];
						for (@Pc(462) int local462 = 0; local462 < local236.length; local462++) {
							@Pc(477) int local477 = (local179 << this.anInt336 * 1371852633) + local215[local462];
							@Pc(488) int local488 = (local187 << this.anInt336 * 1371852633) + local222[local462];
							@Pc(493) int local493 = local477 >> this.anInt207;
							@Pc(498) int local498 = local488 >> this.anInt207;
							@Pc(502) int local502 = local236[local462];
							@Pc(506) int local506 = local229[local462];
							@Pc(514) int local514 = local248 == null ? 0 : local248[local462];
							@Pc(532) long local532 = (long) local506 << 48 | (long) local502 << 32 | (long) (local493 << 16) | (long) local498;
							@Pc(536) int local536 = local215[local462];
							@Pc(540) int local540 = local222[local462];
							@Pc(542) byte local542 = 74;
							@Pc(544) int local544 = 0;
							@Pc(546) float local546 = 1.0F;
							@Pc(552) float local552;
							@Pc(554) float local554;
							@Pc(556) float local556;
							@Pc(656) float local656;
							@Pc(560) int local560;
							if (local536 == 0 && local540 == 0) {
								local552 = local271;
								local554 = local278;
								local556 = local285;
								local560 = local542 - local380;
							} else if (local536 == 0 && local540 == this.anInt338 * 76934957) {
								local552 = local294;
								local554 = local303;
								local556 = local312;
								local560 = local542 - local390;
							} else if (local536 == this.anInt338 * 76934957 && local540 == this.anInt338 * 76934957) {
								local552 = local323;
								local554 = local334;
								local556 = local345;
								local560 = local542 - local402;
							} else if (local536 == this.anInt338 * 76934957 && local540 == 0) {
								local552 = local354;
								local554 = local363;
								local556 = local372;
								local560 = local542 - local412;
							} else {
								@Pc(631) float local631 = (float) local536 / (float) (this.anInt338 * 76934957);
								@Pc(640) float local640 = (float) local540 / (float) (this.anInt338 * 76934957);
								@Pc(648) float local648 = local271 + (local354 - local271) * local631;
								local656 = local278 + (local363 - local278) * local631;
								@Pc(664) float local664 = local285 + (local372 - local285) * local631;
								@Pc(672) float local672 = local294 + (local323 - local294) * local631;
								@Pc(680) float local680 = local303 + (local334 - local303) * local631;
								@Pc(688) float local688 = local312 + (local345 - local312) * local631;
								local552 = local648 + (local672 - local648) * local640;
								local554 = local656 + (local680 - local656) * local640;
								local556 = local664 + (local688 - local664) * local640;
								@Pc(725) int local725 = local380 + ((local412 - local380) * local536 >> this.anInt336 * 1371852633);
								@Pc(738) int local738 = local390 + ((local402 - local390) * local536 >> this.anInt336 * 1371852633);
								local560 = local542 - (local725 + ((local738 - local725) * local540 >> this.anInt336 * 1371852633));
							}
							if (local502 != -1) {
								@Pc(764) int local764 = (local502 & 0x7F) * local560 >> 7;
								if (local764 < 2) {
									local764 = 2;
								} else if (local764 > 126) {
									local764 = 126;
								}
								local544 = Class360.anIntArray422[local502 & 0xFF80 | local764];
								if ((this.anInt205 & 0x7) == 0) {
									local546 = this.aClass21_Sub2_24.aFloatArray26[0] * local552 + this.aClass21_Sub2_24.aFloatArray26[1] * local554 + this.aClass21_Sub2_24.aFloatArray26[2] * local556;
									local546 = this.aClass21_Sub2_24.aFloat44 + local546 * (local546 > 0.0F ? this.aClass21_Sub2_24.aFloat54 : this.aClass21_Sub2_24.aFloat61);
								}
							}
							@Pc(832) Class3 local832 = null;
							if ((local477 & this.anInt203 - 1) == 0 && (local488 & this.anInt203 - 1) == 0) {
								local832 = local173.method33217(local532);
							}
							@Pc(882) int local882;
							if (local832 == null) {
								if (local506 == local502) {
									local882 = local544;
								} else {
									@Pc(863) int local863 = (local506 & 0x7F) * local560 >> 7;
									if (local863 < 2) {
										local863 = 2;
									} else if (local863 > 126) {
										local863 = 126;
									}
									local882 = Class360.anIntArray422[local506 & 0xFF80 | local863];
									if ((this.anInt205 & 0x7) == 0) {
										@Pc(910) float local910 = this.aClass21_Sub2_24.aFloatArray26[0] * local552 + this.aClass21_Sub2_24.aFloatArray26[1] * local554 + this.aClass21_Sub2_24.aFloatArray26[2] * local556;
										local656 = this.aClass21_Sub2_24.aFloat44 + local546 * (local546 > 0.0F ? this.aClass21_Sub2_24.aFloat54 : this.aClass21_Sub2_24.aFloat61);
										@Pc(935) int local935 = local882 >> 16 & 0xFF;
										@Pc(941) int local941 = local882 >> 8 & 0xFF;
										@Pc(945) int local945 = local882 & 0xFF;
										local935 = (int) ((float) local935 * local656);
										if (local935 < 0) {
											local935 = 0;
										} else if (local935 > 255) {
											local935 = 255;
										}
										local941 = (int) ((float) local941 * local656);
										if (local941 < 0) {
											local941 = 0;
										} else if (local941 > 255) {
											local941 = 255;
										}
										local945 = (int) ((float) local945 * local656);
										if (local945 < 0) {
											local945 = 0;
										} else if (local945 > 255) {
											local945 = 255;
										}
										local882 = local935 << 16 | local941 << 8 | local945;
									}
								}
								if (this.aClass21_Sub2_24.aBoolean63) {
									local152.h((float) local477);
									local152.h((float) (this.method3583(local477, local488) + local514));
									local152.h((float) local488);
									local152.l((byte) (local882 >> 16));
									local152.l((byte) (local882 >> 8));
									local152.l((byte) local882);
									local152.l(-1);
									local152.h((float) local477);
									local152.h((float) local488);
									if (this.anIntArrayArrayArray5 != null) {
										local152.h(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt205 & 0x7) != 0) {
										local152.h(local552);
										local152.h(local554);
										local152.h(local556);
									}
								} else {
									local152.x((float) local477);
									local152.x((float) (this.method3583(local477, local488) + local514));
									local152.x((float) local488);
									local152.l((byte) (local882 >> 16));
									local152.l((byte) (local882 >> 8));
									local152.l((byte) local882);
									local152.l(-1);
									local152.x((float) local477);
									local152.x((float) local488);
									if (this.anIntArrayArrayArray5 != null) {
										local152.x(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt205 & 0x7) != 0) {
										local152.x(local552);
										local152.x(local554);
										local152.x(local556);
									}
								}
								local426 = this.anInt209++;
								local460[local462] = (short) local426;
								if (local502 != -1) {
									local156[local426] = local208[local462];
								}
								local173.method33241(new Class3_Sub34(local460[local462]), local532);
							} else {
								local460[local462] = ((Class3_Sub34) local832).aShort63;
								local426 = local460[local462] & 0xFFFF;
								if (local502 != -1 && local208[local462].aLong296 * -1930649055099428229L < local156[local426].aLong296 * -1930649055099428229L) {
									local156[local426] = local208[local462];
								}
							}
							for (local882 = 0; local882 < local414; local882++) {
								local177[local882].method9950(local426, local544, local560, local546);
							}
							this.anInt206++;
						}
					}
				}
			}
			for (local179 = 0; local179 < this.anInt209; local179++) {
				@Pc(1263) Class3_Sub2 local1263 = local156[local179];
				if (local1263 != null) {
					local1263.method9953(local179);
				}
			}
			for (local179 = 0; local179 < this.anInt339 * -1007974723; local179++) {
				for (local187 = 0; local187 < this.anInt337 * -207323189; local187++) {
					@Pc(1298) short[] local1298 = this.aShortArrayArray1[local187 * this.anInt339 * -1007974723 + local179];
					if (local1298 != null) {
						@Pc(1302) int local1302 = 0;
						@Pc(1304) int local1304 = 0;
						while (local1304 < local1298.length) {
							@Pc(1315) int local1315 = local1298[local1304++] & 0xFFFF;
							@Pc(1322) int local1322 = local1298[local1304++] & 0xFFFF;
							@Pc(1329) int local1329 = local1298[local1304++] & 0xFFFF;
							@Pc(1333) Class3_Sub2 local1333 = local156[local1315];
							@Pc(1337) Class3_Sub2 local1337 = local156[local1322];
							@Pc(1341) Class3_Sub2 local1341 = local156[local1329];
							@Pc(1343) Class3_Sub2 local1343 = null;
							if (local1333 != null) {
								local1333.method9949(local179, local187, local1302);
								local1343 = local1333;
							}
							if (local1337 != null) {
								local1337.method9949(local179, local187, local1302);
								if (local1343 == null || local1337.aLong296 * -1930649055099428229L < local1343.aLong296 * -1930649055099428229L) {
									local1343 = local1337;
								}
							}
							if (local1341 != null) {
								local1341.method9949(local179, local187, local1302);
								if (local1343 == null || local1341.aLong296 * -1930649055099428229L < local1343.aLong296 * -1930649055099428229L) {
									local1343 = local1341;
								}
							}
							if (local1343 != null) {
								if (local1333 != null) {
									local1343.method9953(local1315);
								}
								if (local1337 != null) {
									local1343.method9953(local1322);
								}
								if (local1341 != null) {
									local1343.method9953(local1329);
								}
								local1343.method9949(local179, local187, local1302);
							}
							local1302++;
						}
					}
				}
			}
			local152.s();
			this.anInterface5_1 = this.aClass21_Sub2_24.method4062(local18, local147, local152.a(), false);
			if (this.anInterface5_1 instanceof Class8_Sub2) {
				local147.n();
			}
			this.aClass88_3 = new Class88(this.anInterface5_1, 5126, 3, 0);
			this.aClass88_1 = new Class88(this.anInterface5_1, 5121, 4, 12);
			@Pc(1475) byte local1475;
			if (this.anIntArrayArrayArray5 == null) {
				this.aClass88_4 = new Class88(this.anInterface5_1, 5126, 2, 16);
				local1475 = 24;
			} else {
				this.aClass88_4 = new Class88(this.anInterface5_1, 5126, 3, 16);
				local1475 = 28;
			}
			if ((this.anInt205 & 0x7) != 0) {
				this.aClass88_2 = new Class88(this.anInterface5_1, 5126, 3, local1475);
			}
			@Pc(1508) long[] local1508 = new long[this.aClass3Array1.length];
			for (@Pc(1510) int local1510 = 0; local1510 < this.aClass3Array1.length; local1510++) {
				@Pc(1521) Class3_Sub2 local1521 = (Class3_Sub2) this.aClass3Array1[local1510];
				local1508[local1510] = local1521.aLong296 * -1930649055099428229L;
				local1521.method9951(this.anInt209);
			}
			Class170.method23361(local1508, this.aClass3Array1);
			if (this.aClass102_1 != null) {
				this.aClass102_1.method21838();
			}
		} else {
			this.aClass102_1 = null;
		}
		if ((this.anInt204 & 0x2) == 0) {
			this.anIntArrayArrayArray4 = null;
			this.anIntArrayArrayArray6 = null;
			this.anIntArrayArrayArray3 = null;
		}
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray1 = null;
		this.anIntArrayArrayArray2 = null;
		this.aClass3_Sub2ArrayArrayArray1 = null;
		this.aByteArrayArray4 = null;
		this.aClass581_1 = null;
		this.aFloatArrayArray3 = null;
		this.aFloatArrayArray2 = null;
		this.aFloatArrayArray1 = null;
	}

	@OriginalMember(owner = "client!abh", name = "f", descriptor = "()V", line = 177)
	@Override
	public void method3563() {
		if (this.anInt210 > 0) {
			@Pc(16) byte[][] local16 = new byte[this.anInt339 * -1007974723 + 1][this.anInt337 * -207323189 + 1];
			@Pc(18) int local18;
			for (local18 = 1; local18 < this.anInt339 * -1007974723; local18++) {
				for (@Pc(26) int local26 = 1; local26 < this.anInt337 * -207323189; local26++) {
					local16[local18][local26] = (byte) ((this.aByteArrayArray4[local18 - 1][local26] >> 2) + (this.aByteArrayArray4[local18 + 1][local26] >> 3) + (this.aByteArrayArray4[local18][local26 - 1] >> 2) + (this.aByteArrayArray4[local18][local26 + 1] >> 3) + (this.aByteArrayArray4[local18][local26] >> 1));
				}
			}
			this.aClass3Array1 = new Class3[this.aClass581_1.method33220()];
			this.aClass581_1.method33223(this.aClass3Array1);
			for (local18 = 0; local18 < this.aClass3Array1.length; local18++) {
				((Class3_Sub2) this.aClass3Array1[local18]).method9947(this.anInt210);
			}
			local18 = 24;
			if (this.anIntArrayArrayArray5 != null) {
				local18 += 4;
			}
			if ((this.anInt205 & 0x7) != 0) {
				local18 += 12;
			}
			@Pc(147) NativeHeapBuffer local147 = this.aClass21_Sub2_24.aNativeHeap1.a(this.anInt210 * local18, false);
			@Pc(152) Stream local152 = new Stream(local147);
			@Pc(156) Class3_Sub2[] local156 = new Class3_Sub2[this.anInt210];
			@Pc(163) int local163 = Class525.method32379(this.anInt210 / 4);
			if (local163 < 1) {
				local163 = 1;
			}
			@Pc(173) Class581 local173 = new Class581(local163);
			@Pc(177) Class3_Sub2[] local177 = new Class3_Sub2[this.anInt211];
			@Pc(179) int local179;
			@Pc(187) int local187;
			for (local179 = 0; local179 < this.anInt339 * -1007974723; local179++) {
				for (local187 = 0; local187 < this.anInt337 * -207323189; local187++) {
					if (this.anIntArrayArrayArray3[local179][local187] != null) {
						@Pc(208) Class3_Sub2[] local208 = this.aClass3_Sub2ArrayArrayArray1[local179][local187];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray6[local179][local187];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray4[local179][local187];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray1[local179][local187];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray3[local179][local187];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray2 == null ? null : this.anIntArrayArrayArray2[local179][local187];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local179][local187];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(271) float local271 = this.aFloatArrayArray1[local179][local187];
						@Pc(278) float local278 = this.aFloatArrayArray2[local179][local187];
						@Pc(285) float local285 = this.aFloatArrayArray3[local179][local187];
						@Pc(294) float local294 = this.aFloatArrayArray1[local179][local187 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray2[local179][local187 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray3[local179][local187 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray1[local179 + 1][local187 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray2[local179 + 1][local187 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray3[local179 + 1][local187 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray1[local179 + 1][local187];
						@Pc(363) float local363 = this.aFloatArrayArray2[local179 + 1][local187];
						@Pc(372) float local372 = this.aFloatArrayArray3[local179 + 1][local187];
						@Pc(380) int local380 = local16[local179][local187] & 0xFF;
						@Pc(390) int local390 = local16[local179][local187 + 1] & 0xFF;
						@Pc(402) int local402 = local16[local179 + 1][local187 + 1] & 0xFF;
						@Pc(412) int local412 = local16[local179 + 1][local187] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(426) int local426;
						label346: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(424) Class3_Sub2 local424 = local208[local416];
							for (local426 = 0; local426 < local414; local426++) {
								if (local177[local426] == local424) {
									continue label346;
								}
							}
							local177[local414++] = local424;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray1[local187 * this.anInt339 * -1007974723 + local179] = new short[local236.length];
						for (@Pc(462) int local462 = 0; local462 < local236.length; local462++) {
							@Pc(477) int local477 = (local179 << this.anInt336 * 1371852633) + local215[local462];
							@Pc(488) int local488 = (local187 << this.anInt336 * 1371852633) + local222[local462];
							@Pc(493) int local493 = local477 >> this.anInt207;
							@Pc(498) int local498 = local488 >> this.anInt207;
							@Pc(502) int local502 = local236[local462];
							@Pc(506) int local506 = local229[local462];
							@Pc(514) int local514 = local248 == null ? 0 : local248[local462];
							@Pc(532) long local532 = (long) local506 << 48 | (long) local502 << 32 | (long) (local493 << 16) | (long) local498;
							@Pc(536) int local536 = local215[local462];
							@Pc(540) int local540 = local222[local462];
							@Pc(542) byte local542 = 74;
							@Pc(544) int local544 = 0;
							@Pc(546) float local546 = 1.0F;
							@Pc(552) float local552;
							@Pc(554) float local554;
							@Pc(556) float local556;
							@Pc(656) float local656;
							@Pc(560) int local560;
							if (local536 == 0 && local540 == 0) {
								local552 = local271;
								local554 = local278;
								local556 = local285;
								local560 = local542 - local380;
							} else if (local536 == 0 && local540 == this.anInt338 * 76934957) {
								local552 = local294;
								local554 = local303;
								local556 = local312;
								local560 = local542 - local390;
							} else if (local536 == this.anInt338 * 76934957 && local540 == this.anInt338 * 76934957) {
								local552 = local323;
								local554 = local334;
								local556 = local345;
								local560 = local542 - local402;
							} else if (local536 == this.anInt338 * 76934957 && local540 == 0) {
								local552 = local354;
								local554 = local363;
								local556 = local372;
								local560 = local542 - local412;
							} else {
								@Pc(631) float local631 = (float) local536 / (float) (this.anInt338 * 76934957);
								@Pc(640) float local640 = (float) local540 / (float) (this.anInt338 * 76934957);
								@Pc(648) float local648 = local271 + (local354 - local271) * local631;
								local656 = local278 + (local363 - local278) * local631;
								@Pc(664) float local664 = local285 + (local372 - local285) * local631;
								@Pc(672) float local672 = local294 + (local323 - local294) * local631;
								@Pc(680) float local680 = local303 + (local334 - local303) * local631;
								@Pc(688) float local688 = local312 + (local345 - local312) * local631;
								local552 = local648 + (local672 - local648) * local640;
								local554 = local656 + (local680 - local656) * local640;
								local556 = local664 + (local688 - local664) * local640;
								@Pc(725) int local725 = local380 + ((local412 - local380) * local536 >> this.anInt336 * 1371852633);
								@Pc(738) int local738 = local390 + ((local402 - local390) * local536 >> this.anInt336 * 1371852633);
								local560 = local542 - (local725 + ((local738 - local725) * local540 >> this.anInt336 * 1371852633));
							}
							if (local502 != -1) {
								@Pc(764) int local764 = (local502 & 0x7F) * local560 >> 7;
								if (local764 < 2) {
									local764 = 2;
								} else if (local764 > 126) {
									local764 = 126;
								}
								local544 = Class360.anIntArray422[local502 & 0xFF80 | local764];
								if ((this.anInt205 & 0x7) == 0) {
									local546 = this.aClass21_Sub2_24.aFloatArray26[0] * local552 + this.aClass21_Sub2_24.aFloatArray26[1] * local554 + this.aClass21_Sub2_24.aFloatArray26[2] * local556;
									local546 = this.aClass21_Sub2_24.aFloat44 + local546 * (local546 > 0.0F ? this.aClass21_Sub2_24.aFloat54 : this.aClass21_Sub2_24.aFloat61);
								}
							}
							@Pc(832) Class3 local832 = null;
							if ((local477 & this.anInt203 - 1) == 0 && (local488 & this.anInt203 - 1) == 0) {
								local832 = local173.method33217(local532);
							}
							@Pc(882) int local882;
							if (local832 == null) {
								if (local506 == local502) {
									local882 = local544;
								} else {
									@Pc(863) int local863 = (local506 & 0x7F) * local560 >> 7;
									if (local863 < 2) {
										local863 = 2;
									} else if (local863 > 126) {
										local863 = 126;
									}
									local882 = Class360.anIntArray422[local506 & 0xFF80 | local863];
									if ((this.anInt205 & 0x7) == 0) {
										@Pc(910) float local910 = this.aClass21_Sub2_24.aFloatArray26[0] * local552 + this.aClass21_Sub2_24.aFloatArray26[1] * local554 + this.aClass21_Sub2_24.aFloatArray26[2] * local556;
										local656 = this.aClass21_Sub2_24.aFloat44 + local546 * (local546 > 0.0F ? this.aClass21_Sub2_24.aFloat54 : this.aClass21_Sub2_24.aFloat61);
										@Pc(935) int local935 = local882 >> 16 & 0xFF;
										@Pc(941) int local941 = local882 >> 8 & 0xFF;
										@Pc(945) int local945 = local882 & 0xFF;
										local935 = (int) ((float) local935 * local656);
										if (local935 < 0) {
											local935 = 0;
										} else if (local935 > 255) {
											local935 = 255;
										}
										local941 = (int) ((float) local941 * local656);
										if (local941 < 0) {
											local941 = 0;
										} else if (local941 > 255) {
											local941 = 255;
										}
										local945 = (int) ((float) local945 * local656);
										if (local945 < 0) {
											local945 = 0;
										} else if (local945 > 255) {
											local945 = 255;
										}
										local882 = local935 << 16 | local941 << 8 | local945;
									}
								}
								if (this.aClass21_Sub2_24.aBoolean63) {
									local152.h((float) local477);
									local152.h((float) (this.method3583(local477, local488) + local514));
									local152.h((float) local488);
									local152.l((byte) (local882 >> 16));
									local152.l((byte) (local882 >> 8));
									local152.l((byte) local882);
									local152.l(-1);
									local152.h((float) local477);
									local152.h((float) local488);
									if (this.anIntArrayArrayArray5 != null) {
										local152.h(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt205 & 0x7) != 0) {
										local152.h(local552);
										local152.h(local554);
										local152.h(local556);
									}
								} else {
									local152.x((float) local477);
									local152.x((float) (this.method3583(local477, local488) + local514));
									local152.x((float) local488);
									local152.l((byte) (local882 >> 16));
									local152.l((byte) (local882 >> 8));
									local152.l((byte) local882);
									local152.l(-1);
									local152.x((float) local477);
									local152.x((float) local488);
									if (this.anIntArrayArrayArray5 != null) {
										local152.x(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt205 & 0x7) != 0) {
										local152.x(local552);
										local152.x(local554);
										local152.x(local556);
									}
								}
								local426 = this.anInt209++;
								local460[local462] = (short) local426;
								if (local502 != -1) {
									local156[local426] = local208[local462];
								}
								local173.method33241(new Class3_Sub34(local460[local462]), local532);
							} else {
								local460[local462] = ((Class3_Sub34) local832).aShort63;
								local426 = local460[local462] & 0xFFFF;
								if (local502 != -1 && local208[local462].aLong296 * -1930649055099428229L < local156[local426].aLong296 * -1930649055099428229L) {
									local156[local426] = local208[local462];
								}
							}
							for (local882 = 0; local882 < local414; local882++) {
								local177[local882].method9950(local426, local544, local560, local546);
							}
							this.anInt206++;
						}
					}
				}
			}
			for (local179 = 0; local179 < this.anInt209; local179++) {
				@Pc(1263) Class3_Sub2 local1263 = local156[local179];
				if (local1263 != null) {
					local1263.method9953(local179);
				}
			}
			for (local179 = 0; local179 < this.anInt339 * -1007974723; local179++) {
				for (local187 = 0; local187 < this.anInt337 * -207323189; local187++) {
					@Pc(1298) short[] local1298 = this.aShortArrayArray1[local187 * this.anInt339 * -1007974723 + local179];
					if (local1298 != null) {
						@Pc(1302) int local1302 = 0;
						@Pc(1304) int local1304 = 0;
						while (local1304 < local1298.length) {
							@Pc(1315) int local1315 = local1298[local1304++] & 0xFFFF;
							@Pc(1322) int local1322 = local1298[local1304++] & 0xFFFF;
							@Pc(1329) int local1329 = local1298[local1304++] & 0xFFFF;
							@Pc(1333) Class3_Sub2 local1333 = local156[local1315];
							@Pc(1337) Class3_Sub2 local1337 = local156[local1322];
							@Pc(1341) Class3_Sub2 local1341 = local156[local1329];
							@Pc(1343) Class3_Sub2 local1343 = null;
							if (local1333 != null) {
								local1333.method9949(local179, local187, local1302);
								local1343 = local1333;
							}
							if (local1337 != null) {
								local1337.method9949(local179, local187, local1302);
								if (local1343 == null || local1337.aLong296 * -1930649055099428229L < local1343.aLong296 * -1930649055099428229L) {
									local1343 = local1337;
								}
							}
							if (local1341 != null) {
								local1341.method9949(local179, local187, local1302);
								if (local1343 == null || local1341.aLong296 * -1930649055099428229L < local1343.aLong296 * -1930649055099428229L) {
									local1343 = local1341;
								}
							}
							if (local1343 != null) {
								if (local1333 != null) {
									local1343.method9953(local1315);
								}
								if (local1337 != null) {
									local1343.method9953(local1322);
								}
								if (local1341 != null) {
									local1343.method9953(local1329);
								}
								local1343.method9949(local179, local187, local1302);
							}
							local1302++;
						}
					}
				}
			}
			local152.s();
			this.anInterface5_1 = this.aClass21_Sub2_24.method4062(local18, local147, local152.a(), false);
			if (this.anInterface5_1 instanceof Class8_Sub2) {
				local147.n();
			}
			this.aClass88_3 = new Class88(this.anInterface5_1, 5126, 3, 0);
			this.aClass88_1 = new Class88(this.anInterface5_1, 5121, 4, 12);
			@Pc(1475) byte local1475;
			if (this.anIntArrayArrayArray5 == null) {
				this.aClass88_4 = new Class88(this.anInterface5_1, 5126, 2, 16);
				local1475 = 24;
			} else {
				this.aClass88_4 = new Class88(this.anInterface5_1, 5126, 3, 16);
				local1475 = 28;
			}
			if ((this.anInt205 & 0x7) != 0) {
				this.aClass88_2 = new Class88(this.anInterface5_1, 5126, 3, local1475);
			}
			@Pc(1508) long[] local1508 = new long[this.aClass3Array1.length];
			for (@Pc(1510) int local1510 = 0; local1510 < this.aClass3Array1.length; local1510++) {
				@Pc(1521) Class3_Sub2 local1521 = (Class3_Sub2) this.aClass3Array1[local1510];
				local1508[local1510] = local1521.aLong296 * -1930649055099428229L;
				local1521.method9951(this.anInt209);
			}
			Class170.method23361(local1508, this.aClass3Array1);
			if (this.aClass102_1 != null) {
				this.aClass102_1.method21838();
			}
		} else {
			this.aClass102_1 = null;
		}
		if ((this.anInt204 & 0x2) == 0) {
			this.anIntArrayArrayArray4 = null;
			this.anIntArrayArrayArray6 = null;
			this.anIntArrayArrayArray3 = null;
		}
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray1 = null;
		this.anIntArrayArrayArray2 = null;
		this.aClass3_Sub2ArrayArrayArray1 = null;
		this.aByteArrayArray4 = null;
		this.aClass581_1 = null;
		this.aFloatArrayArray3 = null;
		this.aFloatArrayArray2 = null;
		this.aFloatArrayArray1 = null;
	}

	@OriginalMember(owner = "client!abh", name = "h", descriptor = "(III[[ZZI)V", line = 470)
	@Override
	public void method3544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1799(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!abh", name = "k", descriptor = "(III[[ZZI)V", line = 470)
	@Override
	public void method3564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1799(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!abh", name = "at", descriptor = "(III[[ZZI)V", line = 470)
	@Override
	public void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1799(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!abh", name = "af", descriptor = "(III[[ZZI)V", line = 470)
	@Override
	public void method3566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1799(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!abh", name = "aw", descriptor = "(III[[ZZI)V", line = 474)
	void method1799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass3Array1 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.aClass21_Sub2_24.anIntArray52.length < local12) {
			this.aClass21_Sub2_24.anIntArray52 = new int[local12];
		}
		if (this.aClass21_Sub2_24.aClass3_Sub41_Sub2_1.aByteArray51.length < this.anInt206 * 2) {
			this.aClass21_Sub2_24.aClass3_Sub41_Sub2_1 = new Class3_Sub41_Sub2(this.anInt206 * 2);
		}
		@Pc(47) int local47 = arg0 - arg2;
		@Pc(49) int local49 = local47;
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(57) int local57 = arg1 - arg2;
		@Pc(59) int local59 = local57;
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(67) int local67 = arg0 + arg2;
		if (local67 > this.anInt339 * -1007974723 - 1) {
			local67 = this.anInt339 * -1007974723 - 1;
		}
		@Pc(86) int local86 = arg1 + arg2;
		if (local86 > this.anInt337 * -207323189 - 1) {
			local86 = this.anInt337 * -207323189 - 1;
		}
		@Pc(103) int local103 = 0;
		@Pc(107) int[] local107 = this.aClass21_Sub2_24.anIntArray52;
		@Pc(109) int local109;
		for (local109 = local47; local109 <= local67; local109++) {
			@Pc(118) boolean[] local118 = arg3[local109 - local49];
			for (@Pc(120) int local120 = local57; local120 <= local86; local120++) {
				if (local118[local120 - local59]) {
					local107[local103++] = local120 * this.anInt339 * -1007974723 + local109;
				}
			}
		}
		this.aClass21_Sub2_24.method4119();
		this.aClass21_Sub2_24.method4084((this.anInt205 & 0x7) != 0);
		for (local109 = 0; local109 < this.aClass3Array1.length; local109++) {
			((Class3_Sub2) this.aClass3Array1[local109]).method9952(local107, local103);
		}
		if (!this.aClass553_2.method32712()) {
			local109 = this.aClass21_Sub2_24.anInt432;
			@Pc(191) int local191 = this.aClass21_Sub2_24.anInt433;
			this.aClass21_Sub2_24.method17114(0, local191, this.aClass21_Sub2_24.anInt434);
			this.aClass21_Sub2_24.method4084(false);
			this.aClass21_Sub2_24.method4087(false);
			this.aClass21_Sub2_24.method4089(128);
			this.aClass21_Sub2_24.method4070(-2);
			this.aClass21_Sub2_24.method4074(this.aClass21_Sub2_24.aClass4_Sub1_2);
			this.aClass21_Sub2_24.method4114(8448, 7681);
			this.aClass21_Sub2_24.method4077(0, 34166, 770);
			this.aClass21_Sub2_24.method4078(0, 34167, 770);
			for (@Pc(243) Class3 local243 = this.aClass553_2.method32768(); local243 != null; local243 = this.aClass553_2.method32709()) {
				@Pc(248) Class3_Sub12 local248 = (Class3_Sub12) local243;
				local248.method11225(arg0, arg1, arg2, arg3);
			}
			this.aClass21_Sub2_24.method4077(0, 5890, 768);
			this.aClass21_Sub2_24.method4078(0, 5890, 770);
			this.aClass21_Sub2_24.method4074(null);
			this.aClass21_Sub2_24.method17114(local109, local191, this.aClass21_Sub2_24.anInt434);
		}
		if (this.aClass102_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass21_Sub2_24.method4064(this.aClass88_3, null, null, this.aClass88_4);
		this.aClass102_1.method21843(arg0, arg1, arg2, arg3, arg4);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!abh", name = "bw", descriptor = "(III[[ZZI)V", line = 474)
	void method1802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass3Array1 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.aClass21_Sub2_24.anIntArray52.length < local12) {
			this.aClass21_Sub2_24.anIntArray52 = new int[local12];
		}
		if (this.aClass21_Sub2_24.aClass3_Sub41_Sub2_1.aByteArray51.length < this.anInt206 * 2) {
			this.aClass21_Sub2_24.aClass3_Sub41_Sub2_1 = new Class3_Sub41_Sub2(this.anInt206 * 2);
		}
		@Pc(47) int local47 = arg0 - arg2;
		@Pc(49) int local49 = local47;
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(57) int local57 = arg1 - arg2;
		@Pc(59) int local59 = local57;
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(67) int local67 = arg0 + arg2;
		if (local67 > this.anInt339 * -1007974723 - 1) {
			local67 = this.anInt339 * -1007974723 - 1;
		}
		@Pc(86) int local86 = arg1 + arg2;
		if (local86 > this.anInt337 * -207323189 - 1) {
			local86 = this.anInt337 * -207323189 - 1;
		}
		@Pc(103) int local103 = 0;
		@Pc(107) int[] local107 = this.aClass21_Sub2_24.anIntArray52;
		@Pc(109) int local109;
		for (local109 = local47; local109 <= local67; local109++) {
			@Pc(118) boolean[] local118 = arg3[local109 - local49];
			for (@Pc(120) int local120 = local57; local120 <= local86; local120++) {
				if (local118[local120 - local59]) {
					local107[local103++] = local120 * this.anInt339 * -1007974723 + local109;
				}
			}
		}
		this.aClass21_Sub2_24.method4119();
		this.aClass21_Sub2_24.method4084((this.anInt205 & 0x7) != 0);
		for (local109 = 0; local109 < this.aClass3Array1.length; local109++) {
			((Class3_Sub2) this.aClass3Array1[local109]).method9952(local107, local103);
		}
		if (!this.aClass553_2.method32712()) {
			local109 = this.aClass21_Sub2_24.anInt432;
			@Pc(191) int local191 = this.aClass21_Sub2_24.anInt433;
			this.aClass21_Sub2_24.method17114(0, local191, this.aClass21_Sub2_24.anInt434);
			this.aClass21_Sub2_24.method4084(false);
			this.aClass21_Sub2_24.method4087(false);
			this.aClass21_Sub2_24.method4089(128);
			this.aClass21_Sub2_24.method4070(-2);
			this.aClass21_Sub2_24.method4074(this.aClass21_Sub2_24.aClass4_Sub1_2);
			this.aClass21_Sub2_24.method4114(8448, 7681);
			this.aClass21_Sub2_24.method4077(0, 34166, 770);
			this.aClass21_Sub2_24.method4078(0, 34167, 770);
			for (@Pc(243) Class3 local243 = this.aClass553_2.method32768(); local243 != null; local243 = this.aClass553_2.method32709()) {
				@Pc(248) Class3_Sub12 local248 = (Class3_Sub12) local243;
				local248.method11225(arg0, arg1, arg2, arg3);
			}
			this.aClass21_Sub2_24.method4077(0, 5890, 768);
			this.aClass21_Sub2_24.method4078(0, 5890, 770);
			this.aClass21_Sub2_24.method4074(null);
			this.aClass21_Sub2_24.method17114(local109, local191, this.aClass21_Sub2_24.anInt434);
		}
		if (this.aClass102_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass21_Sub2_24.method4064(this.aClass88_3, null, null, this.aClass88_4);
		this.aClass102_1.method21843(arg0, arg1, arg2, arg3, arg4);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!abh", name = "bp", descriptor = "(III[[ZZI)V", line = 474)
	void method1803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass3Array1 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.aClass21_Sub2_24.anIntArray52.length < local12) {
			this.aClass21_Sub2_24.anIntArray52 = new int[local12];
		}
		if (this.aClass21_Sub2_24.aClass3_Sub41_Sub2_1.aByteArray51.length < this.anInt206 * 2) {
			this.aClass21_Sub2_24.aClass3_Sub41_Sub2_1 = new Class3_Sub41_Sub2(this.anInt206 * 2);
		}
		@Pc(47) int local47 = arg0 - arg2;
		@Pc(49) int local49 = local47;
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(57) int local57 = arg1 - arg2;
		@Pc(59) int local59 = local57;
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(67) int local67 = arg0 + arg2;
		if (local67 > this.anInt339 * -1007974723 - 1) {
			local67 = this.anInt339 * -1007974723 - 1;
		}
		@Pc(86) int local86 = arg1 + arg2;
		if (local86 > this.anInt337 * -207323189 - 1) {
			local86 = this.anInt337 * -207323189 - 1;
		}
		@Pc(103) int local103 = 0;
		@Pc(107) int[] local107 = this.aClass21_Sub2_24.anIntArray52;
		@Pc(109) int local109;
		for (local109 = local47; local109 <= local67; local109++) {
			@Pc(118) boolean[] local118 = arg3[local109 - local49];
			for (@Pc(120) int local120 = local57; local120 <= local86; local120++) {
				if (local118[local120 - local59]) {
					local107[local103++] = local120 * this.anInt339 * -1007974723 + local109;
				}
			}
		}
		this.aClass21_Sub2_24.method4119();
		this.aClass21_Sub2_24.method4084((this.anInt205 & 0x7) != 0);
		for (local109 = 0; local109 < this.aClass3Array1.length; local109++) {
			((Class3_Sub2) this.aClass3Array1[local109]).method9952(local107, local103);
		}
		if (!this.aClass553_2.method32712()) {
			local109 = this.aClass21_Sub2_24.anInt432;
			@Pc(191) int local191 = this.aClass21_Sub2_24.anInt433;
			this.aClass21_Sub2_24.method17114(0, local191, this.aClass21_Sub2_24.anInt434);
			this.aClass21_Sub2_24.method4084(false);
			this.aClass21_Sub2_24.method4087(false);
			this.aClass21_Sub2_24.method4089(128);
			this.aClass21_Sub2_24.method4070(-2);
			this.aClass21_Sub2_24.method4074(this.aClass21_Sub2_24.aClass4_Sub1_2);
			this.aClass21_Sub2_24.method4114(8448, 7681);
			this.aClass21_Sub2_24.method4077(0, 34166, 770);
			this.aClass21_Sub2_24.method4078(0, 34167, 770);
			for (@Pc(243) Class3 local243 = this.aClass553_2.method32768(); local243 != null; local243 = this.aClass553_2.method32709()) {
				@Pc(248) Class3_Sub12 local248 = (Class3_Sub12) local243;
				local248.method11225(arg0, arg1, arg2, arg3);
			}
			this.aClass21_Sub2_24.method4077(0, 5890, 768);
			this.aClass21_Sub2_24.method4078(0, 5890, 770);
			this.aClass21_Sub2_24.method4074(null);
			this.aClass21_Sub2_24.method17114(local109, local191, this.aClass21_Sub2_24.anInt434);
		}
		if (this.aClass102_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass21_Sub2_24.method4064(this.aClass88_3, null, null, this.aClass88_4);
		this.aClass102_1.method21843(arg0, arg1, arg2, arg3, arg4);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!abh", name = "x", descriptor = "(IIIIIII[[Z)V", line = 540)
	@Override
	public void method3545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class19 local4 = this.aClass21_Sub2_24.method17037();
		if (this.anInt210 <= 0 || local4 == null) {
			return;
		}
		this.aClass21_Sub2_24.method4161();
		this.aClass21_Sub2_24.method4083(false);
		this.aClass21_Sub2_24.method4084(false);
		this.aClass21_Sub2_24.method4086(false);
		this.aClass21_Sub2_24.method4087(false);
		this.aClass21_Sub2_24.method4089(0);
		this.aClass21_Sub2_24.method4070(-2);
		this.aClass21_Sub2_24.method4074(null);
		aFloatArray17[0] = (float) arg2 / ((float) (this.anInt338 * 76934957) * 128.0F * (float) local4.method21390());
		aFloatArray17[1] = 0.0F;
		aFloatArray17[2] = 0.0F;
		aFloatArray17[3] = 0.0F;
		aFloatArray17[4] = 0.0F;
		aFloatArray17[5] = (float) arg2 / ((float) (this.anInt338 * 76934957) * 128.0F * (float) local4.method21391());
		aFloatArray17[6] = 0.0F;
		aFloatArray17[7] = 0.0F;
		aFloatArray17[8] = 0.0F;
		aFloatArray17[9] = 0.0F;
		aFloatArray17[10] = 0.0F;
		aFloatArray17[11] = 0.0F;
		aFloatArray17[12] = -1.0F - ((float) (arg3 * arg2) / 128.0F - (float) (arg0 * 2)) / (float) local4.method21390();
		aFloatArray17[13] = 1.0F - ((float) (arg1 * 2) + (float) (arg6 * arg2) / 128.0F) / (float) local4.method21391();
		aFloatArray17[14] = 0.0F;
		aFloatArray17[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(aFloatArray17, 0);
		aFloatArray17[0] = 1.0F;
		aFloatArray17[1] = 0.0F;
		aFloatArray17[2] = 0.0F;
		aFloatArray17[3] = 0.0F;
		aFloatArray17[4] = 0.0F;
		aFloatArray17[5] = 0.0F;
		aFloatArray17[6] = 1.0F;
		aFloatArray17[7] = 0.0F;
		aFloatArray17[8] = 0.0F;
		aFloatArray17[9] = 1.0F;
		aFloatArray17[10] = 0.0F;
		aFloatArray17[11] = 0.0F;
		aFloatArray17[12] = 0.0F;
		aFloatArray17[13] = 0.0F;
		aFloatArray17[14] = 0.0F;
		aFloatArray17[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aFloatArray17, 0);
		if ((this.anInt205 & 0x7) == 0) {
			this.aClass21_Sub2_24.method4084(false);
		} else {
			this.aClass21_Sub2_24.method4084(true);
			this.aClass21_Sub2_24.method4055();
		}
		this.aClass21_Sub2_24.method4064(this.aClass88_3, this.aClass88_2, this.aClass88_1, this.aClass88_4);
		if (this.aClass21_Sub2_24.aClass3_Sub41_Sub2_1.aByteArray51.length < this.anInt206 * 2) {
			this.aClass21_Sub2_24.aClass3_Sub41_Sub2_1 = new Class3_Sub41_Sub2(this.anInt206 * 2);
		} else {
			this.aClass21_Sub2_24.aClass3_Sub41_Sub2_1.anInt2803 = 0;
		}
		@Pc(293) int local293 = 0;
		@Pc(297) Class3_Sub41_Sub2 local297 = this.aClass21_Sub2_24.aClass3_Sub41_Sub2_1;
		@Pc(303) int local303;
		@Pc(315) int local315;
		@Pc(317) int local317;
		@Pc(335) short[] local335;
		@Pc(339) int local339;
		if (this.aClass21_Sub2_24.aBoolean63) {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt339 * -1007974723 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray1[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.method20251(local335[local339] & 0xFFFF);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		} else {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt339 * -1007974723 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray1[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.method20442(local335[local339] & 0xFFFF);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		}
		if (local293 > 0) {
			@Pc(433) Class9_Sub2 local433 = new Class9_Sub2(this.aClass21_Sub2_24, 5123, local297.aByteArray51, local297.anInt2803 * 62066237);
			this.aClass21_Sub2_24.method4066(local433, 4, 0, local293);
		}
	}

	@OriginalMember(owner = "client!abh", name = "ak", descriptor = "(IIIIIII[[Z)V", line = 540)
	@Override
	public void method3543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class19 local4 = this.aClass21_Sub2_24.method17037();
		if (this.anInt210 <= 0 || local4 == null) {
			return;
		}
		this.aClass21_Sub2_24.method4161();
		this.aClass21_Sub2_24.method4083(false);
		this.aClass21_Sub2_24.method4084(false);
		this.aClass21_Sub2_24.method4086(false);
		this.aClass21_Sub2_24.method4087(false);
		this.aClass21_Sub2_24.method4089(0);
		this.aClass21_Sub2_24.method4070(-2);
		this.aClass21_Sub2_24.method4074(null);
		aFloatArray17[0] = (float) arg2 / ((float) (this.anInt338 * 76934957) * 128.0F * (float) local4.method21390());
		aFloatArray17[1] = 0.0F;
		aFloatArray17[2] = 0.0F;
		aFloatArray17[3] = 0.0F;
		aFloatArray17[4] = 0.0F;
		aFloatArray17[5] = (float) arg2 / ((float) (this.anInt338 * 76934957) * 128.0F * (float) local4.method21391());
		aFloatArray17[6] = 0.0F;
		aFloatArray17[7] = 0.0F;
		aFloatArray17[8] = 0.0F;
		aFloatArray17[9] = 0.0F;
		aFloatArray17[10] = 0.0F;
		aFloatArray17[11] = 0.0F;
		aFloatArray17[12] = -1.0F - ((float) (arg3 * arg2) / 128.0F - (float) (arg0 * 2)) / (float) local4.method21390();
		aFloatArray17[13] = 1.0F - ((float) (arg1 * 2) + (float) (arg6 * arg2) / 128.0F) / (float) local4.method21391();
		aFloatArray17[14] = 0.0F;
		aFloatArray17[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(aFloatArray17, 0);
		aFloatArray17[0] = 1.0F;
		aFloatArray17[1] = 0.0F;
		aFloatArray17[2] = 0.0F;
		aFloatArray17[3] = 0.0F;
		aFloatArray17[4] = 0.0F;
		aFloatArray17[5] = 0.0F;
		aFloatArray17[6] = 1.0F;
		aFloatArray17[7] = 0.0F;
		aFloatArray17[8] = 0.0F;
		aFloatArray17[9] = 1.0F;
		aFloatArray17[10] = 0.0F;
		aFloatArray17[11] = 0.0F;
		aFloatArray17[12] = 0.0F;
		aFloatArray17[13] = 0.0F;
		aFloatArray17[14] = 0.0F;
		aFloatArray17[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aFloatArray17, 0);
		if ((this.anInt205 & 0x7) == 0) {
			this.aClass21_Sub2_24.method4084(false);
		} else {
			this.aClass21_Sub2_24.method4084(true);
			this.aClass21_Sub2_24.method4055();
		}
		this.aClass21_Sub2_24.method4064(this.aClass88_3, this.aClass88_2, this.aClass88_1, this.aClass88_4);
		if (this.aClass21_Sub2_24.aClass3_Sub41_Sub2_1.aByteArray51.length < this.anInt206 * 2) {
			this.aClass21_Sub2_24.aClass3_Sub41_Sub2_1 = new Class3_Sub41_Sub2(this.anInt206 * 2);
		} else {
			this.aClass21_Sub2_24.aClass3_Sub41_Sub2_1.anInt2803 = 0;
		}
		@Pc(293) int local293 = 0;
		@Pc(297) Class3_Sub41_Sub2 local297 = this.aClass21_Sub2_24.aClass3_Sub41_Sub2_1;
		@Pc(303) int local303;
		@Pc(315) int local315;
		@Pc(317) int local317;
		@Pc(335) short[] local335;
		@Pc(339) int local339;
		if (this.aClass21_Sub2_24.aBoolean63) {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt339 * -1007974723 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray1[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.method20251(local335[local339] & 0xFFFF);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		} else {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt339 * -1007974723 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray1[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.method20442(local335[local339] & 0xFFFF);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		}
		if (local293 > 0) {
			@Pc(433) Class9_Sub2 local433 = new Class9_Sub2(this.aClass21_Sub2_24, 5123, local297.aByteArray51, local297.anInt2803 * 62066237);
			this.aClass21_Sub2_24.method4066(local433, 4, 0, local293);
		}
	}

	@OriginalMember(owner = "client!abh", name = "ah", descriptor = "(IILclient!amd;)Lclient!amd;", line = 637)
	@Override
	public Class3_Sub1_Sub3 method3569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		if ((this.aByteArrayArray3[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt338 * 76934957 >> this.aClass21_Sub2_24.anInt408;
		@Pc(22) Class3_Sub1_Sub3_Sub1 local22 = (Class3_Sub1_Sub3_Sub1) arg2;
		@Pc(31) Class3_Sub1_Sub3_Sub1 local31;
		if (local22 != null && local22.method20661(local19, local19)) {
			local31 = local22;
			local22.method20667();
		} else {
			local31 = new Class3_Sub1_Sub3_Sub1(this.aClass21_Sub2_24, local19, local19);
		}
		local31.method20662(0, 0, local19, local19);
		this.method1800(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!abh", name = "aa", descriptor = "(IILclient!amd;)Lclient!amd;", line = 637)
	@Override
	public Class3_Sub1_Sub3 method3582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		if ((this.aByteArrayArray3[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt338 * 76934957 >> this.aClass21_Sub2_24.anInt408;
		@Pc(22) Class3_Sub1_Sub3_Sub1 local22 = (Class3_Sub1_Sub3_Sub1) arg2;
		@Pc(31) Class3_Sub1_Sub3_Sub1 local31;
		if (local22 != null && local22.method20661(local19, local19)) {
			local31 = local22;
			local22.method20667();
		} else {
			local31 = new Class3_Sub1_Sub3_Sub1(this.aClass21_Sub2_24, local19, local19);
		}
		local31.method20662(0, 0, local19, local19);
		this.method1800(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!abh", name = "c", descriptor = "(IILclient!amd;)Lclient!amd;", line = 637)
	@Override
	public Class3_Sub1_Sub3 method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		if ((this.aByteArrayArray3[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt338 * 76934957 >> this.aClass21_Sub2_24.anInt408;
		@Pc(22) Class3_Sub1_Sub3_Sub1 local22 = (Class3_Sub1_Sub3_Sub1) arg2;
		@Pc(31) Class3_Sub1_Sub3_Sub1 local31;
		if (local22 != null && local22.method20661(local19, local19)) {
			local31 = local22;
			local22.method20667();
		} else {
			local31 = new Class3_Sub1_Sub3_Sub1(this.aClass21_Sub2_24, local19, local19);
		}
		local31.method20662(0, 0, local19, local19);
		this.method1800(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!abh", name = "an", descriptor = "(IILclient!amd;)Lclient!amd;", line = 637)
	@Override
	public Class3_Sub1_Sub3 method3568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		if ((this.aByteArrayArray3[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt338 * 76934957 >> this.aClass21_Sub2_24.anInt408;
		@Pc(22) Class3_Sub1_Sub3_Sub1 local22 = (Class3_Sub1_Sub3_Sub1) arg2;
		@Pc(31) Class3_Sub1_Sub3_Sub1 local31;
		if (local22 != null && local22.method20661(local19, local19)) {
			local31 = local22;
			local22.method20667();
		} else {
			local31 = new Class3_Sub1_Sub3_Sub1(this.aClass21_Sub2_24, local19, local19);
		}
		local31.method20662(0, 0, local19, local19);
		this.method1800(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!abh", name = "aj", descriptor = "(IILclient!amd;)Lclient!amd;", line = 637)
	@Override
	public Class3_Sub1_Sub3 method3571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		if ((this.aByteArrayArray3[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt338 * 76934957 >> this.aClass21_Sub2_24.anInt408;
		@Pc(22) Class3_Sub1_Sub3_Sub1 local22 = (Class3_Sub1_Sub3_Sub1) arg2;
		@Pc(31) Class3_Sub1_Sub3_Sub1 local31;
		if (local22 != null && local22.method20661(local19, local19)) {
			local31 = local22;
			local22.method20667();
		} else {
			local31 = new Class3_Sub1_Sub3_Sub1(this.aClass21_Sub2_24, local19, local19);
		}
		local31.method20662(0, 0, local19, local19);
		this.method1800(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!abh", name = "ac", descriptor = "(Lclient!aoc;II)V", line = 652)
	void method1800(@OriginalArg(0) Class3_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray6[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray4[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.aClass21_Sub2_24.anIntArray50.length < local16) {
			this.aClass21_Sub2_24.anIntArray50 = new int[local16];
			this.aClass21_Sub2_24.anIntArray51 = new int[local16];
		}
		@Pc(36) int[] local36 = this.aClass21_Sub2_24.anIntArray50;
		@Pc(40) int[] local40 = this.aClass21_Sub2_24.anIntArray51;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local16; local42++) {
			local36[local42] = local6[local42] >> this.aClass21_Sub2_24.anInt408;
			local40[local42] = local13[local42] >> this.aClass21_Sub2_24.anInt408;
		}
		local42 = 0;
		while (local42 < local16) {
			@Pc(76) int local76 = local36[local42];
			@Pc(81) int local81 = local40[local42++];
			@Pc(85) int local85 = local36[local42];
			@Pc(90) int local90 = local40[local42++];
			@Pc(94) int local94 = local36[local42];
			@Pc(99) int local99 = local40[local42++];
			if ((local76 - local85) * (local90 - local99) - (local90 - local81) * (local94 - local85) > 0) {
				arg0.method20663(local81, local90, local99, local76, local85, local94);
			}
		}
	}

	@OriginalMember(owner = "client!abh", name = "bm", descriptor = "(Lclient!aoc;II)V", line = 652)
	void method1801(@OriginalArg(0) Class3_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray6[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray4[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.aClass21_Sub2_24.anIntArray50.length < local16) {
			this.aClass21_Sub2_24.anIntArray50 = new int[local16];
			this.aClass21_Sub2_24.anIntArray51 = new int[local16];
		}
		@Pc(36) int[] local36 = this.aClass21_Sub2_24.anIntArray50;
		@Pc(40) int[] local40 = this.aClass21_Sub2_24.anIntArray51;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local16; local42++) {
			local36[local42] = local6[local42] >> this.aClass21_Sub2_24.anInt408;
			local40[local42] = local13[local42] >> this.aClass21_Sub2_24.anInt408;
		}
		local42 = 0;
		while (local42 < local16) {
			@Pc(76) int local76 = local36[local42];
			@Pc(81) int local81 = local40[local42++];
			@Pc(85) int local85 = local36[local42];
			@Pc(90) int local90 = local40[local42++];
			@Pc(94) int local94 = local36[local42];
			@Pc(99) int local99 = local40[local42++];
			if ((local76 - local85) * (local90 - local99) - (local90 - local81) * (local94 - local85) > 0) {
				arg0.method20663(local81, local90, local99, local76, local85, local94);
			}
		}
	}

	@OriginalMember(owner = "client!abh", name = "bd", descriptor = "(Lclient!aoc;II)V", line = 652)
	void method1804(@OriginalArg(0) Class3_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray6[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray4[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.aClass21_Sub2_24.anIntArray50.length < local16) {
			this.aClass21_Sub2_24.anIntArray50 = new int[local16];
			this.aClass21_Sub2_24.anIntArray51 = new int[local16];
		}
		@Pc(36) int[] local36 = this.aClass21_Sub2_24.anIntArray50;
		@Pc(40) int[] local40 = this.aClass21_Sub2_24.anIntArray51;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local16; local42++) {
			local36[local42] = local6[local42] >> this.aClass21_Sub2_24.anInt408;
			local40[local42] = local13[local42] >> this.aClass21_Sub2_24.anInt408;
		}
		local42 = 0;
		while (local42 < local16) {
			@Pc(76) int local76 = local36[local42];
			@Pc(81) int local81 = local40[local42++];
			@Pc(85) int local85 = local36[local42];
			@Pc(90) int local90 = local40[local42++];
			@Pc(94) int local94 = local36[local42];
			@Pc(99) int local99 = local40[local42++];
			if ((local76 - local85) * (local90 - local99) - (local90 - local81) * (local94 - local85) > 0) {
				arg0.method20663(local81, local90, local99, local76, local85, local94);
			}
		}
	}

	@OriginalMember(owner = "client!abh", name = "bs", descriptor = "(Lclient!aoc;II)V", line = 652)
	void method1805(@OriginalArg(0) Class3_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray6[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray4[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.aClass21_Sub2_24.anIntArray50.length < local16) {
			this.aClass21_Sub2_24.anIntArray50 = new int[local16];
			this.aClass21_Sub2_24.anIntArray51 = new int[local16];
		}
		@Pc(36) int[] local36 = this.aClass21_Sub2_24.anIntArray50;
		@Pc(40) int[] local40 = this.aClass21_Sub2_24.anIntArray51;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local16; local42++) {
			local36[local42] = local6[local42] >> this.aClass21_Sub2_24.anInt408;
			local40[local42] = local13[local42] >> this.aClass21_Sub2_24.anInt408;
		}
		local42 = 0;
		while (local42 < local16) {
			@Pc(76) int local76 = local36[local42];
			@Pc(81) int local81 = local40[local42++];
			@Pc(85) int local85 = local36[local42];
			@Pc(90) int local90 = local40[local42++];
			@Pc(94) int local94 = local36[local42];
			@Pc(99) int local99 = local40[local42++];
			if ((local76 - local85) * (local90 - local99) - (local90 - local81) * (local94 - local85) > 0) {
				arg0.method20663(local81, local90, local99, local76, local85, local94);
			}
		}
	}

	@OriginalMember(owner = "client!abh", name = "aq", descriptor = "(Lclient!amd;IIIIZ)Z", line = 679)
	@Override
	public boolean method3574(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass102_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass21_Sub2_24.anInt377 >> 8) >> this.aClass21_Sub2_24.anInt408;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass21_Sub2_24.anInt431 >> 8) >> this.aClass21_Sub2_24.anInt408;
			return this.aClass102_1.method21841(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!abh", name = "n", descriptor = "(Lclient!amd;IIIIZ)Z", line = 679)
	@Override
	public boolean method3553(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass102_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass21_Sub2_24.anInt377 >> 8) >> this.aClass21_Sub2_24.anInt408;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass21_Sub2_24.anInt431 >> 8) >> this.aClass21_Sub2_24.anInt408;
			return this.aClass102_1.method21841(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!abh", name = "ai", descriptor = "(Lclient!amd;IIIIZ)V", line = 686)
	@Override
	public void method3573(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass102_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass21_Sub2_24.anInt377 >> 8) >> this.aClass21_Sub2_24.anInt408;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass21_Sub2_24.anInt431 >> 8) >> this.aClass21_Sub2_24.anInt408;
			this.aClass102_1.method21852(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!abh", name = "z", descriptor = "(Lclient!amd;IIIIZ)V", line = 686)
	@Override
	public void method3551(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass102_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass21_Sub2_24.anInt377 >> 8) >> this.aClass21_Sub2_24.anInt408;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass21_Sub2_24.anInt431 >> 8) >> this.aClass21_Sub2_24.anInt408;
			this.aClass102_1.method21852(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!abh", name = "as", descriptor = "(Lclient!amd;IIIIZ)V", line = 686)
	@Override
	public void method3572(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass102_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass21_Sub2_24.anInt377 >> 8) >> this.aClass21_Sub2_24.anInt408;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass21_Sub2_24.anInt431 >> 8) >> this.aClass21_Sub2_24.anInt408;
			this.aClass102_1.method21852(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!abh", name = "j", descriptor = "(Lclient!amd;IIIIZ)V", line = 693)
	@Override
	public void method3540(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass102_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass21_Sub2_24.anInt377 >> 8) >> this.aClass21_Sub2_24.anInt408;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass21_Sub2_24.anInt431 >> 8) >> this.aClass21_Sub2_24.anInt408;
			this.aClass102_1.method21840(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!abh", name = "av", descriptor = "(Lclient!amd;IIIIZ)V", line = 693)
	@Override
	public void method3575(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass102_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass21_Sub2_24.anInt377 >> 8) >> this.aClass21_Sub2_24.anInt408;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass21_Sub2_24.anInt431 >> 8) >> this.aClass21_Sub2_24.anInt408;
			this.aClass102_1.method21840(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!abh", name = "ax", descriptor = "(Lclient!amd;IIIIZ)V", line = 693)
	@Override
	public void method3576(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass102_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass21_Sub2_24.anInt377 >> 8) >> this.aClass21_Sub2_24.anInt408;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass21_Sub2_24.anInt431 >> 8) >> this.aClass21_Sub2_24.anInt408;
			this.aClass102_1.method21840(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!abh", name = "ap", descriptor = "(Lclient!afz;[I)V", line = 700)
	@Override
	public void method3580(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass553_2.method32702(new Class3_Sub12(this.aClass21_Sub2_24, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!abh", name = "e", descriptor = "(Lclient!afz;[I)V", line = 700)
	@Override
	public void method3554(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass553_2.method32702(new Class3_Sub12(this.aClass21_Sub2_24, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!abh", name = "ao", descriptor = "(Lclient!afz;[I)V", line = 700)
	@Override
	public void method3579(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass553_2.method32702(new Class3_Sub12(this.aClass21_Sub2_24, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!abh", name = "al", descriptor = "(Lclient!afz;[I)V", line = 700)
	@Override
	public void method3578(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass553_2.method32702(new Class3_Sub12(this.aClass21_Sub2_24, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!abh", name = "az", descriptor = "(Lclient!afz;[I)V", line = 700)
	@Override
	public void method3558(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass553_2.method32702(new Class3_Sub12(this.aClass21_Sub2_24, this, arg0, arg1));
	}
}
