package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ald")
public class Class3_Sub24_Sub3 extends Class3_Sub24 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ald", name = "this$0", descriptor = "Lclient!iq;")
	final Class242 this$0;

	@OriginalMember(owner = "client!ald", name = "l", descriptor = "J")
	long aLong114;

	@OriginalMember(owner = "client!ald", name = "h", descriptor = "Ljava/lang/String;")
	String aString80;

	@OriginalMember(owner = "client!ald", name = "x", descriptor = "I")
	int anInt2563;

	@OriginalMember(owner = "client!ald", name = "<init>", descriptor = "(Lclient!iq;)V", line = 95)
	Class3_Sub24_Sub3(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
		this.aLong114 = 4967733113410125129L;
		this.aString80 = null;
		this.anInt2563 = 0;
	}

	@OriginalMember(owner = "client!ald", name = "p", descriptor = "(Lclient!ahb;B)V", line = 98)
	@Override
	void method18644(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong114 = arg0.method20371() * -4967733113410125129L;
		}
		this.aString80 = arg0.method20282();
		this.anInt2563 = arg0.method20271() * 416657813;
	}

	@OriginalMember(owner = "client!ald", name = "x", descriptor = "(Lclient!ahb;)V", line = 98)
	@Override
	void method18645(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong114 = arg0.method20371() * -4967733113410125129L;
		}
		this.aString80 = arg0.method20282();
		this.anInt2563 = arg0.method20271() * 416657813;
	}

	@OriginalMember(owner = "client!ald", name = "g", descriptor = "(Lclient!ahb;)V", line = 98)
	@Override
	void method18649(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong114 = arg0.method20371() * -4967733113410125129L;
		}
		this.aString80 = arg0.method20282();
		this.anInt2563 = arg0.method20271() * 416657813;
	}

	@OriginalMember(owner = "client!ald", name = "l", descriptor = "(Lclient!ahb;)V", line = 98)
	@Override
	void method18646(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong114 = arg0.method20371() * -4967733113410125129L;
		}
		this.aString80 = arg0.method20282();
		this.anInt2563 = arg0.method20271() * 416657813;
	}

	@OriginalMember(owner = "client!ald", name = "h", descriptor = "(Lclient!ahb;)V", line = 98)
	@Override
	void method18647(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong114 = arg0.method20371() * -4967733113410125129L;
		}
		this.aString80 = arg0.method20282();
		this.anInt2563 = arg0.method20271() * 416657813;
	}

	@OriginalMember(owner = "client!ald", name = "s", descriptor = "(Lclient!iu;)V", line = 107)
	@Override
	void method18648(@OriginalArg(0) Class245 arg0) {
		arg0.method24810(this.aLong114 * -7873209902290175225L, this.aString80, this.anInt2563 * 695013821);
	}

	@OriginalMember(owner = "client!ald", name = "a", descriptor = "(Lclient!iu;I)V", line = 107)
	@Override
	void method18643(@OriginalArg(0) Class245 arg0) {
		arg0.method24810(this.aLong114 * -7873209902290175225L, this.aString80, this.anInt2563 * 695013821);
	}
}
