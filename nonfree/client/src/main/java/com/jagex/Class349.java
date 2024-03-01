package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class349 implements Comparable {

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "J")
	long aLong264;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "J")
	long aLong265;

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "Ljava/lang/Object;")
	Object anObject19;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "Ljava/lang/Object;")
	Object anObject20;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)V", line = 9)
	Class349(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		this.anObject19 = arg0;
		this.anObject20 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "(FLclient!mh;Lclient!mx;Lclient!mh;Lclient!mh;Lclient!mh;FFFI)V", line = 13)
	public static void method26571(@OriginalArg(0) float arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) Class320 arg3, @OriginalArg(4) Class320 arg4, @OriginalArg(5) Class320 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8) {
		if (arg3.method25869(arg1)) {
			return;
		}
		@Pc(9) Class320 local9 = Class320.method25891(0.0F, 0.0F, 0.0F);
		@Pc(14) Class320 local14 = Class320.method25906(Class320.method25928(arg3, arg1));
		local14.method25889(arg2);
		@Pc(21) Class320 local21 = Class320.method25928(local14, local9);
		@Pc(24) float local24 = local21.method25861();
		if (arg5.aFloat259 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat259) || local24 > arg7 || local24 < arg8) {
			arg1.method25893(arg3);
			arg4.method25868();
			return;
		}
		arg2.method26351();
		@Pc(54) Class320 local54 = Class320.method25891(1.0F, 0.0F, 0.0F);
		@Pc(59) Class320 local59 = Class320.method25891(0.0F, 1.0F, 0.0F);
		@Pc(64) Class320 local64 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local54.method25889(arg2);
		local59.method25889(arg2);
		local64.method25889(arg2);
		@Pc(84) Class320 local84 = Class320.method25891(Class320.method25962(local54, arg4), Class320.method25962(local59, arg4), Class320.method25962(local64, arg4));
		@Pc(87) Class320 local87 = Class320.method25906(local84);
		@Pc(104) Class320 local104 = Class320.method25891(local21.aFloat259 * arg5.aFloat259, local21.aFloat260 * arg5.aFloat260, local21.aFloat261 * arg5.aFloat261);
		local87.method25875(local104, arg0);
		local87.method25887(arg6);
		@Pc(116) Class320 local116 = Class320.method25888(local54, local87.aFloat259);
		local116.method25875(local59, local87.aFloat260);
		local116.method25875(local64, local87.aFloat261);
		arg4.method25893(local116);
		arg1.method25872(Class320.method25888(arg4, arg0));
	}

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "(Lclient!nm;I)I", line = 15)
	int method26563(@OriginalArg(0) Class349 arg0) {
		if (this.aLong264 * 2362869400516197987L < arg0.aLong264 * 2362869400516197987L) {
			return -1;
		} else if (this.aLong264 * 2362869400516197987L > arg0.aLong264 * 2362869400516197987L) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!nm;)I", line = 15)
	int method26569(@OriginalArg(0) Class349 arg0) {
		if (this.aLong264 * 2362869400516197987L < arg0.aLong264 * 2362869400516197987L) {
			return -1;
		} else if (this.aLong264 * 2362869400516197987L > arg0.aLong264 * 2362869400516197987L) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "hm", descriptor = "(Ljava/lang/Object;)Z", line = 21)
	public boolean method26564(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class349)) {
			throw new IllegalArgumentException();
		}
		return this.anObject20.equals(((Class349) arg0).anObject20);
	}

	@OriginalMember(owner = "client!nm", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 21)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class349)) {
			throw new IllegalArgumentException();
		}
		return this.anObject20.equals(((Class349) arg0).anObject20);
	}

	@OriginalMember(owner = "client!nm", name = "ib", descriptor = "(Ljava/lang/Object;)Z", line = 21)
	public boolean method26566(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class349)) {
			throw new IllegalArgumentException();
		}
		return this.anObject20.equals(((Class349) arg0).anObject20);
	}

	@OriginalMember(owner = "client!nm", name = "oy", descriptor = "()I", line = 26)
	public int method26567() {
		return this.anObject20.hashCode();
	}

	@OriginalMember(owner = "client!nm", name = "ol", descriptor = "()I", line = 26)
	public int method26568() {
		return this.anObject20.hashCode();
	}

	@OriginalMember(owner = "client!nm", name = "hashCode", descriptor = "()I", line = 26)
	@Override
	public int hashCode() {
		return this.anObject20.hashCode();
	}

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "(Ljava/lang/Object;)I", line = 30)
	public int method26565(@OriginalArg(0) Object arg0) {
		return this.method26563((Class349) arg0);
	}

	@OriginalMember(owner = "client!nm", name = "compareTo", descriptor = "(Ljava/lang/Object;)I", line = 30)
	@Override
	public int compareTo(@OriginalArg(0) Object arg0) {
		return this.method26563((Class349) arg0);
	}

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "(Ljava/lang/Object;)I", line = 30)
	public int method26570(@OriginalArg(0) Object arg0) {
		return this.method26563((Class349) arg0);
	}

	@OriginalMember(owner = "client!nm", name = "ef", descriptor = "(Lclient!vs;I)V", line = 4800)
	static final void method26576(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class80.method21592(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!nm", name = "eo", descriptor = "(Lclient!vs;I)V", line = 4900)
	static final void method26577(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class284.method25470(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!nm", name = "qj", descriptor = "(Lclient!vs;I)V", line = 6979)
	static final void method26572(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3539 * 1132456653;
	}

	@OriginalMember(owner = "client!nm", name = "th", descriptor = "(Lclient!vs;I)V", line = 7697)
	static final void method26578(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 312124549;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		Class510.aClass183_1.method23588(local13);
	}

	@OriginalMember(owner = "client!nm", name = "xb", descriptor = "(Lclient!vs;I)V", line = 8365)
	static final void method26573(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (local13.startsWith(Class301.method25664(0)) || local13.startsWith(Class301.method25664(1))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class283.method25455(local13) ? 1 : 0;
	}

	@OriginalMember(owner = "client!nm", name = "aex", descriptor = "(Lclient!vs;I)V", line = 9812)
	static final void method26574(@OriginalArg(0) Class536 arg0) {
		Class21_Sub1.anInt289 = 0;
	}

	@OriginalMember(owner = "client!nm", name = "afp", descriptor = "(Lclient!vs;I)V", line = 9881)
	static final void method26575(@OriginalArg(0) Class536 arg0) {
		throw new RuntimeException("");
	}
}
