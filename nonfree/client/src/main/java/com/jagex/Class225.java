package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public class Class225 {

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Z")
	static boolean aBoolean646 = true;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[Lclient!dv;")
	Class235[] aClass235Array1;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!py;")
	Class497 aClass497_98;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	int anInt3644;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!py;)V", line = 12)
	public Class225(@OriginalArg(0) Class497 arg0) {
		this.aClass497_98 = arg0;
		this.anInt3644 = arg0.method30062(0) * -229302655;
		this.method25599();
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(II)Lclient!dv;", line = 19)
	public Class235 method25597(@OriginalArg(0) int arg0) {
		this.method25599();
		return this.aClass235Array1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "w", descriptor = "(I)Lclient!dv;", line = 19)
	public Class235 method25598(@OriginalArg(0) int arg0) {
		this.method25599();
		return this.aClass235Array1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "k", descriptor = "(I)Lclient!dv;", line = 19)
	public Class235 method25600(@OriginalArg(0) int arg0) {
		this.method25599();
		return this.aClass235Array1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)Lclient!dv;", line = 19)
	public Class235 method25601(@OriginalArg(0) int arg0) {
		this.method25599();
		return this.aClass235Array1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "m", descriptor = "(I)Lclient!dv;", line = 19)
	public Class235 method25602(@OriginalArg(0) int arg0) {
		this.method25599();
		return this.aClass235Array1[arg0];
	}

	@OriginalMember(owner = "client!df", name = "n", descriptor = "(I)V", line = 24)
	void method25599() {
		if (!aBoolean646) {
			return;
		}
		aBoolean646 = false;
		this.aClass235Array1 = new Class235[this.anInt3644 * -844291711];
		for (@Pc(13) int local13 = 0; local13 < this.anInt3644 * -844291711; local13++) {
			@Pc(29) Class93_Sub41 local29 = new Class93_Sub41(this.aClass497_98.method30044(0, local13));
			if (local29.aByteArray58 == null) {
				this.aClass235Array1[local13] = null;
			} else {
				try {
					@Pc(43) Class235 local43 = new Class235();
					local43.method25754(local13, local29);
					this.aClass235Array1[local13] = local43;
				} catch (@Pc(55) Exception local55) {
					this.aClass235Array1[local13] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "z", descriptor = "(ILjava/lang/String;ZI)V", line = 168)
	public static void method25604(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (!Class146_Sub2.method11709()) {
			return;
		}
		if (Class411.anInt4746 * 276097583 != arg0) {
			Class411.aLong271 = -7033311592096984251L;
		}
		Class411.anInt4746 = arg0 * 48143567;
		Class411.aString199 = arg1;
		Class411.aBoolean751 = arg2;
		Class481.method29756(7);
	}

	@OriginalMember(owner = "client!df", name = "ag", descriptor = "(III)V", line = 177)
	public static void method25605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class93_Sub1_Sub11 local9 = Class371.method28006(20, (long) arg1 << 32 | (long) arg0);
		local9.method21865();
	}

	@OriginalMember(owner = "client!df", name = "acf", descriptor = "(Lclient!yf;B)V", line = 10058)
	static final void method25603(@OriginalArg(0) Class681 arg0) {
		Class663.method32868(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091]);
	}
}
