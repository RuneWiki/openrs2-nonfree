package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqc")
public class Class77_Sub13_Sub2 extends Class77_Sub13 {

	@OriginalMember(owner = "client!aqc", name = "y", descriptor = "B")
	byte aByte78;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqc", name = "this$0", descriptor = "Lclient!km;")
	final Class365 this$0;

	@OriginalMember(owner = "client!aqc", name = "l", descriptor = "I")
	int anInt2950;

	@OriginalMember(owner = "client!aqc", name = "<init>", descriptor = "(Lclient!km;)V", line = 129)
	Class77_Sub13_Sub2(@OriginalArg(0) Class365 arg0) {
		this.this$0 = arg0;
		this.anInt2950 = -68492953;
	}

	@OriginalMember(owner = "client!aqc", name = "p", descriptor = "(Lclient!akv;I)V", line = 132)
	@Override
	void method21763(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2950 = arg0.method22483() * 68492953;
		this.aByte78 = arg0.method22481();
	}

	@OriginalMember(owner = "client!aqc", name = "v", descriptor = "(Lclient!akv;)V", line = 132)
	@Override
	void method21765(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2950 = arg0.method22483() * 68492953;
		this.aByte78 = arg0.method22481();
	}

	@OriginalMember(owner = "client!aqc", name = "y", descriptor = "(Lclient!kw;)V", line = 137)
	@Override
	void method21766(@OriginalArg(0) Class368 arg0) {
		arg0.method28195(this.anInt2950 * -808036951, this.aByte78);
	}

	@OriginalMember(owner = "client!aqc", name = "l", descriptor = "(Lclient!kw;)V", line = 137)
	@Override
	void method21762(@OriginalArg(0) Class368 arg0) {
		arg0.method28195(this.anInt2950 * -808036951, this.aByte78);
	}

	@OriginalMember(owner = "client!aqc", name = "c", descriptor = "(Lclient!kw;B)V", line = 137)
	@Override
	void method21764(@OriginalArg(0) Class368 arg0) {
		arg0.method28195(this.anInt2950 * -808036951, this.aByte78);
	}

	@OriginalMember(owner = "client!aqc", name = "w", descriptor = "(Lclient!kw;)V", line = 137)
	@Override
	void method21767(@OriginalArg(0) Class368 arg0) {
		arg0.method28195(this.anInt2950 * -808036951, this.aByte78);
	}
}
