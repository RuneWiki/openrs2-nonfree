package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqo")
public class Class77_Sub13_Sub9 extends Class77_Sub13 {

	@OriginalMember(owner = "client!aqo", name = "y", descriptor = "Ljava/lang/String;")
	String aString95;

	@OriginalMember(owner = "client!aqo", name = "l", descriptor = "I")
	int anInt2992;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqo", name = "this$0", descriptor = "Lclient!km;")
	final Class365 this$0;

	@OriginalMember(owner = "client!aqo", name = "<init>", descriptor = "(Lclient!km;)V", line = 307)
	Class77_Sub13_Sub9(@OriginalArg(0) Class365 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!aqo", name = "p", descriptor = "(Lclient!akv;I)V", line = 310)
	@Override
	void method21763(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2992 = arg0.method22500() * 314213349;
		this.aString95 = arg0.method22523();
	}

	@OriginalMember(owner = "client!aqo", name = "v", descriptor = "(Lclient!akv;)V", line = 310)
	@Override
	void method21765(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2992 = arg0.method22500() * 314213349;
		this.aString95 = arg0.method22523();
	}

	@OriginalMember(owner = "client!aqo", name = "w", descriptor = "(Lclient!kw;)V", line = 315)
	@Override
	void method21767(@OriginalArg(0) Class368 arg0) {
		arg0.method28216(this.anInt2992 * -426769939, this.aString95);
	}

	@OriginalMember(owner = "client!aqo", name = "c", descriptor = "(Lclient!kw;B)V", line = 315)
	@Override
	void method21764(@OriginalArg(0) Class368 arg0) {
		arg0.method28216(this.anInt2992 * -426769939, this.aString95);
	}

	@OriginalMember(owner = "client!aqo", name = "l", descriptor = "(Lclient!kw;)V", line = 315)
	@Override
	void method21762(@OriginalArg(0) Class368 arg0) {
		arg0.method28216(this.anInt2992 * -426769939, this.aString95);
	}

	@OriginalMember(owner = "client!aqo", name = "y", descriptor = "(Lclient!kw;)V", line = 315)
	@Override
	void method21766(@OriginalArg(0) Class368 arg0) {
		arg0.method28216(this.anInt2992 * -426769939, this.aString95);
	}
}
