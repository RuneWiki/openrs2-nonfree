package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public class Class318 implements Interface75 {

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Lclient!id;")
	static final Class318 aClass318_1 = new Class318(0);

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!id;")
	static final Class318 aClass318_3 = new Class318(1);

	@OriginalMember(owner = "client!id", name = "v", descriptor = "Lclient!id;")
	static final Class318 aClass318_2 = new Class318(2);

	@OriginalMember(owner = "client!id", name = "l", descriptor = "I")
	final int anInt4071;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V", line = 44)
	Class318(@OriginalArg(0) int arg0) {
		this.anInt4071 = arg0 * -1107030533;
	}

	@OriginalMember(owner = "client!id", name = "y", descriptor = "()I", line = 49)
	@Override
	public int method36477() {
		return this.anInt4071 * -1838090957;
	}

	@OriginalMember(owner = "client!id", name = "l", descriptor = "()I", line = 49)
	@Override
	public int method36478() {
		return this.anInt4071 * -1838090957;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "()I", line = 49)
	@Override
	public int method36479() {
		return this.anInt4071 * -1838090957;
	}

	@OriginalMember(owner = "client!id", name = "kg", descriptor = "(Lclient!yf;B)V", line = 6314)
	static final void method27392(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		IcmpService_Sub1.method15418(local16, arg0);
	}

	@OriginalMember(owner = "client!id", name = "uy", descriptor = "(Lclient!yf;I)V", line = 8197)
	static final void method27393(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		Class94_Sub4.aClass261_1.method26354(arg0.anIntArray536[arg0.anInt5784 * 2088438307], arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2]);
	}
}
