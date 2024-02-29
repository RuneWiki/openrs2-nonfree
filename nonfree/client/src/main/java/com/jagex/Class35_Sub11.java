package com.jagex;

import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ans")
public class Class35_Sub11 extends Class35 {

	@OriginalMember(owner = "client!ans", name = "o", descriptor = "[Lclient!gh;")
	public static Class273[] aClass273Array1;

	@OriginalMember(owner = "client!ans", name = "w", descriptor = "I")
	public static final int anInt2388 = 64;

	@OriginalMember(owner = "client!ans", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;Lclient!pw;Ljava/util/Map;)V", line = 18)
	public Class35_Sub11(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class478 arg2, @OriginalArg(3) Map arg3) {
		super(arg0, arg1, arg2, Class647.aClass647_93, 64, new Class111_Sub1(arg3));
	}

	@OriginalMember(owner = "client!ans", name = "r", descriptor = "(III)I", line = 227)
	public static final int method17186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}
}
