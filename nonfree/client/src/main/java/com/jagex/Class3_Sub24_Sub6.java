package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alk")
public class Class3_Sub24_Sub6 extends Class3_Sub24 {

	@OriginalMember(owner = "client!alk", name = "h", descriptor = "I")
	int anInt2586;

	@OriginalMember(owner = "client!alk", name = "x", descriptor = "I")
	int anInt2587;

	@OriginalMember(owner = "client!alk", name = "l", descriptor = "I")
	int anInt2588;

	@OriginalMember(owner = "client!alk", name = "s", descriptor = "I")
	int anInt2589;

	// $FF: synthetic field
	@OriginalMember(owner = "client!alk", name = "this$0", descriptor = "Lclient!iq;")
	final Class242 this$0;

	@OriginalMember(owner = "client!alk", name = "<init>", descriptor = "(Lclient!iq;)V", line = 273)
	Class3_Sub24_Sub6(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!alk", name = "x", descriptor = "(Lclient!ahb;)V", line = 276)
	@Override
	void method18645(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2588 = arg0.method20275() * 1245382373;
		this.anInt2589 = arg0.method20275() * -1999843819;
		this.anInt2586 = arg0.method20269() * -460469795;
		this.anInt2587 = arg0.method20269() * 175051147;
	}

	@OriginalMember(owner = "client!alk", name = "p", descriptor = "(Lclient!ahb;B)V", line = 276)
	@Override
	void method18644(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2588 = arg0.method20275() * 1245382373;
		this.anInt2589 = arg0.method20275() * -1999843819;
		this.anInt2586 = arg0.method20269() * -460469795;
		this.anInt2587 = arg0.method20269() * 175051147;
	}

	@OriginalMember(owner = "client!alk", name = "l", descriptor = "(Lclient!ahb;)V", line = 276)
	@Override
	void method18646(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2588 = arg0.method20275() * 1245382373;
		this.anInt2589 = arg0.method20275() * -1999843819;
		this.anInt2586 = arg0.method20269() * -460469795;
		this.anInt2587 = arg0.method20269() * 175051147;
	}

	@OriginalMember(owner = "client!alk", name = "h", descriptor = "(Lclient!ahb;)V", line = 276)
	@Override
	void method18647(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2588 = arg0.method20275() * 1245382373;
		this.anInt2589 = arg0.method20275() * -1999843819;
		this.anInt2586 = arg0.method20269() * -460469795;
		this.anInt2587 = arg0.method20269() * 175051147;
	}

	@OriginalMember(owner = "client!alk", name = "g", descriptor = "(Lclient!ahb;)V", line = 276)
	@Override
	void method18649(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2588 = arg0.method20275() * 1245382373;
		this.anInt2589 = arg0.method20275() * -1999843819;
		this.anInt2586 = arg0.method20269() * -460469795;
		this.anInt2587 = arg0.method20269() * 175051147;
	}

	@OriginalMember(owner = "client!alk", name = "s", descriptor = "(Lclient!iu;)V", line = 283)
	@Override
	void method18648(@OriginalArg(0) Class245 arg0) {
		arg0.method24819(this.anInt2588 * -1508358419, this.anInt2589 * -204107459, this.anInt2586 * 17094261, this.anInt2587 * 1961954851);
	}

	@OriginalMember(owner = "client!alk", name = "a", descriptor = "(Lclient!iu;I)V", line = 283)
	@Override
	void method18643(@OriginalArg(0) Class245 arg0) {
		arg0.method24819(this.anInt2588 * -1508358419, this.anInt2589 * -204107459, this.anInt2586 * 17094261, this.anInt2587 * 1961954851);
	}
}
