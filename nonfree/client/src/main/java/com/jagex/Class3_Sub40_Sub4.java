package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amk")
public class Class3_Sub40_Sub4 extends Class3_Sub40 {

	@OriginalMember(owner = "client!amk", name = "h", descriptor = "B")
	byte aByte88;

	@OriginalMember(owner = "client!amk", name = "s", descriptor = "Ljava/lang/String;")
	String aString108;

	@OriginalMember(owner = "client!amk", name = "x", descriptor = "I")
	int anInt2663;

	// $FF: synthetic field
	@OriginalMember(owner = "client!amk", name = "this$0", descriptor = "Lclient!im;")
	final Class239 this$0;

	@OriginalMember(owner = "client!amk", name = "l", descriptor = "I")
	int anInt2662;

	@OriginalMember(owner = "client!amk", name = "<init>", descriptor = "(Lclient!im;)V", line = 129)
	Class3_Sub40_Sub4(@OriginalArg(0) Class239 arg0) {
		this.this$0 = arg0;
		this.anInt2662 = 342672449;
	}

	@OriginalMember(owner = "client!amk", name = "l", descriptor = "(Lclient!ahb;)V", line = 132)
	@Override
	void method19101(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.method20269();
		this.anInt2662 = arg0.method20271() * -342672449;
		this.aByte88 = arg0.method20390();
		this.anInt2663 = arg0.method20271() * 204159771;
		arg0.method20371();
		this.aString108 = arg0.method20283();
		arg0.method20269();
	}

	@OriginalMember(owner = "client!amk", name = "g", descriptor = "(Lclient!ahb;)V", line = 132)
	@Override
	void method19098(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.method20269();
		this.anInt2662 = arg0.method20271() * -342672449;
		this.aByte88 = arg0.method20390();
		this.anInt2663 = arg0.method20271() * 204159771;
		arg0.method20371();
		this.aString108 = arg0.method20283();
		arg0.method20269();
	}

	@OriginalMember(owner = "client!amk", name = "p", descriptor = "(Lclient!ahb;S)V", line = 132)
	@Override
	void method19099(@OriginalArg(0) Class3_Sub41 arg0) {
		arg0.method20269();
		this.anInt2662 = arg0.method20271() * -342672449;
		this.aByte88 = arg0.method20390();
		this.anInt2663 = arg0.method20271() * 204159771;
		arg0.method20371();
		this.aString108 = arg0.method20283();
		arg0.method20269();
	}

	@OriginalMember(owner = "client!amk", name = "a", descriptor = "(Lclient!ago;B)V", line = 142)
	@Override
	void method19100(@OriginalArg(0) Class3_Sub30 arg0) {
		@Pc(7) Class238 local7 = arg0.aClass238Array1[this.anInt2662 * 398373951];
		local7.aByte129 = this.aByte88;
		local7.anInt3750 = this.anInt2663 * -40131713;
		local7.aString192 = this.aString108;
	}

	@OriginalMember(owner = "client!amk", name = "h", descriptor = "(Lclient!ago;)V", line = 142)
	@Override
	void method19102(@OriginalArg(0) Class3_Sub30 arg0) {
		@Pc(7) Class238 local7 = arg0.aClass238Array1[this.anInt2662 * 398373951];
		local7.aByte129 = this.aByte88;
		local7.anInt3750 = this.anInt2663 * -40131713;
		local7.aString192 = this.aString108;
	}

	@OriginalMember(owner = "client!amk", name = "anq", descriptor = "(Lclient!vs;I)V", line = 11411)
	static final void method18986(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub34_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 0 ? 0 : 1);
		Class26_Sub1_Sub1_Sub1.method16728();
	}
}
