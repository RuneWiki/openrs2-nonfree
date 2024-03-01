package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!als")
public class Class3_Sub24_Sub11 extends Class3_Sub24 {

	@OriginalMember(owner = "client!als", name = "l", descriptor = "I")
	int anInt2610;

	@OriginalMember(owner = "client!als", name = "h", descriptor = "I")
	int anInt2611;

	// $FF: synthetic field
	@OriginalMember(owner = "client!als", name = "this$0", descriptor = "Lclient!iq;")
	final Class242 this$0;

	@OriginalMember(owner = "client!als", name = "<init>", descriptor = "(Lclient!iq;)V", line = 255)
	Class3_Sub24_Sub11(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!als", name = "p", descriptor = "(Lclient!ahb;B)V", line = 258)
	@Override
	void method18644(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2610 = arg0.method20275() * -1234037169;
		this.anInt2611 = arg0.method20275() * 1913997435;
	}

	@OriginalMember(owner = "client!als", name = "g", descriptor = "(Lclient!ahb;)V", line = 258)
	@Override
	void method18649(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2610 = arg0.method20275() * -1234037169;
		this.anInt2611 = arg0.method20275() * 1913997435;
	}

	@OriginalMember(owner = "client!als", name = "h", descriptor = "(Lclient!ahb;)V", line = 258)
	@Override
	void method18647(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2610 = arg0.method20275() * -1234037169;
		this.anInt2611 = arg0.method20275() * 1913997435;
	}

	@OriginalMember(owner = "client!als", name = "x", descriptor = "(Lclient!ahb;)V", line = 258)
	@Override
	void method18645(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2610 = arg0.method20275() * -1234037169;
		this.anInt2611 = arg0.method20275() * 1913997435;
	}

	@OriginalMember(owner = "client!als", name = "l", descriptor = "(Lclient!ahb;)V", line = 258)
	@Override
	void method18646(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2610 = arg0.method20275() * -1234037169;
		this.anInt2611 = arg0.method20275() * 1913997435;
	}

	@OriginalMember(owner = "client!als", name = "a", descriptor = "(Lclient!iu;I)V", line = 263)
	@Override
	void method18643(@OriginalArg(0) Class245 arg0) {
		arg0.method24858(this.anInt2610 * -1444855633, this.anInt2611 * -1279306061);
	}

	@OriginalMember(owner = "client!als", name = "s", descriptor = "(Lclient!iu;)V", line = 263)
	@Override
	void method18648(@OriginalArg(0) Class245 arg0) {
		arg0.method24858(this.anInt2610 * -1444855633, this.anInt2611 * -1279306061);
	}
}
