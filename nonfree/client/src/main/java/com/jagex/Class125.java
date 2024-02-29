package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public abstract class Class125 {

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 6)
	Class125() {
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "()Lclient!rf;", line = 11)
	public static Class125 method12674() {
		try {
			return new Class125_Sub1();
		} catch (@Pc(4) Throwable local4) {
			return new Class125_Sub2();
		}
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "()Lclient!rf;", line = 11)
	public static Class125 method12675() {
		try {
			return new Class125_Sub1();
		} catch (@Pc(4) Throwable local4) {
			return new Class125_Sub2();
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(J)I", line = 19)
	final int method12676(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method12688();
		if (local3 > 0L) {
			Class281.method26679(local3);
		}
		return this.method12700(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(J)I", line = 19)
	final int method12677(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method12688();
		if (local3 > 0L) {
			Class281.method26679(local3);
		}
		return this.method12700(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "(J)I", line = 19)
	final int method12678(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method12688();
		if (local3 > 0L) {
			Class281.method26679(local3);
		}
		return this.method12700(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(J)I", line = 19)
	final int method12679(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method12688();
		if (local3 > 0L) {
			Class281.method26679(local3);
		}
		return this.method12700(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "(J)I", line = 19)
	final int method12680(@OriginalArg(0) long arg0) {
		@Pc(3) long local3 = this.method12688();
		if (local3 > 0L) {
			Class281.method26679(local3);
		}
		return this.method12700(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "(IIIIIIFZB)[[I", line = 218)
	public static int[][] method12681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) boolean arg6) {
		@Pc(3) int[][] local3 = new int[arg1][arg0];
		@Pc(7) Class77_Sub27_Sub1 local7 = new Class77_Sub27_Sub1();
		local7.aBoolean496 = arg6;
		local7.anInt3039 = arg2 * -855596815;
		local7.anInt3035 = arg3 * 477403563;
		local7.anInt3037 = arg4 * 1909898403;
		local7.anInt3038 = (int) (arg5 * 4096.0F) * -1869573391;
		local7.method22256();
		Class32.method526(arg0, arg1);
		for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
			local7.method22245(local42, local3[local42]);
		}
		return local3;
	}

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "(I)V", line = 304)
	static void method12682() {
		if (Class80.aClass322_4 != null) {
			Class307.aClass327_1 = new Class327();
			Class307.aClass327_1.method27554(Class354.aLong260 * -8730536087753452067L, Class80.aClass322_4.aClass44_178.method713(Class128.aClass667_3), Class80.aClass322_4.aClass44_178.method713(Class128.aClass667_3), Class80.aClass322_4.anInt4078 * 255476555, Class80.aClass322_4);
			Class354.aThread7 = new Thread(Class307.aClass327_1, "");
			Class354.aThread7.start();
		}
	}

	@OriginalMember(owner = "client!rf", name = "bc", descriptor = "(Lclient!yf;B)V", line = 4620)
	static final void method12683(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5782 -= -2111195934;
		if (arg0.aLongArray28[arg0.anInt5782 * 1572578961] == arg0.aLongArray28[arg0.anInt5782 * 1572578961 + 1]) {
			arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
		}
	}

	@OriginalMember(owner = "client!rf", name = "do", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5017)
	static final void method12684(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(12) int local12 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307];
		arg0.anInt3936 = 407876511;
		if (local12 != arg0.anInt3954 * 2083357573) {
			arg0.anInt3954 = local12 * -1986921139;
			Class461.method29531(arg0);
		}
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class514.method30367(arg0.anInt3863 * -1278450723);
		}
	}

	@OriginalMember(owner = "client!rf", name = "ol", descriptor = "(Lclient!yf;I)V", line = 7177)
	static final void method12685(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class161.method24335(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "(J)I")
	abstract int method12686(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "(I)V")
	abstract void method12687();

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "(I)J")
	abstract long method12688();

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "()J")
	abstract long method12689();

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "()V")
	abstract void method12690();

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "()J")
	abstract long method12691();

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "()J")
	abstract long method12692();

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "()J")
	abstract long method12693();

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "(J)I")
	abstract int method12694(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "()J")
	abstract long method12695();

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "()J")
	abstract long method12696();

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "()J")
	abstract long method12697();

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "()J")
	abstract long method12698();

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "(I)J")
	abstract long method12699();

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "(J)I")
	abstract int method12700(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "()J")
	abstract long method12701();
}
