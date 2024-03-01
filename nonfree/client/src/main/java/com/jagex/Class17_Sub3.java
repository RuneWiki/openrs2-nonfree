package com.jagex;

import java.nio.ByteBuffer;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sun.misc.Unsafe;

@OriginalClass("client!abs")
public class Class17_Sub3 extends Class17 {

	@OriginalMember(owner = "client!abs", name = "s", descriptor = "I")
	static final int anInt342 = 74;

	@OriginalMember(owner = "client!abs", name = "x", descriptor = "I")
	static final int anInt346 = 1;

	@OriginalMember(owner = "client!abs", name = "am", descriptor = "I")
	int anInt340;

	@OriginalMember(owner = "client!abs", name = "j", descriptor = "I")
	int anInt344;

	@OriginalMember(owner = "client!abs", name = "n", descriptor = "I")
	int anInt345;

	@OriginalMember(owner = "client!abs", name = "i", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!abs", name = "ap", descriptor = "J")
	long aLong8;

	@OriginalMember(owner = "client!abs", name = "an", descriptor = "I")
	int anInt347;

	@OriginalMember(owner = "client!abs", name = "ak", descriptor = "Lclient!if;")
	Interface21 anInterface21_2;

	@OriginalMember(owner = "client!abs", name = "aa", descriptor = "Lclient!if;")
	Interface21 anInterface21_3;

	@OriginalMember(owner = "client!abs", name = "ah", descriptor = "Lclient!iy;")
	Class37 aClass37_1;

	@OriginalMember(owner = "client!abs", name = "aj", descriptor = "I")
	int anInt349;

	@OriginalMember(owner = "client!abs", name = "af", descriptor = "[Lclient!ps;")
	Class3[] aClass3Array2;

	@OriginalMember(owner = "client!abs", name = "al", descriptor = "I")
	int anInt351;

	@OriginalMember(owner = "client!abs", name = "ao", descriptor = "J")
	long aLong9;

	@OriginalMember(owner = "client!abs", name = "ab", descriptor = "J")
	long aLong10;

	@OriginalMember(owner = "client!abs", name = "au", descriptor = "I")
	int anInt352;

	@OriginalMember(owner = "client!abs", name = "az", descriptor = "[Lclient!ps;")
	Class3[] aClass3Array3;

	@OriginalMember(owner = "client!abs", name = "r", descriptor = "F")
	float aFloat39 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!abs", name = "d", descriptor = "F")
	float aFloat40 = -3.4028235E38F;

	@OriginalMember(owner = "client!abs", name = "at", descriptor = "Lclient!wk;")
	Class553 aClass553_3 = new Class553();

	@OriginalMember(owner = "client!abs", name = "ay", descriptor = "[I")
	int[] anIntArray47 = new int[1];

	@OriginalMember(owner = "client!abs", name = "ag", descriptor = "[I")
	int[] anIntArray46 = new int[1];

	@OriginalMember(owner = "client!abs", name = "ar", descriptor = "[I")
	int[] anIntArray48 = new int[1];

	@OriginalMember(owner = "client!abs", name = "u", descriptor = "Lclient!abv;")
	final Class21_Sub3 aClass21_Sub3_4;

	@OriginalMember(owner = "client!abs", name = "y", descriptor = "I")
	int anInt348;

	@OriginalMember(owner = "client!abs", name = "b", descriptor = "I")
	int anInt341;

	@OriginalMember(owner = "client!abs", name = "c", descriptor = "I")
	int anInt350;

	@OriginalMember(owner = "client!abs", name = "z", descriptor = "I")
	final int anInt343;

	@OriginalMember(owner = "client!abs", name = "o", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!abs", name = "q", descriptor = "[[[Lclient!agj;")
	Class3_Sub25[][][] aClass3_Sub25ArrayArrayArray1;

	@OriginalMember(owner = "client!abs", name = "t", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!abs", name = "w", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!abs", name = "m", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!abs", name = "v", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!abs", name = "e", descriptor = "[[S")
	short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!abs", name = "f", descriptor = "[[B")
	byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!abs", name = "as", descriptor = "[[B")
	byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!abs", name = "ai", descriptor = "[[F")
	float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!abs", name = "aq", descriptor = "[[F")
	float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!abs", name = "av", descriptor = "[[F")
	float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!abs", name = "ax", descriptor = "Lclient!xn;")
	Class581 aClass581_2;

	@OriginalMember(owner = "client!abs", name = "k", descriptor = "Lclient!iv;")
	Class246 aClass246_1;

	@OriginalMember(owner = "client!abs", name = "<init>", descriptor = "(Lclient!abv;IIII[[I[[II)V", line = 67)
	Class17_Sub3(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass21_Sub3_4 = arg0;
		this.anInt348 = this.anInt336 * 1371852633 - 2;
		this.anInt341 = 0x1 << this.anInt348;
		this.anInt350 = arg1;
		this.anInt343 = arg2;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aClass3_Sub25ArrayArrayArray1 = new Class3_Sub25[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.aShortArrayArray2 = new short[arg3 * arg4][];
		this.aByteArrayArray9 = new byte[arg3][arg4];
		this.aByteArrayArray8 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray5 = new float[this.anInt339 * -1007974723 + 1][this.anInt337 * -207323189 + 1];
		this.aFloatArrayArray6 = new float[this.anInt339 * -1007974723 + 1][this.anInt337 * -207323189 + 1];
		this.aFloatArrayArray7 = new float[this.anInt339 * -1007974723 + 1][this.anInt337 * -207323189 + 1];
		for (@Pc(148) int local148 = 0; local148 <= this.anInt337 * -207323189; local148++) {
			for (@Pc(156) int local156 = 0; local156 <= this.anInt339 * -1007974723; local156++) {
				@Pc(169) int local169 = this.anIntArrayArray7[local156][local148];
				if ((float) local169 < this.aFloat39) {
					this.aFloat39 = local169;
				}
				if ((float) local169 > this.aFloat40) {
					this.aFloat40 = local169;
				}
				if (local156 > 0 && local148 > 0 && local156 < this.anInt339 * -1007974723 && local148 < this.anInt337 * -207323189) {
					@Pc(221) int local221 = arg6[local156 + 1][local148] - arg6[local156 - 1][local148];
					@Pc(237) int local237 = arg6[local156][local148 + 1] - arg6[local156][local148 - 1];
					@Pc(256) float local256 = (float) (1.0D / Math.sqrt((double) (local221 * local221 + arg7 * 4 * arg7 + local237 * local237)));
					this.aFloatArrayArray5[local156][local148] = (float) local221 * local256;
					this.aFloatArrayArray6[local156][local148] = (float) (-arg7 * 2) * local256;
					this.aFloatArrayArray7[local156][local148] = (float) local237 * local256;
				}
			}
		}
		this.aFloat39--;
		this.aFloat40++;
		this.aClass581_2 = new Class581(128);
		if ((this.anInt343 & 0x10) != 0) {
			this.aClass246_1 = new Class246(this.aClass21_Sub3_4, this);
		}
	}

	@OriginalMember(owner = "client!abs", name = "p", descriptor = "(III)V", line = 107)
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray8.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray8[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray8[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray8[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!abs", name = "r", descriptor = "(III)V", line = 107)
	@Override
	public void method3539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray8.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray8[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray8[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray8[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!abs", name = "d", descriptor = "(III)V", line = 107)
	@Override
	public void method3555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray8.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray8[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray8[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray8[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!abs", name = "q", descriptor = "(III)V", line = 107)
	@Override
	public void method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray8.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray8[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray8[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray8[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!abs", name = "a", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 113)
	@Override
	public void method3541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class139 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class134 local3 = this.aClass21_Sub3_4.aClass134_7;
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[this.anInt339 * -1007974723][this.anInt337 * -207323189][];
		}
		if (arg3 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[this.anInt339 * -1007974723][this.anInt337 * -207323189][];
		}
		this.anIntArrayArrayArray9[arg0][arg1] = arg2;
		this.anIntArrayArrayArray12[arg0][arg1] = arg4;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		this.anIntArrayArrayArray8[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		}
		@Pc(94) Class3_Sub25[] local94 = this.aClass3_Sub25ArrayArrayArray1[arg0][arg1] = new Class3_Sub25[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt343 & 0x20) != 0 && local104 != -1 && local3.method22906(local104).aBoolean620) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3419 * -729027733) << 48 | (long) (arg10.anInt3417 * 1125508145) << 42 | (long) (arg10.anInt3422 * -470091381) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class3 local163;
			for (local163 = this.aClass581_2.method33217(local158); local163 != null; local163 = this.aClass581_2.method33218()) {
				@Pc(168) Class3_Sub25 local168 = (Class3_Sub25) local163;
				if (local168.anInt1300 == local104 && local168.aFloat143 == (float) local108 && local168.aClass139_4.method23013(arg10)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class3_Sub25(this, local104, local108, arg10);
				this.aClass581_2.method33241(local94[local96], local158);
			} else {
				local94[local96] = (Class3_Sub25) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray9[arg0][arg1] = (byte) (this.aByteArrayArray9[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt349) {
			this.anInt349 = arg6.length;
		}
		this.anInt347 += arg6.length;
	}

	@OriginalMember(owner = "client!abs", name = "o", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 113)
	@Override
	public void method3561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class139 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class134 local3 = this.aClass21_Sub3_4.aClass134_7;
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[this.anInt339 * -1007974723][this.anInt337 * -207323189][];
		}
		if (arg3 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[this.anInt339 * -1007974723][this.anInt337 * -207323189][];
		}
		this.anIntArrayArrayArray9[arg0][arg1] = arg2;
		this.anIntArrayArrayArray12[arg0][arg1] = arg4;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		this.anIntArrayArrayArray8[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		}
		@Pc(94) Class3_Sub25[] local94 = this.aClass3_Sub25ArrayArrayArray1[arg0][arg1] = new Class3_Sub25[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt343 & 0x20) != 0 && local104 != -1 && local3.method22906(local104).aBoolean620) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3419 * -729027733) << 48 | (long) (arg10.anInt3417 * 1125508145) << 42 | (long) (arg10.anInt3422 * -470091381) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class3 local163;
			for (local163 = this.aClass581_2.method33217(local158); local163 != null; local163 = this.aClass581_2.method33218()) {
				@Pc(168) Class3_Sub25 local168 = (Class3_Sub25) local163;
				if (local168.anInt1300 == local104 && local168.aFloat143 == (float) local108 && local168.aClass139_4.method23013(arg10)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class3_Sub25(this, local104, local108, arg10);
				this.aClass581_2.method33241(local94[local96], local158);
			} else {
				local94[local96] = (Class3_Sub25) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray9[arg0][arg1] = (byte) (this.aByteArrayArray9[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt349) {
			this.anInt349 = arg6.length;
		}
		this.anInt347 += arg6.length;
	}

	@OriginalMember(owner = "client!abs", name = "i", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 113)
	@Override
	public void method3549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class139 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class134 local3 = this.aClass21_Sub3_4.aClass134_7;
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[this.anInt339 * -1007974723][this.anInt337 * -207323189][];
		}
		if (arg3 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[this.anInt339 * -1007974723][this.anInt337 * -207323189][];
		}
		this.anIntArrayArrayArray9[arg0][arg1] = arg2;
		this.anIntArrayArrayArray12[arg0][arg1] = arg4;
		this.anIntArrayArrayArray7[arg0][arg1] = arg6;
		this.anIntArrayArrayArray8[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		}
		@Pc(94) Class3_Sub25[] local94 = this.aClass3_Sub25ArrayArrayArray1[arg0][arg1] = new Class3_Sub25[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt343 & 0x20) != 0 && local104 != -1 && local3.method22906(local104).aBoolean620) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3419 * -729027733) << 48 | (long) (arg10.anInt3417 * 1125508145) << 42 | (long) (arg10.anInt3422 * -470091381) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class3 local163;
			for (local163 = this.aClass581_2.method33217(local158); local163 != null; local163 = this.aClass581_2.method33218()) {
				@Pc(168) Class3_Sub25 local168 = (Class3_Sub25) local163;
				if (local168.anInt1300 == local104 && local168.aFloat143 == (float) local108 && local168.aClass139_4.method23013(arg10)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class3_Sub25(this, local104, local108, arg10);
				this.aClass581_2.method33241(local94[local96], local158);
			} else {
				local94[local96] = (Class3_Sub25) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray9[arg0][arg1] = (byte) (this.aByteArrayArray9[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt349) {
			this.anInt349 = arg6.length;
		}
		this.anInt347 += arg6.length;
	}

	@OriginalMember(owner = "client!abs", name = "g", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 149)
	@Override
	public void method3542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method3541(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!abs", name = "t", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 149)
	@Override
	public void method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method3541(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!abs", name = "w", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 149)
	@Override
	public void method3560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method3541(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!abs", name = "m", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 149)
	@Override
	public void method3567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method3541(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!abs", name = "v", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dz;Z)V", line = 149)
	@Override
	public void method3552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class139 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method3541(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!abs", name = "l", descriptor = "()V", line = 195)
	@Override
	public void method3546() {
		if (this.anInt347 <= 0) {
			this.aClass246_1 = null;
			this.method3596();
			return;
		}
		@Pc(22) byte[][] local22 = new byte[this.anInt339 * -1007974723 + 1][this.anInt337 * -207323189 + 1];
		@Pc(24) int local24;
		@Pc(32) int local32;
		for (local24 = 1; local24 < this.anInt339 * -1007974723; local24++) {
			for (local32 = 1; local32 < this.anInt337 * -207323189; local32++) {
				local22[local24][local32] = (byte) ((this.aByteArrayArray8[local24 - 1][local32] >> 2) + (this.aByteArrayArray8[local24 + 1][local32] >> 3) + (this.aByteArrayArray8[local24][local32 - 1] >> 2) + (this.aByteArrayArray8[local24][local32 + 1] >> 3) + (this.aByteArrayArray8[local24][local32] >> 1));
			}
		}
		this.aClass3Array3 = new Class3[this.aClass581_2.method33220()];
		this.aClass581_2.method33223(this.aClass3Array3);
		for (local24 = 0; local24 < this.aClass3Array3.length; local24++) {
			((Class3_Sub25) this.aClass3Array3[local24]).method11523(this.anInt347);
		}
		this.anInt352 = 20;
		if (this.anIntArrayArrayArray11 != null) {
			this.anInt352 += 4;
		}
		if ((this.anInt343 & 0x7) != 0) {
			this.anInt352 += 12;
		}
		this.aLong10 = this.aClass21_Sub3_4.anUnsafe3.allocateMemory((long) (this.anInt347 * 4 + this.anInt347 * this.anInt352));
		this.aLong9 = this.aLong10;
		this.aLong8 = this.aLong10 + (long) (this.anInt347 * 4);
		@Pc(189) Class3_Sub25[] local189 = new Class3_Sub25[this.anInt347];
		local32 = Class525.method32379(this.anInt347 / 4);
		if (local32 < 1) {
			local32 = 1;
		}
		@Pc(206) Class581 local206 = new Class581(local32);
		@Pc(210) Class3_Sub25[] local210 = new Class3_Sub25[this.anInt349];
		@Pc(212) int local212;
		@Pc(220) int local220;
		for (local212 = 0; local212 < this.anInt339 * -1007974723; local212++) {
			for (local220 = 0; local220 < this.anInt337 * -207323189; local220++) {
				this.method3600(local212, local220, local22, local210, local206, local189);
			}
		}
		@Pc(248) Class3_Sub25 local248;
		for (local212 = 0; local212 < this.anInt344; local212++) {
			local248 = local189[local212];
			if (local248 != null) {
				local248.method11506(local212);
			}
		}
		for (local212 = 0; local212 < this.anInt339 * -1007974723; local212++) {
			for (local220 = 0; local220 < this.anInt337 * -207323189; local220++) {
				@Pc(283) short[] local283 = this.aShortArrayArray2[local220 * this.anInt339 * -1007974723 + local212];
				if (local283 != null) {
					@Pc(287) int local287 = 0;
					@Pc(289) int local289 = 0;
					while (local289 < local283.length) {
						@Pc(300) int local300 = local283[local289++] & 0xFFFF;
						@Pc(307) int local307 = local283[local289++] & 0xFFFF;
						@Pc(314) int local314 = local283[local289++] & 0xFFFF;
						@Pc(318) Class3_Sub25 local318 = local189[local300];
						@Pc(322) Class3_Sub25 local322 = local189[local307];
						@Pc(326) Class3_Sub25 local326 = local189[local314];
						@Pc(328) Class3_Sub25 local328 = null;
						if (local318 != null) {
							local318.method11508(local212, local220, local287);
							local328 = local318;
						}
						if (local322 != null) {
							local322.method11508(local212, local220, local287);
							if (local328 == null || local322.aLong296 * -1930649055099428229L < local328.aLong296 * -1930649055099428229L) {
								local328 = local322;
							}
						}
						if (local326 != null) {
							local326.method11508(local212, local220, local287);
							if (local328 == null || local326.aLong296 * -1930649055099428229L < local328.aLong296 * -1930649055099428229L) {
								local328 = local326;
							}
						}
						if (local328 != null) {
							if (local318 != null) {
								local328.method11506(local300);
							}
							if (local322 != null) {
								local328.method11506(local307);
							}
							if (local326 != null) {
								local328.method11506(local314);
							}
							local328.method11508(local212, local220, local287);
						}
						local287++;
					}
				}
			}
		}
		this.anInt351 = 0;
		for (local212 = 0; local212 < this.aClass3Array3.length; local212++) {
			local248 = (Class3_Sub25) this.aClass3Array3[local212];
			if (local248.anInt1298 > 0) {
				this.aClass3Array3[this.anInt351++] = local248;
			}
		}
		this.aClass3Array2 = new Class3[this.anInt351];
		@Pc(448) long[] local448 = new long[this.anInt351];
		for (local220 = 0; local220 < this.anInt351; local220++) {
			@Pc(460) Class3_Sub25 local460 = (Class3_Sub25) this.aClass3Array3[local220];
			local448[local220] = local460.aLong296 * -1930649055099428229L;
			this.aClass3Array2[local220] = local460;
		}
		Class170.method23361(local448, this.aClass3Array2);
		this.method3601();
	}

	@OriginalMember(owner = "client!abs", name = "f", descriptor = "()V", line = 195)
	@Override
	public void method3563() {
		if (this.anInt347 <= 0) {
			this.aClass246_1 = null;
			this.method3596();
			return;
		}
		@Pc(22) byte[][] local22 = new byte[this.anInt339 * -1007974723 + 1][this.anInt337 * -207323189 + 1];
		@Pc(24) int local24;
		@Pc(32) int local32;
		for (local24 = 1; local24 < this.anInt339 * -1007974723; local24++) {
			for (local32 = 1; local32 < this.anInt337 * -207323189; local32++) {
				local22[local24][local32] = (byte) ((this.aByteArrayArray8[local24 - 1][local32] >> 2) + (this.aByteArrayArray8[local24 + 1][local32] >> 3) + (this.aByteArrayArray8[local24][local32 - 1] >> 2) + (this.aByteArrayArray8[local24][local32 + 1] >> 3) + (this.aByteArrayArray8[local24][local32] >> 1));
			}
		}
		this.aClass3Array3 = new Class3[this.aClass581_2.method33220()];
		this.aClass581_2.method33223(this.aClass3Array3);
		for (local24 = 0; local24 < this.aClass3Array3.length; local24++) {
			((Class3_Sub25) this.aClass3Array3[local24]).method11523(this.anInt347);
		}
		this.anInt352 = 20;
		if (this.anIntArrayArrayArray11 != null) {
			this.anInt352 += 4;
		}
		if ((this.anInt343 & 0x7) != 0) {
			this.anInt352 += 12;
		}
		this.aLong10 = this.aClass21_Sub3_4.anUnsafe3.allocateMemory((long) (this.anInt347 * 4 + this.anInt347 * this.anInt352));
		this.aLong9 = this.aLong10;
		this.aLong8 = this.aLong10 + (long) (this.anInt347 * 4);
		@Pc(189) Class3_Sub25[] local189 = new Class3_Sub25[this.anInt347];
		local32 = Class525.method32379(this.anInt347 / 4);
		if (local32 < 1) {
			local32 = 1;
		}
		@Pc(206) Class581 local206 = new Class581(local32);
		@Pc(210) Class3_Sub25[] local210 = new Class3_Sub25[this.anInt349];
		@Pc(212) int local212;
		@Pc(220) int local220;
		for (local212 = 0; local212 < this.anInt339 * -1007974723; local212++) {
			for (local220 = 0; local220 < this.anInt337 * -207323189; local220++) {
				this.method3600(local212, local220, local22, local210, local206, local189);
			}
		}
		@Pc(248) Class3_Sub25 local248;
		for (local212 = 0; local212 < this.anInt344; local212++) {
			local248 = local189[local212];
			if (local248 != null) {
				local248.method11506(local212);
			}
		}
		for (local212 = 0; local212 < this.anInt339 * -1007974723; local212++) {
			for (local220 = 0; local220 < this.anInt337 * -207323189; local220++) {
				@Pc(283) short[] local283 = this.aShortArrayArray2[local220 * this.anInt339 * -1007974723 + local212];
				if (local283 != null) {
					@Pc(287) int local287 = 0;
					@Pc(289) int local289 = 0;
					while (local289 < local283.length) {
						@Pc(300) int local300 = local283[local289++] & 0xFFFF;
						@Pc(307) int local307 = local283[local289++] & 0xFFFF;
						@Pc(314) int local314 = local283[local289++] & 0xFFFF;
						@Pc(318) Class3_Sub25 local318 = local189[local300];
						@Pc(322) Class3_Sub25 local322 = local189[local307];
						@Pc(326) Class3_Sub25 local326 = local189[local314];
						@Pc(328) Class3_Sub25 local328 = null;
						if (local318 != null) {
							local318.method11508(local212, local220, local287);
							local328 = local318;
						}
						if (local322 != null) {
							local322.method11508(local212, local220, local287);
							if (local328 == null || local322.aLong296 * -1930649055099428229L < local328.aLong296 * -1930649055099428229L) {
								local328 = local322;
							}
						}
						if (local326 != null) {
							local326.method11508(local212, local220, local287);
							if (local328 == null || local326.aLong296 * -1930649055099428229L < local328.aLong296 * -1930649055099428229L) {
								local328 = local326;
							}
						}
						if (local328 != null) {
							if (local318 != null) {
								local328.method11506(local300);
							}
							if (local322 != null) {
								local328.method11506(local307);
							}
							if (local326 != null) {
								local328.method11506(local314);
							}
							local328.method11508(local212, local220, local287);
						}
						local287++;
					}
				}
			}
		}
		this.anInt351 = 0;
		for (local212 = 0; local212 < this.aClass3Array3.length; local212++) {
			local248 = (Class3_Sub25) this.aClass3Array3[local212];
			if (local248.anInt1298 > 0) {
				this.aClass3Array3[this.anInt351++] = local248;
			}
		}
		this.aClass3Array2 = new Class3[this.anInt351];
		@Pc(448) long[] local448 = new long[this.anInt351];
		for (local220 = 0; local220 < this.anInt351; local220++) {
			@Pc(460) Class3_Sub25 local460 = (Class3_Sub25) this.aClass3Array3[local220];
			local448[local220] = local460.aLong296 * -1930649055099428229L;
			this.aClass3Array2[local220] = local460;
		}
		Class170.method23361(local448, this.aClass3Array2);
		this.method3601();
	}

	@OriginalMember(owner = "client!abs", name = "aw", descriptor = "()V", line = 284)
	void method3601() {
		this.anInterface21_3 = this.aClass21_Sub3_4.method17542(false);
		this.anInterface21_3.method25687(this.anInt344 * 4, 4);
		this.anInterface21_3.method25705(0, this.anInt344 * 4, this.aLong10);
		this.anInterface21_2 = this.aClass21_Sub3_4.method17542(false);
		this.anInterface21_2.method25687(this.anInt344 * this.anInt352, this.anInt352);
		this.anInterface21_2.method25705(0, this.anInt344 * this.anInt352, this.aLong10 + (long) (this.anInt347 * 4));
		this.aClass21_Sub3_4.anUnsafe3.freeMemory(this.aLong10);
		if ((this.anInt343 & 0x7) == 0) {
			if (this.anIntArrayArrayArray11 == null) {
				this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7 }), new Class252(Class240.aClass240_5) });
			} else {
				this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7, Class240.aClass240_3 }), new Class252(Class240.aClass240_5) });
			}
		} else if (this.anIntArrayArrayArray11 == null) {
			this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7, Class240.aClass240_2 }), new Class252(Class240.aClass240_5) });
		} else {
			this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7, Class240.aClass240_3, Class240.aClass240_2 }), new Class252(Class240.aClass240_5) });
		}
		for (@Pc(218) int local218 = 0; local218 < this.anInt351; local218++) {
			@Pc(228) Class3_Sub25 local228 = (Class3_Sub25) this.aClass3Array3[local218];
			local228.method11510(this.anInt344);
		}
		if (this.aClass246_1 != null) {
			this.aClass246_1.method24873();
		}
		this.method3596();
	}

	@OriginalMember(owner = "client!abs", name = "bd", descriptor = "()V", line = 284)
	void method3602() {
		this.anInterface21_3 = this.aClass21_Sub3_4.method17542(false);
		this.anInterface21_3.method25687(this.anInt344 * 4, 4);
		this.anInterface21_3.method25705(0, this.anInt344 * 4, this.aLong10);
		this.anInterface21_2 = this.aClass21_Sub3_4.method17542(false);
		this.anInterface21_2.method25687(this.anInt344 * this.anInt352, this.anInt352);
		this.anInterface21_2.method25705(0, this.anInt344 * this.anInt352, this.aLong10 + (long) (this.anInt347 * 4));
		this.aClass21_Sub3_4.anUnsafe3.freeMemory(this.aLong10);
		if ((this.anInt343 & 0x7) == 0) {
			if (this.anIntArrayArrayArray11 == null) {
				this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7 }), new Class252(Class240.aClass240_5) });
			} else {
				this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7, Class240.aClass240_3 }), new Class252(Class240.aClass240_5) });
			}
		} else if (this.anIntArrayArrayArray11 == null) {
			this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7, Class240.aClass240_2 }), new Class252(Class240.aClass240_5) });
		} else {
			this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7, Class240.aClass240_3, Class240.aClass240_2 }), new Class252(Class240.aClass240_5) });
		}
		for (@Pc(218) int local218 = 0; local218 < this.anInt351; local218++) {
			@Pc(228) Class3_Sub25 local228 = (Class3_Sub25) this.aClass3Array3[local218];
			local228.method11510(this.anInt344);
		}
		if (this.aClass246_1 != null) {
			this.aClass246_1.method24873();
		}
		this.method3596();
	}

	@OriginalMember(owner = "client!abs", name = "bs", descriptor = "()V", line = 284)
	void method3603() {
		this.anInterface21_3 = this.aClass21_Sub3_4.method17542(false);
		this.anInterface21_3.method25687(this.anInt344 * 4, 4);
		this.anInterface21_3.method25705(0, this.anInt344 * 4, this.aLong10);
		this.anInterface21_2 = this.aClass21_Sub3_4.method17542(false);
		this.anInterface21_2.method25687(this.anInt344 * this.anInt352, this.anInt352);
		this.anInterface21_2.method25705(0, this.anInt344 * this.anInt352, this.aLong10 + (long) (this.anInt347 * 4));
		this.aClass21_Sub3_4.anUnsafe3.freeMemory(this.aLong10);
		if ((this.anInt343 & 0x7) == 0) {
			if (this.anIntArrayArrayArray11 == null) {
				this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7 }), new Class252(Class240.aClass240_5) });
			} else {
				this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7, Class240.aClass240_3 }), new Class252(Class240.aClass240_5) });
			}
		} else if (this.anIntArrayArrayArray11 == null) {
			this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7, Class240.aClass240_2 }), new Class252(Class240.aClass240_5) });
		} else {
			this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7, Class240.aClass240_3, Class240.aClass240_2 }), new Class252(Class240.aClass240_5) });
		}
		for (@Pc(218) int local218 = 0; local218 < this.anInt351; local218++) {
			@Pc(228) Class3_Sub25 local228 = (Class3_Sub25) this.aClass3Array3[local218];
			local228.method11510(this.anInt344);
		}
		if (this.aClass246_1 != null) {
			this.aClass246_1.method24873();
		}
		this.method3596();
	}

	@OriginalMember(owner = "client!abs", name = "bm", descriptor = "()V", line = 284)
	void method3604() {
		this.anInterface21_3 = this.aClass21_Sub3_4.method17542(false);
		this.anInterface21_3.method25687(this.anInt344 * 4, 4);
		this.anInterface21_3.method25705(0, this.anInt344 * 4, this.aLong10);
		this.anInterface21_2 = this.aClass21_Sub3_4.method17542(false);
		this.anInterface21_2.method25687(this.anInt344 * this.anInt352, this.anInt352);
		this.anInterface21_2.method25705(0, this.anInt344 * this.anInt352, this.aLong10 + (long) (this.anInt347 * 4));
		this.aClass21_Sub3_4.anUnsafe3.freeMemory(this.aLong10);
		if ((this.anInt343 & 0x7) == 0) {
			if (this.anIntArrayArrayArray11 == null) {
				this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7 }), new Class252(Class240.aClass240_5) });
			} else {
				this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7, Class240.aClass240_3 }), new Class252(Class240.aClass240_5) });
			}
		} else if (this.anIntArrayArrayArray11 == null) {
			this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7, Class240.aClass240_2 }), new Class252(Class240.aClass240_5) });
		} else {
			this.aClass37_1 = this.aClass21_Sub3_4.method17590(new Class252[] { new Class252(new Class240[] { Class240.aClass240_11, Class240.aClass240_7, Class240.aClass240_3, Class240.aClass240_2 }), new Class252(Class240.aClass240_5) });
		}
		for (@Pc(218) int local218 = 0; local218 < this.anInt351; local218++) {
			@Pc(228) Class3_Sub25 local228 = (Class3_Sub25) this.aClass3Array3[local218];
			local228.method11510(this.anInt344);
		}
		if (this.aClass246_1 != null) {
			this.aClass246_1.method24873();
		}
		this.method3596();
	}

	@OriginalMember(owner = "client!abs", name = "ac", descriptor = "()V", line = 312)
	void method3596() {
		if ((this.anInt350 & 0x2) == 0) {
			this.anIntArrayArrayArray12 = null;
			this.anIntArrayArrayArray9 = null;
			this.anIntArrayArrayArray7 = null;
		}
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass3_Sub25ArrayArrayArray1 = null;
		this.aByteArrayArray8 = null;
		this.aClass581_2 = null;
		this.aClass3Array3 = null;
		this.aFloatArrayArray7 = null;
		this.aFloatArrayArray6 = null;
		this.aFloatArrayArray5 = null;
	}

	@OriginalMember(owner = "client!abs", name = "bf", descriptor = "()V", line = 312)
	void method3605() {
		if ((this.anInt350 & 0x2) == 0) {
			this.anIntArrayArrayArray12 = null;
			this.anIntArrayArrayArray9 = null;
			this.anIntArrayArrayArray7 = null;
		}
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray8 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass3_Sub25ArrayArrayArray1 = null;
		this.aByteArrayArray8 = null;
		this.aClass581_2 = null;
		this.aClass3Array3 = null;
		this.aFloatArrayArray7 = null;
		this.aFloatArrayArray6 = null;
		this.aFloatArrayArray5 = null;
	}

	@OriginalMember(owner = "client!abs", name = "bw", descriptor = "(II[[B[Lclient!agj;Lclient!xn;[Lclient!agj;)V", line = 330)
	void method3600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Class3_Sub25[] arg3, @OriginalArg(4) Class581 arg4, @OriginalArg(5) Class3_Sub25[] arg5) {
		if (this.anIntArrayArrayArray7[arg0][arg1] == null) {
			return;
		}
		@Pc(14) Class3_Sub25[] local14 = this.aClass3_Sub25ArrayArrayArray1[arg0][arg1];
		@Pc(21) int[] local21 = this.anIntArrayArrayArray9[arg0][arg1];
		@Pc(28) int[] local28 = this.anIntArrayArrayArray12[arg0][arg1];
		@Pc(35) int[] local35 = this.anIntArrayArrayArray8[arg0][arg1];
		@Pc(42) int[] local42 = this.anIntArrayArrayArray7[arg0][arg1];
		@Pc(54) int[] local54 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[arg0][arg1];
		@Pc(66) int[] local66 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[arg0][arg1];
		if (local35 == null) {
			local35 = local42;
		}
		@Pc(77) float local77 = this.aFloatArrayArray5[arg0][arg1];
		@Pc(84) float local84 = this.aFloatArrayArray6[arg0][arg1];
		@Pc(91) float local91 = this.aFloatArrayArray7[arg0][arg1];
		@Pc(100) float local100 = this.aFloatArrayArray5[arg0][arg1 + 1];
		@Pc(109) float local109 = this.aFloatArrayArray6[arg0][arg1 + 1];
		@Pc(118) float local118 = this.aFloatArrayArray7[arg0][arg1 + 1];
		@Pc(129) float local129 = this.aFloatArrayArray5[arg0 + 1][arg1 + 1];
		@Pc(140) float local140 = this.aFloatArrayArray6[arg0 + 1][arg1 + 1];
		@Pc(151) float local151 = this.aFloatArrayArray7[arg0 + 1][arg1 + 1];
		@Pc(160) float local160 = this.aFloatArrayArray5[arg0 + 1][arg1];
		@Pc(169) float local169 = this.aFloatArrayArray6[arg0 + 1][arg1];
		@Pc(178) float local178 = this.aFloatArrayArray7[arg0 + 1][arg1];
		@Pc(186) int local186 = arg2[arg0][arg1] & 0xFF;
		@Pc(196) int local196 = arg2[arg0][arg1 + 1] & 0xFF;
		@Pc(208) int local208 = arg2[arg0 + 1][arg1 + 1] & 0xFF;
		@Pc(218) int local218 = arg2[arg0 + 1][arg1] & 0xFF;
		@Pc(220) int local220 = 0;
		@Pc(232) int local232;
		label185: for (@Pc(222) int local222 = 0; local222 < local42.length; local222++) {
			@Pc(230) Class3_Sub25 local230 = local14[local222];
			for (local232 = 0; local232 < local220; local232++) {
				if (arg3[local232] == local230) {
					continue label185;
				}
			}
			arg3[local220++] = local230;
		}
		@Pc(266) short[] local266 = this.aShortArrayArray2[arg1 * this.anInt339 * -1007974723 + arg0] = new short[local42.length];
		for (@Pc(268) int local268 = 0; local268 < local42.length; local268++) {
			@Pc(283) int local283 = (arg0 << this.anInt336 * 1371852633) + local21[local268];
			@Pc(294) int local294 = (arg1 << this.anInt336 * 1371852633) + local28[local268];
			@Pc(299) int local299 = local283 >> this.anInt348;
			@Pc(304) int local304 = local294 >> this.anInt348;
			@Pc(308) int local308 = local42[local268];
			@Pc(312) int local312 = local35[local268];
			@Pc(320) int local320 = local54 == null ? 0 : local54[local268];
			@Pc(338) long local338 = (long) local312 << 48 | (long) local308 << 32 | (long) (local299 << 16) | (long) local304;
			@Pc(342) int local342 = local21[local268];
			@Pc(346) int local346 = local28[local268];
			@Pc(348) byte local348 = 74;
			@Pc(350) int local350 = 0;
			@Pc(352) float local352 = 1.0F;
			@Pc(358) float local358;
			@Pc(360) float local360;
			@Pc(362) float local362;
			@Pc(462) float local462;
			@Pc(366) int local366;
			if (local342 == 0 && local346 == 0) {
				local358 = local77;
				local360 = local84;
				local362 = local91;
				local366 = local348 - local186;
			} else if (local342 == 0 && local346 == this.anInt338 * 76934957) {
				local358 = local100;
				local360 = local109;
				local362 = local118;
				local366 = local348 - local196;
			} else if (local342 == this.anInt338 * 76934957 && local346 == this.anInt338 * 76934957) {
				local358 = local129;
				local360 = local140;
				local362 = local151;
				local366 = local348 - local208;
			} else if (local342 == this.anInt338 * 76934957 && local346 == 0) {
				local358 = local160;
				local360 = local169;
				local362 = local178;
				local366 = local348 - local218;
			} else {
				@Pc(437) float local437 = (float) local342 / (float) (this.anInt338 * 76934957);
				@Pc(446) float local446 = (float) local346 / (float) (this.anInt338 * 76934957);
				@Pc(454) float local454 = local77 + (local160 - local77) * local437;
				local462 = local84 + (local169 - local84) * local437;
				@Pc(470) float local470 = local91 + (local178 - local91) * local437;
				@Pc(478) float local478 = local100 + (local129 - local100) * local437;
				@Pc(486) float local486 = local109 + (local140 - local109) * local437;
				@Pc(494) float local494 = local118 + (local151 - local118) * local437;
				local358 = local454 + (local478 - local454) * local446;
				local360 = local462 + (local486 - local462) * local446;
				local362 = local470 + (local494 - local470) * local446;
				@Pc(531) int local531 = local186 + ((local218 - local186) * local342 >> this.anInt336 * 1371852633);
				@Pc(544) int local544 = local196 + ((local208 - local196) * local342 >> this.anInt336 * 1371852633);
				local366 = local348 - (local531 + ((local544 - local531) * local346 >> this.anInt336 * 1371852633));
			}
			if (local308 != -1) {
				@Pc(570) int local570 = (local308 & 0x7F) * local366 >> 7;
				if (local570 < 2) {
					local570 = 2;
				} else if (local570 > 126) {
					local570 = 126;
				}
				local350 = Class179.anIntArray372[local308 & 0xFF80 | local570];
				if ((this.anInt343 & 0x7) == 0) {
					local352 = this.aClass21_Sub3_4.aFloatArray76[0] * local358 + this.aClass21_Sub3_4.aFloatArray76[1] * local360 + this.aClass21_Sub3_4.aFloatArray76[2] * local362;
					local352 = this.aClass21_Sub3_4.aFloat197 + local352 * (local352 > 0.0F ? this.aClass21_Sub3_4.aFloat195 : this.aClass21_Sub3_4.aFloat196);
				}
			}
			@Pc(638) Class3 local638 = null;
			if ((local283 & this.anInt341 - 1) == 0 && (local294 & this.anInt341 - 1) == 0) {
				local638 = arg4.method33217(local338);
			}
			@Pc(688) int local688;
			if (local638 == null) {
				if (local312 == local308) {
					local688 = local350;
				} else {
					@Pc(669) int local669 = (local312 & 0x7F) * local366 >> 7;
					if (local669 < 2) {
						local669 = 2;
					} else if (local669 > 126) {
						local669 = 126;
					}
					local688 = Class179.anIntArray372[local312 & 0xFF80 | local669];
					if ((this.anInt343 & 0x7) == 0) {
						@Pc(716) float local716 = this.aClass21_Sub3_4.aFloatArray76[0] * local358 + this.aClass21_Sub3_4.aFloatArray76[1] * local360 + this.aClass21_Sub3_4.aFloatArray76[2] * local362;
						local462 = this.aClass21_Sub3_4.aFloat197 + local352 * (local352 > 0.0F ? this.aClass21_Sub3_4.aFloat195 : this.aClass21_Sub3_4.aFloat196);
						@Pc(741) int local741 = local688 >> 16 & 0xFF;
						@Pc(747) int local747 = local688 >> 8 & 0xFF;
						@Pc(751) int local751 = local688 & 0xFF;
						local741 = (int) ((float) local741 * local462);
						if (local741 < 0) {
							local741 = 0;
						} else if (local741 > 255) {
							local741 = 255;
						}
						local747 = (int) ((float) local747 * local462);
						if (local747 < 0) {
							local747 = 0;
						} else if (local747 > 255) {
							local747 = 255;
						}
						local751 = (int) ((float) local751 * local462);
						if (local751 < 0) {
							local751 = 0;
						} else if (local751 > 255) {
							local751 = 255;
						}
						local688 = local741 << 16 | local747 << 8 | local751;
					}
				}
				@Pc(816) Unsafe local816 = this.aClass21_Sub3_4.anUnsafe3;
				local816.putFloat(this.aLong8, (float) local283);
				this.aLong8 += 4L;
				local816.putFloat(this.aLong8, (float) (this.method3583(local283, local294) + local320));
				this.aLong8 += 4L;
				local816.putFloat(this.aLong8, (float) local294);
				this.aLong8 += 4L;
				local816.putFloat(this.aLong8, (float) local283);
				this.aLong8 += 4L;
				local816.putFloat(this.aLong8, (float) local294);
				this.aLong8 += 4L;
				if (this.anIntArrayArrayArray11 != null) {
					local816.putFloat(this.aLong8, local66 == null ? 0.0F : (float) (local66[local268] - 1));
					this.aLong8 += 4L;
				}
				if ((this.anInt343 & 0x7) != 0) {
					local816.putFloat(this.aLong8, local358);
					this.aLong8 += 4L;
					local816.putFloat(this.aLong8, local360);
					this.aLong8 += 4L;
					local816.putFloat(this.aLong8, local362);
					this.aLong8 += 4L;
				}
				if (this.aClass21_Sub3_4.anInt2502 == 0) {
					@Pc(951) int local951 = local688 & 0xFF00FF00;
					@Pc(959) int local959 = local951 | local688 >> 16 & 0xFF;
					@Pc(967) int local967 = local959 | (local688 & 0xFF) << 16;
					local688 = local967;
				}
				local816.putInt(this.aLong9, local688 | 0xFF000000);
				this.aLong9 += 4L;
				local232 = this.anInt344++;
				local266[local268] = (short) local232;
				if (local308 != -1) {
					arg5[local232] = local14[local268];
				}
				arg4.method33241(new Class3_Sub34(local266[local268]), local338);
			} else {
				local266[local268] = ((Class3_Sub34) local638).aShort63;
				local232 = local266[local268] & 0xFFFF;
				if (local308 != -1 && local14[local268].aLong296 * -1930649055099428229L < arg5[local232].aLong296 * -1930649055099428229L) {
					arg5[local232] = local14[local268];
				}
			}
			for (local688 = 0; local688 < local220; local688++) {
				arg3[local688].method11517(local232, local350, local366, local352);
			}
			this.anInt345++;
		}
	}

	@OriginalMember(owner = "client!abs", name = "bt", descriptor = "(II[[B[Lclient!agj;Lclient!xn;[Lclient!agj;)V", line = 330)
	void method3606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Class3_Sub25[] arg3, @OriginalArg(4) Class581 arg4, @OriginalArg(5) Class3_Sub25[] arg5) {
		if (this.anIntArrayArrayArray7[arg0][arg1] == null) {
			return;
		}
		@Pc(14) Class3_Sub25[] local14 = this.aClass3_Sub25ArrayArrayArray1[arg0][arg1];
		@Pc(21) int[] local21 = this.anIntArrayArrayArray9[arg0][arg1];
		@Pc(28) int[] local28 = this.anIntArrayArrayArray12[arg0][arg1];
		@Pc(35) int[] local35 = this.anIntArrayArrayArray8[arg0][arg1];
		@Pc(42) int[] local42 = this.anIntArrayArrayArray7[arg0][arg1];
		@Pc(54) int[] local54 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[arg0][arg1];
		@Pc(66) int[] local66 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[arg0][arg1];
		if (local35 == null) {
			local35 = local42;
		}
		@Pc(77) float local77 = this.aFloatArrayArray5[arg0][arg1];
		@Pc(84) float local84 = this.aFloatArrayArray6[arg0][arg1];
		@Pc(91) float local91 = this.aFloatArrayArray7[arg0][arg1];
		@Pc(100) float local100 = this.aFloatArrayArray5[arg0][arg1 + 1];
		@Pc(109) float local109 = this.aFloatArrayArray6[arg0][arg1 + 1];
		@Pc(118) float local118 = this.aFloatArrayArray7[arg0][arg1 + 1];
		@Pc(129) float local129 = this.aFloatArrayArray5[arg0 + 1][arg1 + 1];
		@Pc(140) float local140 = this.aFloatArrayArray6[arg0 + 1][arg1 + 1];
		@Pc(151) float local151 = this.aFloatArrayArray7[arg0 + 1][arg1 + 1];
		@Pc(160) float local160 = this.aFloatArrayArray5[arg0 + 1][arg1];
		@Pc(169) float local169 = this.aFloatArrayArray6[arg0 + 1][arg1];
		@Pc(178) float local178 = this.aFloatArrayArray7[arg0 + 1][arg1];
		@Pc(186) int local186 = arg2[arg0][arg1] & 0xFF;
		@Pc(196) int local196 = arg2[arg0][arg1 + 1] & 0xFF;
		@Pc(208) int local208 = arg2[arg0 + 1][arg1 + 1] & 0xFF;
		@Pc(218) int local218 = arg2[arg0 + 1][arg1] & 0xFF;
		@Pc(220) int local220 = 0;
		@Pc(232) int local232;
		label185: for (@Pc(222) int local222 = 0; local222 < local42.length; local222++) {
			@Pc(230) Class3_Sub25 local230 = local14[local222];
			for (local232 = 0; local232 < local220; local232++) {
				if (arg3[local232] == local230) {
					continue label185;
				}
			}
			arg3[local220++] = local230;
		}
		@Pc(266) short[] local266 = this.aShortArrayArray2[arg1 * this.anInt339 * -1007974723 + arg0] = new short[local42.length];
		for (@Pc(268) int local268 = 0; local268 < local42.length; local268++) {
			@Pc(283) int local283 = (arg0 << this.anInt336 * 1371852633) + local21[local268];
			@Pc(294) int local294 = (arg1 << this.anInt336 * 1371852633) + local28[local268];
			@Pc(299) int local299 = local283 >> this.anInt348;
			@Pc(304) int local304 = local294 >> this.anInt348;
			@Pc(308) int local308 = local42[local268];
			@Pc(312) int local312 = local35[local268];
			@Pc(320) int local320 = local54 == null ? 0 : local54[local268];
			@Pc(338) long local338 = (long) local312 << 48 | (long) local308 << 32 | (long) (local299 << 16) | (long) local304;
			@Pc(342) int local342 = local21[local268];
			@Pc(346) int local346 = local28[local268];
			@Pc(348) byte local348 = 74;
			@Pc(350) int local350 = 0;
			@Pc(352) float local352 = 1.0F;
			@Pc(358) float local358;
			@Pc(360) float local360;
			@Pc(362) float local362;
			@Pc(462) float local462;
			@Pc(366) int local366;
			if (local342 == 0 && local346 == 0) {
				local358 = local77;
				local360 = local84;
				local362 = local91;
				local366 = local348 - local186;
			} else if (local342 == 0 && local346 == this.anInt338 * 76934957) {
				local358 = local100;
				local360 = local109;
				local362 = local118;
				local366 = local348 - local196;
			} else if (local342 == this.anInt338 * 76934957 && local346 == this.anInt338 * 76934957) {
				local358 = local129;
				local360 = local140;
				local362 = local151;
				local366 = local348 - local208;
			} else if (local342 == this.anInt338 * 76934957 && local346 == 0) {
				local358 = local160;
				local360 = local169;
				local362 = local178;
				local366 = local348 - local218;
			} else {
				@Pc(437) float local437 = (float) local342 / (float) (this.anInt338 * 76934957);
				@Pc(446) float local446 = (float) local346 / (float) (this.anInt338 * 76934957);
				@Pc(454) float local454 = local77 + (local160 - local77) * local437;
				local462 = local84 + (local169 - local84) * local437;
				@Pc(470) float local470 = local91 + (local178 - local91) * local437;
				@Pc(478) float local478 = local100 + (local129 - local100) * local437;
				@Pc(486) float local486 = local109 + (local140 - local109) * local437;
				@Pc(494) float local494 = local118 + (local151 - local118) * local437;
				local358 = local454 + (local478 - local454) * local446;
				local360 = local462 + (local486 - local462) * local446;
				local362 = local470 + (local494 - local470) * local446;
				@Pc(531) int local531 = local186 + ((local218 - local186) * local342 >> this.anInt336 * 1371852633);
				@Pc(544) int local544 = local196 + ((local208 - local196) * local342 >> this.anInt336 * 1371852633);
				local366 = local348 - (local531 + ((local544 - local531) * local346 >> this.anInt336 * 1371852633));
			}
			if (local308 != -1) {
				@Pc(570) int local570 = (local308 & 0x7F) * local366 >> 7;
				if (local570 < 2) {
					local570 = 2;
				} else if (local570 > 126) {
					local570 = 126;
				}
				local350 = Class179.anIntArray372[local308 & 0xFF80 | local570];
				if ((this.anInt343 & 0x7) == 0) {
					local352 = this.aClass21_Sub3_4.aFloatArray76[0] * local358 + this.aClass21_Sub3_4.aFloatArray76[1] * local360 + this.aClass21_Sub3_4.aFloatArray76[2] * local362;
					local352 = this.aClass21_Sub3_4.aFloat197 + local352 * (local352 > 0.0F ? this.aClass21_Sub3_4.aFloat195 : this.aClass21_Sub3_4.aFloat196);
				}
			}
			@Pc(638) Class3 local638 = null;
			if ((local283 & this.anInt341 - 1) == 0 && (local294 & this.anInt341 - 1) == 0) {
				local638 = arg4.method33217(local338);
			}
			@Pc(688) int local688;
			if (local638 == null) {
				if (local312 == local308) {
					local688 = local350;
				} else {
					@Pc(669) int local669 = (local312 & 0x7F) * local366 >> 7;
					if (local669 < 2) {
						local669 = 2;
					} else if (local669 > 126) {
						local669 = 126;
					}
					local688 = Class179.anIntArray372[local312 & 0xFF80 | local669];
					if ((this.anInt343 & 0x7) == 0) {
						@Pc(716) float local716 = this.aClass21_Sub3_4.aFloatArray76[0] * local358 + this.aClass21_Sub3_4.aFloatArray76[1] * local360 + this.aClass21_Sub3_4.aFloatArray76[2] * local362;
						local462 = this.aClass21_Sub3_4.aFloat197 + local352 * (local352 > 0.0F ? this.aClass21_Sub3_4.aFloat195 : this.aClass21_Sub3_4.aFloat196);
						@Pc(741) int local741 = local688 >> 16 & 0xFF;
						@Pc(747) int local747 = local688 >> 8 & 0xFF;
						@Pc(751) int local751 = local688 & 0xFF;
						local741 = (int) ((float) local741 * local462);
						if (local741 < 0) {
							local741 = 0;
						} else if (local741 > 255) {
							local741 = 255;
						}
						local747 = (int) ((float) local747 * local462);
						if (local747 < 0) {
							local747 = 0;
						} else if (local747 > 255) {
							local747 = 255;
						}
						local751 = (int) ((float) local751 * local462);
						if (local751 < 0) {
							local751 = 0;
						} else if (local751 > 255) {
							local751 = 255;
						}
						local688 = local741 << 16 | local747 << 8 | local751;
					}
				}
				@Pc(816) Unsafe local816 = this.aClass21_Sub3_4.anUnsafe3;
				local816.putFloat(this.aLong8, (float) local283);
				this.aLong8 += 4L;
				local816.putFloat(this.aLong8, (float) (this.method3583(local283, local294) + local320));
				this.aLong8 += 4L;
				local816.putFloat(this.aLong8, (float) local294);
				this.aLong8 += 4L;
				local816.putFloat(this.aLong8, (float) local283);
				this.aLong8 += 4L;
				local816.putFloat(this.aLong8, (float) local294);
				this.aLong8 += 4L;
				if (this.anIntArrayArrayArray11 != null) {
					local816.putFloat(this.aLong8, local66 == null ? 0.0F : (float) (local66[local268] - 1));
					this.aLong8 += 4L;
				}
				if ((this.anInt343 & 0x7) != 0) {
					local816.putFloat(this.aLong8, local358);
					this.aLong8 += 4L;
					local816.putFloat(this.aLong8, local360);
					this.aLong8 += 4L;
					local816.putFloat(this.aLong8, local362);
					this.aLong8 += 4L;
				}
				if (this.aClass21_Sub3_4.anInt2502 == 0) {
					@Pc(951) int local951 = local688 & 0xFF00FF00;
					@Pc(959) int local959 = local951 | local688 >> 16 & 0xFF;
					@Pc(967) int local967 = local959 | (local688 & 0xFF) << 16;
					local688 = local967;
				}
				local816.putInt(this.aLong9, local688 | 0xFF000000);
				this.aLong9 += 4L;
				local232 = this.anInt344++;
				local266[local268] = (short) local232;
				if (local308 != -1) {
					arg5[local232] = local14[local268];
				}
				arg4.method33241(new Class3_Sub34(local266[local268]), local338);
			} else {
				local266[local268] = ((Class3_Sub34) local638).aShort63;
				local232 = local266[local268] & 0xFFFF;
				if (local308 != -1 && local14[local268].aLong296 * -1930649055099428229L < arg5[local232].aLong296 * -1930649055099428229L) {
					arg5[local232] = local14[local268];
				}
			}
			for (local688 = 0; local688 < local220; local688++) {
				arg3[local688].method11517(local232, local350, local366, local352);
			}
			this.anInt345++;
		}
	}

	@OriginalMember(owner = "client!abs", name = "k", descriptor = "(III[[ZZI)V", line = 509)
	@Override
	public void method3564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass3Array2 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray48.length < local12) {
			this.anIntArray48 = new int[local12];
		}
		@Pc(25) int local25 = arg0 - arg2;
		@Pc(27) int local27 = local25;
		if (local25 < 0) {
			local25 = 0;
		}
		@Pc(35) int local35 = arg1 - arg2;
		@Pc(37) int local37 = local35;
		if (local35 < 0) {
			local35 = 0;
		}
		@Pc(45) int local45 = arg0 + arg2;
		if (local45 > this.anInt339 * -1007974723 - 1) {
			local45 = this.anInt339 * -1007974723 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt337 * -207323189 - 1) {
			local64 = this.anInt337 * -207323189 - 1;
		}
		this.anInt340 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray48[this.anInt340++] = local95 * this.anInt339 * -1007974723 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass21_Sub3_4.aByteBuffer4;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass3Array2.length; local135++) {
			@Pc(146) Class3_Sub25 local146 = (Class3_Sub25) this.aClass3Array2[local135];
			local146.method11511(this.anIntArray48, this.anInt340);
		}
		local135 = local130.position();
		@Pc(161) Class32 local161 = this.aClass21_Sub3_4.aClass32_3;
		if (local135 != 0) {
			@Pc(170) Interface30 local170 = this.aClass21_Sub3_4.method17464(local135 / 2);
			local170.method25705(0, local135, this.aClass21_Sub3_4.aLong101);
			this.aClass21_Sub3_4.method17557();
			this.aClass21_Sub3_4.method17544(0, this.anInterface21_2);
			this.aClass21_Sub3_4.method17545(local170);
			local161.method7774(Class328.aClass328_99);
			if (this.aClass21_Sub3_4.anInt2520 > 0) {
				local161.aClass320_31.method25863((float) (this.aClass21_Sub3_4.anInt2519 >> 16 & 0xFF) / 255.0F, (float) (this.aClass21_Sub3_4.anInt2519 >> 8 & 0xFF) / 255.0F, (float) (this.aClass21_Sub3_4.anInt2519 >> 0 & 0xFF) / 255.0F);
				local161.aClass333_8.method26251(0.0F, 0.0F, 1.0F, -this.aClass21_Sub3_4.aFloat198);
				local161.aClass333_8.method26257(this.aClass21_Sub3_4.aClass328_79);
				local161.aClass333_8.method26256(1.0F / (this.aClass21_Sub3_4.aFloat199 - this.aClass21_Sub3_4.aFloat198));
			} else {
				local161.aClass333_8.method26251(0.0F, 0.0F, 0.0F, 0.0F);
				local161.aClass320_31.method25863(0.0F, 0.0F, 0.0F);
			}
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class3_Sub25 local293;
			@Pc(411) Class133 local411;
			if ((this.anInt343 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass3Array2.length; local282++) {
					local293 = (Class3_Sub25) this.aClass3Array2[local282];
					if (local293.anInt1299 != 0) {
						if (this.aClass21_Sub3_4.aBoolean435) {
							this.aClass21_Sub3_4.method17101(0, local293.aClass139_4);
							local161.aClass333_7.method26251(0.0F, 1.0F, 0.0F, (float) this.aClass21_Sub3_4.anInt2485 + (float) (local293.aClass139_4.anInt3419 * -729027733) / 255.0F * (float) (local293.aClass139_4.anInt3417 * 1125508145));
							local161.aClass333_7.method26256(1.0F / (float) (local293.aClass139_4.anInt3417 * 1125508145));
							local161.aClass320_33.method25863((float) (local293.aClass139_4.anInt3422 * -470091381 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass333_7.method26251(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass320_33.method25863(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1300 == -1) {
							local161.anInterface20_14 = this.aClass21_Sub3_4.anInterface20_23;
						} else {
							local411 = this.aClass21_Sub3_4.aClass134_7.method22906(local293.anInt1300);
							local161.anInterface20_14 = this.aClass21_Sub3_4.aClass247_3.method24907(local411);
							local399 = !Class431.method27957(local411.aByte118);
						}
						this.aClass21_Sub3_4.method17544(1, local293.anInterface21_11);
						this.aClass21_Sub3_4.method17738(this.aClass37_1);
						local161.aClass328_44.method26050(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt842 = local293.anInt1301;
						local161.anInt841 = local293.anInt1302 - local293.anInt1301 + 1;
						local161.anInt843 = local280;
						local161.anInt844 = local293.anInt1299 / 3;
						local161.method7775(local399);
						local280 += local293.anInt1299;
					}
				}
			} else {
				local161.aClass320_34.method25863(this.aClass21_Sub3_4.aFloatArray76[0], this.aClass21_Sub3_4.aFloatArray76[1], this.aClass21_Sub3_4.aFloatArray76[2]);
				local161.aClass320_35.method25863(this.aClass21_Sub3_4.aFloat195 * this.aClass21_Sub3_4.aFloat193, this.aClass21_Sub3_4.aFloat195 * this.aClass21_Sub3_4.aFloat194, this.aClass21_Sub3_4.aFloat195 * this.aClass21_Sub3_4.aFloat185);
				local161.aClass320_36.method25863(-this.aClass21_Sub3_4.aFloat196 * this.aClass21_Sub3_4.aFloat193, -this.aClass21_Sub3_4.aFloat196 * this.aClass21_Sub3_4.aFloat194, -this.aClass21_Sub3_4.aFloat196 * this.aClass21_Sub3_4.aFloat185);
				local161.aClass320_37.method25863(this.aClass21_Sub3_4.aFloat197 * this.aClass21_Sub3_4.aFloat193, this.aClass21_Sub3_4.aFloat197 * this.aClass21_Sub3_4.aFloat194, this.aClass21_Sub3_4.aFloat197 * this.aClass21_Sub3_4.aFloat185);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass3Array2.length; local282++) {
					local293 = (Class3_Sub25) this.aClass3Array2[local282];
					if (local293.anInt1299 > 0) {
						if (this.aClass21_Sub3_4.aBoolean435) {
							this.aClass21_Sub3_4.method17101(0, local293.aClass139_4);
							@Pc(613) float local613 = 0.15F;
							local161.aClass333_7.method26251(0.0F, 1.0F / ((float) (local293.aClass139_4.anInt3417 * 1125508145) * local613), 0.0F, 256.0F / ((float) (local293.aClass139_4.anInt3417 * 1125508145) * local613));
							local161.aClass320_33.method25863((float) (local293.aClass139_4.anInt3422 * -470091381 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass333_7.method26251(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass320_33.method25863(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1300 == -1) {
							local161.anInterface20_14 = this.aClass21_Sub3_4.anInterface20_23;
						} else {
							local411 = this.aClass21_Sub3_4.aClass134_7.method22906(local293.anInt1300);
							local693 = local411.aByte118;
							local161.anInterface20_14 = this.aClass21_Sub3_4.aClass247_3.method24907(local411);
							local161.method7773(local411.aByte119);
						}
						this.aClass21_Sub3_4.method17544(1, local293.anInterface21_11);
						this.aClass21_Sub3_4.method17738(this.aClass37_1);
						local161.aClass328_44.method26050(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt842 = local293.anInt1301;
						local161.anInt841 = local293.anInt1302 - local293.anInt1301 + 1;
						local161.anInt843 = local280;
						local161.anInt844 = local293.anInt1299 / 3;
						switch(local693) {
							case 1:
								local161.aClass320_32.method25863(this.aClass21_Sub3_4.aClass328_92.aFloatArray106[12], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[13], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[14]);
								if (this.aClass21_Sub3_4.aBoolean435) {
									local161.method7779();
								} else {
									local161.method7786(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass21_Sub3_4.aBoolean422 || (this.anInt343 & 0x8) == 0 || !this.aClass21_Sub3_4.aClass40_Sub1_Sub1_6.method15206()) {
									local161.method7784(0);
								} else {
									@Pc(824) Class40_Sub1_Sub1 local824 = this.aClass21_Sub3_4.aClass40_Sub1_Sub1_6;
									if (local693 == 2) {
										local824 = this.aClass21_Sub3_4.aClass40_Sub1_Sub1_5;
									}
									local824.aClass328_55.method26104(this.aClass21_Sub3_4.aClass328_85);
									local824.aClass328_56.method26050(1.0F / (local293.aFloat143 * (float) (local293.aClass139_4.anInt3418 * 742124635)), 1.0F / (local293.aFloat143 * (float) (local293.aClass139_4.anInt3418 * 742124635)), 1.0F, 1.0F);
									local824.aClass320_55.method25863(this.aClass21_Sub3_4.aClass328_92.aFloatArray106[12], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[13], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[14]);
									@Pc(893) Class133 local893 = this.aClass21_Sub3_4.aClass134_7.method22906(local293.anInt1300);
									local824.anInt2219 = local893.aByte119 * -70559323;
									local824.anInt2222 = local293.anInt1301 * -1790068457;
									local824.anInt2221 = (local293.anInt1302 - local293.anInt1301 + 1) * 1688196181;
									local824.anInt2220 = local280 * 284988663;
									local824.anInt2223 = local293.anInt1299 / 3 * 1092212603;
									local824.aClass333_14.method26259(local161.aClass333_7);
									local824.aClass320_56.method25893(local161.aClass320_33);
									local824.aClass333_13.method26259(local161.aClass333_8);
									local824.aClass320_57.method25893(local161.aClass320_31);
									local824.method15207();
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass21_Sub3_4.aBoolean435) {
									local161.method7778();
								} else {
									local161.method7784(0);
								}
								break;
							case 6:
								local161.method7775(!Class431.method27957(local693));
								break;
							case 7:
								local161.aClass320_32.method25863(this.aClass21_Sub3_4.aClass328_92.aFloatArray106[12], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[13], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[14]);
								local161.aClass328_45.method26042();
								local161.anInterface27_3 = this.aClass21_Sub3_4.method17764();
								local161.method7772(0);
						}
						local280 += local293.anInt1299;
					}
				}
			}
		}
		if (!this.aClass553_3.method32712()) {
			this.aClass21_Sub3_4.method17469(128);
			this.aClass21_Sub3_4.method17685(false);
			@Pc(1036) Class320 local1036 = new Class320(local161.aClass320_31);
			local161.aClass320_31.method25863(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass553_3.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class3_Sub16 local1053 = (Class3_Sub16) local1046.next();
				local1053.method11316(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass320_31.method25893(local1036);
		}
		if (this.aClass246_1 == null) {
			return;
		}
		this.aClass21_Sub3_4.method17469(1);
		this.aClass21_Sub3_4.method17544(0, this.anInterface21_2);
		this.aClass21_Sub3_4.method17544(1, this.anInterface21_3);
		this.aClass21_Sub3_4.method17738(this.aClass37_1);
		@Pc(1094) Class328 local1094 = this.aClass21_Sub3_4.aClass328_86;
		local1094.method26042();
		local1094.aFloatArray106[13] = -1.0F;
		local161.method7774(local1094);
		this.aClass246_1.method24874(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abs", name = "at", descriptor = "(III[[ZZI)V", line = 509)
	@Override
	public void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass3Array2 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray48.length < local12) {
			this.anIntArray48 = new int[local12];
		}
		@Pc(25) int local25 = arg0 - arg2;
		@Pc(27) int local27 = local25;
		if (local25 < 0) {
			local25 = 0;
		}
		@Pc(35) int local35 = arg1 - arg2;
		@Pc(37) int local37 = local35;
		if (local35 < 0) {
			local35 = 0;
		}
		@Pc(45) int local45 = arg0 + arg2;
		if (local45 > this.anInt339 * -1007974723 - 1) {
			local45 = this.anInt339 * -1007974723 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt337 * -207323189 - 1) {
			local64 = this.anInt337 * -207323189 - 1;
		}
		this.anInt340 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray48[this.anInt340++] = local95 * this.anInt339 * -1007974723 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass21_Sub3_4.aByteBuffer4;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass3Array2.length; local135++) {
			@Pc(146) Class3_Sub25 local146 = (Class3_Sub25) this.aClass3Array2[local135];
			local146.method11511(this.anIntArray48, this.anInt340);
		}
		local135 = local130.position();
		@Pc(161) Class32 local161 = this.aClass21_Sub3_4.aClass32_3;
		if (local135 != 0) {
			@Pc(170) Interface30 local170 = this.aClass21_Sub3_4.method17464(local135 / 2);
			local170.method25705(0, local135, this.aClass21_Sub3_4.aLong101);
			this.aClass21_Sub3_4.method17557();
			this.aClass21_Sub3_4.method17544(0, this.anInterface21_2);
			this.aClass21_Sub3_4.method17545(local170);
			local161.method7774(Class328.aClass328_99);
			if (this.aClass21_Sub3_4.anInt2520 > 0) {
				local161.aClass320_31.method25863((float) (this.aClass21_Sub3_4.anInt2519 >> 16 & 0xFF) / 255.0F, (float) (this.aClass21_Sub3_4.anInt2519 >> 8 & 0xFF) / 255.0F, (float) (this.aClass21_Sub3_4.anInt2519 >> 0 & 0xFF) / 255.0F);
				local161.aClass333_8.method26251(0.0F, 0.0F, 1.0F, -this.aClass21_Sub3_4.aFloat198);
				local161.aClass333_8.method26257(this.aClass21_Sub3_4.aClass328_79);
				local161.aClass333_8.method26256(1.0F / (this.aClass21_Sub3_4.aFloat199 - this.aClass21_Sub3_4.aFloat198));
			} else {
				local161.aClass333_8.method26251(0.0F, 0.0F, 0.0F, 0.0F);
				local161.aClass320_31.method25863(0.0F, 0.0F, 0.0F);
			}
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class3_Sub25 local293;
			@Pc(411) Class133 local411;
			if ((this.anInt343 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass3Array2.length; local282++) {
					local293 = (Class3_Sub25) this.aClass3Array2[local282];
					if (local293.anInt1299 != 0) {
						if (this.aClass21_Sub3_4.aBoolean435) {
							this.aClass21_Sub3_4.method17101(0, local293.aClass139_4);
							local161.aClass333_7.method26251(0.0F, 1.0F, 0.0F, (float) this.aClass21_Sub3_4.anInt2485 + (float) (local293.aClass139_4.anInt3419 * -729027733) / 255.0F * (float) (local293.aClass139_4.anInt3417 * 1125508145));
							local161.aClass333_7.method26256(1.0F / (float) (local293.aClass139_4.anInt3417 * 1125508145));
							local161.aClass320_33.method25863((float) (local293.aClass139_4.anInt3422 * -470091381 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass333_7.method26251(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass320_33.method25863(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1300 == -1) {
							local161.anInterface20_14 = this.aClass21_Sub3_4.anInterface20_23;
						} else {
							local411 = this.aClass21_Sub3_4.aClass134_7.method22906(local293.anInt1300);
							local161.anInterface20_14 = this.aClass21_Sub3_4.aClass247_3.method24907(local411);
							local399 = !Class431.method27957(local411.aByte118);
						}
						this.aClass21_Sub3_4.method17544(1, local293.anInterface21_11);
						this.aClass21_Sub3_4.method17738(this.aClass37_1);
						local161.aClass328_44.method26050(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt842 = local293.anInt1301;
						local161.anInt841 = local293.anInt1302 - local293.anInt1301 + 1;
						local161.anInt843 = local280;
						local161.anInt844 = local293.anInt1299 / 3;
						local161.method7775(local399);
						local280 += local293.anInt1299;
					}
				}
			} else {
				local161.aClass320_34.method25863(this.aClass21_Sub3_4.aFloatArray76[0], this.aClass21_Sub3_4.aFloatArray76[1], this.aClass21_Sub3_4.aFloatArray76[2]);
				local161.aClass320_35.method25863(this.aClass21_Sub3_4.aFloat195 * this.aClass21_Sub3_4.aFloat193, this.aClass21_Sub3_4.aFloat195 * this.aClass21_Sub3_4.aFloat194, this.aClass21_Sub3_4.aFloat195 * this.aClass21_Sub3_4.aFloat185);
				local161.aClass320_36.method25863(-this.aClass21_Sub3_4.aFloat196 * this.aClass21_Sub3_4.aFloat193, -this.aClass21_Sub3_4.aFloat196 * this.aClass21_Sub3_4.aFloat194, -this.aClass21_Sub3_4.aFloat196 * this.aClass21_Sub3_4.aFloat185);
				local161.aClass320_37.method25863(this.aClass21_Sub3_4.aFloat197 * this.aClass21_Sub3_4.aFloat193, this.aClass21_Sub3_4.aFloat197 * this.aClass21_Sub3_4.aFloat194, this.aClass21_Sub3_4.aFloat197 * this.aClass21_Sub3_4.aFloat185);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass3Array2.length; local282++) {
					local293 = (Class3_Sub25) this.aClass3Array2[local282];
					if (local293.anInt1299 > 0) {
						if (this.aClass21_Sub3_4.aBoolean435) {
							this.aClass21_Sub3_4.method17101(0, local293.aClass139_4);
							@Pc(613) float local613 = 0.15F;
							local161.aClass333_7.method26251(0.0F, 1.0F / ((float) (local293.aClass139_4.anInt3417 * 1125508145) * local613), 0.0F, 256.0F / ((float) (local293.aClass139_4.anInt3417 * 1125508145) * local613));
							local161.aClass320_33.method25863((float) (local293.aClass139_4.anInt3422 * -470091381 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass333_7.method26251(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass320_33.method25863(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1300 == -1) {
							local161.anInterface20_14 = this.aClass21_Sub3_4.anInterface20_23;
						} else {
							local411 = this.aClass21_Sub3_4.aClass134_7.method22906(local293.anInt1300);
							local693 = local411.aByte118;
							local161.anInterface20_14 = this.aClass21_Sub3_4.aClass247_3.method24907(local411);
							local161.method7773(local411.aByte119);
						}
						this.aClass21_Sub3_4.method17544(1, local293.anInterface21_11);
						this.aClass21_Sub3_4.method17738(this.aClass37_1);
						local161.aClass328_44.method26050(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt842 = local293.anInt1301;
						local161.anInt841 = local293.anInt1302 - local293.anInt1301 + 1;
						local161.anInt843 = local280;
						local161.anInt844 = local293.anInt1299 / 3;
						switch(local693) {
							case 1:
								local161.aClass320_32.method25863(this.aClass21_Sub3_4.aClass328_92.aFloatArray106[12], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[13], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[14]);
								if (this.aClass21_Sub3_4.aBoolean435) {
									local161.method7779();
								} else {
									local161.method7786(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass21_Sub3_4.aBoolean422 || (this.anInt343 & 0x8) == 0 || !this.aClass21_Sub3_4.aClass40_Sub1_Sub1_6.method15206()) {
									local161.method7784(0);
								} else {
									@Pc(824) Class40_Sub1_Sub1 local824 = this.aClass21_Sub3_4.aClass40_Sub1_Sub1_6;
									if (local693 == 2) {
										local824 = this.aClass21_Sub3_4.aClass40_Sub1_Sub1_5;
									}
									local824.aClass328_55.method26104(this.aClass21_Sub3_4.aClass328_85);
									local824.aClass328_56.method26050(1.0F / (local293.aFloat143 * (float) (local293.aClass139_4.anInt3418 * 742124635)), 1.0F / (local293.aFloat143 * (float) (local293.aClass139_4.anInt3418 * 742124635)), 1.0F, 1.0F);
									local824.aClass320_55.method25863(this.aClass21_Sub3_4.aClass328_92.aFloatArray106[12], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[13], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[14]);
									@Pc(893) Class133 local893 = this.aClass21_Sub3_4.aClass134_7.method22906(local293.anInt1300);
									local824.anInt2219 = local893.aByte119 * -70559323;
									local824.anInt2222 = local293.anInt1301 * -1790068457;
									local824.anInt2221 = (local293.anInt1302 - local293.anInt1301 + 1) * 1688196181;
									local824.anInt2220 = local280 * 284988663;
									local824.anInt2223 = local293.anInt1299 / 3 * 1092212603;
									local824.aClass333_14.method26259(local161.aClass333_7);
									local824.aClass320_56.method25893(local161.aClass320_33);
									local824.aClass333_13.method26259(local161.aClass333_8);
									local824.aClass320_57.method25893(local161.aClass320_31);
									local824.method15207();
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass21_Sub3_4.aBoolean435) {
									local161.method7778();
								} else {
									local161.method7784(0);
								}
								break;
							case 6:
								local161.method7775(!Class431.method27957(local693));
								break;
							case 7:
								local161.aClass320_32.method25863(this.aClass21_Sub3_4.aClass328_92.aFloatArray106[12], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[13], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[14]);
								local161.aClass328_45.method26042();
								local161.anInterface27_3 = this.aClass21_Sub3_4.method17764();
								local161.method7772(0);
						}
						local280 += local293.anInt1299;
					}
				}
			}
		}
		if (!this.aClass553_3.method32712()) {
			this.aClass21_Sub3_4.method17469(128);
			this.aClass21_Sub3_4.method17685(false);
			@Pc(1036) Class320 local1036 = new Class320(local161.aClass320_31);
			local161.aClass320_31.method25863(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass553_3.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class3_Sub16 local1053 = (Class3_Sub16) local1046.next();
				local1053.method11316(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass320_31.method25893(local1036);
		}
		if (this.aClass246_1 == null) {
			return;
		}
		this.aClass21_Sub3_4.method17469(1);
		this.aClass21_Sub3_4.method17544(0, this.anInterface21_2);
		this.aClass21_Sub3_4.method17544(1, this.anInterface21_3);
		this.aClass21_Sub3_4.method17738(this.aClass37_1);
		@Pc(1094) Class328 local1094 = this.aClass21_Sub3_4.aClass328_86;
		local1094.method26042();
		local1094.aFloatArray106[13] = -1.0F;
		local161.method7774(local1094);
		this.aClass246_1.method24874(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abs", name = "h", descriptor = "(III[[ZZI)V", line = 509)
	@Override
	public void method3544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass3Array2 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray48.length < local12) {
			this.anIntArray48 = new int[local12];
		}
		@Pc(25) int local25 = arg0 - arg2;
		@Pc(27) int local27 = local25;
		if (local25 < 0) {
			local25 = 0;
		}
		@Pc(35) int local35 = arg1 - arg2;
		@Pc(37) int local37 = local35;
		if (local35 < 0) {
			local35 = 0;
		}
		@Pc(45) int local45 = arg0 + arg2;
		if (local45 > this.anInt339 * -1007974723 - 1) {
			local45 = this.anInt339 * -1007974723 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt337 * -207323189 - 1) {
			local64 = this.anInt337 * -207323189 - 1;
		}
		this.anInt340 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray48[this.anInt340++] = local95 * this.anInt339 * -1007974723 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass21_Sub3_4.aByteBuffer4;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass3Array2.length; local135++) {
			@Pc(146) Class3_Sub25 local146 = (Class3_Sub25) this.aClass3Array2[local135];
			local146.method11511(this.anIntArray48, this.anInt340);
		}
		local135 = local130.position();
		@Pc(161) Class32 local161 = this.aClass21_Sub3_4.aClass32_3;
		if (local135 != 0) {
			@Pc(170) Interface30 local170 = this.aClass21_Sub3_4.method17464(local135 / 2);
			local170.method25705(0, local135, this.aClass21_Sub3_4.aLong101);
			this.aClass21_Sub3_4.method17557();
			this.aClass21_Sub3_4.method17544(0, this.anInterface21_2);
			this.aClass21_Sub3_4.method17545(local170);
			local161.method7774(Class328.aClass328_99);
			if (this.aClass21_Sub3_4.anInt2520 > 0) {
				local161.aClass320_31.method25863((float) (this.aClass21_Sub3_4.anInt2519 >> 16 & 0xFF) / 255.0F, (float) (this.aClass21_Sub3_4.anInt2519 >> 8 & 0xFF) / 255.0F, (float) (this.aClass21_Sub3_4.anInt2519 >> 0 & 0xFF) / 255.0F);
				local161.aClass333_8.method26251(0.0F, 0.0F, 1.0F, -this.aClass21_Sub3_4.aFloat198);
				local161.aClass333_8.method26257(this.aClass21_Sub3_4.aClass328_79);
				local161.aClass333_8.method26256(1.0F / (this.aClass21_Sub3_4.aFloat199 - this.aClass21_Sub3_4.aFloat198));
			} else {
				local161.aClass333_8.method26251(0.0F, 0.0F, 0.0F, 0.0F);
				local161.aClass320_31.method25863(0.0F, 0.0F, 0.0F);
			}
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class3_Sub25 local293;
			@Pc(411) Class133 local411;
			if ((this.anInt343 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass3Array2.length; local282++) {
					local293 = (Class3_Sub25) this.aClass3Array2[local282];
					if (local293.anInt1299 != 0) {
						if (this.aClass21_Sub3_4.aBoolean435) {
							this.aClass21_Sub3_4.method17101(0, local293.aClass139_4);
							local161.aClass333_7.method26251(0.0F, 1.0F, 0.0F, (float) this.aClass21_Sub3_4.anInt2485 + (float) (local293.aClass139_4.anInt3419 * -729027733) / 255.0F * (float) (local293.aClass139_4.anInt3417 * 1125508145));
							local161.aClass333_7.method26256(1.0F / (float) (local293.aClass139_4.anInt3417 * 1125508145));
							local161.aClass320_33.method25863((float) (local293.aClass139_4.anInt3422 * -470091381 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass333_7.method26251(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass320_33.method25863(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1300 == -1) {
							local161.anInterface20_14 = this.aClass21_Sub3_4.anInterface20_23;
						} else {
							local411 = this.aClass21_Sub3_4.aClass134_7.method22906(local293.anInt1300);
							local161.anInterface20_14 = this.aClass21_Sub3_4.aClass247_3.method24907(local411);
							local399 = !Class431.method27957(local411.aByte118);
						}
						this.aClass21_Sub3_4.method17544(1, local293.anInterface21_11);
						this.aClass21_Sub3_4.method17738(this.aClass37_1);
						local161.aClass328_44.method26050(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt842 = local293.anInt1301;
						local161.anInt841 = local293.anInt1302 - local293.anInt1301 + 1;
						local161.anInt843 = local280;
						local161.anInt844 = local293.anInt1299 / 3;
						local161.method7775(local399);
						local280 += local293.anInt1299;
					}
				}
			} else {
				local161.aClass320_34.method25863(this.aClass21_Sub3_4.aFloatArray76[0], this.aClass21_Sub3_4.aFloatArray76[1], this.aClass21_Sub3_4.aFloatArray76[2]);
				local161.aClass320_35.method25863(this.aClass21_Sub3_4.aFloat195 * this.aClass21_Sub3_4.aFloat193, this.aClass21_Sub3_4.aFloat195 * this.aClass21_Sub3_4.aFloat194, this.aClass21_Sub3_4.aFloat195 * this.aClass21_Sub3_4.aFloat185);
				local161.aClass320_36.method25863(-this.aClass21_Sub3_4.aFloat196 * this.aClass21_Sub3_4.aFloat193, -this.aClass21_Sub3_4.aFloat196 * this.aClass21_Sub3_4.aFloat194, -this.aClass21_Sub3_4.aFloat196 * this.aClass21_Sub3_4.aFloat185);
				local161.aClass320_37.method25863(this.aClass21_Sub3_4.aFloat197 * this.aClass21_Sub3_4.aFloat193, this.aClass21_Sub3_4.aFloat197 * this.aClass21_Sub3_4.aFloat194, this.aClass21_Sub3_4.aFloat197 * this.aClass21_Sub3_4.aFloat185);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass3Array2.length; local282++) {
					local293 = (Class3_Sub25) this.aClass3Array2[local282];
					if (local293.anInt1299 > 0) {
						if (this.aClass21_Sub3_4.aBoolean435) {
							this.aClass21_Sub3_4.method17101(0, local293.aClass139_4);
							@Pc(613) float local613 = 0.15F;
							local161.aClass333_7.method26251(0.0F, 1.0F / ((float) (local293.aClass139_4.anInt3417 * 1125508145) * local613), 0.0F, 256.0F / ((float) (local293.aClass139_4.anInt3417 * 1125508145) * local613));
							local161.aClass320_33.method25863((float) (local293.aClass139_4.anInt3422 * -470091381 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass333_7.method26251(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass320_33.method25863(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1300 == -1) {
							local161.anInterface20_14 = this.aClass21_Sub3_4.anInterface20_23;
						} else {
							local411 = this.aClass21_Sub3_4.aClass134_7.method22906(local293.anInt1300);
							local693 = local411.aByte118;
							local161.anInterface20_14 = this.aClass21_Sub3_4.aClass247_3.method24907(local411);
							local161.method7773(local411.aByte119);
						}
						this.aClass21_Sub3_4.method17544(1, local293.anInterface21_11);
						this.aClass21_Sub3_4.method17738(this.aClass37_1);
						local161.aClass328_44.method26050(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt842 = local293.anInt1301;
						local161.anInt841 = local293.anInt1302 - local293.anInt1301 + 1;
						local161.anInt843 = local280;
						local161.anInt844 = local293.anInt1299 / 3;
						switch(local693) {
							case 1:
								local161.aClass320_32.method25863(this.aClass21_Sub3_4.aClass328_92.aFloatArray106[12], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[13], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[14]);
								if (this.aClass21_Sub3_4.aBoolean435) {
									local161.method7779();
								} else {
									local161.method7786(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass21_Sub3_4.aBoolean422 || (this.anInt343 & 0x8) == 0 || !this.aClass21_Sub3_4.aClass40_Sub1_Sub1_6.method15206()) {
									local161.method7784(0);
								} else {
									@Pc(824) Class40_Sub1_Sub1 local824 = this.aClass21_Sub3_4.aClass40_Sub1_Sub1_6;
									if (local693 == 2) {
										local824 = this.aClass21_Sub3_4.aClass40_Sub1_Sub1_5;
									}
									local824.aClass328_55.method26104(this.aClass21_Sub3_4.aClass328_85);
									local824.aClass328_56.method26050(1.0F / (local293.aFloat143 * (float) (local293.aClass139_4.anInt3418 * 742124635)), 1.0F / (local293.aFloat143 * (float) (local293.aClass139_4.anInt3418 * 742124635)), 1.0F, 1.0F);
									local824.aClass320_55.method25863(this.aClass21_Sub3_4.aClass328_92.aFloatArray106[12], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[13], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[14]);
									@Pc(893) Class133 local893 = this.aClass21_Sub3_4.aClass134_7.method22906(local293.anInt1300);
									local824.anInt2219 = local893.aByte119 * -70559323;
									local824.anInt2222 = local293.anInt1301 * -1790068457;
									local824.anInt2221 = (local293.anInt1302 - local293.anInt1301 + 1) * 1688196181;
									local824.anInt2220 = local280 * 284988663;
									local824.anInt2223 = local293.anInt1299 / 3 * 1092212603;
									local824.aClass333_14.method26259(local161.aClass333_7);
									local824.aClass320_56.method25893(local161.aClass320_33);
									local824.aClass333_13.method26259(local161.aClass333_8);
									local824.aClass320_57.method25893(local161.aClass320_31);
									local824.method15207();
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass21_Sub3_4.aBoolean435) {
									local161.method7778();
								} else {
									local161.method7784(0);
								}
								break;
							case 6:
								local161.method7775(!Class431.method27957(local693));
								break;
							case 7:
								local161.aClass320_32.method25863(this.aClass21_Sub3_4.aClass328_92.aFloatArray106[12], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[13], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[14]);
								local161.aClass328_45.method26042();
								local161.anInterface27_3 = this.aClass21_Sub3_4.method17764();
								local161.method7772(0);
						}
						local280 += local293.anInt1299;
					}
				}
			}
		}
		if (!this.aClass553_3.method32712()) {
			this.aClass21_Sub3_4.method17469(128);
			this.aClass21_Sub3_4.method17685(false);
			@Pc(1036) Class320 local1036 = new Class320(local161.aClass320_31);
			local161.aClass320_31.method25863(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass553_3.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class3_Sub16 local1053 = (Class3_Sub16) local1046.next();
				local1053.method11316(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass320_31.method25893(local1036);
		}
		if (this.aClass246_1 == null) {
			return;
		}
		this.aClass21_Sub3_4.method17469(1);
		this.aClass21_Sub3_4.method17544(0, this.anInterface21_2);
		this.aClass21_Sub3_4.method17544(1, this.anInterface21_3);
		this.aClass21_Sub3_4.method17738(this.aClass37_1);
		@Pc(1094) Class328 local1094 = this.aClass21_Sub3_4.aClass328_86;
		local1094.method26042();
		local1094.aFloatArray106[13] = -1.0F;
		local161.method7774(local1094);
		this.aClass246_1.method24874(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abs", name = "af", descriptor = "(III[[ZZI)V", line = 509)
	@Override
	public void method3566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass3Array2 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray48.length < local12) {
			this.anIntArray48 = new int[local12];
		}
		@Pc(25) int local25 = arg0 - arg2;
		@Pc(27) int local27 = local25;
		if (local25 < 0) {
			local25 = 0;
		}
		@Pc(35) int local35 = arg1 - arg2;
		@Pc(37) int local37 = local35;
		if (local35 < 0) {
			local35 = 0;
		}
		@Pc(45) int local45 = arg0 + arg2;
		if (local45 > this.anInt339 * -1007974723 - 1) {
			local45 = this.anInt339 * -1007974723 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt337 * -207323189 - 1) {
			local64 = this.anInt337 * -207323189 - 1;
		}
		this.anInt340 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray48[this.anInt340++] = local95 * this.anInt339 * -1007974723 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass21_Sub3_4.aByteBuffer4;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass3Array2.length; local135++) {
			@Pc(146) Class3_Sub25 local146 = (Class3_Sub25) this.aClass3Array2[local135];
			local146.method11511(this.anIntArray48, this.anInt340);
		}
		local135 = local130.position();
		@Pc(161) Class32 local161 = this.aClass21_Sub3_4.aClass32_3;
		if (local135 != 0) {
			@Pc(170) Interface30 local170 = this.aClass21_Sub3_4.method17464(local135 / 2);
			local170.method25705(0, local135, this.aClass21_Sub3_4.aLong101);
			this.aClass21_Sub3_4.method17557();
			this.aClass21_Sub3_4.method17544(0, this.anInterface21_2);
			this.aClass21_Sub3_4.method17545(local170);
			local161.method7774(Class328.aClass328_99);
			if (this.aClass21_Sub3_4.anInt2520 > 0) {
				local161.aClass320_31.method25863((float) (this.aClass21_Sub3_4.anInt2519 >> 16 & 0xFF) / 255.0F, (float) (this.aClass21_Sub3_4.anInt2519 >> 8 & 0xFF) / 255.0F, (float) (this.aClass21_Sub3_4.anInt2519 >> 0 & 0xFF) / 255.0F);
				local161.aClass333_8.method26251(0.0F, 0.0F, 1.0F, -this.aClass21_Sub3_4.aFloat198);
				local161.aClass333_8.method26257(this.aClass21_Sub3_4.aClass328_79);
				local161.aClass333_8.method26256(1.0F / (this.aClass21_Sub3_4.aFloat199 - this.aClass21_Sub3_4.aFloat198));
			} else {
				local161.aClass333_8.method26251(0.0F, 0.0F, 0.0F, 0.0F);
				local161.aClass320_31.method25863(0.0F, 0.0F, 0.0F);
			}
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class3_Sub25 local293;
			@Pc(411) Class133 local411;
			if ((this.anInt343 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass3Array2.length; local282++) {
					local293 = (Class3_Sub25) this.aClass3Array2[local282];
					if (local293.anInt1299 != 0) {
						if (this.aClass21_Sub3_4.aBoolean435) {
							this.aClass21_Sub3_4.method17101(0, local293.aClass139_4);
							local161.aClass333_7.method26251(0.0F, 1.0F, 0.0F, (float) this.aClass21_Sub3_4.anInt2485 + (float) (local293.aClass139_4.anInt3419 * -729027733) / 255.0F * (float) (local293.aClass139_4.anInt3417 * 1125508145));
							local161.aClass333_7.method26256(1.0F / (float) (local293.aClass139_4.anInt3417 * 1125508145));
							local161.aClass320_33.method25863((float) (local293.aClass139_4.anInt3422 * -470091381 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass333_7.method26251(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass320_33.method25863(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1300 == -1) {
							local161.anInterface20_14 = this.aClass21_Sub3_4.anInterface20_23;
						} else {
							local411 = this.aClass21_Sub3_4.aClass134_7.method22906(local293.anInt1300);
							local161.anInterface20_14 = this.aClass21_Sub3_4.aClass247_3.method24907(local411);
							local399 = !Class431.method27957(local411.aByte118);
						}
						this.aClass21_Sub3_4.method17544(1, local293.anInterface21_11);
						this.aClass21_Sub3_4.method17738(this.aClass37_1);
						local161.aClass328_44.method26050(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt842 = local293.anInt1301;
						local161.anInt841 = local293.anInt1302 - local293.anInt1301 + 1;
						local161.anInt843 = local280;
						local161.anInt844 = local293.anInt1299 / 3;
						local161.method7775(local399);
						local280 += local293.anInt1299;
					}
				}
			} else {
				local161.aClass320_34.method25863(this.aClass21_Sub3_4.aFloatArray76[0], this.aClass21_Sub3_4.aFloatArray76[1], this.aClass21_Sub3_4.aFloatArray76[2]);
				local161.aClass320_35.method25863(this.aClass21_Sub3_4.aFloat195 * this.aClass21_Sub3_4.aFloat193, this.aClass21_Sub3_4.aFloat195 * this.aClass21_Sub3_4.aFloat194, this.aClass21_Sub3_4.aFloat195 * this.aClass21_Sub3_4.aFloat185);
				local161.aClass320_36.method25863(-this.aClass21_Sub3_4.aFloat196 * this.aClass21_Sub3_4.aFloat193, -this.aClass21_Sub3_4.aFloat196 * this.aClass21_Sub3_4.aFloat194, -this.aClass21_Sub3_4.aFloat196 * this.aClass21_Sub3_4.aFloat185);
				local161.aClass320_37.method25863(this.aClass21_Sub3_4.aFloat197 * this.aClass21_Sub3_4.aFloat193, this.aClass21_Sub3_4.aFloat197 * this.aClass21_Sub3_4.aFloat194, this.aClass21_Sub3_4.aFloat197 * this.aClass21_Sub3_4.aFloat185);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass3Array2.length; local282++) {
					local293 = (Class3_Sub25) this.aClass3Array2[local282];
					if (local293.anInt1299 > 0) {
						if (this.aClass21_Sub3_4.aBoolean435) {
							this.aClass21_Sub3_4.method17101(0, local293.aClass139_4);
							@Pc(613) float local613 = 0.15F;
							local161.aClass333_7.method26251(0.0F, 1.0F / ((float) (local293.aClass139_4.anInt3417 * 1125508145) * local613), 0.0F, 256.0F / ((float) (local293.aClass139_4.anInt3417 * 1125508145) * local613));
							local161.aClass320_33.method25863((float) (local293.aClass139_4.anInt3422 * -470091381 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass139_4.anInt3422 * -470091381 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass333_7.method26251(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass320_33.method25863(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1300 == -1) {
							local161.anInterface20_14 = this.aClass21_Sub3_4.anInterface20_23;
						} else {
							local411 = this.aClass21_Sub3_4.aClass134_7.method22906(local293.anInt1300);
							local693 = local411.aByte118;
							local161.anInterface20_14 = this.aClass21_Sub3_4.aClass247_3.method24907(local411);
							local161.method7773(local411.aByte119);
						}
						this.aClass21_Sub3_4.method17544(1, local293.anInterface21_11);
						this.aClass21_Sub3_4.method17738(this.aClass37_1);
						local161.aClass328_44.method26050(1.0F / local293.aFloat143, 1.0F / local293.aFloat143, 1.0F, 1.0F);
						local161.anInt842 = local293.anInt1301;
						local161.anInt841 = local293.anInt1302 - local293.anInt1301 + 1;
						local161.anInt843 = local280;
						local161.anInt844 = local293.anInt1299 / 3;
						switch(local693) {
							case 1:
								local161.aClass320_32.method25863(this.aClass21_Sub3_4.aClass328_92.aFloatArray106[12], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[13], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[14]);
								if (this.aClass21_Sub3_4.aBoolean435) {
									local161.method7779();
								} else {
									local161.method7786(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass21_Sub3_4.aBoolean422 || (this.anInt343 & 0x8) == 0 || !this.aClass21_Sub3_4.aClass40_Sub1_Sub1_6.method15206()) {
									local161.method7784(0);
								} else {
									@Pc(824) Class40_Sub1_Sub1 local824 = this.aClass21_Sub3_4.aClass40_Sub1_Sub1_6;
									if (local693 == 2) {
										local824 = this.aClass21_Sub3_4.aClass40_Sub1_Sub1_5;
									}
									local824.aClass328_55.method26104(this.aClass21_Sub3_4.aClass328_85);
									local824.aClass328_56.method26050(1.0F / (local293.aFloat143 * (float) (local293.aClass139_4.anInt3418 * 742124635)), 1.0F / (local293.aFloat143 * (float) (local293.aClass139_4.anInt3418 * 742124635)), 1.0F, 1.0F);
									local824.aClass320_55.method25863(this.aClass21_Sub3_4.aClass328_92.aFloatArray106[12], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[13], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[14]);
									@Pc(893) Class133 local893 = this.aClass21_Sub3_4.aClass134_7.method22906(local293.anInt1300);
									local824.anInt2219 = local893.aByte119 * -70559323;
									local824.anInt2222 = local293.anInt1301 * -1790068457;
									local824.anInt2221 = (local293.anInt1302 - local293.anInt1301 + 1) * 1688196181;
									local824.anInt2220 = local280 * 284988663;
									local824.anInt2223 = local293.anInt1299 / 3 * 1092212603;
									local824.aClass333_14.method26259(local161.aClass333_7);
									local824.aClass320_56.method25893(local161.aClass320_33);
									local824.aClass333_13.method26259(local161.aClass333_8);
									local824.aClass320_57.method25893(local161.aClass320_31);
									local824.method15207();
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass21_Sub3_4.aBoolean435) {
									local161.method7778();
								} else {
									local161.method7784(0);
								}
								break;
							case 6:
								local161.method7775(!Class431.method27957(local693));
								break;
							case 7:
								local161.aClass320_32.method25863(this.aClass21_Sub3_4.aClass328_92.aFloatArray106[12], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[13], this.aClass21_Sub3_4.aClass328_92.aFloatArray106[14]);
								local161.aClass328_45.method26042();
								local161.anInterface27_3 = this.aClass21_Sub3_4.method17764();
								local161.method7772(0);
						}
						local280 += local293.anInt1299;
					}
				}
			}
		}
		if (!this.aClass553_3.method32712()) {
			this.aClass21_Sub3_4.method17469(128);
			this.aClass21_Sub3_4.method17685(false);
			@Pc(1036) Class320 local1036 = new Class320(local161.aClass320_31);
			local161.aClass320_31.method25863(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass553_3.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class3_Sub16 local1053 = (Class3_Sub16) local1046.next();
				local1053.method11316(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass320_31.method25893(local1036);
		}
		if (this.aClass246_1 == null) {
			return;
		}
		this.aClass21_Sub3_4.method17469(1);
		this.aClass21_Sub3_4.method17544(0, this.anInterface21_2);
		this.aClass21_Sub3_4.method17544(1, this.anInterface21_3);
		this.aClass21_Sub3_4.method17738(this.aClass37_1);
		@Pc(1094) Class328 local1094 = this.aClass21_Sub3_4.aClass328_86;
		local1094.method26042();
		local1094.aFloatArray106[13] = -1.0F;
		local161.method7774(local1094);
		this.aClass246_1.method24874(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!abs", name = "x", descriptor = "(IIIIIII[[Z)V", line = 717)
	@Override
	public void method3545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		if (this.anInt347 <= 0) {
			return;
		}
		@Pc(9) Interface30 local9 = this.aClass21_Sub3_4.method17464(this.anInt345);
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 32767;
		@Pc(15) int local15 = -32768;
		@Pc(19) ByteBuffer local19 = this.aClass21_Sub3_4.aByteBuffer4;
		local19.clear();
		for (@Pc(24) int local24 = arg4; local24 < arg6; local24++) {
			@Pc(36) int local36 = local24 * this.anInt339 * -1007974723 + arg3;
			for (@Pc(38) int local38 = arg3; local38 < arg5; local38++) {
				if (arg7[local38 - arg3][local24 - arg4]) {
					@Pc(56) short[] local56 = this.aShortArrayArray2[local36];
					if (local56 != null) {
						for (@Pc(60) int local60 = 0; local60 < local56.length; local60++) {
							@Pc(70) int local70 = local56[local60] & 0xFFFF;
							if (local70 > local15) {
								local15 = local70;
							}
							if (local70 < local13) {
								local13 = local70;
							}
							local19.putShort((short) local70);
							local11++;
						}
					}
				}
				local36++;
			}
		}
		local9.method25705(0, local19.position(), this.aClass21_Sub3_4.aLong101);
		if (local11 <= 0) {
			return;
		}
		this.aClass21_Sub3_4.method17557();
		@Pc(111) Class32 local111 = this.aClass21_Sub3_4.aClass32_3;
		this.aClass21_Sub3_4.method17544(0, this.anInterface21_2);
		this.aClass21_Sub3_4.method17544(1, this.anInterface21_3);
		this.aClass21_Sub3_4.method17738(this.aClass37_1);
		this.aClass21_Sub3_4.method17545(local9);
		this.aClass21_Sub3_4.method17106(Class332.aClass332_54);
		@Pc(143) float local143 = (float) this.aClass21_Sub3_4.method17037().method21390();
		@Pc(150) float local150 = (float) this.aClass21_Sub3_4.method17037().method21391();
		@Pc(154) Class332 local154 = new Class332();
		@Pc(158) Class332 local158 = new Class332();
		local154.method26192(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		local158.method26199((float) arg2 / ((float) (this.anInt338 * 76934957) * 256.0F), (float) -arg2 / ((float) (this.anInt338 * 76934957) * 256.0F), 1.0F / (this.aFloat40 - this.aFloat39));
		local158.method26203((float) arg0 - (float) (arg3 * arg2) / 256.0F, (float) arg1 + (float) (arg6 * arg2) / 256.0F, -this.aFloat39 / (this.aFloat40 - this.aFloat39));
		local158.method26200(2.0F / local143, 2.0F / local150, 1.0F);
		local158.method26203(-1.0F, -1.0F, 0.0F);
		this.aClass21_Sub3_4.aClass332_38.method26205(local154, local158);
		this.aClass21_Sub3_4.aClass328_86.method26056(this.aClass21_Sub3_4.aClass332_38);
		this.aClass21_Sub3_4.method17322(this.aClass21_Sub3_4.aClass328_86);
		local111.method7774(Class328.aClass328_99);
		local111.aClass333_8.method26251(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass320_31.method25863(0.0F, 0.0F, 0.0F);
		local111.aClass333_7.method26251(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass320_33.method25863(0.0F, 0.0F, 0.0F);
		local111.anInterface20_14 = this.aClass21_Sub3_4.anInterface20_23;
		local111.aClass328_44.method26042();
		local111.anInt842 = local13;
		local111.anInt841 = local15 - local13 + 1;
		local111.anInt843 = 0;
		local111.anInt844 = local11 / 3;
		if (this.aClass21_Sub3_4.aBoolean434) {
			this.aClass21_Sub3_4.method17108(false);
			local111.method7775(false);
			this.aClass21_Sub3_4.method17108(true);
		} else {
			local111.method7775(false);
		}
	}

	@OriginalMember(owner = "client!abs", name = "ak", descriptor = "(IIIIIII[[Z)V", line = 717)
	@Override
	public void method3543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		if (this.anInt347 <= 0) {
			return;
		}
		@Pc(9) Interface30 local9 = this.aClass21_Sub3_4.method17464(this.anInt345);
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 32767;
		@Pc(15) int local15 = -32768;
		@Pc(19) ByteBuffer local19 = this.aClass21_Sub3_4.aByteBuffer4;
		local19.clear();
		for (@Pc(24) int local24 = arg4; local24 < arg6; local24++) {
			@Pc(36) int local36 = local24 * this.anInt339 * -1007974723 + arg3;
			for (@Pc(38) int local38 = arg3; local38 < arg5; local38++) {
				if (arg7[local38 - arg3][local24 - arg4]) {
					@Pc(56) short[] local56 = this.aShortArrayArray2[local36];
					if (local56 != null) {
						for (@Pc(60) int local60 = 0; local60 < local56.length; local60++) {
							@Pc(70) int local70 = local56[local60] & 0xFFFF;
							if (local70 > local15) {
								local15 = local70;
							}
							if (local70 < local13) {
								local13 = local70;
							}
							local19.putShort((short) local70);
							local11++;
						}
					}
				}
				local36++;
			}
		}
		local9.method25705(0, local19.position(), this.aClass21_Sub3_4.aLong101);
		if (local11 <= 0) {
			return;
		}
		this.aClass21_Sub3_4.method17557();
		@Pc(111) Class32 local111 = this.aClass21_Sub3_4.aClass32_3;
		this.aClass21_Sub3_4.method17544(0, this.anInterface21_2);
		this.aClass21_Sub3_4.method17544(1, this.anInterface21_3);
		this.aClass21_Sub3_4.method17738(this.aClass37_1);
		this.aClass21_Sub3_4.method17545(local9);
		this.aClass21_Sub3_4.method17106(Class332.aClass332_54);
		@Pc(143) float local143 = (float) this.aClass21_Sub3_4.method17037().method21390();
		@Pc(150) float local150 = (float) this.aClass21_Sub3_4.method17037().method21391();
		@Pc(154) Class332 local154 = new Class332();
		@Pc(158) Class332 local158 = new Class332();
		local154.method26192(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		local158.method26199((float) arg2 / ((float) (this.anInt338 * 76934957) * 256.0F), (float) -arg2 / ((float) (this.anInt338 * 76934957) * 256.0F), 1.0F / (this.aFloat40 - this.aFloat39));
		local158.method26203((float) arg0 - (float) (arg3 * arg2) / 256.0F, (float) arg1 + (float) (arg6 * arg2) / 256.0F, -this.aFloat39 / (this.aFloat40 - this.aFloat39));
		local158.method26200(2.0F / local143, 2.0F / local150, 1.0F);
		local158.method26203(-1.0F, -1.0F, 0.0F);
		this.aClass21_Sub3_4.aClass332_38.method26205(local154, local158);
		this.aClass21_Sub3_4.aClass328_86.method26056(this.aClass21_Sub3_4.aClass332_38);
		this.aClass21_Sub3_4.method17322(this.aClass21_Sub3_4.aClass328_86);
		local111.method7774(Class328.aClass328_99);
		local111.aClass333_8.method26251(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass320_31.method25863(0.0F, 0.0F, 0.0F);
		local111.aClass333_7.method26251(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass320_33.method25863(0.0F, 0.0F, 0.0F);
		local111.anInterface20_14 = this.aClass21_Sub3_4.anInterface20_23;
		local111.aClass328_44.method26042();
		local111.anInt842 = local13;
		local111.anInt841 = local15 - local13 + 1;
		local111.anInt843 = 0;
		local111.anInt844 = local11 / 3;
		if (this.aClass21_Sub3_4.aBoolean434) {
			this.aClass21_Sub3_4.method17108(false);
			local111.method7775(false);
			this.aClass21_Sub3_4.method17108(true);
		} else {
			local111.method7775(false);
		}
	}

	@OriginalMember(owner = "client!abs", name = "c", descriptor = "(IILclient!amd;)Lclient!amd;", line = 784)
	@Override
	public Class3_Sub1_Sub3 method3550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		if ((this.aByteArrayArray9[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt338 * 76934957 >> this.aClass21_Sub3_4.anInt2511;
		@Pc(22) Class3_Sub1_Sub3_Sub2 local22 = (Class3_Sub1_Sub3_Sub2) arg2;
		@Pc(31) Class3_Sub1_Sub3_Sub2 local31;
		if (local22 != null && local22.method21275(local19, local19)) {
			local31 = local22;
			local22.method21269();
		} else {
			local31 = new Class3_Sub1_Sub3_Sub2(this.aClass21_Sub3_4, local19, local19);
		}
		local31.method21267(0, 0, local19, local19);
		this.method3597(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!abs", name = "an", descriptor = "(IILclient!amd;)Lclient!amd;", line = 784)
	@Override
	public Class3_Sub1_Sub3 method3568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		if ((this.aByteArrayArray9[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt338 * 76934957 >> this.aClass21_Sub3_4.anInt2511;
		@Pc(22) Class3_Sub1_Sub3_Sub2 local22 = (Class3_Sub1_Sub3_Sub2) arg2;
		@Pc(31) Class3_Sub1_Sub3_Sub2 local31;
		if (local22 != null && local22.method21275(local19, local19)) {
			local31 = local22;
			local22.method21269();
		} else {
			local31 = new Class3_Sub1_Sub3_Sub2(this.aClass21_Sub3_4, local19, local19);
		}
		local31.method21267(0, 0, local19, local19);
		this.method3597(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!abs", name = "aa", descriptor = "(IILclient!amd;)Lclient!amd;", line = 784)
	@Override
	public Class3_Sub1_Sub3 method3582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		if ((this.aByteArrayArray9[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt338 * 76934957 >> this.aClass21_Sub3_4.anInt2511;
		@Pc(22) Class3_Sub1_Sub3_Sub2 local22 = (Class3_Sub1_Sub3_Sub2) arg2;
		@Pc(31) Class3_Sub1_Sub3_Sub2 local31;
		if (local22 != null && local22.method21275(local19, local19)) {
			local31 = local22;
			local22.method21269();
		} else {
			local31 = new Class3_Sub1_Sub3_Sub2(this.aClass21_Sub3_4, local19, local19);
		}
		local31.method21267(0, 0, local19, local19);
		this.method3597(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!abs", name = "ah", descriptor = "(IILclient!amd;)Lclient!amd;", line = 784)
	@Override
	public Class3_Sub1_Sub3 method3569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		if ((this.aByteArrayArray9[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt338 * 76934957 >> this.aClass21_Sub3_4.anInt2511;
		@Pc(22) Class3_Sub1_Sub3_Sub2 local22 = (Class3_Sub1_Sub3_Sub2) arg2;
		@Pc(31) Class3_Sub1_Sub3_Sub2 local31;
		if (local22 != null && local22.method21275(local19, local19)) {
			local31 = local22;
			local22.method21269();
		} else {
			local31 = new Class3_Sub1_Sub3_Sub2(this.aClass21_Sub3_4, local19, local19);
		}
		local31.method21267(0, 0, local19, local19);
		this.method3597(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!abs", name = "aj", descriptor = "(IILclient!amd;)Lclient!amd;", line = 784)
	@Override
	public Class3_Sub1_Sub3 method3571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub3 arg2) {
		if ((this.aByteArrayArray9[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt338 * 76934957 >> this.aClass21_Sub3_4.anInt2511;
		@Pc(22) Class3_Sub1_Sub3_Sub2 local22 = (Class3_Sub1_Sub3_Sub2) arg2;
		@Pc(31) Class3_Sub1_Sub3_Sub2 local31;
		if (local22 != null && local22.method21275(local19, local19)) {
			local31 = local22;
			local22.method21269();
		} else {
			local31 = new Class3_Sub1_Sub3_Sub2(this.aClass21_Sub3_4, local19, local19);
		}
		local31.method21267(0, 0, local19, local19);
		this.method3597(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!abs", name = "bp", descriptor = "(Lclient!aov;II)V", line = 799)
	void method3597(@OriginalArg(0) Class3_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray9[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray12[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.anIntArray47.length < local16) {
			this.anIntArray47 = new int[local16];
			this.anIntArray46 = new int[local16];
		}
		@Pc(31) int local31;
		for (local31 = 0; local31 < local16; local31++) {
			this.anIntArray47[local31] = local6[local31] >> this.aClass21_Sub3_4.anInt2511;
			this.anIntArray46[local31] = local13[local31] >> this.aClass21_Sub3_4.anInt2511;
		}
		local31 = 0;
		while (local31 < local16) {
			@Pc(68) int local68 = this.anIntArray47[local31];
			@Pc(74) int local74 = this.anIntArray46[local31++];
			@Pc(79) int local79 = this.anIntArray47[local31];
			@Pc(85) int local85 = this.anIntArray46[local31++];
			@Pc(90) int local90 = this.anIntArray47[local31];
			@Pc(96) int local96 = this.anIntArray46[local31++];
			if ((local68 - local79) * (local85 - local96) - (local85 - local74) * (local90 - local79) > 0) {
				arg0.method21270(local74, local85, local96, local68, local79, local90);
			}
		}
	}

	@OriginalMember(owner = "client!abs", name = "bg", descriptor = "(Lclient!aov;II)V", line = 799)
	void method3598(@OriginalArg(0) Class3_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray9[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray12[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.anIntArray47.length < local16) {
			this.anIntArray47 = new int[local16];
			this.anIntArray46 = new int[local16];
		}
		@Pc(31) int local31;
		for (local31 = 0; local31 < local16; local31++) {
			this.anIntArray47[local31] = local6[local31] >> this.aClass21_Sub3_4.anInt2511;
			this.anIntArray46[local31] = local13[local31] >> this.aClass21_Sub3_4.anInt2511;
		}
		local31 = 0;
		while (local31 < local16) {
			@Pc(68) int local68 = this.anIntArray47[local31];
			@Pc(74) int local74 = this.anIntArray46[local31++];
			@Pc(79) int local79 = this.anIntArray47[local31];
			@Pc(85) int local85 = this.anIntArray46[local31++];
			@Pc(90) int local90 = this.anIntArray47[local31];
			@Pc(96) int local96 = this.anIntArray46[local31++];
			if ((local68 - local79) * (local85 - local96) - (local85 - local74) * (local90 - local79) > 0) {
				arg0.method21270(local74, local85, local96, local68, local79, local90);
			}
		}
	}

	@OriginalMember(owner = "client!abs", name = "br", descriptor = "(Lclient!aov;II)V", line = 799)
	void method3599(@OriginalArg(0) Class3_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray9[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray12[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.anIntArray47.length < local16) {
			this.anIntArray47 = new int[local16];
			this.anIntArray46 = new int[local16];
		}
		@Pc(31) int local31;
		for (local31 = 0; local31 < local16; local31++) {
			this.anIntArray47[local31] = local6[local31] >> this.aClass21_Sub3_4.anInt2511;
			this.anIntArray46[local31] = local13[local31] >> this.aClass21_Sub3_4.anInt2511;
		}
		local31 = 0;
		while (local31 < local16) {
			@Pc(68) int local68 = this.anIntArray47[local31];
			@Pc(74) int local74 = this.anIntArray46[local31++];
			@Pc(79) int local79 = this.anIntArray47[local31];
			@Pc(85) int local85 = this.anIntArray46[local31++];
			@Pc(90) int local90 = this.anIntArray47[local31];
			@Pc(96) int local96 = this.anIntArray46[local31++];
			if ((local68 - local79) * (local85 - local96) - (local85 - local74) * (local90 - local79) > 0) {
				arg0.method21270(local74, local85, local96, local68, local79, local90);
			}
		}
	}

	@OriginalMember(owner = "client!abs", name = "bk", descriptor = "(Lclient!aov;II)V", line = 799)
	void method3607(@OriginalArg(0) Class3_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray9[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray12[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.anIntArray47.length < local16) {
			this.anIntArray47 = new int[local16];
			this.anIntArray46 = new int[local16];
		}
		@Pc(31) int local31;
		for (local31 = 0; local31 < local16; local31++) {
			this.anIntArray47[local31] = local6[local31] >> this.aClass21_Sub3_4.anInt2511;
			this.anIntArray46[local31] = local13[local31] >> this.aClass21_Sub3_4.anInt2511;
		}
		local31 = 0;
		while (local31 < local16) {
			@Pc(68) int local68 = this.anIntArray47[local31];
			@Pc(74) int local74 = this.anIntArray46[local31++];
			@Pc(79) int local79 = this.anIntArray47[local31];
			@Pc(85) int local85 = this.anIntArray46[local31++];
			@Pc(90) int local90 = this.anIntArray47[local31];
			@Pc(96) int local96 = this.anIntArray46[local31++];
			if ((local68 - local79) * (local85 - local96) - (local85 - local74) * (local90 - local79) > 0) {
				arg0.method21270(local74, local85, local96, local68, local79, local90);
			}
		}
	}

	@OriginalMember(owner = "client!abs", name = "n", descriptor = "(Lclient!amd;IIIIZ)Z", line = 824)
	@Override
	public boolean method3553(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass246_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass21_Sub3_4.anInt2512 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass21_Sub3_4.anInt2513 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			return this.aClass246_1.method24894(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!abs", name = "aq", descriptor = "(Lclient!amd;IIIIZ)Z", line = 824)
	@Override
	public boolean method3574(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass246_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass21_Sub3_4.anInt2512 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass21_Sub3_4.anInt2513 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			return this.aClass246_1.method24894(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!abs", name = "z", descriptor = "(Lclient!amd;IIIIZ)V", line = 831)
	@Override
	public void method3551(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass246_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass21_Sub3_4.anInt2512 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass21_Sub3_4.anInt2513 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			this.aClass246_1.method24875(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!abs", name = "as", descriptor = "(Lclient!amd;IIIIZ)V", line = 831)
	@Override
	public void method3572(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass246_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass21_Sub3_4.anInt2512 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass21_Sub3_4.anInt2513 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			this.aClass246_1.method24875(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!abs", name = "ai", descriptor = "(Lclient!amd;IIIIZ)V", line = 831)
	@Override
	public void method3573(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass246_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass21_Sub3_4.anInt2512 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass21_Sub3_4.anInt2513 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			this.aClass246_1.method24875(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!abs", name = "av", descriptor = "(Lclient!amd;IIIIZ)V", line = 838)
	@Override
	public void method3575(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass246_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass21_Sub3_4.anInt2512 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass21_Sub3_4.anInt2513 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			this.aClass246_1.method24876(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!abs", name = "j", descriptor = "(Lclient!amd;IIIIZ)V", line = 838)
	@Override
	public void method3540(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass246_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass21_Sub3_4.anInt2512 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass21_Sub3_4.anInt2513 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			this.aClass246_1.method24876(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!abs", name = "ax", descriptor = "(Lclient!amd;IIIIZ)V", line = 838)
	@Override
	public void method3576(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass246_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass21_Sub3_4.anInt2512 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass21_Sub3_4.anInt2513 >> 8) >> this.aClass21_Sub3_4.anInt2511;
			this.aClass246_1.method24876(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!abs", name = "e", descriptor = "(Lclient!afz;[I)V", line = 845)
	@Override
	public void method3554(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass553_3.method32702(new Class3_Sub16(this.aClass21_Sub3_4, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!abs", name = "az", descriptor = "(Lclient!afz;[I)V", line = 845)
	@Override
	public void method3558(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass553_3.method32702(new Class3_Sub16(this.aClass21_Sub3_4, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!abs", name = "al", descriptor = "(Lclient!afz;[I)V", line = 845)
	@Override
	public void method3578(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass553_3.method32702(new Class3_Sub16(this.aClass21_Sub3_4, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!abs", name = "ap", descriptor = "(Lclient!afz;[I)V", line = 845)
	@Override
	public void method3580(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass553_3.method32702(new Class3_Sub16(this.aClass21_Sub3_4, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!abs", name = "ao", descriptor = "(Lclient!afz;[I)V", line = 845)
	@Override
	public void method3579(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass553_3.method32702(new Class3_Sub16(this.aClass21_Sub3_4, this, arg0, arg1));
	}
}
