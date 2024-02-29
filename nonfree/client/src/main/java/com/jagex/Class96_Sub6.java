package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aff")
public class Class96_Sub6 extends Class96 {

	@OriginalMember(owner = "client!aff", name = "bi", descriptor = "I")
	public static int anInt826;

	@OriginalMember(owner = "client!aff", name = "c", descriptor = "I")
	final int anInt824;

	@OriginalMember(owner = "client!aff", name = "v", descriptor = "I")
	final int anInt822;

	@OriginalMember(owner = "client!aff", name = "l", descriptor = "I")
	final int anInt821;

	@OriginalMember(owner = "client!aff", name = "y", descriptor = "I")
	final int anInt823;

	@OriginalMember(owner = "client!aff", name = "w", descriptor = "I")
	final int anInt825;

	@OriginalMember(owner = "client!aff", name = "<init>", descriptor = "(Lclient!akv;)V", line = 13)
	Class96_Sub6(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt824 = arg0.method22483() * -861735383;
		@Pc(13) int local13 = arg0.method22500();
		this.anInt822 = (local13 >>> 16) * -1794576893;
		this.anInt821 = (local13 & 0xFFFF) * 2136667201;
		this.anInt823 = arg0.method22478() * -791220237;
		this.anInt825 = arg0.method22535() * 1593831139;
	}

	@OriginalMember(owner = "client!aff", name = "w", descriptor = "()V", line = 23)
	@Override
	public void method19913() {
		Class589.aClass222Array1[this.anInt824 * -806812135].method25743(this.anInt822 * -1179276117, this.anInt821 * -303359039, this.anInt823 * 1926119739, this.anInt825 * 1588512459);
	}

	@OriginalMember(owner = "client!aff", name = "y", descriptor = "()V", line = 23)
	@Override
	public void method19912() {
		Class589.aClass222Array1[this.anInt824 * -806812135].method25743(this.anInt822 * -1179276117, this.anInt821 * -303359039, this.anInt823 * 1926119739, this.anInt825 * 1588512459);
	}

	@OriginalMember(owner = "client!aff", name = "c", descriptor = "(I)V", line = 23)
	@Override
	public void method19911() {
		Class589.aClass222Array1[this.anInt824 * -806812135].method25743(this.anInt822 * -1179276117, this.anInt821 * -303359039, this.anInt823 * 1926119739, this.anInt825 * 1588512459);
	}

	@OriginalMember(owner = "client!aff", name = "nk", descriptor = "(B)I", line = 12417)
	public static int method7162() {
		return Class617.aClass629_1.aBoolean848 ? 3 : 2;
	}
}
