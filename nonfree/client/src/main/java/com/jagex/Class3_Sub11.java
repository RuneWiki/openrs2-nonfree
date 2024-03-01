package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afu")
public abstract class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!afu", name = "<init>", descriptor = "()V", line = 6)
	Class3_Sub11() {
	}

	@OriginalMember(owner = "client!afu", name = "h", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IB)V", line = 37)
	public static void method18310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(7) int arg7) {
		@Pc(5) Class214 local5 = (Class214) Class196.aMap9.get(arg0);
		if (local5 == null) {
			local5 = new Class214();
			Class196.aMap9.put(arg0, local5);
		}
		@Pc(29) Class3_Sub1_Sub18 local29 = local5.method24275(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		Class196.aClass581_27.method33241(local29, (long) (local29.anInt2704 * 178210753));
		Class196.aClass546_14.method32621(local29);
		client.anInt3035 = client.anInt3138 * -556377989;
	}
}
