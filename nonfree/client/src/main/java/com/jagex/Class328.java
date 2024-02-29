package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public class Class328 {

	@OriginalMember(owner = "client!ip", name = "p", descriptor = "J")
	public long aLong257;

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "[I")
	public int[] anIntArray434;

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "[F")
	float[] aFloatArray101;

	@OriginalMember(owner = "client!ip", name = "l", descriptor = "[[I")
	int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!ip", name = "y", descriptor = "[[I")
	int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "[S")
	public short[] aShortArray114;

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "[S")
	public short[] aShortArray115;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(J[I[F[[I[[I[S[S)V", line = 12)
	public Class328(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) short[] arg6) {
		this.aLong257 = arg0 * 8855449811293583851L;
		this.anIntArray434 = arg1;
		this.aFloatArray101 = arg2;
		this.anIntArrayArray52 = arg3;
		this.anIntArrayArray53 = arg4;
		this.aShortArray114 = arg5;
		this.aShortArray115 = arg6;
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!iw;Z)V", line = 22)
	public Class328(@OriginalArg(0) Class333 arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.anIntArray434 = new int[arg0.anIntArray435.length];
			this.aFloatArray101 = new float[arg0.anIntArray435.length];
			this.anIntArrayArray52 = new int[arg0.anIntArray435.length][3];
			this.anIntArrayArray53 = new int[arg0.anIntArray435.length][3];
			System.arraycopy(arg0.anIntArray435, 0, this.anIntArray434, 0, this.anIntArray434.length);
		} else {
			this.anIntArray434 = new int[arg0.anIntArray436.length];
			this.aFloatArray101 = new float[arg0.anIntArray436.length];
			this.anIntArrayArray52 = new int[arg0.anIntArray436.length][3];
			this.anIntArrayArray53 = new int[arg0.anIntArray436.length][3];
			System.arraycopy(arg0.anIntArray436, 0, this.anIntArray434, 0, this.anIntArray434.length);
		}
		if (arg0.aShortArray117 != null) {
			this.aShortArray114 = new short[arg0.aShortArray117.length];
			System.arraycopy(arg0.aShortArray117, 0, this.aShortArray114, 0, this.aShortArray114.length);
		}
		if (arg0.aShortArray119 != null) {
			this.aShortArray115 = new short[arg0.aShortArray119.length];
			System.arraycopy(arg0.aShortArray119, 0, this.aShortArray115, 0, this.aShortArray115.length);
		}
	}

	@OriginalMember(owner = "client!ip", name = "dg", descriptor = "(Lclient!yf;I)V", line = 5192)
	static final void method27578(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class347.method27850(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ip", name = "hx", descriptor = "(Lclient!yf;I)V", line = 5933)
	static final void method27579(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class294.method27029(local16, local22, arg0, Class283.aClass283_4);
	}

	@OriginalMember(owner = "client!ip", name = "ps", descriptor = "(Lclient!yf;I)V", line = 7370)
	static final void method27580(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class212.method25612(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ip", name = "adb", descriptor = "(Lclient!yf;I)V", line = 9853)
	static final void method27581(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= -1374580330;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class680.method36070(local14, local25);
	}
}
