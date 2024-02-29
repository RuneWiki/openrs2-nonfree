package com.jagex;

import java.nio.ByteBuffer;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aek")
public class Class88_Sub2 extends Class88 {

	@OriginalMember(owner = "client!aek", name = "t", descriptor = "I")
	static final int anInt574 = 74;

	@OriginalMember(owner = "client!aek", name = "w", descriptor = "I")
	static final int anInt578 = 1;

	@OriginalMember(owner = "client!aek", name = "ai", descriptor = "[Lclient!sn;")
	Class77[] aClass77Array3;

	@OriginalMember(owner = "client!aek", name = "g", descriptor = "I")
	int anInt572;

	@OriginalMember(owner = "client!aek", name = "z", descriptor = "I")
	int anInt573;

	@OriginalMember(owner = "client!aek", name = "aq", descriptor = "I")
	int anInt575;

	@OriginalMember(owner = "client!aek", name = "ao", descriptor = "Lclient!kt;")
	Class113 aClass113_7;

	@OriginalMember(owner = "client!aek", name = "a", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!aek", name = "ag", descriptor = "Lclient!kp;")
	Interface36 anInterface36_4;

	@OriginalMember(owner = "client!aek", name = "al", descriptor = "Lclient!kp;")
	Interface36 anInterface36_5;

	@OriginalMember(owner = "client!aek", name = "as", descriptor = "Ljava/nio/ByteBuffer;")
	ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!aek", name = "ak", descriptor = "I")
	int anInt576;

	@OriginalMember(owner = "client!aek", name = "au", descriptor = "I")
	int anInt577;

	@OriginalMember(owner = "client!aek", name = "ae", descriptor = "I")
	int anInt579;

	@OriginalMember(owner = "client!aek", name = "at", descriptor = "[Lclient!sn;")
	Class77[] aClass77Array4;

	@OriginalMember(owner = "client!aek", name = "ah", descriptor = "Ljava/nio/ByteBuffer;")
	ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!aek", name = "af", descriptor = "I")
	int anInt580;

	@OriginalMember(owner = "client!aek", name = "i", descriptor = "F")
	float aFloat35 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!aek", name = "k", descriptor = "F")
	float aFloat34 = -3.4028235E38F;

	@OriginalMember(owner = "client!aek", name = "aj", descriptor = "Lclient!zm;")
	Class695 aClass695_5 = new Class695();

	@OriginalMember(owner = "client!aek", name = "am", descriptor = "[I")
	int[] anIntArray42 = new int[1];

	@OriginalMember(owner = "client!aek", name = "ay", descriptor = "[I")
	int[] anIntArray43 = new int[1];

	@OriginalMember(owner = "client!aek", name = "an", descriptor = "[I")
	int[] anIntArray41 = new int[1];

	@OriginalMember(owner = "client!aek", name = "q", descriptor = "Lclient!aed;")
	final Class86_Sub1 aClass86_Sub1_3;

	@OriginalMember(owner = "client!aek", name = "x", descriptor = "I")
	int anInt568;

	@OriginalMember(owner = "client!aek", name = "d", descriptor = "I")
	int anInt569;

	@OriginalMember(owner = "client!aek", name = "s", descriptor = "I")
	int anInt570;

	@OriginalMember(owner = "client!aek", name = "r", descriptor = "I")
	final int anInt571;

	@OriginalMember(owner = "client!aek", name = "n", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!aek", name = "u", descriptor = "[[[Lclient!aji;")
	Class77_Sub10[][][] aClass77_Sub10ArrayArrayArray1;

	@OriginalMember(owner = "client!aek", name = "o", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!aek", name = "b", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!aek", name = "e", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!aek", name = "f", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!aek", name = "j", descriptor = "[[S")
	short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!aek", name = "m", descriptor = "[[B")
	byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!aek", name = "ax", descriptor = "[[B")
	byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!aek", name = "ar", descriptor = "[[F")
	float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!aek", name = "ad", descriptor = "[[F")
	float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!aek", name = "ac", descriptor = "[[F")
	float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!aek", name = "av", descriptor = "Lclient!aak;")
	Class12 aClass12_5;

	@OriginalMember(owner = "client!aek", name = "h", descriptor = "Lclient!kd;")
	Class359 aClass359_1;

	@OriginalMember(owner = "client!aek", name = "<init>", descriptor = "(Lclient!aed;IIII[[I[[II)V", line = 66)
	Class88_Sub2(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass86_Sub1_3 = arg0;
		this.anInt568 = this.anInt609 * -1495101509 - 2;
		this.anInt569 = 0x1 << this.anInt568;
		this.anInt570 = arg1;
		this.anInt571 = arg2;
		this.anIntArrayArrayArray10 = new int[arg3][arg4][];
		this.aClass77_Sub10ArrayArrayArray1 = new Class77_Sub10[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.aShortArrayArray2 = new short[arg3 * arg4][];
		this.aByteArrayArray4 = new byte[arg3][arg4];
		this.aByteArrayArray5 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray8 = new float[this.anInt607 * -1924295585 + 1][this.anInt606 * -1466328823 + 1];
		this.aFloatArrayArray7 = new float[this.anInt607 * -1924295585 + 1][this.anInt606 * -1466328823 + 1];
		this.aFloatArrayArray6 = new float[this.anInt607 * -1924295585 + 1][this.anInt606 * -1466328823 + 1];
		for (@Pc(148) int local148 = 0; local148 <= this.anInt606 * -1466328823; local148++) {
			for (@Pc(156) int local156 = 0; local156 <= this.anInt607 * -1924295585; local156++) {
				@Pc(169) int local169 = this.anIntArrayArray10[local156][local148];
				if ((float) local169 < this.aFloat35) {
					this.aFloat35 = local169;
				}
				if ((float) local169 > this.aFloat34) {
					this.aFloat34 = local169;
				}
				if (local156 > 0 && local148 > 0 && local156 < this.anInt607 * -1924295585 && local148 < this.anInt606 * -1466328823) {
					@Pc(221) int local221 = arg6[local156 + 1][local148] - arg6[local156 - 1][local148];
					@Pc(237) int local237 = arg6[local156][local148 + 1] - arg6[local156][local148 - 1];
					@Pc(256) float local256 = (float) (1.0D / Math.sqrt((double) (local221 * local221 + arg7 * 4 * arg7 + local237 * local237)));
					this.aFloatArrayArray8[local156][local148] = (float) local221 * local256;
					this.aFloatArrayArray7[local156][local148] = (float) (-arg7 * 2) * local256;
					this.aFloatArrayArray6[local156][local148] = (float) local237 * local256;
				}
			}
		}
		this.aFloat35--;
		this.aFloat34++;
		this.aClass12_5 = new Class12(128);
		if ((this.anInt571 & 0x10) != 0) {
			this.aClass359_1 = new Class359(this.aClass86_Sub1_3, this);
		}
	}

	@OriginalMember(owner = "client!aek", name = "p", descriptor = "(III)V", line = 106)
	@Override
	public void method5508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray5.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray5[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray5[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray5[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aek", name = "i", descriptor = "(III)V", line = 106)
	@Override
	public void method5525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray5.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray5[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray5[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray5[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aek", name = "k", descriptor = "(III)V", line = 106)
	@Override
	public void method5521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray5.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray5[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray5[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray5[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aek", name = "u", descriptor = "(III)V", line = 106)
	@Override
	public void method5522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray5.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray5[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray5[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray5[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aek", name = "e", descriptor = "(III)V", line = 106)
	@Override
	public void method5523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray5.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray5[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray5[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray5[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aek", name = "c", descriptor = "(II[I[I[I[I[I[I[I[ILclient!db;Z)V", line = 112)
	@Override
	public void method5509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class202 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class209 local3 = this.aClass86_Sub1_3.aClass209_9;
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[this.anInt607 * -1924295585][this.anInt606 * -1466328823][];
		}
		if (arg3 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[this.anInt607 * -1924295585][this.anInt606 * -1466328823][];
		}
		this.anIntArrayArrayArray7[arg0][arg1] = arg2;
		this.anIntArrayArrayArray9[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8[arg0][arg1] = arg6;
		this.anIntArrayArrayArray12[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		}
		@Pc(94) Class77_Sub10[] local94 = this.aClass77_Sub10ArrayArrayArray1[arg0][arg1] = new Class77_Sub10[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt571 & 0x20) != 0 && local104 != -1 && local3.method25584(local104).aBoolean641) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3555 * 1446227271) << 48 | (long) (arg10.anInt3553 * -1095140607) << 42 | (long) (arg10.anInt3554 * 2113275141) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class77 local163;
			for (local163 = this.aClass12_5.method173(local158); local163 != null; local163 = this.aClass12_5.method176()) {
				@Pc(168) Class77_Sub10 local168 = (Class77_Sub10) local163;
				if (local168.anInt1472 == local104 && local168.aFloat145 == (float) local108 && local168.aClass202_3.method25541(arg10)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class77_Sub10(this, local104, local108, arg10);
				this.aClass12_5.method184(local94[local96], local158);
			} else {
				local94[local96] = (Class77_Sub10) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray4[arg0][arg1] = (byte) (this.aByteArrayArray4[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt577) {
			this.anInt577 = arg6.length;
		}
		this.anInt576 += arg6.length;
	}

	@OriginalMember(owner = "client!aek", name = "o", descriptor = "(II[I[I[I[I[I[I[I[ILclient!db;Z)V", line = 112)
	@Override
	public void method5536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class202 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class209 local3 = this.aClass86_Sub1_3.aClass209_9;
		if (arg5 != null && this.anIntArrayArrayArray11 == null) {
			this.anIntArrayArrayArray11 = new int[this.anInt607 * -1924295585][this.anInt606 * -1466328823][];
		}
		if (arg3 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[this.anInt607 * -1924295585][this.anInt606 * -1466328823][];
		}
		this.anIntArrayArrayArray7[arg0][arg1] = arg2;
		this.anIntArrayArrayArray9[arg0][arg1] = arg4;
		this.anIntArrayArrayArray8[arg0][arg1] = arg6;
		this.anIntArrayArrayArray12[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray11 != null) {
			this.anIntArrayArrayArray11[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg3;
		}
		@Pc(94) Class77_Sub10[] local94 = this.aClass77_Sub10ArrayArrayArray1[arg0][arg1] = new Class77_Sub10[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt571 & 0x20) != 0 && local104 != -1 && local3.method25584(local104).aBoolean641) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3555 * 1446227271) << 48 | (long) (arg10.anInt3553 * -1095140607) << 42 | (long) (arg10.anInt3554 * 2113275141) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class77 local163;
			for (local163 = this.aClass12_5.method173(local158); local163 != null; local163 = this.aClass12_5.method176()) {
				@Pc(168) Class77_Sub10 local168 = (Class77_Sub10) local163;
				if (local168.anInt1472 == local104 && local168.aFloat145 == (float) local108 && local168.aClass202_3.method25541(arg10)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class77_Sub10(this, local104, local108, arg10);
				this.aClass12_5.method184(local94[local96], local158);
			} else {
				local94[local96] = (Class77_Sub10) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray4[arg0][arg1] = (byte) (this.aByteArrayArray4[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt577) {
			this.anInt577 = arg6.length;
		}
		this.anInt576 += arg6.length;
	}

	@OriginalMember(owner = "client!aek", name = "f", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!db;Z)V", line = 148)
	@Override
	public void method5524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class202 arg13, @OriginalArg(14) boolean arg14) {
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
		this.method5509(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!aek", name = "v", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!db;Z)V", line = 148)
	@Override
	public void method5510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class202 arg13, @OriginalArg(14) boolean arg14) {
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
		this.method5509(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!aek", name = "l", descriptor = "()V", line = 194)
	@Override
	public void method5511() {
		if (this.anInt576 <= 0) {
			this.aClass359_1 = null;
			this.method5103();
			return;
		}
		@Pc(22) byte[][] local22 = new byte[this.anInt607 * -1924295585 + 1][this.anInt606 * -1466328823 + 1];
		@Pc(24) int local24;
		@Pc(32) int local32;
		for (local24 = 1; local24 < this.anInt607 * -1924295585; local24++) {
			for (local32 = 1; local32 < this.anInt606 * -1466328823; local32++) {
				local22[local24][local32] = (byte) ((this.aByteArrayArray5[local24 - 1][local32] >> 2) + (this.aByteArrayArray5[local24 + 1][local32] >> 3) + (this.aByteArrayArray5[local24][local32 - 1] >> 2) + (this.aByteArrayArray5[local24][local32 + 1] >> 3) + (this.aByteArrayArray5[local24][local32] >> 1));
			}
		}
		this.aClass77Array4 = new Class77[this.aClass12_5.method183()];
		this.aClass12_5.method180(this.aClass77Array4);
		for (local24 = 0; local24 < this.aClass77Array4.length; local24++) {
			((Class77_Sub10) this.aClass77Array4[local24]).method13303(this.anInt576);
		}
		this.anInt575 = 20;
		if (this.anIntArrayArrayArray11 != null) {
			this.anInt575 += 4;
		}
		if ((this.anInt571 & 0x7) != 0) {
			this.anInt575 += 12;
		}
		this.aByteBuffer3 = this.aClass86_Sub1_3.method20398(this.anInt576 * 4);
		this.aByteBuffer2 = this.aClass86_Sub1_3.method20398(this.anInt576 * this.anInt575);
		@Pc(177) Class77_Sub10[] local177 = new Class77_Sub10[this.anInt576];
		local32 = Class462.method29538(this.anInt576 / 4);
		if (local32 < 1) {
			local32 = 1;
		}
		@Pc(194) Class12 local194 = new Class12(local32);
		@Pc(198) Class77_Sub10[] local198 = new Class77_Sub10[this.anInt577];
		@Pc(200) int local200;
		@Pc(208) int local208;
		for (local200 = 0; local200 < this.anInt607 * -1924295585; local200++) {
			for (local208 = 0; local208 < this.anInt606 * -1466328823; local208++) {
				this.method5105(local200, local208, local22, local198, local194, local177);
			}
		}
		@Pc(236) Class77_Sub10 local236;
		for (local200 = 0; local200 < this.anInt572; local200++) {
			local236 = local177[local200];
			if (local236 != null) {
				local236.method13304(local200);
			}
		}
		for (local200 = 0; local200 < this.anInt607 * -1924295585; local200++) {
			for (local208 = 0; local208 < this.anInt606 * -1466328823; local208++) {
				@Pc(271) short[] local271 = this.aShortArrayArray2[local208 * this.anInt607 * -1924295585 + local200];
				if (local271 != null) {
					@Pc(275) int local275 = 0;
					@Pc(277) int local277 = 0;
					while (local277 < local271.length) {
						@Pc(288) int local288 = local271[local277++] & 0xFFFF;
						@Pc(295) int local295 = local271[local277++] & 0xFFFF;
						@Pc(302) int local302 = local271[local277++] & 0xFFFF;
						@Pc(306) Class77_Sub10 local306 = local177[local288];
						@Pc(310) Class77_Sub10 local310 = local177[local295];
						@Pc(314) Class77_Sub10 local314 = local177[local302];
						@Pc(316) Class77_Sub10 local316 = null;
						if (local306 != null) {
							local306.method13305(local200, local208, local275);
							local316 = local306;
						}
						if (local310 != null) {
							local310.method13305(local200, local208, local275);
							if (local316 == null || local310.aLong229 * 8258869577519436579L < local316.aLong229 * 8258869577519436579L) {
								local316 = local310;
							}
						}
						if (local314 != null) {
							local314.method13305(local200, local208, local275);
							if (local316 == null || local314.aLong229 * 8258869577519436579L < local316.aLong229 * 8258869577519436579L) {
								local316 = local314;
							}
						}
						if (local316 != null) {
							if (local306 != null) {
								local316.method13304(local288);
							}
							if (local310 != null) {
								local316.method13304(local295);
							}
							if (local314 != null) {
								local316.method13304(local302);
							}
							local316.method13305(local200, local208, local275);
						}
						local275++;
					}
				}
			}
		}
		this.anInt579 = 0;
		for (local200 = 0; local200 < this.aClass77Array4.length; local200++) {
			local236 = (Class77_Sub10) this.aClass77Array4[local200];
			if (local236.anInt1473 > 0) {
				this.aClass77Array4[this.anInt579++] = local236;
			}
		}
		this.aClass77Array3 = new Class77[this.anInt579];
		@Pc(436) long[] local436 = new long[this.anInt579];
		for (local208 = 0; local208 < this.anInt579; local208++) {
			@Pc(448) Class77_Sub10 local448 = (Class77_Sub10) this.aClass77Array4[local208];
			local436[local208] = local448.aLong229 * 8258869577519436579L;
			this.aClass77Array3[local208] = local448;
		}
		Class420.method28692(local436, this.aClass77Array3);
		this.method5101();
	}

	@OriginalMember(owner = "client!aek", name = "b", descriptor = "()V", line = 194)
	@Override
	public void method5526() {
		if (this.anInt576 <= 0) {
			this.aClass359_1 = null;
			this.method5103();
			return;
		}
		@Pc(22) byte[][] local22 = new byte[this.anInt607 * -1924295585 + 1][this.anInt606 * -1466328823 + 1];
		@Pc(24) int local24;
		@Pc(32) int local32;
		for (local24 = 1; local24 < this.anInt607 * -1924295585; local24++) {
			for (local32 = 1; local32 < this.anInt606 * -1466328823; local32++) {
				local22[local24][local32] = (byte) ((this.aByteArrayArray5[local24 - 1][local32] >> 2) + (this.aByteArrayArray5[local24 + 1][local32] >> 3) + (this.aByteArrayArray5[local24][local32 - 1] >> 2) + (this.aByteArrayArray5[local24][local32 + 1] >> 3) + (this.aByteArrayArray5[local24][local32] >> 1));
			}
		}
		this.aClass77Array4 = new Class77[this.aClass12_5.method183()];
		this.aClass12_5.method180(this.aClass77Array4);
		for (local24 = 0; local24 < this.aClass77Array4.length; local24++) {
			((Class77_Sub10) this.aClass77Array4[local24]).method13303(this.anInt576);
		}
		this.anInt575 = 20;
		if (this.anIntArrayArrayArray11 != null) {
			this.anInt575 += 4;
		}
		if ((this.anInt571 & 0x7) != 0) {
			this.anInt575 += 12;
		}
		this.aByteBuffer3 = this.aClass86_Sub1_3.method20398(this.anInt576 * 4);
		this.aByteBuffer2 = this.aClass86_Sub1_3.method20398(this.anInt576 * this.anInt575);
		@Pc(177) Class77_Sub10[] local177 = new Class77_Sub10[this.anInt576];
		local32 = Class462.method29538(this.anInt576 / 4);
		if (local32 < 1) {
			local32 = 1;
		}
		@Pc(194) Class12 local194 = new Class12(local32);
		@Pc(198) Class77_Sub10[] local198 = new Class77_Sub10[this.anInt577];
		@Pc(200) int local200;
		@Pc(208) int local208;
		for (local200 = 0; local200 < this.anInt607 * -1924295585; local200++) {
			for (local208 = 0; local208 < this.anInt606 * -1466328823; local208++) {
				this.method5105(local200, local208, local22, local198, local194, local177);
			}
		}
		@Pc(236) Class77_Sub10 local236;
		for (local200 = 0; local200 < this.anInt572; local200++) {
			local236 = local177[local200];
			if (local236 != null) {
				local236.method13304(local200);
			}
		}
		for (local200 = 0; local200 < this.anInt607 * -1924295585; local200++) {
			for (local208 = 0; local208 < this.anInt606 * -1466328823; local208++) {
				@Pc(271) short[] local271 = this.aShortArrayArray2[local208 * this.anInt607 * -1924295585 + local200];
				if (local271 != null) {
					@Pc(275) int local275 = 0;
					@Pc(277) int local277 = 0;
					while (local277 < local271.length) {
						@Pc(288) int local288 = local271[local277++] & 0xFFFF;
						@Pc(295) int local295 = local271[local277++] & 0xFFFF;
						@Pc(302) int local302 = local271[local277++] & 0xFFFF;
						@Pc(306) Class77_Sub10 local306 = local177[local288];
						@Pc(310) Class77_Sub10 local310 = local177[local295];
						@Pc(314) Class77_Sub10 local314 = local177[local302];
						@Pc(316) Class77_Sub10 local316 = null;
						if (local306 != null) {
							local306.method13305(local200, local208, local275);
							local316 = local306;
						}
						if (local310 != null) {
							local310.method13305(local200, local208, local275);
							if (local316 == null || local310.aLong229 * 8258869577519436579L < local316.aLong229 * 8258869577519436579L) {
								local316 = local310;
							}
						}
						if (local314 != null) {
							local314.method13305(local200, local208, local275);
							if (local316 == null || local314.aLong229 * 8258869577519436579L < local316.aLong229 * 8258869577519436579L) {
								local316 = local314;
							}
						}
						if (local316 != null) {
							if (local306 != null) {
								local316.method13304(local288);
							}
							if (local310 != null) {
								local316.method13304(local295);
							}
							if (local314 != null) {
								local316.method13304(local302);
							}
							local316.method13305(local200, local208, local275);
						}
						local275++;
					}
				}
			}
		}
		this.anInt579 = 0;
		for (local200 = 0; local200 < this.aClass77Array4.length; local200++) {
			local236 = (Class77_Sub10) this.aClass77Array4[local200];
			if (local236.anInt1473 > 0) {
				this.aClass77Array4[this.anInt579++] = local236;
			}
		}
		this.aClass77Array3 = new Class77[this.anInt579];
		@Pc(436) long[] local436 = new long[this.anInt579];
		for (local208 = 0; local208 < this.anInt579; local208++) {
			@Pc(448) Class77_Sub10 local448 = (Class77_Sub10) this.aClass77Array4[local208];
			local436[local208] = local448.aLong229 * 8258869577519436579L;
			this.aClass77Array3[local208] = local448;
		}
		Class420.method28692(local436, this.aClass77Array3);
		this.method5101();
	}

	@OriginalMember(owner = "client!aek", name = "bc", descriptor = "()V", line = 282)
	void method5101() {
		this.anInterface36_5 = this.aClass86_Sub1_3.method20656(false);
		this.anInterface36_5.method28760(this.anInt572 * 4, 4);
		this.anInterface36_5.method28755(0, this.anInt572 * 4, this.aClass86_Sub1_3.method20399(this.aByteBuffer3));
		this.anInterface36_4 = this.aClass86_Sub1_3.method20656(false);
		this.anInterface36_4.method28760(this.anInt572 * this.anInt575, this.anInt575);
		this.anInterface36_4.method28755(0, this.anInt572 * this.anInt575, this.aClass86_Sub1_3.method20399(this.aByteBuffer2));
		this.aByteBuffer3.clear();
		this.aByteBuffer3 = null;
		this.aByteBuffer2.clear();
		this.aByteBuffer2 = null;
		if ((this.anInt571 & 0x7) == 0) {
			if (this.anIntArrayArrayArray11 == null) {
				this.aClass113_7 = this.aClass86_Sub1_3.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_4 }), new Class391(Class366.aClass366_2) });
			} else {
				this.aClass113_7 = this.aClass86_Sub1_3.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_4, Class366.aClass366_3 }), new Class391(Class366.aClass366_2) });
			}
		} else if (this.anIntArrayArrayArray11 == null) {
			this.aClass113_7 = this.aClass86_Sub1_3.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_4, Class366.aClass366_1 }), new Class391(Class366.aClass366_2) });
		} else {
			this.aClass113_7 = this.aClass86_Sub1_3.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_4, Class366.aClass366_3, Class366.aClass366_1 }), new Class391(Class366.aClass366_2) });
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt579; local226++) {
			@Pc(236) Class77_Sub10 local236 = (Class77_Sub10) this.aClass77Array4[local226];
			local236.method13310(this.anInt572);
		}
		if (this.aClass359_1 != null) {
			this.aClass359_1.method27975();
		}
		this.method5103();
	}

	@OriginalMember(owner = "client!aek", name = "bl", descriptor = "()V", line = 282)
	void method5102() {
		this.anInterface36_5 = this.aClass86_Sub1_3.method20656(false);
		this.anInterface36_5.method28760(this.anInt572 * 4, 4);
		this.anInterface36_5.method28755(0, this.anInt572 * 4, this.aClass86_Sub1_3.method20399(this.aByteBuffer3));
		this.anInterface36_4 = this.aClass86_Sub1_3.method20656(false);
		this.anInterface36_4.method28760(this.anInt572 * this.anInt575, this.anInt575);
		this.anInterface36_4.method28755(0, this.anInt572 * this.anInt575, this.aClass86_Sub1_3.method20399(this.aByteBuffer2));
		this.aByteBuffer3.clear();
		this.aByteBuffer3 = null;
		this.aByteBuffer2.clear();
		this.aByteBuffer2 = null;
		if ((this.anInt571 & 0x7) == 0) {
			if (this.anIntArrayArrayArray11 == null) {
				this.aClass113_7 = this.aClass86_Sub1_3.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_4 }), new Class391(Class366.aClass366_2) });
			} else {
				this.aClass113_7 = this.aClass86_Sub1_3.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_4, Class366.aClass366_3 }), new Class391(Class366.aClass366_2) });
			}
		} else if (this.anIntArrayArrayArray11 == null) {
			this.aClass113_7 = this.aClass86_Sub1_3.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_4, Class366.aClass366_1 }), new Class391(Class366.aClass366_2) });
		} else {
			this.aClass113_7 = this.aClass86_Sub1_3.method20657(new Class391[] { new Class391(new Class366[] { Class366.aClass366_12, Class366.aClass366_4, Class366.aClass366_3, Class366.aClass366_1 }), new Class391(Class366.aClass366_2) });
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt579; local226++) {
			@Pc(236) Class77_Sub10 local236 = (Class77_Sub10) this.aClass77Array4[local226];
			local236.method13310(this.anInt572);
		}
		if (this.aClass359_1 != null) {
			this.aClass359_1.method27975();
		}
		this.method5103();
	}

	@OriginalMember(owner = "client!aek", name = "bj", descriptor = "()V", line = 313)
	void method5103() {
		if ((this.anInt570 & 0x2) == 0) {
			this.anIntArrayArrayArray9 = null;
			this.anIntArrayArrayArray7 = null;
			this.anIntArrayArrayArray8 = null;
		}
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass77_Sub10ArrayArrayArray1 = null;
		this.aByteArrayArray5 = null;
		this.aClass12_5 = null;
		this.aClass77Array4 = null;
		this.aFloatArrayArray6 = null;
		this.aFloatArrayArray7 = null;
		this.aFloatArrayArray8 = null;
	}

	@OriginalMember(owner = "client!aek", name = "bb", descriptor = "()V", line = 313)
	void method5104() {
		if ((this.anInt570 & 0x2) == 0) {
			this.anIntArrayArrayArray9 = null;
			this.anIntArrayArrayArray7 = null;
			this.anIntArrayArrayArray8 = null;
		}
		this.anIntArrayArrayArray11 = null;
		this.anIntArrayArrayArray12 = null;
		this.anIntArrayArrayArray10 = null;
		this.aClass77_Sub10ArrayArrayArray1 = null;
		this.aByteArrayArray5 = null;
		this.aClass12_5 = null;
		this.aClass77Array4 = null;
		this.aFloatArrayArray6 = null;
		this.aFloatArrayArray7 = null;
		this.aFloatArrayArray8 = null;
	}

	@OriginalMember(owner = "client!aek", name = "bv", descriptor = "(II[[B[Lclient!aji;Lclient!aak;[Lclient!aji;)V", line = 331)
	void method5105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Class77_Sub10[] arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) Class77_Sub10[] arg5) {
		if (this.anIntArrayArrayArray8[arg0][arg1] == null) {
			return;
		}
		@Pc(14) Class77_Sub10[] local14 = this.aClass77_Sub10ArrayArrayArray1[arg0][arg1];
		@Pc(21) int[] local21 = this.anIntArrayArrayArray7[arg0][arg1];
		@Pc(28) int[] local28 = this.anIntArrayArrayArray9[arg0][arg1];
		@Pc(35) int[] local35 = this.anIntArrayArrayArray12[arg0][arg1];
		@Pc(42) int[] local42 = this.anIntArrayArrayArray8[arg0][arg1];
		@Pc(54) int[] local54 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[arg0][arg1];
		@Pc(66) int[] local66 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[arg0][arg1];
		if (local35 == null) {
			local35 = local42;
		}
		@Pc(77) float local77 = this.aFloatArrayArray8[arg0][arg1];
		@Pc(84) float local84 = this.aFloatArrayArray7[arg0][arg1];
		@Pc(91) float local91 = this.aFloatArrayArray6[arg0][arg1];
		@Pc(100) float local100 = this.aFloatArrayArray8[arg0][arg1 + 1];
		@Pc(109) float local109 = this.aFloatArrayArray7[arg0][arg1 + 1];
		@Pc(118) float local118 = this.aFloatArrayArray6[arg0][arg1 + 1];
		@Pc(129) float local129 = this.aFloatArrayArray8[arg0 + 1][arg1 + 1];
		@Pc(140) float local140 = this.aFloatArrayArray7[arg0 + 1][arg1 + 1];
		@Pc(151) float local151 = this.aFloatArrayArray6[arg0 + 1][arg1 + 1];
		@Pc(160) float local160 = this.aFloatArrayArray8[arg0 + 1][arg1];
		@Pc(169) float local169 = this.aFloatArrayArray7[arg0 + 1][arg1];
		@Pc(178) float local178 = this.aFloatArrayArray6[arg0 + 1][arg1];
		@Pc(186) int local186 = arg2[arg0][arg1] & 0xFF;
		@Pc(196) int local196 = arg2[arg0][arg1 + 1] & 0xFF;
		@Pc(208) int local208 = arg2[arg0 + 1][arg1 + 1] & 0xFF;
		@Pc(218) int local218 = arg2[arg0 + 1][arg1] & 0xFF;
		@Pc(220) int local220 = 0;
		@Pc(232) int local232;
		label185: for (@Pc(222) int local222 = 0; local222 < local42.length; local222++) {
			@Pc(230) Class77_Sub10 local230 = local14[local222];
			for (local232 = 0; local232 < local220; local232++) {
				if (arg3[local232] == local230) {
					continue label185;
				}
			}
			arg3[local220++] = local230;
		}
		@Pc(266) short[] local266 = this.aShortArrayArray2[arg1 * this.anInt607 * -1924295585 + arg0] = new short[local42.length];
		for (@Pc(268) int local268 = 0; local268 < local42.length; local268++) {
			@Pc(283) int local283 = (arg0 << this.anInt609 * -1495101509) + local21[local268];
			@Pc(294) int local294 = (arg1 << this.anInt609 * -1495101509) + local28[local268];
			@Pc(299) int local299 = local283 >> this.anInt568;
			@Pc(304) int local304 = local294 >> this.anInt568;
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
			} else if (local342 == 0 && local346 == this.anInt608 * 127780559) {
				local358 = local100;
				local360 = local109;
				local362 = local118;
				local366 = local348 - local196;
			} else if (local342 == this.anInt608 * 127780559 && local346 == this.anInt608 * 127780559) {
				local358 = local129;
				local360 = local140;
				local362 = local151;
				local366 = local348 - local208;
			} else if (local342 == this.anInt608 * 127780559 && local346 == 0) {
				local358 = local160;
				local360 = local169;
				local362 = local178;
				local366 = local348 - local218;
			} else {
				@Pc(437) float local437 = (float) local342 / (float) (this.anInt608 * 127780559);
				@Pc(446) float local446 = (float) local346 / (float) (this.anInt608 * 127780559);
				@Pc(454) float local454 = local77 + (local160 - local77) * local437;
				local462 = local84 + (local169 - local84) * local437;
				@Pc(470) float local470 = local91 + (local178 - local91) * local437;
				@Pc(478) float local478 = local100 + (local129 - local100) * local437;
				@Pc(486) float local486 = local109 + (local140 - local109) * local437;
				@Pc(494) float local494 = local118 + (local151 - local118) * local437;
				local358 = local454 + (local478 - local454) * local446;
				local360 = local462 + (local486 - local462) * local446;
				local362 = local470 + (local494 - local470) * local446;
				@Pc(531) int local531 = local186 + ((local218 - local186) * local342 >> this.anInt609 * -1495101509);
				@Pc(544) int local544 = local196 + ((local208 - local196) * local342 >> this.anInt609 * -1495101509);
				local366 = local348 - (local531 + ((local544 - local531) * local346 >> this.anInt609 * -1495101509));
			}
			if (local308 != -1) {
				@Pc(570) int local570 = (local308 & 0x7F) * local366 >> 7;
				if (local570 < 2) {
					local570 = 2;
				} else if (local570 > 126) {
					local570 = 126;
				}
				local350 = Class656.anIntArray531[local308 & 0xFF80 | local570];
				if ((this.anInt571 & 0x7) == 0) {
					local352 = this.aClass86_Sub1_3.aFloatArray71[0] * local358 + this.aClass86_Sub1_3.aFloatArray71[1] * local360 + this.aClass86_Sub1_3.aFloatArray71[2] * local362;
					local352 = this.aClass86_Sub1_3.aFloat203 + local352 * (local352 > 0.0F ? this.aClass86_Sub1_3.aFloat204 : this.aClass86_Sub1_3.aFloat208);
				}
			}
			@Pc(638) Class77 local638 = null;
			if ((local283 & this.anInt569 - 1) == 0 && (local294 & this.anInt569 - 1) == 0) {
				local638 = arg4.method173(local338);
			}
			@Pc(688) int local688;
			if (local638 == null) {
				@Pc(669) int local669;
				if (local312 == local308) {
					local688 = local350;
				} else {
					local669 = (local312 & 0x7F) * local366 >> 7;
					if (local669 < 2) {
						local669 = 2;
					} else if (local669 > 126) {
						local669 = 126;
					}
					local688 = Class656.anIntArray531[local312 & 0xFF80 | local669];
					if ((this.anInt571 & 0x7) == 0) {
						@Pc(716) float local716 = this.aClass86_Sub1_3.aFloatArray71[0] * local358 + this.aClass86_Sub1_3.aFloatArray71[1] * local360 + this.aClass86_Sub1_3.aFloatArray71[2] * local362;
						local462 = this.aClass86_Sub1_3.aFloat203 + local352 * (local352 > 0.0F ? this.aClass86_Sub1_3.aFloat204 : this.aClass86_Sub1_3.aFloat208);
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
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) (this.method5493(local283, local294) + local320));
				this.aByteBuffer2.putFloat((float) local294);
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) local294);
				if (this.anIntArrayArrayArray11 != null) {
					this.aByteBuffer2.putFloat(local66 == null ? 0.0F : (float) (local66[local268] - 1));
				}
				if ((this.anInt571 & 0x7) != 0) {
					this.aByteBuffer2.putFloat(local358);
					this.aByteBuffer2.putFloat(local360);
					this.aByteBuffer2.putFloat(local362);
				}
				if (this.aClass86_Sub1_3.anInt2847 == 0) {
					local669 = local688 & 0xFF00FF00;
					local669 |= local688 >> 16 & 0xFF;
					local669 |= (local688 & 0xFF) << 16;
					local688 = local669;
				}
				this.aByteBuffer3.putInt(local688 | 0xFF000000);
				local232 = this.anInt572++;
				local266[local268] = (short) local232;
				if (local308 != -1) {
					arg5[local232] = local14[local268];
				}
				arg4.method184(new Class77_Sub17(local266[local268]), local338);
			} else {
				local266[local268] = ((Class77_Sub17) local638).aShort101;
				local232 = local266[local268] & 0xFFFF;
				if (local308 != -1 && local14[local268].aLong229 * 8258869577519436579L < arg5[local232].aLong229 * 8258869577519436579L) {
					arg5[local232] = local14[local268];
				}
			}
			for (local688 = 0; local688 < local220; local688++) {
				arg3[local688].method13306(local232, local350, local366, local352);
			}
			this.anInt573++;
		}
	}

	@OriginalMember(owner = "client!aek", name = "bw", descriptor = "(II[[B[Lclient!aji;Lclient!aak;[Lclient!aji;)V", line = 331)
	void method5106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Class77_Sub10[] arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) Class77_Sub10[] arg5) {
		if (this.anIntArrayArrayArray8[arg0][arg1] == null) {
			return;
		}
		@Pc(14) Class77_Sub10[] local14 = this.aClass77_Sub10ArrayArrayArray1[arg0][arg1];
		@Pc(21) int[] local21 = this.anIntArrayArrayArray7[arg0][arg1];
		@Pc(28) int[] local28 = this.anIntArrayArrayArray9[arg0][arg1];
		@Pc(35) int[] local35 = this.anIntArrayArrayArray12[arg0][arg1];
		@Pc(42) int[] local42 = this.anIntArrayArrayArray8[arg0][arg1];
		@Pc(54) int[] local54 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[arg0][arg1];
		@Pc(66) int[] local66 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[arg0][arg1];
		if (local35 == null) {
			local35 = local42;
		}
		@Pc(77) float local77 = this.aFloatArrayArray8[arg0][arg1];
		@Pc(84) float local84 = this.aFloatArrayArray7[arg0][arg1];
		@Pc(91) float local91 = this.aFloatArrayArray6[arg0][arg1];
		@Pc(100) float local100 = this.aFloatArrayArray8[arg0][arg1 + 1];
		@Pc(109) float local109 = this.aFloatArrayArray7[arg0][arg1 + 1];
		@Pc(118) float local118 = this.aFloatArrayArray6[arg0][arg1 + 1];
		@Pc(129) float local129 = this.aFloatArrayArray8[arg0 + 1][arg1 + 1];
		@Pc(140) float local140 = this.aFloatArrayArray7[arg0 + 1][arg1 + 1];
		@Pc(151) float local151 = this.aFloatArrayArray6[arg0 + 1][arg1 + 1];
		@Pc(160) float local160 = this.aFloatArrayArray8[arg0 + 1][arg1];
		@Pc(169) float local169 = this.aFloatArrayArray7[arg0 + 1][arg1];
		@Pc(178) float local178 = this.aFloatArrayArray6[arg0 + 1][arg1];
		@Pc(186) int local186 = arg2[arg0][arg1] & 0xFF;
		@Pc(196) int local196 = arg2[arg0][arg1 + 1] & 0xFF;
		@Pc(208) int local208 = arg2[arg0 + 1][arg1 + 1] & 0xFF;
		@Pc(218) int local218 = arg2[arg0 + 1][arg1] & 0xFF;
		@Pc(220) int local220 = 0;
		@Pc(232) int local232;
		label185: for (@Pc(222) int local222 = 0; local222 < local42.length; local222++) {
			@Pc(230) Class77_Sub10 local230 = local14[local222];
			for (local232 = 0; local232 < local220; local232++) {
				if (arg3[local232] == local230) {
					continue label185;
				}
			}
			arg3[local220++] = local230;
		}
		@Pc(266) short[] local266 = this.aShortArrayArray2[arg1 * this.anInt607 * -1924295585 + arg0] = new short[local42.length];
		for (@Pc(268) int local268 = 0; local268 < local42.length; local268++) {
			@Pc(283) int local283 = (arg0 << this.anInt609 * -1495101509) + local21[local268];
			@Pc(294) int local294 = (arg1 << this.anInt609 * -1495101509) + local28[local268];
			@Pc(299) int local299 = local283 >> this.anInt568;
			@Pc(304) int local304 = local294 >> this.anInt568;
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
			} else if (local342 == 0 && local346 == this.anInt608 * 127780559) {
				local358 = local100;
				local360 = local109;
				local362 = local118;
				local366 = local348 - local196;
			} else if (local342 == this.anInt608 * 127780559 && local346 == this.anInt608 * 127780559) {
				local358 = local129;
				local360 = local140;
				local362 = local151;
				local366 = local348 - local208;
			} else if (local342 == this.anInt608 * 127780559 && local346 == 0) {
				local358 = local160;
				local360 = local169;
				local362 = local178;
				local366 = local348 - local218;
			} else {
				@Pc(437) float local437 = (float) local342 / (float) (this.anInt608 * 127780559);
				@Pc(446) float local446 = (float) local346 / (float) (this.anInt608 * 127780559);
				@Pc(454) float local454 = local77 + (local160 - local77) * local437;
				local462 = local84 + (local169 - local84) * local437;
				@Pc(470) float local470 = local91 + (local178 - local91) * local437;
				@Pc(478) float local478 = local100 + (local129 - local100) * local437;
				@Pc(486) float local486 = local109 + (local140 - local109) * local437;
				@Pc(494) float local494 = local118 + (local151 - local118) * local437;
				local358 = local454 + (local478 - local454) * local446;
				local360 = local462 + (local486 - local462) * local446;
				local362 = local470 + (local494 - local470) * local446;
				@Pc(531) int local531 = local186 + ((local218 - local186) * local342 >> this.anInt609 * -1495101509);
				@Pc(544) int local544 = local196 + ((local208 - local196) * local342 >> this.anInt609 * -1495101509);
				local366 = local348 - (local531 + ((local544 - local531) * local346 >> this.anInt609 * -1495101509));
			}
			if (local308 != -1) {
				@Pc(570) int local570 = (local308 & 0x7F) * local366 >> 7;
				if (local570 < 2) {
					local570 = 2;
				} else if (local570 > 126) {
					local570 = 126;
				}
				local350 = Class656.anIntArray531[local308 & 0xFF80 | local570];
				if ((this.anInt571 & 0x7) == 0) {
					local352 = this.aClass86_Sub1_3.aFloatArray71[0] * local358 + this.aClass86_Sub1_3.aFloatArray71[1] * local360 + this.aClass86_Sub1_3.aFloatArray71[2] * local362;
					local352 = this.aClass86_Sub1_3.aFloat203 + local352 * (local352 > 0.0F ? this.aClass86_Sub1_3.aFloat204 : this.aClass86_Sub1_3.aFloat208);
				}
			}
			@Pc(638) Class77 local638 = null;
			if ((local283 & this.anInt569 - 1) == 0 && (local294 & this.anInt569 - 1) == 0) {
				local638 = arg4.method173(local338);
			}
			@Pc(688) int local688;
			if (local638 == null) {
				@Pc(669) int local669;
				if (local312 == local308) {
					local688 = local350;
				} else {
					local669 = (local312 & 0x7F) * local366 >> 7;
					if (local669 < 2) {
						local669 = 2;
					} else if (local669 > 126) {
						local669 = 126;
					}
					local688 = Class656.anIntArray531[local312 & 0xFF80 | local669];
					if ((this.anInt571 & 0x7) == 0) {
						@Pc(716) float local716 = this.aClass86_Sub1_3.aFloatArray71[0] * local358 + this.aClass86_Sub1_3.aFloatArray71[1] * local360 + this.aClass86_Sub1_3.aFloatArray71[2] * local362;
						local462 = this.aClass86_Sub1_3.aFloat203 + local352 * (local352 > 0.0F ? this.aClass86_Sub1_3.aFloat204 : this.aClass86_Sub1_3.aFloat208);
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
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) (this.method5493(local283, local294) + local320));
				this.aByteBuffer2.putFloat((float) local294);
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) local294);
				if (this.anIntArrayArrayArray11 != null) {
					this.aByteBuffer2.putFloat(local66 == null ? 0.0F : (float) (local66[local268] - 1));
				}
				if ((this.anInt571 & 0x7) != 0) {
					this.aByteBuffer2.putFloat(local358);
					this.aByteBuffer2.putFloat(local360);
					this.aByteBuffer2.putFloat(local362);
				}
				if (this.aClass86_Sub1_3.anInt2847 == 0) {
					local669 = local688 & 0xFF00FF00;
					local669 |= local688 >> 16 & 0xFF;
					local669 |= (local688 & 0xFF) << 16;
					local688 = local669;
				}
				this.aByteBuffer3.putInt(local688 | 0xFF000000);
				local232 = this.anInt572++;
				local266[local268] = (short) local232;
				if (local308 != -1) {
					arg5[local232] = local14[local268];
				}
				arg4.method184(new Class77_Sub17(local266[local268]), local338);
			} else {
				local266[local268] = ((Class77_Sub17) local638).aShort101;
				local232 = local266[local268] & 0xFFFF;
				if (local308 != -1 && local14[local268].aLong229 * 8258869577519436579L < arg5[local232].aLong229 * 8258869577519436579L) {
					arg5[local232] = local14[local268];
				}
			}
			for (local688 = 0; local688 < local220; local688++) {
				arg3[local688].method13306(local232, local350, local366, local352);
			}
			this.anInt573++;
		}
	}

	@OriginalMember(owner = "client!aek", name = "bd", descriptor = "(II[[B[Lclient!aji;Lclient!aak;[Lclient!aji;)V", line = 331)
	void method5107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Class77_Sub10[] arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) Class77_Sub10[] arg5) {
		if (this.anIntArrayArrayArray8[arg0][arg1] == null) {
			return;
		}
		@Pc(14) Class77_Sub10[] local14 = this.aClass77_Sub10ArrayArrayArray1[arg0][arg1];
		@Pc(21) int[] local21 = this.anIntArrayArrayArray7[arg0][arg1];
		@Pc(28) int[] local28 = this.anIntArrayArrayArray9[arg0][arg1];
		@Pc(35) int[] local35 = this.anIntArrayArrayArray12[arg0][arg1];
		@Pc(42) int[] local42 = this.anIntArrayArrayArray8[arg0][arg1];
		@Pc(54) int[] local54 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[arg0][arg1];
		@Pc(66) int[] local66 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[arg0][arg1];
		if (local35 == null) {
			local35 = local42;
		}
		@Pc(77) float local77 = this.aFloatArrayArray8[arg0][arg1];
		@Pc(84) float local84 = this.aFloatArrayArray7[arg0][arg1];
		@Pc(91) float local91 = this.aFloatArrayArray6[arg0][arg1];
		@Pc(100) float local100 = this.aFloatArrayArray8[arg0][arg1 + 1];
		@Pc(109) float local109 = this.aFloatArrayArray7[arg0][arg1 + 1];
		@Pc(118) float local118 = this.aFloatArrayArray6[arg0][arg1 + 1];
		@Pc(129) float local129 = this.aFloatArrayArray8[arg0 + 1][arg1 + 1];
		@Pc(140) float local140 = this.aFloatArrayArray7[arg0 + 1][arg1 + 1];
		@Pc(151) float local151 = this.aFloatArrayArray6[arg0 + 1][arg1 + 1];
		@Pc(160) float local160 = this.aFloatArrayArray8[arg0 + 1][arg1];
		@Pc(169) float local169 = this.aFloatArrayArray7[arg0 + 1][arg1];
		@Pc(178) float local178 = this.aFloatArrayArray6[arg0 + 1][arg1];
		@Pc(186) int local186 = arg2[arg0][arg1] & 0xFF;
		@Pc(196) int local196 = arg2[arg0][arg1 + 1] & 0xFF;
		@Pc(208) int local208 = arg2[arg0 + 1][arg1 + 1] & 0xFF;
		@Pc(218) int local218 = arg2[arg0 + 1][arg1] & 0xFF;
		@Pc(220) int local220 = 0;
		@Pc(232) int local232;
		label185: for (@Pc(222) int local222 = 0; local222 < local42.length; local222++) {
			@Pc(230) Class77_Sub10 local230 = local14[local222];
			for (local232 = 0; local232 < local220; local232++) {
				if (arg3[local232] == local230) {
					continue label185;
				}
			}
			arg3[local220++] = local230;
		}
		@Pc(266) short[] local266 = this.aShortArrayArray2[arg1 * this.anInt607 * -1924295585 + arg0] = new short[local42.length];
		for (@Pc(268) int local268 = 0; local268 < local42.length; local268++) {
			@Pc(283) int local283 = (arg0 << this.anInt609 * -1495101509) + local21[local268];
			@Pc(294) int local294 = (arg1 << this.anInt609 * -1495101509) + local28[local268];
			@Pc(299) int local299 = local283 >> this.anInt568;
			@Pc(304) int local304 = local294 >> this.anInt568;
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
			} else if (local342 == 0 && local346 == this.anInt608 * 127780559) {
				local358 = local100;
				local360 = local109;
				local362 = local118;
				local366 = local348 - local196;
			} else if (local342 == this.anInt608 * 127780559 && local346 == this.anInt608 * 127780559) {
				local358 = local129;
				local360 = local140;
				local362 = local151;
				local366 = local348 - local208;
			} else if (local342 == this.anInt608 * 127780559 && local346 == 0) {
				local358 = local160;
				local360 = local169;
				local362 = local178;
				local366 = local348 - local218;
			} else {
				@Pc(437) float local437 = (float) local342 / (float) (this.anInt608 * 127780559);
				@Pc(446) float local446 = (float) local346 / (float) (this.anInt608 * 127780559);
				@Pc(454) float local454 = local77 + (local160 - local77) * local437;
				local462 = local84 + (local169 - local84) * local437;
				@Pc(470) float local470 = local91 + (local178 - local91) * local437;
				@Pc(478) float local478 = local100 + (local129 - local100) * local437;
				@Pc(486) float local486 = local109 + (local140 - local109) * local437;
				@Pc(494) float local494 = local118 + (local151 - local118) * local437;
				local358 = local454 + (local478 - local454) * local446;
				local360 = local462 + (local486 - local462) * local446;
				local362 = local470 + (local494 - local470) * local446;
				@Pc(531) int local531 = local186 + ((local218 - local186) * local342 >> this.anInt609 * -1495101509);
				@Pc(544) int local544 = local196 + ((local208 - local196) * local342 >> this.anInt609 * -1495101509);
				local366 = local348 - (local531 + ((local544 - local531) * local346 >> this.anInt609 * -1495101509));
			}
			if (local308 != -1) {
				@Pc(570) int local570 = (local308 & 0x7F) * local366 >> 7;
				if (local570 < 2) {
					local570 = 2;
				} else if (local570 > 126) {
					local570 = 126;
				}
				local350 = Class656.anIntArray531[local308 & 0xFF80 | local570];
				if ((this.anInt571 & 0x7) == 0) {
					local352 = this.aClass86_Sub1_3.aFloatArray71[0] * local358 + this.aClass86_Sub1_3.aFloatArray71[1] * local360 + this.aClass86_Sub1_3.aFloatArray71[2] * local362;
					local352 = this.aClass86_Sub1_3.aFloat203 + local352 * (local352 > 0.0F ? this.aClass86_Sub1_3.aFloat204 : this.aClass86_Sub1_3.aFloat208);
				}
			}
			@Pc(638) Class77 local638 = null;
			if ((local283 & this.anInt569 - 1) == 0 && (local294 & this.anInt569 - 1) == 0) {
				local638 = arg4.method173(local338);
			}
			@Pc(688) int local688;
			if (local638 == null) {
				@Pc(669) int local669;
				if (local312 == local308) {
					local688 = local350;
				} else {
					local669 = (local312 & 0x7F) * local366 >> 7;
					if (local669 < 2) {
						local669 = 2;
					} else if (local669 > 126) {
						local669 = 126;
					}
					local688 = Class656.anIntArray531[local312 & 0xFF80 | local669];
					if ((this.anInt571 & 0x7) == 0) {
						@Pc(716) float local716 = this.aClass86_Sub1_3.aFloatArray71[0] * local358 + this.aClass86_Sub1_3.aFloatArray71[1] * local360 + this.aClass86_Sub1_3.aFloatArray71[2] * local362;
						local462 = this.aClass86_Sub1_3.aFloat203 + local352 * (local352 > 0.0F ? this.aClass86_Sub1_3.aFloat204 : this.aClass86_Sub1_3.aFloat208);
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
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) (this.method5493(local283, local294) + local320));
				this.aByteBuffer2.putFloat((float) local294);
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) local294);
				if (this.anIntArrayArrayArray11 != null) {
					this.aByteBuffer2.putFloat(local66 == null ? 0.0F : (float) (local66[local268] - 1));
				}
				if ((this.anInt571 & 0x7) != 0) {
					this.aByteBuffer2.putFloat(local358);
					this.aByteBuffer2.putFloat(local360);
					this.aByteBuffer2.putFloat(local362);
				}
				if (this.aClass86_Sub1_3.anInt2847 == 0) {
					local669 = local688 & 0xFF00FF00;
					local669 |= local688 >> 16 & 0xFF;
					local669 |= (local688 & 0xFF) << 16;
					local688 = local669;
				}
				this.aByteBuffer3.putInt(local688 | 0xFF000000);
				local232 = this.anInt572++;
				local266[local268] = (short) local232;
				if (local308 != -1) {
					arg5[local232] = local14[local268];
				}
				arg4.method184(new Class77_Sub17(local266[local268]), local338);
			} else {
				local266[local268] = ((Class77_Sub17) local638).aShort101;
				local232 = local266[local268] & 0xFFFF;
				if (local308 != -1 && local14[local268].aLong229 * 8258869577519436579L < arg5[local232].aLong229 * 8258869577519436579L) {
					arg5[local232] = local14[local268];
				}
			}
			for (local688 = 0; local688 < local220; local688++) {
				arg3[local688].method13306(local232, local350, local366, local352);
			}
			this.anInt573++;
		}
	}

	@OriginalMember(owner = "client!aek", name = "by", descriptor = "(II[[B[Lclient!aji;Lclient!aak;[Lclient!aji;)V", line = 331)
	void method5108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Class77_Sub10[] arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) Class77_Sub10[] arg5) {
		if (this.anIntArrayArrayArray8[arg0][arg1] == null) {
			return;
		}
		@Pc(14) Class77_Sub10[] local14 = this.aClass77_Sub10ArrayArrayArray1[arg0][arg1];
		@Pc(21) int[] local21 = this.anIntArrayArrayArray7[arg0][arg1];
		@Pc(28) int[] local28 = this.anIntArrayArrayArray9[arg0][arg1];
		@Pc(35) int[] local35 = this.anIntArrayArrayArray12[arg0][arg1];
		@Pc(42) int[] local42 = this.anIntArrayArrayArray8[arg0][arg1];
		@Pc(54) int[] local54 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[arg0][arg1];
		@Pc(66) int[] local66 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[arg0][arg1];
		if (local35 == null) {
			local35 = local42;
		}
		@Pc(77) float local77 = this.aFloatArrayArray8[arg0][arg1];
		@Pc(84) float local84 = this.aFloatArrayArray7[arg0][arg1];
		@Pc(91) float local91 = this.aFloatArrayArray6[arg0][arg1];
		@Pc(100) float local100 = this.aFloatArrayArray8[arg0][arg1 + 1];
		@Pc(109) float local109 = this.aFloatArrayArray7[arg0][arg1 + 1];
		@Pc(118) float local118 = this.aFloatArrayArray6[arg0][arg1 + 1];
		@Pc(129) float local129 = this.aFloatArrayArray8[arg0 + 1][arg1 + 1];
		@Pc(140) float local140 = this.aFloatArrayArray7[arg0 + 1][arg1 + 1];
		@Pc(151) float local151 = this.aFloatArrayArray6[arg0 + 1][arg1 + 1];
		@Pc(160) float local160 = this.aFloatArrayArray8[arg0 + 1][arg1];
		@Pc(169) float local169 = this.aFloatArrayArray7[arg0 + 1][arg1];
		@Pc(178) float local178 = this.aFloatArrayArray6[arg0 + 1][arg1];
		@Pc(186) int local186 = arg2[arg0][arg1] & 0xFF;
		@Pc(196) int local196 = arg2[arg0][arg1 + 1] & 0xFF;
		@Pc(208) int local208 = arg2[arg0 + 1][arg1 + 1] & 0xFF;
		@Pc(218) int local218 = arg2[arg0 + 1][arg1] & 0xFF;
		@Pc(220) int local220 = 0;
		@Pc(232) int local232;
		label185: for (@Pc(222) int local222 = 0; local222 < local42.length; local222++) {
			@Pc(230) Class77_Sub10 local230 = local14[local222];
			for (local232 = 0; local232 < local220; local232++) {
				if (arg3[local232] == local230) {
					continue label185;
				}
			}
			arg3[local220++] = local230;
		}
		@Pc(266) short[] local266 = this.aShortArrayArray2[arg1 * this.anInt607 * -1924295585 + arg0] = new short[local42.length];
		for (@Pc(268) int local268 = 0; local268 < local42.length; local268++) {
			@Pc(283) int local283 = (arg0 << this.anInt609 * -1495101509) + local21[local268];
			@Pc(294) int local294 = (arg1 << this.anInt609 * -1495101509) + local28[local268];
			@Pc(299) int local299 = local283 >> this.anInt568;
			@Pc(304) int local304 = local294 >> this.anInt568;
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
			} else if (local342 == 0 && local346 == this.anInt608 * 127780559) {
				local358 = local100;
				local360 = local109;
				local362 = local118;
				local366 = local348 - local196;
			} else if (local342 == this.anInt608 * 127780559 && local346 == this.anInt608 * 127780559) {
				local358 = local129;
				local360 = local140;
				local362 = local151;
				local366 = local348 - local208;
			} else if (local342 == this.anInt608 * 127780559 && local346 == 0) {
				local358 = local160;
				local360 = local169;
				local362 = local178;
				local366 = local348 - local218;
			} else {
				@Pc(437) float local437 = (float) local342 / (float) (this.anInt608 * 127780559);
				@Pc(446) float local446 = (float) local346 / (float) (this.anInt608 * 127780559);
				@Pc(454) float local454 = local77 + (local160 - local77) * local437;
				local462 = local84 + (local169 - local84) * local437;
				@Pc(470) float local470 = local91 + (local178 - local91) * local437;
				@Pc(478) float local478 = local100 + (local129 - local100) * local437;
				@Pc(486) float local486 = local109 + (local140 - local109) * local437;
				@Pc(494) float local494 = local118 + (local151 - local118) * local437;
				local358 = local454 + (local478 - local454) * local446;
				local360 = local462 + (local486 - local462) * local446;
				local362 = local470 + (local494 - local470) * local446;
				@Pc(531) int local531 = local186 + ((local218 - local186) * local342 >> this.anInt609 * -1495101509);
				@Pc(544) int local544 = local196 + ((local208 - local196) * local342 >> this.anInt609 * -1495101509);
				local366 = local348 - (local531 + ((local544 - local531) * local346 >> this.anInt609 * -1495101509));
			}
			if (local308 != -1) {
				@Pc(570) int local570 = (local308 & 0x7F) * local366 >> 7;
				if (local570 < 2) {
					local570 = 2;
				} else if (local570 > 126) {
					local570 = 126;
				}
				local350 = Class656.anIntArray531[local308 & 0xFF80 | local570];
				if ((this.anInt571 & 0x7) == 0) {
					local352 = this.aClass86_Sub1_3.aFloatArray71[0] * local358 + this.aClass86_Sub1_3.aFloatArray71[1] * local360 + this.aClass86_Sub1_3.aFloatArray71[2] * local362;
					local352 = this.aClass86_Sub1_3.aFloat203 + local352 * (local352 > 0.0F ? this.aClass86_Sub1_3.aFloat204 : this.aClass86_Sub1_3.aFloat208);
				}
			}
			@Pc(638) Class77 local638 = null;
			if ((local283 & this.anInt569 - 1) == 0 && (local294 & this.anInt569 - 1) == 0) {
				local638 = arg4.method173(local338);
			}
			@Pc(688) int local688;
			if (local638 == null) {
				@Pc(669) int local669;
				if (local312 == local308) {
					local688 = local350;
				} else {
					local669 = (local312 & 0x7F) * local366 >> 7;
					if (local669 < 2) {
						local669 = 2;
					} else if (local669 > 126) {
						local669 = 126;
					}
					local688 = Class656.anIntArray531[local312 & 0xFF80 | local669];
					if ((this.anInt571 & 0x7) == 0) {
						@Pc(716) float local716 = this.aClass86_Sub1_3.aFloatArray71[0] * local358 + this.aClass86_Sub1_3.aFloatArray71[1] * local360 + this.aClass86_Sub1_3.aFloatArray71[2] * local362;
						local462 = this.aClass86_Sub1_3.aFloat203 + local352 * (local352 > 0.0F ? this.aClass86_Sub1_3.aFloat204 : this.aClass86_Sub1_3.aFloat208);
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
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) (this.method5493(local283, local294) + local320));
				this.aByteBuffer2.putFloat((float) local294);
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) local294);
				if (this.anIntArrayArrayArray11 != null) {
					this.aByteBuffer2.putFloat(local66 == null ? 0.0F : (float) (local66[local268] - 1));
				}
				if ((this.anInt571 & 0x7) != 0) {
					this.aByteBuffer2.putFloat(local358);
					this.aByteBuffer2.putFloat(local360);
					this.aByteBuffer2.putFloat(local362);
				}
				if (this.aClass86_Sub1_3.anInt2847 == 0) {
					local669 = local688 & 0xFF00FF00;
					local669 |= local688 >> 16 & 0xFF;
					local669 |= (local688 & 0xFF) << 16;
					local688 = local669;
				}
				this.aByteBuffer3.putInt(local688 | 0xFF000000);
				local232 = this.anInt572++;
				local266[local268] = (short) local232;
				if (local308 != -1) {
					arg5[local232] = local14[local268];
				}
				arg4.method184(new Class77_Sub17(local266[local268]), local338);
			} else {
				local266[local268] = ((Class77_Sub17) local638).aShort101;
				local232 = local266[local268] & 0xFFFF;
				if (local308 != -1 && local14[local268].aLong229 * 8258869577519436579L < arg5[local232].aLong229 * 8258869577519436579L) {
					arg5[local232] = local14[local268];
				}
			}
			for (local688 = 0; local688 < local220; local688++) {
				arg3[local688].method13306(local232, local350, local366, local352);
			}
			this.anInt573++;
		}
	}

	@OriginalMember(owner = "client!aek", name = "bx", descriptor = "(II[[B[Lclient!aji;Lclient!aak;[Lclient!aji;)V", line = 331)
	void method5109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Class77_Sub10[] arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) Class77_Sub10[] arg5) {
		if (this.anIntArrayArrayArray8[arg0][arg1] == null) {
			return;
		}
		@Pc(14) Class77_Sub10[] local14 = this.aClass77_Sub10ArrayArrayArray1[arg0][arg1];
		@Pc(21) int[] local21 = this.anIntArrayArrayArray7[arg0][arg1];
		@Pc(28) int[] local28 = this.anIntArrayArrayArray9[arg0][arg1];
		@Pc(35) int[] local35 = this.anIntArrayArrayArray12[arg0][arg1];
		@Pc(42) int[] local42 = this.anIntArrayArrayArray8[arg0][arg1];
		@Pc(54) int[] local54 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[arg0][arg1];
		@Pc(66) int[] local66 = this.anIntArrayArrayArray11 == null ? null : this.anIntArrayArrayArray11[arg0][arg1];
		if (local35 == null) {
			local35 = local42;
		}
		@Pc(77) float local77 = this.aFloatArrayArray8[arg0][arg1];
		@Pc(84) float local84 = this.aFloatArrayArray7[arg0][arg1];
		@Pc(91) float local91 = this.aFloatArrayArray6[arg0][arg1];
		@Pc(100) float local100 = this.aFloatArrayArray8[arg0][arg1 + 1];
		@Pc(109) float local109 = this.aFloatArrayArray7[arg0][arg1 + 1];
		@Pc(118) float local118 = this.aFloatArrayArray6[arg0][arg1 + 1];
		@Pc(129) float local129 = this.aFloatArrayArray8[arg0 + 1][arg1 + 1];
		@Pc(140) float local140 = this.aFloatArrayArray7[arg0 + 1][arg1 + 1];
		@Pc(151) float local151 = this.aFloatArrayArray6[arg0 + 1][arg1 + 1];
		@Pc(160) float local160 = this.aFloatArrayArray8[arg0 + 1][arg1];
		@Pc(169) float local169 = this.aFloatArrayArray7[arg0 + 1][arg1];
		@Pc(178) float local178 = this.aFloatArrayArray6[arg0 + 1][arg1];
		@Pc(186) int local186 = arg2[arg0][arg1] & 0xFF;
		@Pc(196) int local196 = arg2[arg0][arg1 + 1] & 0xFF;
		@Pc(208) int local208 = arg2[arg0 + 1][arg1 + 1] & 0xFF;
		@Pc(218) int local218 = arg2[arg0 + 1][arg1] & 0xFF;
		@Pc(220) int local220 = 0;
		@Pc(232) int local232;
		label185: for (@Pc(222) int local222 = 0; local222 < local42.length; local222++) {
			@Pc(230) Class77_Sub10 local230 = local14[local222];
			for (local232 = 0; local232 < local220; local232++) {
				if (arg3[local232] == local230) {
					continue label185;
				}
			}
			arg3[local220++] = local230;
		}
		@Pc(266) short[] local266 = this.aShortArrayArray2[arg1 * this.anInt607 * -1924295585 + arg0] = new short[local42.length];
		for (@Pc(268) int local268 = 0; local268 < local42.length; local268++) {
			@Pc(283) int local283 = (arg0 << this.anInt609 * -1495101509) + local21[local268];
			@Pc(294) int local294 = (arg1 << this.anInt609 * -1495101509) + local28[local268];
			@Pc(299) int local299 = local283 >> this.anInt568;
			@Pc(304) int local304 = local294 >> this.anInt568;
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
			} else if (local342 == 0 && local346 == this.anInt608 * 127780559) {
				local358 = local100;
				local360 = local109;
				local362 = local118;
				local366 = local348 - local196;
			} else if (local342 == this.anInt608 * 127780559 && local346 == this.anInt608 * 127780559) {
				local358 = local129;
				local360 = local140;
				local362 = local151;
				local366 = local348 - local208;
			} else if (local342 == this.anInt608 * 127780559 && local346 == 0) {
				local358 = local160;
				local360 = local169;
				local362 = local178;
				local366 = local348 - local218;
			} else {
				@Pc(437) float local437 = (float) local342 / (float) (this.anInt608 * 127780559);
				@Pc(446) float local446 = (float) local346 / (float) (this.anInt608 * 127780559);
				@Pc(454) float local454 = local77 + (local160 - local77) * local437;
				local462 = local84 + (local169 - local84) * local437;
				@Pc(470) float local470 = local91 + (local178 - local91) * local437;
				@Pc(478) float local478 = local100 + (local129 - local100) * local437;
				@Pc(486) float local486 = local109 + (local140 - local109) * local437;
				@Pc(494) float local494 = local118 + (local151 - local118) * local437;
				local358 = local454 + (local478 - local454) * local446;
				local360 = local462 + (local486 - local462) * local446;
				local362 = local470 + (local494 - local470) * local446;
				@Pc(531) int local531 = local186 + ((local218 - local186) * local342 >> this.anInt609 * -1495101509);
				@Pc(544) int local544 = local196 + ((local208 - local196) * local342 >> this.anInt609 * -1495101509);
				local366 = local348 - (local531 + ((local544 - local531) * local346 >> this.anInt609 * -1495101509));
			}
			if (local308 != -1) {
				@Pc(570) int local570 = (local308 & 0x7F) * local366 >> 7;
				if (local570 < 2) {
					local570 = 2;
				} else if (local570 > 126) {
					local570 = 126;
				}
				local350 = Class656.anIntArray531[local308 & 0xFF80 | local570];
				if ((this.anInt571 & 0x7) == 0) {
					local352 = this.aClass86_Sub1_3.aFloatArray71[0] * local358 + this.aClass86_Sub1_3.aFloatArray71[1] * local360 + this.aClass86_Sub1_3.aFloatArray71[2] * local362;
					local352 = this.aClass86_Sub1_3.aFloat203 + local352 * (local352 > 0.0F ? this.aClass86_Sub1_3.aFloat204 : this.aClass86_Sub1_3.aFloat208);
				}
			}
			@Pc(638) Class77 local638 = null;
			if ((local283 & this.anInt569 - 1) == 0 && (local294 & this.anInt569 - 1) == 0) {
				local638 = arg4.method173(local338);
			}
			@Pc(688) int local688;
			if (local638 == null) {
				@Pc(669) int local669;
				if (local312 == local308) {
					local688 = local350;
				} else {
					local669 = (local312 & 0x7F) * local366 >> 7;
					if (local669 < 2) {
						local669 = 2;
					} else if (local669 > 126) {
						local669 = 126;
					}
					local688 = Class656.anIntArray531[local312 & 0xFF80 | local669];
					if ((this.anInt571 & 0x7) == 0) {
						@Pc(716) float local716 = this.aClass86_Sub1_3.aFloatArray71[0] * local358 + this.aClass86_Sub1_3.aFloatArray71[1] * local360 + this.aClass86_Sub1_3.aFloatArray71[2] * local362;
						local462 = this.aClass86_Sub1_3.aFloat203 + local352 * (local352 > 0.0F ? this.aClass86_Sub1_3.aFloat204 : this.aClass86_Sub1_3.aFloat208);
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
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) (this.method5493(local283, local294) + local320));
				this.aByteBuffer2.putFloat((float) local294);
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) local294);
				if (this.anIntArrayArrayArray11 != null) {
					this.aByteBuffer2.putFloat(local66 == null ? 0.0F : (float) (local66[local268] - 1));
				}
				if ((this.anInt571 & 0x7) != 0) {
					this.aByteBuffer2.putFloat(local358);
					this.aByteBuffer2.putFloat(local360);
					this.aByteBuffer2.putFloat(local362);
				}
				if (this.aClass86_Sub1_3.anInt2847 == 0) {
					local669 = local688 & 0xFF00FF00;
					local669 |= local688 >> 16 & 0xFF;
					local669 |= (local688 & 0xFF) << 16;
					local688 = local669;
				}
				this.aByteBuffer3.putInt(local688 | 0xFF000000);
				local232 = this.anInt572++;
				local266[local268] = (short) local232;
				if (local308 != -1) {
					arg5[local232] = local14[local268];
				}
				arg4.method184(new Class77_Sub17(local266[local268]), local338);
			} else {
				local266[local268] = ((Class77_Sub17) local638).aShort101;
				local232 = local266[local268] & 0xFFFF;
				if (local308 != -1 && local14[local268].aLong229 * 8258869577519436579L < arg5[local232].aLong229 * 8258869577519436579L) {
					arg5[local232] = local14[local268];
				}
			}
			for (local688 = 0; local688 < local220; local688++) {
				arg3[local688].method13306(local232, local350, local366, local352);
			}
			this.anInt573++;
		}
	}

	@OriginalMember(owner = "client!aek", name = "h", descriptor = "(III[[ZZI)V", line = 499)
	@Override
	public void method5530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass77Array3 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray41.length < local12) {
			this.anIntArray41 = new int[local12];
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
		if (local45 > this.anInt607 * -1924295585 - 1) {
			local45 = this.anInt607 * -1924295585 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt606 * -1466328823 - 1) {
			local64 = this.anInt606 * -1466328823 - 1;
		}
		this.anInt580 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray41[this.anInt580++] = local95 * this.anInt607 * -1924295585 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass86_Sub1_3.aByteBuffer7;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass77Array3.length; local135++) {
			@Pc(146) Class77_Sub10 local146 = (Class77_Sub10) this.aClass77Array3[local135];
			local146.method13313(this.anIntArray41, this.anInt580);
		}
		local135 = local130.position();
		@Pc(161) Class109 local161 = this.aClass86_Sub1_3.aClass109_3;
		this.aClass86_Sub1_3.method20600();
		if (this.aClass86_Sub1_3.anInt2841 > 0) {
			local161.aClass447_33.method29133((float) (this.aClass86_Sub1_3.anInt2840 >> 16 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_3.anInt2840 >> 8 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_3.anInt2840 >> 0 & 0xFF) / 255.0F);
			local161.aClass450_11.method29234(0.0F, 0.0F, 1.0F, -this.aClass86_Sub1_3.aFloat205);
			local161.aClass450_11.method29255(this.aClass86_Sub1_3.aClass442_80);
			local161.aClass450_11.method29253(1.0F / (this.aClass86_Sub1_3.aFloat206 - this.aClass86_Sub1_3.aFloat205));
		} else {
			local161.aClass450_11.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local161.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
		}
		if (local135 != 0) {
			@Pc(252) Interface38 local252 = this.aClass86_Sub1_3.method20454(local135 / 2);
			local252.method28755(0, local135, this.aClass86_Sub1_3.aLong121);
			this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
			this.aClass86_Sub1_3.method20659(local252);
			local161.method9101(Class442.aClass442_97);
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class77_Sub10 local293;
			@Pc(411) Class215 local411;
			if ((this.anInt571 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass77Array3.length; local282++) {
					local293 = (Class77_Sub10) this.aClass77Array3[local282];
					if (local293.anInt1474 != 0) {
						if (this.aClass86_Sub1_3.aBoolean447) {
							this.aClass86_Sub1_3.method20146(0, local293.aClass202_3);
							local161.aClass450_10.method29234(0.0F, 1.0F, 0.0F, (float) this.aClass86_Sub1_3.anInt2839 + (float) (local293.aClass202_3.anInt3555 * 1446227271) / 255.0F * (float) (local293.aClass202_3.anInt3553 * -1095140607));
							local161.aClass450_10.method29253(1.0F / (float) (local293.aClass202_3.anInt3553 * -1095140607));
							local161.aClass447_31.method29133((float) (local293.aClass202_3.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1472 == -1) {
							local161.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
						} else {
							local411 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
							local161.anInterface37_18 = this.aClass86_Sub1_3.aClass370_3.method28225(local411);
							local399 = !Class683.method36096(local411.aByte118);
						}
						this.aClass86_Sub1_3.method20670(1, local293.anInterface36_10);
						this.aClass86_Sub1_3.method20658(this.aClass113_7);
						local161.aClass442_48.method28979(1.0F / local293.aFloat145, 1.0F / local293.aFloat145, 1.0F, 1.0F);
						local161.anInt1089 = local293.anInt1475;
						local161.anInt1087 = local293.anInt1476 - local293.anInt1475 + 1;
						local161.anInt1090 = local280;
						local161.anInt1091 = local293.anInt1474 / 3;
						local161.method9117(local399);
						local280 += local293.anInt1474;
					}
				}
			} else {
				local161.aClass447_34.method29133(this.aClass86_Sub1_3.aFloatArray71[0], this.aClass86_Sub1_3.aFloatArray71[1], this.aClass86_Sub1_3.aFloatArray71[2]);
				local161.aClass447_35.method29133(this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat195, this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat209, this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat196);
				local161.aClass447_36.method29133(-this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat195, -this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat209, -this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat196);
				local161.aClass447_37.method29133(this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat195, this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat209, this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat196);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass77Array3.length; local282++) {
					local293 = (Class77_Sub10) this.aClass77Array3[local282];
					if (local293.anInt1474 > 0) {
						if (this.aClass86_Sub1_3.aBoolean447) {
							this.aClass86_Sub1_3.method20146(0, local293.aClass202_3);
							@Pc(613) float local613 = 0.15F;
							local161.aClass450_10.method29234(0.0F, 1.0F / ((float) (local293.aClass202_3.anInt3553 * -1095140607) * local613), 0.0F, 256.0F / ((float) (local293.aClass202_3.anInt3553 * -1095140607) * local613));
							local161.aClass447_31.method29133((float) (local293.aClass202_3.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1472 == -1) {
							local161.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
						} else {
							local411 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
							local693 = local411.aByte118;
							local161.anInterface37_18 = this.aClass86_Sub1_3.aClass370_3.method28225(local411);
							local161.method9097(local411.aByte119);
						}
						this.aClass86_Sub1_3.method20670(1, local293.anInterface36_10);
						this.aClass86_Sub1_3.method20658(this.aClass113_7);
						local161.aClass442_48.method28979(1.0F / local293.aFloat145, 1.0F / local293.aFloat145, 1.0F, 1.0F);
						local161.anInt1089 = local293.anInt1475;
						local161.anInt1087 = local293.anInt1476 - local293.anInt1475 + 1;
						local161.anInt1090 = local280;
						local161.anInt1091 = local293.anInt1474 / 3;
						switch(local693) {
							case 1:
								local161.aClass447_32.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
								if (this.aClass86_Sub1_3.aBoolean447) {
									local161.method9106();
								} else {
									local161.method9116(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass86_Sub1_3.aBoolean434 || (this.anInt571 & 0x8) == 0 || !this.aClass86_Sub1_3.aClass122_Sub1_Sub2_6.method18591()) {
									local161.method9103(0);
								} else {
									@Pc(802) Class122_Sub1_Sub2 local802 = this.aClass86_Sub1_3.aClass122_Sub1_Sub2_6;
									if (local693 == 2) {
										local802 = this.aClass86_Sub1_3.aClass122_Sub1_Sub2_5;
									}
									local802.aClass442_58.method28954(this.aClass86_Sub1_3.aClass442_84);
									local802.aClass442_59.method28979(1.0F / (local293.aFloat145 * (float) (local293.aClass202_3.anInt3556 * -108174347)), 1.0F / (local293.aFloat145 * (float) (local293.aClass202_3.anInt3556 * -108174347)), 1.0F, 1.0F);
									local802.aClass447_57.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
									@Pc(871) Class215 local871 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
									local802.anInt2599 = local871.aByte119 * 837530247;
									local802.anInt2602 = local293.anInt1475 * 2134526643;
									local802.anInt2601 = (local293.anInt1476 - local293.anInt1475 + 1) * 257007611;
									local802.anInt2600 = local280 * 1042457319;
									local802.anInt2603 = local293.anInt1474 / 3 * -1394271287;
									local802.aClass450_15.method29238(local161.aClass450_10);
									local802.aClass447_55.method29136(local161.aClass447_31);
									local802.aClass450_16.method29238(local161.aClass450_11);
									local802.aClass447_56.method29136(local161.aClass447_33);
									local802.method18595();
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass86_Sub1_3.aBoolean447) {
									local161.method9105();
								} else {
									local161.method9103(0);
								}
								break;
							case 6:
								local161.method9117(!Class683.method36096(local693));
								break;
							case 7:
								local161.aClass447_32.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
								local161.aClass442_49.method28951();
								local161.anInterface40_3 = this.aClass86_Sub1_3.method20458();
								local161.method9111(0);
						}
						local280 += local293.anInt1474;
					}
				}
			}
		}
		if (!this.aClass695_5.method36416()) {
			this.aClass86_Sub1_3.method20579(128);
			this.aClass86_Sub1_3.method20519(false);
			@Pc(1036) Class447 local1036 = new Class447(local161.aClass447_33);
			local161.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass695_5.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class77_Sub15 local1053 = (Class77_Sub15) local1046.next();
				local1053.method13420(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass447_33.method29136(local1036);
		}
		if (this.aClass359_1 == null) {
			return;
		}
		this.aClass86_Sub1_3.method20579(1);
		this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
		this.aClass86_Sub1_3.method20670(1, this.anInterface36_5);
		this.aClass86_Sub1_3.method20658(this.aClass113_7);
		@Pc(1094) Class442 local1094 = this.aClass86_Sub1_3.aClass442_87;
		local1094.method28951();
		local1094.aFloatArray109[13] = -1.0F;
		local161.method9101(local1094);
		this.aClass359_1.method27976(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aek", name = "y", descriptor = "(III[[ZZI)V", line = 499)
	@Override
	public void method5520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass77Array3 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray41.length < local12) {
			this.anIntArray41 = new int[local12];
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
		if (local45 > this.anInt607 * -1924295585 - 1) {
			local45 = this.anInt607 * -1924295585 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt606 * -1466328823 - 1) {
			local64 = this.anInt606 * -1466328823 - 1;
		}
		this.anInt580 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray41[this.anInt580++] = local95 * this.anInt607 * -1924295585 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass86_Sub1_3.aByteBuffer7;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass77Array3.length; local135++) {
			@Pc(146) Class77_Sub10 local146 = (Class77_Sub10) this.aClass77Array3[local135];
			local146.method13313(this.anIntArray41, this.anInt580);
		}
		local135 = local130.position();
		@Pc(161) Class109 local161 = this.aClass86_Sub1_3.aClass109_3;
		this.aClass86_Sub1_3.method20600();
		if (this.aClass86_Sub1_3.anInt2841 > 0) {
			local161.aClass447_33.method29133((float) (this.aClass86_Sub1_3.anInt2840 >> 16 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_3.anInt2840 >> 8 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_3.anInt2840 >> 0 & 0xFF) / 255.0F);
			local161.aClass450_11.method29234(0.0F, 0.0F, 1.0F, -this.aClass86_Sub1_3.aFloat205);
			local161.aClass450_11.method29255(this.aClass86_Sub1_3.aClass442_80);
			local161.aClass450_11.method29253(1.0F / (this.aClass86_Sub1_3.aFloat206 - this.aClass86_Sub1_3.aFloat205));
		} else {
			local161.aClass450_11.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local161.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
		}
		if (local135 != 0) {
			@Pc(252) Interface38 local252 = this.aClass86_Sub1_3.method20454(local135 / 2);
			local252.method28755(0, local135, this.aClass86_Sub1_3.aLong121);
			this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
			this.aClass86_Sub1_3.method20659(local252);
			local161.method9101(Class442.aClass442_97);
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class77_Sub10 local293;
			@Pc(411) Class215 local411;
			if ((this.anInt571 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass77Array3.length; local282++) {
					local293 = (Class77_Sub10) this.aClass77Array3[local282];
					if (local293.anInt1474 != 0) {
						if (this.aClass86_Sub1_3.aBoolean447) {
							this.aClass86_Sub1_3.method20146(0, local293.aClass202_3);
							local161.aClass450_10.method29234(0.0F, 1.0F, 0.0F, (float) this.aClass86_Sub1_3.anInt2839 + (float) (local293.aClass202_3.anInt3555 * 1446227271) / 255.0F * (float) (local293.aClass202_3.anInt3553 * -1095140607));
							local161.aClass450_10.method29253(1.0F / (float) (local293.aClass202_3.anInt3553 * -1095140607));
							local161.aClass447_31.method29133((float) (local293.aClass202_3.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1472 == -1) {
							local161.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
						} else {
							local411 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
							local161.anInterface37_18 = this.aClass86_Sub1_3.aClass370_3.method28225(local411);
							local399 = !Class683.method36096(local411.aByte118);
						}
						this.aClass86_Sub1_3.method20670(1, local293.anInterface36_10);
						this.aClass86_Sub1_3.method20658(this.aClass113_7);
						local161.aClass442_48.method28979(1.0F / local293.aFloat145, 1.0F / local293.aFloat145, 1.0F, 1.0F);
						local161.anInt1089 = local293.anInt1475;
						local161.anInt1087 = local293.anInt1476 - local293.anInt1475 + 1;
						local161.anInt1090 = local280;
						local161.anInt1091 = local293.anInt1474 / 3;
						local161.method9117(local399);
						local280 += local293.anInt1474;
					}
				}
			} else {
				local161.aClass447_34.method29133(this.aClass86_Sub1_3.aFloatArray71[0], this.aClass86_Sub1_3.aFloatArray71[1], this.aClass86_Sub1_3.aFloatArray71[2]);
				local161.aClass447_35.method29133(this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat195, this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat209, this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat196);
				local161.aClass447_36.method29133(-this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat195, -this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat209, -this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat196);
				local161.aClass447_37.method29133(this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat195, this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat209, this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat196);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass77Array3.length; local282++) {
					local293 = (Class77_Sub10) this.aClass77Array3[local282];
					if (local293.anInt1474 > 0) {
						if (this.aClass86_Sub1_3.aBoolean447) {
							this.aClass86_Sub1_3.method20146(0, local293.aClass202_3);
							@Pc(613) float local613 = 0.15F;
							local161.aClass450_10.method29234(0.0F, 1.0F / ((float) (local293.aClass202_3.anInt3553 * -1095140607) * local613), 0.0F, 256.0F / ((float) (local293.aClass202_3.anInt3553 * -1095140607) * local613));
							local161.aClass447_31.method29133((float) (local293.aClass202_3.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1472 == -1) {
							local161.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
						} else {
							local411 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
							local693 = local411.aByte118;
							local161.anInterface37_18 = this.aClass86_Sub1_3.aClass370_3.method28225(local411);
							local161.method9097(local411.aByte119);
						}
						this.aClass86_Sub1_3.method20670(1, local293.anInterface36_10);
						this.aClass86_Sub1_3.method20658(this.aClass113_7);
						local161.aClass442_48.method28979(1.0F / local293.aFloat145, 1.0F / local293.aFloat145, 1.0F, 1.0F);
						local161.anInt1089 = local293.anInt1475;
						local161.anInt1087 = local293.anInt1476 - local293.anInt1475 + 1;
						local161.anInt1090 = local280;
						local161.anInt1091 = local293.anInt1474 / 3;
						switch(local693) {
							case 1:
								local161.aClass447_32.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
								if (this.aClass86_Sub1_3.aBoolean447) {
									local161.method9106();
								} else {
									local161.method9116(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass86_Sub1_3.aBoolean434 || (this.anInt571 & 0x8) == 0 || !this.aClass86_Sub1_3.aClass122_Sub1_Sub2_6.method18591()) {
									local161.method9103(0);
								} else {
									@Pc(802) Class122_Sub1_Sub2 local802 = this.aClass86_Sub1_3.aClass122_Sub1_Sub2_6;
									if (local693 == 2) {
										local802 = this.aClass86_Sub1_3.aClass122_Sub1_Sub2_5;
									}
									local802.aClass442_58.method28954(this.aClass86_Sub1_3.aClass442_84);
									local802.aClass442_59.method28979(1.0F / (local293.aFloat145 * (float) (local293.aClass202_3.anInt3556 * -108174347)), 1.0F / (local293.aFloat145 * (float) (local293.aClass202_3.anInt3556 * -108174347)), 1.0F, 1.0F);
									local802.aClass447_57.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
									@Pc(871) Class215 local871 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
									local802.anInt2599 = local871.aByte119 * 837530247;
									local802.anInt2602 = local293.anInt1475 * 2134526643;
									local802.anInt2601 = (local293.anInt1476 - local293.anInt1475 + 1) * 257007611;
									local802.anInt2600 = local280 * 1042457319;
									local802.anInt2603 = local293.anInt1474 / 3 * -1394271287;
									local802.aClass450_15.method29238(local161.aClass450_10);
									local802.aClass447_55.method29136(local161.aClass447_31);
									local802.aClass450_16.method29238(local161.aClass450_11);
									local802.aClass447_56.method29136(local161.aClass447_33);
									local802.method18595();
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass86_Sub1_3.aBoolean447) {
									local161.method9105();
								} else {
									local161.method9103(0);
								}
								break;
							case 6:
								local161.method9117(!Class683.method36096(local693));
								break;
							case 7:
								local161.aClass447_32.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
								local161.aClass442_49.method28951();
								local161.anInterface40_3 = this.aClass86_Sub1_3.method20458();
								local161.method9111(0);
						}
						local280 += local293.anInt1474;
					}
				}
			}
		}
		if (!this.aClass695_5.method36416()) {
			this.aClass86_Sub1_3.method20579(128);
			this.aClass86_Sub1_3.method20519(false);
			@Pc(1036) Class447 local1036 = new Class447(local161.aClass447_33);
			local161.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass695_5.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class77_Sub15 local1053 = (Class77_Sub15) local1046.next();
				local1053.method13420(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass447_33.method29136(local1036);
		}
		if (this.aClass359_1 == null) {
			return;
		}
		this.aClass86_Sub1_3.method20579(1);
		this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
		this.aClass86_Sub1_3.method20670(1, this.anInterface36_5);
		this.aClass86_Sub1_3.method20658(this.aClass113_7);
		@Pc(1094) Class442 local1094 = this.aClass86_Sub1_3.aClass442_87;
		local1094.method28951();
		local1094.aFloatArray109[13] = -1.0F;
		local161.method9101(local1094);
		this.aClass359_1.method27976(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aek", name = "n", descriptor = "(III[[ZZI)V", line = 499)
	@Override
	public void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass77Array3 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray41.length < local12) {
			this.anIntArray41 = new int[local12];
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
		if (local45 > this.anInt607 * -1924295585 - 1) {
			local45 = this.anInt607 * -1924295585 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt606 * -1466328823 - 1) {
			local64 = this.anInt606 * -1466328823 - 1;
		}
		this.anInt580 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray41[this.anInt580++] = local95 * this.anInt607 * -1924295585 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass86_Sub1_3.aByteBuffer7;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass77Array3.length; local135++) {
			@Pc(146) Class77_Sub10 local146 = (Class77_Sub10) this.aClass77Array3[local135];
			local146.method13313(this.anIntArray41, this.anInt580);
		}
		local135 = local130.position();
		@Pc(161) Class109 local161 = this.aClass86_Sub1_3.aClass109_3;
		this.aClass86_Sub1_3.method20600();
		if (this.aClass86_Sub1_3.anInt2841 > 0) {
			local161.aClass447_33.method29133((float) (this.aClass86_Sub1_3.anInt2840 >> 16 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_3.anInt2840 >> 8 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_3.anInt2840 >> 0 & 0xFF) / 255.0F);
			local161.aClass450_11.method29234(0.0F, 0.0F, 1.0F, -this.aClass86_Sub1_3.aFloat205);
			local161.aClass450_11.method29255(this.aClass86_Sub1_3.aClass442_80);
			local161.aClass450_11.method29253(1.0F / (this.aClass86_Sub1_3.aFloat206 - this.aClass86_Sub1_3.aFloat205));
		} else {
			local161.aClass450_11.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local161.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
		}
		if (local135 != 0) {
			@Pc(252) Interface38 local252 = this.aClass86_Sub1_3.method20454(local135 / 2);
			local252.method28755(0, local135, this.aClass86_Sub1_3.aLong121);
			this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
			this.aClass86_Sub1_3.method20659(local252);
			local161.method9101(Class442.aClass442_97);
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class77_Sub10 local293;
			@Pc(411) Class215 local411;
			if ((this.anInt571 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass77Array3.length; local282++) {
					local293 = (Class77_Sub10) this.aClass77Array3[local282];
					if (local293.anInt1474 != 0) {
						if (this.aClass86_Sub1_3.aBoolean447) {
							this.aClass86_Sub1_3.method20146(0, local293.aClass202_3);
							local161.aClass450_10.method29234(0.0F, 1.0F, 0.0F, (float) this.aClass86_Sub1_3.anInt2839 + (float) (local293.aClass202_3.anInt3555 * 1446227271) / 255.0F * (float) (local293.aClass202_3.anInt3553 * -1095140607));
							local161.aClass450_10.method29253(1.0F / (float) (local293.aClass202_3.anInt3553 * -1095140607));
							local161.aClass447_31.method29133((float) (local293.aClass202_3.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1472 == -1) {
							local161.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
						} else {
							local411 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
							local161.anInterface37_18 = this.aClass86_Sub1_3.aClass370_3.method28225(local411);
							local399 = !Class683.method36096(local411.aByte118);
						}
						this.aClass86_Sub1_3.method20670(1, local293.anInterface36_10);
						this.aClass86_Sub1_3.method20658(this.aClass113_7);
						local161.aClass442_48.method28979(1.0F / local293.aFloat145, 1.0F / local293.aFloat145, 1.0F, 1.0F);
						local161.anInt1089 = local293.anInt1475;
						local161.anInt1087 = local293.anInt1476 - local293.anInt1475 + 1;
						local161.anInt1090 = local280;
						local161.anInt1091 = local293.anInt1474 / 3;
						local161.method9117(local399);
						local280 += local293.anInt1474;
					}
				}
			} else {
				local161.aClass447_34.method29133(this.aClass86_Sub1_3.aFloatArray71[0], this.aClass86_Sub1_3.aFloatArray71[1], this.aClass86_Sub1_3.aFloatArray71[2]);
				local161.aClass447_35.method29133(this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat195, this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat209, this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat196);
				local161.aClass447_36.method29133(-this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat195, -this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat209, -this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat196);
				local161.aClass447_37.method29133(this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat195, this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat209, this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat196);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass77Array3.length; local282++) {
					local293 = (Class77_Sub10) this.aClass77Array3[local282];
					if (local293.anInt1474 > 0) {
						if (this.aClass86_Sub1_3.aBoolean447) {
							this.aClass86_Sub1_3.method20146(0, local293.aClass202_3);
							@Pc(613) float local613 = 0.15F;
							local161.aClass450_10.method29234(0.0F, 1.0F / ((float) (local293.aClass202_3.anInt3553 * -1095140607) * local613), 0.0F, 256.0F / ((float) (local293.aClass202_3.anInt3553 * -1095140607) * local613));
							local161.aClass447_31.method29133((float) (local293.aClass202_3.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1472 == -1) {
							local161.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
						} else {
							local411 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
							local693 = local411.aByte118;
							local161.anInterface37_18 = this.aClass86_Sub1_3.aClass370_3.method28225(local411);
							local161.method9097(local411.aByte119);
						}
						this.aClass86_Sub1_3.method20670(1, local293.anInterface36_10);
						this.aClass86_Sub1_3.method20658(this.aClass113_7);
						local161.aClass442_48.method28979(1.0F / local293.aFloat145, 1.0F / local293.aFloat145, 1.0F, 1.0F);
						local161.anInt1089 = local293.anInt1475;
						local161.anInt1087 = local293.anInt1476 - local293.anInt1475 + 1;
						local161.anInt1090 = local280;
						local161.anInt1091 = local293.anInt1474 / 3;
						switch(local693) {
							case 1:
								local161.aClass447_32.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
								if (this.aClass86_Sub1_3.aBoolean447) {
									local161.method9106();
								} else {
									local161.method9116(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass86_Sub1_3.aBoolean434 || (this.anInt571 & 0x8) == 0 || !this.aClass86_Sub1_3.aClass122_Sub1_Sub2_6.method18591()) {
									local161.method9103(0);
								} else {
									@Pc(802) Class122_Sub1_Sub2 local802 = this.aClass86_Sub1_3.aClass122_Sub1_Sub2_6;
									if (local693 == 2) {
										local802 = this.aClass86_Sub1_3.aClass122_Sub1_Sub2_5;
									}
									local802.aClass442_58.method28954(this.aClass86_Sub1_3.aClass442_84);
									local802.aClass442_59.method28979(1.0F / (local293.aFloat145 * (float) (local293.aClass202_3.anInt3556 * -108174347)), 1.0F / (local293.aFloat145 * (float) (local293.aClass202_3.anInt3556 * -108174347)), 1.0F, 1.0F);
									local802.aClass447_57.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
									@Pc(871) Class215 local871 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
									local802.anInt2599 = local871.aByte119 * 837530247;
									local802.anInt2602 = local293.anInt1475 * 2134526643;
									local802.anInt2601 = (local293.anInt1476 - local293.anInt1475 + 1) * 257007611;
									local802.anInt2600 = local280 * 1042457319;
									local802.anInt2603 = local293.anInt1474 / 3 * -1394271287;
									local802.aClass450_15.method29238(local161.aClass450_10);
									local802.aClass447_55.method29136(local161.aClass447_31);
									local802.aClass450_16.method29238(local161.aClass450_11);
									local802.aClass447_56.method29136(local161.aClass447_33);
									local802.method18595();
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass86_Sub1_3.aBoolean447) {
									local161.method9105();
								} else {
									local161.method9103(0);
								}
								break;
							case 6:
								local161.method9117(!Class683.method36096(local693));
								break;
							case 7:
								local161.aClass447_32.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
								local161.aClass442_49.method28951();
								local161.anInterface40_3 = this.aClass86_Sub1_3.method20458();
								local161.method9111(0);
						}
						local280 += local293.anInt1474;
					}
				}
			}
		}
		if (!this.aClass695_5.method36416()) {
			this.aClass86_Sub1_3.method20579(128);
			this.aClass86_Sub1_3.method20519(false);
			@Pc(1036) Class447 local1036 = new Class447(local161.aClass447_33);
			local161.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass695_5.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class77_Sub15 local1053 = (Class77_Sub15) local1046.next();
				local1053.method13420(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass447_33.method29136(local1036);
		}
		if (this.aClass359_1 == null) {
			return;
		}
		this.aClass86_Sub1_3.method20579(1);
		this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
		this.aClass86_Sub1_3.method20670(1, this.anInterface36_5);
		this.aClass86_Sub1_3.method20658(this.aClass113_7);
		@Pc(1094) Class442 local1094 = this.aClass86_Sub1_3.aClass442_87;
		local1094.method28951();
		local1094.aFloatArray109[13] = -1.0F;
		local161.method9101(local1094);
		this.aClass359_1.method27976(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aek", name = "a", descriptor = "(III[[ZZI)V", line = 499)
	@Override
	public void method5528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass77Array3 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray41.length < local12) {
			this.anIntArray41 = new int[local12];
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
		if (local45 > this.anInt607 * -1924295585 - 1) {
			local45 = this.anInt607 * -1924295585 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt606 * -1466328823 - 1) {
			local64 = this.anInt606 * -1466328823 - 1;
		}
		this.anInt580 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray41[this.anInt580++] = local95 * this.anInt607 * -1924295585 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass86_Sub1_3.aByteBuffer7;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass77Array3.length; local135++) {
			@Pc(146) Class77_Sub10 local146 = (Class77_Sub10) this.aClass77Array3[local135];
			local146.method13313(this.anIntArray41, this.anInt580);
		}
		local135 = local130.position();
		@Pc(161) Class109 local161 = this.aClass86_Sub1_3.aClass109_3;
		this.aClass86_Sub1_3.method20600();
		if (this.aClass86_Sub1_3.anInt2841 > 0) {
			local161.aClass447_33.method29133((float) (this.aClass86_Sub1_3.anInt2840 >> 16 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_3.anInt2840 >> 8 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_3.anInt2840 >> 0 & 0xFF) / 255.0F);
			local161.aClass450_11.method29234(0.0F, 0.0F, 1.0F, -this.aClass86_Sub1_3.aFloat205);
			local161.aClass450_11.method29255(this.aClass86_Sub1_3.aClass442_80);
			local161.aClass450_11.method29253(1.0F / (this.aClass86_Sub1_3.aFloat206 - this.aClass86_Sub1_3.aFloat205));
		} else {
			local161.aClass450_11.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local161.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
		}
		if (local135 != 0) {
			@Pc(252) Interface38 local252 = this.aClass86_Sub1_3.method20454(local135 / 2);
			local252.method28755(0, local135, this.aClass86_Sub1_3.aLong121);
			this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
			this.aClass86_Sub1_3.method20659(local252);
			local161.method9101(Class442.aClass442_97);
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class77_Sub10 local293;
			@Pc(411) Class215 local411;
			if ((this.anInt571 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass77Array3.length; local282++) {
					local293 = (Class77_Sub10) this.aClass77Array3[local282];
					if (local293.anInt1474 != 0) {
						if (this.aClass86_Sub1_3.aBoolean447) {
							this.aClass86_Sub1_3.method20146(0, local293.aClass202_3);
							local161.aClass450_10.method29234(0.0F, 1.0F, 0.0F, (float) this.aClass86_Sub1_3.anInt2839 + (float) (local293.aClass202_3.anInt3555 * 1446227271) / 255.0F * (float) (local293.aClass202_3.anInt3553 * -1095140607));
							local161.aClass450_10.method29253(1.0F / (float) (local293.aClass202_3.anInt3553 * -1095140607));
							local161.aClass447_31.method29133((float) (local293.aClass202_3.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1472 == -1) {
							local161.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
						} else {
							local411 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
							local161.anInterface37_18 = this.aClass86_Sub1_3.aClass370_3.method28225(local411);
							local399 = !Class683.method36096(local411.aByte118);
						}
						this.aClass86_Sub1_3.method20670(1, local293.anInterface36_10);
						this.aClass86_Sub1_3.method20658(this.aClass113_7);
						local161.aClass442_48.method28979(1.0F / local293.aFloat145, 1.0F / local293.aFloat145, 1.0F, 1.0F);
						local161.anInt1089 = local293.anInt1475;
						local161.anInt1087 = local293.anInt1476 - local293.anInt1475 + 1;
						local161.anInt1090 = local280;
						local161.anInt1091 = local293.anInt1474 / 3;
						local161.method9117(local399);
						local280 += local293.anInt1474;
					}
				}
			} else {
				local161.aClass447_34.method29133(this.aClass86_Sub1_3.aFloatArray71[0], this.aClass86_Sub1_3.aFloatArray71[1], this.aClass86_Sub1_3.aFloatArray71[2]);
				local161.aClass447_35.method29133(this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat195, this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat209, this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat196);
				local161.aClass447_36.method29133(-this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat195, -this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat209, -this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat196);
				local161.aClass447_37.method29133(this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat195, this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat209, this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat196);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass77Array3.length; local282++) {
					local293 = (Class77_Sub10) this.aClass77Array3[local282];
					if (local293.anInt1474 > 0) {
						if (this.aClass86_Sub1_3.aBoolean447) {
							this.aClass86_Sub1_3.method20146(0, local293.aClass202_3);
							@Pc(613) float local613 = 0.15F;
							local161.aClass450_10.method29234(0.0F, 1.0F / ((float) (local293.aClass202_3.anInt3553 * -1095140607) * local613), 0.0F, 256.0F / ((float) (local293.aClass202_3.anInt3553 * -1095140607) * local613));
							local161.aClass447_31.method29133((float) (local293.aClass202_3.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1472 == -1) {
							local161.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
						} else {
							local411 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
							local693 = local411.aByte118;
							local161.anInterface37_18 = this.aClass86_Sub1_3.aClass370_3.method28225(local411);
							local161.method9097(local411.aByte119);
						}
						this.aClass86_Sub1_3.method20670(1, local293.anInterface36_10);
						this.aClass86_Sub1_3.method20658(this.aClass113_7);
						local161.aClass442_48.method28979(1.0F / local293.aFloat145, 1.0F / local293.aFloat145, 1.0F, 1.0F);
						local161.anInt1089 = local293.anInt1475;
						local161.anInt1087 = local293.anInt1476 - local293.anInt1475 + 1;
						local161.anInt1090 = local280;
						local161.anInt1091 = local293.anInt1474 / 3;
						switch(local693) {
							case 1:
								local161.aClass447_32.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
								if (this.aClass86_Sub1_3.aBoolean447) {
									local161.method9106();
								} else {
									local161.method9116(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass86_Sub1_3.aBoolean434 || (this.anInt571 & 0x8) == 0 || !this.aClass86_Sub1_3.aClass122_Sub1_Sub2_6.method18591()) {
									local161.method9103(0);
								} else {
									@Pc(802) Class122_Sub1_Sub2 local802 = this.aClass86_Sub1_3.aClass122_Sub1_Sub2_6;
									if (local693 == 2) {
										local802 = this.aClass86_Sub1_3.aClass122_Sub1_Sub2_5;
									}
									local802.aClass442_58.method28954(this.aClass86_Sub1_3.aClass442_84);
									local802.aClass442_59.method28979(1.0F / (local293.aFloat145 * (float) (local293.aClass202_3.anInt3556 * -108174347)), 1.0F / (local293.aFloat145 * (float) (local293.aClass202_3.anInt3556 * -108174347)), 1.0F, 1.0F);
									local802.aClass447_57.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
									@Pc(871) Class215 local871 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
									local802.anInt2599 = local871.aByte119 * 837530247;
									local802.anInt2602 = local293.anInt1475 * 2134526643;
									local802.anInt2601 = (local293.anInt1476 - local293.anInt1475 + 1) * 257007611;
									local802.anInt2600 = local280 * 1042457319;
									local802.anInt2603 = local293.anInt1474 / 3 * -1394271287;
									local802.aClass450_15.method29238(local161.aClass450_10);
									local802.aClass447_55.method29136(local161.aClass447_31);
									local802.aClass450_16.method29238(local161.aClass450_11);
									local802.aClass447_56.method29136(local161.aClass447_33);
									local802.method18595();
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass86_Sub1_3.aBoolean447) {
									local161.method9105();
								} else {
									local161.method9103(0);
								}
								break;
							case 6:
								local161.method9117(!Class683.method36096(local693));
								break;
							case 7:
								local161.aClass447_32.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
								local161.aClass442_49.method28951();
								local161.anInterface40_3 = this.aClass86_Sub1_3.method20458();
								local161.method9111(0);
						}
						local280 += local293.anInt1474;
					}
				}
			}
		}
		if (!this.aClass695_5.method36416()) {
			this.aClass86_Sub1_3.method20579(128);
			this.aClass86_Sub1_3.method20519(false);
			@Pc(1036) Class447 local1036 = new Class447(local161.aClass447_33);
			local161.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass695_5.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class77_Sub15 local1053 = (Class77_Sub15) local1046.next();
				local1053.method13420(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass447_33.method29136(local1036);
		}
		if (this.aClass359_1 == null) {
			return;
		}
		this.aClass86_Sub1_3.method20579(1);
		this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
		this.aClass86_Sub1_3.method20670(1, this.anInterface36_5);
		this.aClass86_Sub1_3.method20658(this.aClass113_7);
		@Pc(1094) Class442 local1094 = this.aClass86_Sub1_3.aClass442_87;
		local1094.method28951();
		local1094.aFloatArray109[13] = -1.0F;
		local161.method9101(local1094);
		this.aClass359_1.method27976(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aek", name = "m", descriptor = "(III[[ZZI)V", line = 499)
	@Override
	public void method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass77Array3 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray41.length < local12) {
			this.anIntArray41 = new int[local12];
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
		if (local45 > this.anInt607 * -1924295585 - 1) {
			local45 = this.anInt607 * -1924295585 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt606 * -1466328823 - 1) {
			local64 = this.anInt606 * -1466328823 - 1;
		}
		this.anInt580 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray41[this.anInt580++] = local95 * this.anInt607 * -1924295585 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass86_Sub1_3.aByteBuffer7;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass77Array3.length; local135++) {
			@Pc(146) Class77_Sub10 local146 = (Class77_Sub10) this.aClass77Array3[local135];
			local146.method13313(this.anIntArray41, this.anInt580);
		}
		local135 = local130.position();
		@Pc(161) Class109 local161 = this.aClass86_Sub1_3.aClass109_3;
		this.aClass86_Sub1_3.method20600();
		if (this.aClass86_Sub1_3.anInt2841 > 0) {
			local161.aClass447_33.method29133((float) (this.aClass86_Sub1_3.anInt2840 >> 16 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_3.anInt2840 >> 8 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_3.anInt2840 >> 0 & 0xFF) / 255.0F);
			local161.aClass450_11.method29234(0.0F, 0.0F, 1.0F, -this.aClass86_Sub1_3.aFloat205);
			local161.aClass450_11.method29255(this.aClass86_Sub1_3.aClass442_80);
			local161.aClass450_11.method29253(1.0F / (this.aClass86_Sub1_3.aFloat206 - this.aClass86_Sub1_3.aFloat205));
		} else {
			local161.aClass450_11.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local161.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
		}
		if (local135 != 0) {
			@Pc(252) Interface38 local252 = this.aClass86_Sub1_3.method20454(local135 / 2);
			local252.method28755(0, local135, this.aClass86_Sub1_3.aLong121);
			this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
			this.aClass86_Sub1_3.method20659(local252);
			local161.method9101(Class442.aClass442_97);
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class77_Sub10 local293;
			@Pc(411) Class215 local411;
			if ((this.anInt571 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass77Array3.length; local282++) {
					local293 = (Class77_Sub10) this.aClass77Array3[local282];
					if (local293.anInt1474 != 0) {
						if (this.aClass86_Sub1_3.aBoolean447) {
							this.aClass86_Sub1_3.method20146(0, local293.aClass202_3);
							local161.aClass450_10.method29234(0.0F, 1.0F, 0.0F, (float) this.aClass86_Sub1_3.anInt2839 + (float) (local293.aClass202_3.anInt3555 * 1446227271) / 255.0F * (float) (local293.aClass202_3.anInt3553 * -1095140607));
							local161.aClass450_10.method29253(1.0F / (float) (local293.aClass202_3.anInt3553 * -1095140607));
							local161.aClass447_31.method29133((float) (local293.aClass202_3.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1472 == -1) {
							local161.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
						} else {
							local411 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
							local161.anInterface37_18 = this.aClass86_Sub1_3.aClass370_3.method28225(local411);
							local399 = !Class683.method36096(local411.aByte118);
						}
						this.aClass86_Sub1_3.method20670(1, local293.anInterface36_10);
						this.aClass86_Sub1_3.method20658(this.aClass113_7);
						local161.aClass442_48.method28979(1.0F / local293.aFloat145, 1.0F / local293.aFloat145, 1.0F, 1.0F);
						local161.anInt1089 = local293.anInt1475;
						local161.anInt1087 = local293.anInt1476 - local293.anInt1475 + 1;
						local161.anInt1090 = local280;
						local161.anInt1091 = local293.anInt1474 / 3;
						local161.method9117(local399);
						local280 += local293.anInt1474;
					}
				}
			} else {
				local161.aClass447_34.method29133(this.aClass86_Sub1_3.aFloatArray71[0], this.aClass86_Sub1_3.aFloatArray71[1], this.aClass86_Sub1_3.aFloatArray71[2]);
				local161.aClass447_35.method29133(this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat195, this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat209, this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat196);
				local161.aClass447_36.method29133(-this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat195, -this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat209, -this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat196);
				local161.aClass447_37.method29133(this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat195, this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat209, this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat196);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass77Array3.length; local282++) {
					local293 = (Class77_Sub10) this.aClass77Array3[local282];
					if (local293.anInt1474 > 0) {
						if (this.aClass86_Sub1_3.aBoolean447) {
							this.aClass86_Sub1_3.method20146(0, local293.aClass202_3);
							@Pc(613) float local613 = 0.15F;
							local161.aClass450_10.method29234(0.0F, 1.0F / ((float) (local293.aClass202_3.anInt3553 * -1095140607) * local613), 0.0F, 256.0F / ((float) (local293.aClass202_3.anInt3553 * -1095140607) * local613));
							local161.aClass447_31.method29133((float) (local293.aClass202_3.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1472 == -1) {
							local161.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
						} else {
							local411 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
							local693 = local411.aByte118;
							local161.anInterface37_18 = this.aClass86_Sub1_3.aClass370_3.method28225(local411);
							local161.method9097(local411.aByte119);
						}
						this.aClass86_Sub1_3.method20670(1, local293.anInterface36_10);
						this.aClass86_Sub1_3.method20658(this.aClass113_7);
						local161.aClass442_48.method28979(1.0F / local293.aFloat145, 1.0F / local293.aFloat145, 1.0F, 1.0F);
						local161.anInt1089 = local293.anInt1475;
						local161.anInt1087 = local293.anInt1476 - local293.anInt1475 + 1;
						local161.anInt1090 = local280;
						local161.anInt1091 = local293.anInt1474 / 3;
						switch(local693) {
							case 1:
								local161.aClass447_32.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
								if (this.aClass86_Sub1_3.aBoolean447) {
									local161.method9106();
								} else {
									local161.method9116(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass86_Sub1_3.aBoolean434 || (this.anInt571 & 0x8) == 0 || !this.aClass86_Sub1_3.aClass122_Sub1_Sub2_6.method18591()) {
									local161.method9103(0);
								} else {
									@Pc(802) Class122_Sub1_Sub2 local802 = this.aClass86_Sub1_3.aClass122_Sub1_Sub2_6;
									if (local693 == 2) {
										local802 = this.aClass86_Sub1_3.aClass122_Sub1_Sub2_5;
									}
									local802.aClass442_58.method28954(this.aClass86_Sub1_3.aClass442_84);
									local802.aClass442_59.method28979(1.0F / (local293.aFloat145 * (float) (local293.aClass202_3.anInt3556 * -108174347)), 1.0F / (local293.aFloat145 * (float) (local293.aClass202_3.anInt3556 * -108174347)), 1.0F, 1.0F);
									local802.aClass447_57.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
									@Pc(871) Class215 local871 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
									local802.anInt2599 = local871.aByte119 * 837530247;
									local802.anInt2602 = local293.anInt1475 * 2134526643;
									local802.anInt2601 = (local293.anInt1476 - local293.anInt1475 + 1) * 257007611;
									local802.anInt2600 = local280 * 1042457319;
									local802.anInt2603 = local293.anInt1474 / 3 * -1394271287;
									local802.aClass450_15.method29238(local161.aClass450_10);
									local802.aClass447_55.method29136(local161.aClass447_31);
									local802.aClass450_16.method29238(local161.aClass450_11);
									local802.aClass447_56.method29136(local161.aClass447_33);
									local802.method18595();
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass86_Sub1_3.aBoolean447) {
									local161.method9105();
								} else {
									local161.method9103(0);
								}
								break;
							case 6:
								local161.method9117(!Class683.method36096(local693));
								break;
							case 7:
								local161.aClass447_32.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
								local161.aClass442_49.method28951();
								local161.anInterface40_3 = this.aClass86_Sub1_3.method20458();
								local161.method9111(0);
						}
						local280 += local293.anInt1474;
					}
				}
			}
		}
		if (!this.aClass695_5.method36416()) {
			this.aClass86_Sub1_3.method20579(128);
			this.aClass86_Sub1_3.method20519(false);
			@Pc(1036) Class447 local1036 = new Class447(local161.aClass447_33);
			local161.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass695_5.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class77_Sub15 local1053 = (Class77_Sub15) local1046.next();
				local1053.method13420(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass447_33.method29136(local1036);
		}
		if (this.aClass359_1 == null) {
			return;
		}
		this.aClass86_Sub1_3.method20579(1);
		this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
		this.aClass86_Sub1_3.method20670(1, this.anInterface36_5);
		this.aClass86_Sub1_3.method20658(this.aClass113_7);
		@Pc(1094) Class442 local1094 = this.aClass86_Sub1_3.aClass442_87;
		local1094.method28951();
		local1094.aFloatArray109[13] = -1.0F;
		local161.method9101(local1094);
		this.aClass359_1.method27976(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aek", name = "ai", descriptor = "(III[[ZZI)V", line = 499)
	@Override
	public void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass77Array3 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray41.length < local12) {
			this.anIntArray41 = new int[local12];
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
		if (local45 > this.anInt607 * -1924295585 - 1) {
			local45 = this.anInt607 * -1924295585 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt606 * -1466328823 - 1) {
			local64 = this.anInt606 * -1466328823 - 1;
		}
		this.anInt580 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray41[this.anInt580++] = local95 * this.anInt607 * -1924295585 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass86_Sub1_3.aByteBuffer7;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass77Array3.length; local135++) {
			@Pc(146) Class77_Sub10 local146 = (Class77_Sub10) this.aClass77Array3[local135];
			local146.method13313(this.anIntArray41, this.anInt580);
		}
		local135 = local130.position();
		@Pc(161) Class109 local161 = this.aClass86_Sub1_3.aClass109_3;
		this.aClass86_Sub1_3.method20600();
		if (this.aClass86_Sub1_3.anInt2841 > 0) {
			local161.aClass447_33.method29133((float) (this.aClass86_Sub1_3.anInt2840 >> 16 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_3.anInt2840 >> 8 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_3.anInt2840 >> 0 & 0xFF) / 255.0F);
			local161.aClass450_11.method29234(0.0F, 0.0F, 1.0F, -this.aClass86_Sub1_3.aFloat205);
			local161.aClass450_11.method29255(this.aClass86_Sub1_3.aClass442_80);
			local161.aClass450_11.method29253(1.0F / (this.aClass86_Sub1_3.aFloat206 - this.aClass86_Sub1_3.aFloat205));
		} else {
			local161.aClass450_11.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local161.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
		}
		if (local135 != 0) {
			@Pc(252) Interface38 local252 = this.aClass86_Sub1_3.method20454(local135 / 2);
			local252.method28755(0, local135, this.aClass86_Sub1_3.aLong121);
			this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
			this.aClass86_Sub1_3.method20659(local252);
			local161.method9101(Class442.aClass442_97);
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class77_Sub10 local293;
			@Pc(411) Class215 local411;
			if ((this.anInt571 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass77Array3.length; local282++) {
					local293 = (Class77_Sub10) this.aClass77Array3[local282];
					if (local293.anInt1474 != 0) {
						if (this.aClass86_Sub1_3.aBoolean447) {
							this.aClass86_Sub1_3.method20146(0, local293.aClass202_3);
							local161.aClass450_10.method29234(0.0F, 1.0F, 0.0F, (float) this.aClass86_Sub1_3.anInt2839 + (float) (local293.aClass202_3.anInt3555 * 1446227271) / 255.0F * (float) (local293.aClass202_3.anInt3553 * -1095140607));
							local161.aClass450_10.method29253(1.0F / (float) (local293.aClass202_3.anInt3553 * -1095140607));
							local161.aClass447_31.method29133((float) (local293.aClass202_3.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1472 == -1) {
							local161.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
						} else {
							local411 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
							local161.anInterface37_18 = this.aClass86_Sub1_3.aClass370_3.method28225(local411);
							local399 = !Class683.method36096(local411.aByte118);
						}
						this.aClass86_Sub1_3.method20670(1, local293.anInterface36_10);
						this.aClass86_Sub1_3.method20658(this.aClass113_7);
						local161.aClass442_48.method28979(1.0F / local293.aFloat145, 1.0F / local293.aFloat145, 1.0F, 1.0F);
						local161.anInt1089 = local293.anInt1475;
						local161.anInt1087 = local293.anInt1476 - local293.anInt1475 + 1;
						local161.anInt1090 = local280;
						local161.anInt1091 = local293.anInt1474 / 3;
						local161.method9117(local399);
						local280 += local293.anInt1474;
					}
				}
			} else {
				local161.aClass447_34.method29133(this.aClass86_Sub1_3.aFloatArray71[0], this.aClass86_Sub1_3.aFloatArray71[1], this.aClass86_Sub1_3.aFloatArray71[2]);
				local161.aClass447_35.method29133(this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat195, this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat209, this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat196);
				local161.aClass447_36.method29133(-this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat195, -this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat209, -this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat196);
				local161.aClass447_37.method29133(this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat195, this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat209, this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat196);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass77Array3.length; local282++) {
					local293 = (Class77_Sub10) this.aClass77Array3[local282];
					if (local293.anInt1474 > 0) {
						if (this.aClass86_Sub1_3.aBoolean447) {
							this.aClass86_Sub1_3.method20146(0, local293.aClass202_3);
							@Pc(613) float local613 = 0.15F;
							local161.aClass450_10.method29234(0.0F, 1.0F / ((float) (local293.aClass202_3.anInt3553 * -1095140607) * local613), 0.0F, 256.0F / ((float) (local293.aClass202_3.anInt3553 * -1095140607) * local613));
							local161.aClass447_31.method29133((float) (local293.aClass202_3.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1472 == -1) {
							local161.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
						} else {
							local411 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
							local693 = local411.aByte118;
							local161.anInterface37_18 = this.aClass86_Sub1_3.aClass370_3.method28225(local411);
							local161.method9097(local411.aByte119);
						}
						this.aClass86_Sub1_3.method20670(1, local293.anInterface36_10);
						this.aClass86_Sub1_3.method20658(this.aClass113_7);
						local161.aClass442_48.method28979(1.0F / local293.aFloat145, 1.0F / local293.aFloat145, 1.0F, 1.0F);
						local161.anInt1089 = local293.anInt1475;
						local161.anInt1087 = local293.anInt1476 - local293.anInt1475 + 1;
						local161.anInt1090 = local280;
						local161.anInt1091 = local293.anInt1474 / 3;
						switch(local693) {
							case 1:
								local161.aClass447_32.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
								if (this.aClass86_Sub1_3.aBoolean447) {
									local161.method9106();
								} else {
									local161.method9116(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass86_Sub1_3.aBoolean434 || (this.anInt571 & 0x8) == 0 || !this.aClass86_Sub1_3.aClass122_Sub1_Sub2_6.method18591()) {
									local161.method9103(0);
								} else {
									@Pc(802) Class122_Sub1_Sub2 local802 = this.aClass86_Sub1_3.aClass122_Sub1_Sub2_6;
									if (local693 == 2) {
										local802 = this.aClass86_Sub1_3.aClass122_Sub1_Sub2_5;
									}
									local802.aClass442_58.method28954(this.aClass86_Sub1_3.aClass442_84);
									local802.aClass442_59.method28979(1.0F / (local293.aFloat145 * (float) (local293.aClass202_3.anInt3556 * -108174347)), 1.0F / (local293.aFloat145 * (float) (local293.aClass202_3.anInt3556 * -108174347)), 1.0F, 1.0F);
									local802.aClass447_57.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
									@Pc(871) Class215 local871 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
									local802.anInt2599 = local871.aByte119 * 837530247;
									local802.anInt2602 = local293.anInt1475 * 2134526643;
									local802.anInt2601 = (local293.anInt1476 - local293.anInt1475 + 1) * 257007611;
									local802.anInt2600 = local280 * 1042457319;
									local802.anInt2603 = local293.anInt1474 / 3 * -1394271287;
									local802.aClass450_15.method29238(local161.aClass450_10);
									local802.aClass447_55.method29136(local161.aClass447_31);
									local802.aClass450_16.method29238(local161.aClass450_11);
									local802.aClass447_56.method29136(local161.aClass447_33);
									local802.method18595();
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass86_Sub1_3.aBoolean447) {
									local161.method9105();
								} else {
									local161.method9103(0);
								}
								break;
							case 6:
								local161.method9117(!Class683.method36096(local693));
								break;
							case 7:
								local161.aClass447_32.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
								local161.aClass442_49.method28951();
								local161.anInterface40_3 = this.aClass86_Sub1_3.method20458();
								local161.method9111(0);
						}
						local280 += local293.anInt1474;
					}
				}
			}
		}
		if (!this.aClass695_5.method36416()) {
			this.aClass86_Sub1_3.method20579(128);
			this.aClass86_Sub1_3.method20519(false);
			@Pc(1036) Class447 local1036 = new Class447(local161.aClass447_33);
			local161.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass695_5.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class77_Sub15 local1053 = (Class77_Sub15) local1046.next();
				local1053.method13420(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass447_33.method29136(local1036);
		}
		if (this.aClass359_1 == null) {
			return;
		}
		this.aClass86_Sub1_3.method20579(1);
		this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
		this.aClass86_Sub1_3.method20670(1, this.anInterface36_5);
		this.aClass86_Sub1_3.method20658(this.aClass113_7);
		@Pc(1094) Class442 local1094 = this.aClass86_Sub1_3.aClass442_87;
		local1094.method28951();
		local1094.aFloatArray109[13] = -1.0F;
		local161.method9101(local1094);
		this.aClass359_1.method27976(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aek", name = "aj", descriptor = "(III[[ZZI)V", line = 499)
	@Override
	public void method5531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass77Array3 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray41.length < local12) {
			this.anIntArray41 = new int[local12];
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
		if (local45 > this.anInt607 * -1924295585 - 1) {
			local45 = this.anInt607 * -1924295585 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt606 * -1466328823 - 1) {
			local64 = this.anInt606 * -1466328823 - 1;
		}
		this.anInt580 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray41[this.anInt580++] = local95 * this.anInt607 * -1924295585 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass86_Sub1_3.aByteBuffer7;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass77Array3.length; local135++) {
			@Pc(146) Class77_Sub10 local146 = (Class77_Sub10) this.aClass77Array3[local135];
			local146.method13313(this.anIntArray41, this.anInt580);
		}
		local135 = local130.position();
		@Pc(161) Class109 local161 = this.aClass86_Sub1_3.aClass109_3;
		this.aClass86_Sub1_3.method20600();
		if (this.aClass86_Sub1_3.anInt2841 > 0) {
			local161.aClass447_33.method29133((float) (this.aClass86_Sub1_3.anInt2840 >> 16 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_3.anInt2840 >> 8 & 0xFF) / 255.0F, (float) (this.aClass86_Sub1_3.anInt2840 >> 0 & 0xFF) / 255.0F);
			local161.aClass450_11.method29234(0.0F, 0.0F, 1.0F, -this.aClass86_Sub1_3.aFloat205);
			local161.aClass450_11.method29255(this.aClass86_Sub1_3.aClass442_80);
			local161.aClass450_11.method29253(1.0F / (this.aClass86_Sub1_3.aFloat206 - this.aClass86_Sub1_3.aFloat205));
		} else {
			local161.aClass450_11.method29234(0.0F, 0.0F, 0.0F, 0.0F);
			local161.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
		}
		if (local135 != 0) {
			@Pc(252) Interface38 local252 = this.aClass86_Sub1_3.method20454(local135 / 2);
			local252.method28755(0, local135, this.aClass86_Sub1_3.aLong121);
			this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
			this.aClass86_Sub1_3.method20659(local252);
			local161.method9101(Class442.aClass442_97);
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class77_Sub10 local293;
			@Pc(411) Class215 local411;
			if ((this.anInt571 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass77Array3.length; local282++) {
					local293 = (Class77_Sub10) this.aClass77Array3[local282];
					if (local293.anInt1474 != 0) {
						if (this.aClass86_Sub1_3.aBoolean447) {
							this.aClass86_Sub1_3.method20146(0, local293.aClass202_3);
							local161.aClass450_10.method29234(0.0F, 1.0F, 0.0F, (float) this.aClass86_Sub1_3.anInt2839 + (float) (local293.aClass202_3.anInt3555 * 1446227271) / 255.0F * (float) (local293.aClass202_3.anInt3553 * -1095140607));
							local161.aClass450_10.method29253(1.0F / (float) (local293.aClass202_3.anInt3553 * -1095140607));
							local161.aClass447_31.method29133((float) (local293.aClass202_3.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1472 == -1) {
							local161.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
						} else {
							local411 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
							local161.anInterface37_18 = this.aClass86_Sub1_3.aClass370_3.method28225(local411);
							local399 = !Class683.method36096(local411.aByte118);
						}
						this.aClass86_Sub1_3.method20670(1, local293.anInterface36_10);
						this.aClass86_Sub1_3.method20658(this.aClass113_7);
						local161.aClass442_48.method28979(1.0F / local293.aFloat145, 1.0F / local293.aFloat145, 1.0F, 1.0F);
						local161.anInt1089 = local293.anInt1475;
						local161.anInt1087 = local293.anInt1476 - local293.anInt1475 + 1;
						local161.anInt1090 = local280;
						local161.anInt1091 = local293.anInt1474 / 3;
						local161.method9117(local399);
						local280 += local293.anInt1474;
					}
				}
			} else {
				local161.aClass447_34.method29133(this.aClass86_Sub1_3.aFloatArray71[0], this.aClass86_Sub1_3.aFloatArray71[1], this.aClass86_Sub1_3.aFloatArray71[2]);
				local161.aClass447_35.method29133(this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat195, this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat209, this.aClass86_Sub1_3.aFloat204 * this.aClass86_Sub1_3.aFloat196);
				local161.aClass447_36.method29133(-this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat195, -this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat209, -this.aClass86_Sub1_3.aFloat208 * this.aClass86_Sub1_3.aFloat196);
				local161.aClass447_37.method29133(this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat195, this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat209, this.aClass86_Sub1_3.aFloat203 * this.aClass86_Sub1_3.aFloat196);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass77Array3.length; local282++) {
					local293 = (Class77_Sub10) this.aClass77Array3[local282];
					if (local293.anInt1474 > 0) {
						if (this.aClass86_Sub1_3.aBoolean447) {
							this.aClass86_Sub1_3.method20146(0, local293.aClass202_3);
							@Pc(613) float local613 = 0.15F;
							local161.aClass450_10.method29234(0.0F, 1.0F / ((float) (local293.aClass202_3.anInt3553 * -1095140607) * local613), 0.0F, 256.0F / ((float) (local293.aClass202_3.anInt3553 * -1095140607) * local613));
							local161.aClass447_31.method29133((float) (local293.aClass202_3.anInt3554 * 2113275141 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass202_3.anInt3554 * 2113275141 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1472 == -1) {
							local161.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
						} else {
							local411 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
							local693 = local411.aByte118;
							local161.anInterface37_18 = this.aClass86_Sub1_3.aClass370_3.method28225(local411);
							local161.method9097(local411.aByte119);
						}
						this.aClass86_Sub1_3.method20670(1, local293.anInterface36_10);
						this.aClass86_Sub1_3.method20658(this.aClass113_7);
						local161.aClass442_48.method28979(1.0F / local293.aFloat145, 1.0F / local293.aFloat145, 1.0F, 1.0F);
						local161.anInt1089 = local293.anInt1475;
						local161.anInt1087 = local293.anInt1476 - local293.anInt1475 + 1;
						local161.anInt1090 = local280;
						local161.anInt1091 = local293.anInt1474 / 3;
						switch(local693) {
							case 1:
								local161.aClass447_32.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
								if (this.aClass86_Sub1_3.aBoolean447) {
									local161.method9106();
								} else {
									local161.method9116(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass86_Sub1_3.aBoolean434 || (this.anInt571 & 0x8) == 0 || !this.aClass86_Sub1_3.aClass122_Sub1_Sub2_6.method18591()) {
									local161.method9103(0);
								} else {
									@Pc(802) Class122_Sub1_Sub2 local802 = this.aClass86_Sub1_3.aClass122_Sub1_Sub2_6;
									if (local693 == 2) {
										local802 = this.aClass86_Sub1_3.aClass122_Sub1_Sub2_5;
									}
									local802.aClass442_58.method28954(this.aClass86_Sub1_3.aClass442_84);
									local802.aClass442_59.method28979(1.0F / (local293.aFloat145 * (float) (local293.aClass202_3.anInt3556 * -108174347)), 1.0F / (local293.aFloat145 * (float) (local293.aClass202_3.anInt3556 * -108174347)), 1.0F, 1.0F);
									local802.aClass447_57.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
									@Pc(871) Class215 local871 = this.aClass86_Sub1_3.aClass209_9.method25584(local293.anInt1472);
									local802.anInt2599 = local871.aByte119 * 837530247;
									local802.anInt2602 = local293.anInt1475 * 2134526643;
									local802.anInt2601 = (local293.anInt1476 - local293.anInt1475 + 1) * 257007611;
									local802.anInt2600 = local280 * 1042457319;
									local802.anInt2603 = local293.anInt1474 / 3 * -1394271287;
									local802.aClass450_15.method29238(local161.aClass450_10);
									local802.aClass447_55.method29136(local161.aClass447_31);
									local802.aClass450_16.method29238(local161.aClass450_11);
									local802.aClass447_56.method29136(local161.aClass447_33);
									local802.method18595();
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass86_Sub1_3.aBoolean447) {
									local161.method9105();
								} else {
									local161.method9103(0);
								}
								break;
							case 6:
								local161.method9117(!Class683.method36096(local693));
								break;
							case 7:
								local161.aClass447_32.method29133(this.aClass86_Sub1_3.aClass442_78.aFloatArray109[12], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[13], this.aClass86_Sub1_3.aClass442_78.aFloatArray109[14]);
								local161.aClass442_49.method28951();
								local161.anInterface40_3 = this.aClass86_Sub1_3.method20458();
								local161.method9111(0);
						}
						local280 += local293.anInt1474;
					}
				}
			}
		}
		if (!this.aClass695_5.method36416()) {
			this.aClass86_Sub1_3.method20579(128);
			this.aClass86_Sub1_3.method20519(false);
			@Pc(1036) Class447 local1036 = new Class447(local161.aClass447_33);
			local161.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass695_5.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class77_Sub15 local1053 = (Class77_Sub15) local1046.next();
				local1053.method13420(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass447_33.method29136(local1036);
		}
		if (this.aClass359_1 == null) {
			return;
		}
		this.aClass86_Sub1_3.method20579(1);
		this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
		this.aClass86_Sub1_3.method20670(1, this.anInterface36_5);
		this.aClass86_Sub1_3.method20658(this.aClass113_7);
		@Pc(1094) Class442 local1094 = this.aClass86_Sub1_3.aClass442_87;
		local1094.method28951();
		local1094.aFloatArray109[13] = -1.0F;
		local161.method9101(local1094);
		this.aClass359_1.method27976(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aek", name = "w", descriptor = "(IIIIIII[[Z)V", line = 707)
	@Override
	public void method5540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		if (this.anInt576 <= 0) {
			return;
		}
		@Pc(9) Interface38 local9 = this.aClass86_Sub1_3.method20454(this.anInt573);
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 32767;
		@Pc(15) int local15 = -32768;
		@Pc(19) ByteBuffer local19 = this.aClass86_Sub1_3.aByteBuffer7;
		local19.clear();
		for (@Pc(24) int local24 = arg4; local24 < arg6; local24++) {
			@Pc(36) int local36 = local24 * this.anInt607 * -1924295585 + arg3;
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
		local9.method28755(0, local19.position(), this.aClass86_Sub1_3.aLong121);
		if (local11 <= 0) {
			return;
		}
		this.aClass86_Sub1_3.method20600();
		@Pc(111) Class109 local111 = this.aClass86_Sub1_3.aClass109_3;
		this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
		this.aClass86_Sub1_3.method20670(1, this.anInterface36_5);
		this.aClass86_Sub1_3.method20658(this.aClass113_7);
		this.aClass86_Sub1_3.method20659(local9);
		this.aClass86_Sub1_3.method20121(Class455.aClass455_53);
		@Pc(143) float local143 = (float) this.aClass86_Sub1_3.method19940().method23491();
		@Pc(150) float local150 = (float) this.aClass86_Sub1_3.method19940().method23493();
		@Pc(154) Class455 local154 = new Class455();
		@Pc(158) Class455 local158 = new Class455();
		local154.method29404(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		local158.method29423((float) arg2 / ((float) (this.anInt608 * 127780559) * 256.0F), (float) -arg2 / ((float) (this.anInt608 * 127780559) * 256.0F), 1.0F / (this.aFloat34 - this.aFloat35));
		local158.method29436((float) arg0 - (float) (arg3 * arg2) / 256.0F, (float) arg1 + (float) (arg6 * arg2) / 256.0F, -this.aFloat35 / (this.aFloat34 - this.aFloat35));
		local158.method29424(2.0F / local143, 2.0F / local150, 1.0F);
		local158.method29436(-1.0F, -1.0F, 0.0F);
		this.aClass86_Sub1_3.aClass455_38.method29441(local154, local158);
		this.aClass86_Sub1_3.aClass442_87.method28969(this.aClass86_Sub1_3.aClass455_38);
		this.aClass86_Sub1_3.method20123(this.aClass86_Sub1_3.aClass442_87);
		local111.method9101(Class442.aClass442_97);
		local111.aClass450_11.method29234(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
		local111.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
		local111.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
		local111.aClass442_48.method28951();
		local111.anInt1089 = local13;
		local111.anInt1087 = local15 - local13 + 1;
		local111.anInt1090 = 0;
		local111.anInt1091 = local11 / 3;
		if (this.aClass86_Sub1_3.aBoolean440) {
			this.aClass86_Sub1_3.method20230(false);
			local111.method9117(false);
			this.aClass86_Sub1_3.method20230(true);
		} else {
			local111.method9117(false);
		}
	}

	@OriginalMember(owner = "client!aek", name = "ag", descriptor = "(IIIIIII[[Z)V", line = 707)
	@Override
	public void method5533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		if (this.anInt576 <= 0) {
			return;
		}
		@Pc(9) Interface38 local9 = this.aClass86_Sub1_3.method20454(this.anInt573);
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 32767;
		@Pc(15) int local15 = -32768;
		@Pc(19) ByteBuffer local19 = this.aClass86_Sub1_3.aByteBuffer7;
		local19.clear();
		for (@Pc(24) int local24 = arg4; local24 < arg6; local24++) {
			@Pc(36) int local36 = local24 * this.anInt607 * -1924295585 + arg3;
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
		local9.method28755(0, local19.position(), this.aClass86_Sub1_3.aLong121);
		if (local11 <= 0) {
			return;
		}
		this.aClass86_Sub1_3.method20600();
		@Pc(111) Class109 local111 = this.aClass86_Sub1_3.aClass109_3;
		this.aClass86_Sub1_3.method20670(0, this.anInterface36_4);
		this.aClass86_Sub1_3.method20670(1, this.anInterface36_5);
		this.aClass86_Sub1_3.method20658(this.aClass113_7);
		this.aClass86_Sub1_3.method20659(local9);
		this.aClass86_Sub1_3.method20121(Class455.aClass455_53);
		@Pc(143) float local143 = (float) this.aClass86_Sub1_3.method19940().method23491();
		@Pc(150) float local150 = (float) this.aClass86_Sub1_3.method19940().method23493();
		@Pc(154) Class455 local154 = new Class455();
		@Pc(158) Class455 local158 = new Class455();
		local154.method29404(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		local158.method29423((float) arg2 / ((float) (this.anInt608 * 127780559) * 256.0F), (float) -arg2 / ((float) (this.anInt608 * 127780559) * 256.0F), 1.0F / (this.aFloat34 - this.aFloat35));
		local158.method29436((float) arg0 - (float) (arg3 * arg2) / 256.0F, (float) arg1 + (float) (arg6 * arg2) / 256.0F, -this.aFloat35 / (this.aFloat34 - this.aFloat35));
		local158.method29424(2.0F / local143, 2.0F / local150, 1.0F);
		local158.method29436(-1.0F, -1.0F, 0.0F);
		this.aClass86_Sub1_3.aClass455_38.method29441(local154, local158);
		this.aClass86_Sub1_3.aClass442_87.method28969(this.aClass86_Sub1_3.aClass455_38);
		this.aClass86_Sub1_3.method20123(this.aClass86_Sub1_3.aClass442_87);
		local111.method9101(Class442.aClass442_97);
		local111.aClass450_11.method29234(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass447_33.method29133(0.0F, 0.0F, 0.0F);
		local111.aClass450_10.method29234(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass447_31.method29133(0.0F, 0.0F, 0.0F);
		local111.anInterface37_18 = this.aClass86_Sub1_3.anInterface37_23;
		local111.aClass442_48.method28951();
		local111.anInt1089 = local13;
		local111.anInt1087 = local15 - local13 + 1;
		local111.anInt1090 = 0;
		local111.anInt1091 = local11 / 3;
		if (this.aClass86_Sub1_3.aBoolean440) {
			this.aClass86_Sub1_3.method20230(false);
			local111.method9117(false);
			this.aClass86_Sub1_3.method20230(true);
		} else {
			local111.method9117(false);
		}
	}

	@OriginalMember(owner = "client!aek", name = "s", descriptor = "(IILclient!arp;)Lclient!arp;", line = 774)
	@Override
	public Class77_Sub1_Sub16 method5539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		if ((this.aByteArrayArray4[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt608 * 127780559 >> this.aClass86_Sub1_3.anInt2830;
		@Pc(22) Class77_Sub1_Sub16_Sub2 local22 = (Class77_Sub1_Sub16_Sub2) arg2;
		@Pc(31) Class77_Sub1_Sub16_Sub2 local31;
		if (local22 != null && local22.method23588(local19, local19)) {
			local31 = local22;
			local22.method23590();
		} else {
			local31 = new Class77_Sub1_Sub16_Sub2(this.aClass86_Sub1_3, local19, local19);
		}
		local31.method23586(0, 0, local19, local19);
		this.method5110(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aek", name = "ao", descriptor = "(IILclient!arp;)Lclient!arp;", line = 774)
	@Override
	public Class77_Sub1_Sub16 method5541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		if ((this.aByteArrayArray4[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt608 * 127780559 >> this.aClass86_Sub1_3.anInt2830;
		@Pc(22) Class77_Sub1_Sub16_Sub2 local22 = (Class77_Sub1_Sub16_Sub2) arg2;
		@Pc(31) Class77_Sub1_Sub16_Sub2 local31;
		if (local22 != null && local22.method23588(local19, local19)) {
			local31 = local22;
			local22.method23590();
		} else {
			local31 = new Class77_Sub1_Sub16_Sub2(this.aClass86_Sub1_3, local19, local19);
		}
		local31.method23586(0, 0, local19, local19);
		this.method5110(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aek", name = "al", descriptor = "(IILclient!arp;)Lclient!arp;", line = 774)
	@Override
	public Class77_Sub1_Sub16 method5534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		if ((this.aByteArrayArray4[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt608 * 127780559 >> this.aClass86_Sub1_3.anInt2830;
		@Pc(22) Class77_Sub1_Sub16_Sub2 local22 = (Class77_Sub1_Sub16_Sub2) arg2;
		@Pc(31) Class77_Sub1_Sub16_Sub2 local31;
		if (local22 != null && local22.method23588(local19, local19)) {
			local31 = local22;
			local22.method23590();
		} else {
			local31 = new Class77_Sub1_Sub16_Sub2(this.aClass86_Sub1_3, local19, local19);
		}
		local31.method23586(0, 0, local19, local19);
		this.method5110(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aek", name = "ak", descriptor = "(IILclient!arp;)Lclient!arp;", line = 774)
	@Override
	public Class77_Sub1_Sub16 method5535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		if ((this.aByteArrayArray4[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt608 * 127780559 >> this.aClass86_Sub1_3.anInt2830;
		@Pc(22) Class77_Sub1_Sub16_Sub2 local22 = (Class77_Sub1_Sub16_Sub2) arg2;
		@Pc(31) Class77_Sub1_Sub16_Sub2 local31;
		if (local22 != null && local22.method23588(local19, local19)) {
			local31 = local22;
			local22.method23590();
		} else {
			local31 = new Class77_Sub1_Sub16_Sub2(this.aClass86_Sub1_3, local19, local19);
		}
		local31.method23586(0, 0, local19, local19);
		this.method5110(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aek", name = "au", descriptor = "(IILclient!arp;)Lclient!arp;", line = 774)
	@Override
	public Class77_Sub1_Sub16 method5515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		if ((this.aByteArrayArray4[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt608 * 127780559 >> this.aClass86_Sub1_3.anInt2830;
		@Pc(22) Class77_Sub1_Sub16_Sub2 local22 = (Class77_Sub1_Sub16_Sub2) arg2;
		@Pc(31) Class77_Sub1_Sub16_Sub2 local31;
		if (local22 != null && local22.method23588(local19, local19)) {
			local31 = local22;
			local22.method23590();
		} else {
			local31 = new Class77_Sub1_Sub16_Sub2(this.aClass86_Sub1_3, local19, local19);
		}
		local31.method23586(0, 0, local19, local19);
		this.method5110(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aek", name = "ax", descriptor = "(IILclient!arp;)Lclient!arp;", line = 774)
	@Override
	public Class77_Sub1_Sub16 method5537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		if ((this.aByteArrayArray4[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt608 * 127780559 >> this.aClass86_Sub1_3.anInt2830;
		@Pc(22) Class77_Sub1_Sub16_Sub2 local22 = (Class77_Sub1_Sub16_Sub2) arg2;
		@Pc(31) Class77_Sub1_Sub16_Sub2 local31;
		if (local22 != null && local22.method23588(local19, local19)) {
			local31 = local22;
			local22.method23590();
		} else {
			local31 = new Class77_Sub1_Sub16_Sub2(this.aClass86_Sub1_3, local19, local19);
		}
		local31.method23586(0, 0, local19, local19);
		this.method5110(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aek", name = "ar", descriptor = "(IILclient!arp;)Lclient!arp;", line = 774)
	@Override
	public Class77_Sub1_Sub16 method5538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub16 arg2) {
		if ((this.aByteArrayArray4[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt608 * 127780559 >> this.aClass86_Sub1_3.anInt2830;
		@Pc(22) Class77_Sub1_Sub16_Sub2 local22 = (Class77_Sub1_Sub16_Sub2) arg2;
		@Pc(31) Class77_Sub1_Sub16_Sub2 local31;
		if (local22 != null && local22.method23588(local19, local19)) {
			local31 = local22;
			local22.method23590();
		} else {
			local31 = new Class77_Sub1_Sub16_Sub2(this.aClass86_Sub1_3, local19, local19);
		}
		local31.method23586(0, 0, local19, local19);
		this.method5110(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aek", name = "ba", descriptor = "(Lclient!asy;II)V", line = 789)
	void method5110(@OriginalArg(0) Class77_Sub1_Sub16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray7[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray9[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.anIntArray42.length < local16) {
			this.anIntArray42 = new int[local16];
			this.anIntArray43 = new int[local16];
		}
		@Pc(31) int local31;
		for (local31 = 0; local31 < local16; local31++) {
			this.anIntArray42[local31] = local6[local31] >> this.aClass86_Sub1_3.anInt2830;
			this.anIntArray43[local31] = local13[local31] >> this.aClass86_Sub1_3.anInt2830;
		}
		local31 = 0;
		while (local31 < local16) {
			@Pc(68) int local68 = this.anIntArray42[local31];
			@Pc(74) int local74 = this.anIntArray43[local31++];
			@Pc(79) int local79 = this.anIntArray42[local31];
			@Pc(85) int local85 = this.anIntArray43[local31++];
			@Pc(90) int local90 = this.anIntArray42[local31];
			@Pc(96) int local96 = this.anIntArray43[local31++];
			if ((local68 - local79) * (local85 - local96) - (local85 - local74) * (local90 - local79) > 0) {
				arg0.method23593(local74, local85, local96, local68, local79, local90);
			}
		}
	}

	@OriginalMember(owner = "client!aek", name = "bi", descriptor = "(Lclient!asy;II)V", line = 789)
	void method5111(@OriginalArg(0) Class77_Sub1_Sub16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray7[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray9[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.anIntArray42.length < local16) {
			this.anIntArray42 = new int[local16];
			this.anIntArray43 = new int[local16];
		}
		@Pc(31) int local31;
		for (local31 = 0; local31 < local16; local31++) {
			this.anIntArray42[local31] = local6[local31] >> this.aClass86_Sub1_3.anInt2830;
			this.anIntArray43[local31] = local13[local31] >> this.aClass86_Sub1_3.anInt2830;
		}
		local31 = 0;
		while (local31 < local16) {
			@Pc(68) int local68 = this.anIntArray42[local31];
			@Pc(74) int local74 = this.anIntArray43[local31++];
			@Pc(79) int local79 = this.anIntArray42[local31];
			@Pc(85) int local85 = this.anIntArray43[local31++];
			@Pc(90) int local90 = this.anIntArray42[local31];
			@Pc(96) int local96 = this.anIntArray43[local31++];
			if ((local68 - local79) * (local85 - local96) - (local85 - local74) * (local90 - local79) > 0) {
				arg0.method23593(local74, local85, local96, local68, local79, local90);
			}
		}
	}

	@OriginalMember(owner = "client!aek", name = "ae", descriptor = "(Lclient!arp;IIIIZ)Z", line = 814)
	@Override
	public boolean method5513(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass359_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass86_Sub1_3.anInt2831 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass86_Sub1_3.anInt2851 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			return this.aClass359_1.method27986(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aek", name = "z", descriptor = "(Lclient!arp;IIIIZ)Z", line = 814)
	@Override
	public boolean method5518(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass359_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass86_Sub1_3.anInt2831 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass86_Sub1_3.anInt2851 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			return this.aClass359_1.method27986(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aek", name = "ac", descriptor = "(Lclient!arp;IIIIZ)V", line = 821)
	@Override
	public void method5532(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass359_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub1_3.anInt2831 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub1_3.anInt2851 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			this.aClass359_1.method27978(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aek", name = "ad", descriptor = "(Lclient!arp;IIIIZ)V", line = 821)
	@Override
	public void method5527(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass359_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub1_3.anInt2831 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub1_3.anInt2851 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			this.aClass359_1.method27978(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aek", name = "av", descriptor = "(Lclient!arp;IIIIZ)V", line = 821)
	@Override
	public void method5519(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass359_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub1_3.anInt2831 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub1_3.anInt2851 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			this.aClass359_1.method27978(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aek", name = "at", descriptor = "(Lclient!arp;IIIIZ)V", line = 821)
	@Override
	public void method5542(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass359_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub1_3.anInt2831 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub1_3.anInt2851 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			this.aClass359_1.method27978(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aek", name = "r", descriptor = "(Lclient!arp;IIIIZ)V", line = 821)
	@Override
	public void method5516(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass359_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub1_3.anInt2831 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub1_3.anInt2851 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			this.aClass359_1.method27978(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aek", name = "ah", descriptor = "(Lclient!arp;IIIIZ)V", line = 828)
	@Override
	public void method5544(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass359_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub1_3.anInt2831 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub1_3.anInt2851 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			this.aClass359_1.method27985(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aek", name = "g", descriptor = "(Lclient!arp;IIIIZ)V", line = 828)
	@Override
	public void method5517(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass359_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub1_3.anInt2831 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub1_3.anInt2851 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			this.aClass359_1.method27985(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aek", name = "as", descriptor = "(Lclient!arp;IIIIZ)V", line = 828)
	@Override
	public void method5545(@OriginalArg(0) Class77_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass359_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass86_Sub1_3.anInt2831 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass86_Sub1_3.anInt2851 >> 8) >> this.aClass86_Sub1_3.anInt2830;
			this.aClass359_1.method27985(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aek", name = "j", descriptor = "(Lclient!ajv;[I)V", line = 835)
	@Override
	public void method5543(@OriginalArg(0) Class77_Sub22 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass695_5.method36383(new Class77_Sub15(this.aClass86_Sub1_3, this, arg0, arg1));
	}

	@OriginalMember(owner = "client!aek", name = "aq", descriptor = "(Lclient!ajv;[I)V", line = 835)
	@Override
	public void method5512(@OriginalArg(0) Class77_Sub22 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass695_5.method36383(new Class77_Sub15(this.aClass86_Sub1_3, this, arg0, arg1));
	}
}
