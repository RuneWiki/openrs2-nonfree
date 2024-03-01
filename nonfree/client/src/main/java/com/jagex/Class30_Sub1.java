package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adb")
public class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!adb", name = "ii", descriptor = "Lclient!ow;")
	public static Class379 aClass379_1;

	@OriginalMember(owner = "client!adb", name = "jh", descriptor = "I")
	static int anInt770;

	@OriginalMember(owner = "client!adb", name = "a", descriptor = "I")
	int anInt769;

	@OriginalMember(owner = "client!adb", name = "g", descriptor = "Lclient!mh;")
	final Class320 aClass320_15 = new Class320(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!adb", name = "l", descriptor = "Lclient!mh;")
	final Class320 aClass320_16 = new Class320(Float.NaN, Float.NaN, Float.NaN);

	@OriginalMember(owner = "client!adb", name = "h", descriptor = "Lclient!mh;")
	final Class320 aClass320_14 = new Class320();

	@OriginalMember(owner = "client!adb", name = "<init>", descriptor = "(Lclient!ha;)V", line = 17)
	public Class30_Sub1(@OriginalArg(0) Class23 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!adb", name = "k", descriptor = "(Lclient!agq;B)V", line = 21)
	public void method7446(@OriginalArg(0) Class3_Sub32 arg0) {
		this.aClass320_16.aFloat259 = arg0.anInt1343 * 2061226997;
		this.aClass320_16.aFloat260 = arg0.anInt1345 * -799586411;
		this.aClass320_16.aFloat261 = arg0.anInt1344 * 615450365;
		if (Float.isNaN(this.aClass320_15.aFloat259)) {
			this.aClass320_15.method25893(this.aClass320_16);
			this.aClass320_14.method25868();
		}
		this.anInt769 = arg0.anInt1342 * -1462404233;
	}

	@OriginalMember(owner = "client!adb", name = "at", descriptor = "(Lclient!agq;)V", line = 21)
	public void method7447(@OriginalArg(0) Class3_Sub32 arg0) {
		this.aClass320_16.aFloat259 = arg0.anInt1343 * 2061226997;
		this.aClass320_16.aFloat260 = arg0.anInt1345 * -799586411;
		this.aClass320_16.aFloat261 = arg0.anInt1344 * 615450365;
		if (Float.isNaN(this.aClass320_15.aFloat259)) {
			this.aClass320_15.method25893(this.aClass320_16);
			this.aClass320_14.method25868();
		}
		this.anInt769 = arg0.anInt1342 * -1462404233;
	}

	@OriginalMember(owner = "client!adb", name = "p", descriptor = "(F[[[ILclient!ni;III)V", line = 32)
	@Override
	public void method16447(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass23_13.method5800(true, arg0, this.aClass320_15, this.aClass23_13.method5838(), this.aClass320_16, this.aClass320_14);
	}

	@OriginalMember(owner = "client!adb", name = "c", descriptor = "(F[[[ILclient!ni;II)V", line = 32)
	@Override
	public void method16439(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass23_13.method5800(true, arg0, this.aClass320_15, this.aClass23_13.method5838(), this.aClass320_16, this.aClass320_14);
	}

	@OriginalMember(owner = "client!adb", name = "y", descriptor = "(F[[[ILclient!ni;II)V", line = 32)
	@Override
	public void method16432(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass23_13.method5800(true, arg0, this.aClass320_15, this.aClass23_13.method5838(), this.aClass320_16, this.aClass320_14);
	}

	@OriginalMember(owner = "client!adb", name = "b", descriptor = "(F[[[ILclient!ni;II)V", line = 32)
	@Override
	public void method16440(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass23_13.method5800(true, arg0, this.aClass320_15, this.aClass23_13.method5838(), this.aClass320_16, this.aClass320_14);
	}

	@OriginalMember(owner = "client!adb", name = "z", descriptor = "(F[[[ILclient!ni;II)V", line = 32)
	@Override
	public void method16435(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass23_13.method5800(true, arg0, this.aClass320_15, this.aClass23_13.method5838(), this.aClass320_16, this.aClass320_14);
	}

	@OriginalMember(owner = "client!adb", name = "a", descriptor = "(I)Z", line = 36)
	@Override
	public boolean method16425() {
		return !Float.isNaN(this.aClass320_15.aFloat259);
	}

	@OriginalMember(owner = "client!adb", name = "j", descriptor = "()Z", line = 36)
	@Override
	public boolean method16434() {
		return !Float.isNaN(this.aClass320_15.aFloat259);
	}

	@OriginalMember(owner = "client!adb", name = "g", descriptor = "(I)Lclient!mh;", line = 40)
	@Override
	public Class320 method16426() {
		return Class320.method25906(this.aClass320_15);
	}

	@OriginalMember(owner = "client!adb", name = "e", descriptor = "()Lclient!mh;", line = 40)
	@Override
	public Class320 method16424() {
		return Class320.method25906(this.aClass320_15);
	}

	@OriginalMember(owner = "client!adb", name = "n", descriptor = "()Lclient!mh;", line = 40)
	@Override
	public Class320 method16437() {
		return Class320.method25906(this.aClass320_15);
	}

	@OriginalMember(owner = "client!adb", name = "r", descriptor = "()[D", line = 44)
	@Override
	public double[] method16446() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class320 local6 = this.method16426();
		local2[0] = local6.aFloat259;
		local2[1] = local6.aFloat260;
		local2[2] = local6.aFloat261;
		return local2;
	}

	@OriginalMember(owner = "client!adb", name = "l", descriptor = "(I)[D", line = 44)
	@Override
	public double[] method16427() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class320 local6 = this.method16426();
		local2[0] = local6.aFloat259;
		local2[1] = local6.aFloat260;
		local2[2] = local6.aFloat261;
		return local2;
	}

	@OriginalMember(owner = "client!adb", name = "d", descriptor = "()[D", line = 44)
	@Override
	public double[] method16423() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class320 local6 = this.method16426();
		local2[0] = local6.aFloat259;
		local2[1] = local6.aFloat260;
		local2[2] = local6.aFloat261;
		return local2;
	}

	@OriginalMember(owner = "client!adb", name = "q", descriptor = "()[D", line = 44)
	@Override
	public double[] method16438() {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) Class320 local6 = this.method16426();
		local2[0] = local6.aFloat259;
		local2[1] = local6.aFloat260;
		local2[2] = local6.aFloat261;
		return local2;
	}

	@OriginalMember(owner = "client!adb", name = "h", descriptor = "(I)Lclient!agq;", line = 53)
	@Override
	public Class3_Sub32 method16428() {
		return new Class3_Sub32(this.anInt769 * 690994697, (int) this.aClass320_15.aFloat259, (int) this.aClass320_15.aFloat260, (int) this.aClass320_15.aFloat261);
	}

	@OriginalMember(owner = "client!adb", name = "m", descriptor = "()Lclient!agq;", line = 53)
	@Override
	public Class3_Sub32 method16441() {
		return new Class3_Sub32(this.anInt769 * 690994697, (int) this.aClass320_15.aFloat259, (int) this.aClass320_15.aFloat260, (int) this.aClass320_15.aFloat261);
	}

	@OriginalMember(owner = "client!adb", name = "x", descriptor = "(I)F", line = 57)
	@Override
	public float method16429() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!adb", name = "t", descriptor = "()F", line = 57)
	@Override
	public float method16443() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!adb", name = "v", descriptor = "()F", line = 57)
	@Override
	public float method16442() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!adb", name = "s", descriptor = "(Lclient!gu;III)V", line = 61)
	@Override
	public void method16430(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt3702 = ((int) this.aClass320_15.aFloat259 - arg1) * 1932748257;
		arg0.anInt3700 = (int) -this.aClass320_15.aFloat260 * -2071105737;
		arg0.anInt3701 = ((int) this.aClass320_15.aFloat261 - arg2) * -2066707267;
	}

	@OriginalMember(owner = "client!adb", name = "w", descriptor = "(Lclient!gu;II)V", line = 61)
	@Override
	public void method16444(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.anInt3702 = ((int) this.aClass320_15.aFloat259 - arg1) * 1932748257;
		arg0.anInt3700 = (int) -this.aClass320_15.aFloat260 * -2071105737;
		arg0.anInt3701 = ((int) this.aClass320_15.aFloat261 - arg2) * -2066707267;
	}

	@OriginalMember(owner = "client!adb", name = "i", descriptor = "(Lclient!ahb;)V", line = 67)
	@Override
	public void method16436(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass320_16.method25866(arg0);
	}

	@OriginalMember(owner = "client!adb", name = "u", descriptor = "(Lclient!ahb;I)V", line = 67)
	@Override
	public void method16431(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass320_16.method25866(arg0);
	}

	@OriginalMember(owner = "client!adb", name = "f", descriptor = "(Lclient!ahb;)V", line = 67)
	@Override
	public void method16433(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass320_16.method25866(arg0);
	}

	@OriginalMember(owner = "client!adb", name = "o", descriptor = "(Lclient!ahb;)V", line = 67)
	@Override
	public void method16445(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass320_16.method25866(arg0);
	}
}
