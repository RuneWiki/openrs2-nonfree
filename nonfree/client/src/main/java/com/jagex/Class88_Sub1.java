package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeg")
public class Class88_Sub1 extends Class88 {

	@OriginalMember(owner = "client!aeg", name = "t", descriptor = "I")
	static final int anInt503 = 74;

	@OriginalMember(owner = "client!aeg", name = "w", descriptor = "I")
	static final int anInt506 = 1;

	@OriginalMember(owner = "client!aeg", name = "at", descriptor = "[F")
	static final float[] aFloatArray14 = new float[16];

	@OriginalMember(owner = "client!aeg", name = "ag", descriptor = "Lclient!bk;")
	Class172 aClass172_5;

	@OriginalMember(owner = "client!aeg", name = "g", descriptor = "I")
	int anInt505;

	@OriginalMember(owner = "client!aeg", name = "z", descriptor = "I")
	int anInt509;

	@OriginalMember(owner = "client!aeg", name = "b", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!aeg", name = "h", descriptor = "[Lclient!sn;")
	Class77[] aClass77Array2;

	@OriginalMember(owner = "client!aeg", name = "aj", descriptor = "Lclient!bn;")
	Interface14 anInterface14_2;

	@OriginalMember(owner = "client!aeg", name = "ai", descriptor = "Lclient!bk;")
	Class172 aClass172_6;

	@OriginalMember(owner = "client!aeg", name = "al", descriptor = "Lclient!bk;")
	Class172 aClass172_7;

	@OriginalMember(owner = "client!aeg", name = "ao", descriptor = "Lclient!bk;")
	Class172 aClass172_8;

	@OriginalMember(owner = "client!aeg", name = "ak", descriptor = "I")
	int anInt510;

	@OriginalMember(owner = "client!aeg", name = "au", descriptor = "I")
	int anInt511;

	@OriginalMember(owner = "client!aeg", name = "m", descriptor = "Lclient!zm;")
	Class695 aClass695_4 = new Class695();

	@OriginalMember(owner = "client!aeg", name = "q", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_24;

	@OriginalMember(owner = "client!aeg", name = "x", descriptor = "I")
	int anInt508;

	@OriginalMember(owner = "client!aeg", name = "d", descriptor = "I")
	int anInt512;

	@OriginalMember(owner = "client!aeg", name = "s", descriptor = "I")
	int anInt504;

	@OriginalMember(owner = "client!aeg", name = "r", descriptor = "I")
	final int anInt507;

	@OriginalMember(owner = "client!aeg", name = "o", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!aeg", name = "i", descriptor = "[[[Lclient!aju;")
	Class77_Sub21[][][] aClass77_Sub21ArrayArrayArray1;

	@OriginalMember(owner = "client!aeg", name = "e", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!aeg", name = "f", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!aeg", name = "k", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!aeg", name = "u", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!aeg", name = "j", descriptor = "[[S")
	short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!aeg", name = "n", descriptor = "[[B")
	byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!aeg", name = "ax", descriptor = "[[B")
	byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!aeg", name = "ar", descriptor = "[[F")
	float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!aeg", name = "ad", descriptor = "[[F")
	float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!aeg", name = "ac", descriptor = "[[F")
	float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!aeg", name = "av", descriptor = "Lclient!aak;")
	Class12 aClass12_4;

	@OriginalMember(owner = "client!aeg", name = "a", descriptor = "Lclient!cc;")
	Class185 aClass185_1;

	@OriginalMember(owner = "client!aeg", name = "<init>", descriptor = "(Lclient!aeq;IIII[[I[[II)V", line = 56)
	Class88_Sub1(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass86_Sub3_24 = arg0;
		this.anInt508 = this.anInt609 * -1495101509 - 2;
		this.anInt512 = 0x1 << this.anInt508;
		this.anInt504 = arg1;
		this.anInt507 = arg2;
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.aClass77_Sub21ArrayArrayArray1 = new Class77_Sub21[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aShortArrayArray1 = new short[arg3 * arg4][];
		this.aByteArrayArray2 = new byte[arg3][arg4];
		this.aByteArrayArray3 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray4 = new float[this.anInt607 * -1924295585 + 1][this.anInt606 * -1466328823 + 1];
		this.aFloatArrayArray2 = new float[this.anInt607 * -1924295585 + 1][this.anInt606 * -1466328823 + 1];
		this.aFloatArrayArray3 = new float[this.anInt607 * -1924295585 + 1][this.anInt606 * -1466328823 + 1];
		for (@Pc(130) int local130 = 1; local130 < this.anInt606 * -1466328823; local130++) {
			for (@Pc(138) int local138 = 1; local138 < this.anInt607 * -1924295585; local138++) {
				@Pc(160) int local160 = arg6[local138 + 1][local130] - arg6[local138 - 1][local130];
				@Pc(176) int local176 = arg6[local138][local130 + 1] - arg6[local138][local130 - 1];
				@Pc(195) float local195 = (float) (1.0D / Math.sqrt((double) (local160 * local160 + arg7 * 4 * arg7 + local176 * local176)));
				this.aFloatArrayArray4[local138][local130] = (float) local160 * local195;
				this.aFloatArrayArray2[local138][local130] = (float) (-arg7 * 2) * local195;
				this.aFloatArrayArray3[local138][local130] = (float) local176 * local195;
			}
		}
		this.aClass12_4 = new Class12(128);
		if ((this.anInt507 & 0x10) != 0) {
			this.aClass185_1 = new Class185(this.aClass86_Sub3_24, this);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "p", descriptor = "(III)V", line = 89)
	@Override
	public void method5508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray3.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray3[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray3[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray3[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aeg", name = "i", descriptor = "(III)V", line = 89)
	@Override
	public void method5525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray3.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray3[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray3[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray3[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aeg", name = "k", descriptor = "(III)V", line = 89)
	@Override
	public void method5521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray3.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray3[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray3[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray3[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aeg", name = "u", descriptor = "(III)V", line = 89)
	@Override
	public void method5522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray3.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray3[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray3[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray3[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aeg", name = "e", descriptor = "(III)V", line = 89)
	@Override
	public void method5523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray3.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray3[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray3[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray3[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aeg", name = "o", descriptor = "(II[I[I[I[I[I[I[I[ILclient!db;Z)V", line = 95)
	@Override
	public void method5536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class202 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class209 local3 = this.aClass86_Sub3_24.aClass209_9;
		if (arg5 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[this.anInt607 * -1924295585][this.anInt606 * -1466328823][];
		}
		if (arg3 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[this.anInt607 * -1924295585][this.anInt606 * -1466328823][];
		}
		this.anIntArrayArrayArray2[arg0][arg1] = arg2;
		this.anIntArrayArrayArray3[arg0][arg1] = arg4;
		this.anIntArrayArrayArray1[arg0][arg1] = arg6;
		this.anIntArrayArrayArray6[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg3;
		}
		@Pc(94) Class77_Sub21[] local94 = this.aClass77_Sub21ArrayArrayArray1[arg0][arg1] = new Class77_Sub21[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt507 & 0x20) != 0 && local104 != -1 && local3.method25584(local104).aBoolean641) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3555 * 1446227271) << 48 | (long) (arg10.anInt3553 * -1095140607) << 42 | (long) (arg10.anInt3554 * 2113275141) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class77 local163;
			for (local163 = this.aClass12_4.method173(local158); local163 != null; local163 = this.aClass12_4.method176()) {
				@Pc(168) Class77_Sub21 local168 = (Class77_Sub21) local163;
				if (local168.anInt1528 == local104 && local168.aFloat146 == (float) local108 && local168.aClass202_4.method25541(arg10)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class77_Sub21(this, local104, local108, arg10);
				this.aClass12_4.method184(local94[local96], local158);
			} else {
				local94[local96] = (Class77_Sub21) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray2[arg0][arg1] = (byte) (this.aByteArrayArray2[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt511) {
			this.anInt511 = arg6.length;
		}
		this.anInt510 += arg6.length;
	}

	@OriginalMember(owner = "client!aeg", name = "c", descriptor = "(II[I[I[I[I[I[I[I[ILclient!db;Z)V", line = 95)
	@Override
	public void method5509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class202 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class209 local3 = this.aClass86_Sub3_24.aClass209_9;
		if (arg5 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[this.anInt607 * -1924295585][this.anInt606 * -1466328823][];
		}
		if (arg3 != null && this.anIntArrayArrayArray4 == null) {
			this.anIntArrayArrayArray4 = new int[this.anInt607 * -1924295585][this.anInt606 * -1466328823][];
		}
		this.anIntArrayArrayArray2[arg0][arg1] = arg2;
		this.anIntArrayArrayArray3[arg0][arg1] = arg4;
		this.anIntArrayArrayArray1[arg0][arg1] = arg6;
		this.anIntArrayArrayArray6[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray4 != null) {
			this.anIntArrayArrayArray4[arg0][arg1] = arg3;
		}
		@Pc(94) Class77_Sub21[] local94 = this.aClass77_Sub21ArrayArrayArray1[arg0][arg1] = new Class77_Sub21[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt507 & 0x20) != 0 && local104 != -1 && local3.method25584(local104).aBoolean641) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3555 * 1446227271) << 48 | (long) (arg10.anInt3553 * -1095140607) << 42 | (long) (arg10.anInt3554 * 2113275141) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class77 local163;
			for (local163 = this.aClass12_4.method173(local158); local163 != null; local163 = this.aClass12_4.method176()) {
				@Pc(168) Class77_Sub21 local168 = (Class77_Sub21) local163;
				if (local168.anInt1528 == local104 && local168.aFloat146 == (float) local108 && local168.aClass202_4.method25541(arg10)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class77_Sub21(this, local104, local108, arg10);
				this.aClass12_4.method184(local94[local96], local158);
			} else {
				local94[local96] = (Class77_Sub21) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray2[arg0][arg1] = (byte) (this.aByteArrayArray2[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt511) {
			this.anInt511 = arg6.length;
		}
		this.anInt510 += arg6.length;
	}

	@OriginalMember(owner = "client!aeg", name = "v", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!db;Z)V", line = 131)
	@Override
	public void method5510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class202 arg13, @OriginalArg(14) boolean arg14) {
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
		this.method5509(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!aeg", name = "f", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!db;Z)V", line = 131)
	@Override
	public void method5524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class202 arg13, @OriginalArg(14) boolean arg14) {
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
		this.method5509(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!aeg", name = "b", descriptor = "()V", line = 177)
	@Override
	public void method5526() {
		if (this.anInt510 > 0) {
			@Pc(16) byte[][] local16 = new byte[this.anInt607 * -1924295585 + 1][this.anInt606 * -1466328823 + 1];
			@Pc(18) int local18;
			for (local18 = 1; local18 < this.anInt607 * -1924295585; local18++) {
				for (@Pc(26) int local26 = 1; local26 < this.anInt606 * -1466328823; local26++) {
					local16[local18][local26] = (byte) ((this.aByteArrayArray3[local18 - 1][local26] >> 2) + (this.aByteArrayArray3[local18 + 1][local26] >> 3) + (this.aByteArrayArray3[local18][local26 - 1] >> 2) + (this.aByteArrayArray3[local18][local26 + 1] >> 3) + (this.aByteArrayArray3[local18][local26] >> 1));
				}
			}
			this.aClass77Array2 = new Class77[this.aClass12_4.method183()];
			this.aClass12_4.method180(this.aClass77Array2);
			for (local18 = 0; local18 < this.aClass77Array2.length; local18++) {
				((Class77_Sub21) this.aClass77Array2[local18]).method13516(this.anInt510);
			}
			local18 = 24;
			if (this.anIntArrayArrayArray5 != null) {
				local18 += 4;
			}
			if ((this.anInt507 & 0x7) != 0) {
				local18 += 12;
			}
			@Pc(147) NativeHeapBuffer local147 = this.aClass86_Sub3_24.aNativeHeap2.c(this.anInt510 * local18, false);
			@Pc(152) Stream local152 = new Stream(local147);
			@Pc(156) Class77_Sub21[] local156 = new Class77_Sub21[this.anInt510];
			@Pc(163) int local163 = Class462.method29538(this.anInt510 / 4);
			if (local163 < 1) {
				local163 = 1;
			}
			@Pc(173) Class12 local173 = new Class12(local163);
			@Pc(177) Class77_Sub21[] local177 = new Class77_Sub21[this.anInt511];
			@Pc(179) int local179;
			@Pc(187) int local187;
			for (local179 = 0; local179 < this.anInt607 * -1924295585; local179++) {
				for (local187 = 0; local187 < this.anInt606 * -1466328823; local187++) {
					if (this.anIntArrayArrayArray1[local179][local187] != null) {
						@Pc(208) Class77_Sub21[] local208 = this.aClass77_Sub21ArrayArrayArray1[local179][local187];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray2[local179][local187];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray3[local179][local187];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray6[local179][local187];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray1[local179][local187];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local179][local187];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local179][local187];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(271) float local271 = this.aFloatArrayArray4[local179][local187];
						@Pc(278) float local278 = this.aFloatArrayArray2[local179][local187];
						@Pc(285) float local285 = this.aFloatArrayArray3[local179][local187];
						@Pc(294) float local294 = this.aFloatArrayArray4[local179][local187 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray2[local179][local187 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray3[local179][local187 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray4[local179 + 1][local187 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray2[local179 + 1][local187 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray3[local179 + 1][local187 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray4[local179 + 1][local187];
						@Pc(363) float local363 = this.aFloatArrayArray2[local179 + 1][local187];
						@Pc(372) float local372 = this.aFloatArrayArray3[local179 + 1][local187];
						@Pc(380) int local380 = local16[local179][local187] & 0xFF;
						@Pc(390) int local390 = local16[local179][local187 + 1] & 0xFF;
						@Pc(402) int local402 = local16[local179 + 1][local187 + 1] & 0xFF;
						@Pc(412) int local412 = local16[local179 + 1][local187] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(426) int local426;
						label346: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(424) Class77_Sub21 local424 = local208[local416];
							for (local426 = 0; local426 < local414; local426++) {
								if (local177[local426] == local424) {
									continue label346;
								}
							}
							local177[local414++] = local424;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray1[local187 * this.anInt607 * -1924295585 + local179] = new short[local236.length];
						for (@Pc(462) int local462 = 0; local462 < local236.length; local462++) {
							@Pc(477) int local477 = (local179 << this.anInt609 * -1495101509) + local215[local462];
							@Pc(488) int local488 = (local187 << this.anInt609 * -1495101509) + local222[local462];
							@Pc(493) int local493 = local477 >> this.anInt508;
							@Pc(498) int local498 = local488 >> this.anInt508;
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
							} else if (local536 == 0 && local540 == this.anInt608 * 127780559) {
								local552 = local294;
								local554 = local303;
								local556 = local312;
								local560 = local542 - local390;
							} else if (local536 == this.anInt608 * 127780559 && local540 == this.anInt608 * 127780559) {
								local552 = local323;
								local554 = local334;
								local556 = local345;
								local560 = local542 - local402;
							} else if (local536 == this.anInt608 * 127780559 && local540 == 0) {
								local552 = local354;
								local554 = local363;
								local556 = local372;
								local560 = local542 - local412;
							} else {
								@Pc(631) float local631 = (float) local536 / (float) (this.anInt608 * 127780559);
								@Pc(640) float local640 = (float) local540 / (float) (this.anInt608 * 127780559);
								@Pc(648) float local648 = local271 + (local354 - local271) * local631;
								local656 = local278 + (local363 - local278) * local631;
								@Pc(664) float local664 = local285 + (local372 - local285) * local631;
								@Pc(672) float local672 = local294 + (local323 - local294) * local631;
								@Pc(680) float local680 = local303 + (local334 - local303) * local631;
								@Pc(688) float local688 = local312 + (local345 - local312) * local631;
								local552 = local648 + (local672 - local648) * local640;
								local554 = local656 + (local680 - local656) * local640;
								local556 = local664 + (local688 - local664) * local640;
								@Pc(725) int local725 = local380 + ((local412 - local380) * local536 >> this.anInt609 * -1495101509);
								@Pc(738) int local738 = local390 + ((local402 - local390) * local536 >> this.anInt609 * -1495101509);
								local560 = local542 - (local725 + ((local738 - local725) * local540 >> this.anInt609 * -1495101509));
							}
							if (local502 != -1) {
								@Pc(764) int local764 = (local502 & 0x7F) * local560 >> 7;
								if (local764 < 2) {
									local764 = 2;
								} else if (local764 > 126) {
									local764 = 126;
								}
								local544 = Class656.anIntArray532[local502 & 0xFF80 | local764];
								if ((this.anInt507 & 0x7) == 0) {
									local546 = this.aClass86_Sub3_24.aFloatArray23[0] * local552 + this.aClass86_Sub3_24.aFloatArray23[1] * local554 + this.aClass86_Sub3_24.aFloatArray23[2] * local556;
									local546 = this.aClass86_Sub3_24.aFloat68 + local546 * (local546 > 0.0F ? this.aClass86_Sub3_24.aFloat73 : this.aClass86_Sub3_24.aFloat57);
								}
							}
							@Pc(832) Class77 local832 = null;
							if ((local477 & this.anInt512 - 1) == 0 && (local488 & this.anInt512 - 1) == 0) {
								local832 = local173.method173(local532);
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
									local882 = Class656.anIntArray532[local506 & 0xFF80 | local863];
									if ((this.anInt507 & 0x7) == 0) {
										@Pc(910) float local910 = this.aClass86_Sub3_24.aFloatArray23[0] * local552 + this.aClass86_Sub3_24.aFloatArray23[1] * local554 + this.aClass86_Sub3_24.aFloatArray23[2] * local556;
										local656 = this.aClass86_Sub3_24.aFloat68 + local546 * (local546 > 0.0F ? this.aClass86_Sub3_24.aFloat73 : this.aClass86_Sub3_24.aFloat57);
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
								if (this.aClass86_Sub3_24.aBoolean116) {
									local152.y((float) local477);
									local152.y((float) (this.method5493(local477, local488) + local514));
									local152.y((float) local488);
									local152.l((byte) (local882 >> 16));
									local152.l((byte) (local882 >> 8));
									local152.l((byte) local882);
									local152.l(-1);
									local152.y((float) local477);
									local152.y((float) local488);
									if (this.anIntArrayArrayArray5 != null) {
										local152.y(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt507 & 0x7) != 0) {
										local152.y(local552);
										local152.y(local554);
										local152.y(local556);
									}
								} else {
									local152.w((float) local477);
									local152.w((float) (this.method5493(local477, local488) + local514));
									local152.w((float) local488);
									local152.l((byte) (local882 >> 16));
									local152.l((byte) (local882 >> 8));
									local152.l((byte) local882);
									local152.l(-1);
									local152.w((float) local477);
									local152.w((float) local488);
									if (this.anIntArrayArrayArray5 != null) {
										local152.w(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt507 & 0x7) != 0) {
										local152.w(local552);
										local152.w(local554);
										local152.w(local556);
									}
								}
								local426 = this.anInt505++;
								local460[local462] = (short) local426;
								if (local502 != -1) {
									local156[local426] = local208[local462];
								}
								local173.method184(new Class77_Sub17(local460[local462]), local532);
							} else {
								local460[local462] = ((Class77_Sub17) local832).aShort101;
								local426 = local460[local462] & 0xFFFF;
								if (local502 != -1 && local208[local462].aLong229 * 8258869577519436579L < local156[local426].aLong229 * 8258869577519436579L) {
									local156[local426] = local208[local462];
								}
							}
							for (local882 = 0; local882 < local414; local882++) {
								local177[local882].method13527(local426, local544, local560, local546);
							}
							this.anInt509++;
						}
					}
				}
			}
			for (local179 = 0; local179 < this.anInt505; local179++) {
				@Pc(1263) Class77_Sub21 local1263 = local156[local179];
				if (local1263 != null) {
					local1263.method13521(local179);
				}
			}
			for (local179 = 0; local179 < this.anInt607 * -1924295585; local179++) {
				for (local187 = 0; local187 < this.anInt606 * -1466328823; local187++) {
					@Pc(1298) short[] local1298 = this.aShortArrayArray1[local187 * this.anInt607 * -1924295585 + local179];
					if (local1298 != null) {
						@Pc(1302) int local1302 = 0;
						@Pc(1304) int local1304 = 0;
						while (local1304 < local1298.length) {
							@Pc(1315) int local1315 = local1298[local1304++] & 0xFFFF;
							@Pc(1322) int local1322 = local1298[local1304++] & 0xFFFF;
							@Pc(1329) int local1329 = local1298[local1304++] & 0xFFFF;
							@Pc(1333) Class77_Sub21 local1333 = local156[local1315];
							@Pc(1337) Class77_Sub21 local1337 = local156[local1322];
							@Pc(1341) Class77_Sub21 local1341 = local156[local1329];
							@Pc(1343) Class77_Sub21 local1343 = null;
							if (local1333 != null) {
								local1333.method13526(local179, local187, local1302);
								local1343 = local1333;
							}
							if (local1337 != null) {
								local1337.method13526(local179, local187, local1302);
								if (local1343 == null || local1337.aLong229 * 8258869577519436579L < local1343.aLong229 * 8258869577519436579L) {
									local1343 = local1337;
								}
							}
							if (local1341 != null) {
								local1341.method13526(local179, local187, local1302);
								if (local1343 == null || local1341.aLong229 * 8258869577519436579L < local1343.aLong229 * 8258869577519436579L) {
									local1343 = local1341;
								}
							}
							if (local1343 != null) {
								if (local1333 != null) {
									local1343.method13521(local1315);
								}
								if (local1337 != null) {
									local1343.method13521(local1322);
								}
								if (local1341 != null) {
									local1343.method13521(local1329);
								}
								local1343.method13526(local179, local187, local1302);
							}
							local1302++;
						}
					}
				}
			}
			local152.t();
			this.anInterface14_2 = this.aClass86_Sub3_24.method6143(local18, local147, local152.c(), false);
			if (this.anInterface14_2 instanceof Class81_Sub1) {
				local147.j();
			}
			this.aClass172_6 = new Class172(this.anInterface14_2, 5126, 3, 0);
			this.aClass172_5 = new Class172(this.anInterface14_2, 5121, 4, 12);
			@Pc(1475) byte local1475;
			if (this.anIntArrayArrayArray5 == null) {
				this.aClass172_8 = new Class172(this.anInterface14_2, 5126, 2, 16);
				local1475 = 24;
			} else {
				this.aClass172_8 = new Class172(this.anInterface14_2, 5126, 3, 16);
				local1475 = 28;
			}
			if ((this.anInt507 & 0x7) != 0) {
				this.aClass172_7 = new Class172(this.anInterface14_2, 5126, 3, local1475);
			}
			@Pc(1508) long[] local1508 = new long[this.aClass77Array2.length];
			for (@Pc(1510) int local1510 = 0; local1510 < this.aClass77Array2.length; local1510++) {
				@Pc(1521) Class77_Sub21 local1521 = (Class77_Sub21) this.aClass77Array2[local1510];
				local1508[local1510] = local1521.aLong229 * 8258869577519436579L;
				local1521.method13532(this.anInt505);
			}
			Class420.method28692(local1508, this.aClass77Array2);
			if (this.aClass185_1 != null) {
				this.aClass185_1.method24601();
			}
		} else {
			this.aClass185_1 = null;
		}
		if ((this.anInt504 & 0x2) == 0) {
			this.anIntArrayArrayArray3 = null;
			this.anIntArrayArrayArray2 = null;
			this.anIntArrayArrayArray1 = null;
		}
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray4 = null;
		this.aClass77_Sub21ArrayArrayArray1 = null;
		this.aByteArrayArray3 = null;
		this.aClass12_4 = null;
		this.aFloatArrayArray3 = null;
		this.aFloatArrayArray2 = null;
		this.aFloatArrayArray4 = null;
	}

	@OriginalMember(owner = "client!aeg", name = "l", descriptor = "()V", line = 177)
	@Override
	public void method5511() {
		if (this.anInt510 > 0) {
			@Pc(16) byte[][] local16 = new byte[this.anInt607 * -1924295585 + 1][this.anInt606 * -1466328823 + 1];
			@Pc(18) int local18;
			for (local18 = 1; local18 < this.anInt607 * -1924295585; local18++) {
				for (@Pc(26) int local26 = 1; local26 < this.anInt606 * -1466328823; local26++) {
					local16[local18][local26] = (byte) ((this.aByteArrayArray3[local18 - 1][local26] >> 2) + (this.aByteArrayArray3[local18 + 1][local26] >> 3) + (this.aByteArrayArray3[local18][local26 - 1] >> 2) + (this.aByteArrayArray3[local18][local26 + 1] >> 3) + (this.aByteArrayArray3[local18][local26] >> 1));
				}
			}
			this.aClass77Array2 = new Class77[this.aClass12_4.method183()];
			this.aClass12_4.method180(this.aClass77Array2);
			for (local18 = 0; local18 < this.aClass77Array2.length; local18++) {
				((Class77_Sub21) this.aClass77Array2[local18]).method13516(this.anInt510);
			}
			local18 = 24;
			if (this.anIntArrayArrayArray5 != null) {
				local18 += 4;
			}
			if ((this.anInt507 & 0x7) != 0) {
				local18 += 12;
			}
			@Pc(147) NativeHeapBuffer local147 = this.aClass86_Sub3_24.aNativeHeap2.c(this.anInt510 * local18, false);
			@Pc(152) Stream local152 = new Stream(local147);
			@Pc(156) Class77_Sub21[] local156 = new Class77_Sub21[this.anInt510];
			@Pc(163) int local163 = Class462.method29538(this.anInt510 / 4);
			if (local163 < 1) {
				local163 = 1;
			}
			@Pc(173) Class12 local173 = new Class12(local163);
			@Pc(177) Class77_Sub21[] local177 = new Class77_Sub21[this.anInt511];
			@Pc(179) int local179;
			@Pc(187) int local187;
			for (local179 = 0; local179 < this.anInt607 * -1924295585; local179++) {
				for (local187 = 0; local187 < this.anInt606 * -1466328823; local187++) {
					if (this.anIntArrayArrayArray1[local179][local187] != null) {
						@Pc(208) Class77_Sub21[] local208 = this.aClass77_Sub21ArrayArrayArray1[local179][local187];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray2[local179][local187];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray3[local179][local187];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray6[local179][local187];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray1[local179][local187];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray4 == null ? null : this.anIntArrayArrayArray4[local179][local187];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local179][local187];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(271) float local271 = this.aFloatArrayArray4[local179][local187];
						@Pc(278) float local278 = this.aFloatArrayArray2[local179][local187];
						@Pc(285) float local285 = this.aFloatArrayArray3[local179][local187];
						@Pc(294) float local294 = this.aFloatArrayArray4[local179][local187 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray2[local179][local187 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray3[local179][local187 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray4[local179 + 1][local187 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray2[local179 + 1][local187 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray3[local179 + 1][local187 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray4[local179 + 1][local187];
						@Pc(363) float local363 = this.aFloatArrayArray2[local179 + 1][local187];
						@Pc(372) float local372 = this.aFloatArrayArray3[local179 + 1][local187];
						@Pc(380) int local380 = local16[local179][local187] & 0xFF;
						@Pc(390) int local390 = local16[local179][local187 + 1] & 0xFF;
						@Pc(402) int local402 = local16[local179 + 1][local187 + 1] & 0xFF;
						@Pc(412) int local412 = local16[local179 + 1][local187] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(426) int local426;
						label346: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(424) Class77_Sub21 local424 = local208[local416];
							for (local426 = 0; local426 < local414; local426++) {
								if (local177[local426] == local424) {
									continue label346;
								}
							}
							local177[local414++] = local424;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray1[local187 * this.anInt607 * -1924295585 + local179] = new short[local236.length];
						for (@Pc(462) int local462 = 0; local462 < local236.length; local462++) {
							@Pc(477) int local477 = (local179 << this.anInt609 * -1495101509) + local215[local462];
							@Pc(488) int local488 = (local187 << this.anInt609 * -1495101509) + local222[local462];
							@Pc(493) int local493 = local477 >> this.anInt508;
							@Pc(498) int local498 = local488 >> this.anInt508;
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
							} else if (local536 == 0 && local540 == this.anInt608 * 127780559) {
								local552 = local294;
								local554 = local303;
								local556 = local312;
								local560 = local542 - local390;
							} else if (local536 == this.anInt608 * 127780559 && local540 == this.anInt608 * 127780559) {
								local552 = local323;
								local554 = local334;
								local556 = local345;
								local560 = local542 - local402;
							} else if (local536 == this.anInt608 * 127780559 && local540 == 0) {
								local552 = local354;
								local554 = local363;
								local556 = local372;
								local560 = local542 - local412;
							} else {
								@Pc(631) float local631 = (float) local536 / (float) (this.anInt608 * 127780559);
								@Pc(640) float local640 = (float) local540 / (float) (this.anInt608 * 127780559);
								@Pc(648) float local648 = local271 + (local354 - local271) * local631;
								local656 = local278 + (local363 - local278) * local631;
								@Pc(664) float local664 = local285 + (local372 - local285) * local631;
								@Pc(672) float local672 = local294 + (local323 - local294) * local631;
								@Pc(680) float local680 = local303 + (local334 - local303) * local631;
								@Pc(688) float local688 = local312 + (local345 - local312) * local631;
								local552 = local648 + (local672 - local648) * local640;
								local554 = local656 + (local680 - local656) * local640;
								local556 = local664 + (local688 - local664) * local640;
								@Pc(725) int local725 = local380 + ((local412 - local380) * local536 >> this.anInt609 * -1495101509);
								@Pc(738) int local738 = local390 + ((local402 - local390) * local536 >> this.anInt609 * -1495101509);
								local560 = local542 - (local725 + ((local738 - local725) * local540 >> this.anInt609 * -1495101509));
							}
							if (local502 != -1) {
								@Pc(764) int local764 = (local502 & 0x7F) * local560 >> 7;
								if (local764 < 2) {
									local764 = 2;
								} else if (local764 > 126) {
									local764 = 126;
								}
								local544 = Class656.anIntArray532[local502 & 0xFF80 | local764];
								if ((this.anInt507 & 0x7) == 0) {
									local546 = this.aClass86_Sub3_24.aFloatArray23[0] * local552 + this.aClass86_Sub3_24.aFloatArray23[1] * local554 + this.aClass86_Sub3_24.aFloatArray23[2] * local556;
									local546 = this.aClass86_Sub3_24.aFloat68 + local546 * (local546 > 0.0F ? this.aClass86_Sub3_24.aFloat73 : this.aClass86_Sub3_24.aFloat57);
								}
							}
							@Pc(832) Class77 local832 = null;
							if ((local477 & this.anInt512 - 1) == 0 && (local488 & this.anInt512 - 1) == 0) {
								local832 = local173.method173(local532);
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
									local882 = Class656.anIntArray532[local506 & 0xFF80 | local863];
									if ((this.anInt507 & 0x7) == 0) {
										@Pc(910) float local910 = this.aClass86_Sub3_24.aFloatArray23[0] * local552 + this.aClass86_Sub3_24.aFloatArray23[1] * local554 + this.aClass86_Sub3_24.aFloatArray23[2] * local556;
										local656 = this.aClass86_Sub3_24.aFloat68 + local546 * (local546 > 0.0F ? this.aClass86_Sub3_24.aFloat73 : this.aClass86_Sub3_24.aFloat57);
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
								if (this.aClass86_Sub3_24.aBoolean116) {
									local152.y((float) local477);
									local152.y((float) (this.method5493(local477, local488) + local514));
									local152.y((float) local488);
									local152.l((byte) (local882 >> 16));
									local152.l((byte) (local882 >> 8));
									local152.l((byte) local882);
									local152.l(-1);
									local152.y((float) local477);
									local152.y((float) local488);
									if (this.anIntArrayArrayArray5 != null) {
										local152.y(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt507 & 0x7) != 0) {
										local152.y(local552);
										local152.y(local554);
										local152.y(local556);
									}
								} else {
									local152.w((float) local477);
									local152.w((float) (this.method5493(local477, local488) + local514));
									local152.w((float) local488);
									local152.l((byte) (local882 >> 16));
									local152.l((byte) (local882 >> 8));
									local152.l((byte) local882);
									local152.l(-1);
									local152.w((float) local477);
									local152.w((float) local488);
									if (this.anIntArrayArrayArray5 != null) {
										local152.w(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt507 & 0x7) != 0) {
										local152.w(local552);
										local152.w(local554);
										local152.w(local556);
									}
								}
								local426 = this.anInt505++;
								local460[local462] = (short) local426;
								if (local502 != -1) {
									local156[local426] = local208[local462];
								}
								local173.method184(new Class77_Sub17(local460[local462]), local532);
							} else {
								local460[local462] = ((Class77_Sub17) local832).aShort101;
								local426 = local460[local462] & 0xFFFF;
								if (local502 != -1 && local208[local462].aLong229 * 8258869577519436579L < local156[local426].aLong229 * 8258869577519436579L) {
									local156[local426] = local208[local462];
								}
							}
							for (local882 = 0; local882 < local414; local882++) {
								local177[local882].method13527(local426, local544, local560, local546);
							}
							this.anInt509++;
						}
					}
				}
			}
			for (local179 = 0; local179 < this.anInt505; local179++) {
				@Pc(1263) Class77_Sub21 local1263 = local156[local179];
				if (local1263 != null) {
					local1263.method13521(local179);
				}
			}
			for (local179 = 0; local179 < this.anInt607 * -1924295585; local179++) {
				for (local187 = 0; local187 < this.anInt606 * -1466328823; local187++) {
					@Pc(1298) short[] local1298 = this.aShortArrayArray1[local187 * this.anInt607 * -1924295585 + local179];
					if (local1298 != null) {
						@Pc(1302) int local1302 = 0;
						@Pc(1304) int local1304 = 0;
						while (local1304 < local1298.length) {
							@Pc(1315) int local1315 = local1298[local1304++] & 0xFFFF;
							@Pc(1322) int local1322 = local1298[local1304++] & 0xFFFF;
							@Pc(1329) int local1329 = local1298[local1304++] & 0xFFFF;
							@Pc(1333) Class77_Sub21 local1333 = local156[local1315];
							@Pc(1337) Class77_Sub21 local1337 = local156[local1322];
							@Pc(1341) Class77_Sub21 local1341 = local156[local1329];
							@Pc(1343) Class77_Sub21 local1343 = null;
							if (local1333 != null) {
								local1333.method13526(local179, local187, local1302);
								local1343 = local1333;
							}
							if (local1337 != null) {
								local1337.method13526(local179, local187, local1302);
								if (local1343 == null || local1337.aLong229 * 8258869577519436579L < local1343.aLong229 * 8258869577519436579L) {
									local1343 = local1337;
								}
							}
							if (local1341 != null) {
								local1341.method13526(local179, local187, local1302);
								if (local1343 == null || local1341.aLong229 * 8258869577519436579L < local1343.aLong229 * 8258869577519436579L) {
									local1343 = local1341;
								}
							}
							if (local1343 != null) {
								if (local1333 != null) {
									local1343.method13521(local1315);
								}
								if (local1337 != null) {
									local1343.method13521(local1322);
								}
								if (local1341 != null) {
									local1343.method13521(local1329);
								}
								local1343.method13526(local179, local187, local1302);
							}
							local1302++;
						}
					}
				}
			}
			local152.t();
			this.anInterface14_2 = this.aClass86_Sub3_24.method6143(local18, local147, local152.c(), false);
			if (this.anInterface14_2 instanceof Class81_Sub1) {
				local147.j();
			}
			this.aClass172_6 = new Class172(this.anInterface14_2, 5126, 3, 0);
			this.aClass172_5 = new Class172(this.anInterface14_2, 5121, 4, 12);
			@Pc(1475) byte local1475;
			if (this.anIntArrayArrayArray5 == null) {
				this.aClass172_8 = new Class172(this.anInterface14_2, 5126, 2, 16);
				local1475 = 24;
			} else {
				this.aClass172_8 = new Class172(this.anInterface14_2, 5126, 3, 16);
				local1475 = 28;
			}
			if ((this.anInt507 & 0x7) != 0) {
				this.aClass172_7 = new Class172(this.anInterface14_2, 5126, 3, local1475);
			}
			@Pc(1508) long[] local1508 = new long[this.aClass77Array2.length];
			for (@Pc(1510) int local1510 = 0; local1510 < this.aClass77Array2.length; local1510++) {
				@Pc(1521) Class77_Sub21 local1521 = (Class77_Sub21) this.aClass77Array2[local1510];
				local1508[local1510] = local1521.aLong229 * 8258869577519436579L;
				local1521.method13532(this.anInt505);
			}
			Class420.method28692(local1508, this.aClass77Array2);
			if (this.aClass185_1 != null) {
				this.aClass185_1.method24601();
			}
		} else {
			this.aClass185_1 = null;
		}
		if ((this.anInt504 & 0x2) == 0) {
			this.anIntArrayArrayArray3 = null;
			this.anIntArrayArrayArray2 = null;
			this.anIntArrayArrayArray1 = null;
		}
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray6 = null;
		this.anIntArrayArrayArray4 = null;
		this.aClass77_Sub21ArrayArrayArray1 = null;
		this.aByteArrayArray3 = null;
		this.aClass12_4 = null;
		this.aFloatArrayArray3 = null;
		this.aFloatArrayArray2 = null;
		this.aFloatArrayArray4 = null;
	}

	@OriginalMember(owner = "client!aeg", name = "y", descriptor = "(III[[ZZI)V", line = 470)
	@Override
	public void method5520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method4373(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aeg", name = "m", descriptor = "(III[[ZZI)V", line = 470)
	@Override
	public void method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method4373(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aeg", name = "n", descriptor = "(III[[ZZI)V", line = 470)
	@Override
	public void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method4373(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aeg", name = "a", descriptor = "(III[[ZZI)V", line = 470)
	@Override
	public void method5528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method4373(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aeg", name = "h", descriptor = "(III[[ZZI)V", line = 470)
	@Override
	public void method5530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method4373(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aeg", name = "aj", descriptor = "(III[[ZZI)V", line = 470)
	@Override
	public void method5531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method4373(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aeg", name = "ai", descriptor = "(III[[ZZI)V", line = 470)
	@Override
	public void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method4373(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aeg", name = "ba", descriptor = "(III[[ZZI)V", line = 474)
	void method4371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass77Array2 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.aClass86_Sub3_24.anIntArray60.length < local12) {
			this.aClass86_Sub3_24.anIntArray60 = new int[local12];
		}
		if (this.aClass86_Sub3_24.aClass77_Sub39_Sub2_1.aByteArray53.length < this.anInt509 * 2) {
			this.aClass86_Sub3_24.aClass77_Sub39_Sub2_1 = new Class77_Sub39_Sub2(this.anInt509 * 2);
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
		if (local67 > this.anInt607 * -1924295585 - 1) {
			local67 = this.anInt607 * -1924295585 - 1;
		}
		@Pc(86) int local86 = arg1 + arg2;
		if (local86 > this.anInt606 * -1466328823 - 1) {
			local86 = this.anInt606 * -1466328823 - 1;
		}
		@Pc(103) int local103 = 0;
		@Pc(107) int[] local107 = this.aClass86_Sub3_24.anIntArray60;
		@Pc(109) int local109;
		for (local109 = local47; local109 <= local67; local109++) {
			@Pc(118) boolean[] local118 = arg3[local109 - local49];
			for (@Pc(120) int local120 = local57; local120 <= local86; local120++) {
				if (local118[local120 - local59]) {
					local107[local103++] = local120 * this.anInt607 * -1924295585 + local109;
				}
			}
		}
		this.aClass86_Sub3_24.method6178();
		this.aClass86_Sub3_24.method6233((this.anInt507 & 0x7) != 0);
		for (local109 = 0; local109 < this.aClass77Array2.length; local109++) {
			((Class77_Sub21) this.aClass77Array2[local109]).method13533(local107, local103);
		}
		if (!this.aClass695_4.method36416()) {
			local109 = this.aClass86_Sub3_24.anInt721;
			@Pc(191) int local191 = this.aClass86_Sub3_24.anInt715;
			this.aClass86_Sub3_24.method20232(0, local191, this.aClass86_Sub3_24.anInt707);
			this.aClass86_Sub3_24.method6233(false);
			this.aClass86_Sub3_24.method6241(false);
			this.aClass86_Sub3_24.method6250(128);
			this.aClass86_Sub3_24.method6180(-2);
			this.aClass86_Sub3_24.method6195(this.aClass86_Sub3_24.aClass78_Sub2_2);
			this.aClass86_Sub3_24.method6207(8448, 7681);
			this.aClass86_Sub3_24.method6213(0, 34166, 770);
			this.aClass86_Sub3_24.method6214(0, 34167, 770);
			for (@Pc(243) Class77 local243 = this.aClass695_4.method36395(); local243 != null; local243 = this.aClass695_4.method36406()) {
				@Pc(248) Class77_Sub5 local248 = (Class77_Sub5) local243;
				local248.method13233(arg0, arg1, arg2, arg3);
			}
			this.aClass86_Sub3_24.method6213(0, 5890, 768);
			this.aClass86_Sub3_24.method6214(0, 5890, 770);
			this.aClass86_Sub3_24.method6195(null);
			this.aClass86_Sub3_24.method20232(local109, local191, this.aClass86_Sub3_24.anInt707);
		}
		if (this.aClass185_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass86_Sub3_24.method6155(this.aClass172_6, null, null, this.aClass172_8);
		this.aClass185_1.method24609(arg0, arg1, arg2, arg3, arg4);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aeg", name = "bv", descriptor = "(III[[ZZI)V", line = 474)
	void method4372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass77Array2 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.aClass86_Sub3_24.anIntArray60.length < local12) {
			this.aClass86_Sub3_24.anIntArray60 = new int[local12];
		}
		if (this.aClass86_Sub3_24.aClass77_Sub39_Sub2_1.aByteArray53.length < this.anInt509 * 2) {
			this.aClass86_Sub3_24.aClass77_Sub39_Sub2_1 = new Class77_Sub39_Sub2(this.anInt509 * 2);
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
		if (local67 > this.anInt607 * -1924295585 - 1) {
			local67 = this.anInt607 * -1924295585 - 1;
		}
		@Pc(86) int local86 = arg1 + arg2;
		if (local86 > this.anInt606 * -1466328823 - 1) {
			local86 = this.anInt606 * -1466328823 - 1;
		}
		@Pc(103) int local103 = 0;
		@Pc(107) int[] local107 = this.aClass86_Sub3_24.anIntArray60;
		@Pc(109) int local109;
		for (local109 = local47; local109 <= local67; local109++) {
			@Pc(118) boolean[] local118 = arg3[local109 - local49];
			for (@Pc(120) int local120 = local57; local120 <= local86; local120++) {
				if (local118[local120 - local59]) {
					local107[local103++] = local120 * this.anInt607 * -1924295585 + local109;
				}
			}
		}
		this.aClass86_Sub3_24.method6178();
		this.aClass86_Sub3_24.method6233((this.anInt507 & 0x7) != 0);
		for (local109 = 0; local109 < this.aClass77Array2.length; local109++) {
			((Class77_Sub21) this.aClass77Array2[local109]).method13533(local107, local103);
		}
		if (!this.aClass695_4.method36416()) {
			local109 = this.aClass86_Sub3_24.anInt721;
			@Pc(191) int local191 = this.aClass86_Sub3_24.anInt715;
			this.aClass86_Sub3_24.method20232(0, local191, this.aClass86_Sub3_24.anInt707);
			this.aClass86_Sub3_24.method6233(false);
			this.aClass86_Sub3_24.method6241(false);
			this.aClass86_Sub3_24.method6250(128);
			this.aClass86_Sub3_24.method6180(-2);
			this.aClass86_Sub3_24.method6195(this.aClass86_Sub3_24.aClass78_Sub2_2);
			this.aClass86_Sub3_24.method6207(8448, 7681);
			this.aClass86_Sub3_24.method6213(0, 34166, 770);
			this.aClass86_Sub3_24.method6214(0, 34167, 770);
			for (@Pc(243) Class77 local243 = this.aClass695_4.method36395(); local243 != null; local243 = this.aClass695_4.method36406()) {
				@Pc(248) Class77_Sub5 local248 = (Class77_Sub5) local243;
				local248.method13233(arg0, arg1, arg2, arg3);
			}
			this.aClass86_Sub3_24.method6213(0, 5890, 768);
			this.aClass86_Sub3_24.method6214(0, 5890, 770);
			this.aClass86_Sub3_24.method6195(null);
			this.aClass86_Sub3_24.method20232(local109, local191, this.aClass86_Sub3_24.anInt707);
		}
		if (this.aClass185_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass86_Sub3_24.method6155(this.aClass172_6, null, null, this.aClass172_8);
		this.aClass185_1.method24609(arg0, arg1, arg2, arg3, arg4);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aeg", name = "bc", descriptor = "(III[[ZZI)V", line = 474)
	void method4373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass77Array2 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.aClass86_Sub3_24.anIntArray60.length < local12) {
			this.aClass86_Sub3_24.anIntArray60 = new int[local12];
		}
		if (this.aClass86_Sub3_24.aClass77_Sub39_Sub2_1.aByteArray53.length < this.anInt509 * 2) {
			this.aClass86_Sub3_24.aClass77_Sub39_Sub2_1 = new Class77_Sub39_Sub2(this.anInt509 * 2);
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
		if (local67 > this.anInt607 * -1924295585 - 1) {
			local67 = this.anInt607 * -1924295585 - 1;
		}
		@Pc(86) int local86 = arg1 + arg2;
		if (local86 > this.anInt606 * -1466328823 - 1) {
			local86 = this.anInt606 * -1466328823 - 1;
		}
		@Pc(103) int local103 = 0;
		@Pc(107) int[] local107 = this.aClass86_Sub3_24.anIntArray60;
		@Pc(109) int local109;
		for (local109 = local47; local109 <= local67; local109++) {
			@Pc(118) boolean[] local118 = arg3[local109 - local49];
			for (@Pc(120) int local120 = local57; local120 <= local86; local120++) {
				if (local118[local120 - local59]) {
					local107[local103++] = local120 * this.anInt607 * -1924295585 + local109;
				}
			}
		}
		this.aClass86_Sub3_24.method6178();
		this.aClass86_Sub3_24.method6233((this.anInt507 & 0x7) != 0);
		for (local109 = 0; local109 < this.aClass77Array2.length; local109++) {
			((Class77_Sub21) this.aClass77Array2[local109]).method13533(local107, local103);
		}
		if (!this.aClass695_4.method36416()) {
			local109 = this.aClass86_Sub3_24.anInt721;
			@Pc(191) int local191 = this.aClass86_Sub3_24.anInt715;
			this.aClass86_Sub3_24.method20232(0, local191, this.aClass86_Sub3_24.anInt707);
			this.aClass86_Sub3_24.method6233(false);
			this.aClass86_Sub3_24.method6241(false);
			this.aClass86_Sub3_24.method6250(128);
			this.aClass86_Sub3_24.method6180(-2);
			this.aClass86_Sub3_24.method6195(this.aClass86_Sub3_24.aClass78_Sub2_2);
			this.aClass86_Sub3_24.method6207(8448, 7681);
			this.aClass86_Sub3_24.method6213(0, 34166, 770);
			this.aClass86_Sub3_24.method6214(0, 34167, 770);
			for (@Pc(243) Class77 local243 = this.aClass695_4.method36395(); local243 != null; local243 = this.aClass695_4.method36406()) {
				@Pc(248) Class77_Sub5 local248 = (Class77_Sub5) local243;
				local248.method13233(arg0, arg1, arg2, arg3);
			}
			this.aClass86_Sub3_24.method6213(0, 5890, 768);
			this.aClass86_Sub3_24.method6214(0, 5890, 770);
			this.aClass86_Sub3_24.method6195(null);
			this.aClass86_Sub3_24.method20232(local109, local191, this.aClass86_Sub3_24.anInt707);
		}
		if (this.aClass185_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass86_Sub3_24.method6155(this.aClass172_6, null, null, this.aClass172_8);
		this.aClass185_1.method24609(arg0, arg1, arg2, arg3, arg4);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aeg", name = "w", descriptor = "(IIIIIII[[Z)V", line = 540)
	@Override
	public void method5540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class92 local4 = this.aClass86_Sub3_24.method19940();
		if (this.anInt510 <= 0 || local4 == null) {
			return;
		}
		this.aClass86_Sub3_24.method6087();
		this.aClass86_Sub3_24.method6229(false);
		this.aClass86_Sub3_24.method6233(false);
		this.aClass86_Sub3_24.method6239(false);
		this.aClass86_Sub3_24.method6241(false);
		this.aClass86_Sub3_24.method6250(0);
		this.aClass86_Sub3_24.method6180(-2);
		this.aClass86_Sub3_24.method6195(null);
		aFloatArray14[0] = (float) arg2 / ((float) (this.anInt608 * 127780559) * 128.0F * (float) local4.method23491());
		aFloatArray14[1] = 0.0F;
		aFloatArray14[2] = 0.0F;
		aFloatArray14[3] = 0.0F;
		aFloatArray14[4] = 0.0F;
		aFloatArray14[5] = (float) arg2 / ((float) (this.anInt608 * 127780559) * 128.0F * (float) local4.method23493());
		aFloatArray14[6] = 0.0F;
		aFloatArray14[7] = 0.0F;
		aFloatArray14[8] = 0.0F;
		aFloatArray14[9] = 0.0F;
		aFloatArray14[10] = 0.0F;
		aFloatArray14[11] = 0.0F;
		aFloatArray14[12] = -1.0F - ((float) (arg3 * arg2) / 128.0F - (float) (arg0 * 2)) / (float) local4.method23491();
		aFloatArray14[13] = 1.0F - ((float) (arg1 * 2) + (float) (arg6 * arg2) / 128.0F) / (float) local4.method23493();
		aFloatArray14[14] = 0.0F;
		aFloatArray14[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(aFloatArray14, 0);
		aFloatArray14[0] = 1.0F;
		aFloatArray14[1] = 0.0F;
		aFloatArray14[2] = 0.0F;
		aFloatArray14[3] = 0.0F;
		aFloatArray14[4] = 0.0F;
		aFloatArray14[5] = 0.0F;
		aFloatArray14[6] = 1.0F;
		aFloatArray14[7] = 0.0F;
		aFloatArray14[8] = 0.0F;
		aFloatArray14[9] = 1.0F;
		aFloatArray14[10] = 0.0F;
		aFloatArray14[11] = 0.0F;
		aFloatArray14[12] = 0.0F;
		aFloatArray14[13] = 0.0F;
		aFloatArray14[14] = 0.0F;
		aFloatArray14[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aFloatArray14, 0);
		if ((this.anInt507 & 0x7) == 0) {
			this.aClass86_Sub3_24.method6233(false);
		} else {
			this.aClass86_Sub3_24.method6233(true);
			this.aClass86_Sub3_24.method6118();
		}
		this.aClass86_Sub3_24.method6155(this.aClass172_6, this.aClass172_7, this.aClass172_5, this.aClass172_8);
		if (this.aClass86_Sub3_24.aClass77_Sub39_Sub2_1.aByteArray53.length < this.anInt509 * 2) {
			this.aClass86_Sub3_24.aClass77_Sub39_Sub2_1 = new Class77_Sub39_Sub2(this.anInt509 * 2);
		} else {
			this.aClass86_Sub3_24.aClass77_Sub39_Sub2_1.anInt3089 = 0;
		}
		@Pc(293) int local293 = 0;
		@Pc(297) Class77_Sub39_Sub2 local297 = this.aClass86_Sub3_24.aClass77_Sub39_Sub2_1;
		@Pc(303) int local303;
		@Pc(315) int local315;
		@Pc(317) int local317;
		@Pc(335) short[] local335;
		@Pc(339) int local339;
		if (this.aClass86_Sub3_24.aBoolean116) {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt607 * -1924295585 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray1[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.method22408(local335[local339] & 0xFFFF);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		} else {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt607 * -1924295585 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray1[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.method22412(local335[local339] & 0xFFFF);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		}
		if (local293 > 0) {
			@Pc(433) Class74_Sub2 local433 = new Class74_Sub2(this.aClass86_Sub3_24, 5123, local297.aByteArray53, local297.anInt3089 * 31645619);
			this.aClass86_Sub3_24.method6163(local433, 4, 0, local293);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "ag", descriptor = "(IIIIIII[[Z)V", line = 540)
	@Override
	public void method5533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class92 local4 = this.aClass86_Sub3_24.method19940();
		if (this.anInt510 <= 0 || local4 == null) {
			return;
		}
		this.aClass86_Sub3_24.method6087();
		this.aClass86_Sub3_24.method6229(false);
		this.aClass86_Sub3_24.method6233(false);
		this.aClass86_Sub3_24.method6239(false);
		this.aClass86_Sub3_24.method6241(false);
		this.aClass86_Sub3_24.method6250(0);
		this.aClass86_Sub3_24.method6180(-2);
		this.aClass86_Sub3_24.method6195(null);
		aFloatArray14[0] = (float) arg2 / ((float) (this.anInt608 * 127780559) * 128.0F * (float) local4.method23491());
		aFloatArray14[1] = 0.0F;
		aFloatArray14[2] = 0.0F;
		aFloatArray14[3] = 0.0F;
		aFloatArray14[4] = 0.0F;
		aFloatArray14[5] = (float) arg2 / ((float) (this.anInt608 * 127780559) * 128.0F * (float) local4.method23493());
		aFloatArray14[6] = 0.0F;
		aFloatArray14[7] = 0.0F;
		aFloatArray14[8] = 0.0F;
		aFloatArray14[9] = 0.0F;
		aFloatArray14[10] = 0.0F;
		aFloatArray14[11] = 0.0F;
		aFloatArray14[12] = -1.0F - ((float) (arg3 * arg2) / 128.0F - (float) (arg0 * 2)) / (float) local4.method23491();
		aFloatArray14[13] = 1.0F - ((float) (arg1 * 2) + (float) (arg6 * arg2) / 128.0F) / (float) local4.method23493();
		aFloatArray14[14] = 0.0F;
		aFloatArray14[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(aFloatArray14, 0);
		aFloatArray14[0] = 1.0F;
		aFloatArray14[1] = 0.0F;
		aFloatArray14[2] = 0.0F;
		aFloatArray14[3] = 0.0F;
		aFloatArray14[4] = 0.0F;
		aFloatArray14[5] = 0.0F;
		aFloatArray14[6] = 1.0F;
		aFloatArray14[7] = 0.0F;
		aFloatArray14[8] = 0.0F;
		aFloatArray14[9] = 1.0F;
		aFloatArray14[10] = 0.0F;
		aFloatArray14[11] = 0.0F;
		aFloatArray14[12] = 0.0F;
		aFloatArray14[13] = 0.0F;
		aFloatArray14[14] = 0.0F;
		aFloatArray14[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aFloatArray14, 0);
		if ((this.anInt507 & 0x7) == 0) {
			this.aClass86_Sub3_24.method6233(false);
		} else {
			this.aClass86_Sub3_24.method6233(true);
			this.aClass86_Sub3_24.method6118();
		}
		this.aClass86_Sub3_24.method6155(this.aClass172_6, this.aClass172_7, this.aClass172_5, this.aClass172_8);
		if (this.aClass86_Sub3_24.aClass77_Sub39_Sub2_1.aByteArray53.length < this.anInt509 * 2) {
			this.aClass86_Sub3_24.aClass77_Sub39_Sub2_1 = new Class77_Sub39_Sub2(this.anInt509 * 2);
		} else {
			this.aClass86_Sub3_24.aClass77_Sub39_Sub2_1.anInt3089 = 0;
		}
		@Pc(293) int local293 = 0;
		@Pc(297) Class77_Sub39_Sub2 local297 = this.aClass86_Sub3_24.aClass77_Sub39_Sub2_1;
		@Pc(303) int local303;
		@Pc(315) int local315;
		@Pc(317) int local317;
		@Pc(335) short[] local335;
		@Pc(339) int local339;
		if (this.aClass86_Sub3_24.aBoolean116) {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt607 * -1924295585 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray1[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.method22408(local335[local339] & 0xFFFF);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		} else {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt607 * -1924295585 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray1[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.method22412(local335[local339] & 0xFFFF);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		}
		if (local293 > 0) {
			@Pc(433) Class74_Sub2 local433 = new Class74_Sub2(this.aClass86_Sub3_24, 5123, local297.aByteArray53, local297.anInt3089 * 31645619);
			this.aClass86_Sub3_24.method6163(local433, 4, 0, local293);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "s", descriptor = "(IILclient!arp;)Lclient!arp;", line = 637)
	@Override
	public Class77_Sub1_Sub16 method5539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		if ((this.aByteArrayArray2[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt608 * 127780559 >> this.aClass86_Sub3_24.anInt677;
		@Pc(22) Class77_Sub1_Sub16_Sub1 local22 = (Class77_Sub1_Sub16_Sub1) arg2;
		@Pc(31) Class77_Sub1_Sub16_Sub1 local31;
		if (local22 != null && local22.method23047(local19, local19)) {
			local31 = local22;
			local22.method23048();
		} else {
			local31 = new Class77_Sub1_Sub16_Sub1(this.aClass86_Sub3_24, local19, local19);
		}
		local31.method23045(0, 0, local19, local19);
		this.method4374(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aeg", name = "al", descriptor = "(IILclient!arp;)Lclient!arp;", line = 637)
	@Override
	public Class77_Sub1_Sub16 method5534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		if ((this.aByteArrayArray2[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt608 * 127780559 >> this.aClass86_Sub3_24.anInt677;
		@Pc(22) Class77_Sub1_Sub16_Sub1 local22 = (Class77_Sub1_Sub16_Sub1) arg2;
		@Pc(31) Class77_Sub1_Sub16_Sub1 local31;
		if (local22 != null && local22.method23047(local19, local19)) {
			local31 = local22;
			local22.method23048();
		} else {
			local31 = new Class77_Sub1_Sub16_Sub1(this.aClass86_Sub3_24, local19, local19);
		}
		local31.method23045(0, 0, local19, local19);
		this.method4374(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aeg", name = "ak", descriptor = "(IILclient!arp;)Lclient!arp;", line = 637)
	@Override
	public Class77_Sub1_Sub16 method5535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		if ((this.aByteArrayArray2[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt608 * 127780559 >> this.aClass86_Sub3_24.anInt677;
		@Pc(22) Class77_Sub1_Sub16_Sub1 local22 = (Class77_Sub1_Sub16_Sub1) arg2;
		@Pc(31) Class77_Sub1_Sub16_Sub1 local31;
		if (local22 != null && local22.method23047(local19, local19)) {
			local31 = local22;
			local22.method23048();
		} else {
			local31 = new Class77_Sub1_Sub16_Sub1(this.aClass86_Sub3_24, local19, local19);
		}
		local31.method23045(0, 0, local19, local19);
		this.method4374(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aeg", name = "ao", descriptor = "(IILclient!arp;)Lclient!arp;", line = 637)
	@Override
	public Class77_Sub1_Sub16 method5541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		if ((this.aByteArrayArray2[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt608 * 127780559 >> this.aClass86_Sub3_24.anInt677;
		@Pc(22) Class77_Sub1_Sub16_Sub1 local22 = (Class77_Sub1_Sub16_Sub1) arg2;
		@Pc(31) Class77_Sub1_Sub16_Sub1 local31;
		if (local22 != null && local22.method23047(local19, local19)) {
			local31 = local22;
			local22.method23048();
		} else {
			local31 = new Class77_Sub1_Sub16_Sub1(this.aClass86_Sub3_24, local19, local19);
		}
		local31.method23045(0, 0, local19, local19);
		this.method4374(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aeg", name = "au", descriptor = "(IILclient!arp;)Lclient!arp;", line = 637)
	@Override
	public Class77_Sub1_Sub16 method5515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		if ((this.aByteArrayArray2[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt608 * 127780559 >> this.aClass86_Sub3_24.anInt677;
		@Pc(22) Class77_Sub1_Sub16_Sub1 local22 = (Class77_Sub1_Sub16_Sub1) arg2;
		@Pc(31) Class77_Sub1_Sub16_Sub1 local31;
		if (local22 != null && local22.method23047(local19, local19)) {
			local31 = local22;
			local22.method23048();
		} else {
			local31 = new Class77_Sub1_Sub16_Sub1(this.aClass86_Sub3_24, local19, local19);
		}
		local31.method23045(0, 0, local19, local19);
		this.method4374(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aeg", name = "ax", descriptor = "(IILclient!arp;)Lclient!arp;", line = 637)
	@Override
	public Class77_Sub1_Sub16 method5537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		if ((this.aByteArrayArray2[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt608 * 127780559 >> this.aClass86_Sub3_24.anInt677;
		@Pc(22) Class77_Sub1_Sub16_Sub1 local22 = (Class77_Sub1_Sub16_Sub1) arg2;
		@Pc(31) Class77_Sub1_Sub16_Sub1 local31;
		if (local22 != null && local22.method23047(local19, local19)) {
			local31 = local22;
			local22.method23048();
		} else {
			local31 = new Class77_Sub1_Sub16_Sub1(this.aClass86_Sub3_24, local19, local19);
		}
		local31.method23045(0, 0, local19, local19);
		this.method4374(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aeg", name = "ar", descriptor = "(IILclient!arp;)Lclient!arp;", line = 637)
	@Override
	public Class77_Sub1_Sub16 method5538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		if ((this.aByteArrayArray2[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt608 * 127780559 >> this.aClass86_Sub3_24.anInt677;
		@Pc(22) Class77_Sub1_Sub16_Sub1 local22 = (Class77_Sub1_Sub16_Sub1) arg2;
		@Pc(31) Class77_Sub1_Sub16_Sub1 local31;
		if (local22 != null && local22.method23047(local19, local19)) {
			local31 = local22;
			local22.method23048();
		} else {
			local31 = new Class77_Sub1_Sub16_Sub1(this.aClass86_Sub3_24, local19, local19);
		}
		local31.method23045(0, 0, local19, local19);
		this.method4374(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aeg", name = "bj", descriptor = "(Lclient!ase;II)V", line = 652)
	void method4374(@OriginalArg(0) Class77_Sub1_Sub16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray2[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray3[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.aClass86_Sub3_24.anIntArray58.length < local16) {
			this.aClass86_Sub3_24.anIntArray58 = new int[local16];
			this.aClass86_Sub3_24.anIntArray59 = new int[local16];
		}
		@Pc(36) int[] local36 = this.aClass86_Sub3_24.anIntArray58;
		@Pc(40) int[] local40 = this.aClass86_Sub3_24.anIntArray59;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local16; local42++) {
			local36[local42] = local6[local42] >> this.aClass86_Sub3_24.anInt677;
			local40[local42] = local13[local42] >> this.aClass86_Sub3_24.anInt677;
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
				arg0.method23052(local81, local90, local99, local76, local85, local94);
			}
		}
	}

	@OriginalMember(owner = "client!aeg", name = "bl", descriptor = "(Lclient!ase;II)V", line = 652)
	void method4375(@OriginalArg(0) Class77_Sub1_Sub16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray2[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray3[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.aClass86_Sub3_24.anIntArray58.length < local16) {
			this.aClass86_Sub3_24.anIntArray58 = new int[local16];
			this.aClass86_Sub3_24.anIntArray59 = new int[local16];
		}
		@Pc(36) int[] local36 = this.aClass86_Sub3_24.anIntArray58;
		@Pc(40) int[] local40 = this.aClass86_Sub3_24.anIntArray59;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local16; local42++) {
			local36[local42] = local6[local42] >> this.aClass86_Sub3_24.anInt677;
			local40[local42] = local13[local42] >> this.aClass86_Sub3_24.anInt677;
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
				arg0.method23052(local81, local90, local99, local76, local85, local94);
			}
		}
	}

	@OriginalMember(owner = "client!aeg", name = "ae", descriptor = "(Lclient!arp;IIIIZ)Z", line = 679)
	@Override
	public boolean method5513(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass185_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass86_Sub3_24.anInt706 >> 8) >> this.aClass86_Sub3_24.anInt677;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass86_Sub3_24.anInt701 >> 8) >> this.aClass86_Sub3_24.anInt677;
			return this.aClass185_1.method24614(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "z", descriptor = "(Lclient!arp;IIIIZ)Z", line = 679)
	@Override
	public boolean method5518(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass185_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass86_Sub3_24.anInt706 >> 8) >> this.aClass86_Sub3_24.anInt677;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass86_Sub3_24.anInt701 >> 8) >> this.aClass86_Sub3_24.anInt677;
			return this.aClass185_1.method24614(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "r", descriptor = "(Lclient!arp;IIIIZ)V", line = 686)
	@Override
	public void method5516(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass185_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub3_24.anInt706 >> 8) >> this.aClass86_Sub3_24.anInt677;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub3_24.anInt701 >> 8) >> this.aClass86_Sub3_24.anInt677;
			this.aClass185_1.method24611(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "ac", descriptor = "(Lclient!arp;IIIIZ)V", line = 686)
	@Override
	public void method5532(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass185_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub3_24.anInt706 >> 8) >> this.aClass86_Sub3_24.anInt677;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub3_24.anInt701 >> 8) >> this.aClass86_Sub3_24.anInt677;
			this.aClass185_1.method24611(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "ad", descriptor = "(Lclient!arp;IIIIZ)V", line = 686)
	@Override
	public void method5527(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass185_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub3_24.anInt706 >> 8) >> this.aClass86_Sub3_24.anInt677;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub3_24.anInt701 >> 8) >> this.aClass86_Sub3_24.anInt677;
			this.aClass185_1.method24611(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "av", descriptor = "(Lclient!arp;IIIIZ)V", line = 686)
	@Override
	public void method5519(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass185_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub3_24.anInt706 >> 8) >> this.aClass86_Sub3_24.anInt677;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub3_24.anInt701 >> 8) >> this.aClass86_Sub3_24.anInt677;
			this.aClass185_1.method24611(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "at", descriptor = "(Lclient!arp;IIIIZ)V", line = 686)
	@Override
	public void method5542(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass185_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub3_24.anInt706 >> 8) >> this.aClass86_Sub3_24.anInt677;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub3_24.anInt701 >> 8) >> this.aClass86_Sub3_24.anInt677;
			this.aClass185_1.method24611(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "ah", descriptor = "(Lclient!arp;IIIIZ)V", line = 693)
	@Override
	public void method5544(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass185_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub3_24.anInt706 >> 8) >> this.aClass86_Sub3_24.anInt677;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub3_24.anInt701 >> 8) >> this.aClass86_Sub3_24.anInt677;
			this.aClass185_1.method24613(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "g", descriptor = "(Lclient!arp;IIIIZ)V", line = 693)
	@Override
	public void method5517(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass185_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub3_24.anInt706 >> 8) >> this.aClass86_Sub3_24.anInt677;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub3_24.anInt701 >> 8) >> this.aClass86_Sub3_24.anInt677;
			this.aClass185_1.method24613(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "as", descriptor = "(Lclient!arp;IIIIZ)V", line = 693)
	@Override
	public void method5545(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass185_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub3_24.anInt706 >> 8) >> this.aClass86_Sub3_24.anInt677;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub3_24.anInt701 >> 8) >> this.aClass86_Sub3_24.anInt677;
			this.aClass185_1.method24613(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "j", descriptor = "(Lclient!ajv;[I)V", line = 700)
	@Override
	public void method5543(@OriginalArg(0) Class77_Sub22 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass695_4.method36383(new Class77_Sub5(this.aClass86_Sub3_24, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!aeg", name = "aq", descriptor = "(Lclient!ajv;[I)V", line = 700)
	@Override
	public void method5512(@OriginalArg(0) Class77_Sub22 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass695_4.method36383(new Class77_Sub5(this.aClass86_Sub3_24, this, arg0, arg1));
	}
}
