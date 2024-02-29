package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqs")
public class Class77_Sub13_Sub11 extends Class77_Sub13 {

	@OriginalMember(owner = "client!aqs", name = "l", descriptor = "Ljava/lang/String;")
	String aString98;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqs", name = "this$0", descriptor = "Lclient!km;")
	final Class365 this$0;

	@OriginalMember(owner = "client!aqs", name = "<init>", descriptor = "(Lclient!km;)V", line = 213)
	Class77_Sub13_Sub11(@OriginalArg(0) Class365 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!aqs", name = "p", descriptor = "(Lclient!akv;I)V", line = 216)
	@Override
	void method21763(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aString98 = arg0.method22523();
		arg0.method22500();
	}

	@OriginalMember(owner = "client!aqs", name = "v", descriptor = "(Lclient!akv;)V", line = 216)
	@Override
	void method21765(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aString98 = arg0.method22523();
		arg0.method22500();
	}

	@OriginalMember(owner = "client!aqs", name = "c", descriptor = "(Lclient!kw;B)V", line = 221)
	@Override
	void method21764(@OriginalArg(0) Class368 arg0) {
		arg0.aString210 = this.aString98;
	}

	@OriginalMember(owner = "client!aqs", name = "w", descriptor = "(Lclient!kw;)V", line = 221)
	@Override
	void method21767(@OriginalArg(0) Class368 arg0) {
		arg0.aString210 = this.aString98;
	}

	@OriginalMember(owner = "client!aqs", name = "l", descriptor = "(Lclient!kw;)V", line = 221)
	@Override
	void method21762(@OriginalArg(0) Class368 arg0) {
		arg0.aString210 = this.aString98;
	}

	@OriginalMember(owner = "client!aqs", name = "y", descriptor = "(Lclient!kw;)V", line = 221)
	@Override
	void method21766(@OriginalArg(0) Class368 arg0) {
		arg0.aString210 = this.aString98;
	}
}
