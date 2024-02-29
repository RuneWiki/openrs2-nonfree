package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akw")
public class Class77_Sub40 extends Class77 {

	@OriginalMember(owner = "client!akw", name = "l", descriptor = "I")
	public int anInt1786;

	@OriginalMember(owner = "client!akw", name = "<init>", descriptor = "(I)V", line = 6)
	public Class77_Sub40(@OriginalArg(0) int arg0) {
		this.anInt1786 = arg0 * 347734535;
	}

	@OriginalMember(owner = "client!akw", name = "ad", descriptor = "(IZI)V", line = 213)
	static void method14758(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(23, (long) arg0);
		local4.method21545();
		local4.anInt2959 = (arg1 ? 1 : 0) * 517206857;
	}
}
