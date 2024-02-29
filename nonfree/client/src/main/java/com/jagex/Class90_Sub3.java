package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aex")
public class Class90_Sub3 extends Class90 {

	@OriginalMember(owner = "client!aex", name = "p", descriptor = "Lclient!aoa;")
	final Class78_Sub2_Sub1 aClass78_Sub2_Sub1_3;

	@OriginalMember(owner = "client!aex", name = "<init>", descriptor = "(Lclient!aeq;II[B)V", line = 9)
	Class90_Sub3(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass78_Sub2_Sub1_3 = Class78_Sub2_Sub1.method17527(arg0, Class212.aClass212_17, Class206.aClass206_23, arg1, arg2, false, arg3, Class212.aClass212_17);
		this.aClass78_Sub2_Sub1_3.method17493(false, false);
	}

	@OriginalMember(owner = "client!aex", name = "c", descriptor = "(Lclient!aeq;II[I[I)Lclient!aex;", line = 15)
	static Class90_Sub3 method6742(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = local6 * arg1 + arg3[local6];
			for (@Pc(19) int local19 = 0; local19 < arg4[local6]; local19++) {
				local4[local17++] = -1;
			}
		}
		return new Class90_Sub3(arg0, arg1, arg2, local4);
	}

	@OriginalMember(owner = "client!aex", name = "v", descriptor = "(Lclient!aeq;II[I[I)Lclient!aex;", line = 15)
	static Class90_Sub3 method6743(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = local6 * arg1 + arg3[local6];
			for (@Pc(19) int local19 = 0; local19 < arg4[local6]; local19++) {
				local4[local17++] = -1;
			}
		}
		return new Class90_Sub3(arg0, arg1, arg2, local4);
	}

	@OriginalMember(owner = "client!aex", name = "p", descriptor = "(Lclient!aeq;II[I[I)Lclient!aex;", line = 15)
	static Class90_Sub3 method6744(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = local6 * arg1 + arg3[local6];
			for (@Pc(19) int local19 = 0; local19 < arg4[local6]; local19++) {
				local4[local17++] = -1;
			}
		}
		return new Class90_Sub3(arg0, arg1, arg2, local4);
	}

	@OriginalMember(owner = "client!aex", name = "l", descriptor = "(Lclient!aeq;II[I[I)Lclient!aex;", line = 15)
	static Class90_Sub3 method6745(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = local6 * arg1 + arg3[local6];
			for (@Pc(19) int local19 = 0; local19 < arg4[local6]; local19++) {
				local4[local17++] = -1;
			}
		}
		return new Class90_Sub3(arg0, arg1, arg2, local4);
	}
}
