package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afk")
public class Class96_Sub10 extends Class96 {

	@OriginalMember(owner = "client!afk", name = "hd", descriptor = "Lclient!aop;")
	public static Class35_Sub20 aClass35_Sub20_1;

	@OriginalMember(owner = "client!afk", name = "g", descriptor = "S")
	static short aShort24;

	@OriginalMember(owner = "client!afk", name = "c", descriptor = "I")
	final int anInt851;

	@OriginalMember(owner = "client!afk", name = "v", descriptor = "I")
	final int anInt848;

	@OriginalMember(owner = "client!afk", name = "l", descriptor = "I")
	final int anInt849;

	@OriginalMember(owner = "client!afk", name = "y", descriptor = "I")
	final int anInt850;

	@OriginalMember(owner = "client!afk", name = "w", descriptor = "Lclient!qs;")
	Class496 aClass496_1;

	@OriginalMember(owner = "client!afk", name = "<init>", descriptor = "(Lclient!akv;)V", line = 18)
	Class96_Sub10(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt851 = arg0.method22483() * 2035251543;
		this.anInt848 = arg0.method22478() * 383236069;
		this.anInt849 = arg0.method22478() * -1626840205;
		this.anInt850 = arg0.method22478() * -1556749807;
		this.aClass496_1 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_9, this, this.anInt851 * -1395096985, this.anInt850 * 605376241, this.anInt848 * -56513043, Class220.aClass220_8.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, this.anInt849 * -13993541, false);
		if (this.aClass496_1 != null) {
			this.aClass496_1.method30093();
		}
	}

	@OriginalMember(owner = "client!afk", name = "c", descriptor = "(I)V", line = 30)
	@Override
	public void method19911() {
		if (this.aClass496_1 != null) {
			this.aClass496_1.method30099();
		}
	}

	@OriginalMember(owner = "client!afk", name = "w", descriptor = "()V", line = 30)
	@Override
	public void method19913() {
		if (this.aClass496_1 != null) {
			this.aClass496_1.method30099();
		}
	}

	@OriginalMember(owner = "client!afk", name = "y", descriptor = "()V", line = 30)
	@Override
	public void method19912() {
		if (this.aClass496_1 != null) {
			this.aClass496_1.method30099();
		}
	}

	@OriginalMember(owner = "client!afk", name = "v", descriptor = "(B)V", line = 36)
	@Override
	void method19901() {
		if (this.aClass496_1 != null) {
			this.aClass496_1.method30100(50);
			Class94_Sub4.aClass261_1.method26325(this.aClass496_1);
			this.aClass496_1 = null;
		}
	}

	@OriginalMember(owner = "client!afk", name = "x", descriptor = "()V", line = 36)
	@Override
	void method19902() {
		if (this.aClass496_1 != null) {
			this.aClass496_1.method30100(50);
			Class94_Sub4.aClass261_1.method26325(this.aClass496_1);
			this.aClass496_1 = null;
		}
	}
}
