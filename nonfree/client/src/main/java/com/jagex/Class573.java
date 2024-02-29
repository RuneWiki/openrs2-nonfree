package com.jagex;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public class Class573 {

	@OriginalMember(owner = "client!ud", name = "bw", descriptor = "Lclient!cy;")
	public static Class83 aClass83_35;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
	final int anInt5385;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Ljava/util/LinkedList;")
	final LinkedList aLinkedList5;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
	final int anInt5386;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
	final int anInt5384;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "F")
	final float aFloat313;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(ILjava/util/LinkedList;IIF)V", line = 12)
	Class573(@OriginalArg(0) int arg0, @OriginalArg(1) LinkedList arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		this.anInt5385 = arg0 * -891726949;
		this.aLinkedList5 = arg1;
		this.anInt5386 = arg2 * -1086277771;
		this.anInt5384 = arg3 * 1787761333;
		this.aFloat313 = arg4;
	}

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "(B)Z", line = 103)
	static boolean method31486() {
		return Class157.aBoolean553;
	}

	@OriginalMember(owner = "client!ud", name = "kf", descriptor = "(Lclient!ae;Lclient!gm;IIII)V", line = 10209)
	static void method31487(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class77_Sub20 local8;
		if (arg2 == 1) {
			local8 = Class365.method28132(Class414.aClass414_98, arg0.aClass16_1);
			Class416.method28672(local8, arg3, arg4, arg1.anInt3936 * 403396513);
			arg0.method2004(local8);
		}
		if (arg2 == 2) {
			local8 = Class365.method28132(Class414.aClass414_37, arg0.aClass16_1);
			Class416.method28672(local8, arg3, arg4, arg1.anInt3936 * 403396513);
			arg0.method2004(local8);
		}
		if (arg2 == 3) {
			local8 = Class365.method28132(Class414.aClass414_59, arg0.aClass16_1);
			Class416.method28672(local8, arg3, arg4, arg1.anInt3936 * 403396513);
			arg0.method2004(local8);
		}
		if (arg2 == 4) {
			local8 = Class365.method28132(Class414.aClass414_46, arg0.aClass16_1);
			Class416.method28672(local8, arg3, arg4, arg1.anInt3936 * 403396513);
			arg0.method2004(local8);
		}
		if (arg2 == 5) {
			local8 = Class365.method28132(Class414.aClass414_99, arg0.aClass16_1);
			Class416.method28672(local8, arg3, arg4, arg1.anInt3936 * 403396513);
			arg0.method2004(local8);
		}
		if (arg2 == 6) {
			local8 = Class365.method28132(Class414.aClass414_21, arg0.aClass16_1);
			Class416.method28672(local8, arg3, arg4, arg1.anInt3936 * 403396513);
			arg0.method2004(local8);
		}
		if (arg2 == 7) {
			local8 = Class365.method28132(Class414.aClass414_13, arg0.aClass16_1);
			Class416.method28672(local8, arg3, arg4, arg1.anInt3936 * 403396513);
			arg0.method2004(local8);
		}
		if (arg2 == 8) {
			local8 = Class365.method28132(Class414.aClass414_102, arg0.aClass16_1);
			Class416.method28672(local8, arg3, arg4, arg1.anInt3936 * 403396513);
			arg0.method2004(local8);
		}
		if (arg2 == 9) {
			local8 = Class365.method28132(Class414.aClass414_73, arg0.aClass16_1);
			Class416.method28672(local8, arg3, arg4, arg1.anInt3936 * 403396513);
			arg0.method2004(local8);
		}
		if (arg2 == 10) {
			local8 = Class365.method28132(Class414.aClass414_60, arg0.aClass16_1);
			Class416.method28672(local8, arg3, arg4, arg1.anInt3936 * 403396513);
			arg0.method2004(local8);
		}
	}

	@OriginalMember(owner = "client!ud", name = "aps", descriptor = "(Lclient!yf;I)V", line = 12327)
	static final void method31488(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
	}

	@OriginalMember(owner = "client!ud", name = "avb", descriptor = "(Lclient!yf;B)V", line = 13116)
	static final void method31489(@OriginalArg(0) Class665 arg0) {
		@Pc(1) boolean local1 = false;
		if (client.aBoolean588) {
			try {
				@Pc(43) Object local43 = Class413.aClass413_6.method28597(new Object[] { Class96_Sub3.anInt810 * 1757658941, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte77 == 1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] });
				if (local43 != null) {
					local1 = (Boolean) local43;
				}
			} catch (@Pc(52) Throwable local52) {
			}
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local1 ? 1 : 0;
	}
}
