package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ala")
public class Class3_Sub24_Sub1 extends Class3_Sub24 {

	@OriginalMember(owner = "client!ala", name = "h", descriptor = "J")
	long aLong110;

	@OriginalMember(owner = "client!ala", name = "l", descriptor = "I")
	int anInt2546;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ala", name = "this$0", descriptor = "Lclient!iq;")
	final Class242 this$0;

	@OriginalMember(owner = "client!ala", name = "<init>", descriptor = "(Lclient!iq;)V", line = 291)
	Class3_Sub24_Sub1(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ala", name = "p", descriptor = "(Lclient!ahb;B)V", line = 294)
	@Override
	void method18644(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2546 = arg0.method20275() * 1902518779;
		this.aLong110 = arg0.method20371() * -2130851816472912701L;
	}

	@OriginalMember(owner = "client!ala", name = "g", descriptor = "(Lclient!ahb;)V", line = 294)
	@Override
	void method18649(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2546 = arg0.method20275() * 1902518779;
		this.aLong110 = arg0.method20371() * -2130851816472912701L;
	}

	@OriginalMember(owner = "client!ala", name = "l", descriptor = "(Lclient!ahb;)V", line = 294)
	@Override
	void method18646(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2546 = arg0.method20275() * 1902518779;
		this.aLong110 = arg0.method20371() * -2130851816472912701L;
	}

	@OriginalMember(owner = "client!ala", name = "h", descriptor = "(Lclient!ahb;)V", line = 294)
	@Override
	void method18647(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2546 = arg0.method20275() * 1902518779;
		this.aLong110 = arg0.method20371() * -2130851816472912701L;
	}

	@OriginalMember(owner = "client!ala", name = "x", descriptor = "(Lclient!ahb;)V", line = 294)
	@Override
	void method18645(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2546 = arg0.method20275() * 1902518779;
		this.aLong110 = arg0.method20371() * -2130851816472912701L;
	}

	@OriginalMember(owner = "client!ala", name = "a", descriptor = "(Lclient!iu;I)V", line = 299)
	@Override
	void method18643(@OriginalArg(0) Class245 arg0) {
		arg0.method24826(this.anInt2546 * -1244937933, this.aLong110 * -7245552435079302165L);
	}

	@OriginalMember(owner = "client!ala", name = "s", descriptor = "(Lclient!iu;)V", line = 299)
	@Override
	void method18648(@OriginalArg(0) Class245 arg0) {
		arg0.method24826(this.anInt2546 * -1244937933, this.aLong110 * -7245552435079302165L);
	}
}
