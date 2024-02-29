package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afz")
public class Class96_Sub21 extends Class96 {

	@OriginalMember(owner = "client!afz", name = "c", descriptor = "I")
	final int anInt937;

	@OriginalMember(owner = "client!afz", name = "v", descriptor = "I")
	final int anInt938;

	@OriginalMember(owner = "client!afz", name = "<init>", descriptor = "(Lclient!akv;)V", line = 11)
	Class96_Sub21(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt937 = arg0.method22483() * -707058995;
		this.anInt938 = arg0.method22478() * 2034954151;
	}

	@OriginalMember(owner = "client!afz", name = "c", descriptor = "(I)V", line = 17)
	@Override
	public void method19911() {
		Class94_Sub4.aClass261_1.method26368(this.anInt937 * -387081723, this.anInt938 * -1444493289);
	}

	@OriginalMember(owner = "client!afz", name = "w", descriptor = "()V", line = 17)
	@Override
	public void method19913() {
		Class94_Sub4.aClass261_1.method26368(this.anInt937 * -387081723, this.anInt938 * -1444493289);
	}

	@OriginalMember(owner = "client!afz", name = "y", descriptor = "()V", line = 17)
	@Override
	public void method19912() {
		Class94_Sub4.aClass261_1.method26368(this.anInt937 * -387081723, this.anInt938 * -1444493289);
	}

	@OriginalMember(owner = "client!afz", name = "q", descriptor = "(IS)Lclient!arj;", line = 59)
	public static Class77_Sub1_Sub14 method7763(@OriginalArg(0) int arg0) {
		return (Class77_Sub1_Sub14) Class304.aClass12_31.method173((long) arg0);
	}

	@OriginalMember(owner = "client!afz", name = "aal", descriptor = "(Lclient!yf;I)V", line = 9283)
	static final void method7764(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass368_3.method28167(local13, local23, local33);
	}
}
