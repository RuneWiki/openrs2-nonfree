package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aoz")
public class Class35_Sub22 extends Class35 {

	@OriginalMember(owner = "client!aoz", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;Lclient!pw;)V", line = 12)
	public Class35_Sub22(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class478 arg2) {
		super(arg0, arg1, arg2, Class647.aClass647_42, 64, new Class46(Class67.class));
	}

	@OriginalMember(owner = "client!aoz", name = "c", descriptor = "(II)Lclient!ze;", line = 20)
	public static Class687 method18345(@OriginalArg(0) int arg0) {
		@Pc(2) Class687[] local2 = Class438.method28912();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class687 local12 = local2[local4];
			if (local12.anInt5871 * 1457930057 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aoz", name = "ev", descriptor = "(II)Z", line = 1756)
	public static boolean method18346(@OriginalArg(0) int arg0) {
		return arg0 == 16 || arg0 == 3 || arg0 == 14;
	}
}
