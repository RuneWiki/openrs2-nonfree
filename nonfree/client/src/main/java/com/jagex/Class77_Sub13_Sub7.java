package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aql")
public class Class77_Sub13_Sub7 extends Class77_Sub13 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aql", name = "this$0", descriptor = "Lclient!km;")
	final Class365 this$0;

	@OriginalMember(owner = "client!aql", name = "l", descriptor = "I")
	int anInt2982;

	@OriginalMember(owner = "client!aql", name = "<init>", descriptor = "(Lclient!km;)V", line = 199)
	Class77_Sub13_Sub7(@OriginalArg(0) Class365 arg0) {
		this.this$0 = arg0;
		this.anInt2982 = -260403145;
	}

	@OriginalMember(owner = "client!aql", name = "p", descriptor = "(Lclient!akv;I)V", line = 202)
	@Override
	void method21763(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2982 = arg0.method22483() * 260403145;
	}

	@OriginalMember(owner = "client!aql", name = "v", descriptor = "(Lclient!akv;)V", line = 202)
	@Override
	void method21765(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2982 = arg0.method22483() * 260403145;
	}

	@OriginalMember(owner = "client!aql", name = "y", descriptor = "(Lclient!kw;)V", line = 206)
	@Override
	void method21766(@OriginalArg(0) Class368 arg0) {
		arg0.method28192(this.anInt2982 * 324393593);
	}

	@OriginalMember(owner = "client!aql", name = "l", descriptor = "(Lclient!kw;)V", line = 206)
	@Override
	void method21762(@OriginalArg(0) Class368 arg0) {
		arg0.method28192(this.anInt2982 * 324393593);
	}

	@OriginalMember(owner = "client!aql", name = "c", descriptor = "(Lclient!kw;B)V", line = 206)
	@Override
	void method21764(@OriginalArg(0) Class368 arg0) {
		arg0.method28192(this.anInt2982 * 324393593);
	}

	@OriginalMember(owner = "client!aql", name = "w", descriptor = "(Lclient!kw;)V", line = 206)
	@Override
	void method21767(@OriginalArg(0) Class368 arg0) {
		arg0.method28192(this.anInt2982 * 324393593);
	}
}
