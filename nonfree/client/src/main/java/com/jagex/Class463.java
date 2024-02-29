package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public class Class463 {

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	public static final int anInt4971 = 4;

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
	public static final int anInt4972 = 5;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
	public static final int anInt4973 = 2;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
	public static final int anInt4974 = 3;

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
	public static final int anInt4975 = 6;

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
	public static final int anInt4976 = 1;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 11)
	Class463() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "(ZZI)V", line = 15)
	public static void method29543(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Class656.anInt5766 += 194044063;
			Class509.method30279();
		}
		if (arg1) {
			Class656.anInt5767 += 555410307;
			Class652.method32972();
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(II)V", line = 16)
	public static void method29544(@OriginalArg(0) int arg0) {
		Class92.method23486(arg0);
	}

	@OriginalMember(owner = "client!pg", name = "rm", descriptor = "(Lclient!yf;I)V", line = 7632)
	static final void method29545(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		Class397.method28439(local11, arg0);
	}
}
