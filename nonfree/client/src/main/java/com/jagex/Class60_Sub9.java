package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aic")
public class Class60_Sub9 extends Class60 {

	@OriginalMember(owner = "client!aic", name = "x", descriptor = "I")
	public static final int anInt1859 = 1;

	@OriginalMember(owner = "client!aic", name = "s", descriptor = "I")
	public static final int anInt1860 = 0;

	@OriginalMember(owner = "client!aic", name = "<init>", descriptor = "(Lclient!aht;)V", line = 12)
	public Class60_Sub9(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aic", name = "<init>", descriptor = "(ILclient!aht;)V", line = 16)
	public Class60_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aic", name = "v", descriptor = "(I)V", line = 20)
	public void method13341() {
		if (this.aClass3_Sub45_36.method13002() != Class543.aClass543_4) {
			this.anInt2079 = 1116833389;
		}
		if (this.anInt2079 * -1373670555 != 0 && this.anInt2079 * -1373670555 != 1) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aic", name = "o", descriptor = "()V", line = 20)
	public void method13344() {
		if (this.aClass3_Sub45_36.method13002() != Class543.aClass543_4) {
			this.anInt2079 = 1116833389;
		}
		if (this.anInt2079 * -1373670555 != 0 && this.anInt2079 * -1373670555 != 1) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aic", name = "x", descriptor = "()I", line = 25)
	@Override
	int method14607() {
		return 1;
	}

	@OriginalMember(owner = "client!aic", name = "s", descriptor = "()I", line = 25)
	@Override
	int method14604() {
		return 1;
	}

	@OriginalMember(owner = "client!aic", name = "p", descriptor = "(I)I", line = 25)
	@Override
	int method14603() {
		return 1;
	}

	@OriginalMember(owner = "client!aic", name = "y", descriptor = "()I", line = 25)
	@Override
	int method14606() {
		return 1;
	}

	@OriginalMember(owner = "client!aic", name = "h", descriptor = "()I", line = 25)
	@Override
	int method14602() {
		return 1;
	}

	@OriginalMember(owner = "client!aic", name = "u", descriptor = "()I", line = 25)
	@Override
	int method14605() {
		return 1;
	}

	@OriginalMember(owner = "client!aic", name = "b", descriptor = "()I", line = 25)
	@Override
	int method14615() {
		return 1;
	}

	@OriginalMember(owner = "client!aic", name = "t", descriptor = "(I)Z", line = 29)
	public boolean method13342() {
		return this.aClass3_Sub45_36.method13002() == Class543.aClass543_4;
	}

	@OriginalMember(owner = "client!aic", name = "i", descriptor = "()Z", line = 29)
	public boolean method13343() {
		return this.aClass3_Sub45_36.method13002() == Class543.aClass543_4;
	}

	@OriginalMember(owner = "client!aic", name = "a", descriptor = "(IB)I", line = 34)
	@Override
	public int method14599(@OriginalArg(0) int arg0) {
		if (this.aClass3_Sub45_36.method13002() != Class543.aClass543_4) {
			return 3;
		}
		if (arg0 == 0) {
			if (this.aClass3_Sub45_36.aClass60_Sub5_1.method12923() == 1) {
				return 2;
			}
			if (this.aClass3_Sub45_36.aClass60_Sub6_1.method12966() == 1) {
				return 2;
			}
			if (this.aClass3_Sub45_36.aClass60_Sub22_1.method13717() > 0) {
				return 2;
			}
		}
		return 1;
	}

	@OriginalMember(owner = "client!aic", name = "c", descriptor = "(I)I", line = 34)
	@Override
	public int method14608(@OriginalArg(0) int arg0) {
		if (this.aClass3_Sub45_36.method13002() != Class543.aClass543_4) {
			return 3;
		}
		if (arg0 == 0) {
			if (this.aClass3_Sub45_36.aClass60_Sub5_1.method12923() == 1) {
				return 2;
			}
			if (this.aClass3_Sub45_36.aClass60_Sub6_1.method12966() == 1) {
				return 2;
			}
			if (this.aClass3_Sub45_36.aClass60_Sub22_1.method13717() > 0) {
				return 2;
			}
		}
		return 1;
	}

	@OriginalMember(owner = "client!aic", name = "z", descriptor = "(I)I", line = 34)
	@Override
	public int method14609(@OriginalArg(0) int arg0) {
		if (this.aClass3_Sub45_36.method13002() != Class543.aClass543_4) {
			return 3;
		}
		if (arg0 == 0) {
			if (this.aClass3_Sub45_36.aClass60_Sub5_1.method12923() == 1) {
				return 2;
			}
			if (this.aClass3_Sub45_36.aClass60_Sub6_1.method12966() == 1) {
				return 2;
			}
			if (this.aClass3_Sub45_36.aClass60_Sub22_1.method13717() > 0) {
				return 2;
			}
		}
		return 1;
	}

	@OriginalMember(owner = "client!aic", name = "l", descriptor = "(IB)V", line = 46)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aic", name = "j", descriptor = "(I)V", line = 46)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aic", name = "n", descriptor = "(I)V", line = 46)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aic", name = "w", descriptor = "(I)I", line = 50)
	public int method13345() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aic", name = "w", descriptor = "(III)I", line = 1585)
	static final int method13346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(35) int local35 = Class51.method9862(arg0 + 45365, arg1 + 91923, 4) - 128 + (Class51.method9862(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Class51.method9862(arg0, arg1, 1) - 128 >> 2);
		local35 = (int) ((double) local35 * 0.3D) + 35;
		if (local35 < 10) {
			local35 = 10;
		} else if (local35 > 60) {
			local35 = 60;
		}
		return local35;
	}
}
