package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ali")
public class Class3_Sub24_Sub5 extends Class3_Sub24 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ali", name = "this$0", descriptor = "Lclient!iq;")
	final Class242 this$0;

	@OriginalMember(owner = "client!ali", name = "l", descriptor = "I")
	int anInt2577;

	@OriginalMember(owner = "client!ali", name = "p", descriptor = "(IB)Lclient!gb;", line = 13)
	static Class192 method18199(@OriginalArg(0) int arg0) {
		if (Class192.aClass192_4.anInt3681 * 961471433 == arg0) {
			return Class192.aClass192_4;
		} else if (Class192.aClass192_3.anInt3681 * 961471433 == arg0) {
			return Class192.aClass192_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ali", name = "<init>", descriptor = "(Lclient!iq;)V", line = 114)
	Class3_Sub24_Sub5(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
		this.anInt2577 = -1373996175;
	}

	@OriginalMember(owner = "client!ali", name = "p", descriptor = "(Lclient!ahb;B)V", line = 117)
	@Override
	void method18644(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2577 = arg0.method20271() * 1373996175;
	}

	@OriginalMember(owner = "client!ali", name = "g", descriptor = "(Lclient!ahb;)V", line = 117)
	@Override
	void method18649(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2577 = arg0.method20271() * 1373996175;
	}

	@OriginalMember(owner = "client!ali", name = "l", descriptor = "(Lclient!ahb;)V", line = 117)
	@Override
	void method18646(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2577 = arg0.method20271() * 1373996175;
	}

	@OriginalMember(owner = "client!ali", name = "h", descriptor = "(Lclient!ahb;)V", line = 117)
	@Override
	void method18647(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2577 = arg0.method20271() * 1373996175;
	}

	@OriginalMember(owner = "client!ali", name = "x", descriptor = "(Lclient!ahb;)V", line = 117)
	@Override
	void method18645(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2577 = arg0.method20271() * 1373996175;
	}

	@OriginalMember(owner = "client!ali", name = "s", descriptor = "(Lclient!iu;)V", line = 121)
	@Override
	void method18648(@OriginalArg(0) Class245 arg0) {
		arg0.method24811(this.anInt2577 * 1982536303);
	}

	@OriginalMember(owner = "client!ali", name = "a", descriptor = "(Lclient!iu;I)V", line = 121)
	@Override
	void method18643(@OriginalArg(0) Class245 arg0) {
		arg0.method24811(this.anInt2577 * 1982536303);
	}
}
