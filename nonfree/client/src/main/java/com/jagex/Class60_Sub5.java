package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahp")
public class Class60_Sub5 extends Class60 {

	@OriginalMember(owner = "client!ahp", name = "x", descriptor = "I")
	public static final int anInt1487 = 1;

	@OriginalMember(owner = "client!ahp", name = "s", descriptor = "I")
	public static final int anInt1488 = 0;

	@OriginalMember(owner = "client!ahp", name = "<init>", descriptor = "(Lclient!aht;)V", line = 11)
	public Class60_Sub5(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahp", name = "<init>", descriptor = "(ILclient!aht;)V", line = 15)
	public Class60_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ahp", name = "v", descriptor = "(I)V", line = 19)
	public void method12920() {
		if (this.anInt2079 * -1373670555 != 0 && this.aClass3_Sub45_36.aClass60_Sub9_1.method13345() != 1) {
			this.anInt2079 = 0;
		}
		if (this.anInt2079 * -1373670555 != 0 && this.aClass3_Sub45_36.aClass60_Sub30_1.method13950() == 2) {
			this.anInt2079 = 0;
		}
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 1) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ahp", name = "o", descriptor = "()V", line = 19)
	public void method12924() {
		if (this.anInt2079 * -1373670555 != 0 && this.aClass3_Sub45_36.aClass60_Sub9_1.method13345() != 1) {
			this.anInt2079 = 0;
		}
		if (this.anInt2079 * -1373670555 != 0 && this.aClass3_Sub45_36.aClass60_Sub30_1.method13950() == 2) {
			this.anInt2079 = 0;
		}
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 1) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ahp", name = "u", descriptor = "()I", line = 25)
	@Override
	int method14605() {
		return 1;
	}

	@OriginalMember(owner = "client!ahp", name = "p", descriptor = "(I)I", line = 25)
	@Override
	int method14603() {
		return 1;
	}

	@OriginalMember(owner = "client!ahp", name = "h", descriptor = "()I", line = 25)
	@Override
	int method14602() {
		return 1;
	}

	@OriginalMember(owner = "client!ahp", name = "x", descriptor = "()I", line = 25)
	@Override
	int method14607() {
		return 1;
	}

	@OriginalMember(owner = "client!ahp", name = "s", descriptor = "()I", line = 25)
	@Override
	int method14604() {
		return 1;
	}

	@OriginalMember(owner = "client!ahp", name = "y", descriptor = "()I", line = 25)
	@Override
	int method14606() {
		return 1;
	}

	@OriginalMember(owner = "client!ahp", name = "b", descriptor = "()I", line = 25)
	@Override
	int method14615() {
		return 1;
	}

	@OriginalMember(owner = "client!ahp", name = "t", descriptor = "(B)Z", line = 29)
	public boolean method12921() {
		return true;
	}

	@OriginalMember(owner = "client!ahp", name = "i", descriptor = "()Z", line = 29)
	public boolean method12925() {
		return true;
	}

	@OriginalMember(owner = "client!ahp", name = "f", descriptor = "()Z", line = 29)
	public boolean method12926() {
		return true;
	}

	@OriginalMember(owner = "client!ahp", name = "a", descriptor = "(IB)I", line = 33)
	@Override
	public int method14599(@OriginalArg(0) int arg0) {
		if (arg0 != 0 && this.aClass3_Sub45_36.aClass60_Sub30_1.method13950() == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass3_Sub45_36.aClass60_Sub9_1.method13345() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!ahp", name = "c", descriptor = "(I)I", line = 33)
	@Override
	public int method14608(@OriginalArg(0) int arg0) {
		if (arg0 != 0 && this.aClass3_Sub45_36.aClass60_Sub30_1.method13950() == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass3_Sub45_36.aClass60_Sub9_1.method13345() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!ahp", name = "z", descriptor = "(I)I", line = 33)
	@Override
	public int method14609(@OriginalArg(0) int arg0) {
		if (arg0 != 0 && this.aClass3_Sub45_36.aClass60_Sub30_1.method13950() == 2) {
			return 3;
		} else if (arg0 == 0 || this.aClass3_Sub45_36.aClass60_Sub9_1.method13345() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!ahp", name = "l", descriptor = "(IB)V", line = 39)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ahp", name = "j", descriptor = "(I)V", line = 39)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ahp", name = "n", descriptor = "(I)V", line = 39)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ahp", name = "k", descriptor = "()I", line = 43)
	public int method12922() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ahp", name = "w", descriptor = "(I)I", line = 43)
	public int method12923() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ahp", name = "arb", descriptor = "(Lclient!vs;I)V", line = 12102)
	static final void method12927(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) Class630 local28 = Class3_Sub20.aClass625_1.method33783(local23);
		if (local28.method33850()) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class107.aClass454_3.method28448(local13).method28401(local23, local28.aString248);
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class107.aClass454_3.method28448(local13).method28400(local23, local28.anInt5585 * 100041865);
		}
	}
}
