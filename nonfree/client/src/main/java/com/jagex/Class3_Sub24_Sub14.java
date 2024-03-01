package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alz")
public class Class3_Sub24_Sub14 extends Class3_Sub24 {

	@OriginalMember(owner = "client!alz", name = "s", descriptor = "I")
	int anInt2620;

	@OriginalMember(owner = "client!alz", name = "h", descriptor = "I")
	int anInt2621;

	@OriginalMember(owner = "client!alz", name = "x", descriptor = "I")
	int anInt2622;

	// $FF: synthetic field
	@OriginalMember(owner = "client!alz", name = "this$0", descriptor = "Lclient!iq;")
	final Class242 this$0;

	@OriginalMember(owner = "client!alz", name = "l", descriptor = "I")
	int anInt2623;

	@OriginalMember(owner = "client!alz", name = "<init>", descriptor = "(Lclient!iq;)V", line = 147)
	Class3_Sub24_Sub14(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
		this.anInt2623 = -667361865;
	}

	@OriginalMember(owner = "client!alz", name = "l", descriptor = "(Lclient!ahb;)V", line = 150)
	@Override
	void method18646(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2623 = arg0.method20271() * 667361865;
		this.anInt2621 = arg0.method20275() * -1733656199;
		this.anInt2622 = arg0.method20269() * -1111542919;
		this.anInt2620 = arg0.method20269() * -2027046173;
	}

	@OriginalMember(owner = "client!alz", name = "p", descriptor = "(Lclient!ahb;B)V", line = 150)
	@Override
	void method18644(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2623 = arg0.method20271() * 667361865;
		this.anInt2621 = arg0.method20275() * -1733656199;
		this.anInt2622 = arg0.method20269() * -1111542919;
		this.anInt2620 = arg0.method20269() * -2027046173;
	}

	@OriginalMember(owner = "client!alz", name = "g", descriptor = "(Lclient!ahb;)V", line = 150)
	@Override
	void method18649(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2623 = arg0.method20271() * 667361865;
		this.anInt2621 = arg0.method20275() * -1733656199;
		this.anInt2622 = arg0.method20269() * -1111542919;
		this.anInt2620 = arg0.method20269() * -2027046173;
	}

	@OriginalMember(owner = "client!alz", name = "x", descriptor = "(Lclient!ahb;)V", line = 150)
	@Override
	void method18645(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2623 = arg0.method20271() * 667361865;
		this.anInt2621 = arg0.method20275() * -1733656199;
		this.anInt2622 = arg0.method20269() * -1111542919;
		this.anInt2620 = arg0.method20269() * -2027046173;
	}

	@OriginalMember(owner = "client!alz", name = "h", descriptor = "(Lclient!ahb;)V", line = 150)
	@Override
	void method18647(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2623 = arg0.method20271() * 667361865;
		this.anInt2621 = arg0.method20275() * -1733656199;
		this.anInt2622 = arg0.method20269() * -1111542919;
		this.anInt2620 = arg0.method20269() * -2027046173;
	}

	@OriginalMember(owner = "client!alz", name = "s", descriptor = "(Lclient!iu;)V", line = 157)
	@Override
	void method18648(@OriginalArg(0) Class245 arg0) {
		arg0.method24817(this.anInt2623 * 467824633, this.anInt2621 * -1952114487, this.anInt2622 * -1369848119, this.anInt2620 * 2049137355);
	}

	@OriginalMember(owner = "client!alz", name = "a", descriptor = "(Lclient!iu;I)V", line = 157)
	@Override
	void method18643(@OriginalArg(0) Class245 arg0) {
		arg0.method24817(this.anInt2623 * 467824633, this.anInt2621 * -1952114487, this.anInt2622 * -1369848119, this.anInt2620 * 2049137355);
	}

	@OriginalMember(owner = "client!alz", name = "ar", descriptor = "(Lclient!vs;B)V", line = 4149)
	static final void method18650(@OriginalArg(0) Class536 arg0) {
		arg0.aLongArray18[(arg0.anInt5316 += 2125691367) * 196643287 - 1] = arg0.aLongArray17[arg0.anIntArray497[arg0.anInt5318 * -2140198955]];
	}
}
