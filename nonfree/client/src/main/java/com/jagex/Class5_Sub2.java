package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aah")
public class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!aah", name = "p", descriptor = "Lclient!aja;")
	final Class4_Sub1_Sub1 aClass4_Sub1_Sub1_1;

	@OriginalMember(owner = "client!aah", name = "<init>", descriptor = "(Lclient!abt;II[B)V", line = 9)
	Class5_Sub2(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass4_Sub1_Sub1_1 = Class4_Sub1_Sub1.method14102(arg0, Class121.aClass121_23, Class127.aClass127_23, arg1, arg2, false, arg3, Class121.aClass121_23);
		this.aClass4_Sub1_Sub1_1.method14074(false, false);
	}

	@OriginalMember(owner = "client!aah", name = "p", descriptor = "(Lclient!abt;II[I[I)Lclient!aah;", line = 15)
	static Class5_Sub2 method592(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = local6 * arg1 + arg3[local6];
			for (@Pc(19) int local19 = 0; local19 < arg4[local6]; local19++) {
				local4[local17++] = -1;
			}
		}
		return new Class5_Sub2(arg0, arg1, arg2, local4);
	}

	@OriginalMember(owner = "client!aah", name = "g", descriptor = "(Lclient!abt;II[I[I)Lclient!aah;", line = 15)
	static Class5_Sub2 method593(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = local6 * arg1 + arg3[local6];
			for (@Pc(19) int local19 = 0; local19 < arg4[local6]; local19++) {
				local4[local17++] = -1;
			}
		}
		return new Class5_Sub2(arg0, arg1, arg2, local4);
	}

	@OriginalMember(owner = "client!aah", name = "a", descriptor = "(Lclient!abt;II[I[I)Lclient!aah;", line = 15)
	static Class5_Sub2 method594(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = local6 * arg1 + arg3[local6];
			for (@Pc(19) int local19 = 0; local19 < arg4[local6]; local19++) {
				local4[local17++] = -1;
			}
		}
		return new Class5_Sub2(arg0, arg1, arg2, local4);
	}
}
