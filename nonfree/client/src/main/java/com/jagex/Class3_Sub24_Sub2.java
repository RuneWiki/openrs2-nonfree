package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alc")
public class Class3_Sub24_Sub2 extends Class3_Sub24 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!alc", name = "this$0", descriptor = "Lclient!iq;")
	final Class242 this$0;

	@OriginalMember(owner = "client!alc", name = "l", descriptor = "J")
	long aLong112;

	@OriginalMember(owner = "client!alc", name = "h", descriptor = "Ljava/lang/String;")
	String aString79;

	@OriginalMember(owner = "client!alc", name = "<init>", descriptor = "(Lclient!iq;)V", line = 181)
	Class3_Sub24_Sub2(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
		this.aLong112 = 224624786323698395L;
		this.aString79 = null;
	}

	@OriginalMember(owner = "client!alc", name = "l", descriptor = "(Lclient!ahb;)V", line = 184)
	@Override
	void method18646(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong112 = arg0.method20371() * -224624786323698395L;
		}
		this.aString79 = arg0.method20282();
	}

	@OriginalMember(owner = "client!alc", name = "p", descriptor = "(Lclient!ahb;B)V", line = 184)
	@Override
	void method18644(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong112 = arg0.method20371() * -224624786323698395L;
		}
		this.aString79 = arg0.method20282();
	}

	@OriginalMember(owner = "client!alc", name = "g", descriptor = "(Lclient!ahb;)V", line = 184)
	@Override
	void method18649(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong112 = arg0.method20371() * -224624786323698395L;
		}
		this.aString79 = arg0.method20282();
	}

	@OriginalMember(owner = "client!alc", name = "h", descriptor = "(Lclient!ahb;)V", line = 184)
	@Override
	void method18647(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong112 = arg0.method20371() * -224624786323698395L;
		}
		this.aString79 = arg0.method20282();
	}

	@OriginalMember(owner = "client!alc", name = "x", descriptor = "(Lclient!ahb;)V", line = 184)
	@Override
	void method18645(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			this.aLong112 = arg0.method20371() * -224624786323698395L;
		}
		this.aString79 = arg0.method20282();
	}

	@OriginalMember(owner = "client!alc", name = "s", descriptor = "(Lclient!iu;)V", line = 192)
	@Override
	void method18648(@OriginalArg(0) Class245 arg0) {
		arg0.method24855(this.aLong112 * -7935090859827411283L, this.aString79);
	}

	@OriginalMember(owner = "client!alc", name = "a", descriptor = "(Lclient!iu;I)V", line = 192)
	@Override
	void method18643(@OriginalArg(0) Class245 arg0) {
		arg0.method24855(this.aLong112 * -7935090859827411283L, this.aString79);
	}
}
