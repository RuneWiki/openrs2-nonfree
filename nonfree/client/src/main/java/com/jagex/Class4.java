package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aab")
public class Class4 {

	@OriginalMember(owner = "client!aab", name = "p", descriptor = "I")
	public static final int anInt14 = 1700;

	@OriginalMember(owner = "client!aab", name = "c", descriptor = "I")
	public static final int anInt15 = 40000;

	@OriginalMember(owner = "client!aab", name = "v", descriptor = "I")
	public static final int anInt16 = 131072;

	@OriginalMember(owner = "client!aab", name = "la", descriptor = "I")
	static int anInt17;

	@OriginalMember(owner = "client!aab", name = "fg", descriptor = "Lclient!pw;")
	public static Class478 aClass478_1;

	@OriginalMember(owner = "client!aab", name = "<init>", descriptor = "()V", line = 8)
	Class4() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!aab", name = "l", descriptor = "(IIZI)I", line = 58)
	public static int method35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg2);
		if (local4 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < local4.anIntArray193.length; local17++) {
				if (arg1 == local4.anIntArray192[local17]) {
					local15 += local4.anIntArray193[local17];
				}
			}
			return local15;
		}
	}
}
