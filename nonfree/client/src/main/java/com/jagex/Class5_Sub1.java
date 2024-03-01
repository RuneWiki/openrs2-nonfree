package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aac")
public class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!aac", name = "p", descriptor = "Lclient!ic;")
	final Interface20 anInterface20_1;

	@OriginalMember(owner = "client!aac", name = "<init>", descriptor = "(Lclient!abv;II[B)V", line = 9)
	Class5_Sub1(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface20_1 = arg0.method17502(Class121.aClass121_23, arg1, arg2, false, arg3);
		this.anInterface20_1.method8951(false, false);
	}

	@OriginalMember(owner = "client!aac", name = "<init>", descriptor = "(Lclient!abv;II[I)V", line = 14)
	Class5_Sub1(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface20_1 = arg0.method17501(arg1, arg2, false, arg3);
		this.anInterface20_1.method8951(false, false);
	}

	@OriginalMember(owner = "client!aac", name = "a", descriptor = "(Lclient!abv;II[I[I)Lclient!aac;", line = 20)
	static Class5_Sub1 method276(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(11) int local11;
		@Pc(22) int local22;
		@Pc(24) int local24;
		if (!arg0.method17768(Class121.aClass121_23, Class127.aClass127_23)) {
			@Pc(51) int[] local51 = new int[arg1 * arg2];
			for (local11 = 0; local11 < arg2; local11++) {
				local22 = local11 * arg1 + arg3[local11];
				for (local24 = 0; local24 < arg4[local11]; local24++) {
					local51[local22++] = -16777216;
				}
			}
			return new Class5_Sub1(arg0, arg1, arg2, local51);
		}
		@Pc(9) byte[] local9 = new byte[arg1 * arg2];
		for (local11 = 0; local11 < arg2; local11++) {
			local22 = local11 * arg1 + arg3[local11];
			for (local24 = 0; local24 < arg4[local11]; local24++) {
				local9[local22++] = -1;
			}
		}
		return new Class5_Sub1(arg0, arg1, arg2, local9);
	}

	@OriginalMember(owner = "client!aac", name = "p", descriptor = "(Lclient!abv;II[I[I)Lclient!aac;", line = 20)
	static Class5_Sub1 method277(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(11) int local11;
		@Pc(22) int local22;
		@Pc(24) int local24;
		if (!arg0.method17768(Class121.aClass121_23, Class127.aClass127_23)) {
			@Pc(51) int[] local51 = new int[arg1 * arg2];
			for (local11 = 0; local11 < arg2; local11++) {
				local22 = local11 * arg1 + arg3[local11];
				for (local24 = 0; local24 < arg4[local11]; local24++) {
					local51[local22++] = -16777216;
				}
			}
			return new Class5_Sub1(arg0, arg1, arg2, local51);
		}
		@Pc(9) byte[] local9 = new byte[arg1 * arg2];
		for (local11 = 0; local11 < arg2; local11++) {
			local22 = local11 * arg1 + arg3[local11];
			for (local24 = 0; local24 < arg4[local11]; local24++) {
				local9[local22++] = -1;
			}
		}
		return new Class5_Sub1(arg0, arg1, arg2, local9);
	}
}
