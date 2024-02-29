package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ael")
public class Class90_Sub1 extends Class90 {

	@OriginalMember(owner = "client!ael", name = "p", descriptor = "Lclient!ks;")
	final Interface37 anInterface37_4;

	@OriginalMember(owner = "client!ael", name = "<init>", descriptor = "(Lclient!aed;II[B)V", line = 9)
	Class90_Sub1(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface37_4 = arg0.method20533(Class212.aClass212_17, arg1, arg2, false, arg3);
		this.anInterface37_4.method10618(false, false);
	}

	@OriginalMember(owner = "client!ael", name = "<init>", descriptor = "(Lclient!aed;II[I)V", line = 14)
	Class90_Sub1(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface37_4 = arg0.method20530(arg1, arg2, false, arg3);
		this.anInterface37_4.method10618(false, false);
	}

	@OriginalMember(owner = "client!ael", name = "p", descriptor = "(Lclient!aed;II[I[I)Lclient!ael;", line = 20)
	static Class90_Sub1 method5112(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(11) int local11;
		@Pc(22) int local22;
		@Pc(24) int local24;
		if (!arg0.method20676(Class212.aClass212_17, Class206.aClass206_23)) {
			@Pc(51) int[] local51 = new int[arg1 * arg2];
			for (local11 = 0; local11 < arg2; local11++) {
				local22 = local11 * arg1 + arg3[local11];
				for (local24 = 0; local24 < arg4[local11]; local24++) {
					local51[local22++] = -16777216;
				}
			}
			return new Class90_Sub1(arg0, arg1, arg2, local51);
		}
		@Pc(9) byte[] local9 = new byte[arg1 * arg2];
		for (local11 = 0; local11 < arg2; local11++) {
			local22 = local11 * arg1 + arg3[local11];
			for (local24 = 0; local24 < arg4[local11]; local24++) {
				local9[local22++] = -1;
			}
		}
		return new Class90_Sub1(arg0, arg1, arg2, local9);
	}
}
