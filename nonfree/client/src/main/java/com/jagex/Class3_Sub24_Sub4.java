package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alh")
public class Class3_Sub24_Sub4 extends Class3_Sub24 {

	@OriginalMember(owner = "client!alh", name = "l", descriptor = "I")
	int anInt2576;

	@OriginalMember(owner = "client!alh", name = "h", descriptor = "Ljava/lang/String;")
	String aString82;

	// $FF: synthetic field
	@OriginalMember(owner = "client!alh", name = "this$0", descriptor = "Lclient!iq;")
	final Class242 this$0;

	@OriginalMember(owner = "client!alh", name = "<init>", descriptor = "(Lclient!iq;)V", line = 307)
	Class3_Sub24_Sub4(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!alh", name = "p", descriptor = "(Lclient!ahb;B)V", line = 310)
	@Override
	void method18644(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2576 = arg0.method20275() * 506171199;
		this.aString82 = arg0.method20283();
	}

	@OriginalMember(owner = "client!alh", name = "l", descriptor = "(Lclient!ahb;)V", line = 310)
	@Override
	void method18646(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2576 = arg0.method20275() * 506171199;
		this.aString82 = arg0.method20283();
	}

	@OriginalMember(owner = "client!alh", name = "g", descriptor = "(Lclient!ahb;)V", line = 310)
	@Override
	void method18649(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2576 = arg0.method20275() * 506171199;
		this.aString82 = arg0.method20283();
	}

	@OriginalMember(owner = "client!alh", name = "h", descriptor = "(Lclient!ahb;)V", line = 310)
	@Override
	void method18647(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2576 = arg0.method20275() * 506171199;
		this.aString82 = arg0.method20283();
	}

	@OriginalMember(owner = "client!alh", name = "x", descriptor = "(Lclient!ahb;)V", line = 310)
	@Override
	void method18645(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2576 = arg0.method20275() * 506171199;
		this.aString82 = arg0.method20283();
	}

	@OriginalMember(owner = "client!alh", name = "s", descriptor = "(Lclient!iu;)V", line = 315)
	@Override
	void method18648(@OriginalArg(0) Class245 arg0) {
		arg0.method24821(this.anInt2576 * -1634213697, this.aString82);
	}

	@OriginalMember(owner = "client!alh", name = "a", descriptor = "(Lclient!iu;I)V", line = 315)
	@Override
	void method18643(@OriginalArg(0) Class245 arg0) {
		arg0.method24821(this.anInt2576 * -1634213697, this.aString82);
	}
}
