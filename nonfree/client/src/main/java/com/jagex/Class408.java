package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public class Class408 implements Interface71 {

	@OriginalMember(owner = "client!mv", name = "l", descriptor = "(Lclient!xb;[IJ)Ljava/lang/String;", line = 11)
	@Override
	public String method28555(@OriginalArg(0) Class638 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (arg0 == Class638.aClass638_3) {
			@Pc(10) Class36 local10 = (Class36) Class663.aClass35_Sub21_1.method18319(arg1[0]);
			return local10.method624((int) arg2);
		} else if (arg0 == Class638.aClass638_6 || Class638.aClass638_9 == arg0) {
			@Pc(29) Class18 local29 = (Class18) Class537.aClass35_Sub7_1.method18319((int) arg2);
			return local29.aString2;
		} else if (Class638.aClass638_1 == arg0 || Class638.aClass638_15 == arg0 || Class638.aClass638_10 == arg0 || Class638.aClass638_8 == arg0) {
			return ((Class36) Class663.aClass35_Sub21_1.method18319(arg1[0])).method624((int) arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(Lclient!xb;[IJ)Ljava/lang/String;", line = 11)
	@Override
	public String method28553(@OriginalArg(0) Class638 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (arg0 == Class638.aClass638_3) {
			@Pc(10) Class36 local10 = (Class36) Class663.aClass35_Sub21_1.method18319(arg1[0]);
			return local10.method624((int) arg2);
		} else if (arg0 == Class638.aClass638_6 || Class638.aClass638_9 == arg0) {
			@Pc(29) Class18 local29 = (Class18) Class537.aClass35_Sub7_1.method18319((int) arg2);
			return local29.aString2;
		} else if (Class638.aClass638_1 == arg0 || Class638.aClass638_15 == arg0 || Class638.aClass638_10 == arg0 || Class638.aClass638_8 == arg0) {
			return ((Class36) Class663.aClass35_Sub21_1.method18319(arg1[0])).method624((int) arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mv", name = "v", descriptor = "(Lclient!xb;[IJ)Ljava/lang/String;", line = 11)
	@Override
	public String method28554(@OriginalArg(0) Class638 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (arg0 == Class638.aClass638_3) {
			@Pc(10) Class36 local10 = (Class36) Class663.aClass35_Sub21_1.method18319(arg1[0]);
			return local10.method624((int) arg2);
		} else if (arg0 == Class638.aClass638_6 || Class638.aClass638_9 == arg0) {
			@Pc(29) Class18 local29 = (Class18) Class537.aClass35_Sub7_1.method18319((int) arg2);
			return local29.aString2;
		} else if (Class638.aClass638_1 == arg0 || Class638.aClass638_15 == arg0 || Class638.aClass638_10 == arg0 || Class638.aClass638_8 == arg0) {
			return ((Class36) Class663.aClass35_Sub21_1.method18319(arg1[0])).method624((int) arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mv", name = "p", descriptor = "(Lclient!xb;[IJ)Ljava/lang/String;", line = 11)
	@Override
	public String method28552(@OriginalArg(0) Class638 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (arg0 == Class638.aClass638_3) {
			@Pc(10) Class36 local10 = (Class36) Class663.aClass35_Sub21_1.method18319(arg1[0]);
			return local10.method624((int) arg2);
		} else if (arg0 == Class638.aClass638_6 || Class638.aClass638_9 == arg0) {
			@Pc(29) Class18 local29 = (Class18) Class537.aClass35_Sub7_1.method18319((int) arg2);
			return local29.aString2;
		} else if (Class638.aClass638_1 == arg0 || Class638.aClass638_15 == arg0 || Class638.aClass638_10 == arg0 || Class638.aClass638_8 == arg0) {
			return ((Class36) Class663.aClass35_Sub21_1.method18319(arg1[0])).method624((int) arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mv", name = "p", descriptor = "(Ljava/lang/CharSequence;CI)I", line = 11)
	static int method28556(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) char arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			if (arg0.charAt(local6) == arg1) {
				local1++;
			}
		}
		return local1;
	}
}
