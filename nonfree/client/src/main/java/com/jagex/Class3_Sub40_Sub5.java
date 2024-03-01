package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amp")
public class Class3_Sub40_Sub5 extends Class3_Sub40 {

	@OriginalMember(owner = "client!amp", name = "h", descriptor = "I")
	int anInt2671;

	@OriginalMember(owner = "client!amp", name = "x", descriptor = "B")
	byte aByte89;

	// $FF: synthetic field
	@OriginalMember(owner = "client!amp", name = "this$0", descriptor = "Lclient!im;")
	final Class239 this$0;

	@OriginalMember(owner = "client!amp", name = "l", descriptor = "Ljava/lang/String;")
	String aString113;

	@OriginalMember(owner = "client!amp", name = "<init>", descriptor = "(Lclient!im;)V", line = 58)
	Class3_Sub40_Sub5(@OriginalArg(0) Class239 arg0) {
		this.this$0 = arg0;
		this.aString113 = null;
	}

	@OriginalMember(owner = "client!amp", name = "l", descriptor = "(Lclient!ahb;)V", line = 61)
	@Override
	void method19101(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			arg0.method20371();
		}
		this.aString113 = arg0.method20282();
		this.anInt2671 = arg0.method20271() * 622134153;
		this.aByte89 = arg0.method20390();
		arg0.method20371();
	}

	@OriginalMember(owner = "client!amp", name = "p", descriptor = "(Lclient!ahb;S)V", line = 61)
	@Override
	void method19099(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			arg0.method20371();
		}
		this.aString113 = arg0.method20282();
		this.anInt2671 = arg0.method20271() * 622134153;
		this.aByte89 = arg0.method20390();
		arg0.method20371();
	}

	@OriginalMember(owner = "client!amp", name = "g", descriptor = "(Lclient!ahb;)V", line = 61)
	@Override
	void method19098(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.method20269() != 255) {
			arg0.anInt2803 -= -918980331;
			arg0.method20371();
		}
		this.aString113 = arg0.method20282();
		this.anInt2671 = arg0.method20271() * 622134153;
		this.aByte89 = arg0.method20390();
		arg0.method20371();
	}

	@OriginalMember(owner = "client!amp", name = "h", descriptor = "(Lclient!ago;)V", line = 72)
	@Override
	void method19102(@OriginalArg(0) Class3_Sub30 arg0) {
		@Pc(3) Class238 local3 = new Class238();
		local3.aString192 = this.aString113;
		local3.anInt3750 = this.anInt2671 * 1578016253;
		local3.aByte129 = this.aByte89;
		arg0.method11621(local3);
	}

	@OriginalMember(owner = "client!amp", name = "a", descriptor = "(Lclient!ago;B)V", line = 72)
	@Override
	void method19100(@OriginalArg(0) Class3_Sub30 arg0) {
		@Pc(3) Class238 local3 = new Class238();
		local3.aString192 = this.aString113;
		local3.anInt3750 = this.anInt2671 * 1578016253;
		local3.aByte129 = this.aByte89;
		arg0.method11621(local3);
	}
}
