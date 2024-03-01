package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ale")
public class Class3_Sub40_Sub1 extends Class3_Sub40 {

	@OriginalMember(owner = "client!ale", name = "x", descriptor = "I")
	int anInt2564;

	@OriginalMember(owner = "client!ale", name = "s", descriptor = "Ljava/lang/String;")
	String aString81;

	@OriginalMember(owner = "client!ale", name = "h", descriptor = "B")
	byte aByte79;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ale", name = "this$0", descriptor = "Lclient!im;")
	final Class239 this$0;

	@OriginalMember(owner = "client!ale", name = "l", descriptor = "I")
	int anInt2565;

	@OriginalMember(owner = "client!ale", name = "<init>", descriptor = "(Lclient!im;)V", line = 105)
	Class3_Sub40_Sub1(@OriginalArg(0) Class239 arg0) {
		this.this$0 = arg0;
		this.anInt2565 = 1955533007;
	}

	@OriginalMember(owner = "client!ale", name = "p", descriptor = "(Lclient!ahb;S)V", line = 108)
	@Override
	void method19099(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2565 = arg0.method20271() * -1955533007;
		this.aByte79 = arg0.method20390();
		this.anInt2564 = arg0.method20271() * -559110239;
		arg0.method20371();
		this.aString81 = arg0.method20283();
	}

	@OriginalMember(owner = "client!ale", name = "g", descriptor = "(Lclient!ahb;)V", line = 108)
	@Override
	void method19098(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2565 = arg0.method20271() * -1955533007;
		this.aByte79 = arg0.method20390();
		this.anInt2564 = arg0.method20271() * -559110239;
		arg0.method20371();
		this.aString81 = arg0.method20283();
	}

	@OriginalMember(owner = "client!ale", name = "l", descriptor = "(Lclient!ahb;)V", line = 108)
	@Override
	void method19101(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2565 = arg0.method20271() * -1955533007;
		this.aByte79 = arg0.method20390();
		this.anInt2564 = arg0.method20271() * -559110239;
		arg0.method20371();
		this.aString81 = arg0.method20283();
	}

	@OriginalMember(owner = "client!ale", name = "a", descriptor = "(Lclient!ago;B)V", line = 116)
	@Override
	void method19100(@OriginalArg(0) Class3_Sub30 arg0) {
		@Pc(7) Class238 local7 = arg0.aClass238Array1[this.anInt2565 * 94636497];
		local7.aByte129 = this.aByte79;
		local7.anInt3750 = this.anInt2564 * 1999648069;
		local7.aString192 = this.aString81;
	}

	@OriginalMember(owner = "client!ale", name = "h", descriptor = "(Lclient!ago;)V", line = 116)
	@Override
	void method19102(@OriginalArg(0) Class3_Sub30 arg0) {
		@Pc(7) Class238 local7 = arg0.aClass238Array1[this.anInt2565 * 94636497];
		local7.aByte129 = this.aByte79;
		local7.anInt3750 = this.anInt2564 * 1999648069;
		local7.aString192 = this.aString81;
	}
}
