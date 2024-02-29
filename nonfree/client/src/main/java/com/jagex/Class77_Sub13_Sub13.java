package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqu")
public class Class77_Sub13_Sub13 extends Class77_Sub13 {

	@OriginalMember(owner = "client!aqu", name = "y", descriptor = "Z")
	boolean aBoolean492;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqu", name = "this$0", descriptor = "Lclient!km;")
	final Class365 this$0;

	@OriginalMember(owner = "client!aqu", name = "l", descriptor = "I")
	int anInt2997;

	@OriginalMember(owner = "client!aqu", name = "<init>", descriptor = "(Lclient!km;)V", line = 165)
	Class77_Sub13_Sub13(@OriginalArg(0) Class365 arg0) {
		this.this$0 = arg0;
		this.anInt2997 = -1952992677;
	}

	@OriginalMember(owner = "client!aqu", name = "p", descriptor = "(Lclient!akv;I)V", line = 168)
	@Override
	void method21763(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2997 = arg0.method22483() * 1952992677;
		this.aBoolean492 = arg0.method22478() == 1;
	}

	@OriginalMember(owner = "client!aqu", name = "v", descriptor = "(Lclient!akv;)V", line = 168)
	@Override
	void method21765(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2997 = arg0.method22483() * 1952992677;
		this.aBoolean492 = arg0.method22478() == 1;
	}

	@OriginalMember(owner = "client!aqu", name = "w", descriptor = "(Lclient!kw;)V", line = 173)
	@Override
	void method21767(@OriginalArg(0) Class368 arg0) {
		arg0.method28199(this.anInt2997 * 851825197, this.aBoolean492);
	}

	@OriginalMember(owner = "client!aqu", name = "c", descriptor = "(Lclient!kw;B)V", line = 173)
	@Override
	void method21764(@OriginalArg(0) Class368 arg0) {
		arg0.method28199(this.anInt2997 * 851825197, this.aBoolean492);
	}

	@OriginalMember(owner = "client!aqu", name = "y", descriptor = "(Lclient!kw;)V", line = 173)
	@Override
	void method21766(@OriginalArg(0) Class368 arg0) {
		arg0.method28199(this.anInt2997 * 851825197, this.aBoolean492);
	}

	@OriginalMember(owner = "client!aqu", name = "l", descriptor = "(Lclient!kw;)V", line = 173)
	@Override
	void method21762(@OriginalArg(0) Class368 arg0) {
		arg0.method28199(this.anInt2997 * 851825197, this.aBoolean492);
	}
}
