package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqj")
public class Class77_Sub13_Sub6 extends Class77_Sub13 {

	@OriginalMember(owner = "client!aqj", name = "w", descriptor = "I")
	int anInt2976;

	@OriginalMember(owner = "client!aqj", name = "y", descriptor = "I")
	int anInt2977;

	@OriginalMember(owner = "client!aqj", name = "t", descriptor = "I")
	int anInt2978;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqj", name = "this$0", descriptor = "Lclient!km;")
	final Class365 this$0;

	@OriginalMember(owner = "client!aqj", name = "l", descriptor = "I")
	int anInt2979;

	@OriginalMember(owner = "client!aqj", name = "<init>", descriptor = "(Lclient!km;)V", line = 147)
	Class77_Sub13_Sub6(@OriginalArg(0) Class365 arg0) {
		this.this$0 = arg0;
		this.anInt2979 = -1721343821;
	}

	@OriginalMember(owner = "client!aqj", name = "p", descriptor = "(Lclient!akv;I)V", line = 150)
	@Override
	void method21763(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2979 = arg0.method22483() * 1721343821;
		this.anInt2977 = arg0.method22500() * 318376649;
		this.anInt2976 = arg0.method22478() * 662476137;
		this.anInt2978 = arg0.method22478() * 51732377;
	}

	@OriginalMember(owner = "client!aqj", name = "v", descriptor = "(Lclient!akv;)V", line = 150)
	@Override
	void method21765(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2979 = arg0.method22483() * 1721343821;
		this.anInt2977 = arg0.method22500() * 318376649;
		this.anInt2976 = arg0.method22478() * 662476137;
		this.anInt2978 = arg0.method22478() * 51732377;
	}

	@OriginalMember(owner = "client!aqj", name = "y", descriptor = "(Lclient!kw;)V", line = 157)
	@Override
	void method21766(@OriginalArg(0) Class368 arg0) {
		arg0.method28204(this.anInt2979 * 960278917, this.anInt2977 * 1445343097, this.anInt2976 * 1659718361, this.anInt2978 * 1644266665);
	}

	@OriginalMember(owner = "client!aqj", name = "c", descriptor = "(Lclient!kw;B)V", line = 157)
	@Override
	void method21764(@OriginalArg(0) Class368 arg0) {
		arg0.method28204(this.anInt2979 * 960278917, this.anInt2977 * 1445343097, this.anInt2976 * 1659718361, this.anInt2978 * 1644266665);
	}

	@OriginalMember(owner = "client!aqj", name = "l", descriptor = "(Lclient!kw;)V", line = 157)
	@Override
	void method21762(@OriginalArg(0) Class368 arg0) {
		arg0.method28204(this.anInt2979 * 960278917, this.anInt2977 * 1445343097, this.anInt2976 * 1659718361, this.anInt2978 * 1644266665);
	}

	@OriginalMember(owner = "client!aqj", name = "w", descriptor = "(Lclient!kw;)V", line = 157)
	@Override
	void method21767(@OriginalArg(0) Class368 arg0) {
		arg0.method28204(this.anInt2979 * 960278917, this.anInt2977 * 1445343097, this.anInt2976 * 1659718361, this.anInt2978 * 1644266665);
	}
}
