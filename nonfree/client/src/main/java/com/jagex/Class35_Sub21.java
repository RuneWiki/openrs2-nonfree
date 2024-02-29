package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoy")
public class Class35_Sub21 extends Class35 {

	@OriginalMember(owner = "client!aoy", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;Lclient!pw;)V", line = 12)
	public Class35_Sub21(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class478 arg2) {
		super(arg0, arg1, arg2, Class647.aClass647_39, 128, new Class46(Class36.class));
	}

	@OriginalMember(owner = "client!aoy", name = "bb", descriptor = "([II)Ljava/lang/String;", line = 1390)
	static String method18312(@OriginalArg(0) int[] arg0) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			@Pc(17) Class303 local17 = (Class303) Class252.aClass42_Sub2_1.method18319(arg0[local5]);
			if (local17.anInt4051 * 2044266729 != -1) {
				local3.append(" <sprite=").append(local17.anInt4051 * 2044266729).append(">");
			}
		}
		return local3.toString();
	}
}
