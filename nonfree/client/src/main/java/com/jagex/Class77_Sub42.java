package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akz")
public abstract class Class77_Sub42 extends Class77 {

	@OriginalMember(owner = "client!akz", name = "l", descriptor = "I")
	public static final int anInt3092 = -1;

	@OriginalMember(owner = "client!akz", name = "y", descriptor = "I")
	public static final int anInt3093 = 0;

	@OriginalMember(owner = "client!akz", name = "w", descriptor = "I")
	static final int anInt3094 = 1;

	@OriginalMember(owner = "client!akz", name = "q", descriptor = "I")
	static final int anInt3095 = 3;

	@OriginalMember(owner = "client!akz", name = "d", descriptor = "I")
	static final int anInt3096 = 5;

	@OriginalMember(owner = "client!akz", name = "x", descriptor = "I")
	static final int anInt3097 = 4;

	@OriginalMember(owner = "client!akz", name = "t", descriptor = "I")
	public static final int anInt3098 = 2;

	@OriginalMember(owner = "client!akz", name = "s", descriptor = "I")
	public static final int anInt3099 = 6;

	@OriginalMember(owner = "client!akz", name = "c", descriptor = "([SB)[S", line = 16)
	public static short[] method22709(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) short[] local7 = new short[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!akz", name = "<init>", descriptor = "()V", line = 43)
	Class77_Sub42() {
	}

	@OriginalMember(owner = "client!akz", name = "m", descriptor = "(I)Z", line = 51)
	public static boolean method22710(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!akz", name = "ai", descriptor = "(I)Z", line = 51)
	public static boolean method22711(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!akz", name = "h", descriptor = "(I)Z", line = 51)
	public static boolean method22712(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!akz", name = "aj", descriptor = "(I)Z", line = 51)
	public static boolean method22713(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!akz", name = "az", descriptor = "(Lclient!yf;I)V", line = 4615)
	static final void method22714(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5782 -= -2111195934;
		if (arg0.aLongArray28[arg0.anInt5782 * 1572578961 + 1] != arg0.aLongArray28[arg0.anInt5782 * 1572578961]) {
			arg0.anInt5786 += arg0.anIntArray535[arg0.anInt5786 * 662605117] * -793595371;
		}
	}

	@OriginalMember(owner = "client!akz", name = "p", descriptor = "(B)I")
	public abstract int method22715();

	@OriginalMember(owner = "client!akz", name = "c", descriptor = "(B)I")
	public abstract int method22716();

	@OriginalMember(owner = "client!akz", name = "v", descriptor = "(I)I")
	public abstract int method22717();

	@OriginalMember(owner = "client!akz", name = "a", descriptor = "()V")
	public abstract void method22718();

	@OriginalMember(owner = "client!akz", name = "y", descriptor = "(I)J")
	public abstract long method22719();

	@OriginalMember(owner = "client!akz", name = "t", descriptor = "(B)V")
	public abstract void method22720();

	@OriginalMember(owner = "client!akz", name = "q", descriptor = "()I")
	public abstract int method22721();

	@OriginalMember(owner = "client!akz", name = "x", descriptor = "()I")
	public abstract int method22722();

	@OriginalMember(owner = "client!akz", name = "d", descriptor = "()I")
	public abstract int method22723();

	@OriginalMember(owner = "client!akz", name = "s", descriptor = "()I")
	public abstract int method22724();

	@OriginalMember(owner = "client!akz", name = "ag", descriptor = "()I")
	public abstract int method22725();

	@OriginalMember(owner = "client!akz", name = "r", descriptor = "()I")
	public abstract int method22726();

	@OriginalMember(owner = "client!akz", name = "n", descriptor = "()V")
	public abstract void method22727();

	@OriginalMember(owner = "client!akz", name = "j", descriptor = "()V")
	public abstract void method22728();

	@OriginalMember(owner = "client!akz", name = "b", descriptor = "()V")
	public abstract void method22729();

	@OriginalMember(owner = "client!akz", name = "g", descriptor = "()J")
	public abstract long method22730();

	@OriginalMember(owner = "client!akz", name = "l", descriptor = "(I)I")
	public abstract int method22731();

	@OriginalMember(owner = "client!akz", name = "z", descriptor = "()I")
	public abstract int method22732();
}
