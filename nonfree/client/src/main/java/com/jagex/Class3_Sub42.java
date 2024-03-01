package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahi")
public class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!ahi", name = "l", descriptor = "I")
	public final int anInt2796;

	@OriginalMember(owner = "client!ahi", name = "h", descriptor = "I")
	public final int anInt2797;

	@OriginalMember(owner = "client!ahi", name = "<init>", descriptor = "(II)V", line = 9)
	public Class3_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2796 = arg0 * 1439434287;
		this.anInt2797 = arg1 * 1710297957;
	}

	@OriginalMember(owner = "client!ahi", name = "l", descriptor = "()Z", line = 15)
	public boolean method20196() {
		return true;
	}

	@OriginalMember(owner = "client!ahi", name = "a", descriptor = "()Z", line = 15)
	public boolean method20197() {
		return true;
	}

	@OriginalMember(owner = "client!ahi", name = "g", descriptor = "()Z", line = 15)
	public boolean method20198() {
		return true;
	}

	@OriginalMember(owner = "client!ahi", name = "p", descriptor = "(B)Z", line = 15)
	public boolean method20199() {
		return true;
	}

	@OriginalMember(owner = "client!ahi", name = "aak", descriptor = "(Lclient!vs;I)V", line = 8842)
	static final void method20200(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (local13 == 0) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) Math.pow((double) local13, (double) local23);
		}
	}
}
