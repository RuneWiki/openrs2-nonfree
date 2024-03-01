package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class Class439 {

	@OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
	public static final int anInt4923 = 1;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
	public static final int anInt4924 = 4;

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
	public static final int anInt4925 = 8;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
	public static final int anInt4926 = 16;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
	public static final int anInt4927 = 2;

	@OriginalMember(owner = "client!rq", name = "x", descriptor = "B")
	final byte aByte162;

	@OriginalMember(owner = "client!rq", name = "s", descriptor = "B")
	final byte aByte161;

	@OriginalMember(owner = "client!rq", name = "z", descriptor = "[I")
	final int[] anIntArray438;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "[I")
	final int[] anIntArray439;

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "[I")
	final int[] anIntArray437;

	@OriginalMember(owner = "client!rq", name = "u", descriptor = "S")
	final short aShort173;

	@OriginalMember(owner = "client!rq", name = "y", descriptor = "S")
	final short aShort176;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "S")
	final short aShort174;

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "S")
	final short aShort175;

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "[S")
	final short[] aShortArray112;

	@OriginalMember(owner = "client!rq", name = "r", descriptor = "[S")
	final short[] aShortArray113;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "[S")
	final short[] aShortArray111;

	@OriginalMember(owner = "client!rq", name = "p", descriptor = "([Ljava/lang/String;[SB)V", line = 9)
	public static void method28216(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Class312.method25817(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!rp;IIIIIIIIIIIIII)V", line = 24)
	Class439(@OriginalArg(0) Class438 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		this.aByte162 = (byte) arg1;
		this.aByte161 = (byte) arg2;
		this.anIntArray438 = new int[4];
		this.anIntArray439 = new int[4];
		this.anIntArray437 = new int[4];
		this.anIntArray438[0] = arg3;
		this.anIntArray438[1] = arg4;
		this.anIntArray438[2] = arg5;
		this.anIntArray438[3] = arg6;
		this.anIntArray439[0] = arg7;
		this.anIntArray439[1] = arg8;
		this.anIntArray439[2] = arg9;
		this.anIntArray439[3] = arg10;
		this.anIntArray437[0] = arg11;
		this.anIntArray437[1] = arg12;
		this.anIntArray437[2] = arg13;
		this.anIntArray437[3] = arg14;
		this.aShort173 = (short) (arg3 >> arg0.anInt4895 * 1563265935);
		this.aShort176 = (short) (arg5 >> arg0.anInt4895 * 1563265935);
		this.aShort174 = (short) (arg11 >> arg0.anInt4895 * 1563265935);
		this.aShort175 = (short) (arg13 >> arg0.anInt4895 * 1563265935);
		this.aShortArray112 = new short[4];
		this.aShortArray113 = new short[4];
		this.aShortArray111 = new short[4];
	}

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "(B)V", line = 336)
	static void method28218() {
	}

	@OriginalMember(owner = "client!rq", name = "atr", descriptor = "(Lclient!vs;B)V", line = 12378)
	static final void method28217(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub9_1.method13342() ? 1 : 0;
	}
}
